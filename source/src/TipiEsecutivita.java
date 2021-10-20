// **********************************************
// Tipi Esecutivita
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiEsecutivita extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPIESECUTIV_CODICE = 0;
  private static int PFL_TIPIESECUTIV_DESCRIZIONE = 1;
  private static int PFL_TIPIESECUTIV_TIPODIESECUT = 2;
  private static int PFL_TIPIESECUTIV_UTENTEINSERI = 3;
  private static int PFL_TIPIESECUTIV_DATAINSERIME = 4;
  private static int PFL_TIPIESECUTIV_UTENTULTIAGG = 5;
  private static int PFL_TIPIESECUTIV_DATAULTIMAGG = 6;
  private static int PFL_TIPIESECUTIV_PREVALENTE = 7;

  private static int PPQRY_T11 = 0;


  IDPanel PAN_TIPIESECUTIV;
  CIDREObj BUK_TIPIESECBOOK;
  OBook BKW_TIPIESECBOOK;
  //
  // Template Pages constants
  private static int BUK_TIPIESECBOOK_MST_TIPESEBOOPAG = 1;
  private static int BUK_TIPIESECBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_TIPIESECBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_TIPIESECBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_TIPIESECBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_TIPIESECBOOK_RPT_NEWREPORT = 6;
  private static int BUK_TIPIESECBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_TIPIESECBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_TIPIESECBOOK_SPAN_CODICE = 9;
  private static int BUK_TIPIESECBOOK_RPTBOX_DESCRIHEADER = 10;
  private static int BUK_TIPIESECBOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_TIPIESECBOOK_RPTBOX_PDEHEADER = 12;
  private static int BUK_TIPIESECBOOK_SPAN_TIPODIESECUT = 13;
  private static int BUK_TIPIESECBOOK_SEC_TITOLO = 14;
  private static int BUK_TIPIESECBOOK_RPTBOX_NEWBOX = 15;
  private static int BUK_TIPIESECBOOK_SPAN_VARIADIBILAN = 16;
  private static int BUK_TIPIESECBOOK_SEC_DETAIL = 17;
  private static int BUK_TIPIESECBOOK_RPTBOX_CODICE = 18;
  private static int BUK_TIPIESECBOOK_SPAN_T1COTIESTIEB = 19;
  private static int BUK_TIPIESECBOOK_RPTBOX_DESCRIZIONE = 20;
  private static int BUK_TIPIESECBOOK_SPAN_T1DETIESTIEB = 21;
  private static int BUK_TIPIESECBOOK_RPTBOX_PDE = 22;
  private static int BUK_TIPIESECBOOK_SPAN_T1TIDIETETEB = 23;
  private static int BUK_TIPIESECBOOK_SEC_REPORTFOOTER = 24;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T11(IMDB);
    Init_PQRY_T10(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T11, 8);
    IMDB.set_TblCode(IMDBDef9.PQRY_T11, "PQRY_T11");
    IMDB.set_FldCode(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_DESCRIZIONE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_P_D_E, "P_D_E");
    IMDB.SetFldParams(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_P_D_E,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_PREVALENTE, "PREVALENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T11,IMDBDef9.PQSL_T11_PREVALENTE,5,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T11, 0);
  }

  private static void Init_PQRY_T10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T10, 3);
    IMDB.set_TblCode(IMDBDef9.PQRY_T10, "PQRY_T10");
    IMDB.set_FldCode(IMDBDef9.PQRY_T10,IMDBDef9.PQSL_T10_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T10,IMDBDef9.PQSL_T10_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T10,IMDBDef9.PQSL_T10_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T10,IMDBDef9.PQSL_T10_DESCRIZIONE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T10,IMDBDef9.PQSL_T10_P_D_E, "P_D_E");
    IMDB.SetFldParams(IMDBDef9.PQRY_T10,IMDBDef9.PQSL_T10_P_D_E,5,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T10, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiEsecutivita(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiEsecutivita()
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
    FormIdx = MyGlb.FRM_TIPIESECUTIV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "149379F0-1FB5-462B-8203-847A3AA79789";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 664;
    DesignHeight = 386;
    set_Caption(new IDVariant("Tipi Esecutivita"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 664;
    Frames[1].Height = 360;
    Frames[1].Caption = "Tipi Esecutività";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_TIPIESECUTIV = new IDPanel(w, this, 1, "PAN_TIPIESECUTIV");
    Frames[1].Content = PAN_TIPIESECUTIV;
    PAN_TIPIESECUTIV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIESECUTIV.VS = MainFrm.VisualStyleList;
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 664-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_TIPIESECBOOK != null)
      PAN_TIPIESECUTIV.SetBook(BUK_TIPIESECBOOK);
    PAN_TIPIESECUTIV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1B32E864-270B-48A2-B160-6F3F6AC7216B");
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 580, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPIESECUTIV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIESECUTIV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIESECUTIV.InitStatus = 2;
    PAN_TIPIESECUTIV_Init();
    PAN_TIPIESECUTIV_InitFields();
    PAN_TIPIESECUTIV_InitQueries();
    BKW_TIPIESECBOOK = new OBook(this);
    BUK_TIPIESECBOOK = new CIDREObj(BKW_TIPIESECBOOK);
    BKW_TIPIESECBOOK.iGuid = "B78B8E8D-AEE8-4A77-B1A4-3B23FFCA1391";
    BKW_TIPIESECBOOK.Code = "BUK_TIPIESECBOOK";
    BKW_TIPIESECBOOK.BookObj = BUK_TIPIESECBOOK;
    BKW_TIPIESECBOOK.InitDefMasks();
    BUK_TIPIESECBOOK.InitBook(1, 1245185, "Tipi Esecutività Book", IMDB, MainFrm.VisualStyleList);
    BUK_TIPIESECBOOK.InitHTML();
    BUK_TIPIESECBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_TIPIESECBOOK.Book.SetMainFrm(MainFrm);
    BUK_TIPIESECBOOK.SetRTCGuid(0, "B78B8E8D-AEE8-4A77-B1A4-3B23FFCA1391");
    BUK_TIPIESECBOOK.SetObjCode(0, "TIPIESECBOOK");
    if (PAN_TIPIESECUTIV != null)
      PAN_TIPIESECUTIV.SetBook(BUK_TIPIESECBOOK);
    BUK_TIPIESECBOOK_MST_TIPESEBOOPAG_Init();
    BUK_TIPIESECBOOK_RPT_NEWREPORT_Init();
    BUK_TIPIESECBOOK_InitLinks();
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
      PAN_TIPIESECUTIV.UpdatePanel(MainFrm);
      // BUK_TIPIESECBOOK.UpdateBook();
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
    if (Code.equals("BUK_TIPIESECBOOK")) return BUK_TIPIESECBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof TipiEsecutivita);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiEsecutivita.class.getName() : (Glb.ClassWithPackage(TipiEsecutivita.class) ? TipiEsecutivita.class.getName().substring(TipiEsecutivita.class.getPackage().getName().length() + 1) : TipiEsecutivita.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tipi Esecutività On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIESECUTIV_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPIESECUTIV);
      // 
      // Tipi Esecutività On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_TIPIESECUTIV.IsNewRow()))
      {
        PAN_TIPIESECUTIV.SetFlags (Glb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIESECUTIV.SetFlags (Glb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_TIPIESECUTIV.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIESECUTIV_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T11, IMDBDef9.PQSL_T11_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiEsecutivita", "TipiEsecutivitàOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Esecutività On Database Error Event
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
  private void PAN_TIPIESECUTIV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_TIPIESECUTIV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Tipi Esecutività On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiEsecutivita", "TipiEsecutivitàOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Esecutività On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_TIPIESECUTIV_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Esecutività On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T10PD(IMDB.Value(IMDBDef9.PQRY_T11, IMDBDef9.PQSL_T11_CODICE, 0));
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
      MainFrm.ErrObj.ProcError ("TipiEsecutivita", "TipiEsecutivitàOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Esecutività On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_TIPIESECUTIV_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Esecutività On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T11, IMDBDef9.PQSL_T11_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T11, IMDBDef9.PQSL_T11_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T11, IMDBDef9.PQSL_T11_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T11, IMDBDef9.PQSL_T11_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T11, IMDBDef9.PQSL_T11_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T11, IMDBDef9.PQSL_T11_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiEsecutivita", "TipiEsecutivitàOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("TipiEsecutivita", "LoadEvent", _e);
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
  private void PAN_TIPIESECUTIV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIESECUTIV, Cancel);
    // Stub
  }

  private void PAN_TIPIESECUTIV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPIESECUTIV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_TIPIESECUTIV_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIESECUTIV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIESECUTIV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_TIPIESECBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_TIPIESECBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_TIPIESECBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_TIPIESECBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_TIPIESECBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_TIPIESECBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_TIPIESECBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_TIPIESECBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_TIPIESECBOOK_MST_TIPESEBOOPAG)
    {
      BUK_TIPIESECBOOK.set_SpanValue(BUK_TIPIESECBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPIESECBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPIESECBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_TIPIESECBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_TIPIESECBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_TIPIESECBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_TIPIESECBOOK_OnPreview()
  {
    PreviewBook = BKW_TIPIESECBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPIESECUTIV_Init()
  {

    PAN_TIPIESECUTIV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIESECUTIV.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPIESECUTIV.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_TIPIESECUTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, "B8735D8B-F14A-4226-955C-78AE4BD65055");
    PAN_TIPIESECUTIV.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, "Codice");
    PAN_TIPIESECUTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, "");
    PAN_TIPIESECUTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIESECUTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_TIPIESECUTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, "46D24B92-5E8E-46CD-83B9-7EB2477551AD");
    PAN_TIPIESECUTIV.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, "Descrizione");
    PAN_TIPIESECUTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, "");
    PAN_TIPIESECUTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIESECUTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_TIPIESECUTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, "C55528A6-248C-47A1-BD56-5DD2C31260FA");
    PAN_TIPIESECUTIV.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, "Tipo di Esecutività");
    PAN_TIPIESECUTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, "");
    PAN_TIPIESECUTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIESECUTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_TIPIESECUTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, "CD78154E-A93F-414B-ABAF-07E7109A0D8C");
    PAN_TIPIESECUTIV.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_TIPIESECUTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, "");
    PAN_TIPIESECUTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIESECUTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIESECUTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, "C9FE92B8-A7DE-4FD1-AFC0-7F8E4AB67B5D");
    PAN_TIPIESECUTIV.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, "DATA INSERIMENTO");
    PAN_TIPIESECUTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, "");
    PAN_TIPIESECUTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIESECUTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIESECUTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, "C6ED29D1-FDDA-46F8-9C4D-5BEBA7B15CE0");
    PAN_TIPIESECUTIV.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_TIPIESECUTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, "");
    PAN_TIPIESECUTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIESECUTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIESECUTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, "68AB169F-1D99-433B-A59F-F7C78DF79FEC");
    PAN_TIPIESECUTIV.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_TIPIESECUTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, "");
    PAN_TIPIESECUTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIESECUTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIESECUTIV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, "2B5DDDB1-8FAB-411B-8ADE-7EBE27546C93");
    PAN_TIPIESECUTIV.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, "Prevalente");
    PAN_TIPIESECUTIV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, "");
    PAN_TIPIESECUTIV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPIESECUTIV.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPIESECUTIV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPIESECUTIV.SetFieldPage(PFL_TIPIESECUTIV_CODICE, -1, -1);
    PAN_TIPIESECUTIV.SetFieldPanel(PFL_TIPIESECUTIV_CODICE, PPQRY_T11, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPIESECUTIV.SetFieldPage(PFL_TIPIESECUTIV_DESCRIZIONE, -1, -1);
    PAN_TIPIESECUTIV.SetFieldPanel(PFL_TIPIESECUTIV_DESCRIZIONE, PPQRY_T11, "A.DESCRIZIONE", "DESCRIZIONE", 5, 30, 0, -13997);
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, MyGlb.PANEL_LIST, 412, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, MyGlb.PANEL_LIST, 36);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, MyGlb.PANEL_LIST, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, MyGlb.PANEL_LIST, "Tipo di Esecutività");
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, MyGlb.PANEL_FORM, 4, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, MyGlb.PANEL_FORM, 88);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, MyGlb.PANEL_FORM, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_TIPODIESECUT, MyGlb.PANEL_FORM, "Tp. di Esecut.");
    PAN_TIPIESECUTIV.SetFieldPage(PFL_TIPIESECUTIV_TIPODIESECUT, -1, -1);
    PAN_TIPIESECUTIV.SetFieldPanel(PFL_TIPIESECUTIV_TIPODIESECUT, PPQRY_T11, "A.P_D_E", "P_D_E", 5, 1, 0, -13997);
    PAN_TIPIESECUTIV.SetValueListItem(PFL_TIPIESECUTIV_TIPODIESECUT, (new IDVariant("D")), "Definitiva", "", "", -1);
    PAN_TIPIESECUTIV.SetValueListItem(PFL_TIPIESECUTIV_TIPODIESECUT, (new IDVariant("E")), "Esecutiva", "", "", -1);
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, MyGlb.PANEL_LIST, 508, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 76, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_TIPIESECUTIV.SetFieldPage(PFL_TIPIESECUTIV_UTENTEINSERI, -1, -1);
    PAN_TIPIESECUTIV.SetFieldPanel(PFL_TIPIESECUTIV_UTENTEINSERI, PPQRY_T11, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, MyGlb.PANEL_LIST, 628, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, MyGlb.PANEL_FORM, 4, 100, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_TIPIESECUTIV.SetFieldPage(PFL_TIPIESECUTIV_DATAINSERIME, -1, -1);
    PAN_TIPIESECUTIV.SetFieldPanel(PFL_TIPIESECUTIV_DATAINSERIME, PPQRY_T11, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, MyGlb.PANEL_LIST, 736, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 124, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_TIPIESECUTIV.SetFieldPage(PFL_TIPIESECUTIV_UTENTULTIAGG, -1, -1);
    PAN_TIPIESECUTIV.SetFieldPanel(PFL_TIPIESECUTIV_UTENTULTIAGG, PPQRY_T11, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, MyGlb.PANEL_LIST, 848, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 148, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_TIPIESECUTIV.SetFieldPage(PFL_TIPIESECUTIV_DATAULTIMAGG, -1, -1);
    PAN_TIPIESECUTIV.SetFieldPanel(PFL_TIPIESECUTIV_DATAULTIMAGG, PPQRY_T11, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, MyGlb.PANEL_LIST, 508, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, MyGlb.PANEL_LIST, 76);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, MyGlb.PANEL_LIST, "Prevalente");
    PAN_TIPIESECUTIV.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, MyGlb.PANEL_FORM, 4, 76, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIESECUTIV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, MyGlb.PANEL_FORM, 76);
    PAN_TIPIESECUTIV.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIESECUTIV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIESECUTIV_PREVALENTE, MyGlb.PANEL_FORM, "Prevalente");
    PAN_TIPIESECUTIV.SetFieldPage(PFL_TIPIESECUTIV_PREVALENTE, -1, -1);
    PAN_TIPIESECUTIV.SetFieldPanel(PFL_TIPIESECUTIV_PREVALENTE, PPQRY_T11, "A.PREVALENTE", "PREVALENTE", 5, 2, 0, -13997);
    PAN_TIPIESECUTIV.SetValueListItem(PFL_TIPIESECUTIV_PREVALENTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPIESECUTIV.SetValueListItem(PFL_TIPIESECUTIV_PREVALENTE, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_TIPIESECUTIV_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIESECUTIV.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPIESECUTIV.SetIMDB(IMDB, "PQRY_T11", true);
    PAN_TIPIESECUTIV.set_SetString(MyGlb.MASTER_ROWNAME, "T10");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.P_D_E as P_D_E, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.PREVALENTE as PREVALENTE ");
    PAN_TIPIESECUTIV.SetQuery(PPQRY_T11, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T10 A ");
    PAN_TIPIESECUTIV.SetQuery(PPQRY_T11, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIESECUTIV.SetQuery(PPQRY_T11, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIESECUTIV.SetQuery(PPQRY_T11, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIESECUTIV.SetQuery(PPQRY_T11, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPIESECUTIV.SetQuery(PPQRY_T11, 5, SQL, -1, "");
    PAN_TIPIESECUTIV.SetQueryDB(PPQRY_T11, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIESECUTIV.SetMasterTable(0, "T10");
    PAN_TIPIESECUTIV.AddToSortList(PFL_TIPIESECUTIV_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIESECUTIV.Status() == 2)
    {
      int oldListQBE = PAN_TIPIESECUTIV.iUseListQBE;
      PAN_TIPIESECUTIV.iUseListQBE = 0;
      PAN_TIPIESECUTIV.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIESECUTIV.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIESECUTIV.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_TIPIESECBOOK_MST_TIPESEBOOPAG_Init()
  {
    BUK_TIPIESECBOOK.InitMastro(BUK_TIPIESECBOOK_MST_TIPESEBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_MST_TIPESEBOOPAG, "343E95D0-76DE-4D8E-B8A6-0D23A04DD3E6");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_MST_TIPESEBOOPAG, "TIPESEBOOPAG");
    BUK_TIPIESECBOOK.InitMastroBox(BUK_TIPIESECBOOK_MST_TIPESEBOOPAG, BUK_TIPIESECBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_RPTBOX_NUMEROPAGINA, "AFF305C3-A8B9-427A-9CF2-799C8741F608");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPIESECBOOK.InitBoxSpan(BUK_TIPIESECBOOK_RPTBOX_NUMEROPAGINA, BUK_TIPIESECBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_SPAN_NUMEROPAGINA, "25F93995-9BEE-4A80-BB56-AC008B6FAC85");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPIESECBOOK.InitMastroBox(BUK_TIPIESECBOOK_MST_TIPESEBOOPAG, BUK_TIPIESECBOOK_RPTBOX_PAGEBODY, 1000, 3000, 19000, 25400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_RPTBOX_PAGEBODY, "C13FF973-7EC0-4668-A294-7432354E786C");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_TIPIESECBOOK.InitMastroBox(BUK_TIPIESECBOOK_MST_TIPESEBOOPAG, BUK_TIPIESECBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_RPTBOX_TITOLO, "09C4AF1A-4BCD-4E75-B66A-21814E0ED2DD");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_TIPIESECBOOK_RPT_NEWREPORT_InitQuery() { BUK_TIPIESECBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_TIPIESECBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.P_D_E as P_D_E ");
      SQL.append("from ");
      SQL.append("  T10 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_TIPIESECBOOK.SetReportQuery(BUK_TIPIESECBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "293D219A-27BD-427B-AEB8-250A2B14E08D");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_TIPIESECBOOK_RPT_NEWREPORT_Init()
  {
    BUK_TIPIESECBOOK.InitReport(BUK_TIPIESECBOOK_RPT_NEWREPORT, 196609);
    BUK_TIPIESECBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_RPT_NEWREPORT, "966C5841-9EE3-4AF8-9744-B811EDAE065A");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_TIPIESECBOOK.InitSection(BUK_TIPIESECBOOK_RPT_NEWREPORT, BUK_TIPIESECBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIESECBOOK.SetSectionRendersInto(BUK_TIPIESECBOOK_SEC_PAGEHEADER, BUK_TIPIESECBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_SEC_PAGEHEADER, "C2AB8A21-5100-4FF5-9C65-3E86D523902B");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_TIPIESECBOOK.InitReportBox(BUK_TIPIESECBOOK_SEC_PAGEHEADER, BUK_TIPIESECBOOK_RPTBOX_CODICEHEADER, 400, 0, 1100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_RPTBOX_CODICEHEADER, "AA118967-B99F-426F-8440-7182CC58B51C");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_TIPIESECBOOK.InitBoxSpan(BUK_TIPIESECBOOK_RPTBOX_CODICEHEADER, BUK_TIPIESECBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_SPAN_CODICE, "33203E10-04DB-46EE-92F4-D37E4EFEEE7D");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_SPAN_CODICE, "CODICE");
    BUK_TIPIESECBOOK.InitReportBox(BUK_TIPIESECBOOK_SEC_PAGEHEADER, BUK_TIPIESECBOOK_RPTBOX_DESCRIHEADER, 2600, 0, 9419, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_RPTBOX_DESCRIHEADER, "FB5E3B28-BEBD-4659-8201-60E652B61894");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_TIPIESECBOOK.InitBoxSpan(BUK_TIPIESECBOOK_RPTBOX_DESCRIHEADER, BUK_TIPIESECBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_SPAN_DESCRIZIONE, "D33077D0-581D-44B0-AFEA-4617CA09FC6A");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_TIPIESECBOOK.InitReportBox(BUK_TIPIESECBOOK_SEC_PAGEHEADER, BUK_TIPIESECBOOK_RPTBOX_PDEHEADER, 13800, 0, 2500, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_RPTBOX_PDEHEADER, "67769492-2446-4043-8FE8-F21406C1994F");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_RPTBOX_PDEHEADER, "PDEHEADER");
    BUK_TIPIESECBOOK.InitBoxSpan(BUK_TIPIESECBOOK_RPTBOX_PDEHEADER, BUK_TIPIESECBOOK_SPAN_TIPODIESECUT, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Tipo", 1);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_SPAN_TIPODIESECUT, "D2B68865-6C9D-48DB-A71D-69845975734A");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_SPAN_TIPODIESECUT, "TIPODIESECUT");
    BUK_TIPIESECBOOK.InitSection(BUK_TIPIESECBOOK_RPT_NEWREPORT, BUK_TIPIESECBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIESECBOOK.SetSectionRendersInto(BUK_TIPIESECBOOK_SEC_TITOLO, BUK_TIPIESECBOOK_RPTBOX_TITOLO);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_SEC_TITOLO, "2CE8E15D-19CB-49DF-A67C-469343127857");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_SEC_TITOLO, "TITOLO");
    BUK_TIPIESECBOOK.InitReportBox(BUK_TIPIESECBOOK_SEC_TITOLO, BUK_TIPIESECBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_RPTBOX_NEWBOX, "5A22EF4A-5FA0-4D7A-94E7-CD89D95D54CA");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_TIPIESECBOOK.InitBoxSpan(BUK_TIPIESECBOOK_RPTBOX_NEWBOX, BUK_TIPIESECBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Esecutività Provvedimenti", 1);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_SPAN_VARIADIBILAN, "3E34F0A3-695C-4247-8D05-DD0F75EBCCEF");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_TIPIESECBOOK.InitSection(BUK_TIPIESECBOOK_RPT_NEWREPORT, BUK_TIPIESECBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIESECBOOK.SetSectionRendersInto(BUK_TIPIESECBOOK_SEC_DETAIL, BUK_TIPIESECBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_SEC_DETAIL, "84A1B237-ABC6-4626-8D9A-BF7B4331A400");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_SEC_DETAIL, "DETAIL");
    BUK_TIPIESECBOOK.InitReportBox(BUK_TIPIESECBOOK_SEC_DETAIL, BUK_TIPIESECBOOK_RPTBOX_CODICE, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_RPTBOX_CODICE, "6AABC4A6-68D7-44CC-8612-0A8D0E4749E1");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_RPTBOX_CODICE, "CODICE");
    BUK_TIPIESECBOOK.InitBoxSpan(BUK_TIPIESECBOOK_RPTBOX_CODICE, BUK_TIPIESECBOOK_SPAN_T1COTIESTIEB, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_SPAN_T1COTIESTIEB, "8F945F3E-C867-4EB7-A048-EB32F97B82A4");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_SPAN_T1COTIESTIEB, "T1COTIESTIEB");
    BUK_TIPIESECBOOK.InitReportBox(BUK_TIPIESECBOOK_SEC_DETAIL, BUK_TIPIESECBOOK_RPTBOX_DESCRIZIONE, 2600, 0, 10900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_RPTBOX_DESCRIZIONE, "3C4AE077-21D2-4DAB-BBCD-067755CB66FE");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_TIPIESECBOOK.InitBoxSpan(BUK_TIPIESECBOOK_RPTBOX_DESCRIZIONE, BUK_TIPIESECBOOK_SPAN_T1DETIESTIEB, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_SPAN_T1DETIESTIEB, "6174D3F9-9BF1-4B0C-A0B4-3DEE5E485165");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_SPAN_T1DETIESTIEB, "T1DETIESTIEB");
    BUK_TIPIESECBOOK.InitReportBox(BUK_TIPIESECBOOK_SEC_DETAIL, BUK_TIPIESECBOOK_RPTBOX_PDE, 13800, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_RPTBOX_PDE, "D8B878C1-40FB-4F12-AB21-40BF04387D21");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_RPTBOX_PDE, "PDE");
    BUK_TIPIESECBOOK.InitBoxSpan(BUK_TIPIESECBOOK_RPTBOX_PDE, BUK_TIPIESECBOOK_SPAN_T1TIDIETETEB, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::P_D_E", 1);
    BUK_TIPIESECBOOK.SetSpanValueListItem(BUK_TIPIESECBOOK_SPAN_T1TIDIETETEB, "Definitiva", "Type the value and explain what it means.", (new IDVariant("D")), null, "", -1);
    BUK_TIPIESECBOOK.SetSpanValueListItem(BUK_TIPIESECBOOK_SPAN_T1TIDIETETEB, "Esecutiva", "Type the value and explain what it means.", (new IDVariant("E")), null, "", -1);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_SPAN_T1TIDIETETEB, "045226A1-D4E6-4552-820E-E60AF51B4334");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_SPAN_T1TIDIETETEB, "T1TIDIETETEB");
    BUK_TIPIESECBOOK.InitSection(BUK_TIPIESECBOOK_RPT_NEWREPORT, BUK_TIPIESECBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIESECBOOK.SetSectionRendersInto(BUK_TIPIESECBOOK_SEC_REPORTFOOTER, BUK_TIPIESECBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIESECBOOK.SetRTCGuid(BUK_TIPIESECBOOK_SEC_REPORTFOOTER, "3612B8EE-35C9-4C1B-A83D-A11FAB20F3BF");
    BUK_TIPIESECBOOK.SetObjCode(BUK_TIPIESECBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_TIPIESECBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_TIPIESECBOOK_InitLinks()
  {
    BUK_TIPIESECBOOK.SetBoxNextBox(BUK_TIPIESECBOOK_RPTBOX_PAGEBODY, BUK_TIPIESECBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPIESECUTIV) PAN_TIPIESECUTIV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIESECUTIV) PAN_TIPIESECUTIV_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPIESECUTIV) PAN_TIPIESECUTIV_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIESECUTIV) PAN_TIPIESECUTIV_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPIESECUTIV) PAN_TIPIESECUTIV_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_TIPIESECUTIV) PAN_TIPIESECUTIV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_TIPIESECBOOK) BUK_TIPIESECBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_TIPIESECBOOK) BUK_TIPIESECBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_TIPIESECBOOK) BUK_TIPIESECBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_TIPIESECBOOK) BUK_TIPIESECBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_TIPIESECBOOK) BUK_TIPIESECBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_TIPIESECBOOK) BUK_TIPIESECBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_TIPIESECBOOK) BUK_TIPIESECBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_TIPIESECBOOK) BUK_TIPIESECBOOK_OnPreview();
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
