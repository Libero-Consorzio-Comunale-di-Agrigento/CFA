// **********************************************
// Elenco Finanziamenti Piano
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoFinanziamentiPiano extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_CAPITOLI = 0;
  private static int GRP_PARAM_PARTE = 1;

  private static int PFL_PARAM_CONFINANZIAM = 0;
  private static int PFL_PARAM_PARTE = 1;
  private static int PFL_PARAM_NUOVCAMPSTAT = 2;
  private static int PFL_PARAM_NUOVCAMPSTA1 = 3;
  private static int PFL_PARAM_OK = 4;

  private static int PPQRY_PARAM5 = 0;


  IDPanel PAN_PARAM;
  CIDREObj BUK_CONFINANZIAM;
  OBook BKW_CONFINANZIAM;
  //
  // Template Pages constants
  private static int BUK_CONFINANZIAM_MST_ATTRLIBEPAGE = 1;
  private static int BUK_CONFINANZIAM_RPTBOX_PAGEHEADER = 2;
  private static int BUK_CONFINANZIAM_RPTBOX_PAGEBODY1 = 3;
  private static int BUK_CONFINANZIAM_RPTBOX_PAG1 = 4;
  private static int BUK_CONFINANZIAM_SPAN_CPTSCFEFPPNT = 5;

  //
  // Reports constants
  private static int BUK_CONFINANZIAM_RPT_NEWREPORT = 6;
  private static int BUK_CONFINANZIAM_SEC_REPORTHEADER = 7;
  private static int BUK_CONFINANZIAM_SEC_PAGEHEADER = 8;
  private static int BUK_CONFINANZIAM_RPTBOX_FINANZIAMEN2 = 9;
  private static int BUK_CONFINANZIAM_SPAN_FINANZIAMEN1 = 10;
  private static int BUK_CONFINANZIAM_RPTBOX_DESCRIABBRE1 = 11;
  private static int BUK_CONFINANZIAM_SPAN_DESCRIABBRE1 = 12;
  private static int BUK_CONFINANZIAM_RPTBOX_CAPITOLO2 = 13;
  private static int BUK_CONFINANZIAM_SPAN_CAPITOLO = 14;
  private static int BUK_CONFINANZIAM_RPTBOX_TITOLO1 = 15;
  private static int BUK_CONFINANZIAM_SPAN_CONTROFINAN1 = 16;
  private static int BUK_CONFINANZIAM_RPTBOX_PARTE1 = 17;
  private static int BUK_CONFINANZIAM_SPAN_PARTE1 = 18;
  private static int BUK_CONFINANZIAM_SEC_CAPESGROUHEA = 19;
  private static int BUK_CONFINANZIAM_SEC_VOCPEGGROHEA = 20;
  private static int BUK_CONFINANZIAM_RPTBOX_NEWBOX1 = 21;
  private static int BUK_CONFINANZIAM_SPAN_RECACAELFPCF = 22;
  private static int BUK_CONFINANZIAM_RPTBOX_NEWBOX2 = 23;
  private static int BUK_CONFINANZIAM_SPAN_RECAARELFPCF = 24;
  private static int BUK_CONFINANZIAM_RPTBOX_DESCRIABBREV = 25;
  private static int BUK_CONFINANZIAM_SPAN_DESCRIABBREV = 26;
  private static int BUK_CONFINANZIAM_RPTBOX_FINANZIAMENT = 27;
  private static int BUK_CONFINANZIAM_SPAN_FINANZIAMEN2 = 28;
  private static int BUK_CONFINANZIAM_SEC_DETAIL = 29;
  private static int BUK_CONFINANZIAM_RPTBOX_FINANZIAMEN1 = 30;
  private static int BUK_CONFINANZIAM_SPAN_FINANZIAMENT = 31;
  private static int BUK_CONFINANZIAM_SEC_VOCPEGGROFOO = 32;
  private static int BUK_CONFINANZIAM_SEC_CAPESGROUFOO = 33;
  private static int BUK_CONFINANZIAM_SEC_PAGEFOOTER = 34;
  private static int BUK_CONFINANZIAM_SEC_REPORTFOOTER = 35;

  CIDREObj BUK_SENZAFINANZI;
  OBook BKW_SENZAFINANZI;
  //
  // Template Pages constants
  private static int BUK_SENZAFINANZI_MST_SENZFINAPAGE = 1;
  private static int BUK_SENZAFINANZI_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_SENZAFINANZI_SPAN_NUMEROPAGINA = 3;
  private static int BUK_SENZAFINANZI_RPTBOX_PAGEBODY = 4;

  //
  // Reports constants
  private static int BUK_SENZAFINANZI_RPT_SENZAFINANZI = 5;
  private static int BUK_SENZAFINANZI_SEC_REPORTHEADER = 6;
  private static int BUK_SENZAFINANZI_SEC_PAGEHEADER = 7;
  private static int BUK_SENZAFINANZI_SEC_CAPESGROUHEA = 8;
  private static int BUK_SENZAFINANZI_RPTBOX_TITOLO = 9;
  private static int BUK_SENZAFINANZI_SPAN_CONTROFINANZ = 10;
  private static int BUK_SENZAFINANZI_RPTBOX_PARTE = 11;
  private static int BUK_SENZAFINANZI_SPAN_PARTE = 12;
  private static int BUK_SENZAFINANZI_RPTBOX_CAPDESCRHEAD = 13;
  private static int BUK_SENZAFINANZI_SPAN_CAPDESCRIZIO = 14;
  private static int BUK_SENZAFINANZI_RPTBOX_CAPITOLOART = 15;
  private static int BUK_SENZAFINANZI_SPAN_NUOVASPAN = 16;
  private static int BUK_SENZAFINANZI_SEC_VOCPEGGROHEA = 17;
  private static int BUK_SENZAFINANZI_SEC_DETAIL = 18;
  private static int BUK_SENZAFINANZI_RPTBOX_CAPCAPITOLO = 19;
  private static int BUK_SENZAFINANZI_SPAN_RECACAELFPSF = 20;
  private static int BUK_SENZAFINANZI_RPTBOX_CAPARTICOLO = 21;
  private static int BUK_SENZAFINANZI_SPAN_RECAARELFPSF = 22;
  private static int BUK_SENZAFINANZI_RPTBOX_CAPDESCRIZIO = 23;
  private static int BUK_SENZAFINANZI_SPAN_RECADEELFPSF = 24;
  private static int BUK_SENZAFINANZI_SEC_VOCPEGGROFOO = 25;
  private static int BUK_SENZAFINANZI_SEC_CAPESGROUFOO = 26;
  private static int BUK_SENZAFINANZI_SEC_PAGEFOOTER = 27;
  private static int BUK_SENZAFINANZI_SEC_REPORTFOOTER = 28;


  // Definition of Global Variables
  private IDVariant NUMERORIGA = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM17(IMDB);
    //
    //
    Init_PQRY_PARAM5(IMDB);
    Init_PQRY_PARAM5_RS(IMDB);
    Init_PQRY_CAP2(IMDB);
    Init_PQRY_CAP4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM17(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAM17, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAM17, "TBL_PARAM17");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM17,IMDBDef3.FLD_PARAM17_PARTE, "PARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM17,IMDBDef3.FLD_PARAM17_PARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM17,IMDBDef3.FLD_PARAM17_PARCONOSENFI, "PARCONOSENFI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM17,IMDBDef3.FLD_PARAM17_PARCONOSENFI,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAM17, 0);
  }

  private static void Init_PQRY_PARAM5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM5, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM5, "PQRY_PARAM5");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM5,IMDBDef10.PQSL_PARAM5_PARTE, "PARTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM5,IMDBDef10.PQSL_PARAM5_PARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM5,IMDBDef10.PQSL_PARAM5_PARCONOSENFI, "PARCONOSENFI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM5,IMDBDef10.PQSL_PARAM5_PARCONOSENFI,5,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAM5, 0);
  }

  private static void Init_PQRY_PARAM5_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM5_RS, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM5_RS, "PQRY_PARAM5_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM5_RS,IMDBDef10.PQSL_PARAM5_PARTE, "PARTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM5_RS,IMDBDef10.PQSL_PARAM5_PARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM5_RS,IMDBDef10.PQSL_PARAM5_PARCONOSENFI, "PARCONOSENFI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM5_RS,IMDBDef10.PQSL_PARAM5_PARCONOSENFI,5,2,0);
  }

  private static void Init_PQRY_CAP2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CAP2, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_CAP2, "PQRY_CAP2");
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_RECORVOCEPEG, "RECORVOCEPEG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_RECORVOCEPEG,5,199,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_DESCRIZIONE_ABBREVIATA, "DESCRIZIONE_ABBREVIATA");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_DESCRIZIONE_ABBREVIATA,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_RECORCAPDESC, "RECORCAPDESC");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_RECORCAPDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_RECORDFINANZ, "RECORDFINANZ");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP2,IMDBDef10.PQSL_CAP2_RECORDFINANZ,5,302,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CAP2, 0);
  }

  private static void Init_PQRY_CAP4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CAP4, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_CAP4, "PQRY_CAP4");
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP4,IMDBDef10.PQSL_CAP4_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP4,IMDBDef10.PQSL_CAP4_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP4,IMDBDef10.PQSL_CAP4_RECORVOCEPEG, "RECORVOCEPEG");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP4,IMDBDef10.PQSL_CAP4_RECORVOCEPEG,5,198,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP4,IMDBDef10.PQSL_CAP4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP4,IMDBDef10.PQSL_CAP4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP4,IMDBDef10.PQSL_CAP4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP4,IMDBDef10.PQSL_CAP4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CAP4,IMDBDef10.PQSL_CAP4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CAP4,IMDBDef10.PQSL_CAP4_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CAP4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoFinanziamentiPiano(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoFinanziamentiPiano()
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
    FormIdx = MyGlb.FRM_ELENFINAPIAN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EE2404C6-66E9-452F-9487-621556C582DF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 384;
    DesignHeight = 26;
    set_Caption(new IDVariant("Elenco Finanziamenti Piano"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 384;
    Frames[1].Height = 212;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 212;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 384-MyGlb.PAN_OFFS_X, 212-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A43661D3-EC2F-4AC8-99AB-4CCEAD44AF82");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 104, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    BKW_CONFINANZIAM = new OBook(this);
    BUK_CONFINANZIAM = new CIDREObj(BKW_CONFINANZIAM);
    BKW_CONFINANZIAM.iGuid = "6D5580B5-B997-43AA-9939-78EEB4620CE6";
    BKW_CONFINANZIAM.Code = "BUK_CONFINANZIAM";
    BKW_CONFINANZIAM.BookObj = BUK_CONFINANZIAM;
    BKW_CONFINANZIAM.InitDefMasks();
    BUK_CONFINANZIAM.InitBook(1, 1245441, "Con Finanziamenti", IMDB, MainFrm.VisualStyleList);
    BUK_CONFINANZIAM.InitHTML();
    BUK_CONFINANZIAM.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONFINANZIAM.Book.SetMainFrm(MainFrm);
    BUK_CONFINANZIAM.SetRTCGuid(0, "6D5580B5-B997-43AA-9939-78EEB4620CE6");
    BUK_CONFINANZIAM.SetObjCode(0, "CONFINANZIAM");
    BUK_CONFINANZIAM_MST_ATTRLIBEPAGE_Init();
    BUK_CONFINANZIAM_RPT_NEWREPORT_Init();
    BUK_CONFINANZIAM_InitLinks();
    BKW_SENZAFINANZI = new OBook(this);
    BUK_SENZAFINANZI = new CIDREObj(BKW_SENZAFINANZI);
    BKW_SENZAFINANZI.iGuid = "A450985B-A9F9-4420-A2FB-E22445D15DFF";
    BKW_SENZAFINANZI.Code = "BUK_SENZAFINANZI";
    BKW_SENZAFINANZI.BookObj = BUK_SENZAFINANZI;
    BKW_SENZAFINANZI.InitDefMasks();
    BUK_SENZAFINANZI.InitBook(1, 1245441, "Senza Finanziamenti", IMDB, MainFrm.VisualStyleList);
    BUK_SENZAFINANZI.InitHTML();
    BUK_SENZAFINANZI.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SENZAFINANZI.Book.SetMainFrm(MainFrm);
    BUK_SENZAFINANZI.SetRTCGuid(0, "A450985B-A9F9-4420-A2FB-E22445D15DFF");
    BUK_SENZAFINANZI.SetObjCode(0, "SENZAFINANZI");
    BUK_SENZAFINANZI_MST_SENZFINAPAGE_Init();
    BUK_SENZAFINANZI_RPT_SENZAFINANZI_Init();
    BUK_SENZAFINANZI_InitLinks();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAM17, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENFINAPIAN_PARAM5();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      // BUK_CONFINANZIAM.UpdateBook();
      // BUK_SENZAFINANZI.UpdateBook();
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
    if (Code.equals("BUK_CONFINANZIAM")) return BUK_CONFINANZIAM;
    if (Code.equals("BUK_SENZAFINANZI")) return BUK_SENZAFINANZI;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ElencoFinanziamentiPiano);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoFinanziamentiPiano.class.getName() : (Glb.ClassWithPackage(ElencoFinanziamentiPiano.class) ? ElencoFinanziamentiPiano.class.getName().substring(ElencoFinanziamentiPiano.class.getPackage().getName().length() + 1) : ElencoFinanziamentiPiano.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // ok
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ok ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // ok Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_PARAM5, IMDBDef10.PQSL_PARAM5_PARCONOSENFI, 0).equals((new IDVariant("1")), true))
      {
        BUK_CONFINANZIAM.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_CONFINANZIAM.ReportRefreshQuery(BUK_CONFINANZIAM_RPT_NEWREPORT);
        BUK_CONFINANZIAM.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_CONFINANZIAM.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAM5, IMDBDef10.PQSL_PARAM5_PARCONOSENFI, 0).equals((new IDVariant("2")), true))
      {
        BUK_SENZAFINANZI.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_SENZAFINANZI.ReportRefreshQuery(BUK_SENZAFINANZI_RPT_SENZAFINANZI);
        BUK_SENZAFINANZI.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_SENZAFINANZI.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFinanziamentiPiano", "ok", _e);
      return -1;
    }
  }

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
      IMDB.set_Value(IMDBDef3.TBL_PARAM17, IMDBDef3.FLD_PARAM17_PARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM17, IMDBDef3.FLD_PARAM17_PARCONOSENFI, 0, (new IDVariant("1")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFinanziamentiPiano", "Load", _e);
    }
  }

  // **********************************************************************
  // Voce P E G Group Header Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_CONFINANZIAM_SEC_VOCPEGGROHEA_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Voce P E G Group Header Before Formatting Body
      // Corpo Procedura
      // 
      NUMERORIGA = (new IDVariant(1));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFinanziamentiPiano", "VocePEGGroupHeaderBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Detail Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_CONFINANZIAM_SEC_DETAIL_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Before Formatting Body
      // Corpo Procedura
      // 
      if (NUMERORIGA.equals((new IDVariant(1)), true))
      {
        BUK_CONFINANZIAM.set_BoxVisible(BUK_CONFINANZIAM_RPTBOX_FINANZIAMEN1, (new IDVariant(0)).booleanValue());
        NUMERORIGA = (new IDVariant(2));
      }
      else
      {
        BUK_CONFINANZIAM.set_BoxVisible(BUK_CONFINANZIAM_RPTBOX_FINANZIAMEN1, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFinanziamentiPiano", "DetailBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ELENFINAPIAN_PARAM5() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAM5_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM17, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAM17, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAM5_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAM5_RS, 0, IMDBDef3.TBL_PARAM17, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM5_RS, 0, 0, IMDBDef3.TBL_PARAM17, IMDBDef3.FLD_PARAM17_PARTE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM5_RS, 1, 0, IMDBDef3.TBL_PARAM17, IMDBDef3.FLD_PARAM17_PARCONOSENFI, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAM17, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAM17, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM17, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAM5_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_OK)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ok();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CONFINANZIAM_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONFINANZIAM_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONFINANZIAM_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CONFINANZIAM_SEC_PAGEHEADER)
    {
      BUK_CONFINANZIAM.set_SpanValue(BUK_CONFINANZIAM_SPAN_PARTE1, new IDVariant(((BUK_CONFINANZIAM.GetReportColumn(BUK_CONFINANZIAM_RPT_NEWREPORT, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))));
    }
    if (SectionID==BUK_CONFINANZIAM_SEC_CAPESGROUHEA)
    {
    }
    if (SectionID==BUK_CONFINANZIAM_SEC_VOCPEGGROHEA)
    {
      BUK_CONFINANZIAM_SEC_VOCPEGGROHEA_OnFormattingSection();
    }
    if (SectionID==BUK_CONFINANZIAM_SEC_DETAIL)
    {
      BUK_CONFINANZIAM_SEC_DETAIL_OnFormattingSection();
    }
    if (SectionID==BUK_CONFINANZIAM_SEC_VOCPEGGROFOO)
    {
    }
    if (SectionID==BUK_CONFINANZIAM_SEC_CAPESGROUFOO)
    {
    }
    if (SectionID==BUK_CONFINANZIAM_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CONFINANZIAM_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CONFINANZIAM_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONFINANZIAM_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONFINANZIAM_MST_ATTRLIBEPAGE)
    {
      BUK_CONFINANZIAM.set_SpanValue(BUK_CONFINANZIAM_SPAN_CPTSCFEFPPNT, new IDVariant(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), IDL.ToString((new IDVariant(BUK_CONFINANZIAM.GetPageNumber())))), (new IDVariant(" / "))), IDL.ToString((new IDVariant(BUK_CONFINANZIAM.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CONFINANZIAM_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONFINANZIAM_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONFINANZIAM_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONFINANZIAM_OnPreview()
  {
    PreviewBook = BKW_CONFINANZIAM;
    SetRD();
  }

  private void BUK_SENZAFINANZI_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SENZAFINANZI_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SENZAFINANZI_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_SENZAFINANZI_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_SENZAFINANZI_SEC_CAPESGROUHEA)
    {
      BUK_SENZAFINANZI.set_SpanValue(BUK_SENZAFINANZI_SPAN_PARTE, new IDVariant(((BUK_SENZAFINANZI.GetReportColumn(BUK_SENZAFINANZI_RPT_SENZAFINANZI, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))));
    }
    if (SectionID==BUK_SENZAFINANZI_SEC_VOCPEGGROHEA)
    {
    }
    if (SectionID==BUK_SENZAFINANZI_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_SENZAFINANZI_SEC_VOCPEGGROFOO)
    {
    }
    if (SectionID==BUK_SENZAFINANZI_SEC_CAPESGROUFOO)
    {
    }
    if (SectionID==BUK_SENZAFINANZI_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_SENZAFINANZI_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_SENZAFINANZI_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SENZAFINANZI_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SENZAFINANZI_MST_SENZFINAPAGE)
    {
      BUK_SENZAFINANZI.set_SpanValue(BUK_SENZAFINANZI_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_SENZAFINANZI.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_SENZAFINANZI.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_SENZAFINANZI_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_SENZAFINANZI_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SENZAFINANZI_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SENZAFINANZI_OnPreview()
  {
    PreviewBook = BKW_SENZAFINANZI;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_CAPITOLI, "6AE678BD-EA8A-4C15-86B3-6FA33160F1B3");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_CAPITOLI, "Capitoli");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_CAPITOLI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_CAPITOLI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_CAPITOLI, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_CAPITOLI, MyGlb.PANEL_FORM, 24, 14, 268, 38, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_CAPITOLI, 0, 42);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_CAPITOLI, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_CAPITOLI, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_CAPITOLI, 1, 2);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_CAPITOLI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, "A75A5570-9731-4A83-8A73-0FD0A4A53D18");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, MyGlb.PANEL_LIST, 0, -9999, 64, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, MyGlb.PANEL_FORM, 24, 62, 268, 38, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 0, 31);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 1, 2);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, "E65CAE35-120E-42A4-AFB0-90321A49A1A3");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, "con Finanziamenti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "08814625-EC27-449B-91A6-AEF0C7E365B1");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "Descrivi il contenuto del campo");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, "9F27DC5A-ADC7-4EAB-8DA4-EABE128B9CE6");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, "E4B5287A-BE4D-4793-8C42-473A68361CF0");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_OK, "1411D13B-1151-4709-80CC-86A33681DCD6");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_OK, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_OK, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, MyGlb.PANEL_LIST, 160);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, MyGlb.PANEL_LIST, "c. Fin.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, MyGlb.PANEL_FORM, 28, 28, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, MyGlb.PANEL_FORM, 160);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CONFINANZIAM, MyGlb.PANEL_FORM, "con Finanziamenti");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CONFINANZIAM, -1, GRP_PARAM_CAPITOLI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CONFINANZIAM, PPQRY_PARAM5, "A.PARCONOSENFI", "PARCONOSENFI", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_CONFINANZIAM, (new IDVariant("1")), "con Finanziamenti", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_CONFINANZIAM, (new IDVariant("2")), "senza Finanziamenti", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 48, 76, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 160);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARTE, -1, GRP_PARAM_PARTE);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARTE, PPQRY_PARAM5, "A.PARTE", "PARTE", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 84, 148, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 28, 84, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVCAMPSTAT, -1, GRP_PARAM_PARTE);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVCAMPSTAT, -1, "", "NUOVCAMPSTAT", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.PANEL_LIST, 92, 156, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.PANEL_FORM, 280, 84, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVCAMPSTA1, -1, GRP_PARAM_PARTE);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVCAMPSTA1, -1, "", "NUOVCAMPSTA1", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 200, 124, 92, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 212, 120, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_OK, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_OK, -1, "", "OK", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM5", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM5, IMDBDef10.PQRY_PARAM5_RS, IMDBDef3.TBL_PARAM17);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CONFINANZIAM, IMDBDef3.FLD_PARAM17_PARCONOSENFI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARTE, IMDBDef3.FLD_PARAM17_PARTE);
    PAN_PARAM.SetMasterTable(0, "PARAM17");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CONFINANZIAM_MST_ATTRLIBEPAGE_Init()
  {
    BUK_CONFINANZIAM.InitMastro(BUK_CONFINANZIAM_MST_ATTRLIBEPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_MST_ATTRLIBEPAGE, "DCB4458A-14B4-48E0-9C38-8C08A224B50A");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_MST_ATTRLIBEPAGE, "ATTRLIBEPAGE");
    BUK_CONFINANZIAM.InitMastroBox(BUK_CONFINANZIAM_MST_ATTRLIBEPAGE, BUK_CONFINANZIAM_RPTBOX_PAGEHEADER, 1000, 1000, 18900, 2500, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_PAGEHEADER, "FD65F282-9AA0-4D5E-9076-2F98C0CA00CF");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_CONFINANZIAM.InitMastroBox(BUK_CONFINANZIAM_MST_ATTRLIBEPAGE, BUK_CONFINANZIAM_RPTBOX_PAGEBODY1, 1000, 3500, 18900, 24700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_PAGEBODY1, "21820B20-5A4B-4EDA-B9F0-83B773CE0CCF");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_PAGEBODY1, "PAGEBODY1");
    BUK_CONFINANZIAM.InitMastroBox(BUK_CONFINANZIAM_MST_ATTRLIBEPAGE, BUK_CONFINANZIAM_RPTBOX_PAG1, 18700, 400, 2300, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_PAG1, "C377DD42-281A-45B5-9EE2-D0B02160A23C");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_PAG1, "PAG1");
    BUK_CONFINANZIAM.InitBoxSpan(BUK_CONFINANZIAM_RPTBOX_PAG1, BUK_CONFINANZIAM_SPAN_CPTSCFEFPPNT, MyGlb.VIS_DEFAREPOSTYL, 5, 205, 0, 271384705, "", "", 1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SPAN_CPTSCFEFPPNT, "17109DBA-1604-4663-86EB-85DC3236A969");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SPAN_CPTSCFEFPPNT, "CPTSCFEFPPNT");
  }

  private void BUK_CONFINANZIAM_RPT_NEWREPORT_InitQuery() { BUK_CONFINANZIAM_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CONFINANZIAM_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  LPAD(TO_CHAR ( A.CAPITOLO ), 16, SUBSTR('0', 1, 1)) || '/' || LPAD(TO_CHAR ( A.ARTICOLO ), 2, SUBSTR('0', 1, 1)) as RECORVOCEPEG, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.DESCRIZIONE_ABBREVIATA as DESCRIZIONE_ABBREVIATA, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.DESCRIZIONE as RECORCAPDESC, ");
      SQL.append("  TO_CHAR ( C.CODICE ) || ' - ' || C.DESCRIZIONE as RECORDFINANZ ");
      SQL.append("from ");
      SQL.append("  CAP A, ");
      SQL.append("  CAP_FIN B, ");
      SQL.append("  FINANZIAMENTI C ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
      SQL.append("and   (B.E_S = A.E_S) ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (NOT ((A.CODICE_STRUTTURA IS NULL))) ");
      SQL.append("and   (C.CODICE = B.FINANZIAMENTO) ");
      SQL.append("and   ((A.E_S = ~~PQRY_PARAM5.PARTE~~ AND ~~PQRY_PARAM5.PARTE~~ <> 'ES') OR ~~PQRY_PARAM5.PARTE~~ = 'ES') ");
      SQL.append("order by 2, 1 ");
      BUK_CONFINANZIAM.SetReportQuery(BUK_CONFINANZIAM_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "9601ADC8-1F80-4A5A-98F2-BF35E3BF0FB2");
      if (BUK_CONFINANZIAM.FindObjByID(BUK_CONFINANZIAM_SEC_CAPESGROUHEA) != null)
        BUK_CONFINANZIAM.AddReportGroup(BUK_CONFINANZIAM_SEC_CAPESGROUHEA, "E_S");
      if (BUK_CONFINANZIAM.FindObjByID(BUK_CONFINANZIAM_SEC_VOCPEGGROHEA) != null)
        BUK_CONFINANZIAM.AddReportGroup(BUK_CONFINANZIAM_SEC_VOCPEGGROHEA, "RECORVOCEPEG");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONFINANZIAM_RPT_NEWREPORT_Init()
  {
    BUK_CONFINANZIAM.InitReport(BUK_CONFINANZIAM_RPT_NEWREPORT, 196609);
    BUK_CONFINANZIAM_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPT_NEWREPORT, "E2D9DE33-CE9F-4211-B9C7-4F70DC1AF1A5");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPT_NEWREPORT, "NEWREPORT");
    BUK_CONFINANZIAM.InitSection(BUK_CONFINANZIAM_RPT_NEWREPORT, BUK_CONFINANZIAM_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONFINANZIAM.SetSectionRendersInto(BUK_CONFINANZIAM_SEC_REPORTHEADER, BUK_CONFINANZIAM_RPTBOX_PAGEBODY1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SEC_REPORTHEADER, "2367FCEF-88A1-4FC5-94DE-4EA45B1461CF");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CONFINANZIAM.InitSection(BUK_CONFINANZIAM_RPT_NEWREPORT, BUK_CONFINANZIAM_SEC_PAGEHEADER, 2500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONFINANZIAM.SetSectionRendersInto(BUK_CONFINANZIAM_SEC_PAGEHEADER, BUK_CONFINANZIAM_RPTBOX_PAGEHEADER);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SEC_PAGEHEADER, "380F941D-E9B5-4DED-BEB3-17AE52199F25");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CONFINANZIAM.InitReportBox(BUK_CONFINANZIAM_SEC_PAGEHEADER, BUK_CONFINANZIAM_RPTBOX_FINANZIAMEN2, 10900, 1800, 8000, 700, 0, 1, 1, MyGlb.VIS_BOX, 983297, 375, "Finanziamenti", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_FINANZIAMEN2, "14642694-223B-43A5-987D-8E60E55A53E0");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_FINANZIAMEN2, "FINANZIAMEN2");
    BUK_CONFINANZIAM.InitBoxSpan(BUK_CONFINANZIAM_RPTBOX_FINANZIAMEN2, BUK_CONFINANZIAM_SPAN_FINANZIAMEN1, MyGlb.VIS_BOX, 0, 0, 0, 271319425, "", "Finanziamenti", 1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SPAN_FINANZIAMEN1, "8D460273-9A37-4E38-82FD-37F9131E1D98");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SPAN_FINANZIAMEN1, "FINANZIAMEN1");
    BUK_CONFINANZIAM.InitReportBox(BUK_CONFINANZIAM_SEC_PAGEHEADER, BUK_CONFINANZIAM_RPTBOX_DESCRIABBRE1, 3700, 1800, 7200, 700, 0, 1, 1, MyGlb.VIS_BOX, 983297, 375, "", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_DESCRIABBRE1, "938C6795-612D-4883-A928-462961EAD6A4");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_DESCRIABBRE1, "DESCRIABBRE1");
    BUK_CONFINANZIAM.InitBoxSpan(BUK_CONFINANZIAM_RPTBOX_DESCRIABBRE1, BUK_CONFINANZIAM_SPAN_DESCRIABBRE1, MyGlb.VIS_BOX, 0, 0, 0, 271319425, "", "Descrizione", 1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SPAN_DESCRIABBRE1, "39DC938D-DB11-41F2-AA40-3C6D1D021C63");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SPAN_DESCRIABBRE1, "DESCRIABBRE1");
    BUK_CONFINANZIAM.InitReportBox(BUK_CONFINANZIAM_SEC_PAGEHEADER, BUK_CONFINANZIAM_RPTBOX_CAPITOLO2, 0, 1800, 3700, 700, 0, 1, 1, MyGlb.VIS_BOX, 983297, 375, "Capitolo", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_CAPITOLO2, "1DA36F77-3314-446A-ABB3-225677EFA577");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_CAPITOLO2, "CAPITOLO2");
    BUK_CONFINANZIAM.InitBoxSpan(BUK_CONFINANZIAM_RPTBOX_CAPITOLO2, BUK_CONFINANZIAM_SPAN_CAPITOLO, MyGlb.VIS_BOX, 0, 0, 0, 271319425, "", "Capitolo/Art.", 1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SPAN_CAPITOLO, "AA5E1C04-A51F-440E-B4B5-CE3B525B6126");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SPAN_CAPITOLO, "CAPITOLO");
    BUK_CONFINANZIAM.InitReportBox(BUK_CONFINANZIAM_SEC_PAGEHEADER, BUK_CONFINANZIAM_RPTBOX_TITOLO1, 100, 0, 18800, 600, 0, 1, 1, MyGlb.VIS_TITOLIINBOX, 983041, 590, "", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_TITOLO1, "3A2632E4-C807-400C-A884-847779734E98");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_TITOLO1, "TITOLO1");
    BUK_CONFINANZIAM.InitBoxSpan(BUK_CONFINANZIAM_RPTBOX_TITOLO1, BUK_CONFINANZIAM_SPAN_CONTROFINAN1, MyGlb.VIS_TITOLIINBOX, 0, 0, 0, 271384961, "", "Controllo Finanziamenti", 1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SPAN_CONTROFINAN1, "56A30DF6-17EF-453C-A98A-0481BB931E6F");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SPAN_CONTROFINAN1, "CONTROFINAN1");
    BUK_CONFINANZIAM.InitReportBox(BUK_CONFINANZIAM_SEC_PAGEHEADER, BUK_CONFINANZIAM_RPTBOX_PARTE1, 100, 800, 18800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_PARTE1, "56746644-EEAA-4034-AC94-062DA110B874");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_PARTE1, "PARTE1");
    BUK_CONFINANZIAM.InitBoxSpan(BUK_CONFINANZIAM_RPTBOX_PARTE1, BUK_CONFINANZIAM_SPAN_PARTE1, MyGlb.VIS_INTSENBORCE1, 5, 99, 0, 271319169, "", "", 1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SPAN_PARTE1, "DE83DE56-C78A-4069-AC76-1D24C660D9B2");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SPAN_PARTE1, "PARTE1");
    BUK_CONFINANZIAM.InitSection(BUK_CONFINANZIAM_RPT_NEWREPORT, BUK_CONFINANZIAM_SEC_CAPESGROUHEA, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "E_S");
    BUK_CONFINANZIAM.SetSectionRendersInto(BUK_CONFINANZIAM_SEC_CAPESGROUHEA, BUK_CONFINANZIAM_RPTBOX_PAGEBODY1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SEC_CAPESGROUHEA, "48811472-D6A1-49BA-BE37-D6960DB550C8");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SEC_CAPESGROUHEA, "CAPESGROUHEA");
    BUK_CONFINANZIAM.InitSection(BUK_CONFINANZIAM_RPT_NEWREPORT, BUK_CONFINANZIAM_SEC_VOCPEGGROHEA, 500, 1, 0, 3, MyGlb.VIS_BORDOSUPERIO, 8978433, "RECORVOCEPEG");
    BUK_CONFINANZIAM.SetSectionRendersInto(BUK_CONFINANZIAM_SEC_VOCPEGGROHEA, BUK_CONFINANZIAM_RPTBOX_PAGEBODY1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SEC_VOCPEGGROHEA, "1E33A0B7-4F3C-481C-B1F4-3F82434E2B64");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_CONFINANZIAM.InitReportBox(BUK_CONFINANZIAM_SEC_VOCPEGGROHEA, BUK_CONFINANZIAM_RPTBOX_NEWBOX1, 0, 0, 2900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_NEWBOX1, "54BBB1C7-BBB0-4702-AEA2-B2E3294018C4");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_NEWBOX1, "NEWBOX1");
    BUK_CONFINANZIAM.InitBoxSpan(BUK_CONFINANZIAM_RPTBOX_NEWBOX1, BUK_CONFINANZIAM_SPAN_RECACAELFPCF, MyGlb.VIS_NORMA8INTLUN, 3, 16, 6, 271384961, "", "::CAPITOLO", 1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SPAN_RECACAELFPCF, "815B8CB0-E068-4FBF-B8D0-FD822114EED6");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SPAN_RECACAELFPCF, "RECACAELFPCF");
    BUK_CONFINANZIAM.InitReportBox(BUK_CONFINANZIAM_SEC_VOCPEGGROHEA, BUK_CONFINANZIAM_RPTBOX_NEWBOX2, 2900, 0, 700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_NEWBOX2, "1368012B-3FF5-4FD7-A8E6-F3A4C172FEB9");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_NEWBOX2, "NEWBOX2");
    BUK_CONFINANZIAM.InitBoxSpan(BUK_CONFINANZIAM_RPTBOX_NEWBOX2, BUK_CONFINANZIAM_SPAN_RECAARELFPCF, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384961, "1234567897-123456/02", "::ARTICOLO", 1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SPAN_RECAARELFPCF, "78DD4C0F-001D-4BF0-874E-416A1925BF59");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SPAN_RECAARELFPCF, "RECAARELFPCF");
    BUK_CONFINANZIAM.InitReportBox(BUK_CONFINANZIAM_SEC_VOCPEGGROHEA, BUK_CONFINANZIAM_RPTBOX_DESCRIABBREV, 3700, 0, 7200, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_DESCRIABBREV, "DDD8B67A-86EC-48F6-89F0-B7121954AEFA");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_DESCRIABBREV, "DESCRIABBREV");
    BUK_CONFINANZIAM.InitBoxSpan(BUK_CONFINANZIAM_RPTBOX_DESCRIABBREV, BUK_CONFINANZIAM_SPAN_DESCRIABBREV, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271319169, "", "::RECORCAPDESC", 1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SPAN_DESCRIABBREV, "3C801192-BFC4-40A1-86E9-6897F1261925");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SPAN_DESCRIABBREV, "DESCRIABBREV");
    BUK_CONFINANZIAM.InitReportBox(BUK_CONFINANZIAM_SEC_VOCPEGGROHEA, BUK_CONFINANZIAM_RPTBOX_FINANZIAMENT, 10900, 0, 8000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_FINANZIAMENT, "FAE9D880-CB2B-46CB-A7EE-5056F0E77049");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_FINANZIAMENT, "FINANZIAMENT");
    BUK_CONFINANZIAM.InitBoxSpan(BUK_CONFINANZIAM_RPTBOX_FINANZIAMENT, BUK_CONFINANZIAM_SPAN_FINANZIAMEN2, MyGlb.VIS_DEFAREPOSTYL, 5, 302, 0, 271319425, "", "::RECORDFINANZ", 1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SPAN_FINANZIAMEN2, "2A821FF2-E6F9-4379-B02E-FF061276BC1B");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SPAN_FINANZIAMEN2, "FINANZIAMEN2");
    BUK_CONFINANZIAM.InitSection(BUK_CONFINANZIAM_RPT_NEWREPORT, BUK_CONFINANZIAM_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_CONFINANZIAM.SetSectionRendersInto(BUK_CONFINANZIAM_SEC_DETAIL, BUK_CONFINANZIAM_RPTBOX_PAGEBODY1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SEC_DETAIL, "B21A44CF-AB13-4211-BD46-CFD9313E39EC");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SEC_DETAIL, "DETAIL");
    BUK_CONFINANZIAM.InitReportBox(BUK_CONFINANZIAM_SEC_DETAIL, BUK_CONFINANZIAM_RPTBOX_FINANZIAMEN1, 10900, 0, 8000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_RPTBOX_FINANZIAMEN1, "AEC4A52B-111C-4B15-A6F9-1F6027A863A6");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_RPTBOX_FINANZIAMEN1, "FINANZIAMEN1");
    BUK_CONFINANZIAM.InitBoxSpan(BUK_CONFINANZIAM_RPTBOX_FINANZIAMEN1, BUK_CONFINANZIAM_SPAN_FINANZIAMENT, MyGlb.VIS_DEFAREPOSTYL, 5, 302, 0, 271319169, "Brief description of field content.", "::RECORDFINANZ", 1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SPAN_FINANZIAMENT, "4212BBEA-93A8-46DC-97D2-4CC9AE728AD6");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SPAN_FINANZIAMENT, "FINANZIAMENT");
    BUK_CONFINANZIAM.InitSection(BUK_CONFINANZIAM_RPT_NEWREPORT, BUK_CONFINANZIAM_SEC_VOCPEGGROFOO, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "RECORVOCEPEG");
    BUK_CONFINANZIAM.SetSectionRendersInto(BUK_CONFINANZIAM_SEC_VOCPEGGROFOO, BUK_CONFINANZIAM_RPTBOX_PAGEBODY1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SEC_VOCPEGGROFOO, "BF1752C8-C1EB-4212-AF9A-B072B7A08F48");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SEC_VOCPEGGROFOO, "VOCPEGGROFOO");
    BUK_CONFINANZIAM.InitSection(BUK_CONFINANZIAM_RPT_NEWREPORT, BUK_CONFINANZIAM_SEC_CAPESGROUFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "E_S");
    BUK_CONFINANZIAM.SetSectionRendersInto(BUK_CONFINANZIAM_SEC_CAPESGROUFOO, BUK_CONFINANZIAM_RPTBOX_PAGEBODY1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SEC_CAPESGROUFOO, "9DC31845-1535-4BFC-B0F1-608778002064");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SEC_CAPESGROUFOO, "CAPESGROUFOO");
    BUK_CONFINANZIAM.InitSection(BUK_CONFINANZIAM_RPT_NEWREPORT, BUK_CONFINANZIAM_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONFINANZIAM.SetSectionRendersInto(BUK_CONFINANZIAM_SEC_PAGEFOOTER, BUK_CONFINANZIAM_RPTBOX_PAGEBODY1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SEC_PAGEFOOTER, "26DA529E-C216-4865-8C5A-2E5C71DD3A0D");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CONFINANZIAM.InitSection(BUK_CONFINANZIAM_RPT_NEWREPORT, BUK_CONFINANZIAM_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CONFINANZIAM.SetSectionRendersInto(BUK_CONFINANZIAM_SEC_REPORTFOOTER, BUK_CONFINANZIAM_RPTBOX_PAGEBODY1);
    BUK_CONFINANZIAM.SetRTCGuid(BUK_CONFINANZIAM_SEC_REPORTFOOTER, "9341A6E3-164A-410C-81B9-D52A85AB9591");
    BUK_CONFINANZIAM.SetObjCode(BUK_CONFINANZIAM_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CONFINANZIAM.AddReportGroup(BUK_CONFINANZIAM_SEC_CAPESGROUHEA, "E_S");
    BUK_CONFINANZIAM.AddReportGroup(BUK_CONFINANZIAM_SEC_VOCPEGGROHEA, "RECORVOCEPEG");
    BUK_CONFINANZIAM_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CONFINANZIAM_InitLinks()
  {
    BUK_CONFINANZIAM.SetBoxNextBox(BUK_CONFINANZIAM_RPTBOX_PAGEBODY1, BUK_CONFINANZIAM_RPTBOX_PAGEBODY1);
  }

  private void BUK_SENZAFINANZI_MST_SENZFINAPAGE_Init()
  {
    BUK_SENZAFINANZI.InitMastro(BUK_SENZAFINANZI_MST_SENZFINAPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_MST_SENZFINAPAGE, "85424E0D-6257-4E69-A626-31BA017AA9F6");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_MST_SENZFINAPAGE, "SENZFINAPAGE");
    BUK_SENZAFINANZI.InitMastroBox(BUK_SENZAFINANZI_MST_SENZFINAPAGE, BUK_SENZAFINANZI_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_RPTBOX_NUMEROPAGINA, "15C524FC-1F9C-4EEB-944A-B6A94E490FAD");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_SENZAFINANZI.InitBoxSpan(BUK_SENZAFINANZI_RPTBOX_NUMEROPAGINA, BUK_SENZAFINANZI_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SPAN_NUMEROPAGINA, "D1891106-4E42-4BC4-B802-460378841F87");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_SENZAFINANZI.InitMastroBox(BUK_SENZAFINANZI_MST_SENZFINAPAGE, BUK_SENZAFINANZI_RPTBOX_PAGEBODY, 900, 1100, 19000, 27000, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_RPTBOX_PAGEBODY, "A4469F1F-BD7E-45EF-80B5-936E5A9AB62E");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_SENZAFINANZI_RPT_SENZAFINANZI_InitQuery() { BUK_SENZAFINANZI_RPT_SENZAFINANZI_InitQuery(true, true); }
  private void BUK_SENZAFINANZI_RPT_SENZAFINANZI_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  LPAD(TO_CHAR ( A.CAPITOLO ), 16, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( A.ARTICOLO ), 2, SUBSTR('0', 1, 1)) as RECORVOCEPEG, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  CAP A, ");
      SQL.append("  CAP_FIN I ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((A.E_S = ~~PQRY_PARAM5.PARTE~~ AND ~~PQRY_PARAM5.PARTE~~ <> 'ES') OR ~~PQRY_PARAM5.PARTE~~ = 'ES') ");
      SQL.append("and   (I.ESERCIZIO(+) = A.ESERCIZIO) ");
      SQL.append("and   (I.E_S(+) = A.E_S) ");
      SQL.append("and   (I.CAPITOLO(+) = A.CAPITOLO) ");
      SQL.append("and   (I.ARTICOLO(+) = A.ARTICOLO) ");
      SQL.append("and   (A.CAPITOLO <> 0) ");
      SQL.append("and   (A.ARTICOLO <> 0) ");
      SQL.append("and   (NOT ((A.CODICE_STRUTTURA IS NULL))) ");
      SQL.append("and   (NOT (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  H.CAPITOLO ");
      SQL.append("from ");
      SQL.append("  CAP_FIN H ");
      SQL.append("where (H.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((H.E_S = ~~PQRY_PARAM5.PARTE~~ AND ~~PQRY_PARAM5.PARTE~~ <> 'ES') OR ~~PQRY_PARAM5.PARTE~~ = 'ES') ");
      SQL.append("and   (H.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (H.ARTICOLO = A.ARTICOLO) ");
      SQL.append(")))) ");
      SQL.append("UNION ALL ");
      SQL.append("select ");
      SQL.append("  B.E_S, ");
      SQL.append("  LPAD(TO_CHAR ( B.CAPITOLO ), 16, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( B.ARTICOLO ), 2, SUBSTR('0', 1, 1)), ");
      SQL.append("  B.CAPITOLO, ");
      SQL.append("  B.ARTICOLO, ");
      SQL.append("  B.DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  CAP B, ");
      SQL.append("  CAP_FIN D ");
      SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((B.E_S = ~~PQRY_PARAM5.PARTE~~ AND ~~PQRY_PARAM5.PARTE~~ <> 'ES') OR ~~PQRY_PARAM5.PARTE~~ = 'ES') ");
      SQL.append("and   (D.ESERCIZIO(+) = B.ESERCIZIO) ");
      SQL.append("and   (D.E_S(+) = B.E_S) ");
      SQL.append("and   (D.CAPITOLO(+) = B.CAPITOLO) ");
      SQL.append("and   (D.ARTICOLO(+) = B.ARTICOLO) ");
      SQL.append("and   (B.CAPITOLO <> 0) ");
      SQL.append("and   (B.ARTICOLO = 0) ");
      SQL.append("and   (NOT ((B.CODICE_STRUTTURA IS NULL))) ");
      SQL.append("and   (NOT (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  C.CAPITOLO ");
      SQL.append("from ");
      SQL.append("  CAP_FIN C ");
      SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((C.E_S = ~~PQRY_PARAM5.PARTE~~ AND ~~PQRY_PARAM5.PARTE~~ <> 'ES') OR ~~PQRY_PARAM5.PARTE~~ = 'ES') ");
      SQL.append("and   (C.CAPITOLO = B.CAPITOLO) ");
      SQL.append(")))) ");
      SQL.append("UNION ALL ");
      SQL.append("select ");
      SQL.append("  E.E_S, ");
      SQL.append("  LPAD(TO_CHAR ( E.CAPITOLO ), 16, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( E.ARTICOLO ), 2, SUBSTR('0', 1, 1)), ");
      SQL.append("  E.CAPITOLO, ");
      SQL.append("  E.ARTICOLO, ");
      SQL.append("  E.DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  CAP E, ");
      SQL.append("  CAP_FIN G ");
      SQL.append("where (E.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((E.E_S = ~~PQRY_PARAM5.PARTE~~ AND ~~PQRY_PARAM5.PARTE~~ <> 'ES') OR ~~PQRY_PARAM5.PARTE~~ = 'ES') ");
      SQL.append("and   (G.ESERCIZIO(+) = E.ESERCIZIO) ");
      SQL.append("and   (G.E_S(+) = E.E_S) ");
      SQL.append("and   (G.CAPITOLO(+) = E.CAPITOLO) ");
      SQL.append("and   (G.ARTICOLO(+) = E.CAPITOLO) ");
      SQL.append("and   (E.CAPITOLO = 0) ");
      SQL.append("and   (E.ARTICOLO = 0) ");
      SQL.append("and   (NOT ((E.CODICE_STRUTTURA IS NULL))) ");
      SQL.append("and   (NOT (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  F.CAPITOLO ");
      SQL.append("from ");
      SQL.append("  CAP_FIN F ");
      SQL.append("where (F.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((F.E_S = ~~PQRY_PARAM5.PARTE~~ AND ~~PQRY_PARAM5.PARTE~~ <> 'ES') OR ~~PQRY_PARAM5.PARTE~~ = 'ES') ");
      SQL.append(")))) ");
      SQL.append("order by 1, 2 ");
      BUK_SENZAFINANZI.SetReportQuery(BUK_SENZAFINANZI_RPT_SENZAFINANZI, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "1D329496-A7F6-4472-8AF3-6BBCC180294B");
      if (BUK_SENZAFINANZI.FindObjByID(BUK_SENZAFINANZI_SEC_CAPESGROUHEA) != null)
        BUK_SENZAFINANZI.AddReportGroup(BUK_SENZAFINANZI_SEC_CAPESGROUHEA, "E_S");
      if (BUK_SENZAFINANZI.FindObjByID(BUK_SENZAFINANZI_SEC_VOCPEGGROHEA) != null)
        BUK_SENZAFINANZI.AddReportGroup(BUK_SENZAFINANZI_SEC_VOCPEGGROHEA, "RECORVOCEPEG");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SENZAFINANZI_RPT_SENZAFINANZI_Init()
  {
    BUK_SENZAFINANZI.InitReport(BUK_SENZAFINANZI_RPT_SENZAFINANZI, 196865);
    BUK_SENZAFINANZI_RPT_SENZAFINANZI_InitQuery(true, false);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_RPT_SENZAFINANZI, "21D9D8BE-2F78-47D3-8E6D-ED7E6E91AFC4");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_RPT_SENZAFINANZI, "SENZAFINANZI");
    BUK_SENZAFINANZI.InitSection(BUK_SENZAFINANZI_RPT_SENZAFINANZI, BUK_SENZAFINANZI_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_SENZAFINANZI.SetSectionRendersInto(BUK_SENZAFINANZI_SEC_REPORTHEADER, BUK_SENZAFINANZI_RPTBOX_PAGEBODY);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SEC_REPORTHEADER, "681B6D4E-B161-483F-AB34-68407C4EE8D5");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_SENZAFINANZI.InitSection(BUK_SENZAFINANZI_RPT_SENZAFINANZI, BUK_SENZAFINANZI_SEC_PAGEHEADER, 0, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_SENZAFINANZI.SetSectionRendersInto(BUK_SENZAFINANZI_SEC_PAGEHEADER, BUK_SENZAFINANZI_RPTBOX_PAGEBODY);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SEC_PAGEHEADER, "7FE2782E-4373-4363-B92A-19A7C5D7277C");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_SENZAFINANZI.InitSection(BUK_SENZAFINANZI_RPT_SENZAFINANZI, BUK_SENZAFINANZI_SEC_CAPESGROUHEA, 3500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 42532865, "E_S");
    BUK_SENZAFINANZI.SetSectionRendersInto(BUK_SENZAFINANZI_SEC_CAPESGROUHEA, BUK_SENZAFINANZI_RPTBOX_PAGEBODY);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SEC_CAPESGROUHEA, "5CE71A89-F093-4579-BD86-EBFF24E2444F");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SEC_CAPESGROUHEA, "CAPESGROUHEA");
    BUK_SENZAFINANZI.InitReportBox(BUK_SENZAFINANZI_SEC_CAPESGROUHEA, BUK_SENZAFINANZI_RPTBOX_TITOLO, 100, 0, 18800, 600, 0, 1, 1, MyGlb.VIS_TITOLIINBOX, 983041, 590, "", 1, -33);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_RPTBOX_TITOLO, "E34A789A-BB85-408A-B5D0-05D1D3FFA837");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_RPTBOX_TITOLO, "TITOLO");
    BUK_SENZAFINANZI.InitBoxSpan(BUK_SENZAFINANZI_RPTBOX_TITOLO, BUK_SENZAFINANZI_SPAN_CONTROFINANZ, MyGlb.VIS_TITOLIINBOX, 0, 0, 0, 271384961, "", "Controllo Finanziamenti", 1);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SPAN_CONTROFINANZ, "B86F1481-4680-49DE-8023-A8053CA46D9E");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SPAN_CONTROFINANZ, "CONTROFINANZ");
    BUK_SENZAFINANZI.InitReportBox(BUK_SENZAFINANZI_SEC_CAPESGROUHEA, BUK_SENZAFINANZI_RPTBOX_PARTE, 100, 800, 18800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_RPTBOX_PARTE, "8029909A-FC19-4A57-BF4B-9A5F58270E28");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_RPTBOX_PARTE, "PARTE");
    BUK_SENZAFINANZI.InitBoxSpan(BUK_SENZAFINANZI_RPTBOX_PARTE, BUK_SENZAFINANZI_SPAN_PARTE, MyGlb.VIS_INTSENBORCE1, 5, 99, 0, 271319169, "", "", 1);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SPAN_PARTE, "C6DF1A70-0818-41D6-9610-5E94B74E7BFC");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SPAN_PARTE, "PARTE");
    BUK_SENZAFINANZI.InitReportBox(BUK_SENZAFINANZI_SEC_CAPESGROUHEA, BUK_SENZAFINANZI_RPTBOX_CAPDESCRHEAD, 3700, 2900, 15300, 600, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_RPTBOX_CAPDESCRHEAD, "C11AE095-BA7A-4915-8251-8BC7BB70AD13");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_RPTBOX_CAPDESCRHEAD, "CAPDESCRHEAD");
    BUK_SENZAFINANZI.InitBoxSpan(BUK_SENZAFINANZI_RPTBOX_CAPDESCRHEAD, BUK_SENZAFINANZI_SPAN_CAPDESCRIZIO, MyGlb.VIS_BOX, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SPAN_CAPDESCRIZIO, "A1D49DE7-2C8D-4354-AC62-D5837BCE4179");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SPAN_CAPDESCRIZIO, "CAPDESCRIZIO");
    BUK_SENZAFINANZI.InitReportBox(BUK_SENZAFINANZI_SEC_CAPESGROUHEA, BUK_SENZAFINANZI_RPTBOX_CAPITOLOART, 0, 2900, 3700, 600, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_RPTBOX_CAPITOLOART, "9761F210-F7B6-42C5-A8FC-6755C58DC833");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_RPTBOX_CAPITOLOART, "CAPITOLOART");
    BUK_SENZAFINANZI.InitBoxSpan(BUK_SENZAFINANZI_RPTBOX_CAPITOLOART, BUK_SENZAFINANZI_SPAN_NUOVASPAN, MyGlb.VIS_BOX, 0, 0, 0, 271384705, "", "Capitolo/Art.", 1);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SPAN_NUOVASPAN, "27B70C4B-891F-4DB9-BB86-3FB20E44C42C");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_SENZAFINANZI.InitSection(BUK_SENZAFINANZI_RPT_SENZAFINANZI, BUK_SENZAFINANZI_SEC_VOCPEGGROHEA, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORVOCEPEG");
    BUK_SENZAFINANZI.SetSectionRendersInto(BUK_SENZAFINANZI_SEC_VOCPEGGROHEA, BUK_SENZAFINANZI_RPTBOX_PAGEBODY);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SEC_VOCPEGGROHEA, "A57BD8EB-8D6B-4685-96E0-CA28513256D9");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SEC_VOCPEGGROHEA, "VOCPEGGROHEA");
    BUK_SENZAFINANZI.InitSection(BUK_SENZAFINANZI_RPT_SENZAFINANZI, BUK_SENZAFINANZI_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_BORDOSUPERIO, 11075585, "");
    BUK_SENZAFINANZI.SetSectionRendersInto(BUK_SENZAFINANZI_SEC_DETAIL, BUK_SENZAFINANZI_RPTBOX_PAGEBODY);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SEC_DETAIL, "C15D1718-04BF-4058-9B5C-0282FBA03907");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SEC_DETAIL, "DETAIL");
    BUK_SENZAFINANZI.InitReportBox(BUK_SENZAFINANZI_SEC_DETAIL, BUK_SENZAFINANZI_RPTBOX_CAPCAPITOLO, 0, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_RPTBOX_CAPCAPITOLO, "15F244CA-06BD-4D7D-B387-6AEFE5B0CACA");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_RPTBOX_CAPCAPITOLO, "CAPCAPITOLO");
    BUK_SENZAFINANZI.InitBoxSpan(BUK_SENZAFINANZI_RPTBOX_CAPCAPITOLO, BUK_SENZAFINANZI_SPAN_RECACAELFPSF, MyGlb.VIS_NORMA8INTLUN, 3, 16, 6, 271384705, "Brief description of field content.", "::CAPITOLO", 1);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SPAN_RECACAELFPSF, "B7E26A1A-9E2C-4005-8807-667A3166A1A1");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SPAN_RECACAELFPSF, "RECACAELFPSF");
    BUK_SENZAFINANZI.InitReportBox(BUK_SENZAFINANZI_SEC_DETAIL, BUK_SENZAFINANZI_RPTBOX_CAPARTICOLO, 3000, 0, 600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_RPTBOX_CAPARTICOLO, "AB24EF6D-1B5D-4CD1-AA6F-854645CEFA30");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_RPTBOX_CAPARTICOLO, "CAPARTICOLO");
    BUK_SENZAFINANZI.InitBoxSpan(BUK_SENZAFINANZI_RPTBOX_CAPARTICOLO, BUK_SENZAFINANZI_SPAN_RECAARELFPSF, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::ARTICOLO", 1);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SPAN_RECAARELFPSF, "1130DAD7-8E48-417D-9484-031EA4473D5F");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SPAN_RECAARELFPSF, "RECAARELFPSF");
    BUK_SENZAFINANZI.InitReportBox(BUK_SENZAFINANZI_SEC_DETAIL, BUK_SENZAFINANZI_RPTBOX_CAPDESCRIZIO, 3700, 0, 15300, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_RPTBOX_CAPDESCRIZIO, "7F9803F8-E3BB-45D0-A3DC-7DBAFF064E65");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_RPTBOX_CAPDESCRIZIO, "CAPDESCRIZIO");
    BUK_SENZAFINANZI.InitBoxSpan(BUK_SENZAFINANZI_RPTBOX_CAPDESCRIZIO, BUK_SENZAFINANZI_SPAN_RECADEELFPSF, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SPAN_RECADEELFPSF, "95E55251-BC99-49A1-8114-C79C3CA74E5A");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SPAN_RECADEELFPSF, "RECADEELFPSF");
    BUK_SENZAFINANZI.InitSection(BUK_SENZAFINANZI_RPT_SENZAFINANZI, BUK_SENZAFINANZI_SEC_VOCPEGGROFOO, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 11075585, "RECORVOCEPEG");
    BUK_SENZAFINANZI.SetSectionRendersInto(BUK_SENZAFINANZI_SEC_VOCPEGGROFOO, BUK_SENZAFINANZI_RPTBOX_PAGEBODY);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SEC_VOCPEGGROFOO, "5E3BEAB9-579B-479C-9239-5D6F9D64A332");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SEC_VOCPEGGROFOO, "VOCPEGGROFOO");
    BUK_SENZAFINANZI.InitSection(BUK_SENZAFINANZI_RPT_SENZAFINANZI, BUK_SENZAFINANZI_SEC_CAPESGROUFOO, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "E_S");
    BUK_SENZAFINANZI.SetSectionRendersInto(BUK_SENZAFINANZI_SEC_CAPESGROUFOO, BUK_SENZAFINANZI_RPTBOX_PAGEBODY);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SEC_CAPESGROUFOO, "34EBCB8E-886B-4BF5-A07E-02826E3B8E22");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SEC_CAPESGROUFOO, "CAPESGROUFOO");
    BUK_SENZAFINANZI.InitSection(BUK_SENZAFINANZI_RPT_SENZAFINANZI, BUK_SENZAFINANZI_SEC_PAGEFOOTER, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_SENZAFINANZI.SetSectionRendersInto(BUK_SENZAFINANZI_SEC_PAGEFOOTER, BUK_SENZAFINANZI_RPTBOX_PAGEBODY);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SEC_PAGEFOOTER, "3611ECAA-0EA1-4BCB-AD79-BEF6ADA770E8");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_SENZAFINANZI.InitSection(BUK_SENZAFINANZI_RPT_SENZAFINANZI, BUK_SENZAFINANZI_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_SENZAFINANZI.SetSectionRendersInto(BUK_SENZAFINANZI_SEC_REPORTFOOTER, BUK_SENZAFINANZI_RPTBOX_PAGEBODY);
    BUK_SENZAFINANZI.SetRTCGuid(BUK_SENZAFINANZI_SEC_REPORTFOOTER, "17C8BB12-91D7-42FE-80C9-962B62E4F177");
    BUK_SENZAFINANZI.SetObjCode(BUK_SENZAFINANZI_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_SENZAFINANZI.AddReportGroup(BUK_SENZAFINANZI_SEC_CAPESGROUHEA, "E_S");
    BUK_SENZAFINANZI.AddReportGroup(BUK_SENZAFINANZI_SEC_VOCPEGGROHEA, "RECORVOCEPEG");
    BUK_SENZAFINANZI_RPT_SENZAFINANZI_InitQuery(false, true);
  }

  private void BUK_SENZAFINANZI_InitLinks()
  {
    BUK_SENZAFINANZI.SetBoxNextBox(BUK_SENZAFINANZI_RPTBOX_PAGEBODY, BUK_SENZAFINANZI_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CONFINANZIAM) BUK_CONFINANZIAM_OnFormattingSection(SectionID);
    if (SrcObj == BKW_SENZAFINANZI) BUK_SENZAFINANZI_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CONFINANZIAM) BUK_CONFINANZIAM_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_SENZAFINANZI) BUK_SENZAFINANZI_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CONFINANZIAM) BUK_CONFINANZIAM_OnFormattingPage(PageID);
    if (SrcObj == BKW_SENZAFINANZI) BUK_SENZAFINANZI_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CONFINANZIAM) BUK_CONFINANZIAM_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_SENZAFINANZI) BUK_SENZAFINANZI_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CONFINANZIAM) BUK_CONFINANZIAM_OnConnecting(DBConn);
    if (SrcObj == BKW_SENZAFINANZI) BUK_SENZAFINANZI_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CONFINANZIAM) BUK_CONFINANZIAM_Activated(ObjID, BoxName);
    if (SrcObj == BKW_SENZAFINANZI) BUK_SENZAFINANZI_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CONFINANZIAM) BUK_CONFINANZIAM_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_SENZAFINANZI) BUK_SENZAFINANZI_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CONFINANZIAM) BUK_CONFINANZIAM_OnPreview();
    if (SrcObj == BKW_SENZAFINANZI) BUK_SENZAFINANZI_OnPreview();
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
