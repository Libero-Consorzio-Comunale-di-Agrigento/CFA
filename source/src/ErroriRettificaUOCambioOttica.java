// **********************************************
// Errori Rettifica UO Cambio Ottica
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ErroriRettificaUOCambioOttica extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ERRORI_TESTOERRORE = 0;

  private static int PPQRY_WRKLOG4 = 0;


  IDPanel PAN_ERRORI;
  CIDREObj BUK_LIBROSEGNALA;
  OBook BKW_LIBROSEGNALA;
  //
  // Template Pages constants
  private static int BUK_LIBROSEGNALA_MST_NUOVPAGIMAST = 1;
  private static int BUK_LIBROSEGNALA_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_LIBROSEGNALA_RPTBOX_CORPOPAGINA = 3;
  private static int BUK_LIBROSEGNALA_RPTBOX_PIEDEPAGINA = 4;

  //
  // Reports constants
  private static int BUK_LIBROSEGNALA_RPT_NUOVOREPORT = 5;
  private static int BUK_LIBROSEGNALA_SEC_INTESTPAGINA = 6;
  private static int BUK_LIBROSEGNALA_RPTBOX_TITOLO = 7;
  private static int BUK_LIBROSEGNALA_SPAN_NUOVASPAN = 8;
  private static int BUK_LIBROSEGNALA_SEC_DETTAGLIO = 9;
  private static int BUK_LIBROSEGNALA_RPTBOX_TESTOERRORE = 10;
  private static int BUK_LIBROSEGNALA_SPAN_REWEEERUCOLS = 11;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_WRKLOG4(IMDB);
    Init_PQRY_WRKERRORI7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_WRKLOG4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_WRKLOG4, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_WRKLOG4, "PQRY_WRKLOG4");
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKLOG4,IMDBDef11.PQSL_WRKLOG4_WRKLOGWRERER, "WRKLOGWRERER");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKLOG4,IMDBDef11.PQSL_WRKLOG4_WRKLOGWRERER,5,300,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_WRKLOG4, 0);
  }

  private static void Init_PQRY_WRKERRORI7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_WRKERRORI7, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_WRKERRORI7, "PQRY_WRKERRORI7");
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKERRORI7,IMDBDef11.PQSL_WRKERRORI7_RECWRKERRERR, "RECWRKERRERR");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKERRORI7,IMDBDef11.PQSL_WRKERRORI7_RECWRKERRERR,5,300,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_WRKERRORI7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ErroriRettificaUOCambioOttica(MyWebEntryPoint w, IMDBObj imdb)
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
  public ErroriRettificaUOCambioOttica()
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
    FormIdx = MyGlb.FRM_ERRRETUOCAOT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "AEADCEB5-9A85-403B-9804-00A3C43D62B0";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 948;
    DesignHeight = 474;
    set_Caption(new IDVariant("Errori Rettifica UO Cambio Ottica"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 948;
    Frames[1].Height = 448;
    Frames[1].Caption = "Errori";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 448;
    PAN_ERRORI = new IDPanel(w, this, 1, "PAN_ERRORI");
    Frames[1].Content = PAN_ERRORI;
    PAN_ERRORI.ShowRowSelector = false;
    PAN_ERRORI.ShowStatusbar = false;
    PAN_ERRORI.Lockable = false;
    PAN_ERRORI.iLocked = false;
    PAN_ERRORI.VS = MainFrm.VisualStyleList;
    PAN_ERRORI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 948-MyGlb.PAN_OFFS_X, 448-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBROSEGNALA != null)
      PAN_ERRORI.SetBook(BUK_LIBROSEGNALA);
    PAN_ERRORI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "56880760-E97E-4844-A56F-82EF970B8CCB");
    PAN_ERRORI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 12, 8, 900, 344, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ERRORI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ERRORI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 20);
    PAN_ERRORI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE, -1);
    PAN_ERRORI.InitStatus = 2;
    PAN_ERRORI_Init();
    PAN_ERRORI_InitFields();
    PAN_ERRORI_InitQueries();
    BKW_LIBROSEGNALA = new OBook(this);
    BUK_LIBROSEGNALA = new CIDREObj(BKW_LIBROSEGNALA);
    BKW_LIBROSEGNALA.iGuid = "B3ACD0A8-026E-40DA-8174-5A12FC60CA4E";
    BKW_LIBROSEGNALA.Code = "BUK_LIBROSEGNALA";
    BKW_LIBROSEGNALA.BookObj = BUK_LIBROSEGNALA;
    BKW_LIBROSEGNALA.InitDefMasks();
    BUK_LIBROSEGNALA.InitBook(1, 196609, "Libro Segnalazioni", IMDB, MainFrm.VisualStyleList);
    BUK_LIBROSEGNALA.InitHTML();
    BUK_LIBROSEGNALA.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBROSEGNALA.Book.SetMainFrm(MainFrm);
    BUK_LIBROSEGNALA.SetRTCGuid(0, "B3ACD0A8-026E-40DA-8174-5A12FC60CA4E");
    BUK_LIBROSEGNALA.SetObjCode(0, "LIBROSEGNALA");
    if (PAN_ERRORI != null)
      PAN_ERRORI.SetBook(BUK_LIBROSEGNALA);
    BUK_LIBROSEGNALA_MST_NUOVPAGIMAST_Init();
    BUK_LIBROSEGNALA_RPT_NUOVOREPORT_Init();
    BUK_LIBROSEGNALA_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG185+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_POPUFUNZAGG1+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG185+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_LOG+BaseCmdLinIdx)
      {
        Log();
        break fine;
      }
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
      PAN_ERRORI.UpdatePanel(MainFrm);
      // BUK_LIBROSEGNALA.UpdateBook();
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
    if (Code.equals("BUK_LIBROSEGNALA")) return BUK_LIBROSEGNALA;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ErroriRettificaUOCambioOttica);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ErroriRettificaUOCambioOttica.class.getName() : (Glb.ClassWithPackage(ErroriRettificaUOCambioOttica.class) ? ErroriRettificaUOCambioOttica.class.getName().substring(ErroriRettificaUOCambioOttica.class.getPackage().getName().length() + 1) : ErroriRettificaUOCambioOttica.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Errori On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ERRORI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ERRORI);
      // 
      // Errori On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ERRORI.set_ToolTip(Glb.OBJ_FIELD,PFL_ERRORI_TESTOERRORE,(new IDVariant(PAN_ERRORI.FieldText(PFL_ERRORI_TESTOERRORE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ErroriRettificaUOCambioOttica", "ErroriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Log
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Log ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Log Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_LOGRETUOCAOT, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ErroriRettificaUOCambioOttica", "Log", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unload Body
      // Corpo Procedura
      // 
      SQL = new StringBuffer();
      SQL.append("delete from WRK_ERRORI ");
      SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      SQL.append("and   (FASE = 'CAMBIO_OTTICA') ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ErroriRettificaUOCambioOttica", "Unload", _e);
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
  private void PAN_ERRORI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ERRORI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ERRORI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ERRORI, Cancel);
    // Stub
  }

  private void PAN_ERRORI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ERRORI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ERRORI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ERRORI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBROSEGNALA_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBROSEGNALA_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBROSEGNALA_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_LIBROSEGNALA_SEC_DETTAGLIO)
    {
    }
  }

  private void BUK_LIBROSEGNALA_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBROSEGNALA_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBROSEGNALA_MST_NUOVPAGIMAST)
    {
    }
  }

  private void BUK_LIBROSEGNALA_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBROSEGNALA_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBROSEGNALA_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBROSEGNALA_OnPreview()
  {
    PreviewBook = BKW_LIBROSEGNALA;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ERRORI_Init()
  {

    PAN_ERRORI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ERRORI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ERRORI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_ERRORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, "44A00A2B-C80D-45FF-AF4A-DC76E235A75E");
    PAN_ERRORI.set_Header(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, "Errore");
    PAN_ERRORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, "");
    PAN_ERRORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ERRORI.SetFlags(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_ERRORI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ERRORI.SetRect(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, MyGlb.PANEL_LIST, 12, 32, 900, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ERRORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, MyGlb.PANEL_LIST, 128);
    PAN_ERRORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, MyGlb.PANEL_LIST, 1);
    PAN_ERRORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, MyGlb.PANEL_LIST, "Errore");
    PAN_ERRORI.SetRect(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, MyGlb.PANEL_FORM, 136, 124, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ERRORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, MyGlb.PANEL_FORM, 128);
    PAN_ERRORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, MyGlb.PANEL_FORM, 2);
    PAN_ERRORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ERRORI_TESTOERRORE, MyGlb.PANEL_FORM, "Errore");
    PAN_ERRORI.SetFieldPage(PFL_ERRORI_TESTOERRORE, -1, -1);
    PAN_ERRORI.SetFieldPanel(PFL_ERRORI_TESTOERRORE, PPQRY_WRKLOG4, "A.ERRORE", "WRKLOGWRERER", 5, 300, 0, -13997);
  }

  private void PAN_ERRORI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ERRORI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ERRORI.SetIMDB(IMDB, "PQRY_WRKLOG4", true);
    PAN_ERRORI.set_SetString(MyGlb.MASTER_ROWNAME, "WRK LOG");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.ERRORE as WRKLOGWRERER ");
    PAN_ERRORI.SetQuery(PPQRY_WRKLOG4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_ERRORI A ");
    PAN_ERRORI.SetQuery(PPQRY_WRKLOG4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
    SQL.append("and   (A.FASE = 'CAMBIO_OTTICA') ");
    PAN_ERRORI.SetQuery(PPQRY_WRKLOG4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ERRORI.SetQuery(PPQRY_WRKLOG4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ERRORI.SetQuery(PPQRY_WRKLOG4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ERRORI.SetQuery(PPQRY_WRKLOG4, 5, SQL, -1, "");
    PAN_ERRORI.SetQueryDB(PPQRY_WRKLOG4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ERRORI.SetMasterTable(0, "WRK_ERRORI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ERRORI.Status() == 2)
    {
      int oldListQBE = PAN_ERRORI.iUseListQBE;
      PAN_ERRORI.iUseListQBE = 0;
      PAN_ERRORI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ERRORI.PanelCommand(Glb.PCM_FIND);
      PAN_ERRORI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBROSEGNALA_MST_NUOVPAGIMAST_Init()
  {
    BUK_LIBROSEGNALA.InitMastro(BUK_LIBROSEGNALA_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 1, 1);
    BUK_LIBROSEGNALA.SetRTCGuid(BUK_LIBROSEGNALA_MST_NUOVPAGIMAST, "89007601-AF6D-4A9B-926F-9C4E889B9E4F");
    BUK_LIBROSEGNALA.SetObjCode(BUK_LIBROSEGNALA_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_LIBROSEGNALA.InitMastroBox(BUK_LIBROSEGNALA_MST_NUOVPAGIMAST, BUK_LIBROSEGNALA_RPTBOX_TESTATPAGINA, 1000, 1000, 19000, 1000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROSEGNALA.SetRTCGuid(BUK_LIBROSEGNALA_RPTBOX_TESTATPAGINA, "EAB76F6E-8A19-4598-9BB7-ECE8D5733AA0");
    BUK_LIBROSEGNALA.SetObjCode(BUK_LIBROSEGNALA_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_LIBROSEGNALA.InitMastroBox(BUK_LIBROSEGNALA_MST_NUOVPAGIMAST, BUK_LIBROSEGNALA_RPTBOX_CORPOPAGINA, 1000, 2400, 19000, 21700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROSEGNALA.SetRTCGuid(BUK_LIBROSEGNALA_RPTBOX_CORPOPAGINA, "76E9B1D8-7613-4A8A-B5E3-CB432B86D0AA");
    BUK_LIBROSEGNALA.SetObjCode(BUK_LIBROSEGNALA_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_LIBROSEGNALA.InitMastroBox(BUK_LIBROSEGNALA_MST_NUOVPAGIMAST, BUK_LIBROSEGNALA_RPTBOX_PIEDEPAGINA, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROSEGNALA.SetRTCGuid(BUK_LIBROSEGNALA_RPTBOX_PIEDEPAGINA, "9A39D1E4-5653-4511-9D4C-818D60E4E6F5");
    BUK_LIBROSEGNALA.SetObjCode(BUK_LIBROSEGNALA_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
  }

  private void BUK_LIBROSEGNALA_RPT_NUOVOREPORT_InitQuery() { BUK_LIBROSEGNALA_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_LIBROSEGNALA_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ERRORE as RECWRKERRERR ");
      SQL.append("from ");
      SQL.append("  WRK_ERRORI A ");
      SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      SQL.append("and   (A.FASE = 'CAMBIO_OTTICA') ");
      BUK_LIBROSEGNALA.SetReportQuery(BUK_LIBROSEGNALA_RPT_NUOVOREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "ADD3CE89-6908-466D-9181-6F7007070873");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBROSEGNALA_RPT_NUOVOREPORT_Init()
  {
    BUK_LIBROSEGNALA.InitReport(BUK_LIBROSEGNALA_RPT_NUOVOREPORT, 131073);
    BUK_LIBROSEGNALA_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_LIBROSEGNALA.SetRTCGuid(BUK_LIBROSEGNALA_RPT_NUOVOREPORT, "74BEBB28-571E-45B8-AC21-D4488B023A54");
    BUK_LIBROSEGNALA.SetObjCode(BUK_LIBROSEGNALA_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_LIBROSEGNALA.InitSection(BUK_LIBROSEGNALA_RPT_NUOVOREPORT, BUK_LIBROSEGNALA_SEC_INTESTPAGINA, 1000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROSEGNALA.SetSectionRendersInto(BUK_LIBROSEGNALA_SEC_INTESTPAGINA, BUK_LIBROSEGNALA_RPTBOX_TESTATPAGINA);
    BUK_LIBROSEGNALA.SetRTCGuid(BUK_LIBROSEGNALA_SEC_INTESTPAGINA, "1ED41DD5-A84C-43D7-B4D0-64713FED2BF9");
    BUK_LIBROSEGNALA.SetObjCode(BUK_LIBROSEGNALA_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_LIBROSEGNALA.InitReportBox(BUK_LIBROSEGNALA_SEC_INTESTPAGINA, BUK_LIBROSEGNALA_RPTBOX_TITOLO, 0, 0, 19000, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIBROSEGNALA.SetRTCGuid(BUK_LIBROSEGNALA_RPTBOX_TITOLO, "94FEFFF1-27B9-4955-A679-F8712A4061F7");
    BUK_LIBROSEGNALA.SetObjCode(BUK_LIBROSEGNALA_RPTBOX_TITOLO, "TITOLO");
    BUK_LIBROSEGNALA.set_BoxAlignment(BUK_LIBROSEGNALA_RPTBOX_TITOLO, 3);
    BUK_LIBROSEGNALA.set_BoxFontModifiers(BUK_LIBROSEGNALA_RPTBOX_TITOLO, "B");
    BUK_LIBROSEGNALA.InitBoxSpan(BUK_LIBROSEGNALA_RPTBOX_TITOLO, BUK_LIBROSEGNALA_SPAN_NUOVASPAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Errori Rettifica Unità Organizzativa", 1);
    BUK_LIBROSEGNALA.SetRTCGuid(BUK_LIBROSEGNALA_SPAN_NUOVASPAN, "D96CA01C-8941-4BBA-9AE0-8DB67CB906A4");
    BUK_LIBROSEGNALA.SetObjCode(BUK_LIBROSEGNALA_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_LIBROSEGNALA.InitSection(BUK_LIBROSEGNALA_RPT_NUOVOREPORT, BUK_LIBROSEGNALA_SEC_DETTAGLIO, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROSEGNALA.SetSectionRendersInto(BUK_LIBROSEGNALA_SEC_DETTAGLIO, BUK_LIBROSEGNALA_RPTBOX_CORPOPAGINA);
    BUK_LIBROSEGNALA.SetRTCGuid(BUK_LIBROSEGNALA_SEC_DETTAGLIO, "322CB261-9AA7-4A1E-A03C-4B5425EC3A16");
    BUK_LIBROSEGNALA.SetObjCode(BUK_LIBROSEGNALA_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_LIBROSEGNALA.InitReportBox(BUK_LIBROSEGNALA_SEC_DETTAGLIO, BUK_LIBROSEGNALA_RPTBOX_TESTOERRORE, 0, 0, 18800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROSEGNALA.SetRTCGuid(BUK_LIBROSEGNALA_RPTBOX_TESTOERRORE, "C3C65F4F-5504-474E-B138-BEE19543B982");
    BUK_LIBROSEGNALA.SetObjCode(BUK_LIBROSEGNALA_RPTBOX_TESTOERRORE, "TESTOERRORE");
    BUK_LIBROSEGNALA.InitBoxSpan(BUK_LIBROSEGNALA_RPTBOX_TESTOERRORE, BUK_LIBROSEGNALA_SPAN_REWEEERUCOLS, MyGlb.VIS_DEFAREPOSTYL, 5, 300, 0, 271384705, "", "::RECWRKERRERR", 1);
    BUK_LIBROSEGNALA.SetRTCGuid(BUK_LIBROSEGNALA_SPAN_REWEEERUCOLS, "2EEBB1EA-9684-4405-8E90-A865E3A54126");
    BUK_LIBROSEGNALA.SetObjCode(BUK_LIBROSEGNALA_SPAN_REWEEERUCOLS, "REWEEERUCOLS");
    BUK_LIBROSEGNALA_RPT_NUOVOREPORT_InitQuery(false, true);
  }

  private void BUK_LIBROSEGNALA_InitLinks()
  {
    BUK_LIBROSEGNALA.SetBoxNextBox(BUK_LIBROSEGNALA_RPTBOX_CORPOPAGINA, BUK_LIBROSEGNALA_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ERRORI) PAN_ERRORI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ERRORI) PAN_ERRORI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ERRORI) PAN_ERRORI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ERRORI) PAN_ERRORI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ERRORI) PAN_ERRORI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBROSEGNALA) BUK_LIBROSEGNALA_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBROSEGNALA) BUK_LIBROSEGNALA_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBROSEGNALA) BUK_LIBROSEGNALA_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBROSEGNALA) BUK_LIBROSEGNALA_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBROSEGNALA) BUK_LIBROSEGNALA_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBROSEGNALA) BUK_LIBROSEGNALA_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBROSEGNALA) BUK_LIBROSEGNALA_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBROSEGNALA) BUK_LIBROSEGNALA_OnPreview();
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
