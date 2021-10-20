// **********************************************
// Cge Cgu
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CgeCgu extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CODICIGESTIO_ENTRATOSPESA = 0;
  private static int PFL_CODICIGESTIO_CODICE = 1;
  private static int PFL_CODICIGESTIO_DESCRIZIONE = 2;
  private static int PFL_CODICIGESTIO_SCADENZA = 3;
  private static int PFL_CODICIGESTIO_UTENTEINSERI = 4;
  private static int PFL_CODICIGESTIO_DATAINSERIME = 5;
  private static int PFL_CODICIGESTIO_UTENTULTIAGG = 6;
  private static int PFL_CODICIGESTIO_DATAULTIMAGG = 7;

  private static int PPQRY_CODICIGESTI1 = 0;


  IDPanel PAN_CODICIGESTIO;
  CIDREObj BUK_CODIGESTBOOK;
  OBook BKW_CODIGESTBOOK;
  //
  // Template Pages constants
  private static int BUK_CODIGESTBOOK_MST_CODGESBOOPAG = 1;
  private static int BUK_CODIGESTBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CODIGESTBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CODIGESTBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_CODIGESTBOOK_RPTBOX_PAGEBODY = 5;

  //
  // Reports constants
  private static int BUK_CODIGESTBOOK_RPT_NEWREPORT = 6;
  private static int BUK_CODIGESTBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_CODIGESTBOOK_SEC_TITOLO = 8;
  private static int BUK_CODIGESTBOOK_RPTBOX_TITOLO3 = 9;
  private static int BUK_CODIGESTBOOK_SPAN_FUNZIOESERVI = 10;
  private static int BUK_CODIGESTBOOK_SEC_PAGEHEADER = 11;
  private static int BUK_CODIGESTBOOK_RPTBOX_ENTRATOSPESA = 12;
  private static int BUK_CODIGESTBOOK_SPAN_ENTRATOSPESA = 13;
  private static int BUK_CODIGESTBOOK_RPTBOX_CODICE1 = 14;
  private static int BUK_CODIGESTBOOK_SPAN_CODICE = 15;
  private static int BUK_CODIGESTBOOK_RPTBOX_DESCRIHEADER = 16;
  private static int BUK_CODIGESTBOOK_SPAN_DESCRIZIONE = 17;
  private static int BUK_CODIGESTBOOK_RPTBOX_SCADENZA1 = 18;
  private static int BUK_CODIGESTBOOK_SPAN_SCADENZA = 19;
  private static int BUK_CODIGESTBOOK_SEC_DETAIL = 20;
  private static int BUK_CODIGESTBOOK_RPTBOX_ES = 21;
  private static int BUK_CODIGESTBOOK_SPAN_COGEEOSCCCGB = 22;
  private static int BUK_CODIGESTBOOK_RPTBOX_CODICE = 23;
  private static int BUK_CODIGESTBOOK_SPAN_COGECOCGCCGB = 24;
  private static int BUK_CODIGESTBOOK_RPTBOX_DESCRIZIONE = 25;
  private static int BUK_CODIGESTBOOK_SPAN_COGEDECGCCGB = 26;
  private static int BUK_CODIGESTBOOK_RPTBOX_SCADENZA = 27;
  private static int BUK_CODIGESTBOOK_SPAN_COGESCCGCCGB = 28;
  private static int BUK_CODIGESTBOOK_SEC_PAGEFOOTER = 29;
  private static int BUK_CODIGESTBOOK_SEC_REPORTFOOTER = 30;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_CODICIGESTI1(IMDB);
    Init_PQRY_CODICIGESTI3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_CODICIGESTI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_CODICIGESTI1, 8);
    IMDB.set_TblCode(IMDBDef8.PQRY_CODICIGESTI1, "PQRY_CODICIGESTI1");
    IMDB.set_FldCode(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_CODICE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_SCADENZA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_CODICIGESTI1,IMDBDef8.PQSL_CODICIGESTI1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_CODICIGESTI1, 0);
  }

  private static void Init_PQRY_CODICIGESTI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_CODICIGESTI3, 4);
    IMDB.set_TblCode(IMDBDef8.PQRY_CODICIGESTI3, "PQRY_CODICIGESTI3");
    IMDB.set_FldCode(IMDBDef8.PQRY_CODICIGESTI3,IMDBDef8.PQSL_CODICIGESTI3_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_CODICIGESTI3,IMDBDef8.PQSL_CODICIGESTI3_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CODICIGESTI3,IMDBDef8.PQSL_CODICIGESTI3_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CODICIGESTI3,IMDBDef8.PQSL_CODICIGESTI3_CODICE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CODICIGESTI3,IMDBDef8.PQSL_CODICIGESTI3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CODICIGESTI3,IMDBDef8.PQSL_CODICIGESTI3_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CODICIGESTI3,IMDBDef8.PQSL_CODICIGESTI3_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_CODICIGESTI3,IMDBDef8.PQSL_CODICIGESTI3_SCADENZA,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_CODICIGESTI3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CgeCgu(MyWebEntryPoint w, IMDBObj imdb)
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
  public CgeCgu()
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
    FormIdx = MyGlb.FRM_CGECGU;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "AADB5B57-2106-48C7-BB4A-2B0B52B796C8";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 684;
    DesignHeight = 398;
    set_Caption(new IDVariant("Cge Cgu"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 684;
    Frames[1].Height = 372;
    Frames[1].Caption = "Codici Gestionali";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 372;
    PAN_CODICIGESTIO = new IDPanel(w, this, 1, "PAN_CODICIGESTIO");
    Frames[1].Content = PAN_CODICIGESTIO;
    PAN_CODICIGESTIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CODICIGESTIO.VS = MainFrm.VisualStyleList;
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 684-MyGlb.PAN_OFFS_X, 372-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CODIGESTBOOK != null)
      PAN_CODICIGESTIO.SetBook(BUK_CODIGESTBOOK);
    PAN_CODICIGESTIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3980BCE4-76CB-4A41-AB6F-BF267C8F8E83");
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 624, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CODICIGESTIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CODICIGESTIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CODICIGESTIO.InitStatus = 2;
    PAN_CODICIGESTIO_Init();
    PAN_CODICIGESTIO_InitFields();
    PAN_CODICIGESTIO_InitQueries();
    BKW_CODIGESTBOOK = new OBook(this);
    BUK_CODIGESTBOOK = new CIDREObj(BKW_CODIGESTBOOK);
    BKW_CODIGESTBOOK.iGuid = "D06E9947-833A-4056-86F4-3BD039B06E14";
    BKW_CODIGESTBOOK.Code = "BUK_CODIGESTBOOK";
    BKW_CODIGESTBOOK.BookObj = BUK_CODIGESTBOOK;
    BKW_CODIGESTBOOK.InitDefMasks();
    BUK_CODIGESTBOOK.InitBook(1, 1245185, "Codici Gestionali Book", IMDB, MainFrm.VisualStyleList);
    BUK_CODIGESTBOOK.InitHTML();
    BUK_CODIGESTBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CODIGESTBOOK.Book.SetMainFrm(MainFrm);
    BUK_CODIGESTBOOK.SetRTCGuid(0, "D06E9947-833A-4056-86F4-3BD039B06E14");
    BUK_CODIGESTBOOK.SetObjCode(0, "CODIGESTBOOK");
    if (PAN_CODICIGESTIO != null)
      PAN_CODICIGESTIO.SetBook(BUK_CODIGESTBOOK);
    BUK_CODIGESTBOOK_MST_CODGESBOOPAG_Init();
    BUK_CODIGESTBOOK_RPT_NEWREPORT_Init();
    BUK_CODIGESTBOOK_InitLinks();
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
      PAN_CODICIGESTIO.UpdatePanel(MainFrm);
      // BUK_CODIGESTBOOK.UpdateBook();
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
    if (Code.equals("BUK_CODIGESTBOOK")) return BUK_CODIGESTBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof CgeCgu);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CgeCgu.class.getName() : (Glb.ClassWithPackage(CgeCgu.class) ? CgeCgu.class.getName().substring(CgeCgu.class.getPackage().getName().length() + 1) : CgeCgu.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Codici Gestionali On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CODICIGESTIO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CODICIGESTIO);
      // 
      // Codici Gestionali On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_CODICIGESTIO.IsNewRow())
      {
        PAN_CODICIGESTIO.SetFlags (Glb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CODICIGESTIO.SetFlags (Glb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CODICIGESTIO.SetFlags (Glb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CODICIGESTIO.SetFlags (Glb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_CODICIGESTIO.set_ToolTip(Glb.OBJ_FIELD,PFL_CODICIGESTIO_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_CODICIGESTI1, IMDBDef8.PQSL_CODICIGESTI1_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CgeCgu", "CodiciGestionaliOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Codici Gestionali On Database Error Event
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
  private void PAN_CODICIGESTIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CODICIGESTIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Codici Gestionali On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CgeCgu", "CodiciGestionaliOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Codici Gestionali On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CODICIGESTIO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Codici Gestionali On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_CODICIGESTI1, IMDBDef8.PQSL_CODICIGESTI1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_CODICIGESTI1, IMDBDef8.PQSL_CODICIGESTI1_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_CODICIGESTI1, IMDBDef8.PQSL_CODICIGESTI1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_CODICIGESTI1, IMDBDef8.PQSL_CODICIGESTI1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_CODICIGESTI1, IMDBDef8.PQSL_CODICIGESTI1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_CODICIGESTI1, IMDBDef8.PQSL_CODICIGESTI1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CgeCgu", "CodiciGestionaliOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Cge Cgu Scadenza Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CODICIGESTIO_SCADENZA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cge Cgu Scadenza Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_CODICIGESTI1, IMDBDef8.PQSL_CODICIGESTI1_SCADENZA, 0))) && IMDB.Value(IMDBDef8.PQRY_CODICIGESTI1, IMDBDef8.PQSL_CODICIGESTI1_SCADENZA, 0).compareTo((new IDVariant(2006)), true)<0)
      {
        IDVariant v_MESSASSIO = new IDVariant(0,IDVariant.STRING);
        v_MESSASSIO = (new IDVariant("La scadenza non puo essere minore del 2006!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MESSASSIO); 
        Cancel.set((new IDVariant(-1)));
        return;
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CgeCgu", "CgeCguScadenzaValidateEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Codici Gestionali", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CgeCgu", "LoadEvent", _e);
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
  private void PAN_CODICIGESTIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CODICIGESTIO, Cancel);
    // Stub
  }

  private void PAN_CODICIGESTIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CODICIGESTIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CODICIGESTIO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CODICIGESTIO_SCADENZA)
      {
        PFL_CODICIGESTIO_SCADENZA_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_CODICIGESTIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CODICIGESTIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CODIGESTBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CODIGESTBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CODIGESTBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_CODIGESTBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CODIGESTBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CODIGESTBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_CODIGESTBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CODIGESTBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CODIGESTBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CODIGESTBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CODIGESTBOOK_MST_CODGESBOOPAG)
    {
      BUK_CODIGESTBOOK.set_SpanValue(BUK_CODIGESTBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CODIGESTBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CODIGESTBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CODIGESTBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CODIGESTBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CODIGESTBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CODIGESTBOOK_OnPreview()
  {
    PreviewBook = BKW_CODIGESTBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CODICIGESTIO_Init()
  {

    PAN_CODICIGESTIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CODICIGESTIO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CODICIGESTIO.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_CODICIGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, "B7F1AF6C-0CB2-42E5-941C-03A8483FB7C4");
    PAN_CODICIGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, "Entrata o Spesa");
    PAN_CODICIGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, "");
    PAN_CODICIGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CODICIGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, "109EC554-2ACB-4394-85B0-B5D0EFB7E772");
    PAN_CODICIGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, "Codice");
    PAN_CODICIGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, "");
    PAN_CODICIGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CODICIGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, "484B5F71-29F7-48CD-B65F-350D01F5DDB4");
    PAN_CODICIGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, "Descrizione");
    PAN_CODICIGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, "");
    PAN_CODICIGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CODICIGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, "D63D0EBB-2269-4398-A066-BC861BA03117");
    PAN_CODICIGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, "Scadenza");
    PAN_CODICIGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, "");
    PAN_CODICIGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICIGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, "028EF264-1D9B-4A69-B7E7-E05B1ABB76D1");
    PAN_CODICIGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CODICIGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, "");
    PAN_CODICIGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_CODICIGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, "2689313C-CA2B-4E94-8F60-0E1E54686EB8");
    PAN_CODICIGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CODICIGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, "");
    PAN_CODICIGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CODICIGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, "494AABE6-677C-4EA4-ADDC-3653F63A7A00");
    PAN_CODICIGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CODICIGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, "");
    PAN_CODICIGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CODICIGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CODICIGESTIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, "F2266E86-8E20-4BA5-9F2B-871794088841");
    PAN_CODICIGESTIO.set_Header(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CODICIGESTIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, "");
    PAN_CODICIGESTIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CODICIGESTIO.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CODICIGESTIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, MyGlb.PANEL_LIST, 24);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, MyGlb.PANEL_LIST, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, MyGlb.PANEL_LIST, "Entrata o Spesa");
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, MyGlb.PANEL_FORM, 88);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, MyGlb.PANEL_FORM, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_ENTRATOSPESA, MyGlb.PANEL_FORM, "Entr. o Spesa");
    PAN_CODICIGESTIO.SetFieldPage(PFL_CODICIGESTIO_ENTRATOSPESA, -1, -1);
    PAN_CODICIGESTIO.SetFieldPanel(PFL_CODICIGESTIO_ENTRATOSPESA, PPQRY_CODICIGESTI1, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_CODICIGESTIO.SetValueListItem(PFL_CODICIGESTIO_ENTRATOSPESA, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_CODICIGESTIO.SetValueListItem(PFL_CODICIGESTIO_ENTRATOSPESA, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, MyGlb.PANEL_LIST, 64, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, MyGlb.PANEL_FORM, 4, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CODICIGESTIO.SetFieldPage(PFL_CODICIGESTIO_CODICE, -1, -1);
    PAN_CODICIGESTIO.SetFieldPanel(PFL_CODICIGESTIO_CODICE, PPQRY_CODICIGESTI1, "A.CODICE", "CODICE", 1, 4, 0, -13997);
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, MyGlb.PANEL_LIST, 124, 36, 436, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CODICIGESTIO.SetFieldPage(PFL_CODICIGESTIO_DESCRIZIONE, -1, -1);
    PAN_CODICIGESTIO.SetFieldPanel(PFL_CODICIGESTIO_DESCRIZIONE, PPQRY_CODICIGESTI1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, MyGlb.PANEL_LIST, 560, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, MyGlb.PANEL_FORM, 4, 76, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, MyGlb.PANEL_FORM, 88);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_CODICIGESTIO.SetFieldPage(PFL_CODICIGESTIO_SCADENZA, -1, -1);
    PAN_CODICIGESTIO.SetFieldPanel(PFL_CODICIGESTIO_SCADENZA, PPQRY_CODICIGESTI1, "A.SCADENZA", "SCADENZA", 1, 4, 0, -13997);
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, MyGlb.PANEL_LIST, 620, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 100, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_CODICIGESTIO.SetFieldPage(PFL_CODICIGESTIO_UTENTEINSERI, -1, -1);
    PAN_CODICIGESTIO.SetFieldPanel(PFL_CODICIGESTIO_UTENTEINSERI, PPQRY_CODICIGESTI1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, MyGlb.PANEL_LIST, 740, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, MyGlb.PANEL_FORM, 4, 124, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_CODICIGESTIO.SetFieldPage(PFL_CODICIGESTIO_DATAINSERIME, -1, -1);
    PAN_CODICIGESTIO.SetFieldPanel(PFL_CODICIGESTIO_DATAINSERIME, PPQRY_CODICIGESTI1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, MyGlb.PANEL_LIST, 848, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 148, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_CODICIGESTIO.SetFieldPage(PFL_CODICIGESTIO_UTENTULTIAGG, -1, -1);
    PAN_CODICIGESTIO.SetFieldPanel(PFL_CODICIGESTIO_UTENTULTIAGG, PPQRY_CODICIGESTI1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, MyGlb.PANEL_LIST, 960, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_CODICIGESTIO.SetRect(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 172, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICIGESTIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_CODICIGESTIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CODICIGESTIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICIGESTIO_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_CODICIGESTIO.SetFieldPage(PFL_CODICIGESTIO_DATAULTIMAGG, -1, -1);
    PAN_CODICIGESTIO.SetFieldPanel(PFL_CODICIGESTIO_DATAULTIMAGG, PPQRY_CODICIGESTI1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_CODICIGESTIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_CODICIGESTIO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CODICIGESTIO.SetIMDB(IMDB, "PQRY_CODICIGESTI1", true);
    PAN_CODICIGESTIO.set_SetString(MyGlb.MASTER_ROWNAME, "CODICI GESTIONALI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.SCADENZA as SCADENZA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CODICIGESTIO.SetQuery(PPQRY_CODICIGESTI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CODICI_GESTIONALI A ");
    PAN_CODICIGESTIO.SetQuery(PPQRY_CODICIGESTI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CODICIGESTIO.SetQuery(PPQRY_CODICIGESTI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CODICIGESTIO.SetQuery(PPQRY_CODICIGESTI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CODICIGESTIO.SetQuery(PPQRY_CODICIGESTI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CODICE ");
    PAN_CODICIGESTIO.SetQuery(PPQRY_CODICIGESTI1, 5, SQL, -1, "");
    PAN_CODICIGESTIO.SetQueryDB(PPQRY_CODICIGESTI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CODICIGESTIO.SetMasterTable(0, "CODICI_GESTIONALI");
    PAN_CODICIGESTIO.AddToSortList(PFL_CODICIGESTIO_ENTRATOSPESA, true);
    PAN_CODICIGESTIO.AddToSortList(PFL_CODICIGESTIO_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CODICIGESTIO.Status() == 2)
    {
      int oldListQBE = PAN_CODICIGESTIO.iUseListQBE;
      PAN_CODICIGESTIO.iUseListQBE = 0;
      PAN_CODICIGESTIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_CODICIGESTIO.PanelCommand(Glb.PCM_FIND);
      PAN_CODICIGESTIO.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CODIGESTBOOK_MST_CODGESBOOPAG_Init()
  {
    BUK_CODIGESTBOOK.InitMastro(BUK_CODIGESTBOOK_MST_CODGESBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_MST_CODGESBOOPAG, "A743902B-95B4-4A26-B616-E048895C9C3F");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_MST_CODGESBOOPAG, "CODGESBOOPAG");
    BUK_CODIGESTBOOK.InitMastroBox(BUK_CODIGESTBOOK_MST_CODGESBOOPAG, BUK_CODIGESTBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPTBOX_NUMEROPAGINA, "E7434E33-E9A1-4FBB-8A61-42864B3F5F17");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CODIGESTBOOK.InitBoxSpan(BUK_CODIGESTBOOK_RPTBOX_NUMEROPAGINA, BUK_CODIGESTBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SPAN_NUMEROPAGINA, "94B3BA0E-E071-45A5-BE71-63DDB7C97F9D");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CODIGESTBOOK.InitMastroBox(BUK_CODIGESTBOOK_MST_CODGESBOOPAG, BUK_CODIGESTBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 1100, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPTBOX_PAGEHEADER, "A2BE88E4-7C1E-4055-B160-336A2378EE01");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_CODIGESTBOOK.InitMastroBox(BUK_CODIGESTBOOK_MST_CODGESBOOPAG, BUK_CODIGESTBOOK_RPTBOX_PAGEBODY, 1000, 2200, 19000, 26300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPTBOX_PAGEBODY, "E27C843B-F52F-41E6-A064-71B7C57F53EF");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_CODIGESTBOOK_RPT_NEWREPORT_InitQuery() { BUK_CODIGESTBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CODIGESTBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.SCADENZA as SCADENZA ");
      SQL.append("from ");
      SQL.append("  CODICI_GESTIONALI A ");
      SQL.append("order by ");
      SQL.append("  A.E_S, ");
      SQL.append("  A.CODICE ");
      BUK_CODIGESTBOOK.SetReportQuery(BUK_CODIGESTBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "B0BD6F66-6161-4E8F-B7A8-96EABDC17364");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CODIGESTBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CODIGESTBOOK.InitReport(BUK_CODIGESTBOOK_RPT_NEWREPORT, 196609);
    BUK_CODIGESTBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPT_NEWREPORT, "5B36CFAD-3D41-40DB-9199-C353AC5D40AE");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CODIGESTBOOK.InitSection(BUK_CODIGESTBOOK_RPT_NEWREPORT, BUK_CODIGESTBOOK_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODIGESTBOOK.SetSectionRendersInto(BUK_CODIGESTBOOK_SEC_REPORTHEADER, BUK_CODIGESTBOOK_RPTBOX_PAGEBODY);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SEC_REPORTHEADER, "8EEC5C79-7D8F-43F0-B969-65156879CF5F");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_CODIGESTBOOK.InitSection(BUK_CODIGESTBOOK_RPT_NEWREPORT, BUK_CODIGESTBOOK_SEC_TITOLO, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_CODIGESTBOOK.SetSectionRendersInto(BUK_CODIGESTBOOK_SEC_TITOLO, BUK_CODIGESTBOOK_RPTBOX_PAGEHEADER);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SEC_TITOLO, "D4153EF7-73D9-4EC9-AAA6-014C9873333E");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SEC_TITOLO, "TITOLO");
    BUK_CODIGESTBOOK.InitReportBox(BUK_CODIGESTBOOK_SEC_TITOLO, BUK_CODIGESTBOOK_RPTBOX_TITOLO3, 0, 100, 19000, 900, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPTBOX_TITOLO3, "1B6AED0D-5924-4B82-B94B-B0DCA6B9BE55");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPTBOX_TITOLO3, "TITOLO3");
    BUK_CODIGESTBOOK.InitBoxSpan(BUK_CODIGESTBOOK_RPTBOX_TITOLO3, BUK_CODIGESTBOOK_SPAN_FUNZIOESERVI, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Cge/Cgu", 1);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SPAN_FUNZIOESERVI, "EFDC66A0-B9CA-4E08-B059-7C91726AD161");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SPAN_FUNZIOESERVI, "FUNZIOESERVI");
    BUK_CODIGESTBOOK.InitSection(BUK_CODIGESTBOOK_RPT_NEWREPORT, BUK_CODIGESTBOOK_SEC_PAGEHEADER, 500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODIGESTBOOK.SetSectionRendersInto(BUK_CODIGESTBOOK_SEC_PAGEHEADER, BUK_CODIGESTBOOK_RPTBOX_PAGEBODY);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SEC_PAGEHEADER, "ED647524-EAA3-4019-99F5-2C300CA9CA99");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CODIGESTBOOK.InitReportBox(BUK_CODIGESTBOOK_SEC_PAGEHEADER, BUK_CODIGESTBOOK_RPTBOX_ENTRATOSPESA, 0, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPTBOX_ENTRATOSPESA, "EB4B994E-EDE5-4D4F-AC64-73FEEA2DCB48");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPTBOX_ENTRATOSPESA, "ENTRATOSPESA");
    BUK_CODIGESTBOOK.InitBoxSpan(BUK_CODIGESTBOOK_RPTBOX_ENTRATOSPESA, BUK_CODIGESTBOOK_SPAN_ENTRATOSPESA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Entrata o Spesa", 1);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SPAN_ENTRATOSPESA, "C7DA136E-D62F-453D-AA20-5E50F6EE508B");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SPAN_ENTRATOSPESA, "ENTRATOSPESA");
    BUK_CODIGESTBOOK.InitReportBox(BUK_CODIGESTBOOK_SEC_PAGEHEADER, BUK_CODIGESTBOOK_RPTBOX_CODICE1, 2800, 0, 1507, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPTBOX_CODICE1, "B33358CC-4181-4082-9619-51250D472ECC");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPTBOX_CODICE1, "CODICE1");
    BUK_CODIGESTBOOK.InitBoxSpan(BUK_CODIGESTBOOK_RPTBOX_CODICE1, BUK_CODIGESTBOOK_SPAN_CODICE, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SPAN_CODICE, "4BF1E054-BC0E-4003-8163-5CEF21D59C97");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SPAN_CODICE, "CODICE");
    BUK_CODIGESTBOOK.InitReportBox(BUK_CODIGESTBOOK_SEC_PAGEHEADER, BUK_CODIGESTBOOK_RPTBOX_DESCRIHEADER, 4400, 0, 11520, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPTBOX_DESCRIHEADER, "B3B32CE6-1CCE-42FA-9DAF-D4F10A187CCE");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_CODIGESTBOOK.InitBoxSpan(BUK_CODIGESTBOOK_RPTBOX_DESCRIHEADER, BUK_CODIGESTBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SPAN_DESCRIZIONE, "3EB756FA-8459-469D-A597-6F794BE43D2F");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CODIGESTBOOK.InitReportBox(BUK_CODIGESTBOOK_SEC_PAGEHEADER, BUK_CODIGESTBOOK_RPTBOX_SCADENZA1, 16000, 0, 1684, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 917505, 340, "", 1, -33);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPTBOX_SCADENZA1, "05CDA4C3-9C9E-42CE-83DC-ABB9374A4B21");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPTBOX_SCADENZA1, "SCADENZA1");
    BUK_CODIGESTBOOK.InitBoxSpan(BUK_CODIGESTBOOK_RPTBOX_SCADENZA1, BUK_CODIGESTBOOK_SPAN_SCADENZA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Scadenza", 1);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SPAN_SCADENZA, "DE432134-BD3A-4930-809A-D42AD93C75D7");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SPAN_SCADENZA, "SCADENZA");
    BUK_CODIGESTBOOK.InitSection(BUK_CODIGESTBOOK_RPT_NEWREPORT, BUK_CODIGESTBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODIGESTBOOK.SetSectionRendersInto(BUK_CODIGESTBOOK_SEC_DETAIL, BUK_CODIGESTBOOK_RPTBOX_PAGEBODY);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SEC_DETAIL, "0445BD69-C546-4BED-B131-C40A9D39BF30");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SEC_DETAIL, "DETAIL");
    BUK_CODIGESTBOOK.InitReportBox(BUK_CODIGESTBOOK_SEC_DETAIL, BUK_CODIGESTBOOK_RPTBOX_ES, 0, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPTBOX_ES, "856FFA27-52B0-4164-9808-E46961EC372E");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPTBOX_ES, "ES");
    BUK_CODIGESTBOOK.InitBoxSpan(BUK_CODIGESTBOOK_RPTBOX_ES, BUK_CODIGESTBOOK_SPAN_COGEEOSCCCGB, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::E_S", 1);
    BUK_CODIGESTBOOK.SetSpanValueListItem(BUK_CODIGESTBOOK_SPAN_COGEEOSCCCGB, "Entrata", "Parte Entrata", (new IDVariant("E")), null, "", -1);
    BUK_CODIGESTBOOK.SetSpanValueListItem(BUK_CODIGESTBOOK_SPAN_COGEEOSCCCGB, "Spesa", "Parte Spesa", (new IDVariant("S")), null, "", -1);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SPAN_COGEEOSCCCGB, "3F77AD68-846D-4FE7-ADB9-BF4017A21D85");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SPAN_COGEEOSCCCGB, "COGEEOSCCCGB");
    BUK_CODIGESTBOOK.InitReportBox(BUK_CODIGESTBOOK_SEC_DETAIL, BUK_CODIGESTBOOK_RPTBOX_CODICE, 2800, 0, 1507, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPTBOX_CODICE, "511E5203-253A-4424-A8F7-A429E4263BFF");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPTBOX_CODICE, "CODICE");
    BUK_CODIGESTBOOK.InitBoxSpan(BUK_CODIGESTBOOK_RPTBOX_CODICE, BUK_CODIGESTBOOK_SPAN_COGECOCGCCGB, MyGlb.VIS_CAMSENBORCEN, 1, 4, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SPAN_COGECOCGCCGB, "C93D51AD-E071-4DD6-A441-064C794E4813");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SPAN_COGECOCGCCGB, "COGECOCGCCGB");
    BUK_CODIGESTBOOK.InitReportBox(BUK_CODIGESTBOOK_SEC_DETAIL, BUK_CODIGESTBOOK_RPTBOX_DESCRIZIONE, 4400, 0, 11520, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPTBOX_DESCRIZIONE, "36170203-B348-4ABD-8F51-151AA59F0042");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_CODIGESTBOOK.InitBoxSpan(BUK_CODIGESTBOOK_RPTBOX_DESCRIZIONE, BUK_CODIGESTBOOK_SPAN_COGEDECGCCGB, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SPAN_COGEDECGCCGB, "47F9E14A-A721-4E80-8610-080AE88CB076");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SPAN_COGEDECGCCGB, "COGEDECGCCGB");
    BUK_CODIGESTBOOK.InitReportBox(BUK_CODIGESTBOOK_SEC_DETAIL, BUK_CODIGESTBOOK_RPTBOX_SCADENZA, 16000, 0, 1684, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 917505, 322, "", 1, -33);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_RPTBOX_SCADENZA, "3739575C-A553-46CF-8294-EE053683B633");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_RPTBOX_SCADENZA, "SCADENZA");
    BUK_CODIGESTBOOK.InitBoxSpan(BUK_CODIGESTBOOK_RPTBOX_SCADENZA, BUK_CODIGESTBOOK_SPAN_COGESCCGCCGB, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "Brief description of field content.", "::SCADENZA", 1);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SPAN_COGESCCGCCGB, "C2C3EA8A-2898-41DB-856F-16C96C3D08A6");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SPAN_COGESCCGCCGB, "COGESCCGCCGB");
    BUK_CODIGESTBOOK.InitSection(BUK_CODIGESTBOOK_RPT_NEWREPORT, BUK_CODIGESTBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CODIGESTBOOK.SetSectionRendersInto(BUK_CODIGESTBOOK_SEC_PAGEFOOTER, BUK_CODIGESTBOOK_RPTBOX_PAGEBODY);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SEC_PAGEFOOTER, "FD76F21E-EB8D-4414-9C55-75D2DFFC427E");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CODIGESTBOOK.InitSection(BUK_CODIGESTBOOK_RPT_NEWREPORT, BUK_CODIGESTBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CODIGESTBOOK.SetSectionRendersInto(BUK_CODIGESTBOOK_SEC_REPORTFOOTER, BUK_CODIGESTBOOK_RPTBOX_PAGEBODY);
    BUK_CODIGESTBOOK.SetRTCGuid(BUK_CODIGESTBOOK_SEC_REPORTFOOTER, "7E792CD0-6028-4710-B561-2734836A3DAD");
    BUK_CODIGESTBOOK.SetObjCode(BUK_CODIGESTBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CODIGESTBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CODIGESTBOOK_InitLinks()
  {
    BUK_CODIGESTBOOK.SetBoxNextBox(BUK_CODIGESTBOOK_RPTBOX_PAGEBODY, BUK_CODIGESTBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CODICIGESTIO) PAN_CODICIGESTIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CODICIGESTIO) PAN_CODICIGESTIO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CODICIGESTIO) PAN_CODICIGESTIO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CODICIGESTIO) PAN_CODICIGESTIO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CODICIGESTIO) PAN_CODICIGESTIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CODIGESTBOOK) BUK_CODIGESTBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CODIGESTBOOK) BUK_CODIGESTBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CODIGESTBOOK) BUK_CODIGESTBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CODIGESTBOOK) BUK_CODIGESTBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CODIGESTBOOK) BUK_CODIGESTBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CODIGESTBOOK) BUK_CODIGESTBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CODIGESTBOOK) BUK_CODIGESTBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CODIGESTBOOK) BUK_CODIGESTBOOK_OnPreview();
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
