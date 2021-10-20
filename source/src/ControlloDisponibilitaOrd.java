// **********************************************
// Controllo Disponibilita Ord
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloDisponibilitaOrd extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_CONTDISPBOOK;
  OBook BKW_CONTDISPBOOK;
  //
  // Template Pages constants
  private static int BUK_CONTDISPBOOK_MST_TEMPLATEPAGE = 1;
  private static int BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CONTDISPBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_CONTDISPBOOK_SPAN_CONTRODISPON = 5;
  private static int BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD = 6;
  private static int BUK_CONTDISPBOOK_SPAN_GRUPPO = 7;
  private static int BUK_CONTDISPBOOK_RPTBOX_PAGEBODY = 8;
  private static int BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER = 9;

  //
  // Reports constants
  private static int BUK_CONTDISPBOOK_RPT_CONTDISPREPO = 10;
  private static int BUK_CONTDISPBOOK_SEC_REPORTHEADER = 11;
  private static int BUK_CONTDISPBOOK_SEC_PAGEHEADER = 12;
  private static int BUK_CONTDISPBOOK_RPTBOX_VOCEPEGHEADE = 13;
  private static int BUK_CONTDISPBOOK_SPAN_C = 14;
  private static int BUK_CONTDISPBOOK_RPTBOX_ACCERTHEADER = 15;
  private static int BUK_CONTDISPBOOK_SPAN_ACCERTAMENTO = 16;
  private static int BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER = 17;
  private static int BUK_CONTDISPBOOK_SPAN_DISPONIBILIT = 18;
  private static int BUK_CONTDISPBOOK_RPTBOX_TOTAGRUPHEAD = 19;
  private static int BUK_CONTDISPBOOK_SPAN_TOTALEGRUPPO = 20;
  private static int BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD = 21;
  private static int BUK_CONTDISPBOOK_SPAN_DISPONRISULT = 22;
  private static int BUK_CONTDISPBOOK_SEC_DETAIL = 23;
  private static int BUK_CONTDISPBOOK_RPTBOX_VOCEPEG = 24;
  private static int BUK_CONTDISPBOOK_SPAN_REVOPECDOCDB = 25;
  private static int BUK_CONTDISPBOOK_RPTBOX_ACCERTAMENTO = 26;
  private static int BUK_CONTDISPBOOK_SPAN_REACCODIOCDB = 27;
  private static int BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT = 28;
  private static int BUK_CONTDISPBOOK_SPAN_REDICODIOCDB = 29;
  private static int BUK_CONTDISPBOOK_RPTBOX_TOTALEGRUPPO = 30;
  private static int BUK_CONTDISPBOOK_SPAN_RETOGRCDOCDB = 31;
  private static int BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT = 32;
  private static int BUK_CONTDISPBOOK_SPAN_NVRDCDOCDBZN = 33;
  private static int BUK_CONTDISPBOOK_SEC_PAGEFOOTER = 34;
  private static int BUK_CONTDISPBOOK_SEC_REPORTFOOTER = 35;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI277(IMDB);
    //
    //
    Init_PQRY_GRO3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI277(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI277, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI277, "TBL_PARAMETRI277");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI277,IMDBDef5.FLD_PARAMETRI277_PARAMGRUPPO, "PARAMGRUPPO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI277,IMDBDef5.FLD_PARAMETRI277_PARAMGRUPPO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI277,IMDBDef5.FLD_PARAMETRI277_PARADESCGRUP, "PARADESCGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI277,IMDBDef5.FLD_PARAMETRI277_PARADESCGRUP,5,40,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI277,IMDBDef5.FLD_PARAMETRI277_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI277,IMDBDef5.FLD_PARAMETRI277_PARAENTRSPES,5,1,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI277, 0);
  }

  private static void Init_PQRY_GRO3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_GRO3, 8);
    IMDB.set_TblCode(IMDBDef15.PQRY_GRO3, "PQRY_GRO3");
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_RECORVOCEPEG, "RECORVOCEPEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_RECORVOCEPEG,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_RECORDACCERT, "RECORDACCERT");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_RECORDACCERT,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_RECORDDISPON, "RECORDDISPON");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_RECORDDISPON,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_RECOTOTAGRUP, "RECOTOTAGRUP");
    IMDB.SetFldParams(IMDBDef15.PQRY_GRO3,IMDBDef15.PQSL_GRO3_RECOTOTAGRUP,3,28,6);
    IMDB.TblAddNew(IMDBDef15.PQRY_GRO3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloDisponibilitaOrd(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloDisponibilitaOrd()
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
    FormIdx = MyGlb.FRM_CONTRDISPORD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "58ADCA40-1E02-4A15-85F5-76F237034CBB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 880;
    DesignHeight = 626;
    set_Caption(new IDVariant("Controllo Disponibilita Ord"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 880;
    Frames[1].Height = 600;
    Frames[1].Caption = "Controllo Disponibilita Book";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 600;
    BKW_CONTDISPBOOK = new OBook(this);
    BUK_CONTDISPBOOK = new CIDREObj(BKW_CONTDISPBOOK);
    Frames[1].Content = BKW_CONTDISPBOOK;
    BKW_CONTDISPBOOK.Height = 570;
    BKW_CONTDISPBOOK.Width = 880;
    BKW_CONTDISPBOOK.iGuid = "DDBF8E12-E2CB-4075-A0A2-4B4CCC1D1968";
    BKW_CONTDISPBOOK.Code = "BUK_CONTDISPBOOK";
    BKW_CONTDISPBOOK.BookObj = BUK_CONTDISPBOOK;
    BKW_CONTDISPBOOK.InitDefMasks();
    BUK_CONTDISPBOOK.set_FrIndex(1);
    BUK_CONTDISPBOOK.InitBook(1, 3342593, "Controllo Disponibilita Book", IMDB, MainFrm.VisualStyleList);
    BUK_CONTDISPBOOK.InitHTML();
    BUK_CONTDISPBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTDISPBOOK.SetSize(880, 570);
    BUK_CONTDISPBOOK.Book.SetMainFrm(MainFrm);
    BUK_CONTDISPBOOK.SetRTCGuid(0, "DDBF8E12-E2CB-4075-A0A2-4B4CCC1D1968");
    BUK_CONTDISPBOOK.SetObjCode(0, "CONTDISPBOOK");
    BUK_CONTDISPBOOK_MST_TEMPLATEPAGE_Init();
    BUK_CONTDISPBOOK_RPT_CONTDISPREPO_Init();
    BUK_CONTDISPBOOK_InitLinks();
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
      BUK_CONTDISPBOOK.UpdateBook();
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
    if (Code.equals("BUK_CONTDISPBOOK")) return BUK_CONTDISPBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ControlloDisponibilitaOrd);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloDisponibilitaOrd.class.getName() : (Glb.ClassWithPackage(ControlloDisponibilitaOrd.class) ? ControlloDisponibilitaOrd.class.getName().substring(ControlloDisponibilitaOrd.class.getPackage().getName().length() + 1) : ControlloDisponibilitaOrd.class.getName()));
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Controllo Disponibilità", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      Frames[BUK_CONTDISPBOOK.Book.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDisponibilitaOrd", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Detail Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_CONTDISPBOOK_SEC_DETAIL_OnFormattingSection()
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
      if ((IDL.Sub(BUK_CONTDISPBOOK.GetReportColumn(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "RECORDDISPON"), BUK_CONTDISPBOOK.GetReportColumn(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "RECOTOTAGRUP"))).compareTo((new IDVariant(0)), true)<0)
      {
        BUK_CONTDISPBOOK.set_BoxVisualStyle(BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, new IDVariant(new IDVariant(MyGlb.VIS_IMPORA8BORDI),IDVariant.INTEGER).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDisponibilitaOrd", "DetailBeforeFormattingEvent", _e);
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
  private void BUK_CONTDISPBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONTDISPBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONTDISPBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CONTDISPBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CONTDISPBOOK_SEC_DETAIL)
    {
      BUK_CONTDISPBOOK.set_SpanValue(BUK_CONTDISPBOOK_SPAN_NVRDCDOCDBZN, new IDVariant(IDL.Sub(IDL.NullValue(BUK_CONTDISPBOOK.GetReportColumn(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "RECORDDISPON"),(new IDVariant(0))), IDL.NullValue(BUK_CONTDISPBOOK.GetReportColumn(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "RECOTOTAGRUP"),(new IDVariant(0))))));
      BUK_CONTDISPBOOK_SEC_DETAIL_OnFormattingSection();
    }
    if (SectionID==BUK_CONTDISPBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CONTDISPBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CONTDISPBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONTDISPBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONTDISPBOOK_MST_TEMPLATEPAGE)
    {
      BUK_CONTDISPBOOK.set_SpanValue(BUK_CONTDISPBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTDISPBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTDISPBOOK.GetTotalPagesNumber()))))));
      BUK_CONTDISPBOOK.set_SpanValue(BUK_CONTDISPBOOK_SPAN_GRUPPO, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Gruppo")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI277, IMDBDef5.FLD_PARAMETRI277_PARAMGRUPPO, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef5.TBL_PARAMETRI277, IMDBDef5.FLD_PARAMETRI277_PARADESCGRUP, 0))));
    }
  }

  private void BUK_CONTDISPBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONTDISPBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONTDISPBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONTDISPBOOK_OnPreview()
  {
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void BUK_CONTDISPBOOK_MST_TEMPLATEPAGE_Init()
  {
    BUK_CONTDISPBOOK.InitMastro(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, "18AE668C-8F73-410A-B206-5EF000A7B89E");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, "TEMPLATEPAGE");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA, 18400, 500, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA, "A1677AC3-24B8-47AB-BD78-FAF8B5CC9072");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA, BUK_CONTDISPBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_NUMEROPAGINA, "23B29134-A758-4151-9E2B-48F51B94105A");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER, 1000, 1100, 19000, 900, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER, "CA1AFA63-F82C-43A8-A2B0-887889E76EF4");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER, BUK_CONTDISPBOOK_SPAN_CONTRODISPON, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Controllo Disponibilità", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_CONTRODISPON, "630A8212-E760-4DB5-BA27-4FCC77CC7237");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_CONTRODISPON, "CONTRODISPON");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD, 1000, 2200, 19000, 800, 0, 3, 1, MyGlb.VIS_HEASENBORCEN, 983041, 393, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD, "B3B3DE5E-1F92-46EF-A729-384A72E39FD3");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD, "PAGESOTTHEAD");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD, BUK_CONTDISPBOOK_SPAN_GRUPPO, MyGlb.VIS_HEASENBORCEN, 5, 149, 0, 271319425, "", "", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_GRUPPO, "0FE94AC4-940F-4AD4-85A7-D88C94DC6D61");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_GRUPPO, "GRUPPO");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY, 1000, 4000, 19000, 21700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_PAGEBODY, "0493111E-6DB8-4780-B884-392398F2E633");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER, "F84B88C3-C453-43E9-B088-F7BC02205BF2");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_CONTDISPBOOK_RPT_CONTDISPREPO_InitQuery() { BUK_CONTDISPBOOK_RPT_CONTDISPREPO_InitQuery(true, true); }
  private void BUK_CONTDISPBOOK_RPT_CONTDISPREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
      SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
      SQL.append("  MAX(TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )) as RECORVOCEPEG, ");
      SQL.append("  MAX(DECODE(A.NUMERO_ACC, to_number(NULL), NULL, TO_CHAR ( A.NUMERO_ACC ) || ' / ' || TO_CHAR ( A.ANNO_ACC ))) as RECORDACCERT, ");
      SQL.append("  MAX(DECODE(A.NUMERO_ACC, to_number(NULL), B.DISPONIBILITA, C.DISPONIBILITA)) as RECORDDISPON, ");
      SQL.append("  SUM(A.IMPORTO) as RECOTOTAGRUP ");
      SQL.append("from ");
      SQL.append("  GRO A, ");
      SQL.append("  BIL B, ");
      SQL.append("  ESEACC C ");
      SQL.append("where (A.GRUPPO = ~~TBL_PARAMETRI277.PARAMGRUPPO~~) ");
      SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (B.E_S = ~~TBL_PARAMETRI277.PARAENTRSPES~~) ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (C.ANNO_ACC(+) = A.ANNO_ACC) ");
      SQL.append("and   (C.NUMERO_ACC(+) = A.NUMERO_ACC) ");
      SQL.append("and   (C.ESERCIZIO(+) = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("group by ");
      SQL.append("  A.CAPITOLO, ");
      SQL.append("  A.ARTICOLO, ");
      SQL.append("  A.ANNO_ACC, ");
      SQL.append("  A.NUMERO_ACC ");
      BUK_CONTDISPBOOK.SetReportQuery(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "12D77033-A9CB-4048-9CCD-EB4FEA0B93EF");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTDISPBOOK_RPT_CONTDISPREPO_Init()
  {
    BUK_CONTDISPBOOK.InitReport(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, 196865);
    BUK_CONTDISPBOOK_RPT_CONTDISPREPO_InitQuery(true, false);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "C2604F08-2A4E-4161-B4FB-6EF762F5A662");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "CONTDISPREPO");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_REPORTHEADER, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_REPORTHEADER, "1CB8D56F-5C7F-4DE0-9586-3B60F9B427F4");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_PAGEHEADER, 500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_PAGEHEADER, "C6CC0E47-A939-4CCA-9254-80BA4D9CA060");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_VOCEPEGHEADE, 100, 0, 3300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_VOCEPEGHEADE, "FF60B976-2576-458F-9A19-0257FD8CAFFE");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_VOCEPEGHEADE, "VOCEPEGHEADE");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_VOCEPEGHEADE, BUK_CONTDISPBOOK_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_C, "19D11F70-AC05-49EB-977D-2B9FF024CE34");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_C, "C");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_ACCERTHEADER, 3500, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_ACCERTHEADER, "E052EFF2-6C7D-4EE1-B05F-54274D1E73E5");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_ACCERTHEADER, "ACCERTHEADER");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_ACCERTHEADER, BUK_CONTDISPBOOK_SPAN_ACCERTAMENTO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Accertamento", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_ACCERTAMENTO, "4543FAD3-E5D5-4696-A465-D2D43D17405F");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER, 5900, 0, 3900, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER, "5B9B0377-96F6-4EDA-AB22-FE083E910F6F");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER, BUK_CONTDISPBOOK_SPAN_DISPONIBILIT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_DISPONIBILIT, "6D487781-CB9D-475B-8EE7-8216BB683DDC");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_TOTAGRUPHEAD, 9900, 0, 3900, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_TOTAGRUPHEAD, "98B66D41-B251-4DBE-9A31-D0AF23EBF2F6");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_TOTAGRUPHEAD, "TOTAGRUPHEAD");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_TOTAGRUPHEAD, BUK_CONTDISPBOOK_SPAN_TOTALEGRUPPO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Totale Gruppo", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_TOTALEGRUPPO, "CF8391BF-EB81-43FF-BA22-984863C5384C");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_TOTALEGRUPPO, "TOTALEGRUPPO");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD, 13900, 0, 3900, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD, "FF2E0D66-284A-4899-A6BF-067FDAB95C33");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD, "DISPRISUHEAD");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD, BUK_CONTDISPBOOK_SPAN_DISPONRISULT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Disponibilità Risultante", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_DISPONRISULT, "FFF3CC0C-3F7B-4FBC-A435-402B19B2E467");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_DISPONRISULT, "DISPONRISULT");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_DETAIL, "9F5E28F2-4976-4C32-820A-C349311E4168");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_DETAIL, "DETAIL");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_VOCEPEG, 100, 0, 3300, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_VOCEPEG, "90FDCA5C-234A-410A-94B9-FA5CAA6A60C9");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_VOCEPEG, BUK_CONTDISPBOOK_SPAN_REVOPECDOCDB, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORVOCEPEG", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_REVOPECDOCDB, "163C2C32-3E5A-4F92-807E-0094B55FCBAE");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_REVOPECDOCDB, "REVOPECDOCDB");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_ACCERTAMENTO, 3500, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_ACCERTAMENTO, "4E155C53-1636-40EB-9760-6009F62EA507");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_ACCERTAMENTO, BUK_CONTDISPBOOK_SPAN_REACCODIOCDB, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "Max (If Equal (GRL ANNO IMP, Null Number, Null String, To String (GRL NUMERO IMP) +c barra con spazi +c To String (GRL ANNO IMP)))", "::RECORDACCERT", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_REACCODIOCDB, "2E7D7303-9071-432F-B499-E6B5195C6E01");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_REACCODIOCDB, "REACCODIOCDB");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT, 5900, 0, 3900, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT, "B9A2282E-DD23-43D6-A9C3-C8E2C022074E");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT, BUK_CONTDISPBOOK_SPAN_REDICODIOCDB, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::RECORDDISPON", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_REDICODIOCDB, "70F76375-5395-4707-933C-D20C3918AFBF");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_REDICODIOCDB, "REDICODIOCDB");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_TOTALEGRUPPO, 9900, 0, 3900, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_TOTALEGRUPPO, "FED7D540-FFE2-4CA9-A2E0-F96827C62627");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_TOTALEGRUPPO, "TOTALEGRUPPO");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_TOTALEGRUPPO, BUK_CONTDISPBOOK_SPAN_RETOGRCDOCDB, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::RECOTOTAGRUP", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_RETOGRCDOCDB, "794038F5-3423-405C-8EEF-D8001E253935");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_RETOGRCDOCDB, "RETOGRCDOCDB");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, 13900, 0, 3900, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, "C6677A69-94E4-4079-B376-AF51833237CA");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, "DISPONRISULT");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, BUK_CONTDISPBOOK_SPAN_NVRDCDOCDBZN, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_NVRDCDOCDBZN, "980A54C2-E3A4-4433-A8FE-A4FF4E1F75D5");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_NVRDCDOCDBZN, "NVRDCDOCDBZN");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_PAGEFOOTER, BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_PAGEFOOTER, "CCF3724A-11E4-4228-973D-45E704DA677B");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_REPORTFOOTER, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_REPORTFOOTER, "33AB3EFA-0938-43DA-A1AB-C0EC88DF1C37");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CONTDISPBOOK_RPT_CONTDISPREPO_InitQuery(false, true);
  }

  private void BUK_CONTDISPBOOK_InitLinks()
  {
    BUK_CONTDISPBOOK.SetBoxNextBox(BUK_CONTDISPBOOK_RPTBOX_PAGEBODY, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
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
    if (SrcObj == BKW_CONTDISPBOOK) BUK_CONTDISPBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CONTDISPBOOK) BUK_CONTDISPBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CONTDISPBOOK) BUK_CONTDISPBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CONTDISPBOOK) BUK_CONTDISPBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CONTDISPBOOK) BUK_CONTDISPBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CONTDISPBOOK) BUK_CONTDISPBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CONTDISPBOOK) BUK_CONTDISPBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CONTDISPBOOK) BUK_CONTDISPBOOK_OnPreview();
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
