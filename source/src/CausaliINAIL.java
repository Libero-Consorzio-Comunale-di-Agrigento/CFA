// **********************************************
// Causali INAIL
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CausaliINAIL extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CAUSALIINAIL_CODICE = 0;
  private static int PFL_CAUSALIINAIL_DESCRIZIONE = 1;
  private static int PFL_CAUSALIINAIL_PERCIMP = 2;
  private static int PFL_CAUSALIINAIL_ALIQUOTA = 3;
  private static int PFL_CAUSALIINAIL_ALIQPERCIP = 4;
  private static int PFL_CAUSALIINAIL_ALIQENTE = 5;
  private static int PFL_CAUSALIINAIL_NUMEROACC = 6;
  private static int PFL_CAUSALIINAIL_ANNOACC = 7;
  private static int PFL_CAUSALIINAIL_APRIACCERTAM = 8;
  private static int PFL_CAUSALIINAIL_INFOACCERTAM = 9;
  private static int PFL_CAUSALIINAIL_ACCERTAMENTO = 10;
  private static int PFL_CAUSALIINAIL_UTENTEINSERI = 11;
  private static int PFL_CAUSALIINAIL_DATAINSERIME = 12;
  private static int PFL_CAUSALIINAIL_UTENTULTIAGG = 13;
  private static int PFL_CAUSALIINAIL_DATAULTIMAGG = 14;

  private static int PPQRY_T88 = 0;

  private static int PPQRY_APRI = 1;
  private static int PPQRY_INFO = 2;


  IDPanel PAN_CAUSALIINAIL;
  CIDREObj BUK_CAUSINAIBOOK;
  OBook BKW_CAUSINAIBOOK;
  //
  // Template Pages constants
  private static int BUK_CAUSINAIBOOK_MST_CAUINABOOPAG = 1;
  private static int BUK_CAUSINAIBOOK_RPTBOX_PAGEHEADER = 2;
  private static int BUK_CAUSINAIBOOK_RPTBOX_PAGEBODY = 3;
  private static int BUK_CAUSINAIBOOK_RPTBOX_PAGEFOOTER = 4;
  private static int BUK_CAUSINAIBOOK_RPTBOX_NUMEROPAGINA = 5;
  private static int BUK_CAUSINAIBOOK_SPAN_NUMEROPAGINA = 6;

  //
  // Reports constants
  private static int BUK_CAUSINAIBOOK_RPT_NEWREPORT = 7;
  private static int BUK_CAUSINAIBOOK_SEC_REPORTHEADER = 8;
  private static int BUK_CAUSINAIBOOK_RPTBOX_CODICEHEADER = 9;
  private static int BUK_CAUSINAIBOOK_SPAN_CODICE = 10;
  private static int BUK_CAUSINAIBOOK_RPTBOX_DESCRIHEADER = 11;
  private static int BUK_CAUSINAIBOOK_SPAN_DESCRIZIONE = 12;
  private static int BUK_CAUSINAIBOOK_RPTBOX_PERCIMPOHEAD = 13;
  private static int BUK_CAUSINAIBOOK_SPAN_PERCIMP = 14;
  private static int BUK_CAUSINAIBOOK_RPTBOX_ALIQINAIHEAD = 15;
  private static int BUK_CAUSINAIBOOK_SPAN_ALIQUOTA = 16;
  private static int BUK_CAUSINAIBOOK_RPTBOX_ALIQINACPHEA = 17;
  private static int BUK_CAUSINAIBOOK_SPAN_ALIQPERCIP = 18;
  private static int BUK_CAUSINAIBOOK_RPTBOX_ALIQINACEHEA = 19;
  private static int BUK_CAUSINAIBOOK_SPAN_ALIQENTE = 20;
  private static int BUK_CAUSINAIBOOK_RPTBOX_ACCERTHEADER = 21;
  private static int BUK_CAUSINAIBOOK_SPAN_ACCERTAMENTO = 22;
  private static int BUK_CAUSINAIBOOK_SEC_PAGEHEADER = 23;
  private static int BUK_CAUSINAIBOOK_RPTBOX_TITOLO = 24;
  private static int BUK_CAUSINAIBOOK_SPAN_TITOLO = 25;
  private static int BUK_CAUSINAIBOOK_SEC_DETAIL = 26;
  private static int BUK_CAUSINAIBOOK_RPTBOX_CODICE = 27;
  private static int BUK_CAUSINAIBOOK_SPAN_T8COCAINCAIB = 28;
  private static int BUK_CAUSINAIBOOK_RPTBOX_DESCRIZIONE = 29;
  private static int BUK_CAUSINAIBOOK_SPAN_T8DECAINCAIB = 30;
  private static int BUK_CAUSINAIBOOK_RPTBOX_PERCIMPONIBI = 31;
  private static int BUK_CAUSINAIBOOK_SPAN_T8PEIMCAICIB = 32;
  private static int BUK_CAUSINAIBOOK_RPTBOX_ALIQUOTINAIL = 33;
  private static int BUK_CAUSINAIBOOK_SPAN_T8ALCAINCAIB = 34;
  private static int BUK_CAUSINAIBOOK_RPTBOX_ALIQUINAILCP = 35;
  private static int BUK_CAUSINAIBOOK_SPAN_T8ALPECAICIB = 36;
  private static int BUK_CAUSINAIBOOK_RPTBOX_ALIQUINAILCE = 37;
  private static int BUK_CAUSINAIBOOK_SPAN_T8ALENCAICIB = 38;
  private static int BUK_CAUSINAIBOOK_RPTBOX_ACCERTAMENTO = 39;
  private static int BUK_CAUSINAIBOOK_SPAN_TSTNACICIBIN = 40;
  private static int BUK_CAUSINAIBOOK_SEC_PAGEFOOTER = 41;
  private static int BUK_CAUSINAIBOOK_SEC_REPORTFOOTER = 42;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T88(IMDB);
    Init_PQRY_T87(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T88(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T88, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_T88, "PQRY_T88");
    IMDB.set_FldCode(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_ALIQUOTA_INAIL, "ALIQUOTA_INAIL");
    IMDB.SetFldParams(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_ALIQUOTA_INAIL,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_ALIQUOTA_INAIL_CP, "ALIQUOTA_INAIL_CP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_ALIQUOTA_INAIL_CP,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_ALIQUOTA_INAIL_CE, "ALIQUOTA_INAIL_CE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_ALIQUOTA_INAIL_CE,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_PERC_IMPONIBILE, "PERC_IMPONIBILE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_PERC_IMPONIBILE,3,6,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T88,IMDBDef9.PQSL_T88_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T88, 0);
  }

  private static void Init_PQRY_T87(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T87, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_T87, "PQRY_T87");
    IMDB.set_FldCode(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_ALIQUOTA_INAIL, "ALIQUOTA_INAIL");
    IMDB.SetFldParams(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_ALIQUOTA_INAIL,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_ALIQUOTA_INAIL_CP, "ALIQUOTA_INAIL_CP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_ALIQUOTA_INAIL_CP,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_ALIQUOTA_INAIL_CE, "ALIQUOTA_INAIL_CE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_ALIQUOTA_INAIL_CE,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_PERC_IMPONIBILE, "PERC_IMPONIBILE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_PERC_IMPONIBILE,3,6,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T87,IMDBDef9.PQSL_T87_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T87, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CausaliINAIL(MyWebEntryPoint w, IMDBObj imdb)
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
  public CausaliINAIL()
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
    FormIdx = MyGlb.FRM_CAUSALIINAIL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5D156751-29F2-4198-98DB-4BF2752B78A0";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 712;
    DesignHeight = 378;
    set_Caption(new IDVariant("Causali INAIL"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 712;
    Frames[1].Height = 352;
    Frames[1].Caption = "Causali INAIL";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 352;
    PAN_CAUSALIINAIL = new IDPanel(w, this, 1, "PAN_CAUSALIINAIL");
    Frames[1].Content = PAN_CAUSALIINAIL;
    PAN_CAUSALIINAIL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAUSALIINAIL.VS = MainFrm.VisualStyleList;
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 712-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CAUSINAIBOOK != null)
      PAN_CAUSALIINAIL.SetBook(BUK_CAUSINAIBOOK);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1CF629A2-42F8-4E88-8079-2D8D68DA9AF9");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 660, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAUSALIINAIL.InitStatus = 2;
    PAN_CAUSALIINAIL_Init();
    PAN_CAUSALIINAIL_InitFields();
    PAN_CAUSALIINAIL_InitQueries();
    BKW_CAUSINAIBOOK = new OBook(this);
    BUK_CAUSINAIBOOK = new CIDREObj(BKW_CAUSINAIBOOK);
    BKW_CAUSINAIBOOK.iGuid = "F88F3EBF-B1D9-4247-832A-4C39917F2A04";
    BKW_CAUSINAIBOOK.Code = "BUK_CAUSINAIBOOK";
    BKW_CAUSINAIBOOK.BookObj = BUK_CAUSINAIBOOK;
    BKW_CAUSINAIBOOK.InitDefMasks();
    BUK_CAUSINAIBOOK.InitBook(1, 1245185, "Causali INAIL Book", IMDB, MainFrm.VisualStyleList);
    BUK_CAUSINAIBOOK.InitHTML();
    BUK_CAUSINAIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CAUSINAIBOOK.Book.SetMainFrm(MainFrm);
    BUK_CAUSINAIBOOK.SetRTCGuid(0, "F88F3EBF-B1D9-4247-832A-4C39917F2A04");
    BUK_CAUSINAIBOOK.SetObjCode(0, "CAUSINAIBOOK");
    if (PAN_CAUSALIINAIL != null)
      PAN_CAUSALIINAIL.SetBook(BUK_CAUSINAIBOOK);
    BUK_CAUSINAIBOOK_MST_CAUINABOOPAG_Init();
    BUK_CAUSINAIBOOK_RPT_NEWREPORT_Init();
    BUK_CAUSINAIBOOK_InitLinks();
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
      PAN_CAUSALIINAIL.UpdatePanel(MainFrm);
      // BUK_CAUSINAIBOOK.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_CAUSALIINAIL.FrIndex)
    {
      if (IdxFieldActived ==PFL_CAUSALIINAIL_APRIACCERTAM) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_CAUSINAIBOOK")) return BUK_CAUSINAIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof CausaliINAIL);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CausaliINAIL.class.getName() : (Glb.ClassWithPackage(CausaliINAIL.class) ? CausaliINAIL.class.getName().substring(CausaliINAIL.class.getPackage().getName().length() + 1) : CausaliINAIL.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Causali INAIL On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAUSALIINAIL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CAUSALIINAIL);
      // 
      // Causali INAIL On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_CAUSALIINAIL.IsNewRow()))
      {
        PAN_CAUSALIINAIL.SetFlags (Glb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CAUSALIINAIL.SetFlags (Glb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_CAUSALIINAIL.set_ToolTip(Glb.OBJ_FIELD,PFL_CAUSALIINAIL_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliINAIL", "CausaliINAILOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Causali INAIL On Database Error Event
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
  private void PAN_CAUSALIINAIL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CAUSALIINAIL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Causali INAIL On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliINAIL", "CausaliINAILOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Causali INAIL On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CAUSALIINAIL_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_CAUSALIINAIL, Cancel);
      // 
      // Causali INAIL On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_ANNO_ACC, 0))))
      {
      }
      else
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliINAIL", "CausaliINAILOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Causali INAIL On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CAUSALIINAIL_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali INAIL On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliINAIL", "CausaliINAILOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Causali INAIL On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CAUSALIINAIL_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali INAIL On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(128)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_ANNO_ACC, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_NUMERO_ACC, 0))))
        {
          if (MainFrm.AccPresente(IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_ANNO_ACC, 0), IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_NUMERO_ACC, 0)).equals((new IDVariant(-1)), true))
          {
            Cancel.set((new IDVariant(-1)));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliINAIL", "CausaliINAILOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Causali INAIL NUMERO ACC Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CAUSALIINAIL_NUMEROACC_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali INAIL NUMERO ACC Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_ANNO_ACC, 0))))
      {
        IDVariant v_FLAG = new IDVariant(0,IDVariant.INTEGER);
        v_FLAG = MainFrm.AccPresente(IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_ANNO_ACC, 0), IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_NUMERO_ACC, 0));
        if (v_FLAG.equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_NUMERO_ACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_ANNO_ACC, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliINAIL", "CausaliINAILNUMEROACCValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Causali INAIL ANNO ACC Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CAUSALIINAIL_ANNOACC_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali INAIL ANNO ACC Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_ANNO_ACC, 0))))
      {
        IDVariant v_FLAG = new IDVariant(0,IDVariant.INTEGER);
        v_FLAG = MainFrm.AccPresente(IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_ANNO_ACC, 0), IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_NUMERO_ACC, 0));
        if (v_FLAG.equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_NUMERO_ACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_ANNO_ACC, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliINAIL", "CausaliINAILANNOACCValidateEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_NUMERO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_ANNO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliINAIL", "EndModalEvent", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliINAIL", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Info Accertamento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef9.PQRY_T88, IMDBDef9.PQSL_T88_ANNO_ACC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliINAIL", "InfoAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Accertamento
  // **********************************************************************
  public int ApriSceltaAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Accertamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliINAIL", "ApriSceltaAccertamento", _e);
      return -1;
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
  private void PAN_CAUSALIINAIL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CAUSALIINAIL_APRIACCERTAM)
    {
      this.IdxPanelActived = this.PAN_CAUSALIINAIL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CAUSALIINAIL_INFOACCERTAM)
    {
      this.IdxPanelActived = this.PAN_CAUSALIINAIL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CAUSALIINAIL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CAUSALIINAIL_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CAUSALIINAIL_NUMEROACC)
      {
        PFL_CAUSALIINAIL_NUMEROACC_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CAUSALIINAIL_ANNOACC)
      {
        PFL_CAUSALIINAIL_ANNOACC_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_CAUSALIINAIL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAUSALIINAIL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CAUSINAIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CAUSINAIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CAUSINAIBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CAUSINAIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CAUSINAIBOOK_SEC_DETAIL)
    {
      BUK_CAUSINAIBOOK.set_SpanValue(BUK_CAUSINAIBOOK_SPAN_TSTNACICIBIN, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_CAUSINAIBOOK.GetReportColumn(BUK_CAUSINAIBOOK_RPT_NEWREPORT, "NUMERO_ACC")), ((!(IDL.IsNull(BUK_CAUSINAIBOOK.GetReportColumn(BUK_CAUSINAIBOOK_RPT_NEWREPORT, "NUMERO_ACC"))))?(new IDVariant(" / ")):(new IDVariant("")))), IDL.ToString(BUK_CAUSINAIBOOK.GetReportColumn(BUK_CAUSINAIBOOK_RPT_NEWREPORT, "ANNO_ACC")))));
    }
    if (SectionID==BUK_CAUSINAIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CAUSINAIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CAUSINAIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CAUSINAIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CAUSINAIBOOK_MST_CAUINABOOPAG)
    {
      BUK_CAUSINAIBOOK.set_SpanValue(BUK_CAUSINAIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CAUSINAIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CAUSINAIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CAUSINAIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CAUSINAIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CAUSINAIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CAUSINAIBOOK_OnPreview()
  {
    PreviewBook = BKW_CAUSINAIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CAUSALIINAIL_Init()
  {

    PAN_CAUSALIINAIL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAUSALIINAIL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAUSALIINAIL.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, "F2AB7196-9893-4F92-8A80-29BBA83A4D5F");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, "Codice");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, "03021480-B980-4F45-AEBA-FB4016ACE240");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, "Descrizione");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, "1F46F43A-A7B6-43DF-903C-B4FE95BD3291");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, "Perc. Imp.");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, MyGlb.VIS_PERIMNOFICF4);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, "B2F7232F-3859-489B-8C62-DD00311FE821");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, "Aliquota");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, MyGlb.VIS_PERALINOFICF);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, "F5C2D58D-C4C0-4154-B1C0-89567EE98FC2");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, "Aliq. Percip.");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, "Aliq. Percip.");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, MyGlb.VIS_PERALINOFICF);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, "D4C03E11-E5EA-44E7-97CF-81FB264D1EBF");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, "Aliq. Ente");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, MyGlb.VIS_PERALINOFICF);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, "7703EEF5-7CAC-4B45-9BAF-74AEA70D2C95");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, "NUMERO ACC");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, "71A55090-57BF-45FA-84E5-C976FB46EAE7");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, "ANNO ACC");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, "F1254106-D543-4227-B67E-01F0ED70E943");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, "Apri Accertamenti");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, MyGlb.VIS_HYPELINKIMMA);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, "267BCFB9-7957-432B-8180-63E8F7DFEBD2");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, "Info Accertamenti");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, MyGlb.VIS_HYPELINKIMMA);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ACCERTAMENTO, "858489E9-C8C7-45A9-B6B7-51A49AD571EF");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ACCERTAMENTO, "Accertamento");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ACCERTAMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, "70CCAA1E-7A5B-41D3-A4C2-556F0FFAAEC9");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, "E5A82070-003A-42EF-8FC7-E0BC9D086489");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, "5AFC6D84-72DD-404F-8415-DAB7C0460794");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALIINAIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, "9755D0B0-A03D-4854-9669-9CFA1F222216");
    PAN_CAUSALIINAIL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CAUSALIINAIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, "");
    PAN_CAUSALIINAIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALIINAIL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CAUSALIINAIL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_CODICE, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_CODICE, PPQRY_T88, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, MyGlb.PANEL_LIST, 52, 36, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_DESCRIZIONE, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_DESCRIZIONE, PPQRY_T88, "A.DESCRIZIONE", "DESCRIZIONE", 5, 50, 0, -13997);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, MyGlb.PANEL_LIST, 280, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, MyGlb.PANEL_LIST, 96);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, MyGlb.PANEL_LIST, "Perc. Imp.");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, MyGlb.PANEL_FORM, 4, 172, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_PERCIMP, MyGlb.PANEL_FORM, "Perc. Imp.");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_PERCIMP, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_PERCIMP, PPQRY_T88, "A.PERC_IMPONIBILE", "PERC_IMPONIBILE", 3, 6, 3, -13997);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, MyGlb.PANEL_LIST, 340, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, MyGlb.PANEL_LIST, 92);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, MyGlb.PANEL_LIST, "Aliquota");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQUOTA, MyGlb.PANEL_FORM, "Aliquota");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_ALIQUOTA, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_ALIQUOTA, PPQRY_T88, "A.ALIQUOTA_INAIL", "ALIQUOTA_INAIL", 3, 5, 3, -13997);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, MyGlb.PANEL_LIST, 396, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, MyGlb.PANEL_LIST, 108);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, MyGlb.PANEL_LIST, "Aliq. Percip.");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQPERCIP, MyGlb.PANEL_FORM, "Aliq. Percip.");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_ALIQPERCIP, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_ALIQPERCIP, PPQRY_T88, "A.ALIQUOTA_INAIL_CP", "ALIQUOTA_INAIL_CP", 3, 5, 3, -13997);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, MyGlb.PANEL_LIST, 460, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, MyGlb.PANEL_LIST, 108);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, MyGlb.PANEL_LIST, "Aliq. Ente");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, MyGlb.PANEL_FORM, 4, 100, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ALIQENTE, MyGlb.PANEL_FORM, "Aliq. Ente");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_ALIQENTE, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_ALIQENTE, PPQRY_T88, "A.ALIQUOTA_INAIL_CE", "ALIQUOTA_INAIL_CE", 3, 5, 3, -13997);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, MyGlb.PANEL_LIST, 520, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, MyGlb.PANEL_FORM, 4, 148, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_NUMEROACC, MyGlb.PANEL_FORM, "NUMERO ACC");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_NUMEROACC, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_NUMEROACC, PPQRY_T88, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, MyGlb.PANEL_LIST, 568, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_ANNOACC, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_ANNOACC, PPQRY_T88, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, MyGlb.PANEL_LIST, 612, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, MyGlb.PANEL_LIST, 96);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, MyGlb.PANEL_LIST, "A. Ac.");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, MyGlb.PANEL_FORM, 4, 292, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, MyGlb.PANEL_FORM, 96);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, MyGlb.PANEL_FORM, 2);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_APRIACCERTAM, MyGlb.PANEL_FORM, "Apri Accertamenti");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_APRIACCERTAM, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_APRIACCERTAM, PPQRY_APRI, "DECODE(~~CODICE~~, to_number(NULL), NULL, 'A')", "APRIACCERTAM", 5, 99, 0, -13997);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_APRIACCERTAM, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, MyGlb.PANEL_LIST, 636, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, MyGlb.PANEL_LIST, 96);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, MyGlb.PANEL_LIST, "I. Ac.");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, MyGlb.PANEL_FORM, 4, 340, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, MyGlb.PANEL_FORM, 96);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, MyGlb.PANEL_FORM, 2);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_INFOACCERTAM, MyGlb.PANEL_FORM, "Info Accertamenti");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_INFOACCERTAM, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_INFOACCERTAM, PPQRY_INFO, "DECODE(~~ANNO_ACC~~, to_number(NULL), NULL, DECODE(~~NUMERO_ACC~~, to_number(NULL), NULL, 'I'))", "INFOACCERTAM", 5, 99, 0, -13997);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CAUSALIINAIL.SetValueListItem(PFL_CAUSALIINAIL_INFOACCERTAM, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ACCERTAMENTO, MyGlb.PANEL_LIST, 520, 0, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ACCERTAMENTO, MyGlb.PANEL_LIST, 0);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ACCERTAMENTO, MyGlb.PANEL_FORM, 536, 0, 88, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ACCERTAMENTO, MyGlb.PANEL_FORM, 0);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_ACCERTAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_ACCERTAMENTO, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_ACCERTAMENTO, -1, "", "ACCERTAMENTO", 0, 0, 0, -13997);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, MyGlb.PANEL_LIST, 652, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 292, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_UTENTEINSERI, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_UTENTEINSERI, PPQRY_T88, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, MyGlb.PANEL_LIST, 772, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, MyGlb.PANEL_FORM, 4, 316, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_DATAINSERIME, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_DATAINSERIME, PPQRY_T88, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, MyGlb.PANEL_LIST, 880, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 340, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_UTENTULTIAGG, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_UTENTULTIAGG, PPQRY_T88, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, MyGlb.PANEL_LIST, 992, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_CAUSALIINAIL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 364, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALIINAIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_CAUSALIINAIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALIINAIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALIINAIL_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_CAUSALIINAIL.SetFieldPage(PFL_CAUSALIINAIL_DATAULTIMAGG, -1, -1);
    PAN_CAUSALIINAIL.SetFieldPanel(PFL_CAUSALIINAIL_DATAULTIMAGG, PPQRY_T88, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_CAUSALIINAIL_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAUSALIINAIL.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~CODICE~~, to_number(NULL), NULL, 'A') as APRIACCERTAM ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_CAUSALIINAIL.SetQuery(PPQRY_APRI, 0, SQL, -1, "");
    PAN_CAUSALIINAIL.SetQueryDB(PPQRY_APRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAUSALIINAIL.SetMasterTable(PPQRY_APRI, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~ANNO_ACC~~, to_number(NULL), NULL, DECODE(~~NUMERO_ACC~~, to_number(NULL), NULL, 'I')) as INFOACCERTAM ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_CAUSALIINAIL.SetQuery(PPQRY_INFO, 0, SQL, -1, "");
    PAN_CAUSALIINAIL.SetQueryDB(PPQRY_INFO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAUSALIINAIL.SetMasterTable(PPQRY_INFO, "DUAL");
    PAN_CAUSALIINAIL.SetIMDB(IMDB, "PQRY_T88", true);
    PAN_CAUSALIINAIL.set_SetString(MyGlb.MASTER_ROWNAME, "T87");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ALIQUOTA_INAIL as ALIQUOTA_INAIL, ");
    SQL.append("  A.ALIQUOTA_INAIL_CP as ALIQUOTA_INAIL_CP, ");
    SQL.append("  A.ALIQUOTA_INAIL_CE as ALIQUOTA_INAIL_CE, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.PERC_IMPONIBILE as PERC_IMPONIBILE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CAUSALIINAIL.SetQuery(PPQRY_T88, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T87 A ");
    PAN_CAUSALIINAIL.SetQuery(PPQRY_T88, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALIINAIL.SetQuery(PPQRY_T88, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALIINAIL.SetQuery(PPQRY_T88, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALIINAIL.SetQuery(PPQRY_T88, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CAUSALIINAIL.SetQuery(PPQRY_T88, 5, SQL, -1, "");
    PAN_CAUSALIINAIL.SetQueryDB(PPQRY_T88, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAUSALIINAIL.SetMasterTable(0, "T87");
    PAN_CAUSALIINAIL.AddToSortList(PFL_CAUSALIINAIL_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAUSALIINAIL.Status() == 2)
    {
      int oldListQBE = PAN_CAUSALIINAIL.iUseListQBE;
      PAN_CAUSALIINAIL.iUseListQBE = 0;
      PAN_CAUSALIINAIL.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAUSALIINAIL.PanelCommand(Glb.PCM_FIND);
      PAN_CAUSALIINAIL.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CAUSINAIBOOK_MST_CAUINABOOPAG_Init()
  {
    BUK_CAUSINAIBOOK.InitMastro(BUK_CAUSINAIBOOK_MST_CAUINABOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_MST_CAUINABOOPAG, "6DE546C2-F9FB-4FC6-B308-000A0B229443");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_MST_CAUINABOOPAG, "CAUINABOOPAG");
    BUK_CAUSINAIBOOK.InitMastroBox(BUK_CAUSINAIBOOK_MST_CAUINABOOPAG, BUK_CAUSINAIBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 2200, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_PAGEHEADER, "7D4D0A1F-E023-41A3-862B-2927BF8AC066");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_CAUSINAIBOOK.InitMastroBox(BUK_CAUSINAIBOOK_MST_CAUINABOOPAG, BUK_CAUSINAIBOOK_RPTBOX_PAGEBODY, 1000, 3300, 19000, 22400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_PAGEBODY, "05758F36-745C-4A5F-9474-6657A57C0E32");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CAUSINAIBOOK.InitMastroBox(BUK_CAUSINAIBOOK_MST_CAUINABOOPAG, BUK_CAUSINAIBOOK_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_PAGEFOOTER, "344FB8D3-4D0A-4513-B37F-B3561CE43CCA");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
    BUK_CAUSINAIBOOK.InitMastroBox(BUK_CAUSINAIBOOK_MST_CAUINABOOPAG, BUK_CAUSINAIBOOK_RPTBOX_NUMEROPAGINA, 18100, 400, 1900, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_NUMEROPAGINA, "24513EE8-0D10-4E64-8193-3A6BBC03A4A7");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_NUMEROPAGINA, BUK_CAUSINAIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_NUMEROPAGINA, "06F2CCA8-06B0-400F-BED1-041036249E94");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
  }

  private void BUK_CAUSINAIBOOK_RPT_NEWREPORT_InitQuery() { BUK_CAUSINAIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CAUSINAIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.ALIQUOTA_INAIL as ALIQUOTA_INAIL, ");
      SQL.append("  A.ALIQUOTA_INAIL_CP as ALIQUOTA_INAIL_CP, ");
      SQL.append("  A.ALIQUOTA_INAIL_CE as ALIQUOTA_INAIL_CE, ");
      SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
      SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
      SQL.append("  A.PERC_IMPONIBILE as PERC_IMPONIBILE, ");
      SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
      SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
      SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
      SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
      SQL.append("from ");
      SQL.append("  T87 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_CAUSINAIBOOK.SetReportQuery(BUK_CAUSINAIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "44D5D3E3-AC77-4E81-9B08-5D0F41D5CE61");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CAUSINAIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CAUSINAIBOOK.InitReport(BUK_CAUSINAIBOOK_RPT_NEWREPORT, 196609);
    BUK_CAUSINAIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPT_NEWREPORT, "764DA3FD-8C95-4D30-9F96-DF6E135FC91B");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CAUSINAIBOOK.InitSection(BUK_CAUSINAIBOOK_RPT_NEWREPORT, BUK_CAUSINAIBOOK_SEC_REPORTHEADER, 600, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSINAIBOOK.SetSectionRendersInto(BUK_CAUSINAIBOOK_SEC_REPORTHEADER, BUK_CAUSINAIBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SEC_REPORTHEADER, "B9B0BCB6-CF57-4EA2-BD2B-7ED7FE39F0E3");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_REPORTHEADER, BUK_CAUSINAIBOOK_RPTBOX_CODICEHEADER, 100, 0, 1200, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_CODICEHEADER, "60422DC6-A232-46DE-95D9-BBD6131E200F");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_CODICEHEADER, BUK_CAUSINAIBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_CODICE, "C383BA2C-CB41-4CD6-B2F1-DA0EDA1BB0EE");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_CODICE, "CODICE");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_REPORTHEADER, BUK_CAUSINAIBOOK_RPTBOX_DESCRIHEADER, 1400, 0, 6700, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_DESCRIHEADER, "448168B2-AA8F-4DB1-B155-0D00B6BE6F83");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_DESCRIHEADER, BUK_CAUSINAIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_DESCRIZIONE, "48EAFE32-414D-4281-9949-9728F5F00F78");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_REPORTHEADER, BUK_CAUSINAIBOOK_RPTBOX_PERCIMPOHEAD, 8400, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_PERCIMPOHEAD, "51F51374-E46A-4334-AABC-DDAA1D25BEC4");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_PERCIMPOHEAD, "PERCIMPOHEAD");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_PERCIMPOHEAD, BUK_CAUSINAIBOOK_SPAN_PERCIMP, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Perc. Imp.", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_PERCIMP, "EC7D2B95-F41C-4C24-829C-05F53F67E512");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_PERCIMP, "PERCIMP");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_REPORTHEADER, BUK_CAUSINAIBOOK_RPTBOX_ALIQINAIHEAD, 10100, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_ALIQINAIHEAD, "A201DF00-CAC5-41AD-9D48-36EF217F1CDF");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_ALIQINAIHEAD, "ALIQINAIHEAD");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_ALIQINAIHEAD, BUK_CAUSINAIBOOK_SPAN_ALIQUOTA, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Aliquota", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_ALIQUOTA, "F8F1D9E9-7B9C-4AA9-A6B4-E635E47FF9C6");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_ALIQUOTA, "ALIQUOTA");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_REPORTHEADER, BUK_CAUSINAIBOOK_RPTBOX_ALIQINACPHEA, 11900, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_ALIQINACPHEA, "B06411AC-DB4B-4445-B93C-779625B56992");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_ALIQINACPHEA, "ALIQINACPHEA");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_ALIQINACPHEA, BUK_CAUSINAIBOOK_SPAN_ALIQPERCIP, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Aliq. Percip", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_ALIQPERCIP, "5539DFB4-503B-4347-8643-7C3ECFFF378B");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_ALIQPERCIP, "ALIQPERCIP");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_REPORTHEADER, BUK_CAUSINAIBOOK_RPTBOX_ALIQINACEHEA, 13900, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_ALIQINACEHEA, "D658A2FD-9CCA-4F6A-9054-C35F67E7FCAC");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_ALIQINACEHEA, "ALIQINACEHEA");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_ALIQINACEHEA, BUK_CAUSINAIBOOK_SPAN_ALIQENTE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Aliq. Ente", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_ALIQENTE, "F779A225-D489-415D-99AC-0049111D6B58");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_ALIQENTE, "ALIQENTE");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_REPORTHEADER, BUK_CAUSINAIBOOK_RPTBOX_ACCERTHEADER, 15900, 0, 2800, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_ACCERTHEADER, "7A1C9688-7656-4F8F-848B-386990713DF4");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_ACCERTHEADER, "ACCERTHEADER");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_ACCERTHEADER, BUK_CAUSINAIBOOK_SPAN_ACCERTAMENTO, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Accertamento", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_ACCERTAMENTO, "7F3DA7C6-6287-4C91-8D4D-9B5090E71D37");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_CAUSINAIBOOK.InitSection(BUK_CAUSINAIBOOK_RPT_NEWREPORT, BUK_CAUSINAIBOOK_SEC_PAGEHEADER, 1300, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSINAIBOOK.SetSectionRendersInto(BUK_CAUSINAIBOOK_SEC_PAGEHEADER, BUK_CAUSINAIBOOK_RPTBOX_PAGEHEADER);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SEC_PAGEHEADER, "F8F00A71-E34F-45A6-9E71-EEB287C50D9B");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_PAGEHEADER, BUK_CAUSINAIBOOK_RPTBOX_TITOLO, 200, 200, 18600, 900, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_TITOLO, "57DE63F4-4122-4D1B-83E5-F62592FD25D3");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_TITOLO, "TITOLO");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_TITOLO, BUK_CAUSINAIBOOK_SPAN_TITOLO, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Causali Inail", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_TITOLO, "EEE47173-A63A-4C34-AEFC-ED78BDDE8885");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_TITOLO, "TITOLO");
    BUK_CAUSINAIBOOK.InitSection(BUK_CAUSINAIBOOK_RPT_NEWREPORT, BUK_CAUSINAIBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSINAIBOOK.SetSectionRendersInto(BUK_CAUSINAIBOOK_SEC_DETAIL, BUK_CAUSINAIBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SEC_DETAIL, "242D06C6-1D00-4690-ADB0-782FD3A592BB");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SEC_DETAIL, "DETAIL");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_DETAIL, BUK_CAUSINAIBOOK_RPTBOX_CODICE, 0, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_CODICE, "E2CD0DF4-2F40-48DD-B0EA-EDE26498F2DF");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_CODICE, "CODICE");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_CODICE, BUK_CAUSINAIBOOK_SPAN_T8COCAINCAIB, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_T8COCAINCAIB, "BA97BCAC-240A-41B2-98C2-DC29266F4D13");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_T8COCAINCAIB, "T8COCAINCAIB");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_DETAIL, BUK_CAUSINAIBOOK_RPTBOX_DESCRIZIONE, 1300, 0, 6800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_DESCRIZIONE, "EE969BD2-BEDF-451D-B137-F4EE0AD88CB6");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_DESCRIZIONE, BUK_CAUSINAIBOOK_SPAN_T8DECAINCAIB, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_T8DECAINCAIB, "9D3DD61A-7477-47D5-B1E0-33FCEFCDF38E");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_T8DECAINCAIB, "T8DECAINCAIB");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_DETAIL, BUK_CAUSINAIBOOK_RPTBOX_PERCIMPONIBI, 8300, 0, 1592, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_PERCIMPONIBI, "E8674719-9FBD-4C47-BFD9-7B024DDB2A12");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_PERCIMPONIBI, "PERCIMPONIBI");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_PERCIMPONIBI, BUK_CAUSINAIBOOK_SPAN_T8PEIMCAICIB, MyGlb.VIS_DEFAREPOSTYL, 3, 6, 6, 271384705, "Brief description of field content.", "::PERC_IMPONIBILE", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_T8PEIMCAICIB, "000EA13F-960F-4724-9D6F-815C4229842F");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_T8PEIMCAICIB, "T8PEIMCAICIB");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_DETAIL, BUK_CAUSINAIBOOK_RPTBOX_ALIQUOTINAIL, 10100, 0, 1405, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_ALIQUOTINAIL, "1FA84EC7-F7A0-439B-A53E-8F66D0161E03");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_ALIQUOTINAIL, "ALIQUOTINAIL");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_ALIQUOTINAIL, BUK_CAUSINAIBOOK_SPAN_T8ALCAINCAIB, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "Brief description of field content.", "::ALIQUOTA_INAIL", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_T8ALCAINCAIB, "650E87A2-0886-472C-9264-E3F875171A15");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_T8ALCAINCAIB, "T8ALCAINCAIB");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_DETAIL, BUK_CAUSINAIBOOK_RPTBOX_ALIQUINAILCP, 11800, 0, 1692, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_ALIQUINAILCP, "07A98D62-8BB0-4BCC-983B-7690C217A67A");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_ALIQUINAILCP, "ALIQUINAILCP");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_ALIQUINAILCP, BUK_CAUSINAIBOOK_SPAN_T8ALPECAICIB, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "Brief description of field content.", "::ALIQUOTA_INAIL_CP", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_T8ALPECAICIB, "DA039CA2-EFDC-4319-B257-39FE7CD3C3D6");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_T8ALPECAICIB, "T8ALPECAICIB");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_DETAIL, BUK_CAUSINAIBOOK_RPTBOX_ALIQUINAILCE, 13800, 0, 1492, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_ALIQUINAILCE, "4C2B0E24-D3E6-476E-B001-C87B5AC520DF");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_ALIQUINAILCE, "ALIQUINAILCE");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_ALIQUINAILCE, BUK_CAUSINAIBOOK_SPAN_T8ALENCAICIB, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "Brief description of field content.", "::ALIQUOTA_INAIL_CE", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_T8ALENCAICIB, "74770A55-0CC5-44E7-A207-730A25E331D1");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_T8ALENCAICIB, "T8ALENCAICIB");
    BUK_CAUSINAIBOOK.InitReportBox(BUK_CAUSINAIBOOK_SEC_DETAIL, BUK_CAUSINAIBOOK_RPTBOX_ACCERTAMENTO, 15800, 0, 2900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_RPTBOX_ACCERTAMENTO, "8CDDC642-62C8-4120-85C2-101DB9159919");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_RPTBOX_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_CAUSINAIBOOK.InitBoxSpan(BUK_CAUSINAIBOOK_RPTBOX_ACCERTAMENTO, BUK_CAUSINAIBOOK_SPAN_TSTNACICIBIN, MyGlb.VIS_DEFAREPOSTYL, 5, 297, 0, 271384961, "", "", 1);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SPAN_TSTNACICIBIN, "AD1B2A5F-FFD1-4A31-9ADB-4314F0C64678");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SPAN_TSTNACICIBIN, "TSTNACICIBIN");
    BUK_CAUSINAIBOOK.InitSection(BUK_CAUSINAIBOOK_RPT_NEWREPORT, BUK_CAUSINAIBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSINAIBOOK.SetSectionRendersInto(BUK_CAUSINAIBOOK_SEC_PAGEFOOTER, BUK_CAUSINAIBOOK_RPTBOX_PAGEFOOTER);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SEC_PAGEFOOTER, "9308EE92-A0CA-412E-95D8-AE2F869AEBAB");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CAUSINAIBOOK.InitSection(BUK_CAUSINAIBOOK_RPT_NEWREPORT, BUK_CAUSINAIBOOK_SEC_REPORTFOOTER, 500, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSINAIBOOK.SetSectionRendersInto(BUK_CAUSINAIBOOK_SEC_REPORTFOOTER, BUK_CAUSINAIBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSINAIBOOK.SetRTCGuid(BUK_CAUSINAIBOOK_SEC_REPORTFOOTER, "7D1AEF42-D3AE-410E-856C-EC30BD6FCC33");
    BUK_CAUSINAIBOOK.SetObjCode(BUK_CAUSINAIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CAUSINAIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CAUSINAIBOOK_InitLinks()
  {
    BUK_CAUSINAIBOOK.SetBoxNextBox(BUK_CAUSINAIBOOK_RPTBOX_PAGEBODY, BUK_CAUSINAIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CAUSALIINAIL) PAN_CAUSALIINAIL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAUSALIINAIL) PAN_CAUSALIINAIL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CAUSALIINAIL) PAN_CAUSALIINAIL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAUSALIINAIL) PAN_CAUSALIINAIL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CAUSALIINAIL) PAN_CAUSALIINAIL_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_CAUSALIINAIL) PAN_CAUSALIINAIL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CAUSINAIBOOK) BUK_CAUSINAIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CAUSINAIBOOK) BUK_CAUSINAIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CAUSINAIBOOK) BUK_CAUSINAIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CAUSINAIBOOK) BUK_CAUSINAIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CAUSINAIBOOK) BUK_CAUSINAIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CAUSINAIBOOK) BUK_CAUSINAIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CAUSINAIBOOK) BUK_CAUSINAIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CAUSINAIBOOK) BUK_CAUSINAIBOOK_OnPreview();
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
