// **********************************************
// Stanziamenti Pluriennali Simulato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StanziamentiPluriennaliSimulato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_BPR_ESERCIZIO = 0;
  private static int PFL_BPR_ES = 1;
  private static int PFL_BPR_CAPITOLO = 2;
  private static int PFL_BPR_ARTICOLO = 3;
  private static int PFL_BPR_IMPACCULTCHI = 4;
  private static int PFL_BPR_IMPACCULTCON = 5;
  private static int PFL_BPR_IMPACCULTSVI = 6;
  private static int PFL_BPR_COMPETENPURA = 7;
  private static int PFL_BPR_REISCRIDAIMP = 8;
  private static int PFL_BPR_PREVISIOCONS = 9;
  private static int PFL_BPR_PREVISIOSVIL = 10;
  private static int PFL_BPR_REISCRIDASTN = 11;
  private static int PFL_BPR_STNINICO = 12;
  private static int PFL_BPR_GIAIMPEGNATO = 13;
  private static int PFL_BPR_IMPEGNABILE = 14;
  private static int PFL_BPR_PREVISIONE = 15;
  private static int PFL_BPR_STNINICOCONS = 16;
  private static int PFL_BPR_STNINICOSVIL = 17;
  private static int PFL_BPR_VARIAZIONICO = 18;
  private static int PFL_BPR_VARIAZCOCONS = 19;
  private static int PFL_BPR_VARIAZCOSVIL = 20;
  private static int PFL_BPR_UTENTEINSERI = 21;
  private static int PFL_BPR_DATAINSERIME = 22;
  private static int PFL_BPR_UTENTULTIAGG = 23;
  private static int PFL_BPR_DATAULTIMAGG = 24;
  private static int PFL_BPR_STNINICA = 25;
  private static int PFL_BPR_RESIDUPRESUN = 26;
  private static int PFL_BPR_NUOVO = 27;
  private static int PFL_BPR_FASEESEFIN = 28;

  private static int PPQRY_BPR1 = 0;

  private static int PPQRY_ESEFIN = 1;


  IDPanel PAN_BPR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IMDBSTANZ(IMDB);
    //
    //
    Init_PQRY_BPR1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IMDBSTANZ(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_IMDBSTANZ, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_IMDBSTANZ, "TBL_IMDBSTANZ");
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBSTANZ,IMDBDef3.FLD_IMDBSTANZ_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBSTANZ,IMDBDef3.FLD_IMDBSTANZ_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBSTANZ,IMDBDef3.FLD_IMDBSTANZ_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBSTANZ,IMDBDef3.FLD_IMDBSTANZ_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBSTANZ,IMDBDef3.FLD_IMDBSTANZ_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBSTANZ,IMDBDef3.FLD_IMDBSTANZ_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBSTANZ,IMDBDef3.FLD_IMDBSTANZ_NOMEOGGELOCK, "NOMEOGGELOCK");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBSTANZ,IMDBDef3.FLD_IMDBSTANZ_NOMEOGGELOCK,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_IMDBSTANZ, 0);
  }

  private static void Init_PQRY_BPR1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BPR1, 29);
    IMDB.set_TblCode(IMDBDef11.PQRY_BPR1, "PQRY_BPR1");
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_ES, "ES");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_ES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_IMPACCULTCHI, "IMPACCULTCHI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_IMPACCULTCHI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_IMPACCULTCON, "IMPACCULTCON");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_IMPACCULTCON,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_IMPACCULTSVI, "IMPACCULTSVI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_IMPACCULTSVI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_PREVISIOCONS, "PREVISIOCONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_PREVISIOCONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_PREVISIOSVIL, "PREVISIOSVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_PREVISIOSVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_STNINICO, "STNINICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_STNINICO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_STNINICOCONS, "STNINICOCONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_STNINICOCONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_STNINICOSVIL, "STNINICOSVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_STNINICOSVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_VARIAZIONICO, "VARIAZIONICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_VARIAZIONICO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_VARIAZCOCONS, "VARIAZCOCONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_VARIAZCOCONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_VARIAZCOSVIL, "VARIAZCOSVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_VARIAZCOSVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_IMPEGNABILE, "IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_UTENTEINSERI, "UTENTEINSERI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_UTENTEINSERI,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_DATAINSERIME, "DATAINSERIME");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_DATAINSERIME,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_UTENTULTIAGG, "UTENTULTIAGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_UTENTULTIAGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_DATAULTIMAGG, "DATAULTIMAGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_DATAULTIMAGG,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_STNINICA, "STNINICA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_STNINICA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_RESIDUPRESUN, "RESIDUPRESUN");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_RESIDUPRESUN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_REISCRIDAIMP, "REISCRIDAIMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_REISCRIDAIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_REISCRIDASTN, "REISCRIDASTN");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_REISCRIDASTN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_GIAIMPEGNATO, "GIAIMPEGNATO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_GIAIMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_COMPETENPURA, "COMPETENPURA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_COMPETENPURA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_NUOVO, "NUOVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_NUOVO,3,14,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_FASEESEFIN, "FASEESEFIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_BPR1,IMDBDef11.PQSL_BPR1_FASEESEFIN,1,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_BPR1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StanziamentiPluriennaliSimulato(MyWebEntryPoint w, IMDBObj imdb)
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
  public StanziamentiPluriennaliSimulato()
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
    FormIdx = MyGlb.FRM_STANPLURSIMU;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "54502EF6-4F41-452C-B836-F961F9AE7E6D";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 840;
    DesignHeight = 362;
    set_Caption(new IDVariant("Stanziamenti Pluriennali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 840;
    Frames[1].Height = 336;
    Frames[1].Caption = "Stanziamenti Pluriennali";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    PAN_BPR = new IDPanel(w, this, 1, "PAN_BPR");
    Frames[1].Content = PAN_BPR;
    PAN_BPR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BPR.VS = MainFrm.VisualStyleList;
    PAN_BPR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 840-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "54248531-82FE-4BF0-8131-C72961DF465E");
    PAN_BPR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 748, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BPR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BPR.InitStatus = 2;
    PAN_BPR_Init();
    PAN_BPR_InitFields();
    PAN_BPR_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_CANCELLA7+BaseCmdLinIdx)
      {
        Cancella();
        break fine;
      }
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
      PAN_BPR.UpdatePanel(MainFrm);
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
    return (obj instanceof StanziamentiPluriennaliSimulato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StanziamentiPluriennaliSimulato.class.getName() : (Glb.ClassWithPackage(StanziamentiPluriennaliSimulato.class) ? StanziamentiPluriennaliSimulato.class.getName().substring(StanziamentiPluriennaliSimulato.class.getPackage().getName().length() + 1) : StanziamentiPluriennaliSimulato.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Load
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
      // Load Body
      // Corpo Procedura
      // 
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(Caption(), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_IMDBSTANZ, IMDBDef3.FLD_IMDBSTANZ_NOMEOGGECAPI, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_IMDBSTANZ, IMDBDef3.FLD_IMDBSTANZ_NOMEOGGEARTI, 0))));
      PAN_BPR.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_BPR.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (IMDB.Value(IMDBDef3.TBL_IMDBSTANZ, IMDBDef3.FLD_IMDBSTANZ_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
      {
        PAN_BPR.SetFlags (Glb.OBJ_FIELD, PFL_BPR_COMPETENPURA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BPR.SetFlags (Glb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BPR.SetFlags (Glb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BPR.SetFlags (Glb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BPR.SetFlags (Glb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_BPR.SetFlags (Glb.OBJ_FIELD, PFL_BPR_STNINICO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      // if (IMDB.Value(IMDBDef3.TBL_IMDBSTANZ, IMDBDef3.FLD_IMDBSTANZ_NOMEOGGELOCK, 0).equals((new IDVariant("SI")), true))
      // {
        // PAN_BPR.set_Locked((new IDVariant(-1)).booleanValue());
        // MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CANCELLA5+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliSimulato", "Load", _e);
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_IMDBSTANDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliSimulato", "Unload", _e);
    }
  }

  // **********************************************************************
  // IMDB Stanz: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDBSTANDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_IMDBSTANZ, IMDBDef3.FLD_IMDBSTANZ_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBSTANZ, IMDBDef3.FLD_IMDBSTANZ_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBSTANZ, IMDBDef3.FLD_IMDBSTANZ_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBSTANZ, IMDBDef3.FLD_IMDBSTANZ_NOMEOGGELOCK, 0, new IDVariant());
  }

  // **********************************************************************
  // BPR Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_BPR_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BPR Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_ES, 0, IMDB.Value(IMDBDef3.TBL_IMDBSTANZ, IMDBDef3.FLD_IMDBSTANZ_NOMEOGGETTES, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_CAPITOLO, 0, IMDB.Value(IMDBDef3.TBL_IMDBSTANZ, IMDBDef3.FLD_IMDBSTANZ_NOMEOGGECAPI, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_ARTICOLO, 0, IMDB.Value(IMDBDef3.TBL_IMDBSTANZ, IMDBDef3.FLD_IMDBSTANZ_NOMEOGGEARTI, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_UTENTEINSERI, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_DATAINSERIME, 0, IDL.Today());
      IMDB.set_Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_STNINICA, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_RESIDUPRESUN, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_VARIAZIONICO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliSimulato", "BPRBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // BPR On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_BPR_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BPR On Updating Row Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_NUOVO, 0),(new IDVariant(0))).equals((new IDVariant(1)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_UTENTULTIAGG, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_UTENTULTIAGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_DATAULTIMAGG, 0, IDL.Today());
        }
      }
      if ((Column.equals((new IDVariant(PFL_BPR_COMPETENPURA)), true) || Column.equals((new IDVariant(PFL_BPR_REISCRIDAIMP)), true) || Column.equals((new IDVariant(PFL_BPR_REISCRIDASTN)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_STNINICO, 0, IDL.Add(IDL.Add(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_COMPETENPURA, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_REISCRIDAIMP, 0),(new IDVariant(0)))), IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_REISCRIDASTN, 0),(new IDVariant(0)))));
      }
      if (Column.equals((new IDVariant(PFL_BPR_ESERCIZIO)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_ESERCIZIO, 0))))
        {
          if (IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_ESERCIZIO, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<=0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("L'esercizio indicato deve essere maggiore di quello del contesto"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_ESERCIZIO, 0, ((IDL.NullValue(PAN_BPR.GetOrgValue(PFL_BPR_ESERCIZIO),(new IDVariant("0"))).compareTo((new IDVariant("0")), true)!=0)?IDL.ToInteger(PAN_BPR.GetOrgValue(PFL_BPR_ESERCIZIO)):(new IDVariant())));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliSimulato", "BPROnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // BPR On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BPR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_BPR);
      // 
      // BPR On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_NUOVO, 0),(new IDVariant(0))).equals((new IDVariant(0)), true))
      {
        PAN_BPR.SetFlags (Glb.OBJ_FIELD, PFL_BPR_ESERCIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_BPR.SetFlags (Glb.OBJ_FIELD, PFL_BPR_ESERCIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_FASEESEFIN, 0),(new IDVariant(0))).compareTo((new IDVariant(1)), true)>0)
      {
        ABILITA((new IDVariant(0)));
      }
      else
      {
        ABILITA((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliSimulato", "BPROnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // BPR On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_BPR_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BPR On Change Row Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_FASEESEFIN, 0),(new IDVariant(0))).compareTo((new IDVariant(1)), true)>0)
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CANCELLA5+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CANCELLA5+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliSimulato", "BPROnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Cancella
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Cancella ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cancella Body
      // Corpo Procedura
      // 
      IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
      v_MSG = (new IDVariant("Cancellare la riga selezionata?"));
      IDVariant v_EXITCODE = new IDVariant(0,IDVariant.INTEGER);
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_ESERCIZIO, 0)))
      {
        IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
        v_MSG2 = (new IDVariant("Impossibile cancellare la riga selezionata, é una riga vuota!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MSG2); 
        return 0;
      }
      v_EXITCODE = (new IDVariant(MainFrm.MessageConfirm(v_MSG)));
      if (v_EXITCODE.booleanValue())
      {
        try
        {
          SQL = new StringBuffer();
          SQL.append("delete from BPR ");
          SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (E_S = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_ES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_BPR1, IMDBDef11.PQSL_BPR1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e6)
        {
          MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
          return 0;
        }
        PAN_BPR.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliSimulato", "Cancella", _e);
      return -1;
    }
  }

  // **********************************************************************
  // ABILITA
  // Abil - Input
  // **********************************************************************
  public int ABILITA (IDVariant Abil)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // ABILITA Body
      // Corpo Procedura
      // 
      PAN_BPR.SetFlags (Glb.OBJ_FIELD, PFL_BPR_COMPETENPURA, (Abil.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BPR.SetFlags (Glb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, (Abil.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BPR.SetFlags (Glb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, (Abil.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BPR.SetFlags (Glb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, (Abil.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliSimulato", "ABILITA", _e);
      return -1;
    }
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
  private void PAN_BPR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BPR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BPR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BPR, Cancel);
    // Stub
  }

  private void PAN_BPR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_BPR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_BPR_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_BPR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BPR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BPR_Init()
  {

    PAN_BPR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BPR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BPR.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, "F854AC41-5FB1-490B-8376-6C05E93D471A");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, "Esercizio");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_ES, "8F6207E7-9BD0-4F62-ADF5-01B13A622E21");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_ES, "E S");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_ES, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, "B6234905-C86E-47FD-884E-4BE037F72D14");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, "CAPITOLO");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, "AB19F0E1-264F-4E2F-AB95-29B3FE4CDD84");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, "ARTICOLO");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, "40360D95-7329-4697-BEF6-FD4F5C435A62");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, "IMP ACC ULT CHIUSO");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, MyGlb.VIS_NONNULLAFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, "2277E615-A587-4D41-B0CB-94BD0D7626BB");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, "IMP ACC ULT CONS");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, MyGlb.VIS_NONNULLAFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, "B52C67DC-9D84-4F44-918E-C70B094DCF96");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, "IMP ACC ULT SVIL");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, MyGlb.VIS_NONNULLAFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, "626EC305-BCB2-4F0C-A087-22EA3570D9A6");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, "Competenza Pura");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, MyGlb.VIS_NORFIECF4IMP);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, "5B8D43A0-4914-4E9D-A201-F0A43DA03B73");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, "Reiscrizioni da Esigibilità");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, "58FEB753-13A2-4022-B6AF-5D9767F41A17");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, "PREVISIONE CONS");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, "989D35BE-0CF6-47AB-924B-80B3949C573A");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, "PREVISIONE SVIL");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, "9576CDFE-6DC8-4197-99F7-0EE4340336FF");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, "Reiscrizioni Stanziamento");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, "EB1E455F-40EF-40A5-9056-6839E145B707");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, "Competenza Totale");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, "D76800FF-76D7-4193-A144-6D6D8D1985D5");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, "Già Impegnato");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, "A1D6DABD-364F-4712-A045-C36DCA634E07");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, "IMPEGNABILE");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, MyGlb.VIS_NORMFIELPADR);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, "F166EB8C-F1F9-4C64-A961-34E089E82B96");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, "Previsione");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, MyGlb.VIS_NORFIECF4IMP);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, "9AB7F488-90A5-4F04-AA59-AB87ED60BB09");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, "STN INI CO CONS");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, "893AC83B-1C14-4A63-994F-05652AC06ACE");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, "STN INI CO SVIL");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, "B1295948-2724-409B-A0AD-37C2AB398841");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, "VARIAZIONI CO");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, MyGlb.VIS_NONNULLAFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, "451A60AA-C011-4975-BF45-EE9AB7269B98");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, "VARIAZIONI CO CONS");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, "7CB904D4-9BB4-4947-BFAB-E96B33951901");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, "VARIAZIONI CO SVIL");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, "774751A8-AA86-4C89-85AE-1CE78C42E4CC");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, "7F9EB1AA-8042-4B66-A7B6-5B7329A09EFC");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, "DATA INSERIMENTO");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, "43800333-4D2E-4639-AD39-76DB88B60BA9");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, "721980BB-2DA9-4ACB-ABC6-6D31B464C839");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, "BE8610FD-BC0B-43BB-8F27-55FA8736815C");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, "STN INI CA");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, MyGlb.VIS_NORMFIELPADR);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, "B7B6F172-AAB1-49CE-AE16-825B6487154E");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, "RESIDUI PRESUNTI");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, MyGlb.VIS_NORMFIELPADR);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, "B09D4196-E63B-4F69-85D1-A07F10D303C9");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, "Nuovo");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, MyGlb.VIS_NORMFIELPADR);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BPR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, "00F31A85-70A8-4098-BF5F-4B40F37CB87E");
    PAN_BPR.set_Header(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, "Faseesefin");
    PAN_BPR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, "");
    PAN_BPR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, MyGlb.VIS_NORMFIELPADR);
    PAN_BPR.SetFlags(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_BPR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, MyGlb.PANEL_FORM, 104);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_BPR.SetFieldPage(PFL_BPR_ESERCIZIO, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_ESERCIZIO, PPQRY_BPR1, "ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_ES, MyGlb.PANEL_LIST, 56, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_ES, MyGlb.PANEL_LIST, 24);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_ES, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_ES, MyGlb.PANEL_LIST, "E S");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_ES, MyGlb.PANEL_FORM, 180, 4, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_ES, MyGlb.PANEL_FORM, 40);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_ES, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_ES, MyGlb.PANEL_FORM, "E S");
    PAN_BPR.SetFieldPage(PFL_BPR_ES, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_ES, PPQRY_BPR1, "E_S", "ES", 5, 1, 0, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, MyGlb.PANEL_LIST, 56, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, MyGlb.PANEL_FORM, 276, 4, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_BPR.SetFieldPage(PFL_BPR_CAPITOLO, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_CAPITOLO, PPQRY_BPR1, "CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, MyGlb.PANEL_LIST, 56, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, MyGlb.PANEL_FORM, 104);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_BPR.SetFieldPage(PFL_BPR_ARTICOLO, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_ARTICOLO, PPQRY_BPR1, "ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, MyGlb.PANEL_LIST, 56, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, MyGlb.PANEL_LIST, 128);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, MyGlb.PANEL_LIST, "IMP ACC ULT CH.");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, MyGlb.PANEL_FORM, 164, 28, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, MyGlb.PANEL_FORM, 144);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCHI, MyGlb.PANEL_FORM, "IMP ACC ULT CHIUSO");
    PAN_BPR.SetFieldPage(PFL_BPR_IMPACCULTCHI, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_IMPACCULTCHI, PPQRY_BPR1, "IMP_ACC_ULT_CHIUSO", "IMPACCULTCHI", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, MyGlb.PANEL_LIST, 120, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, MyGlb.PANEL_LIST, 112);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, MyGlb.PANEL_LIST, "IMP ACC ULT CONS");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, MyGlb.PANEL_FORM, 104);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTCON, MyGlb.PANEL_FORM, "IMP ACC ULT CNS.");
    PAN_BPR.SetFieldPage(PFL_BPR_IMPACCULTCON, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_IMPACCULTCON, PPQRY_BPR1, "IMP_ACC_ULT_CONS", "IMPACCULTCON", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, MyGlb.PANEL_LIST, 184, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, MyGlb.PANEL_LIST, 108);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, MyGlb.PANEL_LIST, "IMP ACC ULT SVIL");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, MyGlb.PANEL_FORM, 188, 52, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, MyGlb.PANEL_FORM, 120);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_IMPACCULTSVI, MyGlb.PANEL_FORM, "IMP ACC ULT SVIL");
    PAN_BPR.SetFieldPage(PFL_BPR_IMPACCULTSVI, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_IMPACCULTSVI, PPQRY_BPR1, "IMP_ACC_ULT_SVIL", "IMPACCULTSVI", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, MyGlb.PANEL_LIST, 60, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, MyGlb.PANEL_LIST, 108);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, MyGlb.PANEL_LIST, "Competenza Pura");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, MyGlb.PANEL_FORM, 4, 364, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, MyGlb.PANEL_FORM, 108);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_COMPETENPURA, MyGlb.PANEL_FORM, "Competenza Pura");
    PAN_BPR.SetFieldPage(PFL_BPR_COMPETENPURA, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_COMPETENPURA, PPQRY_BPR1, "COMPETENPURA", "COMPETENPURA", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, MyGlb.PANEL_LIST, 168, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, MyGlb.PANEL_LIST, 160);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, MyGlb.PANEL_LIST, "Reiscrizioni da Esigibilità");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, MyGlb.PANEL_FORM, 4, 316, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, MyGlb.PANEL_FORM, 144);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDAIMP, MyGlb.PANEL_FORM, "Reiscrizioni da Esigibilità");
    PAN_BPR.SetFieldPage(PFL_BPR_REISCRIDAIMP, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_REISCRIDAIMP, PPQRY_BPR1, "REISCRIZIONI_DA_IMP", "REISCRIDAIMP", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, MyGlb.PANEL_LIST, 312, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, MyGlb.PANEL_LIST, 108);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, MyGlb.PANEL_LIST, "PREVIS. CONS");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, MyGlb.PANEL_FORM, 188, 76, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, MyGlb.PANEL_FORM, 120);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOCONS, MyGlb.PANEL_FORM, "PREVISIONE CONS");
    PAN_BPR.SetFieldPage(PFL_BPR_PREVISIOCONS, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_PREVISIOCONS, PPQRY_BPR1, "PREVISIONE_CONS", "PREVISIOCONS", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, MyGlb.PANEL_LIST, 120, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, MyGlb.PANEL_LIST, 104);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, MyGlb.PANEL_LIST, "PREVIS. SVIL");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, MyGlb.PANEL_FORM, 104);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIOSVIL, MyGlb.PANEL_FORM, "PREVISIONE SVIL");
    PAN_BPR.SetFieldPage(PFL_BPR_PREVISIOSVIL, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_PREVISIOSVIL, PPQRY_BPR1, "PREVISIONE_SVIL", "PREVISIOSVIL", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, MyGlb.PANEL_LIST, 284, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, MyGlb.PANEL_LIST, 160);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, MyGlb.PANEL_LIST, "Reiscrizioni Stanziamento");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, MyGlb.PANEL_FORM, 236, 316, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, MyGlb.PANEL_FORM, 144);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_REISCRIDASTN, MyGlb.PANEL_FORM, "Reiscr. Stanziamento");
    PAN_BPR.SetFieldPage(PFL_BPR_REISCRIDASTN, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_REISCRIDASTN, PPQRY_BPR1, "REISCRIZIONI_DA_STN", "REISCRIDASTN", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, MyGlb.PANEL_LIST, 400, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, MyGlb.PANEL_LIST, 68);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, MyGlb.PANEL_LIST, "Competenza Totale");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, MyGlb.PANEL_FORM, 188, 100, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, MyGlb.PANEL_FORM, 80);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_STNINICO, MyGlb.PANEL_FORM, "Compet. Tot.");
    PAN_BPR.SetFieldPage(PFL_BPR_STNINICO, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_STNINICO, PPQRY_BPR1, "STN_INI_CO", "STNINICO", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, MyGlb.PANEL_LIST, 516, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, MyGlb.PANEL_LIST, 128);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, MyGlb.PANEL_LIST, "Già Impegnato");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, MyGlb.PANEL_FORM, 4, 340, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, MyGlb.PANEL_FORM, 112);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_GIAIMPEGNATO, MyGlb.PANEL_FORM, "Già Impegnato");
    PAN_BPR.SetFieldPage(PFL_BPR_GIAIMPEGNATO, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_GIAIMPEGNATO, PPQRY_BPR1, "GIA_IMPEGNATO", "GIAIMPEGNATO", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, MyGlb.PANEL_LIST, 516, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, MyGlb.PANEL_LIST, 160);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, MyGlb.PANEL_LIST, "IMP.");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, MyGlb.PANEL_FORM, 212, 220, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, MyGlb.PANEL_FORM, 96);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_IMPEGNABILE, MyGlb.PANEL_FORM, "IMPEGNABILE");
    PAN_BPR.SetFieldPage(PFL_BPR_IMPEGNABILE, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_IMPEGNABILE, PPQRY_BPR1, "IMPEGNABILE", "IMPEGNABILE", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, MyGlb.PANEL_LIST, 632, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, MyGlb.PANEL_LIST, 76);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, MyGlb.PANEL_LIST, "Previsione");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, MyGlb.PANEL_FORM, 104);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_PREVISIONE, MyGlb.PANEL_FORM, "Previsione");
    PAN_BPR.SetFieldPage(PFL_BPR_PREVISIONE, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_PREVISIONE, PPQRY_BPR1, "PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, MyGlb.PANEL_LIST, 304, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, MyGlb.PANEL_LIST, 100);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, MyGlb.PANEL_LIST, "STN INI CO CONS");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, MyGlb.PANEL_FORM, 104);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOCONS, MyGlb.PANEL_FORM, "STN INI CO CONS");
    PAN_BPR.SetFieldPage(PFL_BPR_STNINICOCONS, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_STNINICOCONS, PPQRY_BPR1, "STN_INI_CO_CONS", "STNINICOCONS", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, MyGlb.PANEL_LIST, 368, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, MyGlb.PANEL_LIST, 96);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, MyGlb.PANEL_LIST, "STN INI CO SVIL");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, MyGlb.PANEL_FORM, 188, 124, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, MyGlb.PANEL_FORM, 112);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_STNINICOSVIL, MyGlb.PANEL_FORM, "STN INI CO SVIL");
    PAN_BPR.SetFieldPage(PFL_BPR_STNINICOSVIL, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_STNINICOSVIL, PPQRY_BPR1, "STN_INI_CO_SVIL", "STNINICOSVIL", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, MyGlb.PANEL_LIST, 432, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, MyGlb.PANEL_LIST, 96);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, MyGlb.PANEL_LIST, "VARIAZ. CO");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, MyGlb.PANEL_FORM, 4, 148, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, MyGlb.PANEL_FORM, 104);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZIONICO, MyGlb.PANEL_FORM, "VARIAZIONI CO");
    PAN_BPR.SetFieldPage(PFL_BPR_VARIAZIONICO, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_VARIAZIONICO, PPQRY_BPR1, "VARIAZIONI_CO", "VARIAZIONICO", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, MyGlb.PANEL_LIST, 504, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, MyGlb.PANEL_LIST, 128);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, MyGlb.PANEL_LIST, "VARIAZ. CO CONS");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, MyGlb.PANEL_FORM, 196, 148, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, MyGlb.PANEL_FORM, 144);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOCONS, MyGlb.PANEL_FORM, "VARIAZIONI CO CONS");
    PAN_BPR.SetFieldPage(PFL_BPR_VARIAZCOCONS, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_VARIAZCOCONS, PPQRY_BPR1, "VARIAZIONI_CO_CONS", "VARIAZCOCONS", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, MyGlb.PANEL_LIST, 568, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, MyGlb.PANEL_LIST, 124);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, MyGlb.PANEL_LIST, "VARIAZ. CO SVIL");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, MyGlb.PANEL_FORM, 4, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, MyGlb.PANEL_FORM, 104);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_VARIAZCOSVIL, MyGlb.PANEL_FORM, "VARIAZ. CO SVIL");
    PAN_BPR.SetFieldPage(PFL_BPR_VARIAZCOSVIL, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_VARIAZCOSVIL, PPQRY_BPR1, "VARIAZIONI_CO_SVIL", "VARIAZCOSVIL", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, MyGlb.PANEL_LIST, 4, 248, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, MyGlb.PANEL_LIST, 160);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, MyGlb.PANEL_FORM, 188, 244, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, MyGlb.PANEL_FORM, 144);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_BPR.SetFieldPage(PFL_BPR_UTENTEINSERI, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_UTENTEINSERI, PPQRY_BPR1, "UTENTE_INSERIMENTO", "UTENTEINSERI", 5, 8, 0, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, MyGlb.PANEL_LIST, 252, 248, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, MyGlb.PANEL_FORM, 4, 268, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, MyGlb.PANEL_FORM, 104);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_BPR.SetFieldPage(PFL_BPR_DATAINSERIME, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_DATAINSERIME, PPQRY_BPR1, "DATA_INSERIMENTO", "DATAINSERIME", 6, 10, 0, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, MyGlb.PANEL_LIST, 4, 272, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, MyGlb.PANEL_LIST, 160);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, MyGlb.PANEL_FORM, 212, 268, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, MyGlb.PANEL_FORM, 136);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_BPR.SetFieldPage(PFL_BPR_UTENTULTIAGG, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_UTENTULTIAGG, PPQRY_BPR1, "UTENTE_ULTIMO_AGG", "UTENTULTIAGG", 5, 8, 0, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, MyGlb.PANEL_LIST, 252, 272, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, MyGlb.PANEL_LIST, 32);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, MyGlb.PANEL_LIST, "D. U. A.");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, MyGlb.PANEL_FORM, 436, 28, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, MyGlb.PANEL_FORM, 20);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULT. AGG");
    PAN_BPR.SetFieldPage(PFL_BPR_DATAULTIMAGG, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_DATAULTIMAGG, PPQRY_BPR1, "DATA_ULTIMO_AGG", "DATAULTIMAGG", 6, 10, 0, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, MyGlb.PANEL_LIST, 4, 296, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, MyGlb.PANEL_LIST, 160);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, MyGlb.PANEL_LIST, "STN INI CA");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, MyGlb.PANEL_FORM, 388, 76, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, MyGlb.PANEL_FORM, 80);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_STNINICA, MyGlb.PANEL_FORM, "STN INI CA");
    PAN_BPR.SetFieldPage(PFL_BPR_STNINICA, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_STNINICA, PPQRY_BPR1, "STN_INI_CA", "STNINICA", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, MyGlb.PANEL_LIST, 4, 320, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, MyGlb.PANEL_LIST, 160);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, MyGlb.PANEL_LIST, "RESIDUI PRESUNTI");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, MyGlb.PANEL_FORM, 220, 292, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, MyGlb.PANEL_FORM, 128);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_RESIDUPRESUN, MyGlb.PANEL_FORM, "RESIDUI PRESUNTI");
    PAN_BPR.SetFieldPage(PFL_BPR_RESIDUPRESUN, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_RESIDUPRESUN, PPQRY_BPR1, "RESIDUI_PRESUNTI", "RESIDUPRESUN", 3, 14, 2, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, MyGlb.PANEL_LIST, 744, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, MyGlb.PANEL_LIST, 44);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, MyGlb.PANEL_LIST, "Nuovo");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, MyGlb.PANEL_FORM, 4, 412, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, MyGlb.PANEL_FORM, 44);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_NUOVO, MyGlb.PANEL_FORM, "Nuovo");
    PAN_BPR.SetFieldPage(PFL_BPR_NUOVO, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_NUOVO, PPQRY_BPR1, "NUOVO", "NUOVO", 3, 14, 0, -13997);
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, MyGlb.PANEL_LIST, 68);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, MyGlb.PANEL_LIST, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, MyGlb.PANEL_LIST, "Faseesefin");
    PAN_BPR.SetRect(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, MyGlb.PANEL_FORM, 4, 388, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BPR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, MyGlb.PANEL_FORM, 68);
    PAN_BPR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, MyGlb.PANEL_FORM, 1);
    PAN_BPR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BPR_FASEESEFIN, MyGlb.PANEL_FORM, "Faseesefin");
    PAN_BPR.SetFieldPage(PFL_BPR_FASEESEFIN, -1, -1);
    PAN_BPR.SetFieldPanel(PFL_BPR_FASEESEFIN, PPQRY_BPR1, "FASEESEFIN", "FASEESEFIN", 1, 1, 0, -13997);
  }

  private void PAN_BPR_InitQueries()
  {
    StringBuffer SQL;

    PAN_BPR.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI, ");
    SQL.append("  A.ESERCIZIO as ESEFINESERC1 ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (A.ESERCIZIO > ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_BPR.SetQuery(PPQRY_ESEFIN, 0, SQL, PFL_BPR_ESERCIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI, ");
    SQL.append("  A.ESERCIZIO as ESEFINESERC1 ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.ESERCIZIO > ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_BPR.SetQuery(PPQRY_ESEFIN, 1, SQL, PFL_BPR_ESERCIZIO, "");
    PAN_BPR.SetQueryDB(PPQRY_ESEFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BPR.SetIMDB(IMDB, "PQRY_BPR1", true);
    PAN_BPR.set_SetString(MyGlb.MASTER_ROWNAME, "BIL");
    PAN_BPR.SetDocumentClass(0, "BPR");
    PAN_BPR.AddDOSortCriteria(BPR.BPR_ESERCIZIO);
    PAN_BPR.SetDOWhereClause("(ESERCIZIO > ~~TBL_DATISESSIONE.SESSIOESERCI~~) and (E_S = ~~TBL_IMDBSTANZ.NOMEOGGETTES~~) and (CAPITOLO = ~~TBL_IMDBSTANZ.NOMEOGGECAPI~~) and (ARTICOLO = ~~TBL_IMDBSTANZ.NOMEOGGEARTI~~)");
    PAN_BPR.AddToSortList(PFL_BPR_ESERCIZIO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BPR.Status() == 2)
    {
      int oldListQBE = PAN_BPR.iUseListQBE;
      PAN_BPR.iUseListQBE = 0;
      PAN_BPR.PanelCommand(Glb.PCM_SEARCH);
      PAN_BPR.PanelCommand(Glb.PCM_FIND);
      PAN_BPR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BPR) PAN_BPR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BPR) PAN_BPR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BPR) PAN_BPR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BPR) PAN_BPR_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BPR) PAN_BPR_OnChangeRow();
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
    if (SrcObj == PAN_BPR) PAN_BPR_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_BPR) PAN_BPR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
