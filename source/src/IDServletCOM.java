// **********************************************
// Instant Developer Com-Serlvet
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
public final class IDServletCOM extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, java.io.IOException
  {
    WebEntryPoint.HandleComRequest(req, resp);
    //
    // Invalido la sessione utilizzata per la comunicazione
    req.getSession().invalidate();
  }
  
  public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, java.io.IOException
  {
    WebEntryPoint.HandleComRequest(req, resp);
    //
    // Invalido la sessione utilizzata per la comunicazione
    req.getSession().invalidate();
  }
}
