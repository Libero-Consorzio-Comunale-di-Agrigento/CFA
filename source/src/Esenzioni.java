// **********************************************
// Esenzioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Esenzioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ESENZIONI_CODICE = 0;
  private static int PFL_ESENZIONI_DESCRIZIONE = 1;
  private static int PFL_ESENZIONI_FUORICIVA = 2;
  private static int PFL_ESENZIONI_TIPOECF = 3;
  private static int PFL_ESENZIONI_UTENTEINSERI = 4;
  private static int PFL_ESENZIONI_DATAINSERIME = 5;
  private static int PFL_ESENZIONI_UTENTULTIAGG = 6;
  private static int PFL_ESENZIONI_DATAULTIMAGG = 7;
  private static int PFL_ESENZIONI_CODICEFE = 8;

  private static int PPQRY_T7 = 0;


  IDPanel PAN_ESENZIONI;
  CIDREObj BUK_ESENZIONBOOK;
  OBook BKW_ESENZIONBOOK;
  //
  // Template Pages constants
  private static int BUK_ESENZIONBOOK_MST_ESENBOOKPAGE = 1;
  private static int BUK_ESENZIONBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_ESENZIONBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_ESENZIONBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_ESENZIONBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_ESENZIONBOOK_RPT_NEWREPORT = 6;
  private static int BUK_ESENZIONBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_ESENZIONBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_ESENZIONBOOK_SPAN_CODICE = 9;
  private static int BUK_ESENZIONBOOK_RPTBOX_DESCRIHEADER = 10;
  private static int BUK_ESENZIONBOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_ESENZIONBOOK_RPTBOX_TIPOHEADER = 12;
  private static int BUK_ESENZIONBOOK_SPAN_FUORICIVA = 13;
  private static int BUK_ESENZIONBOOK_RPTBOX_TIPOECFHEADE = 14;
  private static int BUK_ESENZIONBOOK_SPAN_TIPOECF = 15;
  private static int BUK_ESENZIONBOOK_SEC_TITOLO = 16;
  private static int BUK_ESENZIONBOOK_RPTBOX_NEWBOX = 17;
  private static int BUK_ESENZIONBOOK_SPAN_VARIADIBILAN = 18;
  private static int BUK_ESENZIONBOOK_SEC_DETAIL = 19;
  private static int BUK_ESENZIONBOOK_RPTBOX_CODICE = 20;
  private static int BUK_ESENZIONBOOK_SPAN_T06CODESESBO = 21;
  private static int BUK_ESENZIONBOOK_RPTBOX_DESCRIZIONE = 22;
  private static int BUK_ESENZIONBOOK_SPAN_T06DESESESBO = 23;
  private static int BUK_ESENZIONBOOK_RPTBOX_TIPO = 24;
  private static int BUK_ESENZIONBOOK_SPAN_IETFCIEEBUSN = 25;
  private static int BUK_ESENZIONBOOK_RPTBOX_TIPOECF = 26;
  private static int BUK_ESENZIONBOOK_SPAN_T0TIECFESESB = 27;
  private static int BUK_ESENZIONBOOK_SEC_REPORTFOOTER = 28;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T7(IMDB);
    Init_PQRY_T06(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T7, 9);
    IMDB.set_TblCode(IMDBDef9.PQRY_T7, "PQRY_T7");
    IMDB.set_FldCode(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_DESCRIZIONE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_TIPO,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_TIPO_ECF, "TIPO_ECF");
    IMDB.SetFldParams(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_TIPO_ECF,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_CODICE_FE, "CODICE_FE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T7,IMDBDef9.PQSL_T7_CODICE_FE,5,20,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T7, 0);
  }

  private static void Init_PQRY_T06(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T06, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_T06, "PQRY_T06");
    IMDB.set_FldCode(IMDBDef9.PQRY_T06,IMDBDef9.PQSL_T06_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T06,IMDBDef9.PQSL_T06_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T06,IMDBDef9.PQSL_T06_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T06,IMDBDef9.PQSL_T06_DESCRIZIONE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T06,IMDBDef9.PQSL_T06_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T06,IMDBDef9.PQSL_T06_TIPO,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T06,IMDBDef9.PQSL_T06_TIPO_ECF, "TIPO_ECF");
    IMDB.SetFldParams(IMDBDef9.PQRY_T06,IMDBDef9.PQSL_T06_TIPO_ECF,1,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T06, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Esenzioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public Esenzioni()
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
    FormIdx = MyGlb.FRM_ESENZIONI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "531FAF08-6270-4C68-814F-6A1E22C82D10";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 720;
    DesignHeight = 346;
    set_Caption(new IDVariant("Esenzioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 720;
    Frames[1].Height = 320;
    Frames[1].Caption = "Esenzioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 320;
    PAN_ESENZIONI = new IDPanel(w, this, 1, "PAN_ESENZIONI");
    Frames[1].Content = PAN_ESENZIONI;
    PAN_ESENZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESENZIONI.VS = MainFrm.VisualStyleList;
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 720-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_ESENZIONBOOK != null)
      PAN_ESENZIONI.SetBook(BUK_ESENZIONBOOK);
    PAN_ESENZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6A1D1BB5-2685-4A6E-88BC-45AF6F08FC7B");
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 664, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ESENZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESENZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESENZIONI.InitStatus = 2;
    PAN_ESENZIONI_Init();
    PAN_ESENZIONI_InitFields();
    PAN_ESENZIONI_InitQueries();
    BKW_ESENZIONBOOK = new OBook(this);
    BUK_ESENZIONBOOK = new CIDREObj(BKW_ESENZIONBOOK);
    BKW_ESENZIONBOOK.iGuid = "9BC6E317-F775-496E-B0FB-9994E7934AFB";
    BKW_ESENZIONBOOK.Code = "BUK_ESENZIONBOOK";
    BKW_ESENZIONBOOK.BookObj = BUK_ESENZIONBOOK;
    BKW_ESENZIONBOOK.InitDefMasks();
    BUK_ESENZIONBOOK.InitBook(1, 1245185, "Esenzioni Book", IMDB, MainFrm.VisualStyleList);
    BUK_ESENZIONBOOK.InitHTML();
    BUK_ESENZIONBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ESENZIONBOOK.Book.SetMainFrm(MainFrm);
    BUK_ESENZIONBOOK.SetRTCGuid(0, "9BC6E317-F775-496E-B0FB-9994E7934AFB");
    BUK_ESENZIONBOOK.SetObjCode(0, "ESENZIONBOOK");
    if (PAN_ESENZIONI != null)
      PAN_ESENZIONI.SetBook(BUK_ESENZIONBOOK);
    BUK_ESENZIONBOOK_MST_ESENBOOKPAGE_Init();
    BUK_ESENZIONBOOK_RPT_NEWREPORT_Init();
    BUK_ESENZIONBOOK_InitLinks();
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
      PAN_ESENZIONI.UpdatePanel(MainFrm);
      // BUK_ESENZIONBOOK.UpdateBook();
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
    if (Code.equals("BUK_ESENZIONBOOK")) return BUK_ESENZIONBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Esenzioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Esenzioni.class.getName() : (Glb.ClassWithPackage(Esenzioni.class) ? Esenzioni.class.getName().substring(Esenzioni.class.getPackage().getName().length() + 1) : Esenzioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Esenzioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESENZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ESENZIONI);
      // 
      // Esenzioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_ESENZIONI.IsNewRow()))
      {
        PAN_ESENZIONI.SetFlags (Glb.OBJ_FIELD, PFL_ESENZIONI_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ESENZIONI.SetFlags (Glb.OBJ_FIELD, PFL_ESENZIONI_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_ESENZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_ESENZIONI_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T7, IMDBDef9.PQSL_T7_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Esenzioni", "EsenzioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Esenzioni On Database Error Event
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
  private void PAN_ESENZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ESENZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Esenzioni On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Esenzioni", "EsenzioniOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Esenzioni On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ESENZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esenzioni On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T06PD(IMDB.Value(IMDBDef9.PQRY_T7, IMDBDef9.PQSL_T7_CODICE, 0));
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
      MainFrm.ErrObj.ProcError ("Esenzioni", "EsenzioniOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Esenzioni On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ESENZIONI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esenzioni On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T7, IMDBDef9.PQSL_T7_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T7, IMDBDef9.PQSL_T7_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T7, IMDBDef9.PQSL_T7_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T7, IMDBDef9.PQSL_T7_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T7, IMDBDef9.PQSL_T7_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T7, IMDBDef9.PQSL_T7_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Esenzioni", "EsenzioniOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("Esenzioni", "LoadEvent", _e);
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
  private void PAN_ESENZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESENZIONI, Cancel);
    // Stub
  }

  private void PAN_ESENZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ESENZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ESENZIONI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ESENZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESENZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_ESENZIONBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ESENZIONBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ESENZIONBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_ESENZIONBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_ESENZIONBOOK_SEC_DETAIL)
    {
      BUK_ESENZIONBOOK.set_SpanValue(BUK_ESENZIONBOOK_SPAN_IETFCIEEBUSN, new IDVariant(((BUK_ESENZIONBOOK.GetReportColumn(BUK_ESENZIONBOOK_RPT_NEWREPORT, "TIPO").equals((new IDVariant(1))))?(new IDVariant("SI")):(new IDVariant("NO")))));
    }
    if (SectionID==BUK_ESENZIONBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_ESENZIONBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ESENZIONBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ESENZIONBOOK_MST_ESENBOOKPAGE)
    {
      BUK_ESENZIONBOOK.set_SpanValue(BUK_ESENZIONBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ESENZIONBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ESENZIONBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_ESENZIONBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ESENZIONBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ESENZIONBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ESENZIONBOOK_OnPreview()
  {
    PreviewBook = BKW_ESENZIONBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ESENZIONI_Init()
  {

    PAN_ESENZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESENZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ESENZIONI.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_ESENZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, "364FE109-8AA5-4928-A4D6-B0C123765F69");
    PAN_ESENZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, "Codice");
    PAN_ESENZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, "");
    PAN_ESENZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ESENZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_ESENZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, "8EFE0D3A-8918-4889-A3B2-92AC2B4C48A6");
    PAN_ESENZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, "Descrizione");
    PAN_ESENZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, "");
    PAN_ESENZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ESENZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ESENZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, "3BB7217A-C1A7-4075-9B2F-C71B04048B28");
    PAN_ESENZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, "Fuori c. IVA");
    PAN_ESENZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, "Fuori c. IVA");
    PAN_ESENZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, MyGlb.VIS_CHECKSTYLE);
    PAN_ESENZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESENZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, "EFACB371-5F15-4BC1-AB21-9F22B06259B0");
    PAN_ESENZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, "Tipo E.C.F.");
    PAN_ESENZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, "");
    PAN_ESENZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, MyGlb.VIS_NORMALFIELDS);
    PAN_ESENZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESENZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, "FD367547-ED1E-4233-9F28-2790152A917B");
    PAN_ESENZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_ESENZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, "");
    PAN_ESENZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_ESENZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESENZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, "C36466EC-262D-4CAA-AD6A-C696878FC712");
    PAN_ESENZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_ESENZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, "");
    PAN_ESENZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_ESENZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESENZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, "F44B7D49-40A5-4EF1-93DB-2E3927E71BD5");
    PAN_ESENZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_ESENZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, "");
    PAN_ESENZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ESENZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESENZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, "5681DBEB-F8E5-4E17-B9B1-134774942B84");
    PAN_ESENZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_ESENZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, "");
    PAN_ESENZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ESENZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESENZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, "6BC46E4C-6D2E-4AC1-9F1E-6B8A85FB8FA6");
    PAN_ESENZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, "Cod. Fattura Elettronica");
    PAN_ESENZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, "");
    PAN_ESENZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, MyGlb.VIS_NORMALFIELDS);
    PAN_ESENZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ESENZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ESENZIONI.SetFieldPage(PFL_ESENZIONI_CODICE, -1, -1);
    PAN_ESENZIONI.SetFieldPanel(PFL_ESENZIONI_CODICE, PPQRY_T7, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 368, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ESENZIONI.SetFieldPage(PFL_ESENZIONI_DESCRIZIONE, -1, -1);
    PAN_ESENZIONI.SetFieldPanel(PFL_ESENZIONI_DESCRIZIONE, PPQRY_T7, "A.DESCRIZIONE", "DESCRIZIONE", 5, 30, 0, -13997);
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, MyGlb.PANEL_LIST, 424, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, MyGlb.PANEL_LIST, 32);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, MyGlb.PANEL_LIST, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, MyGlb.PANEL_LIST, "Fuori c. IVA");
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, MyGlb.PANEL_FORM, 4, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, MyGlb.PANEL_FORM, 88);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, MyGlb.PANEL_FORM, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_FUORICIVA, MyGlb.PANEL_FORM, "Fuori c. IVA");
    PAN_ESENZIONI.SetFieldPage(PFL_ESENZIONI_FUORICIVA, -1, -1);
    PAN_ESENZIONI.SetFieldPanel(PFL_ESENZIONI_FUORICIVA, PPQRY_T7, "A.TIPO", "TIPO", 1, 1, 0, -13997);
    PAN_ESENZIONI.SetValueListItem(PFL_ESENZIONI_FUORICIVA, (new IDVariant(1)), "1", "", "", -1);
    PAN_ESENZIONI.SetValueListItem(PFL_ESENZIONI_FUORICIVA, (new IDVariant()), "null", "", "", -1);
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, MyGlb.PANEL_LIST, 488, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, MyGlb.PANEL_LIST, 56);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, MyGlb.PANEL_LIST, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, MyGlb.PANEL_LIST, "Tipo E.C.F.");
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, MyGlb.PANEL_FORM, 4, 76, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, MyGlb.PANEL_FORM, 56);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, MyGlb.PANEL_FORM, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_TIPOECF, MyGlb.PANEL_FORM, "Tp. E C F");
    PAN_ESENZIONI.SetFieldPage(PFL_ESENZIONI_TIPOECF, -1, -1);
    PAN_ESENZIONI.SetFieldPanel(PFL_ESENZIONI_TIPOECF, PPQRY_T7, "A.TIPO_ECF", "TIPO_ECF", 1, 1, 0, -13997);
    PAN_ESENZIONI.SetValueListItem(PFL_ESENZIONI_TIPOECF, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_ESENZIONI.SetValueListItem(PFL_ESENZIONI_TIPOECF, (new IDVariant(2)), "Non imponibile", "", "", -1);
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 584, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 100, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_ESENZIONI.SetFieldPage(PFL_ESENZIONI_UTENTEINSERI, -1, -1);
    PAN_ESENZIONI.SetFieldPanel(PFL_ESENZIONI_UTENTEINSERI, PPQRY_T7, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 704, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 124, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_ESENZIONI.SetFieldPage(PFL_ESENZIONI_DATAINSERIME, -1, -1);
    PAN_ESENZIONI.SetFieldPanel(PFL_ESENZIONI_DATAINSERIME, PPQRY_T7, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 812, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 148, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_ESENZIONI.SetFieldPage(PFL_ESENZIONI_UTENTULTIAGG, -1, -1);
    PAN_ESENZIONI.SetFieldPanel(PFL_ESENZIONI_UTENTULTIAGG, PPQRY_T7, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 924, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 172, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_ESENZIONI.SetFieldPage(PFL_ESENZIONI_DATAULTIMAGG, -1, -1);
    PAN_ESENZIONI.SetFieldPanel(PFL_ESENZIONI_DATAULTIMAGG, PPQRY_T7, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, MyGlb.PANEL_LIST, 584, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, MyGlb.PANEL_LIST, 64);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, MyGlb.PANEL_LIST, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, MyGlb.PANEL_LIST, "Cod. Fattura Elettronica");
    PAN_ESENZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, MyGlb.PANEL_FORM, 4, 100, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESENZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, MyGlb.PANEL_FORM, 64);
    PAN_ESENZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, MyGlb.PANEL_FORM, 1);
    PAN_ESENZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESENZIONI_CODICEFE, MyGlb.PANEL_FORM, "C. Ftt. Elt.");
    PAN_ESENZIONI.SetFieldPage(PFL_ESENZIONI_CODICEFE, -1, -1);
    PAN_ESENZIONI.SetFieldPanel(PFL_ESENZIONI_CODICEFE, PPQRY_T7, "A.CODICE_FE", "CODICE_FE", 5, 20, 0, -13997);
  }

  private void PAN_ESENZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESENZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESENZIONI.SetIMDB(IMDB, "PQRY_T7", true);
    PAN_ESENZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "T06");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.TIPO_ECF as TIPO_ECF, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.CODICE_FE as CODICE_FE ");
    PAN_ESENZIONI.SetQuery(PPQRY_T7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T06 A ");
    PAN_ESENZIONI.SetQuery(PPQRY_T7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESENZIONI.SetQuery(PPQRY_T7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESENZIONI.SetQuery(PPQRY_T7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESENZIONI.SetQuery(PPQRY_T7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ESENZIONI.SetQuery(PPQRY_T7, 5, SQL, -1, "");
    PAN_ESENZIONI.SetQueryDB(PPQRY_T7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESENZIONI.SetMasterTable(0, "T06");
    PAN_ESENZIONI.AddToSortList(PFL_ESENZIONI_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESENZIONI.Status() == 2)
    {
      int oldListQBE = PAN_ESENZIONI.iUseListQBE;
      PAN_ESENZIONI.iUseListQBE = 0;
      PAN_ESENZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESENZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_ESENZIONI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_ESENZIONBOOK_MST_ESENBOOKPAGE_Init()
  {
    BUK_ESENZIONBOOK.InitMastro(BUK_ESENZIONBOOK_MST_ESENBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_MST_ESENBOOKPAGE, "AD3C9F86-71CA-46C4-BAAB-5FC446A11E76");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_MST_ESENBOOKPAGE, "ESENBOOKPAGE");
    BUK_ESENZIONBOOK.InitMastroBox(BUK_ESENZIONBOOK_MST_ESENBOOKPAGE, BUK_ESENZIONBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPTBOX_NUMEROPAGINA, "75BB30A0-4A24-4BEE-AFA6-166F5078D06A");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ESENZIONBOOK.InitBoxSpan(BUK_ESENZIONBOOK_RPTBOX_NUMEROPAGINA, BUK_ESENZIONBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SPAN_NUMEROPAGINA, "CEEEC596-9A68-4929-A9A2-294116824FC5");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ESENZIONBOOK.InitMastroBox(BUK_ESENZIONBOOK_MST_ESENBOOKPAGE, BUK_ESENZIONBOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPTBOX_PAGEBODY, "E3B46768-12DB-4A5A-82F2-BE716523C2F6");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_ESENZIONBOOK.InitMastroBox(BUK_ESENZIONBOOK_MST_ESENBOOKPAGE, BUK_ESENZIONBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPTBOX_TITOLO, "06024B3D-1960-4060-A6B5-55687652CD93");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_ESENZIONBOOK_RPT_NEWREPORT_InitQuery() { BUK_ESENZIONBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_ESENZIONBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.TIPO as TIPO, ");
      SQL.append("  A.TIPO_ECF as TIPO_ECF ");
      SQL.append("from ");
      SQL.append("  T06 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_ESENZIONBOOK.SetReportQuery(BUK_ESENZIONBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "7DDFCCEF-DE9B-48DA-8D89-1962D4372C80");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ESENZIONBOOK_RPT_NEWREPORT_Init()
  {
    BUK_ESENZIONBOOK.InitReport(BUK_ESENZIONBOOK_RPT_NEWREPORT, 196609);
    BUK_ESENZIONBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPT_NEWREPORT, "D3EA2A9B-9D55-4EF5-9743-98274A2BD44C");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_ESENZIONBOOK.InitSection(BUK_ESENZIONBOOK_RPT_NEWREPORT, BUK_ESENZIONBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ESENZIONBOOK.SetSectionRendersInto(BUK_ESENZIONBOOK_SEC_PAGEHEADER, BUK_ESENZIONBOOK_RPTBOX_PAGEBODY);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SEC_PAGEHEADER, "49957096-5E08-468F-8334-02F525C73600");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ESENZIONBOOK.InitReportBox(BUK_ESENZIONBOOK_SEC_PAGEHEADER, BUK_ESENZIONBOOK_RPTBOX_CODICEHEADER, 400, 0, 1100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPTBOX_CODICEHEADER, "4359A246-0CF1-4F96-A0DE-6C34D9F7C1B2");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_ESENZIONBOOK.InitBoxSpan(BUK_ESENZIONBOOK_RPTBOX_CODICEHEADER, BUK_ESENZIONBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SPAN_CODICE, "E74FBBA0-7811-4462-A175-410835587353");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SPAN_CODICE, "CODICE");
    BUK_ESENZIONBOOK.InitReportBox(BUK_ESENZIONBOOK_SEC_PAGEHEADER, BUK_ESENZIONBOOK_RPTBOX_DESCRIHEADER, 2200, 0, 9719, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPTBOX_DESCRIHEADER, "FFC4DB4E-E9BF-4A7D-B3EF-9F0EF85BBF0D");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_ESENZIONBOOK.InitBoxSpan(BUK_ESENZIONBOOK_RPTBOX_DESCRIHEADER, BUK_ESENZIONBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SPAN_DESCRIZIONE, "EBA68C1A-F76E-4A78-916C-805A5A205170");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_ESENZIONBOOK.InitReportBox(BUK_ESENZIONBOOK_SEC_PAGEHEADER, BUK_ESENZIONBOOK_RPTBOX_TIPOHEADER, 13800, 0, 1682, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPTBOX_TIPOHEADER, "A81D7731-5624-49D8-A633-17AD63CA05CC");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPTBOX_TIPOHEADER, "TIPOHEADER");
    BUK_ESENZIONBOOK.InitBoxSpan(BUK_ESENZIONBOOK_RPTBOX_TIPOHEADER, BUK_ESENZIONBOOK_SPAN_FUORICIVA, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Fuori c. IVA", 1);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SPAN_FUORICIVA, "8275A2BE-B112-4D74-B5CE-F1D406E17B75");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SPAN_FUORICIVA, "FUORICIVA");
    BUK_ESENZIONBOOK.InitReportBox(BUK_ESENZIONBOOK_SEC_PAGEHEADER, BUK_ESENZIONBOOK_RPTBOX_TIPOECFHEADE, 16000, 0, 2100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPTBOX_TIPOECFHEADE, "6CCA64D8-1AF2-4B34-8F34-AF57602878D5");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPTBOX_TIPOECFHEADE, "TIPOECFHEADE");
    BUK_ESENZIONBOOK.InitBoxSpan(BUK_ESENZIONBOOK_RPTBOX_TIPOECFHEADE, BUK_ESENZIONBOOK_SPAN_TIPOECF, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Tipo E.C.F.", 1);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SPAN_TIPOECF, "335304C7-4D9A-464B-B968-BA17FCDF9873");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SPAN_TIPOECF, "TIPOECF");
    BUK_ESENZIONBOOK.InitSection(BUK_ESENZIONBOOK_RPT_NEWREPORT, BUK_ESENZIONBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ESENZIONBOOK.SetSectionRendersInto(BUK_ESENZIONBOOK_SEC_TITOLO, BUK_ESENZIONBOOK_RPTBOX_TITOLO);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SEC_TITOLO, "5933F7AB-A4DD-4C89-9DEE-52650EAF49F1");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SEC_TITOLO, "TITOLO");
    BUK_ESENZIONBOOK.InitReportBox(BUK_ESENZIONBOOK_SEC_TITOLO, BUK_ESENZIONBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPTBOX_NEWBOX, "4B5C9383-4C93-4C87-BA37-02EC0817C045");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_ESENZIONBOOK.InitBoxSpan(BUK_ESENZIONBOOK_RPTBOX_NEWBOX, BUK_ESENZIONBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Esenzioni I.V.A.", 1);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SPAN_VARIADIBILAN, "37B998FC-4F17-4D67-A67F-43F800EC3FB2");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_ESENZIONBOOK.InitSection(BUK_ESENZIONBOOK_RPT_NEWREPORT, BUK_ESENZIONBOOK_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ESENZIONBOOK.SetSectionRendersInto(BUK_ESENZIONBOOK_SEC_DETAIL, BUK_ESENZIONBOOK_RPTBOX_PAGEBODY);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SEC_DETAIL, "0C4D5D0D-BB17-44C5-8A28-0A52388B0671");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SEC_DETAIL, "DETAIL");
    BUK_ESENZIONBOOK.InitReportBox(BUK_ESENZIONBOOK_SEC_DETAIL, BUK_ESENZIONBOOK_RPTBOX_CODICE, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPTBOX_CODICE, "D96A72ED-C98E-49C0-9D29-D16B04593E3C");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPTBOX_CODICE, "CODICE");
    BUK_ESENZIONBOOK.InitBoxSpan(BUK_ESENZIONBOOK_RPTBOX_CODICE, BUK_ESENZIONBOOK_SPAN_T06CODESESBO, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SPAN_T06CODESESBO, "22781AB8-2830-4B76-8A95-59AF4FE540E6");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SPAN_T06CODESESBO, "T06CODESESBO");
    BUK_ESENZIONBOOK.InitReportBox(BUK_ESENZIONBOOK_SEC_DETAIL, BUK_ESENZIONBOOK_RPTBOX_DESCRIZIONE, 2200, 0, 11300, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPTBOX_DESCRIZIONE, "3B0B4945-BCC0-4490-A3FF-FD9F356832EE");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_ESENZIONBOOK.InitBoxSpan(BUK_ESENZIONBOOK_RPTBOX_DESCRIZIONE, BUK_ESENZIONBOOK_SPAN_T06DESESESBO, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SPAN_T06DESESESBO, "097FEB65-1800-4636-91F5-368E89455542");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SPAN_T06DESESESBO, "T06DESESESBO");
    BUK_ESENZIONBOOK.InitReportBox(BUK_ESENZIONBOOK_SEC_DETAIL, BUK_ESENZIONBOOK_RPTBOX_TIPO, 14300, 0, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPTBOX_TIPO, "8A45FAD1-43D7-4C51-9721-94A748E5739D");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPTBOX_TIPO, "TIPO");
    BUK_ESENZIONBOOK.InitBoxSpan(BUK_ESENZIONBOOK_RPTBOX_TIPO, BUK_ESENZIONBOOK_SPAN_IETFCIEEBUSN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_ESENZIONBOOK.SetSpanValueListItem(BUK_ESENZIONBOOK_SPAN_IETFCIEEBUSN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_ESENZIONBOOK.SetSpanValueListItem(BUK_ESENZIONBOOK_SPAN_IETFCIEEBUSN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SPAN_IETFCIEEBUSN, "78163EDC-BEDE-49F0-91CA-04C1ED953C0B");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SPAN_IETFCIEEBUSN, "IETFCIEEBUSN");
    BUK_ESENZIONBOOK.InitReportBox(BUK_ESENZIONBOOK_SEC_DETAIL, BUK_ESENZIONBOOK_RPTBOX_TIPOECF, 16000, 0, 2100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_RPTBOX_TIPOECF, "2D0C672C-83D8-409E-AAFA-CF11E4FBEBB7");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_RPTBOX_TIPOECF, "TIPOECF");
    BUK_ESENZIONBOOK.InitBoxSpan(BUK_ESENZIONBOOK_RPTBOX_TIPOECF, BUK_ESENZIONBOOK_SPAN_T0TIECFESESB, MyGlb.VIS_DEFAREPOSTYL, 1, 1, 0, 271384961, "", "::TIPO_ECF", 1);
    BUK_ESENZIONBOOK.SetSpanValueListItem(BUK_ESENZIONBOOK_SPAN_T0TIECFESESB, "Esente", "", (new IDVariant(1)), null, "", -1);
    BUK_ESENZIONBOOK.SetSpanValueListItem(BUK_ESENZIONBOOK_SPAN_T0TIECFESESB, "Non imponibile", "", (new IDVariant(2)), null, "", -1);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SPAN_T0TIECFESESB, "20793402-2DAC-435E-A727-BA1621F83834");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SPAN_T0TIECFESESB, "T0TIECFESESB");
    BUK_ESENZIONBOOK.InitSection(BUK_ESENZIONBOOK_RPT_NEWREPORT, BUK_ESENZIONBOOK_SEC_REPORTFOOTER, 600, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ESENZIONBOOK.SetSectionRendersInto(BUK_ESENZIONBOOK_SEC_REPORTFOOTER, BUK_ESENZIONBOOK_RPTBOX_PAGEBODY);
    BUK_ESENZIONBOOK.SetRTCGuid(BUK_ESENZIONBOOK_SEC_REPORTFOOTER, "F0F98D41-59C5-49AC-B587-1D3C1DCDF414");
    BUK_ESENZIONBOOK.SetObjCode(BUK_ESENZIONBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ESENZIONBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_ESENZIONBOOK_InitLinks()
  {
    BUK_ESENZIONBOOK.SetBoxNextBox(BUK_ESENZIONBOOK_RPTBOX_PAGEBODY, BUK_ESENZIONBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ESENZIONI) PAN_ESENZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESENZIONI) PAN_ESENZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ESENZIONI) PAN_ESENZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESENZIONI) PAN_ESENZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESENZIONI) PAN_ESENZIONI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_ESENZIONI) PAN_ESENZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_ESENZIONBOOK) BUK_ESENZIONBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ESENZIONBOOK) BUK_ESENZIONBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ESENZIONBOOK) BUK_ESENZIONBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ESENZIONBOOK) BUK_ESENZIONBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ESENZIONBOOK) BUK_ESENZIONBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ESENZIONBOOK) BUK_ESENZIONBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ESENZIONBOOK) BUK_ESENZIONBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ESENZIONBOOK) BUK_ESENZIONBOOK_OnPreview();
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
