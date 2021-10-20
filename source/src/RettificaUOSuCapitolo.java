// **********************************************
// Rettifica UO Su Capitolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RettificaUOSuCapitolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_UNITADIGESTI = 0;
  private static int GRP_PARAMETRI_UNITADIUTILI = 1;

  private static int PFL_PARAMETRI_CAPITARTLABE = 0;
  private static int PFL_PARAMETRI_ES = 1;
  private static int PFL_PARAMETRI_CAPITOLO = 2;
  private static int PFL_PARAMETRI_BARRACAPITOL = 3;
  private static int PFL_PARAMETRI_ARTICOLO = 4;
  private static int PFL_PARAMETRI_SCELTACAPITO = 5;
  private static int PFL_PARAMETRI_ELABORALABEL = 6;
  private static int PFL_PARAMETRI_PROGRUOG = 7;
  private static int PFL_PARAMETRI_NUOVAPROGUOG = 8;
  private static int PFL_PARAMETRI_UNITAORGANIZ = 9;
  private static int PFL_PARAMETRI_NUOVUNITORGA = 10;
  private static int PFL_PARAMETRI_ANCHEUOUTILI = 11;

  private static int PPQRY_PARAMETRI481 = 0;

  private static int PPQRY_SO4ANAUNIOR1 = 1;
  private static int PPQRY_SO4ANAUNIOR2 = 2;
  private static int PPQRY_SO4ANAUNIOR3 = 3;
  private static int PPQRY_SO4ANAUNIORG = 4;


  IDPanel PAN_PARAMETRI;
  CIDREObj BUK_ANOMALILIBRO;
  OBook BKW_ANOMALILIBRO;
  //
  // Template Pages constants
  private static int BUK_ANOMALILIBRO_MST_STAMANOMPAGE = 1;
  private static int BUK_ANOMALILIBRO_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_ANOMALILIBRO_SPAN_NUMEROPAGINA = 3;
  private static int BUK_ANOMALILIBRO_RPTBOX_PAGEHEADER = 4;
  private static int BUK_ANOMALILIBRO_RPTBOX_PAGEBODY = 5;
  private static int BUK_ANOMALILIBRO_RPTBOX_PAGEFOOTER = 6;

  //
  // Reports constants
  private static int BUK_ANOMALILIBRO_RPT_ELENCOANOMAL = 7;
  private static int BUK_ANOMALILIBRO_SEC_REPORTHEADER = 8;
  private static int BUK_ANOMALILIBRO_SEC_PAGEHEADER = 9;
  private static int BUK_ANOMALILIBRO_RPTBOX_DISPOSIZIONI = 10;
  private static int BUK_ANOMALILIBRO_SPAN_DISPOSIZIONI = 11;
  private static int BUK_ANOMALILIBRO_RPTBOX_NUMERO1 = 12;
  private static int BUK_ANOMALILIBRO_SPAN_NUMERO = 13;
  private static int BUK_ANOMALILIBRO_RPTBOX_DESCRIZIONE1 = 14;
  private static int BUK_ANOMALILIBRO_SPAN_DESCRIZIONE = 15;
  private static int BUK_ANOMALILIBRO_SEC_DETAIL = 16;
  private static int BUK_ANOMALILIBRO_RPTBOX_NUMERO = 17;
  private static int BUK_ANOMALILIBRO_SPAN_REWREPRUSCAL = 18;
  private static int BUK_ANOMALILIBRO_RPTBOX_DESCRIZIONE = 19;
  private static int BUK_ANOMALILIBRO_SPAN_REWREERUSCAL = 20;
  private static int BUK_ANOMALILIBRO_SEC_PAGEFOOTER = 21;
  private static int BUK_ANOMALILIBRO_SEC_REPORTFOOTER = 22;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI482(IMDB);
    Init_TBL_PARAMETRIOL8(IMDB);
    //
    //
    Init_PQRY_PARAMETRI481(IMDB);
    Init_PQRY_PARAMETRI481_RS(IMDB);
    Init_PQRY_WRKERRORI4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI482(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI482, 8);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI482, "TBL_PARAMETRI482");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARAMCAPITOL,1,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOG, "PARAMPROGUOG");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOG,1,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOG, "PARNUOPROUOG");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOG,1,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARAANCUOUTI, "PARAANCUOUTI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARAANCUOUTI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOU, "PARAMPROGUOU");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOU,1,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOU, "PARNUOPROUOU");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI482,IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOU,1,8,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI482, 0);
  }

  private static void Init_TBL_PARAMETRIOL8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRIOL8, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRIOL8, "TBL_PARAMETRIOL8");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRIOL8,IMDBDef3.FLD_PARAMETRIOL8_CAPITOLOOLD, "CAPITOLOOLD");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRIOL8,IMDBDef3.FLD_PARAMETRIOL8_CAPITOLOOLD,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRIOL8,IMDBDef3.FLD_PARAMETRIOL8_ARTICOLOOLD, "ARTICOLOOLD");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRIOL8,IMDBDef3.FLD_PARAMETRIOL8_ARTICOLOOLD,1,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRIOL8, 0);
  }

  private static void Init_PQRY_PARAMETRI481(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI481, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI481, "PQRY_PARAMETRI481");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL,1,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOG, "PARAMPROGUOG");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOG,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOG, "PARNUOPROUOG");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOG,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOU, "PARAMPROGUOU");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOU,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOU, "PARNUOPROUOU");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOU,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARAANCUOUTI, "PARAANCUOUTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481,IMDBDef11.PQSL_PARAMETRI481_PARAANCUOUTI,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI481, 0);
  }

  private static void Init_PQRY_PARAMETRI481_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI481_RS, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI481_RS, "PQRY_PARAMETRI481_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL,1,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOG, "PARAMPROGUOG");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOG,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOG, "PARNUOPROUOG");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOG,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOU, "PARAMPROGUOU");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOU,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOU, "PARNUOPROUOU");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOU,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARAANCUOUTI, "PARAANCUOUTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI481_RS,IMDBDef11.PQSL_PARAMETRI481_PARAANCUOUTI,5,2,0);
  }

  private static void Init_PQRY_WRKERRORI4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_WRKERRORI4, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_WRKERRORI4, "PQRY_WRKERRORI4");
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKERRORI4,IMDBDef11.PQSL_WRKERRORI4_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKERRORI4,IMDBDef11.PQSL_WRKERRORI4_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKERRORI4,IMDBDef11.PQSL_WRKERRORI4_ERRORE, "ERRORE");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKERRORI4,IMDBDef11.PQSL_WRKERRORI4_ERRORE,5,300,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_WRKERRORI4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RettificaUOSuCapitolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public RettificaUOSuCapitolo()
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
    FormIdx = MyGlb.FRM_RETTUOSUCAPI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "17453AD4-BEAB-4A45-A746-20C60791239C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 540;
    DesignHeight = 330;
    set_Caption(new IDVariant("Rettifica Unità Organizzativa su Capitolo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 540;
    Frames[1].Height = 304;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 304;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 540-MyGlb.PAN_OFFS_X, 304-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "20DB3139-812F-47DB-94A1-7FF06AF95798");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 580, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    BKW_ANOMALILIBRO = new OBook(this);
    BUK_ANOMALILIBRO = new CIDREObj(BKW_ANOMALILIBRO);
    BKW_ANOMALILIBRO.iGuid = "3250C304-EEEF-4099-93D5-2E73D733EC65";
    BKW_ANOMALILIBRO.Code = "BUK_ANOMALILIBRO";
    BKW_ANOMALILIBRO.BookObj = BUK_ANOMALILIBRO;
    BKW_ANOMALILIBRO.InitDefMasks();
    BUK_ANOMALILIBRO.InitBook(1, 1245441, "Anomalie Libro", IMDB, MainFrm.VisualStyleList);
    BUK_ANOMALILIBRO.InitHTML();
    BUK_ANOMALILIBRO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ANOMALILIBRO.Book.SetMainFrm(MainFrm);
    BUK_ANOMALILIBRO.SetRTCGuid(0, "3250C304-EEEF-4099-93D5-2E73D733EC65");
    BUK_ANOMALILIBRO.SetObjCode(0, "ANOMALILIBRO");
    BUK_ANOMALILIBRO_MST_STAMANOMPAGE_Init();
    BUK_ANOMALILIBRO_RPT_ELENCOANOMAL_Init();
    BUK_ANOMALILIBRO_InitLinks();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI482, MyGlb.GlbRefModIdx) || IMDB.TblModified(IMDBDef3.TBL_PARAMETRI482, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RETTUOSUCAPI_PARAMETRI481();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_ANOMALILIBRO.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCELTACAPITO) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_ANOMALILIBRO")) return BUK_ANOMALILIBRO;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof RettificaUOSuCapitolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RettificaUOSuCapitolo.class.getName() : (Glb.ClassWithPackage(RettificaUOSuCapitolo.class) ? RettificaUOSuCapitolo.class.getName().substring(RettificaUOSuCapitolo.class.getPackage().getName().length() + 1) : RettificaUOSuCapitolo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ES)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOG, 0, (new IDVariant()));
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ARTICOLO)), true)) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMETRIOL8, IMDBDef3.FLD_PARAMETRIOL8_CAPITOLOOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMETRIOL8, IMDBDef3.FLD_PARAMETRIOL8_ARTICOLOOLD, 0),(new IDVariant(-1))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, 0))))
          {
            if (MainFrm.ControlloVocePegValida(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMES, 0), (new IDVariant()), new IDVariant(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, 0)).equals((new IDVariant(0)), true))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Capitolo non è presente nel Piano dei Conti"));
              MainFrm.set_AlertMessage(v_AVVISO); 
              IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, 0, (new IDVariant()));
            }
            else
            {
              IDVariant v_UOCAPITOLO = new IDVariant(0,IDVariant.INTEGER);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  MAX(A.PROGR_UNITA_ORGANIZZATIVA) as MACAUOPRUNOR ");
              SQL.append("from ");
              SQL.append("  CAP_UO A ");
              SQL.append("where (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
              SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
              SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_UOCAPITOLO = QV.Get("MACAUOPRUNOR", IDVariant.INTEGER) ;
              }
              QV.Close();
              IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOG, 0, new IDVariant(v_UOCAPITOLO));
              if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAANCUOUTI, 0).equals((new IDVariant("SI")), true))
              {
                IDVariant v_PROGR = null;
                v_PROGR = (new IDVariant());
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  MIN(A.PROGR_UNITA_ORGANIZZATIVA) as MICAUOPRUNOR ");
                SQL.append("from ");
                SQL.append("  CAP_UO A ");
                SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'U') ");
                SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_PROGR = QV.Get("MICAUOPRUNOR", IDVariant.INTEGER) ;
                }
                QV.Close();
                if (!(IDL.IsNull(v_PROGR)))
                {
                  IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOU, 0, new IDVariant(v_PROGR));
                  if (v_PROGR.equals(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOG, 0), true))
                  {
                    IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOU, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOG, 0));
                  }
                }
              }
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOG, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRIOL8, IMDBDef3.FLD_PARAMETRIOL8_CAPITOLOOLD, 0, new IDVariant(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, 0),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRIOL8, IMDBDef3.FLD_PARAMETRIOL8_ARTICOLOOLD, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOSuCapitolo", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAANCUOUTI, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOU, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOU, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOSuCapitolo", "ParametriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOSuCapitolo", "EndModalEvent", _e);
    }
  }

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
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAANCUOUTI, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOSuCapitolo", "LoadEvent", _e);
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
      UNLOAD_PARAMEDELETE();
      UNLOAD_PARAMOLDDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOSuCapitolo", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMCAPITOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMARTICOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAANCUOUTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOU, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri Old: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOAD_PARAMOLDDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRIOL8, IMDBDef3.FLD_PARAMETRIOL8_CAPITOLOOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRIOL8, IMDBDef3.FLD_PARAMETRIOL8_ARTICOLOOLD, 0, new IDVariant());
  }

  // **********************************************************************
  // Selezione Voce P E G
  // **********************************************************************
  public int SelezioneVocePEG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Voce P E G Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMES, 0));
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("B")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("O")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
      }
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOSuCapitolo", "SelezioneVocePEG", _e);
      return -1;
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

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Indicare un Capitolo"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOG, 0)) || IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOG, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Indicare l'Unità Organizzativa"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOG, 0).equals(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOG, 0), true))
      {
        IDVariant v_AVVISOBLOCCA = new IDVariant(0,IDVariant.STRING);
        v_AVVISOBLOCCA = (new IDVariant("L'Unità Organizzativa è già associata al Capitolo"));
        MainFrm.set_AlertMessage(v_AVVISOBLOCCA); 
        return 0;
      }
      IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_SCADENZAUO = new IDVariant(0,IDVariant.DATETIME);
      v_SCADENZAUO = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  MIN(A.SCADENZA) as MINCAPUOSCAD ");
      SQL.append("from ");
      SQL.append("  CAP_UO A ");
      SQL.append("where (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
      SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_SCADENZAUO = QV.Get("MINCAPUOSCAD", IDVariant.DATETIME) ;
      }
      QV.Close();
      if (v_NUMREC.compareTo((new IDVariant(0)), true)>0 && IDL.NullValue(v_SCADENZAUO,(new IDVariant("2999/12/31# 00:00:00", IDVariant.DATETIME))).compareTo(IDL.Today(), true)>0)
      {
        if (IDL.NullValue(v_SCADENZAUO,(new IDVariant("2999/12/31# 00:00:00", IDVariant.DATETIME))).compareTo(IDL.Today(), true)<0)
        {
          IDVariant v_AVVISNONBLOC = new IDVariant(0,IDVariant.STRING);
          v_AVVISNONBLOC = (new IDVariant("L'unità organizzativa è già associata al Capitolo ed è scaduta. Riabilitarla?"));
          if (!(MainFrm.MessageConfirm(v_AVVISNONBLOC)))
          {
            return 0;
          }
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.RETTIFICAUOVOCEPEG(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMES, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMCAPITOL, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMARTICOL, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOG, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOG, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOU, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOU, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Elaborazione terminata"));
        IDVariant v_AVVISCONANOM = new IDVariant(0,IDVariant.STRING);
        v_AVVISCONANOM = (new IDVariant("Elaborazione terminata con anomalie"));
        BUK_ANOMALILIBRO.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_ANOMALILIBRO.RefreshQuery();
        BUK_ANOMALILIBRO.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
        if ((new IDVariant(BUK_ANOMALILIBRO.GetReportTotalRecords(BUK_ANOMALILIBRO_RPT_ELENCOANOMAL))).compareTo((new IDVariant(0)), true)>0)
        {
          MainFrm.set_RedirectTo((new IDVariant(BUK_ANOMALILIBRO.GetWebFileName())));
          MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
          MainFrm.set_RedirectFeatures((new IDVariant(""))); 
          MainFrm.set_AlertMessage(v_AVVISCONANOM); 
        }
        else
        {
          MainFrm.set_AlertMessage(v_AVVISO); 
        }
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMCAPITOL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRIOL8, IMDBDef3.FLD_PARAMETRIOL8_CAPITOLOOLD, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMARTICOL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRIOL8, IMDBDef3.FLD_PARAMETRIOL8_ARTICOLOOLD, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOU, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOU, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOSuCapitolo", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Anche U O Utilizzo Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_ANCHEUOUTILI_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Anche U O Utilizzo Validate Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAANCUOUTI, 0).equals((new IDVariant("SI")), true))
      {
        IDVariant v_PROGR = null;
        v_PROGR = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.PROGR_UNITA_ORGANIZZATIVA) as MICAUOPRUNOR ");
        SQL.append("from ");
        SQL.append("  CAP_UO A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMCAPITOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMARTICOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'U') ");
        SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_PROGR = QV.Get("MICAUOPRUNOR", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_PROGR)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOU, 0, new IDVariant(v_PROGR));
          if (v_PROGR.equals(IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARAMPROGUOG, 0), true))
          {
            IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOU, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI481, IMDBDef11.PQSL_PARAMETRI481_PARNUOPROUOG, 0));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOSuCapitolo", "ParametriAncheUOUtilizzoValidate", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RETTUOSUCAPI_PARAMETRI481() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETRI481_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI482, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI482, 0))
    {
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOG, 0).equals(IMDB.Value(IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOG, 0), true))
      {
        IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI481_RS, 0);
        IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETRI481_RS, 0, IMDBDef3.TBL_PARAMETRI482, 0);
        IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI481_RS, 0, 0, IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMCAPITOL, 0);
        IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI481_RS, 1, 0, IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMARTICOL, 0);
        IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI481_RS, 2, 0, IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOG, 0);
        IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI481_RS, 3, 0, IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOG, 0);
        IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI481_RS, 4, 0, IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMES, 0);
        IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI481_RS, 5, 0, IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOU, 0);
        IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI481_RS, 6, 0, IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOU, 0);
        IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI481_RS, 7, 0, IMDBDef3.TBL_PARAMETRI482, IMDBDef3.FLD_PARAMETRI482_PARAANCUOUTI, 0);
      }
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI482, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI482, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI482, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETRI481_RS, 0);
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_SCELTACAPITO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneVocePEG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORALABEL)
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
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_ANCHEUOUTILI)
      {
        PFL_PARAMETRI_ANCHEUOUTILI_ValidateCell(Cancel);
      }
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

  private void BUK_ANOMALILIBRO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ANOMALILIBRO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ANOMALILIBRO_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_ANOMALILIBRO_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_ANOMALILIBRO_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_ANOMALILIBRO_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_ANOMALILIBRO_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_ANOMALILIBRO_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ANOMALILIBRO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ANOMALILIBRO_MST_STAMANOMPAGE)
    {
      BUK_ANOMALILIBRO.set_SpanValue(BUK_ANOMALILIBRO_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ANOMALILIBRO.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ANOMALILIBRO.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_ANOMALILIBRO_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ANOMALILIBRO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ANOMALILIBRO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ANOMALILIBRO_OnPreview()
  {
    PreviewBook = BKW_ANOMALILIBRO;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIGESTI, "AB9B6130-22BA-40C7-99E9-C96DCB0C5F1A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIGESTI, "Unità di Gestione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIGESTI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIGESTI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIGESTI, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIGESTI, MyGlb.PANEL_FORM, 8, 66, 484, 62, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIGESTI, 0, 96);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIGESTI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIGESTI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIGESTI, 1, 2);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIGESTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, "F5058EBF-70F2-48C5-8EDE-2FDAAF1FBF24");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, "Unità di Utilizzo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, MyGlb.PANEL_LIST, 0, -9999, 108, 10, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, MyGlb.PANEL_FORM, 8, 162, 484, 62, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, 0, 87);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, 0, 2);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, 1, 2);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_UNITADIUTILI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITARTLABE, "0D915349-9699-4C0F-A2E3-8D08971B0AB6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITARTLABE, "Capitolo/Art.");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITARTLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITARTLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, "93409458-A611-4CC6-825C-6A8ECE1756A0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, "Parte");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, "2306ED46-DC1E-429E-AEA7-F840C3D39800");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, "Capitolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, "1FE3C5A3-8EF7-4637-8C79-FA0D18D057D0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, "81C3BDBA-236C-4767-B60F-4973D3C5A3DB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, "Articolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTACAPITO, "970BC62A-A5AF-496A-B30D-129941357DA4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTACAPITO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTACAPITO, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTACAPITO, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTACAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, "715B866B-0D08-4BF8-A10B-5660893801E1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, "ED8EC690-35BE-45CF-812A-3B24AD3C0AC7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, "Unità Organizzativa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, "7435FA02-5189-4200-B1DD-C9800C77FD31");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, "Nuova Unità Organizzativa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, "B202CDC1-6AD0-4690-850A-FF70EFE15F1A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, "Unità Organizzativa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, "F61E6BFF-A073-45C5-974C-4F322E603A4C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, "Nuova Unità Organizzativa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, "A9202D6B-6C1C-47A1-AB00-9CBFA90EF140");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, "Anche U.O. Utilizzo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITARTLABE, MyGlb.PANEL_LIST, 12, 132, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITARTLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITARTLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITARTLABE, MyGlb.PANEL_FORM, 80, 32, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITARTLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITARTLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPITARTLABE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPITARTLABE, -1, "", "CAPITARTLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_FORM, 128, 8, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ES, PPQRY_PARAMETRI481, "A.PARAMES", "PARAMES", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, 180, 32, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPITOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPITOLO, PPQRY_PARAMETRI481, "A.PARAMCAPITOL", "PARAMCAPITOL", 1, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.PANEL_LIST, 176, 144, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.PANEL_FORM, 304, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRACAPITOL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRACAPITOL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRACAPITOL, -1, "", "BARRACAPITOL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, 324, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ARTICOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ARTICOLO, PPQRY_PARAMETRI481, "A.PARAMARTICOL", "PARAMARTICOL", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTACAPITO, MyGlb.PANEL_LIST, 612, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTACAPITO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTACAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTACAPITO, MyGlb.PANEL_FORM, 348, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTACAPITO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTACAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCELTACAPITO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCELTACAPITO, -1, "", "SCELTACAPITO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 316, 144, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 408, 236, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORALABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORALABEL, -1, "", "ELABORALABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, MyGlb.PANEL_LIST, "Un. Org.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, MyGlb.PANEL_FORM, 20, 80, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, MyGlb.PANEL_FORM, 156);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUOG, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROGRUOG, -1, GRP_PARAMETRI_UNITADIGESTI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROGRUOG, PPQRY_PARAMETRI481, "A.PARAMPROGUOG", "PARAMPROGUOG", 1, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, MyGlb.PANEL_LIST, "Nv. Un. Organiz.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, MyGlb.PANEL_FORM, 12, 104, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, MyGlb.PANEL_FORM, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVAPROGUOG, MyGlb.PANEL_FORM, "Nuova Unità Organizzativa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUOVAPROGUOG, -1, GRP_PARAMETRI_UNITADIGESTI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUOVAPROGUOG, PPQRY_PARAMETRI481, "A.PARNUOPROUOG", "PARNUOPROUOG", 1, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_LIST, "Un. Organ.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_FORM, 32, 176, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_FORM, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UNITAORGANIZ, -1, GRP_PARAMETRI_UNITADIUTILI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UNITAORGANIZ, PPQRY_PARAMETRI481, "A.PARAMPROGUOU", "PARAMPROGUOU", 1, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, MyGlb.PANEL_LIST, "Nuov. Un. Organiz.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, MyGlb.PANEL_FORM, 12, 200, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, MyGlb.PANEL_FORM, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVUNITORGA, MyGlb.PANEL_FORM, "Nuova Unità Organizzativa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUOVUNITORGA, -1, GRP_PARAMETRI_UNITADIUTILI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUOVUNITORGA, PPQRY_PARAMETRI481, "A.PARNUOPROUOU", "PARNUOPROUOU", 1, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, MyGlb.PANEL_LIST, "Anche U.O. Utilizzo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, MyGlb.PANEL_FORM, 64, 132, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOUTILI, MyGlb.PANEL_FORM, "Anche U.O. Utilizzo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANCHEUOUTILI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANCHEUOUTILI, PPQRY_PARAMETRI481, "A.PARAANCUOUTI", "PARAANCUOUTI", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCHEUOUTILI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCHEUOUTILI, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOU1, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PARAMPROGUOG~~) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN A.DAL AND NVL(A.AL, TRUNC( SYSDATE )))) ");
    SQL.append("order by 2, 3, 4 ");
    PAN_PARAMETRI.SetQuery(PPQRY_SO4ANAUNIOR1, 0, SQL, PFL_PARAMETRI_PROGRUOG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOU1, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN A.DAL AND NVL(A.AL, TRUNC( SYSDATE )))) ");
    SQL.append("order by 2, 3, 4 ");
    PAN_PARAMETRI.SetQuery(PPQRY_SO4ANAUNIOR1, 1, SQL, PFL_PARAMETRI_PROGRUOG, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_SO4ANAUNIOR1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PARNUOPROUOG~~) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN A.DAL AND NVL(A.AL, TRUNC( SYSDATE )))) ");
    SQL.append("order by 2, 3, 4 ");
    PAN_PARAMETRI.SetQuery(PPQRY_SO4ANAUNIOR2, 0, SQL, PFL_PARAMETRI_NUOVAPROGUOG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN A.DAL AND NVL(A.AL, TRUNC( SYSDATE )))) ");
    SQL.append("order by 2, 3, 4 ");
    PAN_PARAMETRI.SetQuery(PPQRY_SO4ANAUNIOR2, 1, SQL, PFL_PARAMETRI_NUOVAPROGUOG, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_SO4ANAUNIOR2, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOU1, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PARAMPROGUOU~~) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN A.DAL AND NVL(A.AL, TRUNC( SYSDATE )))) ");
    SQL.append("order by 2, 3, 4 ");
    PAN_PARAMETRI.SetQuery(PPQRY_SO4ANAUNIOR3, 0, SQL, PFL_PARAMETRI_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOU1, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN A.DAL AND NVL(A.AL, TRUNC( SYSDATE )))) ");
    SQL.append("order by 2, 3, 4 ");
    PAN_PARAMETRI.SetQuery(PPQRY_SO4ANAUNIOR3, 1, SQL, PFL_PARAMETRI_UNITAORGANIZ, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_SO4ANAUNIOR3, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PARNUOPROUOU~~) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN A.DAL AND NVL(A.AL, TRUNC( SYSDATE )))) ");
    SQL.append("order by 2, 3, 4 ");
    PAN_PARAMETRI.SetQuery(PPQRY_SO4ANAUNIORG, 0, SQL, PFL_PARAMETRI_NUOVUNITORGA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN A.DAL AND NVL(A.AL, TRUNC( SYSDATE )))) ");
    SQL.append("order by 2, 3, 4 ");
    PAN_PARAMETRI.SetQuery(PPQRY_SO4ANAUNIORG, 1, SQL, PFL_PARAMETRI_NUOVUNITORGA, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_SO4ANAUNIORG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI481", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI481, IMDBDef11.PQRY_PARAMETRI481_RS, IMDBDef3.TBL_PARAMETRI482);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ES, IMDBDef3.FLD_PARAMETRI482_PARAMES);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAPITOLO, IMDBDef3.FLD_PARAMETRI482_PARAMCAPITOL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ARTICOLO, IMDBDef3.FLD_PARAMETRI482_PARAMARTICOL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PROGRUOG, IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOG);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUOVAPROGUOG, IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOG);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UNITAORGANIZ, IMDBDef3.FLD_PARAMETRI482_PARAMPROGUOU);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUOVUNITORGA, IMDBDef3.FLD_PARAMETRI482_PARNUOPROUOU);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANCHEUOUTILI, IMDBDef3.FLD_PARAMETRI482_PARAANCUOUTI);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI482");
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

  private void BUK_ANOMALILIBRO_MST_STAMANOMPAGE_Init()
  {
    BUK_ANOMALILIBRO.InitMastro(BUK_ANOMALILIBRO_MST_STAMANOMPAGE, 3, 21000, 29700, 1, 2, 1);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_MST_STAMANOMPAGE, "AB15E6FC-A5C8-43F7-87F9-A1BECB6721E2");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_MST_STAMANOMPAGE, "STAMANOMPAGE");
    BUK_ANOMALILIBRO.InitMastroBox(BUK_ANOMALILIBRO_MST_STAMANOMPAGE, BUK_ANOMALILIBRO_RPTBOX_NUMEROPAGINA, 26700, 400, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_RPTBOX_NUMEROPAGINA, "B3303F67-5AA2-4969-8F09-D2DF2B8523C8");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ANOMALILIBRO.InitBoxSpan(BUK_ANOMALILIBRO_RPTBOX_NUMEROPAGINA, BUK_ANOMALILIBRO_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_SPAN_NUMEROPAGINA, "95BD433C-AA3E-4DF8-80C6-DD84A64368EB");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ANOMALILIBRO.InitMastroBox(BUK_ANOMALILIBRO_MST_STAMANOMPAGE, BUK_ANOMALILIBRO_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 2100, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_RPTBOX_PAGEHEADER, "2E7B647B-87F0-49E1-BA5E-8B1B92D6B709");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_ANOMALILIBRO.InitMastroBox(BUK_ANOMALILIBRO_MST_STAMANOMPAGE, BUK_ANOMALILIBRO_RPTBOX_PAGEBODY, 1000, 3100, 27700, 17100, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_RPTBOX_PAGEBODY, "002FC928-06F8-492A-9D07-5DBB89CE5E77");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_ANOMALILIBRO.InitMastroBox(BUK_ANOMALILIBRO_MST_STAMANOMPAGE, BUK_ANOMALILIBRO_RPTBOX_PAGEFOOTER, 1000, 20200, 27700, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_RPTBOX_PAGEFOOTER, "805E0DB4-C942-4375-A89E-AE10B34259C0");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_ANOMALILIBRO_RPT_ELENCOANOMAL_InitQuery() { BUK_ANOMALILIBRO_RPT_ELENCOANOMAL_InitQuery(true, true); }
  private void BUK_ANOMALILIBRO_RPT_ELENCOANOMAL_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.ERRORE as ERRORE ");
      SQL.append("from ");
      SQL.append("  WRK_ERRORI A ");
      SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      SQL.append("order by ");
      SQL.append("  A.PROGRESSIVO ");
      BUK_ANOMALILIBRO.SetReportQuery(BUK_ANOMALILIBRO_RPT_ELENCOANOMAL, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "035E8319-8F9F-4723-A1C6-A760B25DA0AE");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ANOMALILIBRO_RPT_ELENCOANOMAL_Init()
  {
    BUK_ANOMALILIBRO.InitReport(BUK_ANOMALILIBRO_RPT_ELENCOANOMAL, 196865);
    BUK_ANOMALILIBRO_RPT_ELENCOANOMAL_InitQuery(true, false);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_RPT_ELENCOANOMAL, "9B23D164-3643-42E0-B64F-68D77E925F9F");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_RPT_ELENCOANOMAL, "ELENCOANOMAL");
    BUK_ANOMALILIBRO.InitSection(BUK_ANOMALILIBRO_RPT_ELENCOANOMAL, BUK_ANOMALILIBRO_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 9240577, "");
    BUK_ANOMALILIBRO.SetSectionRendersInto(BUK_ANOMALILIBRO_SEC_REPORTHEADER, BUK_ANOMALILIBRO_RPTBOX_PAGEBODY);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_SEC_REPORTHEADER, "04C9D032-1918-4176-87A2-E406F3C02223");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_ANOMALILIBRO.InitSection(BUK_ANOMALILIBRO_RPT_ELENCOANOMAL, BUK_ANOMALILIBRO_SEC_PAGEHEADER, 2100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ANOMALILIBRO.SetSectionRendersInto(BUK_ANOMALILIBRO_SEC_PAGEHEADER, BUK_ANOMALILIBRO_RPTBOX_PAGEHEADER);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_SEC_PAGEHEADER, "8B055C42-CB31-4F83-BB8C-182117CDF2BC");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ANOMALILIBRO.InitReportBox(BUK_ANOMALILIBRO_SEC_PAGEHEADER, BUK_ANOMALILIBRO_RPTBOX_DISPOSIZIONI, 100, 0, 27500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_RPTBOX_DISPOSIZIONI, "4EC8D947-2ED8-42F7-8E2B-F883B71A2EE7");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_RPTBOX_DISPOSIZIONI, "DISPOSIZIONI");
    BUK_ANOMALILIBRO.InitBoxSpan(BUK_ANOMALILIBRO_RPTBOX_DISPOSIZIONI, BUK_ANOMALILIBRO_SPAN_DISPOSIZIONI, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Elenco Anomalie", 1);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_SPAN_DISPOSIZIONI, "253B866B-AF49-4D15-BD12-8F906332732E");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_SPAN_DISPOSIZIONI, "DISPOSIZIONI");
    BUK_ANOMALILIBRO.InitReportBox(BUK_ANOMALILIBRO_SEC_PAGEHEADER, BUK_ANOMALILIBRO_RPTBOX_NUMERO1, 0, 1500, 2600, 600, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_RPTBOX_NUMERO1, "5DDDA312-D42A-4258-874C-DBE74D7C2560");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_RPTBOX_NUMERO1, "NUMERO1");
    BUK_ANOMALILIBRO.InitBoxSpan(BUK_ANOMALILIBRO_RPTBOX_NUMERO1, BUK_ANOMALILIBRO_SPAN_NUMERO, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271319425, "", "Numero", 1);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_SPAN_NUMERO, "C488B3D0-9BAF-48F3-A33C-2264DF9328D8");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_SPAN_NUMERO, "NUMERO");
    BUK_ANOMALILIBRO.InitReportBox(BUK_ANOMALILIBRO_SEC_PAGEHEADER, BUK_ANOMALILIBRO_RPTBOX_DESCRIZIONE1, 2600, 1500, 25000, 600, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_RPTBOX_DESCRIZIONE1, "DDBD0190-F1AE-4AC2-99BF-2A9C38082DE8");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_RPTBOX_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_ANOMALILIBRO.InitBoxSpan(BUK_ANOMALILIBRO_RPTBOX_DESCRIZIONE1, BUK_ANOMALILIBRO_SPAN_DESCRIZIONE, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271319425, "", "Descrizione", 1);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_SPAN_DESCRIZIONE, "2C7C88D3-F1A2-4570-887D-85AF5A2F21D8");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_ANOMALILIBRO.InitSection(BUK_ANOMALILIBRO_RPT_ELENCOANOMAL, BUK_ANOMALILIBRO_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ANOMALILIBRO.SetSectionRendersInto(BUK_ANOMALILIBRO_SEC_DETAIL, BUK_ANOMALILIBRO_RPTBOX_PAGEBODY);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_SEC_DETAIL, "3D2E5923-3854-493A-A4CE-7D9DE40F8F0C");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_SEC_DETAIL, "DETAIL");
    BUK_ANOMALILIBRO.InitReportBox(BUK_ANOMALILIBRO_SEC_DETAIL, BUK_ANOMALILIBRO_RPTBOX_NUMERO, 0, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_RPTBOX_NUMERO, "5D833309-84EF-4266-880B-E595838C3CF1");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_RPTBOX_NUMERO, "NUMERO");
    BUK_ANOMALILIBRO.InitBoxSpan(BUK_ANOMALILIBRO_RPTBOX_NUMERO, BUK_ANOMALILIBRO_SPAN_REWREPRUSCAL, MyGlb.VIS_BOX, 3, 10, 6, 271384705, "", "::PROGRESSIVO", 1);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_SPAN_REWREPRUSCAL, "62388705-B00B-4DB0-A82F-8BD29CF439F0");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_SPAN_REWREPRUSCAL, "REWREPRUSCAL");
    BUK_ANOMALILIBRO.InitReportBox(BUK_ANOMALILIBRO_SEC_DETAIL, BUK_ANOMALILIBRO_RPTBOX_DESCRIZIONE, 2600, 0, 25000, 600, 0, 1, 1, MyGlb.VIS_BOX, 983041, 375, "", 1, -33);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_RPTBOX_DESCRIZIONE, "9FC79CDE-8504-4215-8DA2-15FC14843A7D");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_ANOMALILIBRO.InitBoxSpan(BUK_ANOMALILIBRO_RPTBOX_DESCRIZIONE, BUK_ANOMALILIBRO_SPAN_REWREERUSCAL, MyGlb.VIS_BOX, 5, 300, 0, 271384705, "", "::ERRORE", 1);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_SPAN_REWREERUSCAL, "B07CA0EE-C05A-4567-ADAC-CCC704BC560E");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_SPAN_REWREERUSCAL, "REWREERUSCAL");
    BUK_ANOMALILIBRO.InitSection(BUK_ANOMALILIBRO_RPT_ELENCOANOMAL, BUK_ANOMALILIBRO_SEC_PAGEFOOTER, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_ANOMALILIBRO.SetSectionRendersInto(BUK_ANOMALILIBRO_SEC_PAGEFOOTER, BUK_ANOMALILIBRO_RPTBOX_PAGEFOOTER);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_SEC_PAGEFOOTER, "0B4DA9CD-53CC-420D-A88A-E0349C223DC0");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_ANOMALILIBRO.InitSection(BUK_ANOMALILIBRO_RPT_ELENCOANOMAL, BUK_ANOMALILIBRO_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_ANOMALILIBRO.SetSectionRendersInto(BUK_ANOMALILIBRO_SEC_REPORTFOOTER, BUK_ANOMALILIBRO_RPTBOX_PAGEBODY);
    BUK_ANOMALILIBRO.SetRTCGuid(BUK_ANOMALILIBRO_SEC_REPORTFOOTER, "BAA90B5F-B537-4B9F-A5A5-CFC17385A2EC");
    BUK_ANOMALILIBRO.SetObjCode(BUK_ANOMALILIBRO_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ANOMALILIBRO_RPT_ELENCOANOMAL_InitQuery(false, true);
  }

  private void BUK_ANOMALILIBRO_InitLinks()
  {
    BUK_ANOMALILIBRO.SetBoxNextBox(BUK_ANOMALILIBRO_RPTBOX_PAGEBODY, BUK_ANOMALILIBRO_RPTBOX_PAGEBODY);
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
    if (SrcObj == BKW_ANOMALILIBRO) BUK_ANOMALILIBRO_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ANOMALILIBRO) BUK_ANOMALILIBRO_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ANOMALILIBRO) BUK_ANOMALILIBRO_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ANOMALILIBRO) BUK_ANOMALILIBRO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ANOMALILIBRO) BUK_ANOMALILIBRO_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ANOMALILIBRO) BUK_ANOMALILIBRO_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ANOMALILIBRO) BUK_ANOMALILIBRO_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ANOMALILIBRO) BUK_ANOMALILIBRO_OnPreview();
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
