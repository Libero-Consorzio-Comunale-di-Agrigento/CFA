// **********************************************
// Classi Contabili
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ClassiContabili extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CLASSICONTAB_CODICE = 0;
  private static int PFL_CLASSICONTAB_DESCRIZIONE = 1;
  private static int PFL_CLASSICONTAB_FATTURRICEV1 = 2;
  private static int PFL_CLASSICONTAB_FATTUREMESS1 = 3;
  private static int PFL_CLASSICONTAB_LIQUIDAZION1 = 4;
  private static int PFL_CLASSICONTAB_ORDINATIVI1 = 5;
  private static int PFL_CLASSICONTAB_FATTURRICEVU = 6;
  private static int PFL_CLASSICONTAB_FATTUREMESSE = 7;
  private static int PFL_CLASSICONTAB_LIQUIDAZIONI = 8;
  private static int PFL_CLASSICONTAB_ORDINATIVI = 9;
  private static int PFL_CLASSICONTAB_UTENTEINSERI = 10;
  private static int PFL_CLASSICONTAB_DATAINSERIME = 11;
  private static int PFL_CLASSICONTAB_UTENTULTIAGG = 12;
  private static int PFL_CLASSICONTAB_DATAULTIMAGG = 13;

  private static int PPQRY_IMPECOBEN1 = 0;

  private static int PPQRY_FATTURRICEVU = 1;
  private static int PPQRY_FATTUREMESSE = 2;
  private static int PPQRY_LIQUIDAZIONI = 3;
  private static int PPQRY_ORDINATIVI = 4;


  IDPanel PAN_CLASSICONTAB;
  CIDREObj BUK_CLASCONTBOOK;
  OBook BKW_CLASCONTBOOK;
  //
  // Template Pages constants
  private static int BUK_CLASCONTBOOK_MST_CLACONBOOPAG = 1;
  private static int BUK_CLASCONTBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CLASCONTBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CLASCONTBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_CLASCONTBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_CLASCONTBOOK_RPT_NEWREPORT = 6;
  private static int BUK_CLASCONTBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_CLASCONTBOOK_SEC_PAGEHEADER = 8;
  private static int BUK_CLASCONTBOOK_RPTBOX_CODICEHEADER = 9;
  private static int BUK_CLASCONTBOOK_SPAN_CODICE = 10;
  private static int BUK_CLASCONTBOOK_RPTBOX_DESCRIHEADER = 11;
  private static int BUK_CLASCONTBOOK_SPAN_DESCRIZIONE = 12;
  private static int BUK_CLASCONTBOOK_RPTBOX_FATFATFORHEA = 13;
  private static int BUK_CLASCONTBOOK_SPAN_FATTURRICEVU = 14;
  private static int BUK_CLASCONTBOOK_RPTBOX_FATFATCLIHEA = 15;
  private static int BUK_CLASCONTBOOK_SPAN_FATTUREMESSE = 16;
  private static int BUK_CLASCONTBOOK_RPTBOX_FATLIQFORHEA = 17;
  private static int BUK_CLASCONTBOOK_SPAN_LIQUIDAZIONI = 18;
  private static int BUK_CLASCONTBOOK_RPTBOX_FATPRECLIHEA = 19;
  private static int BUK_CLASCONTBOOK_SPAN_ORDINATIVI = 20;
  private static int BUK_CLASCONTBOOK_SEC_TITOLO = 21;
  private static int BUK_CLASCONTBOOK_RPTBOX_NEWBOX5 = 22;
  private static int BUK_CLASCONTBOOK_SPAN_VARIADIBILAN = 23;
  private static int BUK_CLASCONTBOOK_SEC_DETAIL = 24;
  private static int BUK_CLASCONTBOOK_RPTBOX_CODICE = 25;
  private static int BUK_CLASCONTBOOK_SPAN_IMECBECCCCCB = 26;
  private static int BUK_CLASCONTBOOK_RPTBOX_DESCRIZIONE = 27;
  private static int BUK_CLASCONTBOOK_SPAN_IMECBEDCCCCB = 28;
  private static int BUK_CLASCONTBOOK_RPTBOX_FATTORFATFOR = 29;
  private static int BUK_CLASCONTBOOK_SPAN_IMECBFRCCCCB = 30;
  private static int BUK_CLASCONTBOOK_RPTBOX_FATTORFATCLI = 31;
  private static int BUK_CLASCONTBOOK_SPAN_IMECBFECCCCB = 32;
  private static int BUK_CLASCONTBOOK_RPTBOX_FATTORLIQFOR = 33;
  private static int BUK_CLASCONTBOOK_SPAN_IMECBELCCCCB = 34;
  private static int BUK_CLASCONTBOOK_RPTBOX_FATTORPRECLI = 35;
  private static int BUK_CLASCONTBOOK_SPAN_IMECBEOCCCCB = 36;
  private static int BUK_CLASCONTBOOK_RPTBOX_NEWBOX = 37;
  private static int BUK_CLASCONTBOOK_SPAN_IMEBFD3CCCCB = 38;
  private static int BUK_CLASCONTBOOK_RPTBOX_NEWBOX1 = 39;
  private static int BUK_CLASCONTBOOK_SPAN_IMEBFD1CCCCB = 40;
  private static int BUK_CLASCONTBOOK_RPTBOX_NEWBOX2 = 41;
  private static int BUK_CLASCONTBOOK_SPAN_IMEBFD2CCCCB = 42;
  private static int BUK_CLASCONTBOOK_RPTBOX_NEWBOX3 = 43;
  private static int BUK_CLASCONTBOOK_SPAN_IMECBFDCCCCB = 44;
  private static int BUK_CLASCONTBOOK_RPTBOX_NEWBOX4 = 45;
  private static int BUK_CLASCONTBOOK_SEC_REPORTFOOTER = 46;


  // Definition of Global Variables
  private IDVariant FATTORE = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_IMPECOBEN1(IMDB);
    Init_PQRY_IMPECOBEN(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_IMPECOBEN1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_IMPECOBEN1, 10);
    IMDB.set_TblCode(IMDBDef9.PQRY_IMPECOBEN1, "PQRY_IMPECOBEN1");
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_CODICE,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_DESCRIZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_FATTORE_FAT_FOR, "FATTORE_FAT_FOR");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_FATTORE_FAT_FOR,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_FATTORE_FAT_CLI, "FATTORE_FAT_CLI");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_FATTORE_FAT_CLI,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_FATTORE_LIQ_FOR, "FATTORE_LIQ_FOR");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_FATTORE_LIQ_FOR,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_FATTORE_PRE_CLI, "FATTORE_PRE_CLI");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_FATTORE_PRE_CLI,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN1,IMDBDef9.PQSL_IMPECOBEN1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_IMPECOBEN1, 0);
  }

  private static void Init_PQRY_IMPECOBEN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_IMPECOBEN, 10);
    IMDB.set_TblCode(IMDBDef9.PQRY_IMPECOBEN, "PQRY_IMPECOBEN");
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_CODICE,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_DESCRIZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_FATTORE_FAT_FOR, "FATTORE_FAT_FOR");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_FATTORE_FAT_FOR,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_FATTORE_FAT_CLI, "FATTORE_FAT_CLI");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_FATTORE_FAT_CLI,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_FATTORE_LIQ_FOR, "FATTORE_LIQ_FOR");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_FATTORE_LIQ_FOR,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_FATTORE_PRE_CLI, "FATTORE_PRE_CLI");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_FATTORE_PRE_CLI,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_IMPECBEFADE1, "IMPECBEFADE1");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_IMPECBEFADE1,5,200,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_IMPECBEFADE2, "IMPECBEFADE2");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_IMPECBEFADE2,5,200,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_IMPECBEFADE3, "IMPECBEFADE3");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_IMPECBEFADE3,5,200,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_IMPECOBEFADE, "IMPECOBEFADE");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPECOBEN,IMDBDef9.PQSL_IMPECOBEN_IMPECOBEFADE,5,200,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_IMPECOBEN, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ClassiContabili(MyWebEntryPoint w, IMDBObj imdb)
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
  public ClassiContabili()
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
    FormIdx = MyGlb.FRM_CLASSICONTAB;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "62E9FB04-FE88-49E3-A9BB-372FE5702C93";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 860;
    DesignHeight = 506;
    set_Caption(new IDVariant("Classi Contabili"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 860;
    Frames[1].Height = 480;
    Frames[1].Caption = "Classi Contabili";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 480;
    PAN_CLASSICONTAB = new IDPanel(w, this, 1, "PAN_CLASSICONTAB");
    Frames[1].Content = PAN_CLASSICONTAB;
    PAN_CLASSICONTAB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CLASSICONTAB.VS = MainFrm.VisualStyleList;
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 860-MyGlb.PAN_OFFS_X, 480-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CLASCONTBOOK != null)
      PAN_CLASSICONTAB.SetBook(BUK_CLASCONTBOOK);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9F176D25-DE0E-4E7C-AB1C-A4A353D59423");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 812, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CLASSICONTAB.InitStatus = 2;
    PAN_CLASSICONTAB_Init();
    PAN_CLASSICONTAB_InitFields();
    PAN_CLASSICONTAB_InitQueries();
    BKW_CLASCONTBOOK = new OBook(this);
    BUK_CLASCONTBOOK = new CIDREObj(BKW_CLASCONTBOOK);
    BKW_CLASCONTBOOK.iGuid = "E6617206-60E7-4DFF-BA5C-2BF0145DF253";
    BKW_CLASCONTBOOK.Code = "BUK_CLASCONTBOOK";
    BKW_CLASCONTBOOK.BookObj = BUK_CLASCONTBOOK;
    BKW_CLASCONTBOOK.InitDefMasks();
    BUK_CLASCONTBOOK.InitBook(1, 1245185, "Classi Contabili Book", IMDB, MainFrm.VisualStyleList);
    BUK_CLASCONTBOOK.InitHTML();
    BUK_CLASCONTBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CLASCONTBOOK.Book.SetMainFrm(MainFrm);
    BUK_CLASCONTBOOK.SetRTCGuid(0, "E6617206-60E7-4DFF-BA5C-2BF0145DF253");
    BUK_CLASCONTBOOK.SetObjCode(0, "CLASCONTBOOK");
    if (PAN_CLASSICONTAB != null)
      PAN_CLASSICONTAB.SetBook(BUK_CLASCONTBOOK);
    BUK_CLASCONTBOOK_MST_CLACONBOOPAG_Init();
    BUK_CLASCONTBOOK_RPT_NEWREPORT_Init();
    BUK_CLASCONTBOOK_InitLinks();
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
      PAN_CLASSICONTAB.UpdatePanel(MainFrm);
      // BUK_CLASCONTBOOK.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_CLASSICONTAB.FrIndex)
    {
      if (IdxFieldActived ==PFL_CLASSICONTAB_FATTURRICEV1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_CLASSICONTAB.FrIndex)
    {
      if (IdxFieldActived ==PFL_CLASSICONTAB_FATTUREMESS1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_CLASSICONTAB.FrIndex)
    {
      if (IdxFieldActived ==PFL_CLASSICONTAB_LIQUIDAZION1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_CLASSICONTAB.FrIndex)
    {
      if (IdxFieldActived ==PFL_CLASSICONTAB_ORDINATIVI1) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_CLASCONTBOOK")) return BUK_CLASCONTBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ClassiContabili);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ClassiContabili.class.getName() : (Glb.ClassWithPackage(ClassiContabili.class) ? ClassiContabili.class.getName().substring(ClassiContabili.class.getPackage().getName().length() + 1) : ClassiContabili.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Classi Contabili On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_CLASSICONTAB_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CLASSICONTAB, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Classi Contabili On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "ClassiContabiliOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Classi Contabili On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CLASSICONTAB_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CLASSICONTAB);
      // 
      // Classi Contabili On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_CLASSICONTAB.set_ToolTip(Glb.OBJ_FIELD,PFL_CLASSICONTAB_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_DESCRIZIONE, 0).stringValue()); 
      PAN_CLASSICONTAB.set_ToolTip(Glb.OBJ_FIELD,PFL_CLASSICONTAB_FATTURRICEVU,(new IDVariant(PAN_CLASSICONTAB.FieldText(PFL_CLASSICONTAB_FATTURRICEVU))).stringValue()); 
      PAN_CLASSICONTAB.set_ToolTip(Glb.OBJ_FIELD,PFL_CLASSICONTAB_FATTUREMESSE,(new IDVariant(PAN_CLASSICONTAB.FieldText(PFL_CLASSICONTAB_FATTUREMESSE))).stringValue()); 
      PAN_CLASSICONTAB.set_ToolTip(Glb.OBJ_FIELD,PFL_CLASSICONTAB_LIQUIDAZIONI,(new IDVariant(PAN_CLASSICONTAB.FieldText(PFL_CLASSICONTAB_LIQUIDAZIONI))).stringValue()); 
      PAN_CLASSICONTAB.set_ToolTip(Glb.OBJ_FIELD,PFL_CLASSICONTAB_ORDINATIVI,(new IDVariant(PAN_CLASSICONTAB.FieldText(PFL_CLASSICONTAB_ORDINATIVI))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "ClassiContabiliOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Classi Contabili On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CLASSICONTAB_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Classi Contabili On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "ClassiContabiliOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Selezione Fatture Ricevute
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneFattureRicevute ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Fatture Ricevute Body
      // Procedure Body
      // 
      FATTORE = (new IDVariant(1));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMEFILTR, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "SelezioneFattureRicevute", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Fatture Emesse
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneFattureEmesse ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Fatture Emesse Body
      // Procedure Body
      // 
      FATTORE = (new IDVariant(2));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMEFILTR, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "SelezioneFattureEmesse", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Liquidazioni
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneLiquidazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Liquidazioni Body
      // Procedure Body
      // 
      FATTORE = (new IDVariant(3));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMEFILTR, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "SelezioneLiquidazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Selezione Ordinativi
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneSelezioneOrdinativi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Selezione Ordinativi Body
      // Procedure Body
      // 
      FATTORE = (new IDVariant(4));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMEFILTR, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "SelezioneSelezioneOrdinativi", _e);
      return -1;
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue() && FATTORE.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_FAT_FOR, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue() && FATTORE.equals((new IDVariant(2)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_FAT_CLI, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue() && FATTORE.equals((new IDVariant(3)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_LIQ_FOR, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue() && FATTORE.equals((new IDVariant(4)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_PRE_CLI, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "EndModalEvent", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      PAN_CLASSICONTAB.SetFlags (Glb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_CLASSICONTAB.SetFlags (Glb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_CLASSICONTAB.SetFlags (Glb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_CLASSICONTAB.SetFlags (Glb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Classi Contabili Fatture Ricevute  Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CLASSICONTAB_FATTURRICEV1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Classi Contabili Fatture Ricevute  Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_FAT_FOR, 0))))
      {
        if (MainFrm.FattorePresente(IMDB.Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_FAT_FOR, 0), IDL.Today(), (new IDVariant("SI"))).equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("Fattore non presente!"))); 
          IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_FAT_FOR, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "ClassiContabiliFattureRicevuteValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Classi Contabili Fatture Emesse 1 Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CLASSICONTAB_FATTUREMESS1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Classi Contabili Fatture Emesse 1 Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_FAT_CLI, 0))))
      {
        if (MainFrm.FattorePresente(IMDB.Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_FAT_CLI, 0), IDL.Today(), (new IDVariant("SI"))).equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("Fattore non presente!"))); 
          IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_FAT_CLI, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "ClassiContabiliFattureEmesse1ValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Classi Contabili Liquidazioni  Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CLASSICONTAB_LIQUIDAZION1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Classi Contabili Liquidazioni  Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_LIQ_FOR, 0))))
      {
        if (MainFrm.FattorePresente(IMDB.Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_LIQ_FOR, 0), IDL.Today(), (new IDVariant("SI"))).equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("Fattore non presente!"))); 
          IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_LIQ_FOR, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "ClassiContabiliLiquidazioniValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Classi Contabili Ordinativi  Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CLASSICONTAB_ORDINATIVI1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Classi Contabili Ordinativi  Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_PRE_CLI, 0))))
      {
        if (MainFrm.FattorePresente(IMDB.Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_PRE_CLI, 0), IDL.Today(), (new IDVariant("SI"))).equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage((new IDVariant("Fattore non presente!"))); 
          IMDB.set_Value(IMDBDef9.PQRY_IMPECOBEN1, IMDBDef9.PQSL_IMPECOBEN1_FATTORE_PRE_CLI, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ClassiContabili", "ClassiContabiliOrdinativiValidateEvent", _e);
    }
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CLASSICONTAB_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CLASSICONTAB, Cancel);
    // Stub
  }

  private void PAN_CLASSICONTAB_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CLASSICONTAB_FATTURRICEV1)
    {
      this.IdxPanelActived = this.PAN_CLASSICONTAB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattureRicevute();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CLASSICONTAB_FATTUREMESS1)
    {
      this.IdxPanelActived = this.PAN_CLASSICONTAB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattureEmesse();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CLASSICONTAB_LIQUIDAZION1)
    {
      this.IdxPanelActived = this.PAN_CLASSICONTAB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneLiquidazioni();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CLASSICONTAB_ORDINATIVI1)
    {
      this.IdxPanelActived = this.PAN_CLASSICONTAB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneSelezioneOrdinativi();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CLASSICONTAB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CLASSICONTAB_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CLASSICONTAB_FATTURRICEV1)
      {
        PFL_CLASSICONTAB_FATTURRICEV1_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CLASSICONTAB_FATTUREMESS1)
      {
        PFL_CLASSICONTAB_FATTUREMESS1_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CLASSICONTAB_LIQUIDAZION1)
      {
        PFL_CLASSICONTAB_LIQUIDAZION1_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CLASSICONTAB_ORDINATIVI1)
      {
        PFL_CLASSICONTAB_ORDINATIVI1_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_CLASSICONTAB_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CLASSICONTAB_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CLASCONTBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CLASCONTBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CLASCONTBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CLASCONTBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CLASCONTBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CLASCONTBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_CLASCONTBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CLASCONTBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CLASCONTBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CLASCONTBOOK_MST_CLACONBOOPAG)
    {
      BUK_CLASCONTBOOK.set_SpanValue(BUK_CLASCONTBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CLASCONTBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CLASCONTBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CLASCONTBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CLASCONTBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CLASCONTBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CLASCONTBOOK_OnPreview()
  {
    PreviewBook = BKW_CLASCONTBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CLASSICONTAB_Init()
  {

    PAN_CLASSICONTAB.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CLASSICONTAB.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CLASSICONTAB.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, "86AB300B-9C52-46E7-B999-93D9CF11B296");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, "Codice");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, "84120BD2-D8A3-4B86-B5E5-A29AD8318784");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, "Descrizione");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, "4B9C5731-46CC-432F-8FF0-068E993A43C0");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, "Fatture Ricevute ");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, MyGlb.VIS_NORMALFIELDS);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, "B2588CB0-AFC4-440A-B5AB-0289E2569F12");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, "Fatture Emesse ");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, MyGlb.VIS_NORMALFIELDS);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, "FFE1971E-5178-49E4-88A7-6F2FCCA8E340");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, "Liquidazioni ");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, MyGlb.VIS_NORMALFIELDS);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, "00DDAFB5-CF64-448E-8BE1-D9EDAED353CE");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, "Ordinativi ");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, MyGlb.VIS_NORMALFIELDS);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, "F8AE56E2-76E6-4BEF-841F-5130CA7FD69B");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, "Fatture Ricevute");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, MyGlb.VIS_VISULOOUPCF4);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, "DD7723C7-DEDC-48D5-869A-BE818B9E2A20");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, "Fatture Emesse");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, MyGlb.VIS_VISULOOUPCF4);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, "7EA89FE4-56A0-4571-A768-A641AC82BC1D");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, "Liquidazioni");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, MyGlb.VIS_VISULOOUPCF4);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, "125C5D89-09E1-4048-9F1C-DCCBE643FCCF");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, "Ordinativi");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, MyGlb.VIS_VISULOOUPCF4);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, "09B9FEAB-6B63-41ED-B754-E2CDD66A0E53");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, "7159FB24-0C24-4DBA-90B3-E71CDEE64C32");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, "46440D75-1D5A-4EA8-BF23-2D92D8C65735");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CLASSICONTAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, "F93DFD9B-CF3C-4077-9D22-B86066C1E96E");
    PAN_CLASSICONTAB.set_Header(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CLASSICONTAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, "");
    PAN_CLASSICONTAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CLASSICONTAB.SetFlags(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CLASSICONTAB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, MyGlb.PANEL_FORM, 112);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_CODICE, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_CODICE, PPQRY_IMPECOBEN1, "A.CODICE", "CODICE", 5, 4, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, MyGlb.PANEL_FORM, 112);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_DESCRIZIONE, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_DESCRIZIONE, PPQRY_IMPECOBEN1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 60, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, MyGlb.PANEL_LIST, 332, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, MyGlb.PANEL_LIST, 100);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, MyGlb.PANEL_LIST, "Fatture Ricevute ");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, MyGlb.PANEL_FORM, 4, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, MyGlb.PANEL_FORM, 112);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEV1, MyGlb.PANEL_FORM, "Fatture Ricevute ");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_FATTURRICEV1, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_FATTURRICEV1, PPQRY_IMPECOBEN1, "A.FATTORE_FAT_FOR", "FATTORE_FAT_FOR", 5, 16, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, MyGlb.PANEL_LIST, 452, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, MyGlb.PANEL_LIST, 96);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, MyGlb.PANEL_LIST, "Fatture Emesse ");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, MyGlb.PANEL_FORM, 112);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESS1, MyGlb.PANEL_FORM, "Fatture Emesse ");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_FATTUREMESS1, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_FATTUREMESS1, PPQRY_IMPECOBEN1, "A.FATTORE_FAT_CLI", "FATTORE_FAT_CLI", 5, 16, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, MyGlb.PANEL_LIST, 572, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, MyGlb.PANEL_LIST, 100);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, MyGlb.PANEL_LIST, "Liquidazioni ");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, MyGlb.PANEL_FORM, 4, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, MyGlb.PANEL_FORM, 112);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZION1, MyGlb.PANEL_FORM, "Liquidazioni ");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_LIQUIDAZION1, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_LIQUIDAZION1, PPQRY_IMPECOBEN1, "A.FATTORE_LIQ_FOR", "FATTORE_LIQ_FOR", 5, 16, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, MyGlb.PANEL_LIST, 692, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, MyGlb.PANEL_LIST, 96);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, MyGlb.PANEL_LIST, "Ordinativi ");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, MyGlb.PANEL_FORM, 112);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI1, MyGlb.PANEL_FORM, "Ordinativi ");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_ORDINATIVI1, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_ORDINATIVI1, PPQRY_IMPECOBEN1, "A.FATTORE_PRE_CLI", "FATTORE_PRE_CLI", 5, 16, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, MyGlb.PANEL_LIST, 4, 260, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, MyGlb.PANEL_LIST, 104);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, MyGlb.PANEL_LIST, "Fatture Ricevute");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, MyGlb.PANEL_FORM, 4, 340, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, MyGlb.PANEL_FORM, 124);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTURRICEVU, MyGlb.PANEL_FORM, "Fatture Ricevute");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_FATTURRICEVU, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_FATTURRICEVU, PPQRY_FATTURRICEVU, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, MyGlb.PANEL_LIST, 4, 284, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, MyGlb.PANEL_LIST, 104);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, MyGlb.PANEL_LIST, "Fatture Emesse");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, MyGlb.PANEL_FORM, 4, 364, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, MyGlb.PANEL_FORM, 124);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_FATTUREMESSE, MyGlb.PANEL_FORM, "Fatture Emesse");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_FATTUREMESSE, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_FATTUREMESSE, PPQRY_FATTUREMESSE, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, MyGlb.PANEL_LIST, 4, 308, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, MyGlb.PANEL_LIST, 104);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, MyGlb.PANEL_LIST, "Liquidazioni");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, MyGlb.PANEL_FORM, 4, 388, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, MyGlb.PANEL_FORM, 124);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_LIQUIDAZIONI, MyGlb.PANEL_FORM, "Liquidazioni");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_LIQUIDAZIONI, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_LIQUIDAZIONI, PPQRY_LIQUIDAZIONI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, MyGlb.PANEL_LIST, 4, 332, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, MyGlb.PANEL_LIST, 104);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, MyGlb.PANEL_LIST, "Ordinativi");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, MyGlb.PANEL_FORM, 4, 412, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, MyGlb.PANEL_FORM, 124);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_ORDINATIVI, MyGlb.PANEL_FORM, "Ordinativi");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_ORDINATIVI, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_ORDINATIVI, PPQRY_ORDINATIVI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, MyGlb.PANEL_LIST, 712, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 436, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_UTENTEINSERI, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_UTENTEINSERI, PPQRY_IMPECOBEN1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, MyGlb.PANEL_LIST, 832, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, MyGlb.PANEL_FORM, 4, 460, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_DATAINSERIME, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_DATAINSERIME, PPQRY_IMPECOBEN1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, MyGlb.PANEL_LIST, 940, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 484, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_UTENTULTIAGG, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_UTENTULTIAGG, PPQRY_IMPECOBEN1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, MyGlb.PANEL_LIST, 1052, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_CLASSICONTAB.SetRect(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 508, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CLASSICONTAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_CLASSICONTAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CLASSICONTAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CLASSICONTAB_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_CLASSICONTAB.SetFieldPage(PFL_CLASSICONTAB_DATAULTIMAGG, -1, -1);
    PAN_CLASSICONTAB.SetFieldPanel(PFL_CLASSICONTAB_DATAULTIMAGG, PPQRY_IMPECOBEN1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_CLASSICONTAB_InitQueries()
  {
    StringBuffer SQL;

    PAN_CLASSICONTAB.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE_FAT_FOR~~) ");
    SQL.append("and   (NVL(A.DATA_VALIDITA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
    PAN_CLASSICONTAB.SetQuery(PPQRY_FATTURRICEVU, 0, SQL, -1, "");
    PAN_CLASSICONTAB.SetQueryDB(PPQRY_FATTURRICEVU, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CLASSICONTAB.SetMasterTable(PPQRY_FATTURRICEVU, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE_FAT_CLI~~) ");
    SQL.append("and   (NVL(A.DATA_VALIDITA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
    PAN_CLASSICONTAB.SetQuery(PPQRY_FATTUREMESSE, 0, SQL, -1, "");
    PAN_CLASSICONTAB.SetQueryDB(PPQRY_FATTUREMESSE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CLASSICONTAB.SetMasterTable(PPQRY_FATTUREMESSE, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE_LIQ_FOR~~) ");
    SQL.append("and   (NVL(A.DATA_VALIDITA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
    PAN_CLASSICONTAB.SetQuery(PPQRY_LIQUIDAZIONI, 0, SQL, -1, "");
    PAN_CLASSICONTAB.SetQueryDB(PPQRY_LIQUIDAZIONI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CLASSICONTAB.SetMasterTable(PPQRY_LIQUIDAZIONI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE_PRE_CLI~~) ");
    SQL.append("and   (NVL(A.DATA_VALIDITA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
    PAN_CLASSICONTAB.SetQuery(PPQRY_ORDINATIVI, 0, SQL, -1, "");
    PAN_CLASSICONTAB.SetQueryDB(PPQRY_ORDINATIVI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CLASSICONTAB.SetMasterTable(PPQRY_ORDINATIVI, "FATTORI");
    PAN_CLASSICONTAB.SetIMDB(IMDB, "PQRY_IMPECOBEN1", true);
    PAN_CLASSICONTAB.set_SetString(MyGlb.MASTER_ROWNAME, "IMP ECO BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.FATTORE_FAT_FOR as FATTORE_FAT_FOR, ");
    SQL.append("  A.FATTORE_FAT_CLI as FATTORE_FAT_CLI, ");
    SQL.append("  A.FATTORE_LIQ_FOR as FATTORE_LIQ_FOR, ");
    SQL.append("  A.FATTORE_PRE_CLI as FATTORE_PRE_CLI, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CLASSICONTAB.SetQuery(PPQRY_IMPECOBEN1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IMP_ECO_BEN A ");
    PAN_CLASSICONTAB.SetQuery(PPQRY_IMPECOBEN1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CLASSICONTAB.SetQuery(PPQRY_IMPECOBEN1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CLASSICONTAB.SetQuery(PPQRY_IMPECOBEN1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CLASSICONTAB.SetQuery(PPQRY_IMPECOBEN1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CLASSICONTAB.SetQuery(PPQRY_IMPECOBEN1, 5, SQL, -1, "");
    PAN_CLASSICONTAB.SetQueryDB(PPQRY_IMPECOBEN1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CLASSICONTAB.SetMasterTable(0, "IMP_ECO_BEN");
    PAN_CLASSICONTAB.AddToSortList(PFL_CLASSICONTAB_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CLASSICONTAB.Status() == 2)
    {
      int oldListQBE = PAN_CLASSICONTAB.iUseListQBE;
      PAN_CLASSICONTAB.iUseListQBE = 0;
      PAN_CLASSICONTAB.PanelCommand(Glb.PCM_SEARCH);
      PAN_CLASSICONTAB.PanelCommand(Glb.PCM_FIND);
      PAN_CLASSICONTAB.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CLASCONTBOOK_MST_CLACONBOOPAG_Init()
  {
    BUK_CLASCONTBOOK.InitMastro(BUK_CLASCONTBOOK_MST_CLACONBOOPAG, 3, 21000, 29700, 1, 2, 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_MST_CLACONBOOPAG, "C48E8603-C657-45EC-9151-F785A0E67BFC");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_MST_CLACONBOOPAG, "CLACONBOOPAG");
    BUK_CLASCONTBOOK.InitMastroBox(BUK_CLASCONTBOOK_MST_CLACONBOOPAG, BUK_CLASCONTBOOK_RPTBOX_NUMEROPAGINA, 27100, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_NUMEROPAGINA, "7030035D-2AF9-4C67-9A3E-974AF9AF4779");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_NUMEROPAGINA, BUK_CLASCONTBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_NUMEROPAGINA, "8C982F16-DCCD-49C6-8663-A6CC1F0CF82B");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CLASCONTBOOK.InitMastroBox(BUK_CLASCONTBOOK_MST_CLACONBOOPAG, BUK_CLASCONTBOOK_RPTBOX_PAGEBODY, 1000, 2800, 27700, 17100, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_PAGEBODY, "BFAD7D74-C3F3-457E-B25A-255D36ABD2F6");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CLASCONTBOOK.InitMastroBox(BUK_CLASCONTBOOK_MST_CLACONBOOPAG, BUK_CLASCONTBOOK_RPTBOX_TITOLO, 1000, 900, 27700, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_TITOLO, "4EAD6889-F70F-48E1-9898-C91CEF56B890");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_CLASCONTBOOK_RPT_NEWREPORT_InitQuery() { BUK_CLASCONTBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CLASCONTBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.FATTORE_FAT_FOR as FATTORE_FAT_FOR, ");
      SQL.append("  A.FATTORE_FAT_CLI as FATTORE_FAT_CLI, ");
      SQL.append("  A.FATTORE_LIQ_FOR as FATTORE_LIQ_FOR, ");
      SQL.append("  A.FATTORE_PRE_CLI as FATTORE_PRE_CLI, ");
      SQL.append("  B.DESCRIZIONE as IMPECBEFADE1, ");
      SQL.append("  C.DESCRIZIONE as IMPECBEFADE2, ");
      SQL.append("  D.DESCRIZIONE as IMPECBEFADE3, ");
      SQL.append("  E.DESCRIZIONE as IMPECOBEFADE ");
      SQL.append("from ");
      SQL.append("  IMP_ECO_BEN A, ");
      SQL.append("  FATTORI B, ");
      SQL.append("  FATTORI C, ");
      SQL.append("  FATTORI D, ");
      SQL.append("  FATTORI E ");
      SQL.append("where (B.FATTORE(+) = A.FATTORE_FAT_FOR) ");
      SQL.append("and   (C.FATTORE(+) = A.FATTORE_FAT_CLI) ");
      SQL.append("and   (D.FATTORE(+) = A.FATTORE_LIQ_FOR) ");
      SQL.append("and   (E.FATTORE(+) = A.FATTORE_PRE_CLI) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_CLASCONTBOOK.SetReportQuery(BUK_CLASCONTBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "ABC7683A-86AB-4909-AE41-2860B8A8DA93");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CLASCONTBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CLASCONTBOOK.InitReport(BUK_CLASCONTBOOK_RPT_NEWREPORT, 196609);
    BUK_CLASCONTBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPT_NEWREPORT, "97344AD0-8F95-4186-885A-52148ABE9F04");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CLASCONTBOOK.InitSection(BUK_CLASCONTBOOK_RPT_NEWREPORT, BUK_CLASCONTBOOK_SEC_REPORTHEADER, 100, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CLASCONTBOOK.SetSectionRendersInto(BUK_CLASCONTBOOK_SEC_REPORTHEADER, BUK_CLASCONTBOOK_RPTBOX_PAGEBODY);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SEC_REPORTHEADER, "731B5FFB-7270-41D2-BD71-0399DDCB8663");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CLASCONTBOOK.InitSection(BUK_CLASCONTBOOK_RPT_NEWREPORT, BUK_CLASCONTBOOK_SEC_PAGEHEADER, 900, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CLASCONTBOOK.SetSectionRendersInto(BUK_CLASCONTBOOK_SEC_PAGEHEADER, BUK_CLASCONTBOOK_RPTBOX_PAGEBODY);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SEC_PAGEHEADER, "7BC3C1BE-F0B7-4024-A387-46B2D6AAB7B6");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_PAGEHEADER, BUK_CLASCONTBOOK_RPTBOX_CODICEHEADER, 100, 0, 1101, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_CODICEHEADER, "D8B1AA30-C45B-4D60-B04E-6AD2E1DEA468");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_CODICEHEADER, BUK_CLASCONTBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_CODICE, "6D1BF8C2-4BE3-44A2-9C77-8B5E0856C2C3");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_CODICE, "CODICE");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_PAGEHEADER, BUK_CLASCONTBOOK_RPTBOX_DESCRIHEADER, 1400, 0, 7200, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_DESCRIHEADER, "3712A4F6-96CE-41E9-AD5A-6EDA18B14A0C");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_DESCRIHEADER, BUK_CLASCONTBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_DESCRIZIONE, "5C2D127E-7EE6-4C22-9FAC-1502B5D55686");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_PAGEHEADER, BUK_CLASCONTBOOK_RPTBOX_FATFATFORHEA, 13000, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_FATFATFORHEA, "31C85C86-5551-46A3-B2AD-99A41E15EDF2");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_FATFATFORHEA, "FATFATFORHEA");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_FATFATFORHEA, BUK_CLASCONTBOOK_SPAN_FATTURRICEVU, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Fatture Ricevute ", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_FATTURRICEVU, "6A8F16F0-5511-443E-9D02-6ADC14145EE4");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_FATTURRICEVU, "FATTURRICEVU");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_PAGEHEADER, BUK_CLASCONTBOOK_RPTBOX_FATFATCLIHEA, 21800, 0, 2400, 400, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_FATFATCLIHEA, "8C658A31-4815-4C92-80F6-6ED761920051");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_FATFATCLIHEA, "FATFATCLIHEA");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_FATFATCLIHEA, BUK_CLASCONTBOOK_SPAN_FATTUREMESSE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Fatture Emesse ", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_FATTUREMESSE, "BA278973-FDD7-4851-BD5D-F7236125BD63");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_FATTUREMESSE, "FATTUREMESSE");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_PAGEHEADER, BUK_CLASCONTBOOK_RPTBOX_FATLIQFORHEA, 13300, 400, 1800, 400, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_FATLIQFORHEA, "A21BE136-6FC6-4B98-946E-0E6F574BE42C");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_FATLIQFORHEA, "FATLIQFORHEA");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_FATLIQFORHEA, BUK_CLASCONTBOOK_SPAN_LIQUIDAZIONI, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Liquidazioni ", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_LIQUIDAZIONI, "4B8DA817-EAEB-4FB0-8666-5D4EC4C2CF4B");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_LIQUIDAZIONI, "LIQUIDAZIONI");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_PAGEHEADER, BUK_CLASCONTBOOK_RPTBOX_FATPRECLIHEA, 22200, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_FATPRECLIHEA, "033D834F-605C-4480-ABE8-9CE797247CA5");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_FATPRECLIHEA, "FATPRECLIHEA");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_FATPRECLIHEA, BUK_CLASCONTBOOK_SPAN_ORDINATIVI, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Ordinativi ", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_ORDINATIVI, "710C562A-AE6A-4B05-B0C4-E501F33F7173");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_ORDINATIVI, "ORDINATIVI");
    BUK_CLASCONTBOOK.InitSection(BUK_CLASCONTBOOK_RPT_NEWREPORT, BUK_CLASCONTBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CLASCONTBOOK.SetSectionRendersInto(BUK_CLASCONTBOOK_SEC_TITOLO, BUK_CLASCONTBOOK_RPTBOX_TITOLO);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SEC_TITOLO, "F3CF0451-5572-434E-89C8-9052FE3BE5B5");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SEC_TITOLO, "TITOLO");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_TITOLO, BUK_CLASCONTBOOK_RPTBOX_NEWBOX5, 200, 200, 27300, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_NEWBOX5, "DE4CD068-35AA-41A7-97F4-9EAE1D5930CD");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_NEWBOX5, "NEWBOX5");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_NEWBOX5, BUK_CLASCONTBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Classi Contabili", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_VARIADIBILAN, "DFECE9B1-7BC6-44AD-935B-2EBF4F898FC3");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_CLASCONTBOOK.InitSection(BUK_CLASCONTBOOK_RPT_NEWREPORT, BUK_CLASCONTBOOK_SEC_DETAIL, 1600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CLASCONTBOOK.SetSectionRendersInto(BUK_CLASCONTBOOK_SEC_DETAIL, BUK_CLASCONTBOOK_RPTBOX_PAGEBODY);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SEC_DETAIL, "3B1F7DD2-550F-4101-888E-03F8C46FF435");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SEC_DETAIL, "DETAIL");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_DETAIL, BUK_CLASCONTBOOK_RPTBOX_CODICE, 100, 0, 1200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_CODICE, "F9D783B2-F2C2-4462-9517-021C6B034724");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_CODICE, "CODICE");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_CODICE, BUK_CLASCONTBOOK_SPAN_IMECBECCCCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 4, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_IMECBECCCCCB, "63022600-B99D-4310-BBA0-DD3C92F218FB");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_IMECBECCCCCB, "IMECBECCCCCB");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_DETAIL, BUK_CLASCONTBOOK_RPTBOX_DESCRIZIONE, 1400, 0, 8400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_DESCRIZIONE, "A2E0A2A1-E725-47A3-91B6-BD907F0AF2A5");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_DESCRIZIONE, BUK_CLASCONTBOOK_SPAN_IMECBEDCCCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_IMECBEDCCCCB, "31D24B71-E39F-4A2D-82B9-51DD393B5531");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_IMECBEDCCCCB, "IMECBEDCCCCB");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_DETAIL, BUK_CLASCONTBOOK_RPTBOX_FATTORFATFOR, 9900, 0, 2499, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_FATTORFATFOR, "038D2A6E-500A-4B2B-BEFD-0CF76FD92CD7");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_FATTORFATFOR, "FATTORFATFOR");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_FATTORFATFOR, BUK_CLASCONTBOOK_SPAN_IMECBFRCCCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::FATTORE_FAT_FOR", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_IMECBFRCCCCB, "EF87317A-FE5E-4423-85E9-AC188D61D689");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_IMECBFRCCCCB, "IMECBFRCCCCB");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_DETAIL, BUK_CLASCONTBOOK_RPTBOX_FATTORFATCLI, 18800, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_FATTORFATCLI, "5B17D400-4079-48FB-83AA-987290A15A7A");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_FATTORFATCLI, "FATTORFATCLI");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_FATTORFATCLI, BUK_CLASCONTBOOK_SPAN_IMECBFECCCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::FATTORE_FAT_CLI", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_IMECBFECCCCB, "E8195209-5400-4643-994F-1F918C821682");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_IMECBFECCCCB, "IMECBFECCCCB");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_DETAIL, BUK_CLASCONTBOOK_RPTBOX_FATTORLIQFOR, 9900, 600, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_FATTORLIQFOR, "DF7B61E3-F7E3-4DD8-92E9-128E79CF5679");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_FATTORLIQFOR, "FATTORLIQFOR");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_FATTORLIQFOR, BUK_CLASCONTBOOK_SPAN_IMECBELCCCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::FATTORE_LIQ_FOR", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_IMECBELCCCCB, "DF024777-B9A2-4AAB-8D52-28B3623CAD6A");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_IMECBELCCCCB, "IMECBELCCCCB");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_DETAIL, BUK_CLASCONTBOOK_RPTBOX_FATTORPRECLI, 18800, 600, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_FATTORPRECLI, "987FEA90-9E17-4BA4-B8CD-A9805407FAE6");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_FATTORPRECLI, "FATTORPRECLI");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_FATTORPRECLI, BUK_CLASCONTBOOK_SPAN_IMECBEOCCCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::FATTORE_PRE_CLI", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_IMECBEOCCCCB, "ED02B141-1142-421B-B6D3-5376867E22FF");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_IMECBEOCCCCB, "IMECBEOCCCCB");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_DETAIL, BUK_CLASCONTBOOK_RPTBOX_NEWBOX, 12500, 600, 6200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_NEWBOX, "48061D14-798C-4447-92DA-5C064E394D92");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_NEWBOX, BUK_CLASCONTBOOK_SPAN_IMEBFD3CCCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "", "::IMPECBEFADE3", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_IMEBFD3CCCCB, "9A5A3177-3D44-46F5-BB95-FD0B92EF3484");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_IMEBFD3CCCCB, "IMEBFD3CCCCB");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_DETAIL, BUK_CLASCONTBOOK_RPTBOX_NEWBOX1, 12500, 0, 6200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_NEWBOX1, "719AA7A6-8144-436D-9643-B6D0475E01B8");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_NEWBOX1, "NEWBOX1");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_NEWBOX1, BUK_CLASCONTBOOK_SPAN_IMEBFD1CCCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "", "::IMPECBEFADE1", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_IMEBFD1CCCCB, "4D6D3886-BA41-4630-B31F-A481207C3963");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_IMEBFD1CCCCB, "IMEBFD1CCCCB");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_DETAIL, BUK_CLASCONTBOOK_RPTBOX_NEWBOX2, 21400, 0, 6200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_NEWBOX2, "E37CD901-BDAF-453C-8A57-BAB79A237C50");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_NEWBOX2, "NEWBOX2");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_NEWBOX2, BUK_CLASCONTBOOK_SPAN_IMEBFD2CCCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "", "::IMPECBEFADE2", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_IMEBFD2CCCCB, "B51A5C67-0032-44A7-930E-CC7F9F243D65");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_IMEBFD2CCCCB, "IMEBFD2CCCCB");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_DETAIL, BUK_CLASCONTBOOK_RPTBOX_NEWBOX3, 21400, 600, 6200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_NEWBOX3, "D5AB4C0B-0396-47A5-A69F-AE0756F9D929");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_NEWBOX3, "NEWBOX3");
    BUK_CLASCONTBOOK.InitBoxSpan(BUK_CLASCONTBOOK_RPTBOX_NEWBOX3, BUK_CLASCONTBOOK_SPAN_IMECBFDCCCCB, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "", "::IMPECOBEFADE", 1);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SPAN_IMECBFDCCCCB, "0FC2A539-BD65-4E05-A3E0-3D9F32E5369A");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SPAN_IMECBFDCCCCB, "IMECBFDCCCCB");
    BUK_CLASCONTBOOK.InitReportBox(BUK_CLASCONTBOOK_SEC_DETAIL, BUK_CLASCONTBOOK_RPTBOX_NEWBOX4, 200, 1400, 27200, 0, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 0, "", 1, -33);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_RPTBOX_NEWBOX4, "9DD5A5E5-8BCD-4594-BDB4-15CD97803C29");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_RPTBOX_NEWBOX4, "NEWBOX4");
    BUK_CLASCONTBOOK.InitSection(BUK_CLASCONTBOOK_RPT_NEWREPORT, BUK_CLASCONTBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CLASCONTBOOK.SetSectionRendersInto(BUK_CLASCONTBOOK_SEC_REPORTFOOTER, BUK_CLASCONTBOOK_RPTBOX_PAGEBODY);
    BUK_CLASCONTBOOK.SetRTCGuid(BUK_CLASCONTBOOK_SEC_REPORTFOOTER, "E16ED5A8-17C1-446A-A25D-A2D7572C1D91");
    BUK_CLASCONTBOOK.SetObjCode(BUK_CLASCONTBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CLASCONTBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CLASCONTBOOK_InitLinks()
  {
    BUK_CLASCONTBOOK.SetBoxNextBox(BUK_CLASCONTBOOK_RPTBOX_PAGEBODY, BUK_CLASCONTBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CLASSICONTAB) PAN_CLASSICONTAB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CLASSICONTAB) PAN_CLASSICONTAB_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CLASSICONTAB) PAN_CLASSICONTAB_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CLASSICONTAB) PAN_CLASSICONTAB_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CLASSICONTAB) PAN_CLASSICONTAB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CLASCONTBOOK) BUK_CLASCONTBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CLASCONTBOOK) BUK_CLASCONTBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CLASCONTBOOK) BUK_CLASCONTBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CLASCONTBOOK) BUK_CLASCONTBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CLASCONTBOOK) BUK_CLASCONTBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CLASCONTBOOK) BUK_CLASCONTBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CLASCONTBOOK) BUK_CLASCONTBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CLASCONTBOOK) BUK_CLASCONTBOOK_OnPreview();
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
