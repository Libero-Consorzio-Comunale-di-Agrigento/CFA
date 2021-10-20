// **********************************************
// Instant Developer Serlvet
// Instant WEB Application: www.progamma.com
// Project : Cfa
// **********************************************

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.progamma.is.WebEntryPoint;
import com.progamma.is.ServerSessionManager;
import com.progamma.IDConnectionPool;

public class IDContextListener implements ServletContextListener
{
  public void contextInitialized(ServletContextEvent contextEvent)
  {
    // Creo il ConnectionPool e il ServerSessionManager
    WebEntryPoint.Pool = new IDConnectionPool();
    WebEntryPoint.SSManager = new ServerSessionManager();
    //
    // Se l'applicazione ha attivato l'opzione "Start Server Session"
    // faccio partire la Server Session di default
    if (false)
      WebEntryPoint.SSManager.StartSession(new MyWebEntryPoint(contextEvent.getServletContext()), "Cfaid", "§");
    //
    // Imposto la password per la comunicazione
    WebEntryPoint.set_ComPassword("");
  }

  public void contextDestroyed(ServletContextEvent contextEvent)
  {
    // Termito "brutalmente" tutte le eventuali sessioni in corso
    WebEntryPoint.SSManager.Terminate();
    //
    // Termino anche il thread del Connection Pool
    WebEntryPoint.Pool.StopThread();
  }
}
