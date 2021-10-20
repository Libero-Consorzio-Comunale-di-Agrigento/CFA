// **********************************************
// Instant Developer Serlvet
// Instant WEB Application: www.progamma.com
// Project : Cfa
// **********************************************

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;   
import com.progamma.is.*;

public class IDSessionListener implements HttpSessionListener
{  
  public void init(ServletConfig config)
  {
  }
  
  // Adds sessions to the context scoped HashMap when they begin.
  public void sessionCreated(HttpSessionEvent event)
  {
    HttpSession session = event.getSession();
    ServletContext context = session.getServletContext();
    synchronized (context)
    {
      Map sessions = (Map)context.getAttribute("sessions");
      if (sessions == null)
      {
        sessions = new HashMap();
        context.setAttribute("sessions", sessions);
      }
      sessions.put(session.getId(), session);
    }
  } 
    
  // Removes sessions from the context scoped HashMap when they expire
  // or are invalidated.
  public void sessionDestroyed(HttpSessionEvent event)
  {
    HttpSession session = event.getSession();
    ServletContext context = session.getServletContext();
    if (context != null)
    {
      TraceManager tm = null;
      synchronized (context)
      {
        tm = (TraceManager)context.getAttribute("$TraceManager$");
      }
      if (tm != null)
        tm.EndSession(session.getId());
      //
      synchronized (context)
      {
        Map sessions = (Map)context.getAttribute("sessions");
        if (sessions != null)
          sessions.remove(session.getId());
      }
    }
  }
}
