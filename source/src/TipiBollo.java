// **********************************************
// Tipi Bollo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiBollo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPIBOLLO_CODICE = 0;
  private static int PFL_TIPIBOLLO_DESCRIZIONE = 1;
  private static int PFL_TIPIBOLLO_TIPO = 2;
  private static int PFL_TIPIBOLLO_IMPORTMASSIM = 3;
  private static int PFL_TIPIBOLLO_RIFTESO1 = 4;
  private static int PFL_TIPIBOLLO_RIFTESO2 = 5;
  private static int PFL_TIPIBOLLO_RIFTITESORER = 6;
  private static int PFL_TIPIBOLLO_UTENTEINSERI = 7;
  private static int PFL_TIPIBOLLO_DATAINSERIME = 8;
  private static int PFL_TIPIBOLLO_UTENTULTIAGG = 9;
  private static int PFL_TIPIBOLLO_DATAULTIMAGG = 10;

  private static int PPQRY_T61 = 0;


  IDPanel PAN_TIPIBOLLO;
  CIDREObj BUK_TIPIBOLLBOOK;
  OBook BKW_TIPIBOLLBOOK;
  //
  // Template Pages constants
  private static int BUK_TIPIBOLLBOOK_MST_TIPBOLBOOPAG = 1;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_TIPIBOLLBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_TIPIBOLLBOOK_RPT_NEWREPORT = 6;
  private static int BUK_TIPIBOLLBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_TIPIBOLLBOOK_SPAN_CODICE = 9;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_DESCRIHEADER = 10;
  private static int BUK_TIPIBOLLBOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_TIPOHEADER = 12;
  private static int BUK_TIPIBOLLBOOK_SPAN_TIPO = 13;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_IMPOMASSHEAD = 14;
  private static int BUK_TIPIBOLLBOOK_SPAN_IMPORTMASSIM = 15;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO1HEAD = 16;
  private static int BUK_TIPIBOLLBOOK_SPAN_RIFTESO1 = 17;
  private static int BUK_TIPIBOLLBOOK_SEC_TITOLO = 18;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_NEWBOX = 19;
  private static int BUK_TIPIBOLLBOOK_SPAN_VARIADIBILAN = 20;
  private static int BUK_TIPIBOLLBOOK_SEC_DETAIL = 21;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_CODICE = 22;
  private static int BUK_TIPIBOLLBOOK_SPAN_T6COTIBOTIBB = 23;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_DESCRIZIONE = 24;
  private static int BUK_TIPIBOLLBOOK_SPAN_T6DETIBOTIBB = 25;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_TIPO = 26;
  private static int BUK_TIPIBOLLBOOK_SPAN_T6TITIBOTIBB = 27;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_IMPORTMASSIM = 28;
  private static int BUK_TIPIBOLLBOOK_SPAN_T6IMMATIBTBB = 29;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO1 = 30;
  private static int BUK_TIPIBOLLBOOK_SPAN_T6RITE1TBTBB = 31;
  private static int BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO2 = 32;
  private static int BUK_TIPIBOLLBOOK_SPAN_T6RITE2TBTBB = 33;
  private static int BUK_TIPIBOLLBOOK_SEC_REPORTFOOTER = 34;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T61(IMDB);
    Init_PQRY_T68(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T61(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T61, 10);
    IMDB.set_TblCode(IMDBDef9.PQRY_T61, "PQRY_T61");
    IMDB.set_FldCode(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_IMPORTO_MASSIMO, "IMPORTO_MASSIMO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_IMPORTO_MASSIMO,3,10,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_RIF_TESO_1, "RIF_TESO_1");
    IMDB.SetFldParams(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_RIF_TESO_1,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_RIF_TESO_2, "RIF_TESO_2");
    IMDB.SetFldParams(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_RIF_TESO_2,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T61,IMDBDef9.PQSL_T61_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T61, 0);
  }

  private static void Init_PQRY_T68(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T68, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_T68, "PQRY_T68");
    IMDB.set_FldCode(IMDBDef9.PQRY_T68,IMDBDef9.PQSL_T68_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T68,IMDBDef9.PQSL_T68_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T68,IMDBDef9.PQSL_T68_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T68,IMDBDef9.PQSL_T68_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T68,IMDBDef9.PQSL_T68_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T68,IMDBDef9.PQSL_T68_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T68,IMDBDef9.PQSL_T68_IMPORTO_MASSIMO, "IMPORTO_MASSIMO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T68,IMDBDef9.PQSL_T68_IMPORTO_MASSIMO,3,10,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_T68,IMDBDef9.PQSL_T68_RIF_TESO_1, "RIF_TESO_1");
    IMDB.SetFldParams(IMDBDef9.PQRY_T68,IMDBDef9.PQSL_T68_RIF_TESO_1,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T68,IMDBDef9.PQSL_T68_RIF_TESO_2, "RIF_TESO_2");
    IMDB.SetFldParams(IMDBDef9.PQRY_T68,IMDBDef9.PQSL_T68_RIF_TESO_2,5,4,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T68, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiBollo(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiBollo()
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
    FormIdx = MyGlb.FRM_TIPIBOLLO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F6EAFB35-4981-4B25-AEFA-6FBB9AB9BC92";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 692;
    DesignHeight = 378;
    set_Caption(new IDVariant("Tipi Bollo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 692;
    Frames[1].Height = 352;
    Frames[1].Caption = "Tipi Bollo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 352;
    PAN_TIPIBOLLO = new IDPanel(w, this, 1, "PAN_TIPIBOLLO");
    Frames[1].Content = PAN_TIPIBOLLO;
    PAN_TIPIBOLLO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIBOLLO.VS = MainFrm.VisualStyleList;
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 692-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_TIPIBOLLBOOK != null)
      PAN_TIPIBOLLO.SetBook(BUK_TIPIBOLLBOOK);
    PAN_TIPIBOLLO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "608076E6-7122-4DA5-BC78-F3834A328864");
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 620, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPIBOLLO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIBOLLO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIBOLLO.InitStatus = 2;
    PAN_TIPIBOLLO_Init();
    PAN_TIPIBOLLO_InitFields();
    PAN_TIPIBOLLO_InitQueries();
    BKW_TIPIBOLLBOOK = new OBook(this);
    BUK_TIPIBOLLBOOK = new CIDREObj(BKW_TIPIBOLLBOOK);
    BKW_TIPIBOLLBOOK.iGuid = "97B750D3-42F1-468D-8580-5DEB92DA26B6";
    BKW_TIPIBOLLBOOK.Code = "BUK_TIPIBOLLBOOK";
    BKW_TIPIBOLLBOOK.BookObj = BUK_TIPIBOLLBOOK;
    BKW_TIPIBOLLBOOK.InitDefMasks();
    BUK_TIPIBOLLBOOK.InitBook(1, 1245185, "Tipi Bollo Book", IMDB, MainFrm.VisualStyleList);
    BUK_TIPIBOLLBOOK.InitHTML();
    BUK_TIPIBOLLBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_TIPIBOLLBOOK.Book.SetMainFrm(MainFrm);
    BUK_TIPIBOLLBOOK.SetRTCGuid(0, "97B750D3-42F1-468D-8580-5DEB92DA26B6");
    BUK_TIPIBOLLBOOK.SetObjCode(0, "TIPIBOLLBOOK");
    if (PAN_TIPIBOLLO != null)
      PAN_TIPIBOLLO.SetBook(BUK_TIPIBOLLBOOK);
    BUK_TIPIBOLLBOOK_MST_TIPBOLBOOPAG_Init();
    BUK_TIPIBOLLBOOK_RPT_NEWREPORT_Init();
    BUK_TIPIBOLLBOOK_InitLinks();
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
      PAN_TIPIBOLLO.UpdatePanel(MainFrm);
      // BUK_TIPIBOLLBOOK.UpdateBook();
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
    if (Code.equals("BUK_TIPIBOLLBOOK")) return BUK_TIPIBOLLBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof TipiBollo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiBollo.class.getName() : (Glb.ClassWithPackage(TipiBollo.class) ? TipiBollo.class.getName().substring(TipiBollo.class.getPackage().getName().length() + 1) : TipiBollo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tipi Bollo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIBOLLO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPIBOLLO);
      // 
      // Tipi Bollo On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_TIPIBOLLO.IsNewRow()))
      {
        PAN_TIPIBOLLO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIBOLLO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_TIPIBOLLO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIBOLLO_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T61, IMDBDef9.PQSL_T61_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiBollo", "TipiBolloOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Bollo On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_TIPIBOLLO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_TIPIBOLLO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Tipi Bollo On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiBollo", "TipiBolloOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Bollo On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_TIPIBOLLO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Bollo On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T60PD(IMDB.Value(IMDBDef9.PQRY_T61, IMDBDef9.PQSL_T61_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiBollo", "TipiBolloOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Bollo On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_TIPIBOLLO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Bollo On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T61, IMDBDef9.PQSL_T61_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T61, IMDBDef9.PQSL_T61_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T61, IMDBDef9.PQSL_T61_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T61, IMDBDef9.PQSL_T61_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T61, IMDBDef9.PQSL_T61_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T61, IMDBDef9.PQSL_T61_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiBollo", "TipiBolloOnUpdatingRowEvent", _e);
    }
  }

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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiBollo", "LoadEvent", _e);
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
  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPIBOLLO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIBOLLO, Cancel);
    // Stub
  }

  private void PAN_TIPIBOLLO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPIBOLLO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_TIPIBOLLO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIBOLLO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIBOLLO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_TIPIBOLLBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_TIPIBOLLBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_TIPIBOLLBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_TIPIBOLLBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_TIPIBOLLBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_TIPIBOLLBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_TIPIBOLLBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_TIPIBOLLBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_TIPIBOLLBOOK_MST_TIPBOLBOOPAG)
    {
      BUK_TIPIBOLLBOOK.set_SpanValue(BUK_TIPIBOLLBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPIBOLLBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPIBOLLBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_TIPIBOLLBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_TIPIBOLLBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_TIPIBOLLBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_TIPIBOLLBOOK_OnPreview()
  {
    PreviewBook = BKW_TIPIBOLLBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPIBOLLO_Init()
  {

    PAN_TIPIBOLLO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIBOLLO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPIBOLLO.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_TIPIBOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, "39ACA5C1-3ACD-4C06-A398-5E00ECF86E05");
    PAN_TIPIBOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, "Codice");
    PAN_TIPIBOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, "");
    PAN_TIPIBOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIBOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_TIPIBOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, "35B694A3-4893-42F5-BF55-8F0C8EC566C1");
    PAN_TIPIBOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, "Descrizione");
    PAN_TIPIBOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, "");
    PAN_TIPIBOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIBOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_TIPIBOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, "2404C312-5761-42D8-A263-406820AAF1C1");
    PAN_TIPIBOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, "Tipo");
    PAN_TIPIBOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, "");
    PAN_TIPIBOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIBOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIBOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, "480BE6F8-F789-4729-ACE4-E5D4E36A400E");
    PAN_TIPIBOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, "Importo Massimo");
    PAN_TIPIBOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, "");
    PAN_TIPIBOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, MyGlb.VIS_IMPBOLNOFICF);
    PAN_TIPIBOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIBOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, "AA194768-0652-45D5-AD47-CB20AEA25C8E");
    PAN_TIPIBOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, "RIF TESO 1");
    PAN_TIPIBOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, "");
    PAN_TIPIBOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIBOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIBOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, "7D31A288-5706-4F05-A54C-063885285152");
    PAN_TIPIBOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, "RIF TESO 2");
    PAN_TIPIBOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, "");
    PAN_TIPIBOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIBOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIBOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTITESORER, "B29AEACA-8B43-4BBD-BFDE-C5299422B00A");
    PAN_TIPIBOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTITESORER, "Rif.ti Tesoreria");
    PAN_TIPIBOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTITESORER, MyGlb.VIS_LABEVISUSTYL);
    PAN_TIPIBOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTITESORER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_TIPIBOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, "8A05DE3C-028C-43A6-9E63-ABF4D0B93B05");
    PAN_TIPIBOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_TIPIBOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, "");
    PAN_TIPIBOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIBOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIBOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, "963DB0B2-05FE-4884-B53A-B8B77DC90CAC");
    PAN_TIPIBOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, "DATA INSERIMENTO");
    PAN_TIPIBOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, "");
    PAN_TIPIBOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIBOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIBOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, "0829D954-885C-4AC0-9BDF-54116AE67D67");
    PAN_TIPIBOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_TIPIBOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, "");
    PAN_TIPIBOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIBOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIBOLLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, "B1503493-3EBB-4E3F-94A4-53266BD914B5");
    PAN_TIPIBOLLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_TIPIBOLLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, "");
    PAN_TIPIBOLLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIBOLLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPIBOLLO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, MyGlb.PANEL_FORM, 120);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPIBOLLO.SetFieldPage(PFL_TIPIBOLLO_CODICE, -1, -1);
    PAN_TIPIBOLLO.SetFieldPanel(PFL_TIPIBOLLO_CODICE, PPQRY_T61, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 272, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 400, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, MyGlb.PANEL_FORM, 120);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPIBOLLO.SetFieldPage(PFL_TIPIBOLLO_DESCRIZIONE, -1, -1);
    PAN_TIPIBOLLO.SetFieldPanel(PFL_TIPIBOLLO_DESCRIZIONE, PPQRY_T61, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, MyGlb.PANEL_LIST, 328, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, MyGlb.PANEL_FORM, 4, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, MyGlb.PANEL_FORM, 120);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_TIPIBOLLO.SetFieldPage(PFL_TIPIBOLLO_TIPO, -1, -1);
    PAN_TIPIBOLLO.SetFieldPanel(PFL_TIPIBOLLO_TIPO, PPQRY_T61, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, MyGlb.PANEL_LIST, 412, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, MyGlb.PANEL_LIST, 108);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, MyGlb.PANEL_LIST, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, MyGlb.PANEL_LIST, "Importo Massimo");
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, MyGlb.PANEL_FORM, 4, 76, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, MyGlb.PANEL_FORM, 120);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, MyGlb.PANEL_FORM, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_IMPORTMASSIM, MyGlb.PANEL_FORM, "Importo Massimo");
    PAN_TIPIBOLLO.SetFieldPage(PFL_TIPIBOLLO_IMPORTMASSIM, -1, -1);
    PAN_TIPIBOLLO.SetFieldPanel(PFL_TIPIBOLLO_IMPORTMASSIM, PPQRY_T61, "A.IMPORTO_MASSIMO", "IMPORTO_MASSIMO", 3, 10, 2, -13997);
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, MyGlb.PANEL_LIST, 540, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, MyGlb.PANEL_LIST, 64);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, MyGlb.PANEL_LIST, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, MyGlb.PANEL_LIST, "RIF TS. 1");
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, MyGlb.PANEL_FORM, 4, 100, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, MyGlb.PANEL_FORM, 120);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, MyGlb.PANEL_FORM, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO1, MyGlb.PANEL_FORM, "RIF TESO 1");
    PAN_TIPIBOLLO.SetFieldPage(PFL_TIPIBOLLO_RIFTESO1, -1, -1);
    PAN_TIPIBOLLO.SetFieldPanel(PFL_TIPIBOLLO_RIFTESO1, PPQRY_T61, "A.RIF_TESO_1", "RIF_TESO_1", 5, 2, 0, -13997);
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, MyGlb.PANEL_LIST, 580, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, MyGlb.PANEL_LIST, 64);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, MyGlb.PANEL_LIST, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, MyGlb.PANEL_LIST, "RIF TS. 2");
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, MyGlb.PANEL_FORM, 120);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, MyGlb.PANEL_FORM, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTESO2, MyGlb.PANEL_FORM, "RIF TESO 2");
    PAN_TIPIBOLLO.SetFieldPage(PFL_TIPIBOLLO_RIFTESO2, -1, -1);
    PAN_TIPIBOLLO.SetFieldPanel(PFL_TIPIBOLLO_RIFTESO2, PPQRY_T61, "A.RIF_TESO_2", "RIF_TESO_2", 5, 4, 0, -13997);
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTITESORER, MyGlb.PANEL_LIST, 540, 0, 80, 32, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTITESORER, MyGlb.PANEL_LIST, 0);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTITESORER, MyGlb.PANEL_LIST, 2);
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTITESORER, MyGlb.PANEL_FORM, 492, 0, 76, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTITESORER, MyGlb.PANEL_FORM, 0);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_RIFTITESORER, MyGlb.PANEL_FORM, 1);
    PAN_TIPIBOLLO.SetFieldPage(PFL_TIPIBOLLO_RIFTITESORER, -1, -1);
    PAN_TIPIBOLLO.SetFieldPanel(PFL_TIPIBOLLO_RIFTITESORER, -1, "", "RIFTITESORER", 0, 0, 0, -13997);
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, MyGlb.PANEL_LIST, 620, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 148, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_TIPIBOLLO.SetFieldPage(PFL_TIPIBOLLO_UTENTEINSERI, -1, -1);
    PAN_TIPIBOLLO.SetFieldPanel(PFL_TIPIBOLLO_UTENTEINSERI, PPQRY_T61, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, MyGlb.PANEL_LIST, 740, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, MyGlb.PANEL_FORM, 4, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_TIPIBOLLO.SetFieldPage(PFL_TIPIBOLLO_DATAINSERIME, -1, -1);
    PAN_TIPIBOLLO.SetFieldPanel(PFL_TIPIBOLLO_DATAINSERIME, PPQRY_T61, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, MyGlb.PANEL_LIST, 848, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 196, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_TIPIBOLLO.SetFieldPage(PFL_TIPIBOLLO_UTENTULTIAGG, -1, -1);
    PAN_TIPIBOLLO.SetFieldPanel(PFL_TIPIBOLLO_UTENTULTIAGG, PPQRY_T61, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, MyGlb.PANEL_LIST, 960, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_TIPIBOLLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBOLLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_TIPIBOLLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIBOLLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBOLLO_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_TIPIBOLLO.SetFieldPage(PFL_TIPIBOLLO_DATAULTIMAGG, -1, -1);
    PAN_TIPIBOLLO.SetFieldPanel(PFL_TIPIBOLLO_DATAULTIMAGG, PPQRY_T61, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_TIPIBOLLO_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIBOLLO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPIBOLLO.SetIMDB(IMDB, "PQRY_T61", true);
    PAN_TIPIBOLLO.set_SetString(MyGlb.MASTER_ROWNAME, "T60");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.IMPORTO_MASSIMO as IMPORTO_MASSIMO, ");
    SQL.append("  A.RIF_TESO_1 as RIF_TESO_1, ");
    SQL.append("  A.RIF_TESO_2 as RIF_TESO_2, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_TIPIBOLLO.SetQuery(PPQRY_T61, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T60 A ");
    PAN_TIPIBOLLO.SetQuery(PPQRY_T61, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIBOLLO.SetQuery(PPQRY_T61, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIBOLLO.SetQuery(PPQRY_T61, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIBOLLO.SetQuery(PPQRY_T61, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPIBOLLO.SetQuery(PPQRY_T61, 5, SQL, -1, "");
    PAN_TIPIBOLLO.SetQueryDB(PPQRY_T61, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIBOLLO.SetMasterTable(0, "T60");
    PAN_TIPIBOLLO.AddToSortList(PFL_TIPIBOLLO_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIBOLLO.Status() == 2)
    {
      int oldListQBE = PAN_TIPIBOLLO.iUseListQBE;
      PAN_TIPIBOLLO.iUseListQBE = 0;
      PAN_TIPIBOLLO.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIBOLLO.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIBOLLO.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_TIPIBOLLBOOK_MST_TIPBOLBOOPAG_Init()
  {
    BUK_TIPIBOLLBOOK.InitMastro(BUK_TIPIBOLLBOOK_MST_TIPBOLBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_MST_TIPBOLBOOPAG, "AD052164-FC19-46A2-B9DB-A9AC89C68BB4");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_MST_TIPBOLBOOPAG, "TIPBOLBOOPAG");
    BUK_TIPIBOLLBOOK.InitMastroBox(BUK_TIPIBOLLBOOK_MST_TIPBOLBOOPAG, BUK_TIPIBOLLBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_NUMEROPAGINA, "F6A1E401-CE28-48B4-ACAE-2AC60C037540");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_NUMEROPAGINA, BUK_TIPIBOLLBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_NUMEROPAGINA, "DAF4713A-DA90-492F-AE6F-DB804E686D6C");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPIBOLLBOOK.InitMastroBox(BUK_TIPIBOLLBOOK_MST_TIPBOLBOOPAG, BUK_TIPIBOLLBOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_PAGEBODY, "50914679-4D76-4872-B1E2-8B14071AA5B1");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_TIPIBOLLBOOK.InitMastroBox(BUK_TIPIBOLLBOOK_MST_TIPBOLBOOPAG, BUK_TIPIBOLLBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_TITOLO, "DDE35C9A-D6AF-49A6-8D2B-E5A07683AB5A");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_TIPIBOLLBOOK_RPT_NEWREPORT_InitQuery() { BUK_TIPIBOLLBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_TIPIBOLLBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.TIPO as TIPO, ");
      SQL.append("  A.IMPORTO_MASSIMO as IMPORTO_MASSIMO, ");
      SQL.append("  A.RIF_TESO_1 as RIF_TESO_1, ");
      SQL.append("  A.RIF_TESO_2 as RIF_TESO_2 ");
      SQL.append("from ");
      SQL.append("  T60 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_TIPIBOLLBOOK.SetReportQuery(BUK_TIPIBOLLBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "E8F7BF5C-F151-4150-AE21-1EB71DEE3E85");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_TIPIBOLLBOOK_RPT_NEWREPORT_Init()
  {
    BUK_TIPIBOLLBOOK.InitReport(BUK_TIPIBOLLBOOK_RPT_NEWREPORT, 196609);
    BUK_TIPIBOLLBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPT_NEWREPORT, "2EDFD77C-6C6B-4361-B1BA-FF79375A18D2");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_TIPIBOLLBOOK.InitSection(BUK_TIPIBOLLBOOK_RPT_NEWREPORT, BUK_TIPIBOLLBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIBOLLBOOK.SetSectionRendersInto(BUK_TIPIBOLLBOOK_SEC_PAGEHEADER, BUK_TIPIBOLLBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SEC_PAGEHEADER, "044FC72A-7074-4FB3-9EA6-53E10403FBD2");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_TIPIBOLLBOOK.InitReportBox(BUK_TIPIBOLLBOOK_SEC_PAGEHEADER, BUK_TIPIBOLLBOOK_RPTBOX_CODICEHEADER, 0, 0, 1400, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_CODICEHEADER, "7B864BB3-6BAB-4564-9938-FA4E92514423");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_CODICEHEADER, BUK_TIPIBOLLBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_CODICE, "EFEB347C-6A98-4E5F-BBCC-1F1C935F06B0");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_CODICE, "CODICE");
    BUK_TIPIBOLLBOOK.InitReportBox(BUK_TIPIBOLLBOOK_SEC_PAGEHEADER, BUK_TIPIBOLLBOOK_RPTBOX_DESCRIHEADER, 1700, 0, 7119, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_DESCRIHEADER, "70CA7655-FA39-4518-BF26-E42892624143");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_DESCRIHEADER, BUK_TIPIBOLLBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_DESCRIZIONE, "280C182B-EEA9-4318-88E1-D6C075AC4D7C");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_TIPIBOLLBOOK.InitReportBox(BUK_TIPIBOLLBOOK_SEC_PAGEHEADER, BUK_TIPIBOLLBOOK_RPTBOX_TIPOHEADER, 9800, 0, 2222, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_TIPOHEADER, "AE167A0E-356B-4D8D-AD5F-E278BC363067");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_TIPOHEADER, "TIPOHEADER");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_TIPOHEADER, BUK_TIPIBOLLBOOK_SPAN_TIPO, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Tipo", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_TIPO, "07B27B45-CF5A-4CC6-882F-A339025FCD94");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_TIPO, "TIPO");
    BUK_TIPIBOLLBOOK.InitReportBox(BUK_TIPIBOLLBOOK_SEC_PAGEHEADER, BUK_TIPIBOLLBOOK_RPTBOX_IMPOMASSHEAD, 12300, 0, 3300, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_IMPOMASSHEAD, "F8C550CB-B16E-4C9D-A0C4-F53B4F611B69");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_IMPOMASSHEAD, "IMPOMASSHEAD");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_IMPOMASSHEAD, BUK_TIPIBOLLBOOK_SPAN_IMPORTMASSIM, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Importo Massimo", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_IMPORTMASSIM, "6F88D5BA-2796-4C0C-8006-93874144D921");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_IMPORTMASSIM, "IMPORTMASSIM");
    BUK_TIPIBOLLBOOK.InitReportBox(BUK_TIPIBOLLBOOK_SEC_PAGEHEADER, BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO1HEAD, 16100, 0, 2200, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO1HEAD, "4CEDF2B4-F791-49EE-942F-CEF8D3CF2731");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO1HEAD, "RIFTESO1HEAD");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO1HEAD, BUK_TIPIBOLLBOOK_SPAN_RIFTESO1, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Rif.ti Tesoreria", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_RIFTESO1, "5CFE6828-FED0-4B1C-8FCC-963BC7CE8793");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_RIFTESO1, "RIFTESO1");
    BUK_TIPIBOLLBOOK.InitSection(BUK_TIPIBOLLBOOK_RPT_NEWREPORT, BUK_TIPIBOLLBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIBOLLBOOK.SetSectionRendersInto(BUK_TIPIBOLLBOOK_SEC_TITOLO, BUK_TIPIBOLLBOOK_RPTBOX_TITOLO);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SEC_TITOLO, "513087CE-71C4-48CA-B878-A9A75DD780F6");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SEC_TITOLO, "TITOLO");
    BUK_TIPIBOLLBOOK.InitReportBox(BUK_TIPIBOLLBOOK_SEC_TITOLO, BUK_TIPIBOLLBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_NEWBOX, "EFC40BBF-989B-4E33-8716-A4EC05C5D01C");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_NEWBOX, BUK_TIPIBOLLBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Tipi di Bollo", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_VARIADIBILAN, "E06FE37F-9494-4073-AE57-0DB413A09549");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_TIPIBOLLBOOK.InitSection(BUK_TIPIBOLLBOOK_RPT_NEWREPORT, BUK_TIPIBOLLBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIBOLLBOOK.SetSectionRendersInto(BUK_TIPIBOLLBOOK_SEC_DETAIL, BUK_TIPIBOLLBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SEC_DETAIL, "DF58068D-B378-4E41-937F-B1A495086932");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SEC_DETAIL, "DETAIL");
    BUK_TIPIBOLLBOOK.InitReportBox(BUK_TIPIBOLLBOOK_SEC_DETAIL, BUK_TIPIBOLLBOOK_RPTBOX_CODICE, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_CODICE, "4F5B0BFD-AE0B-4915-BB08-303D88AF731C");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_CODICE, "CODICE");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_CODICE, BUK_TIPIBOLLBOOK_SPAN_T6COTIBOTIBB, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_T6COTIBOTIBB, "96547430-DB0D-4199-8B6D-33C8EEB8AA21");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_T6COTIBOTIBB, "T6COTIBOTIBB");
    BUK_TIPIBOLLBOOK.InitReportBox(BUK_TIPIBOLLBOOK_SEC_DETAIL, BUK_TIPIBOLLBOOK_RPTBOX_DESCRIZIONE, 1700, 0, 7800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_DESCRIZIONE, "4E342ABB-CE66-4ED3-9092-5DD5C9CF7BB3");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_DESCRIZIONE, BUK_TIPIBOLLBOOK_SPAN_T6DETIBOTIBB, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_T6DETIBOTIBB, "8C96FFAA-DF3A-4DAB-8369-620F3CA58D51");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_T6DETIBOTIBB, "T6DETIBOTIBB");
    BUK_TIPIBOLLBOOK.InitReportBox(BUK_TIPIBOLLBOOK_SEC_DETAIL, BUK_TIPIBOLLBOOK_RPTBOX_TIPO, 9800, 0, 2222, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_TIPO, "16A96BE0-D40B-4A5C-BE72-0D3D6D6EAA03");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_TIPO, "TIPO");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_TIPO, BUK_TIPIBOLLBOOK_SPAN_T6TITIBOTIBB, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::TIPO", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_T6TITIBOTIBB, "8F20A861-C6C8-4BBD-9DED-A59027BEA28F");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_T6TITIBOTIBB, "T6TITIBOTIBB");
    BUK_TIPIBOLLBOOK.InitReportBox(BUK_TIPIBOLLBOOK_SEC_DETAIL, BUK_TIPIBOLLBOOK_RPTBOX_IMPORTMASSIM, 12300, 0, 3300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_IMPORTMASSIM, "18484976-C61A-48FA-8151-E577C786529A");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_IMPORTMASSIM, "IMPORTMASSIM");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_IMPORTMASSIM, BUK_TIPIBOLLBOOK_SPAN_T6IMMATIBTBB, MyGlb.VIS_DEFAREPOSTYL, 3, 10, 6, 271384705, "Brief description of field content.", "::IMPORTO_MASSIMO", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_T6IMMATIBTBB, "67275B88-5D1A-44CD-B703-5110B606E44E");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_T6IMMATIBTBB, "T6IMMATIBTBB");
    BUK_TIPIBOLLBOOK.InitReportBox(BUK_TIPIBOLLBOOK_SEC_DETAIL, BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO1, 16100, 0, 1013, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO1, "9C76D386-2FC0-4DB1-9F6A-6CA1F9B789E0");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO1, "RIFTESO1");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO1, BUK_TIPIBOLLBOOK_SPAN_T6RITE1TBTBB, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384705, "Brief description of field content.", "::RIF_TESO_1", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_T6RITE1TBTBB, "639F0D67-4E1D-4FA3-8978-101EDED9B51B");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_T6RITE1TBTBB, "T6RITE1TBTBB");
    BUK_TIPIBOLLBOOK.InitReportBox(BUK_TIPIBOLLBOOK_SEC_DETAIL, BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO2, 17200, 0, 1055, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO2, "D6E03FC7-7A94-45D3-80CC-A92FDBE5AF03");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO2, "RIFTESO2");
    BUK_TIPIBOLLBOOK.InitBoxSpan(BUK_TIPIBOLLBOOK_RPTBOX_RIFTESO2, BUK_TIPIBOLLBOOK_SPAN_T6RITE2TBTBB, MyGlb.VIS_DEFAREPOSTYL, 5, 4, 0, 271384705, "Brief description of field content.", "::RIF_TESO_2", 1);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SPAN_T6RITE2TBTBB, "8A6D7FCB-DE46-4012-8C92-8A5E63AA29D9");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SPAN_T6RITE2TBTBB, "T6RITE2TBTBB");
    BUK_TIPIBOLLBOOK.InitSection(BUK_TIPIBOLLBOOK_RPT_NEWREPORT, BUK_TIPIBOLLBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIBOLLBOOK.SetSectionRendersInto(BUK_TIPIBOLLBOOK_SEC_REPORTFOOTER, BUK_TIPIBOLLBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIBOLLBOOK.SetRTCGuid(BUK_TIPIBOLLBOOK_SEC_REPORTFOOTER, "3AD8F2AB-5AC5-4F9D-B99F-99A6CAA9432D");
    BUK_TIPIBOLLBOOK.SetObjCode(BUK_TIPIBOLLBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_TIPIBOLLBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_TIPIBOLLBOOK_InitLinks()
  {
    BUK_TIPIBOLLBOOK.SetBoxNextBox(BUK_TIPIBOLLBOOK_RPTBOX_PAGEBODY, BUK_TIPIBOLLBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPIBOLLO) PAN_TIPIBOLLO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIBOLLO) PAN_TIPIBOLLO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPIBOLLO) PAN_TIPIBOLLO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIBOLLO) PAN_TIPIBOLLO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPIBOLLO) PAN_TIPIBOLLO_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_TIPIBOLLO) PAN_TIPIBOLLO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_TIPIBOLLBOOK) BUK_TIPIBOLLBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_TIPIBOLLBOOK) BUK_TIPIBOLLBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_TIPIBOLLBOOK) BUK_TIPIBOLLBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_TIPIBOLLBOOK) BUK_TIPIBOLLBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_TIPIBOLLBOOK) BUK_TIPIBOLLBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_TIPIBOLLBOOK) BUK_TIPIBOLLBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_TIPIBOLLBOOK) BUK_TIPIBOLLBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_TIPIBOLLBOOK) BUK_TIPIBOLLBOOK_OnPreview();
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
