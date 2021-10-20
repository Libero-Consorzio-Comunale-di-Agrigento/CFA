// **********************************************
// Controllo Quadratura Pluriennali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloQuadraturaPluriennali extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_NUOVOLIBRO;
  OBook BKW_NUOVOLIBRO;
  //
  // Template Pages constants
  private static int BUK_NUOVOLIBRO_MST_TEMPLATE = 1;
  private static int BUK_NUOVOLIBRO_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA = 3;
  private static int BUK_NUOVOLIBRO_RPTBOX_PIEDEPAGINA = 4;

  //
  // Reports constants
  private static int BUK_NUOVOLIBRO_RPT_REPORT = 5;
  private static int BUK_NUOVOLIBRO_SEC_INTESTREPORT = 6;
  private static int BUK_NUOVOLIBRO_SEC_INTESTPAGINA = 7;
  private static int BUK_NUOVOLIBRO_RPTBOX_ELEVARPLNOQU = 8;
  private static int BUK_NUOVOLIBRO_SPAN_NUOVASPAN1 = 9;
  private static int BUK_NUOVOLIBRO_SPAN_INODPPPNOUPT = 10;
  private static int BUK_NUOVOLIBRO_SPAN_NUOVASPAN2 = 11;
  private static int BUK_NUOVOLIBRO_RPTBOX_ESERCIZIO1 = 12;
  private static int BUK_NUOVOLIBRO_SPAN_NUOVASPAN = 13;
  private static int BUK_NUOVOLIBRO_RPTBOX_VARIPOSIENTR = 14;
  private static int BUK_NUOVOLIBRO_SPAN_IRTMVTQCQPN1 = 15;
  private static int BUK_NUOVOLIBRO_RPTBOX_VARIPOSIENT1 = 16;
  private static int BUK_NUOVOLIBRO_SPAN_IRTMVTQCQPNL = 17;
  private static int BUK_NUOVOLIBRO_SEC_DETTAGLIO = 18;
  private static int BUK_NUOVOLIBRO_RPTBOX_ESERCIZIO = 19;
  private static int BUK_NUOVOLIBRO_SPAN_REVAESCOQPNL = 20;
  private static int BUK_NUOVOLIBRO_RPTBOX_IMPORTOPOS = 21;
  private static int BUK_NUOVOLIBRO_SPAN_REPOENCOQPNL = 22;
  private static int BUK_NUOVOLIBRO_RPTBOX_IMPORTONEG = 23;
  private static int BUK_NUOVOLIBRO_SPAN_RENESPCOQPNL = 24;
  private static int BUK_NUOVOLIBRO_SEC_PIEDEPAGINA = 25;
  private static int BUK_NUOVOLIBRO_SEC_PIEDEREPORT = 26;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN(IMDB);
    //
    //
    Init_PQRY_VARCOM1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_IN, 9);
    IMDB.set_TblCode(IMDBDef4.TBL_IN, "TBL_IN");
    IMDB.set_FldCode(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGUNIPRO, "NOMOGGUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGNUMPRO, "NOMOGGNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGDEFPRO, "NOMOGGDEFPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGDEFPRO,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGTIPIMP, "NOMOGGTIPIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_IN,IMDBDef4.FLD_IN_NOMOGGTIPIMP,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_IN, 0);
  }

  private static void Init_PQRY_VARCOM1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOM1, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOM1, "PQRY_VARCOM1");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM1,IMDBDef12.PQSL_VARCOM1_RECOVARCESER, "RECOVARCESER");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM1,IMDBDef12.PQSL_VARCOM1_RECOVARCESER,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM1,IMDBDef12.PQSL_VARCOM1_RETIMOVBTIQU, "RETIMOVBTIQU");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM1,IMDBDef12.PQSL_VARCOM1_RETIMOVBTIQU,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM1,IMDBDef12.PQSL_VARCOM1_POSITIENTRAT, "POSITIENTRAT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM1,IMDBDef12.PQSL_VARCOM1_POSITIENTRAT,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM1,IMDBDef12.PQSL_VARCOM1_NEGATIVSPESA, "NEGATIVSPESA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM1,IMDBDef12.PQSL_VARCOM1_NEGATIVSPESA,3,28,6);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOM1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloQuadraturaPluriennali(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloQuadraturaPluriennali()
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
    FormIdx = MyGlb.FRM_CONTQUADPLU1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9118FF97-14C5-4667-8228-99D6D8240499";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 816;
    DesignHeight = 618;
    set_Caption(new IDVariant("Controllo Quadratura Pluriennali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 816;
    Frames[1].Height = 592;
    Frames[1].Caption = "Nuovo Libro";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 592;
    BKW_NUOVOLIBRO = new OBook(this);
    BUK_NUOVOLIBRO = new CIDREObj(BKW_NUOVOLIBRO);
    Frames[1].Content = BKW_NUOVOLIBRO;
    BKW_NUOVOLIBRO.Height = 554;
    BKW_NUOVOLIBRO.Width = 808;
    BKW_NUOVOLIBRO.iGuid = "79B6058F-1988-4E2D-9DBF-180F57F352D8";
    BKW_NUOVOLIBRO.Code = "BUK_NUOVOLIBRO";
    BKW_NUOVOLIBRO.BookObj = BUK_NUOVOLIBRO;
    BKW_NUOVOLIBRO.InitDefMasks();
    BUK_NUOVOLIBRO.set_FrIndex(1);
    BUK_NUOVOLIBRO.InitBook(1, 196609, "Nuovo Libro", IMDB, MainFrm.VisualStyleList);
    BUK_NUOVOLIBRO.InitHTML();
    BUK_NUOVOLIBRO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_NUOVOLIBRO.SetSize(808, 554);
    BUK_NUOVOLIBRO.Book.SetMainFrm(MainFrm);
    BUK_NUOVOLIBRO.SetRTCGuid(0, "79B6058F-1988-4E2D-9DBF-180F57F352D8");
    BUK_NUOVOLIBRO.SetObjCode(0, "NUOVOLIBRO");
    BUK_NUOVOLIBRO_MST_TEMPLATE_Init();
    BUK_NUOVOLIBRO_RPT_REPORT_Init();
    BUK_NUOVOLIBRO_InitLinks();
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
      BUK_NUOVOLIBRO.UpdateBook();
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
    if (Code.equals("BUK_NUOVOLIBRO")) return BUK_NUOVOLIBRO;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ControlloQuadraturaPluriennali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloQuadraturaPluriennali.class.getName() : (Glb.ClassWithPackage(ControlloQuadraturaPluriennali.class) ? ControlloQuadraturaPluriennali.class.getName().substring(ControlloQuadraturaPluriennali.class.getPackage().getName().length() + 1) : ControlloQuadraturaPluriennali.class.getName()));
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
  private void BUK_NUOVOLIBRO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_NUOVOLIBRO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_NUOVOLIBRO_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_NUOVOLIBRO_SEC_INTESTPAGINA)
    {
      BUK_NUOVOLIBRO.set_SpanValue(BUK_NUOVOLIBRO_SPAN_INODPPPNOUPT, new IDVariant(((IMDB.Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGDEFPRO, 0).equals((new IDVariant("P")), true))?IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Proposta ")), IMDB.Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGUNIPRO, 0)), (new IDVariant("-"))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGNUMPRO, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGANNPRO, 0))):IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Delibera ")), IMDB.Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGSEDDEL, 0)), (new IDVariant("-"))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGNUMDEL, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_IN, IMDBDef4.FLD_IN_NOMOGGANNDEL, 0))))));
      BUK_NUOVOLIBRO.set_SpanValue(BUK_NUOVOLIBRO_SPAN_IRTMVTQCQPN1, new IDVariant(((BUK_NUOVOLIBRO.GetReportColumn(BUK_NUOVOLIBRO_RPT_REPORT, "RETIMOVBTIQU").equals((new IDVariant("ES")), true))?(new IDVariant("Variazioni Entrata")):(new IDVariant("Variazioni Positive")))));
      BUK_NUOVOLIBRO.set_SpanValue(BUK_NUOVOLIBRO_SPAN_IRTMVTQCQPNL, new IDVariant(((BUK_NUOVOLIBRO.GetReportColumn(BUK_NUOVOLIBRO_RPT_REPORT, "RETIMOVBTIQU").equals((new IDVariant("ES")), true))?(new IDVariant("Variazioni Spesa")):(new IDVariant("Variazioni Negative")))));
    }
    if (SectionID==BUK_NUOVOLIBRO_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_NUOVOLIBRO_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_NUOVOLIBRO_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_NUOVOLIBRO_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_NUOVOLIBRO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_NUOVOLIBRO_MST_TEMPLATE)
    {
    }
  }

  private void BUK_NUOVOLIBRO_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_NUOVOLIBRO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_NUOVOLIBRO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_NUOVOLIBRO_OnPreview()
  {
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void BUK_NUOVOLIBRO_MST_TEMPLATE_Init()
  {
    BUK_NUOVOLIBRO.InitMastro(BUK_NUOVOLIBRO_MST_TEMPLATE, 3, 21000, 29700, 1, 1, 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_MST_TEMPLATE, "135078CD-6855-4CC3-8DE9-A418CE248590");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_MST_TEMPLATE, "TEMPLATE");
    BUK_NUOVOLIBRO.InitMastroBox(BUK_NUOVOLIBRO_MST_TEMPLATE, BUK_NUOVOLIBRO_RPTBOX_TESTATPAGINA, 1000, 600, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_TESTATPAGINA, "F5430BF9-90BE-4D4F-8651-0A3F8457C13B");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_NUOVOLIBRO.InitMastroBox(BUK_NUOVOLIBRO_MST_TEMPLATE, BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA, 1000, 2600, 19000, 23100, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA, "F53D2B63-39FB-42CC-840F-A2F38209241B");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_NUOVOLIBRO.InitMastroBox(BUK_NUOVOLIBRO_MST_TEMPLATE, BUK_NUOVOLIBRO_RPTBOX_PIEDEPAGINA, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_PIEDEPAGINA, "B83E1B7B-016D-4684-9FA6-B0EE7A5751E6");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
  }

  private void BUK_NUOVOLIBRO_RPT_REPORT_InitQuery() { BUK_NUOVOLIBRO_RPT_REPORT_InitQuery(true, true); }
  private void BUK_NUOVOLIBRO_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ESERCIZIO as RECOVARCESER, ");
      SQL.append("  C.TIPO_QUADRATURA as RETIMOVBTIQU, ");
      SQL.append("  NVL(SUM(DECODE(C.TIPO_QUADRATURA, 'PM', DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN A.IMPORTO > 0 THEN A.IMPORTO ELSE 0 END, CASE WHEN A.IMPORTO_CASSA > 0 THEN A.IMPORTO_CASSA ELSE 0 END), DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN A.E_S = 'E' THEN A.IMPORTO ELSE 0 END, CASE WHEN A.E_S = 'E' THEN A.IMPORTO_CASSA ELSE 0 END))), 0) as POSITIENTRAT, ");
      SQL.append("  NVL(SUM(DECODE(C.TIPO_QUADRATURA, 'PM', DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN A.IMPORTO < 0 THEN A.IMPORTO ELSE 0 END, CASE WHEN A.IMPORTO_CASSA < 0 THEN A.IMPORTO_CASSA ELSE 0 END), DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN A.E_S = 'S' THEN A.IMPORTO ELSE 0 END, CASE WHEN A.E_S = 'S' THEN A.IMPORTO_CASSA ELSE 0 END))), 0) as NEGATIVSPESA ");
      SQL.append("from ");
      SQL.append("  VARCOM A, ");
      SQL.append("  T54 B, ");
      SQL.append("  TIPI_MOTIVAZIONE_VBIL C ");
      SQL.append("where (A.SEDE_DEL = ~~TBL_IN.NOMOGGSEDDEL~~) ");
      SQL.append("and   (A.NUMERO_DEL = ~~TBL_IN.NOMOGGNUMDEL~~) ");
      SQL.append("and   (A.ANNO_DEL = ~~TBL_IN.NOMOGGANNDEL~~) ");
      SQL.append("and   (A.TIPO_VAR = ~~TBL_IN.NOMOGGTIPVAR~~) ");
      SQL.append("and   (B.CODICE = A.TIPO_VAR) ");
      SQL.append("and   (C.CODICE = B.TIPOLOGIA) ");
      SQL.append("and   (NOT ((C.TIPO_QUADRATURA IS NULL))) ");
      SQL.append("and   (~~TBL_IN.NOMOGGDEFPRO~~ = 'D') ");
      SQL.append("group by ");
      SQL.append("  A.ESERCIZIO, ");
      SQL.append("  C.TIPO_QUADRATURA ");
      SQL.append("having (NVL(SUM(DECODE(C.TIPO_QUADRATURA, 'PM', DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN A.IMPORTO > 0 THEN A.IMPORTO ELSE 0 END, CASE WHEN A.IMPORTO_CASSA > 0 THEN A.IMPORTO_CASSA ELSE 0 END), DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN A.E_S = 'E' THEN A.IMPORTO ELSE 0 END, CASE WHEN A.E_S = 'E' THEN A.IMPORTO_CASSA ELSE 0 END))), 0) <> NVL(SUM(DECODE(C.TIPO_QUADRATURA, 'PM', DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN A.IMPORTO < 0 THEN A.IMPORTO ELSE 0 END, CASE WHEN A.IMPORTO_CASSA < 0 THEN A.IMPORTO_CASSA ELSE 0 END), DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN A.E_S = 'S' THEN A.IMPORTO ELSE 0 END, CASE WHEN A.E_S = 'S' THEN A.IMPORTO_CASSA ELSE 0 END))), 0)) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  D.ESERCIZIO, ");
      SQL.append("  F.TIPO_QUADRATURA, ");
      SQL.append("  NVL(SUM(DECODE(F.TIPO_QUADRATURA, 'PM', DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN D.IMPORTO > 0 THEN D.IMPORTO ELSE 0 END, CASE WHEN D.IMPORTO_CASSA > 0 THEN D.IMPORTO_CASSA ELSE 0 END), DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN D.E_S = 'E' THEN D.IMPORTO ELSE 0 END, CASE WHEN D.E_S = 'E' THEN D.IMPORTO_CASSA ELSE 0 END))), 0), ");
      SQL.append("  NVL(SUM(DECODE(F.TIPO_QUADRATURA, 'PM', DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN D.IMPORTO < 0 THEN D.IMPORTO ELSE 0 END, CASE WHEN D.IMPORTO_CASSA < 0 THEN D.IMPORTO_CASSA ELSE 0 END), DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN D.E_S = 'S' THEN D.IMPORTO ELSE 0 END, CASE WHEN D.E_S = 'S' THEN D.IMPORTO_CASSA ELSE 0 END))), 0) ");
      SQL.append("from ");
      SQL.append("  VARCOMPRO D, ");
      SQL.append("  T54 E, ");
      SQL.append("  TIPI_MOTIVAZIONE_VBIL F ");
      SQL.append("where (D.UNITA_PROPONENTE = ~~TBL_IN.NOMOGGUNIPRO~~) ");
      SQL.append("and   (D.NUMERO_PROPOSTA = ~~TBL_IN.NOMOGGNUMPRO~~) ");
      SQL.append("and   (D.ANNO_PROPOSTA = ~~TBL_IN.NOMOGGANNPRO~~) ");
      SQL.append("and   (D.TIPO_VAR = ~~TBL_IN.NOMOGGTIPVAR~~) ");
      SQL.append("and   (E.CODICE = D.TIPO_VAR) ");
      SQL.append("and   (F.CODICE = E.TIPOLOGIA) ");
      SQL.append("and   (NOT ((F.TIPO_QUADRATURA IS NULL))) ");
      SQL.append("and   (~~TBL_IN.NOMOGGDEFPRO~~ = 'P') ");
      SQL.append("group by ");
      SQL.append("  D.ESERCIZIO ");
      SQL.append("having (NVL(SUM(DECODE(F.TIPO_QUADRATURA, 'PM', DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN D.IMPORTO > 0 THEN D.IMPORTO ELSE 0 END, CASE WHEN D.IMPORTO_CASSA > 0 THEN D.IMPORTO_CASSA ELSE 0 END), DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN D.E_S = 'E' THEN D.IMPORTO ELSE 0 END, CASE WHEN D.E_S = 'E' THEN D.IMPORTO_CASSA ELSE 0 END))), 0) <> NVL(SUM(DECODE(F.TIPO_QUADRATURA, 'PM', DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN D.IMPORTO < 0 THEN D.IMPORTO ELSE 0 END, CASE WHEN D.IMPORTO_CASSA < 0 THEN D.IMPORTO_CASSA ELSE 0 END), DECODE(~~TBL_IN.NOMOGGTIPIMP~~, 'CO', CASE WHEN D.E_S = 'S' THEN D.IMPORTO ELSE 0 END, CASE WHEN D.E_S = 'S' THEN D.IMPORTO_CASSA ELSE 0 END))), 0)) ");
      SQL.append("order by 1 ");
      BUK_NUOVOLIBRO.SetReportQuery(BUK_NUOVOLIBRO_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "5509C67E-9144-4ACF-9796-E24A2F8CF908");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_NUOVOLIBRO_RPT_REPORT_Init()
  {
    BUK_NUOVOLIBRO.InitReport(BUK_NUOVOLIBRO_RPT_REPORT, 196865);
    BUK_NUOVOLIBRO_RPT_REPORT_InitQuery(true, false);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPT_REPORT, "AE4AC6B7-69DB-44E3-8A78-926C355486ED");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPT_REPORT, "REPORT");
    BUK_NUOVOLIBRO.InitSection(BUK_NUOVOLIBRO_RPT_REPORT, BUK_NUOVOLIBRO_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_NUOVOLIBRO.SetSectionRendersInto(BUK_NUOVOLIBRO_SEC_INTESTREPORT, BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SEC_INTESTREPORT, "A13F26DD-1D7D-4019-A2BA-E7F0760E1CD4");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_NUOVOLIBRO.InitSection(BUK_NUOVOLIBRO_RPT_REPORT, BUK_NUOVOLIBRO_SEC_INTESTPAGINA, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NUOVOLIBRO.SetSectionRendersInto(BUK_NUOVOLIBRO_SEC_INTESTPAGINA, BUK_NUOVOLIBRO_RPTBOX_TESTATPAGINA);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SEC_INTESTPAGINA, "5DEC4A6E-F618-48A1-A8AC-D56321D3C39E");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_NUOVOLIBRO.InitReportBox(BUK_NUOVOLIBRO_SEC_INTESTPAGINA, BUK_NUOVOLIBRO_RPTBOX_ELEVARPLNOQU, 0, 0, 19000, 600, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_ELEVARPLNOQU, "D06EBC55-850E-4ED4-A6CC-F0938234958D");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_ELEVARPLNOQU, "ELEVARPLNOQU");
    BUK_NUOVOLIBRO.InitBoxSpan(BUK_NUOVOLIBRO_RPTBOX_ELEVARPLNOQU, BUK_NUOVOLIBRO_SPAN_NUOVASPAN1, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271384705, "", "Elenco Variazioni Pluriennali non quadrate ", 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SPAN_NUOVASPAN1, "7F7661F3-0127-4E78-89E3-777A99AE132C");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SPAN_NUOVASPAN1, "NUOVASPAN1");
    BUK_NUOVOLIBRO.InitBoxSpan(BUK_NUOVOLIBRO_RPTBOX_ELEVARPLNOQU, BUK_NUOVOLIBRO_SPAN_INODPPPNOUPT, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SPAN_INODPPPNOUPT, "8656D13E-6E78-41CC-A1D2-6ACA8A911A36");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SPAN_INODPPPNOUPT, "INODPPPNOUPT");
    BUK_NUOVOLIBRO.InitBoxSpan(BUK_NUOVOLIBRO_RPTBOX_ELEVARPLNOQU, BUK_NUOVOLIBRO_SPAN_NUOVASPAN2, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271384705, "", "", 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SPAN_NUOVASPAN2, "DFEF70C7-0112-41CF-A2A7-137199E4559C");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SPAN_NUOVASPAN2, "NUOVASPAN2");
    BUK_NUOVOLIBRO.InitReportBox(BUK_NUOVOLIBRO_SEC_INTESTPAGINA, BUK_NUOVOLIBRO_RPTBOX_ESERCIZIO1, 0, 1500, 1500, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_ESERCIZIO1, "2A8D5CFF-F95D-415A-A357-B9E59510B685");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_ESERCIZIO1, "ESERCIZIO1");
    BUK_NUOVOLIBRO.set_BoxAlignment(BUK_NUOVOLIBRO_RPTBOX_ESERCIZIO1, 2);
    BUK_NUOVOLIBRO.InitBoxSpan(BUK_NUOVOLIBRO_RPTBOX_ESERCIZIO1, BUK_NUOVOLIBRO_SPAN_NUOVASPAN, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Esercizio", 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SPAN_NUOVASPAN, "8542C55E-F21B-4C4D-8434-88CC0DD0B25C");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_NUOVOLIBRO.InitReportBox(BUK_NUOVOLIBRO_SEC_INTESTPAGINA, BUK_NUOVOLIBRO_RPTBOX_VARIPOSIENTR, 1700, 1500, 2900, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_VARIPOSIENTR, "46E26535-D1E7-4078-90BB-0DDBC08999AD");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_VARIPOSIENTR, "VARIPOSIENTR");
    BUK_NUOVOLIBRO.set_BoxAlignment(BUK_NUOVOLIBRO_RPTBOX_VARIPOSIENTR, 4);
    BUK_NUOVOLIBRO.InitBoxSpan(BUK_NUOVOLIBRO_RPTBOX_VARIPOSIENTR, BUK_NUOVOLIBRO_SPAN_IRTMVTQCQPN1, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271384705, "", "", 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SPAN_IRTMVTQCQPN1, "244A5716-D1FD-49C5-A5A2-1580C677FD46");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SPAN_IRTMVTQCQPN1, "IRTMVTQCQPN1");
    BUK_NUOVOLIBRO.InitReportBox(BUK_NUOVOLIBRO_SEC_INTESTPAGINA, BUK_NUOVOLIBRO_RPTBOX_VARIPOSIENT1, 5300, 1500, 2900, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_VARIPOSIENT1, "D42DEC66-A063-4B07-BE0B-70590BBD8C5F");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_VARIPOSIENT1, "VARIPOSIENT1");
    BUK_NUOVOLIBRO.set_BoxAlignment(BUK_NUOVOLIBRO_RPTBOX_VARIPOSIENT1, 4);
    BUK_NUOVOLIBRO.InitBoxSpan(BUK_NUOVOLIBRO_RPTBOX_VARIPOSIENT1, BUK_NUOVOLIBRO_SPAN_IRTMVTQCQPNL, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271384705, "", "", 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SPAN_IRTMVTQCQPNL, "4DA2F382-FD6F-472A-8135-4D2754C49605");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SPAN_IRTMVTQCQPNL, "IRTMVTQCQPNL");
    BUK_NUOVOLIBRO.InitSection(BUK_NUOVOLIBRO_RPT_REPORT, BUK_NUOVOLIBRO_SEC_DETTAGLIO, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NUOVOLIBRO.SetSectionRendersInto(BUK_NUOVOLIBRO_SEC_DETTAGLIO, BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SEC_DETTAGLIO, "CFBF174C-0DA6-4ABA-86E4-6445A5A43327");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_NUOVOLIBRO.InitReportBox(BUK_NUOVOLIBRO_SEC_DETTAGLIO, BUK_NUOVOLIBRO_RPTBOX_ESERCIZIO, 100, 0, 1100, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_ESERCIZIO, "C7709ACA-05E9-4CAA-88EE-FBEF03D1FABF");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_ESERCIZIO, "ESERCIZIO");
    BUK_NUOVOLIBRO.set_BoxAlignment(BUK_NUOVOLIBRO_RPTBOX_ESERCIZIO, 2);
    BUK_NUOVOLIBRO.InitBoxSpan(BUK_NUOVOLIBRO_RPTBOX_ESERCIZIO, BUK_NUOVOLIBRO_SPAN_REVAESCOQPNL, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "", "::RECOVARCESER", 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SPAN_REVAESCOQPNL, "F911EBFC-ED88-473A-B00A-B8F2939C5C9F");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SPAN_REVAESCOQPNL, "REVAESCOQPNL");
    BUK_NUOVOLIBRO.InitReportBox(BUK_NUOVOLIBRO_SEC_DETTAGLIO, BUK_NUOVOLIBRO_RPTBOX_IMPORTOPOS, 1700, 0, 2900, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_IMPORTOPOS, "3C95D9F0-8826-4081-968A-838BFA9D0BB8");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_IMPORTOPOS, "IMPORTOPOS");
    BUK_NUOVOLIBRO.InitBoxSpan(BUK_NUOVOLIBRO_RPTBOX_IMPORTOPOS, BUK_NUOVOLIBRO_SPAN_REPOENCOQPNL, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::POSITIENTRAT", 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SPAN_REPOENCOQPNL, "ADD03228-C94C-474D-B79E-81645E2BB6AB");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SPAN_REPOENCOQPNL, "REPOENCOQPNL");
    BUK_NUOVOLIBRO.InitReportBox(BUK_NUOVOLIBRO_SEC_DETTAGLIO, BUK_NUOVOLIBRO_RPTBOX_IMPORTONEG, 5300, 0, 2900, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_IMPORTONEG, "ECA20DD4-A3B1-45C1-BAF7-128340436E97");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_IMPORTONEG, "IMPORTONEG");
    BUK_NUOVOLIBRO.InitBoxSpan(BUK_NUOVOLIBRO_RPTBOX_IMPORTONEG, BUK_NUOVOLIBRO_SPAN_RENESPCOQPNL, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::NEGATIVSPESA", 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SPAN_RENESPCOQPNL, "EC25842A-6FA9-4FFA-9200-CCC9061A03BA");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SPAN_RENESPCOQPNL, "RENESPCOQPNL");
    BUK_NUOVOLIBRO.InitSection(BUK_NUOVOLIBRO_RPT_REPORT, BUK_NUOVOLIBRO_SEC_PIEDEPAGINA, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_NUOVOLIBRO.SetSectionRendersInto(BUK_NUOVOLIBRO_SEC_PIEDEPAGINA, BUK_NUOVOLIBRO_RPTBOX_PIEDEPAGINA);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SEC_PIEDEPAGINA, "D231268F-EA9B-4C98-A356-B00F0DEB5FC2");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_NUOVOLIBRO.InitSection(BUK_NUOVOLIBRO_RPT_REPORT, BUK_NUOVOLIBRO_SEC_PIEDEREPORT, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_NUOVOLIBRO.SetSectionRendersInto(BUK_NUOVOLIBRO_SEC_PIEDEREPORT, BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SEC_PIEDEREPORT, "6FBEC704-DB3C-4752-90F2-87CD149B6576");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_NUOVOLIBRO_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_NUOVOLIBRO_InitLinks()
  {
    BUK_NUOVOLIBRO.SetBoxNextBox(BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA, BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA);
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
    if (SrcObj == BKW_NUOVOLIBRO) BUK_NUOVOLIBRO_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_NUOVOLIBRO) BUK_NUOVOLIBRO_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_NUOVOLIBRO) BUK_NUOVOLIBRO_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_NUOVOLIBRO) BUK_NUOVOLIBRO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_NUOVOLIBRO) BUK_NUOVOLIBRO_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_NUOVOLIBRO) BUK_NUOVOLIBRO_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_NUOVOLIBRO) BUK_NUOVOLIBRO_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_NUOVOLIBRO) BUK_NUOVOLIBRO_OnPreview();
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
