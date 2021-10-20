// **********************************************
// Instant Developer Serlvet
// Instant WEB Application: www.progamma.com
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;   


// **********************************************
// Classe base della servlet
// **********************************************
public final class IDServlet extends HttpServlet
{

  // **********************************************
  // Metodi base per la gestione delle richieste
  // **********************************************
  public void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, java.io.IOException
  {
    HandleRequest(req,resp);
  }
  

  // **********************************************
  // Metodo comune di gestione.
  // **********************************************
  public void HandleRequest(HttpServletRequest req,HttpServletResponse resp) throws ServletException, java.io.IOException
  {
    // Se riguarda l'interruzione della DelayDlg lo gestisco qui
    if (req.getQueryString()!=null && req.getQueryString().length()>6 && req.getQueryString().substring(0, 6).equals("FN=PRG"))
    {
      // Recupero il nome del file
      String fn = req.getQueryString().substring(3);
      int nocache = fn.indexOf("&NOCACHE");
      if (nocache > 0)
        fn = fn.substring(0, nocache);
      //
      // Vediamo se il nome è valido (solo lettere, numeri)
      boolean flValid = true;
      for (int i=0; i<fn.length(); i++)
      {
        if (!((fn.charAt(i)>='A' && fn.charAt(i)<='Z') || (fn.charAt(i)>='0' && fn.charAt(i)<='9')))
        {
          flValid = false;
          break;
        }
      }
      //
      // Se è valido ed il file esiste
      File f = new File(getServletContext().getRealPath("/temp/" + fn + ".xml"));
      if (flValid && f.exists())
      {
        // Creo un file di lock... lo eliminerà WebEntryPoint alla prossima TRACKPHASE
        f = new File(getServletContext().getRealPath("/temp/" + fn + ".xml.kill"));
        f.createNewFile();
        //
        // Già che ci sono rispondo OK al browser
        try
        {
          PrintWriter wr = resp.getWriter();
          wr.print("OK");
          wr.close();
        }
        catch (Exception e) {}
        //
        return;
      }
    }
    //
    // Gestione sessione
    HttpSession session = null;
    //
    // Se c'è il parametro SESSIONID allora devo andarmi a riprendere la sessione
    // dalla mappa delle sessioni che mi tengo nel contesto;
    // questo perché le richieste fatte da Flash non inviano i cookie di sessione.
    String SessionID = req.getParameter("SESSIONID");
    if (SessionID != null)
    {
      Map sessions = (Map)getServletContext().getAttribute("sessions");
      session = (HttpSession)sessions.get(SessionID);
    }
    //
    if (session == null)
      session = req.getSession();
    //
    // Prelevo l'oggetto WebEntryPoint legato alla sessione
    MyWebEntryPoint wep = (MyWebEntryPoint)session.getAttribute("WEP");
    if (wep == null)
    {
      // Se c'è un riavvio schedulato
      synchronized (WebEntryPoint.ShutDownTime)
      {
        if (WebEntryPoint.ShutDownTime.getTime() > 0)
        {
          // Non accetto nuove sessioni e rispondo con una redirect sul file unavailable.htm
          resp.sendRedirect("unavailable.htm");
          session.invalidate();
          return;
        }
      }
      //
      // Nuova sessione
      wep = new MyWebEntryPoint(getServletContext());
      session.setAttribute("WEP",wep);
    }
    //
    TraceManager tm = null;
    synchronized (getServletContext())
    {
      tm = (TraceManager)getServletContext().getAttribute("$TraceManager$");
    }
    if (tm != null)
      tm.BeginRequest(session.getId(), wep);
    //
    // Gestisco richiesta dal wep
    if (wep.Parent() == null) // Se parent = null, la sessione è stata appena attivata!
      wep.SetParent(getServletContext());
    wep.HandleRequest(req,resp);
    //
    if (tm != null)
      tm.EndRequest(session.getId());
  }
}
