// **********************************************
// Errori Bloccanti Controllo 770
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ErroriBloccantiControllo770 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_ERRBLOCO77LI;
  OBook BKW_ERRBLOCO77LI;
  //
  // Template Pages constants
  private static int BUK_ERRBLOCO77LI_MST_ERRBLOCO77MA = 1;
  private static int BUK_ERRBLOCO77LI_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_ERRBLOCO77LI_SPAN_UPTEPATOTICE = 3;
  private static int BUK_ERRBLOCO77LI_RPTBOX_CORPOPAGINA = 4;
  private static int BUK_ERRBLOCO77LI_RPTBOX_PIEDEPAGINA = 5;
  private static int BUK_ERRBLOCO77LI_RPTBOX_NUMEROPAGINA = 6;
  private static int BUK_ERRBLOCO77LI_SPAN_CPTSEBC7LEBC = 7;

  //
  // Reports constants
  private static int BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE = 8;
  private static int BUK_ERRBLOCO77LI_SEC_INTESTREPORT = 9;
  private static int BUK_ERRBLOCO77LI_SEC_INTESTPAGINA = 10;
  private static int BUK_ERRBLOCO77LI_RPTBOX_CODICEHEADER = 11;
  private static int BUK_ERRBLOCO77LI_SPAN_CODICE1 = 12;
  private static int BUK_ERRBLOCO77LI_RPTBOX_BENEFIHEADER = 13;
  private static int BUK_ERRBLOCO77LI_SPAN_BENEFICIARI1 = 14;
  private static int BUK_ERRBLOCO77LI_RPTBOX_ERROREHEADER = 15;
  private static int BUK_ERRBLOCO77LI_SPAN_ERRORE1 = 16;
  private static int BUK_ERRBLOCO77LI_SEC_DETTAGLIO = 17;
  private static int BUK_ERRBLOCO77LI_RPTBOX_CODICE = 18;
  private static int BUK_ERRBLOCO77LI_SPAN_CODICE = 19;
  private static int BUK_ERRBLOCO77LI_RPTBOX_BENEFICIARIO = 20;
  private static int BUK_ERRBLOCO77LI_SPAN_BENEFICIARIO = 21;
  private static int BUK_ERRBLOCO77LI_RPTBOX_ERRORE = 22;
  private static int BUK_ERRBLOCO77LI_SPAN_ERRORE = 23;
  private static int BUK_ERRBLOCO77LI_SEC_PIEDEPAGINA = 24;
  private static int BUK_ERRBLOCO77LI_SEC_PIEDEREPORT = 25;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_WRKERRORI5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_WRKERRORI5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_WRKERRORI5, 5);
    IMDB.set_TblCode(IMDBDef15.PQRY_WRKERRORI5, "PQRY_WRKERRORI5");
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI5,IMDBDef15.PQSL_WRKERRORI5_RECWRKERRPRO, "RECWRKERRPRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI5,IMDBDef15.PQSL_WRKERRORI5_RECWRKERRPRO,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI5,IMDBDef15.PQSL_WRKERRORI5_RECWRKERRERR, "RECWRKERRERR");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI5,IMDBDef15.PQSL_WRKERRORI5_RECWRKERRERR,5,300,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI5,IMDBDef15.PQSL_WRKERRORI5_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI5,IMDBDef15.PQSL_WRKERRORI5_RECORDCODICE,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI5,IMDBDef15.PQSL_WRKERRORI5_RECORDBENEFI, "RECORDBENEFI");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI5,IMDBDef15.PQSL_WRKERRORI5_RECORDBENEFI,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI5,IMDBDef15.PQSL_WRKERRORI5_RECORDERRORE, "RECORDERRORE");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI5,IMDBDef15.PQSL_WRKERRORI5_RECORDERRORE,5,99,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_WRKERRORI5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ErroriBloccantiControllo770(MyWebEntryPoint w, IMDBObj imdb)
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
  public ErroriBloccantiControllo770()
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
    FormIdx = MyGlb.FRM_ERRBLOCON770;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "69792B7B-004B-4C01-AD89-8537A6544BDF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 820;
    DesignHeight = 430;
    set_Caption(new IDVariant("Errori Bloccanti Controllo 770"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 820;
    Frames[1].Height = 404;
    Frames[1].Caption = "Errori Bloccanti Controllo 770 Libro";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 404;
    BKW_ERRBLOCO77LI = new OBook(this);
    BUK_ERRBLOCO77LI = new CIDREObj(BKW_ERRBLOCO77LI);
    Frames[1].Content = BKW_ERRBLOCO77LI;
    BKW_ERRBLOCO77LI.Height = 366;
    BKW_ERRBLOCO77LI.Width = 812;
    BKW_ERRBLOCO77LI.iGuid = "98D180C2-0931-41BA-8EF3-45CC9629DF45";
    BKW_ERRBLOCO77LI.Code = "BUK_ERRBLOCO77LI";
    BKW_ERRBLOCO77LI.BookObj = BUK_ERRBLOCO77LI;
    BKW_ERRBLOCO77LI.InitDefMasks();
    BUK_ERRBLOCO77LI.set_FrIndex(1);
    BUK_ERRBLOCO77LI.InitBook(1, 1245441, "Errori Bloccanti Controllo 770 Libro", IMDB, MainFrm.VisualStyleList);
    BUK_ERRBLOCO77LI.InitHTML();
    BUK_ERRBLOCO77LI.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ERRBLOCO77LI.SetSize(812, 366);
    BUK_ERRBLOCO77LI.Book.SetMainFrm(MainFrm);
    BUK_ERRBLOCO77LI.SetRTCGuid(0, "98D180C2-0931-41BA-8EF3-45CC9629DF45");
    BUK_ERRBLOCO77LI.SetObjCode(0, "ERRBLOCO77LI");
    BUK_ERRBLOCO77LI_MST_ERRBLOCO77MA_Init();
    BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE_Init();
    BUK_ERRBLOCO77LI_InitLinks();
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
      BUK_ERRBLOCO77LI.UpdateBook();
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
    if (Code.equals("BUK_ERRBLOCO77LI")) return BUK_ERRBLOCO77LI;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ErroriBloccantiControllo770);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ErroriBloccantiControllo770.class.getName() : (Glb.ClassWithPackage(ErroriBloccantiControllo770.class) ? ErroriBloccantiControllo770.class.getName().substring(ErroriBloccantiControllo770.class.getPackage().getName().length() + 1) : ErroriBloccantiControllo770.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.WORKCCFE(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        BUK_ERRBLOCO77LI.set_PrintDestination((new IDVariant(3)).intValue());
        BUK_ERRBLOCO77LI.RefreshQuery();
        BUK_ERRBLOCO77LI.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(1)).intValue()); 
        MainFrm.set_RedirectTo((new IDVariant(BUK_ERRBLOCO77LI.GetWebFileName())));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ErroriBloccantiControllo770", "Load", _e);
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
  private void BUK_ERRBLOCO77LI_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ERRBLOCO77LI_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ERRBLOCO77LI_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_ERRBLOCO77LI_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_ERRBLOCO77LI_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_ERRBLOCO77LI_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_ERRBLOCO77LI_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_ERRBLOCO77LI_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ERRBLOCO77LI_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ERRBLOCO77LI_MST_ERRBLOCO77MA)
    {
      BUK_ERRBLOCO77LI.set_SpanValue(BUK_ERRBLOCO77LI_SPAN_UPTEPATOTICE, new IDVariant(IDL.Upper(IDL.Add((new IDVariant(BUK_ERRBLOCO77LI.BoxToolTip(BUK_ERRBLOCO77LI_RPTBOX_TESTATPAGINA))), MainFrm.ESERCIZIO))));
      BUK_ERRBLOCO77LI.set_SpanValue(BUK_ERRBLOCO77LI_SPAN_CPTSEBC7LEBC, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ERRBLOCO77LI.GetPageNumber())))), (new IDVariant("di"))), IDL.ToString((new IDVariant(BUK_ERRBLOCO77LI.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_ERRBLOCO77LI_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ERRBLOCO77LI_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ERRBLOCO77LI_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ERRBLOCO77LI_OnPreview()
  {
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void BUK_ERRBLOCO77LI_MST_ERRBLOCO77MA_Init()
  {
    BUK_ERRBLOCO77LI.InitMastro(BUK_ERRBLOCO77LI_MST_ERRBLOCO77MA, 3, 21000, 29700, 1, 1, 1);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_MST_ERRBLOCO77MA, "1BE3F123-FF67-400E-B3F3-8470E6BEB0C0");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_MST_ERRBLOCO77MA, "ERRBLOCO77MA");
    BUK_ERRBLOCO77LI.InitMastroBox(BUK_ERRBLOCO77LI_MST_ERRBLOCO77MA, BUK_ERRBLOCO77LI_RPTBOX_TESTATPAGINA, 1000, 1000, 19000, 1300, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Controllo codici fiscali errati", 1, -33);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_RPTBOX_TESTATPAGINA, "9CAAA462-0998-4844-A1CF-B2EC12673FF9");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_ERRBLOCO77LI.InitBoxSpan(BUK_ERRBLOCO77LI_RPTBOX_TESTATPAGINA, BUK_ERRBLOCO77LI_SPAN_UPTEPATOTICE, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SPAN_UPTEPATOTICE, "C7D3D4DF-5EA2-4D78-A407-5F71D557A248");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SPAN_UPTEPATOTICE, "UPTEPATOTICE");
    BUK_ERRBLOCO77LI.InitMastroBox(BUK_ERRBLOCO77LI_MST_ERRBLOCO77MA, BUK_ERRBLOCO77LI_RPTBOX_CORPOPAGINA, 1000, 3600, 19000, 22100, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_RPTBOX_CORPOPAGINA, "BABECDE3-1808-4A93-BE0C-B87F77D75411");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_ERRBLOCO77LI.InitMastroBox(BUK_ERRBLOCO77LI_MST_ERRBLOCO77MA, BUK_ERRBLOCO77LI_RPTBOX_PIEDEPAGINA, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_RPTBOX_PIEDEPAGINA, "60A3029B-83A3-49F6-859E-9AA0786A0E23");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_ERRBLOCO77LI.InitMastroBox(BUK_ERRBLOCO77LI_MST_ERRBLOCO77MA, BUK_ERRBLOCO77LI_RPTBOX_NUMEROPAGINA, 17300, 200, 2700, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_RPTBOX_NUMEROPAGINA, "20993E76-E212-467A-896F-33D8BB3C5FC5");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ERRBLOCO77LI.InitBoxSpan(BUK_ERRBLOCO77LI_RPTBOX_NUMEROPAGINA, BUK_ERRBLOCO77LI_SPAN_CPTSEBC7LEBC, MyGlb.VIS_NORMAA8RIGHT, 5, 205, 0, 271384705, "", "", 1);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SPAN_CPTSEBC7LEBC, "C2ED9A44-1D64-4379-848F-FEE9966170CA");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SPAN_CPTSEBC7LEBC, "CPTSEBC7LEBC");
  }

  private void BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE_InitQuery() { BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE_InitQuery(true, true); }
  private void BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as RECWRKERRPRO, ");
      SQL.append("  A.ERRORE as RECWRKERRERR, ");
      SQL.append("  SUBSTR(A.ERRORE, 1, 6) as RECORDCODICE, ");
      SQL.append("  SUBSTR(A.ERRORE, 8, 87) as RECORDBENEFI, ");
      SQL.append("  LTRIM(SUBSTR(A.ERRORE, 95, LENGTH(A.ERRORE))) as RECORDERRORE ");
      SQL.append("from ");
      SQL.append("  WRK_ERRORI A ");
      SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      SQL.append("order by ");
      SQL.append("  A.PROGRESSIVO ");
      BUK_ERRBLOCO77LI.SetReportQuery(BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "506C3563-CB40-40E2-97DC-D086E0ECD6DB");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE_Init()
  {
    BUK_ERRBLOCO77LI.InitReport(BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE, 196865);
    BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE_InitQuery(true, false);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE, "84231270-6A56-442B-BFCE-599204A45753");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE, "ERRBLOCO77RE");
    BUK_ERRBLOCO77LI.InitSection(BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE, BUK_ERRBLOCO77LI_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ERRBLOCO77LI.SetSectionRendersInto(BUK_ERRBLOCO77LI_SEC_INTESTREPORT, BUK_ERRBLOCO77LI_RPTBOX_CORPOPAGINA);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SEC_INTESTREPORT, "6A82073F-883E-4622-BDE6-322F9C938383");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_ERRBLOCO77LI.InitSection(BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE, BUK_ERRBLOCO77LI_SEC_INTESTPAGINA, 700, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ERRBLOCO77LI.SetSectionRendersInto(BUK_ERRBLOCO77LI_SEC_INTESTPAGINA, BUK_ERRBLOCO77LI_RPTBOX_CORPOPAGINA);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SEC_INTESTPAGINA, "3B1A1207-C932-4DBB-A4DA-3DF07787C113");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_ERRBLOCO77LI.InitReportBox(BUK_ERRBLOCO77LI_SEC_INTESTPAGINA, BUK_ERRBLOCO77LI_RPTBOX_CODICEHEADER, 0, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_RPTBOX_CODICEHEADER, "53539045-0A24-4858-8CB5-17F2C4A13CDF");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_ERRBLOCO77LI.InitBoxSpan(BUK_ERRBLOCO77LI_RPTBOX_CODICEHEADER, BUK_ERRBLOCO77LI_SPAN_CODICE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SPAN_CODICE1, "8FA82F99-9559-47A0-93DA-309D39FC3862");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SPAN_CODICE1, "CODICE1");
    BUK_ERRBLOCO77LI.InitReportBox(BUK_ERRBLOCO77LI_SEC_INTESTPAGINA, BUK_ERRBLOCO77LI_RPTBOX_BENEFIHEADER, 1700, 0, 7000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_RPTBOX_BENEFIHEADER, "CBCC1E3C-8BA1-4360-941D-7CEA725C7F33");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_RPTBOX_BENEFIHEADER, "BENEFIHEADER");
    BUK_ERRBLOCO77LI.InitBoxSpan(BUK_ERRBLOCO77LI_RPTBOX_BENEFIHEADER, BUK_ERRBLOCO77LI_SPAN_BENEFICIARI1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Beneficiario", 1);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SPAN_BENEFICIARI1, "13FD7097-BA33-4F0F-8B53-C51702FF6C02");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SPAN_BENEFICIARI1, "BENEFICIARI1");
    BUK_ERRBLOCO77LI.InitReportBox(BUK_ERRBLOCO77LI_SEC_INTESTPAGINA, BUK_ERRBLOCO77LI_RPTBOX_ERROREHEADER, 8800, 0, 10000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_RPTBOX_ERROREHEADER, "69C6C8C2-CCF8-4C10-910F-4205CD0E09F9");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_RPTBOX_ERROREHEADER, "ERROREHEADER");
    BUK_ERRBLOCO77LI.InitBoxSpan(BUK_ERRBLOCO77LI_RPTBOX_ERROREHEADER, BUK_ERRBLOCO77LI_SPAN_ERRORE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Errore", 1);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SPAN_ERRORE1, "69DC5C62-1C3F-40EB-958A-2FE010147204");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SPAN_ERRORE1, "ERRORE1");
    BUK_ERRBLOCO77LI.InitSection(BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE, BUK_ERRBLOCO77LI_SEC_DETTAGLIO, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ERRBLOCO77LI.SetSectionRendersInto(BUK_ERRBLOCO77LI_SEC_DETTAGLIO, BUK_ERRBLOCO77LI_RPTBOX_CORPOPAGINA);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SEC_DETTAGLIO, "7A8A5B38-7CE6-4CB0-809A-FEC8703E9D2F");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_ERRBLOCO77LI.InitReportBox(BUK_ERRBLOCO77LI_SEC_DETTAGLIO, BUK_ERRBLOCO77LI_RPTBOX_CODICE, 0, 100, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_RPTBOX_CODICE, "2D28A2EE-8E2E-40B8-8DFC-78E661134C7C");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_RPTBOX_CODICE, "CODICE");
    BUK_ERRBLOCO77LI.InitBoxSpan(BUK_ERRBLOCO77LI_RPTBOX_CODICE, BUK_ERRBLOCO77LI_SPAN_CODICE, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORDCODICE", 1);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SPAN_CODICE, "35C69A3D-7C0B-48E0-9DB2-2047AFFA0CF3");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SPAN_CODICE, "CODICE");
    BUK_ERRBLOCO77LI.InitReportBox(BUK_ERRBLOCO77LI_SEC_DETTAGLIO, BUK_ERRBLOCO77LI_RPTBOX_BENEFICIARIO, 1700, 100, 7000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_RPTBOX_BENEFICIARIO, "BF903812-B211-4247-B8CA-17264A14FEBA");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_RPTBOX_BENEFICIARIO, "BENEFICIARIO");
    BUK_ERRBLOCO77LI.InitBoxSpan(BUK_ERRBLOCO77LI_RPTBOX_BENEFICIARIO, BUK_ERRBLOCO77LI_SPAN_BENEFICIARIO, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORDBENEFI", 1);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SPAN_BENEFICIARIO, "60E48419-ABAC-490A-A020-48E505754147");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SPAN_BENEFICIARIO, "BENEFICIARIO");
    BUK_ERRBLOCO77LI.InitReportBox(BUK_ERRBLOCO77LI_SEC_DETTAGLIO, BUK_ERRBLOCO77LI_RPTBOX_ERRORE, 8800, 100, 10000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_RPTBOX_ERRORE, "F7C8D9A0-D6C7-43DA-8076-E2D5E5A0C8D7");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_RPTBOX_ERRORE, "ERRORE");
    BUK_ERRBLOCO77LI.InitBoxSpan(BUK_ERRBLOCO77LI_RPTBOX_ERRORE, BUK_ERRBLOCO77LI_SPAN_ERRORE, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORDERRORE", 1);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SPAN_ERRORE, "8652656E-7FFB-41FD-8C52-38B5035E5322");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SPAN_ERRORE, "ERRORE");
    BUK_ERRBLOCO77LI.InitSection(BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE, BUK_ERRBLOCO77LI_SEC_PIEDEPAGINA, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ERRBLOCO77LI.SetSectionRendersInto(BUK_ERRBLOCO77LI_SEC_PIEDEPAGINA, BUK_ERRBLOCO77LI_RPTBOX_CORPOPAGINA);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SEC_PIEDEPAGINA, "FDBECCF2-4EF2-4EE1-AB07-1AACAE84126C");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_ERRBLOCO77LI.InitSection(BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE, BUK_ERRBLOCO77LI_SEC_PIEDEREPORT, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ERRBLOCO77LI.SetSectionRendersInto(BUK_ERRBLOCO77LI_SEC_PIEDEREPORT, BUK_ERRBLOCO77LI_RPTBOX_CORPOPAGINA);
    BUK_ERRBLOCO77LI.SetRTCGuid(BUK_ERRBLOCO77LI_SEC_PIEDEREPORT, "B0B4191E-2817-458E-BCA4-36CB277C6AFC");
    BUK_ERRBLOCO77LI.SetObjCode(BUK_ERRBLOCO77LI_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_ERRBLOCO77LI_RPT_ERRBLOCO77RE_InitQuery(false, true);
  }

  private void BUK_ERRBLOCO77LI_InitLinks()
  {
    BUK_ERRBLOCO77LI.SetBoxNextBox(BUK_ERRBLOCO77LI_RPTBOX_CORPOPAGINA, BUK_ERRBLOCO77LI_RPTBOX_CORPOPAGINA);
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
    if (SrcObj == BKW_ERRBLOCO77LI) BUK_ERRBLOCO77LI_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ERRBLOCO77LI) BUK_ERRBLOCO77LI_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ERRBLOCO77LI) BUK_ERRBLOCO77LI_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ERRBLOCO77LI) BUK_ERRBLOCO77LI_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ERRBLOCO77LI) BUK_ERRBLOCO77LI_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ERRBLOCO77LI) BUK_ERRBLOCO77LI_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ERRBLOCO77LI) BUK_ERRBLOCO77LI_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ERRBLOCO77LI) BUK_ERRBLOCO77LI_OnPreview();
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
