// **********************************************
// Uffici
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Uffici extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_UFFICI_CODICE = 0;
  private static int PFL_UFFICI_DESCRIZIONE = 1;
  private static int PFL_UFFICI_UTENTEINSERI = 2;
  private static int PFL_UFFICI_DATAINSERIME = 3;
  private static int PFL_UFFICI_UTENTULTIAGG = 4;
  private static int PFL_UFFICI_DATAULTIMAGG = 5;

  private static int PPQRY_T54 = 0;


  IDPanel PAN_UFFICI;
  CIDREObj BUK_UFFICIBOOK;
  OBook BKW_UFFICIBOOK;
  //
  // Template Pages constants
  private static int BUK_UFFICIBOOK_MST_UFFIBOOKPAGE = 1;
  private static int BUK_UFFICIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_UFFICIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_UFFICIBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_UFFICIBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_UFFICIBOOK_RPT_NEWREPORT = 6;
  private static int BUK_UFFICIBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_UFFICIBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_UFFICIBOOK_SPAN_CODICE = 9;
  private static int BUK_UFFICIBOOK_RPTBOX_DESCRIHEADER = 10;
  private static int BUK_UFFICIBOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_UFFICIBOOK_SEC_TITOLO = 12;
  private static int BUK_UFFICIBOOK_RPTBOX_NEWBOX = 13;
  private static int BUK_UFFICIBOOK_SPAN_VARIADIBILAN = 14;
  private static int BUK_UFFICIBOOK_SEC_DETAIL = 15;
  private static int BUK_UFFICIBOOK_RPTBOX_CODICE = 16;
  private static int BUK_UFFICIBOOK_SPAN_T53CODUFUFBO = 17;
  private static int BUK_UFFICIBOOK_RPTBOX_DESCRIZIONE = 18;
  private static int BUK_UFFICIBOOK_SPAN_T53DESUFUFBO = 19;
  private static int BUK_UFFICIBOOK_SEC_REPORTFOOTER = 20;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T54(IMDB);
    Init_PQRY_T53(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T54(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T54, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_T54, "PQRY_T54");
    IMDB.set_FldCode(IMDBDef9.PQRY_T54,IMDBDef9.PQSL_T54_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T54,IMDBDef9.PQSL_T54_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T54,IMDBDef9.PQSL_T54_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T54,IMDBDef9.PQSL_T54_DESCRIZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T54,IMDBDef9.PQSL_T54_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T54,IMDBDef9.PQSL_T54_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T54,IMDBDef9.PQSL_T54_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T54,IMDBDef9.PQSL_T54_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T54,IMDBDef9.PQSL_T54_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T54,IMDBDef9.PQSL_T54_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T54,IMDBDef9.PQSL_T54_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T54,IMDBDef9.PQSL_T54_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T54, 0);
  }

  private static void Init_PQRY_T53(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T53, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_T53, "PQRY_T53");
    IMDB.set_FldCode(IMDBDef9.PQRY_T53,IMDBDef9.PQSL_T53_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T53,IMDBDef9.PQSL_T53_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T53,IMDBDef9.PQSL_T53_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T53,IMDBDef9.PQSL_T53_DESCRIZIONE,5,60,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T53, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Uffici(MyWebEntryPoint w, IMDBObj imdb)
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
  public Uffici()
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
    FormIdx = MyGlb.FRM_UFFICI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D15592FC-0FBC-49A7-87B5-BD90D70E10E8";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 616;
    DesignHeight = 386;
    set_Caption(new IDVariant("Uffici"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 616;
    Frames[1].Height = 360;
    Frames[1].Caption = "Uffici";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_UFFICI = new IDPanel(w, this, 1, "PAN_UFFICI");
    Frames[1].Content = PAN_UFFICI;
    PAN_UFFICI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_UFFICI.VS = MainFrm.VisualStyleList;
    PAN_UFFICI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 616-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_UFFICIBOOK != null)
      PAN_UFFICI.SetBook(BUK_UFFICIBOOK);
    PAN_UFFICI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "332FE691-FDDB-40E7-8F4D-273D9CCA2E8F");
    PAN_UFFICI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 456, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_UFFICI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_UFFICI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_UFFICI.InitStatus = 2;
    PAN_UFFICI_Init();
    PAN_UFFICI_InitFields();
    PAN_UFFICI_InitQueries();
    BKW_UFFICIBOOK = new OBook(this);
    BUK_UFFICIBOOK = new CIDREObj(BKW_UFFICIBOOK);
    BKW_UFFICIBOOK.iGuid = "FCCA5D36-DEC8-431D-BDE8-67FCFF24860E";
    BKW_UFFICIBOOK.Code = "BUK_UFFICIBOOK";
    BKW_UFFICIBOOK.BookObj = BUK_UFFICIBOOK;
    BKW_UFFICIBOOK.InitDefMasks();
    BUK_UFFICIBOOK.InitBook(1, 1245185, "Uffici Book", IMDB, MainFrm.VisualStyleList);
    BUK_UFFICIBOOK.InitHTML();
    BUK_UFFICIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_UFFICIBOOK.Book.SetMainFrm(MainFrm);
    BUK_UFFICIBOOK.SetRTCGuid(0, "FCCA5D36-DEC8-431D-BDE8-67FCFF24860E");
    BUK_UFFICIBOOK.SetObjCode(0, "UFFICIBOOK");
    if (PAN_UFFICI != null)
      PAN_UFFICI.SetBook(BUK_UFFICIBOOK);
    BUK_UFFICIBOOK_MST_UFFIBOOKPAGE_Init();
    BUK_UFFICIBOOK_RPT_NEWREPORT_Init();
    BUK_UFFICIBOOK_InitLinks();
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
      PAN_UFFICI.UpdatePanel(MainFrm);
      // BUK_UFFICIBOOK.UpdateBook();
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
    if (Code.equals("BUK_UFFICIBOOK")) return BUK_UFFICIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Uffici);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Uffici.class.getName() : (Glb.ClassWithPackage(Uffici.class) ? Uffici.class.getName().substring(Uffici.class.getPackage().getName().length() + 1) : Uffici.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Uffici On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_UFFICI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_UFFICI);
      // 
      // Uffici On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_UFFICI.IsNewRow()))
      {
        PAN_UFFICI.SetFlags (Glb.OBJ_FIELD, PFL_UFFICI_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_UFFICI.SetFlags (Glb.OBJ_FIELD, PFL_UFFICI_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_UFFICI.set_ToolTip(Glb.OBJ_FIELD,PFL_UFFICI_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T54, IMDBDef9.PQSL_T54_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Uffici", "UfficiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Uffici On Database Error Event
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
  private void PAN_UFFICI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_UFFICI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Uffici On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Uffici", "UfficiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Uffici On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_UFFICI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Uffici On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T53PD(IMDB.Value(IMDBDef9.PQRY_T54, IMDBDef9.PQSL_T54_CODICE, 0));
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
      MainFrm.ErrObj.ProcError ("Uffici", "UfficiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Uffici On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_UFFICI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Uffici On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T54, IMDBDef9.PQSL_T54_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T54, IMDBDef9.PQSL_T54_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T54, IMDBDef9.PQSL_T54_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T54, IMDBDef9.PQSL_T54_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T54, IMDBDef9.PQSL_T54_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T54, IMDBDef9.PQSL_T54_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Uffici", "UfficiOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("Uffici", "LoadEvent", _e);
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
  private void PAN_UFFICI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_UFFICI, Cancel);
    // Stub
  }

  private void PAN_UFFICI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_UFFICI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_UFFICI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_UFFICI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_UFFICI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_UFFICIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_UFFICIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_UFFICIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_UFFICIBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_UFFICIBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_UFFICIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_UFFICIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_UFFICIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_UFFICIBOOK_MST_UFFIBOOKPAGE)
    {
      BUK_UFFICIBOOK.set_SpanValue(BUK_UFFICIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_UFFICIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_UFFICIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_UFFICIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_UFFICIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_UFFICIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_UFFICIBOOK_OnPreview()
  {
    PreviewBook = BKW_UFFICIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_UFFICI_Init()
  {

    PAN_UFFICI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_UFFICI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_UFFICI.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_UFFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, "16BF8E38-723F-411B-AB3F-35E4B2E0F3A3");
    PAN_UFFICI.set_Header(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, "Codice");
    PAN_UFFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, "");
    PAN_UFFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_UFFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_UFFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, "056BCD97-F4AB-4E01-A888-353BD6C127BA");
    PAN_UFFICI.set_Header(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, "Descrizione");
    PAN_UFFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, "");
    PAN_UFFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_UFFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_UFFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, "E86A7CE3-96F0-4823-8180-3A5BDB4E83CE");
    PAN_UFFICI.set_Header(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_UFFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, "");
    PAN_UFFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_UFFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_UFFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, "65537721-58CE-465F-9AE7-637F71CFD769");
    PAN_UFFICI.set_Header(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_UFFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, "");
    PAN_UFFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_UFFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_UFFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, "2A8A5691-537D-4DD5-B108-1EEC8A27A169");
    PAN_UFFICI.set_Header(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_UFFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, "");
    PAN_UFFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_UFFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_UFFICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, "B890BBB8-AF9B-411B-BD4E-F80EFF1F34AF");
    PAN_UFFICI.set_Header(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_UFFICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, "");
    PAN_UFFICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_UFFICI.SetFlags(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_UFFICI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_UFFICI.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_UFFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_UFFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_UFFICI.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_UFFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_UFFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_UFFICI.SetFieldPage(PFL_UFFICI_CODICE, -1, -1);
    PAN_UFFICI.SetFieldPanel(PFL_UFFICI_CODICE, PPQRY_T54, "A.CODICE", "CODICE", 1, 5, 0, -13997);
    PAN_UFFICI.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 400, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_UFFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_UFFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_UFFICI.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_UFFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_UFFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_UFFICI.SetFieldPage(PFL_UFFICI_DESCRIZIONE, -1, -1);
    PAN_UFFICI.SetFieldPanel(PFL_UFFICI_DESCRIZIONE, PPQRY_T54, "A.DESCRIZIONE", "DESCRIZIONE", 5, 60, 0, -13997);
    PAN_UFFICI.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, MyGlb.PANEL_LIST, 456, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_UFFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_UFFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_UFFICI.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_UFFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_UFFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_UFFICI.SetFieldPage(PFL_UFFICI_UTENTEINSERI, -1, -1);
    PAN_UFFICI.SetFieldPanel(PFL_UFFICI_UTENTEINSERI, PPQRY_T54, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_UFFICI.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, MyGlb.PANEL_LIST, 576, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_UFFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_UFFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_UFFICI.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_UFFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_UFFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_UFFICI.SetFieldPage(PFL_UFFICI_DATAINSERIME, -1, -1);
    PAN_UFFICI.SetFieldPanel(PFL_UFFICI_DATAINSERIME, PPQRY_T54, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_UFFICI.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, MyGlb.PANEL_LIST, 684, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_UFFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_UFFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_UFFICI.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_UFFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_UFFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_UFFICI.SetFieldPage(PFL_UFFICI_UTENTULTIAGG, -1, -1);
    PAN_UFFICI.SetFieldPanel(PFL_UFFICI_UTENTULTIAGG, PPQRY_T54, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_UFFICI.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, MyGlb.PANEL_LIST, 796, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_UFFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_UFFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_UFFICI.SetRect(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_UFFICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_UFFICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_UFFICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_UFFICI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_UFFICI.SetFieldPage(PFL_UFFICI_DATAULTIMAGG, -1, -1);
    PAN_UFFICI.SetFieldPanel(PFL_UFFICI_DATAULTIMAGG, PPQRY_T54, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_UFFICI_InitQueries()
  {
    StringBuffer SQL;

    PAN_UFFICI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_UFFICI.SetIMDB(IMDB, "PQRY_T54", true);
    PAN_UFFICI.set_SetString(MyGlb.MASTER_ROWNAME, "T53");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_UFFICI.SetQuery(PPQRY_T54, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T53 A ");
    PAN_UFFICI.SetQuery(PPQRY_T54, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UFFICI.SetQuery(PPQRY_T54, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UFFICI.SetQuery(PPQRY_T54, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_UFFICI.SetQuery(PPQRY_T54, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_UFFICI.SetQuery(PPQRY_T54, 5, SQL, -1, "");
    PAN_UFFICI.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_UFFICI.SetMasterTable(0, "T53");
    PAN_UFFICI.AddToSortList(PFL_UFFICI_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_UFFICI.Status() == 2)
    {
      int oldListQBE = PAN_UFFICI.iUseListQBE;
      PAN_UFFICI.iUseListQBE = 0;
      PAN_UFFICI.PanelCommand(Glb.PCM_SEARCH);
      PAN_UFFICI.PanelCommand(Glb.PCM_FIND);
      PAN_UFFICI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_UFFICIBOOK_MST_UFFIBOOKPAGE_Init()
  {
    BUK_UFFICIBOOK.InitMastro(BUK_UFFICIBOOK_MST_UFFIBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_MST_UFFIBOOKPAGE, "49BBE303-D5B4-411E-AC44-6E9CD69A7174");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_MST_UFFIBOOKPAGE, "UFFIBOOKPAGE");
    BUK_UFFICIBOOK.InitMastroBox(BUK_UFFICIBOOK_MST_UFFIBOOKPAGE, BUK_UFFICIBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_RPTBOX_NUMEROPAGINA, "459ECF7B-7BC2-4A84-9D61-52D9C6DD087E");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_UFFICIBOOK.InitBoxSpan(BUK_UFFICIBOOK_RPTBOX_NUMEROPAGINA, BUK_UFFICIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_SPAN_NUMEROPAGINA, "15980ABF-6B2B-466B-A2FC-D4E4538463BC");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_UFFICIBOOK.InitMastroBox(BUK_UFFICIBOOK_MST_UFFIBOOKPAGE, BUK_UFFICIBOOK_RPTBOX_PAGEBODY, 1000, 3000, 19000, 25300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_RPTBOX_PAGEBODY, "9942F142-3428-440C-B614-1CFC48F4EA17");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_UFFICIBOOK.InitMastroBox(BUK_UFFICIBOOK_MST_UFFIBOOKPAGE, BUK_UFFICIBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_RPTBOX_TITOLO, "E291AE43-063D-4C17-813B-B1B2A145C48B");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_UFFICIBOOK_RPT_NEWREPORT_InitQuery() { BUK_UFFICIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_UFFICIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  T53 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_UFFICIBOOK.SetReportQuery(BUK_UFFICIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "F82012EA-2EF4-4184-A078-0C9DFCE3AEC3");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_UFFICIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_UFFICIBOOK.InitReport(BUK_UFFICIBOOK_RPT_NEWREPORT, 196609);
    BUK_UFFICIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_RPT_NEWREPORT, "F20BBE4A-A45E-420C-A68D-C14667A3F4BF");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_UFFICIBOOK.InitSection(BUK_UFFICIBOOK_RPT_NEWREPORT, BUK_UFFICIBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_UFFICIBOOK.SetSectionRendersInto(BUK_UFFICIBOOK_SEC_PAGEHEADER, BUK_UFFICIBOOK_RPTBOX_PAGEBODY);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_SEC_PAGEHEADER, "2D977AFB-26CD-461B-B62A-6AFDA291E3BA");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_UFFICIBOOK.InitReportBox(BUK_UFFICIBOOK_SEC_PAGEHEADER, BUK_UFFICIBOOK_RPTBOX_CODICEHEADER, 300, 0, 1100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_RPTBOX_CODICEHEADER, "BC940E97-05BC-4555-B8A3-45DC483D9D57");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_UFFICIBOOK.InitBoxSpan(BUK_UFFICIBOOK_RPTBOX_CODICEHEADER, BUK_UFFICIBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_SPAN_CODICE, "4668E9B0-62CC-4791-8DA4-4B8F36F39EC8");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_SPAN_CODICE, "CODICE");
    BUK_UFFICIBOOK.InitReportBox(BUK_UFFICIBOOK_SEC_PAGEHEADER, BUK_UFFICIBOOK_RPTBOX_DESCRIHEADER, 1900, 0, 15600, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_RPTBOX_DESCRIHEADER, "C4E16561-D360-4E8C-AE3A-729EF83D318A");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_UFFICIBOOK.InitBoxSpan(BUK_UFFICIBOOK_RPTBOX_DESCRIHEADER, BUK_UFFICIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_SPAN_DESCRIZIONE, "4FEEBEED-B72A-4DBB-AA22-B078252F5622");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_UFFICIBOOK.InitSection(BUK_UFFICIBOOK_RPT_NEWREPORT, BUK_UFFICIBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_UFFICIBOOK.SetSectionRendersInto(BUK_UFFICIBOOK_SEC_TITOLO, BUK_UFFICIBOOK_RPTBOX_TITOLO);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_SEC_TITOLO, "0AC3DC36-22CA-4857-A8F9-F89C8EA95BF3");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_SEC_TITOLO, "TITOLO");
    BUK_UFFICIBOOK.InitReportBox(BUK_UFFICIBOOK_SEC_TITOLO, BUK_UFFICIBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_RPTBOX_NEWBOX, "5339CCA0-39D9-41A9-B237-9708451BB8D4");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_UFFICIBOOK.InitBoxSpan(BUK_UFFICIBOOK_RPTBOX_NEWBOX, BUK_UFFICIBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Uffici", 1);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_SPAN_VARIADIBILAN, "2A3F3538-9DFD-462A-AEE8-5E17DCCC3D4F");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_UFFICIBOOK.InitSection(BUK_UFFICIBOOK_RPT_NEWREPORT, BUK_UFFICIBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_UFFICIBOOK.SetSectionRendersInto(BUK_UFFICIBOOK_SEC_DETAIL, BUK_UFFICIBOOK_RPTBOX_PAGEBODY);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_SEC_DETAIL, "2776C5AF-E449-433F-B6FC-AFE7B01BF637");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_SEC_DETAIL, "DETAIL");
    BUK_UFFICIBOOK.InitReportBox(BUK_UFFICIBOOK_SEC_DETAIL, BUK_UFFICIBOOK_RPTBOX_CODICE, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_RPTBOX_CODICE, "6D2160D1-6D93-4AE8-B713-5CA11E36FC3C");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_RPTBOX_CODICE, "CODICE");
    BUK_UFFICIBOOK.InitBoxSpan(BUK_UFFICIBOOK_RPTBOX_CODICE, BUK_UFFICIBOOK_SPAN_T53CODUFUFBO, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_SPAN_T53CODUFUFBO, "43B08275-C2F6-4F43-BF68-965D78CADBFE");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_SPAN_T53CODUFUFBO, "T53CODUFUFBO");
    BUK_UFFICIBOOK.InitReportBox(BUK_UFFICIBOOK_SEC_DETAIL, BUK_UFFICIBOOK_RPTBOX_DESCRIZIONE, 1900, 0, 15600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_RPTBOX_DESCRIZIONE, "7E4D2246-BBC7-4F79-BFB5-047C547CB677");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_UFFICIBOOK.InitBoxSpan(BUK_UFFICIBOOK_RPTBOX_DESCRIZIONE, BUK_UFFICIBOOK_SPAN_T53DESUFUFBO, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_SPAN_T53DESUFUFBO, "4938821B-2C03-4772-BBD1-11230AA299C0");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_SPAN_T53DESUFUFBO, "T53DESUFUFBO");
    BUK_UFFICIBOOK.InitSection(BUK_UFFICIBOOK_RPT_NEWREPORT, BUK_UFFICIBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_UFFICIBOOK.SetSectionRendersInto(BUK_UFFICIBOOK_SEC_REPORTFOOTER, BUK_UFFICIBOOK_RPTBOX_PAGEBODY);
    BUK_UFFICIBOOK.SetRTCGuid(BUK_UFFICIBOOK_SEC_REPORTFOOTER, "76F6D075-8F63-48E3-806C-1FF89B87DBB0");
    BUK_UFFICIBOOK.SetObjCode(BUK_UFFICIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_UFFICIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_UFFICIBOOK_InitLinks()
  {
    BUK_UFFICIBOOK.SetBoxNextBox(BUK_UFFICIBOOK_RPTBOX_PAGEBODY, BUK_UFFICIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_UFFICI) PAN_UFFICI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_UFFICI) PAN_UFFICI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_UFFICI) PAN_UFFICI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_UFFICI) PAN_UFFICI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_UFFICI) PAN_UFFICI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_UFFICI) PAN_UFFICI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_UFFICIBOOK) BUK_UFFICIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_UFFICIBOOK) BUK_UFFICIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_UFFICIBOOK) BUK_UFFICIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_UFFICIBOOK) BUK_UFFICIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_UFFICIBOOK) BUK_UFFICIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_UFFICIBOOK) BUK_UFFICIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_UFFICIBOOK) BUK_UFFICIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_UFFICIBOOK) BUK_UFFICIBOOK_OnPreview();
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
