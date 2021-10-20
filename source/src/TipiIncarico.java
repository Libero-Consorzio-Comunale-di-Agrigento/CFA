// **********************************************
// Tipi Incarico
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiIncarico extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPIINCARICO_CODICE = 0;
  private static int PFL_TIPIINCARICO_DESCRIZIONE = 1;
  private static int PFL_TIPIINCARICO_UTENTEINSERI = 2;
  private static int PFL_TIPIINCARICO_DATAINSERIME = 3;
  private static int PFL_TIPIINCARICO_UTENTULTIAGG = 4;
  private static int PFL_TIPIINCARICO_DATAULTIMAGG = 5;

  private static int PPQRY_TIPIINCARIC1 = 0;


  IDPanel PAN_TIPIINCARICO;
  CIDREObj BUK_TIPIINCABOOK;
  OBook BKW_TIPIINCABOOK;
  //
  // Template Pages constants
  private static int BUK_TIPIINCABOOK_MST_TIPINCBOOPAG = 1;
  private static int BUK_TIPIINCABOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_TIPIINCABOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_TIPIINCABOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_TIPIINCABOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_TIPIINCABOOK_RPT_NEWREPORT = 6;
  private static int BUK_TIPIINCABOOK_SEC_PAGEHEADER = 7;
  private static int BUK_TIPIINCABOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_TIPIINCABOOK_SPAN_CODICE = 9;
  private static int BUK_TIPIINCABOOK_RPTBOX_DESCRIHEADER = 10;
  private static int BUK_TIPIINCABOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_TIPIINCABOOK_SEC_TITOLO = 12;
  private static int BUK_TIPIINCABOOK_RPTBOX_NEWBOX = 13;
  private static int BUK_TIPIINCABOOK_SPAN_VARIADIBILAN = 14;
  private static int BUK_TIPIINCABOOK_SEC_DETAIL = 15;
  private static int BUK_TIPIINCABOOK_RPTBOX_CODICE = 16;
  private static int BUK_TIPIINCABOOK_SPAN_TIINCOTIITIB = 17;
  private static int BUK_TIPIINCABOOK_RPTBOX_DESCRIZIONE = 18;
  private static int BUK_TIPIINCABOOK_SPAN_TIINDETIITIB = 19;
  private static int BUK_TIPIINCABOOK_SEC_PAGEFOOTER = 20;
  private static int BUK_TIPIINCABOOK_SEC_REPORTFOOTER = 21;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_TIPIINCARIC1(IMDB);
    Init_PQRY_TIPIINCARICO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_TIPIINCARIC1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_TIPIINCARIC1, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_TIPIINCARIC1, "PQRY_TIPIINCARIC1");
    IMDB.set_FldCode(IMDBDef9.PQRY_TIPIINCARIC1,IMDBDef9.PQSL_TIPIINCARIC1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_TIPIINCARIC1,IMDBDef9.PQSL_TIPIINCARIC1_CODICE,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_TIPIINCARIC1,IMDBDef9.PQSL_TIPIINCARIC1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_TIPIINCARIC1,IMDBDef9.PQSL_TIPIINCARIC1_DESCRIZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_TIPIINCARIC1,IMDBDef9.PQSL_TIPIINCARIC1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_TIPIINCARIC1,IMDBDef9.PQSL_TIPIINCARIC1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_TIPIINCARIC1,IMDBDef9.PQSL_TIPIINCARIC1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_TIPIINCARIC1,IMDBDef9.PQSL_TIPIINCARIC1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_TIPIINCARIC1,IMDBDef9.PQSL_TIPIINCARIC1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_TIPIINCARIC1,IMDBDef9.PQSL_TIPIINCARIC1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_TIPIINCARIC1,IMDBDef9.PQSL_TIPIINCARIC1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_TIPIINCARIC1,IMDBDef9.PQSL_TIPIINCARIC1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_TIPIINCARIC1, 0);
  }

  private static void Init_PQRY_TIPIINCARICO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_TIPIINCARICO, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_TIPIINCARICO, "PQRY_TIPIINCARICO");
    IMDB.set_FldCode(IMDBDef9.PQRY_TIPIINCARICO,IMDBDef9.PQSL_TIPIINCARICO_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_TIPIINCARICO,IMDBDef9.PQSL_TIPIINCARICO_CODICE,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_TIPIINCARICO,IMDBDef9.PQSL_TIPIINCARICO_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_TIPIINCARICO,IMDBDef9.PQSL_TIPIINCARICO_DESCRIZIONE,5,60,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_TIPIINCARICO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiIncarico(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiIncarico()
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
    FormIdx = MyGlb.FRM_TIPIINCARICO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FD729664-B7A3-475D-9B2C-0BA691081BCD";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 652;
    DesignHeight = 390;
    set_Caption(new IDVariant("Tipi Incarico"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 652;
    Frames[1].Height = 364;
    Frames[1].Caption = "Tipi Incarico";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_TIPIINCARICO = new IDPanel(w, this, 1, "PAN_TIPIINCARICO");
    Frames[1].Content = PAN_TIPIINCARICO;
    PAN_TIPIINCARICO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIINCARICO.VS = MainFrm.VisualStyleList;
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 652-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_TIPIINCABOOK != null)
      PAN_TIPIINCARICO.SetBook(BUK_TIPIINCABOOK);
    PAN_TIPIINCARICO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "87B605DB-40EA-4717-B285-EE6AC7C81209");
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 512, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPIINCARICO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIINCARICO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIINCARICO.InitStatus = 2;
    PAN_TIPIINCARICO_Init();
    PAN_TIPIINCARICO_InitFields();
    PAN_TIPIINCARICO_InitQueries();
    BKW_TIPIINCABOOK = new OBook(this);
    BUK_TIPIINCABOOK = new CIDREObj(BKW_TIPIINCABOOK);
    BKW_TIPIINCABOOK.iGuid = "0069DCCC-22F3-4B6F-BA95-184B7F0430AA";
    BKW_TIPIINCABOOK.Code = "BUK_TIPIINCABOOK";
    BKW_TIPIINCABOOK.BookObj = BUK_TIPIINCABOOK;
    BKW_TIPIINCABOOK.InitDefMasks();
    BUK_TIPIINCABOOK.InitBook(1, 1245185, "Tipi Incarico Book", IMDB, MainFrm.VisualStyleList);
    BUK_TIPIINCABOOK.InitHTML();
    BUK_TIPIINCABOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_TIPIINCABOOK.Book.SetMainFrm(MainFrm);
    BUK_TIPIINCABOOK.SetRTCGuid(0, "0069DCCC-22F3-4B6F-BA95-184B7F0430AA");
    BUK_TIPIINCABOOK.SetObjCode(0, "TIPIINCABOOK");
    if (PAN_TIPIINCARICO != null)
      PAN_TIPIINCARICO.SetBook(BUK_TIPIINCABOOK);
    BUK_TIPIINCABOOK_MST_TIPINCBOOPAG_Init();
    BUK_TIPIINCABOOK_RPT_NEWREPORT_Init();
    BUK_TIPIINCABOOK_InitLinks();
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
      PAN_TIPIINCARICO.UpdatePanel(MainFrm);
      // BUK_TIPIINCABOOK.UpdateBook();
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
    if (Code.equals("BUK_TIPIINCABOOK")) return BUK_TIPIINCABOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof TipiIncarico);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiIncarico.class.getName() : (Glb.ClassWithPackage(TipiIncarico.class) ? TipiIncarico.class.getName().substring(TipiIncarico.class.getPackage().getName().length() + 1) : TipiIncarico.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tipi Incarico On Database Error Event
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
  private void PAN_TIPIINCARICO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_TIPIINCARICO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Tipi Incarico On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiIncarico", "TipiIncaricoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Incarico On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIINCARICO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPIINCARICO);
      // 
      // Tipi Incarico On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_TIPIINCARICO.IsNewRow()))
      {
        PAN_TIPIINCARICO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIINCARICO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_TIPIINCARICO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIINCARICO_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_TIPIINCARIC1, IMDBDef9.PQSL_TIPIINCARIC1_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiIncarico", "TipiIncaricoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Incarico On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_TIPIINCARICO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Incarico On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_TIPIINCARIC1, IMDBDef9.PQSL_TIPIINCARIC1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_TIPIINCARIC1, IMDBDef9.PQSL_TIPIINCARIC1_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_TIPIINCARIC1, IMDBDef9.PQSL_TIPIINCARIC1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_TIPIINCARIC1, IMDBDef9.PQSL_TIPIINCARIC1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_TIPIINCARIC1, IMDBDef9.PQSL_TIPIINCARIC1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_TIPIINCARIC1, IMDBDef9.PQSL_TIPIINCARIC1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiIncarico", "TipiIncaricoOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("TipiIncarico", "LoadEvent", _e);
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
  private void PAN_TIPIINCARICO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIINCARICO, Cancel);
    // Stub
  }

  private void PAN_TIPIINCARICO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPIINCARICO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_TIPIINCARICO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIINCARICO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIINCARICO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_TIPIINCABOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_TIPIINCABOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_TIPIINCABOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_TIPIINCABOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_TIPIINCABOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_TIPIINCABOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_TIPIINCABOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_TIPIINCABOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_TIPIINCABOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_TIPIINCABOOK_MST_TIPINCBOOPAG)
    {
      BUK_TIPIINCABOOK.set_SpanValue(BUK_TIPIINCABOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPIINCABOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPIINCABOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_TIPIINCABOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_TIPIINCABOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_TIPIINCABOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_TIPIINCABOOK_OnPreview()
  {
    PreviewBook = BKW_TIPIINCABOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPIINCARICO_Init()
  {

    PAN_TIPIINCARICO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIINCARICO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPIINCARICO.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_TIPIINCARICO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, "99492E33-B0CD-470D-BC0A-65421C6C8F16");
    PAN_TIPIINCARICO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, "Codice");
    PAN_TIPIINCARICO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, "Codice del Tipo di Incarico");
    PAN_TIPIINCARICO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIINCARICO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_TIPIINCARICO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, "165A03EC-7315-4AE0-930E-A81950255084");
    PAN_TIPIINCARICO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, "Descrizione");
    PAN_TIPIINCARICO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, "Descrizione del Tipo di Incarico");
    PAN_TIPIINCARICO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIINCARICO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_TIPIINCARICO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, "D1D91F31-0032-433B-959A-FA6B9D02399D");
    PAN_TIPIINCARICO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_TIPIINCARICO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, "");
    PAN_TIPIINCARICO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIINCARICO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIINCARICO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, "ABFEC6AA-2625-437E-9ED5-EE31FB4AD1C7");
    PAN_TIPIINCARICO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, "DATA INSERIMENTO");
    PAN_TIPIINCARICO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, "");
    PAN_TIPIINCARICO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIINCARICO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIINCARICO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, "48E94D25-B0C2-4AAD-853F-1814E1A9F34C");
    PAN_TIPIINCARICO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_TIPIINCARICO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, "");
    PAN_TIPIINCARICO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIINCARICO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIINCARICO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, "1F9BECA5-D9FD-481B-B5E0-80FE02E5FA73");
    PAN_TIPIINCARICO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_TIPIINCARICO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, "");
    PAN_TIPIINCARICO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIINCARICO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPIINCARICO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_TIPIINCARICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIINCARICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_TIPIINCARICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIINCARICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPIINCARICO.SetFieldPage(PFL_TIPIINCARICO_CODICE, -1, -1);
    PAN_TIPIINCARICO.SetFieldPanel(PFL_TIPIINCARICO_CODICE, PPQRY_TIPIINCARIC1, "A.CODICE", "CODICE", 1, 3, 0, -13997);
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 456, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_TIPIINCARICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIINCARICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_TIPIINCARICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIINCARICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPIINCARICO.SetFieldPage(PFL_TIPIINCARICO_DESCRIZIONE, -1, -1);
    PAN_TIPIINCARICO.SetFieldPanel(PFL_TIPIINCARICO_DESCRIZIONE, PPQRY_TIPIINCARIC1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 60, 0, -13997);
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, MyGlb.PANEL_LIST, 512, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_TIPIINCARICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_TIPIINCARICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_TIPIINCARICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_TIPIINCARICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_TIPIINCARICO.SetFieldPage(PFL_TIPIINCARICO_UTENTEINSERI, -1, -1);
    PAN_TIPIINCARICO.SetFieldPanel(PFL_TIPIINCARICO_UTENTEINSERI, PPQRY_TIPIINCARIC1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, MyGlb.PANEL_LIST, 632, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_TIPIINCARICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_TIPIINCARICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_TIPIINCARICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_TIPIINCARICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_TIPIINCARICO.SetFieldPage(PFL_TIPIINCARICO_DATAINSERIME, -1, -1);
    PAN_TIPIINCARICO.SetFieldPanel(PFL_TIPIINCARICO_DATAINSERIME, PPQRY_TIPIINCARIC1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, MyGlb.PANEL_LIST, 740, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_TIPIINCARICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIINCARICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_TIPIINCARICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIINCARICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_TIPIINCARICO.SetFieldPage(PFL_TIPIINCARICO_UTENTULTIAGG, -1, -1);
    PAN_TIPIINCARICO.SetFieldPanel(PFL_TIPIINCARICO_UTENTULTIAGG, PPQRY_TIPIINCARIC1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, MyGlb.PANEL_LIST, 852, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_TIPIINCARICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIINCARICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_TIPIINCARICO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIINCARICO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_TIPIINCARICO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIINCARICO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIINCARICO_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_TIPIINCARICO.SetFieldPage(PFL_TIPIINCARICO_DATAULTIMAGG, -1, -1);
    PAN_TIPIINCARICO.SetFieldPanel(PFL_TIPIINCARICO_DATAULTIMAGG, PPQRY_TIPIINCARIC1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_TIPIINCARICO_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIINCARICO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPIINCARICO.SetIMDB(IMDB, "PQRY_TIPIINCARIC1", true);
    PAN_TIPIINCARICO.set_SetString(MyGlb.MASTER_ROWNAME, "TIPI INCARICO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_TIPIINCARICO.SetQuery(PPQRY_TIPIINCARIC1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TIPI_INCARICO A ");
    PAN_TIPIINCARICO.SetQuery(PPQRY_TIPIINCARIC1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIINCARICO.SetQuery(PPQRY_TIPIINCARIC1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIINCARICO.SetQuery(PPQRY_TIPIINCARIC1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIINCARICO.SetQuery(PPQRY_TIPIINCARIC1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPIINCARICO.SetQuery(PPQRY_TIPIINCARIC1, 5, SQL, -1, "");
    PAN_TIPIINCARICO.SetQueryDB(PPQRY_TIPIINCARIC1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIINCARICO.SetMasterTable(0, "TIPI_INCARICO");
    PAN_TIPIINCARICO.AddToSortList(PFL_TIPIINCARICO_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIINCARICO.Status() == 2)
    {
      int oldListQBE = PAN_TIPIINCARICO.iUseListQBE;
      PAN_TIPIINCARICO.iUseListQBE = 0;
      PAN_TIPIINCARICO.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIINCARICO.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIINCARICO.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_TIPIINCABOOK_MST_TIPINCBOOPAG_Init()
  {
    BUK_TIPIINCABOOK.InitMastro(BUK_TIPIINCABOOK_MST_TIPINCBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_MST_TIPINCBOOPAG, "EBB1B823-693F-408A-92BA-12A104422B9A");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_MST_TIPINCBOOPAG, "TIPINCBOOPAG");
    BUK_TIPIINCABOOK.InitMastroBox(BUK_TIPIINCABOOK_MST_TIPINCBOOPAG, BUK_TIPIINCABOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_RPTBOX_NUMEROPAGINA, "C89556F8-37CB-4071-B4E8-25F1CC2C357A");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPIINCABOOK.InitBoxSpan(BUK_TIPIINCABOOK_RPTBOX_NUMEROPAGINA, BUK_TIPIINCABOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_SPAN_NUMEROPAGINA, "896ADB93-7A97-49AD-B010-C6DD2BC15691");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPIINCABOOK.InitMastroBox(BUK_TIPIINCABOOK_MST_TIPINCBOOPAG, BUK_TIPIINCABOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25000, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_RPTBOX_PAGEBODY, "815CBE40-8BD1-4363-9E07-37E2A6EC9770");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_TIPIINCABOOK.InitMastroBox(BUK_TIPIINCABOOK_MST_TIPINCBOOPAG, BUK_TIPIINCABOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_RPTBOX_TITOLO, "05789FF8-8DAD-4288-B75D-634BC6EE8AC3");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_TIPIINCABOOK_RPT_NEWREPORT_InitQuery() { BUK_TIPIINCABOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_TIPIINCABOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  TIPI_INCARICO A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_TIPIINCABOOK.SetReportQuery(BUK_TIPIINCABOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "B19FFFB1-D955-47EF-9C56-DBF1E5ED214F");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_TIPIINCABOOK_RPT_NEWREPORT_Init()
  {
    BUK_TIPIINCABOOK.InitReport(BUK_TIPIINCABOOK_RPT_NEWREPORT, 196609);
    BUK_TIPIINCABOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_RPT_NEWREPORT, "E8CE59CB-4431-4AC6-B1AA-F184C00843F8");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_TIPIINCABOOK.InitSection(BUK_TIPIINCABOOK_RPT_NEWREPORT, BUK_TIPIINCABOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIINCABOOK.SetSectionRendersInto(BUK_TIPIINCABOOK_SEC_PAGEHEADER, BUK_TIPIINCABOOK_RPTBOX_PAGEBODY);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_SEC_PAGEHEADER, "56A9BC96-6100-4A12-9EF1-612A87E08D55");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_TIPIINCABOOK.InitReportBox(BUK_TIPIINCABOOK_SEC_PAGEHEADER, BUK_TIPIINCABOOK_RPTBOX_CODICEHEADER, 0, 0, 1400, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_RPTBOX_CODICEHEADER, "3CCA1B7A-8827-47D5-A741-C43C44A05AC5");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_TIPIINCABOOK.InitBoxSpan(BUK_TIPIINCABOOK_RPTBOX_CODICEHEADER, BUK_TIPIINCABOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_SPAN_CODICE, "B6AF271E-CA93-4124-B065-41D8A232F557");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_SPAN_CODICE, "CODICE");
    BUK_TIPIINCABOOK.InitReportBox(BUK_TIPIINCABOOK_SEC_PAGEHEADER, BUK_TIPIINCABOOK_RPTBOX_DESCRIHEADER, 1800, 0, 16200, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_RPTBOX_DESCRIHEADER, "5E8309DB-9B20-4ADB-A52B-FD0492EBB16A");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_TIPIINCABOOK.InitBoxSpan(BUK_TIPIINCABOOK_RPTBOX_DESCRIHEADER, BUK_TIPIINCABOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_SPAN_DESCRIZIONE, "9F6E03E7-2ECE-43F1-B1B7-62862B379BCC");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_TIPIINCABOOK.InitSection(BUK_TIPIINCABOOK_RPT_NEWREPORT, BUK_TIPIINCABOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIINCABOOK.SetSectionRendersInto(BUK_TIPIINCABOOK_SEC_TITOLO, BUK_TIPIINCABOOK_RPTBOX_TITOLO);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_SEC_TITOLO, "C3DA995C-4214-4C75-9A91-0AF7DD635F37");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_SEC_TITOLO, "TITOLO");
    BUK_TIPIINCABOOK.InitReportBox(BUK_TIPIINCABOOK_SEC_TITOLO, BUK_TIPIINCABOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_RPTBOX_NEWBOX, "B515B484-6E13-4807-AA49-6C44A0C876C2");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_TIPIINCABOOK.InitBoxSpan(BUK_TIPIINCABOOK_RPTBOX_NEWBOX, BUK_TIPIINCABOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Tipi Incarico", 1);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_SPAN_VARIADIBILAN, "D2A1E4BC-575C-4B14-B820-CB2448F86F9F");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_TIPIINCABOOK.InitSection(BUK_TIPIINCABOOK_RPT_NEWREPORT, BUK_TIPIINCABOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIINCABOOK.SetSectionRendersInto(BUK_TIPIINCABOOK_SEC_DETAIL, BUK_TIPIINCABOOK_RPTBOX_PAGEBODY);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_SEC_DETAIL, "4EF9ACB7-BE2E-4841-9D57-4D7A217CAACD");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_SEC_DETAIL, "DETAIL");
    BUK_TIPIINCABOOK.InitReportBox(BUK_TIPIINCABOOK_SEC_DETAIL, BUK_TIPIINCABOOK_RPTBOX_CODICE, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_RPTBOX_CODICE, "4F8F7446-670C-4486-AF3D-E601A8F10E65");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_RPTBOX_CODICE, "CODICE");
    BUK_TIPIINCABOOK.InitBoxSpan(BUK_TIPIINCABOOK_RPTBOX_CODICE, BUK_TIPIINCABOOK_SPAN_TIINCOTIITIB, MyGlb.VIS_DEFAREPOSTYL, 1, 3, 0, 271384705, "Codice del Tipo di Incarico", "::CODICE", 1);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_SPAN_TIINCOTIITIB, "563CEE6C-AA2D-4FC0-B645-4F56117FEB53");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_SPAN_TIINCOTIITIB, "TIINCOTIITIB");
    BUK_TIPIINCABOOK.InitReportBox(BUK_TIPIINCABOOK_SEC_DETAIL, BUK_TIPIINCABOOK_RPTBOX_DESCRIZIONE, 1800, 0, 16200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_RPTBOX_DESCRIZIONE, "C4DAF84F-68D7-4EF2-8A2C-C2C704CF4596");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_TIPIINCABOOK.InitBoxSpan(BUK_TIPIINCABOOK_RPTBOX_DESCRIZIONE, BUK_TIPIINCABOOK_SPAN_TIINDETIITIB, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "Descrizione del Tipo di Incarico", "::DESCRIZIONE", 1);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_SPAN_TIINDETIITIB, "76935A04-0C4B-4CCA-9142-303872E9628D");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_SPAN_TIINDETIITIB, "TIINDETIITIB");
    BUK_TIPIINCABOOK.InitSection(BUK_TIPIINCABOOK_RPT_NEWREPORT, BUK_TIPIINCABOOK_SEC_PAGEFOOTER, 500, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_TIPIINCABOOK.SetSectionRendersInto(BUK_TIPIINCABOOK_SEC_PAGEFOOTER, BUK_TIPIINCABOOK_RPTBOX_PAGEBODY);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_SEC_PAGEFOOTER, "79C98722-C453-4053-B0E9-CCD4135392FA");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_TIPIINCABOOK.InitSection(BUK_TIPIINCABOOK_RPT_NEWREPORT, BUK_TIPIINCABOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_TIPIINCABOOK.SetSectionRendersInto(BUK_TIPIINCABOOK_SEC_REPORTFOOTER, BUK_TIPIINCABOOK_RPTBOX_PAGEBODY);
    BUK_TIPIINCABOOK.SetRTCGuid(BUK_TIPIINCABOOK_SEC_REPORTFOOTER, "8D7B23C8-4F36-4DF1-96BB-9F5361FD89BE");
    BUK_TIPIINCABOOK.SetObjCode(BUK_TIPIINCABOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_TIPIINCABOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_TIPIINCABOOK_InitLinks()
  {
    BUK_TIPIINCABOOK.SetBoxNextBox(BUK_TIPIINCABOOK_RPTBOX_PAGEBODY, BUK_TIPIINCABOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPIINCARICO) PAN_TIPIINCARICO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIINCARICO) PAN_TIPIINCARICO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPIINCARICO) PAN_TIPIINCARICO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIINCARICO) PAN_TIPIINCARICO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPIINCARICO) PAN_TIPIINCARICO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_TIPIINCABOOK) BUK_TIPIINCABOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_TIPIINCABOOK) BUK_TIPIINCABOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_TIPIINCABOOK) BUK_TIPIINCABOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_TIPIINCABOOK) BUK_TIPIINCABOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_TIPIINCABOOK) BUK_TIPIINCABOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_TIPIINCABOOK) BUK_TIPIINCABOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_TIPIINCABOOK) BUK_TIPIINCABOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_TIPIINCABOOK) BUK_TIPIINCABOOK_OnPreview();
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
