// **********************************************
// Controllo Quietanze Scadute
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloQuietanzeScadute extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CONTQUIESCAD_NUMEROLIQ = 0;
  private static int PFL_CONTQUIESCAD_ANNOLIQ = 1;
  private static int PFL_CONTQUIESCAD_CODICE = 2;
  private static int PFL_CONTQUIESCAD_BENEFICIARIO = 3;
  private static int PFL_CONTQUIESCAD_NUMQUIETANZA = 4;
  private static int PFL_CONTQUIESCAD_QUIETANZA = 5;
  private static int PFL_CONTQUIESCAD_ETICHELIQUID = 6;
  private static int PFL_CONTQUIESCAD_ETICHEBENEFI = 7;
  private static int PFL_CONTQUIESCAD_ETICHEQUIETA = 8;
  private static int PFL_CONTQUIESCAD_SCADENZA = 9;

  private static int PPQRY_LIQ57 = 0;


  IDPanel PAN_CONTQUIESCAD;
  CIDREObj BUK_LIBCONQUISCA;
  OBook BKW_LIBCONQUISCA;
  //
  // Template Pages constants
  private static int BUK_LIBCONQUISCA_MST_NUOVPAGIMAST = 1;
  private static int BUK_LIBCONQUISCA_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIBCONQUISCA_SPAN_NUMEROPAGINA = 3;
  private static int BUK_LIBCONQUISCA_RPTBOX_TESTATPAGINA = 4;
  private static int BUK_LIBCONQUISCA_RPTBOX_CORPOPAGINA = 5;
  private static int BUK_LIBCONQUISCA_RPTBOX_PIEDEPAGINA = 6;

  //
  // Reports constants
  private static int BUK_LIBCONQUISCA_RPT_NUOVOREPORT = 7;
  private static int BUK_LIBCONQUISCA_SEC_INTESTREPORT = 8;
  private static int BUK_LIBCONQUISCA_SEC_INTESTPAGINA = 9;
  private static int BUK_LIBCONQUISCA_RPTBOX_TITOLO = 10;
  private static int BUK_LIBCONQUISCA_SPAN_NUOVASPAN = 11;
  private static int BUK_LIBCONQUISCA_RPTBOX_LIQUIDHEADER = 12;
  private static int BUK_LIBCONQUISCA_SPAN_C1 = 13;
  private static int BUK_LIBCONQUISCA_RPTBOX_BENEFIHEADER = 14;
  private static int BUK_LIBCONQUISCA_SPAN_C2 = 15;
  private static int BUK_LIBCONQUISCA_RPTBOX_QUIETAHEADER = 16;
  private static int BUK_LIBCONQUISCA_SPAN_C3 = 17;
  private static int BUK_LIBCONQUISCA_RPTBOX_SCADENHEADER = 18;
  private static int BUK_LIBCONQUISCA_SPAN_C = 19;
  private static int BUK_LIBCONQUISCA_SEC_DETTAGLIO = 20;
  private static int BUK_LIBCONQUISCA_RPTBOX_NUMEROLIQ = 21;
  private static int BUK_LIBCONQUISCA_SPAN_TSRNLCQSLCQS = 22;
  private static int BUK_LIBCONQUISCA_RPTBOX_BENRAGIOSOCI = 23;
  private static int BUK_LIBCONQUISCA_SPAN_TSRBCCQSLCQS = 24;
  private static int BUK_LIBCONQUISCA_RPTBOX_QTNNUMQUIETA = 25;
  private static int BUK_LIBCONQUISCA_SPAN_TSRQNQCQSLCQ = 26;
  private static int BUK_LIBCONQUISCA_RPTBOX_QTNSCADENZA = 27;
  private static int BUK_LIBCONQUISCA_SPAN_SCADENZA = 28;
  private static int BUK_LIBCONQUISCA_SEC_PIEDEPAGINA = 29;
  private static int BUK_LIBCONQUISCA_SEC_PIEDEREPORT = 30;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_LIQ57(IMDB);
    Init_PQRY_LIQ(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_LIQ57(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ57, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ57, "PQRY_LIQ57");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECORNUMELIQ, "RECORNUMELIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECORNUMELIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECORANNOLIQ, "RECORANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECORANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECORBENCODI, "RECORBENCODI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECORBENCODI,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECORDBENEFI, "RECORDBENEFI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECORDBENEFI,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECQTNNUMQUI, "RECQTNNUMQUI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECQTNNUMQUI,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECORDQUIETA, "RECORDQUIETA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECORDQUIETA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECORDSCADEN, "RECORDSCADEN");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ57,IMDBDef14.PQSL_LIQ57_RECORDSCADEN,6,10,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ57, 0);
  }

  private static void Init_PQRY_LIQ(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ, "PQRY_LIQ");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECORNUMELIQ, "RECORNUMELIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECORNUMELIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECORANNOLIQ, "RECORANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECORANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECORBENCODI, "RECORBENCODI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECORBENCODI,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECORDBENEFI, "RECORDBENEFI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECORDBENEFI,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECQTNNUMQUI, "RECQTNNUMQUI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECQTNNUMQUI,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECORDQUIETA, "RECORDQUIETA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECORDQUIETA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECORDSCADEN, "RECORDSCADEN");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ,IMDBDef14.PQSL_LIQ_RECORDSCADEN,6,10,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloQuietanzeScadute(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloQuietanzeScadute()
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
    FormIdx = MyGlb.FRM_CONTQUIESCAD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F5EA5A3D-0074-471C-A0EF-3892123F4A7A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 880;
    DesignHeight = 462;
    set_Caption(new IDVariant("Controllo Quietanze Scadute"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 880;
    Frames[1].Height = 436;
    Frames[1].Caption = "Controllo Quietanze Scadute";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 436;
    PAN_CONTQUIESCAD = new IDPanel(w, this, 1, "PAN_CONTQUIESCAD");
    Frames[1].Content = PAN_CONTQUIESCAD;
    PAN_CONTQUIESCAD.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTQUIESCAD.VS = MainFrm.VisualStyleList;
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 880-MyGlb.PAN_OFFS_X, 436-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBCONQUISCA != null)
      PAN_CONTQUIESCAD.SetBook(BUK_LIBCONQUISCA);
    PAN_CONTQUIESCAD.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F8BF796B-B4B9-458E-8C90-830AAE02E4A5");
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 792, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CONTQUIESCAD.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTQUIESCAD.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTQUIESCAD.InitStatus = 2;
    PAN_CONTQUIESCAD_Init();
    PAN_CONTQUIESCAD_InitFields();
    PAN_CONTQUIESCAD_InitQueries();
    BKW_LIBCONQUISCA = new OBook(this);
    BUK_LIBCONQUISCA = new CIDREObj(BKW_LIBCONQUISCA);
    BKW_LIBCONQUISCA.iGuid = "E3AF26B9-5ADC-4DEB-84AF-EEE60FBBAA7E";
    BKW_LIBCONQUISCA.Code = "BUK_LIBCONQUISCA";
    BKW_LIBCONQUISCA.BookObj = BUK_LIBCONQUISCA;
    BKW_LIBCONQUISCA.InitDefMasks();
    BUK_LIBCONQUISCA.InitBook(1, 1245185, "Libro Controllo Quietanze Scadute", IMDB, MainFrm.VisualStyleList);
    BUK_LIBCONQUISCA.InitHTML();
    BUK_LIBCONQUISCA.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBCONQUISCA.Book.SetMainFrm(MainFrm);
    BUK_LIBCONQUISCA.SetRTCGuid(0, "E3AF26B9-5ADC-4DEB-84AF-EEE60FBBAA7E");
    BUK_LIBCONQUISCA.SetObjCode(0, "LIBCONQUISCA");
    if (PAN_CONTQUIESCAD != null)
      PAN_CONTQUIESCAD.SetBook(BUK_LIBCONQUISCA);
    BUK_LIBCONQUISCA_MST_NUOVPAGIMAST_Init();
    BUK_LIBCONQUISCA_RPT_NUOVOREPORT_Init();
    BUK_LIBCONQUISCA_InitLinks();
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
      PAN_CONTQUIESCAD.UpdatePanel(MainFrm);
      // BUK_LIBCONQUISCA.UpdateBook();
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
    if (Code.equals("BUK_LIBCONQUISCA")) return BUK_LIBCONQUISCA;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ControlloQuietanzeScadute);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloQuietanzeScadute.class.getName() : (Glb.ClassWithPackage(ControlloQuietanzeScadute.class) ? ControlloQuietanzeScadute.class.getName().substring(ControlloQuietanzeScadute.class.getPackage().getName().length() + 1) : ControlloQuietanzeScadute.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Controllo Quietanze Scadute On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTQUIESCAD_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CONTQUIESCAD);
      // 
      // Controllo Quietanze Scadute On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_CONTQUIESCAD.set_ToolTip(Glb.OBJ_FIELD,PFL_CONTQUIESCAD_BENEFICIARIO,IMDB.Value(IMDBDef14.PQRY_LIQ57, IMDBDef14.PQSL_LIQ57_RECORDBENEFI, 0).stringValue()); 
      PAN_CONTQUIESCAD.set_ToolTip(Glb.OBJ_FIELD,PFL_CONTQUIESCAD_QUIETANZA,IMDB.Value(IMDBDef14.PQRY_LIQ57, IMDBDef14.PQSL_LIQ57_RECORDQUIETA, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuietanzeScadute", "ControlloQuietanzeScaduteOnDynamicProperties", _e);
    }
  }

  
  
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
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CONTQUIESCAD_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTQUIESCAD, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTQUIESCAD_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTQUIESCAD, Cancel);
    // Stub
  }

  private void PAN_CONTQUIESCAD_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONTQUIESCAD_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTQUIESCAD_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTQUIESCAD_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBCONQUISCA_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBCONQUISCA_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBCONQUISCA_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_LIBCONQUISCA_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_LIBCONQUISCA_SEC_DETTAGLIO)
    {
      BUK_LIBCONQUISCA.set_SpanValue(BUK_LIBCONQUISCA_SPAN_TSRNLCQSLCQS, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_LIBCONQUISCA.GetReportColumn(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, "RECORNUMELIQ")), (new IDVariant("/"))), IDL.ToString(BUK_LIBCONQUISCA.GetReportColumn(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, "RECORANNOLIQ")))));
      BUK_LIBCONQUISCA.set_SpanValue(BUK_LIBCONQUISCA_SPAN_TSRBCCQSLCQS, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_LIBCONQUISCA.GetReportColumn(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, "RECORBENCODI")), (new IDVariant(" - "))), BUK_LIBCONQUISCA.GetReportColumn(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, "RECORDBENEFI"))));
      BUK_LIBCONQUISCA.set_SpanValue(BUK_LIBCONQUISCA_SPAN_TSRQNQCQSLCQ, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_LIBCONQUISCA.GetReportColumn(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, "RECQTNNUMQUI")), (new IDVariant(" - "))), BUK_LIBCONQUISCA.GetReportColumn(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, "RECORDQUIETA"))));
    }
    if (SectionID==BUK_LIBCONQUISCA_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_LIBCONQUISCA_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_LIBCONQUISCA_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBCONQUISCA_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBCONQUISCA_MST_NUOVPAGIMAST)
    {
      BUK_LIBCONQUISCA.set_SpanValue(BUK_LIBCONQUISCA_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBCONQUISCA.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBCONQUISCA.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBCONQUISCA_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBCONQUISCA_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBCONQUISCA_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBCONQUISCA_OnPreview()
  {
    PreviewBook = BKW_LIBCONQUISCA;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONTQUIESCAD_Init()
  {

    PAN_CONTQUIESCAD.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTQUIESCAD.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONTQUIESCAD.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_CONTQUIESCAD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, "74DA2541-DE4C-4DCC-ABB2-7580B0EB623F");
    PAN_CONTQUIESCAD.set_Header(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, "NUMERO LIQ");
    PAN_CONTQUIESCAD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, "");
    PAN_CONTQUIESCAD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTQUIESCAD.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CONTQUIESCAD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, "E6B2B42A-A270-4F61-B332-A4F7C93262F9");
    PAN_CONTQUIESCAD.set_Header(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, "ANNO LIQ");
    PAN_CONTQUIESCAD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, "");
    PAN_CONTQUIESCAD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTQUIESCAD.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CONTQUIESCAD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, "94DB8C9C-B352-49D2-A108-6AFE7081FEE6");
    PAN_CONTQUIESCAD.set_Header(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, "Codice");
    PAN_CONTQUIESCAD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, "Codice del beneficiario");
    PAN_CONTQUIESCAD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTQUIESCAD.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CONTQUIESCAD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, "0A2F4F2C-C205-4DE7-8EDD-2317E49B64C4");
    PAN_CONTQUIESCAD.set_Header(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, "Beneficiario");
    PAN_CONTQUIESCAD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, "");
    PAN_CONTQUIESCAD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTQUIESCAD.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_CONTQUIESCAD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, "474897DF-B748-44CF-9F97-3B53DA9926AA");
    PAN_CONTQUIESCAD.set_Header(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, "NUM QUIETANZA");
    PAN_CONTQUIESCAD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, "");
    PAN_CONTQUIESCAD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTQUIESCAD.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CONTQUIESCAD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, "1F363C72-BF10-4ED1-91B3-9EB7F92741DB");
    PAN_CONTQUIESCAD.set_Header(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, "Quietanza");
    PAN_CONTQUIESCAD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, "");
    PAN_CONTQUIESCAD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTQUIESCAD.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONTQUIESCAD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHELIQUID, "4F6BC4C5-B79D-4FBF-A366-781A2E3136F7");
    PAN_CONTQUIESCAD.set_Header(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHELIQUID, "Liquidazione");
    PAN_CONTQUIESCAD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHELIQUID, MyGlb.VIS_LABEVISUSTYL);
    PAN_CONTQUIESCAD.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHELIQUID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CONTQUIESCAD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEBENEFI, "47ED3807-E6D4-42BD-B6AD-5B5E3D4AD62B");
    PAN_CONTQUIESCAD.set_Header(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEBENEFI, "Beneficiario");
    PAN_CONTQUIESCAD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEBENEFI, MyGlb.VIS_LABEVISUSTYL);
    PAN_CONTQUIESCAD.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEBENEFI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CONTQUIESCAD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEQUIETA, "A29BBB66-9DC5-4113-B242-E968EC6A9FDE");
    PAN_CONTQUIESCAD.set_Header(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEQUIETA, "Quietanza");
    PAN_CONTQUIESCAD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEQUIETA, MyGlb.VIS_LABEVISUSTYL);
    PAN_CONTQUIESCAD.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEQUIETA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CONTQUIESCAD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, "23472B0D-95EC-4C95-9A5D-A9F23ED8A227");
    PAN_CONTQUIESCAD.set_Header(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, "Scadenza");
    PAN_CONTQUIESCAD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, "");
    PAN_CONTQUIESCAD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTQUIESCAD.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CONTQUIESCAD_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, MyGlb.PANEL_LIST, 80);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, MyGlb.PANEL_LIST, "NUM. LIQ");
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, MyGlb.PANEL_FORM, 80);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMEROLIQ, MyGlb.PANEL_FORM, "NUMERO LIQ");
    PAN_CONTQUIESCAD.SetFieldPage(PFL_CONTQUIESCAD_NUMEROLIQ, -1, -1);
    PAN_CONTQUIESCAD.SetFieldPanel(PFL_CONTQUIESCAD_NUMEROLIQ, PPQRY_LIQ57, "A.NUMERO_LIQ", "RECORNUMELIQ", 1, 5, 0, -13997);
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, MyGlb.PANEL_LIST, 44, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, MyGlb.PANEL_FORM, 4, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_CONTQUIESCAD.SetFieldPage(PFL_CONTQUIESCAD_ANNOLIQ, -1, -1);
    PAN_CONTQUIESCAD.SetFieldPanel(PFL_CONTQUIESCAD_ANNOLIQ, PPQRY_LIQ57, "A.ANNO_LIQ", "RECORANNOLIQ", 1, 4, 0, -13997);
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, MyGlb.PANEL_LIST, 84, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, MyGlb.PANEL_FORM, 4, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CONTQUIESCAD.SetFieldPage(PFL_CONTQUIESCAD_CODICE, -1, -1);
    PAN_CONTQUIESCAD.SetFieldPanel(PFL_CONTQUIESCAD_CODICE, PPQRY_LIQ57, "B.CODICE", "RECORBENCODI", 2, 15, 0, -13997);
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, MyGlb.PANEL_LIST, 136, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, MyGlb.PANEL_LIST, 108);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 76, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, MyGlb.PANEL_FORM, 108);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_CONTQUIESCAD.SetFieldPage(PFL_CONTQUIESCAD_BENEFICIARIO, -1, -1);
    PAN_CONTQUIESCAD.SetFieldPanel(PFL_CONTQUIESCAD_BENEFICIARIO, PPQRY_LIQ57, "B.RAGIONE_SOCIALE", "RECORDBENEFI", 5, 40, 0, -13997);
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, MyGlb.PANEL_LIST, 444, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, MyGlb.PANEL_LIST, 100);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, MyGlb.PANEL_LIST, "NUM Q.");
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, MyGlb.PANEL_FORM, 4, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, MyGlb.PANEL_FORM, 100);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_NUMQUIETANZA, MyGlb.PANEL_FORM, "NUM QUIETANZA");
    PAN_CONTQUIESCAD.SetFieldPage(PFL_CONTQUIESCAD_NUMQUIETANZA, -1, -1);
    PAN_CONTQUIESCAD.SetFieldPanel(PFL_CONTQUIESCAD_NUMQUIETANZA, PPQRY_LIQ57, "C.NUM_QUIETANZA", "RECQTNNUMQUI", 1, 2, 0, -13997);
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, MyGlb.PANEL_LIST, 484, 36, 236, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, MyGlb.PANEL_LIST, 84);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, MyGlb.PANEL_FORM, 4, 124, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, MyGlb.PANEL_FORM, 84);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_CONTQUIESCAD.SetFieldPage(PFL_CONTQUIESCAD_QUIETANZA, -1, -1);
    PAN_CONTQUIESCAD.SetFieldPanel(PFL_CONTQUIESCAD_QUIETANZA, PPQRY_LIQ57, "D.DESCRIZIONE", "RECORDQUIETA", 5, 40, 0, -13997);
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHELIQUID, MyGlb.PANEL_LIST, 0, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHELIQUID, MyGlb.PANEL_LIST, 0);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHELIQUID, MyGlb.PANEL_LIST, 2);
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHELIQUID, MyGlb.PANEL_FORM, 160, 348, 200, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHELIQUID, MyGlb.PANEL_FORM, 0);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHELIQUID, MyGlb.PANEL_FORM, 2);
    PAN_CONTQUIESCAD.SetFieldPage(PFL_CONTQUIESCAD_ETICHELIQUID, -1, -1);
    PAN_CONTQUIESCAD.SetFieldPanel(PFL_CONTQUIESCAD_ETICHELIQUID, -1, "", "ETICHELIQUID", 0, 0, 0, -13997);
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEBENEFI, MyGlb.PANEL_LIST, 84, 0, 360, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEBENEFI, MyGlb.PANEL_LIST, 0);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEBENEFI, MyGlb.PANEL_LIST, 2);
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEBENEFI, MyGlb.PANEL_FORM, 168, 356, 200, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEBENEFI, MyGlb.PANEL_FORM, 0);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEBENEFI, MyGlb.PANEL_FORM, 2);
    PAN_CONTQUIESCAD.SetFieldPage(PFL_CONTQUIESCAD_ETICHEBENEFI, -1, -1);
    PAN_CONTQUIESCAD.SetFieldPanel(PFL_CONTQUIESCAD_ETICHEBENEFI, -1, "", "ETICHEBENEFI", 0, 0, 0, -13997);
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEQUIETA, MyGlb.PANEL_LIST, 444, 0, 276, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEQUIETA, MyGlb.PANEL_LIST, 0);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEQUIETA, MyGlb.PANEL_LIST, 2);
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEQUIETA, MyGlb.PANEL_FORM, 176, 364, 200, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEQUIETA, MyGlb.PANEL_FORM, 0);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_ETICHEQUIETA, MyGlb.PANEL_FORM, 2);
    PAN_CONTQUIESCAD.SetFieldPage(PFL_CONTQUIESCAD_ETICHEQUIETA, -1, -1);
    PAN_CONTQUIESCAD.SetFieldPanel(PFL_CONTQUIESCAD_ETICHEQUIETA, -1, "", "ETICHEQUIETA", 0, 0, 0, -13997);
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, MyGlb.PANEL_LIST, 720, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, MyGlb.PANEL_LIST, 68);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_CONTQUIESCAD.SetRect(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, MyGlb.PANEL_FORM, 4, 148, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTQUIESCAD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, MyGlb.PANEL_FORM, 68);
    PAN_CONTQUIESCAD.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_CONTQUIESCAD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTQUIESCAD_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_CONTQUIESCAD.SetFieldPage(PFL_CONTQUIESCAD_SCADENZA, -1, -1);
    PAN_CONTQUIESCAD.SetFieldPanel(PFL_CONTQUIESCAD_SCADENZA, PPQRY_LIQ57, "C.SCADENZA", "RECORDSCADEN", 6, 10, 0, -13997);
  }

  private void PAN_CONTQUIESCAD_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTQUIESCAD.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONTQUIESCAD.SetIMDB(IMDB, "PQRY_LIQ57", true);
    PAN_CONTQUIESCAD.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_LIQ as RECORNUMELIQ, ");
    SQL.append("  A.ANNO_LIQ as RECORANNOLIQ, ");
    SQL.append("  B.CODICE as RECORBENCODI, ");
    SQL.append("  B.RAGIONE_SOCIALE as RECORDBENEFI, ");
    SQL.append("  C.NUM_QUIETANZA as RECQTNNUMQUI, ");
    SQL.append("  D.DESCRIZIONE as RECORDQUIETA, ");
    SQL.append("  C.SCADENZA as RECORDSCADEN ");
    PAN_CONTQUIESCAD.SetQuery(PPQRY_LIQ57, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B, ");
    SQL.append("  QTN C, ");
    SQL.append("  T02 D ");
    PAN_CONTQUIESCAD.SetQuery(PPQRY_LIQ57, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
    SQL.append("and   (B.CODICE = A.BENEFICIARIO) ");
    SQL.append("and   (C.CODICE = B.CODICE) ");
    SQL.append("and   (C.NUM_QUIETANZA = A.NUM_QUIETANZA) ");
    SQL.append("and   (NVL(C.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) < ~~PQRY_PARAMETRI225.PARADATAEMIS~~) ");
    SQL.append("and   (D.CODICE = C.TIPO_QUIETANZA) ");
    PAN_CONTQUIESCAD.SetQuery(PPQRY_LIQ57, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTQUIESCAD.SetQuery(PPQRY_LIQ57, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTQUIESCAD.SetQuery(PPQRY_LIQ57, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ ");
    PAN_CONTQUIESCAD.SetQuery(PPQRY_LIQ57, 5, SQL, -1, "");
    PAN_CONTQUIESCAD.SetQueryDB(PPQRY_LIQ57, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTQUIESCAD.SetMasterTable(0, "LIQ");
    PAN_CONTQUIESCAD.AddToSortList(PFL_CONTQUIESCAD_ANNOLIQ, true);
    PAN_CONTQUIESCAD.AddToSortList(PFL_CONTQUIESCAD_NUMEROLIQ, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTQUIESCAD.Status() == 2)
    {
      int oldListQBE = PAN_CONTQUIESCAD.iUseListQBE;
      PAN_CONTQUIESCAD.iUseListQBE = 0;
      PAN_CONTQUIESCAD.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTQUIESCAD.PanelCommand(Glb.PCM_FIND);
      PAN_CONTQUIESCAD.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBCONQUISCA_MST_NUOVPAGIMAST_Init()
  {
    BUK_LIBCONQUISCA.InitMastro(BUK_LIBCONQUISCA_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 1, 1);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_MST_NUOVPAGIMAST, "5C681877-D91C-4B0A-926C-9AE4AE71F2D6");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_LIBCONQUISCA.InitMastroBox(BUK_LIBCONQUISCA_MST_NUOVPAGIMAST, BUK_LIBCONQUISCA_RPTBOX_NUMEROPAGINA, 17500, 400, 2500, 400, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_NUMEROPAGINA, "CE849603-E04E-47B3-ADBC-6BEF5D11611A");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBCONQUISCA.InitBoxSpan(BUK_LIBCONQUISCA_RPTBOX_NUMEROPAGINA, BUK_LIBCONQUISCA_SPAN_NUMEROPAGINA, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271319169, "", "", 1);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SPAN_NUMEROPAGINA, "B6D35018-A2FA-4B0C-BC82-F2F2579D863B");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBCONQUISCA.InitMastroBox(BUK_LIBCONQUISCA_MST_NUOVPAGIMAST, BUK_LIBCONQUISCA_RPTBOX_TESTATPAGINA, 1000, 1000, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_TESTATPAGINA, "F456103B-0A40-43B3-9B6D-839D922AF992");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_LIBCONQUISCA.InitMastroBox(BUK_LIBCONQUISCA_MST_NUOVPAGIMAST, BUK_LIBCONQUISCA_RPTBOX_CORPOPAGINA, 1000, 3100, 19000, 25400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_CORPOPAGINA, "02497B00-6A18-4F76-A979-C8D11B57179B");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_LIBCONQUISCA.InitMastroBox(BUK_LIBCONQUISCA_MST_NUOVPAGIMAST, BUK_LIBCONQUISCA_RPTBOX_PIEDEPAGINA, 1000, 28700, 19000, 100, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_PIEDEPAGINA, "C7654FB0-622A-4411-BC97-F7E10A7DE571");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
  }

  private void BUK_LIBCONQUISCA_RPT_NUOVOREPORT_InitQuery() { BUK_LIBCONQUISCA_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_LIBCONQUISCA_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.NUMERO_LIQ as RECORNUMELIQ, ");
      SQL.append("  A.ANNO_LIQ as RECORANNOLIQ, ");
      SQL.append("  B.CODICE as RECORBENCODI, ");
      SQL.append("  B.RAGIONE_SOCIALE as RECORDBENEFI, ");
      SQL.append("  C.NUM_QUIETANZA as RECQTNNUMQUI, ");
      SQL.append("  D.DESCRIZIONE as RECORDQUIETA, ");
      SQL.append("  C.SCADENZA as RECORDSCADEN ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  BEN B, ");
      SQL.append("  QTN C, ");
      SQL.append("  T02 D ");
      SQL.append("where (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
      SQL.append("and   (B.CODICE = A.BENEFICIARIO) ");
      SQL.append("and   (C.CODICE = B.CODICE) ");
      SQL.append("and   (C.NUM_QUIETANZA = A.NUM_QUIETANZA) ");
      SQL.append("and   (NVL(C.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) < ~~PQRY_PARAMETRI225.PARADATAEMIS~~) ");
      SQL.append("and   (D.CODICE = C.TIPO_QUIETANZA) ");
      SQL.append("order by ");
      SQL.append("  A.ANNO_LIQ, ");
      SQL.append("  A.NUMERO_LIQ ");
      BUK_LIBCONQUISCA.SetReportQuery(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "9ED6D963-1490-44CF-9F3B-7F31AF2893A9");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBCONQUISCA_RPT_NUOVOREPORT_Init()
  {
    BUK_LIBCONQUISCA.InitReport(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, 131073);
    BUK_LIBCONQUISCA_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, "42BC5542-017A-45D4-9BCA-0A6417870BED");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_LIBCONQUISCA.InitSection(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, BUK_LIBCONQUISCA_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONQUISCA.SetSectionRendersInto(BUK_LIBCONQUISCA_SEC_INTESTREPORT, BUK_LIBCONQUISCA_RPTBOX_CORPOPAGINA);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SEC_INTESTREPORT, "958BE8D5-A320-41DF-8AFD-E466FDE3A0DD");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_LIBCONQUISCA.InitSection(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, BUK_LIBCONQUISCA_SEC_INTESTPAGINA, 1900, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONQUISCA.SetSectionRendersInto(BUK_LIBCONQUISCA_SEC_INTESTPAGINA, BUK_LIBCONQUISCA_RPTBOX_TESTATPAGINA);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SEC_INTESTPAGINA, "0770237B-6210-4C67-8508-05FDA5F8C571");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_LIBCONQUISCA.InitReportBox(BUK_LIBCONQUISCA_SEC_INTESTPAGINA, BUK_LIBCONQUISCA_RPTBOX_TITOLO, 0, 100, 19000, 1000, 0, 1, 1, MyGlb.VIS_TITOLIINBOX, 983041, 590, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_TITOLO, "A0E753B9-71C0-415B-ACC0-456A96690F6F");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_TITOLO, "TITOLO");
    BUK_LIBCONQUISCA.InitBoxSpan(BUK_LIBCONQUISCA_RPTBOX_TITOLO, BUK_LIBCONQUISCA_SPAN_NUOVASPAN, MyGlb.VIS_TITOLIINBOX, 0, 0, 0, 271384961, "", "Controllo Quietanze Scadute", 1);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SPAN_NUOVASPAN, "64CEC6F3-FFA1-45DB-BD70-FFFA94F13151");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_LIBCONQUISCA.InitReportBox(BUK_LIBCONQUISCA_SEC_INTESTPAGINA, BUK_LIBCONQUISCA_RPTBOX_LIQUIDHEADER, 0, 1400, 2600, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_LIQUIDHEADER, "AA096095-EC1F-415B-BACC-3FBE17246510");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_LIQUIDHEADER, "LIQUIDHEADER");
    BUK_LIBCONQUISCA.InitBoxSpan(BUK_LIBCONQUISCA_RPTBOX_LIQUIDHEADER, BUK_LIBCONQUISCA_SPAN_C1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Liquidazione", 1);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SPAN_C1, "AB84BC87-3FB4-47B9-9AC4-39C1A7BADB8C");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SPAN_C1, "C1");
    BUK_LIBCONQUISCA.InitReportBox(BUK_LIBCONQUISCA_SEC_INTESTPAGINA, BUK_LIBCONQUISCA_RPTBOX_BENEFIHEADER, 2800, 1400, 5800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_BENEFIHEADER, "3856BC1D-5F6E-4FDF-81BF-AFD58510D634");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_BENEFIHEADER, "BENEFIHEADER");
    BUK_LIBCONQUISCA.InitBoxSpan(BUK_LIBCONQUISCA_RPTBOX_BENEFIHEADER, BUK_LIBCONQUISCA_SPAN_C2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Beneficiario", 1);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SPAN_C2, "A9F460CC-1884-4935-9F38-F8F613B088C2");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SPAN_C2, "C2");
    BUK_LIBCONQUISCA.InitReportBox(BUK_LIBCONQUISCA_SEC_INTESTPAGINA, BUK_LIBCONQUISCA_RPTBOX_QUIETAHEADER, 10400, 1400, 6600, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_QUIETAHEADER, "88E254D8-7442-4961-A1FC-C5D0BC12249D");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_QUIETAHEADER, "QUIETAHEADER");
    BUK_LIBCONQUISCA.InitBoxSpan(BUK_LIBCONQUISCA_RPTBOX_QUIETAHEADER, BUK_LIBCONQUISCA_SPAN_C3, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Quietanza", 1);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SPAN_C3, "D89F2E45-AF2A-40C0-BE24-B68154ED0211");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SPAN_C3, "C3");
    BUK_LIBCONQUISCA.InitReportBox(BUK_LIBCONQUISCA_SEC_INTESTPAGINA, BUK_LIBCONQUISCA_RPTBOX_SCADENHEADER, 17200, 1400, 1800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_SCADENHEADER, "1D4D94DC-32FE-4265-82B0-B23FBA713E73");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_SCADENHEADER, "SCADENHEADER");
    BUK_LIBCONQUISCA.InitBoxSpan(BUK_LIBCONQUISCA_RPTBOX_SCADENHEADER, BUK_LIBCONQUISCA_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Scadenza", 1);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SPAN_C, "74DBE4A4-ECF2-48D6-90D5-D21C39C8C586");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SPAN_C, "C");
    BUK_LIBCONQUISCA.InitSection(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, BUK_LIBCONQUISCA_SEC_DETTAGLIO, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONQUISCA.SetSectionRendersInto(BUK_LIBCONQUISCA_SEC_DETTAGLIO, BUK_LIBCONQUISCA_RPTBOX_CORPOPAGINA);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SEC_DETTAGLIO, "D5C49324-3583-4CF3-90C7-36D9EA87522D");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_LIBCONQUISCA.InitReportBox(BUK_LIBCONQUISCA_SEC_DETTAGLIO, BUK_LIBCONQUISCA_RPTBOX_NUMEROLIQ, 200, 0, 2300, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_NUMEROLIQ, "D8F4A302-5718-44B4-97CC-CE372AC9375D");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_NUMEROLIQ, "NUMEROLIQ");
    BUK_LIBCONQUISCA.InitBoxSpan(BUK_LIBCONQUISCA_RPTBOX_NUMEROLIQ, BUK_LIBCONQUISCA_SPAN_TSRNLCQSLCQS, MyGlb.VIS_DEFAREPOSTYL, 5, 199, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SPAN_TSRNLCQSLCQS, "E4756960-B021-49A2-A505-26EA0DCC23A2");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SPAN_TSRNLCQSLCQS, "TSRNLCQSLCQS");
    BUK_LIBCONQUISCA.InitReportBox(BUK_LIBCONQUISCA_SEC_DETTAGLIO, BUK_LIBCONQUISCA_RPTBOX_BENRAGIOSOCI, 2800, 0, 7338, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_BENRAGIOSOCI, "4F63B038-BE76-4F03-BE71-83C43BE5CA2F");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_BENRAGIOSOCI, "BENRAGIOSOCI");
    BUK_LIBCONQUISCA.InitBoxSpan(BUK_LIBCONQUISCA_RPTBOX_BENRAGIOSOCI, BUK_LIBCONQUISCA_SPAN_TSRBCCQSLCQS, MyGlb.VIS_DEFAREPOSTYL, 5, 142, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SPAN_TSRBCCQSLCQS, "5FD7AB57-41FA-4C2B-AD92-6B42167191B3");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SPAN_TSRBCCQSLCQS, "TSRBCCQSLCQS");
    BUK_LIBCONQUISCA.InitReportBox(BUK_LIBCONQUISCA_SEC_DETTAGLIO, BUK_LIBCONQUISCA_RPTBOX_QTNNUMQUIETA, 10400, 0, 6500, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_QTNNUMQUIETA, "BE59AAE7-1C72-440E-8364-A510194254EA");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_QTNNUMQUIETA, "QTNNUMQUIETA");
    BUK_LIBCONQUISCA.InitBoxSpan(BUK_LIBCONQUISCA_RPTBOX_QTNNUMQUIETA, BUK_LIBCONQUISCA_SPAN_TSRQNQCQSLCQ, MyGlb.VIS_DEFAREPOSTYL, 5, 142, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SPAN_TSRQNQCQSLCQ, "58B5DD9D-6BAC-4D39-AD02-7368D750AEE0");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SPAN_TSRQNQCQSLCQ, "TSRQNQCQSLCQ");
    BUK_LIBCONQUISCA.InitReportBox(BUK_LIBCONQUISCA_SEC_DETTAGLIO, BUK_LIBCONQUISCA_RPTBOX_QTNSCADENZA, 17200, 0, 1628, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_RPTBOX_QTNSCADENZA, "CCF60356-D308-4B4F-AEA0-6B9FEB331684");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_RPTBOX_QTNSCADENZA, "QTNSCADENZA");
    BUK_LIBCONQUISCA.InitBoxSpan(BUK_LIBCONQUISCA_RPTBOX_QTNSCADENZA, BUK_LIBCONQUISCA_SPAN_SCADENZA, MyGlb.VIS_DEFAREPOSTYL, 6, 10, 0, 271384705, "Brief description of field content.", "::RECORDSCADEN", 1);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SPAN_SCADENZA, "80E02F07-4E5D-46CB-9930-899CF95A0E31");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SPAN_SCADENZA, "SCADENZA");
    BUK_LIBCONQUISCA.InitSection(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, BUK_LIBCONQUISCA_SEC_PIEDEPAGINA, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONQUISCA.SetSectionRendersInto(BUK_LIBCONQUISCA_SEC_PIEDEPAGINA, BUK_LIBCONQUISCA_RPTBOX_PIEDEPAGINA);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SEC_PIEDEPAGINA, "9DE65FBE-2930-4C95-A341-5E8D26120C81");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_LIBCONQUISCA.InitSection(BUK_LIBCONQUISCA_RPT_NUOVOREPORT, BUK_LIBCONQUISCA_SEC_PIEDEREPORT, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONQUISCA.SetSectionRendersInto(BUK_LIBCONQUISCA_SEC_PIEDEREPORT, BUK_LIBCONQUISCA_RPTBOX_CORPOPAGINA);
    BUK_LIBCONQUISCA.SetRTCGuid(BUK_LIBCONQUISCA_SEC_PIEDEREPORT, "A984D266-9956-4B1A-94C4-8F5C297632D0");
    BUK_LIBCONQUISCA.SetObjCode(BUK_LIBCONQUISCA_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_LIBCONQUISCA_RPT_NUOVOREPORT_InitQuery(false, true);
  }

  private void BUK_LIBCONQUISCA_InitLinks()
  {
    BUK_LIBCONQUISCA.SetBoxNextBox(BUK_LIBCONQUISCA_RPTBOX_CORPOPAGINA, BUK_LIBCONQUISCA_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONTQUIESCAD) PAN_CONTQUIESCAD_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTQUIESCAD) PAN_CONTQUIESCAD_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTQUIESCAD) PAN_CONTQUIESCAD_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTQUIESCAD) PAN_CONTQUIESCAD_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONTQUIESCAD) PAN_CONTQUIESCAD_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBCONQUISCA) BUK_LIBCONQUISCA_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBCONQUISCA) BUK_LIBCONQUISCA_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBCONQUISCA) BUK_LIBCONQUISCA_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBCONQUISCA) BUK_LIBCONQUISCA_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBCONQUISCA) BUK_LIBCONQUISCA_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBCONQUISCA) BUK_LIBCONQUISCA_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBCONQUISCA) BUK_LIBCONQUISCA_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBCONQUISCA) BUK_LIBCONQUISCA_OnPreview();
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
