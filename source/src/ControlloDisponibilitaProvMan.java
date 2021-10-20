// **********************************************
// Controllo Disponibilita Prov Man
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloDisponibilitaProvMan extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_CONTRODISPON;
  OBook BKW_CONTRODISPON;
  //
  // Template Pages constants
  private static int BUK_CONTRODISPON_MST_TEMPLATEPAGE = 1;
  private static int BUK_CONTRODISPON_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CONTRODISPON_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CONTRODISPON_RPTBOX_PAGEHEADER = 4;
  private static int BUK_CONTRODISPON_SPAN_CONTRODISPON = 5;
  private static int BUK_CONTRODISPON_RPTBOX_PAGEBODY = 6;
  private static int BUK_CONTRODISPON_RPTBOX_PAGEFOOTER = 7;

  //
  // Reports constants
  private static int BUK_CONTRODISPON_RPT_CONTDISPREPO = 8;
  private static int BUK_CONTRODISPON_SEC_REPORTHEADER = 9;
  private static int BUK_CONTRODISPON_SEC_PAGEHEADER = 10;
  private static int BUK_CONTRODISPON_RPTBOX_CAPITARTHEAD = 11;
  private static int BUK_CONTRODISPON_SPAN_C = 12;
  private static int BUK_CONTRODISPON_RPTBOX_IMPEGNHEADER = 13;
  private static int BUK_CONTRODISPON_SPAN_IMPEGNO = 14;
  private static int BUK_CONTRODISPON_RPTBOX_SUBIMPEGHEAD = 15;
  private static int BUK_CONTRODISPON_SPAN_SUBIMPEGNO = 16;
  private static int BUK_CONTRODISPON_RPTBOX_DISPONHEADER = 17;
  private static int BUK_CONTRODISPON_SPAN_DISPONIBILIT = 18;
  private static int BUK_CONTRODISPON_RPTBOX_TOTAPROVHEAD = 19;
  private static int BUK_CONTRODISPON_SPAN_TOTALEPROVVI = 20;
  private static int BUK_CONTRODISPON_RPTBOX_DISPRISUHEAD = 21;
  private static int BUK_CONTRODISPON_SPAN_DISPONRISULT = 22;
  private static int BUK_CONTRODISPON_SEC_DETAIL = 23;
  private static int BUK_CONTRODISPON_RPTBOX_CAPITOLOART = 24;
  private static int BUK_CONTRODISPON_SPAN_RECAARCDPMCD = 25;
  private static int BUK_CONTRODISPON_RPTBOX_IMPEGNO = 26;
  private static int BUK_CONTRODISPON_SPAN_REIMCODPMCDB = 27;
  private static int BUK_CONTRODISPON_RPTBOX_SUBIMPEGNO = 28;
  private static int BUK_CONTRODISPON_SPAN_RESUICDPMCDB = 29;
  private static int BUK_CONTRODISPON_RPTBOX_DISPONIBILIT = 30;
  private static int BUK_CONTRODISPON_SPAN_REDICODPMCDB = 31;
  private static int BUK_CONTRODISPON_RPTBOX_TOTALEPROVVI = 32;
  private static int BUK_CONTRODISPON_SPAN_RETOPCDPMCDB = 33;
  private static int BUK_CONTRODISPON_RPTBOX_DISPONRISULT = 34;
  private static int BUK_CONTRODISPON_SPAN_NVRDCDPMCDBZ = 35;
  private static int BUK_CONTRODISPON_SEC_PAGEFOOTER = 36;
  private static int BUK_CONTRODISPON_SEC_REPORTFOOTER = 37;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI403(IMDB);
    //
    //
    Init_PQRY_MANPROVDETT1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI403(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI403, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI403, "TBL_PARAMETRI403");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI403,IMDBDef5.FLD_PARAMETRI403_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI403,IMDBDef5.FLD_PARAMETRI403_PARAENTRSPES,5,1,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI403, 0);
  }

  private static void Init_PQRY_MANPROVDETT1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_MANPROVDETT1, 11);
    IMDB.set_TblCode(IMDBDef15.PQRY_MANPROVDETT1, "PQRY_MANPROVDETT1");
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_RECORCAPIART, "RECORCAPIART");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_RECORCAPIART,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_RECORDIMPEGN, "RECORDIMPEGN");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_RECORDIMPEGN,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_RECORSUBIMPE, "RECORSUBIMPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_RECORSUBIMPE,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_RECORDDISPON, "RECORDDISPON");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_RECORDDISPON,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_RECOTOTAPROV, "RECOTOTAPROV");
    IMDB.SetFldParams(IMDBDef15.PQRY_MANPROVDETT1,IMDBDef15.PQSL_MANPROVDETT1_RECOTOTAPROV,3,28,6);
    IMDB.TblAddNew(IMDBDef15.PQRY_MANPROVDETT1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloDisponibilitaProvMan(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloDisponibilitaProvMan()
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
    FormIdx = MyGlb.FRM_CONDISPROMAN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A4D68AEB-9386-4BBD-B8B0-BCDD51CC3F9C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 602;
    set_Caption(new IDVariant("Controllo Disponibilita Prov Man"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 576;
    Frames[1].Caption = "Controllo Disponibilita";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 576;
    BKW_CONTRODISPON = new OBook(this);
    BUK_CONTRODISPON = new CIDREObj(BKW_CONTRODISPON);
    Frames[1].Content = BKW_CONTRODISPON;
    BKW_CONTRODISPON.Height = 546;
    BKW_CONTRODISPON.Width = 844;
    BKW_CONTRODISPON.iGuid = "7FB09DB5-6A27-4B0D-A4AF-B659F781A33C";
    BKW_CONTRODISPON.Code = "BUK_CONTRODISPON";
    BKW_CONTRODISPON.BookObj = BUK_CONTRODISPON;
    BKW_CONTRODISPON.InitDefMasks();
    BUK_CONTRODISPON.set_FrIndex(1);
    BUK_CONTRODISPON.InitBook(1, 3342593, "Controllo Disponibilita", IMDB, MainFrm.VisualStyleList);
    BUK_CONTRODISPON.InitHTML();
    BUK_CONTRODISPON.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTRODISPON.SetSize(844, 546);
    BUK_CONTRODISPON.Book.SetMainFrm(MainFrm);
    BUK_CONTRODISPON.SetRTCGuid(0, "7FB09DB5-6A27-4B0D-A4AF-B659F781A33C");
    BUK_CONTRODISPON.SetObjCode(0, "CONTRODISPON");
    BUK_CONTRODISPON_MST_TEMPLATEPAGE_Init();
    BUK_CONTRODISPON_RPT_CONTDISPREPO_Init();
    BUK_CONTRODISPON_InitLinks();
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
      BUK_CONTRODISPON.UpdateBook();
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
    if (Code.equals("BUK_CONTRODISPON")) return BUK_CONTRODISPON;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ControlloDisponibilitaProvMan);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloDisponibilitaProvMan.class.getName() : (Glb.ClassWithPackage(ControlloDisponibilitaProvMan.class) ? ControlloDisponibilitaProvMan.class.getName().substring(ControlloDisponibilitaProvMan.class.getPackage().getName().length() + 1) : ControlloDisponibilitaProvMan.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Detail Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_CONTRODISPON_SEC_DETAIL_OnFormattingSection()
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
      if ((IDL.Sub(BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_CONTDISPREPO, "RECORDDISPON"), BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_CONTDISPREPO, "RECOTOTAPROV"))).compareTo((new IDVariant(0)), true)<0)
      {
        BUK_CONTRODISPON.set_BoxVisualStyle(BUK_CONTRODISPON_RPTBOX_DISPONRISULT, new IDVariant(new IDVariant(MyGlb.VIS_IMPORA8BORDI),IDVariant.INTEGER).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDisponibilitaProvMan", "DetailBeforeFormattingEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Controllo Disponibilità Provvisori", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDisponibilitaProvMan", "LoadEvent", _e);
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
  private void BUK_CONTRODISPON_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONTRODISPON_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONTRODISPON_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_DETAIL)
    {
      BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_NVRDCDPMCDBZ, new IDVariant(IDL.Sub(IDL.NullValue(BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_CONTDISPREPO, "RECORDDISPON"),(new IDVariant(0))), IDL.NullValue(BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_CONTDISPREPO, "RECOTOTAPROV"),(new IDVariant(0))))));
      BUK_CONTRODISPON_SEC_DETAIL_OnFormattingSection();
    }
    if (SectionID==BUK_CONTRODISPON_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CONTRODISPON_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CONTRODISPON_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONTRODISPON_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONTRODISPON_MST_TEMPLATEPAGE)
    {
      BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTRODISPON.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTRODISPON.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CONTRODISPON_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONTRODISPON_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONTRODISPON_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONTRODISPON_OnPreview()
  {
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void BUK_CONTRODISPON_MST_TEMPLATEPAGE_Init()
  {
    BUK_CONTRODISPON.InitMastro(BUK_CONTRODISPON_MST_TEMPLATEPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_MST_TEMPLATEPAGE, "7C6F7DCC-C89E-480A-840C-3631EA93E3A6");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_MST_TEMPLATEPAGE, "TEMPLATEPAGE");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATEPAGE, BUK_CONTRODISPON_RPTBOX_NUMEROPAGINA, 18400, 500, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_NUMEROPAGINA, "DEF6C12D-88DA-4B56-A97D-BEDCA1B07850");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_NUMEROPAGINA, BUK_CONTRODISPON_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_NUMEROPAGINA, "08371553-6883-4085-AFAB-D1ACA80B519B");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATEPAGE, BUK_CONTRODISPON_RPTBOX_PAGEHEADER, 1000, 1100, 19000, 900, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PAGEHEADER, "B742B2DC-603A-4AE5-9E18-D8EBE7FC0B76");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_PAGEHEADER, BUK_CONTRODISPON_SPAN_CONTRODISPON, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Controllo Disponibilità Provvisori", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_CONTRODISPON, "B42E9E06-AFC9-4E69-9C67-9C1D46C3A00A");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_CONTRODISPON, "CONTRODISPON");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATEPAGE, BUK_CONTRODISPON_RPTBOX_PAGEBODY, 1000, 2700, 19000, 23000, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PAGEBODY, "4CC93282-967C-49A8-8A24-2A6728B04938");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATEPAGE, BUK_CONTRODISPON_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PAGEFOOTER, "2FA8BC95-5ACA-4849-AC30-7AB2C1AC9368");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_CONTRODISPON_RPT_CONTDISPREPO_InitQuery() { BUK_CONTRODISPON_RPT_CONTDISPREPO_InitQuery(true, true); }
  private void BUK_CONTRODISPON_RPT_CONTDISPREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  B.CAPITOLO as CAPITOLO, ");
      SQL.append("  B.ARTICOLO as ARTICOLO, ");
      SQL.append("  B.ANNO_IMP as ANNO_IMP, ");
      SQL.append("  B.NUMERO_IMP as NUMERO_IMP, ");
      SQL.append("  B.ANNO_SUBIMP as ANNO_SUBIMP, ");
      SQL.append("  B.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
      SQL.append("  MAX(TO_CHAR ( B.CAPITOLO ) || ' / ' || TO_CHAR ( B.ARTICOLO )) as RECORCAPIART, ");
      SQL.append("  MAX(DECODE(B.ANNO_IMP, to_number(NULL), NULL, TO_CHAR ( B.NUMERO_IMP ) || ' / ' || TO_CHAR ( B.ANNO_IMP ))) as RECORDIMPEGN, ");
      SQL.append("  MAX(DECODE(B.ANNO_SUBIMP, to_number(NULL), NULL, TO_CHAR ( B.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( B.ANNO_SUBIMP ))) as RECORSUBIMPE, ");
      SQL.append("  MAX(DECODE(B.ANNO_IMP, to_number(NULL), C.DISPONIBILITA, DECODE(B.ANNO_SUBIMP, to_number(NULL), D.DISPONIBILITA, E.DISPONIBILITA))) as RECORDDISPON, ");
      SQL.append("  SUM(B.IMPORTO) as RECOTOTAPROV ");
      SQL.append("from ");
      SQL.append("  MAN_PROVVISORI A, ");
      SQL.append("  MAN_PROV_DETTAGLI B, ");
      SQL.append("  BIL C, ");
      SQL.append("  ESEIMP D, ");
      SQL.append("  ESESUB E ");
      SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((B.ANNO_LIQ IS NULL)) ");
      SQL.append("and   (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (C.E_S = ~~TBL_PARAMETRI403.PARAENTRSPES~~) ");
      SQL.append("and   (C.CAPITOLO = B.CAPITOLO) ");
      SQL.append("and   (C.ARTICOLO = B.ARTICOLO) ");
      SQL.append("and   (D.ANNO_IMP(+) = B.ANNO_IMP) ");
      SQL.append("and   (D.NUMERO_IMP(+) = B.NUMERO_IMP) ");
      SQL.append("and   (D.ESERCIZIO(+) = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (E.ANNO_SUBIMP(+) = B.ANNO_SUBIMP) ");
      SQL.append("and   (E.NUMERO_SUBIMP(+) = B.NUMERO_SUBIMP) ");
      SQL.append("and   (E.ESERCIZIO(+) = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (E.ANNO_IMP(+) = B.ANNO_IMP) ");
      SQL.append("and   (E.NUMERO_IMP(+) = B.NUMERO_IMP) ");
      SQL.append("and   (A.ESERCIZIO = B.ESERCIZIO) ");
      SQL.append("and   (A.PROGRESSIVO = B.PROGR_MAN_PROV) ");
      SQL.append("and   (~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA' OR A.PROGR_UNITA_ORGANIZZATIVA IN ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  F.PROGR_UNITA_ORGANIZZATIVA ");
      SQL.append("from ");
      SQL.append("  CF4WEB_STRUTTURA F ");
      SQL.append("where (F.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (F.TIPO_STRUTTURA = 'LG') ");
      SQL.append(")) ");
      SQL.append("group by ");
      SQL.append("  B.CAPITOLO, ");
      SQL.append("  B.ARTICOLO, ");
      SQL.append("  B.ANNO_IMP, ");
      SQL.append("  B.NUMERO_IMP, ");
      SQL.append("  B.ANNO_SUBIMP, ");
      SQL.append("  B.NUMERO_SUBIMP ");
      BUK_CONTRODISPON.SetReportQuery(BUK_CONTRODISPON_RPT_CONTDISPREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "E3DAF9B4-451C-4399-9F3F-3A16B740BF0A");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTRODISPON_RPT_CONTDISPREPO_Init()
  {
    BUK_CONTRODISPON.InitReport(BUK_CONTRODISPON_RPT_CONTDISPREPO, 196865);
    BUK_CONTRODISPON_RPT_CONTDISPREPO_InitQuery(true, false);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPT_CONTDISPREPO, "55088A16-7F21-466F-B563-41C0D61D06ED");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPT_CONTDISPREPO, "CONTDISPREPO");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_CONTDISPREPO, BUK_CONTRODISPON_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_REPORTHEADER, BUK_CONTRODISPON_RPTBOX_PAGEBODY);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_REPORTHEADER, "5D378D47-03A7-47B1-B7BA-26F84876C108");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_CONTDISPREPO, BUK_CONTRODISPON_SEC_PAGEHEADER, 500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_PAGEBODY);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_PAGEHEADER, "47EE4FCC-A7EC-4A61-B369-252D739818EB");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_CAPITARTHEAD, 100, 0, 3300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_CAPITARTHEAD, "96293568-3839-4949-879B-9462FEE94F35");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_CAPITARTHEAD, "CAPITARTHEAD");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_CAPITARTHEAD, BUK_CONTRODISPON_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_C, "B9F0E7AE-D25A-497E-923D-978DAEE394BA");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_C, "C");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_IMPEGNHEADER, 3500, 0, 2000, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_IMPEGNHEADER, "96122A28-633C-4958-870A-0B166B130392");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_IMPEGNHEADER, "IMPEGNHEADER");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_IMPEGNHEADER, BUK_CONTRODISPON_SPAN_IMPEGNO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Impegno", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_IMPEGNO, "18AAB4AA-65B1-4C84-87AB-1E4F8A5649F8");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_IMPEGNO, "IMPEGNO");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_SUBIMPEGHEAD, 5600, 0, 2000, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_SUBIMPEGHEAD, "4ACC2C0F-78D9-404B-B53C-29A1614EDB36");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_SUBIMPEGHEAD, "SUBIMPEGHEAD");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_SUBIMPEGHEAD, BUK_CONTRODISPON_SPAN_SUBIMPEGNO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Sub Impegno", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_SUBIMPEGNO, "5A331B65-B84B-4FC8-8A54-0A78263A193C");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_SUBIMPEGNO, "SUBIMPEGNO");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_DISPONHEADER, 7700, 0, 3400, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPONHEADER, "B03A2C06-E541-4B2A-829D-8E0D81C26CEF");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPONHEADER, BUK_CONTRODISPON_SPAN_DISPONIBILIT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONIBILIT, "B73E72CC-96D0-481B-A577-E1952D7E5044");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_TOTAPROVHEAD, 11200, 0, 3400, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_TOTAPROVHEAD, "BEB6EF8D-D5EC-4AEA-BF79-BB9ED37671AB");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_TOTAPROVHEAD, "TOTAPROVHEAD");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_TOTAPROVHEAD, BUK_CONTRODISPON_SPAN_TOTALEPROVVI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Provvisori", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_TOTALEPROVVI, "363E88B3-CCC5-4B4A-AD20-D4F999A71FF4");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_TOTALEPROVVI, "TOTALEPROVVI");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_DISPRISUHEAD, 14700, 0, 3400, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPRISUHEAD, "04758C54-3683-411A-918C-50EFAE08F684");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPRISUHEAD, "DISPRISUHEAD");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPRISUHEAD, BUK_CONTRODISPON_SPAN_DISPONRISULT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Disponibilità Risultante", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONRISULT, "2346DB42-662B-46DB-8CD4-1F1DBC951811");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONRISULT, "DISPONRISULT");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_CONTDISPREPO, BUK_CONTRODISPON_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_PAGEBODY);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_DETAIL, "95E89214-7E6E-4BCA-9A96-1FFA034E3C16");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_DETAIL, "DETAIL");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_CAPITOLOART, 100, 0, 3300, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_CAPITOLOART, "A3E19F9D-F5A0-47B7-A86F-E067A506CB26");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_CAPITOLOART, "CAPITOLOART");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_CAPITOLOART, BUK_CONTRODISPON_SPAN_RECAARCDPMCD, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORCAPIART", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_RECAARCDPMCD, "34811C82-4B89-4853-BDC6-FA7FE5A34682");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_RECAARCDPMCD, "RECAARCDPMCD");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_IMPEGNO, 3500, 0, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_IMPEGNO, "A3A30386-1191-4F4C-9524-6A01D570B43E");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_IMPEGNO, "IMPEGNO");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_IMPEGNO, BUK_CONTRODISPON_SPAN_REIMCODPMCDB, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORDIMPEGN", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REIMCODPMCDB, "C3D6A3C2-16BA-4439-AC7B-A9DDB4855857");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REIMCODPMCDB, "REIMCODPMCDB");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_SUBIMPEGNO, 5600, 0, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_SUBIMPEGNO, "50E41059-C000-4C83-A1C9-E471B6C41426");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_SUBIMPEGNO, "SUBIMPEGNO");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_SUBIMPEGNO, BUK_CONTRODISPON_SPAN_RESUICDPMCDB, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORSUBIMPE", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_RESUICDPMCDB, "B2C16AB8-6A1D-4F00-9795-C075120192D8");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_RESUICDPMCDB, "RESUICDPMCDB");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_DISPONIBILIT, 8100, 0, 3000, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPONIBILIT, "87DB1E51-441E-4F83-87EB-9E8C585F5F22");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPONIBILIT, BUK_CONTRODISPON_SPAN_REDICODPMCDB, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::RECORDDISPON", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REDICODPMCDB, "03DE656F-8103-4EFA-9230-69F21AFE81D2");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REDICODPMCDB, "REDICODPMCDB");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_TOTALEPROVVI, 11600, 0, 3000, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_TOTALEPROVVI, "6D8D80E5-320C-48BE-918B-AD58B17EC33D");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_TOTALEPROVVI, "TOTALEPROVVI");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_TOTALEPROVVI, BUK_CONTRODISPON_SPAN_RETOPCDPMCDB, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Sum (GRL IMPORTO)", "::RECOTOTAPROV", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_RETOPCDPMCDB, "44FF53E2-384A-456E-99CF-0499F944C8A0");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_RETOPCDPMCDB, "RETOPCDPMCDB");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_DISPONRISULT, 15100, 0, 3000, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPONRISULT, "8F63B398-53BD-4A23-8948-52E86CBD51EE");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPONRISULT, "DISPONRISULT");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPONRISULT, BUK_CONTRODISPON_SPAN_NVRDCDPMCDBZ, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_NVRDCDPMCDBZ, "09D93837-AA39-4D06-9909-60DEEAED6E3B");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_NVRDCDPMCDBZ, "NVRDCDPMCDBZ");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_CONTDISPREPO, BUK_CONTRODISPON_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_PAGEFOOTER, BUK_CONTRODISPON_RPTBOX_PAGEFOOTER);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_PAGEFOOTER, "83F4C148-4A7D-4F0B-8C6E-F88392938BCC");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_CONTDISPREPO, BUK_CONTRODISPON_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_REPORTFOOTER, BUK_CONTRODISPON_RPTBOX_PAGEBODY);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_REPORTFOOTER, "BBF9B430-6213-4497-AB81-D0E12C17858C");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CONTRODISPON_RPT_CONTDISPREPO_InitQuery(false, true);
  }

  private void BUK_CONTRODISPON_InitLinks()
  {
    BUK_CONTRODISPON.SetBoxNextBox(BUK_CONTRODISPON_RPTBOX_PAGEBODY, BUK_CONTRODISPON_RPTBOX_PAGEBODY);
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
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CONTRODISPON) BUK_CONTRODISPON_OnPreview();
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
