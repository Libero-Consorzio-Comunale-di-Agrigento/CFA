// **********************************************
// Firme
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Firme extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FIRME_CODICE = 0;
  private static int PFL_FIRME_PROGR = 1;
  private static int PFL_FIRME_DESCRIZIONE = 2;
  private static int PFL_FIRME_PERCORIMMAGI = 3;
  private static int PFL_FIRME_ESTENSIOFILE = 4;
  private static int PFL_FIRME_UTENTEINSERI = 5;
  private static int PFL_FIRME_DATAINSERIME = 6;
  private static int PFL_FIRME_UTENTULTIAGG = 7;
  private static int PFL_FIRME_DATAULTIMAGG = 8;
  private static int PFL_FIRME_IMMAGINE = 9;

  private static int PPQRY_FIRME1 = 0;


  IDPanel PAN_FIRME;
  CIDREObj BUK_FIRMEBOOK;
  OBook BKW_FIRMEBOOK;
  //
  // Template Pages constants
  private static int BUK_FIRMEBOOK_MST_FIRMBOOKPAGE = 1;
  private static int BUK_FIRMEBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_FIRMEBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_FIRMEBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_FIRMEBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_FIRMEBOOK_RPT_NEWREPORT = 6;
  private static int BUK_FIRMEBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_FIRMEBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_FIRMEBOOK_SPAN_CODICE = 9;
  private static int BUK_FIRMEBOOK_RPTBOX_PROGREHEADER = 10;
  private static int BUK_FIRMEBOOK_SPAN_PROGR = 11;
  private static int BUK_FIRMEBOOK_RPTBOX_DESCRIHEADER = 12;
  private static int BUK_FIRMEBOOK_SPAN_DESCRIZIONE = 13;
  private static int BUK_FIRMEBOOK_SEC_TITOLO = 14;
  private static int BUK_FIRMEBOOK_RPTBOX_NEWBOX = 15;
  private static int BUK_FIRMEBOOK_SPAN_VARIADIBILAN = 16;
  private static int BUK_FIRMEBOOK_SEC_DETAIL = 17;
  private static int BUK_FIRMEBOOK_RPTBOX_CODICE = 18;
  private static int BUK_FIRMEBOOK_SPAN_T67CODFIFIBO = 19;
  private static int BUK_FIRMEBOOK_RPTBOX_PROGRESSIVO = 20;
  private static int BUK_FIRMEBOOK_SPAN_T67PROFIFIBO = 21;
  private static int BUK_FIRMEBOOK_RPTBOX_DESCRIZIONE = 22;
  private static int BUK_FIRMEBOOK_SPAN_T67DESFIFIBO = 23;
  private static int BUK_FIRMEBOOK_SEC_REPORTFOOTER = 24;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_FIRME1(IMDB);
    Init_PQRY_FIRME(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_FIRME1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FIRME1, 10);
    IMDB.set_TblCode(IMDBDef9.PQRY_FIRME1, "PQRY_FIRME1");
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_CODICE,5,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_PROGRESSIVO,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_BITMAP, "BITMAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_BITMAP,5,80,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_ESTENSIONE_FILE, "ESTENSIONE_FILE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_ESTENSIONE_FILE,5,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_IMMAGINE, "IMMAGINE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME1,IMDBDef9.PQSL_FIRME1_IMMAGINE,10,9999,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_FIRME1, 0);
  }

  private static void Init_PQRY_FIRME(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FIRME, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_FIRME, "PQRY_FIRME");
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME,IMDBDef9.PQSL_FIRME_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME,IMDBDef9.PQSL_FIRME_CODICE,5,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME,IMDBDef9.PQSL_FIRME_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME,IMDBDef9.PQSL_FIRME_PROGRESSIVO,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME,IMDBDef9.PQSL_FIRME_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME,IMDBDef9.PQSL_FIRME_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FIRME,IMDBDef9.PQSL_FIRME_BITMAP, "BITMAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_FIRME,IMDBDef9.PQSL_FIRME_BITMAP,5,80,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_FIRME, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Firme(MyWebEntryPoint w, IMDBObj imdb)
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
  public Firme()
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
    FormIdx = MyGlb.FRM_FIRME;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "34DA00BD-3117-43AD-904B-B4B2ED38F366";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 820;
    DesignHeight = 514;
    set_Caption(new IDVariant("Firme"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 820;
    Frames[1].Height = 488;
    Frames[1].Caption = "Firme";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 488;
    PAN_FIRME = new IDPanel(w, this, 1, "PAN_FIRME");
    Frames[1].Content = PAN_FIRME;
    PAN_FIRME.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FIRME.VS = MainFrm.VisualStyleList;
    PAN_FIRME.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 820-MyGlb.PAN_OFFS_X, 488-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_FIRMEBOOK != null)
      PAN_FIRME.SetBook(BUK_FIRMEBOOK);
    PAN_FIRME.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7C71D234-0224-4FDD-8961-865D1DD89505");
    PAN_FIRME.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 768, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FIRME.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FIRME.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FIRME.InitStatus = 2;
    PAN_FIRME_Init();
    PAN_FIRME_InitFields();
    PAN_FIRME_InitQueries();
    BKW_FIRMEBOOK = new OBook(this);
    BUK_FIRMEBOOK = new CIDREObj(BKW_FIRMEBOOK);
    BKW_FIRMEBOOK.iGuid = "D7E85C20-976A-4F2F-96CF-A6B7780FBB9B";
    BKW_FIRMEBOOK.Code = "BUK_FIRMEBOOK";
    BKW_FIRMEBOOK.BookObj = BUK_FIRMEBOOK;
    BKW_FIRMEBOOK.InitDefMasks();
    BUK_FIRMEBOOK.InitBook(1, 1245185, "Firme Book", IMDB, MainFrm.VisualStyleList);
    BUK_FIRMEBOOK.InitHTML();
    BUK_FIRMEBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_FIRMEBOOK.Book.SetMainFrm(MainFrm);
    BUK_FIRMEBOOK.SetRTCGuid(0, "D7E85C20-976A-4F2F-96CF-A6B7780FBB9B");
    BUK_FIRMEBOOK.SetObjCode(0, "FIRMEBOOK");
    if (PAN_FIRME != null)
      PAN_FIRME.SetBook(BUK_FIRMEBOOK);
    BUK_FIRMEBOOK_MST_FIRMBOOKPAGE_Init();
    BUK_FIRMEBOOK_RPT_NEWREPORT_Init();
    BUK_FIRMEBOOK_InitLinks();
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
      PAN_FIRME.UpdatePanel(MainFrm);
      // BUK_FIRMEBOOK.UpdateBook();
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
    if (Code.equals("BUK_FIRMEBOOK")) return BUK_FIRMEBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Firme);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Firme.class.getName() : (Glb.ClassWithPackage(Firme.class) ? Firme.class.getName().substring(Firme.class.getPackage().getName().length() + 1) : Firme.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Firme On Database Error Event
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
  private void PAN_FIRME_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_FIRME, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Firme On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Firme", "FirmeOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Firme On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FIRME_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FIRME);
      // 
      // Firme On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_FIRME.IsNewRow()))
      {
        PAN_FIRME.SetFlags (Glb.OBJ_FIELD, PFL_FIRME_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_FIRME.SetFlags (Glb.OBJ_FIELD, PFL_FIRME_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_FIRME.set_ToolTip(Glb.OBJ_FIELD,PFL_FIRME_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_DESCRIZIONE, 0).stringValue()); 
      PAN_FIRME.set_ToolTip(Glb.OBJ_FIELD,PFL_FIRME_PERCORIMMAGI,IMDB.Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_BITMAP, 0).stringValue()); 
      if ((IMDB.Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_CODICE, 0).equals((new IDVariant("MAN")), true) || IMDB.Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_CODICE, 0).equals((new IDVariant("ORD")), true) || IMDB.Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_CODICE, 0).equals((new IDVariant("AVV")), true) || IMDB.Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_CODICE, 0).equals((new IDVariant("SO1")), true)) && IMDB.Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_PROGRESSIVO, 0).equals((new IDVariant(1)), true))
      {
        PAN_FIRME.SetFlags (Glb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_FIRME.SetFlags (Glb.OBJ_FIELD, PFL_FIRME_IMMAGINE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_FIRME.SetFlags (Glb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_FIRME.SetFlags (Glb.OBJ_FIELD, PFL_FIRME_IMMAGINE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Firme", "FirmeOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Firme On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_FIRME_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Firme On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Firme", "FirmeOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Firme On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_FIRME_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Firme On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(128)), true))
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Firme", "FirmeOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Firme On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_FIRME_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Firme On Change Row Event Body
      // Procedure Body
      // 
      if (PAN_FIRME.GetOrgValue(PFL_FIRME_DESCRIZIONE).compareTo((new IDVariant(PAN_FIRME.FieldText(PFL_FIRME_DESCRIZIONE))), true)!=0)
      {
        IMDB.set_Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_DESCRIZIONE, 0, IDL.Replace((new IDVariant(PAN_FIRME.FieldText(PFL_FIRME_DESCRIZIONE))), (new IDVariant(" ")), (new IDVariant(" "))));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Firme", "FirmeOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Firme After BLOB Update Event
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column: Numero intero che indica quale campo del pannello è coinvolto nell'operazione di aggiornamento o cancellazione. Deve essere confrontato con la funzione Me dei campi del pannello. - Input
  // Size: Dimensione del file caricato in byte oppure -1 se il contenuto del blob è stato cancellato. - Input
  // Extension: Stringa che contiene l'estensione del file in fase di caricamento. - Input
  // **********************************************************************
  private void PAN_FIRME_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Firme After BLOB Update Event Body
      // Procedure Body
      // 
      if (Size.compareTo((new IDVariant(-1)), true)!=0)
      {
        if (IMDB.Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_ESTENSIONE_FILE, 0).compareTo(IDL.Upper(Extension), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_ESTENSIONE_FILE, 0, IDL.Upper(Extension));
          PAN_FIRME.UpdatePanel(MainFrm);
          PAN_FIRME.PanelCommand(Glb.PCM_UPDATE);
        }
      }
      else
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_ESTENSIONE_FILE, 0))))
        {
          IMDB.set_Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_ESTENSIONE_FILE, 0, (new IDVariant()));
          PAN_FIRME.UpdatePanel(MainFrm);
          PAN_FIRME.PanelCommand(Glb.PCM_UPDATE);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Firme", "FirmeAfterBLOBUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Firme Codice Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_FIRME_CODICE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Firme Codice Validate Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_CODICE, 0, IDL.Upper(IMDB.Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_CODICE, 0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Firme", "FirmeCodiceValidateEvent", _e);
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
      PAN_FIRME.SetFieldValidation(PFL_FIRME_DESCRIZIONE, (new IDVariant(-1)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Firme", "LoadEvent", _e);
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
  private void PAN_FIRME_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FIRME, Cancel);
    // Stub
  }

  private void PAN_FIRME_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FIRME_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FIRME_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FIRME_CODICE)
      {
        PFL_FIRME_CODICE_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_FIRME_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_IMMAGINE, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_FIRME1, IMDBDef9.PQSL_FIRME1_IMMAGINE, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_FIRME_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_FIRMEBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_FIRMEBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_FIRMEBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_FIRMEBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_FIRMEBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_FIRMEBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_FIRMEBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_FIRMEBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_FIRMEBOOK_MST_FIRMBOOKPAGE)
    {
      BUK_FIRMEBOOK.set_SpanValue(BUK_FIRMEBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_FIRMEBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_FIRMEBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_FIRMEBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_FIRMEBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_FIRMEBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_FIRMEBOOK_OnPreview()
  {
    PreviewBook = BKW_FIRMEBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FIRME_Init()
  {

    PAN_FIRME.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FIRME.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FIRME.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_FIRME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, "5DD25FEC-7E0C-46DA-972A-127297399A48");
    PAN_FIRME.set_Header(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, "Codice");
    PAN_FIRME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, "Codice");
    PAN_FIRME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_FIRME.SetFlags(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_FIRME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, "F495B39E-5326-48F4-B89B-4DA7A3F401F0");
    PAN_FIRME.set_Header(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, "Progr.");
    PAN_FIRME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, "Progressivo");
    PAN_FIRME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, MyGlb.VIS_NORMALFIELDS);
    PAN_FIRME.SetFlags(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_FIRME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, "540F1D3A-4A8E-4087-A705-EADF8B80D508");
    PAN_FIRME.set_Header(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, "Descrizione");
    PAN_FIRME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, "");
    PAN_FIRME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FIRME.SetFlags(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISDESCR, -1);
    PAN_FIRME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, "8E6AD6FC-9AEF-4EC3-A28D-F915714890D2");
    PAN_FIRME.set_Header(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, "Percorso Immagine");
    PAN_FIRME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, "");
    PAN_FIRME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, MyGlb.VIS_NORMALFIELDS);
    PAN_FIRME.SetFlags(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FIRME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, "5C96E3E8-9DFD-4347-8C0E-5FF7EED6C927");
    PAN_FIRME.set_Header(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, "ESTENSIONE FILE");
    PAN_FIRME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, "");
    PAN_FIRME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, MyGlb.VIS_NORMALFIELDS);
    PAN_FIRME.SetFlags(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FIRME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, "7B7D788D-A284-4321-99FC-3D5C2E77BF7F");
    PAN_FIRME.set_Header(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_FIRME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, "");
    PAN_FIRME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_FIRME.SetFlags(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FIRME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, "2D570F78-878E-45E8-B389-3C570E381C47");
    PAN_FIRME.set_Header(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, "DATA INSERIMENTO");
    PAN_FIRME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, "");
    PAN_FIRME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_FIRME.SetFlags(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FIRME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, "A4F30906-C5F2-427C-A705-8D8892E6B399");
    PAN_FIRME.set_Header(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_FIRME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, "");
    PAN_FIRME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_FIRME.SetFlags(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FIRME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, "30B41660-7FAD-4EEA-A5B2-F90522E8AB1C");
    PAN_FIRME.set_Header(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_FIRME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, "");
    PAN_FIRME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_FIRME.SetFlags(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FIRME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, "922E45C6-DFF7-4080-A403-69CD19D7A555");
    PAN_FIRME.set_Header(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, "Immagine");
    PAN_FIRME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, "");
    PAN_FIRME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, MyGlb.VIS_NORMFIELPADR);
    PAN_FIRME.SetFlags(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FIRME_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, MyGlb.PANEL_LIST, 40);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, MyGlb.PANEL_FORM, 4, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, MyGlb.PANEL_FORM, 80);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_FIRME.SetFieldPage(PFL_FIRME_CODICE, -1, -1);
    PAN_FIRME.SetFieldPanel(PFL_FIRME_CODICE, PPQRY_FIRME1, "A.CODICE", "CODICE", 5, 3, 0, -13997);
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, MyGlb.PANEL_LIST, 56, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, MyGlb.PANEL_LIST, 64);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, MyGlb.PANEL_LIST, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, MyGlb.PANEL_LIST, "Progr.");
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, MyGlb.PANEL_FORM, 4, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, MyGlb.PANEL_FORM, 80);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, MyGlb.PANEL_FORM, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_PROGR, MyGlb.PANEL_FORM, "Progr.");
    PAN_FIRME.SetFieldPage(PFL_FIRME_PROGR, -1, -1);
    PAN_FIRME.SetFieldPanel(PFL_FIRME_PROGR, PPQRY_FIRME1, "A.PROGRESSIVO", "PROGRESSIVO", 1, 1, 0, -13997);
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, MyGlb.PANEL_LIST, 100, 36, 372, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 480, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, MyGlb.PANEL_FORM, 80);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FIRME.SetFieldPage(PFL_FIRME_DESCRIZIONE, -1, -1);
    PAN_FIRME.SetFieldPanel(PFL_FIRME_DESCRIZIONE, PPQRY_FIRME1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, MyGlb.PANEL_LIST, 472, 36, 296, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, MyGlb.PANEL_LIST, 40);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, MyGlb.PANEL_LIST, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, MyGlb.PANEL_LIST, "Percorso Immagine");
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, MyGlb.PANEL_FORM, 4, 76, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, MyGlb.PANEL_FORM, 80);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, MyGlb.PANEL_FORM, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_PERCORIMMAGI, MyGlb.PANEL_FORM, "Perc. Imm.");
    PAN_FIRME.SetFieldPage(PFL_FIRME_PERCORIMMAGI, -1, -1);
    PAN_FIRME.SetFieldPanel(PFL_FIRME_PERCORIMMAGI, PPQRY_FIRME1, "A.BITMAP", "BITMAP", 5, 80, 0, -13997);
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, MyGlb.PANEL_LIST, 764, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, MyGlb.PANEL_LIST, 96);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, MyGlb.PANEL_LIST, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, MyGlb.PANEL_LIST, "ESTEN. FL.");
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, MyGlb.PANEL_FORM, 4, 148, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, MyGlb.PANEL_FORM, 96);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, MyGlb.PANEL_FORM, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_ESTENSIOFILE, MyGlb.PANEL_FORM, "ESTENS. FILE");
    PAN_FIRME.SetFieldPage(PFL_FIRME_ESTENSIOFILE, -1, -1);
    PAN_FIRME.SetFieldPanel(PFL_FIRME_ESTENSIOFILE, PPQRY_FIRME1, "A.ESTENSIONE_FILE", "ESTENSIONE_FILE", 5, 5, 0, -13997);
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, MyGlb.PANEL_LIST, 896, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 100, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_FIRME.SetFieldPage(PFL_FIRME_UTENTEINSERI, -1, -1);
    PAN_FIRME.SetFieldPanel(PFL_FIRME_UTENTEINSERI, PPQRY_FIRME1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, MyGlb.PANEL_LIST, 1016, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, MyGlb.PANEL_FORM, 4, 124, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_FIRME.SetFieldPage(PFL_FIRME_DATAINSERIME, -1, -1);
    PAN_FIRME.SetFieldPanel(PFL_FIRME_DATAINSERIME, PPQRY_FIRME1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, MyGlb.PANEL_LIST, 1124, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 148, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_FIRME.SetFieldPage(PFL_FIRME_UTENTULTIAGG, -1, -1);
    PAN_FIRME.SetFieldPanel(PFL_FIRME_UTENTULTIAGG, PPQRY_FIRME1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, MyGlb.PANEL_LIST, 1236, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 172, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_FIRME.SetFieldPage(PFL_FIRME_DATAULTIMAGG, -1, -1);
    PAN_FIRME.SetFieldPanel(PFL_FIRME_DATAULTIMAGG, PPQRY_FIRME1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, MyGlb.PANEL_LIST, 4, 264, 504, 104, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_MOVE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, MyGlb.PANEL_LIST, 68);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, MyGlb.PANEL_LIST, 7);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, MyGlb.PANEL_LIST, "Immagine");
    PAN_FIRME.SetRect(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, MyGlb.PANEL_FORM, 4, 100, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FIRME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, MyGlb.PANEL_FORM, 68);
    PAN_FIRME.SetNumRow(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, MyGlb.PANEL_FORM, 2);
    PAN_FIRME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FIRME_IMMAGINE, MyGlb.PANEL_FORM, "Immagine");
    PAN_FIRME.SetFieldPage(PFL_FIRME_IMMAGINE, -1, -1);
    PAN_FIRME.SetFieldPanel(PFL_FIRME_IMMAGINE, PPQRY_FIRME1, "A.IMMAGINE", "IMMAGINE", 10, 9999, 0, -13997);
  }

  private void PAN_FIRME_InitQueries()
  {
    StringBuffer SQL;

    PAN_FIRME.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FIRME.SetIMDB(IMDB, "PQRY_FIRME1", true);
    PAN_FIRME.set_SetString(MyGlb.MASTER_ROWNAME, "T67");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.BITMAP as BITMAP, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ESTENSIONE_FILE as ESTENSIONE_FILE, ");
    SQL.append("  A.IMMAGINE as IMMAGINE ");
    PAN_FIRME.SetQuery(PPQRY_FIRME1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T67 A ");
    PAN_FIRME.SetQuery(PPQRY_FIRME1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FIRME.SetQuery(PPQRY_FIRME1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FIRME.SetQuery(PPQRY_FIRME1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FIRME.SetQuery(PPQRY_FIRME1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE, ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_FIRME.SetQuery(PPQRY_FIRME1, 5, SQL, -1, "");
    PAN_FIRME.SetQueryDB(PPQRY_FIRME1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FIRME.SetMasterTable(0, "T67");
    PAN_FIRME.AddToSortList(PFL_FIRME_CODICE, true);
    PAN_FIRME.AddToSortList(PFL_FIRME_PROGR, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FIRME.Status() == 2)
    {
      int oldListQBE = PAN_FIRME.iUseListQBE;
      PAN_FIRME.iUseListQBE = 0;
      PAN_FIRME.PanelCommand(Glb.PCM_SEARCH);
      PAN_FIRME.PanelCommand(Glb.PCM_FIND);
      PAN_FIRME.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_FIRMEBOOK_MST_FIRMBOOKPAGE_Init()
  {
    BUK_FIRMEBOOK.InitMastro(BUK_FIRMEBOOK_MST_FIRMBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_MST_FIRMBOOKPAGE, "38165E54-074E-4E9C-A19F-93656ADF3CC9");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_MST_FIRMBOOKPAGE, "FIRMBOOKPAGE");
    BUK_FIRMEBOOK.InitMastroBox(BUK_FIRMEBOOK_MST_FIRMBOOKPAGE, BUK_FIRMEBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_RPTBOX_NUMEROPAGINA, "1BC9CA07-6DAA-49F7-8987-95F95667A957");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_FIRMEBOOK.InitBoxSpan(BUK_FIRMEBOOK_RPTBOX_NUMEROPAGINA, BUK_FIRMEBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_SPAN_NUMEROPAGINA, "C19467FF-6619-49D7-A306-EFCCEAA7357C");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_FIRMEBOOK.InitMastroBox(BUK_FIRMEBOOK_MST_FIRMBOOKPAGE, BUK_FIRMEBOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_RPTBOX_PAGEBODY, "160995EA-5DE2-4313-B9DA-D54856B889B2");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_FIRMEBOOK.InitMastroBox(BUK_FIRMEBOOK_MST_FIRMBOOKPAGE, BUK_FIRMEBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_RPTBOX_TITOLO, "EDD6F545-5CDC-4214-8A42-1554C12E149C");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_FIRMEBOOK_RPT_NEWREPORT_InitQuery() { BUK_FIRMEBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_FIRMEBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.BITMAP as BITMAP ");
      SQL.append("from ");
      SQL.append("  T67 A ");
      BUK_FIRMEBOOK.SetReportQuery(BUK_FIRMEBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "4AAEBCF9-3FE7-4714-AAC0-05D92C6E7133");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_FIRMEBOOK_RPT_NEWREPORT_Init()
  {
    BUK_FIRMEBOOK.InitReport(BUK_FIRMEBOOK_RPT_NEWREPORT, 196609);
    BUK_FIRMEBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_RPT_NEWREPORT, "6820512D-213E-4939-B9B6-84FFC731396E");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_FIRMEBOOK.InitSection(BUK_FIRMEBOOK_RPT_NEWREPORT, BUK_FIRMEBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FIRMEBOOK.SetSectionRendersInto(BUK_FIRMEBOOK_SEC_PAGEHEADER, BUK_FIRMEBOOK_RPTBOX_PAGEBODY);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_SEC_PAGEHEADER, "FB0D0769-F0C6-4418-8B5D-A3E487E18F34");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_FIRMEBOOK.InitReportBox(BUK_FIRMEBOOK_SEC_PAGEHEADER, BUK_FIRMEBOOK_RPTBOX_CODICEHEADER, 0, 0, 1100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_RPTBOX_CODICEHEADER, "911F320D-F7C6-4DEE-86C1-BEE9710CCF1C");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_FIRMEBOOK.InitBoxSpan(BUK_FIRMEBOOK_RPTBOX_CODICEHEADER, BUK_FIRMEBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_SPAN_CODICE, "2D09B848-5498-423B-9621-E84DEA581A47");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_SPAN_CODICE, "CODICE");
    BUK_FIRMEBOOK.InitReportBox(BUK_FIRMEBOOK_SEC_PAGEHEADER, BUK_FIRMEBOOK_RPTBOX_PROGREHEADER, 1200, 0, 1913, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_RPTBOX_PROGREHEADER, "C1A21390-E5AB-452A-978C-9AADAD27BC06");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_RPTBOX_PROGREHEADER, "PROGREHEADER");
    BUK_FIRMEBOOK.InitBoxSpan(BUK_FIRMEBOOK_RPTBOX_PROGREHEADER, BUK_FIRMEBOOK_SPAN_PROGR, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Progressivo", 1);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_SPAN_PROGR, "FB5C1209-EA11-4D78-9E75-359E9B152FB3");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_SPAN_PROGR, "PROGR");
    BUK_FIRMEBOOK.InitReportBox(BUK_FIRMEBOOK_SEC_PAGEHEADER, BUK_FIRMEBOOK_RPTBOX_DESCRIHEADER, 3400, 0, 15200, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_RPTBOX_DESCRIHEADER, "C5C8017A-3D9D-4FBC-A0AC-2433903F03A6");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_FIRMEBOOK.InitBoxSpan(BUK_FIRMEBOOK_RPTBOX_DESCRIHEADER, BUK_FIRMEBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_SPAN_DESCRIZIONE, "8AB69D02-7E7C-47D1-9CDF-56A60B4376A1");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_FIRMEBOOK.InitSection(BUK_FIRMEBOOK_RPT_NEWREPORT, BUK_FIRMEBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FIRMEBOOK.SetSectionRendersInto(BUK_FIRMEBOOK_SEC_TITOLO, BUK_FIRMEBOOK_RPTBOX_TITOLO);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_SEC_TITOLO, "8102CB5B-FD8F-4092-AECA-12A8A02E2A4A");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_SEC_TITOLO, "TITOLO");
    BUK_FIRMEBOOK.InitReportBox(BUK_FIRMEBOOK_SEC_TITOLO, BUK_FIRMEBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_RPTBOX_NEWBOX, "4CCDF4EC-17CC-46DE-910F-2DA3FE0704EA");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_FIRMEBOOK.InitBoxSpan(BUK_FIRMEBOOK_RPTBOX_NEWBOX, BUK_FIRMEBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Firme", 1);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_SPAN_VARIADIBILAN, "2D1766D7-8CC6-437B-ABF2-A718C1E4E5BF");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_FIRMEBOOK.InitSection(BUK_FIRMEBOOK_RPT_NEWREPORT, BUK_FIRMEBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FIRMEBOOK.SetSectionRendersInto(BUK_FIRMEBOOK_SEC_DETAIL, BUK_FIRMEBOOK_RPTBOX_PAGEBODY);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_SEC_DETAIL, "D6049720-CB4F-41AA-9C1F-DA7E762723AD");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_SEC_DETAIL, "DETAIL");
    BUK_FIRMEBOOK.InitReportBox(BUK_FIRMEBOOK_SEC_DETAIL, BUK_FIRMEBOOK_RPTBOX_CODICE, 0, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_RPTBOX_CODICE, "C02F4C23-1FF4-477E-B284-513C39A7721D");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_RPTBOX_CODICE, "CODICE");
    BUK_FIRMEBOOK.InitBoxSpan(BUK_FIRMEBOOK_RPTBOX_CODICE, BUK_FIRMEBOOK_SPAN_T67CODFIFIBO, MyGlb.VIS_DEFAREPOSTYL, 5, 3, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_SPAN_T67CODFIFIBO, "56776AFC-F25C-461F-A0E4-4BA3D8A48033");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_SPAN_T67CODFIFIBO, "T67CODFIFIBO");
    BUK_FIRMEBOOK.InitReportBox(BUK_FIRMEBOOK_SEC_DETAIL, BUK_FIRMEBOOK_RPTBOX_PROGRESSIVO, 1400, 0, 1113, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_RPTBOX_PROGRESSIVO, "5A0BE141-9693-474F-9A0F-ABD251ACAAB3");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_RPTBOX_PROGRESSIVO, "PROGRESSIVO");
    BUK_FIRMEBOOK.InitBoxSpan(BUK_FIRMEBOOK_RPTBOX_PROGRESSIVO, BUK_FIRMEBOOK_SPAN_T67PROFIFIBO, MyGlb.VIS_DEFAREPOSTYL, 1, 1, 0, 271384705, "Brief description of field content.", "::PROGRESSIVO", 1);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_SPAN_T67PROFIFIBO, "654711D4-54DF-4FC3-B123-16BE5406E5B9");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_SPAN_T67PROFIFIBO, "T67PROFIFIBO");
    BUK_FIRMEBOOK.InitReportBox(BUK_FIRMEBOOK_SEC_DETAIL, BUK_FIRMEBOOK_RPTBOX_DESCRIZIONE, 3400, 0, 15200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_RPTBOX_DESCRIZIONE, "9F8F19CC-8C88-45B5-88A8-6C7BDB244FEE");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_FIRMEBOOK.InitBoxSpan(BUK_FIRMEBOOK_RPTBOX_DESCRIZIONE, BUK_FIRMEBOOK_SPAN_T67DESFIFIBO, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_SPAN_T67DESFIFIBO, "360D1B4C-FA63-42F2-8203-951D5C3B1533");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_SPAN_T67DESFIFIBO, "T67DESFIFIBO");
    BUK_FIRMEBOOK.InitSection(BUK_FIRMEBOOK_RPT_NEWREPORT, BUK_FIRMEBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FIRMEBOOK.SetSectionRendersInto(BUK_FIRMEBOOK_SEC_REPORTFOOTER, BUK_FIRMEBOOK_RPTBOX_PAGEBODY);
    BUK_FIRMEBOOK.SetRTCGuid(BUK_FIRMEBOOK_SEC_REPORTFOOTER, "0E0CB4DB-4F2C-4383-B88E-8DC91C13632D");
    BUK_FIRMEBOOK.SetObjCode(BUK_FIRMEBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_FIRMEBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_FIRMEBOOK_InitLinks()
  {
    BUK_FIRMEBOOK.SetBoxNextBox(BUK_FIRMEBOOK_RPTBOX_PAGEBODY, BUK_FIRMEBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FIRME) PAN_FIRME_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FIRME) PAN_FIRME_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FIRME) PAN_FIRME_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FIRME) PAN_FIRME_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FIRME) PAN_FIRME_OnChangeRow();
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
    if (SrcObj == PAN_FIRME) PAN_FIRME_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_FIRME) PAN_FIRME_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_FIRME) PAN_FIRME_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_FIRMEBOOK) BUK_FIRMEBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_FIRMEBOOK) BUK_FIRMEBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_FIRMEBOOK) BUK_FIRMEBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_FIRMEBOOK) BUK_FIRMEBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_FIRMEBOOK) BUK_FIRMEBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_FIRMEBOOK) BUK_FIRMEBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_FIRMEBOOK) BUK_FIRMEBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_FIRMEBOOK) BUK_FIRMEBOOK_OnPreview();
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
