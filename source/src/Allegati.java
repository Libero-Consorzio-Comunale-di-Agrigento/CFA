// **********************************************
// Allegati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Allegati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ALLEGATI_CODICE = 0;
  private static int PFL_ALLEGATI_DESCRIZIONE = 1;
  private static int PFL_ALLEGATI_DESCRABBR = 2;
  private static int PFL_ALLEGATI_UTENTEINSERI = 3;
  private static int PFL_ALLEGATI_DATAINSERIME = 4;
  private static int PFL_ALLEGATI_UTENTULTIAGG = 5;
  private static int PFL_ALLEGATI_DATAULTIMAGG = 6;

  private static int PPQRY_T74 = 0;


  IDPanel PAN_ALLEGATI;
  CIDREObj BUK_ALLEGATIBOOK;
  OBook BKW_ALLEGATIBOOK;
  //
  // Template Pages constants
  private static int BUK_ALLEGATIBOOK_MST_ALLEBOOKPAGE = 1;
  private static int BUK_ALLEGATIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_ALLEGATIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_ALLEGATIBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_ALLEGATIBOOK_RPTBOX_PAGEBODY = 5;

  //
  // Reports constants
  private static int BUK_ALLEGATIBOOK_RPT_NEWREPORT = 6;
  private static int BUK_ALLEGATIBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_ALLEGATIBOOK_SEC_TITOLO = 8;
  private static int BUK_ALLEGATIBOOK_RPTBOX_TITOLO2 = 9;
  private static int BUK_ALLEGATIBOOK_SPAN_FUNZIOESERVI = 10;
  private static int BUK_ALLEGATIBOOK_SEC_PAGEHEADER = 11;
  private static int BUK_ALLEGATIBOOK_RPTBOX_CODICEHEADER = 12;
  private static int BUK_ALLEGATIBOOK_SPAN_CODICE = 13;
  private static int BUK_ALLEGATIBOOK_RPTBOX_DESCRIHEADER = 14;
  private static int BUK_ALLEGATIBOOK_SPAN_DESCRIZIONE = 15;
  private static int BUK_ALLEGATIBOOK_RPTBOX_DESCABBHEADE = 16;
  private static int BUK_ALLEGATIBOOK_SPAN_DESCRABBR = 17;
  private static int BUK_ALLEGATIBOOK_SEC_DETAIL = 18;
  private static int BUK_ALLEGATIBOOK_RPTBOX_CODICE = 19;
  private static int BUK_ALLEGATIBOOK_SPAN_T69CODALALBO = 20;
  private static int BUK_ALLEGATIBOOK_RPTBOX_DESCRIZIONE = 21;
  private static int BUK_ALLEGATIBOOK_SPAN_T69DESALALBO = 22;
  private static int BUK_ALLEGATIBOOK_RPTBOX_DESCABB = 23;
  private static int BUK_ALLEGATIBOOK_SPAN_T6DEABALALBO = 24;
  private static int BUK_ALLEGATIBOOK_SEC_PAGEFOOTER = 25;
  private static int BUK_ALLEGATIBOOK_SEC_REPORTFOOTER = 26;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T74(IMDB);
    Init_PQRY_T69(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T74(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_T74, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_T74, "PQRY_T74");
    IMDB.set_FldCode(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_DESC_ABB, "DESC_ABB");
    IMDB.SetFldParams(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_DESC_ABB,5,33,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_T74,IMDBDef8.PQSL_T74_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_T74, 0);
  }

  private static void Init_PQRY_T69(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_T69, 3);
    IMDB.set_TblCode(IMDBDef8.PQRY_T69, "PQRY_T69");
    IMDB.set_FldCode(IMDBDef8.PQRY_T69,IMDBDef8.PQSL_T69_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T69,IMDBDef8.PQSL_T69_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T69,IMDBDef8.PQSL_T69_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T69,IMDBDef8.PQSL_T69_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T69,IMDBDef8.PQSL_T69_DESC_ABB, "DESC_ABB");
    IMDB.SetFldParams(IMDBDef8.PQRY_T69,IMDBDef8.PQSL_T69_DESC_ABB,5,33,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_T69, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Allegati(MyWebEntryPoint w, IMDBObj imdb)
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
  public Allegati()
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
    FormIdx = MyGlb.FRM_ALLEGATI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "799DE4D5-05AF-4E6D-B705-15FC92EC03DB";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 760;
    DesignHeight = 426;
    set_Caption(new IDVariant("Allegati"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 760;
    Frames[1].Height = 400;
    Frames[1].Caption = "Allegati";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 400;
    PAN_ALLEGATI = new IDPanel(w, this, 1, "PAN_ALLEGATI");
    Frames[1].Content = PAN_ALLEGATI;
    PAN_ALLEGATI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ALLEGATI.VS = MainFrm.VisualStyleList;
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 760-MyGlb.PAN_OFFS_X, 400-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_ALLEGATIBOOK != null)
      PAN_ALLEGATI.SetBook(BUK_ALLEGATIBOOK);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8ABBB86C-7BB1-440F-9D2D-81917890A790");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 716, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ALLEGATI.InitStatus = 2;
    PAN_ALLEGATI_Init();
    PAN_ALLEGATI_InitFields();
    PAN_ALLEGATI_InitQueries();
    BKW_ALLEGATIBOOK = new OBook(this);
    BUK_ALLEGATIBOOK = new CIDREObj(BKW_ALLEGATIBOOK);
    BKW_ALLEGATIBOOK.iGuid = "50CF2A36-88A7-4F3F-8148-4CF3E9EA4990";
    BKW_ALLEGATIBOOK.Code = "BUK_ALLEGATIBOOK";
    BKW_ALLEGATIBOOK.BookObj = BUK_ALLEGATIBOOK;
    BKW_ALLEGATIBOOK.InitDefMasks();
    BUK_ALLEGATIBOOK.InitBook(1, 1245185, "Allegati Book", IMDB, MainFrm.VisualStyleList);
    BUK_ALLEGATIBOOK.InitHTML();
    BUK_ALLEGATIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ALLEGATIBOOK.Book.SetMainFrm(MainFrm);
    BUK_ALLEGATIBOOK.SetRTCGuid(0, "50CF2A36-88A7-4F3F-8148-4CF3E9EA4990");
    BUK_ALLEGATIBOOK.SetObjCode(0, "ALLEGATIBOOK");
    if (PAN_ALLEGATI != null)
      PAN_ALLEGATI.SetBook(BUK_ALLEGATIBOOK);
    BUK_ALLEGATIBOOK_MST_ALLEBOOKPAGE_Init();
    BUK_ALLEGATIBOOK_RPT_NEWREPORT_Init();
    BUK_ALLEGATIBOOK_InitLinks();
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
      PAN_ALLEGATI.UpdatePanel(MainFrm);
      // BUK_ALLEGATIBOOK.UpdateBook();
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
    if (Code.equals("BUK_ALLEGATIBOOK")) return BUK_ALLEGATIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Allegati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Allegati.class.getName() : (Glb.ClassWithPackage(Allegati.class) ? Allegati.class.getName().substring(Allegati.class.getPackage().getName().length() + 1) : Allegati.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Allegati On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ALLEGATI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ALLEGATI);
      // 
      // Allegati On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_ALLEGATI.IsNewRow())
      {
        PAN_ALLEGATI.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGATI_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ALLEGATI.SetFlags (Glb.OBJ_FIELD, PFL_ALLEGATI_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_ALLEGATI.set_ToolTip(Glb.OBJ_FIELD,PFL_ALLEGATI_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_T74, IMDBDef8.PQSL_T74_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Allegati", "AllegatiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Allegati On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ALLEGATI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Allegati On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T69PD(IMDB.Value(IMDBDef8.PQRY_T74, IMDBDef8.PQSL_T74_CODICE, 0));
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
      MainFrm.ErrObj.ProcError ("Allegati", "AllegatiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Allegati On Database Error Event
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
  private void PAN_ALLEGATI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ALLEGATI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Allegati On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Allegati", "AllegatiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Allegati On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ALLEGATI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Allegati On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_T74, IMDBDef8.PQSL_T74_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_T74, IMDBDef8.PQSL_T74_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_T74, IMDBDef8.PQSL_T74_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_T74, IMDBDef8.PQSL_T74_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_T74, IMDBDef8.PQSL_T74_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_T74, IMDBDef8.PQSL_T74_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Allegati", "AllegatiOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("Allegati", "LoadEvent", _e);
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
  private void PAN_ALLEGATI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ALLEGATI, Cancel);
    // Stub
  }

  private void PAN_ALLEGATI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ALLEGATI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ALLEGATI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ALLEGATI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ALLEGATI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_ALLEGATIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ALLEGATIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ALLEGATIBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_ALLEGATIBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_ALLEGATIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_ALLEGATIBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_ALLEGATIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_ALLEGATIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_ALLEGATIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ALLEGATIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ALLEGATIBOOK_MST_ALLEBOOKPAGE)
    {
      BUK_ALLEGATIBOOK.set_SpanValue(BUK_ALLEGATIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ALLEGATIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ALLEGATIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_ALLEGATIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ALLEGATIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ALLEGATIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ALLEGATIBOOK_OnPreview()
  {
    PreviewBook = BKW_ALLEGATIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ALLEGATI_Init()
  {

    PAN_ALLEGATI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ALLEGATI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ALLEGATI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, "DDF7325A-D590-4285-B592-74E380BAB76C");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, "Codice");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, "66D8BB98-EF6B-4B1D-A9C9-844F72E200FD");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, "Descrizione");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, "FD2F99EA-C0C3-40B0-969D-D765A019E595");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, "Descr. Abbr.");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, MyGlb.VIS_NORMALFIELDS);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, "B052C9F6-CF2B-4A7D-8EAF-1C03694827EC");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, "C8392CDD-BF0E-456C-8F8F-AF49E3338EE7");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, "84B53EE6-7069-4EFC-93EE-F9423077C19D");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ALLEGATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, "ABE5A12F-88F2-49E0-8D8A-C83C6596E99A");
    PAN_ALLEGATI.set_Header(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_ALLEGATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, "");
    PAN_ALLEGATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ALLEGATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ALLEGATI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_CODICE, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_CODICE, PPQRY_T74, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, MyGlb.PANEL_LIST, 48, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, MyGlb.PANEL_LIST, 104);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_DESCRIZIONE, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_DESCRIZIONE, PPQRY_T74, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, MyGlb.PANEL_LIST, 444, 36, 272, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, MyGlb.PANEL_LIST, 56);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, MyGlb.PANEL_LIST, "Descr. Abbr.");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, MyGlb.PANEL_FORM, 4, 52, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, MyGlb.PANEL_FORM, 88);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DESCRABBR, MyGlb.PANEL_FORM, "Descr. Abbr.");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_DESCRABBR, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_DESCRABBR, PPQRY_T74, "A.DESC_ABB", "DESC_ABB", 5, 33, 0, -13997);
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, MyGlb.PANEL_LIST, 6, 248, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSERIMENTO");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 76, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_UTENTEINSERI, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_UTENTEINSERI, PPQRY_T74, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, MyGlb.PANEL_LIST, 252, 248, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 100, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_DATAINSERIME, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_DATAINSERIME, PPQRY_T74, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, MyGlb.PANEL_LIST, 4, 272, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 124, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_UTENTULTIAGG, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_UTENTULTIAGG, PPQRY_T74, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, MyGlb.PANEL_LIST, 248, 268, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_ALLEGATI.SetRect(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 148, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALLEGATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_ALLEGATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_ALLEGATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALLEGATI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_ALLEGATI.SetFieldPage(PFL_ALLEGATI_DATAULTIMAGG, -1, -1);
    PAN_ALLEGATI.SetFieldPanel(PFL_ALLEGATI_DATAULTIMAGG, PPQRY_T74, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_ALLEGATI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ALLEGATI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ALLEGATI.SetIMDB(IMDB, "PQRY_T74", true);
    PAN_ALLEGATI.set_SetString(MyGlb.MASTER_ROWNAME, "T69");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DESC_ABB as DESC_ABB, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_ALLEGATI.SetQuery(PPQRY_T74, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T69 A ");
    PAN_ALLEGATI.SetQuery(PPQRY_T74, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ALLEGATI.SetQuery(PPQRY_T74, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ALLEGATI.SetQuery(PPQRY_T74, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ALLEGATI.SetQuery(PPQRY_T74, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ALLEGATI.SetQuery(PPQRY_T74, 5, SQL, -1, "");
    PAN_ALLEGATI.SetQueryDB(PPQRY_T74, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ALLEGATI.SetMasterTable(0, "T69");
    PAN_ALLEGATI.AddToSortList(PFL_ALLEGATI_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ALLEGATI.Status() == 2)
    {
      int oldListQBE = PAN_ALLEGATI.iUseListQBE;
      PAN_ALLEGATI.iUseListQBE = 0;
      PAN_ALLEGATI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ALLEGATI.PanelCommand(Glb.PCM_FIND);
      PAN_ALLEGATI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_ALLEGATIBOOK_MST_ALLEBOOKPAGE_Init()
  {
    BUK_ALLEGATIBOOK.InitMastro(BUK_ALLEGATIBOOK_MST_ALLEBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_MST_ALLEBOOKPAGE, "FFEA420A-8DB7-43B3-972F-9AFF66E30D1D");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_MST_ALLEBOOKPAGE, "ALLEBOOKPAGE");
    BUK_ALLEGATIBOOK.InitMastroBox(BUK_ALLEGATIBOOK_MST_ALLEBOOKPAGE, BUK_ALLEGATIBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_RPTBOX_NUMEROPAGINA, "9CB0F47A-51C5-49FE-8993-E25B7ABFABD7");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ALLEGATIBOOK.InitBoxSpan(BUK_ALLEGATIBOOK_RPTBOX_NUMEROPAGINA, BUK_ALLEGATIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SPAN_NUMEROPAGINA, "FD950858-EAB0-4208-A8AA-F629CA812A64");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ALLEGATIBOOK.InitMastroBox(BUK_ALLEGATIBOOK_MST_ALLEBOOKPAGE, BUK_ALLEGATIBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 1800, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_RPTBOX_PAGEHEADER, "19BE02F1-E346-4A19-882B-49891D538945");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_ALLEGATIBOOK.InitMastroBox(BUK_ALLEGATIBOOK_MST_ALLEBOOKPAGE, BUK_ALLEGATIBOOK_RPTBOX_PAGEBODY, 1000, 3000, 19000, 25600, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_RPTBOX_PAGEBODY, "16FD5598-8C7E-44F7-8F7B-EFA2E03B3190");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_ALLEGATIBOOK_RPT_NEWREPORT_InitQuery() { BUK_ALLEGATIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_ALLEGATIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.DESC_ABB as DESC_ABB ");
      SQL.append("from ");
      SQL.append("  T69 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_ALLEGATIBOOK.SetReportQuery(BUK_ALLEGATIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "31C525A9-74F8-4E3B-B23D-14314E35B12B");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ALLEGATIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_ALLEGATIBOOK.InitReport(BUK_ALLEGATIBOOK_RPT_NEWREPORT, 196609);
    BUK_ALLEGATIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_RPT_NEWREPORT, "2BB8E141-AC76-4164-9703-AB8B955619E0");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_ALLEGATIBOOK.InitSection(BUK_ALLEGATIBOOK_RPT_NEWREPORT, BUK_ALLEGATIBOOK_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ALLEGATIBOOK.SetSectionRendersInto(BUK_ALLEGATIBOOK_SEC_REPORTHEADER, BUK_ALLEGATIBOOK_RPTBOX_PAGEBODY);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SEC_REPORTHEADER, "74AFDA5B-5377-4BE0-9FA6-54BB6BC78D01");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_ALLEGATIBOOK.InitSection(BUK_ALLEGATIBOOK_RPT_NEWREPORT, BUK_ALLEGATIBOOK_SEC_TITOLO, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_ALLEGATIBOOK.SetSectionRendersInto(BUK_ALLEGATIBOOK_SEC_TITOLO, BUK_ALLEGATIBOOK_RPTBOX_PAGEHEADER);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SEC_TITOLO, "FCD4BD6A-C0C5-4452-9D40-47BB9371469C");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SEC_TITOLO, "TITOLO");
    BUK_ALLEGATIBOOK.InitReportBox(BUK_ALLEGATIBOOK_SEC_TITOLO, BUK_ALLEGATIBOOK_RPTBOX_TITOLO2, 0, 200, 19000, 900, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_RPTBOX_TITOLO2, "1C2F42B6-438A-46C6-8AB0-93E3CE5A5D71");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_RPTBOX_TITOLO2, "TITOLO2");
    BUK_ALLEGATIBOOK.InitBoxSpan(BUK_ALLEGATIBOOK_RPTBOX_TITOLO2, BUK_ALLEGATIBOOK_SPAN_FUNZIOESERVI, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Tipi di Allegato al Bilancio", 1);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SPAN_FUNZIOESERVI, "69719C88-B678-436C-80A9-77BBA924D20C");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SPAN_FUNZIOESERVI, "FUNZIOESERVI");
    BUK_ALLEGATIBOOK.InitSection(BUK_ALLEGATIBOOK_RPT_NEWREPORT, BUK_ALLEGATIBOOK_SEC_PAGEHEADER, 600, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ALLEGATIBOOK.SetSectionRendersInto(BUK_ALLEGATIBOOK_SEC_PAGEHEADER, BUK_ALLEGATIBOOK_RPTBOX_PAGEBODY);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SEC_PAGEHEADER, "555E761A-0AE0-45C6-99F9-832C8EAB4406");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ALLEGATIBOOK.InitReportBox(BUK_ALLEGATIBOOK_SEC_PAGEHEADER, BUK_ALLEGATIBOOK_RPTBOX_CODICEHEADER, 0, 0, 1200, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_RPTBOX_CODICEHEADER, "A7EE50F1-CB76-4160-BB56-47775306E7EF");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_ALLEGATIBOOK.InitBoxSpan(BUK_ALLEGATIBOOK_RPTBOX_CODICEHEADER, BUK_ALLEGATIBOOK_SPAN_CODICE, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SPAN_CODICE, "410241AD-EEC0-4934-805F-F76B5813B204");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SPAN_CODICE, "CODICE");
    BUK_ALLEGATIBOOK.InitReportBox(BUK_ALLEGATIBOOK_SEC_PAGEHEADER, BUK_ALLEGATIBOOK_RPTBOX_DESCRIHEADER, 1300, 0, 10330, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_RPTBOX_DESCRIHEADER, "FDED30EB-CF6A-4627-AFB0-1C4D9D3A4FB7");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_ALLEGATIBOOK.InitBoxSpan(BUK_ALLEGATIBOOK_RPTBOX_DESCRIHEADER, BUK_ALLEGATIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SPAN_DESCRIZIONE, "233AD0F6-2558-48A3-BCBA-C60910F13B81");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_ALLEGATIBOOK.InitReportBox(BUK_ALLEGATIBOOK_SEC_PAGEHEADER, BUK_ALLEGATIBOOK_RPTBOX_DESCABBHEADE, 11800, 0, 7153, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_RPTBOX_DESCABBHEADE, "2103F543-A419-4A8B-83E4-55E1752C902A");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_RPTBOX_DESCABBHEADE, "DESCABBHEADE");
    BUK_ALLEGATIBOOK.InitBoxSpan(BUK_ALLEGATIBOOK_RPTBOX_DESCABBHEADE, BUK_ALLEGATIBOOK_SPAN_DESCRABBR, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione Abbreviata", 1);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SPAN_DESCRABBR, "8A5C17EC-4D6E-4F9F-ADAE-98C00DD68256");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SPAN_DESCRABBR, "DESCRABBR");
    BUK_ALLEGATIBOOK.InitSection(BUK_ALLEGATIBOOK_RPT_NEWREPORT, BUK_ALLEGATIBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ALLEGATIBOOK.SetSectionRendersInto(BUK_ALLEGATIBOOK_SEC_DETAIL, BUK_ALLEGATIBOOK_RPTBOX_PAGEBODY);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SEC_DETAIL, "F62A5DF6-37A2-4202-AFDA-E25000461564");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SEC_DETAIL, "DETAIL");
    BUK_ALLEGATIBOOK.InitReportBox(BUK_ALLEGATIBOOK_SEC_DETAIL, BUK_ALLEGATIBOOK_RPTBOX_CODICE, 0, 0, 1200, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_RPTBOX_CODICE, "7F5189AF-9D5C-4E7E-98A2-2799B386C0F4");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_RPTBOX_CODICE, "CODICE");
    BUK_ALLEGATIBOOK.InitBoxSpan(BUK_ALLEGATIBOOK_RPTBOX_CODICE, BUK_ALLEGATIBOOK_SPAN_T69CODALALBO, MyGlb.VIS_CAMSENBORCEN, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SPAN_T69CODALALBO, "0247EA36-038F-4690-AB07-6E71FDDF5185");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SPAN_T69CODALALBO, "T69CODALALBO");
    BUK_ALLEGATIBOOK.InitReportBox(BUK_ALLEGATIBOOK_SEC_DETAIL, BUK_ALLEGATIBOOK_RPTBOX_DESCRIZIONE, 1300, 0, 10300, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_RPTBOX_DESCRIZIONE, "43253CED-AF2F-4DC6-9421-507018D504B4");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_ALLEGATIBOOK.InitBoxSpan(BUK_ALLEGATIBOOK_RPTBOX_DESCRIZIONE, BUK_ALLEGATIBOOK_SPAN_T69DESALALBO, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SPAN_T69DESALALBO, "29097E6D-8A5D-4137-A382-B2B231AFB8F2");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SPAN_T69DESALALBO, "T69DESALALBO");
    BUK_ALLEGATIBOOK.InitReportBox(BUK_ALLEGATIBOOK_SEC_DETAIL, BUK_ALLEGATIBOOK_RPTBOX_DESCABB, 11800, 0, 7153, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_RPTBOX_DESCABB, "80897DAC-F7FB-4C69-905A-00CC386F3935");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_RPTBOX_DESCABB, "DESCABB");
    BUK_ALLEGATIBOOK.InitBoxSpan(BUK_ALLEGATIBOOK_RPTBOX_DESCABB, BUK_ALLEGATIBOOK_SPAN_T6DEABALALBO, MyGlb.VIS_DEFAREPOSTYL, 5, 33, 0, 271384705, "Brief description of field content.", "::DESC_ABB", 1);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SPAN_T6DEABALALBO, "7858979C-519D-4731-B7F2-EEFFF92F365C");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SPAN_T6DEABALALBO, "T6DEABALALBO");
    BUK_ALLEGATIBOOK.InitSection(BUK_ALLEGATIBOOK_RPT_NEWREPORT, BUK_ALLEGATIBOOK_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ALLEGATIBOOK.SetSectionRendersInto(BUK_ALLEGATIBOOK_SEC_PAGEFOOTER, BUK_ALLEGATIBOOK_RPTBOX_PAGEBODY);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SEC_PAGEFOOTER, "90E6D74F-1958-4CF7-8C0B-7F84A53E931A");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_ALLEGATIBOOK.InitSection(BUK_ALLEGATIBOOK_RPT_NEWREPORT, BUK_ALLEGATIBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ALLEGATIBOOK.SetSectionRendersInto(BUK_ALLEGATIBOOK_SEC_REPORTFOOTER, BUK_ALLEGATIBOOK_RPTBOX_PAGEBODY);
    BUK_ALLEGATIBOOK.SetRTCGuid(BUK_ALLEGATIBOOK_SEC_REPORTFOOTER, "737BB934-1FF1-463E-8730-FF2D65244153");
    BUK_ALLEGATIBOOK.SetObjCode(BUK_ALLEGATIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ALLEGATIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_ALLEGATIBOOK_InitLinks()
  {
    BUK_ALLEGATIBOOK.SetBoxNextBox(BUK_ALLEGATIBOOK_RPTBOX_PAGEBODY, BUK_ALLEGATIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_ALLEGATI) PAN_ALLEGATI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_ALLEGATIBOOK) BUK_ALLEGATIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ALLEGATIBOOK) BUK_ALLEGATIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ALLEGATIBOOK) BUK_ALLEGATIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ALLEGATIBOOK) BUK_ALLEGATIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ALLEGATIBOOK) BUK_ALLEGATIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ALLEGATIBOOK) BUK_ALLEGATIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ALLEGATIBOOK) BUK_ALLEGATIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ALLEGATIBOOK) BUK_ALLEGATIBOOK_OnPreview();
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
