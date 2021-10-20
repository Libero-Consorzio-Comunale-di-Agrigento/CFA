// **********************************************
// Variazioni Da Budget Ce4
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniDaBudgetCe4 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VARIDABUDCE4_DESCRIVARIAZ = 0;
  private static int GRP_VARIDABUDCE4_TIPOVARIAZIO = 1;

  private static int PFL_VARIDABUDCE4_PERIODO = 0;
  private static int PFL_VARIDABUDCE4_DATAVARIAZIO = 1;
  private static int PFL_VARIDABUDCE4_LABEL = 2;
  private static int PFL_VARIDABUDCE4_BILANCIO1 = 3;
  private static int PFL_VARIDABUDCE4_IMPEGNI1 = 4;
  private static int PFL_VARIDABUDCE4_BILANCIO = 5;
  private static int PFL_VARIDABUDCE4_IMPEGNI = 6;
  private static int PFL_VARIDABUDCE4_OK = 7;

  private static int PPQRY_PARAMETRI186 = 0;

  private static int PPQRY_CE4IBILAPREV = 1;
  private static int PPQRY_T54 = 2;
  private static int PPQRY_T55 = 3;


  IDPanel PAN_VARIDABUDCE4;

  // Definition of Global Variables
  private IDVariant FIRSTTIME = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI198(IMDB);
    //
    //
    Init_PQRY_PARAMETRI186(IMDB);
    Init_PQRY_PARAMETRI186_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI198(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI198, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI198, "TBL_PARAMETRI198");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI198,IMDBDef3.FLD_PARAMETRI198_ROWNAMEPERIO, "ROWNAMEPERIO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI198,IMDBDef3.FLD_PARAMETRI198_ROWNAMEPERIO,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI198,IMDBDef3.FLD_PARAMETRI198_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI198,IMDBDef3.FLD_PARAMETRI198_ROWNAMDATVAR,6,14,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI198,IMDBDef3.FLD_PARAMETRI198_ROWNAMDESBIL, "ROWNAMDESBIL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI198,IMDBDef3.FLD_PARAMETRI198_ROWNAMDESBIL,5,140,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI198,IMDBDef3.FLD_PARAMETRI198_ROWNAMDESIMP, "ROWNAMDESIMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI198,IMDBDef3.FLD_PARAMETRI198_ROWNAMDESIMP,5,140,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI198,IMDBDef3.FLD_PARAMETRI198_ROWNAMEBILAN, "ROWNAMEBILAN");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI198,IMDBDef3.FLD_PARAMETRI198_ROWNAMEBILAN,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI198,IMDBDef3.FLD_PARAMETRI198_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI198,IMDBDef3.FLD_PARAMETRI198_ROWNAMEIMPEG,1,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI198, 0);
  }

  private static void Init_PQRY_PARAMETRI186(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI186, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI186, "PQRY_PARAMETRI186");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI186,IMDBDef12.PQSL_PARAMETRI186_ROWNAMEPERIO, "ROWNAMEPERIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI186,IMDBDef12.PQSL_PARAMETRI186_ROWNAMEPERIO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI186,IMDBDef12.PQSL_PARAMETRI186_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI186,IMDBDef12.PQSL_PARAMETRI186_ROWNAMDATVAR,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI186,IMDBDef12.PQSL_PARAMETRI186_ROWNAMDESBIL, "ROWNAMDESBIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI186,IMDBDef12.PQSL_PARAMETRI186_ROWNAMDESBIL,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI186,IMDBDef12.PQSL_PARAMETRI186_ROWNAMDESIMP, "ROWNAMDESIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI186,IMDBDef12.PQSL_PARAMETRI186_ROWNAMDESIMP,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI186,IMDBDef12.PQSL_PARAMETRI186_ROWNAMEBILAN, "ROWNAMEBILAN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI186,IMDBDef12.PQSL_PARAMETRI186_ROWNAMEBILAN,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI186,IMDBDef12.PQSL_PARAMETRI186_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI186,IMDBDef12.PQSL_PARAMETRI186_ROWNAMEIMPEG,1,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI186, 0);
  }

  private static void Init_PQRY_PARAMETRI186_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI186_RS, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI186_RS, "PQRY_PARAMETRI186_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI186_RS,IMDBDef12.PQSL_PARAMETRI186_ROWNAMEPERIO, "ROWNAMEPERIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI186_RS,IMDBDef12.PQSL_PARAMETRI186_ROWNAMEPERIO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI186_RS,IMDBDef12.PQSL_PARAMETRI186_ROWNAMDATVAR, "ROWNAMDATVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI186_RS,IMDBDef12.PQSL_PARAMETRI186_ROWNAMDATVAR,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI186_RS,IMDBDef12.PQSL_PARAMETRI186_ROWNAMDESBIL, "ROWNAMDESBIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI186_RS,IMDBDef12.PQSL_PARAMETRI186_ROWNAMDESBIL,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI186_RS,IMDBDef12.PQSL_PARAMETRI186_ROWNAMDESIMP, "ROWNAMDESIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI186_RS,IMDBDef12.PQSL_PARAMETRI186_ROWNAMDESIMP,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI186_RS,IMDBDef12.PQSL_PARAMETRI186_ROWNAMEBILAN, "ROWNAMEBILAN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI186_RS,IMDBDef12.PQSL_PARAMETRI186_ROWNAMEBILAN,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI186_RS,IMDBDef12.PQSL_PARAMETRI186_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI186_RS,IMDBDef12.PQSL_PARAMETRI186_ROWNAMEIMPEG,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniDaBudgetCe4(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniDaBudgetCe4()
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
    FormIdx = MyGlb.FRM_VARIDABUDCE4;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6E42FFD4-004D-4209-951C-1E6A58C07503";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 556;
    DesignHeight = 366;
    set_Caption(new IDVariant("Variazioni Da Budget Ce4"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 556;
    Frames[1].Height = 340;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Variazioni Da Budget Ce4";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 340;
    PAN_VARIDABUDCE4 = new IDPanel(w, this, 1, "PAN_VARIDABUDCE4");
    Frames[1].Content = PAN_VARIDABUDCE4;
    PAN_VARIDABUDCE4.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIDABUDCE4.VS = MainFrm.VisualStyleList;
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 556-MyGlb.PAN_OFFS_X, 340-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIDABUDCE4.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E05501FF-ADC0-403E-89CF-FEE1683C0B25");
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 328, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIDABUDCE4.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIDABUDCE4.InitStatus = 2;
    PAN_VARIDABUDCE4_Init();
    PAN_VARIDABUDCE4_InitFields();
    PAN_VARIDABUDCE4_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI198, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIDABUDCE4_PARAMETRI186();
      }
      PAN_VARIDABUDCE4.UpdatePanel(MainFrm);
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
    return (obj instanceof VariazioniDaBudgetCe4);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniDaBudgetCe4.class.getName() : (Glb.ClassWithPackage(VariazioniDaBudgetCe4.class) ? VariazioniDaBudgetCe4.class.getName().substring(VariazioniDaBudgetCe4.class.getPackage().getName().length() + 1) : VariazioniDaBudgetCe4.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI198, IMDBDef3.FLD_PARAMETRI198_ROWNAMDATVAR, 0, IDL.Today());
      FIRSTTIME = (new IDVariant(1));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDaBudgetCe4", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Da Budget Ce4 After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_VARIDABUDCE4_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Da Budget Ce4 After Find Event Body
      // Procedure Body
      // 
      if (FIRSTTIME.equals((new IDVariant(1)), true))
      {
        Settavaluesource();
        FIRSTTIME = (new IDVariant(0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDaBudgetCe4", "VariazioniDaBudgetCe4AfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Ok Procedura
  // **********************************************************************
  public int OkProcedura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ok Procedura Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI186, IMDBDef12.PQSL_PARAMETRI186_ROWNAMEPERIO, 0).equals((new IDVariant()), true) || IMDB.Value(IMDBDef12.PQRY_PARAMETRI186, IMDBDef12.PQSL_PARAMETRI186_ROWNAMDATVAR, 0).equals((new IDVariant()), true) || IMDB.Value(IMDBDef12.PQRY_PARAMETRI186, IMDBDef12.PQSL_PARAMETRI186_ROWNAMDESBIL, 0).equals((new IDVariant()), true) || IMDB.Value(IMDBDef12.PQRY_PARAMETRI186, IMDBDef12.PQSL_PARAMETRI186_ROWNAMDESIMP, 0).equals((new IDVariant()), true) || IMDB.Value(IMDBDef12.PQRY_PARAMETRI186, IMDBDef12.PQSL_PARAMETRI186_ROWNAMEIMPEG, 0).equals((new IDVariant()), true) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI186, IMDBDef12.PQSL_PARAMETRI186_ROWNAMEBILAN, 0)))
      {
        IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
        v_ERRORMESSAGE = (new IDVariant("Errore, tutti i campi devono essere valorizzati", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
      }
      else
      {
        IDVariant v_OPTERMINATA = new IDVariant(0,IDVariant.STRING);
        v_OPTERMINATA = (new IDVariant("Elaborazione Eseguita", IDVariant.STRING));
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.INSVARDACE4ISS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI186, IMDBDef12.PQSL_PARAMETRI186_ROWNAMEPERIO, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI186, IMDBDef12.PQSL_PARAMETRI186_ROWNAMDATVAR, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI186, IMDBDef12.PQSL_PARAMETRI186_ROWNAMDESBIL, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI186, IMDBDef12.PQSL_PARAMETRI186_ROWNAMDESIMP, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI186, IMDBDef12.PQSL_PARAMETRI186_ROWNAMEBILAN, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI186, IMDBDef12.PQSL_PARAMETRI186_ROWNAMEIMPEG, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_OPTERMINATA); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDaBudgetCe4", "OkProcedura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Procedura
  // **********************************************************************
  public int AnnullaProcedura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Procedura Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDaBudgetCe4", "AnnullaProcedura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Settavaluesource
  // **********************************************************************
  public int Settavaluesource ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PERIODO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODICE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_COD2 = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Settavaluesource Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PERIODO as CE4BILPREPER ");
      SQL.append("from ");
      SQL.append("  CE4ISS_BILANCIO_PREVISIONE A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by ");
      SQL.append("  A.PERIODO ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PERIODO = QV.Get("CE4BILPREPER", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI198, IMDBDef3.FLD_PARAMETRI198_ROWNAMEPERIO, 0, new IDVariant(v_PERIODO));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as T54CODICE ");
      SQL.append("from ");
      SQL.append("  T54 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODICE = QV.Get("T54CODICE", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI198, IMDBDef3.FLD_PARAMETRI198_ROWNAMEBILAN, 0, new IDVariant(v_CODICE));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as T55CODICE ");
      SQL.append("from ");
      SQL.append("  T55 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_COD2 = QV.Get("T55CODICE", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI198, IMDBDef3.FLD_PARAMETRI198_ROWNAMEIMPEG, 0, new IDVariant(v_COD2));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniDaBudgetCe4", "Settavaluesource", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void VARIDABUDCE4_PARAMETRI186() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI186_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI198, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI198, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI186_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI186_RS, 0, IMDBDef3.TBL_PARAMETRI198, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI186_RS, 0, 0, IMDBDef3.TBL_PARAMETRI198, IMDBDef3.FLD_PARAMETRI198_ROWNAMEPERIO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI186_RS, 1, 0, IMDBDef3.TBL_PARAMETRI198, IMDBDef3.FLD_PARAMETRI198_ROWNAMDATVAR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI186_RS, 2, 0, IMDBDef3.TBL_PARAMETRI198, IMDBDef3.FLD_PARAMETRI198_ROWNAMDESBIL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI186_RS, 3, 0, IMDBDef3.TBL_PARAMETRI198, IMDBDef3.FLD_PARAMETRI198_ROWNAMDESIMP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI186_RS, 4, 0, IMDBDef3.TBL_PARAMETRI198, IMDBDef3.FLD_PARAMETRI198_ROWNAMEBILAN, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI186_RS, 5, 0, IMDBDef3.TBL_PARAMETRI198, IMDBDef3.FLD_PARAMETRI198_ROWNAMEIMPEG, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI198, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI198, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI198, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI186_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    // Stub
  }

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
  private void PAN_VARIDABUDCE4_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIDABUDCE4, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIDABUDCE4_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIDABUDCE4, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIDABUDCE4_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VARIDABUDCE4);
    // Stub
  }

  private void PAN_VARIDABUDCE4_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIDABUDCE4_OK)
    {
      this.IdxPanelActived = this.PAN_VARIDABUDCE4.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OkProcedura();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIDABUDCE4_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIDABUDCE4_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIDABUDCE4_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIDABUDCE4_Init()
  {

    PAN_VARIDABUDCE4.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIDABUDCE4.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_VARIDABUDCE4.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_DESCRIVARIAZ, "93788BC6-9AD6-4B78-AD49-3ABC1A125BD3");
    PAN_VARIDABUDCE4.set_Header(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_DESCRIVARIAZ, "Descrizione Variazioni");
    PAN_VARIDABUDCE4.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_DESCRIVARIAZ, "");
    PAN_VARIDABUDCE4.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_DESCRIVARIAZ, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_DESCRIVARIAZ, MyGlb.PANEL_LIST, 0, 159, 520, 85, 0, 0);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_DESCRIVARIAZ, MyGlb.PANEL_FORM, 12, 31, 488, 73, 0, 0);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_DESCRIVARIAZ, 0, 123);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_DESCRIVARIAZ, 1, 13);
    PAN_VARIDABUDCE4.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_DESCRIVARIAZ, 0, 4);
    PAN_VARIDABUDCE4.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_DESCRIVARIAZ, 1, 4);
    PAN_VARIDABUDCE4.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_DESCRIVARIAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIDABUDCE4.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_TIPOVARIAZIO, "CCE543C2-2D68-41E3-9061-EAA9F3F7AE70");
    PAN_VARIDABUDCE4.set_Header(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_TIPOVARIAZIO, "Tipo Variazioni");
    PAN_VARIDABUDCE4.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_TIPOVARIAZIO, "");
    PAN_VARIDABUDCE4.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_TIPOVARIAZIO, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_TIPOVARIAZIO, MyGlb.PANEL_LIST, 192, -9999, 136, 16, 0, 0);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_TIPOVARIAZIO, MyGlb.PANEL_FORM, 12, 111, 488, 73, 0, 0);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_TIPOVARIAZIO, 0, 82);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_TIPOVARIAZIO, 1, 13);
    PAN_VARIDABUDCE4.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_TIPOVARIAZIO, 0, 4);
    PAN_VARIDABUDCE4.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_TIPOVARIAZIO, 1, 4);
    PAN_VARIDABUDCE4.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIDABUDCE4_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIDABUDCE4.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_VARIDABUDCE4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, "B4330194-ED7D-4B86-8FFE-9F326D5105A6");
    PAN_VARIDABUDCE4.set_Header(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, "Periodo");
    PAN_VARIDABUDCE4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, "");
    PAN_VARIDABUDCE4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIDABUDCE4.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIDABUDCE4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, "2EB99CA4-8EF1-4804-8C13-A5D800C2A0E2");
    PAN_VARIDABUDCE4.set_Header(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, "Data Variazioni");
    PAN_VARIDABUDCE4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, "");
    PAN_VARIDABUDCE4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIDABUDCE4.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIDABUDCE4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_LABEL, "C7A94CF6-8F6D-4974-8979-747E1D555B9F");
    PAN_VARIDABUDCE4.set_Header(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_LABEL, "Le variazioni ai capitoli e agli impegni vengono inserite solo per i capitoli di spesa sui quali è presente un unico impegno.");
    PAN_VARIDABUDCE4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_LABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIDABUDCE4.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIDABUDCE4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, "5958F260-64BD-4168-8718-FA513CA187D3");
    PAN_VARIDABUDCE4.set_Header(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, "Bilancio");
    PAN_VARIDABUDCE4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, "");
    PAN_VARIDABUDCE4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIDABUDCE4.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIDABUDCE4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, "3EEF1A3A-CC61-42AA-80AA-4FCC11488E3F");
    PAN_VARIDABUDCE4.set_Header(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, "Impegni");
    PAN_VARIDABUDCE4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, "");
    PAN_VARIDABUDCE4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIDABUDCE4.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIDABUDCE4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, "4593F9EE-D124-4BF2-84C0-5AD53607D37F");
    PAN_VARIDABUDCE4.set_Header(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, "Bilancio");
    PAN_VARIDABUDCE4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, "");
    PAN_VARIDABUDCE4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIDABUDCE4.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIDABUDCE4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, "C254B5C2-8F19-4FB1-9C21-2BD09A35D3C2");
    PAN_VARIDABUDCE4.set_Header(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, "Impegni");
    PAN_VARIDABUDCE4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, "");
    PAN_VARIDABUDCE4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIDABUDCE4.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIDABUDCE4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_OK, "0FF378AD-D1A1-4B5F-BD6A-93E1080FE68A");
    PAN_VARIDABUDCE4.set_Header(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_OK, "OK");
    PAN_VARIDABUDCE4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_OK, MyGlb.VIS_STATICBUTTON);
    PAN_VARIDABUDCE4.SetImage(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_OK, 0, "button1.gif", false);
    PAN_VARIDABUDCE4.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_VARIDABUDCE4_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, MyGlb.PANEL_LIST, 44);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_VARIDABUDCE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, MyGlb.PANEL_LIST, "Periodo");
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, MyGlb.PANEL_FORM, 12, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, MyGlb.PANEL_FORM, 84);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_VARIDABUDCE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_PERIODO, MyGlb.PANEL_FORM, "Periodo");
    PAN_VARIDABUDCE4.SetFieldPage(PFL_VARIDABUDCE4_PERIODO, -1, -1);
    PAN_VARIDABUDCE4.SetFieldPanel(PFL_VARIDABUDCE4_PERIODO, PPQRY_PARAMETRI186, "A.ROWNAMEPERIO", "ROWNAMEPERIO", 1, 2, 0, -13997);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, MyGlb.PANEL_LIST, 64, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIDABUDCE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, MyGlb.PANEL_LIST, "Data Variazioni");
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, MyGlb.PANEL_FORM, 316, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIDABUDCE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_DATAVARIAZIO, MyGlb.PANEL_FORM, "Data Variazioni");
    PAN_VARIDABUDCE4.SetFieldPage(PFL_VARIDABUDCE4_DATAVARIAZIO, -1, -1);
    PAN_VARIDABUDCE4.SetFieldPanel(PFL_VARIDABUDCE4_DATAVARIAZIO, PPQRY_PARAMETRI186, "A.ROWNAMDATVAR", "ROWNAMDATVAR", 6, 14, 0, -13997);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_LABEL, MyGlb.PANEL_LIST, 60, 176, 360, 72, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_LABEL, MyGlb.PANEL_LIST, 5);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_LABEL, MyGlb.PANEL_FORM, 12, 196, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_LABEL, MyGlb.PANEL_FORM, 2);
    PAN_VARIDABUDCE4.SetFieldPage(PFL_VARIDABUDCE4_LABEL, -1, -1);
    PAN_VARIDABUDCE4.SetFieldPanel(PFL_VARIDABUDCE4_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, MyGlb.PANEL_LIST, 4, 184, 512, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, MyGlb.PANEL_LIST, 112);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, MyGlb.PANEL_LIST, 2);
    PAN_VARIDABUDCE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, MyGlb.PANEL_LIST, "Bilancio");
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, MyGlb.PANEL_FORM, 16, 56, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, MyGlb.PANEL_FORM, 80);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIDABUDCE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO1, MyGlb.PANEL_FORM, "Bilancio");
    PAN_VARIDABUDCE4.SetFieldPage(PFL_VARIDABUDCE4_BILANCIO1, -1, GRP_VARIDABUDCE4_DESCRIVARIAZ);
    PAN_VARIDABUDCE4.SetFieldPanel(PFL_VARIDABUDCE4_BILANCIO1, PPQRY_PARAMETRI186, "A.ROWNAMDESBIL", "ROWNAMDESBIL", 5, 140, 0, -13997);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, MyGlb.PANEL_LIST, 4, 208, 512, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, MyGlb.PANEL_LIST, 112);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, MyGlb.PANEL_LIST, 2);
    PAN_VARIDABUDCE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, MyGlb.PANEL_LIST, "Impegni");
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, MyGlb.PANEL_FORM, 16, 80, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, MyGlb.PANEL_FORM, 80);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, MyGlb.PANEL_FORM, 1);
    PAN_VARIDABUDCE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI1, MyGlb.PANEL_FORM, "Impegni");
    PAN_VARIDABUDCE4.SetFieldPage(PFL_VARIDABUDCE4_IMPEGNI1, -1, GRP_VARIDABUDCE4_DESCRIVARIAZ);
    PAN_VARIDABUDCE4.SetFieldPanel(PFL_VARIDABUDCE4_IMPEGNI1, PPQRY_PARAMETRI186, "A.ROWNAMDESIMP", "ROWNAMDESIMP", 5, 140, 0, -13997);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, MyGlb.PANEL_LIST, 192, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, MyGlb.PANEL_LIST, 44);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIDABUDCE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, MyGlb.PANEL_LIST, "Bilancio");
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, MyGlb.PANEL_FORM, 16, 136, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, MyGlb.PANEL_FORM, 80);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIDABUDCE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_BILANCIO, MyGlb.PANEL_FORM, "Bilancio");
    PAN_VARIDABUDCE4.SetFieldPage(PFL_VARIDABUDCE4_BILANCIO, -1, GRP_VARIDABUDCE4_TIPOVARIAZIO);
    PAN_VARIDABUDCE4.SetFieldPanel(PFL_VARIDABUDCE4_BILANCIO, PPQRY_PARAMETRI186, "A.ROWNAMEBILAN", "ROWNAMEBILAN", 1, 2, 0, -13997);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, MyGlb.PANEL_LIST, 264, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, MyGlb.PANEL_LIST, 48);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_VARIDABUDCE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, MyGlb.PANEL_LIST, "Impegni");
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, MyGlb.PANEL_FORM, 16, 160, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, MyGlb.PANEL_FORM, 80);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_VARIDABUDCE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_IMPEGNI, MyGlb.PANEL_FORM, "Impegni");
    PAN_VARIDABUDCE4.SetFieldPage(PFL_VARIDABUDCE4_IMPEGNI, -1, GRP_VARIDABUDCE4_TIPOVARIAZIO);
    PAN_VARIDABUDCE4.SetFieldPanel(PFL_VARIDABUDCE4_IMPEGNI, PPQRY_PARAMETRI186, "A.ROWNAMEIMPEG", "ROWNAMEIMPEG", 1, 2, 0, -13997);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_OK, MyGlb.PANEL_LIST, 324, 244, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_OK, MyGlb.PANEL_LIST, 0);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_OK, MyGlb.PANEL_LIST, 1);
    PAN_VARIDABUDCE4.SetRect(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_OK, MyGlb.PANEL_FORM, 420, 236, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIDABUDCE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_OK, MyGlb.PANEL_FORM, 0);
    PAN_VARIDABUDCE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIDABUDCE4_OK, MyGlb.PANEL_FORM, 1);
    PAN_VARIDABUDCE4.SetFieldPage(PFL_VARIDABUDCE4_OK, -1, -1);
    PAN_VARIDABUDCE4.SetFieldPanel(PFL_VARIDABUDCE4_OK, -1, "", "OK", 0, 0, 0, -13997);
  }

  private void PAN_VARIDABUDCE4_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIDABUDCE4.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PERIODO as CE4BILPREPER, ");
    SQL.append("  A.PERIODO as CE4BILPRNEEX ");
    SQL.append("from ");
    SQL.append("  CE4ISS_BILANCIO_PREVISIONE A ");
    SQL.append("where (~~ROWNAMEPERIO~~ = A.PERIODO) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.PERIODO ");
    PAN_VARIDABUDCE4.SetQuery(PPQRY_CE4IBILAPREV, 0, SQL, PFL_VARIDABUDCE4_PERIODO, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PERIODO as CE4BILPREPER, ");
    SQL.append("  A.PERIODO as CE4BILPRNEEX ");
    SQL.append("from ");
    SQL.append("  CE4ISS_BILANCIO_PREVISIONE A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.PERIODO ");
    PAN_VARIDABUDCE4.SetQuery(PPQRY_CE4IBILAPREV, 1, SQL, PFL_VARIDABUDCE4_PERIODO, "");
    PAN_VARIDABUDCE4.SetQueryDB(PPQRY_CE4IBILAPREV, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T54NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEBILAN~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIDABUDCE4.SetQuery(PPQRY_T54, 0, SQL, PFL_VARIDABUDCE4_BILANCIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T54NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIDABUDCE4.SetQuery(PPQRY_T54, 1, SQL, PFL_VARIDABUDCE4_BILANCIO, "");
    PAN_VARIDABUDCE4.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T55NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEIMPEG~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIDABUDCE4.SetQuery(PPQRY_T55, 0, SQL, PFL_VARIDABUDCE4_IMPEGNI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T55NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIDABUDCE4.SetQuery(PPQRY_T55, 1, SQL, PFL_VARIDABUDCE4_IMPEGNI, "");
    PAN_VARIDABUDCE4.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIDABUDCE4.SetIMDB(IMDB, "PQRY_PARAMETRI186", true);
    PAN_VARIDABUDCE4.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_VARIDABUDCE4.SetQueryIMDB(PPQRY_PARAMETRI186, IMDBDef12.PQRY_PARAMETRI186_RS, IMDBDef3.TBL_PARAMETRI198);
    JustLoaded = true;
    PAN_VARIDABUDCE4.SetFieldPrimaryIndex(PFL_VARIDABUDCE4_PERIODO, IMDBDef3.FLD_PARAMETRI198_ROWNAMEPERIO);
    PAN_VARIDABUDCE4.SetFieldPrimaryIndex(PFL_VARIDABUDCE4_DATAVARIAZIO, IMDBDef3.FLD_PARAMETRI198_ROWNAMDATVAR);
    PAN_VARIDABUDCE4.SetFieldPrimaryIndex(PFL_VARIDABUDCE4_BILANCIO1, IMDBDef3.FLD_PARAMETRI198_ROWNAMDESBIL);
    PAN_VARIDABUDCE4.SetFieldPrimaryIndex(PFL_VARIDABUDCE4_IMPEGNI1, IMDBDef3.FLD_PARAMETRI198_ROWNAMDESIMP);
    PAN_VARIDABUDCE4.SetFieldPrimaryIndex(PFL_VARIDABUDCE4_BILANCIO, IMDBDef3.FLD_PARAMETRI198_ROWNAMEBILAN);
    PAN_VARIDABUDCE4.SetFieldPrimaryIndex(PFL_VARIDABUDCE4_IMPEGNI, IMDBDef3.FLD_PARAMETRI198_ROWNAMEIMPEG);
    PAN_VARIDABUDCE4.SetMasterTable(0, "PARAMETRI198");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIDABUDCE4.Status() == 2)
    {
      int oldListQBE = PAN_VARIDABUDCE4.iUseListQBE;
      PAN_VARIDABUDCE4.iUseListQBE = 0;
      PAN_VARIDABUDCE4.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIDABUDCE4.PanelCommand(Glb.PCM_FIND);
      PAN_VARIDABUDCE4.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIDABUDCE4) PAN_VARIDABUDCE4_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIDABUDCE4) PAN_VARIDABUDCE4_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIDABUDCE4) PAN_VARIDABUDCE4_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIDABUDCE4) PAN_VARIDABUDCE4_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIDABUDCE4) PAN_VARIDABUDCE4_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_VARIDABUDCE4) PAN_VARIDABUDCE4_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
