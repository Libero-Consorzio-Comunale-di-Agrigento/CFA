// **********************************************
// TimerHandler Handler
// Instant WEB Application: www.progamma.com
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;

import java.io.*;
import java.util.*;
import java.lang.reflect.Field;

// **********************************************
// TimerHandler Handler
// **********************************************
public final class MyTimerHandler extends TimerHandler implements Serializable
{
  static int TIM_OFFSET = 0;
  
  // **********************************************
  // Costruttore
  // **********************************************
  public MyTimerHandler(WebEntryPoint p)
  {
    super(p);
    //
    //
  } 

  // **********************************************
  // Appende gli oggetti al TimerHandler fornito
  // **********************************************
  public void AppendTo(TimerHandler Dst)
  {
    // Se ho timer
    if (Timers.length > 0)
    {
      // Se è la prima volta, appendo
      if (MyTimerHandler.TIM_OFFSET == 0)
      {
        // Se vengono caricati componenti dinamicamente devo tenere conto del fatto che c'è una "zona" dell'array
        // che è riservata a componenti che ho già caricato ma che non sono presenti nell'array di questa sessione. 
        // Es: sessione 1 carica Comp1, sessione 2 carica Comp2 in questo caso la sessione 2 non ha mai caricato 
        // Comp1 ma se dovesse farlo deve esserci spazio per le sue tabelle IMDB nello stesso posto in cui erano prima!)
        // Pertanto se lo stato di riempimento è inferiore o uguale alla lunghezza dell'array, appendo in fondo
        //
        // Per cominciare appendo tutti i Timers contenuti in Dst dentro al mio array
        int idx = Math.max(Dst.Timers.length, com.progamma.is.TimerHandler.FilledTo);
        if (idx == 0) idx = 1;    // L'array dei timer è 1-based
        ATimer[] oldTimers = Dst.Timers;
        Dst.Timers = new ATimer[idx + Timers.length - 1];
        System.arraycopy(oldTimers, 0, Dst.Timers, 0, oldTimers.length);
        for (int i = 1; i < Timers.length; i++)
        {
          ATimer t = Timers[i];
          if (t == null)
            continue;
          //
          if (t.IdxForm > 0)
            t.IdxForm += MainFrm.CompOwner.iFrmOffs.intValue();   // Shifto le referenze alle form
          //
          t.Index = idx;
          Dst.Timers[idx++] = t;
        }
      }
      else  // Il componente è già stato inizializzato in precedenza... infilo i timer dove li ho messi l'ultima volta
      {
        // L'array di mio padre potrebbe essere più grande del mio se i componenti sono "dinamici" e vengono caricati in un 
        // ordine diverso da quello precedente (es: app->cmp1->cmp2 e poi, in una sessione differente app->cmp2->cmp1)
        ATimer[] oldTimers = Dst.Timers;
        Dst.Timers = new ATimer[Math.max(Timers.length, oldTimers.length)];
        System.arraycopy(oldTimers, 0, Dst.Timers, 0, oldTimers.length);
        //
        System.arraycopy(Timers, MyTimerHandler.TIM_OFFSET + 1, Dst.Timers, MyTimerHandler.TIM_OFFSET + 1, Timers.length - (MyTimerHandler.TIM_OFFSET + 1));
      }
      //
      // Aggiorno lo stato di riempimento dell'array
      com.progamma.is.TimerHandler.FilledTo = Math.max(Dst.Timers.length, com.progamma.is.TimerHandler.FilledTo);
      //
      // Se non l'ho ancora fatto shifto tutte le costanti contenute in MyGlb
      if (MyTimerHandler.TIM_OFFSET == 0)
      {
        // Il mio offset è il numero di timer di tutti i miei padri...
        // Per calcolarlo guardo a dove è finito il mio primo timer (l'elemento 0 è NULL)
        // Quello è l'offset dei miei timer rispetto all'array che contiene tutti i timer di tutti i componenti
        MyTimerHandler.TIM_OFFSET = Timers[1].Index - 1;
        ShiftStaticConst(MainFrm);
      }
    }
  }
  
  public static void ShiftStaticConst(WebEntryPoint MainFrm)
  {
    if (MyTimerHandler.TIM_OFFSET != 0)
    {
      try
      {
        String tn = (Glb.ClassWithPackage(MainFrm.getClass()) ? MainFrm.getClass().getPackage().getName() + "." : "");
        Field[] props = Class.forName(tn + "MyGlb").getFields();
        for (int j = 0; j < props.length; j++)
        {
          Field p = props[j];
          if (p.getName().startsWith("TIM_") || p.getName().equals("MAX_TIMERS"))
            p.setInt(null, p.getInt(null) + MyTimerHandler.TIM_OFFSET);
        }
      }
      catch (Exception e)
      {
        e.printStackTrace(System.err);
      }
    }
  }
  
  // **************************************
  // Caricamento sessione da file (Serializable)
  // **************************************
  public static void readObject(WebEntryPoint MainFrm, ObjectInputStream in) throws Exception
  {
    // Leggo proprietà statiche
    // Se l'offset era già impostato devo prima de-offsettare tutte le define statiche prima di poter caricare il nuovo contesto statico
    if (MyTimerHandler.TIM_OFFSET != 0)
    {
      MyTimerHandler.TIM_OFFSET = -MyTimerHandler.TIM_OFFSET;
      ShiftStaticConst(MainFrm);
    }
    //
    MyTimerHandler.TIM_OFFSET = in.readInt();
    TimerHandler.FilledTo = in.readInt();
    ShiftStaticConst(MainFrm);
  }
  public static void writeObject(WebEntryPoint MainFrm, ObjectOutputStream out) throws Exception
  {
    // Scrivo oggetti statici
    out.writeInt(MyTimerHandler.TIM_OFFSET);
    out.writeInt(TimerHandler.FilledTo);
  }
}

