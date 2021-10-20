// **********************************************
// Flessibilita
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Flessibilita extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FLESSIBILITA_CODICE = 0;
  private static int PFL_FLESSIBILITA_DESCRIZIONE = 1;
  private static int PFL_FLESSIBILITA_UTENTEINSERI = 2;
  private static int PFL_FLESSIBILITA_DATAINSERIME = 3;
  private static int PFL_FLESSIBILITA_UTENTULTIAGG = 4;
  private static int PFL_FLESSIBILITA_DATAULTIMAGG = 5;

  private static int PPQRY_FLESSIBILIT1 = 0;


  IDPanel PAN_FLESSIBILITA;
  CIDREObj BUK_FLESSIBIBOOK;
  OBook BKW_FLESSIBIBOOK;
  //
  // Template Pages constants
  private static int BUK_FLESSIBIBOOK_MST_FLESBOOKPAGE = 1;
  private static int BUK_FLESSIBIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_FLESSIBIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_FLESSIBIBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_FLESSIBIBOOK_SPAN_FLESSIBILITA = 5;
  private static int BUK_FLESSIBIBOOK_RPTBOX_PAGEBODY = 6;

  //
  // Reports constants
  private static int BUK_FLESSIBIBOOK_RPT_NEWREPORT = 7;
  private static int BUK_FLESSIBIBOOK_SEC_REPORTHEADER = 8;
  private static int BUK_FLESSIBIBOOK_SEC_PAGEHEADER = 9;
  private static int BUK_FLESSIBIBOOK_RPTBOX_CODICEHEADER = 10;
  private static int BUK_FLESSIBIBOOK_SPAN_CODICE = 11;
  private static int BUK_FLESSIBIBOOK_RPTBOX_DESCRIHEADER = 12;
  private static int BUK_FLESSIBIBOOK_SPAN_DESCRIZIONE = 13;
  private static int BUK_FLESSIBIBOOK_SEC_DETAIL = 14;
  private static int BUK_FLESSIBIBOOK_RPTBOX_CODICE = 15;
  private static int BUK_FLESSIBIBOOK_SPAN_FLECODFLFLBO = 16;
  private static int BUK_FLESSIBIBOOK_RPTBOX_DESCRIZIONE = 17;
  private static int BUK_FLESSIBIBOOK_SPAN_FLEDESFLFLBO = 18;
  private static int BUK_FLESSIBIBOOK_SEC_PAGEFOOTER = 19;
  private static int BUK_FLESSIBIBOOK_SEC_REPORTFOOTER = 20;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_FLESSIBILIT1(IMDB);
    Init_PQRY_FLESSIBILIT2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_FLESSIBILIT1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FLESSIBILIT1, 6);
    IMDB.set_TblCode(IMDBDef8.PQRY_FLESSIBILIT1, "PQRY_FLESSIBILIT1");
    IMDB.set_FldCode(IMDBDef8.PQRY_FLESSIBILIT1,IMDBDef8.PQSL_FLESSIBILIT1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FLESSIBILIT1,IMDBDef8.PQSL_FLESSIBILIT1_CODICE,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FLESSIBILIT1,IMDBDef8.PQSL_FLESSIBILIT1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FLESSIBILIT1,IMDBDef8.PQSL_FLESSIBILIT1_DESCRIZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FLESSIBILIT1,IMDBDef8.PQSL_FLESSIBILIT1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FLESSIBILIT1,IMDBDef8.PQSL_FLESSIBILIT1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FLESSIBILIT1,IMDBDef8.PQSL_FLESSIBILIT1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FLESSIBILIT1,IMDBDef8.PQSL_FLESSIBILIT1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FLESSIBILIT1,IMDBDef8.PQSL_FLESSIBILIT1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FLESSIBILIT1,IMDBDef8.PQSL_FLESSIBILIT1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FLESSIBILIT1,IMDBDef8.PQSL_FLESSIBILIT1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FLESSIBILIT1,IMDBDef8.PQSL_FLESSIBILIT1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FLESSIBILIT1, 0);
  }

  private static void Init_PQRY_FLESSIBILIT2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FLESSIBILIT2, 6);
    IMDB.set_TblCode(IMDBDef8.PQRY_FLESSIBILIT2, "PQRY_FLESSIBILIT2");
    IMDB.set_FldCode(IMDBDef8.PQRY_FLESSIBILIT2,IMDBDef8.PQSL_FLESSIBILIT2_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FLESSIBILIT2,IMDBDef8.PQSL_FLESSIBILIT2_CODICE,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FLESSIBILIT2,IMDBDef8.PQSL_FLESSIBILIT2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FLESSIBILIT2,IMDBDef8.PQSL_FLESSIBILIT2_DESCRIZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FLESSIBILIT2,IMDBDef8.PQSL_FLESSIBILIT2_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FLESSIBILIT2,IMDBDef8.PQSL_FLESSIBILIT2_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FLESSIBILIT2,IMDBDef8.PQSL_FLESSIBILIT2_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FLESSIBILIT2,IMDBDef8.PQSL_FLESSIBILIT2_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FLESSIBILIT2,IMDBDef8.PQSL_FLESSIBILIT2_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FLESSIBILIT2,IMDBDef8.PQSL_FLESSIBILIT2_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FLESSIBILIT2,IMDBDef8.PQSL_FLESSIBILIT2_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FLESSIBILIT2,IMDBDef8.PQSL_FLESSIBILIT2_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FLESSIBILIT2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Flessibilita(MyWebEntryPoint w, IMDBObj imdb)
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
  public Flessibilita()
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
    FormIdx = MyGlb.FRM_FLESSIBILITA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "29228DAA-DC0B-45EA-B6CE-2FDE31C5C388";
    ResModeW = 2;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 708;
    DesignHeight = 422;
    set_Caption(new IDVariant("Flessibilita"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 708;
    Frames[1].Height = 396;
    Frames[1].Caption = "Flessibilità";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 396;
    PAN_FLESSIBILITA = new IDPanel(w, this, 1, "PAN_FLESSIBILITA");
    Frames[1].Content = PAN_FLESSIBILITA;
    PAN_FLESSIBILITA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FLESSIBILITA.VS = MainFrm.VisualStyleList;
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 708-MyGlb.PAN_OFFS_X, 396-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_FLESSIBIBOOK != null)
      PAN_FLESSIBILITA.SetBook(BUK_FLESSIBIBOOK);
    PAN_FLESSIBILITA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "87CB41C6-91DC-4C59-B30E-E1F933D57EF7");
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 664, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FLESSIBILITA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FLESSIBILITA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FLESSIBILITA.InitStatus = 2;
    PAN_FLESSIBILITA_Init();
    PAN_FLESSIBILITA_InitFields();
    PAN_FLESSIBILITA_InitQueries();
    BKW_FLESSIBIBOOK = new OBook(this);
    BUK_FLESSIBIBOOK = new CIDREObj(BKW_FLESSIBIBOOK);
    BKW_FLESSIBIBOOK.iGuid = "4D443474-2E77-44CC-AE0B-CCA0A5E28844";
    BKW_FLESSIBIBOOK.Code = "BUK_FLESSIBIBOOK";
    BKW_FLESSIBIBOOK.BookObj = BUK_FLESSIBIBOOK;
    BKW_FLESSIBIBOOK.InitDefMasks();
    BUK_FLESSIBIBOOK.InitBook(1, 1245185, "Flessibilità Book", IMDB, MainFrm.VisualStyleList);
    BUK_FLESSIBIBOOK.InitHTML();
    BUK_FLESSIBIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_FLESSIBIBOOK.Book.SetMainFrm(MainFrm);
    BUK_FLESSIBIBOOK.SetRTCGuid(0, "4D443474-2E77-44CC-AE0B-CCA0A5E28844");
    BUK_FLESSIBIBOOK.SetObjCode(0, "FLESSIBIBOOK");
    if (PAN_FLESSIBILITA != null)
      PAN_FLESSIBILITA.SetBook(BUK_FLESSIBIBOOK);
    BUK_FLESSIBIBOOK_MST_FLESBOOKPAGE_Init();
    BUK_FLESSIBIBOOK_RPT_NEWREPORT_Init();
    BUK_FLESSIBIBOOK_InitLinks();
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
      PAN_FLESSIBILITA.UpdatePanel(MainFrm);
      // BUK_FLESSIBIBOOK.UpdateBook();
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
    if (Code.equals("BUK_FLESSIBIBOOK")) return BUK_FLESSIBIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Flessibilita);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Flessibilita.class.getName() : (Glb.ClassWithPackage(Flessibilita.class) ? Flessibilita.class.getName().substring(Flessibilita.class.getPackage().getName().length() + 1) : Flessibilita.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Flessibilità On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FLESSIBILITA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FLESSIBILITA);
      // 
      // Flessibilità On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_FLESSIBILITA.IsNewRow())
      {
        PAN_FLESSIBILITA.SetFlags (Glb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_FLESSIBILITA.SetFlags (Glb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_FLESSIBILITA.set_ToolTip(Glb.OBJ_FIELD,PFL_FLESSIBILITA_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_FLESSIBILIT1, IMDBDef8.PQSL_FLESSIBILIT1_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Flessibilita", "FlessibilitàOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Flessibilità On Database Error Event
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
  private void PAN_FLESSIBILITA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_FLESSIBILITA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Flessibilità On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Flessibilita", "FlessibilitàOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Flessibilità On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_FLESSIBILITA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Flessibilità On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_FLESSIBILIT1, IMDBDef8.PQSL_FLESSIBILIT1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_FLESSIBILIT1, IMDBDef8.PQSL_FLESSIBILIT1_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_FLESSIBILIT1, IMDBDef8.PQSL_FLESSIBILIT1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_FLESSIBILIT1, IMDBDef8.PQSL_FLESSIBILIT1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_FLESSIBILIT1, IMDBDef8.PQSL_FLESSIBILIT1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_FLESSIBILIT1, IMDBDef8.PQSL_FLESSIBILIT1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Flessibilita", "FlessibilitàOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("Flessibilita", "LoadEvent", _e);
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
  private void PAN_FLESSIBILITA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FLESSIBILITA, Cancel);
    // Stub
  }

  private void PAN_FLESSIBILITA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FLESSIBILITA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FLESSIBILITA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FLESSIBILITA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FLESSIBILITA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_FLESSIBIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_FLESSIBIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_FLESSIBIBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_FLESSIBIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_FLESSIBIBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_FLESSIBIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_FLESSIBIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_FLESSIBIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_FLESSIBIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_FLESSIBIBOOK_MST_FLESBOOKPAGE)
    {
      BUK_FLESSIBIBOOK.set_SpanValue(BUK_FLESSIBIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_FLESSIBIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_FLESSIBIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_FLESSIBIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_FLESSIBIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_FLESSIBIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_FLESSIBIBOOK_OnPreview()
  {
    PreviewBook = BKW_FLESSIBIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FLESSIBILITA_Init()
  {

    PAN_FLESSIBILITA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FLESSIBILITA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FLESSIBILITA.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_FLESSIBILITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, "74E0216E-5DC0-4024-9AF6-B97B3465E45A");
    PAN_FLESSIBILITA.set_Header(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, "Codice");
    PAN_FLESSIBILITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, "");
    PAN_FLESSIBILITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_FLESSIBILITA.SetFlags(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_FLESSIBILITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, "CEB0C3CE-22C9-46D0-A51E-990305255CE8");
    PAN_FLESSIBILITA.set_Header(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, "Descrizione");
    PAN_FLESSIBILITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, "");
    PAN_FLESSIBILITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FLESSIBILITA.SetFlags(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FLESSIBILITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, "C1E15DD9-7501-4FB6-A4A2-218E208894A8");
    PAN_FLESSIBILITA.set_Header(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_FLESSIBILITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, "");
    PAN_FLESSIBILITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_FLESSIBILITA.SetFlags(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FLESSIBILITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, "5B43D43E-BCC2-4369-A8BD-42B5B48C5CA1");
    PAN_FLESSIBILITA.set_Header(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, "DATA INSERIMENTO");
    PAN_FLESSIBILITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, "");
    PAN_FLESSIBILITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_FLESSIBILITA.SetFlags(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FLESSIBILITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, "42374198-8AB5-49FC-9F41-DE3E67DDA168");
    PAN_FLESSIBILITA.set_Header(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_FLESSIBILITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, "");
    PAN_FLESSIBILITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_FLESSIBILITA.SetFlags(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FLESSIBILITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, "C723F46B-8A5E-4B0A-87E7-9E6F55E13A4B");
    PAN_FLESSIBILITA.set_Header(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_FLESSIBILITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, "");
    PAN_FLESSIBILITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_FLESSIBILITA.SetFlags(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FLESSIBILITA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_FLESSIBILITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_FLESSIBILITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_FLESSIBILITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_FLESSIBILITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_FLESSIBILITA.SetFieldPage(PFL_FLESSIBILITA_CODICE, -1, -1);
    PAN_FLESSIBILITA.SetFieldPanel(PFL_FLESSIBILITA_CODICE, PPQRY_FLESSIBILIT1, "A.CODICE", "CODICE", 5, 4, 0, -13997);
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 608, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_FLESSIBILITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FLESSIBILITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_FLESSIBILITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_FLESSIBILITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FLESSIBILITA.SetFieldPage(PFL_FLESSIBILITA_DESCRIZIONE, -1, -1);
    PAN_FLESSIBILITA.SetFieldPanel(PFL_FLESSIBILITA_DESCRIZIONE, PPQRY_FLESSIBILIT1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 60, 0, -13997);
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, MyGlb.PANEL_LIST, 664, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_FLESSIBILITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_FLESSIBILITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, MyGlb.PANEL_FORM, 128, 52, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_FLESSIBILITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_FLESSIBILITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_FLESSIBILITA.SetFieldPage(PFL_FLESSIBILITA_UTENTEINSERI, -1, -1);
    PAN_FLESSIBILITA.SetFieldPanel(PFL_FLESSIBILITA_UTENTEINSERI, PPQRY_FLESSIBILIT1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, MyGlb.PANEL_LIST, 784, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_FLESSIBILITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_FLESSIBILITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, MyGlb.PANEL_FORM, 116, 76, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_FLESSIBILITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_FLESSIBILITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_FLESSIBILITA.SetFieldPage(PFL_FLESSIBILITA_DATAINSERIME, -1, -1);
    PAN_FLESSIBILITA.SetFieldPanel(PFL_FLESSIBILITA_DATAINSERIME, PPQRY_FLESSIBILIT1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, MyGlb.PANEL_LIST, 892, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_FLESSIBILITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_FLESSIBILITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, MyGlb.PANEL_FORM, 120, 100, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_FLESSIBILITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_FLESSIBILITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_FLESSIBILITA.SetFieldPage(PFL_FLESSIBILITA_UTENTULTIAGG, -1, -1);
    PAN_FLESSIBILITA.SetFieldPanel(PFL_FLESSIBILITA_UTENTULTIAGG, PPQRY_FLESSIBILIT1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, MyGlb.PANEL_LIST, 1004, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_FLESSIBILITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_FLESSIBILITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_FLESSIBILITA.SetRect(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, MyGlb.PANEL_FORM, 108, 124, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FLESSIBILITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_FLESSIBILITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_FLESSIBILITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FLESSIBILITA_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_FLESSIBILITA.SetFieldPage(PFL_FLESSIBILITA_DATAULTIMAGG, -1, -1);
    PAN_FLESSIBILITA.SetFieldPanel(PFL_FLESSIBILITA_DATAULTIMAGG, PPQRY_FLESSIBILIT1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_FLESSIBILITA_InitQueries()
  {
    StringBuffer SQL;

    PAN_FLESSIBILITA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FLESSIBILITA.SetIMDB(IMDB, "PQRY_FLESSIBILIT1", true);
    PAN_FLESSIBILITA.set_SetString(MyGlb.MASTER_ROWNAME, "FLESSIBILITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_FLESSIBILITA.SetQuery(PPQRY_FLESSIBILIT1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FLESSIBILITA A ");
    PAN_FLESSIBILITA.SetQuery(PPQRY_FLESSIBILIT1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FLESSIBILITA.SetQuery(PPQRY_FLESSIBILIT1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FLESSIBILITA.SetQuery(PPQRY_FLESSIBILIT1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FLESSIBILITA.SetQuery(PPQRY_FLESSIBILIT1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_FLESSIBILITA.SetQuery(PPQRY_FLESSIBILIT1, 5, SQL, -1, "");
    PAN_FLESSIBILITA.SetQueryDB(PPQRY_FLESSIBILIT1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FLESSIBILITA.SetMasterTable(0, "FLESSIBILITA");
    PAN_FLESSIBILITA.AddToSortList(PFL_FLESSIBILITA_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FLESSIBILITA.Status() == 2)
    {
      int oldListQBE = PAN_FLESSIBILITA.iUseListQBE;
      PAN_FLESSIBILITA.iUseListQBE = 0;
      PAN_FLESSIBILITA.PanelCommand(Glb.PCM_SEARCH);
      PAN_FLESSIBILITA.PanelCommand(Glb.PCM_FIND);
      PAN_FLESSIBILITA.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_FLESSIBIBOOK_MST_FLESBOOKPAGE_Init()
  {
    BUK_FLESSIBIBOOK.InitMastro(BUK_FLESSIBIBOOK_MST_FLESBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_MST_FLESBOOKPAGE, "1167EDF0-BEE3-4959-A6EB-1C62FCBC64E0");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_MST_FLESBOOKPAGE, "FLESBOOKPAGE");
    BUK_FLESSIBIBOOK.InitMastroBox(BUK_FLESSIBIBOOK_MST_FLESBOOKPAGE, BUK_FLESSIBIBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_RPTBOX_NUMEROPAGINA, "7FD641AC-0475-4A16-8B70-051DD7C6FF9F");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_FLESSIBIBOOK.InitBoxSpan(BUK_FLESSIBIBOOK_RPTBOX_NUMEROPAGINA, BUK_FLESSIBIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_SPAN_NUMEROPAGINA, "FF5DF0C1-F8AA-45D6-9E32-672171DEC73E");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_FLESSIBIBOOK.InitMastroBox(BUK_FLESSIBIBOOK_MST_FLESBOOKPAGE, BUK_FLESSIBIBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 900, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_RPTBOX_PAGEHEADER, "3021BC83-D840-4C55-A43C-F12526C23E2B");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_FLESSIBIBOOK.InitBoxSpan(BUK_FLESSIBIBOOK_RPTBOX_PAGEHEADER, BUK_FLESSIBIBOOK_SPAN_FLESSIBILITA, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Flessibilità", 1);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_SPAN_FLESSIBILITA, "70B099E5-751F-49FA-BD20-8E07F919E447");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_SPAN_FLESSIBILITA, "FLESSIBILITA");
    BUK_FLESSIBIBOOK.InitMastroBox(BUK_FLESSIBIBOOK_MST_FLESBOOKPAGE, BUK_FLESSIBIBOOK_RPTBOX_PAGEBODY, 1000, 2200, 19000, 26300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_RPTBOX_PAGEBODY, "B5308006-387B-4AA2-8CC5-71EFFD2504BC");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_FLESSIBIBOOK_RPT_NEWREPORT_InitQuery() { BUK_FLESSIBIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_FLESSIBIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
      SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
      SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
      SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
      SQL.append("from ");
      SQL.append("  FLESSIBILITA A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_FLESSIBIBOOK.SetReportQuery(BUK_FLESSIBIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "185E53A6-5E08-4435-A7B5-407615CA1F2F");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_FLESSIBIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_FLESSIBIBOOK.InitReport(BUK_FLESSIBIBOOK_RPT_NEWREPORT, 196609);
    BUK_FLESSIBIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_RPT_NEWREPORT, "0E9A4CEF-6030-454D-8413-C7E86831CD58");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_FLESSIBIBOOK.InitSection(BUK_FLESSIBIBOOK_RPT_NEWREPORT, BUK_FLESSIBIBOOK_SEC_REPORTHEADER, 200, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FLESSIBIBOOK.SetSectionRendersInto(BUK_FLESSIBIBOOK_SEC_REPORTHEADER, BUK_FLESSIBIBOOK_RPTBOX_PAGEBODY);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_SEC_REPORTHEADER, "3FAE00D6-4452-441C-8116-A456BB9204C3");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_FLESSIBIBOOK.InitSection(BUK_FLESSIBIBOOK_RPT_NEWREPORT, BUK_FLESSIBIBOOK_SEC_PAGEHEADER, 600, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FLESSIBIBOOK.SetSectionRendersInto(BUK_FLESSIBIBOOK_SEC_PAGEHEADER, BUK_FLESSIBIBOOK_RPTBOX_PAGEBODY);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_SEC_PAGEHEADER, "CB7D96C6-A5FA-48AA-9590-00B15694CBFB");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_FLESSIBIBOOK.InitReportBox(BUK_FLESSIBIBOOK_SEC_PAGEHEADER, BUK_FLESSIBIBOOK_RPTBOX_CODICEHEADER, 200, 0, 1100, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_RPTBOX_CODICEHEADER, "872ED648-9B8A-423D-80C0-2BCBC3581C3A");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_FLESSIBIBOOK.InitBoxSpan(BUK_FLESSIBIBOOK_RPTBOX_CODICEHEADER, BUK_FLESSIBIBOOK_SPAN_CODICE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_SPAN_CODICE, "8A83222A-37CD-4F9A-9B66-D25B5097B0C5");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_SPAN_CODICE, "CODICE");
    BUK_FLESSIBIBOOK.InitReportBox(BUK_FLESSIBIBOOK_SEC_PAGEHEADER, BUK_FLESSIBIBOOK_RPTBOX_DESCRIHEADER, 1500, 0, 17100, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_RPTBOX_DESCRIHEADER, "D088E634-242F-4FC5-BBE8-6A70BFAE3B96");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_FLESSIBIBOOK.InitBoxSpan(BUK_FLESSIBIBOOK_RPTBOX_DESCRIHEADER, BUK_FLESSIBIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_SPAN_DESCRIZIONE, "0D5CC139-C961-41A4-803E-2664A1878498");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_FLESSIBIBOOK.InitSection(BUK_FLESSIBIBOOK_RPT_NEWREPORT, BUK_FLESSIBIBOOK_SEC_DETAIL, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FLESSIBIBOOK.SetSectionRendersInto(BUK_FLESSIBIBOOK_SEC_DETAIL, BUK_FLESSIBIBOOK_RPTBOX_PAGEBODY);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_SEC_DETAIL, "7B35D553-271D-45CD-9BE0-370BF7602EA5");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_SEC_DETAIL, "DETAIL");
    BUK_FLESSIBIBOOK.InitReportBox(BUK_FLESSIBIBOOK_SEC_DETAIL, BUK_FLESSIBIBOOK_RPTBOX_CODICE, 0, 0, 1400, 400, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_RPTBOX_CODICE, "B0C48B46-E852-4A0F-8481-D533EE003EBD");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_RPTBOX_CODICE, "CODICE");
    BUK_FLESSIBIBOOK.InitBoxSpan(BUK_FLESSIBIBOOK_RPTBOX_CODICE, BUK_FLESSIBIBOOK_SPAN_FLECODFLFLBO, MyGlb.VIS_CAMSENBORCEN, 5, 4, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_SPAN_FLECODFLFLBO, "9350633A-7D0F-4220-9402-9D70942B1B4A");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_SPAN_FLECODFLFLBO, "FLECODFLFLBO");
    BUK_FLESSIBIBOOK.InitReportBox(BUK_FLESSIBIBOOK_SEC_DETAIL, BUK_FLESSIBIBOOK_RPTBOX_DESCRIZIONE, 1500, 0, 17100, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_RPTBOX_DESCRIZIONE, "38AE5004-3494-4CA6-9F73-F8083623B5FF");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_FLESSIBIBOOK.InitBoxSpan(BUK_FLESSIBIBOOK_RPTBOX_DESCRIZIONE, BUK_FLESSIBIBOOK_SPAN_FLEDESFLFLBO, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_SPAN_FLEDESFLFLBO, "471413F9-9DFB-427F-82B4-592B6B61A544");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_SPAN_FLEDESFLFLBO, "FLEDESFLFLBO");
    BUK_FLESSIBIBOOK.InitSection(BUK_FLESSIBIBOOK_RPT_NEWREPORT, BUK_FLESSIBIBOOK_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_FLESSIBIBOOK.SetSectionRendersInto(BUK_FLESSIBIBOOK_SEC_PAGEFOOTER, BUK_FLESSIBIBOOK_RPTBOX_PAGEBODY);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_SEC_PAGEFOOTER, "94FC2294-220A-45B1-A1BC-97B38310B9E4");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_FLESSIBIBOOK.InitSection(BUK_FLESSIBIBOOK_RPT_NEWREPORT, BUK_FLESSIBIBOOK_SEC_REPORTFOOTER, 200, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_FLESSIBIBOOK.SetSectionRendersInto(BUK_FLESSIBIBOOK_SEC_REPORTFOOTER, BUK_FLESSIBIBOOK_RPTBOX_PAGEBODY);
    BUK_FLESSIBIBOOK.SetRTCGuid(BUK_FLESSIBIBOOK_SEC_REPORTFOOTER, "64CE53B8-8015-4165-A950-AFB5255B9B72");
    BUK_FLESSIBIBOOK.SetObjCode(BUK_FLESSIBIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_FLESSIBIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_FLESSIBIBOOK_InitLinks()
  {
    BUK_FLESSIBIBOOK.SetBoxNextBox(BUK_FLESSIBIBOOK_RPTBOX_PAGEBODY, BUK_FLESSIBIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FLESSIBILITA) PAN_FLESSIBILITA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FLESSIBILITA) PAN_FLESSIBILITA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FLESSIBILITA) PAN_FLESSIBILITA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FLESSIBILITA) PAN_FLESSIBILITA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FLESSIBILITA) PAN_FLESSIBILITA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_FLESSIBIBOOK) BUK_FLESSIBIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_FLESSIBIBOOK) BUK_FLESSIBIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_FLESSIBIBOOK) BUK_FLESSIBIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_FLESSIBIBOOK) BUK_FLESSIBIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_FLESSIBIBOOK) BUK_FLESSIBIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_FLESSIBIBOOK) BUK_FLESSIBIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_FLESSIBIBOOK) BUK_FLESSIBIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_FLESSIBIBOOK) BUK_FLESSIBIBOOK_OnPreview();
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
