// **********************************************
// Voci Econ
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VociEcon extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VOCIECONOMIC_ENTRATOSPESA = 0;
  private static int PFL_VOCIECONOMIC_CODICE = 1;
  private static int PFL_VOCIECONOMIC_DESCRIZIONE = 2;
  private static int PFL_VOCIECONOMIC_UTENTEINSERI = 3;
  private static int PFL_VOCIECONOMIC_DATAINSERIME = 4;
  private static int PFL_VOCIECONOMIC_UTENTULTIAGG = 5;
  private static int PFL_VOCIECONOMIC_DATAULTIMAGG = 6;

  private static int PPQRY_VOCIECONOMI5 = 0;


  IDPanel PAN_VOCIECONOMIC;
  CIDREObj BUK_VOCIECONBOOK;
  OBook BKW_VOCIECONBOOK;
  //
  // Template Pages constants
  private static int BUK_VOCIECONBOOK_MST_VOCECOBOOPAG = 1;
  private static int BUK_VOCIECONBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_VOCIECONBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_VOCIECONBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_VOCIECONBOOK_RPTBOX_PAGEBODY = 5;

  //
  // Reports constants
  private static int BUK_VOCIECONBOOK_RPT_NEWREPORT = 6;
  private static int BUK_VOCIECONBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_VOCIECONBOOK_SEC_PAGEHEADER = 8;
  private static int BUK_VOCIECONBOOK_RPTBOX_ESHEADER = 9;
  private static int BUK_VOCIECONBOOK_SPAN_ENTRATOSPESA = 10;
  private static int BUK_VOCIECONBOOK_RPTBOX_CODICEHEADER = 11;
  private static int BUK_VOCIECONBOOK_SPAN_CODICE = 12;
  private static int BUK_VOCIECONBOOK_RPTBOX_DESCRIHEADER = 13;
  private static int BUK_VOCIECONBOOK_SPAN_DESCRIZIONE = 14;
  private static int BUK_VOCIECONBOOK_SEC_TITOLO = 15;
  private static int BUK_VOCIECONBOOK_RPTBOX_TITOLO2 = 16;
  private static int BUK_VOCIECONBOOK_SPAN_FUNZIOESERVI = 17;
  private static int BUK_VOCIECONBOOK_SEC_DETAIL = 18;
  private static int BUK_VOCIECONBOOK_RPTBOX_ES = 19;
  private static int BUK_VOCIECONBOOK_SPAN_VOECEOSVEVEB = 20;
  private static int BUK_VOCIECONBOOK_RPTBOX_CODICE = 21;
  private static int BUK_VOCIECONBOOK_SPAN_VOECCOVOEVEB = 22;
  private static int BUK_VOCIECONBOOK_RPTBOX_DESCRIZIONE = 23;
  private static int BUK_VOCIECONBOOK_SPAN_VOECDEVOEVEB = 24;
  private static int BUK_VOCIECONBOOK_SEC_PAGEFOOTER = 25;
  private static int BUK_VOCIECONBOOK_SEC_REPORTFOOTER = 26;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_VOCIECONOMI5(IMDB);
    Init_PQRY_VOCIECONOMI3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_VOCIECONOMI5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_VOCIECONOMI5, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_VOCIECONOMI5, "PQRY_VOCIECONOMI5");
    IMDB.set_FldCode(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_VOCIECONOMI5,IMDBDef9.PQSL_VOCIECONOMI5_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_VOCIECONOMI5, 0);
  }

  private static void Init_PQRY_VOCIECONOMI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_VOCIECONOMI3, 3);
    IMDB.set_TblCode(IMDBDef9.PQRY_VOCIECONOMI3, "PQRY_VOCIECONOMI3");
    IMDB.set_FldCode(IMDBDef9.PQRY_VOCIECONOMI3,IMDBDef9.PQSL_VOCIECONOMI3_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef9.PQRY_VOCIECONOMI3,IMDBDef9.PQSL_VOCIECONOMI3_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VOCIECONOMI3,IMDBDef9.PQSL_VOCIECONOMI3_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_VOCIECONOMI3,IMDBDef9.PQSL_VOCIECONOMI3_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VOCIECONOMI3,IMDBDef9.PQSL_VOCIECONOMI3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_VOCIECONOMI3,IMDBDef9.PQSL_VOCIECONOMI3_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_VOCIECONOMI3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VociEcon(MyWebEntryPoint w, IMDBObj imdb)
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
  public VociEcon()
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
    FormIdx = MyGlb.FRM_VOCIECON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EB0775EE-ACF0-4952-9FDB-D89E2A9BDAA8";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 764;
    DesignHeight = 454;
    set_Caption(new IDVariant("Voci Econ"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 764;
    Frames[1].Height = 428;
    Frames[1].Caption = "Voci Economiche";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 428;
    PAN_VOCIECONOMIC = new IDPanel(w, this, 1, "PAN_VOCIECONOMIC");
    Frames[1].Content = PAN_VOCIECONOMIC;
    PAN_VOCIECONOMIC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VOCIECONOMIC.VS = MainFrm.VisualStyleList;
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 764-MyGlb.PAN_OFFS_X, 428-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_VOCIECONBOOK != null)
      PAN_VOCIECONOMIC.SetBook(BUK_VOCIECONBOOK);
    PAN_VOCIECONOMIC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D8B89B99-1E83-444E-90FF-AE2EA249B156");
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 712, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VOCIECONOMIC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VOCIECONOMIC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VOCIECONOMIC.InitStatus = 2;
    PAN_VOCIECONOMIC_Init();
    PAN_VOCIECONOMIC_InitFields();
    PAN_VOCIECONOMIC_InitQueries();
    BKW_VOCIECONBOOK = new OBook(this);
    BUK_VOCIECONBOOK = new CIDREObj(BKW_VOCIECONBOOK);
    BKW_VOCIECONBOOK.iGuid = "1F3309EE-EF3C-42F9-8745-4B98AC34326D";
    BKW_VOCIECONBOOK.Code = "BUK_VOCIECONBOOK";
    BKW_VOCIECONBOOK.BookObj = BUK_VOCIECONBOOK;
    BKW_VOCIECONBOOK.InitDefMasks();
    BUK_VOCIECONBOOK.InitBook(1, 1245185, "Voci Economiche Book", IMDB, MainFrm.VisualStyleList);
    BUK_VOCIECONBOOK.InitHTML();
    BUK_VOCIECONBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_VOCIECONBOOK.Book.SetMainFrm(MainFrm);
    BUK_VOCIECONBOOK.SetRTCGuid(0, "1F3309EE-EF3C-42F9-8745-4B98AC34326D");
    BUK_VOCIECONBOOK.SetObjCode(0, "VOCIECONBOOK");
    if (PAN_VOCIECONOMIC != null)
      PAN_VOCIECONOMIC.SetBook(BUK_VOCIECONBOOK);
    BUK_VOCIECONBOOK_MST_VOCECOBOOPAG_Init();
    BUK_VOCIECONBOOK_RPT_NEWREPORT_Init();
    BUK_VOCIECONBOOK_InitLinks();
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
      PAN_VOCIECONOMIC.UpdatePanel(MainFrm);
      // BUK_VOCIECONBOOK.UpdateBook();
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
    if (Code.equals("BUK_VOCIECONBOOK")) return BUK_VOCIECONBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof VociEcon);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VociEcon.class.getName() : (Glb.ClassWithPackage(VociEcon.class) ? VociEcon.class.getName().substring(VociEcon.class.getPackage().getName().length() + 1) : VociEcon.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Voci Economiche On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VOCIECONOMIC_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VOCIECONOMIC);
      // 
      // Voci Economiche On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_VOCIECONOMIC.IsNewRow())
      {
        PAN_VOCIECONOMIC.SetFlags (Glb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VOCIECONOMIC.SetFlags (Glb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VOCIECONOMIC.SetFlags (Glb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VOCIECONOMIC.SetFlags (Glb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_VOCIECONOMIC.set_ToolTip(Glb.OBJ_FIELD,PFL_VOCIECONOMIC_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_VOCIECONOMI5, IMDBDef9.PQSL_VOCIECONOMI5_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociEcon", "VociEconomicheOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Voci Economiche On Database Error Event
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
  private void PAN_VOCIECONOMIC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_VOCIECONOMIC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Voci Economiche On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociEcon", "VociEconomicheOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Voci Economiche On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VOCIECONOMIC_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Voci Economiche On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_VOCIECONOMI5, IMDBDef9.PQSL_VOCIECONOMI5_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_VOCIECONOMI5, IMDBDef9.PQSL_VOCIECONOMI5_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_VOCIECONOMI5, IMDBDef9.PQSL_VOCIECONOMI5_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_VOCIECONOMI5, IMDBDef9.PQSL_VOCIECONOMI5_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_VOCIECONOMI5, IMDBDef9.PQSL_VOCIECONOMI5_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_VOCIECONOMI5, IMDBDef9.PQSL_VOCIECONOMI5_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociEcon", "VociEconomicheOnUpdatingRowEvent", _e);
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
      v_CAPTION = (new IDVariant("Voci Economiche", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociEcon", "LoadEvent", _e);
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
  private void PAN_VOCIECONOMIC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VOCIECONOMIC, Cancel);
    // Stub
  }

  private void PAN_VOCIECONOMIC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VOCIECONOMIC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VOCIECONOMIC_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VOCIECONOMIC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VOCIECONOMIC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_VOCIECONBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_VOCIECONBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_VOCIECONBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_VOCIECONBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_VOCIECONBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_VOCIECONBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_VOCIECONBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_VOCIECONBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_VOCIECONBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_VOCIECONBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_VOCIECONBOOK_MST_VOCECOBOOPAG)
    {
      BUK_VOCIECONBOOK.set_SpanValue(BUK_VOCIECONBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_VOCIECONBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_VOCIECONBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_VOCIECONBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_VOCIECONBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_VOCIECONBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_VOCIECONBOOK_OnPreview()
  {
    PreviewBook = BKW_VOCIECONBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VOCIECONOMIC_Init()
  {

    PAN_VOCIECONOMIC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VOCIECONOMIC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VOCIECONOMIC.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_VOCIECONOMIC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, "8AD2CA59-9DCB-4859-BC10-C076B9C11B24");
    PAN_VOCIECONOMIC.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, "Entrata o Spesa");
    PAN_VOCIECONOMIC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, "");
    PAN_VOCIECONOMIC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCIECONOMIC.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_VOCIECONOMIC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, "95324601-BFBD-413A-B7A3-C83D4759E99A");
    PAN_VOCIECONOMIC.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, "Codice");
    PAN_VOCIECONOMIC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, "");
    PAN_VOCIECONOMIC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCIECONOMIC.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_VOCIECONOMIC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, "F17B57CE-2DE1-464D-B187-B52A8FFD410D");
    PAN_VOCIECONOMIC.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, "Descrizione");
    PAN_VOCIECONOMIC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, "");
    PAN_VOCIECONOMIC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCIECONOMIC.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCIECONOMIC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, "6E4E60C8-B8BF-45E7-A3F0-35C142826612");
    PAN_VOCIECONOMIC.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_VOCIECONOMIC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, "");
    PAN_VOCIECONOMIC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_VOCIECONOMIC.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCIECONOMIC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, "99336023-FD4B-4ADD-BACD-893DE482AA43");
    PAN_VOCIECONOMIC.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, "DATA INSERIMENTO");
    PAN_VOCIECONOMIC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, "");
    PAN_VOCIECONOMIC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_VOCIECONOMIC.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCIECONOMIC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, "350058CC-FDC8-433E-A7C0-74A956C25EE9");
    PAN_VOCIECONOMIC.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_VOCIECONOMIC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, "");
    PAN_VOCIECONOMIC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_VOCIECONOMIC.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VOCIECONOMIC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, "CFA5359A-AA17-432A-BF1F-314C3754E857");
    PAN_VOCIECONOMIC.set_Header(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_VOCIECONOMIC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, "");
    PAN_VOCIECONOMIC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_VOCIECONOMIC.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VOCIECONOMIC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, MyGlb.PANEL_LIST, 24);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, MyGlb.PANEL_LIST, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, MyGlb.PANEL_LIST, "Entrata o Spesa");
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, MyGlb.PANEL_FORM, 88);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, MyGlb.PANEL_FORM, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_ENTRATOSPESA, MyGlb.PANEL_FORM, "Entr. o Spesa");
    PAN_VOCIECONOMIC.SetFieldPage(PFL_VOCIECONOMIC_ENTRATOSPESA, -1, -1);
    PAN_VOCIECONOMIC.SetFieldPanel(PFL_VOCIECONOMIC_ENTRATOSPESA, PPQRY_VOCIECONOMI5, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_VOCIECONOMIC.SetValueListItem(PFL_VOCIECONOMIC_ENTRATOSPESA, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_VOCIECONOMIC.SetValueListItem(PFL_VOCIECONOMIC_ENTRATOSPESA, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, MyGlb.PANEL_LIST, 64, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, MyGlb.PANEL_FORM, 4, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VOCIECONOMIC.SetFieldPage(PFL_VOCIECONOMIC_CODICE, -1, -1);
    PAN_VOCIECONOMIC.SetFieldPanel(PFL_VOCIECONOMIC_CODICE, PPQRY_VOCIECONOMI5, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, MyGlb.PANEL_LIST, 116, 36, 596, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VOCIECONOMIC.SetFieldPage(PFL_VOCIECONOMIC_DESCRIZIONE, -1, -1);
    PAN_VOCIECONOMIC.SetFieldPanel(PFL_VOCIECONOMIC_DESCRIZIONE, PPQRY_VOCIECONOMI5, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, MyGlb.PANEL_LIST, 130, 248, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSERIMENTO");
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 88, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_VOCIECONOMIC.SetFieldPage(PFL_VOCIECONOMIC_UTENTEINSERI, -1, -1);
    PAN_VOCIECONOMIC.SetFieldPanel(PFL_VOCIECONOMIC_UTENTEINSERI, PPQRY_VOCIECONOMI5, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, MyGlb.PANEL_LIST, 378, 248, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, MyGlb.PANEL_FORM, 4, 112, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_VOCIECONOMIC.SetFieldPage(PFL_VOCIECONOMIC_DATAINSERIME, -1, -1);
    PAN_VOCIECONOMIC.SetFieldPanel(PFL_VOCIECONOMIC_DATAINSERIME, PPQRY_VOCIECONOMI5, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, MyGlb.PANEL_LIST, -10, 272, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 136, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_VOCIECONOMIC.SetFieldPage(PFL_VOCIECONOMIC_UTENTULTIAGG, -1, -1);
    PAN_VOCIECONOMIC.SetFieldPanel(PFL_VOCIECONOMIC_UTENTULTIAGG, PPQRY_VOCIECONOMI5, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, MyGlb.PANEL_LIST, 250, 276, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_VOCIECONOMIC.SetRect(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 160, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCIECONOMIC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_VOCIECONOMIC.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_VOCIECONOMIC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCIECONOMIC_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_VOCIECONOMIC.SetFieldPage(PFL_VOCIECONOMIC_DATAULTIMAGG, -1, -1);
    PAN_VOCIECONOMIC.SetFieldPanel(PFL_VOCIECONOMIC_DATAULTIMAGG, PPQRY_VOCIECONOMI5, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_VOCIECONOMIC_InitQueries()
  {
    StringBuffer SQL;

    PAN_VOCIECONOMIC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VOCIECONOMIC.SetIMDB(IMDB, "PQRY_VOCIECONOMI5", true);
    PAN_VOCIECONOMIC.set_SetString(MyGlb.MASTER_ROWNAME, "VOCI ECONOMICHE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_VOCIECONOMIC.SetQuery(PPQRY_VOCIECONOMI5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VOCI_ECONOMICHE A ");
    PAN_VOCIECONOMIC.SetQuery(PPQRY_VOCIECONOMI5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCIECONOMIC.SetQuery(PPQRY_VOCIECONOMI5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCIECONOMIC.SetQuery(PPQRY_VOCIECONOMI5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCIECONOMIC.SetQuery(PPQRY_VOCIECONOMI5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CODICE ");
    PAN_VOCIECONOMIC.SetQuery(PPQRY_VOCIECONOMI5, 5, SQL, -1, "");
    PAN_VOCIECONOMIC.SetQueryDB(PPQRY_VOCIECONOMI5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VOCIECONOMIC.SetMasterTable(0, "VOCI_ECONOMICHE");
    PAN_VOCIECONOMIC.AddToSortList(PFL_VOCIECONOMIC_ENTRATOSPESA, true);
    PAN_VOCIECONOMIC.AddToSortList(PFL_VOCIECONOMIC_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VOCIECONOMIC.Status() == 2)
    {
      int oldListQBE = PAN_VOCIECONOMIC.iUseListQBE;
      PAN_VOCIECONOMIC.iUseListQBE = 0;
      PAN_VOCIECONOMIC.PanelCommand(Glb.PCM_SEARCH);
      PAN_VOCIECONOMIC.PanelCommand(Glb.PCM_FIND);
      PAN_VOCIECONOMIC.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_VOCIECONBOOK_MST_VOCECOBOOPAG_Init()
  {
    BUK_VOCIECONBOOK.InitMastro(BUK_VOCIECONBOOK_MST_VOCECOBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_MST_VOCECOBOOPAG, "4CAB9136-60C2-4FDC-810E-43B66094BBC5");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_MST_VOCECOBOOPAG, "VOCECOBOOPAG");
    BUK_VOCIECONBOOK.InitMastroBox(BUK_VOCIECONBOOK_MST_VOCECOBOOPAG, BUK_VOCIECONBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_RPTBOX_NUMEROPAGINA, "2F89DC9A-58CE-4F16-8A80-7E799F43D964");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_VOCIECONBOOK.InitBoxSpan(BUK_VOCIECONBOOK_RPTBOX_NUMEROPAGINA, BUK_VOCIECONBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SPAN_NUMEROPAGINA, "F8807936-2469-4E37-8B83-1F0185274C46");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_VOCIECONBOOK.InitMastroBox(BUK_VOCIECONBOOK_MST_VOCECOBOOPAG, BUK_VOCIECONBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 1000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_RPTBOX_PAGEHEADER, "E2C6CA22-ABD6-4771-B72E-FFA65BB0D468");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_VOCIECONBOOK.InitMastroBox(BUK_VOCIECONBOOK_MST_VOCECOBOOPAG, BUK_VOCIECONBOOK_RPTBOX_PAGEBODY, 1000, 2200, 19000, 26500, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_RPTBOX_PAGEBODY, "222149B3-1BCB-479E-9C34-A9F638520391");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_VOCIECONBOOK_RPT_NEWREPORT_InitQuery() { BUK_VOCIECONBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_VOCIECONBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  VOCI_ECONOMICHE A ");
      SQL.append("order by ");
      SQL.append("  A.E_S, ");
      SQL.append("  A.CODICE ");
      BUK_VOCIECONBOOK.SetReportQuery(BUK_VOCIECONBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "140877D8-BF4F-4265-B9DE-2E3B5F247C98");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_VOCIECONBOOK_RPT_NEWREPORT_Init()
  {
    BUK_VOCIECONBOOK.InitReport(BUK_VOCIECONBOOK_RPT_NEWREPORT, 196609);
    BUK_VOCIECONBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_RPT_NEWREPORT, "F28B6731-68B4-4F65-85C5-1C78887A9561");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_VOCIECONBOOK.InitSection(BUK_VOCIECONBOOK_RPT_NEWREPORT, BUK_VOCIECONBOOK_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VOCIECONBOOK.SetSectionRendersInto(BUK_VOCIECONBOOK_SEC_REPORTHEADER, BUK_VOCIECONBOOK_RPTBOX_PAGEBODY);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SEC_REPORTHEADER, "75EAC52F-A044-4021-9D04-05091093BFD9");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_VOCIECONBOOK.InitSection(BUK_VOCIECONBOOK_RPT_NEWREPORT, BUK_VOCIECONBOOK_SEC_PAGEHEADER, 600, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VOCIECONBOOK.SetSectionRendersInto(BUK_VOCIECONBOOK_SEC_PAGEHEADER, BUK_VOCIECONBOOK_RPTBOX_PAGEBODY);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SEC_PAGEHEADER, "A8F11697-A288-4459-8A84-E50A570FA700");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_VOCIECONBOOK.InitReportBox(BUK_VOCIECONBOOK_SEC_PAGEHEADER, BUK_VOCIECONBOOK_RPTBOX_ESHEADER, 0, 0, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_RPTBOX_ESHEADER, "515A45BF-2942-4709-9BD2-57C7AD7E14B0");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_RPTBOX_ESHEADER, "ESHEADER");
    BUK_VOCIECONBOOK.InitBoxSpan(BUK_VOCIECONBOOK_RPTBOX_ESHEADER, BUK_VOCIECONBOOK_SPAN_ENTRATOSPESA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Entrata o Spesa", 1);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SPAN_ENTRATOSPESA, "16EC0FE7-ED73-48C1-905C-24EA70AAA8A2");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SPAN_ENTRATOSPESA, "ENTRATOSPESA");
    BUK_VOCIECONBOOK.InitReportBox(BUK_VOCIECONBOOK_SEC_PAGEHEADER, BUK_VOCIECONBOOK_RPTBOX_CODICEHEADER, 2831, 0, 1507, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_RPTBOX_CODICEHEADER, "66AF3388-55F4-443B-80B4-EB19641F0F9C");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_VOCIECONBOOK.InitBoxSpan(BUK_VOCIECONBOOK_RPTBOX_CODICEHEADER, BUK_VOCIECONBOOK_SPAN_CODICE, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SPAN_CODICE, "553A0CE1-8329-4811-A08C-74B8411A4080");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SPAN_CODICE, "CODICE");
    BUK_VOCIECONBOOK.InitReportBox(BUK_VOCIECONBOOK_SEC_PAGEHEADER, BUK_VOCIECONBOOK_RPTBOX_DESCRIHEADER, 4469, 0, 14531, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_RPTBOX_DESCRIHEADER, "C6064DC2-60C5-4AC9-8F7C-ABEA6EEABDF7");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_VOCIECONBOOK.InitBoxSpan(BUK_VOCIECONBOOK_RPTBOX_DESCRIHEADER, BUK_VOCIECONBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SPAN_DESCRIZIONE, "CE85EA09-CA27-4340-9846-1B6B419369C5");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_VOCIECONBOOK.InitSection(BUK_VOCIECONBOOK_RPT_NEWREPORT, BUK_VOCIECONBOOK_SEC_TITOLO, 1100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_VOCIECONBOOK.SetSectionRendersInto(BUK_VOCIECONBOOK_SEC_TITOLO, BUK_VOCIECONBOOK_RPTBOX_PAGEHEADER);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SEC_TITOLO, "B80F18A2-AE91-4429-AD89-9E46D90F3E82");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SEC_TITOLO, "TITOLO");
    BUK_VOCIECONBOOK.InitReportBox(BUK_VOCIECONBOOK_SEC_TITOLO, BUK_VOCIECONBOOK_RPTBOX_TITOLO2, 0, 0, 19000, 900, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_RPTBOX_TITOLO2, "055CD5F8-5048-4500-8788-7C9E56606DCE");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_RPTBOX_TITOLO2, "TITOLO2");
    BUK_VOCIECONBOOK.InitBoxSpan(BUK_VOCIECONBOOK_RPTBOX_TITOLO2, BUK_VOCIECONBOOK_SPAN_FUNZIOESERVI, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Voci Economiche", 1);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SPAN_FUNZIOESERVI, "53F03F28-A628-420D-BAAE-89C07E945B93");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SPAN_FUNZIOESERVI, "FUNZIOESERVI");
    BUK_VOCIECONBOOK.InitSection(BUK_VOCIECONBOOK_RPT_NEWREPORT, BUK_VOCIECONBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VOCIECONBOOK.SetSectionRendersInto(BUK_VOCIECONBOOK_SEC_DETAIL, BUK_VOCIECONBOOK_RPTBOX_PAGEBODY);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SEC_DETAIL, "EC4145AF-F425-4394-B547-8BF3E3EC5F3C");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SEC_DETAIL, "DETAIL");
    BUK_VOCIECONBOOK.InitReportBox(BUK_VOCIECONBOOK_SEC_DETAIL, BUK_VOCIECONBOOK_RPTBOX_ES, 0, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_RPTBOX_ES, "54FA4B8B-FAB1-4E87-B1D4-C2A6F5F0026B");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_RPTBOX_ES, "ES");
    BUK_VOCIECONBOOK.InitBoxSpan(BUK_VOCIECONBOOK_RPTBOX_ES, BUK_VOCIECONBOOK_SPAN_VOECEOSVEVEB, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::E_S", 1);
    BUK_VOCIECONBOOK.SetSpanValueListItem(BUK_VOCIECONBOOK_SPAN_VOECEOSVEVEB, "Entrata", "Parte Entrata", (new IDVariant("E")), null, "", -1);
    BUK_VOCIECONBOOK.SetSpanValueListItem(BUK_VOCIECONBOOK_SPAN_VOECEOSVEVEB, "Spesa", "Parte Spesa", (new IDVariant("S")), null, "", -1);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SPAN_VOECEOSVEVEB, "415506FC-86DC-4192-A242-4ADE231CAD31");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SPAN_VOECEOSVEVEB, "VOECEOSVEVEB");
    BUK_VOCIECONBOOK.InitReportBox(BUK_VOCIECONBOOK_SEC_DETAIL, BUK_VOCIECONBOOK_RPTBOX_CODICE, 2800, 0, 1507, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_RPTBOX_CODICE, "691AC0AD-C6E9-4115-A30D-DA106A9C7BC3");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_RPTBOX_CODICE, "CODICE");
    BUK_VOCIECONBOOK.InitBoxSpan(BUK_VOCIECONBOOK_RPTBOX_CODICE, BUK_VOCIECONBOOK_SPAN_VOECCOVOEVEB, MyGlb.VIS_CAMSENBORCEN, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SPAN_VOECCOVOEVEB, "F2E6233C-23C8-4355-BC56-667843FDC6EC");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SPAN_VOECCOVOEVEB, "VOECCOVOEVEB");
    BUK_VOCIECONBOOK.InitReportBox(BUK_VOCIECONBOOK_SEC_DETAIL, BUK_VOCIECONBOOK_RPTBOX_DESCRIZIONE, 4469, 0, 14531, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_RPTBOX_DESCRIZIONE, "B78D4C27-ADE0-4662-8B1C-ADA30E3FBA51");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_VOCIECONBOOK.InitBoxSpan(BUK_VOCIECONBOOK_RPTBOX_DESCRIZIONE, BUK_VOCIECONBOOK_SPAN_VOECDEVOEVEB, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SPAN_VOECDEVOEVEB, "1B7D39E3-FDAB-4A3A-9C9B-60879DAED38C");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SPAN_VOECDEVOEVEB, "VOECDEVOEVEB");
    BUK_VOCIECONBOOK.InitSection(BUK_VOCIECONBOOK_RPT_NEWREPORT, BUK_VOCIECONBOOK_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_VOCIECONBOOK.SetSectionRendersInto(BUK_VOCIECONBOOK_SEC_PAGEFOOTER, BUK_VOCIECONBOOK_RPTBOX_PAGEBODY);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SEC_PAGEFOOTER, "D887A54E-F435-4BAB-B3AE-910A745A9332");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_VOCIECONBOOK.InitSection(BUK_VOCIECONBOOK_RPT_NEWREPORT, BUK_VOCIECONBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_VOCIECONBOOK.SetSectionRendersInto(BUK_VOCIECONBOOK_SEC_REPORTFOOTER, BUK_VOCIECONBOOK_RPTBOX_PAGEBODY);
    BUK_VOCIECONBOOK.SetRTCGuid(BUK_VOCIECONBOOK_SEC_REPORTFOOTER, "C421A529-2328-46E3-A4A0-D4378A66AE21");
    BUK_VOCIECONBOOK.SetObjCode(BUK_VOCIECONBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_VOCIECONBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_VOCIECONBOOK_InitLinks()
  {
    BUK_VOCIECONBOOK.SetBoxNextBox(BUK_VOCIECONBOOK_RPTBOX_PAGEBODY, BUK_VOCIECONBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VOCIECONOMIC) PAN_VOCIECONOMIC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VOCIECONOMIC) PAN_VOCIECONOMIC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VOCIECONOMIC) PAN_VOCIECONOMIC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VOCIECONOMIC) PAN_VOCIECONOMIC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VOCIECONOMIC) PAN_VOCIECONOMIC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_VOCIECONBOOK) BUK_VOCIECONBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_VOCIECONBOOK) BUK_VOCIECONBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_VOCIECONBOOK) BUK_VOCIECONBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_VOCIECONBOOK) BUK_VOCIECONBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_VOCIECONBOOK) BUK_VOCIECONBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_VOCIECONBOOK) BUK_VOCIECONBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_VOCIECONBOOK) BUK_VOCIECONBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_VOCIECONBOOK) BUK_VOCIECONBOOK_OnPreview();
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
