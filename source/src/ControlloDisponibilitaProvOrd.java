// **********************************************
// Controllo Disponibilita Prov Ord
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloDisponibilitaProvOrd extends MyWebForm implements Serializable
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
  private static int BUK_CONTRODISPON_RPTBOX_VOCEPEGHEADE = 11;
  private static int BUK_CONTRODISPON_SPAN_VOCEPEG = 12;
  private static int BUK_CONTRODISPON_RPTBOX_ACCERTHEADER = 13;
  private static int BUK_CONTRODISPON_SPAN_ACCERTAMENTO = 14;
  private static int BUK_CONTRODISPON_RPTBOX_DISPONHEADER = 15;
  private static int BUK_CONTRODISPON_SPAN_DISPONIBILIT = 16;
  private static int BUK_CONTRODISPON_RPTBOX_TOTAPROVHEAD = 17;
  private static int BUK_CONTRODISPON_SPAN_TOTALEPROVVI = 18;
  private static int BUK_CONTRODISPON_RPTBOX_DISPRISUHEAD = 19;
  private static int BUK_CONTRODISPON_SPAN_DISPONRISULT = 20;
  private static int BUK_CONTRODISPON_SEC_DETAIL = 21;
  private static int BUK_CONTRODISPON_RPTBOX_VOCEPEG = 22;
  private static int BUK_CONTRODISPON_SPAN_REVOPCDPOCDB = 23;
  private static int BUK_CONTRODISPON_RPTBOX_ACCERTAMENTO = 24;
  private static int BUK_CONTRODISPON_SPAN_REACCODPOCDB = 25;
  private static int BUK_CONTRODISPON_RPTBOX_DISPONIBILIT = 26;
  private static int BUK_CONTRODISPON_SPAN_REDICODPOCDB = 27;
  private static int BUK_CONTRODISPON_RPTBOX_TOTALEPROVVI = 28;
  private static int BUK_CONTRODISPON_SPAN_RETOPCDPOCDB = 29;
  private static int BUK_CONTRODISPON_RPTBOX_DISPONRISULT = 30;
  private static int BUK_CONTRODISPON_SPAN_NVRDCDPOCDBZ = 31;
  private static int BUK_CONTRODISPON_SEC_PAGEFOOTER = 32;
  private static int BUK_CONTRODISPON_SEC_REPORTFOOTER = 33;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI107(IMDB);
    //
    //
    Init_PQRY_ORDPROVDETT2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI107(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI107, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI107, "TBL_PARAMETRI107");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI107,IMDBDef5.FLD_PARAMETRI107_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI107,IMDBDef5.FLD_PARAMETRI107_PARAENTRSPES,5,1,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI107, 0);
  }

  private static void Init_PQRY_ORDPROVDETT2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDPROVDETT2, 8);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDPROVDETT2, "PQRY_ORDPROVDETT2");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_ARTICOLO,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_RECORVOCEPEG, "RECORVOCEPEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_RECORVOCEPEG,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_RECORDACCERT, "RECORDACCERT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_RECORDACCERT,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_RECORDDISPON, "RECORDDISPON");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_RECORDDISPON,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_RECOTOTAPROV, "RECOTOTAPROV");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDPROVDETT2,IMDBDef15.PQSL_ORDPROVDETT2_RECOTOTAPROV,3,28,6);
    IMDB.TblAddNew(IMDBDef15.PQRY_ORDPROVDETT2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloDisponibilitaProvOrd(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloDisponibilitaProvOrd()
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
    FormIdx = MyGlb.FRM_CONDISPROORD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F8626E12-D19C-4573-BA2B-A33CF0C6919D";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 602;
    set_Caption(new IDVariant("Controllo Disponibilita Prov Ord"));
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
    BKW_CONTRODISPON.iGuid = "BB087301-9EAE-421A-A79B-8B9A1A9EA09D";
    BKW_CONTRODISPON.Code = "BUK_CONTRODISPON";
    BKW_CONTRODISPON.BookObj = BUK_CONTRODISPON;
    BKW_CONTRODISPON.InitDefMasks();
    BUK_CONTRODISPON.set_FrIndex(1);
    BUK_CONTRODISPON.InitBook(1, 3342593, "Controllo Disponibilita", IMDB, MainFrm.VisualStyleList);
    BUK_CONTRODISPON.InitHTML();
    BUK_CONTRODISPON.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTRODISPON.SetSize(844, 546);
    BUK_CONTRODISPON.Book.SetMainFrm(MainFrm);
    BUK_CONTRODISPON.SetRTCGuid(0, "BB087301-9EAE-421A-A79B-8B9A1A9EA09D");
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
    return (obj instanceof ControlloDisponibilitaProvOrd);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloDisponibilitaProvOrd.class.getName() : (Glb.ClassWithPackage(ControlloDisponibilitaProvOrd.class) ? ControlloDisponibilitaProvOrd.class.getName().substring(ControlloDisponibilitaProvOrd.class.getPackage().getName().length() + 1) : ControlloDisponibilitaProvOrd.class.getName()));
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
      MainFrm.ErrObj.ProcError ("ControlloDisponibilitaProvOrd", "DetailBeforeFormattingEvent", _e);
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
      MainFrm.ErrObj.ProcError ("ControlloDisponibilitaProvOrd", "LoadEvent", _e);
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
      BUK_CONTRODISPON.set_SpanValue(BUK_CONTRODISPON_SPAN_NVRDCDPOCDBZ, new IDVariant(IDL.Sub(IDL.NullValue(BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_CONTDISPREPO, "RECORDDISPON"),(new IDVariant(0))), IDL.NullValue(BUK_CONTRODISPON.GetReportColumn(BUK_CONTRODISPON_RPT_CONTDISPREPO, "RECOTOTAPROV"),(new IDVariant(0))))));
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
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_MST_TEMPLATEPAGE, "F12CD4D2-9B5A-49DE-A8FD-E3A3F244D478");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_MST_TEMPLATEPAGE, "TEMPLATEPAGE");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATEPAGE, BUK_CONTRODISPON_RPTBOX_NUMEROPAGINA, 18400, 500, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_NUMEROPAGINA, "0E960C2B-1BC3-40B4-ABDD-4177B413DB47");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_NUMEROPAGINA, BUK_CONTRODISPON_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_NUMEROPAGINA, "E2E2DBF7-B40C-463B-A22F-16395B55EFD6");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATEPAGE, BUK_CONTRODISPON_RPTBOX_PAGEHEADER, 1000, 1100, 19000, 900, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PAGEHEADER, "939E064B-E477-49B6-B681-3757AC042323");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_PAGEHEADER, BUK_CONTRODISPON_SPAN_CONTRODISPON, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Controllo Disponibilità Provvisori", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_CONTRODISPON, "F7EE3091-EFA9-423A-84E5-12E498EED5BF");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_CONTRODISPON, "CONTRODISPON");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATEPAGE, BUK_CONTRODISPON_RPTBOX_PAGEBODY, 1000, 2700, 19000, 23000, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PAGEBODY, "780CD87D-8F26-465E-9756-83EC0CA390FD");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CONTRODISPON.InitMastroBox(BUK_CONTRODISPON_MST_TEMPLATEPAGE, BUK_CONTRODISPON_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_PAGEFOOTER, "B2DC27CF-5A60-4610-AB6D-431192521C95");
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
      SQL.append("  B.ANNO_ACC as ANNO_ACC, ");
      SQL.append("  B.NUMERO_ACC as NUMERO_ACC, ");
      SQL.append("  MAX(TO_CHAR ( B.CAPITOLO ) || ' / ' || TO_CHAR ( B.ARTICOLO )) as RECORVOCEPEG, ");
      SQL.append("  MAX(DECODE(B.ANNO_ACC, to_number(NULL), NULL, TO_CHAR ( B.NUMERO_ACC ) || ' / ' || TO_CHAR ( B.ANNO_ACC ))) as RECORDACCERT, ");
      SQL.append("  MAX(DECODE(B.ANNO_ACC, to_number(NULL), C.DISPONIBILITA, D.DISPONIBILITA)) as RECORDDISPON, ");
      SQL.append("  SUM(B.IMPORTO) as RECOTOTAPROV ");
      SQL.append("from ");
      SQL.append("  ORD_PROVVISORI A, ");
      SQL.append("  ORD_PROV_DETTAGLI B, ");
      SQL.append("  BIL C, ");
      SQL.append("  ESEACC D ");
      SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((B.ANNO_PRE IS NULL)) ");
      SQL.append("and   (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (C.E_S = ~~TBL_PARAMETRI107.PARAENTRSPES~~) ");
      SQL.append("and   (C.CAPITOLO = B.CAPITOLO) ");
      SQL.append("and   (C.ARTICOLO = B.ARTICOLO) ");
      SQL.append("and   (D.ESERCIZIO(+) = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (D.ANNO_ACC(+) = B.ANNO_ACC) ");
      SQL.append("and   (D.NUMERO_ACC(+) = B.NUMERO_ACC) ");
      SQL.append("and   (A.ESERCIZIO = B.ESERCIZIO) ");
      SQL.append("and   (A.PROGRESSIVO = B.PROGR_ORD_PROV) ");
      SQL.append("and   (~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA' OR A.PROGR_UNITA_ORGANIZZATIVA IN ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  E.PROGR_UNITA_ORGANIZZATIVA ");
      SQL.append("from ");
      SQL.append("  CF4WEB_STRUTTURA E ");
      SQL.append("where (E.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (E.TIPO_STRUTTURA = 'LG') ");
      SQL.append(")) ");
      SQL.append("group by ");
      SQL.append("  B.CAPITOLO, ");
      SQL.append("  B.ARTICOLO, ");
      SQL.append("  B.ANNO_ACC, ");
      SQL.append("  B.NUMERO_ACC ");
      BUK_CONTRODISPON.SetReportQuery(BUK_CONTRODISPON_RPT_CONTDISPREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "1266B836-A903-41EE-9305-C223F5C66963");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTRODISPON_RPT_CONTDISPREPO_Init()
  {
    BUK_CONTRODISPON.InitReport(BUK_CONTRODISPON_RPT_CONTDISPREPO, 196865);
    BUK_CONTRODISPON_RPT_CONTDISPREPO_InitQuery(true, false);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPT_CONTDISPREPO, "86C171C9-CF2B-46B4-9107-38917BD9CD5F");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPT_CONTDISPREPO, "CONTDISPREPO");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_CONTDISPREPO, BUK_CONTRODISPON_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_REPORTHEADER, BUK_CONTRODISPON_RPTBOX_PAGEBODY);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_REPORTHEADER, "78F600DE-BFBA-4072-AB76-B85C4D9E5EA2");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_CONTDISPREPO, BUK_CONTRODISPON_SEC_PAGEHEADER, 500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_PAGEBODY);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_PAGEHEADER, "22FA9028-AF4A-441D-AB58-3731A58CC5F1");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_VOCEPEGHEADE, 100, 0, 3300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_VOCEPEGHEADE, "CCAE66AC-B817-4C4A-8907-CBCD32229CBA");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_VOCEPEGHEADE, "VOCEPEGHEADE");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_VOCEPEGHEADE, BUK_CONTRODISPON_SPAN_VOCEPEG, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Voce P.e.g.", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_VOCEPEG, "DC140520-C882-4F83-BECA-3167B05DD10D");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_VOCEPEG, "VOCEPEG");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_ACCERTHEADER, 3500, 0, 2200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_ACCERTHEADER, "0569BCF0-9B22-4ED1-B99D-2C9F43597FF3");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_ACCERTHEADER, "ACCERTHEADER");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_ACCERTHEADER, BUK_CONTRODISPON_SPAN_ACCERTAMENTO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Accertamento", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_ACCERTAMENTO, "83AD34E1-7B7A-4673-964F-2E103AB50DAA");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_DISPONHEADER, 6100, 0, 3400, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPONHEADER, "2EC41144-9CC1-4932-BA20-ED14E1533204");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPONHEADER, BUK_CONTRODISPON_SPAN_DISPONIBILIT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONIBILIT, "312F31D1-E8A2-4EBE-A00F-70AA1DDDD32E");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_TOTAPROVHEAD, 10000, 0, 3400, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_TOTAPROVHEAD, "8905DDD1-E27E-4E9E-82D5-19F61B531C3E");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_TOTAPROVHEAD, "TOTAPROVHEAD");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_TOTAPROVHEAD, BUK_CONTRODISPON_SPAN_TOTALEPROVVI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Provvisori", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_TOTALEPROVVI, "61A2A9CB-0A09-467B-BFC5-A49B5407E421");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_TOTALEPROVVI, "TOTALEPROVVI");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_PAGEHEADER, BUK_CONTRODISPON_RPTBOX_DISPRISUHEAD, 14000, 0, 3400, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPRISUHEAD, "62034072-8299-4D2C-9C65-8AC985583965");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPRISUHEAD, "DISPRISUHEAD");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPRISUHEAD, BUK_CONTRODISPON_SPAN_DISPONRISULT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Disponibilità Risultante", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_DISPONRISULT, "EDF30DE8-5CC9-44CA-89C7-074931A918DF");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_DISPONRISULT, "DISPONRISULT");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_CONTDISPREPO, BUK_CONTRODISPON_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_PAGEBODY);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_DETAIL, "0DA7F048-18D0-4BF0-BD93-C709FB23678F");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_DETAIL, "DETAIL");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_VOCEPEG, 100, 0, 3300, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_VOCEPEG, "68931537-D865-4F50-BCF5-54C17349D7AB");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_VOCEPEG, BUK_CONTRODISPON_SPAN_REVOPCDPOCDB, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORVOCEPEG", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REVOPCDPOCDB, "E6B633E5-C7B4-45CD-9BCA-2C11EE3CE6CA");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REVOPCDPOCDB, "REVOPCDPOCDB");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_ACCERTAMENTO, 3500, 0, 2200, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_ACCERTAMENTO, "CFF54EBF-99A7-4565-BA4E-A808E39072DB");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_ACCERTAMENTO, BUK_CONTRODISPON_SPAN_REACCODPOCDB, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "Max (If Equal (GRL ANNO IMP, Null Number, Null String, To String (GRL NUMERO IMP) +c barra con spazi +c To String (GRL ANNO IMP)))", "::RECORDACCERT", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REACCODPOCDB, "9D0C7B77-21A0-47F3-A40D-90B69FF410BB");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REACCODPOCDB, "REACCODPOCDB");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_DISPONIBILIT, 6500, 0, 3000, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPONIBILIT, "1560770A-D435-4E9E-A629-36F29042B542");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPONIBILIT, BUK_CONTRODISPON_SPAN_REDICODPOCDB, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::RECORDDISPON", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_REDICODPOCDB, "7BF47BAB-15C3-4CF0-A9C2-C5D746FEF3FE");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_REDICODPOCDB, "REDICODPOCDB");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_TOTALEPROVVI, 10400, 0, 3000, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_TOTALEPROVVI, "7ADAF799-DCA2-40FE-91E2-DB3CB07B8DA3");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_TOTALEPROVVI, "TOTALEPROVVI");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_TOTALEPROVVI, BUK_CONTRODISPON_SPAN_RETOPCDPOCDB, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Sum (GRL IMPORTO)", "::RECOTOTAPROV", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_RETOPCDPOCDB, "58C9C327-8AEB-4BAC-BB08-970E5ECF7C3E");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_RETOPCDPOCDB, "RETOPCDPOCDB");
    BUK_CONTRODISPON.InitReportBox(BUK_CONTRODISPON_SEC_DETAIL, BUK_CONTRODISPON_RPTBOX_DISPONRISULT, 14400, 0, 3000, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_RPTBOX_DISPONRISULT, "8359D5ED-77D4-495D-B29C-7842D05DDCFB");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_RPTBOX_DISPONRISULT, "DISPONRISULT");
    BUK_CONTRODISPON.InitBoxSpan(BUK_CONTRODISPON_RPTBOX_DISPONRISULT, BUK_CONTRODISPON_SPAN_NVRDCDPOCDBZ, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SPAN_NVRDCDPOCDBZ, "A427BCE2-A203-4D43-B378-4EA7F5E1D8FE");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SPAN_NVRDCDPOCDBZ, "NVRDCDPOCDBZ");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_CONTDISPREPO, BUK_CONTRODISPON_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_PAGEFOOTER, BUK_CONTRODISPON_RPTBOX_PAGEFOOTER);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_PAGEFOOTER, "D4EFFDB8-4D56-450B-B3E8-122DC9FA4188");
    BUK_CONTRODISPON.SetObjCode(BUK_CONTRODISPON_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CONTRODISPON.InitSection(BUK_CONTRODISPON_RPT_CONTDISPREPO, BUK_CONTRODISPON_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTRODISPON.SetSectionRendersInto(BUK_CONTRODISPON_SEC_REPORTFOOTER, BUK_CONTRODISPON_RPTBOX_PAGEBODY);
    BUK_CONTRODISPON.SetRTCGuid(BUK_CONTRODISPON_SEC_REPORTFOOTER, "D44C641F-5BB4-4511-BA7F-9B8B44026964");
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
