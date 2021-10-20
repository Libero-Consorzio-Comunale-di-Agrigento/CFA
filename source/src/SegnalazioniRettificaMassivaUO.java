// **********************************************
// Segnalazioni Rettifica Massiva UO
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SegnalazioniRettificaMassivaUO extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_WRKLOG_TESTOERRORE = 0;
  private static int PFL_WRKLOG_ETICHETTAOK = 1;
  private static int PFL_WRKLOG_STAMPA = 2;

  private static int PPQRY_WRKLOG1 = 0;


  IDPanel PAN_WRKLOG;
  CIDREObj BUK_NUOVOLIBRO;
  OBook BKW_NUOVOLIBRO;
  //
  // Template Pages constants
  private static int BUK_NUOVOLIBRO_MST_NUOVPAGIMAST = 1;
  private static int BUK_NUOVOLIBRO_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA = 3;
  private static int BUK_NUOVOLIBRO_RPTBOX_PIEDEPAGINA = 4;

  //
  // Reports constants
  private static int BUK_NUOVOLIBRO_RPT_NUOVOREPORT = 5;
  private static int BUK_NUOVOLIBRO_SEC_INTESTPAGINA = 6;
  private static int BUK_NUOVOLIBRO_RPTBOX_TITOLO = 7;
  private static int BUK_NUOVOLIBRO_SPAN_NUOVASPAN = 8;
  private static int BUK_NUOVOLIBRO_SEC_DETTAGLIO = 9;
  private static int BUK_NUOVOLIBRO_RPTBOX_TESTOERRORE = 10;
  private static int BUK_NUOVOLIBRO_SPAN_REWLTESRMUNL = 11;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_WRKLOG1(IMDB);
    Init_PQRY_WRKLOG3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_WRKLOG1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_WRKLOG1, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_WRKLOG1, "PQRY_WRKLOG1");
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKLOG1,IMDBDef11.PQSL_WRKLOG1_WRKLOGTESERR, "WRKLOGTESERR");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKLOG1,IMDBDef11.PQSL_WRKLOG1_WRKLOGTESERR,5,4000,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_WRKLOG1, 0);
  }

  private static void Init_PQRY_WRKLOG3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_WRKLOG3, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_WRKLOG3, "PQRY_WRKLOG3");
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKLOG3,IMDBDef11.PQSL_WRKLOG3_RECOWRKLOGID, "RECOWRKLOGID");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKLOG3,IMDBDef11.PQSL_WRKLOG3_RECOWRKLOGID,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKLOG3,IMDBDef11.PQSL_WRKLOG3_RECWRKLOTEER, "RECWRKLOTEER");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKLOG3,IMDBDef11.PQSL_WRKLOG3_RECWRKLOTEER,5,4000,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_WRKLOG3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SegnalazioniRettificaMassivaUO(MyWebEntryPoint w, IMDBObj imdb)
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
  public SegnalazioniRettificaMassivaUO()
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
    FormIdx = MyGlb.FRM_SEGNRETMASUO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8B8E4A89-42C5-4F31-BBD5-15D4D04BF2A7";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 950;
    DesignHeight = 466;
    set_Caption(new IDVariant("Segnalazioni Rettifica Massiva UO"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 950;
    Frames[1].Height = 440;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "WRK LOG";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 440;
    PAN_WRKLOG = new IDPanel(w, this, 1, "PAN_WRKLOG");
    Frames[1].Content = PAN_WRKLOG;
    PAN_WRKLOG.ShowRowSelector = false;
    PAN_WRKLOG.ShowToolbar = false;
    PAN_WRKLOG.ShowStatusbar = false;
    PAN_WRKLOG.Lockable = false;
    PAN_WRKLOG.iLocked = false;
    PAN_WRKLOG.VS = MainFrm.VisualStyleList;
    PAN_WRKLOG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 950-MyGlb.PAN_OFFS_X, 440-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_WRKLOG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C24392AF-4045-43A0-B882-4CEE43079F92");
    PAN_WRKLOG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 12, 8, 900, 356, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_WRKLOG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_NOFINOBOVEHE);
    PAN_WRKLOG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 20);
    PAN_WRKLOG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE, -1);
    PAN_WRKLOG.InitStatus = 2;
    PAN_WRKLOG_Init();
    PAN_WRKLOG_InitFields();
    PAN_WRKLOG_InitQueries();
    BKW_NUOVOLIBRO = new OBook(this);
    BUK_NUOVOLIBRO = new CIDREObj(BKW_NUOVOLIBRO);
    BKW_NUOVOLIBRO.iGuid = "9ED097CA-E529-43C0-B29D-E1F196C22710";
    BKW_NUOVOLIBRO.Code = "BUK_NUOVOLIBRO";
    BKW_NUOVOLIBRO.BookObj = BUK_NUOVOLIBRO;
    BKW_NUOVOLIBRO.InitDefMasks();
    BUK_NUOVOLIBRO.InitBook(1, 196609, "Nuovo Libro", IMDB, MainFrm.VisualStyleList);
    BUK_NUOVOLIBRO.InitHTML();
    BUK_NUOVOLIBRO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_NUOVOLIBRO.Book.SetMainFrm(MainFrm);
    BUK_NUOVOLIBRO.SetRTCGuid(0, "9ED097CA-E529-43C0-B29D-E1F196C22710");
    BUK_NUOVOLIBRO.SetObjCode(0, "NUOVOLIBRO");
    BUK_NUOVOLIBRO_MST_NUOVPAGIMAST_Init();
    BUK_NUOVOLIBRO_RPT_NUOVOREPORT_Init();
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
      PAN_WRKLOG.UpdatePanel(MainFrm);
      // BUK_NUOVOLIBRO.UpdateBook();
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
    return (obj instanceof SegnalazioniRettificaMassivaUO);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SegnalazioniRettificaMassivaUO.class.getName() : (Glb.ClassWithPackage(SegnalazioniRettificaMassivaUO.class) ? SegnalazioniRettificaMassivaUO.class.getName().substring(SegnalazioniRettificaMassivaUO.class.getPackage().getName().length() + 1) : SegnalazioniRettificaMassivaUO.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Etichetta OK
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaOK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta OK Body
      // Corpo Procedura
      // 
      SQL = new StringBuffer();
      SQL.append("delete from WRK_LOG ");
      SQL.append("where (DOC_ELABORATO = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SegnalazioniRettificaMassivaUO", "EtichettaOK", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Corpo Procedura
      // 
      BUK_NUOVOLIBRO.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_NUOVOLIBRO.RefreshQuery();
      BUK_NUOVOLIBRO.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_NUOVOLIBRO.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SegnalazioniRettificaMassivaUO", "Stampa", _e);
      return -1;
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
  private void PAN_WRKLOG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_WRKLOG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_WRKLOG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_WRKLOG, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_WRKLOG_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_WRKLOG);
    // Stub
  }

  private void PAN_WRKLOG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_WRKLOG_ETICHETTAOK)
    {
      this.IdxPanelActived = this.PAN_WRKLOG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaOK();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_WRKLOG_STAMPA)
    {
      this.IdxPanelActived = this.PAN_WRKLOG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Stampa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_WRKLOG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_WRKLOG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_WRKLOG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_NUOVOLIBRO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_NUOVOLIBRO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_NUOVOLIBRO_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_NUOVOLIBRO_SEC_DETTAGLIO)
    {
    }
  }

  private void BUK_NUOVOLIBRO_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_NUOVOLIBRO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_NUOVOLIBRO_MST_NUOVPAGIMAST)
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
    PreviewBook = BKW_NUOVOLIBRO;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_WRKLOG_Init()
  {

    PAN_WRKLOG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_WRKLOG.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_WRKLOG.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_WRKLOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, "4E46937D-AAD1-4FD8-80FF-CF5DA6B5E6D7");
    PAN_WRKLOG.set_Header(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, "Elenco modifiche effettuate");
    PAN_WRKLOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, "");
    PAN_WRKLOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, MyGlb.VIS_NOFINOBOVEHE);
    PAN_WRKLOG.SetFlags(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_WRKLOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WRKLOG_ETICHETTAOK, "5E314EE8-5737-4A1F-89E5-5C15FDB25658");
    PAN_WRKLOG.set_Header(MyGlb.OBJ_FIELD, PFL_WRKLOG_ETICHETTAOK, "OK");
    PAN_WRKLOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WRKLOG_ETICHETTAOK, MyGlb.VIS_STATICBUTTON);
    PAN_WRKLOG.SetImage(MyGlb.OBJ_FIELD, PFL_WRKLOG_ETICHETTAOK, 0, "button1.gif", false);
    PAN_WRKLOG.SetFlags(MyGlb.OBJ_FIELD, PFL_WRKLOG_ETICHETTAOK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_WRKLOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WRKLOG_STAMPA, "744F373C-3FC5-4A8D-89CD-5271640E579B");
    PAN_WRKLOG.set_Header(MyGlb.OBJ_FIELD, PFL_WRKLOG_STAMPA, "Stampa");
    PAN_WRKLOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WRKLOG_STAMPA, MyGlb.VIS_STATICBUTTON);
    PAN_WRKLOG.SetImage(MyGlb.OBJ_FIELD, PFL_WRKLOG_STAMPA, 0, "button1.gif", false);
    PAN_WRKLOG.SetFlags(MyGlb.OBJ_FIELD, PFL_WRKLOG_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_WRKLOG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_WRKLOG.SetRect(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, MyGlb.PANEL_LIST, 12, 32, 900, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_WRKLOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, MyGlb.PANEL_LIST, 128);
    PAN_WRKLOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, MyGlb.PANEL_LIST, 1);
    PAN_WRKLOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, MyGlb.PANEL_LIST, "Elenco modifiche effettuate");
    PAN_WRKLOG.SetRect(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, MyGlb.PANEL_FORM, 136, 124, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WRKLOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, MyGlb.PANEL_FORM, 128);
    PAN_WRKLOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, MyGlb.PANEL_FORM, 2);
    PAN_WRKLOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WRKLOG_TESTOERRORE, MyGlb.PANEL_FORM, "Elenco modifiche effettuate");
    PAN_WRKLOG.SetFieldPage(PFL_WRKLOG_TESTOERRORE, -1, -1);
    PAN_WRKLOG.SetFieldPanel(PFL_WRKLOG_TESTOERRORE, PPQRY_WRKLOG1, "A.TESTO_ERRORE", "WRKLOGTESERR", 5, 4000, 0, -13997);
    PAN_WRKLOG.SetRect(MyGlb.OBJ_FIELD, PFL_WRKLOG_ETICHETTAOK, MyGlb.PANEL_LIST, 832, 388, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_WRKLOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WRKLOG_ETICHETTAOK, MyGlb.PANEL_LIST, 0);
    PAN_WRKLOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_WRKLOG_ETICHETTAOK, MyGlb.PANEL_LIST, 1);
    PAN_WRKLOG.SetRect(MyGlb.OBJ_FIELD, PFL_WRKLOG_ETICHETTAOK, MyGlb.PANEL_FORM, 448, 392, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WRKLOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WRKLOG_ETICHETTAOK, MyGlb.PANEL_FORM, 0);
    PAN_WRKLOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_WRKLOG_ETICHETTAOK, MyGlb.PANEL_FORM, 1);
    PAN_WRKLOG.SetFieldPage(PFL_WRKLOG_ETICHETTAOK, -1, -1);
    PAN_WRKLOG.SetFieldPanel(PFL_WRKLOG_ETICHETTAOK, -1, "", "ETICHETTAOK", 0, 0, 0, -13997);
    PAN_WRKLOG.SetRect(MyGlb.OBJ_FIELD, PFL_WRKLOG_STAMPA, MyGlb.PANEL_LIST, 740, 388, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_WRKLOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WRKLOG_STAMPA, MyGlb.PANEL_LIST, 0);
    PAN_WRKLOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_WRKLOG_STAMPA, MyGlb.PANEL_LIST, 1);
    PAN_WRKLOG.SetRect(MyGlb.OBJ_FIELD, PFL_WRKLOG_STAMPA, MyGlb.PANEL_FORM, 456, 400, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WRKLOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WRKLOG_STAMPA, MyGlb.PANEL_FORM, 0);
    PAN_WRKLOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_WRKLOG_STAMPA, MyGlb.PANEL_FORM, 1);
    PAN_WRKLOG.SetFieldPage(PFL_WRKLOG_STAMPA, -1, -1);
    PAN_WRKLOG.SetFieldPanel(PFL_WRKLOG_STAMPA, -1, "", "STAMPA", 0, 0, 0, -13997);
  }

  private void PAN_WRKLOG_InitQueries()
  {
    StringBuffer SQL;

    PAN_WRKLOG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_WRKLOG.SetIMDB(IMDB, "PQRY_WRKLOG1", true);
    PAN_WRKLOG.set_SetString(MyGlb.MASTER_ROWNAME, "WRK LOG");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.TESTO_ERRORE as WRKLOGTESERR ");
    PAN_WRKLOG.SetQuery(PPQRY_WRKLOG1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_LOG A ");
    PAN_WRKLOG.SetQuery(PPQRY_WRKLOG1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.DOC_ELABORATO = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
    PAN_WRKLOG.SetQuery(PPQRY_WRKLOG1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WRKLOG.SetQuery(PPQRY_WRKLOG1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WRKLOG.SetQuery(PPQRY_WRKLOG1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WRKLOG.SetQuery(PPQRY_WRKLOG1, 5, SQL, -1, "");
    PAN_WRKLOG.SetQueryDB(PPQRY_WRKLOG1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_WRKLOG.SetMasterTable(0, "WRK_LOG");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_WRKLOG.Status() == 2)
    {
      int oldListQBE = PAN_WRKLOG.iUseListQBE;
      PAN_WRKLOG.iUseListQBE = 0;
      PAN_WRKLOG.PanelCommand(Glb.PCM_SEARCH);
      PAN_WRKLOG.PanelCommand(Glb.PCM_FIND);
      PAN_WRKLOG.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_NUOVOLIBRO_MST_NUOVPAGIMAST_Init()
  {
    BUK_NUOVOLIBRO.InitMastro(BUK_NUOVOLIBRO_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 1, 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_MST_NUOVPAGIMAST, "7E6729E6-76C3-49E0-9AEB-34C1FC733DB4");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_NUOVOLIBRO.InitMastroBox(BUK_NUOVOLIBRO_MST_NUOVPAGIMAST, BUK_NUOVOLIBRO_RPTBOX_TESTATPAGINA, 1000, 1000, 19000, 1000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_TESTATPAGINA, "D4509DB5-8C57-4118-AD20-862312ADA334");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_NUOVOLIBRO.InitMastroBox(BUK_NUOVOLIBRO_MST_NUOVPAGIMAST, BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA, 1000, 2400, 19000, 21700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA, "2D84CFA2-DA56-4773-A099-223B64D8C502");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_NUOVOLIBRO.InitMastroBox(BUK_NUOVOLIBRO_MST_NUOVPAGIMAST, BUK_NUOVOLIBRO_RPTBOX_PIEDEPAGINA, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_PIEDEPAGINA, "A44AF375-9FB7-4812-AAB1-91F96672A252");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
  }

  private void BUK_NUOVOLIBRO_RPT_NUOVOREPORT_InitQuery() { BUK_NUOVOLIBRO_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_NUOVOLIBRO_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ID as RECOWRKLOGID, ");
      SQL.append("  A.TESTO_ERRORE as RECWRKLOTEER ");
      SQL.append("from ");
      SQL.append("  WRK_LOG A ");
      SQL.append("where (A.DOC_ELABORATO = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      SQL.append("order by ");
      SQL.append("  A.ID ");
      BUK_NUOVOLIBRO.SetReportQuery(BUK_NUOVOLIBRO_RPT_NUOVOREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "F368EA8F-7DE8-40B7-B92F-556A794AF856");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_NUOVOLIBRO_RPT_NUOVOREPORT_Init()
  {
    BUK_NUOVOLIBRO.InitReport(BUK_NUOVOLIBRO_RPT_NUOVOREPORT, 131073);
    BUK_NUOVOLIBRO_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPT_NUOVOREPORT, "09A6FFA6-77A8-4CB0-93C8-FAF69ECD61F8");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_NUOVOLIBRO.InitSection(BUK_NUOVOLIBRO_RPT_NUOVOREPORT, BUK_NUOVOLIBRO_SEC_INTESTPAGINA, 1000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NUOVOLIBRO.SetSectionRendersInto(BUK_NUOVOLIBRO_SEC_INTESTPAGINA, BUK_NUOVOLIBRO_RPTBOX_TESTATPAGINA);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SEC_INTESTPAGINA, "5E130A8D-2117-4957-8109-CFCE9295205A");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_NUOVOLIBRO.InitReportBox(BUK_NUOVOLIBRO_SEC_INTESTPAGINA, BUK_NUOVOLIBRO_RPTBOX_TITOLO, 0, 0, 19000, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_TITOLO, "AE6627AF-89CF-4A59-A0E0-EC8067F44747");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_TITOLO, "TITOLO");
    BUK_NUOVOLIBRO.set_BoxAlignment(BUK_NUOVOLIBRO_RPTBOX_TITOLO, 3);
    BUK_NUOVOLIBRO.set_BoxFontModifiers(BUK_NUOVOLIBRO_RPTBOX_TITOLO, "B");
    BUK_NUOVOLIBRO.InitBoxSpan(BUK_NUOVOLIBRO_RPTBOX_TITOLO, BUK_NUOVOLIBRO_SPAN_NUOVASPAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Segnalazioni Rettifica Unità Organizzativa", 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SPAN_NUOVASPAN, "4D5724A5-C41A-43A3-B9E0-D20A6B896CE8");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_NUOVOLIBRO.InitSection(BUK_NUOVOLIBRO_RPT_NUOVOREPORT, BUK_NUOVOLIBRO_SEC_DETTAGLIO, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_NUOVOLIBRO.SetSectionRendersInto(BUK_NUOVOLIBRO_SEC_DETTAGLIO, BUK_NUOVOLIBRO_RPTBOX_CORPOPAGINA);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SEC_DETTAGLIO, "A21E2032-E915-40E9-9046-A84EC752226E");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_NUOVOLIBRO.InitReportBox(BUK_NUOVOLIBRO_SEC_DETTAGLIO, BUK_NUOVOLIBRO_RPTBOX_TESTOERRORE, 0, 0, 18800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_RPTBOX_TESTOERRORE, "C1B131F7-D99B-4D8B-8445-238C8FEBF2D9");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_RPTBOX_TESTOERRORE, "TESTOERRORE");
    BUK_NUOVOLIBRO.InitBoxSpan(BUK_NUOVOLIBRO_RPTBOX_TESTOERRORE, BUK_NUOVOLIBRO_SPAN_REWLTESRMUNL, MyGlb.VIS_DEFAREPOSTYL, 5, 4000, 0, 271384705, "", "::RECWRKLOTEER", 1);
    BUK_NUOVOLIBRO.SetRTCGuid(BUK_NUOVOLIBRO_SPAN_REWLTESRMUNL, "135BCE1F-2F10-4A4C-854B-D8F82157D8C9");
    BUK_NUOVOLIBRO.SetObjCode(BUK_NUOVOLIBRO_SPAN_REWLTESRMUNL, "REWLTESRMUNL");
    BUK_NUOVOLIBRO_RPT_NUOVOREPORT_InitQuery(false, true);
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
    if (SrcObj == PAN_WRKLOG) PAN_WRKLOG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_WRKLOG) PAN_WRKLOG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_WRKLOG) PAN_WRKLOG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_WRKLOG) PAN_WRKLOG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_WRKLOG) PAN_WRKLOG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
