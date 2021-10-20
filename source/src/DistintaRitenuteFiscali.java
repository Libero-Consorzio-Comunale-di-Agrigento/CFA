// **********************************************
// Distinta Ritenute Fiscali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DistintaRitenuteFiscali extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PERIODO = 0;

  private static int PFL_PARAMETRI_DA = 0;
  private static int PFL_PARAMETRI_A = 1;
  private static int PFL_PARAMETRI_DATAELABORAZ = 2;
  private static int PFL_PARAMETRI_ELABORA = 3;

  private static int PPQRY_PARAMETRI158 = 0;


  IDPanel PAN_PARAMETRI;
  CIDREObj BUK_DISRITFISLIB;
  OBook BKW_DISRITFISLIB;
  //
  // Template Pages constants
  private static int BUK_DISRITFISLIB_MST_NUOVPAGIMAST = 1;
  private static int BUK_DISRITFISLIB_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_DISRITFISLIB_SPAN_DISTRITEFISC = 3;
  private static int BUK_DISRITFISLIB_RPTBOX_SOTTTESTPAGI = 4;
  private static int BUK_DISRITFISLIB_SPAN_IEPDDRFPPADR = 5;
  private static int BUK_DISRITFISLIB_RPTBOX_CORPOPAGINA = 6;
  private static int BUK_DISRITFISLIB_RPTBOX_DATAELABORAZ = 7;
  private static int BUK_DISRITFISLIB_SPAN_DATAELABORAZ = 8;
  private static int BUK_DISRITFISLIB_RPTBOX_NUMEROPAGINA = 9;
  private static int BUK_DISRITFISLIB_SPAN_CPTSDRFLDRFP = 10;

  //
  // Reports constants
  private static int BUK_DISRITFISLIB_RPT_DISRITFISREP = 11;
  private static int BUK_DISRITFISLIB_SEC_INTESTREPORT = 12;
  private static int BUK_DISRITFISLIB_SEC_INTESTPAGINA = 13;
  private static int BUK_DISRITFISLIB_RPTBOX_CODICEHEADER = 14;
  private static int BUK_DISRITFISLIB_SPAN_CODICE = 15;
  private static int BUK_DISRITFISLIB_RPTBOX_RITENUHEADER = 16;
  private static int BUK_DISRITFISLIB_SPAN_IMPORDAVERSA = 17;
  private static int BUK_DISRITFISLIB_SEC_DETTAGLIO = 18;
  private static int BUK_DISRITFISLIB_RPTBOX_CODICE = 19;
  private static int BUK_DISRITFISLIB_SPAN_LIQCODICE = 20;
  private static int BUK_DISRITFISLIB_RPTBOX_RITENUTE = 21;
  private static int BUK_DISRITFISLIB_SPAN_RITENUTE = 22;
  private static int BUK_DISRITFISLIB_SEC_PIEDEPAGINA = 23;
  private static int BUK_DISRITFISLIB_SEC_PIEDEREPORT = 24;
  private static int BUK_DISRITFISLIB_RPTBOX_SUMOFRITENUT = 25;
  private static int BUK_DISRITFISLIB_SPAN_PRSRRDRFDRFL = 26;
  private static int BUK_DISRITFISLIB_RPTBOX_TOTALE = 27;
  private static int BUK_DISRITFISLIB_SPAN_TOTALE = 28;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI159(IMDB);
    //
    //
    Init_PQRY_PARAMETRI158(IMDB);
    Init_PQRY_PARAMETRI158_RS(IMDB);
    Init_PQRY_LIQ13(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI159(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI159, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI159, "TBL_PARAMETRI159");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI159,IMDBDef5.FLD_PARAMETRI159_PARAMDA, "PARAMDA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI159,IMDBDef5.FLD_PARAMETRI159_PARAMDA,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI159,IMDBDef5.FLD_PARAMETRI159_PARAMA, "PARAMA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI159,IMDBDef5.FLD_PARAMETRI159_PARAMA,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI159,IMDBDef5.FLD_PARAMETRI159_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI159,IMDBDef5.FLD_PARAMETRI159_PARADATAELAB,6,19,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI159, 0);
  }

  private static void Init_PQRY_PARAMETRI158(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI158, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI158, "PQRY_PARAMETRI158");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI158,IMDBDef15.PQSL_PARAMETRI158_PARAMDA, "PARAMDA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI158,IMDBDef15.PQSL_PARAMETRI158_PARAMDA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI158,IMDBDef15.PQSL_PARAMETRI158_PARAMA, "PARAMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI158,IMDBDef15.PQSL_PARAMETRI158_PARAMA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI158,IMDBDef15.PQSL_PARAMETRI158_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI158,IMDBDef15.PQSL_PARAMETRI158_PARADATAELAB,6,19,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI158, 0);
  }

  private static void Init_PQRY_PARAMETRI158_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI158_RS, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI158_RS, "PQRY_PARAMETRI158_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI158_RS,IMDBDef15.PQSL_PARAMETRI158_PARAMDA, "PARAMDA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI158_RS,IMDBDef15.PQSL_PARAMETRI158_PARAMDA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI158_RS,IMDBDef15.PQSL_PARAMETRI158_PARAMA, "PARAMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI158_RS,IMDBDef15.PQSL_PARAMETRI158_PARAMA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI158_RS,IMDBDef15.PQSL_PARAMETRI158_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI158_RS,IMDBDef15.PQSL_PARAMETRI158_PARADATAELAB,6,19,0);
  }

  private static void Init_PQRY_LIQ13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_LIQ13, 2);
    IMDB.set_TblCode(IMDBDef15.PQRY_LIQ13, "PQRY_LIQ13");
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ13,IMDBDef15.PQSL_LIQ13_RECORLIQCODI, "RECORLIQCODI");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ13,IMDBDef15.PQSL_LIQ13_RECORLIQCODI,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ13,IMDBDef15.PQSL_LIQ13_RITENUTE, "RITENUTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ13,IMDBDef15.PQSL_LIQ13_RITENUTE,3,28,6);
    IMDB.TblAddNew(IMDBDef15.PQRY_LIQ13, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DistintaRitenuteFiscali(MyWebEntryPoint w, IMDBObj imdb)
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
  public DistintaRitenuteFiscali()
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
    FormIdx = MyGlb.FRM_DISTRITEFISC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4A310E56-B141-41DF-9E37-EE74314B4C91";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 308;
    DesignHeight = 210;
    set_Caption(new IDVariant("Distinta Ritenute Fiscali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 308;
    Frames[1].Height = 184;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 184;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 308-MyGlb.PAN_OFFS_X, 184-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F7C1B788-BAEC-4A80-9D1B-B7A9FDC933F1");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 304, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    BKW_DISRITFISLIB = new OBook(this);
    BUK_DISRITFISLIB = new CIDREObj(BKW_DISRITFISLIB);
    BKW_DISRITFISLIB.iGuid = "557CEAE0-0A17-4C36-A888-FCE76D951829";
    BKW_DISRITFISLIB.Code = "BUK_DISRITFISLIB";
    BKW_DISRITFISLIB.BookObj = BUK_DISRITFISLIB;
    BKW_DISRITFISLIB.InitDefMasks();
    BUK_DISRITFISLIB.InitBook(1, 1245441, "Distinta Ritenute Fiscali Libro", IMDB, MainFrm.VisualStyleList);
    BUK_DISRITFISLIB.InitHTML();
    BUK_DISRITFISLIB.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_DISRITFISLIB.Book.SetMainFrm(MainFrm);
    BUK_DISRITFISLIB.SetRTCGuid(0, "557CEAE0-0A17-4C36-A888-FCE76D951829");
    BUK_DISRITFISLIB.SetObjCode(0, "DISRITFISLIB");
    BUK_DISRITFISLIB_MST_NUOVPAGIMAST_Init();
    BUK_DISRITFISLIB_RPT_DISRITFISREP_Init();
    BUK_DISRITFISLIB_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI159, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DISTRITEFISC_PARAMETRI158();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_DISRITFISLIB.UpdateBook();
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
    if (Code.equals("BUK_DISRITFISLIB")) return BUK_DISRITFISLIB;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof DistintaRitenuteFiscali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DistintaRitenuteFiscali.class.getName() : (Glb.ClassWithPackage(DistintaRitenuteFiscali.class) ? DistintaRitenuteFiscali.class.getName().substring(DistintaRitenuteFiscali.class.getPackage().getName().length() + 1) : DistintaRitenuteFiscali.class.getName()));
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Distinta Ritenute Fiscali", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARADELEROWS();
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI159, IMDBDef5.FLD_PARAMETRI159_PARAMDA, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI159, IMDBDef5.FLD_PARAMETRI159_PARAMA, 0, (new IDVariant(12)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI159, IMDBDef5.FLD_PARAMETRI159_PARADATAELAB, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaRitenuteFiscali", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI159, IMDBDef5.FLD_PARAMETRI159_PARAMDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI159, IMDBDef5.FLD_PARAMETRI159_PARAMA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI159, IMDBDef5.FLD_PARAMETRI159_PARADATAELAB, 0, new IDVariant());
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DATADA = new IDVariant(0,IDVariant.DATETIME);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      BUK_DISRITFISLIB.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_DISRITFISLIB.RefreshQuery();
      BUK_DISRITFISLIB.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_DISRITFISLIB.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaRitenuteFiscali", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void DISTRITEFISC_PARAMETRI158() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI158_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI159, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI159, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI158_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI158_RS, 0, IMDBDef5.TBL_PARAMETRI159, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI158_RS, 0, 0, IMDBDef5.TBL_PARAMETRI159, IMDBDef5.FLD_PARAMETRI159_PARAMDA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI158_RS, 1, 0, IMDBDef5.TBL_PARAMETRI159, IMDBDef5.FLD_PARAMETRI159_PARAMA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI158_RS, 2, 0, IMDBDef5.TBL_PARAMETRI159, IMDBDef5.FLD_PARAMETRI159_PARADATAELAB, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI159, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI159, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI159, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI158_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_DISRITFISLIB_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_DISRITFISLIB_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_DISRITFISLIB_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_DISRITFISLIB_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_DISRITFISLIB_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_DISRITFISLIB_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_DISRITFISLIB_SEC_PIEDEREPORT)
    {
      BUK_DISRITFISLIB.set_SpanValue(BUK_DISRITFISLIB_SPAN_PRSRRDRFDRFL, new IDVariant(BUK_DISRITFISLIB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_DISRITFISLIB_SEC_PIEDEREPORT,"RITENUTE")));
    }
  }

  private void BUK_DISRITFISLIB_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_DISRITFISLIB_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_DISRITFISLIB_MST_NUOVPAGIMAST)
    {
      BUK_DISRITFISLIB.set_SpanValue(BUK_DISRITFISLIB_SPAN_DISTRITEFISC, new IDVariant(IDL.Upper(IDL.Add((new IDVariant(BUK_DISRITFISLIB.BoxToolTip(BUK_DISRITFISLIB_RPTBOX_TESTATPAGINA))), MainFrm.ESERCIZIO))));
      BUK_DISRITFISLIB.set_SpanValue(BUK_DISRITFISLIB_SPAN_IEPDDRFPPADR, new IDVariant(((IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals(IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0)))?IDL.Add(IDL.Add((new IDVariant("Mese di")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())):IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Da")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMDA, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARAMA, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())))));
      BUK_DISRITFISLIB.set_SpanValue(BUK_DISRITFISLIB_SPAN_DATAELABORAZ, new IDVariant(IDL.Add(IDL.Add((new IDVariant("del")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI158, IMDBDef15.PQSL_PARAMETRI158_PARADATAELAB, 0)))));
      BUK_DISRITFISLIB.set_SpanValue(BUK_DISRITFISLIB_SPAN_CPTSDRFLDRFP, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_DISRITFISLIB.GetPageNumber())))), (new IDVariant(" di "))), IDL.ToString((new IDVariant(BUK_DISRITFISLIB.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_DISRITFISLIB_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_DISRITFISLIB_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_DISRITFISLIB_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_DISRITFISLIB_OnPreview()
  {
    PreviewBook = BKW_DISRITFISLIB;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "09C2959E-F533-4487-A21B-45495F498F59");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "Periodo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 0, -9999, 80, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 24, 15, 244, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 43);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "D379CB95-49DA-46FE-8A4E-D019838CA129");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "da");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "CE8834CC-0C8A-49EE-BB3D-51AC5FE4561A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "a");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "7A7EC667-6D16-441B-857C-664432C58A9E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "5E335A05-2BA1-4E54-9001-3FA7EE0D79EB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, "da");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 28, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, "da");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DA, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DA, PPQRY_PARAMETRI158, "A.PARAMDA", "PARAMDA", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, "a");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 160, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, "a");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_A, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_A, PPQRY_PARAMETRI158, "A.PARAMA", "PARAMA", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 20, 84, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMETRI158, "A.PARADATAELAB", "PARADATAELAB", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 196, 184, 56, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 188, 124, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI158", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI158, IMDBDef15.PQRY_PARAMETRI158_RS, IMDBDef5.TBL_PARAMETRI159);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DA, IMDBDef5.FLD_PARAMETRI159_PARAMDA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_A, IMDBDef5.FLD_PARAMETRI159_PARAMA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef5.FLD_PARAMETRI159_PARADATAELAB);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI159");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_DISRITFISLIB_MST_NUOVPAGIMAST_Init()
  {
    BUK_DISRITFISLIB.InitMastro(BUK_DISRITFISLIB_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 1, 1);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_MST_NUOVPAGIMAST, "1B32F572-CDF9-4BAB-8511-A2F59AC0F107");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_DISRITFISLIB.InitMastroBox(BUK_DISRITFISLIB_MST_NUOVPAGIMAST, BUK_DISRITFISLIB_RPTBOX_TESTATPAGINA, 1000, 900, 19000, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Distinta Ritenute Fiscali", 1, -33);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_RPTBOX_TESTATPAGINA, "4D29DAE7-F20F-45A8-BD18-A8BF5310C8CB");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_DISRITFISLIB.InitBoxSpan(BUK_DISRITFISLIB_RPTBOX_TESTATPAGINA, BUK_DISRITFISLIB_SPAN_DISTRITEFISC, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271319425, "Distinta Ritenute Fiscali", "", 1);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SPAN_DISTRITEFISC, "FEB2B23D-4FD1-46C1-A115-1C0D90D80921");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SPAN_DISTRITEFISC, "DISTRITEFISC");
    BUK_DISRITFISLIB.InitMastroBox(BUK_DISRITFISLIB_MST_NUOVPAGIMAST, BUK_DISRITFISLIB_RPTBOX_SOTTTESTPAGI, 1000, 1900, 19000, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_RPTBOX_SOTTTESTPAGI, "853BE1C3-D978-4CCF-AE1F-7298D6417552");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_RPTBOX_SOTTTESTPAGI, "SOTTTESTPAGI");
    BUK_DISRITFISLIB.InitBoxSpan(BUK_DISRITFISLIB_RPTBOX_SOTTTESTPAGI, BUK_DISRITFISLIB_SPAN_IEPDDRFPPADR, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SPAN_IEPDDRFPPADR, "933A4E86-95A3-48B0-98BF-2C39149B4056");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SPAN_IEPDDRFPPADR, "IEPDDRFPPADR");
    BUK_DISRITFISLIB.InitMastroBox(BUK_DISRITFISLIB_MST_NUOVPAGIMAST, BUK_DISRITFISLIB_RPTBOX_CORPOPAGINA, 1000, 3000, 19000, 25400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_RPTBOX_CORPOPAGINA, "3E708E66-DB23-48C4-8FBF-0FA24D723A52");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_DISRITFISLIB.InitMastroBox(BUK_DISRITFISLIB_MST_NUOVPAGIMAST, BUK_DISRITFISLIB_RPTBOX_DATAELABORAZ, 13400, 200, 3800, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_RPTBOX_DATAELABORAZ, "1BF2382B-E146-426D-960C-8A8A545A7080");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_RPTBOX_DATAELABORAZ, "DATAELABORAZ");
    BUK_DISRITFISLIB.InitBoxSpan(BUK_DISRITFISLIB_RPTBOX_DATAELABORAZ, BUK_DISRITFISLIB_SPAN_DATAELABORAZ, MyGlb.VIS_NORMAA8RIGHT, 5, 103, 0, 271319169, "", "", 1);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SPAN_DATAELABORAZ, "5CEF2BAA-6552-4BC0-A327-867287B5BF7A");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SPAN_DATAELABORAZ, "DATAELABORAZ");
    BUK_DISRITFISLIB.InitMastroBox(BUK_DISRITFISLIB_MST_NUOVPAGIMAST, BUK_DISRITFISLIB_RPTBOX_NUMEROPAGINA, 17300, 200, 2700, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_RPTBOX_NUMEROPAGINA, "77CBA66D-4524-420A-A01F-F040B62B8AA3");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_DISRITFISLIB.InitBoxSpan(BUK_DISRITFISLIB_RPTBOX_NUMEROPAGINA, BUK_DISRITFISLIB_SPAN_CPTSDRFLDRFP, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271384705, "", "", 1);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SPAN_CPTSDRFLDRFP, "659B058D-9D0E-4C96-9ED3-A9CE22929CF3");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SPAN_CPTSDRFLDRFP, "CPTSDRFLDRFP");
  }

  private void BUK_DISRITFISLIB_RPT_DISRITFISREP_InitQuery() { BUK_DISRITFISLIB_RPT_DISRITFISREP_InitQuery(true, true); }
  private void BUK_DISRITFISLIB_RPT_DISRITFISREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as RECORLIQCODI, ");
      SQL.append("  SUM(A.RITENUTE_IRPEF) as RITENUTE ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  MAN B ");
      SQL.append("where (A.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (A.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append("and   ((B.D_DATA_MAND BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI158.PARAMDA~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI158.PARAMA~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((A.CODICE IS NULL))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'M') ");
      SQL.append("and   (B.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(C.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN C ");
      SQL.append("where (C.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (C.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("group by ");
      SQL.append("  A.CODICE ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  D.CODICE, ");
      SQL.append("  ROUND(SUM(D.RITENUTE_IRPEF), 0) ");
      SQL.append("from ");
      SQL.append("  LIQ D, ");
      SQL.append("  PAGAMENTI E ");
      SQL.append("where (D.ANNO_LIQ = E.ANNO_LIQ) ");
      SQL.append("and   (D.NUMERO_LIQ = E.NUMERO_LIQ) ");
      SQL.append("and   (D.ANNO_MAND = E.ANNO_MAND) ");
      SQL.append("and   (D.NUMERO_MAND = E.NUMERO_MAND) ");
      SQL.append("and   (D.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((D.CODICE IS NULL))) ");
      SQL.append("and   ((E.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(E.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((12)||'/'||(31)||'/'||(E.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'P') ");
      SQL.append("and   ((E.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI158.PARAMDA~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI158.PARAMA~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   (E.D_DATA_PAGAM = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(F.D_DATA_PAGAM) ");
      SQL.append("from ");
      SQL.append("  PAGAMENTI F ");
      SQL.append("where ((F.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(E.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(E.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (F.ANNO_LIQ = E.ANNO_LIQ) ");
      SQL.append("and   (F.NUMERO_LIQ = E.NUMERO_LIQ) ");
      SQL.append("and   (F.ANNO_MAND = E.ANNO_MAND) ");
      SQL.append("and   (F.NUMERO_MAND = E.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("group by ");
      SQL.append("  D.CODICE ");
      SQL.append("order by 1 ");
      BUK_DISRITFISLIB.SetReportQuery(BUK_DISRITFISLIB_RPT_DISRITFISREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "8284557C-7882-4401-8FB0-4D2F64218DC3");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_DISRITFISLIB_RPT_DISRITFISREP_Init()
  {
    BUK_DISRITFISLIB.InitReport(BUK_DISRITFISLIB_RPT_DISRITFISREP, 196865);
    BUK_DISRITFISLIB_RPT_DISRITFISREP_InitQuery(true, false);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_RPT_DISRITFISREP, "F4C6E6CF-E3B2-40D4-A1C9-8C8760AB7A3E");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_RPT_DISRITFISREP, "DISRITFISREP");
    BUK_DISRITFISLIB.InitSection(BUK_DISRITFISLIB_RPT_DISRITFISREP, BUK_DISRITFISLIB_SEC_INTESTREPORT, 300, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_DISRITFISLIB.SetSectionRendersInto(BUK_DISRITFISLIB_SEC_INTESTREPORT, BUK_DISRITFISLIB_RPTBOX_CORPOPAGINA);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SEC_INTESTREPORT, "930775B4-9D90-436C-9239-7F57293B9BEE");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_DISRITFISLIB.InitSection(BUK_DISRITFISLIB_RPT_DISRITFISREP, BUK_DISRITFISLIB_SEC_INTESTPAGINA, 1000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DISRITFISLIB.SetSectionRendersInto(BUK_DISRITFISLIB_SEC_INTESTPAGINA, BUK_DISRITFISLIB_RPTBOX_CORPOPAGINA);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SEC_INTESTPAGINA, "3C606220-69B9-469C-AF4D-8BE5F1FBBE1B");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_DISRITFISLIB.InitReportBox(BUK_DISRITFISLIB_SEC_INTESTPAGINA, BUK_DISRITFISLIB_RPTBOX_CODICEHEADER, 0, 0, 1500, 700, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_RPTBOX_CODICEHEADER, "B8216E89-79C3-4FFF-94B8-99EC8554B19F");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_DISRITFISLIB.InitBoxSpan(BUK_DISRITFISLIB_RPTBOX_CODICEHEADER, BUK_DISRITFISLIB_SPAN_CODICE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SPAN_CODICE, "4E8542BC-5669-47A5-8968-4A11C455791D");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SPAN_CODICE, "CODICE");
    BUK_DISRITFISLIB.InitReportBox(BUK_DISRITFISLIB_SEC_INTESTPAGINA, BUK_DISRITFISLIB_RPTBOX_RITENUHEADER, 1500, 0, 3900, 700, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_RPTBOX_RITENUHEADER, "FB832E1F-5433-41DE-9ED0-36193784B4E7");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_RPTBOX_RITENUHEADER, "RITENUHEADER");
    BUK_DISRITFISLIB.InitBoxSpan(BUK_DISRITFISLIB_RPTBOX_RITENUHEADER, BUK_DISRITFISLIB_SPAN_IMPORDAVERSA, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo da Versare", 1);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SPAN_IMPORDAVERSA, "6D1106BE-72BD-42F2-ADFE-27B969639091");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SPAN_IMPORDAVERSA, "IMPORDAVERSA");
    BUK_DISRITFISLIB.InitSection(BUK_DISRITFISLIB_RPT_DISRITFISREP, BUK_DISRITFISLIB_SEC_DETTAGLIO, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DISRITFISLIB.SetSectionRendersInto(BUK_DISRITFISLIB_SEC_DETTAGLIO, BUK_DISRITFISLIB_RPTBOX_CORPOPAGINA);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SEC_DETTAGLIO, "98AD4888-F8B5-4E0C-85F9-2AFACC4E9F0F");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_DISRITFISLIB.InitReportBox(BUK_DISRITFISLIB_SEC_DETTAGLIO, BUK_DISRITFISLIB_RPTBOX_CODICE, 0, 0, 1500, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_RPTBOX_CODICE, "D6843ACC-7031-4656-9E41-73402BD383CD");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_RPTBOX_CODICE, "CODICE");
    BUK_DISRITFISLIB.InitBoxSpan(BUK_DISRITFISLIB_RPTBOX_CODICE, BUK_DISRITFISLIB_SPAN_LIQCODICE, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "Brief description of field content.", "::RECORLIQCODI", 1);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SPAN_LIQCODICE, "43255541-B733-4787-9E81-234444585A93");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SPAN_LIQCODICE, "LIQCODICE");
    BUK_DISRITFISLIB.InitReportBox(BUK_DISRITFISLIB_SEC_DETTAGLIO, BUK_DISRITFISLIB_RPTBOX_RITENUTE, 1500, 0, 3900, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_RPTBOX_RITENUTE, "7B7E48C9-67ED-41A1-8669-8B40F34153D3");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_RPTBOX_RITENUTE, "RITENUTE");
    BUK_DISRITFISLIB.InitBoxSpan(BUK_DISRITFISLIB_RPTBOX_RITENUTE, BUK_DISRITFISLIB_SPAN_RITENUTE, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "Round (Sum (LIQ RITENUTE IRPEF), Zero)", "::RITENUTE", 1);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SPAN_RITENUTE, "D31CF652-6902-4244-80CB-AE068C30E19B");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SPAN_RITENUTE, "RITENUTE");
    BUK_DISRITFISLIB.InitSection(BUK_DISRITFISLIB_RPT_DISRITFISREP, BUK_DISRITFISLIB_SEC_PIEDEPAGINA, 100, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_DISRITFISLIB.SetSectionRendersInto(BUK_DISRITFISLIB_SEC_PIEDEPAGINA, BUK_DISRITFISLIB_RPTBOX_CORPOPAGINA);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SEC_PIEDEPAGINA, "1CC3E281-2E7C-47B5-B7FF-4E86B27A11F9");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_DISRITFISLIB.InitSection(BUK_DISRITFISLIB_RPT_DISRITFISREP, BUK_DISRITFISLIB_SEC_PIEDEREPORT, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DISRITFISLIB.SetSectionRendersInto(BUK_DISRITFISLIB_SEC_PIEDEREPORT, BUK_DISRITFISLIB_RPTBOX_CORPOPAGINA);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SEC_PIEDEREPORT, "F0BC14E6-5341-4831-ABBB-450957C2EB3C");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_DISRITFISLIB.InitReportBox(BUK_DISRITFISLIB_SEC_PIEDEREPORT, BUK_DISRITFISLIB_RPTBOX_SUMOFRITENUT, 1500, 400, 3900, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_RPTBOX_SUMOFRITENUT, "D678A0C8-C3E7-4685-A7AA-1518935D0A19");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_RPTBOX_SUMOFRITENUT, "SUMOFRITENUT");
    BUK_DISRITFISLIB.InitBoxSpan(BUK_DISRITFISLIB_RPTBOX_SUMOFRITENUT, BUK_DISRITFISLIB_SPAN_PRSRRDRFDRFL, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SPAN_PRSRRDRFDRFL, "E9D4D509-ADC8-4D09-B1A4-FF2BA3B0484C");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SPAN_PRSRRDRFDRFL, "PRSRRDRFDRFL");
    BUK_DISRITFISLIB.InitReportBox(BUK_DISRITFISLIB_SEC_PIEDEREPORT, BUK_DISRITFISLIB_RPTBOX_TOTALE, 0, 400, 1400, 600, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_RPTBOX_TOTALE, "6DCB721F-A6E1-43E6-BF45-7F31B72F3B27");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_RPTBOX_TOTALE, "TOTALE");
    BUK_DISRITFISLIB.InitBoxSpan(BUK_DISRITFISLIB_RPTBOX_TOTALE, BUK_DISRITFISLIB_SPAN_TOTALE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_DISRITFISLIB.SetRTCGuid(BUK_DISRITFISLIB_SPAN_TOTALE, "3C9BFA28-F537-43BE-8EB0-8D8F183E110A");
    BUK_DISRITFISLIB.SetObjCode(BUK_DISRITFISLIB_SPAN_TOTALE, "TOTALE");
    BUK_DISRITFISLIB_RPT_DISRITFISREP_InitQuery(false, true);
  }

  private void BUK_DISRITFISLIB_InitLinks()
  {
    BUK_DISRITFISLIB.SetBoxNextBox(BUK_DISRITFISLIB_RPTBOX_CORPOPAGINA, BUK_DISRITFISLIB_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_DISRITFISLIB) BUK_DISRITFISLIB_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_DISRITFISLIB) BUK_DISRITFISLIB_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_DISRITFISLIB) BUK_DISRITFISLIB_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_DISRITFISLIB) BUK_DISRITFISLIB_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_DISRITFISLIB) BUK_DISRITFISLIB_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_DISRITFISLIB) BUK_DISRITFISLIB_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_DISRITFISLIB) BUK_DISRITFISLIB_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_DISRITFISLIB) BUK_DISRITFISLIB_OnPreview();
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
