// **********************************************
// Cambi Di Stato Non Inviati 1
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CambiDiStatoNonInviati1 extends MyWebForm implements Serializable
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
  private static int BUK_NEWBOOK_RPTBOX_ORINSTORISDH = 10;
  private static int BUK_NEWBOOK_SPAN_DATA = 11;
  private static int BUK_NEWBOOK_RPTBOX_TIPDESEXPHEA = 12;
  private static int BUK_NEWBOOK_SPAN_TIPODESCEXPR = 13;
  private static int BUK_NEWBOOK_RPTBOX_ORINSTNUORHE = 14;
  private static int BUK_NEWBOOK_SPAN_NUMERO1 = 15;
  private static int BUK_NEWBOOK_RPTBOX_ORINSTOISPTH = 16;
  private static int BUK_NEWBOOK_SPAN_PROGR1 = 17;
  private static int BUK_NEWBOOK_RPTBOX_ORINSTNUORSH = 18;
  private static int BUK_NEWBOOK_SPAN_NUMERO = 19;
  private static int BUK_NEWBOOK_RPTBOX_ORINSOISPTSH = 20;
  private static int BUK_NEWBOOK_SPAN_PROGR = 21;
  private static int BUK_NEWBOOK_RPTBOX_ORINSTORISPH = 22;
  private static int BUK_NEWBOOK_SPAN_ORDINFSTAPRO = 23;
  private static int BUK_NEWBOOK_RPTBOX_MODISTATHEAD = 24;
  private static int BUK_NEWBOOK_SPAN_MODIFICSTATO = 25;
  private static int BUK_NEWBOOK_RPTBOX_ORDINAHEADER = 26;
  private static int BUK_NEWBOOK_SPAN_ORDINATIVO = 27;
  private static int BUK_NEWBOOK_RPTBOX_ORDISOSTHEAD = 28;
  private static int BUK_NEWBOOK_SPAN_ORDINASOSTIT = 29;
  private static int BUK_NEWBOOK_SEC_DETAIL = 30;
  private static int BUK_NEWBOOK_RPTBOX_ORDINFSTADAT = 31;
  private static int BUK_NEWBOOK_SPAN_ROISDCDSNI1N = 32;
  private static int BUK_NEWBOOK_RPTBOX_TIPODESCEXPR = 33;
  private static int BUK_NEWBOOK_SPAN_RTDECDSNI1NB = 34;
  private static int BUK_NEWBOOK_RPTBOX_ORDINFSTNUOR = 35;
  private static int BUK_NEWBOOK_SPAN_ROISNOCDSNI1 = 36;
  private static int BUK_NEWBOOK_RPTBOX_ORDINFSTPRTE = 37;
  private static int BUK_NEWBOOK_SPAN_ROISPTCDSNI1 = 38;
  private static int BUK_NEWBOOK_RPTBOX_ORINSTNUORSO = 39;
  private static int BUK_NEWBOOK_SPAN_ROISNOSCDSNI = 40;
  private static int BUK_NEWBOOK_RPTBOX_ORINSTPRTESO = 41;
  private static int BUK_NEWBOOK_SPAN_ROISPTSCDSNI = 42;
  private static int BUK_NEWBOOK_RPTBOX_ORDINFSTAPRO = 43;
  private static int BUK_NEWBOOK_SPAN_ROISPCDSNI1N = 44;
  private static int BUK_NEWBOOK_SEC_PAGEFOOTER = 45;
  private static int BUK_NEWBOOK_SEC_REPORTFOOTER = 46;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI68(IMDB);
    //
    //
    Init_PQRY_ORDINFSTATO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI68(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI68, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI68, "TBL_PARAMETRI68");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI68,IMDBDef6.FLD_PARAMETRI68_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI68,IMDBDef6.FLD_PARAMETRI68_ROWNAMETIPO,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI68,IMDBDef6.FLD_PARAMETRI68_ROWNAMGESMAN, "ROWNAMGESMAN");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI68,IMDBDef6.FLD_PARAMETRI68_ROWNAMGESMAN,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI68,IMDBDef6.FLD_PARAMETRI68_ROWNAMGESSOS, "ROWNAMGESSOS");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI68,IMDBDef6.FLD_PARAMETRI68_ROWNAMGESSOS,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI68, 0);
  }

  private static void Init_PQRY_ORDINFSTATO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDINFSTATO, 10);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDINFSTATO, "PQRY_ORDINFSTATO");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_NUMERO_ORD_SOST, "NUMERO_ORD_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_NUMERO_ORD_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_PROGRESSIVO_TESO_SOST, "PROGRESSIVO_TESO_SOST");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_PROGRESSIVO_TESO_SOST,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_RECTIPDESEXP, "RECTIPDESEXP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_RECTIPDESEXP,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_RECOTIPOEXPR, "RECOTIPOEXPR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINFSTATO,IMDBDef15.PQSL_ORDINFSTATO_RECOTIPOEXPR,5,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ORDINFSTATO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CambiDiStatoNonInviati1(MyWebEntryPoint w, IMDBObj imdb)
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
  public CambiDiStatoNonInviati1()
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
    FormIdx = MyGlb.FRM_CAMDISTNOIN1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7E022F1F-B1EB-4244-B918-A0B953587B59";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 952;
    DesignHeight = 742;
    set_Caption(new IDVariant("Cambi Di Stato Non Inviati 1"));
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
    BKW_NEWBOOK.iGuid = "AB7D629C-4CE3-43EF-AEC7-981A3E01EFAD";
    BKW_NEWBOOK.Code = "BUK_NEWBOOK";
    BKW_NEWBOOK.BookObj = BUK_NEWBOOK;
    BKW_NEWBOOK.InitDefMasks();
    BUK_NEWBOOK.set_FrIndex(1);
    BUK_NEWBOOK.InitBook(1, 3342337, "New Book", IMDB, MainFrm.VisualStyleList);
    BUK_NEWBOOK.InitHTML();
    BUK_NEWBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_NEWBOOK.SetSize(952, 686);
    BUK_NEWBOOK.Book.SetMainFrm(MainFrm);
    BUK_NEWBOOK.SetRTCGuid(0, "AB7D629C-4CE3-43EF-AEC7-981A3E01EFAD");
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
    return (obj instanceof CambiDiStatoNonInviati1);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CambiDiStatoNonInviati1.class.getName() : (Glb.ClassWithPackage(CambiDiStatoNonInviati1.class) ? CambiDiStatoNonInviati1.class.getName().substring(CambiDiStatoNonInviati1.class.getPackage().getName().length() + 1) : CambiDiStatoNonInviati1.class.getName()));
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
      BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_ORDINFSTAPRO, (new IDVariant(0)).booleanValue());
      BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_ORINSTORISPH, (new IDVariant(0)).booleanValue());
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI68, IMDBDef6.FLD_PARAMETRI68_ROWNAMETIPO, 0).equals((new IDVariant("B")), true) || IMDB.Value(IMDBDef6.TBL_PARAMETRI68, IMDBDef6.FLD_PARAMETRI68_ROWNAMETIPO, 0).equals((new IDVariant("S")), true))
      {
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_ORDISOSTHEAD, (new IDVariant(-1)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_ORINSTNUORSH, (new IDVariant(-1)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_ORINSOISPTSH, (new IDVariant(-1)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_ORINSTNUORSO, (new IDVariant(-1)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_ORINSTPRTESO, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_ORDISOSTHEAD, (new IDVariant(0)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_ORINSTNUORSH, (new IDVariant(0)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_ORINSOISPTSH, (new IDVariant(0)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_ORINSTNUORSO, (new IDVariant(0)).booleanValue());
        BUK_NEWBOOK.set_BoxVisible(BUK_NEWBOOK_RPTBOX_ORINSTPRTESO, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CambiDiStatoNonInviati1", "DetailBeforeFormattingEvent", _e);
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
      MainFrm.ErrObj.ProcError ("CambiDiStatoNonInviati1", "LoadEvent", _e);
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
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_MST_NEWTEMPLPAGE, "D7B436FE-AFA8-4D1B-900F-8BB937FF4DF8");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_MST_NEWTEMPLPAGE, "NEWTEMPLPAGE");
    BUK_NEWBOOK.InitMastroBox(BUK_NEWBOOK_MST_NEWTEMPLPAGE, BUK_NEWBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PAGEHEADER, "60AA7522-1C01-497B-94E3-148D86D451C9");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_NEWBOOK.InitMastroBox(BUK_NEWBOOK_MST_NEWTEMPLPAGE, BUK_NEWBOOK_RPTBOX_PAGEBODY, 1000, 4000, 19000, 21700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PAGEBODY, "A4165024-B017-48A2-A668-27369E5F5FEB");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_NEWBOOK.InitMastroBox(BUK_NEWBOOK_MST_NEWTEMPLPAGE, BUK_NEWBOOK_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PAGEFOOTER, "422B3C1C-3CC7-4332-87D7-E573A8C0AD6D");
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
      SQL.append("  B.ANNO_ORD as ANNO_ORD, ");
      SQL.append("  B.NUMERO_ORD as NUMERO_ORD, ");
      SQL.append("  B.PROGRESSIVO_TESO as PROGRESSIVO_TESO, ");
      SQL.append("  B.DATA as DATA, ");
      SQL.append("  B.NUMERO_ORD_SOST as NUMERO_ORD_SOST, ");
      SQL.append("  B.PROGRESSIVO_TESO_SOST as PROGRESSIVO_TESO_SOST, ");
      SQL.append("  B.TIPO as TIPO, ");
      SQL.append("  B.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  DECODE(B.TIPO, 'A', 'Annullo', DECODE(B.TIPO, 'V', 'Variazione', 'Sostituzione')) as RECTIPDESEXP, ");
      SQL.append("  ~~TBL_PARAMETRI68.ROWNAMETIPO~~ as RECOTIPOEXPR ");
      SQL.append("from ");
      SQL.append("  ORD_INF_STATO B ");
      SQL.append("where (B.ANNO_ORD = ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND B.TIPO = DECODE(~~TBL_PARAMETRI68.ROWNAMETIPO~~, 'B', B.TIPO, ~~TBL_PARAMETRI68.ROWNAMETIPO~~) AND (B.DATA_INVIO IS NULL) AND B.VERSIONE = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(A.VERSIONE) ");
      SQL.append("from ");
      SQL.append("  ORD_INF_STATO A ");
      SQL.append("where (B.ANNO_ORD = A.ANNO_ORD AND B.NUMERO_ORD = A.NUMERO_ORD AND B.PROGRESSIVO_TESO = A.PROGRESSIVO_TESO) ");
      SQL.append(")) ");
      SQL.append("order by ");
      SQL.append("  B.DATA ");
      BUK_NEWBOOK.SetReportQuery(BUK_NEWBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "BD2B7EF5-DF8F-42A2-A3A7-544B54E7E206");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_NEWBOOK_RPT_NEWREPORT_Init()
  {
    BUK_NEWBOOK.InitReport(BUK_NEWBOOK_RPT_NEWREPORT, 196609);
    BUK_NEWBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPT_NEWREPORT, "87EC5259-2602-45C0-B006-01FE3F41BB4C");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_REPORTHEADER, 2000, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_REPORTHEADER, BUK_NEWBOOK_RPTBOX_PAGEHEADER);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_REPORTHEADER, "B357D0CA-47A8-4AB6-804B-22A25F719CFF");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_REPORTHEADER, BUK_NEWBOOK_RPTBOX_NEWBOX, 100, 300, 18900, 1300, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_NEWBOX, "0A3CF185-DD90-40A1-B7B1-11F13F128648");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_NEWBOX, BUK_NEWBOOK_SPAN_ELCADISTNOIN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Elenco cambi di stato non inviati", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_ELCADISTNOIN, "C206758E-CE7B-448D-89EE-65476501AABC");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_ELCADISTNOIN, "ELCADISTNOIN");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_PAGEHEADER, 1700, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_PAGEBODY);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_PAGEHEADER, "551340C4-B92E-4195-ADEC-DABB3EDC9649");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_ORINSTORISDH, 0, 700, 1500, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORINSTORISDH, "EB78F4A3-9BB7-4F92-8940-F3E0239C1479");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORINSTORISDH, "ORINSTORISDH");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORINSTORISDH, BUK_NEWBOOK_SPAN_DATA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_DATA, "0294E878-4D06-42F4-B9B0-D53AA3B40B5B");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_DATA, "DATA");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_TIPDESEXPHEA, 1600, 700, 2200, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_TIPDESEXPHEA, "74B696DD-C19C-486F-91BB-5AE33060BD45");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_TIPDESEXPHEA, "TIPDESEXPHEA");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_TIPDESEXPHEA, BUK_NEWBOOK_SPAN_TIPODESCEXPR, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Tipo ", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_TIPODESCEXPR, "48F3CCED-A554-4C6F-8FAB-BB4CA4474548");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_TIPODESCEXPR, "TIPODESCEXPR");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_ORINSTNUORHE, 4000, 700, 1300, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORINSTNUORHE, "4937CF0A-F515-4CE2-8977-8BE7E30DDA6C");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORINSTNUORHE, "ORINSTNUORHE");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORINSTNUORHE, BUK_NEWBOOK_SPAN_NUMERO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Numero", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_NUMERO1, "4C0541C5-FEA8-4B84-86A6-FBED3EEA0839");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_NUMERO1, "NUMERO1");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_ORINSTOISPTH, 5400, 700, 1100, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORINSTOISPTH, "1FB7CA9D-B5FC-4052-8AFA-C0AE9402540C");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORINSTOISPTH, "ORINSTOISPTH");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORINSTOISPTH, BUK_NEWBOOK_SPAN_PROGR1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Progr.", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_PROGR1, "997FC9C7-00B4-4D00-A5E4-FA847B4643BC");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_PROGR1, "PROGR1");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_ORINSTNUORSH, 6800, 700, 1400, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORINSTNUORSH, "B174BF9F-751D-411E-B9CA-FD3B0E712B9B");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORINSTNUORSH, "ORINSTNUORSH");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORINSTNUORSH, BUK_NEWBOOK_SPAN_NUMERO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Numero", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_NUMERO, "80A53D32-A965-4133-A290-C5AB8495E672");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_NUMERO, "NUMERO");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_ORINSOISPTSH, 8300, 700, 1400, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORINSOISPTSH, "5DE4653F-E674-4D02-A7A5-DA794B943D35");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORINSOISPTSH, "ORINSOISPTSH");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORINSOISPTSH, BUK_NEWBOOK_SPAN_PROGR, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Progr.", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_PROGR, "BBD1F57E-1B60-45BD-BE2C-8474D3AD9570");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_PROGR, "PROGR");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_ORINSTORISPH, 10100, 100, 700, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORINSTORISPH, "E17DF0AF-32D7-45FD-B464-8DE003D61E04");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORINSTORISPH, "ORINSTORISPH");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORINSTORISPH, BUK_NEWBOOK_SPAN_ORDINFSTAPRO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "ORD INF STATO PROGRESSIVO", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_ORDINFSTAPRO, "FF09C8AD-AE91-470A-AD3B-7A835E221C6A");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_ORDINFSTAPRO, "ORDINFSTAPRO");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_MODISTATHEAD, 0, 100, 3800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCEN, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_MODISTATHEAD, "804ADF29-4992-442A-9095-86E0FBD3A3DE");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_MODISTATHEAD, "MODISTATHEAD");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_MODISTATHEAD, BUK_NEWBOOK_SPAN_MODIFICSTATO, MyGlb.VIS_INTSENBORCEN, 0, 0, 0, 271384961, "", "Modifica Stato", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_MODIFICSTATO, "F2997A76-6829-4A85-91B0-488869323AF9");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_MODIFICSTATO, "MODIFICSTATO");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_ORDINAHEADER, 4000, 100, 2500, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCEN, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORDINAHEADER, "F4FD92B4-35E0-4A50-A015-56322331D6C0");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORDINAHEADER, "ORDINAHEADER");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORDINAHEADER, BUK_NEWBOOK_SPAN_ORDINATIVO, MyGlb.VIS_INTSENBORCEN, 0, 0, 0, 271384961, "", "Ordinativo", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_ORDINATIVO, "C5FE34CD-6B26-46D0-B7F3-76D12032A920");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_ORDINATIVO, "ORDINATIVO");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_ORDISOSTHEAD, 6800, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCEN, 983041, 340, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORDISOSTHEAD, "49B60B1B-736A-495E-AA7C-3A5F662588E7");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORDISOSTHEAD, "ORDISOSTHEAD");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORDISOSTHEAD, BUK_NEWBOOK_SPAN_ORDINASOSTIT, MyGlb.VIS_INTSENBORCEN, 0, 0, 0, 271384961, "", "Ordinativo Sostituito", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_ORDINASOSTIT, "C9576C4D-2AAB-4611-8553-DDF2CE852303");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_ORDINASOSTIT, "ORDINASOSTIT");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_PAGEBODY);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_DETAIL, "562D562F-C11D-4801-824F-CBFC87712BA5");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SEC_DETAIL, "DETAIL");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_ORDINFSTADAT, 0, 0, 1500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORDINFSTADAT, "1ACA8B17-5107-4F9C-9E5E-8F4104BB0E3F");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORDINFSTADAT, "ORDINFSTADAT");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORDINFSTADAT, BUK_NEWBOOK_SPAN_ROISDCDSNI1N, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "", "::DATA", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_ROISDCDSNI1N, "2E7FE353-ACAD-4B48-9720-31C6D612FE41");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_ROISDCDSNI1N, "ROISDCDSNI1N");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_TIPODESCEXPR, 1600, 0, 2200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_TIPODESCEXPR, "43211D63-643F-442A-9970-96AA4C070637");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_TIPODESCEXPR, "TIPODESCEXPR");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_TIPODESCEXPR, BUK_NEWBOOK_SPAN_RTDECDSNI1NB, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECTIPDESEXP", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_RTDECDSNI1NB, "74B84DF6-FC41-4700-BA57-AA1A7961A30D");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_RTDECDSNI1NB, "RTDECDSNI1NB");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_ORDINFSTNUOR, 4100, 0, 800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORDINFSTNUOR, "C587324B-DD59-485E-A7FB-15D8870B2CD7");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORDINFSTNUOR, "ORDINFSTNUOR");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORDINFSTNUOR, BUK_NEWBOOK_SPAN_ROISNOCDSNI1, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "", "::NUMERO_ORD", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_ROISNOCDSNI1, "55CB8917-B21B-4B83-B761-E2FB0383B675");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_ROISNOCDSNI1, "ROISNOCDSNI1");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_ORDINFSTPRTE, 5400, 0, 800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORDINFSTPRTE, "D8009B34-7A21-4405-91E7-0D69340BDB80");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORDINFSTPRTE, "ORDINFSTPRTE");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORDINFSTPRTE, BUK_NEWBOOK_SPAN_ROISPTCDSNI1, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "", "::PROGRESSIVO_TESO", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_ROISPTCDSNI1, "7B2B957C-D4F3-4ED3-9792-DD5978B9EB51");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_ROISPTCDSNI1, "ROISPTCDSNI1");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_ORINSTNUORSO, 6800, 0, 700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORINSTNUORSO, "E8816446-AF3A-4C49-84CC-82580773FBE5");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORINSTNUORSO, "ORINSTNUORSO");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORINSTNUORSO, BUK_NEWBOOK_SPAN_ROISNOSCDSNI, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "", "::NUMERO_ORD_SOST", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_ROISNOSCDSNI, "8F8F8A00-6665-4652-9F5C-057D3AAE9F43");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_ROISNOSCDSNI, "ROISNOSCDSNI");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_ORINSTPRTESO, 8300, 100, 700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORINSTPRTESO, "F730FDFB-4A23-4805-9FD0-4D77E92AA3B8");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORINSTPRTESO, "ORINSTPRTESO");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORINSTPRTESO, BUK_NEWBOOK_SPAN_ROISPTSCDSNI, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "", "::PROGRESSIVO_TESO_SOST", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_ROISPTSCDSNI, "8164B435-73A5-4E4C-859D-EFB863FCC29D");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_ROISPTSCDSNI, "ROISPTSCDSNI");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_ORDINFSTAPRO, 10000, 0, 700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ORDINFSTAPRO, "285BF600-301F-4CE9-BDBB-592F9541CFE6");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ORDINFSTAPRO, "ORDINFSTAPRO");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ORDINFSTAPRO, BUK_NEWBOOK_SPAN_ROISPCDSNI1N, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "", "::PROGRESSIVO", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_ROISPCDSNI1N, "BEB502BB-31C2-4D5B-B1D1-173EF57B06E2");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_ROISPCDSNI1N, "ROISPCDSNI1N");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_PAGEFOOTER, BUK_NEWBOOK_RPTBOX_PAGEFOOTER);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_PAGEFOOTER, "FEB3EEDE-A450-41C5-BC6D-0EFA7CE09B94");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_REPORTFOOTER, BUK_NEWBOOK_RPTBOX_PAGEBODY);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_REPORTFOOTER, "AD04ADA2-0092-4C16-8BDF-E5960EF3CEAB");
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
