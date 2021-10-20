// **********************************************
// Liquidazione I V A Pers Livorno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioneIVAPersLivorno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_LIQUIDAZIIVA_PERIODPRECED = 0;

  private static int PFL_LIQUIDAZIIVA_DEBITO = 0;
  private static int PFL_LIQUIDAZIIVA_CREDITO = 1;
  private static int PFL_LIQUIDAZIIVA_SOLOATTITRIM = 2;
  private static int PFL_LIQUIDAZIIVA_IMPMASDANOVE = 3;
  private static int PFL_LIQUIDAZIIVA_IMPORTVERSAT = 4;
  private static int PFL_LIQUIDAZIIVA_INTESTREGIST = 5;
  private static int PFL_LIQUIDAZIIVA_NUMEPRIMPAGI = 6;
  private static int PFL_LIQUIDAZIIVA_ELABORA = 7;

  private static int PPQRY_PARAMETRI240 = 0;


  IDPanel PAN_LIQUIDAZIIVA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI243(IMDB);
    //
    //
    Init_PQRY_PARAMETRI240(IMDB);
    Init_PQRY_PARAMETRI240_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI243(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI243, 10);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI243, "TBL_PARAMETRI243");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMEDEBIT, "ROWNAMEDEBIT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMEDEBIT,3,12,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMECREDI, "ROWNAMECREDI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMECREDI,3,12,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMSOATTR, "ROWNAMSOATTR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMSOATTR,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_RONAIMMADANV, "RONAIMMADANV");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_RONAIMMADANV,3,16,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMINTREG,5,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMNUPRPA,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMIMPVER, "ROWNAMIMPVER");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI243,IMDBDef2.FLD_PARAMETRI243_ROWNAMIMPVER,3,16,2);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI243, 0);
  }

  private static void Init_PQRY_PARAMETRI240(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI240, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI240, "PQRY_PARAMETRI240");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_ROWNAMEDEBIT, "ROWNAMEDEBIT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_ROWNAMEDEBIT,3,12,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_ROWNAMECREDI, "ROWNAMECREDI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_ROWNAMECREDI,3,12,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_ROWNAMSOATTR, "ROWNAMSOATTR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_ROWNAMSOATTR,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_RONAIMMADANV, "RONAIMMADANV");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_RONAIMMADANV,3,16,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_ROWNAMINTREG,5,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_ROWNAMNUPRPA,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_ROWNAMIMPVER, "ROWNAMIMPVER");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240,IMDBDef10.PQSL_PARAMETRI240_ROWNAMIMPVER,3,16,2);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI240, 0);
  }

  private static void Init_PQRY_PARAMETRI240_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI240_RS, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI240_RS, "PQRY_PARAMETRI240_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_ROWNAMEDEBIT, "ROWNAMEDEBIT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_ROWNAMEDEBIT,3,12,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_ROWNAMECREDI, "ROWNAMECREDI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_ROWNAMECREDI,3,12,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_ROWNAMSOATTR, "ROWNAMSOATTR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_ROWNAMSOATTR,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_RONAIMMADANV, "RONAIMMADANV");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_RONAIMMADANV,3,16,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_ROWNAMINTREG,5,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_ROWNAMNUPRPA,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_ROWNAMIMPVER, "ROWNAMIMPVER");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI240_RS,IMDBDef10.PQSL_PARAMETRI240_ROWNAMIMPVER,3,16,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioneIVAPersLivorno(MyWebEntryPoint w, IMDBObj imdb)
  {
    //
    SetMainFrm(w,imdb);
  }

  // **********************************************
  // Funzione chiamata su form multipla
  // durante l'inizializzazione
  // **********************************************
  public void SetMainFrm(WebEntryPoint w, IMDBObj i)
  {
    // Sono una form multipla, duplico IMDB
    IMDB = new IMDBObj();
    IMDB.set_DBSize(w.IwImdb.IMDB.DBSize());
    ImdbInit(IMDB);
    IMDB.SetMaster(w.IwImdb.IMDB);
    super.SetMainFrm(w,i);
  }
  public void SetSubMainFrm(WebEntryPoint w, IMDBObj i)
  {
    // Sono una form multipla, duplico IMDB
    IMDB = new IMDBObj();
    IMDB.set_DBSize(w.IwImdb.IMDB.DBSize());
    ImdbInit(IMDB);
    IMDB.SetMaster(w.IwImdb.IMDB);
    super.SetSubMainFrm(w, i);
  }


  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioneIVAPersLivorno()
  {
    super();
    //
  }

  // **********************************************
  // Form Loaded
  // **********************************************
  public void Init(WebEntryPoint w, boolean flMulti, boolean flSubForm)
  {
    StringBuffer SQL;
    int i;
    ATreeItem Item;

    MainFrm=(MyWebEntryPoint)w;
    super.Init(w, flMulti, flSubForm);
    //
    FormIdx = MyGlb.FRM_LIQIVAPERLIV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7EF1AC4B-EFA5-4301-895B-481A79F7320D";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 424;
    DesignHeight = 294;
    set_Caption(new IDVariant("Liquidazione I V A Pers Livorno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 424;
    Frames[1].Height = 268;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Liquidazione I V A";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 268;
    PAN_LIQUIDAZIIVA = new IDPanel(w, this, 1, "PAN_LIQUIDAZIIVA");
    Frames[1].Content = PAN_LIQUIDAZIIVA;
    PAN_LIQUIDAZIIVA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDAZIIVA.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 424-MyGlb.PAN_OFFS_X, 268-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A980D7F8-A8F1-41B9-9A0E-0A7AA79CDB35");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 536, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDAZIIVA.InitStatus = 2;
    PAN_LIQUIDAZIIVA_Init();
    PAN_LIQUIDAZIIVA_InitFields();
    PAN_LIQUIDAZIIVA_InitQueries();
    HelpFile = "";
    MainFrm.InitializingQueries = false;
    //
    // Modifico alcune impostazioni per smartphone, potranno
    // essere ulteriormente modificate nell'evento di Load
    if (MainFrm.IsSmartPhone())
    {
      DockType = 0;
      Docked = false;
      ResModeW = Glb.FRESMODE_STRETCH;
      ResModeH = Glb.FRESMODE_STRETCH;
    }
    //
    for (i=1; i<Frames.length; i++)
    {
      if (Frames[i].Content instanceof IDPanel)
      {
        Frames[i].Content.MainFrm = w;
        Frames[i].Content.Parent = this;
        ((IDPanel)Frames[i].Content).CalcLayout();
        ((IDPanel)Frames[i].Content).SetDOIMDB(IMDB);
      }
      if (Frames[i].Content instanceof OBook)
        Frames[i].Content.MainFrm = w;
      //
      if (Frames[i].Content != null)
        Frames[i].Content.Collapsable = w.ParamsObj().UseCollapsableFrames;
      //
      if (Frames[i].Content != null && Frames[i].HasCaptionToolbar==-1)
        Frames[i].HasCaptionToolbar = MainFrm.CmdObj.HasCaptionToolbar(FormIdx, Frames[i].Index, Frames[i].Content.Code);
    }
    //
    // Init sub-frames
    for (i = 1; i < Frames.length; i++)
    {
      if (Frames[i].Content instanceof IDPanel)
        for (int j = 0; j < ((IDPanel)Frames[i].Content).UFields(); j++)
          ((IDPanel)Frames[i].Content).bFields(j).UpdateSubFrame();
    }
    //
    for (i=1; i<Frames.length; i++)
    {
      if (Frames[i].Content instanceof OTabView)
        ((OTabView)Frames[i].Content).SelectTab(1, true);
    }
    OrgWidth = Frames[1].Width + GetPadding(false);
    OrgHeight = Frames[1].Height + GetPadding(true);
    //
    // Resetto il fuoco perchè le tabbed view lo possono modificare
    FocusPriority=0;
    ActiveElement="";
    //
    MainFrm.RolObj.ApplyRoles(FormIdx, this);
    //
    MainFrm.TimerObj.ActivateTimers(FormIdx, true);    
    IntFormLoad();
    //
    // Solo le form non modali devono essere ridimensionate
    if (!flSubForm && (!MainFrm.ParamsObj().TruePopup || OpenAs == Glb.OPEN_MDI))
      Resize(w.ScreenW(), w.ScreenH());
    //
    JustLoaded = true;
    UpdateControls();
    MainFrm.InitializingQueries = oldIQ;
  }


  // **********************************************
  // Command Activation Handler
  // **********************************************
  public void CmdClickCB(int CmdIdx)
  {
    fine:
    {
    }
  }
  
  
  // **********************************************
  // Timer Activation Handler
  // **********************************************
  public void TimerTickCB(int TimerIdx)
  {
    fine:
    {
    }
  }
  
  
  // **********************************************
  // Update Controls against IMDB variations
  // **********************************************
  public void UpdateControls()
  {
    try
    {    
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI243, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LIQIVAPERLIV_PARAMETRI240();
      }
      PAN_LIQUIDAZIIVA.UpdatePanel(MainFrm);
      //
    }
    catch(Exception e)
    {
      e.printStackTrace(System.out);
    }
    JustLoaded = false;
    DOSetCaption();
    super.UpdateControls();
  }
  
  
  // **********************************************
  // One of my modal form has been closed
  // **********************************************
  public void EndModal(int CallerIdx, boolean flRis)
  {
    IDVariant Cancel=new IDVariant();
    IntEndModal(new IDVariant(CallerIdx), new IDVariant(flRis), Cancel);
    if (Cancel.isTrue())
    {
      if (MainFrm != null) MainFrm.DTTObj.AddMsg(DTTEngine.DTTMSG_INFO, RTCGuid, 26, "Form.EndModal", "Form " + Caption() + " canceled further processing after EndModal event");
      return;
    }
    //
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof LiquidazioneIVAPersLivorno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioneIVAPersLivorno.class.getName() : (Glb.ClassWithPackage(LiquidazioneIVAPersLivorno.class) ? LiquidazioneIVAPersLivorno.class.getName().substring(LiquidazioneIVAPersLivorno.class.getPackage().getName().length() + 1) : LiquidazioneIVAPersLivorno.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Load Event
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);
    IDVariant D = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_INTESTAZIONE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Liquidazione I.V.A.", IDVariant.STRING));
      D = (new IDVariant(26.49, IDVariant.DECIMAL));
      v_INTESTAZIONE = (new IDVariant("LIQUIDAZIONE I.V.A.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAP));
      if (IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATDA, 0)).equals(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATAA, 0)), true))
      {
        PAN_LIQUIDAZIIVA.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMSOATTR, 0, (new IDVariant("M")));
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMSOATTR, 0, (new IDVariant("T")));
      }
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_RONAIMMADANV, 0, new IDVariant(D));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMINTREG, 0, new IDVariant(v_INTESTAZIONE));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMNUPRPA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDEBIT, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMECREDI, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneIVAPersLivorno", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unload Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDEBIT, 0, new IDVariant(IDL.ToFloat((new IDVariant())),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMECREDI, 0, new IDVariant(IDL.ToFloat((new IDVariant())),IDVariant.DECIMAL));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneIVAPersLivorno", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione I V A On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_LIQUIDAZIIVA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazione I V A On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_LIQUIDAZIIVA_DEBITO)), true) && FieldModified.equals((new IDVariant(-1)), true))
      {
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_ROWNAMEDEBIT, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_RONAIMMADANV, 0), true)>0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Il debito del periodo precedente non puo' superare l'importo massimo da non versare", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneIVAPersLivorno", "LiquidazioneIVAOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NOME = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INDIRIZZO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CITTA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PARTITAIVA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PAR = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_PAR = (new IDVariant("Partita I.V.A.: ", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_PERIODO = new IDVariant(0,IDVariant.STRING);
      if (IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATDA, 0)).compareTo(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATAA, 0)), true)!=0)
      {
        v_PERIODO = IDL.Add(IDL.Add(IDL.Add(v_PERIODO, MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATDA, 0)))), (new IDVariant(" - "))), MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATAA, 0))));
      }
      else
      {
        v_PERIODO = IDL.Add(v_PERIODO, MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATDA, 0))));
      }
      v_PERIODO = IDL.Add(IDL.Add(v_PERIODO, (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEANNO, 0)));
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_ROWNAMINTREG, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Valore obbligatorio sul campo:Intestazione Registro", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        IDVariant v_DW = new IDVariant(0,IDVariant.STRING);
        v_DW = (new IDVariant("d_liquidazione_euro_stampa_li", IDVariant.STRING));
        IDVariant v_ENTE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_BOLLATO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_INTERESSI = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_INTESTREGIVA = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CHECK = new IDVariant(0,IDVariant.INTEGER);
        v_CHECK = (new IDVariant(0));
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_ROWNAMECREDI, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_ROWNAMEDEBIT, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Inserire solo credito o solo debito", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_ROWNAMEDEBIT, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_RONAIMMADANV, 0), true)>0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Il debito del periodo precedente non puo' superare l'importo massimo da non versare", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        SQL = new StringBuffer();
        SQL.append("select distinct ");
        SQL.append("  1 as UNO ");
        SQL.append("from ");
        SQL.append("  T04 A, ");
        SQL.append("  FATPRI B ");
        SQL.append("where (A.TIPO_REGISTRO = B.TIPO_REGISTRO) ");
        SQL.append("and   (A.TIPO_BOLLATO = B.TIPO_BOLLATO) ");
        SQL.append("and   ((A.RIMBORSI IS NULL)) ");
        SQL.append("and   ((B.DATA_DOC BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATDA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATAA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append("and   ((B.ANNO_PROG IS NULL)) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CHECK = QV.Get("UNO", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CHECK.equals((new IDVariant(1)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Per il periodo di elaborazione sono presenti documenti nel Registro Debitori non Codificati che non sono ancora stati Contabilizzati: il Registro Riepilogativo non può essere stampato.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.INTESTAZIONE_ENTE_IVA as T99INTENTIVA, ");
        SQL.append("  A.INTESTAZIONE_BOLLATO_IVA as T99INTBOLIVA, ");
        SQL.append("  A.INTERESSI_LT as T99INTERESLT, ");
        SQL.append("  A.INTESTAZIONE_REGISTRO_IVA as T99INTREGIVA ");
        SQL.append("from ");
        SQL.append("  T99 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEANNO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_ENTE = QV.Get("T99INTENTIVA", IDVariant.STRING) ;
          v_BOLLATO = QV.Get("T99INTBOLIVA", IDVariant.STRING) ;
          v_INTERESSI = QV.Get("T99INTERESLT", IDVariant.DECIMAL) ;
          v_INTESTREGIVA = QV.Get("T99INTREGIVA", IDVariant.STRING) ;
        }
        QV.Close();
        v_NOME = IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DENOMINAZIONE, 0);
        v_INDIRIZZO = IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_INDIRIZZO, 0);
        v_CITTA = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_CAP, 0)), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COMUNE, 0))), (new IDVariant(" "))), IDL.ToString(((IDL.IsNull(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PROVINCIA, 0)))?(new IDVariant(" ")):IDL.Add(IDL.Add((new IDVariant("(")), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PROVINCIA, 0)), (new IDVariant(")"))))));
        v_PARTITAIVA = ((IDL.IsNull(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PARTITA_IVA, 0)))?(new IDVariant("")):IDL.Add(v_PAR, IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PARTITA_IVA, 0)), (new IDVariant(11)), IDL.ToString((new IDVariant(0))), true)));
        // 
        // jasper
        // 
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEANNO, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("A_DATA_DA_T")), IDL.ToString(IDL.ToDate(IDL.Year(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATDA, 0)), IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATDA, 0)), (new IDVariant(1)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_DA")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATDA, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_A")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDATAA, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("A_DEBITO")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_ROWNAMEDEBIT, 0),(new IDVariant(0)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("A_CREDITO")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_ROWNAMECREDI, 0),(new IDVariant(0)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("A_INTERESSI")), IDL.ToString(v_INTERESSI));
          MainFrm.SetParametroStampaJasper((new IDVariant("A_TIPO_LIQ")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_ROWNAMSOATTR, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("a_imp_max_vers")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_RONAIMMADANV, 0),(new IDVariant(0)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("a_imp_vers")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_ROWNAMIMPVER, 0),(new IDVariant(0)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_TESTO")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_ROWNAMINTREG, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("NUM_PAGINA")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI240, IMDBDef10.PQSL_PARAMETRI240_ROWNAMNUPRPA, 0),(new IDVariant(0)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_PERIODO")), v_PERIODO);
          MainFrm.LanciaStampaJasper((new IDVariant("Liquidazione_IVA_cfli")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneIVAPersLivorno", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void LIQIVAPERLIV_PARAMETRI240() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMETRI240_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI243, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI243, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI240_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMETRI240_RS, 0, IMDBDef2.TBL_PARAMETRI243, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI240_RS, 0, 0, IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDEBIT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI240_RS, 1, 0, IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMECREDI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI240_RS, 2, 0, IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMSOATTR, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI240_RS, 3, 0, IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_RONAIMMADANV, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI240_RS, 4, 0, IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMINTREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI240_RS, 5, 0, IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMNUPRPA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI240_RS, 6, 0, IMDBDef2.TBL_PARAMETRI243, IMDBDef2.FLD_PARAMETRI243_ROWNAMIMPVER, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI243, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI243, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI243, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMETRI240_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cioè quando viene portata in primo piano
  // **********************************************************************
  public void Form_Activate()
  {
      MainFrm.Form_Activate(this);
    // Stub
  }

  // **********************************************************************
  // Deactivate
  // Evento notificato alla videata quando essa viene messa
  // in secondo piano
  // **********************************************************************
  public void Form_Deactivate(IDVariant Cancel)
  {
    // Stub
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    // Stub
  }

  // **********************************************************************
  // On Change Document
  // Evento notificato al form quando viene cambiato il
  // documento collegato
  // **********************************************************************
  public void OnChangeDocument(com.progamma.doc.IDDocument OldDocument)
  {
    // Stub
  }

  // **********************************************************************
  // On Send Message
  // Evento notificato quando una videata invia un messaggio
  // tramite la procedura SendMessage
  // **********************************************************************
  public void OnSendMessage(IDVariant Message, WebForm Sender, com.progamma.doc.IDDocument Doc, IDVariant Par1, IDVariant Par2, IDVariant Par3, IDVariant Par4)
  {
    // Stub
  }

  
  
  // **********************************************
  // Frame Events
  // **********************************************
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_LIQUIDAZIIVA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUIDAZIIVA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUIDAZIIVA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIDAZIIVA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDAZIIVA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_LIQUIDAZIIVA);
    // Stub
  }

  private void PAN_LIQUIDAZIIVA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQUIDAZIIVA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIIVA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQUIDAZIIVA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_LIQUIDAZIIVA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIDAZIIVA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIDAZIIVA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LIQUIDAZIIVA_Init()
  {

    PAN_LIQUIDAZIIVA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDAZIIVA.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, "BA66E613-826A-40FD-97A2-FA3886DAF723");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, "Periodo Precedente");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, MyGlb.PANEL_FORM, 0, 7, 376, 49, 0, 0);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, 0, 111);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, 1, 13);
    PAN_LIQUIDAZIIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, 0, 4);
    PAN_LIQUIDAZIIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, 1, 4);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAZIIVA.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, "6486ED4A-6F81-405B-AD9D-016C350A2D6D");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, "Debito");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, "360C574D-04D6-4104-A958-E5CEB9D7E24C");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, "Credito");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, "3E6B9066-F6DB-4BF1-8738-AF4466556F31");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, "Solo Attività Trimestrali");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, "D6F45020-0E83-4D00-9798-B9C965D945B7");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, "Importo Massimo Da Non Versare");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, "D503447B-F987-4016-93AD-3ADD78474695");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, "Importo Versato");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, "3F183563-7339-44A8-B93C-8C700DE07762");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, "Intestazione Registro");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, "57DEDD7A-5B58-427E-9862-F966E38A638F");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, "Numero Prima Pagina");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, "66DE83E8-A3DA-4EA1-BF91-FDF6DA6050FE");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, "Elabora");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_LIQUIDAZIIVA.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, 0, "button1.gif", false);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_LIQUIDAZIIVA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_LIST, 40);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_LIST, "Debito");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_FORM, 4, 32, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_FORM, "Debito");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_DEBITO, -1, GRP_LIQUIDAZIIVA_PERIODPRECED);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_DEBITO, PPQRY_PARAMETRI240, "A.ROWNAMEDEBIT", "ROWNAMEDEBIT", 3, 12, 0, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_LIST, 56, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_LIST, 44);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_LIST, "Credito");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_FORM, 208, 32, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_FORM, "Credito");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_CREDITO, -1, GRP_LIQUIDAZIIVA_PERIODPRECED);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_CREDITO, PPQRY_PARAMETRI240, "A.ROWNAMECREDI", "ROWNAMECREDI", 3, 12, 0, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_LIST, 120);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_LIST, "S. Att. Trm.");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_FORM, 184, 60, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_FORM, 168);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_FORM, "Solo Attività Trimestrali");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_SOLOATTITRIM, -1, -1);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_SOLOATTITRIM, PPQRY_PARAMETRI240, "A.ROWNAMSOATTR", "ROWNAMSOATTR", 5, 1, 0, -13997);
    PAN_LIQUIDAZIIVA.SetValueListItem(PFL_LIQUIDAZIIVA_SOLOATTITRIM, (new IDVariant("T")), "T", "", "", -1);
    PAN_LIQUIDAZIIVA.SetValueListItem(PFL_LIQUIDAZIIVA_SOLOATTITRIM, (new IDVariant("E")), "E", "", "", -1);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_LIST, 160, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_LIST, 168);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_LIST, "Imp. Mass. Da Non Versare");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_FORM, 56, 84, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_FORM, 216);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_FORM, "Importo Massimo Da Non Versare");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_IMPMASDANOVE, -1, -1);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_IMPMASDANOVE, PPQRY_PARAMETRI240, "A.RONAIMMADANV", "RONAIMMADANV", 3, 16, 2, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, MyGlb.PANEL_LIST, 88);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, MyGlb.PANEL_LIST, "Importo Versato");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, MyGlb.PANEL_FORM, 136, 108, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, MyGlb.PANEL_FORM, 136);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPORTVERSAT, MyGlb.PANEL_FORM, "Importo Versato");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_IMPORTVERSAT, -1, -1);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_IMPORTVERSAT, PPQRY_PARAMETRI240, "A.ROWNAMIMPVER", "ROWNAMIMPVER", 3, 16, 2, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_LIST, 248, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_LIST, 112);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_LIST, "Intestazione Registro");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_FORM, -4, 132, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_FORM, 160);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_FORM, "Intestazione Registro");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_INTESTREGIST, -1, -1);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_INTESTREGIST, PPQRY_PARAMETRI240, "A.ROWNAMINTREG", "ROWNAMINTREG", 5, 19, 0, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_LIST, 408, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_LIST, 112);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_LIST, "Nm. P. Pg.");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_FORM, -4, 156, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_FORM, 160);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_FORM, "Numero Prima Pagina");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, -1, -1);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, PPQRY_PARAMETRI240, "A.ROWNAMNUPRPA", "ROWNAMNUPRPA", 1, 5, 0, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.PANEL_LIST, 284, 160, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.PANEL_FORM, 296, 180, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_ELABORA, -1, -1);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_LIQUIDAZIIVA_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDAZIIVA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQUIDAZIIVA.SetIMDB(IMDB, "PQRY_PARAMETRI240", true);
    PAN_LIQUIDAZIIVA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_LIQUIDAZIIVA.SetQueryIMDB(PPQRY_PARAMETRI240, IMDBDef10.PQRY_PARAMETRI240_RS, IMDBDef2.TBL_PARAMETRI243);
    JustLoaded = true;
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_DEBITO, IMDBDef2.FLD_PARAMETRI243_ROWNAMEDEBIT);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_CREDITO, IMDBDef2.FLD_PARAMETRI243_ROWNAMECREDI);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_SOLOATTITRIM, IMDBDef2.FLD_PARAMETRI243_ROWNAMSOATTR);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_IMPMASDANOVE, IMDBDef2.FLD_PARAMETRI243_RONAIMMADANV);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_IMPORTVERSAT, IMDBDef2.FLD_PARAMETRI243_ROWNAMIMPVER);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_INTESTREGIST, IMDBDef2.FLD_PARAMETRI243_ROWNAMINTREG);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, IMDBDef2.FLD_PARAMETRI243_ROWNAMNUPRPA);
    PAN_LIQUIDAZIIVA.SetMasterTable(0, "PARAMETRI243");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIDAZIIVA.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIDAZIIVA.iUseListQBE;
      PAN_LIQUIDAZIIVA.iUseListQBE = 0;
      PAN_LIQUIDAZIIVA.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIDAZIIVA.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIDAZIIVA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_LIQUIDAZIIVA) PAN_LIQUIDAZIIVA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAZIIVA) PAN_LIQUIDAZIIVA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUIDAZIIVA) PAN_LIQUIDAZIIVA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAZIIVA) PAN_LIQUIDAZIIVA_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
  }

  public void OnSelectingRow(IDPanel SrcObj)
  {
  }

  public void OnSorting(IDPanel SrcObj, IDVariant FldIdx, IDVariant Cancel)
  {
  }

  public void OnChangeSelection(IDPanel SrcObj, IDVariant NewVal, IDVariant Final, IDVariant Cancel)
  {
  }
  
  public void OnChangeLocking(IDPanel SrcObj, IDVariant NewLocking, IDVariant Cancel)
  {
  }
  
  public void OnChangeStatus(IDPanel SrcObj, IDVariant OldStatus)
  {
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
  }

  public void BeforeBlobUpdate(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant FilePath)
  {
  }
  
  public void BeforeDelete(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterInsert(IDPanel SrcObj)
  {
  }
  
  public void AfterUpdate(IDPanel SrcObj)
  {
  }

  public void AfterBlobUpdate(IDPanel SrcObj, IDVariant Column, IDVariant Size, IDVariant Extension)
  {
  }
  
  public void AfterDelete(IDPanel SrcObj)
  {
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_LIQUIDAZIIVA) PAN_LIQUIDAZIIVA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
  }    

  public void NodeClick(ATree SrcObj, ATreeNode Node)
  {
  }    

  public void OnTreeDropNode(ATree SrcObj, IDVariant SourceHash, IDVariant SourceTreeIndex, IDVariant DestinationHash, IDVariant ShiftKey, IDVariant AltKey, IDVariant ControlKey)
  {
  }    

  public void OnTreeExpandNode(ATree SrcObj, IDVariant HashKey, IDVariant Cancel)
  {
  }
  
  public void OnTreeActivateNode(ATree SrcObj, IDVariant HashKey, IDVariant Cancel)
  {
  }

  public void OnTreeChangeSelNode(ATree SrcObj, IDVariant HashKey, IDVariant Selected, IDVariant Cancel, IDVariant Final)
  {
  }
  
  public void OnTreeDropDoc(ATree SrcObj, IDDocument SourceDoc, IDDocument DestDoc, IDVariant ShiftKey, IDVariant AltKey, IDVariant ControlKey, IDVariant Cancel)
  {
  }    

  public void OnTreeExpandDoc(ATree SrcObj, IDDocument Doc, IDVariant Cancel)
  {
  }
  
  public void OnTreeActivateDoc(ATree SrcObj, IDDocument Doc, IDVariant Cancel)
  {
  }
  
  public void OnTreeChangeSelDoc(ATree SrcObj, IDDocument Doc, IDVariant Selected, IDVariant Cancel, IDVariant Final)
  {
  }
  
  public void OnFormattingSection(OBook SrcObj, int SectionID)
  {
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
  }

  public void OnPreview(OBook SrcObj)
  {
  }
  
  public void OnOpenPopup(ACommand SrcObj, IDVariant Direction, IDVariant Cancel) 
  {
  }
  
  public void OnCmdSetCommand(ACommand SrcObj, IDVariant CmdIdx, IDVariant ChildIdx, IDVariant Cancel) 
  {
  }
  
  public void OnCmdSetGeneralDrag(ACommand SrcObj, IDVariant DragInfo, IDVariant CmdIdx, IDVariant ChildIdx)
  {
  }
  
  public void OnCmdSetGeneralDrop(ACommand SrcObj, IDVariant DragInfo, IDVariant CmdIdx, IDVariant ChildIdx)
  {
  }

  public void OnChangeCollapse(WebFrame SrcObj, IDVariant Collapse, IDVariant Cancel)
  {
  }

  public void OnGraphClick(WebFrame SrcObj, IDVariant NumSerie, IDVariant NumPoint)
  {
  }

  public void OnGraphOptions(WebFrame SrcObj, IDVariant Options)
  {
  }
  
  public void OnRenderToolbar(WebFrame SrcObj, IDVariant CmdIdx, IDVariant Visible)
  {
  }

  public void OnBookCommand(OBook SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
  }

  public void OnCmdSetChangeExpand(ACommand SrcObj, IDVariant Expand, IDVariant Cancel)
  {
  }

  public void OnTreeChangeExpandNode(ATree SrcObj, IDVariant HashKey, IDVariant Expanded, IDVariant Cancel)
  {
  }

  public void OnTreeChangeExpandDoc(ATree SrcObj, IDDocument Doc, IDVariant Expanded, IDVariant Cancel)
  {
  }
  

  public void OnMouseClick(IDPanel SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant c, IDVariant r, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(IDPanel SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant c, IDVariant r, IDVariant cancel)
  {
  }
  
  public void OnMouseClick(OBook SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant boxid, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(OBook SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant boxid, IDVariant cancel)
  {
  }
  
  public void OnMouseClick(ATree SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant nodehash, IDDocument doc, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(ATree SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant nodehash, IDDocument doc, IDVariant cancel)
  {
  }
  
  public void OnMouseClick(AGraph SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant numserie, IDVariant recordselected, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(AGraph SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant numserie, IDVariant recordselected, IDVariant cancel)
  {
  }
  
  public void OnMouseClick(OTabView SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant tabid, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(OTabView SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant tabid, IDVariant cancel)
  {
  }  
  
  public void OnReorderColum(IDPanel SrcObj, IDVariant sourcefield, IDVariant targetfield)
  {
  }
  
  public void OnResizeColum(IDPanel SrcObj, IDVariant sourcefield, IDVariant oldwidth)
  {
  }
  

  public void OnGenericDrag(IDPanel SrcObj, IDVariant draginfo,  IDVariant button, IDVariant colidx)
  {
  }

  public void OnGenericDrop(IDPanel SrcObj, IDVariant draginfo, IDVariant cancel, IDVariant button, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant colidx, IDVariant rownum, IDDocument doc)
  {
  }
  
  public void OnGenericDrag(ATree SrcObj, IDVariant draginfo,  IDVariant button, IDVariant hashkey)
  {
  }

  public void OnGenericDrop(ATree SrcObj, IDVariant draginfo, IDVariant cancel, IDVariant button, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant hashkey, IDDocument doc)
  {
  }  
  
  public void OnGenericDrag(OBook SrcObj, IDVariant draginfo,  IDVariant button, IDVariant boxid)
  {
  }

  public void OnGenericDrop(OBook SrcObj, IDVariant draginfo, IDVariant cancel, IDVariant button, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant boxid)
  {
  }    
  
  public void OnGenericDrag(OTabView SrcObj, IDVariant draginfo, IDVariant button, IDVariant pageindex)
  {
  }

  public void OnGenericDrop(OTabView SrcObj, IDVariant draginfo, IDVariant cancel, IDVariant button, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant pageindex)
  {
  }

  public void OnExpandingGroup(IDPanel SrcObj, IDVariant expanded, IDVariant userOperation)
  {
  }  

  public void OnChangeGroupCollapse(IDPanel SrcObj, IDVariant GrpIndex)
  {
  }
  
  public void OnShowMultipleSelection(IDPanel SrcObj, IDVariant NewValue, IDVariant Cancel, IDVariant UserOperation)
  {
  }
  
  public void OnChangeTextSelection(IDPanel SrcObj, IDVariant Field, IDVariant OldSelectionStart, IDVariant OldSelectionEnd)
  {
  }
  
  public void OnFocus(IDPanel SrcObj, IDVariant Field, IDVariant GotFocus)
  {
  }
  
  public void OnFrameKeyPress(WebFrame SrcObj, IDVariant KeySet, IDVariant KeyCode, IDVariant Skip)
  {
  }
  
  public void OnGetLKE(IDPanel SrcObj, IDCachedRowSet RS, IDVariant ntry, IDVariant nullv, IDVariant bskip, IDVariant bcancel, IDVariant fldindex)
  {
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
