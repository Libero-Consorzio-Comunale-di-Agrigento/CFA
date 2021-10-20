// **********************************************
// Disponibilita Puro Ord
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DisponibilitaPuroOrd extends MyWebForm implements Serializable
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
  private static int BUK_CONTDISPBOOK_SPAN_C1 = 5;
  private static int BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD = 6;
  private static int BUK_CONTDISPBOOK_SPAN_GRUPPO = 7;
  private static int BUK_CONTDISPBOOK_RPTBOX_PAGEBODY = 8;
  private static int BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER = 9;

  //
  // Reports constants
  private static int BUK_CONTDISPBOOK_RPT_CONTDISPREPO = 10;
  private static int BUK_CONTDISPBOOK_SEC_REPORTHEADER = 11;
  private static int BUK_CONTDISPBOOK_SEC_PAGEHEADER = 12;
  private static int BUK_CONTDISPBOOK_RPTBOX_CAARAAAAAAAH = 13;
  private static int BUK_CONTDISPBOOK_SPAN_C2 = 14;
  private static int BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER = 15;
  private static int BUK_CONTDISPBOOK_SPAN_C3 = 16;
  private static int BUK_CONTDISPBOOK_RPTBOX_TOTAGRUPHEAD = 17;
  private static int BUK_CONTDISPBOOK_SPAN_C4 = 18;
  private static int BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD = 19;
  private static int BUK_CONTDISPBOOK_SPAN_C = 20;
  private static int BUK_CONTDISPBOOK_SEC_DETAIL = 21;
  private static int BUK_CONTDISPBOOK_RPTBOX_CAPITOARTART = 22;
  private static int BUK_CONTDISPBOOK_SPAN_RECAARDPOCDB = 23;
  private static int BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT = 24;
  private static int BUK_CONTDISPBOOK_SPAN_REDIDIPUOCDB = 25;
  private static int BUK_CONTDISPBOOK_RPTBOX_TOTALEGRUPPO = 26;
  private static int BUK_CONTDISPBOOK_SPAN_RETOGRDPOCDB = 27;
  private static int BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT = 28;
  private static int BUK_CONTDISPBOOK_SPAN_NVRDDPOCDBZN = 29;
  private static int BUK_CONTDISPBOOK_SEC_PAGEFOOTER = 30;
  private static int BUK_CONTDISPBOOK_SEC_REPORTFOOTER = 31;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI508(IMDB);
    //
    //
    Init_PQRY_GRO2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI508(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI508, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI508, "TBL_PARAMETRI508");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI508,IMDBDef5.FLD_PARAMETRI508_PARAMGRUPPO, "PARAMGRUPPO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI508,IMDBDef5.FLD_PARAMETRI508_PARAMGRUPPO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI508,IMDBDef5.FLD_PARAMETRI508_PARADESCGRUP, "PARADESCGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI508,IMDBDef5.FLD_PARAMETRI508_PARADESCGRUP,5,40,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI508,IMDBDef5.FLD_PARAMETRI508_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI508,IMDBDef5.FLD_PARAMETRI508_PARAENTRSPES,5,1,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI508, 0);
  }

  private static void Init_PQRY_GRO2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_GRO2, 6);
    IMDB.set_TblCode(IMDBDef14.PQRY_GRO2, "PQRY_GRO2");
    IMDB.set_FldCode(IMDBDef14.PQRY_GRO2,IMDBDef14.PQSL_GRO2_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRO2,IMDBDef14.PQSL_GRO2_RECORDCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_GRO2,IMDBDef14.PQSL_GRO2_RECORDARTICO, "RECORDARTICO");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRO2,IMDBDef14.PQSL_GRO2_RECORDARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_GRO2,IMDBDef14.PQSL_GRO2_RECORCAPIART, "RECORCAPIART");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRO2,IMDBDef14.PQSL_GRO2_RECORCAPIART,5,201,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_GRO2,IMDBDef14.PQSL_GRO2_RECORDDISPON, "RECORDDISPON");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRO2,IMDBDef14.PQSL_GRO2_RECORDDISPON,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_GRO2,IMDBDef14.PQSL_GRO2_RECOTOTAGRUP, "RECOTOTAGRUP");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRO2,IMDBDef14.PQSL_GRO2_RECOTOTAGRUP,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_GRO2,IMDBDef14.PQSL_GRO2_RECORDISPRIS, "RECORDISPRIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_GRO2,IMDBDef14.PQSL_GRO2_RECORDISPRIS,3,14,2);
    IMDB.TblAddNew(IMDBDef14.PQRY_GRO2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DisponibilitaPuroOrd(MyWebEntryPoint w, IMDBObj imdb)
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
  public DisponibilitaPuroOrd()
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
    FormIdx = MyGlb.FRM_DISPOPUROORD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4A21DE5C-D420-41CD-B31E-C6A8B1CBEF6B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 880;
    DesignHeight = 626;
    set_Caption(new IDVariant("Disponibilità Puro"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 880;
    Frames[1].Height = 600;
    Frames[1].Caption = "Disponibilità Puro";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 600;
    BKW_CONTDISPBOOK = new OBook(this);
    BUK_CONTDISPBOOK = new CIDREObj(BKW_CONTDISPBOOK);
    Frames[1].Content = BKW_CONTDISPBOOK;
    BKW_CONTDISPBOOK.Height = 570;
    BKW_CONTDISPBOOK.Width = 880;
    BKW_CONTDISPBOOK.iGuid = "FFDAFA23-E5A9-490F-83A0-59486AADEF89";
    BKW_CONTDISPBOOK.Code = "BUK_CONTDISPBOOK";
    BKW_CONTDISPBOOK.BookObj = BUK_CONTDISPBOOK;
    BKW_CONTDISPBOOK.InitDefMasks();
    BUK_CONTDISPBOOK.set_FrIndex(1);
    BUK_CONTDISPBOOK.InitBook(1, 3342593, "Controllo Disponibilita Book", IMDB, MainFrm.VisualStyleList);
    BUK_CONTDISPBOOK.InitHTML();
    BUK_CONTDISPBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTDISPBOOK.SetSize(880, 570);
    BUK_CONTDISPBOOK.Book.SetMainFrm(MainFrm);
    BUK_CONTDISPBOOK.SetRTCGuid(0, "FFDAFA23-E5A9-490F-83A0-59486AADEF89");
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
    return (obj instanceof DisponibilitaPuroOrd);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DisponibilitaPuroOrd.class.getName() : (Glb.ClassWithPackage(DisponibilitaPuroOrd.class) ? DisponibilitaPuroOrd.class.getName().substring(DisponibilitaPuroOrd.class.getPackage().getName().length() + 1) : DisponibilitaPuroOrd.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      MainFrm.ErrObj.ProcError ("DisponibilitaPuroOrd", "DetailBeforeFormattingEvent", _e);
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
      BUK_CONTDISPBOOK.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DisponibilitaPuroOrd", "Load", _e);
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
      BUK_CONTDISPBOOK.set_SpanValue(BUK_CONTDISPBOOK_SPAN_NVRDDPOCDBZN, new IDVariant(IDL.Sub(IDL.NullValue(BUK_CONTDISPBOOK.GetReportColumn(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "RECORDDISPON"),(new IDVariant(0))), IDL.NullValue(BUK_CONTDISPBOOK.GetReportColumn(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "RECOTOTAGRUP"),(new IDVariant(0))))));
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
      BUK_CONTDISPBOOK.set_SpanValue(BUK_CONTDISPBOOK_SPAN_GRUPPO, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Gruppo")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI508, IMDBDef5.FLD_PARAMETRI508_PARAMGRUPPO, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef5.TBL_PARAMETRI508, IMDBDef5.FLD_PARAMETRI508_PARADESCGRUP, 0))));
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
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, "7B80E5D9-D56C-4128-90FB-5BA98DFAB96A");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, "TEMPLATEPAGE");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA, 18400, 500, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA, "5AA0EB45-9A6F-48A6-A9BC-B3FDA71B239B");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_NUMEROPAGINA, BUK_CONTDISPBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_NUMEROPAGINA, "944CD4CB-ED7F-43CB-9364-CBBD213AEE4C");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER, 1000, 1100, 19000, 900, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER, "D4D55678-87CC-4568-A15F-583E2C02E55C");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_PAGEHEADER, BUK_CONTDISPBOOK_SPAN_C1, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Disponibilità Puro", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_C1, "3C97CAAA-B3B5-4498-961D-9B81E5FBA492");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_C1, "C1");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD, 1000, 2200, 19000, 800, 0, 3, 1, MyGlb.VIS_HEASENBORCEN, 983041, 393, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD, "2188A8A0-5B01-4071-8924-863E89C8575D");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD, "PAGESOTTHEAD");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_PAGESOTTHEAD, BUK_CONTDISPBOOK_SPAN_GRUPPO, MyGlb.VIS_HEASENBORCEN, 5, 149, 0, 271319425, "", "", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_GRUPPO, "E2344F6C-C201-4E17-9DAD-BC9591089958");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_GRUPPO, "GRUPPO");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY, 1000, 4000, 19000, 21700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_PAGEBODY, "C6EBBCA9-D9B1-44C4-879F-E509CFDAD075");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CONTDISPBOOK.InitMastroBox(BUK_CONTDISPBOOK_MST_TEMPLATEPAGE, BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER, "7CC17BCF-63BC-4E18-A1CD-F5626538730D");
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
      SQL.append("  A.CAPITOLO as RECORDCAPITO, ");
      SQL.append("  A.ARTICOLO as RECORDARTICO, ");
      SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as RECORCAPIART, ");
      SQL.append("  A.DISPONIBILITA as RECORDDISPON, ");
      SQL.append("  A.TOTALE_GRUPPO as RECOTOTAGRUP, ");
      SQL.append("  A.DISPONIBILITA_RIS as RECORDISPRIS ");
      SQL.append("from ");
      SQL.append("  WRK_GRL_DISP_PURO A ");
      SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by ");
      SQL.append("  A.CAPITOLO, ");
      SQL.append("  A.ARTICOLO ");
      BUK_CONTDISPBOOK.SetReportQuery(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "84B337D6-1A7B-492B-888F-9B92B2C1B62D");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTDISPBOOK_RPT_CONTDISPREPO_Init()
  {
    BUK_CONTDISPBOOK.InitReport(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, 196865);
    BUK_CONTDISPBOOK_RPT_CONTDISPREPO_InitQuery(true, false);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "120D7D07-9116-4C81-B94C-04B95C661046");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, "CONTDISPREPO");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_REPORTHEADER, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_REPORTHEADER, "78EDB14D-DFA5-4211-A121-52DBC8BB361A");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_PAGEHEADER, 500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_PAGEHEADER, "A33C534A-99A2-4730-995A-B477BD1136EE");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_CAARAAAAAAAH, 100, 0, 4500, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_CAARAAAAAAAH, "D2CC8A10-6304-4B44-84C1-C951834D36BD");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_CAARAAAAAAAH, "CAARAAAAAAAH");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_CAARAAAAAAAH, BUK_CONTDISPBOOK_SPAN_C2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_C2, "3E3A9FE2-3156-48FE-B0A3-D9EBB954CD0E");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_C2, "C2");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER, 4700, 0, 4500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER, "EC83714A-9846-4A57-8835-96D9F29264EA");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_DISPONHEADER, BUK_CONTDISPBOOK_SPAN_C3, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_C3, "B0BC8D80-2837-47E1-80BD-67CBB0256D1F");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_C3, "C3");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_TOTAGRUPHEAD, 9300, 0, 4500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_TOTAGRUPHEAD, "B7E58638-2A0B-4CC8-9207-15F5018E7DB6");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_TOTAGRUPHEAD, "TOTAGRUPHEAD");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_TOTAGRUPHEAD, BUK_CONTDISPBOOK_SPAN_C4, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Gruppo", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_C4, "573BF785-AF32-4B63-A8EE-DCE5BFC2E273");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_C4, "C4");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_PAGEHEADER, BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD, 13900, 0, 4500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD, "901C4E70-A6F0-48EE-A2ED-01877AD8ADC7");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD, "DISPRISUHEAD");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_DISPRISUHEAD, BUK_CONTDISPBOOK_SPAN_C, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Disponibilità Risultante", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_C, "F1C861E3-610C-42C8-B7AE-B4927CD2EC14");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_C, "C");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_DETAIL, "80CC2920-C06E-4C62-BFA1-35CBA2182056");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_DETAIL, "DETAIL");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_CAPITOARTART, 100, 0, 4500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_CAPITOARTART, "A02F4D91-BEEE-4835-9BDE-575A888203B2");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_CAPITOARTART, "CAPITOARTART");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_CAPITOARTART, BUK_CONTDISPBOOK_SPAN_RECAARDPOCDB, MyGlb.VIS_DEFAREPOSTYL, 5, 201, 0, 271384705, "", "::RECORCAPIART", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_RECAARDPOCDB, "D152BC98-8BD6-4990-9A0C-0C7DEEE109D5");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_RECAARDPOCDB, "RECAARDPOCDB");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT, 4700, 0, 4500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT, "C0959F25-CDB5-442F-9300-87A421B4FB32");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_DISPONIBILIT, BUK_CONTDISPBOOK_SPAN_REDIDIPUOCDB, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::RECORDDISPON", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_REDIDIPUOCDB, "31474FFD-338A-4362-95A0-2FB4208D79D4");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_REDIDIPUOCDB, "REDIDIPUOCDB");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_TOTALEGRUPPO, 9300, 0, 4500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_TOTALEGRUPPO, "1DD70123-59D3-4FFC-A774-C18FA8B77D39");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_TOTALEGRUPPO, "TOTALEGRUPPO");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_TOTALEGRUPPO, BUK_CONTDISPBOOK_SPAN_RETOGRDPOCDB, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::RECOTOTAGRUP", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_RETOGRDPOCDB, "01B40096-15CD-4B6D-9BEC-E1756EF587A3");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_RETOGRDPOCDB, "RETOGRDPOCDB");
    BUK_CONTDISPBOOK.InitReportBox(BUK_CONTDISPBOOK_SEC_DETAIL, BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, 13900, 0, 4500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, "57CBEB8D-4430-4B97-90E8-9CC8E23E6FEC");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, "DISPONRISULT");
    BUK_CONTDISPBOOK.InitBoxSpan(BUK_CONTDISPBOOK_RPTBOX_DISPONRISULT, BUK_CONTDISPBOOK_SPAN_NVRDDPOCDBZN, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SPAN_NVRDDPOCDBZN, "76EC2BCA-7E21-467E-95AB-4F5E27BCE71F");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SPAN_NVRDDPOCDBZN, "NVRDDPOCDBZN");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_PAGEFOOTER, BUK_CONTDISPBOOK_RPTBOX_PAGEFOOTER);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_PAGEFOOTER, "8A203ECA-68BD-43C6-BFD9-9F3C3EF9328E");
    BUK_CONTDISPBOOK.SetObjCode(BUK_CONTDISPBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CONTDISPBOOK.InitSection(BUK_CONTDISPBOOK_RPT_CONTDISPREPO, BUK_CONTDISPBOOK_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTDISPBOOK.SetSectionRendersInto(BUK_CONTDISPBOOK_SEC_REPORTFOOTER, BUK_CONTDISPBOOK_RPTBOX_PAGEBODY);
    BUK_CONTDISPBOOK.SetRTCGuid(BUK_CONTDISPBOOK_SEC_REPORTFOOTER, "42550F4E-5958-4733-B9C8-6CE57CA8520E");
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
