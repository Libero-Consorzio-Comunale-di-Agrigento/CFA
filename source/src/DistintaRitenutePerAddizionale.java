// **********************************************
// Distinta Ritenute Per Addizionale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DistintaRitenutePerAddizionale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PERIODO = 0;
  private static int GRP_PARAMETRI_ADDIZIONALE = 1;

  private static int PFL_PARAMETRI_DA = 0;
  private static int PFL_PARAMETRI_A = 1;
  private static int PFL_PARAMETRI_ADDIZIONALE = 2;
  private static int PFL_PARAMETRI_NEWPANELABE1 = 3;
  private static int PFL_PARAMETRI_DATAELABORAZ = 4;
  private static int PFL_PARAMETRI_ELABORA = 5;

  private static int PPQRY_PARAMETRI156 = 0;


  IDPanel PAN_PARAMETRI;
  CIDREObj BUK_DISRITPEADLI;
  OBook BKW_DISRITPEADLI;
  //
  // Template Pages constants
  private static int BUK_DISRITPEADLI_MST_DISRITPEADMA = 1;
  private static int BUK_DISRITPEADLI_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_DISRITPEADLI_SPAN_UTPTTIEPADRP = 3;
  private static int BUK_DISRITPEADLI_RPTBOX_SOTTTESTPAGI = 4;
  private static int BUK_DISRITPEADLI_SPAN_IEPDDRPAPPAD = 5;
  private static int BUK_DISRITPEADLI_RPTBOX_CORPOPAGINA = 6;
  private static int BUK_DISRITPEADLI_RPTBOX_NUMEROPAGINA = 7;
  private static int BUK_DISRITPEADLI_SPAN_CPTSDRPALDRP = 8;

  //
  // Reports constants
  private static int BUK_DISRITPEADLI_RPT_DISRITPEADRE = 9;
  private static int BUK_DISRITPEADLI_SEC_INTESTREPORT = 10;
  private static int BUK_DISRITPEADLI_SEC_INTESTPAGINA = 11;
  private static int BUK_DISRITPEADLI_RPTBOX_DENREGCOMHEA = 12;
  private static int BUK_DISRITPEADLI_SPAN_DENOREGICOM1 = 13;
  private static int BUK_DISRITPEADLI_RPTBOX_CODIINPSHEAD = 14;
  private static int BUK_DISRITPEADLI_SPAN_CODICE = 15;
  private static int BUK_DISRITPEADLI_RPTBOX_IMPODAVERHEA = 16;
  private static int BUK_DISRITPEADLI_SPAN_IMPORDAVERSA = 17;
  private static int BUK_DISRITPEADLI_SEC_DETTAGLIO = 18;
  private static int BUK_DISRITPEADLI_RPTBOX_DENOREGICOMU = 19;
  private static int BUK_DISRITPEADLI_SPAN_DENOREGICOMU = 20;
  private static int BUK_DISRITPEADLI_RPTBOX_CODICEINPS = 21;
  private static int BUK_DISRITPEADLI_SPAN_CODICEINPS = 22;
  private static int BUK_DISRITPEADLI_RPTBOX_IMPORTO = 23;
  private static int BUK_DISRITPEADLI_SPAN_RERDRPADRPAL = 24;
  private static int BUK_DISRITPEADLI_SEC_PIEDEPAGINA = 25;
  private static int BUK_DISRITPEADLI_SEC_PIEDEREPORT = 26;
  private static int BUK_DISRITPEADLI_RPTBOX_SUMOFRITENU1 = 27;
  private static int BUK_DISRITPEADLI_SPAN_PRSRRDRPADRP = 28;
  private static int BUK_DISRITPEADLI_RPTBOX_TOTALE = 29;
  private static int BUK_DISRITPEADLI_SPAN_TOTALE = 30;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI161(IMDB);
    //
    //
    Init_PQRY_PARAMETRI156(IMDB);
    Init_PQRY_PARAMETRI156_RS(IMDB);
    Init_PQRY_REGIONIEMIS1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI161(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI161, 4);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI161, "TBL_PARAMETRI161");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI161,IMDBDef5.FLD_PARAMETRI161_PARAMDA, "PARAMDA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI161,IMDBDef5.FLD_PARAMETRI161_PARAMDA,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI161,IMDBDef5.FLD_PARAMETRI161_PARAMA, "PARAMA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI161,IMDBDef5.FLD_PARAMETRI161_PARAMA,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI161,IMDBDef5.FLD_PARAMETRI161_PARAMADDIZIO, "PARAMADDIZIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI161,IMDBDef5.FLD_PARAMETRI161_PARAMADDIZIO,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI161,IMDBDef5.FLD_PARAMETRI161_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI161,IMDBDef5.FLD_PARAMETRI161_PARADATAELAB,6,19,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI161, 0);
  }

  private static void Init_PQRY_PARAMETRI156(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI156, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI156, "PQRY_PARAMETRI156");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI156,IMDBDef15.PQSL_PARAMETRI156_PARAMDA, "PARAMDA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI156,IMDBDef15.PQSL_PARAMETRI156_PARAMDA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI156,IMDBDef15.PQSL_PARAMETRI156_PARAMA, "PARAMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI156,IMDBDef15.PQSL_PARAMETRI156_PARAMA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI156,IMDBDef15.PQSL_PARAMETRI156_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI156,IMDBDef15.PQSL_PARAMETRI156_PARADATAELAB,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI156,IMDBDef15.PQSL_PARAMETRI156_PARAMADDIZIO, "PARAMADDIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI156,IMDBDef15.PQSL_PARAMETRI156_PARAMADDIZIO,5,1,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI156, 0);
  }

  private static void Init_PQRY_PARAMETRI156_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI156_RS, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI156_RS, "PQRY_PARAMETRI156_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI156_RS,IMDBDef15.PQSL_PARAMETRI156_PARAMDA, "PARAMDA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI156_RS,IMDBDef15.PQSL_PARAMETRI156_PARAMDA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI156_RS,IMDBDef15.PQSL_PARAMETRI156_PARAMA, "PARAMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI156_RS,IMDBDef15.PQSL_PARAMETRI156_PARAMA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI156_RS,IMDBDef15.PQSL_PARAMETRI156_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI156_RS,IMDBDef15.PQSL_PARAMETRI156_PARADATAELAB,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI156_RS,IMDBDef15.PQSL_PARAMETRI156_PARAMADDIZIO, "PARAMADDIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI156_RS,IMDBDef15.PQSL_PARAMETRI156_PARAMADDIZIO,5,1,0);
  }

  private static void Init_PQRY_REGIONIEMIS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_REGIONIEMIS1, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_REGIONIEMIS1, "PQRY_REGIONIEMIS1");
    IMDB.set_FldCode(IMDBDef15.PQRY_REGIONIEMIS1,IMDBDef15.PQSL_REGIONIEMIS1_DENOREGICOMU, "DENOREGICOMU");
    IMDB.SetFldParams(IMDBDef15.PQRY_REGIONIEMIS1,IMDBDef15.PQSL_REGIONIEMIS1_DENOREGICOMU,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_REGIONIEMIS1,IMDBDef15.PQSL_REGIONIEMIS1_CODICEINPS, "CODICEINPS");
    IMDB.SetFldParams(IMDBDef15.PQRY_REGIONIEMIS1,IMDBDef15.PQSL_REGIONIEMIS1_CODICEINPS,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_REGIONIEMIS1,IMDBDef15.PQSL_REGIONIEMIS1_CODICEINPSOR, "CODICEINPSOR");
    IMDB.SetFldParams(IMDBDef15.PQRY_REGIONIEMIS1,IMDBDef15.PQSL_REGIONIEMIS1_CODICEINPSOR,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_REGIONIEMIS1,IMDBDef15.PQSL_REGIONIEMIS1_RITENUTE, "RITENUTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_REGIONIEMIS1,IMDBDef15.PQSL_REGIONIEMIS1_RITENUTE,3,28,6);
    IMDB.TblAddNew(IMDBDef15.PQRY_REGIONIEMIS1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DistintaRitenutePerAddizionale(MyWebEntryPoint w, IMDBObj imdb)
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
  public DistintaRitenutePerAddizionale()
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
    FormIdx = MyGlb.FRM_DISRITPERADD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "67F732D0-EE89-4679-9CB2-075360300DCA";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 316;
    DesignHeight = 250;
    set_Caption(new IDVariant("Distinta Ritenute Per Addizionale"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 316;
    Frames[1].Height = 224;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 224;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 316-MyGlb.PAN_OFFS_X, 224-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "20F54018-91AB-408C-8EE4-2B417F184047");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 368, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    BKW_DISRITPEADLI = new OBook(this);
    BUK_DISRITPEADLI = new CIDREObj(BKW_DISRITPEADLI);
    BKW_DISRITPEADLI.iGuid = "94862BE5-751C-4647-8A7D-30DAC7034FE2";
    BKW_DISRITPEADLI.Code = "BUK_DISRITPEADLI";
    BKW_DISRITPEADLI.BookObj = BUK_DISRITPEADLI;
    BKW_DISRITPEADLI.InitDefMasks();
    BUK_DISRITPEADLI.InitBook(1, 1245441, "Distinta Ritenute Per Addizionale Libro", IMDB, MainFrm.VisualStyleList);
    BUK_DISRITPEADLI.InitHTML();
    BUK_DISRITPEADLI.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_DISRITPEADLI.Book.SetMainFrm(MainFrm);
    BUK_DISRITPEADLI.SetRTCGuid(0, "94862BE5-751C-4647-8A7D-30DAC7034FE2");
    BUK_DISRITPEADLI.SetObjCode(0, "DISRITPEADLI");
    BUK_DISRITPEADLI_MST_DISRITPEADMA_Init();
    BUK_DISRITPEADLI_RPT_DISRITPEADRE_Init();
    BUK_DISRITPEADLI_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI161, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DISRITPERADD_PARAMETRI156();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_DISRITPEADLI.UpdateBook();
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
    if (Code.equals("BUK_DISRITPEADLI")) return BUK_DISRITPEADLI;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof DistintaRitenutePerAddizionale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DistintaRitenutePerAddizionale.class.getName() : (Glb.ClassWithPackage(DistintaRitenutePerAddizionale.class) ? DistintaRitenutePerAddizionale.class.getName().substring(DistintaRitenutePerAddizionale.class.getPackage().getName().length() + 1) : DistintaRitenutePerAddizionale.class.getName()));
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
      v_NOMECAPTION = (new IDVariant("Distinta Ritenute per Addizionale", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARADELEROWS();
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI161, IMDBDef5.FLD_PARAMETRI161_PARAMDA, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI161, IMDBDef5.FLD_PARAMETRI161_PARAMA, 0, (new IDVariant(12)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI161, IMDBDef5.FLD_PARAMETRI161_PARAMADDIZIO, 0, (new IDVariant("R")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI161, IMDBDef5.FLD_PARAMETRI161_PARADATAELAB, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaRitenutePerAddizionale", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI161, IMDBDef5.FLD_PARAMETRI161_PARAMDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI161, IMDBDef5.FLD_PARAMETRI161_PARAMA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI161, IMDBDef5.FLD_PARAMETRI161_PARAMADDIZIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI161, IMDBDef5.FLD_PARAMETRI161_PARADATAELAB, 0, new IDVariant());
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
      BUK_DISRITPEADLI.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_DISRITPEADLI.RefreshQuery();
      BUK_DISRITPEADLI.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_DISRITPEADLI.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaRitenutePerAddizionale", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void DISRITPERADD_PARAMETRI156() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI156_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI161, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI161, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI156_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI156_RS, 0, IMDBDef5.TBL_PARAMETRI161, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI156_RS, 0, 0, IMDBDef5.TBL_PARAMETRI161, IMDBDef5.FLD_PARAMETRI161_PARAMDA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI156_RS, 1, 0, IMDBDef5.TBL_PARAMETRI161, IMDBDef5.FLD_PARAMETRI161_PARAMA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI156_RS, 2, 0, IMDBDef5.TBL_PARAMETRI161, IMDBDef5.FLD_PARAMETRI161_PARADATAELAB, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI156_RS, 3, 0, IMDBDef5.TBL_PARAMETRI161, IMDBDef5.FLD_PARAMETRI161_PARAMADDIZIO, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI161, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI161, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI161, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI156_RS, 0);
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

  private void BUK_DISRITPEADLI_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_DISRITPEADLI_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_DISRITPEADLI_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_DISRITPEADLI_SEC_INTESTPAGINA)
    {
      BUK_DISRITPEADLI.set_SpanValue(BUK_DISRITPEADLI_SPAN_DENOREGICOM1, new IDVariant(((IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMADDIZIO, 0).equals((new IDVariant("R"))))?(new IDVariant("Regione")):(new IDVariant("Comune")))));
    }
    if (SectionID==BUK_DISRITPEADLI_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_DISRITPEADLI_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_DISRITPEADLI_SEC_PIEDEREPORT)
    {
      BUK_DISRITPEADLI.set_SpanValue(BUK_DISRITPEADLI_SPAN_PRSRRDRPADRP, new IDVariant(BUK_DISRITPEADLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_DISRITPEADLI_SEC_PIEDEREPORT,"RITENUTE")));
    }
  }

  private void BUK_DISRITPEADLI_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_DISRITPEADLI_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_DISRITPEADLI_MST_DISRITPEADMA)
    {
      BUK_DISRITPEADLI.set_SpanValue(BUK_DISRITPEADLI_SPAN_UTPTTIEPADRP, new IDVariant(IDL.Upper(IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_DISRITPEADLI.BoxToolTip(BUK_DISRITPEADLI_RPTBOX_TESTATPAGINA))), ((IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMADDIZIO, 0).equals((new IDVariant("R"))))?(new IDVariant("Regionale")):(new IDVariant("Comunale")))), (new IDVariant(" "))), MainFrm.ESERCIZIO))));
      BUK_DISRITPEADLI.set_SpanValue(BUK_DISRITPEADLI_SPAN_IEPDDRPAPPAD, new IDVariant(((IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals(IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0)))?IDL.Add(IDL.Add((new IDVariant("Mese di")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())):IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Da")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMDA, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI156, IMDBDef15.PQSL_PARAMETRI156_PARAMA, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())))));
      BUK_DISRITPEADLI.set_SpanValue(BUK_DISRITPEADLI_SPAN_CPTSDRPALDRP, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_DISRITPEADLI.GetPageNumber())))), (new IDVariant(" di "))), IDL.ToString((new IDVariant(BUK_DISRITPEADLI.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_DISRITPEADLI_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_DISRITPEADLI_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_DISRITPEADLI_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_DISRITPEADLI_OnPreview()
  {
    PreviewBook = BKW_DISRITPEADLI;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "7F72BC2B-6365-4E8A-987D-E22D90CDCBB9");
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
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, "EDB8DFAC-C613-42D3-A207-948EE10C3439");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, "Addizionale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, MyGlb.PANEL_LIST, 0, -9999, 64, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, MyGlb.PANEL_FORM, 24, 67, 244, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, 0, 65);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "C1769A87-9AD1-4050-9A44-360C49C2367B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "Da");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "9A9479B4-4F13-4954-9055-CA45B1F851B1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "A");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, "FAFA3E90-BEB0-4FCC-8F20-24E538274961");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, "Addizionale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "6E471D0C-B200-4533-BCF4-119EA55CE819");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "0AE5522B-D2DF-406D-93F1-C813C89663B2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "AC0B5844-AB25-48ED-A758-F237BF4CF21B");
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
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, "Da");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 28, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, "Da");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DA, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DA, PPQRY_PARAMETRI156, "A.PARAMDA", "PARAMDA", 1, 2, 0, -13997);
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
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, "A");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 160, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, "A");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_A, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_A, PPQRY_PARAMETRI156, "A.PARAMA", "PARAMA", 1, 2, 0, -13997);
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
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, MyGlb.PANEL_LIST, "Addiz.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, MyGlb.PANEL_FORM, 80, 92, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADDIZIONALE, MyGlb.PANEL_FORM, "Addiz.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ADDIZIONALE, -1, GRP_PARAMETRI_ADDIZIONALE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ADDIZIONALE, PPQRY_PARAMETRI156, "A.PARAMADDIZIO", "PARAMADDIZIO", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ADDIZIONALE, (new IDVariant("R")), "Regionale", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ADDIZIONALE, (new IDVariant("C")), "Comunale", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 228, 84, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 28, 96, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE1, -1, GRP_PARAMETRI_ADDIZIONALE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 20, 132, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMETRI156, "A.PARADATAELAB", "PARADATAELAB", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 196, 184, 56, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 188, 168, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI156", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI156, IMDBDef15.PQRY_PARAMETRI156_RS, IMDBDef5.TBL_PARAMETRI161);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DA, IMDBDef5.FLD_PARAMETRI161_PARAMDA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_A, IMDBDef5.FLD_PARAMETRI161_PARAMA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ADDIZIONALE, IMDBDef5.FLD_PARAMETRI161_PARAMADDIZIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef5.FLD_PARAMETRI161_PARADATAELAB);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI161");
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

  private void BUK_DISRITPEADLI_MST_DISRITPEADMA_Init()
  {
    BUK_DISRITPEADLI.InitMastro(BUK_DISRITPEADLI_MST_DISRITPEADMA, 3, 21000, 29700, 1, 1, 1);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_MST_DISRITPEADMA, "E111BE5C-3CEE-45B9-84F2-65A300D555ED");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_MST_DISRITPEADMA, "DISRITPEADMA");
    BUK_DISRITPEADLI.InitMastroBox(BUK_DISRITPEADLI_MST_DISRITPEADMA, BUK_DISRITPEADLI_RPTBOX_TESTATPAGINA, 1000, 900, 19000, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Distinta Ritenute per Addizionale ", 1, -33);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPTBOX_TESTATPAGINA, "5E518E28-661B-4AF4-8222-45FA1BDFFA3B");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_DISRITPEADLI.InitBoxSpan(BUK_DISRITPEADLI_RPTBOX_TESTATPAGINA, BUK_DISRITPEADLI_SPAN_UTPTTIEPADRP, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SPAN_UTPTTIEPADRP, "F8554923-0275-4228-A7DC-31362D1C304D");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SPAN_UTPTTIEPADRP, "UTPTTIEPADRP");
    BUK_DISRITPEADLI.InitMastroBox(BUK_DISRITPEADLI_MST_DISRITPEADMA, BUK_DISRITPEADLI_RPTBOX_SOTTTESTPAGI, 1000, 2000, 19000, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPTBOX_SOTTTESTPAGI, "4335A6B9-57E9-4257-8755-711EC9D9EDFF");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPTBOX_SOTTTESTPAGI, "SOTTTESTPAGI");
    BUK_DISRITPEADLI.InitBoxSpan(BUK_DISRITPEADLI_RPTBOX_SOTTTESTPAGI, BUK_DISRITPEADLI_SPAN_IEPDDRPAPPAD, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SPAN_IEPDDRPAPPAD, "50CF8233-782C-4931-B88E-8346F2628D25");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SPAN_IEPDDRPAPPAD, "IEPDDRPAPPAD");
    BUK_DISRITPEADLI.InitMastroBox(BUK_DISRITPEADLI_MST_DISRITPEADMA, BUK_DISRITPEADLI_RPTBOX_CORPOPAGINA, 1000, 3000, 19000, 25600, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPTBOX_CORPOPAGINA, "578466DA-C537-4B87-8B5E-0177C50048C3");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_DISRITPEADLI.InitMastroBox(BUK_DISRITPEADLI_MST_DISRITPEADMA, BUK_DISRITPEADLI_RPTBOX_NUMEROPAGINA, 17300, 200, 2700, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPTBOX_NUMEROPAGINA, "14AB4C73-4B0C-481C-A821-8430FF3AFAB1");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_DISRITPEADLI.InitBoxSpan(BUK_DISRITPEADLI_RPTBOX_NUMEROPAGINA, BUK_DISRITPEADLI_SPAN_CPTSDRPALDRP, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271384705, "", "", 1);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SPAN_CPTSDRPALDRP, "B60C5F64-9E2B-41D8-A2C8-EF906E259B6D");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SPAN_CPTSDRPALDRP, "CPTSDRPALDRP");
  }

  private void BUK_DISRITPEADLI_RPT_DISRITPEADRE_InitQuery() { BUK_DISRITPEADLI_RPT_DISRITPEADRE_InitQuery(true, true); }
  private void BUK_DISRITPEADLI_RPT_DISRITPEADRE_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(B.REGIONE, 1, 'Piemonte', 2, 'Valle d''Aosta', 3, 'Liguria', 4, 'Lombardia', 5, 'Trentino Alto Adige', 6, 'Veneto', 7, 'Friuli Venezia Giulia', 8, 'Emilia Romagna', 9, 'Marche', 10, 'Toscana', 11, 'Umbria', 12, 'Lazio', 13, 'Campania', 14, 'Abruzzo', 15, 'Molise', 16, 'Puglia', 17, 'Basilicata', 18, 'Calabria', 19, 'Sicilia', 20, 'Sardegna', 21, 'Bolzano', 22, 'Trento') as DENOREGICOMU, ");
      SQL.append("  DECODE(B.REGIONE, 1, '13', 2, '20', 3, '9', 4, '10', 5, '40', 6, '21', 7, '7', 8, '6', 9, '11', 10, '17', 11, '19', 12, '8', 13, '5', 14, '1', 15, '12', 16, '14', 17, ' 2', 18, '4', 19, '16', 20, '15', 21, '41', 22, '42') as CODICEINPS, ");
      SQL.append("  LPAD(DECODE(B.REGIONE, 1, '13', 2, '20', 3, '9', 4, '10', 5, '40', 6, '21', 7, '7', 8, '6', 9, '11', 10, '17', 11, '19', 12, '8', 13, '5', 14, '1', 15, '12', 16, '14', 17, ' 2', 18, '4', 19, '16', 20, '15', 21, '41', 22, '42'), 4, SUBSTR('0', 1, 1)) as CODICEINPSOR, ");
      SQL.append("  SUM(NVL(C.RITENUTE_ADD, 0)) as RITENUTE ");
      SQL.append("from ");
      SQL.append("  AD4_COMUNI A, ");
      SQL.append("  AD4_PROVINCIE B, ");
      SQL.append("  LIQ C, ");
      SQL.append("  MAN D, ");
      SQL.append("  BEN E ");
      SQL.append("where (C.BENEFICIARIO = E.CODICE(+)) ");
      SQL.append("and   (NVL(E.COMUNE_DOMICILIO, E.COMUNE) = A.COMUNE) ");
      SQL.append("and   (NVL(E.PROVINCIA_DOMICILIO, E.PROVINCIA) = A.PROVINCIA_STATO) ");
      SQL.append("and   (NVL(E.PROVINCIA_DOMICILIO, E.PROVINCIA) = B.PROVINCIA) ");
      SQL.append("and   (C.ANNO_MAND = D.ANNO_MAND) ");
      SQL.append("and   (C.NUMERO_MAND = D.NUMERO_MAND) ");
      SQL.append("and   ((D.D_DATA_MAND BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI156.PARAMDA~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI156.PARAMA~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   (C.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (C.RITENUTE_ADD > 0) ");
      SQL.append("and   (NOT ((B.REGIONE IS NULL))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'M') ");
      SQL.append("and   (D.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(F.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN F ");
      SQL.append("where (F.ANNO_MAND = D.ANNO_MAND) ");
      SQL.append("and   (F.NUMERO_MAND = D.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("and   (~~PQRY_PARAMETRI156.PARAMADDIZIO~~ = 'R') ");
      SQL.append("group by ");
      SQL.append("  DECODE(B.REGIONE, 1, 'Piemonte', 2, 'Valle d''Aosta', 3, 'Liguria', 4, 'Lombardia', 5, 'Trentino Alto Adige', 6, 'Veneto', 7, 'Friuli Venezia Giulia', 8, 'Emilia Romagna', 9, 'Marche', 10, 'Toscana', 11, 'Umbria', 12, 'Lazio', 13, 'Campania', 14, 'Abruzzo', 15, 'Molise', 16, 'Puglia', 17, 'Basilicata', 18, 'Calabria', 19, 'Sicilia', 20, 'Sardegna', 21, 'Bolzano', 22, 'Trento'), ");
      SQL.append("  DECODE(B.REGIONE, 1, '13', 2, '20', 3, '9', 4, '10', 5, '40', 6, '21', 7, '7', 8, '6', 9, '11', 10, '17', 11, '19', 12, '8', 13, '5', 14, '1', 15, '12', 16, '14', 17, ' 2', 18, '4', 19, '16', 20, '15', 21, '41', 22, '42'), ");
      SQL.append("  LPAD(DECODE(B.REGIONE, 1, '13', 2, '20', 3, '9', 4, '10', 5, '40', 6, '21', 7, '7', 8, '6', 9, '11', 10, '17', 11, '19', 12, '8', 13, '5', 14, '1', 15, '12', 16, '14', 17, ' 2', 18, '4', 19, '16', 20, '15', 21, '41', 22, '42'), 4, SUBSTR('0', 1, 1)) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  DECODE(H.REGIONE, 1, 'Piemonte', 2, 'Valle d''Aosta', 3, 'Liguria', 4, 'Lombardia', 5, 'Trentino Alto Adige', 6, 'Veneto', 7, 'Friuli Venezia Giulia', 8, 'Emilia Romagna', 9, 'Marche', 10, 'Toscana', 11, 'Umbria', 12, 'Lazio', 13, 'Campania', 14, 'Abruzzo', 15, 'Molise', 16, 'Puglia', 17, 'Basilicata', 18, 'Calabria', 19, 'Sicilia', 20, 'Sardegna', 21, 'Bolzano', 22, 'Trento'), ");
      SQL.append("  DECODE(H.REGIONE, 1, '13', 2, '20', 3, '9', 4, '10', 5, '40', 6, '21', 7, '7', 8, '6', 9, '11', 10, '17', 11, '19', 12, '8', 13, '5', 14, '1', 15, '12', 16, '14', 17, ' 2', 18, '4', 19, '16', 20, '15', 21, '41', 22, '42'), ");
      SQL.append("  LPAD(DECODE(H.REGIONE, 1, '13', 2, '20', 3, '9', 4, '10', 5, '40', 6, '21', 7, '7', 8, '6', 9, '11', 10, '17', 11, '19', 12, '8', 13, '5', 14, '1', 15, '12', 16, '14', 17, ' 2', 18, '4', 19, '16', 20, '15', 21, '41', 22, '42'), 4, SUBSTR('0', 1, 1)), ");
      SQL.append("  SUM(NVL(I.RITENUTE_ADD, 0)) ");
      SQL.append("from ");
      SQL.append("  AD4_COMUNI G, ");
      SQL.append("  AD4_PROVINCIE H, ");
      SQL.append("  LIQ I, ");
      SQL.append("  BEN J, ");
      SQL.append("  PAGAMENTI K ");
      SQL.append("where (I.BENEFICIARIO = J.CODICE(+)) ");
      SQL.append("and   (NVL(J.COMUNE_DOMICILIO, J.COMUNE) = G.COMUNE) ");
      SQL.append("and   (NVL(J.PROVINCIA_DOMICILIO, J.PROVINCIA) = G.PROVINCIA_STATO) ");
      SQL.append("and   (NVL(J.PROVINCIA_DOMICILIO, J.PROVINCIA) = H.PROVINCIA) ");
      SQL.append("and   (I.ANNO_LIQ = K.ANNO_LIQ) ");
      SQL.append("and   (I.NUMERO_LIQ = K.NUMERO_LIQ) ");
      SQL.append("and   (I.ANNO_MAND = K.ANNO_MAND) ");
      SQL.append("and   (I.NUMERO_MAND = K.NUMERO_MAND) ");
      SQL.append("and   (I.RITENUTE_ADD > 0) ");
      SQL.append("and   (K.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((H.REGIONE IS NULL))) ");
      SQL.append("and   ((K.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(K.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(K.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   ((K.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI156.PARAMDA~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI156.PARAMA~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'P') ");
      SQL.append("and   (K.D_DATA_PAGAM = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(L.D_DATA_PAGAM) ");
      SQL.append("from ");
      SQL.append("  PAGAMENTI L ");
      SQL.append("where ((L.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(K.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(K.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (L.ANNO_LIQ = K.ANNO_LIQ) ");
      SQL.append("and   (L.NUMERO_LIQ = K.NUMERO_LIQ) ");
      SQL.append("and   (L.ANNO_MAND = K.ANNO_MAND) ");
      SQL.append("and   (L.NUMERO_MAND = K.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("and   (~~PQRY_PARAMETRI156.PARAMADDIZIO~~ = 'R') ");
      SQL.append("group by ");
      SQL.append("  DECODE(H.REGIONE, 1, 'Piemonte', 2, 'Valle d''Aosta', 3, 'Liguria', 4, 'Lombardia', 5, 'Trentino Alto Adige', 6, 'Veneto', 7, 'Friuli Venezia Giulia', 8, 'Emilia Romagna', 9, 'Marche', 10, 'Toscana', 11, 'Umbria', 12, 'Lazio', 13, 'Campania', 14, 'Abruzzo', 15, 'Molise', 16, 'Puglia', 17, 'Basilicata', 18, 'Calabria', 19, 'Sicilia', 20, 'Sardegna', 21, 'Bolzano', 22, 'Trento'), ");
      SQL.append("  DECODE(H.REGIONE, 1, '13', 2, '20', 3, '9', 4, '10', 5, '40', 6, '21', 7, '7', 8, '6', 9, '11', 10, '17', 11, '19', 12, '8', 13, '5', 14, '1', 15, '12', 16, '14', 17, ' 2', 18, '4', 19, '16', 20, '15', 21, '41', 22, '42'), ");
      SQL.append("  LPAD(DECODE(H.REGIONE, 1, '13', 2, '20', 3, '9', 4, '10', 5, '40', 6, '21', 7, '7', 8, '6', 9, '11', 10, '17', 11, '19', 12, '8', 13, '5', 14, '1', 15, '12', 16, '14', 17, ' 2', 18, '4', 19, '16', 20, '15', 21, '41', 22, '42'), 4, SUBSTR('0', 1, 1)) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  M.DENOMINAZIONE, ");
      SQL.append("  M.SIGLA_CFIS, ");
      SQL.append("  LPAD(M.SIGLA_CFIS, 4, SUBSTR('0', 1, 1)), ");
      SQL.append("  SUM(NVL(O.RITENUTE_ADD_COM, 0)) ");
      SQL.append("from ");
      SQL.append("  AD4_COMUNI M, ");
      SQL.append("  AD4_PROVINCIE N, ");
      SQL.append("  LIQ O, ");
      SQL.append("  MAN P, ");
      SQL.append("  BEN Q ");
      SQL.append("where (O.BENEFICIARIO = Q.CODICE(+)) ");
      SQL.append("and   (NVL(Q.COMUNE_DOMICILIO, Q.COMUNE) = M.COMUNE) ");
      SQL.append("and   (NVL(Q.PROVINCIA_DOMICILIO, Q.PROVINCIA) = M.PROVINCIA_STATO) ");
      SQL.append("and   (NVL(Q.PROVINCIA_DOMICILIO, Q.PROVINCIA) = N.PROVINCIA) ");
      SQL.append("and   (O.ANNO_MAND = P.ANNO_MAND) ");
      SQL.append("and   (O.NUMERO_MAND = P.NUMERO_MAND) ");
      SQL.append("and   ((P.D_DATA_MAND BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI156.PARAMDA~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI156.PARAMA~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   (O.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (O.RITENUTE_ADD_COM > 0) ");
      SQL.append("and   (NOT ((N.REGIONE IS NULL))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'M') ");
      SQL.append("and   (P.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(R.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN R ");
      SQL.append("where (R.ANNO_MAND = P.ANNO_MAND) ");
      SQL.append("and   (R.NUMERO_MAND = P.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("and   (~~PQRY_PARAMETRI156.PARAMADDIZIO~~ = 'C') ");
      SQL.append("group by ");
      SQL.append("  M.DENOMINAZIONE, ");
      SQL.append("  M.SIGLA_CFIS, ");
      SQL.append("  LPAD(M.SIGLA_CFIS, 4, SUBSTR('0', 1, 1)) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  S.DENOMINAZIONE, ");
      SQL.append("  S.SIGLA_CFIS, ");
      SQL.append("  LPAD(S.SIGLA_CFIS, 4, SUBSTR('0', 1, 1)), ");
      SQL.append("  SUM(NVL(U.RITENUTE_ADD_COM, 0)) ");
      SQL.append("from ");
      SQL.append("  AD4_COMUNI S, ");
      SQL.append("  AD4_PROVINCIE T, ");
      SQL.append("  LIQ U, ");
      SQL.append("  BEN V, ");
      SQL.append("  PAGAMENTI W ");
      SQL.append("where (U.BENEFICIARIO = V.CODICE(+)) ");
      SQL.append("and   (NVL(V.COMUNE_DOMICILIO, V.COMUNE) = S.COMUNE) ");
      SQL.append("and   (NVL(V.PROVINCIA_DOMICILIO, V.PROVINCIA) = S.PROVINCIA_STATO) ");
      SQL.append("and   (NVL(V.PROVINCIA_DOMICILIO, V.PROVINCIA) = T.PROVINCIA) ");
      SQL.append("and   (U.ANNO_LIQ = W.ANNO_LIQ) ");
      SQL.append("and   (U.NUMERO_LIQ = W.NUMERO_LIQ) ");
      SQL.append("and   (U.ANNO_MAND = W.ANNO_MAND) ");
      SQL.append("and   (U.NUMERO_MAND = W.NUMERO_MAND) ");
      SQL.append("and   (U.RITENUTE_ADD_COM > 0) ");
      SQL.append("and   (W.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((T.REGIONE IS NULL))) ");
      SQL.append("and   ((W.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(W.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(W.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   ((W.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI156.PARAMDA~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI156.PARAMA~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'P') ");
      SQL.append("and   (W.D_DATA_PAGAM = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(X.D_DATA_PAGAM) ");
      SQL.append("from ");
      SQL.append("  PAGAMENTI X ");
      SQL.append("where ((X.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(W.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(W.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (X.ANNO_LIQ = W.ANNO_LIQ) ");
      SQL.append("and   (X.NUMERO_LIQ = W.NUMERO_LIQ) ");
      SQL.append("and   (X.ANNO_MAND = W.ANNO_MAND) ");
      SQL.append("and   (X.NUMERO_MAND = W.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("and   (~~PQRY_PARAMETRI156.PARAMADDIZIO~~ = 'C') ");
      SQL.append("group by ");
      SQL.append("  S.DENOMINAZIONE, ");
      SQL.append("  S.SIGLA_CFIS, ");
      SQL.append("  LPAD(S.SIGLA_CFIS, 4, SUBSTR('0', 1, 1)) ");
      SQL.append("order by 3, 1 ");
      BUK_DISRITPEADLI.SetReportQuery(BUK_DISRITPEADLI_RPT_DISRITPEADRE, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "BBE06F39-9747-4978-9071-DB0CE34A6121");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_DISRITPEADLI_RPT_DISRITPEADRE_Init()
  {
    BUK_DISRITPEADLI.InitReport(BUK_DISRITPEADLI_RPT_DISRITPEADRE, 196865);
    BUK_DISRITPEADLI_RPT_DISRITPEADRE_InitQuery(true, false);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPT_DISRITPEADRE, "5DBD7B7B-8F07-4660-AC8E-ADCDBF31A40C");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPT_DISRITPEADRE, "DISRITPEADRE");
    BUK_DISRITPEADLI.InitSection(BUK_DISRITPEADLI_RPT_DISRITPEADRE, BUK_DISRITPEADLI_SEC_INTESTREPORT, 1000, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_DISRITPEADLI.SetSectionRendersInto(BUK_DISRITPEADLI_SEC_INTESTREPORT, BUK_DISRITPEADLI_RPTBOX_CORPOPAGINA);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SEC_INTESTREPORT, "339D254A-DB3C-457F-8343-391E1066CD79");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_DISRITPEADLI.InitSection(BUK_DISRITPEADLI_RPT_DISRITPEADRE, BUK_DISRITPEADLI_SEC_INTESTPAGINA, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DISRITPEADLI.SetSectionRendersInto(BUK_DISRITPEADLI_SEC_INTESTPAGINA, BUK_DISRITPEADLI_RPTBOX_CORPOPAGINA);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SEC_INTESTPAGINA, "B88BD616-8759-4ED8-8871-8A346FCE2B84");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_DISRITPEADLI.InitReportBox(BUK_DISRITPEADLI_SEC_INTESTPAGINA, BUK_DISRITPEADLI_RPTBOX_DENREGCOMHEA, 0, 0, 13100, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPTBOX_DENREGCOMHEA, "C18B92FD-82BB-4A5C-BF46-7D8E71075EE2");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPTBOX_DENREGCOMHEA, "DENREGCOMHEA");
    BUK_DISRITPEADLI.InitBoxSpan(BUK_DISRITPEADLI_RPTBOX_DENREGCOMHEA, BUK_DISRITPEADLI_SPAN_DENOREGICOM1, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271319425, "Denominazione Regione Comune", "", 1);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SPAN_DENOREGICOM1, "68F3DE31-4234-416F-A8A4-1AF63062CDA2");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SPAN_DENOREGICOM1, "DENOREGICOM1");
    BUK_DISRITPEADLI.InitReportBox(BUK_DISRITPEADLI_SEC_INTESTPAGINA, BUK_DISRITPEADLI_RPTBOX_CODIINPSHEAD, 13300, 0, 1700, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPTBOX_CODIINPSHEAD, "121F3FF4-75EC-443A-8108-38C283386E05");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPTBOX_CODIINPSHEAD, "CODIINPSHEAD");
    BUK_DISRITPEADLI.InitBoxSpan(BUK_DISRITPEADLI_RPTBOX_CODIINPSHEAD, BUK_DISRITPEADLI_SPAN_CODICE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SPAN_CODICE, "5298F246-F5FF-4795-8E8F-EF42317F0EE9");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SPAN_CODICE, "CODICE");
    BUK_DISRITPEADLI.InitReportBox(BUK_DISRITPEADLI_SEC_INTESTPAGINA, BUK_DISRITPEADLI_RPTBOX_IMPODAVERHEA, 15200, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPTBOX_IMPODAVERHEA, "8B1899A4-8F5A-4EC8-AAEA-096E8C8CD24C");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPTBOX_IMPODAVERHEA, "IMPODAVERHEA");
    BUK_DISRITPEADLI.InitBoxSpan(BUK_DISRITPEADLI_RPTBOX_IMPODAVERHEA, BUK_DISRITPEADLI_SPAN_IMPORDAVERSA, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo da Versare", 1);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SPAN_IMPORDAVERSA, "C677DA5C-48E2-429F-81B2-6B69DB5EDE94");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SPAN_IMPORDAVERSA, "IMPORDAVERSA");
    BUK_DISRITPEADLI.InitSection(BUK_DISRITPEADLI_RPT_DISRITPEADRE, BUK_DISRITPEADLI_SEC_DETTAGLIO, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DISRITPEADLI.SetSectionRendersInto(BUK_DISRITPEADLI_SEC_DETTAGLIO, BUK_DISRITPEADLI_RPTBOX_CORPOPAGINA);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SEC_DETTAGLIO, "08A37F57-83C9-41C9-A4DB-A4C5910882E7");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_DISRITPEADLI.InitReportBox(BUK_DISRITPEADLI_SEC_DETTAGLIO, BUK_DISRITPEADLI_RPTBOX_DENOREGICOMU, 0, 0, 13100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPTBOX_DENOREGICOMU, "2B44250F-C108-4F63-99D7-07D51D0A56E4");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPTBOX_DENOREGICOMU, "DENOREGICOMU");
    BUK_DISRITPEADLI.InitBoxSpan(BUK_DISRITPEADLI_RPTBOX_DENOREGICOMU, BUK_DISRITPEADLI_SPAN_DENOREGICOMU, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "Max (If Equal (Param Addizionale [Distinta Ritenute Per Addizionale - Parametri], Regionale, Decode (If Equal (PROVINCIA REGIONE, Trentino Alto Adige, If Equal (PROVINCIA SIGLA, BZ, Bolzano, Trento), PROVINCIA REGIONE), Regioni), COMUNI DENOMINAZIONE))", "::DENOREGICOMU", 1);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SPAN_DENOREGICOMU, "678A3C0C-5415-4887-9937-10803F026D49");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SPAN_DENOREGICOMU, "DENOREGICOMU");
    BUK_DISRITPEADLI.InitReportBox(BUK_DISRITPEADLI_SEC_DETTAGLIO, BUK_DISRITPEADLI_RPTBOX_CODICEINPS, 13300, 0, 1700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPTBOX_CODICEINPS, "7F713ACF-55C4-4AF8-BE3C-15093BB588B3");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPTBOX_CODICEINPS, "CODICEINPS");
    BUK_DISRITPEADLI.InitBoxSpan(BUK_DISRITPEADLI_RPTBOX_CODICEINPS, BUK_DISRITPEADLI_SPAN_CODICEINPS, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "Max (If Equal (Param Addizionale [Distinta Ritenute Per Addizionale - Parametri], Regionale, Decode (If Equal (PROVINCIA REGIONE, Trentino Alto Adige, If Equal (PROVINCIA SIGLA, BZ, 41, 42), PROVINCIA REGIONE), Codici INPS), COMUNI SIGLA CFIS))", "::CODICEINPS", 1);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SPAN_CODICEINPS, "9B03F4DA-6353-4901-B049-FE673AA8F284");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SPAN_CODICEINPS, "CODICEINPS");
    BUK_DISRITPEADLI.InitReportBox(BUK_DISRITPEADLI_SEC_DETTAGLIO, BUK_DISRITPEADLI_RPTBOX_IMPORTO, 15200, 0, 3500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPTBOX_IMPORTO, "0A3A15B2-A88C-4DA8-A7C6-E0FE188DBACA");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPTBOX_IMPORTO, "IMPORTO");
    BUK_DISRITPEADLI.InitBoxSpan(BUK_DISRITPEADLI_RPTBOX_IMPORTO, BUK_DISRITPEADLI_SPAN_RERDRPADRPAL, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "Sum (Null Value (If Equal (Param Addizionale [Distinta Ritenute Per Addizionale - Parametri], Regionale, LIQ RITENUTE ADD, LIQ RITENUTE ADD COM), Zero))", "::RITENUTE", 1);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SPAN_RERDRPADRPAL, "41F1DA90-E026-4439-8B9B-08643FD43D2C");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SPAN_RERDRPADRPAL, "RERDRPADRPAL");
    BUK_DISRITPEADLI.InitSection(BUK_DISRITPEADLI_RPT_DISRITPEADRE, BUK_DISRITPEADLI_SEC_PIEDEPAGINA, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_DISRITPEADLI.SetSectionRendersInto(BUK_DISRITPEADLI_SEC_PIEDEPAGINA, BUK_DISRITPEADLI_RPTBOX_CORPOPAGINA);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SEC_PIEDEPAGINA, "665AFE44-0E92-4F3C-A303-200108C0AADD");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_DISRITPEADLI.InitSection(BUK_DISRITPEADLI_RPT_DISRITPEADRE, BUK_DISRITPEADLI_SEC_PIEDEREPORT, 900, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_DISRITPEADLI.SetSectionRendersInto(BUK_DISRITPEADLI_SEC_PIEDEREPORT, BUK_DISRITPEADLI_RPTBOX_CORPOPAGINA);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SEC_PIEDEREPORT, "25A0B026-D9CD-4540-998E-0D55FFD83D0E");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_DISRITPEADLI.InitReportBox(BUK_DISRITPEADLI_SEC_PIEDEREPORT, BUK_DISRITPEADLI_RPTBOX_SUMOFRITENU1, 15200, 100, 3500, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPTBOX_SUMOFRITENU1, "11BCD438-D493-4166-8B17-5C52E2C8CE39");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPTBOX_SUMOFRITENU1, "SUMOFRITENU1");
    BUK_DISRITPEADLI.InitBoxSpan(BUK_DISRITPEADLI_RPTBOX_SUMOFRITENU1, BUK_DISRITPEADLI_SPAN_PRSRRDRPADRP, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SPAN_PRSRRDRPADRP, "C8205DDA-D729-497E-882C-BCD1668EE9BA");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SPAN_PRSRRDRPADRP, "PRSRRDRPADRP");
    BUK_DISRITPEADLI.InitReportBox(BUK_DISRITPEADLI_SEC_PIEDEREPORT, BUK_DISRITPEADLI_RPTBOX_TOTALE, 12600, 100, 2400, 600, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_RPTBOX_TOTALE, "40BBECD3-1757-40DC-BE80-2D38F8AC4F5E");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_RPTBOX_TOTALE, "TOTALE");
    BUK_DISRITPEADLI.InitBoxSpan(BUK_DISRITPEADLI_RPTBOX_TOTALE, BUK_DISRITPEADLI_SPAN_TOTALE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_DISRITPEADLI.SetRTCGuid(BUK_DISRITPEADLI_SPAN_TOTALE, "0FCCEDFF-89EB-4266-AAA7-3B763276EF70");
    BUK_DISRITPEADLI.SetObjCode(BUK_DISRITPEADLI_SPAN_TOTALE, "TOTALE");
    BUK_DISRITPEADLI_RPT_DISRITPEADRE_InitQuery(false, true);
  }

  private void BUK_DISRITPEADLI_InitLinks()
  {
    BUK_DISRITPEADLI.SetBoxNextBox(BUK_DISRITPEADLI_RPTBOX_CORPOPAGINA, BUK_DISRITPEADLI_RPTBOX_CORPOPAGINA);
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
    if (SrcObj == BKW_DISRITPEADLI) BUK_DISRITPEADLI_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_DISRITPEADLI) BUK_DISRITPEADLI_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_DISRITPEADLI) BUK_DISRITPEADLI_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_DISRITPEADLI) BUK_DISRITPEADLI_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_DISRITPEADLI) BUK_DISRITPEADLI_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_DISRITPEADLI) BUK_DISRITPEADLI_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_DISRITPEADLI) BUK_DISRITPEADLI_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_DISRITPEADLI) BUK_DISRITPEADLI_OnPreview();
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
