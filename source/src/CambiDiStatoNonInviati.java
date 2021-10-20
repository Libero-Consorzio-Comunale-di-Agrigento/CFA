// **********************************************
// Cambi Di Stato Non Inviati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CambiDiStatoNonInviati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_NEWBOOK;
  OBook BKW_NEWBOOK;
  //
  // Template Pages constants
  private static int BUK_NEWBOOK_MST_NEWTEMPLPAGE = 1;
  private static int BUK_NEWBOOK_RPTBOX_PAGEHEADER = 2;
  private static int BUK_NEWBOOK_RPTBOX_PAGEBODY = 3;
  private static int BUK_NEWBOOK_RPTBOX_PAGEFOOTER = 4;

  //
  // Reports constants
  private static int BUK_NEWBOOK_RPT_NEWREPORT = 5;
  private static int BUK_NEWBOOK_SEC_REPORTHEADER = 6;
  private static int BUK_NEWBOOK_RPTBOX_NEWBOX = 7;
  private static int BUK_NEWBOOK_SPAN_ELCADISTNOIN = 8;
  private static int BUK_NEWBOOK_SEC_PAGEHEADER = 9;
  private static int BUK_NEWBOOK_RPTBOX_DATAHEADER = 10;
  private static int BUK_NEWBOOK_SPAN_DATA = 11;
  private static int BUK_NEWBOOK_RPTBOX_TIPDESEXPHEA = 12;
  private static int BUK_NEWBOOK_SPAN_TIPODESCEXPR = 13;
  private static int BUK_NEWBOOK_RPTBOX_NUMEMANDHEAD = 14;
  private static int BUK_NEWBOOK_SPAN_NUMEROMAND = 15;
  private static int BUK_NEWBOOK_RPTBOX_PROGTESOHEAD = 16;
  private static int BUK_NEWBOOK_SPAN_PROGRESSTESO = 17;
  private static int BUK_NEWBOOK_RPTBOX_NUMMANSOSHEA = 18;
  private static int BUK_NEWBOOK_SPAN_NUMEMANDSOST = 19;
  private static int BUK_NEWBOOK_RPTBOX_PROTESSOSHEA = 20;
  private static int BUK_NEWBOOK_SPAN_PROGTESOSOST = 21;
  private static int BUK_NEWBOOK_RPTBOX_PROGREHEADER = 22;
  private static int BUK_NEWBOOK_SPAN_PROGRESSIVO = 23;
  private static int BUK_NEWBOOK_RPTBOX_MODISTATHEAD = 24;
  private static int BUK_NEWBOOK_SPAN_MODIFICSTATO = 25;
  private static int BUK_NEWBOOK_RPTBOX_MANDATHEADER = 26;
  private static int BUK_NEWBOOK_SPAN_MANDATO1 = 27;
  private static int BUK_NEWBOOK_RPTBOX_MANDSOSTHEAD = 28;
  private static int BUK_NEWBOOK_SPAN_MANDATO = 29;
  private static int BUK_NEWBOOK_SEC_DETAIL = 30;
  private static int BUK_NEWBOOK_RPTBOX_DATA = 31;
  private static int BUK_NEWBOOK_SPAN_RMISDCDSNINB = 32;
  private static int BUK_NEWBOOK_RPTBOX_TIPODESCEXPR = 33;
  private static int BUK_NEWBOOK_SPAN_RETDECDSNINB = 34;
  private static int BUK_NEWBOOK_RPTBOX_NUMEROMAND = 35;
  private static int BUK_NEWBOOK_SPAN_RMISNMCDSNIN = 36;
  private static int BUK_NEWBOOK_RPTBOX_PROGRESSTESO = 37;
  private static int BUK_NEWBOOK_SPAN_RMISPTCDSNIN = 38;
  private static int BUK_NEWBOOK_RPTBOX_NUMEMANDSOST = 39;
  private static int BUK_NEWBOOK_SPAN_RMISNMSCDSNI = 40;
  private static int BUK_NEWBOOK_RPTBOX_PROGTESOSOST = 41;
  private static int BUK_NEWBOOK_SPAN_RMISPTSCDSNI = 42;
  private static int BUK_NEWBOOK_RPTBOX_PROGRESSIVO = 43;
  private static int BUK_NEWBOOK_SPAN_RMISPCDSNINB = 44;
  private static int BUK_NEWBOOK_SEC_PAGEFOOTER = 45;
  private static int BUK_NEWBOOK_SEC_REPORTFOOTER = 46;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI59(IMDB);
    //
    //
    Init_PQRY_MANINFSTATO1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI59(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI59, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI59, "TBL_PARAMETRI59");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI59,IMDBDef6.FLD_PARAMETRI59_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI59,IMDBDef6.FLD_PARAMETRI59_ROWNAMETIPO,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI59,IMDBDef6.FLD_PARAMETRI59_ROWNAMGESMAN, "ROWNAMGESMAN");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI59,IMDBDef6.FLD_PARAMETRI59_ROWNAMGESMAN,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI59,IMDBDef6.FLD_PARAMETRI59_ROWNAMGESSOS, "ROWNAMGESSOS");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI59,IMDBDef6.FLD_PARAMETRI59_ROWNAMGESSOS,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI59, 0);
  }

  private static void Init_PQRY_MANINFSTATO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_MANINFSTATO1, 10);
    IMDB.set_TblCode(IMDBDef15.PQRY_MANINFSTATO1, "PQRY_MANINFSTATO1");
    IMDB.set_FldCode(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_NUMERO_MAND_SOST, "NUMERO_MAND_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_NUMERO_MAND_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_PROGRESSIVO_TESO_SOST, "PROGRESSIVO_TESO_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_PROGRESSIVO_TESO_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_RECOTIPOEXPR, "RECOTIPOEXPR");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_RECOTIPOEXPR,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_RECTIPDESEXP, "RECTIPDESEXP");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_RECTIPDESEXP,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANINFSTATO1,IMDBDef15.PQSL_MANINFSTATO1_PROGRESSIVO,1,2,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_MANINFSTATO1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CambiDiStatoNonInviati(MyWebEntryPoint w, IMDBObj imdb)
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
  public CambiDiStatoNonInviati()
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
    FormIdx = MyGlb.FRM_CAMDISTANOIN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9679F2CD-266F-4B41-8200-ED1FFBA038A5";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 952;
    DesignHeight = 742;
    set_Caption(new IDVariant("Cambi Di Stato Non Inviati"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 952;
    Frames[1].Height = 716;
    Frames[1].Caption = "New Book";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 716;
    BKW_NEWBOOK = new OBook(this);
    BUK_NEWBOOK = new CIDREObj(BKW_NEWBOOK);
    Frames[1].Content = BKW_NEWBOOK;
    BKW_NEWBOOK.Height = 686;
    BKW_NEWBOOK.Width = 952;
    BKW_NEWBOOK.iGuid = "650E1D05-3213-460E-A13D-6D3906C5A9D7";
    BKW_NEWBOOK.Code = "BUK_NEWBOOK";
    BKW_NEWBOOK.BookObj = BUK_NEWBOOK;
    BKW_NEWBOOK.InitDefMasks();
    BUK_NEWBOOK.set_FrIndex(1);
    BUK_NEWBOOK.InitBook(1, 3342337, "New Book", IMDB, MainFrm.VisualStyleList);
    BUK_NEWBOOK.InitHTML();
    BUK_NEWBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_NEWBOOK.SetSize(952, 686);
    BUK_NEWBOOK.Book.SetMainFrm(MainFrm);
    BUK_NEWBOOK.SetRTCGuid(0, "650E1D05-3213-460E-A13D-6D3906C5A9D7");
    BUK_NEWBOOK.SetObjCode(0, "NEWBOOK");
    BUK_NEWBOOK_MST_NEWTEMPLPAGE_Init();
    BUK_NEWBOOK_RPT_NEWREPORT_Init();
    BUK_NEWBOOK_InitLinks();
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
      BUK_NEWBOOK.UpdateBook();
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
    if (Code.equals("BUK_NEWBOOK")) return BUK_NEWBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof CambiDiStatoNonInviati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CambiDiStatoNonInviati.class.getName() : (Glb.ClassWithPackage(CambiDiStatoNonInviati.class) ? CambiDiStatoNonInviati.class.getName().substring(CambiDiStatoNonInviati.class.getPackage().getName().length() + 1) : CambiDiStatoNonInviati.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Detail Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_NEWBOOK_SEC_DETAIL_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Before Formatting Event Body
      // Procedure Body
      // 
      BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_PROGRESSIVO, (new IDVariant(0)).booleanValue());
      BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_PROGREHEADER, (new IDVariant(0)).booleanValue());
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI59, IMDBDef6.FLD_PARAMETRI59_ROWNAMETIPO, 0).equals((new IDVariant("B")), true) || IMDB.Value(IMDBDef6.TBL_PARAMETRI59, IMDBDef6.FLD_PARAMETRI59_ROWNAMETIPO, 0).equals((new IDVariant("S")), true))
      {
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_MANDSOSTHEAD, (new IDVariant(-1)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_NUMMANSOSHEA, (new IDVariant(-1)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_PROTESSOSHEA, (new IDVariant(-1)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_NUMEMANDSOST, (new IDVariant(-1)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_PROGTESOSOST, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_MANDSOSTHEAD, (new IDVariant(0)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_NUMMANSOSHEA, (new IDVariant(0)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_PROTESSOSHEA, (new IDVariant(0)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_NUMEMANDSOST, (new IDVariant(0)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_PROGTESOSOST, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CambiDiStatoNonInviati", "DetailBeforeFormattingEvent", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Elenco cambi di stato non inviati ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CambiDiStatoNonInviati", "LoadEvent", _e);
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
  private void BUK_NEWBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_NEWBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_NEWBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_NEWBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_NEWBOOK_SEC_DETAIL)
    {
      BUK_NEWBOOK_SEC_DETAIL_OnFormattingSection();
    }
    if (SectionID==BUK_NEWBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_NEWBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_NEWBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_NEWBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_NEWBOOK_MST_NEWTEMPLPAGE)
    {
    }
  }

  private void BUK_NEWBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_NEWBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_NEWBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_NEWBOOK_OnPreview()
  {
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void BUK_NEWBOOK_MST_NEWTEMPLPAGE_Init()
  {
    BUK_NEWBOOK.InitMastro(BUK_NEWBOOK_MST_NEWTEMPLPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_MST_NEWTEMPLPAGE, "9D34316B-6D25-49E8-BE61-5AB8F772959E");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_MST_NEWTEMPLPAGE, "NEWTEMPLPAGE");
    BUK_NEWBOOK.InitMastroBox(BUK_NEWBOOK_MST_NEWTEMPLPAGE, BUK_NEWBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PAGEHEADER, "1B893A14-4960-4F8F-8288-823A67FA568F");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_NEWBOOK.InitMastroBox(BUK_NEWBOOK_MST_NEWTEMPLPAGE, BUK_NEWBOOK_RPTBOX_PAGEBODY, 1000, 4000, 19000, 21700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PAGEBODY, "B0A1C01F-3ED3-469C-88F3-9090CE5A6B70");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_NEWBOOK.InitMastroBox(BUK_NEWBOOK_MST_NEWTEMPLPAGE, BUK_NEWBOOK_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PAGEFOOTER, "FCE8E4B6-D739-4238-A6F7-979AD98D7037");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_NEWBOOK_RPT_NEWREPORT_InitQuery() { BUK_NEWBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_NEWBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
      SQL.append("  A.NUMERO_MAND as NUMERO_MAND, ");
      SQL.append("  A.PROGRESSIVO_TESO as PROGRESSIVO_TESO, ");
      SQL.append("  A.DATA as DATA, ");
      SQL.append("  A.NUMERO_MAND_SOST as NUMERO_MAND_SOST, ");
      SQL.append("  A.PROGRESSIVO_TESO_SOST as PROGRESSIVO_TESO_SOST, ");
      SQL.append("  A.TIPO as TIPO, ");
      SQL.append("  ~~TBL_PARAMETRI59.ROWNAMETIPO~~ as RECOTIPOEXPR, ");
      SQL.append("  DECODE(A.TIPO, 'A', 'Annullo', DECODE(A.TIPO, 'V', 'Variazione', 'Sostituzione')) as RECTIPDESEXP, ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO ");
      SQL.append("from ");
      SQL.append("  MAN_INF_STATO A ");
      SQL.append("where (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND A.TIPO = DECODE(~~TBL_PARAMETRI59.ROWNAMETIPO~~, 'B', A.TIPO, ~~TBL_PARAMETRI59.ROWNAMETIPO~~) AND (A.DATA_INVIO IS NULL) AND A.VERSIONE = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(B.VERSIONE) ");
      SQL.append("from ");
      SQL.append("  MAN_INF_STATO B ");
      SQL.append("where (A.ANNO_MAND = B.ANNO_MAND AND A.NUMERO_MAND = B.NUMERO_MAND AND A.PROGRESSIVO_TESO = B.PROGRESSIVO_TESO) ");
      SQL.append(")) ");
      BUK_NEWBOOK.SetReportQuery(BUK_NEWBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "DF048A65-1FA2-4932-820B-08B002A5CD3B");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_NEWBOOK_RPT_NEWREPORT_Init()
  {
    BUK_NEWBOOK.InitReport(BUK_NEWBOOK_RPT_NEWREPORT, 196609);
    BUK_NEWBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPT_NEWREPORT, "B2AEF98C-BE4B-442A-96B9-AEBAEDF3EB1C");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_REPORTHEADER, 2000, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_REPORTHEADER, BUK_NEWBOOK_RPTBOX_PAGEHEADER);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_REPORTHEADER, "2831F07E-4F19-4DE2-A8CC-276DFB0779D6");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_REPORTHEADER, BUK_NEWBOOK_RPTBOX_NEWBOX, 100, 300, 18900, 1300, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_NEWBOX, "9805D6A8-9E20-4AE8-905A-499B683CE42F");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_NEWBOX, BUK_NEWBOOK_SPAN_ELCADISTNOIN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Elenco cambi di stato non inviati", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_ELCADISTNOIN, "1715D23C-AC5B-4CF3-9A20-7CEF4B679B4F");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_ELCADISTNOIN, "ELCADISTNOIN");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_PAGEHEADER, 1700, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_PAGEBODY);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_PAGEHEADER, "1B87F0A0-91FB-471B-892C-76FA93FF7DDA");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_DATAHEADER, 0, 700, 1500, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_DATAHEADER, "4A774BE7-CA63-4ABE-86F6-C0F7EEF2F93D");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_DATAHEADER, "DATAHEADER");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_DATAHEADER, BUK_NEWBOOK_SPAN_DATA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_DATA, "0D6E5AAA-9F09-47E8-8896-9089F8127F39");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_DATA, "DATA");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_TIPDESEXPHEA, 1600, 700, 2200, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_TIPDESEXPHEA, "72696925-1BD6-449E-A535-41D0299D23FC");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_TIPDESEXPHEA, "TIPDESEXPHEA");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_TIPDESEXPHEA, BUK_NEWBOOK_SPAN_TIPODESCEXPR, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Tipo ", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_TIPODESCEXPR, "15AF6FEC-41FF-4ACD-968B-DCC639FB816F");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_TIPODESCEXPR, "TIPODESCEXPR");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_NUMEMANDHEAD, 4100, 700, 1500, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_NUMEMANDHEAD, "5AE54CEE-CC0A-4CE4-BB58-49C7F601E0B8");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_NUMEMANDHEAD, "NUMEMANDHEAD");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_NUMEMANDHEAD, BUK_NEWBOOK_SPAN_NUMEROMAND, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Numero", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_NUMEROMAND, "C2D0DF30-C0C2-44A6-9900-F5AF80D22D92");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_NUMEROMAND, "NUMEROMAND");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_PROGTESOHEAD, 5700, 700, 1200, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PROGTESOHEAD, "6C16840B-5189-4217-9EDD-0DA5CA5514D9");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PROGTESOHEAD, "PROGTESOHEAD");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_PROGTESOHEAD, BUK_NEWBOOK_SPAN_PROGRESSTESO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Progr.", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_PROGRESSTESO, "28364436-4001-48EB-A4CE-A1D4D82101E9");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_PROGRESSTESO, "PROGRESSTESO");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_NUMMANSOSHEA, 7200, 700, 1500, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_NUMMANSOSHEA, "78A1CC66-79C5-4848-A19B-FB023448B862");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_NUMMANSOSHEA, "NUMMANSOSHEA");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_NUMMANSOSHEA, BUK_NEWBOOK_SPAN_NUMEMANDSOST, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Numero", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_NUMEMANDSOST, "05155805-CCAA-43D1-AD3A-AB5A9516B1E7");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_NUMEMANDSOST, "NUMEMANDSOST");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_PROTESSOSHEA, 9000, 700, 1400, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PROTESSOSHEA, "6EB7C9E9-119E-4CD7-8AAA-06AE38609AA5");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PROTESSOSHEA, "PROTESSOSHEA");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_PROTESSOSHEA, BUK_NEWBOOK_SPAN_PROGTESOSOST, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Progr.", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_PROGTESOSOST, "4B54179F-C415-45FE-B482-564B3DBE0524");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_PROGTESOSOST, "PROGTESOSOST");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_PROGREHEADER, 11800, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PROGREHEADER, "0C8ECDC5-3677-452E-B633-7CB5552CD417");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PROGREHEADER, "PROGREHEADER");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_PROGREHEADER, BUK_NEWBOOK_SPAN_PROGRESSIVO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "PROGRESSIVO", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_PROGRESSIVO, "A8670F2D-4E5C-45DC-8E4B-7F024D5139A3");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_PROGRESSIVO, "PROGRESSIVO");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_MODISTATHEAD, 0, 100, 3800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCEN, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_MODISTATHEAD, "E071DA79-5ED9-4960-8B7C-E79CE53503BD");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_MODISTATHEAD, "MODISTATHEAD");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_MODISTATHEAD, BUK_NEWBOOK_SPAN_MODIFICSTATO, MyGlb.VIS_INTSENBORCEN, 0, 0, 0, 271384961, "", "Modifica Stato", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_MODIFICSTATO, "57A20FA3-A77C-46EE-95E1-CFC41253424A");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_MODIFICSTATO, "MODIFICSTATO");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_MANDATHEADER, 4000, 100, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCEN, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_MANDATHEADER, "DEB924E3-C4A7-4EE5-89B1-CF4F4365FE70");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_MANDATHEADER, "MANDATHEADER");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_MANDATHEADER, BUK_NEWBOOK_SPAN_MANDATO1, MyGlb.VIS_INTSENBORCEN, 0, 0, 0, 271384961, "", "Mandato", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_MANDATO1, "6DBAA37C-79EC-4CE1-A97B-7391FEC9C676");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_MANDATO1, "MANDATO1");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_MANDSOSTHEAD, 7200, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCEN, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_MANDSOSTHEAD, "059449DA-DD8A-4535-B2E5-A87481D6553E");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_MANDSOSTHEAD, "MANDSOSTHEAD");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_MANDSOSTHEAD, BUK_NEWBOOK_SPAN_MANDATO, MyGlb.VIS_INTSENBORCEN, 0, 0, 0, 271384961, "", "Mandato Sostituito", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_MANDATO, "DA0ADE59-E376-473C-983C-D61C85CDC23D");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_MANDATO, "MANDATO");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_PAGEBODY);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_DETAIL, "1D8D2520-363D-40A9-89CA-3CCA6C961E15");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SEC_DETAIL, "DETAIL");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_DATA, 0, 0, 1500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_DATA, "6E2D173A-33AD-4570-BA27-7AF168234345");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_DATA, "DATA");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_DATA, BUK_NEWBOOK_SPAN_RMISDCDSNINB, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "", "::DATA", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_RMISDCDSNINB, "CCCF1B16-13B5-4BDD-AEE5-E3A03412DD0B");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_RMISDCDSNINB, "RMISDCDSNINB");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_TIPODESCEXPR, 1600, 0, 2200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_TIPODESCEXPR, "07D29BBA-282F-4FEB-BCDC-13468051933D");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_TIPODESCEXPR, "TIPODESCEXPR");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_TIPODESCEXPR, BUK_NEWBOOK_SPAN_RETDECDSNINB, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECTIPDESEXP", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_RETDECDSNINB, "A0C39FDF-7CF8-4595-AAAE-EB548515FBB8");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_RETDECDSNINB, "RETDECDSNINB");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_NUMEROMAND, 4100, 0, 1000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_NUMEROMAND, "D81376BE-317C-4452-BDD9-5D8626030F83");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_NUMEROMAND, "NUMEROMAND");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_NUMEROMAND, BUK_NEWBOOK_SPAN_RMISNMCDSNIN, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "", "::NUMERO_MAND", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_RMISNMCDSNIN, "A88B3A34-F3DE-43CE-93CE-F55846BDEBE2");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_RMISNMCDSNIN, "RMISNMCDSNIN");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_PROGRESSTESO, 5700, 0, 800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PROGRESSTESO, "4095DFEA-1D6B-47A5-99D2-FFB742DAB329");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PROGRESSTESO, "PROGRESSTESO");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_PROGRESSTESO, BUK_NEWBOOK_SPAN_RMISPTCDSNIN, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "", "::PROGRESSIVO_TESO", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_RMISPTCDSNIN, "3C9611EA-1CD7-434E-B241-3B064EF4EDE8");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_RMISPTCDSNIN, "RMISPTCDSNIN");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_NUMEMANDSOST, 7200, 0, 900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_NUMEMANDSOST, "89B58567-0F5F-44D6-85A3-7591CCB69530");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_NUMEMANDSOST, "NUMEMANDSOST");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_NUMEMANDSOST, BUK_NEWBOOK_SPAN_RMISNMSCDSNI, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "", "::NUMERO_MAND_SOST", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_RMISNMSCDSNI, "33F97038-E7F2-427F-AB1F-CDF897AB48F9");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_RMISNMSCDSNI, "RMISNMSCDSNI");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_PROGTESOSOST, 9000, 100, 800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PROGTESOSOST, "191D4F26-B73A-4E3F-8309-70A3A2D0A96D");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PROGTESOSOST, "PROGTESOSOST");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_PROGTESOSOST, BUK_NEWBOOK_SPAN_RMISPTSCDSNI, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "", "::PROGRESSIVO_TESO_SOST", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_RMISPTSCDSNI, "F31308CD-5A8C-43D1-88C0-CC7E5DF4A4F9");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_RMISPTSCDSNI, "RMISPTSCDSNI");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_PROGRESSIVO, 11700, 0, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PROGRESSIVO, "72570995-39E3-4830-9A77-49728D9D4B9A");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PROGRESSIVO, "PROGRESSIVO");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_PROGRESSIVO, BUK_NEWBOOK_SPAN_RMISPCDSNINB, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "", "::PROGRESSIVO", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_RMISPCDSNINB, "E3F42A18-D8D1-4474-A7B4-C70C58A009B6");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_RMISPCDSNINB, "RMISPCDSNINB");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_PAGEFOOTER, BUK_NEWBOOK_RPTBOX_PAGEFOOTER);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_PAGEFOOTER, "FC197E5F-BF2D-4B7E-BD01-B4C27877C02B");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_REPORTFOOTER, BUK_NEWBOOK_RPTBOX_PAGEBODY);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_REPORTFOOTER, "F787B223-7A52-45A6-98D4-71BB5FF72796");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_NEWBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_NEWBOOK_InitLinks()
  {
    BUK_NEWBOOK.SetBoxNextBox(BUK_NEWBOOK_RPTBOX_PAGEBODY, BUK_NEWBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
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
    if (SrcObj == BKW_NEWBOOK) BUK_NEWBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_NEWBOOK) BUK_NEWBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_NEWBOOK) BUK_NEWBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_NEWBOOK) BUK_NEWBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_NEWBOOK) BUK_NEWBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_NEWBOOK) BUK_NEWBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_NEWBOOK) BUK_NEWBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_NEWBOOK) BUK_NEWBOOK_OnPreview();
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
