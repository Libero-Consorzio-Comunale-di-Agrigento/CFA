// **********************************************
// Indicator Handler
// Instant WEB Application: www.progamma.com
// Project : Cfa
// **********************************************

import com.progamma.*;
import com.progamma.is.*;

import java.io.*;
import java.util.*;
import java.lang.reflect.Field;

// **********************************************
// Indicator Handler
// **********************************************
class MyIndHandler extends IndHandler implements Serializable
{
  static int IND_OFFSET = 0;

  // **********************************************
  // Costruttore
  // **********************************************
  public MyIndHandler(WebEntryPoint p)
  {
    super(p);
    //
    Indicators[MyGlb.IND_SYSMSG] = new AIndicator();
    Indicators[MyGlb.IND_SYSMSG].iGuid = "98CAA7A3-0440-4356-B441-36CEFFF3694F";
    SystemIndicator = MyGlb.IND_SYSMSG;
    Indicators[MyGlb.IND_SYSMSG].Alignment = 2;
    Indicators[MyGlb.IND_SYSMSG].ToolTip = "Show system messages";
    Indicators[MyGlb.IND_SYSMSG].Style = 1;
    Indicators[MyGlb.IND_SYSMSG].Code = "SYSMSG";
    Indicators[MyGlb.IND_SYSMSG].Index = MyGlb.IND_SYSMSG;
    Indicators[MyGlb.IND_SYSMSG].InitStatus(true, false, "");
    Indicators[MyGlb.IND_PANELIND] = new AIndicator();
    Indicators[MyGlb.IND_PANELIND].iGuid = "43F4EE94-AD6F-4E11-B206-17E5FC6373CC";
    Indicators[MyGlb.IND_PANELIND].Width = 1;
    Indicators[MyGlb.IND_PANELIND].Alignment = 2;
    Indicators[MyGlb.IND_PANELIND].ToolTip = "Show current panel status";
    Indicators[MyGlb.IND_PANELIND].Style = 1;
    Indicators[MyGlb.IND_PANELIND].Code = "PANELIND";
    Indicators[MyGlb.IND_PANELIND].Index = MyGlb.IND_PANELIND;
    Indicators[MyGlb.IND_PANELIND].InitStatus(true, false, "");
    Indicators[MyGlb.IND_CLOCK] = new AIndicator();
    Indicators[MyGlb.IND_CLOCK].iGuid = "9EA746C5-E038-47B9-BA3A-6273DBD2D010";
    Indicators[MyGlb.IND_CLOCK].Width = 1;
    Indicators[MyGlb.IND_CLOCK].Alignment = 2;
    Indicators[MyGlb.IND_CLOCK].ToolTip = "Show current time";
    Indicators[MyGlb.IND_CLOCK].Style = 6;
    Indicators[MyGlb.IND_CLOCK].Code = "CLOCK";
    Indicators[MyGlb.IND_CLOCK].Index = MyGlb.IND_CLOCK;
    Indicators[MyGlb.IND_CLOCK].InitStatus(true, false, "");
    //    
  }

