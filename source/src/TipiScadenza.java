// **********************************************
// Tipi Scadenza
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiScadenza extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPISCADENZA_CODICE = 0;
  private static int PFL_TIPISCADENZA_DESCRIZIONE = 1;
  private static int PFL_TIPISCADENZA_NUMGIORNI = 2;
  private static int PFL_TIPISCADENZA_DECORRENZA1 = 3;
  private static int PFL_TIPISCADENZA_DECORRENZA2 = 4;
  private static int PFL_TIPISCADENZA_PREVALENTE = 5;
  private static int PFL_TIPISCADENZA_PERSONALE = 6;
  private static int PFL_TIPISCADENZA_DECORRENZA = 7;
  private static int PFL_TIPISCADENZA_UTENTEINSERI = 8;
  private static int PFL_TIPISCADENZA_DATAINSERIME = 9;
  private static int PFL_TIPISCADENZA_UTENTULTIAGG = 10;
  private static int PFL_TIPISCADENZA_DATAULTIMAGG = 11;

  private static int PPQRY_T2 = 0;


  IDPanel PAN_TIPISCADENZA;
  CIDREObj BUK_TIPISCADBOOK;
  OBook BKW_TIPISCADBOOK;
  //
  // Template Pages constants
  private static int BUK_TIPISCADBOOK_MST_TIPSCABOOPAG = 1;
  private static int BUK_TIPISCADBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_TIPISCADBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_TIPISCADBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_TIPISCADBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_TIPISCADBOOK_RPT_NEWREPORT = 6;
  private static int BUK_TIPISCADBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_TIPISCADBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_TIPISCADBOOK_SPAN_CODICE = 9;
  private static int BUK_TIPISCADBOOK_RPTBOX_DESCRIHEADER = 10;
  private static int BUK_TIPISCADBOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_TIPISCADBOOK_RPTBOX_NUMGIORNHEAD = 12;
  private static int BUK_TIPISCADBOOK_SPAN_NUMGIORNI = 13;
  private static int BUK_TIPISCADBOOK_SEC_TITOLO = 14;
  private static int BUK_TIPISCADBOOK_RPTBOX_NEWBOX = 15;
  private static int BUK_TIPISCADBOOK_SPAN_VARIADIBILAN = 16;
  private static int BUK_TIPISCADBOOK_SEC_DETAIL = 17;
  private static int BUK_TIPISCADBOOK_RPTBOX_CODICE = 18;
  private static int BUK_TIPISCADBOOK_SPAN_T0COTISCTISB = 19;
  private static int BUK_TIPISCADBOOK_RPTBOX_DESCRIZIONE = 20;
  private static int BUK_TIPISCADBOOK_SPAN_T0DETISCTIS1 = 21;
  private static int BUK_TIPISCADBOOK_RPTBOX_NUMGIORNI = 22;
  private static int BUK_TIPISCADBOOK_SPAN_T0NUGITISTSB = 23;
  private static int BUK_TIPISCADBOOK_RPTBOX_DECORRENZA1 = 24;
  private static int BUK_TIPISCADBOOK_SPAN_T0DETISCTIS2 = 25;
  private static int BUK_TIPISCADBOOK_RPTBOX_DECORRENZA2 = 26;
  private static int BUK_TIPISCADBOOK_SPAN_T0DETISCTISB = 27;
  private static int BUK_TIPISCADBOOK_SEC_REPORTFOOTER = 28;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T2(IMDB);
    Init_PQRY_T01(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T2, 11);
    IMDB.set_TblCode(IMDBDef9.PQRY_T2, "PQRY_T2");
    IMDB.set_FldCode(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_DESCRIZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_NUM_GIORNI, "NUM_GIORNI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_NUM_GIORNI,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_DECORRENZA1, "DECORRENZA1");
    IMDB.SetFldParams(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_DECORRENZA1,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_DECORRENZA2, "DECORRENZA2");
    IMDB.SetFldParams(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_DECORRENZA2,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_PREVALENTE, "PREVALENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_PREVALENTE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_SE_PERSONALE, "SE_PERSONALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_SE_PERSONALE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T2,IMDBDef9.PQSL_T2_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T2, 0);
  }

  private static void Init_PQRY_T01(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T01, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_T01, "PQRY_T01");
    IMDB.set_FldCode(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_DESCRIZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_NUM_GIORNI, "NUM_GIORNI");
    IMDB.SetFldParams(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_NUM_GIORNI,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_DECORRENZA1, "DECORRENZA1");
    IMDB.SetFldParams(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_DECORRENZA1,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_DECORRENZA2, "DECORRENZA2");
    IMDB.SetFldParams(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_DECORRENZA2,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_PREVALENTE, "PREVALENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_PREVALENTE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_SE_PERSONALE, "SE_PERSONALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T01,IMDBDef9.PQSL_T01_SE_PERSONALE,5,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T01, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiScadenza(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiScadenza()
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
    FormIdx = MyGlb.FRM_TIPISCADENZA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8D15DA7C-6E8E-43F9-87E7-4F4B2A1B6D2B";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 756;
    DesignHeight = 386;
    set_Caption(new IDVariant("Tipi Scadenza"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 756;
    Frames[1].Height = 360;
    Frames[1].Caption = "Tipi Scadenza";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_TIPISCADENZA = new IDPanel(w, this, 1, "PAN_TIPISCADENZA");
    Frames[1].Content = PAN_TIPISCADENZA;
    PAN_TIPISCADENZA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPISCADENZA.VS = MainFrm.VisualStyleList;
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 756-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_TIPISCADBOOK != null)
      PAN_TIPISCADENZA.SetBook(BUK_TIPISCADBOOK);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7B38EDAF-5924-4BD6-B8B4-A11526F9E2C0");
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 716, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPISCADENZA.InitStatus = 2;
    PAN_TIPISCADENZA_Init();
    PAN_TIPISCADENZA_InitFields();
    PAN_TIPISCADENZA_InitQueries();
    BKW_TIPISCADBOOK = new OBook(this);
    BUK_TIPISCADBOOK = new CIDREObj(BKW_TIPISCADBOOK);
    BKW_TIPISCADBOOK.iGuid = "98BC30B6-B0FD-485A-AF6C-B8F30AA4D8D2";
    BKW_TIPISCADBOOK.Code = "BUK_TIPISCADBOOK";
    BKW_TIPISCADBOOK.BookObj = BUK_TIPISCADBOOK;
    BKW_TIPISCADBOOK.InitDefMasks();
    BUK_TIPISCADBOOK.InitBook(1, 1245185, "Tipi Scadenza Book", IMDB, MainFrm.VisualStyleList);
    BUK_TIPISCADBOOK.InitHTML();
    BUK_TIPISCADBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_TIPISCADBOOK.Book.SetMainFrm(MainFrm);
    BUK_TIPISCADBOOK.SetRTCGuid(0, "98BC30B6-B0FD-485A-AF6C-B8F30AA4D8D2");
    BUK_TIPISCADBOOK.SetObjCode(0, "TIPISCADBOOK");
    if (PAN_TIPISCADENZA != null)
      PAN_TIPISCADENZA.SetBook(BUK_TIPISCADBOOK);
    BUK_TIPISCADBOOK_MST_TIPSCABOOPAG_Init();
    BUK_TIPISCADBOOK_RPT_NEWREPORT_Init();
    BUK_TIPISCADBOOK_InitLinks();
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
      PAN_TIPISCADENZA.UpdatePanel(MainFrm);
      // BUK_TIPISCADBOOK.UpdateBook();
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
    if (Code.equals("BUK_TIPISCADBOOK")) return BUK_TIPISCADBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof TipiScadenza);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiScadenza.class.getName() : (Glb.ClassWithPackage(TipiScadenza.class) ? TipiScadenza.class.getName().substring(TipiScadenza.class.getPackage().getName().length() + 1) : TipiScadenza.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tipi Scadenza On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPISCADENZA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPISCADENZA);
      // 
      // Tipi Scadenza On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_TIPISCADENZA.IsNewRow()))
      {
        PAN_TIPISCADENZA.SetFlags (Glb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPISCADENZA.SetFlags (Glb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_TIPISCADENZA.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPISCADENZA_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiScadenza", "TipiScadenzaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Scadenza On Database Error Event
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
  private void PAN_TIPISCADENZA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_TIPISCADENZA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Tipi Scadenza On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiScadenza", "TipiScadenzaOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Scadenza On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_TIPISCADENZA_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Scadenza On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T01PD(IMDB.Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_CODICE, 0));
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
      MainFrm.ErrObj.ProcError ("TipiScadenza", "TipiScadenzaOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Scadenza On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_TIPISCADENZA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Scadenza On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_DATA_INSERIMENTO, 0, IDL.Today());
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_UTENTE_ULTIMO_AGG, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_DATA_ULTIMO_AGG, 0))))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_DATA_ULTIMO_AGG, 0, (new IDVariant()));
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IMDB.Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiScadenza", "TipiScadenzaOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Scadenza After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_TIPISCADENZA_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Scadenza After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_TIPISCADENZA.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiScadenza", "TipiScadenzaAfterCommitEvent", _e);
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
      MainFrm.ErrObj.ProcError ("TipiScadenza", "LoadEvent", _e);
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
  private void PAN_TIPISCADENZA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPISCADENZA, Cancel);
    // Stub
  }

  private void PAN_TIPISCADENZA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPISCADENZA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_TIPISCADENZA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_TIPISCADENZA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_DECORRENZA1, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T2, IMDBDef9.PQSL_T2_DECORRENZA1, 0, (new IDVariant("P")));
      }
      if (Cancel.isFalse())
      {
        PAN_TIPISCADENZA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_TIPISCADBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_TIPISCADBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_TIPISCADBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_TIPISCADBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_TIPISCADBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_TIPISCADBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_TIPISCADBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_TIPISCADBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_TIPISCADBOOK_MST_TIPSCABOOPAG)
    {
      BUK_TIPISCADBOOK.set_SpanValue(BUK_TIPISCADBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPISCADBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPISCADBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_TIPISCADBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_TIPISCADBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_TIPISCADBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_TIPISCADBOOK_OnPreview()
  {
    PreviewBook = BKW_TIPISCADBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPISCADENZA_Init()
  {

    PAN_TIPISCADENZA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPISCADENZA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPISCADENZA.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, "FA3F1F77-3544-4DB6-99C5-89C7F6D99A35");
    PAN_TIPISCADENZA.set_Header(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, "Codice");
    PAN_TIPISCADENZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, "");
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, "226AFBED-4359-44F2-9CB4-393E7970A63F");
    PAN_TIPISCADENZA.set_Header(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, "Descrizione");
    PAN_TIPISCADENZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, "");
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, "6E22B25A-5102-4F97-ACC0-7E3832E18A56");
    PAN_TIPISCADENZA.set_Header(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, "NUM GIORNI");
    PAN_TIPISCADENZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, "");
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, "E79282C2-45F7-49CD-BDF5-7F4EF20F78C1");
    PAN_TIPISCADENZA.set_Header(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, "DECORRENZA1");
    PAN_TIPISCADENZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, "");
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, "EB341132-8821-4607-90AC-84EEA95BA5BF");
    PAN_TIPISCADENZA.set_Header(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, "DECORRENZA2");
    PAN_TIPISCADENZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, "");
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, "EFB24B8B-D6EC-4A12-ABC5-ACB1D21B4B6A");
    PAN_TIPISCADENZA.set_Header(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, "Prevalente");
    PAN_TIPISCADENZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, "");
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, "27962247-EF75-4D2C-8CF3-61599BDF2CD1");
    PAN_TIPISCADENZA.set_Header(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, "Personale");
    PAN_TIPISCADENZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, "");
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA, "15603B45-7DD1-43FA-865F-93DB92C102B5");
    PAN_TIPISCADENZA.set_Header(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA, "Decorrenza");
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA, MyGlb.VIS_LABEVISUSTYL);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, "8AE58687-D75E-46F2-9D33-81431B0AC8EB");
    PAN_TIPISCADENZA.set_Header(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_TIPISCADENZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, "");
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, "A37B4297-DECD-4F2D-99B1-629A33381C14");
    PAN_TIPISCADENZA.set_Header(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, "DATA INSERIMENTO");
    PAN_TIPISCADENZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, "");
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, "DC38E8C6-9665-45EC-84EF-1227FE3920DF");
    PAN_TIPISCADENZA.set_Header(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_TIPISCADENZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, "");
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPISCADENZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, "08F2E8A8-B3EE-425A-9394-A0C192A25679");
    PAN_TIPISCADENZA.set_Header(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_TIPISCADENZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, "");
    PAN_TIPISCADENZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPISCADENZA.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPISCADENZA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, MyGlb.PANEL_FORM, 96);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPISCADENZA.SetFieldPage(PFL_TIPISCADENZA_CODICE, -1, -1);
    PAN_TIPISCADENZA.SetFieldPanel(PFL_TIPISCADENZA_CODICE, PPQRY_T2, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPISCADENZA.SetFieldPage(PFL_TIPISCADENZA_DESCRIZIONE, -1, -1);
    PAN_TIPISCADENZA.SetFieldPanel(PFL_TIPISCADENZA_DESCRIZIONE, PPQRY_T2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 60, 0, -13997);
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, MyGlb.PANEL_LIST, 320, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, MyGlb.PANEL_LIST, 72);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, MyGlb.PANEL_LIST, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, MyGlb.PANEL_LIST, "NM. GR.");
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, MyGlb.PANEL_FORM, 96);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, MyGlb.PANEL_FORM, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_NUMGIORNI, MyGlb.PANEL_FORM, "NUM GIORNI");
    PAN_TIPISCADENZA.SetFieldPage(PFL_TIPISCADENZA_NUMGIORNI, -1, -1);
    PAN_TIPISCADENZA.SetFieldPanel(PFL_TIPISCADENZA_NUMGIORNI, PPQRY_T2, "A.NUM_GIORNI", "NUM_GIORNI", 1, 3, 0, -13997);
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, MyGlb.PANEL_LIST, 348, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, MyGlb.PANEL_LIST, 84);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, MyGlb.PANEL_LIST, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, MyGlb.PANEL_LIST, "DECORRENZA1");
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, MyGlb.PANEL_FORM, 96);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, MyGlb.PANEL_FORM, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA1, MyGlb.PANEL_FORM, "DECORRENZA1");
    PAN_TIPISCADENZA.SetFieldPage(PFL_TIPISCADENZA_DECORRENZA1, -1, -1);
    PAN_TIPISCADENZA.SetFieldPanel(PFL_TIPISCADENZA_DECORRENZA1, PPQRY_T2, "A.DECORRENZA1", "DECORRENZA1", 5, 1, 0, -13997);
    PAN_TIPISCADENZA.SetValueListItem(PFL_TIPISCADENZA_DECORRENZA1, (new IDVariant("E")), "Data di Emissione", "", "", -1);
    PAN_TIPISCADENZA.SetValueListItem(PFL_TIPISCADENZA_DECORRENZA1, (new IDVariant("P")), "Data di Protocollo", "", "", -1);
    PAN_TIPISCADENZA.SetValueListItem(PFL_TIPISCADENZA_DECORRENZA1, (new IDVariant("A")), "Data di Arrivo", "", "", -1);
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, MyGlb.PANEL_LIST, 460, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, MyGlb.PANEL_LIST, 84);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, MyGlb.PANEL_LIST, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, MyGlb.PANEL_LIST, "DECORRENZA2");
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, MyGlb.PANEL_FORM, 4, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, MyGlb.PANEL_FORM, 96);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, MyGlb.PANEL_FORM, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA2, MyGlb.PANEL_FORM, "DECORRENZA2");
    PAN_TIPISCADENZA.SetFieldPage(PFL_TIPISCADENZA_DECORRENZA2, -1, -1);
    PAN_TIPISCADENZA.SetFieldPanel(PFL_TIPISCADENZA_DECORRENZA2, PPQRY_T2, "A.DECORRENZA2", "DECORRENZA2", 1, 1, 0, -13997);
    PAN_TIPISCADENZA.SetValueListItem(PFL_TIPISCADENZA_DECORRENZA2, (new IDVariant(1)), "data del documento", "", "", -1);
    PAN_TIPISCADENZA.SetValueListItem(PFL_TIPISCADENZA_DECORRENZA2, (new IDVariant(2)), "fine mese", "", "", -1);
    PAN_TIPISCADENZA.SetValueListItem(PFL_TIPISCADENZA_DECORRENZA2, (new IDVariant(3)), "15 o fine mese", "", "", -1);
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, MyGlb.PANEL_LIST, 580, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, MyGlb.PANEL_LIST, 72);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, MyGlb.PANEL_LIST, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, MyGlb.PANEL_LIST, "Prevalente");
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, MyGlb.PANEL_FORM, 4, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, MyGlb.PANEL_FORM, 96);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, MyGlb.PANEL_FORM, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PREVALENTE, MyGlb.PANEL_FORM, "Prevalente");
    PAN_TIPISCADENZA.SetFieldPage(PFL_TIPISCADENZA_PREVALENTE, -1, -1);
    PAN_TIPISCADENZA.SetFieldPanel(PFL_TIPISCADENZA_PREVALENTE, PPQRY_T2, "A.PREVALENTE", "PREVALENTE", 5, 2, 0, -13997);
    PAN_TIPISCADENZA.SetValueListItem(PFL_TIPISCADENZA_PREVALENTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPISCADENZA.SetValueListItem(PFL_TIPISCADENZA_PREVALENTE, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, MyGlb.PANEL_LIST, 652, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, MyGlb.PANEL_LIST, 84);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, MyGlb.PANEL_LIST, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, MyGlb.PANEL_LIST, "Personale");
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, MyGlb.PANEL_FORM, 4, 148, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, MyGlb.PANEL_FORM, 96);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, MyGlb.PANEL_FORM, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_PERSONALE, MyGlb.PANEL_FORM, "Personale");
    PAN_TIPISCADENZA.SetFieldPage(PFL_TIPISCADENZA_PERSONALE, -1, -1);
    PAN_TIPISCADENZA.SetFieldPanel(PFL_TIPISCADENZA_PERSONALE, PPQRY_T2, "A.SE_PERSONALE", "SE_PERSONALE", 5, 2, 0, -13997);
    PAN_TIPISCADENZA.SetValueListItem(PFL_TIPISCADENZA_PERSONALE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPISCADENZA.SetValueListItem(PFL_TIPISCADENZA_PERSONALE, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA, MyGlb.PANEL_LIST, 320, 0, 260, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA, MyGlb.PANEL_LIST, 0);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA, MyGlb.PANEL_LIST, 2);
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA, MyGlb.PANEL_FORM, 320, 0, 236, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA, MyGlb.PANEL_FORM, 0);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DECORRENZA, MyGlb.PANEL_FORM, 1);
    PAN_TIPISCADENZA.SetFieldPage(PFL_TIPISCADENZA_DECORRENZA, -1, -1);
    PAN_TIPISCADENZA.SetFieldPanel(PFL_TIPISCADENZA_DECORRENZA, -1, "", "DECORRENZA", 0, 0, 0, -13997);
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 172, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_TIPISCADENZA.SetFieldPage(PFL_TIPISCADENZA_UTENTEINSERI, -1, -1);
    PAN_TIPISCADENZA.SetFieldPanel(PFL_TIPISCADENZA_UTENTEINSERI, PPQRY_T2, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, MyGlb.PANEL_FORM, 4, 196, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_TIPISCADENZA.SetFieldPage(PFL_TIPISCADENZA_DATAINSERIME, -1, -1);
    PAN_TIPISCADENZA.SetFieldPanel(PFL_TIPISCADENZA_DATAINSERIME, PPQRY_T2, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 220, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_TIPISCADENZA.SetFieldPage(PFL_TIPISCADENZA_UTENTULTIAGG, -1, -1);
    PAN_TIPISCADENZA.SetFieldPanel(PFL_TIPISCADENZA_UTENTULTIAGG, PPQRY_T2, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_TIPISCADENZA.SetRect(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPISCADENZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_TIPISCADENZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPISCADENZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPISCADENZA_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_TIPISCADENZA.SetFieldPage(PFL_TIPISCADENZA_DATAULTIMAGG, -1, -1);
    PAN_TIPISCADENZA.SetFieldPanel(PFL_TIPISCADENZA_DATAULTIMAGG, PPQRY_T2, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_TIPISCADENZA_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPISCADENZA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPISCADENZA.SetIMDB(IMDB, "PQRY_T2", true);
    PAN_TIPISCADENZA.set_SetString(MyGlb.MASTER_ROWNAME, "T01");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.NUM_GIORNI as NUM_GIORNI, ");
    SQL.append("  A.DECORRENZA1 as DECORRENZA1, ");
    SQL.append("  A.DECORRENZA2 as DECORRENZA2, ");
    SQL.append("  A.PREVALENTE as PREVALENTE, ");
    SQL.append("  A.SE_PERSONALE as SE_PERSONALE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_TIPISCADENZA.SetQuery(PPQRY_T2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T01 A ");
    PAN_TIPISCADENZA.SetQuery(PPQRY_T2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPISCADENZA.SetQuery(PPQRY_T2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPISCADENZA.SetQuery(PPQRY_T2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPISCADENZA.SetQuery(PPQRY_T2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPISCADENZA.SetQuery(PPQRY_T2, 5, SQL, -1, "");
    PAN_TIPISCADENZA.SetQueryDB(PPQRY_T2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPISCADENZA.SetMasterTable(0, "T01");
    PAN_TIPISCADENZA.AddToSortList(PFL_TIPISCADENZA_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPISCADENZA.Status() == 2)
    {
      int oldListQBE = PAN_TIPISCADENZA.iUseListQBE;
      PAN_TIPISCADENZA.iUseListQBE = 0;
      PAN_TIPISCADENZA.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPISCADENZA.PanelCommand(Glb.PCM_FIND);
      PAN_TIPISCADENZA.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_TIPISCADBOOK_MST_TIPSCABOOPAG_Init()
  {
    BUK_TIPISCADBOOK.InitMastro(BUK_TIPISCADBOOK_MST_TIPSCABOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_MST_TIPSCABOOPAG, "D38804F0-1BBB-4FCF-A644-8474A7F2F426");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_MST_TIPSCABOOPAG, "TIPSCABOOPAG");
    BUK_TIPISCADBOOK.InitMastroBox(BUK_TIPISCADBOOK_MST_TIPSCABOOPAG, BUK_TIPISCADBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPTBOX_NUMEROPAGINA, "4DA77541-6379-4A76-A02D-380C89ACCA3C");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPISCADBOOK.InitBoxSpan(BUK_TIPISCADBOOK_RPTBOX_NUMEROPAGINA, BUK_TIPISCADBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SPAN_NUMEROPAGINA, "13577F6B-9AF7-475C-A20F-672962252F1F");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPISCADBOOK.InitMastroBox(BUK_TIPISCADBOOK_MST_TIPSCABOOPAG, BUK_TIPISCADBOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25500, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPTBOX_PAGEBODY, "89A27DC2-6A26-4C97-915E-73880A67B216");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_TIPISCADBOOK.InitMastroBox(BUK_TIPISCADBOOK_MST_TIPSCABOOPAG, BUK_TIPISCADBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPTBOX_TITOLO, "4492CF85-8429-419B-9A3C-925E0894BC5D");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_TIPISCADBOOK_RPT_NEWREPORT_InitQuery() { BUK_TIPISCADBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_TIPISCADBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.NUM_GIORNI as NUM_GIORNI, ");
      SQL.append("  A.DECORRENZA1 as DECORRENZA1, ");
      SQL.append("  A.DECORRENZA2 as DECORRENZA2, ");
      SQL.append("  A.PREVALENTE as PREVALENTE, ");
      SQL.append("  A.SE_PERSONALE as SE_PERSONALE ");
      SQL.append("from ");
      SQL.append("  T01 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_TIPISCADBOOK.SetReportQuery(BUK_TIPISCADBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "B0BF447D-4E8C-4A5E-B783-72DAA1798C25");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_TIPISCADBOOK_RPT_NEWREPORT_Init()
  {
    BUK_TIPISCADBOOK.InitReport(BUK_TIPISCADBOOK_RPT_NEWREPORT, 196609);
    BUK_TIPISCADBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPT_NEWREPORT, "C5BFFDC5-90E9-43F1-AB66-222A172E29BB");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_TIPISCADBOOK.InitSection(BUK_TIPISCADBOOK_RPT_NEWREPORT, BUK_TIPISCADBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPISCADBOOK.SetSectionRendersInto(BUK_TIPISCADBOOK_SEC_PAGEHEADER, BUK_TIPISCADBOOK_RPTBOX_PAGEBODY);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SEC_PAGEHEADER, "8E04AEB1-5A7C-4F32-80B7-279704FFDC3E");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_TIPISCADBOOK.InitReportBox(BUK_TIPISCADBOOK_SEC_PAGEHEADER, BUK_TIPISCADBOOK_RPTBOX_CODICEHEADER, 400, 0, 1081, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPTBOX_CODICEHEADER, "AFDA83FA-4E05-4D9C-B894-230197ED9AB7");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_TIPISCADBOOK.InitBoxSpan(BUK_TIPISCADBOOK_RPTBOX_CODICEHEADER, BUK_TIPISCADBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SPAN_CODICE, "653A1FB0-0B9C-4F96-9FEF-131B5431F05E");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SPAN_CODICE, "CODICE");
    BUK_TIPISCADBOOK.InitReportBox(BUK_TIPISCADBOOK_SEC_PAGEHEADER, BUK_TIPISCADBOOK_RPTBOX_DESCRIHEADER, 1800, 0, 6900, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPTBOX_DESCRIHEADER, "B6D743A2-4CB4-4DBF-BBBB-439B539C60B9");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_TIPISCADBOOK.InitBoxSpan(BUK_TIPISCADBOOK_RPTBOX_DESCRIHEADER, BUK_TIPISCADBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SPAN_DESCRIZIONE, "55CC0270-81FF-4555-8D9F-D31FCE53BAF2");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_TIPISCADBOOK.InitReportBox(BUK_TIPISCADBOOK_SEC_PAGEHEADER, BUK_TIPISCADBOOK_RPTBOX_NUMGIORNHEAD, 10300, 0, 6200, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPTBOX_NUMGIORNHEAD, "E2FDB9B6-4977-4D7A-9472-29E045363744");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPTBOX_NUMGIORNHEAD, "NUMGIORNHEAD");
    BUK_TIPISCADBOOK.InitBoxSpan(BUK_TIPISCADBOOK_RPTBOX_NUMGIORNHEAD, BUK_TIPISCADBOOK_SPAN_NUMGIORNI, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Decorrenza", 1);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SPAN_NUMGIORNI, "47AA53EC-4041-46A3-BFF0-4AE62615C68E");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SPAN_NUMGIORNI, "NUMGIORNI");
    BUK_TIPISCADBOOK.InitSection(BUK_TIPISCADBOOK_RPT_NEWREPORT, BUK_TIPISCADBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPISCADBOOK.SetSectionRendersInto(BUK_TIPISCADBOOK_SEC_TITOLO, BUK_TIPISCADBOOK_RPTBOX_TITOLO);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SEC_TITOLO, "049C73BD-23F5-4E52-BF4F-80733D79ED03");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SEC_TITOLO, "TITOLO");
    BUK_TIPISCADBOOK.InitReportBox(BUK_TIPISCADBOOK_SEC_TITOLO, BUK_TIPISCADBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPTBOX_NEWBOX, "43B8D08F-F68A-4A69-8E59-918B9F1A79AE");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_TIPISCADBOOK.InitBoxSpan(BUK_TIPISCADBOOK_RPTBOX_NEWBOX, BUK_TIPISCADBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Tipi di Scadenza", 1);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SPAN_VARIADIBILAN, "E2A733A4-C1BF-47D5-A672-86275A308066");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_TIPISCADBOOK.InitSection(BUK_TIPISCADBOOK_RPT_NEWREPORT, BUK_TIPISCADBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPISCADBOOK.SetSectionRendersInto(BUK_TIPISCADBOOK_SEC_DETAIL, BUK_TIPISCADBOOK_RPTBOX_PAGEBODY);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SEC_DETAIL, "4AA0B434-7CA6-47B9-9C6C-BD65097CD999");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SEC_DETAIL, "DETAIL");
    BUK_TIPISCADBOOK.InitReportBox(BUK_TIPISCADBOOK_SEC_DETAIL, BUK_TIPISCADBOOK_RPTBOX_CODICE, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPTBOX_CODICE, "4E6A92EE-1367-4077-8BC0-778D09C9E02E");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPTBOX_CODICE, "CODICE");
    BUK_TIPISCADBOOK.InitBoxSpan(BUK_TIPISCADBOOK_RPTBOX_CODICE, BUK_TIPISCADBOOK_SPAN_T0COTISCTISB, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SPAN_T0COTISCTISB, "0587EB47-13E8-4522-92CB-5A05F435589A");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SPAN_T0COTISCTISB, "T0COTISCTISB");
    BUK_TIPISCADBOOK.InitReportBox(BUK_TIPISCADBOOK_SEC_DETAIL, BUK_TIPISCADBOOK_RPTBOX_DESCRIZIONE, 1800, 0, 8200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPTBOX_DESCRIZIONE, "76A2AF99-2C52-4874-8FC7-8F00E9FA06EA");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_TIPISCADBOOK.InitBoxSpan(BUK_TIPISCADBOOK_RPTBOX_DESCRIZIONE, BUK_TIPISCADBOOK_SPAN_T0DETISCTIS1, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SPAN_T0DETISCTIS1, "00582FBD-9BC4-481F-8B67-F0E67104E3A0");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SPAN_T0DETISCTIS1, "T0DETISCTIS1");
    BUK_TIPISCADBOOK.InitReportBox(BUK_TIPISCADBOOK_SEC_DETAIL, BUK_TIPISCADBOOK_RPTBOX_NUMGIORNI, 10300, 0, 734, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPTBOX_NUMGIORNI, "95C337EA-67AE-4F7C-9D16-A6ECC23DBA6C");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPTBOX_NUMGIORNI, "NUMGIORNI");
    BUK_TIPISCADBOOK.InitBoxSpan(BUK_TIPISCADBOOK_RPTBOX_NUMGIORNI, BUK_TIPISCADBOOK_SPAN_T0NUGITISTSB, MyGlb.VIS_DEFAREPOSTYL, 1, 3, 0, 271384705, "Brief description of field content.", "::NUM_GIORNI", 1);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SPAN_T0NUGITISTSB, "0498B0C2-FD29-40B0-A972-8D4DEB9E6774");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SPAN_T0NUGITISTSB, "T0NUGITISTSB");
    BUK_TIPISCADBOOK.InitReportBox(BUK_TIPISCADBOOK_SEC_DETAIL, BUK_TIPISCADBOOK_RPTBOX_DECORRENZA1, 11200, 0, 2893, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPTBOX_DECORRENZA1, "F731CC4F-222C-4649-9E51-C0A20AA26909");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPTBOX_DECORRENZA1, "DECORRENZA1");
    BUK_TIPISCADBOOK.InitBoxSpan(BUK_TIPISCADBOOK_RPTBOX_DECORRENZA1, BUK_TIPISCADBOOK_SPAN_T0DETISCTIS2, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::DECORRENZA1", 1);
    BUK_TIPISCADBOOK.SetSpanValueListItem(BUK_TIPISCADBOOK_SPAN_T0DETISCTIS2, "Data di Emissione", "Type the value and explain what it means.", (new IDVariant("E")), null, "", -1);
    BUK_TIPISCADBOOK.SetSpanValueListItem(BUK_TIPISCADBOOK_SPAN_T0DETISCTIS2, "Data di Protocollo", "Type the value and explain what it means.", (new IDVariant("P")), null, "", -1);
    BUK_TIPISCADBOOK.SetSpanValueListItem(BUK_TIPISCADBOOK_SPAN_T0DETISCTIS2, "Data di Arrivo", "", (new IDVariant("A")), null, "", -1);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SPAN_T0DETISCTIS2, "962447DE-DD06-4921-B1AC-6E9570B5F5A8");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SPAN_T0DETISCTIS2, "T0DETISCTIS2");
    BUK_TIPISCADBOOK.InitReportBox(BUK_TIPISCADBOOK_SEC_DETAIL, BUK_TIPISCADBOOK_RPTBOX_DECORRENZA2, 14300, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_RPTBOX_DECORRENZA2, "1E1E3D50-51C0-49E6-88C3-CF13A2669794");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_RPTBOX_DECORRENZA2, "DECORRENZA2");
    BUK_TIPISCADBOOK.InitBoxSpan(BUK_TIPISCADBOOK_RPTBOX_DECORRENZA2, BUK_TIPISCADBOOK_SPAN_T0DETISCTISB, MyGlb.VIS_DEFAREPOSTYL, 1, 1, 0, 271384705, "Brief description of field content.", "::DECORRENZA2", 1);
    BUK_TIPISCADBOOK.SetSpanValueListItem(BUK_TIPISCADBOOK_SPAN_T0DETISCTISB, "data del documento", "Type the value and explain what it means.", (new IDVariant(1)), null, "", -1);
    BUK_TIPISCADBOOK.SetSpanValueListItem(BUK_TIPISCADBOOK_SPAN_T0DETISCTISB, "fine mese", "Type the value and explain what it means.", (new IDVariant(2)), null, "", -1);
    BUK_TIPISCADBOOK.SetSpanValueListItem(BUK_TIPISCADBOOK_SPAN_T0DETISCTISB, "15 o fine mese", "Type the value and explain what it means.", (new IDVariant(3)), null, "", -1);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SPAN_T0DETISCTISB, "A890659C-E8C4-4ECB-9637-BDE285943C6D");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SPAN_T0DETISCTISB, "T0DETISCTISB");
    BUK_TIPISCADBOOK.InitSection(BUK_TIPISCADBOOK_RPT_NEWREPORT, BUK_TIPISCADBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPISCADBOOK.SetSectionRendersInto(BUK_TIPISCADBOOK_SEC_REPORTFOOTER, BUK_TIPISCADBOOK_RPTBOX_PAGEBODY);
    BUK_TIPISCADBOOK.SetRTCGuid(BUK_TIPISCADBOOK_SEC_REPORTFOOTER, "5071A849-B4D4-4638-8C48-20805449408B");
    BUK_TIPISCADBOOK.SetObjCode(BUK_TIPISCADBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_TIPISCADBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_TIPISCADBOOK_InitLinks()
  {
    BUK_TIPISCADBOOK.SetBoxNextBox(BUK_TIPISCADBOOK_RPTBOX_PAGEBODY, BUK_TIPISCADBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPISCADENZA) PAN_TIPISCADENZA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPISCADENZA) PAN_TIPISCADENZA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPISCADENZA) PAN_TIPISCADENZA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPISCADENZA) PAN_TIPISCADENZA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPISCADENZA) PAN_TIPISCADENZA_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_TIPISCADENZA) PAN_TIPISCADENZA_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_TIPISCADENZA) PAN_TIPISCADENZA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_TIPISCADBOOK) BUK_TIPISCADBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_TIPISCADBOOK) BUK_TIPISCADBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_TIPISCADBOOK) BUK_TIPISCADBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_TIPISCADBOOK) BUK_TIPISCADBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_TIPISCADBOOK) BUK_TIPISCADBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_TIPISCADBOOK) BUK_TIPISCADBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_TIPISCADBOOK) BUK_TIPISCADBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_TIPISCADBOOK) BUK_TIPISCADBOOK_OnPreview();
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
