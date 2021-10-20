// **********************************************
// Tipi Motivazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiMotivazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPIMOTIVAZI_CODICE = 0;
  private static int PFL_TIPIMOTIVAZI_DESCRIZIONE = 1;

  private static int PPQRY_TIPIMOTIVAZ1 = 0;


  IDPanel PAN_TIPIMOTIVAZI;
  CIDREObj BUK_TIPIMOTIBOOK;
  OBook BKW_TIPIMOTIBOOK;
  //
  // Template Pages constants
  private static int BUK_TIPIMOTIBOOK_MST_TIPMOTBOOPAG = 1;
  private static int BUK_TIPIMOTIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_TIPIMOTIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_TIPIMOTIBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_TIPIMOTIBOOK_SPAN_TIPIMOTIVAZI = 5;
  private static int BUK_TIPIMOTIBOOK_RPTBOX_PAGEBODY = 6;

  //
  // Reports constants
  private static int BUK_TIPIMOTIBOOK_RPT_NEWREPORT = 7;
  private static int BUK_TIPIMOTIBOOK_SEC_REPORTHEADER = 8;
  private static int BUK_TIPIMOTIBOOK_SEC_PAGEHEADER = 9;
  private static int BUK_TIPIMOTIBOOK_RPTBOX_CODICEHEADER = 10;
  private static int BUK_TIPIMOTIBOOK_SPAN_CODICE = 11;
  private static int BUK_TIPIMOTIBOOK_RPTBOX_DESCRIHEADER = 12;
  private static int BUK_TIPIMOTIBOOK_SPAN_DESCRIZIONE = 13;
  private static int BUK_TIPIMOTIBOOK_SEC_DETAIL = 14;
  private static int BUK_TIPIMOTIBOOK_RPTBOX_CODICE = 15;
  private static int BUK_TIPIMOTIBOOK_SPAN_TIMOCOTIMTMB = 16;
  private static int BUK_TIPIMOTIBOOK_RPTBOX_DESCRIZIONE = 17;
  private static int BUK_TIPIMOTIBOOK_SPAN_TIMODETIMTMB = 18;
  private static int BUK_TIPIMOTIBOOK_SEC_PAGEFOOTER = 19;
  private static int BUK_TIPIMOTIBOOK_SEC_REPORTFOOTER = 20;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_TIPIMOTIVAZ1(IMDB);
    Init_PQRY_TIPIMOTIVAZI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_TIPIMOTIVAZ1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_TIPIMOTIVAZ1, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_TIPIMOTIVAZ1, "PQRY_TIPIMOTIVAZ1");
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIMOTIVAZ1,IMDBDef8.PQSL_TIPIMOTIVAZ1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIMOTIVAZ1,IMDBDef8.PQSL_TIPIMOTIVAZ1_CODICE,5,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIMOTIVAZ1,IMDBDef8.PQSL_TIPIMOTIVAZ1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIMOTIVAZ1,IMDBDef8.PQSL_TIPIMOTIVAZ1_DESCRIZIONE,5,40,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_TIPIMOTIVAZ1, 0);
  }

  private static void Init_PQRY_TIPIMOTIVAZI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_TIPIMOTIVAZI, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_TIPIMOTIVAZI, "PQRY_TIPIMOTIVAZI");
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIMOTIVAZI,IMDBDef8.PQSL_TIPIMOTIVAZI_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIMOTIVAZI,IMDBDef8.PQSL_TIPIMOTIVAZI_CODICE,5,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_TIPIMOTIVAZI,IMDBDef8.PQSL_TIPIMOTIVAZI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_TIPIMOTIVAZI,IMDBDef8.PQSL_TIPIMOTIVAZI_DESCRIZIONE,5,40,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_TIPIMOTIVAZI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiMotivazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiMotivazione()
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
    FormIdx = MyGlb.FRM_TIPIMOTIVAZI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "65457D2E-B4BA-46D7-A81D-FC3230C0FF77";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 692;
    DesignHeight = 406;
    set_Caption(new IDVariant("Tipi Motivazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 692;
    Frames[1].Height = 380;
    Frames[1].Caption = "Tipi Motivazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 380;
    PAN_TIPIMOTIVAZI = new IDPanel(w, this, 1, "PAN_TIPIMOTIVAZI");
    Frames[1].Content = PAN_TIPIMOTIVAZI;
    PAN_TIPIMOTIVAZI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIMOTIVAZI.VS = MainFrm.VisualStyleList;
    PAN_TIPIMOTIVAZI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 692-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_TIPIMOTIBOOK != null)
      PAN_TIPIMOTIVAZI.SetBook(BUK_TIPIMOTIBOOK);
    PAN_TIPIMOTIVAZI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F6725769-AB1D-437C-BF16-05F16EE1D2E1");
    PAN_TIPIMOTIVAZI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 404, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPIMOTIVAZI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIMOTIVAZI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIMOTIVAZI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIMOTIVAZI.InitStatus = 2;
    PAN_TIPIMOTIVAZI_Init();
    PAN_TIPIMOTIVAZI_InitFields();
    PAN_TIPIMOTIVAZI_InitQueries();
    BKW_TIPIMOTIBOOK = new OBook(this);
    BUK_TIPIMOTIBOOK = new CIDREObj(BKW_TIPIMOTIBOOK);
    BKW_TIPIMOTIBOOK.iGuid = "EA954344-C056-41A6-BF56-6D54769714BD";
    BKW_TIPIMOTIBOOK.Code = "BUK_TIPIMOTIBOOK";
    BKW_TIPIMOTIBOOK.BookObj = BUK_TIPIMOTIBOOK;
    BKW_TIPIMOTIBOOK.InitDefMasks();
    BUK_TIPIMOTIBOOK.InitBook(1, 1245185, "Tipi Motivazione Book", IMDB, MainFrm.VisualStyleList);
    BUK_TIPIMOTIBOOK.InitHTML();
    BUK_TIPIMOTIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_TIPIMOTIBOOK.Book.SetMainFrm(MainFrm);
    BUK_TIPIMOTIBOOK.SetRTCGuid(0, "EA954344-C056-41A6-BF56-6D54769714BD");
    BUK_TIPIMOTIBOOK.SetObjCode(0, "TIPIMOTIBOOK");
    if (PAN_TIPIMOTIVAZI != null)
      PAN_TIPIMOTIVAZI.SetBook(BUK_TIPIMOTIBOOK);
    BUK_TIPIMOTIBOOK_MST_TIPMOTBOOPAG_Init();
    BUK_TIPIMOTIBOOK_RPT_NEWREPORT_Init();
    BUK_TIPIMOTIBOOK_InitLinks();
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
      PAN_TIPIMOTIVAZI.UpdatePanel(MainFrm);
      // BUK_TIPIMOTIBOOK.UpdateBook();
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
    if (Code.equals("BUK_TIPIMOTIBOOK")) return BUK_TIPIMOTIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof TipiMotivazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiMotivazione.class.getName() : (Glb.ClassWithPackage(TipiMotivazione.class) ? TipiMotivazione.class.getName().substring(TipiMotivazione.class.getPackage().getName().length() + 1) : TipiMotivazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tipi Motivazione On Database Error Event
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
  private void PAN_TIPIMOTIVAZI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_TIPIMOTIVAZI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Tipi Motivazione On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazione", "TipiMotivazioneOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Motivazione On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIMOTIVAZI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPIMOTIVAZI);
      // 
      // Tipi Motivazione On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_TIPIMOTIVAZI.IsNewRow())
      {
        PAN_TIPIMOTIVAZI.SetFlags (Glb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIMOTIVAZI.SetFlags (Glb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_TIPIMOTIVAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIMOTIVAZI_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_TIPIMOTIVAZ1, IMDBDef8.PQSL_TIPIMOTIVAZ1_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazione", "TipiMotivazioneOnDynamicPropertiesEvent", _e);
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
      Frames[PAN_TIPIMOTIVAZI.FrIndex].set_Caption(IDL.Add((new IDVariant(Frames[PAN_TIPIMOTIVAZI.FrIndex].Caption)), MainFrm.ESERCIZIO).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiMotivazione", "LoadEvent", _e);
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
  private void PAN_TIPIMOTIVAZI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIMOTIVAZI, Cancel);
    // Stub
  }

  private void PAN_TIPIMOTIVAZI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPIMOTIVAZI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIMOTIVAZI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIMOTIVAZI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_TIPIMOTIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_TIPIMOTIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_TIPIMOTIBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_TIPIMOTIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_TIPIMOTIBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_TIPIMOTIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_TIPIMOTIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_TIPIMOTIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_TIPIMOTIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_TIPIMOTIBOOK_MST_TIPMOTBOOPAG)
    {
      BUK_TIPIMOTIBOOK.set_SpanValue(BUK_TIPIMOTIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPIMOTIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_TIPIMOTIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_TIPIMOTIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_TIPIMOTIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_TIPIMOTIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_TIPIMOTIBOOK_OnPreview()
  {
    PreviewBook = BKW_TIPIMOTIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPIMOTIVAZI_Init()
  {

    PAN_TIPIMOTIVAZI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIMOTIVAZI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPIMOTIVAZI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_TIPIMOTIVAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, "AAA5516E-315C-4CCD-A377-FBDF1B6FE1FB");
    PAN_TIPIMOTIVAZI.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, "Codice");
    PAN_TIPIMOTIVAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, "");
    PAN_TIPIMOTIVAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIMOTIVAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_TIPIMOTIVAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, "9F7EE7DB-A0CE-4BCC-B708-92F706BE8D98");
    PAN_TIPIMOTIVAZI.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, "Descrizione");
    PAN_TIPIMOTIVAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, "");
    PAN_TIPIMOTIVAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIMOTIVAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPIMOTIVAZI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIMOTIVAZI.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIMOTIVAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_TIPIMOTIVAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIMOTIVAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPIMOTIVAZI.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIMOTIVAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_TIPIMOTIVAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIMOTIVAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPIMOTIVAZI.SetFieldPage(PFL_TIPIMOTIVAZI_CODICE, -1, -1);
    PAN_TIPIMOTIVAZI.SetFieldPanel(PFL_TIPIMOTIVAZI_CODICE, PPQRY_TIPIMOTIVAZ1, "A.CODICE", "CODICE", 5, 3, 0, -13997);
    PAN_TIPIMOTIVAZI.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 348, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIMOTIVAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_TIPIMOTIVAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIMOTIVAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPIMOTIVAZI.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIMOTIVAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_TIPIMOTIVAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIMOTIVAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIMOTIVAZI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPIMOTIVAZI.SetFieldPage(PFL_TIPIMOTIVAZI_DESCRIZIONE, -1, -1);
    PAN_TIPIMOTIVAZI.SetFieldPanel(PFL_TIPIMOTIVAZI_DESCRIZIONE, PPQRY_TIPIMOTIVAZ1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
  }

  private void PAN_TIPIMOTIVAZI_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIMOTIVAZI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPIMOTIVAZI.SetIMDB(IMDB, "PQRY_TIPIMOTIVAZ1", true);
    PAN_TIPIMOTIVAZI.set_SetString(MyGlb.MASTER_ROWNAME, "TIPI MOTIVAZIONE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_TIPIMOTIVAZI.SetQuery(PPQRY_TIPIMOTIVAZ1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE A ");
    PAN_TIPIMOTIVAZI.SetQuery(PPQRY_TIPIMOTIVAZ1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIMOTIVAZI.SetQuery(PPQRY_TIPIMOTIVAZ1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIMOTIVAZI.SetQuery(PPQRY_TIPIMOTIVAZ1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIMOTIVAZI.SetQuery(PPQRY_TIPIMOTIVAZ1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIMOTIVAZI.SetQuery(PPQRY_TIPIMOTIVAZ1, 5, SQL, -1, "");
    PAN_TIPIMOTIVAZI.SetQueryDB(PPQRY_TIPIMOTIVAZ1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIMOTIVAZI.SetMasterTable(0, "TIPI_MOTIVAZIONE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIMOTIVAZI.Status() == 2)
    {
      int oldListQBE = PAN_TIPIMOTIVAZI.iUseListQBE;
      PAN_TIPIMOTIVAZI.iUseListQBE = 0;
      PAN_TIPIMOTIVAZI.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIMOTIVAZI.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIMOTIVAZI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_TIPIMOTIBOOK_MST_TIPMOTBOOPAG_Init()
  {
    BUK_TIPIMOTIBOOK.InitMastro(BUK_TIPIMOTIBOOK_MST_TIPMOTBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_MST_TIPMOTBOOPAG, "6ABACECC-4445-438D-8151-B5C9782AFB99");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_MST_TIPMOTBOOPAG, "TIPMOTBOOPAG");
    BUK_TIPIMOTIBOOK.InitMastroBox(BUK_TIPIMOTIBOOK_MST_TIPMOTBOOPAG, BUK_TIPIMOTIBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_RPTBOX_NUMEROPAGINA, "66A2DBAA-5BB8-475C-91C1-EDC533CFD781");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPIMOTIBOOK.InitBoxSpan(BUK_TIPIMOTIBOOK_RPTBOX_NUMEROPAGINA, BUK_TIPIMOTIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_SPAN_NUMEROPAGINA, "6CA45EFC-B8C6-44C1-A9A3-8B67315EDA75");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_TIPIMOTIBOOK.InitMastroBox(BUK_TIPIMOTIBOOK_MST_TIPMOTBOOPAG, BUK_TIPIMOTIBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 1200, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_RPTBOX_PAGEHEADER, "7D1F00CC-0DD5-4D41-A947-432F12AB38B0");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_TIPIMOTIBOOK.InitBoxSpan(BUK_TIPIMOTIBOOK_RPTBOX_PAGEHEADER, BUK_TIPIMOTIBOOK_SPAN_TIPIMOTIVAZI, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Tipi Motivazione", 1);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_SPAN_TIPIMOTIVAZI, "58EE445D-A141-4FAD-9844-95DC7CC9451C");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_SPAN_TIPIMOTIVAZI, "TIPIMOTIVAZI");
    BUK_TIPIMOTIBOOK.InitMastroBox(BUK_TIPIMOTIBOOK_MST_TIPMOTBOOPAG, BUK_TIPIMOTIBOOK_RPTBOX_PAGEBODY, 1000, 2700, 19000, 26000, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_RPTBOX_PAGEBODY, "8F83D1A9-CE53-460D-996B-84B44E419DAF");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_TIPIMOTIBOOK_RPT_NEWREPORT_InitQuery() { BUK_TIPIMOTIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_TIPIMOTIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  TIPI_MOTIVAZIONE A ");
      BUK_TIPIMOTIBOOK.SetReportQuery(BUK_TIPIMOTIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "A9FDDA0A-68BB-4AD0-935F-9F29A5754F5B");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_TIPIMOTIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_TIPIMOTIBOOK.InitReport(BUK_TIPIMOTIBOOK_RPT_NEWREPORT, 196609);
    BUK_TIPIMOTIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_RPT_NEWREPORT, "500E21B7-989B-4C25-96BE-8455E1BF4738");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_TIPIMOTIBOOK.InitSection(BUK_TIPIMOTIBOOK_RPT_NEWREPORT, BUK_TIPIMOTIBOOK_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIMOTIBOOK.SetSectionRendersInto(BUK_TIPIMOTIBOOK_SEC_REPORTHEADER, BUK_TIPIMOTIBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_SEC_REPORTHEADER, "3FE0CE6F-BD6B-41EC-830E-40398A6CFFE3");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_TIPIMOTIBOOK.InitSection(BUK_TIPIMOTIBOOK_RPT_NEWREPORT, BUK_TIPIMOTIBOOK_SEC_PAGEHEADER, 600, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIMOTIBOOK.SetSectionRendersInto(BUK_TIPIMOTIBOOK_SEC_PAGEHEADER, BUK_TIPIMOTIBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_SEC_PAGEHEADER, "34BE0B84-0FF4-4B8C-BD02-3BB83AC59AD7");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_TIPIMOTIBOOK.InitReportBox(BUK_TIPIMOTIBOOK_SEC_PAGEHEADER, BUK_TIPIMOTIBOOK_RPTBOX_CODICEHEADER, 100, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_RPTBOX_CODICEHEADER, "CAE27631-AAD8-4CE1-990C-9586C00EA5FB");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_TIPIMOTIBOOK.InitBoxSpan(BUK_TIPIMOTIBOOK_RPTBOX_CODICEHEADER, BUK_TIPIMOTIBOOK_SPAN_CODICE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_SPAN_CODICE, "CD7A41B2-520E-4C05-8F59-CD8B2E00A5F4");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_SPAN_CODICE, "CODICE");
    BUK_TIPIMOTIBOOK.InitReportBox(BUK_TIPIMOTIBOOK_SEC_PAGEHEADER, BUK_TIPIMOTIBOOK_RPTBOX_DESCRIHEADER, 1700, 0, 16700, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_RPTBOX_DESCRIHEADER, "F5FB79C8-65FD-461F-99B9-2CBE4FE2637E");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_TIPIMOTIBOOK.InitBoxSpan(BUK_TIPIMOTIBOOK_RPTBOX_DESCRIHEADER, BUK_TIPIMOTIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_SPAN_DESCRIZIONE, "27B3A004-53F1-45D9-9BCD-BEAC1F6C9802");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_TIPIMOTIBOOK.InitSection(BUK_TIPIMOTIBOOK_RPT_NEWREPORT, BUK_TIPIMOTIBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_TIPIMOTIBOOK.SetSectionRendersInto(BUK_TIPIMOTIBOOK_SEC_DETAIL, BUK_TIPIMOTIBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_SEC_DETAIL, "8F39FBB9-4193-4DAA-BB8E-CB5CD40EE29D");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_SEC_DETAIL, "DETAIL");
    BUK_TIPIMOTIBOOK.InitReportBox(BUK_TIPIMOTIBOOK_SEC_DETAIL, BUK_TIPIMOTIBOOK_RPTBOX_CODICE, 100, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_RPTBOX_CODICE, "FBF07C21-D306-4651-8E17-407224DF4503");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_RPTBOX_CODICE, "CODICE");
    BUK_TIPIMOTIBOOK.InitBoxSpan(BUK_TIPIMOTIBOOK_RPTBOX_CODICE, BUK_TIPIMOTIBOOK_SPAN_TIMOCOTIMTMB, MyGlb.VIS_DEFAREPOSTYL, 5, 3, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_SPAN_TIMOCOTIMTMB, "552180C8-D10D-4596-A809-D97AF717AF12");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_SPAN_TIMOCOTIMTMB, "TIMOCOTIMTMB");
    BUK_TIPIMOTIBOOK.InitReportBox(BUK_TIPIMOTIBOOK_SEC_DETAIL, BUK_TIPIMOTIBOOK_RPTBOX_DESCRIZIONE, 1700, 0, 16700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_RPTBOX_DESCRIZIONE, "DC240420-C140-4ADF-B31E-DC2DBF471BE2");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_TIPIMOTIBOOK.InitBoxSpan(BUK_TIPIMOTIBOOK_RPTBOX_DESCRIZIONE, BUK_TIPIMOTIBOOK_SPAN_TIMODETIMTMB, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_SPAN_TIMODETIMTMB, "BFACF2E5-3005-4494-AAC2-ECDAEFE09B67");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_SPAN_TIMODETIMTMB, "TIMODETIMTMB");
    BUK_TIPIMOTIBOOK.InitSection(BUK_TIPIMOTIBOOK_RPT_NEWREPORT, BUK_TIPIMOTIBOOK_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_TIPIMOTIBOOK.SetSectionRendersInto(BUK_TIPIMOTIBOOK_SEC_PAGEFOOTER, BUK_TIPIMOTIBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_SEC_PAGEFOOTER, "5064B3E9-DC66-4FA1-97D7-A28998EA513C");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_TIPIMOTIBOOK.InitSection(BUK_TIPIMOTIBOOK_RPT_NEWREPORT, BUK_TIPIMOTIBOOK_SEC_REPORTFOOTER, 300, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_TIPIMOTIBOOK.SetSectionRendersInto(BUK_TIPIMOTIBOOK_SEC_REPORTFOOTER, BUK_TIPIMOTIBOOK_RPTBOX_PAGEBODY);
    BUK_TIPIMOTIBOOK.SetRTCGuid(BUK_TIPIMOTIBOOK_SEC_REPORTFOOTER, "FD392614-6425-4076-8A74-EE42BB0E81F1");
    BUK_TIPIMOTIBOOK.SetObjCode(BUK_TIPIMOTIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_TIPIMOTIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_TIPIMOTIBOOK_InitLinks()
  {
    BUK_TIPIMOTIBOOK.SetBoxNextBox(BUK_TIPIMOTIBOOK_RPTBOX_PAGEBODY, BUK_TIPIMOTIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPIMOTIVAZI) PAN_TIPIMOTIVAZI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIMOTIVAZI) PAN_TIPIMOTIVAZI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPIMOTIVAZI) PAN_TIPIMOTIVAZI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIMOTIVAZI) PAN_TIPIMOTIVAZI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPIMOTIVAZI) PAN_TIPIMOTIVAZI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_TIPIMOTIBOOK) BUK_TIPIMOTIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_TIPIMOTIBOOK) BUK_TIPIMOTIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_TIPIMOTIBOOK) BUK_TIPIMOTIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_TIPIMOTIBOOK) BUK_TIPIMOTIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_TIPIMOTIBOOK) BUK_TIPIMOTIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_TIPIMOTIBOOK) BUK_TIPIMOTIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_TIPIMOTIBOOK) BUK_TIPIMOTIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_TIPIMOTIBOOK) BUK_TIPIMOTIBOOK_OnPreview();
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
