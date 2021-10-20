// **********************************************
// Controllo Disponibilita Fuli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloDisponibilitaFuli extends MyWebForm implements Serializable
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
  private static int BUK_CONTDISPBOOK_SPAN_DISTINTA = 7;
  private static int BUK_CONTDISPBOOK_RPTBOX_PAGEBODY = 8;
  private static int BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER = 9;

  //
  // Reports constants
  private static int BUK_CONTDISPBOOK_RPT_CONTDISPREPO = 10;
  private static int BUK_CONTDISPBOOK_SEC_REPORTHEADER = 11;
  private static int BUK_CONTDISPBOOK_SEC_PAGEHEADER = 12;
  private static int BUK_CONTDISPBOOK_RPTBOX_VOCEPEGHEADE = 13;
  private static int BUK_CONTDISPBOOK_SPAN_C = 14;
  private static int BUK_CONTDISPBOOK_RPTBOX_IMPEGNHEADER = 15;
  private static int BUK_CONTDISPBOOK_SPAN_IMPEGNO = 16;
  private static int BUK_CONTDISPBOOK_RPTBOX_SUBIMPEGHEAD = 17;
  private static int BUK_CONTDISPBOOK_SPAN_SUBIMPEGNO = 18;
  private static int BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER = 19;
  private static int BUK_CONTDISPBOOK_SPAN_DISPONIBILIT = 20;
  private static int BUK_CONTDISPBOOK_RPTBOX_TOTADISTHEAD = 21;
  private static int BUK_CONTDISPBOOK_SPAN_TOTALEDISTIN = 22;
  private static int BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD = 23;
  private static int BUK_CONTDISPBOOK_SPAN_DISPONRISULT = 24;
  private static int BUK_CONTDISPBOOK_SEC_DETAIL = 25;
  private static int BUK_CONTDISPBOOK_RPTBOX_VOCEPEG = 26;
  private static int BUK_CONTDISPBOOK_SPAN_REVOPECDFCDB = 27;
  private static int BUK_CONTDISPBOOK_RPTBOX_IMPEGNO = 28;
  private static int BUK_CONTDISPBOOK_SPAN_REIMCODIFCDB = 29;
  private static int BUK_CONTDISPBOOK_RPTBOX_SUBIMPEGNO = 30;
  private static int BUK_CONTDISPBOOK_SPAN_RESUIMCDFCDB = 31;
  private static int BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT = 32;
  private static int BUK_CONTDISPBOOK_SPAN_REDICODIFCDB = 33;
  private static int BUK_CONTDISPBOOK_RPTBOX_TOTALEDISTIN = 34;
  private static int BUK_CONTDISPBOOK_SPAN_RETODICDFCDB = 35;
  private static int BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT = 36;
  private static int BUK_CONTDISPBOOK_SPAN_NVRDCDFCDBZN = 37;
  private static int BUK_CONTDISPBOOK_SEC_PAGEFOOTER = 38;
  private static int BUK_CONTDISPBOOK_SEC_REPORTFOOTER = 39;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI291(IMDB);
    //
    //
    Init_PQRY_IMPUTAZIONI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI291(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI291, 4);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI291, "TBL_PARAMETRI291");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI291,IMDBDef5.FLD_PARAMETRI291_PARANUMEDIST, "PARANUMEDIST");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI291,IMDBDef5.FLD_PARAMETRI291_PARANUMEDIST,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI291,IMDBDef5.FLD_PARAMETRI291_PARAANNODIST, "PARAANNODIST");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI291,IMDBDef5.FLD_PARAMETRI291_PARAANNODIST,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI291,IMDBDef5.FLD_PARAMETRI291_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI291,IMDBDef5.FLD_PARAMETRI291_PARAENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI291,IMDBDef5.FLD_PARAMETRI291_PARSOLIMDALI, "PARSOLIMDALI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI291,IMDBDef5.FLD_PARAMETRI291_PARSOLIMDALI,5,1,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI291, 0);
  }

  private static void Init_PQRY_IMPUTAZIONI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_IMPUTAZIONI, 11);
    IMDB.set_TblCode(IMDBDef14.PQRY_IMPUTAZIONI, "PQRY_IMPUTAZIONI");
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_ANNO_IMPEGNO, "ANNO_IMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_ANNO_IMPEGNO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_NUMERO_IMPEGNO, "NUMERO_IMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_NUMERO_IMPEGNO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_ANNO_SUBIMPEGNO, "ANNO_SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_ANNO_SUBIMPEGNO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_NUMERO_SUBIMPEGNO, "NUMERO_SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_NUMERO_SUBIMPEGNO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_RECORVOCEPEG, "RECORVOCEPEG");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_RECORVOCEPEG,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_RECORDIMPEGN, "RECORDIMPEGN");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_RECORDIMPEGN,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_RECORSUBIMPE, "RECORSUBIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_RECORSUBIMPE,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_RECORDDISPON, "RECORDDISPON");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_RECORDDISPON,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_RECOTOTADIST, "RECOTOTADIST");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI,IMDBDef14.PQSL_IMPUTAZIONI_RECOTOTADIST,3,28,6);
    IMDB.TblAddNew(IMDBDef14.PQRY_IMPUTAZIONI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloDisponibilitaFuli(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloDisponibilitaFuli()
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
    FormIdx = MyGlb.FRM_CONTDISPFULI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6E671C84-BDB7-4DF3-91B9-2F51BA9AB401";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 880;
    DesignHeight = 626;
    set_Caption(new IDVariant("Controllo Disponibilita Fuli"));
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
    BKW_CONTDISPBOOK.iGuid = "41382D37-F26D-4C78-B816-58E075741DC7";
    BKW_CONTDISPBOOK.Code = "BUK_CONTDISPBOOK";
    BKW_CONTDISPBOOK.BookObj = BUK_CONTDISPBOOK;
    BKW_CONTDISPBOOK.InitDefMasks();
    BUK_CONTDISPBOOK.set_FrIndex(1);
    BUK_CONTDISPBOOK.InitBook(1, 3342593, "Controllo Disponibilita Book", IMDB, MainFrm.VisualStyleList);
    BUK_CONTDISPBOOK.InitHTML();
    BUK_CONTDISPBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTDISPBOOK.SetSize(880, 570);
    BUK_CONTDISPBOOK.Book.SetMainFrm(MainFrm);
    BUK_CONTDISPBOOK.SetRTCGuid(0, "41382D37-F26D-4C78-B816-58E075741DC7");
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
    return (obj instanceof ControlloDisponibilitaFuli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloDisponibilitaFuli.class.getName() : (Glb.ClassWithPackage(ControlloDisponibilitaFuli.class) ? ControlloDisponibilitaFuli.class.getName().substring(ControlloDisponibilitaFuli.class.getPackage().getName().length() + 1) : ControlloDisponibilitaFuli.class.getName()));
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
      MainFrm.ErrObj.ProcError ("ControlloDisponibilitaFuli", "LoadEvent", _e);
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
      if ((IDL.Sub(BUK_CONTDISPBOOK.GetReportColumn(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "RECORDDISPON"), BUK_CONTDISPBOOK.GetReportColumn(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "RECOTOTADIST"))).compareTo((new IDVariant(0)), true)<0)
      {
        BUK_CONTDISPBOOK.set_BoxVisualStyle(BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, new IDVariant(new IDVariant(MyGlb.VIS_IMPORA8BORDI),IDVariant.INTEGER).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloDisponibilitaFuli", "DetailBeforeFormattingEvent", _e);
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
      BUK_CONTDISPBOOK.set_SpanValue(BUK_CONTDISPBOOK_SPAN_NVRDCDFCDBZN, new IDVariant(IDL.Sub(IDL.NullValue(BUK_CONTDISPBOOK.GetReportColumn(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "RECORDDISPON"),(new IDVariant(0))), IDL.NullValue(BUK_CONTDISPBOOK.GetReportColumn(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "RECOTOTADIST"),(new IDVariant(0))))));
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
      BUK_CONTDISPBOOK.set_SpanValue(BUK_CONTDISPBOOK_SPAN_DISTINTA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Distinta")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI291, IMDBDef5.FLD_PARAMETRI291_PARANUMEDIST, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI291, IMDBDef5.FLD_PARAMETRI291_PARAANNODIST, 0)))));
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
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, "2AF4DB4D-EECB-4D1C-9372-13AA712A8F1D");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, "TEMPLATEPAGE");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA, 18400, 500, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA, "43AE89B7-C04F-428C-8BAB-5906C4C8ED1E");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA, BUK_CONTDISPBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_NUMEROPAGINA, "704B27E3-0380-4A3A-90E9-45FB4C16B34D");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER, 1000, 1100, 19000, 900, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER, "33B39308-B935-4246-9BAF-BECA329FE201");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER, BUK_CONTDISPBOOK_SPAN_CONTRODISPON, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Controllo Disponibilità", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_CONTRODISPON, "296BF980-D428-4130-9BF3-FC1AF836E0F5");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_CONTRODISPON, "CONTRODISPON");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD, 1000, 2200, 19000, 800, 0, 3, 1, MyGlb.VIS_HEASENBORCEN, 983041, 393, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD, "4860718F-395B-48E3-9C67-DFCF90501B09");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD, "PAGESOTTHEAD");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD, BUK_CONTDISPBOOK_SPAN_DISTINTA, MyGlb.VIS_HEASENBORCEN, 5, 210, 0, 271319425, "", "", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_DISTINTA, "63E9DA39-77EB-4EE2-82DA-1DEA88F5FB39");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_DISTINTA, "DISTINTA");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY, 1000, 4000, 19000, 21700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_PAGEBODY, "01754ADF-E693-424E-BD42-3FCC6A4453ED");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER, "2D70C09E-CE1A-42F8-9980-9F540495EB1D");
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
      SQL.append("  A.ANNO_IMPEGNO as ANNO_IMPEGNO, ");
      SQL.append("  A.NUMERO_IMPEGNO as NUMERO_IMPEGNO, ");
      SQL.append("  A.ANNO_SUBIMPEGNO as ANNO_SUBIMPEGNO, ");
      SQL.append("  A.NUMERO_SUBIMPEGNO as NUMERO_SUBIMPEGNO, ");
      SQL.append("  MAX(TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )) as RECORVOCEPEG, ");
      SQL.append("  MAX(DECODE(A.ANNO_IMPEGNO, 0, NULL, TO_CHAR ( A.NUMERO_IMPEGNO ) || ' / ' || TO_CHAR ( A.ANNO_IMPEGNO ))) as RECORDIMPEGN, ");
      SQL.append("  MAX(DECODE(A.ANNO_SUBIMPEGNO, 0, NULL, TO_CHAR ( A.NUMERO_SUBIMPEGNO ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMPEGNO ))) as RECORSUBIMPE, ");
      SQL.append("  MAX(DECODE(A.ANNO_IMPEGNO, 0, B.DISPONIBILITA, DECODE(A.ANNO_SUBIMPEGNO, 0, C.DISPONIBILITA, D.DISPONIBILITA))) as RECORDDISPON, ");
      SQL.append("  SUM(NVL(A.DA_LIQUIDARE, DECODE(A.TIPO_DOCUMENTO, 2, A.IMPORTO * -1, A.IMPORTO))) as RECOTOTADIST ");
      SQL.append("from ");
      SQL.append("  IMPUTAZIONI A, ");
      SQL.append("  BIL B, ");
      SQL.append("  ESEIMP C, ");
      SQL.append("  ESESUB D ");
      SQL.append("where (A.NUMERO_DISTINTA = ~~TBL_PARAMETRI291.PARANUMEDIST~~) ");
      SQL.append("and   (A.ANNO_DISTINTA = ~~TBL_PARAMETRI291.PARAANNODIST~~) ");
      SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (B.E_S = ~~TBL_PARAMETRI291.PARAENTRSPES~~) ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (C.ANNO_IMP(+) = A.ANNO_IMPEGNO) ");
      SQL.append("and   (C.NUMERO_IMP(+) = A.NUMERO_IMPEGNO) ");
      SQL.append("and   (C.ESERCIZIO(+) = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (D.ANNO_SUBIMP(+) = A.ANNO_SUBIMPEGNO) ");
      SQL.append("and   (D.NUMERO_SUBIMP(+) = A.NUMERO_SUBIMPEGNO) ");
      SQL.append("and   (D.ESERCIZIO(+) = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (D.ANNO_IMP(+) = A.ANNO_IMPEGNO) ");
      SQL.append("and   (D.NUMERO_IMP(+) = A.NUMERO_IMPEGNO) ");
      SQL.append("and   (((A.FLAG_LIQUIDATO IS NULL) AND ~~TBL_PARAMETRI291.PARSOLIMDALI~~ = 'SI') OR (~~TBL_PARAMETRI291.PARSOLIMDALI~~ IS NULL)) ");
      SQL.append("group by ");
      SQL.append("  A.CAPITOLO, ");
      SQL.append("  A.ARTICOLO, ");
      SQL.append("  A.ANNO_IMPEGNO, ");
      SQL.append("  A.NUMERO_IMPEGNO, ");
      SQL.append("  A.ANNO_SUBIMPEGNO, ");
      SQL.append("  A.NUMERO_SUBIMPEGNO ");
      BUK_CONTDISPBOOK.SetReportQuery(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "4B350A57-B951-4D6B-A628-93A021BA0727");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTDISPBOOK_RPT_CONTDISPREPO_Init()
  {
    BUK_CONTDISPBOOK.InitReport(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, 196865);
    BUK_CONTDISPBOOK_RPT_CONTDISPREPO_InitQuery(true, false);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "012B4BF6-C168-4E32-A402-5BDDB2375732");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "CONTDISPREPO");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_REPORTHEADER, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_REPORTHEADER, "32D0EE24-0789-4E44-8DED-5F668DE5F0CE");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_PAGEHEADER, 500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_PAGEHEADER, "C1FDC646-9893-4688-86D5-3052D49ACD6F");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_VOCEPEGHEADE, 100, 0, 3300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_VOCEPEGHEADE, "BABDE06D-E8E8-4C9C-BDBE-E0159BD71B29");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_VOCEPEGHEADE, "VOCEPEGHEADE");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_VOCEPEGHEADE, BUK_CONTDISPBOOK_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_C, "31C10C6A-C2C4-4BD6-9F8C-0FA59962144B");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_C, "C");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_IMPEGNHEADER, 3500, 0, 2000, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_IMPEGNHEADER, "939EA501-D037-4BF6-8197-72B28301B6B0");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_IMPEGNHEADER, "IMPEGNHEADER");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_IMPEGNHEADER, BUK_CONTDISPBOOK_SPAN_IMPEGNO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Impegno", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_IMPEGNO, "9B35F9C8-C6DB-4DD8-A6E8-240180EBE770");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_IMPEGNO, "IMPEGNO");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_SUBIMPEGHEAD, 5600, 0, 2000, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_SUBIMPEGHEAD, "3DE137B4-77CD-4A27-976B-2389ECA99855");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_SUBIMPEGHEAD, "SUBIMPEGHEAD");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_SUBIMPEGHEAD, BUK_CONTDISPBOOK_SPAN_SUBIMPEGNO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Sub Impegno", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_SUBIMPEGNO, "368B35C2-30C9-42B4-B5CF-437E7AA3761D");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_SUBIMPEGNO, "SUBIMPEGNO");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER, 7700, 0, 3400, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER, "CE2B49FD-DE9B-4740-AA34-202D88317A1C");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER, BUK_CONTDISPBOOK_SPAN_DISPONIBILIT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_DISPONIBILIT, "8F1B3977-D40E-4A3D-AA8E-03CC61CC86E7");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_TOTADISTHEAD, 11200, 0, 3400, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_TOTADISTHEAD, "71295B1C-0015-49F5-A423-6CE195090995");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_TOTADISTHEAD, "TOTADISTHEAD");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_TOTADISTHEAD, BUK_CONTDISPBOOK_SPAN_TOTALEDISTIN, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Totale Distinta", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_TOTALEDISTIN, "9C1A1854-9F3A-4899-B503-1680AFC06715");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_TOTALEDISTIN, "TOTALEDISTIN");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD, 14700, 0, 3400, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD, "A86FDB2D-3145-40CF-A1E3-12843956EFA9");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD, "DISPRISUHEAD");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD, BUK_CONTDISPBOOK_SPAN_DISPONRISULT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Disponibilità Risultante", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_DISPONRISULT, "BFFA2168-302E-43B5-AEF7-637B5D42A2CE");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_DISPONRISULT, "DISPONRISULT");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_DETAIL, "2FD3699C-1C6D-4CBC-82B8-7FB410CFB5BB");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_DETAIL, "DETAIL");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_VOCEPEG, 100, 0, 3300, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_VOCEPEG, "5443F96A-2CB7-4095-9EB4-6A2A3E553D59");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_VOCEPEG, BUK_CONTDISPBOOK_SPAN_REVOPECDFCDB, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORVOCEPEG", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_REVOPECDFCDB, "1B96FFF4-6924-49A5-980A-23C6FA31A585");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_REVOPECDFCDB, "REVOPECDFCDB");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_IMPEGNO, 3500, 0, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_IMPEGNO, "8EC3DB7B-70C7-4F49-8BDF-8A3D26D0AD1F");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_IMPEGNO, "IMPEGNO");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_IMPEGNO, BUK_CONTDISPBOOK_SPAN_REIMCODIFCDB, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORDIMPEGN", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_REIMCODIFCDB, "63CDF5BA-E0AF-45D4-8AEC-5025DA02D3D6");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_REIMCODIFCDB, "REIMCODIFCDB");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_SUBIMPEGNO, 5600, 0, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_SUBIMPEGNO, "5BD82473-4FA8-4B60-BAAA-B029633BC982");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_SUBIMPEGNO, "SUBIMPEGNO");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_SUBIMPEGNO, BUK_CONTDISPBOOK_SPAN_RESUIMCDFCDB, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORSUBIMPE", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_RESUIMCDFCDB, "9340EF9F-28B7-4D62-BE54-7006EA8F53D1");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_RESUIMCDFCDB, "RESUIMCDFCDB");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT, 8100, 0, 3000, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT, "AAAB15F9-B121-4234-B04E-44A53835BE10");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT, BUK_CONTDISPBOOK_SPAN_REDICODIFCDB, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::RECORDDISPON", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_REDICODIFCDB, "4FA8375A-8BD4-47FE-BB99-A3807F1D73BD");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_REDICODIFCDB, "REDICODIFCDB");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_TOTALEDISTIN, 11600, 0, 3000, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_TOTALEDISTIN, "CE64734E-8646-48FB-9D00-F1ABFAA22CB3");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_TOTALEDISTIN, "TOTALEDISTIN");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_TOTALEDISTIN, BUK_CONTDISPBOOK_SPAN_RETODICDFCDB, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Sum (GRL IMPORTO)", "::RECOTOTADIST", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_RETODICDFCDB, "494602B8-C3A7-44C9-BEC3-A95A51ACAD36");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_RETODICDFCDB, "RETODICDFCDB");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, 15100, 0, 3000, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, "3782FF3B-B1CA-41F9-99FC-FB23FE9EA8CC");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, "DISPONRISULT");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, BUK_CONTDISPBOOK_SPAN_NVRDCDFCDBZN, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_NVRDCDFCDBZN, "E87BB4F2-780B-40FA-AEEE-6402F98C2981");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_NVRDCDFCDBZN, "NVRDCDFCDBZN");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_PAGEFOOTER, BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_PAGEFOOTER, "E0941B7D-EF61-45CD-BC9F-892B9AD749C0");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_REPORTFOOTER, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_REPORTFOOTER, "E4E4FDB7-AA0F-43B5-A9EB-EE94C0BB4748");
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
