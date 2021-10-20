// **********************************************
// Registri
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Registri extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_REGISTRI_CODICE = 0;
  private static int PFL_REGISTRI_DESCRIZIONE = 1;
  private static int PFL_REGISTRI_TIPO = 2;
  private static int PFL_REGISTRI_RIFTESO = 3;
  private static int PFL_REGISTRI_DISABUTENZE = 4;
  private static int PFL_REGISTRI_UTENTEINSERI = 5;
  private static int PFL_REGISTRI_DATAINSERIME = 6;
  private static int PFL_REGISTRI_UTENTULTIAGG = 7;
  private static int PFL_REGISTRI_DATAULTIMAGG = 8;

  private static int PPQRY_T13 = 0;


  IDPanel PAN_REGISTRI;
  CIDREObj BUK_ORGADELIBOOK;
  OBook BKW_ORGADELIBOOK;
  //
  // Template Pages constants
  private static int BUK_ORGADELIBOOK_MST_ORGDELBOOPAG = 1;
  private static int BUK_ORGADELIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_ORGADELIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_ORGADELIBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_ORGADELIBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_ORGADELIBOOK_RPT_NEWREPORT = 6;
  private static int BUK_ORGADELIBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_ORGADELIBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_ORGADELIBOOK_SPAN_CODICE = 9;
  private static int BUK_ORGADELIBOOK_RPTBOX_DESCRIHEADER = 10;
  private static int BUK_ORGADELIBOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_ORGADELIBOOK_RPTBOX_TIPOHEADER = 12;
  private static int BUK_ORGADELIBOOK_SPAN_TIPO = 13;
  private static int BUK_ORGADELIBOOK_RPTBOX_RIFTESOHEADE = 14;
  private static int BUK_ORGADELIBOOK_SPAN_RIFTESO1 = 15;
  private static int BUK_ORGADELIBOOK_RPTBOX_DISUTE11HEA1 = 16;
  private static int BUK_ORGADELIBOOK_SPAN_RIFTESO = 17;
  private static int BUK_ORGADELIBOOK_SEC_TITOLO = 18;
  private static int BUK_ORGADELIBOOK_RPTBOX_NEWBOX = 19;
  private static int BUK_ORGADELIBOOK_SPAN_VARIADIBILAN = 20;
  private static int BUK_ORGADELIBOOK_SEC_DETAIL = 21;
  private static int BUK_ORGADELIBOOK_RPTBOX_CODICE = 22;
  private static int BUK_ORGADELIBOOK_SPAN_T1COREORDEBO = 23;
  private static int BUK_ORGADELIBOOK_RPTBOX_DESCRIZIONE = 24;
  private static int BUK_ORGADELIBOOK_SPAN_T1DEREORDEBO = 25;
  private static int BUK_ORGADELIBOOK_RPTBOX_TIPO = 26;
  private static int BUK_ORGADELIBOOK_SPAN_T1TIREORDEBO = 27;
  private static int BUK_ORGADELIBOOK_RPTBOX_RIFTESO = 28;
  private static int BUK_ORGADELIBOOK_SPAN_T1RITEREORDB = 29;
  private static int BUK_ORGADELIBOOK_RPTBOX_DISABUTENZE1 = 30;
  private static int BUK_ORGADELIBOOK_SPAN_NUVATDURODBN = 31;
  private static int BUK_ORGADELIBOOK_SEC_PAGEFOOTER = 32;
  private static int BUK_ORGADELIBOOK_SEC_REPORTFOOTER = 33;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T13(IMDB);
    Init_PQRY_T14(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T13, 9);
    IMDB.set_TblCode(IMDBDef9.PQRY_T13, "PQRY_T13");
    IMDB.set_FldCode(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_CODICE,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_DESCRIZIONE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_RIF_TESO, "RIF_TESO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_RIF_TESO,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_DISAB_UTENZE, "DISAB_UTENZE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_DISAB_UTENZE,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T13,IMDBDef9.PQSL_T13_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T13, 0);
  }

  private static void Init_PQRY_T14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T14, 5);
    IMDB.set_TblCode(IMDBDef9.PQRY_T14, "PQRY_T14");
    IMDB.set_FldCode(IMDBDef9.PQRY_T14,IMDBDef9.PQSL_T14_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T14,IMDBDef9.PQSL_T14_CODICE,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T14,IMDBDef9.PQSL_T14_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T14,IMDBDef9.PQSL_T14_DESCRIZIONE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T14,IMDBDef9.PQSL_T14_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T14,IMDBDef9.PQSL_T14_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T14,IMDBDef9.PQSL_T14_RIF_TESO, "RIF_TESO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T14,IMDBDef9.PQSL_T14_RIF_TESO,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T14,IMDBDef9.PQSL_T14_DISAB_UTENZE, "DISAB_UTENZE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T14,IMDBDef9.PQSL_T14_DISAB_UTENZE,5,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T14, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Registri(MyWebEntryPoint w, IMDBObj imdb)
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
  public Registri()
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
    FormIdx = MyGlb.FRM_REGISTRI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6F81143E-510D-4A7B-9EBB-8E1390ED23B6";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 676;
    DesignHeight = 370;
    set_Caption(new IDVariant("Registri"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 676;
    Frames[1].Height = 344;
    Frames[1].Caption = "Registri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    PAN_REGISTRI = new IDPanel(w, this, 1, "PAN_REGISTRI");
    Frames[1].Content = PAN_REGISTRI;
    PAN_REGISTRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_REGISTRI.VS = MainFrm.VisualStyleList;
    PAN_REGISTRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 676-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_ORGADELIBOOK != null)
      PAN_REGISTRI.SetBook(BUK_ORGADELIBOOK);
    PAN_REGISTRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "34F23BB7-066A-4A2B-BB11-14D8E28DAB4E");
    PAN_REGISTRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 628, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_REGISTRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_REGISTRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_REGISTRI.InitStatus = 2;
    PAN_REGISTRI_Init();
    PAN_REGISTRI_InitFields();
    PAN_REGISTRI_InitQueries();
    BKW_ORGADELIBOOK = new OBook(this);
    BUK_ORGADELIBOOK = new CIDREObj(BKW_ORGADELIBOOK);
    BKW_ORGADELIBOOK.iGuid = "DF1A4A94-63F4-49E8-90D6-EED710B47D6B";
    BKW_ORGADELIBOOK.Code = "BUK_ORGADELIBOOK";
    BKW_ORGADELIBOOK.BookObj = BUK_ORGADELIBOOK;
    BKW_ORGADELIBOOK.InitDefMasks();
    BUK_ORGADELIBOOK.InitBook(1, 1245185, "Organi Deliberativi Book", IMDB, MainFrm.VisualStyleList);
    BUK_ORGADELIBOOK.InitHTML();
    BUK_ORGADELIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ORGADELIBOOK.Book.SetMainFrm(MainFrm);
    BUK_ORGADELIBOOK.SetRTCGuid(0, "DF1A4A94-63F4-49E8-90D6-EED710B47D6B");
    BUK_ORGADELIBOOK.SetObjCode(0, "ORGADELIBOOK");
    if (PAN_REGISTRI != null)
      PAN_REGISTRI.SetBook(BUK_ORGADELIBOOK);
    BUK_ORGADELIBOOK_MST_ORGDELBOOPAG_Init();
    BUK_ORGADELIBOOK_RPT_NEWREPORT_Init();
    BUK_ORGADELIBOOK_InitLinks();
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
      PAN_REGISTRI.UpdatePanel(MainFrm);
      // BUK_ORGADELIBOOK.UpdateBook();
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
    if (Code.equals("BUK_ORGADELIBOOK")) return BUK_ORGADELIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Registri);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Registri.class.getName() : (Glb.ClassWithPackage(Registri.class) ? Registri.class.getName().substring(Registri.class.getPackage().getName().length() + 1) : Registri.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Registri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_REGISTRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_REGISTRI);
      // 
      // Registri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_REGISTRI.IsNewRow()))
      {
        PAN_REGISTRI.SetFlags (Glb.OBJ_FIELD, PFL_REGISTRI_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_REGISTRI.SetFlags (Glb.OBJ_FIELD, PFL_REGISTRI_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_REGISTRI.set_ToolTip(Glb.OBJ_FIELD,PFL_REGISTRI_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T13, IMDBDef9.PQSL_T13_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Registri", "RegistriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Registri On Database Error Event
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
  private void PAN_REGISTRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_REGISTRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Registri On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Registri", "RegistriOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Registri On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_REGISTRI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Registri On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T11PD(IMDB.Value(IMDBDef9.PQRY_T13, IMDBDef9.PQSL_T13_CODICE, 0));
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
      MainFrm.ErrObj.ProcError ("Registri", "RegistriOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Registri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_REGISTRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Registri On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T13, IMDBDef9.PQSL_T13_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T13, IMDBDef9.PQSL_T13_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T13, IMDBDef9.PQSL_T13_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T13, IMDBDef9.PQSL_T13_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T13, IMDBDef9.PQSL_T13_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T13, IMDBDef9.PQSL_T13_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Registri", "RegistriOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("Registri", "LoadEvent", _e);
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
  private void PAN_REGISTRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_REGISTRI, Cancel);
    // Stub
  }

  private void PAN_REGISTRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_REGISTRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_REGISTRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_REGISTRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_REGISTRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_ORGADELIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ORGADELIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ORGADELIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_ORGADELIBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_ORGADELIBOOK_SEC_DETAIL)
    {
      BUK_ORGADELIBOOK.set_SpanValue(BUK_ORGADELIBOOK_SPAN_NUVATDURODBN, new IDVariant(IDL.NullValue(BUK_ORGADELIBOOK.GetReportColumn(BUK_ORGADELIBOOK_RPT_NEWREPORT, "DISAB_UTENZE"),(new IDVariant("NO")))));
    }
    if (SectionID==BUK_ORGADELIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_ORGADELIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_ORGADELIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ORGADELIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ORGADELIBOOK_MST_ORGDELBOOPAG)
    {
      BUK_ORGADELIBOOK.set_SpanValue(BUK_ORGADELIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ORGADELIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ORGADELIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_ORGADELIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ORGADELIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ORGADELIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ORGADELIBOOK_OnPreview()
  {
    PreviewBook = BKW_ORGADELIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_REGISTRI_Init()
  {

    PAN_REGISTRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_REGISTRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_REGISTRI.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_REGISTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, "B024A420-F541-453B-93EF-A9C23B49FB60");
    PAN_REGISTRI.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, "Codice");
    PAN_REGISTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, "");
    PAN_REGISTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_REGISTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, "8350270A-C2E6-4026-BE05-3C831AF3A40B");
    PAN_REGISTRI.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, "Descrizione");
    PAN_REGISTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, "");
    PAN_REGISTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_REGISTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, "D3AA1C47-E04B-4492-88EC-E37D198B344C");
    PAN_REGISTRI.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, "Tipo");
    PAN_REGISTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, "");
    PAN_REGISTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, "C1F5E200-015D-477E-A123-D33EF86CEB39");
    PAN_REGISTRI.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, "Rif.Teso");
    PAN_REGISTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, "");
    PAN_REGISTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, "8700F92C-1A1C-4CD5-B69A-B8AAC654C66C");
    PAN_REGISTRI.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, "Disab.Utenze");
    PAN_REGISTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, "");
    PAN_REGISTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, MyGlb.VIS_CHECKSTYLE);
    PAN_REGISTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, "732CB35B-E462-4608-B87F-01623ADF281B");
    PAN_REGISTRI.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_REGISTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, "");
    PAN_REGISTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_REGISTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, "41D128C4-B151-4A10-B88A-1EA4E26968A8");
    PAN_REGISTRI.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_REGISTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, "");
    PAN_REGISTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_REGISTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, "50DCDA1D-833C-4856-9CD9-22091C9C702E");
    PAN_REGISTRI.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_REGISTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, "");
    PAN_REGISTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_REGISTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, "0AF7286D-529A-499C-AA7B-EC6D51DF794F");
    PAN_REGISTRI.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_REGISTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, "");
    PAN_REGISTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_REGISTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_REGISTRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, MyGlb.PANEL_FORM, 96);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_REGISTRI.SetFieldPage(PFL_REGISTRI_CODICE, -1, -1);
    PAN_REGISTRI.SetFieldPanel(PFL_REGISTRI_CODICE, PPQRY_T13, "A.CODICE", "CODICE", 5, 4, 0, -13997);
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_REGISTRI.SetFieldPage(PFL_REGISTRI_DESCRIZIONE, -1, -1);
    PAN_REGISTRI.SetFieldPanel(PFL_REGISTRI_DESCRIZIONE, PPQRY_T13, "A.DESCRIZIONE", "DESCRIZIONE", 5, 30, 0, -13997);
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, MyGlb.PANEL_LIST, 364, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, MyGlb.PANEL_FORM, 96);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_REGISTRI.SetFieldPage(PFL_REGISTRI_TIPO, -1, -1);
    PAN_REGISTRI.SetFieldPanel(PFL_REGISTRI_TIPO, PPQRY_T13, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_REGISTRI.SetValueListItem(PFL_REGISTRI_TIPO, (new IDVariant("D")), "Delibera", "", "", -1);
    PAN_REGISTRI.SetValueListItem(PFL_REGISTRI_TIPO, (new IDVariant("O")), "Ordinanza", "", "", -1);
    PAN_REGISTRI.SetValueListItem(PFL_REGISTRI_TIPO, (new IDVariant("P")), "Provvedimento", "", "", -1);
    PAN_REGISTRI.SetValueListItem(PFL_REGISTRI_TIPO, (new IDVariant("T")), "Determina", "", "", -1);
    PAN_REGISTRI.SetValueListItem(PFL_REGISTRI_TIPO, (new IDVariant("A")), "Atto di Liquidazione", "", "", -1);
    PAN_REGISTRI.SetValueListItem(PFL_REGISTRI_TIPO, (new IDVariant("L")), "Lettera", "", "", -1);
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, MyGlb.PANEL_LIST, 488, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, MyGlb.PANEL_LIST, 56);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, MyGlb.PANEL_LIST, "Rif.Teso");
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, MyGlb.PANEL_FORM, 96);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_RIFTESO, MyGlb.PANEL_FORM, "Rif.Teso");
    PAN_REGISTRI.SetFieldPage(PFL_REGISTRI_RIFTESO, -1, -1);
    PAN_REGISTRI.SetFieldPanel(PFL_REGISTRI_RIFTESO, PPQRY_T13, "A.RIF_TESO", "RIF_TESO", 5, 4, 0, -13997);
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, MyGlb.PANEL_LIST, 544, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, MyGlb.PANEL_LIST, 80);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, MyGlb.PANEL_LIST, "Disab.Utenze");
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, MyGlb.PANEL_FORM, 4, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, MyGlb.PANEL_FORM, 96);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_DISABUTENZE, MyGlb.PANEL_FORM, "Disab.Utenze");
    PAN_REGISTRI.SetFieldPage(PFL_REGISTRI_DISABUTENZE, -1, -1);
    PAN_REGISTRI.SetFieldPanel(PFL_REGISTRI_DISABUTENZE, PPQRY_T13, "A.DISAB_UTENZE", "DISAB_UTENZE", 5, 2, 0, -13997);
    PAN_REGISTRI.SetValueListItem(PFL_REGISTRI_DISABUTENZE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_REGISTRI.SetValueListItem(PFL_REGISTRI_DISABUTENZE, (new IDVariant()), "Null", "", "", -1);
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, MyGlb.PANEL_LIST, 608, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 124, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_REGISTRI.SetFieldPage(PFL_REGISTRI_UTENTEINSERI, -1, -1);
    PAN_REGISTRI.SetFieldPanel(PFL_REGISTRI_UTENTEINSERI, PPQRY_T13, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, MyGlb.PANEL_LIST, 728, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 148, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_REGISTRI.SetFieldPage(PFL_REGISTRI_DATAINSERIME, -1, -1);
    PAN_REGISTRI.SetFieldPanel(PFL_REGISTRI_DATAINSERIME, PPQRY_T13, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, MyGlb.PANEL_LIST, 836, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 172, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_REGISTRI.SetFieldPage(PFL_REGISTRI_UTENTULTIAGG, -1, -1);
    PAN_REGISTRI.SetFieldPanel(PFL_REGISTRI_UTENTULTIAGG, PPQRY_T13, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, MyGlb.PANEL_LIST, 948, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_REGISTRI.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_REGISTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_REGISTRI.SetFieldPage(PFL_REGISTRI_DATAULTIMAGG, -1, -1);
    PAN_REGISTRI.SetFieldPanel(PFL_REGISTRI_DATAULTIMAGG, PPQRY_T13, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_REGISTRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_REGISTRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_REGISTRI.SetIMDB(IMDB, "PQRY_T13", true);
    PAN_REGISTRI.set_SetString(MyGlb.MASTER_ROWNAME, "T11");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.RIF_TESO as RIF_TESO, ");
    SQL.append("  A.DISAB_UTENZE as DISAB_UTENZE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_REGISTRI.SetQuery(PPQRY_T13, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T11 A ");
    PAN_REGISTRI.SetQuery(PPQRY_T13, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_REGISTRI.SetQuery(PPQRY_T13, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_REGISTRI.SetQuery(PPQRY_T13, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_REGISTRI.SetQuery(PPQRY_T13, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_REGISTRI.SetQuery(PPQRY_T13, 5, SQL, -1, "");
    PAN_REGISTRI.SetQueryDB(PPQRY_T13, MainFrm.Cf4armDBObject.DB, 4);
    PAN_REGISTRI.SetMasterTable(0, "T11");
    PAN_REGISTRI.AddToSortList(PFL_REGISTRI_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_REGISTRI.Status() == 2)
    {
      int oldListQBE = PAN_REGISTRI.iUseListQBE;
      PAN_REGISTRI.iUseListQBE = 0;
      PAN_REGISTRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_REGISTRI.PanelCommand(Glb.PCM_FIND);
      PAN_REGISTRI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_ORGADELIBOOK_MST_ORGDELBOOPAG_Init()
  {
    BUK_ORGADELIBOOK.InitMastro(BUK_ORGADELIBOOK_MST_ORGDELBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_MST_ORGDELBOOPAG, "A34FC8CF-A0CD-45DA-8D38-1ED99045AE8C");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_MST_ORGDELBOOPAG, "ORGDELBOOPAG");
    BUK_ORGADELIBOOK.InitMastroBox(BUK_ORGADELIBOOK_MST_ORGDELBOOPAG, BUK_ORGADELIBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_NUMEROPAGINA, "E779BDFB-1318-405D-8362-28AEC8FD76BA");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ORGADELIBOOK.InitBoxSpan(BUK_ORGADELIBOOK_RPTBOX_NUMEROPAGINA, BUK_ORGADELIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SPAN_NUMEROPAGINA, "2F0F449F-70B6-452D-A2CC-C51B472C5AE8");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ORGADELIBOOK.InitMastroBox(BUK_ORGADELIBOOK_MST_ORGDELBOOPAG, BUK_ORGADELIBOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25600, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_PAGEBODY, "32FD235F-38FF-4F89-85EC-10843BD523B7");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_ORGADELIBOOK.InitMastroBox(BUK_ORGADELIBOOK_MST_ORGDELBOOPAG, BUK_ORGADELIBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_TITOLO, "15A739CC-F343-4F98-A366-3ADE27DFB481");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_ORGADELIBOOK_RPT_NEWREPORT_InitQuery() { BUK_ORGADELIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_ORGADELIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.TIPO as TIPO, ");
      SQL.append("  A.RIF_TESO as RIF_TESO, ");
      SQL.append("  A.DISAB_UTENZE as DISAB_UTENZE ");
      SQL.append("from ");
      SQL.append("  T11 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_ORGADELIBOOK.SetReportQuery(BUK_ORGADELIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "4286AA48-7F5E-4B45-B1C2-1FD88281C1A8");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ORGADELIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_ORGADELIBOOK.InitReport(BUK_ORGADELIBOOK_RPT_NEWREPORT, 196609);
    BUK_ORGADELIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPT_NEWREPORT, "D315DC0D-AEC8-4C28-9F7D-2F2E251007B9");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_ORGADELIBOOK.InitSection(BUK_ORGADELIBOOK_RPT_NEWREPORT, BUK_ORGADELIBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ORGADELIBOOK.SetSectionRendersInto(BUK_ORGADELIBOOK_SEC_PAGEHEADER, BUK_ORGADELIBOOK_RPTBOX_PAGEBODY);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SEC_PAGEHEADER, "FA34D5B6-D361-4F5E-AEB3-3C8BC215DED3");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ORGADELIBOOK.InitReportBox(BUK_ORGADELIBOOK_SEC_PAGEHEADER, BUK_ORGADELIBOOK_RPTBOX_CODICEHEADER, 300, 0, 900, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_CODICEHEADER, "52FB0C55-51D8-4905-9E86-4AC3B6DF3D95");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_ORGADELIBOOK.InitBoxSpan(BUK_ORGADELIBOOK_RPTBOX_CODICEHEADER, BUK_ORGADELIBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Sede", 1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SPAN_CODICE, "50DA45B5-B2B2-43DD-ACBA-A50A905F2EDA");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SPAN_CODICE, "CODICE");
    BUK_ORGADELIBOOK.InitReportBox(BUK_ORGADELIBOOK_SEC_PAGEHEADER, BUK_ORGADELIBOOK_RPTBOX_DESCRIHEADER, 1700, 0, 8119, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_DESCRIHEADER, "1856F43D-8978-4EC8-936D-69C7C2E3F63A");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_ORGADELIBOOK.InitBoxSpan(BUK_ORGADELIBOOK_RPTBOX_DESCRIHEADER, BUK_ORGADELIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SPAN_DESCRIZIONE, "93F2B970-C2CB-48CF-BF62-2F178DF92753");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_ORGADELIBOOK.InitReportBox(BUK_ORGADELIBOOK_SEC_PAGEHEADER, BUK_ORGADELIBOOK_RPTBOX_TIPOHEADER, 10800, 0, 3200, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_TIPOHEADER, "47090F4C-6AC4-427D-974B-935AEE3E74C7");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_TIPOHEADER, "TIPOHEADER");
    BUK_ORGADELIBOOK.InitBoxSpan(BUK_ORGADELIBOOK_RPTBOX_TIPOHEADER, BUK_ORGADELIBOOK_SPAN_TIPO, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Tipo", 1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SPAN_TIPO, "65FA3404-D766-4488-A12A-01276ED56C77");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SPAN_TIPO, "TIPO");
    BUK_ORGADELIBOOK.InitReportBox(BUK_ORGADELIBOOK_SEC_PAGEHEADER, BUK_ORGADELIBOOK_RPTBOX_RIFTESOHEADE, 14500, 0, 1200, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_RIFTESOHEADE, "0D673AAB-9A37-4976-92DB-4D23967500A3");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_RIFTESOHEADE, "RIFTESOHEADE");
    BUK_ORGADELIBOOK.InitBoxSpan(BUK_ORGADELIBOOK_RPTBOX_RIFTESOHEADE, BUK_ORGADELIBOOK_SPAN_RIFTESO1, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Rif.Teso", 1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SPAN_RIFTESO1, "1D2D73BB-9B56-4DEE-AD2E-875D915D8592");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SPAN_RIFTESO1, "RIFTESO1");
    BUK_ORGADELIBOOK.InitReportBox(BUK_ORGADELIBOOK_SEC_PAGEHEADER, BUK_ORGADELIBOOK_RPTBOX_DISUTE11HEA1, 16300, 0, 2000, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_DISUTE11HEA1, "5FEFCF1A-CFCB-4208-BCEB-0F839C0679B7");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_DISUTE11HEA1, "DISUTE11HEA1");
    BUK_ORGADELIBOOK.InitBoxSpan(BUK_ORGADELIBOOK_RPTBOX_DISUTE11HEA1, BUK_ORGADELIBOOK_SPAN_RIFTESO, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Disab. Utenze", 1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SPAN_RIFTESO, "EE47663A-AAEA-4730-A942-D25D4AF151DE");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SPAN_RIFTESO, "RIFTESO");
    BUK_ORGADELIBOOK.InitSection(BUK_ORGADELIBOOK_RPT_NEWREPORT, BUK_ORGADELIBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ORGADELIBOOK.SetSectionRendersInto(BUK_ORGADELIBOOK_SEC_TITOLO, BUK_ORGADELIBOOK_RPTBOX_TITOLO);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SEC_TITOLO, "6884A433-7928-4B01-BDC3-6A65DDCF00C2");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SEC_TITOLO, "TITOLO");
    BUK_ORGADELIBOOK.InitReportBox(BUK_ORGADELIBOOK_SEC_TITOLO, BUK_ORGADELIBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_NEWBOX, "9EAD7C6A-C53D-4D23-BBCB-7CAB80928FE0");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_ORGADELIBOOK.InitBoxSpan(BUK_ORGADELIBOOK_RPTBOX_NEWBOX, BUK_ORGADELIBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Sedi Deliberative", 1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SPAN_VARIADIBILAN, "BB9BC474-6F20-46F1-8669-8F40C34F976C");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_ORGADELIBOOK.InitSection(BUK_ORGADELIBOOK_RPT_NEWREPORT, BUK_ORGADELIBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ORGADELIBOOK.SetSectionRendersInto(BUK_ORGADELIBOOK_SEC_DETAIL, BUK_ORGADELIBOOK_RPTBOX_PAGEBODY);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SEC_DETAIL, "22BCBD37-622A-43EB-A419-C9338EA58E28");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SEC_DETAIL, "DETAIL");
    BUK_ORGADELIBOOK.InitReportBox(BUK_ORGADELIBOOK_SEC_DETAIL, BUK_ORGADELIBOOK_RPTBOX_CODICE, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_CODICE, "0F31468A-3B91-4FC1-9B37-9DAE549F312D");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_CODICE, "CODICE");
    BUK_ORGADELIBOOK.InitBoxSpan(BUK_ORGADELIBOOK_RPTBOX_CODICE, BUK_ORGADELIBOOK_SPAN_T1COREORDEBO, MyGlb.VIS_DEFAREPOSTYL, 5, 4, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SPAN_T1COREORDEBO, "29A63A28-0B19-4415-9A7C-6AD55B6AF17D");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SPAN_T1COREORDEBO, "T1COREORDEBO");
    BUK_ORGADELIBOOK.InitReportBox(BUK_ORGADELIBOOK_SEC_DETAIL, BUK_ORGADELIBOOK_RPTBOX_DESCRIZIONE, 1700, 0, 8900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_DESCRIZIONE, "CAAF7669-2D7F-4028-8603-DB479D305272");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_ORGADELIBOOK.InitBoxSpan(BUK_ORGADELIBOOK_RPTBOX_DESCRIZIONE, BUK_ORGADELIBOOK_SPAN_T1DEREORDEBO, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SPAN_T1DEREORDEBO, "E14E610C-D9C2-4B33-923E-4BC61D7A5B7A");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SPAN_T1DEREORDEBO, "T1DEREORDEBO");
    BUK_ORGADELIBOOK.InitReportBox(BUK_ORGADELIBOOK_SEC_DETAIL, BUK_ORGADELIBOOK_RPTBOX_TIPO, 10800, 0, 3200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_TIPO, "75AA2D6D-3087-4754-9AE7-DBB699FFDCE5");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_TIPO, "TIPO");
    BUK_ORGADELIBOOK.InitBoxSpan(BUK_ORGADELIBOOK_RPTBOX_TIPO, BUK_ORGADELIBOOK_SPAN_T1TIREORDEBO, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::TIPO", 1);
    BUK_ORGADELIBOOK.SetSpanValueListItem(BUK_ORGADELIBOOK_SPAN_T1TIREORDEBO, "Delibera", "Type the value and explain what it means.", (new IDVariant("D")), null, "", -1);
    BUK_ORGADELIBOOK.SetSpanValueListItem(BUK_ORGADELIBOOK_SPAN_T1TIREORDEBO, "Ordinanza", "Type the value and explain what it means.", (new IDVariant("O")), null, "", -1);
    BUK_ORGADELIBOOK.SetSpanValueListItem(BUK_ORGADELIBOOK_SPAN_T1TIREORDEBO, "Provvedimento", "Type the value and explain what it means.", (new IDVariant("P")), null, "", -1);
    BUK_ORGADELIBOOK.SetSpanValueListItem(BUK_ORGADELIBOOK_SPAN_T1TIREORDEBO, "Determina", "Type the value and explain what it means.", (new IDVariant("T")), null, "", -1);
    BUK_ORGADELIBOOK.SetSpanValueListItem(BUK_ORGADELIBOOK_SPAN_T1TIREORDEBO, "Atto di Liquidazione", "Type the value and explain what it means.", (new IDVariant("A")), null, "", -1);
    BUK_ORGADELIBOOK.SetSpanValueListItem(BUK_ORGADELIBOOK_SPAN_T1TIREORDEBO, "Lettera", "Type the value and explain what it means.", (new IDVariant("L")), null, "", -1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SPAN_T1TIREORDEBO, "48853959-8F82-4501-8D4A-431D8C0B7F75");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SPAN_T1TIREORDEBO, "T1TIREORDEBO");
    BUK_ORGADELIBOOK.InitReportBox(BUK_ORGADELIBOOK_SEC_DETAIL, BUK_ORGADELIBOOK_RPTBOX_RIFTESO, 14500, 0, 1200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_RIFTESO, "EDBEDC50-9C97-40D5-A520-E6CC20CDBF89");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_RIFTESO, "RIFTESO");
    BUK_ORGADELIBOOK.InitBoxSpan(BUK_ORGADELIBOOK_RPTBOX_RIFTESO, BUK_ORGADELIBOOK_SPAN_T1RITEREORDB, MyGlb.VIS_DEFAREPOSTYL, 5, 4, 0, 271384705, "Brief description of field content.", "::RIF_TESO", 1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SPAN_T1RITEREORDB, "30E10EFA-32F7-4146-9086-91C32D1837EB");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SPAN_T1RITEREORDB, "T1RITEREORDB");
    BUK_ORGADELIBOOK.InitReportBox(BUK_ORGADELIBOOK_SEC_DETAIL, BUK_ORGADELIBOOK_RPTBOX_DISABUTENZE1, 16800, 0, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_RPTBOX_DISABUTENZE1, "131A9219-CBB0-4670-A1B6-21245CBFE63C");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_RPTBOX_DISABUTENZE1, "DISABUTENZE1");
    BUK_ORGADELIBOOK.InitBoxSpan(BUK_ORGADELIBOOK_RPTBOX_DISABUTENZE1, BUK_ORGADELIBOOK_SPAN_NUVATDURODBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_ORGADELIBOOK.SetSpanValueListItem(BUK_ORGADELIBOOK_SPAN_NUVATDURODBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_ORGADELIBOOK.SetSpanValueListItem(BUK_ORGADELIBOOK_SPAN_NUVATDURODBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SPAN_NUVATDURODBN, "CE70EFE3-5827-40E8-9E5F-E5EC878B2894");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SPAN_NUVATDURODBN, "NUVATDURODBN");
    BUK_ORGADELIBOOK.InitSection(BUK_ORGADELIBOOK_RPT_NEWREPORT, BUK_ORGADELIBOOK_SEC_PAGEFOOTER, 400, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ORGADELIBOOK.SetSectionRendersInto(BUK_ORGADELIBOOK_SEC_PAGEFOOTER, BUK_ORGADELIBOOK_RPTBOX_PAGEBODY);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SEC_PAGEFOOTER, "3A5610B0-24A7-4DFA-8FBC-FB0F09E93E31");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_ORGADELIBOOK.InitSection(BUK_ORGADELIBOOK_RPT_NEWREPORT, BUK_ORGADELIBOOK_SEC_REPORTFOOTER, 500, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ORGADELIBOOK.SetSectionRendersInto(BUK_ORGADELIBOOK_SEC_REPORTFOOTER, BUK_ORGADELIBOOK_RPTBOX_PAGEBODY);
    BUK_ORGADELIBOOK.SetRTCGuid(BUK_ORGADELIBOOK_SEC_REPORTFOOTER, "9903AE42-B873-487D-935D-B99B01C00447");
    BUK_ORGADELIBOOK.SetObjCode(BUK_ORGADELIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ORGADELIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_ORGADELIBOOK_InitLinks()
  {
    BUK_ORGADELIBOOK.SetBoxNextBox(BUK_ORGADELIBOOK_RPTBOX_PAGEBODY, BUK_ORGADELIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_REGISTRI) PAN_REGISTRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_REGISTRI) PAN_REGISTRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_REGISTRI) PAN_REGISTRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_REGISTRI) PAN_REGISTRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_REGISTRI) PAN_REGISTRI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_REGISTRI) PAN_REGISTRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_ORGADELIBOOK) BUK_ORGADELIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ORGADELIBOOK) BUK_ORGADELIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ORGADELIBOOK) BUK_ORGADELIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ORGADELIBOOK) BUK_ORGADELIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ORGADELIBOOK) BUK_ORGADELIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ORGADELIBOOK) BUK_ORGADELIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ORGADELIBOOK) BUK_ORGADELIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ORGADELIBOOK) BUK_ORGADELIBOOK_OnPreview();
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