  // **********************************************
  // Appende gli oggetti al TimerHandler fornito
  // **********************************************
  public void AppendTo(IndHandler Dst)
  {
    // Se ho indicatori
    if (Indicators.length > 0)
    {
      // Se è la prima volta, appendo
      if (MyIndHandler.IND_OFFSET == 0)
      {
        // Se vengono caricati componenti dinamicamente devo tenere conto del fatto che c'è una "zona" dell'array
        // che è riservata a componenti che ho già caricato ma che non sono presenti nell'array di questa sessione. 
        // Es: sessione 1 carica Comp1, sessione 2 carica Comp2 in questo caso la sessione 2 non ha mai caricato 
        // Comp1 ma se dovesse farlo deve esserci spazio per le sue tabelle IMDB nello stesso posto in cui erano prima!)
        // Pertanto se lo stato di riempimento è inferiore o uguale alla lunghezza dell'array, appendo in fondo
        //
        // Per cominciare appendo tutti gli Indicators contenuti in Dst dentro al mio array
        int idx = Math.max(Dst.Indicators.length, com.progamma.is.IndHandler.FilledTo);
        if (idx == 0) idx = 1;    // L'array dei cmdset è 1-based
        AIndicator[] oldIndicators = Dst.Indicators;
        Dst.Indicators = new AIndicator[idx + Indicators.length - 1];
        System.arraycopy(oldIndicators, 0, Dst.Indicators, 0, oldIndicators.length);
        for (int i = 1; i < Indicators.length; i++)
        {
          AIndicator ind = Indicators[i];
          if (ind == null)
            continue;
          //
          if (ind.IdxForm > 0)
            ind.IdxForm += MainFrm.CompOwner.iFrmOffs.intValue();   // Shifto le referenze alle form
          //
          ind.Index = idx;
          Dst.Indicators[idx++] = ind;
        }
      }
      else  // Il componente è già stato inizializzato in precedenza... infilo gli indicatori dove li ho messi l'ultima volta
      {
        // L'array di mio padre potrebbe essere più grande del mio se i componenti sono "dinamici" e vengono caricati in un 
        // ordine diverso da quello precedente (es: app->cmp1->cmp2 e poi, in una sessione differente app->cmp2->cmp1)
        AIndicator[] oldIndicators = Dst.Indicators;
        Dst.Indicators = new AIndicator[Math.max(Indicators.length, oldIndicators.length)];
        System.arraycopy(oldIndicators, 0, Dst.Indicators, 0, oldIndicators.length);
        //
        System.arraycopy(Indicators, MyIndHandler.IND_OFFSET + 1, Dst.Indicators, MyIndHandler.IND_OFFSET + 1, Indicators.length - (MyIndHandler.IND_OFFSET + 1));
      }
      //
      // Aggiorno lo stato di riempimento dell'array
      com.progamma.is.IndHandler.FilledTo = Math.max(Dst.Indicators.length, com.progamma.is.IndHandler.FilledTo);
      //
      // Se non l'ho ancora fatto shifto tutte le costanti contenute in MyGlb
      if (MyIndHandler.IND_OFFSET == 0)
      {
        // Il mio offset è il numero di indicatori di tutti i miei padri...
        // Per calcolarlo guardo a dove è finito il mio primo indicatore (l'elemento 0 è NULL)
        // Quello è l'offset dei miei indicatori rispetto all'array che contiene tutti i indicatori di tutti i componenti
        MyIndHandler.IND_OFFSET = Indicators[1].Index - 1;
        ShiftStaticConst(MainFrm);
      }
    }
  }
  
  public static void ShiftStaticConst(WebEntryPoint MainFrm)
  {
    if (MyIndHandler.IND_OFFSET != 0)
    {
      try
      {
        String tn = (Glb.ClassWithPackage(MainFrm.getClass()) ? MainFrm.getClass().getPackage().getName() + "." : "");
        Field[] props = Class.forName(tn + "MyGlb").getFields();
        for (int j = 0; j < props.length; j++)
        {
          Field p = props[j];
          if (p.getName().startsWith("IND_") || p.getName().equals("MAX_INDICATORS"))
            p.setInt(null, p.getInt(null) + MyIndHandler.IND_OFFSET);
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
    if (MyIndHandler.IND_OFFSET != 0)
    {
      MyIndHandler.IND_OFFSET = -MyIndHandler.IND_OFFSET;
      ShiftStaticConst(MainFrm);
    }
    //
    MyIndHandler.IND_OFFSET = in.readInt();
    IndHandler.FilledTo = in.readInt();
    ShiftStaticConst(MainFrm);
  }
  public static void writeObject(WebEntryPoint MainFrm, ObjectOutputStream out) throws Exception
  {
    // Scrivo proprietà statiche
    out.writeInt(MyIndHandler.IND_OFFSET);
    out.writeInt(IndHandler.FilledTo);
  }
}
