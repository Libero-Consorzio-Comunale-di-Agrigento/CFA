// **********************************************
// Codici Statistici
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CodiciStatistici extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CODICISTATIS_CODICE = 0;
  private static int PFL_CODICISTATIS_DESCRIZIONE = 1;
  private static int PFL_CODICISTATIS_UTENTEINSERI = 2;
  private static int PFL_CODICISTATIS_DATAINSERIME = 3;
  private static int PFL_CODICISTATIS_UTENTULTIAGG = 4;
  private static int PFL_CODICISTATIS_DATAULTIMAGG = 5;

  private static int PPQRY_STATIVA1 = 0;


  IDPanel PAN_CODICISTATIS;
  CIDREObj BUK_CODISTATBOOK;
  OBook BKW_CODISTATBOOK;
  //
  // Template Pages constants
  private static int BUK_CODISTATBOOK_MST_CODSTABOOPAG = 1;
  private static int BUK_CODISTATBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CODISTATBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CODISTATBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_CODISTATBOOK_RPTBOX_PAGEFOOTER = 5;
  private static int BUK_CODISTATBOOK_RPTBOX_TITOLO = 6;

  //
  // Reports constants
  private static int BUK_CODISTATBOOK_RPT_NEWREPORT = 7;
  private static int BUK_CODISTATBOOK_SEC_PAGEHEADER = 8;
  private static int BUK_CODISTATBOOK_RPTBOX_CODICEHEADER = 9;
  private static int BUK_CODISTATBOOK_SPAN_CODICE = 10;
  private static int BUK_CODISTATBOOK_RPTBOX_DESCRIHEADER = 11;
  private static int BUK_CODISTATBOOK_SPAN_DESCRIZIONE = 12;
  private static int BUK_CODISTATBOOK_SEC_TITOLO = 13;
  private static int BUK_CODISTATBOOK_RPTBOX_NEWBOX = 14;
  private static int BUK_CODISTATBOOK_SPAN_VARIADIBILAN = 15;
  private static int BUK_CODISTATBOOK_SEC_DETAIL = 16;
  private static int BUK_CODISTATBOOK_RPTBOX_CODICE = 17;
  private static int BUK_CODISTATBOOK_SPAN_STIVCOCOSCSB = 18;
  private static int BUK_CODISTATBOOK_RPTBOX_DESCRIZIONE = 19;
  private static int BUK_CODISTATBOOK_SPAN_STIVDECOSCSB = 20;
  private static int BUK_CODISTATBOOK_SEC_PAGEFOOTER = 21;
  private static int BUK_CODISTATBOOK_SEC_REPORTFOOTER = 22;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_STATIVA1(IMDB);
    Init_PQRY_STATIVA(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_STATIVA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_STATIVA1, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_STATIVA1, "PQRY_STATIVA1");
    IMDB.set_FldCode(IMDBDef9.PQRY_STATIVA1,IMDBDef9.PQSL_STATIVA1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_STATIVA1,IMDBDef9.PQSL_STATIVA1_CODICE,5,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_STATIVA1,IMDBDef9.PQSL_STATIVA1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_STATIVA1,IMDBDef9.PQSL_STATIVA1_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_STATIVA1,IMDBDef9.PQSL_STATIVA1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_STATIVA1,IMDBDef9.PQSL_STATIVA1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_STATIVA1,IMDBDef9.PQSL_STATIVA1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_STATIVA1,IMDBDef9.PQSL_STATIVA1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_STATIVA1,IMDBDef9.PQSL_STATIVA1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_STATIVA1,IMDBDef9.PQSL_STATIVA1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_STATIVA1,IMDBDef9.PQSL_STATIVA1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_STATIVA1,IMDBDef9.PQSL_STATIVA1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_STATIVA1, 0);
  }

  private static void Init_PQRY_STATIVA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_STATIVA, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_STATIVA, "PQRY_STATIVA");
    IMDB.set_FldCode(IMDBDef9.PQRY_STATIVA,IMDBDef9.PQSL_STATIVA_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_STATIVA,IMDBDef9.PQSL_STATIVA_CODICE,5,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_STATIVA,IMDBDef9.PQSL_STATIVA_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_STATIVA,IMDBDef9.PQSL_STATIVA_DESCRIZIONE,5,100,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_STATIVA, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CodiciStatistici(MyWebEntryPoint w, IMDBObj imdb)
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
  public CodiciStatistici()
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
    FormIdx = MyGlb.FRM_CODICISTATIS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9D88F6EA-9471-449D-ACC8-48F867444417";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 660;
    DesignHeight = 354;
    set_Caption(new IDVariant("Codici Statistici"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 660;
    Frames[1].Height = 328;
    Frames[1].Caption = "Codici Statistici";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 328;
    PAN_CODICISTATIS = new IDPanel(w, this, 1, "PAN_CODICISTATIS");
    Frames[1].Content = PAN_CODICISTATIS;
    PAN_CODICISTATIS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CODICISTATIS.VS = MainFrm.VisualStyleList;
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 660-MyGlb.PAN_OFFS_X, 328-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CODISTATBOOK != null)
      PAN_CODICISTATIS.SetBook(BUK_CODISTATBOOK);
    PAN_CODICISTATIS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C5F97FDC-4B39-42B4-AE1B-19AB78D41931");
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 588, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CODICISTATIS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CODICISTATIS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CODICISTATIS.InitStatus = 2;
    PAN_CODICISTATIS_Init();
    PAN_CODICISTATIS_InitFields();
    PAN_CODICISTATIS_InitQueries();
    BKW_CODISTATBOOK = new OBook(this);
    BUK_CODISTATBOOK = new CIDREObj(BKW_CODISTATBOOK);
    BKW_CODISTATBOOK.iGuid = "D2E63475-66BB-4B96-8B1C-8938E43A1225";
    BKW_CODISTATBOOK.Code = "BUK_CODISTATBOOK";
    BKW_CODISTATBOOK.BookObj = BUK_CODISTATBOOK;
    BKW_CODISTATBOOK.InitDefMasks();
    BUK_CODISTATBOOK.InitBook(1, 1245185, "Codici Statistici Book", IMDB, MainFrm.VisualStyleList);
    BUK_CODISTATBOOK.InitHTML();
    BUK_CODISTATBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CODISTATBOOK.Book.SetMainFrm(MainFrm);
    BUK_CODISTATBOOK.SetRTCGuid(0, "D2E63475-66BB-4B96-8B1C-8938E43A1225");
    BUK_CODISTATBOOK.SetObjCode(0, "CODISTATBOOK");
    if (PAN_CODICISTATIS != null)
      PAN_CODICISTATIS.SetBook(BUK_CODISTATBOOK);
    BUK_CODISTATBOOK_MST_CODSTABOOPAG_Init();
    BUK_CODISTATBOOK_RPT_NEWREPORT_Init();
    BUK_CODISTATBOOK_InitLinks();
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
      PAN_CODICISTATIS.UpdatePanel(MainFrm);
      // BUK_CODISTATBOOK.UpdateBook();
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
    if (Code.equals("BUK_CODISTATBOOK")) return BUK_CODISTATBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof CodiciStatistici);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CodiciStatistici.class.getName() : (Glb.ClassWithPackage(CodiciStatistici.class) ? CodiciStatistici.class.getName().substring(CodiciStatistici.class.getPackage().getName().length() + 1) : CodiciStatistici.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Codici Statistici On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CODICISTATIS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CODICISTATIS);
      // 
      // Codici Statistici On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_CODICISTATIS.IsNewRow()))
      {
        PAN_CODICISTATIS.SetFlags (Glb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CODICISTATIS.SetFlags (Glb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_CODICISTATIS.set_ToolTip(Glb.OBJ_FIELD,PFL_CODICISTATIS_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_STATIVA1, IMDBDef9.PQSL_STATIVA1_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciStatistici", "CodiciStatisticiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Codici Statistici On Database Error Event
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
  private void PAN_CODICISTATIS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CODICISTATIS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Codici Statistici On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciStatistici", "CodiciStatisticiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Codici Statistici On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CODICISTATIS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Codici Statistici On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_STATIVA1, IMDBDef9.PQSL_STATIVA1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_STATIVA1, IMDBDef9.PQSL_STATIVA1_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_STATIVA1, IMDBDef9.PQSL_STATIVA1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_STATIVA1, IMDBDef9.PQSL_STATIVA1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_STATIVA1, IMDBDef9.PQSL_STATIVA1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_STATIVA1, IMDBDef9.PQSL_STATIVA1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CodiciStatistici", "CodiciStatisticiOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("CodiciStatistici", "LoadEvent", _e);
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
  private void PAN_CODICISTATIS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CODICISTATIS, Cancel);
    // Stub
  }

  private void PAN_CODICISTATIS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CODICISTATIS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CODICISTATIS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CODICISTATIS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CODICISTATIS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CODISTATBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CODISTATBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CODISTATBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CODISTATBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CODISTATBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_CODISTATBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CODISTATBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CODISTATBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CODISTATBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CODISTATBOOK_MST_CODSTABOOPAG)
    {
      BUK_CODISTATBOOK.set_SpanValue(BUK_CODISTATBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CODISTATBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CODISTATBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CODISTATBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CODISTATBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CODISTATBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CODISTATBOOK_OnPreview()
  {
    PreviewBook = BKW_CODISTATBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CODICISTATIS_Init()
  {

    PAN_CODICISTATIS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CODICISTATIS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CODICISTATIS.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_CODICISTATIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, "B7AB6988-B559-4FF4-B3B8-FE36CE993EA7");
    PAN_CODICISTATIS.set_Header(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, "Codice");
    PAN_CODICISTATIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, "Codice");
    PAN_CODICISTATIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICISTATIS.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CODICISTATIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, "71533245-C6D9-4188-BE27-206BDB8983DA");
    PAN_CODICISTATIS.set_Header(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, "Descrizione");
    PAN_CODICISTATIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, "Descrizione");
    PAN_CODICISTATIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CODICISTATIS.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CODICISTATIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, "EF0FC903-53DB-4025-8F91-17F4AE153AC7");
    PAN_CODICISTATIS.set_Header(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CODICISTATIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, "");
    PAN_CODICISTATIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_CODICISTATIS.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CODICISTATIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, "AABE303E-78F4-430B-A1CC-B618D2BCBDD8");
    PAN_CODICISTATIS.set_Header(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CODICISTATIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, "");
    PAN_CODICISTATIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CODICISTATIS.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CODICISTATIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, "96402188-211A-4D8F-8693-A9CC17633B59");
    PAN_CODICISTATIS.set_Header(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CODICISTATIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, "");
    PAN_CODICISTATIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CODICISTATIS.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CODICISTATIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, "BC35D80E-05A5-493A-B382-7033693D1CD9");
    PAN_CODICISTATIS.set_Header(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CODICISTATIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, "");
    PAN_CODICISTATIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CODICISTATIS.SetFlags(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CODICISTATIS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_CODICISTATIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CODICISTATIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_CODICISTATIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CODICISTATIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CODICISTATIS.SetFieldPage(PFL_CODICISTATIS_CODICE, -1, -1);
    PAN_CODICISTATIS.SetFieldPanel(PFL_CODICISTATIS_CODICE, PPQRY_STATIVA1, "A.CODICE", "CODICE", 5, 3, 0, -13997);
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, MyGlb.PANEL_LIST, 64, 36, 524, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CODICISTATIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CODICISTATIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_CODICISTATIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CODICISTATIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CODICISTATIS.SetFieldPage(PFL_CODICISTATIS_DESCRIZIONE, -1, -1);
    PAN_CODICISTATIS.SetFieldPanel(PFL_CODICISTATIS_DESCRIZIONE, PPQRY_STATIVA1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, MyGlb.PANEL_LIST, 588, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_CODICISTATIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CODICISTATIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_CODICISTATIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CODICISTATIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_CODICISTATIS.SetFieldPage(PFL_CODICISTATIS_UTENTEINSERI, -1, -1);
    PAN_CODICISTATIS.SetFieldPanel(PFL_CODICISTATIS_UTENTEINSERI, PPQRY_STATIVA1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, MyGlb.PANEL_LIST, 708, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_CODICISTATIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CODICISTATIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_CODICISTATIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CODICISTATIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_CODICISTATIS.SetFieldPage(PFL_CODICISTATIS_DATAINSERIME, -1, -1);
    PAN_CODICISTATIS.SetFieldPanel(PFL_CODICISTATIS_DATAINSERIME, PPQRY_STATIVA1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, MyGlb.PANEL_LIST, 816, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_CODICISTATIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CODICISTATIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_CODICISTATIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CODICISTATIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_CODICISTATIS.SetFieldPage(PFL_CODICISTATIS_UTENTULTIAGG, -1, -1);
    PAN_CODICISTATIS.SetFieldPanel(PFL_CODICISTATIS_UTENTULTIAGG, PPQRY_STATIVA1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, MyGlb.PANEL_LIST, 928, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_CODICISTATIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CODICISTATIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_CODICISTATIS.SetRect(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CODICISTATIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_CODICISTATIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CODICISTATIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CODICISTATIS_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_CODICISTATIS.SetFieldPage(PFL_CODICISTATIS_DATAULTIMAGG, -1, -1);
    PAN_CODICISTATIS.SetFieldPanel(PFL_CODICISTATIS_DATAULTIMAGG, PPQRY_STATIVA1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_CODICISTATIS_InitQueries()
  {
    StringBuffer SQL;

    PAN_CODICISTATIS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CODICISTATIS.SetIMDB(IMDB, "PQRY_STATIVA1", true);
    PAN_CODICISTATIS.set_SetString(MyGlb.MASTER_ROWNAME, "STAT IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CODICISTATIS.SetQuery(PPQRY_STATIVA1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  STAT_IVA A ");
    PAN_CODICISTATIS.SetQuery(PPQRY_STATIVA1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CODICISTATIS.SetQuery(PPQRY_STATIVA1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CODICISTATIS.SetQuery(PPQRY_STATIVA1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CODICISTATIS.SetQuery(PPQRY_STATIVA1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CODICISTATIS.SetQuery(PPQRY_STATIVA1, 5, SQL, -1, "");
    PAN_CODICISTATIS.SetQueryDB(PPQRY_STATIVA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CODICISTATIS.SetMasterTable(0, "STAT_IVA");
    PAN_CODICISTATIS.AddToSortList(PFL_CODICISTATIS_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CODICISTATIS.Status() == 2)
    {
      int oldListQBE = PAN_CODICISTATIS.iUseListQBE;
      PAN_CODICISTATIS.iUseListQBE = 0;
      PAN_CODICISTATIS.PanelCommand(Glb.PCM_SEARCH);
      PAN_CODICISTATIS.PanelCommand(Glb.PCM_FIND);
      PAN_CODICISTATIS.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CODISTATBOOK_MST_CODSTABOOPAG_Init()
  {
    BUK_CODISTATBOOK.InitMastro(BUK_CODISTATBOOK_MST_CODSTABOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_MST_CODSTABOOPAG, "79C8AE21-51D8-4B77-8E2B-8D4CC66EBBAA");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_MST_CODSTABOOPAG, "CODSTABOOPAG");
    BUK_CODISTATBOOK.InitMastroBox(BUK_CODISTATBOOK_MST_CODSTABOOPAG, BUK_CODISTATBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_RPTBOX_NUMEROPAGINA, "51636E26-324A-4481-921C-F144714BC24F");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CODISTATBOOK.InitBoxSpan(BUK_CODISTATBOOK_RPTBOX_NUMEROPAGINA, BUK_CODISTATBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_SPAN_NUMEROPAGINA, "FC663991-B75F-48EB-B7E0-E6CBC4556217");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CODISTATBOOK.InitMastroBox(BUK_CODISTATBOOK_MST_CODSTABOOPAG, BUK_CODISTATBOOK_RPTBOX_PAGEBODY, 900, 2900, 19000, 20400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_RPTBOX_PAGEBODY, "B338A723-BC6C-4524-B963-4CE5E0ACC12B");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CODISTATBOOK.InitMastroBox(BUK_CODISTATBOOK_MST_CODSTABOOPAG, BUK_CODISTATBOOK_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_RPTBOX_PAGEFOOTER, "4E0BCDE7-8189-48E9-B456-D751DEE137F4");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
    BUK_CODISTATBOOK.InitMastroBox(BUK_CODISTATBOOK_MST_CODSTABOOPAG, BUK_CODISTATBOOK_RPTBOX_TITOLO, 900, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_RPTBOX_TITOLO, "0C1EF2BF-F930-4DCA-9FFA-4FE16C186B4A");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_CODISTATBOOK_RPT_NEWREPORT_InitQuery() { BUK_CODISTATBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CODISTATBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  STAT_IVA A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_CODISTATBOOK.SetReportQuery(BUK_CODISTATBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "BDDA8AF8-D118-4D04-B637-FAFDFEE47D02");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CODISTATBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CODISTATBOOK.InitReport(BUK_CODISTATBOOK_RPT_NEWREPORT, 196609);
    BUK_CODISTATBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_RPT_NEWREPORT, "F6AD143C-7452-41E5-8BCD-92DA4F757039");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CODISTATBOOK.InitSection(BUK_CODISTATBOOK_RPT_NEWREPORT, BUK_CODISTATBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODISTATBOOK.SetSectionRendersInto(BUK_CODISTATBOOK_SEC_PAGEHEADER, BUK_CODISTATBOOK_RPTBOX_PAGEBODY);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_SEC_PAGEHEADER, "15F0442B-41F0-42DD-B12F-9F26C948F494");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CODISTATBOOK.InitReportBox(BUK_CODISTATBOOK_SEC_PAGEHEADER, BUK_CODISTATBOOK_RPTBOX_CODICEHEADER, 300, 0, 1100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_RPTBOX_CODICEHEADER, "F1F3C97E-B05B-4843-AD41-ACA18411B683");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_CODISTATBOOK.InitBoxSpan(BUK_CODISTATBOOK_RPTBOX_CODICEHEADER, BUK_CODISTATBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_SPAN_CODICE, "7F4B50A0-CCFF-4D12-ADED-1205335DAB66");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_SPAN_CODICE, "CODICE");
    BUK_CODISTATBOOK.InitReportBox(BUK_CODISTATBOOK_SEC_PAGEHEADER, BUK_CODISTATBOOK_RPTBOX_DESCRIHEADER, 2000, 0, 15300, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_RPTBOX_DESCRIHEADER, "34446438-EC2E-4E40-A12C-B9F600DE3299");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_CODISTATBOOK.InitBoxSpan(BUK_CODISTATBOOK_RPTBOX_DESCRIHEADER, BUK_CODISTATBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_SPAN_DESCRIZIONE, "55584E26-8072-4E0D-86E7-B15936D1B085");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CODISTATBOOK.InitSection(BUK_CODISTATBOOK_RPT_NEWREPORT, BUK_CODISTATBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODISTATBOOK.SetSectionRendersInto(BUK_CODISTATBOOK_SEC_TITOLO, BUK_CODISTATBOOK_RPTBOX_TITOLO);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_SEC_TITOLO, "C5210E42-A46B-4DBD-94D7-B3861FCC097C");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_SEC_TITOLO, "TITOLO");
    BUK_CODISTATBOOK.InitReportBox(BUK_CODISTATBOOK_SEC_TITOLO, BUK_CODISTATBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_RPTBOX_NEWBOX, "D6B4563B-F523-42C9-B694-A5EC5097D933");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_CODISTATBOOK.InitBoxSpan(BUK_CODISTATBOOK_RPTBOX_NEWBOX, BUK_CODISTATBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Codici Statistici", 1);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_SPAN_VARIADIBILAN, "D64E4918-C0E7-4E39-9363-8780768D57E4");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_CODISTATBOOK.InitSection(BUK_CODISTATBOOK_RPT_NEWREPORT, BUK_CODISTATBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODISTATBOOK.SetSectionRendersInto(BUK_CODISTATBOOK_SEC_DETAIL, BUK_CODISTATBOOK_RPTBOX_PAGEBODY);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_SEC_DETAIL, "C18E105C-C375-4DA8-AFC1-675C2083FDD4");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_SEC_DETAIL, "DETAIL");
    BUK_CODISTATBOOK.InitReportBox(BUK_CODISTATBOOK_SEC_DETAIL, BUK_CODISTATBOOK_RPTBOX_CODICE, 200, 0, 1300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_RPTBOX_CODICE, "1E2CC25D-E7A9-49B2-AE73-ECFDD05C011C");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_RPTBOX_CODICE, "CODICE");
    BUK_CODISTATBOOK.InitBoxSpan(BUK_CODISTATBOOK_RPTBOX_CODICE, BUK_CODISTATBOOK_SPAN_STIVCOCOSCSB, MyGlb.VIS_DEFAREPOSTYL, 5, 3, 0, 271384705, "Codice", "::CODICE", 1);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_SPAN_STIVCOCOSCSB, "8534D3E6-195A-40EA-9787-42769817B2FA");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_SPAN_STIVCOCOSCSB, "STIVCOCOSCSB");
    BUK_CODISTATBOOK.InitReportBox(BUK_CODISTATBOOK_SEC_DETAIL, BUK_CODISTATBOOK_RPTBOX_DESCRIZIONE, 2000, 0, 15300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_RPTBOX_DESCRIZIONE, "73A2E802-DE1D-4A46-82F1-3FDCA456D355");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_CODISTATBOOK.InitBoxSpan(BUK_CODISTATBOOK_RPTBOX_DESCRIZIONE, BUK_CODISTATBOOK_SPAN_STIVDECOSCSB, MyGlb.VIS_DEFAREPOSTYL, 5, 100, 0, 271384705, "Descrizione", "::DESCRIZIONE", 1);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_SPAN_STIVDECOSCSB, "01FB64A3-249C-44CD-98E3-347050435BC4");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_SPAN_STIVDECOSCSB, "STIVDECOSCSB");
    BUK_CODISTATBOOK.InitSection(BUK_CODISTATBOOK_RPT_NEWREPORT, BUK_CODISTATBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODISTATBOOK.SetSectionRendersInto(BUK_CODISTATBOOK_SEC_PAGEFOOTER, BUK_CODISTATBOOK_RPTBOX_PAGEFOOTER);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_SEC_PAGEFOOTER, "05D767F4-CC63-4894-8999-CD27B227A317");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CODISTATBOOK.InitSection(BUK_CODISTATBOOK_RPT_NEWREPORT, BUK_CODISTATBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CODISTATBOOK.SetSectionRendersInto(BUK_CODISTATBOOK_SEC_REPORTFOOTER, BUK_CODISTATBOOK_RPTBOX_PAGEBODY);
    BUK_CODISTATBOOK.SetRTCGuid(BUK_CODISTATBOOK_SEC_REPORTFOOTER, "EB36C80B-599F-43F1-B0E4-6264B887A0CD");
    BUK_CODISTATBOOK.SetObjCode(BUK_CODISTATBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CODISTATBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CODISTATBOOK_InitLinks()
  {
    BUK_CODISTATBOOK.SetBoxNextBox(BUK_CODISTATBOOK_RPTBOX_PAGEBODY, BUK_CODISTATBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CODICISTATIS) PAN_CODICISTATIS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CODICISTATIS) PAN_CODICISTATIS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CODICISTATIS) PAN_CODICISTATIS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CODICISTATIS) PAN_CODICISTATIS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CODICISTATIS) PAN_CODICISTATIS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CODISTATBOOK) BUK_CODISTATBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CODISTATBOOK) BUK_CODISTATBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CODISTATBOOK) BUK_CODISTATBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CODISTATBOOK) BUK_CODISTATBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CODISTATBOOK) BUK_CODISTATBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CODISTATBOOK) BUK_CODISTATBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CODISTATBOOK) BUK_CODISTATBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CODISTATBOOK) BUK_CODISTATBOOK_OnPreview();
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
