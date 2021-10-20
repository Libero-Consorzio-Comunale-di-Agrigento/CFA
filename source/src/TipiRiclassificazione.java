// **********************************************
// Tipi Riclassificazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiRiclassificazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPIRICLASSI_CODICE = 0;
  private static int PFL_TIPIRICLASSI_DESCRIZIONE = 1;
  private static int PFL_TIPIRICLASSI_ESERCISCADEN = 2;
  private static int PFL_TIPIRICLASSI_TIPORICLID = 3;

  private static int PPQRY_TIPIRICLASS1 = 0;


  IDPanel PAN_TIPIRICLASSI;
  CIDREObj BUK_LIBRNUOVPANN;
  OBook BKW_LIBRNUOVPANN;
  //
  // Template Pages constants
  private static int BUK_LIBRNUOVPANN_MST_NUOVPAGIMAST = 1;
  private static int BUK_LIBRNUOVPANN_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_LIBRNUOVPANN_RPTBOX_CORPOPAGINA = 3;
  private static int BUK_LIBRNUOVPANN_RPTBOX_PIEDEPAGINA = 4;
  private static int BUK_LIBRNUOVPANN_RPTBOX_PAG = 5;
  private static int BUK_LIBRNUOVPANN_SPAN_CPTSLNPTRPNT = 6;

  //
  // Reports constants
  private static int BUK_LIBRNUOVPANN_RPT_NUOVOREPORT = 7;
  private static int BUK_LIBRNUOVPANN_SEC_INTESTREPORT = 8;
  private static int BUK_LIBRNUOVPANN_SEC_INTESTPAGINA = 9;
  private static int BUK_LIBRNUOVPANN_RPTBOX_INT1 = 10;
  private static int BUK_LIBRNUOVPANN_SPAN_TIPORICLASSI = 11;
  private static int BUK_LIBRNUOVPANN_RPTBOX_CODICEHEADER = 12;
  private static int BUK_LIBRNUOVPANN_SPAN_CODICE1 = 13;
  private static int BUK_LIBRNUOVPANN_RPTBOX_DESCRIHEADER = 14;
  private static int BUK_LIBRNUOVPANN_SPAN_DESCRIZIONE1 = 15;
  private static int BUK_LIBRNUOVPANN_RPTBOX_ESERSCADHEAD = 16;
  private static int BUK_LIBRNUOVPANN_SPAN_C = 17;
  private static int BUK_LIBRNUOVPANN_SEC_DETTAGLIO = 18;
  private static int BUK_LIBRNUOVPANN_RPTBOX_CODICE = 19;
  private static int BUK_LIBRNUOVPANN_SPAN_CODICE = 20;
  private static int BUK_LIBRNUOVPANN_RPTBOX_DESCRIZIONE = 21;
  private static int BUK_LIBRNUOVPANN_SPAN_DESCRIZIONE = 22;
  private static int BUK_LIBRNUOVPANN_RPTBOX_ESERCISCADEN = 23;
  private static int BUK_LIBRNUOVPANN_SPAN_TIPRICESESCA = 24;
  private static int BUK_LIBRNUOVPANN_SEC_PIEDEPAGINA = 25;
  private static int BUK_LIBRNUOVPANN_SEC_PIEDEREPORT = 26;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_TIPIRICLASS1(IMDB);
    Init_PQRY_TIPIRICLASSI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_TIPIRICLASS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_TIPIRICLASS1, 4);
    IMDB.set_TblCode(IMDBDef8.PQRY_TIPIRICLASS1, "PQRY_TIPIRICLASS1");
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIRICLASS1,IMDBDef8.PQSL_TIPIRICLASS1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIRICLASS1,IMDBDef8.PQSL_TIPIRICLASS1_CODICE,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIRICLASS1,IMDBDef8.PQSL_TIPIRICLASS1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIRICLASS1,IMDBDef8.PQSL_TIPIRICLASS1_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIRICLASS1,IMDBDef8.PQSL_TIPIRICLASS1_TIPO_RICL_ID, "TIPO_RICL_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIRICLASS1,IMDBDef8.PQSL_TIPIRICLASS1_TIPO_RICL_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIRICLASS1,IMDBDef8.PQSL_TIPIRICLASS1_ESERCIZIO_SCADENZA, "ESERCIZIO_SCADENZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIRICLASS1,IMDBDef8.PQSL_TIPIRICLASS1_ESERCIZIO_SCADENZA,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_TIPIRICLASS1, 0);
  }

  private static void Init_PQRY_TIPIRICLASSI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_TIPIRICLASSI, 4);
    IMDB.set_TblCode(IMDBDef8.PQRY_TIPIRICLASSI, "PQRY_TIPIRICLASSI");
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIRICLASSI,IMDBDef8.PQSL_TIPIRICLASSI_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIRICLASSI,IMDBDef8.PQSL_TIPIRICLASSI_RECORDCODICE,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIRICLASSI,IMDBDef8.PQSL_TIPIRICLASSI_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIRICLASSI,IMDBDef8.PQSL_TIPIRICLASSI_RECORDDESCRI,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIRICLASSI,IMDBDef8.PQSL_TIPIRICLASSI_RECTIPRIESSC, "RECTIPRIESSC");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIRICLASSI,IMDBDef8.PQSL_TIPIRICLASSI_RECTIPRIESSC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIRICLASSI,IMDBDef8.PQSL_TIPIRICLASSI_RETIRITIRIID, "RETIRITIRIID");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIRICLASSI,IMDBDef8.PQSL_TIPIRICLASSI_RETIRITIRIID,3,10,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_TIPIRICLASSI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiRiclassificazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiRiclassificazione()
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
    FormIdx = MyGlb.FRM_TIPIRICLASSI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C37CEFF4-0512-4BB6-817A-CD84EA73AEF9";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 620;
    DesignHeight = 402;
    set_Caption(new IDVariant("Tipi Riclassificazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 620;
    Frames[1].Height = 376;
    Frames[1].Caption = "Tipi Riclassificazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 376;
    PAN_TIPIRICLASSI = new IDPanel(w, this, 1, "PAN_TIPIRICLASSI");
    Frames[1].Content = PAN_TIPIRICLASSI;
    PAN_TIPIRICLASSI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIRICLASSI.VS = MainFrm.VisualStyleList;
    PAN_TIPIRICLASSI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 620-MyGlb.PAN_OFFS_X, 376-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBRNUOVPANN != null)
      PAN_TIPIRICLASSI.SetBook(BUK_LIBRNUOVPANN);
    PAN_TIPIRICLASSI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9C4A391D-1471-4653-8223-EEA6B59CA25F");
    PAN_TIPIRICLASSI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 564, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIRICLASSI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIRICLASSI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIRICLASSI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIRICLASSI.InitStatus = 2;
    PAN_TIPIRICLASSI_Init();
    PAN_TIPIRICLASSI_InitFields();
    PAN_TIPIRICLASSI_InitQueries();
    BKW_LIBRNUOVPANN = new OBook(this);
    BUK_LIBRNUOVPANN = new CIDREObj(BKW_LIBRNUOVPANN);
    BKW_LIBRNUOVPANN.iGuid = "20BDE5CE-6295-404F-AB01-41E50B926D22";
    BKW_LIBRNUOVPANN.Code = "BUK_LIBRNUOVPANN";
    BKW_LIBRNUOVPANN.BookObj = BUK_LIBRNUOVPANN;
    BKW_LIBRNUOVPANN.InitDefMasks();
    BUK_LIBRNUOVPANN.InitBook(1, 1245185, "Libro Nuovo Pannello", IMDB, MainFrm.VisualStyleList);
    BUK_LIBRNUOVPANN.InitHTML();
    BUK_LIBRNUOVPANN.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBRNUOVPANN.Book.SetMainFrm(MainFrm);
    BUK_LIBRNUOVPANN.SetRTCGuid(0, "20BDE5CE-6295-404F-AB01-41E50B926D22");
    BUK_LIBRNUOVPANN.SetObjCode(0, "LIBRNUOVPANN");
    if (PAN_TIPIRICLASSI != null)
      PAN_TIPIRICLASSI.SetBook(BUK_LIBRNUOVPANN);
    BUK_LIBRNUOVPANN_MST_NUOVPAGIMAST_Init();
    BUK_LIBRNUOVPANN_RPT_NUOVOREPORT_Init();
    BUK_LIBRNUOVPANN_InitLinks();
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
      PAN_TIPIRICLASSI.UpdatePanel(MainFrm);
      // BUK_LIBRNUOVPANN.UpdateBook();
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
    if (Code.equals("BUK_LIBRNUOVPANN")) return BUK_LIBRNUOVPANN;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof TipiRiclassificazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiRiclassificazione.class.getName() : (Glb.ClassWithPackage(TipiRiclassificazione.class) ? TipiRiclassificazione.class.getName().substring(TipiRiclassificazione.class.getPackage().getName().length() + 1) : TipiRiclassificazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tipi Riclassificazione After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_TIPIRICLASSI_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Riclassificazione After Commit Body
      // Corpo Procedura
      // 
      PAN_TIPIRICLASSI.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiRiclassificazione", "TipiRiclassificazioneAfterCommit", _e);
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
  private void PAN_TIPIRICLASSI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TIPIRICLASSI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPIRICLASSI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIRICLASSI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIRICLASSI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_TIPIRICLASSI);
    // Stub
  }

  private void PAN_TIPIRICLASSI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPIRICLASSI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIRICLASSI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIRICLASSI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBRNUOVPANN_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBRNUOVPANN_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBRNUOVPANN_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_LIBRNUOVPANN_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_LIBRNUOVPANN_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_LIBRNUOVPANN_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_LIBRNUOVPANN_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_LIBRNUOVPANN_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBRNUOVPANN_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBRNUOVPANN_MST_NUOVPAGIMAST)
    {
      BUK_LIBRNUOVPANN.set_SpanValue(BUK_LIBRNUOVPANN_SPAN_CPTSLNPTRPNT, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRNUOVPANN.GetPageNumber())))), (new IDVariant("/"))), IDL.ToString((new IDVariant(BUK_LIBRNUOVPANN.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBRNUOVPANN_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBRNUOVPANN_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBRNUOVPANN_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBRNUOVPANN_OnPreview()
  {
    PreviewBook = BKW_LIBRNUOVPANN;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPIRICLASSI_Init()
  {

    PAN_TIPIRICLASSI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIRICLASSI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPIRICLASSI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_TIPIRICLASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, "85EBEC17-38DB-4B85-881C-3806439FC55A");
    PAN_TIPIRICLASSI.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, "Codice");
    PAN_TIPIRICLASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, "");
    PAN_TIPIRICLASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIRICLASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_TIPIRICLASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, "77337EF3-2E88-47F5-8B30-FC82B04AF57A");
    PAN_TIPIRICLASSI.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, "Descrizione");
    PAN_TIPIRICLASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, "");
    PAN_TIPIRICLASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIRICLASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_TIPIRICLASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, "20A7840D-61B2-45CA-B3CD-064DFB858F99");
    PAN_TIPIRICLASSI.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, "Esercizio Scadenza");
    PAN_TIPIRICLASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, "");
    PAN_TIPIRICLASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIRICLASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIRICLASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, "DF8B8F00-0296-4562-9A41-0E3E047FE8E1");
    PAN_TIPIRICLASSI.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, "TIPO RICL ID");
    PAN_TIPIRICLASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, "");
    PAN_TIPIRICLASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TIPIRICLASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_TIPIRICLASSI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIRICLASSI.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIRICLASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_TIPIRICLASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIRICLASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPIRICLASSI.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIRICLASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, MyGlb.PANEL_FORM, 96);
    PAN_TIPIRICLASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIRICLASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPIRICLASSI.SetFieldPage(PFL_TIPIRICLASSI_CODICE, -1, -1);
    PAN_TIPIRICLASSI.SetFieldPanel(PFL_TIPIRICLASSI_CODICE, PPQRY_TIPIRICLASS1, "A.CODICE", "CODICE", 5, 10, 0, -13997);
    PAN_TIPIRICLASSI.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, MyGlb.PANEL_LIST, 72, 36, 424, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIRICLASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_TIPIRICLASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIRICLASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPIRICLASSI.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 496, 108, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIRICLASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_TIPIRICLASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, MyGlb.PANEL_FORM, 7);
    PAN_TIPIRICLASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPIRICLASSI.SetFieldPage(PFL_TIPIRICLASSI_DESCRIZIONE, -1, -1);
    PAN_TIPIRICLASSI.SetFieldPanel(PFL_TIPIRICLASSI_DESCRIZIONE, PPQRY_TIPIRICLASS1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_TIPIRICLASSI.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, MyGlb.PANEL_LIST, 496, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIRICLASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, MyGlb.PANEL_LIST, 128);
    PAN_TIPIRICLASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, MyGlb.PANEL_LIST, 1);
    PAN_TIPIRICLASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, MyGlb.PANEL_LIST, "Esercizio Scadenza");
    PAN_TIPIRICLASSI.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, MyGlb.PANEL_FORM, 320, 4, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIRICLASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, MyGlb.PANEL_FORM, 128);
    PAN_TIPIRICLASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, MyGlb.PANEL_FORM, 1);
    PAN_TIPIRICLASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_ESERCISCADEN, MyGlb.PANEL_FORM, "Esercizio Scadenza");
    PAN_TIPIRICLASSI.SetFieldPage(PFL_TIPIRICLASSI_ESERCISCADEN, -1, -1);
    PAN_TIPIRICLASSI.SetFieldPanel(PFL_TIPIRICLASSI_ESERCISCADEN, PPQRY_TIPIRICLASS1, "A.ESERCIZIO_SCADENZA", "ESERCIZIO_SCADENZA", 1, 4, 0, -13997);
    PAN_TIPIRICLASSI.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, MyGlb.PANEL_LIST, 568, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIRICLASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, MyGlb.PANEL_LIST, 80);
    PAN_TIPIRICLASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, MyGlb.PANEL_LIST, 1);
    PAN_TIPIRICLASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, MyGlb.PANEL_LIST, "TIPO RICL ID");
    PAN_TIPIRICLASSI.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIRICLASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, MyGlb.PANEL_FORM, 80);
    PAN_TIPIRICLASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, MyGlb.PANEL_FORM, 1);
    PAN_TIPIRICLASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIRICLASSI_TIPORICLID, MyGlb.PANEL_FORM, "TIPO RICL ID");
    PAN_TIPIRICLASSI.SetFieldPage(PFL_TIPIRICLASSI_TIPORICLID, -1, -1);
    PAN_TIPIRICLASSI.SetFieldPanel(PFL_TIPIRICLASSI_TIPORICLID, PPQRY_TIPIRICLASS1, "A.TIPO_RICL_ID", "TIPO_RICL_ID", 3, 10, 0, -13997);
  }

  private void PAN_TIPIRICLASSI_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIRICLASSI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPIRICLASSI.SetIMDB(IMDB, "PQRY_TIPIRICLASS1", true);
    PAN_TIPIRICLASSI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_RICL_ID as TIPO_RICL_ID, ");
    SQL.append("  A.ESERCIZIO_SCADENZA as ESERCIZIO_SCADENZA ");
    PAN_TIPIRICLASSI.SetQuery(PPQRY_TIPIRICLASS1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TIPI_RICLASSIFICAZIONE A ");
    PAN_TIPIRICLASSI.SetQuery(PPQRY_TIPIRICLASS1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.ESERCIZIO_SCADENZA IS NULL) OR A.ESERCIZIO_SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_TIPIRICLASSI.SetQuery(PPQRY_TIPIRICLASS1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIRICLASSI.SetQuery(PPQRY_TIPIRICLASS1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIRICLASSI.SetQuery(PPQRY_TIPIRICLASS1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPIRICLASSI.SetQuery(PPQRY_TIPIRICLASS1, 5, SQL, -1, "");
    PAN_TIPIRICLASSI.SetQueryDB(PPQRY_TIPIRICLASS1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIRICLASSI.SetMasterTable(0, "TIPI_RICLASSIFICAZIONE");
    PAN_TIPIRICLASSI.AddToSortList(PFL_TIPIRICLASSI_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIRICLASSI.Status() == 2)
    {
      int oldListQBE = PAN_TIPIRICLASSI.iUseListQBE;
      PAN_TIPIRICLASSI.iUseListQBE = 0;
      PAN_TIPIRICLASSI.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIRICLASSI.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIRICLASSI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBRNUOVPANN_MST_NUOVPAGIMAST_Init()
  {
    BUK_LIBRNUOVPANN.InitMastro(BUK_LIBRNUOVPANN_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 1, 1);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_MST_NUOVPAGIMAST, "411FF1B6-2CCA-4273-B275-8F98FC07DEFE");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_LIBRNUOVPANN.InitMastroBox(BUK_LIBRNUOVPANN_MST_NUOVPAGIMAST, BUK_LIBRNUOVPANN_RPTBOX_TESTATPAGINA, 1000, 1000, 19000, 2500, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_RPTBOX_TESTATPAGINA, "CAB763F3-B23E-4ED6-AAD6-AA54A860C787");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_LIBRNUOVPANN.InitMastroBox(BUK_LIBRNUOVPANN_MST_NUOVPAGIMAST, BUK_LIBRNUOVPANN_RPTBOX_CORPOPAGINA, 1000, 3600, 19000, 24500, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_RPTBOX_CORPOPAGINA, "CAA6C59B-DCB7-4243-8CEA-B27BBAF248D9");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_LIBRNUOVPANN.InitMastroBox(BUK_LIBRNUOVPANN_MST_NUOVPAGIMAST, BUK_LIBRNUOVPANN_RPTBOX_PIEDEPAGINA, 1000, 28300, 19000, 400, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_RPTBOX_PIEDEPAGINA, "8FFB8C54-4A4A-4B9F-B309-769CF8C45E8E");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_LIBRNUOVPANN.InitMastroBox(BUK_LIBRNUOVPANN_MST_NUOVPAGIMAST, BUK_LIBRNUOVPANN_RPTBOX_PAG, 17800, 1000, 2200, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_RPTBOX_PAG, "BCA7D8B6-B096-40DE-85E4-89F729DF1C83");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_RPTBOX_PAG, "PAG");
    BUK_LIBRNUOVPANN.InitBoxSpan(BUK_LIBRNUOVPANN_RPTBOX_PAG, BUK_LIBRNUOVPANN_SPAN_CPTSLNPTRPNT, MyGlb.VIS_DEFAREPOSTYL, 5, 204, 0, 271384705, "", "", 1);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SPAN_CPTSLNPTRPNT, "4201F57B-3F2C-4B79-9D7A-50ACF82B8010");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SPAN_CPTSLNPTRPNT, "CPTSLNPTRPNT");
  }

  private void BUK_LIBRNUOVPANN_RPT_NUOVOREPORT_InitQuery() { BUK_LIBRNUOVPANN_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_LIBRNUOVPANN_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as RECORDCODICE, ");
      SQL.append("  A.DESCRIZIONE as RECORDDESCRI, ");
      SQL.append("  A.ESERCIZIO_SCADENZA as RECTIPRIESSC, ");
      SQL.append("  A.TIPO_RICL_ID as RETIRITIRIID ");
      SQL.append("from ");
      SQL.append("  TIPI_RICLASSIFICAZIONE A ");
      BUK_LIBRNUOVPANN.SetReportQuery(BUK_LIBRNUOVPANN_RPT_NUOVOREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "EBAA630C-B533-45E5-B688-24CFB513C860");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBRNUOVPANN_RPT_NUOVOREPORT_Init()
  {
    BUK_LIBRNUOVPANN.InitReport(BUK_LIBRNUOVPANN_RPT_NUOVOREPORT, 196609);
    BUK_LIBRNUOVPANN_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_RPT_NUOVOREPORT, "2A10DE85-540D-4EFB-A772-9D2A9B6089AD");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_LIBRNUOVPANN.InitSection(BUK_LIBRNUOVPANN_RPT_NUOVOREPORT, BUK_LIBRNUOVPANN_SEC_INTESTREPORT, 100, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_LIBRNUOVPANN.SetSectionRendersInto(BUK_LIBRNUOVPANN_SEC_INTESTREPORT, BUK_LIBRNUOVPANN_RPTBOX_CORPOPAGINA);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SEC_INTESTREPORT, "2B9408C1-6AF5-414F-8BF9-EDF9055A620F");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_LIBRNUOVPANN.InitSection(BUK_LIBRNUOVPANN_RPT_NUOVOREPORT, BUK_LIBRNUOVPANN_SEC_INTESTPAGINA, 2500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRNUOVPANN.SetSectionRendersInto(BUK_LIBRNUOVPANN_SEC_INTESTPAGINA, BUK_LIBRNUOVPANN_RPTBOX_TESTATPAGINA);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SEC_INTESTPAGINA, "30EC6677-62BB-4CAF-896C-78755DB2FB23");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_LIBRNUOVPANN.InitReportBox(BUK_LIBRNUOVPANN_SEC_INTESTPAGINA, BUK_LIBRNUOVPANN_RPTBOX_INT1, 0, 900, 19000, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_RPTBOX_INT1, "436CC61E-7B76-46A4-B610-9F0CB0916D60");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_RPTBOX_INT1, "INT1");
    BUK_LIBRNUOVPANN.InitBoxSpan(BUK_LIBRNUOVPANN_RPTBOX_INT1, BUK_LIBRNUOVPANN_SPAN_TIPORICLASSI, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Tipo Riclassificazione", 1);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SPAN_TIPORICLASSI, "EC02BCC6-2287-40F7-AD5A-1F89F24D725D");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SPAN_TIPORICLASSI, "TIPORICLASSI");
    BUK_LIBRNUOVPANN.InitReportBox(BUK_LIBRNUOVPANN_SEC_INTESTPAGINA, BUK_LIBRNUOVPANN_RPTBOX_CODICEHEADER, 100, 2200, 2300, 300, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_RPTBOX_CODICEHEADER, "6490BF84-011D-4FFD-AAEA-8709D1124C86");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_LIBRNUOVPANN.InitBoxSpan(BUK_LIBRNUOVPANN_RPTBOX_CODICEHEADER, BUK_LIBRNUOVPANN_SPAN_CODICE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SPAN_CODICE1, "C068ABF4-E893-4A71-A7A4-ACCC89437AE3");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SPAN_CODICE1, "CODICE1");
    BUK_LIBRNUOVPANN.InitReportBox(BUK_LIBRNUOVPANN_SEC_INTESTPAGINA, BUK_LIBRNUOVPANN_RPTBOX_DESCRIHEADER, 2600, 2200, 2100, 300, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_RPTBOX_DESCRIHEADER, "4F1F63DE-1651-4224-A44C-57D4A693153A");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIBRNUOVPANN.InitBoxSpan(BUK_LIBRNUOVPANN_RPTBOX_DESCRIHEADER, BUK_LIBRNUOVPANN_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SPAN_DESCRIZIONE1, "F4C200DA-4232-4551-9314-485F43B44E4A");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_LIBRNUOVPANN.InitReportBox(BUK_LIBRNUOVPANN_SEC_INTESTPAGINA, BUK_LIBRNUOVPANN_RPTBOX_ESERSCADHEAD, 16100, 2200, 2900, 300, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_RPTBOX_ESERSCADHEAD, "7A7A913B-710A-4573-A143-FBEFA97E54ED");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_RPTBOX_ESERSCADHEAD, "ESERSCADHEAD");
    BUK_LIBRNUOVPANN.InitBoxSpan(BUK_LIBRNUOVPANN_RPTBOX_ESERSCADHEAD, BUK_LIBRNUOVPANN_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Esercizio Scadenza", 1);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SPAN_C, "A4AD4A4C-EB0F-4ADA-ACA8-7AB6421D3F6E");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SPAN_C, "C");
    BUK_LIBRNUOVPANN.InitSection(BUK_LIBRNUOVPANN_RPT_NUOVOREPORT, BUK_LIBRNUOVPANN_SEC_DETTAGLIO, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRNUOVPANN.SetSectionRendersInto(BUK_LIBRNUOVPANN_SEC_DETTAGLIO, BUK_LIBRNUOVPANN_RPTBOX_CORPOPAGINA);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SEC_DETTAGLIO, "727AFA6E-0027-4EF9-915E-F94DD330778A");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_LIBRNUOVPANN.InitReportBox(BUK_LIBRNUOVPANN_SEC_DETTAGLIO, BUK_LIBRNUOVPANN_RPTBOX_CODICE, 100, 0, 2266, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_RPTBOX_CODICE, "ABD46828-76C9-46E9-B413-917B06C0BE99");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_RPTBOX_CODICE, "CODICE");
    BUK_LIBRNUOVPANN.InitBoxSpan(BUK_LIBRNUOVPANN_RPTBOX_CODICE, BUK_LIBRNUOVPANN_SPAN_CODICE, MyGlb.VIS_DEFAREPOSTYL, 5, 10, 0, 271384705, "", "::RECORDCODICE", 1);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SPAN_CODICE, "9CEE1A4E-6CFB-4359-8297-D022E2401011");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SPAN_CODICE, "CODICE");
    BUK_LIBRNUOVPANN.InitReportBox(BUK_LIBRNUOVPANN_SEC_DETTAGLIO, BUK_LIBRNUOVPANN_RPTBOX_DESCRIZIONE, 2600, 0, 13300, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_RPTBOX_DESCRIZIONE, "430C873F-CD73-4157-94CB-5E270B81EEF4");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBRNUOVPANN.InitBoxSpan(BUK_LIBRNUOVPANN_RPTBOX_DESCRIZIONE, BUK_LIBRNUOVPANN_SPAN_DESCRIZIONE, MyGlb.VIS_DEFAREPOSTYL, 5, 100, 0, 271384705, "", "::RECORDDESCRI", 1);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SPAN_DESCRIZIONE, "A6A3BB47-BCE7-4905-B621-02F327D3C1E7");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBRNUOVPANN.InitReportBox(BUK_LIBRNUOVPANN_SEC_DETTAGLIO, BUK_LIBRNUOVPANN_RPTBOX_ESERCISCADEN, 16100, 0, 2900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_RPTBOX_ESERCISCADEN, "DA14AC16-BCEA-42B4-8F1F-2E85D4AAF60B");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_RPTBOX_ESERCISCADEN, "ESERCISCADEN");
    BUK_LIBRNUOVPANN.InitBoxSpan(BUK_LIBRNUOVPANN_RPTBOX_ESERCISCADEN, BUK_LIBRNUOVPANN_SPAN_TIPRICESESCA, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "", "::RECTIPRIESSC", 1);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SPAN_TIPRICESESCA, "02F03657-A8C7-4C5D-889F-889EA66601D0");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SPAN_TIPRICESESCA, "TIPRICESESCA");
    BUK_LIBRNUOVPANN.InitSection(BUK_LIBRNUOVPANN_RPT_NUOVOREPORT, BUK_LIBRNUOVPANN_SEC_PIEDEPAGINA, 100, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_LIBRNUOVPANN.SetSectionRendersInto(BUK_LIBRNUOVPANN_SEC_PIEDEPAGINA, BUK_LIBRNUOVPANN_RPTBOX_PIEDEPAGINA);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SEC_PIEDEPAGINA, "10A5401C-A568-49AC-810B-60532784A291");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_LIBRNUOVPANN.InitSection(BUK_LIBRNUOVPANN_RPT_NUOVOREPORT, BUK_LIBRNUOVPANN_SEC_PIEDEREPORT, 100, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_LIBRNUOVPANN.SetSectionRendersInto(BUK_LIBRNUOVPANN_SEC_PIEDEREPORT, BUK_LIBRNUOVPANN_RPTBOX_CORPOPAGINA);
    BUK_LIBRNUOVPANN.SetRTCGuid(BUK_LIBRNUOVPANN_SEC_PIEDEREPORT, "6F64816E-E484-449F-9BC9-30BFB2F61965");
    BUK_LIBRNUOVPANN.SetObjCode(BUK_LIBRNUOVPANN_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_LIBRNUOVPANN_RPT_NUOVOREPORT_InitQuery(false, true);
  }

  private void BUK_LIBRNUOVPANN_InitLinks()
  {
    BUK_LIBRNUOVPANN.SetBoxNextBox(BUK_LIBRNUOVPANN_RPTBOX_CORPOPAGINA, BUK_LIBRNUOVPANN_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPIRICLASSI) PAN_TIPIRICLASSI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIRICLASSI) PAN_TIPIRICLASSI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPIRICLASSI) PAN_TIPIRICLASSI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIRICLASSI) PAN_TIPIRICLASSI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPIRICLASSI) PAN_TIPIRICLASSI_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_TIPIRICLASSI) PAN_TIPIRICLASSI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBRNUOVPANN) BUK_LIBRNUOVPANN_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBRNUOVPANN) BUK_LIBRNUOVPANN_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBRNUOVPANN) BUK_LIBRNUOVPANN_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBRNUOVPANN) BUK_LIBRNUOVPANN_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBRNUOVPANN) BUK_LIBRNUOVPANN_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBRNUOVPANN) BUK_LIBRNUOVPANN_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBRNUOVPANN) BUK_LIBRNUOVPANN_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBRNUOVPANN) BUK_LIBRNUOVPANN_OnPreview();
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
