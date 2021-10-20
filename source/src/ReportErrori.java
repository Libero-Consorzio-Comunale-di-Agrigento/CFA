// **********************************************
// Report Errori
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ReportErrori extends MyWebForm implements Serializable
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

  //
  // Reports constants
  private static int BUK_NEWBOOK_RPT_NEWREPORT = 4;
  private static int BUK_NEWBOOK_SEC_REPORTHEADER = 5;
  private static int BUK_NEWBOOK_RPTBOX_TITOLOBOX = 6;
  private static int BUK_NEWBOOK_SPAN_ROWNAMECAPTI = 7;
  private static int BUK_NEWBOOK_SEC_PAGEHEADER = 8;
  private static int BUK_NEWBOOK_SEC_DETAIL = 9;
  private static int BUK_NEWBOOK_RPTBOX_ERRORE = 10;
  private static int BUK_NEWBOOK_SPAN_REWRERERENB1 = 11;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE35(IMDB);
    //
    //
    Init_PQRY_WRKERRORI3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE35(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_NEWTABLE35, 1);
    IMDB.set_TblCode(IMDBDef6.TBL_NEWTABLE35, "TBL_NEWTABLE35");
    IMDB.set_FldCode(IMDBDef6.TBL_NEWTABLE35,IMDBDef6.FLD_NEWTABLE35_ROWNAMECAPTI, "ROWNAMECAPTI");
    IMDB.SetFldParams(IMDBDef6.TBL_NEWTABLE35,IMDBDef6.FLD_NEWTABLE35_ROWNAMECAPTI,5,45,0);
    IMDB.TblAddNew(IMDBDef6.TBL_NEWTABLE35, 0);
  }

  private static void Init_PQRY_WRKERRORI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_WRKERRORI3, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_WRKERRORI3, "PQRY_WRKERRORI3");
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI3,IMDBDef15.PQSL_WRKERRORI3_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI3,IMDBDef15.PQSL_WRKERRORI3_SESSIONE,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI3,IMDBDef15.PQSL_WRKERRORI3_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI3,IMDBDef15.PQSL_WRKERRORI3_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI3,IMDBDef15.PQSL_WRKERRORI3_ERRORE, "ERRORE");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI3,IMDBDef15.PQSL_WRKERRORI3_ERRORE,5,300,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_WRKERRORI3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ReportErrori(MyWebEntryPoint w, IMDBObj imdb)
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
  public ReportErrori()
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
    FormIdx = MyGlb.FRM_REPORTERRORI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4501E383-CE3E-47CB-A44D-1A97FF8B1378";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 588;
    DesignHeight = 402;
    set_Caption(new IDVariant("Report Errori"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 588;
    Frames[1].Height = 376;
    Frames[1].Caption = "New Book";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 376;
    BKW_NEWBOOK = new OBook(this);
    BUK_NEWBOOK = new CIDREObj(BKW_NEWBOOK);
    Frames[1].Content = BKW_NEWBOOK;
    BKW_NEWBOOK.Height = 338;
    BKW_NEWBOOK.Width = 580;
    BKW_NEWBOOK.iGuid = "F699D0DB-1F04-408E-9654-C5D5754034A9";
    BKW_NEWBOOK.Code = "BUK_NEWBOOK";
    BKW_NEWBOOK.BookObj = BUK_NEWBOOK;
    BKW_NEWBOOK.InitDefMasks();
    BUK_NEWBOOK.set_FrIndex(1);
    BUK_NEWBOOK.InitBook(1, 1245185, "New Book", IMDB, MainFrm.VisualStyleList);
    BUK_NEWBOOK.InitHTML();
    BUK_NEWBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_NEWBOOK.SetSize(580, 338);
    BUK_NEWBOOK.Book.SetMainFrm(MainFrm);
    BUK_NEWBOOK.SetRTCGuid(0, "F699D0DB-1F04-408E-9654-C5D5754034A9");
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
    return (obj instanceof ReportErrori);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ReportErrori.class.getName() : (Glb.ClassWithPackage(ReportErrori.class) ? ReportErrori.class.getName().substring(ReportErrori.class.getPackage().getName().length() + 1) : ReportErrori.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
    // Stub
  }

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
      BUK_NEWBOOK.set_SpanValue(BUK_NEWBOOK_SPAN_ROWNAMECAPTI, new IDVariant(IMDB.Value(IMDBDef6.TBL_NEWTABLE35, IMDBDef6.FLD_NEWTABLE35_ROWNAMECAPTI, 0)));
    }
    if (SectionID==BUK_NEWBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_NEWBOOK_SEC_DETAIL)
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
    BUK_NEWBOOK.InitMastro(BUK_NEWBOOK_MST_NEWTEMPLPAGE, 3, 21000, 29700, 1, 2, 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_MST_NEWTEMPLPAGE, "93DA6496-CFD7-496F-B0DE-D3EB0A174D8A");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_MST_NEWTEMPLPAGE, "NEWTEMPLPAGE");
    BUK_NEWBOOK.InitMastroBox(BUK_NEWBOOK_MST_NEWTEMPLPAGE, BUK_NEWBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PAGEHEADER, "694DD6C7-30DF-4D9A-BE25-364CAD319DAB");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_NEWBOOK.InitMastroBox(BUK_NEWBOOK_MST_NEWTEMPLPAGE, BUK_NEWBOOK_RPTBOX_PAGEBODY, 1000, 3500, 27700, 15900, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_PAGEBODY, "CD77B4A2-7A88-401B-951B-054F2A46BA49");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_NEWBOOK_RPT_NEWREPORT_InitQuery() { BUK_NEWBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_NEWBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.SESSIONE as SESSIONE, ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.ERRORE as ERRORE ");
      SQL.append("from ");
      SQL.append("  WRK_ERRORI A ");
      SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      SQL.append("order by ");
      SQL.append("  A.PROGRESSIVO ");
      BUK_NEWBOOK.SetReportQuery(BUK_NEWBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "988AF20B-E0D2-4FD1-BED1-041522B750A7");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_NEWBOOK_RPT_NEWREPORT_Init()
  {
    BUK_NEWBOOK.InitReport(BUK_NEWBOOK_RPT_NEWREPORT, 196609);
    BUK_NEWBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPT_NEWREPORT, "42B8BCAE-406C-4B72-A62A-D4F67FFEB4BA");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_REPORTHEADER, 2000, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_REPORTHEADER, BUK_NEWBOOK_RPTBOX_PAGEHEADER);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_REPORTHEADER, "309C7DE5-E7AF-4858-99C4-B38BDA3985B7");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_REPORTHEADER, BUK_NEWBOOK_RPTBOX_TITOLOBOX, 0, 0, 27600, 2000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_TITOLOBOX, "674B7C56-5DC0-49C7-8F35-CD3D28D11BD2");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_TITOLOBOX, "TITOLOBOX");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_TITOLOBOX, BUK_NEWBOOK_SPAN_ROWNAMECAPTI, MyGlb.VIS_TITOLOREPORT, 5, 45, 0, 271384961, "", "", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_ROWNAMECAPTI, "A58CC3AF-85A3-4480-B3D4-4CED5B340408");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_ROWNAMECAPTI, "ROWNAMECAPTI");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_PAGEHEADER, 0, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_PAGEHEADER, BUK_NEWBOOK_RPTBOX_PAGEBODY);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_PAGEHEADER, "1B3FF042-BFBE-4907-9E31-42D40587FA74");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_NEWBOOK.InitSection(BUK_NEWBOOK_RPT_NEWREPORT, BUK_NEWBOOK_SEC_DETAIL, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NEWBOOK.SetSectionRendersInto(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_PAGEBODY);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SEC_DETAIL, "F94146CA-0310-4C6E-9D07-4DAD69B6D2ED");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SEC_DETAIL, "DETAIL");
    BUK_NEWBOOK.InitReportBox(BUK_NEWBOOK_SEC_DETAIL, BUK_NEWBOOK_RPTBOX_ERRORE, 0, 0, 27600, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_RPTBOX_ERRORE, "FAA545F9-C0F9-49BE-9EDE-5D7AE6417613");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_RPTBOX_ERRORE, "ERRORE");
    BUK_NEWBOOK.InitBoxSpan(BUK_NEWBOOK_RPTBOX_ERRORE, BUK_NEWBOOK_SPAN_REWRERERENB1, MyGlb.VIS_DEFAREPOSTYL, 5, 300, 0, 271384705, "", "::ERRORE", 1);
    BUK_NEWBOOK.SetRTCGuid(BUK_NEWBOOK_SPAN_REWRERERENB1, "4ED13D6C-E2B4-4982-921C-DCE1F3294D1B");
    BUK_NEWBOOK.SetObjCode(BUK_NEWBOOK_SPAN_REWRERERENB1, "REWRERERENB1");
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
