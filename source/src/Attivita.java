// **********************************************
// Attivita
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Attivita extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ATTIVITA_CODICE = 0;
  private static int PFL_ATTIVITA_DESCRIZIONE = 1;
  private static int PFL_ATTIVITA_CODICEIVA = 2;
  private static int PFL_ATTIVITA_PRORATA = 3;
  private static int PFL_ATTIVITA_TIPOLIQUIDAZ = 4;
  private static int PFL_ATTIVITA_DETRIVADACI4 = 5;
  private static int PFL_ATTIVITA_ISTITUZIONAL = 6;
  private static int PFL_ATTIVITA_UTENTEINSERI = 7;
  private static int PFL_ATTIVITA_DATAINSERIME = 8;
  private static int PFL_ATTIVITA_UTENTULTIAGG = 9;
  private static int PFL_ATTIVITA_DATAULTIMAGG = 10;

  private static int PPQRY_T12 = 0;


  IDPanel PAN_ATTIVITA;
  CIDREObj BUK_CODIATTIBOOK;
  OBook BKW_CODIATTIBOOK;
  //
  // Template Pages constants
  private static int BUK_CODIATTIBOOK_MST_CODATTBOOPAG = 1;
  private static int BUK_CODIATTIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CODIATTIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CODIATTIBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_CODIATTIBOOK_RPTBOX_PAGEFOOTER = 5;
  private static int BUK_CODIATTIBOOK_RPTBOX_TITOLO = 6;

  //
  // Reports constants
  private static int BUK_CODIATTIBOOK_RPT_NEWREPORT = 7;
  private static int BUK_CODIATTIBOOK_SEC_PAGEHEADER = 8;
  private static int BUK_CODIATTIBOOK_RPTBOX_CODICEHEADER = 9;
  private static int BUK_CODIATTIBOOK_SPAN_CODICE = 10;
  private static int BUK_CODIATTIBOOK_RPTBOX_DESCRIHEADER = 11;
  private static int BUK_CODIATTIBOOK_SPAN_DESCRIZIONE = 12;
  private static int BUK_CODIATTIBOOK_RPTBOX_CODICIVAHEAD = 13;
  private static int BUK_CODIATTIBOOK_SPAN_CODICEIVA = 14;
  private static int BUK_CODIATTIBOOK_RPTBOX_PRORATHEADER = 15;
  private static int BUK_CODIATTIBOOK_SPAN_PRORATA = 16;
  private static int BUK_CODIATTIBOOK_RPTBOX_TIPOLIQUHEAD = 17;
  private static int BUK_CODIATTIBOOK_SPAN_TIPOLIQUIDAZ = 18;
  private static int BUK_CODIATTIBOOK_RPTBOX_DETIVACI4HEA = 19;
  private static int BUK_CODIATTIBOOK_SPAN_DETRIVADACI4 = 20;
  private static int BUK_CODIATTIBOOK_SEC_TITOLO = 21;
  private static int BUK_CODIATTIBOOK_RPTBOX_NEWBOX = 22;
  private static int BUK_CODIATTIBOOK_SPAN_VARIADIBILAN = 23;
  private static int BUK_CODIATTIBOOK_SEC_DETAIL = 24;
  private static int BUK_CODIATTIBOOK_RPTBOX_CODICE = 25;
  private static int BUK_CODIATTIBOOK_SPAN_T0COATCOATBO = 26;
  private static int BUK_CODIATTIBOOK_RPTBOX_DESCRIZIONE = 27;
  private static int BUK_CODIATTIBOOK_SPAN_T0DEATCOATBO = 28;
  private static int BUK_CODIATTIBOOK_RPTBOX_CODICEIVA = 29;
  private static int BUK_CODIATTIBOOK_SPAN_T0COIVATCOAB = 30;
  private static int BUK_CODIATTIBOOK_RPTBOX_PRORATA = 31;
  private static int BUK_CODIATTIBOOK_SPAN_T0PRATCOATBO = 32;
  private static int BUK_CODIATTIBOOK_RPTBOX_TIPOLIQUIDAZ = 33;
  private static int BUK_CODIATTIBOOK_SPAN_T0TILIATCOAB = 34;
  private static int BUK_CODIATTIBOOK_RPTBOX_DETRIVACI4 = 35;
  private static int BUK_CODIATTIBOOK_SPAN_NVTDIDCACABN = 36;
  private static int BUK_CODIATTIBOOK_SEC_PAGEFOOTER = 37;
  private static int BUK_CODIATTIBOOK_SEC_REPORTFOOTER = 38;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T12(IMDB);
    Init_PQRY_T09(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T12, 11);
    IMDB.set_TblCode(IMDBDef9.PQRY_T12, "PQRY_T12");
    IMDB.set_FldCode(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_CODICE_IVA, "CODICE_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_CODICE_IVA,5,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_PRORATA, "PRORATA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_PRORATA,3,5,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_TIPO_LIQUIDAZIONE, "TIPO_LIQUIDAZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_TIPO_LIQUIDAZIONE,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_DETR_IVA_CI4, "DETR_IVA_CI4");
    IMDB.SetFldParams(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_DETR_IVA_CI4,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_ISTITUZIONALE, "ISTITUZIONALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_ISTITUZIONALE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T12,IMDBDef9.PQSL_T12_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T12, 0);
  }

  private static void Init_PQRY_T09(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T09, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_T09, "PQRY_T09");
    IMDB.set_FldCode(IMDBDef9.PQRY_T09,IMDBDef9.PQSL_T09_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T09,IMDBDef9.PQSL_T09_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T09,IMDBDef9.PQSL_T09_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T09,IMDBDef9.PQSL_T09_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T09,IMDBDef9.PQSL_T09_CODICE_IVA, "CODICE_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T09,IMDBDef9.PQSL_T09_CODICE_IVA,5,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T09,IMDBDef9.PQSL_T09_PRORATA, "PRORATA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T09,IMDBDef9.PQSL_T09_PRORATA,3,5,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_T09,IMDBDef9.PQSL_T09_TIPO_LIQUIDAZIONE, "TIPO_LIQUIDAZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T09,IMDBDef9.PQSL_T09_TIPO_LIQUIDAZIONE,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T09,IMDBDef9.PQSL_T09_DETR_IVA_CI4, "DETR_IVA_CI4");
    IMDB.SetFldParams(IMDBDef9.PQRY_T09,IMDBDef9.PQSL_T09_DETR_IVA_CI4,5,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T09, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Attivita(MyWebEntryPoint w, IMDBObj imdb)
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
  public Attivita()
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
    FormIdx = MyGlb.FRM_ATTIVITA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D804D5CA-B1CA-4CE9-8B74-F437913008CD";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 796;
    DesignHeight = 390;
    set_Caption(new IDVariant("Attivita"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 796;
    Frames[1].Height = 364;
    Frames[1].Caption = "Attività";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_ATTIVITA = new IDPanel(w, this, 1, "PAN_ATTIVITA");
    Frames[1].Content = PAN_ATTIVITA;
    PAN_ATTIVITA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ATTIVITA.VS = MainFrm.VisualStyleList;
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 796-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CODIATTIBOOK != null)
      PAN_ATTIVITA.SetBook(BUK_CODIATTIBOOK);
    PAN_ATTIVITA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "923E9F02-FE28-44E8-A86A-C41B0EF793AC");
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 756, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ATTIVITA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ATTIVITA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ATTIVITA.InitStatus = 2;
    PAN_ATTIVITA_Init();
    PAN_ATTIVITA_InitFields();
    PAN_ATTIVITA_InitQueries();
    BKW_CODIATTIBOOK = new OBook(this);
    BUK_CODIATTIBOOK = new CIDREObj(BKW_CODIATTIBOOK);
    BKW_CODIATTIBOOK.iGuid = "D203CE28-95EF-4361-BB30-600A9BF5790D";
    BKW_CODIATTIBOOK.Code = "BUK_CODIATTIBOOK";
    BKW_CODIATTIBOOK.BookObj = BUK_CODIATTIBOOK;
    BKW_CODIATTIBOOK.InitDefMasks();
    BUK_CODIATTIBOOK.InitBook(1, 1245185, "Codici Attività Book", IMDB, MainFrm.VisualStyleList);
    BUK_CODIATTIBOOK.InitHTML();
    BUK_CODIATTIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CODIATTIBOOK.Book.SetMainFrm(MainFrm);
    BUK_CODIATTIBOOK.SetRTCGuid(0, "D203CE28-95EF-4361-BB30-600A9BF5790D");
    BUK_CODIATTIBOOK.SetObjCode(0, "CODIATTIBOOK");
    if (PAN_ATTIVITA != null)
      PAN_ATTIVITA.SetBook(BUK_CODIATTIBOOK);
    BUK_CODIATTIBOOK_MST_CODATTBOOPAG_Init();
    BUK_CODIATTIBOOK_RPT_NEWREPORT_Init();
    BUK_CODIATTIBOOK_InitLinks();
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
      PAN_ATTIVITA.UpdatePanel(MainFrm);
      // BUK_CODIATTIBOOK.UpdateBook();
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
    if (Code.equals("BUK_CODIATTIBOOK")) return BUK_CODIATTIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Attivita);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Attivita.class.getName() : (Glb.ClassWithPackage(Attivita.class) ? Attivita.class.getName().substring(Attivita.class.getPackage().getName().length() + 1) : Attivita.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Attività On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ATTIVITA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ATTIVITA);
      // 
      // Attività On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_ATTIVITA.IsNewRow()))
      {
        PAN_ATTIVITA.SetFlags (Glb.OBJ_FIELD, PFL_ATTIVITA_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ATTIVITA.SetFlags (Glb.OBJ_FIELD, PFL_ATTIVITA_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_ATTIVITA.set_ToolTip(Glb.OBJ_FIELD,PFL_ATTIVITA_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T12, IMDBDef9.PQSL_T12_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Attivita", "AttivitàOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Attività On Database Error Event
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
  private void PAN_ATTIVITA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ATTIVITA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Attività On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Attivita", "AttivitàOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Attività On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ATTIVITA_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attività On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T09PD(IMDB.Value(IMDBDef9.PQRY_T12, IMDBDef9.PQSL_T12_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Attivita", "AttivitàOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Attività On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ATTIVITA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attività On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T12, IMDBDef9.PQSL_T12_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T12, IMDBDef9.PQSL_T12_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T12, IMDBDef9.PQSL_T12_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T12, IMDBDef9.PQSL_T12_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T12, IMDBDef9.PQSL_T12_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T12, IMDBDef9.PQSL_T12_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Attivita", "AttivitàOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("Attivita", "LoadEvent", _e);
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
  private void PAN_ATTIVITA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ATTIVITA, Cancel);
    // Stub
  }

  private void PAN_ATTIVITA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ATTIVITA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ATTIVITA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ATTIVITA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ATTIVITA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CODIATTIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CODIATTIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CODIATTIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CODIATTIBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CODIATTIBOOK_SEC_DETAIL)
    {
      BUK_CODIATTIBOOK.set_SpanValue(BUK_CODIATTIBOOK_SPAN_NVTDIDCACABN, new IDVariant(IDL.NullValue(BUK_CODIATTIBOOK.GetReportColumn(BUK_CODIATTIBOOK_RPT_NEWREPORT, "DETR_IVA_CI4"),(new IDVariant("NO")))));
    }
    if (SectionID==BUK_CODIATTIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CODIATTIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CODIATTIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CODIATTIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CODIATTIBOOK_MST_CODATTBOOPAG)
    {
      BUK_CODIATTIBOOK.set_SpanValue(BUK_CODIATTIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CODIATTIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CODIATTIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CODIATTIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CODIATTIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CODIATTIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CODIATTIBOOK_OnPreview()
  {
    PreviewBook = BKW_CODIATTIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ATTIVITA_Init()
  {

    PAN_ATTIVITA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ATTIVITA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ATTIVITA.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_ATTIVITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, "1043C89C-8E02-4EE5-A97B-5B40BB4A46CE");
    PAN_ATTIVITA.set_Header(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, "Codice");
    PAN_ATTIVITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, "");
    PAN_ATTIVITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ATTIVITA.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_ATTIVITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, "412A6CA2-F96A-4123-B9E1-BBA1DB247BFD");
    PAN_ATTIVITA.set_Header(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, "Descrizione");
    PAN_ATTIVITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, "");
    PAN_ATTIVITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ATTIVITA.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ATTIVITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, "9B557881-9F65-4A31-BB32-D4ED8DCE9F07");
    PAN_ATTIVITA.set_Header(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, "Codice IVA");
    PAN_ATTIVITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, "");
    PAN_ATTIVITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_ATTIVITA.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ATTIVITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, "531E678B-8104-48F2-975C-39770DF0C3BB");
    PAN_ATTIVITA.set_Header(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, "Prorata");
    PAN_ATTIVITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, "");
    PAN_ATTIVITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, MyGlb.VIS_PERPRNOFICF4);
    PAN_ATTIVITA.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTIVITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, "5970F938-2DE1-4602-A513-B5EE9F132C9C");
    PAN_ATTIVITA.set_Header(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, "Tipo Liquidazione");
    PAN_ATTIVITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, "");
    PAN_ATTIVITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_ATTIVITA.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ATTIVITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, "134DCB4F-DB34-4188-BD49-7C5362F7A6B9");
    PAN_ATTIVITA.set_Header(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, "Detr. Iva da CI4");
    PAN_ATTIVITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, "");
    PAN_ATTIVITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, MyGlb.VIS_CHECKSTYLE);
    PAN_ATTIVITA.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ATTIVITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, "64D307E5-D7E2-4FDE-B763-8BD114914988");
    PAN_ATTIVITA.set_Header(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, "Istituzionale");
    PAN_ATTIVITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, "");
    PAN_ATTIVITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, MyGlb.VIS_CHECKSTYLE);
    PAN_ATTIVITA.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ATTIVITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, "4DFA9863-7A12-4FF4-98ED-A2B1BBFCAEE4");
    PAN_ATTIVITA.set_Header(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_ATTIVITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, "");
    PAN_ATTIVITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTIVITA.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ATTIVITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, "50DD9B15-B07B-402D-A0D3-3FAD0A99E6E7");
    PAN_ATTIVITA.set_Header(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, "DATA INSERIMENTO");
    PAN_ATTIVITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, "");
    PAN_ATTIVITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTIVITA.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ATTIVITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, "F30360E3-4798-4652-98C4-8BA768EF5B1E");
    PAN_ATTIVITA.set_Header(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_ATTIVITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, "");
    PAN_ATTIVITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTIVITA.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ATTIVITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, "BD93BFC5-A7EB-48EC-B663-0EC91DADBC02");
    PAN_ATTIVITA.set_Header(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_ATTIVITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, "");
    PAN_ATTIVITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ATTIVITA.SetFlags(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ATTIVITA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, MyGlb.PANEL_FORM, 120);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ATTIVITA.SetFieldPage(PFL_ATTIVITA_CODICE, -1, -1);
    PAN_ATTIVITA.SetFieldPanel(PFL_ATTIVITA_CODICE, PPQRY_T12, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, MyGlb.PANEL_FORM, 120);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ATTIVITA.SetFieldPage(PFL_ATTIVITA_DESCRIZIONE, -1, -1);
    PAN_ATTIVITA.SetFieldPanel(PFL_ATTIVITA_DESCRIZIONE, PPQRY_T12, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, MyGlb.PANEL_LIST, 388, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, MyGlb.PANEL_LIST, 68);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, MyGlb.PANEL_LIST, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, MyGlb.PANEL_LIST, "Codice IVA");
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, MyGlb.PANEL_FORM, 120);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, MyGlb.PANEL_FORM, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_CODICEIVA, MyGlb.PANEL_FORM, "Codice IVA");
    PAN_ATTIVITA.SetFieldPage(PFL_ATTIVITA_CODICEIVA, -1, -1);
    PAN_ATTIVITA.SetFieldPanel(PFL_ATTIVITA_CODICEIVA, PPQRY_T12, "A.CODICE_IVA", "CODICE_IVA", 5, 5, 0, -13997);
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, MyGlb.PANEL_LIST, 448, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, MyGlb.PANEL_LIST, 56);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, MyGlb.PANEL_LIST, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, MyGlb.PANEL_LIST, "Prorata");
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, MyGlb.PANEL_FORM, 120);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, MyGlb.PANEL_FORM, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_PRORATA, MyGlb.PANEL_FORM, "Prorata");
    PAN_ATTIVITA.SetFieldPage(PFL_ATTIVITA_PRORATA, -1, -1);
    PAN_ATTIVITA.SetFieldPanel(PFL_ATTIVITA_PRORATA, PPQRY_T12, "A.PRORATA", "PRORATA", 3, 5, 2, -13997);
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, MyGlb.PANEL_LIST, 500, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, MyGlb.PANEL_LIST, 108);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, MyGlb.PANEL_LIST, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, MyGlb.PANEL_LIST, "Tipo Liquidazione");
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, MyGlb.PANEL_FORM, 4, 100, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, MyGlb.PANEL_FORM, 120);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, MyGlb.PANEL_FORM, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_TIPOLIQUIDAZ, MyGlb.PANEL_FORM, "Tipo Liquidazione");
    PAN_ATTIVITA.SetFieldPage(PFL_ATTIVITA_TIPOLIQUIDAZ, -1, -1);
    PAN_ATTIVITA.SetFieldPanel(PFL_ATTIVITA_TIPOLIQUIDAZ, PPQRY_T12, "A.TIPO_LIQUIDAZIONE", "TIPO_LIQUIDAZIONE", 5, 1, 0, -13997);
    PAN_ATTIVITA.SetValueListItem(PFL_ATTIVITA_TIPOLIQUIDAZ, (new IDVariant("M")), "Mensile", "", "", -1);
    PAN_ATTIVITA.SetValueListItem(PFL_ATTIVITA_TIPOLIQUIDAZ, (new IDVariant("T")), "Trimestrale", "", "", -1);
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, MyGlb.PANEL_LIST, 588, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, MyGlb.PANEL_LIST, 76);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, MyGlb.PANEL_LIST, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, MyGlb.PANEL_LIST, "Detr. Iva da CI4");
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, MyGlb.PANEL_FORM, 120);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, MyGlb.PANEL_FORM, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DETRIVADACI4, MyGlb.PANEL_FORM, "Detr. Iva da CI4");
    PAN_ATTIVITA.SetFieldPage(PFL_ATTIVITA_DETRIVADACI4, -1, -1);
    PAN_ATTIVITA.SetFieldPanel(PFL_ATTIVITA_DETRIVADACI4, PPQRY_T12, "A.DETR_IVA_CI4", "DETR_IVA_CI4", 5, 2, 0, -13997);
    PAN_ATTIVITA.SetValueListItem(PFL_ATTIVITA_DETRIVADACI4, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ATTIVITA.SetValueListItem(PFL_ATTIVITA_DETRIVADACI4, (new IDVariant()), "Null", "", "", -1);
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, MyGlb.PANEL_LIST, 676, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, MyGlb.PANEL_LIST, 84);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, MyGlb.PANEL_LIST, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, MyGlb.PANEL_LIST, "Istituzionale");
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, MyGlb.PANEL_FORM, 4, 148, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, MyGlb.PANEL_FORM, 84);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, MyGlb.PANEL_FORM, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_ISTITUZIONAL, MyGlb.PANEL_FORM, "Istituzionale");
    PAN_ATTIVITA.SetFieldPage(PFL_ATTIVITA_ISTITUZIONAL, -1, -1);
    PAN_ATTIVITA.SetFieldPanel(PFL_ATTIVITA_ISTITUZIONAL, PPQRY_T12, "A.ISTITUZIONALE", "ISTITUZIONALE", 5, 2, 0, -13997);
    PAN_ATTIVITA.SetValueListItem(PFL_ATTIVITA_ISTITUZIONAL, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ATTIVITA.SetValueListItem(PFL_ATTIVITA_ISTITUZIONAL, (new IDVariant()), "Null", "", "", -1);
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, MyGlb.PANEL_LIST, 740, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 172, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_ATTIVITA.SetFieldPage(PFL_ATTIVITA_UTENTEINSERI, -1, -1);
    PAN_ATTIVITA.SetFieldPanel(PFL_ATTIVITA_UTENTEINSERI, PPQRY_T12, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, MyGlb.PANEL_LIST, 860, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, MyGlb.PANEL_FORM, 4, 196, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_ATTIVITA.SetFieldPage(PFL_ATTIVITA_DATAINSERIME, -1, -1);
    PAN_ATTIVITA.SetFieldPanel(PFL_ATTIVITA_DATAINSERIME, PPQRY_T12, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, MyGlb.PANEL_LIST, 968, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 220, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_ATTIVITA.SetFieldPage(PFL_ATTIVITA_UTENTULTIAGG, -1, -1);
    PAN_ATTIVITA.SetFieldPanel(PFL_ATTIVITA_UTENTULTIAGG, PPQRY_T12, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, MyGlb.PANEL_LIST, 1080, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_ATTIVITA.SetRect(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ATTIVITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_ATTIVITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_ATTIVITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ATTIVITA_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_ATTIVITA.SetFieldPage(PFL_ATTIVITA_DATAULTIMAGG, -1, -1);
    PAN_ATTIVITA.SetFieldPanel(PFL_ATTIVITA_DATAULTIMAGG, PPQRY_T12, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_ATTIVITA_InitQueries()
  {
    StringBuffer SQL;

    PAN_ATTIVITA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ATTIVITA.SetIMDB(IMDB, "PQRY_T12", true);
    PAN_ATTIVITA.set_SetString(MyGlb.MASTER_ROWNAME, "T09");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CODICE_IVA as CODICE_IVA, ");
    SQL.append("  A.PRORATA as PRORATA, ");
    SQL.append("  A.TIPO_LIQUIDAZIONE as TIPO_LIQUIDAZIONE, ");
    SQL.append("  A.DETR_IVA_CI4 as DETR_IVA_CI4, ");
    SQL.append("  A.ISTITUZIONALE as ISTITUZIONALE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_ATTIVITA.SetQuery(PPQRY_T12, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T09 A ");
    PAN_ATTIVITA.SetQuery(PPQRY_T12, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ATTIVITA.SetQuery(PPQRY_T12, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ATTIVITA.SetQuery(PPQRY_T12, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ATTIVITA.SetQuery(PPQRY_T12, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ATTIVITA.SetQuery(PPQRY_T12, 5, SQL, -1, "");
    PAN_ATTIVITA.SetQueryDB(PPQRY_T12, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ATTIVITA.SetMasterTable(0, "T09");
    PAN_ATTIVITA.AddToSortList(PFL_ATTIVITA_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ATTIVITA.Status() == 2)
    {
      int oldListQBE = PAN_ATTIVITA.iUseListQBE;
      PAN_ATTIVITA.iUseListQBE = 0;
      PAN_ATTIVITA.PanelCommand(Glb.PCM_SEARCH);
      PAN_ATTIVITA.PanelCommand(Glb.PCM_FIND);
      PAN_ATTIVITA.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CODIATTIBOOK_MST_CODATTBOOPAG_Init()
  {
    BUK_CODIATTIBOOK.InitMastro(BUK_CODIATTIBOOK_MST_CODATTBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_MST_CODATTBOOPAG, "E8A17766-65C9-418E-AA13-52F89A1D022F");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_MST_CODATTBOOPAG, "CODATTBOOPAG");
    BUK_CODIATTIBOOK.InitMastroBox(BUK_CODIATTIBOOK_MST_CODATTBOOPAG, BUK_CODIATTIBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_NUMEROPAGINA, "7D60D5B2-08BF-44AD-9997-62D1862E7746");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_NUMEROPAGINA, BUK_CODIATTIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_NUMEROPAGINA, "34AF86EF-26FC-42E4-A708-690DC0B917F2");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CODIATTIBOOK.InitMastroBox(BUK_CODIATTIBOOK_MST_CODATTBOOPAG, BUK_CODIATTIBOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 22800, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_PAGEBODY, "2A6E1ED4-8015-45F5-9DCB-101E0AF8A0CB");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CODIATTIBOOK.InitMastroBox(BUK_CODIATTIBOOK_MST_CODATTBOOPAG, BUK_CODIATTIBOOK_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_PAGEFOOTER, "B9E449AA-86ED-4AD1-A8B5-59B79438827E");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
    BUK_CODIATTIBOOK.InitMastroBox(BUK_CODIATTIBOOK_MST_CODATTBOOPAG, BUK_CODIATTIBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_TITOLO, "CC895C56-6F00-4BBD-95C3-CD94866F1899");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_CODIATTIBOOK_RPT_NEWREPORT_InitQuery() { BUK_CODIATTIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CODIATTIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.CODICE_IVA as CODICE_IVA, ");
      SQL.append("  A.PRORATA as PRORATA, ");
      SQL.append("  A.TIPO_LIQUIDAZIONE as TIPO_LIQUIDAZIONE, ");
      SQL.append("  A.DETR_IVA_CI4 as DETR_IVA_CI4 ");
      SQL.append("from ");
      SQL.append("  T09 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_CODIATTIBOOK.SetReportQuery(BUK_CODIATTIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "62FB5FAA-FB5F-438E-AF49-5813CFB4DD17");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CODIATTIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CODIATTIBOOK.InitReport(BUK_CODIATTIBOOK_RPT_NEWREPORT, 196609);
    BUK_CODIATTIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPT_NEWREPORT, "A958494F-827D-4B0A-B3CC-616EABFE52D5");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CODIATTIBOOK.InitSection(BUK_CODIATTIBOOK_RPT_NEWREPORT, BUK_CODIATTIBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODIATTIBOOK.SetSectionRendersInto(BUK_CODIATTIBOOK_SEC_PAGEHEADER, BUK_CODIATTIBOOK_RPTBOX_PAGEBODY);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SEC_PAGEHEADER, "885F62D8-247B-461C-96C7-F15C7B7DBC5D");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_PAGEHEADER, BUK_CODIATTIBOOK_RPTBOX_CODICEHEADER, 100, 0, 1123, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_CODICEHEADER, "4E5482D2-99BA-4DE2-AE55-5AB47AE3DC9A");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_CODICEHEADER, BUK_CODIATTIBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_CODICE, "2ED069CA-BE41-4B1E-A10E-0F53547A84FE");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_CODICE, "CODICE");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_PAGEHEADER, BUK_CODIATTIBOOK_RPTBOX_DESCRIHEADER, 1400, 0, 8642, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_DESCRIHEADER, "C5847F5D-1FFF-4CBD-9E3A-F3AD70166A9B");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_DESCRIHEADER, BUK_CODIATTIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_DESCRIZIONE, "CC7F62E2-BFBE-492E-86C0-6846EF7BCBA0");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_PAGEHEADER, BUK_CODIATTIBOOK_RPTBOX_CODICIVAHEAD, 10200, 0, 1658, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_CODICIVAHEAD, "6A9F337D-31A3-4013-A41C-E80547D45674");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_CODICIVAHEAD, "CODICIVAHEAD");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_CODICIVAHEAD, BUK_CODIATTIBOOK_SPAN_CODICEIVA, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice IVA", 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_CODICEIVA, "7D63C5D0-36F8-44D6-985E-3AC99DF57B73");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_CODICEIVA, "CODICEIVA");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_PAGEHEADER, BUK_CODIATTIBOOK_RPTBOX_PRORATHEADER, 12300, 0, 1170, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_PRORATHEADER, "9469F28F-302C-4518-9A6E-C8679CB00138");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_PRORATHEADER, "PRORATHEADER");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_PRORATHEADER, BUK_CODIATTIBOOK_SPAN_PRORATA, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Prorata", 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_PRORATA, "66EEECF5-AFCF-4929-A9B3-2FF5E2BE5F6B");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_PRORATA, "PRORATA");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_PAGEHEADER, BUK_CODIATTIBOOK_RPTBOX_TIPOLIQUHEAD, 13600, 0, 2200, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_TIPOLIQUHEAD, "CCC764F8-0AF1-4B84-936F-381BF23F9C2C");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_TIPOLIQUHEAD, "TIPOLIQUHEAD");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_TIPOLIQUHEAD, BUK_CODIATTIBOOK_SPAN_TIPOLIQUIDAZ, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Tipo Liquid.", 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_TIPOLIQUIDAZ, "A1548F2D-CC77-4AE5-B42B-6414D4AB5792");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_TIPOLIQUIDAZ, "TIPOLIQUIDAZ");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_PAGEHEADER, BUK_CODIATTIBOOK_RPTBOX_DETIVACI4HEA, 16100, 0, 2249, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_DETIVACI4HEA, "F1C9B3D5-FD1E-4D48-9F23-A8216E3F997F");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_DETIVACI4HEA, "DETIVACI4HEA");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_DETIVACI4HEA, BUK_CODIATTIBOOK_SPAN_DETRIVADACI4, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Detr. Iva da CI4", 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_DETRIVADACI4, "CFF1271D-94E4-4CD9-A021-0E6187BE863E");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_DETRIVADACI4, "DETRIVADACI4");
    BUK_CODIATTIBOOK.InitSection(BUK_CODIATTIBOOK_RPT_NEWREPORT, BUK_CODIATTIBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODIATTIBOOK.SetSectionRendersInto(BUK_CODIATTIBOOK_SEC_TITOLO, BUK_CODIATTIBOOK_RPTBOX_TITOLO);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SEC_TITOLO, "85E3085B-94D1-4AA1-B59F-31B5DAE68B82");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SEC_TITOLO, "TITOLO");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_TITOLO, BUK_CODIATTIBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_NEWBOX, "57144F59-9F34-4CDC-83E3-CACCF89783C9");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_NEWBOX, BUK_CODIATTIBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Attività I.V.A.", 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_VARIADIBILAN, "09333044-3C1E-4234-86CE-224281766C64");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_CODIATTIBOOK.InitSection(BUK_CODIATTIBOOK_RPT_NEWREPORT, BUK_CODIATTIBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODIATTIBOOK.SetSectionRendersInto(BUK_CODIATTIBOOK_SEC_DETAIL, BUK_CODIATTIBOOK_RPTBOX_PAGEBODY);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SEC_DETAIL, "CA2B3E4A-E26F-4413-B2F6-26BE85C30A1D");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SEC_DETAIL, "DETAIL");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_DETAIL, BUK_CODIATTIBOOK_RPTBOX_CODICE, 0, 0, 1200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_CODICE, "7B7DDD5C-D819-43A7-8C35-EC4504FD0EE8");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_CODICE, "CODICE");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_CODICE, BUK_CODIATTIBOOK_SPAN_T0COATCOATBO, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_T0COATCOATBO, "137F5728-F8AE-4666-B7F9-DBEB2F473E65");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_T0COATCOATBO, "T0COATCOATBO");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_DETAIL, BUK_CODIATTIBOOK_RPTBOX_DESCRIZIONE, 1400, 0, 8719, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_DESCRIZIONE, "ECD680D4-9F2A-46F2-A517-6E024BC7F575");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_DESCRIZIONE, BUK_CODIATTIBOOK_SPAN_T0DEATCOATBO, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_T0DEATCOATBO, "1DE4C929-2F21-4951-8469-607ECA0F8A8D");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_T0DEATCOATBO, "T0DEATCOATBO");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_DETAIL, BUK_CODIATTIBOOK_RPTBOX_CODICEIVA, 10400, 0, 1535, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_CODICEIVA, "FDC632A4-5F49-4C27-8910-59F7DA34FFAD");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_CODICEIVA, "CODICEIVA");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_CODICEIVA, BUK_CODIATTIBOOK_SPAN_T0COIVATCOAB, MyGlb.VIS_DEFAREPOSTYL, 5, 5, 0, 271384705, "Brief description of field content.", "::CODICE_IVA", 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_T0COIVATCOAB, "B0278467-9944-4D56-9D8F-A7F2D0CFC29B");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_T0COIVATCOAB, "T0COIVATCOAB");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_DETAIL, BUK_CODIATTIBOOK_RPTBOX_PRORATA, 12000, 0, 1147, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_PRORATA, "8BC02A24-3E3D-4847-B310-3B7239D9EBA2");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_PRORATA, "PRORATA");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_PRORATA, BUK_CODIATTIBOOK_SPAN_T0PRATCOATBO, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "Brief description of field content.", "::PRORATA", 1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_T0PRATCOATBO, "3A1ADA2E-2661-43B8-91F9-60AE52B5DD86");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_T0PRATCOATBO, "T0PRATCOATBO");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_DETAIL, BUK_CODIATTIBOOK_RPTBOX_TIPOLIQUIDAZ, 13600, 0, 2277, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_TIPOLIQUIDAZ, "9C9E8732-157D-4B10-9A68-3986EE1ADA3A");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_TIPOLIQUIDAZ, "TIPOLIQUIDAZ");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_TIPOLIQUIDAZ, BUK_CODIATTIBOOK_SPAN_T0TILIATCOAB, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::TIPO_LIQUIDAZIONE", 1);
    BUK_CODIATTIBOOK.SetSpanValueListItem(BUK_CODIATTIBOOK_SPAN_T0TILIATCOAB, "Mensile", "Type the value and explain what it means.", (new IDVariant("M")), null, "", -1);
    BUK_CODIATTIBOOK.SetSpanValueListItem(BUK_CODIATTIBOOK_SPAN_T0TILIATCOAB, "Trimestrale", "Type the value and explain what it means.", (new IDVariant("T")), null, "", -1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_T0TILIATCOAB, "4865113F-2E5D-40D8-B132-2A97DDCD3017");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_T0TILIATCOAB, "T0TILIATCOAB");
    BUK_CODIATTIBOOK.InitReportBox(BUK_CODIATTIBOOK_SEC_DETAIL, BUK_CODIATTIBOOK_RPTBOX_DETRIVACI4, 16900, 0, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_RPTBOX_DETRIVACI4, "E6EADD32-F458-4B0D-B83E-29F17799D85E");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_RPTBOX_DETRIVACI4, "DETRIVACI4");
    BUK_CODIATTIBOOK.InitBoxSpan(BUK_CODIATTIBOOK_RPTBOX_DETRIVACI4, BUK_CODIATTIBOOK_SPAN_NVTDIDCACABN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_CODIATTIBOOK.SetSpanValueListItem(BUK_CODIATTIBOOK_SPAN_NVTDIDCACABN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_CODIATTIBOOK.SetSpanValueListItem(BUK_CODIATTIBOOK_SPAN_NVTDIDCACABN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SPAN_NVTDIDCACABN, "8547663D-875B-4B90-AB72-69F1FF4707D8");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SPAN_NVTDIDCACABN, "NVTDIDCACABN");
    BUK_CODIATTIBOOK.InitSection(BUK_CODIATTIBOOK_RPT_NEWREPORT, BUK_CODIATTIBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODIATTIBOOK.SetSectionRendersInto(BUK_CODIATTIBOOK_SEC_PAGEFOOTER, BUK_CODIATTIBOOK_RPTBOX_PAGEFOOTER);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SEC_PAGEFOOTER, "05FF554B-534A-4ED0-8B50-BE1C7F268D1B");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CODIATTIBOOK.InitSection(BUK_CODIATTIBOOK_RPT_NEWREPORT, BUK_CODIATTIBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODIATTIBOOK.SetSectionRendersInto(BUK_CODIATTIBOOK_SEC_REPORTFOOTER, BUK_CODIATTIBOOK_RPTBOX_PAGEBODY);
    BUK_CODIATTIBOOK.SetRTCGuid(BUK_CODIATTIBOOK_SEC_REPORTFOOTER, "C691461E-F8A6-4DFC-86B4-62D0F37E30BF");
    BUK_CODIATTIBOOK.SetObjCode(BUK_CODIATTIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CODIATTIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CODIATTIBOOK_InitLinks()
  {
    BUK_CODIATTIBOOK.SetBoxNextBox(BUK_CODIATTIBOOK_RPTBOX_PAGEBODY, BUK_CODIATTIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ATTIVITA) PAN_ATTIVITA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ATTIVITA) PAN_ATTIVITA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ATTIVITA) PAN_ATTIVITA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ATTIVITA) PAN_ATTIVITA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ATTIVITA) PAN_ATTIVITA_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_ATTIVITA) PAN_ATTIVITA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CODIATTIBOOK) BUK_CODIATTIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CODIATTIBOOK) BUK_CODIATTIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CODIATTIBOOK) BUK_CODIATTIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CODIATTIBOOK) BUK_CODIATTIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CODIATTIBOOK) BUK_CODIATTIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CODIATTIBOOK) BUK_CODIATTIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CODIATTIBOOK) BUK_CODIATTIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CODIATTIBOOK) BUK_CODIATTIBOOK_OnPreview();
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
