// **********************************************
// Contributi Straordinari
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ContributiStraordinari extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CONTRISTRAOR_CODICE = 0;
  private static int PFL_CONTRISTRAOR_DESCRIZIONE = 1;
  private static int PFL_CONTRISTRAOR_UTENTEINSERI = 2;
  private static int PFL_CONTRISTRAOR_DATAINSERIME = 3;
  private static int PFL_CONTRISTRAOR_UTENTULTIAGG = 4;
  private static int PFL_CONTRISTRAOR_DATAULTIMAGG = 5;

  private static int PPQRY_T89 = 0;


  IDPanel PAN_CONTRISTRAOR;
  CIDREObj BUK_CONTSTRABOOK;
  OBook BKW_CONTSTRABOOK;
  //
  // Template Pages constants
  private static int BUK_CONTSTRABOOK_MST_CONSTRBOOPAG = 1;
  private static int BUK_CONTSTRABOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CONTSTRABOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CONTSTRABOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_CONTSTRABOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_CONTSTRABOOK_RPT_NEWREPORT = 6;
  private static int BUK_CONTSTRABOOK_SEC_PAGEHEADER = 7;
  private static int BUK_CONTSTRABOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_CONTSTRABOOK_SPAN_CODICE = 9;
  private static int BUK_CONTSTRABOOK_RPTBOX_DESCRIHEADER = 10;
  private static int BUK_CONTSTRABOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_CONTSTRABOOK_SEC_TITOLO = 12;
  private static int BUK_CONTSTRABOOK_RPTBOX_NEWBOX = 13;
  private static int BUK_CONTSTRABOOK_SPAN_VARIADIBILAN = 14;
  private static int BUK_CONTSTRABOOK_SEC_DETAIL = 15;
  private static int BUK_CONTSTRABOOK_RPTBOX_CODICE = 16;
  private static int BUK_CONTSTRABOOK_SPAN_T8COCOSTCOSB = 17;
  private static int BUK_CONTSTRABOOK_RPTBOX_DESCRIZIONE = 18;
  private static int BUK_CONTSTRABOOK_SPAN_T8DECOSTCOSB = 19;
  private static int BUK_CONTSTRABOOK_SEC_REPORTFOOTER = 20;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T89(IMDB);
    Init_PQRY_T86(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T89(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T89, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_T89, "PQRY_T89");
    IMDB.set_FldCode(IMDBDef9.PQRY_T89,IMDBDef9.PQSL_T89_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T89,IMDBDef9.PQSL_T89_CODICE,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T89,IMDBDef9.PQSL_T89_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T89,IMDBDef9.PQSL_T89_DESCRIZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T89,IMDBDef9.PQSL_T89_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T89,IMDBDef9.PQSL_T89_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T89,IMDBDef9.PQSL_T89_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T89,IMDBDef9.PQSL_T89_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T89,IMDBDef9.PQSL_T89_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T89,IMDBDef9.PQSL_T89_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T89,IMDBDef9.PQSL_T89_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T89,IMDBDef9.PQSL_T89_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T89, 0);
  }

  private static void Init_PQRY_T86(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T86, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_T86, "PQRY_T86");
    IMDB.set_FldCode(IMDBDef9.PQRY_T86,IMDBDef9.PQSL_T86_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T86,IMDBDef9.PQSL_T86_CODICE,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T86,IMDBDef9.PQSL_T86_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T86,IMDBDef9.PQSL_T86_DESCRIZIONE,5,60,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T86, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ContributiStraordinari(MyWebEntryPoint w, IMDBObj imdb)
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
  public ContributiStraordinari()
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
    FormIdx = MyGlb.FRM_CONTRISTRAOR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FC386D49-92AF-4C98-B0C6-385CD56AC413";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 704;
    DesignHeight = 370;
    set_Caption(new IDVariant("Contributi Straordinari"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 704;
    Frames[1].Height = 344;
    Frames[1].Caption = "Contributi Straordinari";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    PAN_CONTRISTRAOR = new IDPanel(w, this, 1, "PAN_CONTRISTRAOR");
    Frames[1].Content = PAN_CONTRISTRAOR;
    PAN_CONTRISTRAOR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTRISTRAOR.VS = MainFrm.VisualStyleList;
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 704-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CONTSTRABOOK != null)
      PAN_CONTRISTRAOR.SetBook(BUK_CONTSTRABOOK);
    PAN_CONTRISTRAOR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6E27FB92-8AAC-4256-B49B-BE2E1FF42EF2");
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 544, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTRISTRAOR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTRISTRAOR.InitStatus = 2;
    PAN_CONTRISTRAOR_Init();
    PAN_CONTRISTRAOR_InitFields();
    PAN_CONTRISTRAOR_InitQueries();
    BKW_CONTSTRABOOK = new OBook(this);
    BUK_CONTSTRABOOK = new CIDREObj(BKW_CONTSTRABOOK);
    BKW_CONTSTRABOOK.iGuid = "8358E19F-C156-4D47-A6B1-8E998778E5FE";
    BKW_CONTSTRABOOK.Code = "BUK_CONTSTRABOOK";
    BKW_CONTSTRABOOK.BookObj = BUK_CONTSTRABOOK;
    BKW_CONTSTRABOOK.InitDefMasks();
    BUK_CONTSTRABOOK.InitBook(1, 1245185, "Contributi Straordinari Book", IMDB, MainFrm.VisualStyleList);
    BUK_CONTSTRABOOK.InitHTML();
    BUK_CONTSTRABOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CONTSTRABOOK.Book.SetMainFrm(MainFrm);
    BUK_CONTSTRABOOK.SetRTCGuid(0, "8358E19F-C156-4D47-A6B1-8E998778E5FE");
    BUK_CONTSTRABOOK.SetObjCode(0, "CONTSTRABOOK");
    if (PAN_CONTRISTRAOR != null)
      PAN_CONTRISTRAOR.SetBook(BUK_CONTSTRABOOK);
    BUK_CONTSTRABOOK_MST_CONSTRBOOPAG_Init();
    BUK_CONTSTRABOOK_RPT_NEWREPORT_Init();
    BUK_CONTSTRABOOK_InitLinks();
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
      PAN_CONTRISTRAOR.UpdatePanel(MainFrm);
      // BUK_CONTSTRABOOK.UpdateBook();
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
    if (Code.equals("BUK_CONTSTRABOOK")) return BUK_CONTSTRABOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ContributiStraordinari);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ContributiStraordinari.class.getName() : (Glb.ClassWithPackage(ContributiStraordinari.class) ? ContributiStraordinari.class.getName().substring(ContributiStraordinari.class.getPackage().getName().length() + 1) : ContributiStraordinari.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Contributi Straordinari On Database Error Event
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
  private void PAN_CONTRISTRAOR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CONTRISTRAOR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Contributi Straordinari On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContributiStraordinari", "ContributiStraordinariOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Contributi Straordinari On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTRISTRAOR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CONTRISTRAOR);
      // 
      // Contributi Straordinari On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_CONTRISTRAOR.IsNewRow()))
      {
        PAN_CONTRISTRAOR.SetFlags (Glb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CONTRISTRAOR.SetFlags (Glb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_CONTRISTRAOR.set_ToolTip(Glb.OBJ_FIELD,PFL_CONTRISTRAOR_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T89, IMDBDef9.PQSL_T89_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContributiStraordinari", "ContributiStraordinariOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Contributi Straordinari On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CONTRISTRAOR_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Contributi Straordinari On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T86PD(IMDB.Value(IMDBDef9.PQRY_T89, IMDBDef9.PQSL_T89_CODICE, 0));
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
      MainFrm.ErrObj.ProcError ("ContributiStraordinari", "ContributiStraordinariOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Contributi Straordinari On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CONTRISTRAOR_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Contributi Straordinari On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T89, IMDBDef9.PQSL_T89_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T89, IMDBDef9.PQSL_T89_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T89, IMDBDef9.PQSL_T89_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T89, IMDBDef9.PQSL_T89_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T89, IMDBDef9.PQSL_T89_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T89, IMDBDef9.PQSL_T89_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContributiStraordinari", "ContributiStraordinariOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("ContributiStraordinari", "LoadEvent", _e);
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
  private void PAN_CONTRISTRAOR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTRISTRAOR, Cancel);
    // Stub
  }

  private void PAN_CONTRISTRAOR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONTRISTRAOR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CONTRISTRAOR_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CONTRISTRAOR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTRISTRAOR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CONTSTRABOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CONTSTRABOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CONTSTRABOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CONTSTRABOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CONTSTRABOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_CONTSTRABOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CONTSTRABOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CONTSTRABOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CONTSTRABOOK_MST_CONSTRBOOPAG)
    {
      BUK_CONTSTRABOOK.set_SpanValue(BUK_CONTSTRABOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTSTRABOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CONTSTRABOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CONTSTRABOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CONTSTRABOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CONTSTRABOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CONTSTRABOOK_OnPreview()
  {
    PreviewBook = BKW_CONTSTRABOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONTRISTRAOR_Init()
  {

    PAN_CONTRISTRAOR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTRISTRAOR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONTRISTRAOR.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_CONTRISTRAOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, "DABF1D84-D9D5-4CE5-AD95-28BE5F8E6A04");
    PAN_CONTRISTRAOR.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, "Codice");
    PAN_CONTRISTRAOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, "");
    PAN_CONTRISTRAOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRISTRAOR.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CONTRISTRAOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, "556F73B8-F6BA-4542-A064-7E8514113D28");
    PAN_CONTRISTRAOR.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, "Descrizione");
    PAN_CONTRISTRAOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, "");
    PAN_CONTRISTRAOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTRISTRAOR.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRISTRAOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, "2F3F6AEC-CA1A-46EA-A781-0B5F0A94D443");
    PAN_CONTRISTRAOR.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CONTRISTRAOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, "");
    PAN_CONTRISTRAOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTRISTRAOR.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRISTRAOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, "D02D2A74-D439-4C8C-B507-82C636EBC8D4");
    PAN_CONTRISTRAOR.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CONTRISTRAOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, "");
    PAN_CONTRISTRAOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTRISTRAOR.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRISTRAOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, "1A589870-9401-48C6-B312-67EAF13271DD");
    PAN_CONTRISTRAOR.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CONTRISTRAOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, "");
    PAN_CONTRISTRAOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTRISTRAOR.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CONTRISTRAOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, "A4EC03E6-39F6-4005-8ED2-487BC62B892B");
    PAN_CONTRISTRAOR.set_Header(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CONTRISTRAOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, "");
    PAN_CONTRISTRAOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CONTRISTRAOR.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CONTRISTRAOR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_CONTRISTRAOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CONTRISTRAOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_CONTRISTRAOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CONTRISTRAOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CONTRISTRAOR.SetFieldPage(PFL_CONTRISTRAOR_CODICE, -1, -1);
    PAN_CONTRISTRAOR.SetFieldPanel(PFL_CONTRISTRAOR_CODICE, PPQRY_T89, "A.CODICE", "CODICE", 1, 3, 0, -13997);
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 488, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CONTRISTRAOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CONTRISTRAOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_CONTRISTRAOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CONTRISTRAOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CONTRISTRAOR.SetFieldPage(PFL_CONTRISTRAOR_DESCRIZIONE, -1, -1);
    PAN_CONTRISTRAOR.SetFieldPanel(PFL_CONTRISTRAOR_DESCRIZIONE, PPQRY_T89, "A.DESCRIZIONE", "DESCRIZIONE", 5, 60, 0, -13997);
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_CONTRISTRAOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CONTRISTRAOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_CONTRISTRAOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CONTRISTRAOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_CONTRISTRAOR.SetFieldPage(PFL_CONTRISTRAOR_UTENTEINSERI, -1, -1);
    PAN_CONTRISTRAOR.SetFieldPanel(PFL_CONTRISTRAOR_UTENTEINSERI, PPQRY_T89, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_CONTRISTRAOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CONTRISTRAOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_CONTRISTRAOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CONTRISTRAOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_CONTRISTRAOR.SetFieldPage(PFL_CONTRISTRAOR_DATAINSERIME, -1, -1);
    PAN_CONTRISTRAOR.SetFieldPanel(PFL_CONTRISTRAOR_DATAINSERIME, PPQRY_T89, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_CONTRISTRAOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CONTRISTRAOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_CONTRISTRAOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CONTRISTRAOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_CONTRISTRAOR.SetFieldPage(PFL_CONTRISTRAOR_UTENTULTIAGG, -1, -1);
    PAN_CONTRISTRAOR.SetFieldPanel(PFL_CONTRISTRAOR_UTENTULTIAGG, PPQRY_T89, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_CONTRISTRAOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CONTRISTRAOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_CONTRISTRAOR.SetRect(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTRISTRAOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_CONTRISTRAOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CONTRISTRAOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTRISTRAOR_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_CONTRISTRAOR.SetFieldPage(PFL_CONTRISTRAOR_DATAULTIMAGG, -1, -1);
    PAN_CONTRISTRAOR.SetFieldPanel(PFL_CONTRISTRAOR_DATAULTIMAGG, PPQRY_T89, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_CONTRISTRAOR_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTRISTRAOR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONTRISTRAOR.SetIMDB(IMDB, "PQRY_T89", true);
    PAN_CONTRISTRAOR.set_SetString(MyGlb.MASTER_ROWNAME, "T86");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CONTRISTRAOR.SetQuery(PPQRY_T89, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T86 A ");
    PAN_CONTRISTRAOR.SetQuery(PPQRY_T89, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTRISTRAOR.SetQuery(PPQRY_T89, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTRISTRAOR.SetQuery(PPQRY_T89, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTRISTRAOR.SetQuery(PPQRY_T89, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTRISTRAOR.SetQuery(PPQRY_T89, 5, SQL, -1, "");
    PAN_CONTRISTRAOR.SetQueryDB(PPQRY_T89, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTRISTRAOR.SetMasterTable(0, "T86");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTRISTRAOR.Status() == 2)
    {
      int oldListQBE = PAN_CONTRISTRAOR.iUseListQBE;
      PAN_CONTRISTRAOR.iUseListQBE = 0;
      PAN_CONTRISTRAOR.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTRISTRAOR.PanelCommand(Glb.PCM_FIND);
      PAN_CONTRISTRAOR.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CONTSTRABOOK_MST_CONSTRBOOPAG_Init()
  {
    BUK_CONTSTRABOOK.InitMastro(BUK_CONTSTRABOOK_MST_CONSTRBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_MST_CONSTRBOOPAG, "82090ADA-9BFF-4BF0-A3F8-902F85358B01");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_MST_CONSTRBOOPAG, "CONSTRBOOPAG");
    BUK_CONTSTRABOOK.InitMastroBox(BUK_CONTSTRABOOK_MST_CONSTRBOOPAG, BUK_CONTSTRABOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_RPTBOX_NUMEROPAGINA, "9BC8C79E-5D68-4F88-A24A-046234548495");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTSTRABOOK.InitBoxSpan(BUK_CONTSTRABOOK_RPTBOX_NUMEROPAGINA, BUK_CONTSTRABOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_SPAN_NUMEROPAGINA, "0D8527EC-E8CD-4834-B3FA-1363291B31AD");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CONTSTRABOOK.InitMastroBox(BUK_CONTSTRABOOK_MST_CONSTRBOOPAG, BUK_CONTSTRABOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_RPTBOX_PAGEBODY, "B2494F48-AD99-4DC9-9812-DB01F2B7D9FB");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CONTSTRABOOK.InitMastroBox(BUK_CONTSTRABOOK_MST_CONSTRBOOPAG, BUK_CONTSTRABOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_RPTBOX_TITOLO, "3B2872D5-F7FD-44C0-AF0B-5E9C2DE6B6D5");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_CONTSTRABOOK_RPT_NEWREPORT_InitQuery() { BUK_CONTSTRABOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CONTSTRABOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  T86 A ");
      BUK_CONTSTRABOOK.SetReportQuery(BUK_CONTSTRABOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "4394D37B-F807-4839-A937-B887F6A971A1");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CONTSTRABOOK_RPT_NEWREPORT_Init()
  {
    BUK_CONTSTRABOOK.InitReport(BUK_CONTSTRABOOK_RPT_NEWREPORT, 196609);
    BUK_CONTSTRABOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_RPT_NEWREPORT, "E77F9CC3-7AE7-490E-A161-BB475AEB5081");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CONTSTRABOOK.InitSection(BUK_CONTSTRABOOK_RPT_NEWREPORT, BUK_CONTSTRABOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTSTRABOOK.SetSectionRendersInto(BUK_CONTSTRABOOK_SEC_PAGEHEADER, BUK_CONTSTRABOOK_RPTBOX_PAGEBODY);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_SEC_PAGEHEADER, "2E9D563F-2453-4E72-8829-79A920D0346E");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CONTSTRABOOK.InitReportBox(BUK_CONTSTRABOOK_SEC_PAGEHEADER, BUK_CONTSTRABOOK_RPTBOX_CODICEHEADER, 0, 0, 1400, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_RPTBOX_CODICEHEADER, "940EABBE-331D-4F9C-AC26-E3D3169A8572");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_CONTSTRABOOK.InitBoxSpan(BUK_CONTSTRABOOK_RPTBOX_CODICEHEADER, BUK_CONTSTRABOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_SPAN_CODICE, "C85149CB-CBD0-4162-8B3D-4CA807D96337");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_SPAN_CODICE, "CODICE");
    BUK_CONTSTRABOOK.InitReportBox(BUK_CONTSTRABOOK_SEC_PAGEHEADER, BUK_CONTSTRABOOK_RPTBOX_DESCRIHEADER, 1900, 0, 16300, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_RPTBOX_DESCRIHEADER, "D6397611-5164-4120-BFFF-1658D050A705");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_CONTSTRABOOK.InitBoxSpan(BUK_CONTSTRABOOK_RPTBOX_DESCRIHEADER, BUK_CONTSTRABOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_SPAN_DESCRIZIONE, "0526A0D1-3FD1-4D88-B844-BF3FBB13D2EA");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CONTSTRABOOK.InitSection(BUK_CONTSTRABOOK_RPT_NEWREPORT, BUK_CONTSTRABOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTSTRABOOK.SetSectionRendersInto(BUK_CONTSTRABOOK_SEC_TITOLO, BUK_CONTSTRABOOK_RPTBOX_TITOLO);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_SEC_TITOLO, "8F0A0F26-ED3A-4FBD-AE4A-23C115439F9C");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_SEC_TITOLO, "TITOLO");
    BUK_CONTSTRABOOK.InitReportBox(BUK_CONTSTRABOOK_SEC_TITOLO, BUK_CONTSTRABOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_RPTBOX_NEWBOX, "D888E175-77E9-42F4-B216-2388CEC048D9");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_CONTSTRABOOK.InitBoxSpan(BUK_CONTSTRABOOK_RPTBOX_NEWBOX, BUK_CONTSTRABOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Causali di Contributo Straordinario", 1);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_SPAN_VARIADIBILAN, "11132299-16AF-4EB6-8AD3-E49B64468B64");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_CONTSTRABOOK.InitSection(BUK_CONTSTRABOOK_RPT_NEWREPORT, BUK_CONTSTRABOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTSTRABOOK.SetSectionRendersInto(BUK_CONTSTRABOOK_SEC_DETAIL, BUK_CONTSTRABOOK_RPTBOX_PAGEBODY);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_SEC_DETAIL, "338D01B6-1138-4AD7-93F2-48270889649E");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_SEC_DETAIL, "DETAIL");
    BUK_CONTSTRABOOK.InitReportBox(BUK_CONTSTRABOOK_SEC_DETAIL, BUK_CONTSTRABOOK_RPTBOX_CODICE, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_RPTBOX_CODICE, "94CB263D-1E9D-423D-8589-C49BED2D6766");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_RPTBOX_CODICE, "CODICE");
    BUK_CONTSTRABOOK.InitBoxSpan(BUK_CONTSTRABOOK_RPTBOX_CODICE, BUK_CONTSTRABOOK_SPAN_T8COCOSTCOSB, MyGlb.VIS_DEFAREPOSTYL, 1, 3, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_SPAN_T8COCOSTCOSB, "89EF70BD-34D8-475E-98DC-7A5D597AB842");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_SPAN_T8COCOSTCOSB, "T8COCOSTCOSB");
    BUK_CONTSTRABOOK.InitReportBox(BUK_CONTSTRABOOK_SEC_DETAIL, BUK_CONTSTRABOOK_RPTBOX_DESCRIZIONE, 1900, 0, 16300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_RPTBOX_DESCRIZIONE, "00D9ED1C-9FDE-4EE1-AEDE-8A9C0EE58579");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_CONTSTRABOOK.InitBoxSpan(BUK_CONTSTRABOOK_RPTBOX_DESCRIZIONE, BUK_CONTSTRABOOK_SPAN_T8DECOSTCOSB, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_SPAN_T8DECOSTCOSB, "95F800C7-60E2-4203-ADB1-68B8BCC9721F");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_SPAN_T8DECOSTCOSB, "T8DECOSTCOSB");
    BUK_CONTSTRABOOK.InitSection(BUK_CONTSTRABOOK_RPT_NEWREPORT, BUK_CONTSTRABOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CONTSTRABOOK.SetSectionRendersInto(BUK_CONTSTRABOOK_SEC_REPORTFOOTER, BUK_CONTSTRABOOK_RPTBOX_PAGEBODY);
    BUK_CONTSTRABOOK.SetRTCGuid(BUK_CONTSTRABOOK_SEC_REPORTFOOTER, "33EF6121-0A9E-43C3-A9AA-79F2F9922282");
    BUK_CONTSTRABOOK.SetObjCode(BUK_CONTSTRABOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CONTSTRABOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CONTSTRABOOK_InitLinks()
  {
    BUK_CONTSTRABOOK.SetBoxNextBox(BUK_CONTSTRABOOK_RPTBOX_PAGEBODY, BUK_CONTSTRABOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONTRISTRAOR) PAN_CONTRISTRAOR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTRISTRAOR) PAN_CONTRISTRAOR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTRISTRAOR) PAN_CONTRISTRAOR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTRISTRAOR) PAN_CONTRISTRAOR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONTRISTRAOR) PAN_CONTRISTRAOR_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_CONTRISTRAOR) PAN_CONTRISTRAOR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CONTSTRABOOK) BUK_CONTSTRABOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CONTSTRABOOK) BUK_CONTSTRABOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CONTSTRABOOK) BUK_CONTSTRABOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CONTSTRABOOK) BUK_CONTSTRABOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CONTSTRABOOK) BUK_CONTSTRABOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CONTSTRABOOK) BUK_CONTSTRABOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CONTSTRABOOK) BUK_CONTSTRABOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CONTSTRABOOK) BUK_CONTSTRABOOK_OnPreview();
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
