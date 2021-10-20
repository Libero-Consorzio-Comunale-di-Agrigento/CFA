// **********************************************
// Fattori Old
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FattoriOld extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FATTORI_CODICE = 0;
  private static int PFL_FATTORI_DESCRIZIONE = 1;
  private static int PFL_FATTORI_TIPO = 2;

  private static int PPQRY_FATTORI3 = 0;


  IDPanel PAN_FATTORI;
  CIDREObj BUK_FATTORIBOOK;
  OBook BKW_FATTORIBOOK;
  //
  // Template Pages constants
  private static int BUK_FATTORIBOOK_MST_FATTBOOKPAGE = 1;
  private static int BUK_FATTORIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_FATTORIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_FATTORIBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_FATTORIBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_FATTORIBOOK_RPT_NEWREPORT = 6;
  private static int BUK_FATTORIBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_FATTORIBOOK_SEC_PAGEHEADER = 8;
  private static int BUK_FATTORIBOOK_RPTBOX_FATTORHEADER = 9;
  private static int BUK_FATTORIBOOK_SPAN_CODICE = 10;
  private static int BUK_FATTORIBOOK_RPTBOX_DESCRIHEADER = 11;
  private static int BUK_FATTORIBOOK_SPAN_DESCRIZIONE = 12;
  private static int BUK_FATTORIBOOK_RPTBOX_TIPOHEADER = 13;
  private static int BUK_FATTORIBOOK_SPAN_TIPO = 14;
  private static int BUK_FATTORIBOOK_SEC_TITOLO = 15;
  private static int BUK_FATTORIBOOK_RPTBOX_NEWBOX = 16;
  private static int BUK_FATTORIBOOK_SPAN_VARIADIBILAN = 17;
  private static int BUK_FATTORIBOOK_SEC_DETAIL = 18;
  private static int BUK_FATTORIBOOK_RPTBOX_FATTORE = 19;
  private static int BUK_FATTORIBOOK_SPAN_FACOFAOLFABO = 20;
  private static int BUK_FATTORIBOOK_RPTBOX_DESCRIZIONE = 21;
  private static int BUK_FATTORIBOOK_SPAN_FADEFAOLFABO = 22;
  private static int BUK_FATTORIBOOK_RPTBOX_TIPO = 23;
  private static int BUK_FATTORIBOOK_SPAN_FATIFAOLFABO = 24;
  private static int BUK_FATTORIBOOK_SEC_REPORTFOOTER = 25;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_FATTORI3(IMDB);
    Init_PQRY_FATTORI4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_FATTORI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FATTORI3, 3);
    IMDB.set_TblCode(IMDBDef9.PQRY_FATTORI3, "PQRY_FATTORI3");
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI3,IMDBDef9.PQSL_FATTORI3_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI3,IMDBDef9.PQSL_FATTORI3_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI3,IMDBDef9.PQSL_FATTORI3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI3,IMDBDef9.PQSL_FATTORI3_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI3,IMDBDef9.PQSL_FATTORI3_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI3,IMDBDef9.PQSL_FATTORI3_TIPO,5,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_FATTORI3, 0);
  }

  private static void Init_PQRY_FATTORI4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_FATTORI4, 3);
    IMDB.set_TblCode(IMDBDef9.PQRY_FATTORI4, "PQRY_FATTORI4");
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI4,IMDBDef9.PQSL_FATTORI4_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI4,IMDBDef9.PQSL_FATTORI4_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI4,IMDBDef9.PQSL_FATTORI4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI4,IMDBDef9.PQSL_FATTORI4_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_FATTORI4,IMDBDef9.PQSL_FATTORI4_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_FATTORI4,IMDBDef9.PQSL_FATTORI4_TIPO,5,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_FATTORI4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FattoriOld(MyWebEntryPoint w, IMDBObj imdb)
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
  public FattoriOld()
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
    FormIdx = MyGlb.FRM_FATTORIOLD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4391A0E9-1F5B-4FF3-AE8A-C3AA6F3CCE81";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 624;
    DesignHeight = 370;
    set_Caption(new IDVariant("Fattori Old"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 624;
    Frames[1].Height = 344;
    Frames[1].Caption = "Fattori";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    PAN_FATTORI = new IDPanel(w, this, 1, "PAN_FATTORI");
    Frames[1].Content = PAN_FATTORI;
    PAN_FATTORI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FATTORI.VS = MainFrm.VisualStyleList;
    PAN_FATTORI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 624-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_FATTORIBOOK != null)
      PAN_FATTORI.SetBook(BUK_FATTORIBOOK);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "46B0D791-49EB-421A-AD6B-E3B15FE8CC57");
    PAN_FATTORI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 580, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FATTORI.InitStatus = 2;
    PAN_FATTORI_Init();
    PAN_FATTORI_InitFields();
    PAN_FATTORI_InitQueries();
    BKW_FATTORIBOOK = new OBook(this);
    BUK_FATTORIBOOK = new CIDREObj(BKW_FATTORIBOOK);
    BKW_FATTORIBOOK.iGuid = "B3F9163A-EBA1-4070-8542-680BFBD6FEBF";
    BKW_FATTORIBOOK.Code = "BUK_FATTORIBOOK";
    BKW_FATTORIBOOK.BookObj = BUK_FATTORIBOOK;
    BKW_FATTORIBOOK.InitDefMasks();
    BUK_FATTORIBOOK.InitBook(1, 1245185, "Fattori Book", IMDB, MainFrm.VisualStyleList);
    BUK_FATTORIBOOK.InitHTML();
    BUK_FATTORIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_FATTORIBOOK.Book.SetMainFrm(MainFrm);
    BUK_FATTORIBOOK.SetRTCGuid(0, "B3F9163A-EBA1-4070-8542-680BFBD6FEBF");
    BUK_FATTORIBOOK.SetObjCode(0, "FATTORIBOOK");
    if (PAN_FATTORI != null)
      PAN_FATTORI.SetBook(BUK_FATTORIBOOK);
    BUK_FATTORIBOOK_MST_FATTBOOKPAGE_Init();
    BUK_FATTORIBOOK_RPT_NEWREPORT_Init();
    BUK_FATTORIBOOK_InitLinks();
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
      PAN_FATTORI.UpdatePanel(MainFrm);
      // BUK_FATTORIBOOK.UpdateBook();
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
    if (Code.equals("BUK_FATTORIBOOK")) return BUK_FATTORIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof FattoriOld);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FattoriOld.class.getName() : (Glb.ClassWithPackage(FattoriOld.class) ? FattoriOld.class.getName().substring(FattoriOld.class.getPackage().getName().length() + 1) : FattoriOld.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Fattori On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FATTORI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FATTORI);
      // 
      // Fattori On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_FATTORI.IsNewRow()))
      {
        PAN_FATTORI.SetFlags (Glb.OBJ_FIELD, PFL_FATTORI_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_FATTORI.SetFlags (Glb.OBJ_FIELD, PFL_FATTORI_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_FATTORI.set_ToolTip(Glb.OBJ_FIELD,PFL_FATTORI_DESCRIZIONE,(new IDVariant(PAN_FATTORI.FieldText(PFL_FATTORI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattoriOld", "FattoriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Fattori On Database Error Event
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
  private void PAN_FATTORI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_FATTORI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Fattori On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattoriOld", "FattoriOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Fattori On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_FATTORI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fattori On Command Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattoriOld", "FattoriOnCommandEvent", _e);
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
    IDVariant v_FATTORI = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_FATTORI = (new IDVariant("Fattori", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_FATTORI, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FattoriOld", "LoadEvent", _e);
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
  private void PAN_FATTORI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FATTORI, Cancel);
    // Stub
  }

  private void PAN_FATTORI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FATTORI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FATTORI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FATTORI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_FATTORIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_FATTORIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_FATTORIBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_FATTORIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_FATTORIBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_FATTORIBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_FATTORIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_FATTORIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_FATTORIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_FATTORIBOOK_MST_FATTBOOKPAGE)
    {
      BUK_FATTORIBOOK.set_SpanValue(BUK_FATTORIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_FATTORIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_FATTORIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_FATTORIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_FATTORIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_FATTORIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_FATTORIBOOK_OnPreview()
  {
    PreviewBook = BKW_FATTORIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FATTORI_Init()
  {

    PAN_FATTORI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FATTORI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FATTORI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, "089B7DF2-0061-43F2-9CB5-E73E7C721F93");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, "Codice");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, "C2FB58E9-E637-4177-A4D3-1EDFD4F8F7FB");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, "Descrizione");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, "9F87BC45-A8FF-46D5-A6D3-5686C5D2840E");
    PAN_FATTORI.set_Header(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, "Tipo");
    PAN_FATTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, "");
    PAN_FATTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FATTORI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, MyGlb.PANEL_LIST, 56);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, MyGlb.PANEL_FORM, 112);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_CODICE, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_CODICE, PPQRY_FATTORI3, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, 112, 36, 340, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, 112);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_DESCRIZIONE, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_DESCRIZIONE, PPQRY_FATTORI3, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, 452, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_FATTORI.SetRect(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, 4, 76, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, 112);
    PAN_FATTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_FATTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTORI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_FATTORI.SetFieldPage(PFL_FATTORI_TIPO, -1, -1);
    PAN_FATTORI.SetFieldPanel(PFL_FATTORI_TIPO, PPQRY_FATTORI3, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_FATTORI.SetValueListItem(PFL_FATTORI_TIPO, (new IDVariant("E")), "Economico", "", "", -1);
    PAN_FATTORI.SetValueListItem(PFL_FATTORI_TIPO, (new IDVariant("A")), "Patrimoniale Attivo", "", "", -1);
    PAN_FATTORI.SetValueListItem(PFL_FATTORI_TIPO, (new IDVariant("P")), "Patrimoniale Passivo", "", "", -1);
  }

  private void PAN_FATTORI_InitQueries()
  {
    StringBuffer SQL;

    PAN_FATTORI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FATTORI.SetIMDB(IMDB, "PQRY_FATTORI3", true);
    PAN_FATTORI.set_SetString(MyGlb.MASTER_ROWNAME, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO as TIPO ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTORI.SetQuery(PPQRY_FATTORI3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTORI.SetQuery(PPQRY_FATTORI3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTORI.SetQuery(PPQRY_FATTORI3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.FATTORE ");
    PAN_FATTORI.SetQuery(PPQRY_FATTORI3, 5, SQL, -1, "");
    PAN_FATTORI.SetQueryDB(PPQRY_FATTORI3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FATTORI.SetMasterTable(0, "FATTORI");
    PAN_FATTORI.AddToSortList(PFL_FATTORI_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FATTORI.Status() == 2)
    {
      int oldListQBE = PAN_FATTORI.iUseListQBE;
      PAN_FATTORI.iUseListQBE = 0;
      PAN_FATTORI.PanelCommand(Glb.PCM_SEARCH);
      PAN_FATTORI.PanelCommand(Glb.PCM_FIND);
      PAN_FATTORI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_FATTORIBOOK_MST_FATTBOOKPAGE_Init()
  {
    BUK_FATTORIBOOK.InitMastro(BUK_FATTORIBOOK_MST_FATTBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_MST_FATTBOOKPAGE, "288AECFC-9951-415D-A526-84FB7C430646");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_MST_FATTBOOKPAGE, "FATTBOOKPAGE");
    BUK_FATTORIBOOK.InitMastroBox(BUK_FATTORIBOOK_MST_FATTBOOKPAGE, BUK_FATTORIBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_RPTBOX_NUMEROPAGINA, "27FCCCD3-5DA0-4ED7-B0C8-E6B4699F936E");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_FATTORIBOOK.InitBoxSpan(BUK_FATTORIBOOK_RPTBOX_NUMEROPAGINA, BUK_FATTORIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SPAN_NUMEROPAGINA, "6857FDA9-92CF-43D4-98AD-509D3A657AAA");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_FATTORIBOOK.InitMastroBox(BUK_FATTORIBOOK_MST_FATTBOOKPAGE, BUK_FATTORIBOOK_RPTBOX_PAGEBODY, 1000, 3000, 19000, 25700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_RPTBOX_PAGEBODY, "DCDAD770-E2BA-47A9-AE70-79B9C3BDC73C");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_FATTORIBOOK.InitMastroBox(BUK_FATTORIBOOK_MST_FATTBOOKPAGE, BUK_FATTORIBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_RPTBOX_TITOLO, "4F7B6496-623B-4262-B745-A8B4A47B743E");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_FATTORIBOOK_RPT_NEWREPORT_InitQuery() { BUK_FATTORIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_FATTORIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.FATTORE as FATTORE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.TIPO as TIPO ");
      SQL.append("from ");
      SQL.append("  FATTORI A ");
      SQL.append("order by ");
      SQL.append("  A.FATTORE ");
      BUK_FATTORIBOOK.SetReportQuery(BUK_FATTORIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "558F4DF4-D1EA-4735-8256-277E33B1899C");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_FATTORIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_FATTORIBOOK.InitReport(BUK_FATTORIBOOK_RPT_NEWREPORT, 196609);
    BUK_FATTORIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_RPT_NEWREPORT, "D98DDCD2-9A01-4AB1-9204-2C61D24F05D0");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_FATTORIBOOK.InitSection(BUK_FATTORIBOOK_RPT_NEWREPORT, BUK_FATTORIBOOK_SEC_REPORTHEADER, 300, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FATTORIBOOK.SetSectionRendersInto(BUK_FATTORIBOOK_SEC_REPORTHEADER, BUK_FATTORIBOOK_RPTBOX_PAGEBODY);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SEC_REPORTHEADER, "7AD96CF0-DFB9-4A32-96A8-14C4C297658A");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_FATTORIBOOK.InitSection(BUK_FATTORIBOOK_RPT_NEWREPORT, BUK_FATTORIBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FATTORIBOOK.SetSectionRendersInto(BUK_FATTORIBOOK_SEC_PAGEHEADER, BUK_FATTORIBOOK_RPTBOX_PAGEBODY);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SEC_PAGEHEADER, "1370AB76-6914-469E-B378-F1F351D22539");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_FATTORIBOOK.InitReportBox(BUK_FATTORIBOOK_SEC_PAGEHEADER, BUK_FATTORIBOOK_RPTBOX_FATTORHEADER, 400, 0, 1200, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_RPTBOX_FATTORHEADER, "B3F3D909-C9FA-485C-BEB8-FD2C96DC019E");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_RPTBOX_FATTORHEADER, "FATTORHEADER");
    BUK_FATTORIBOOK.InitBoxSpan(BUK_FATTORIBOOK_RPTBOX_FATTORHEADER, BUK_FATTORIBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SPAN_CODICE, "62290721-EAF7-46A0-9E45-94AD27762DEC");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SPAN_CODICE, "CODICE");
    BUK_FATTORIBOOK.InitReportBox(BUK_FATTORIBOOK_SEC_PAGEHEADER, BUK_FATTORIBOOK_RPTBOX_DESCRIHEADER, 2400, 0, 9800, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_RPTBOX_DESCRIHEADER, "4E8C27FC-7CC4-4028-99A6-79C2D2C5D41C");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_FATTORIBOOK.InitBoxSpan(BUK_FATTORIBOOK_RPTBOX_DESCRIHEADER, BUK_FATTORIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SPAN_DESCRIZIONE, "61131EF5-6988-44A4-92BB-5FD833D1E9C2");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_FATTORIBOOK.InitReportBox(BUK_FATTORIBOOK_SEC_PAGEHEADER, BUK_FATTORIBOOK_RPTBOX_TIPOHEADER, 13400, 0, 3300, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_RPTBOX_TIPOHEADER, "62776889-779D-41D0-8A31-8CF0CB94E80B");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_RPTBOX_TIPOHEADER, "TIPOHEADER");
    BUK_FATTORIBOOK.InitBoxSpan(BUK_FATTORIBOOK_RPTBOX_TIPOHEADER, BUK_FATTORIBOOK_SPAN_TIPO, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Tipo", 1);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SPAN_TIPO, "573176D0-09F1-4716-8318-2E35048B6148");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SPAN_TIPO, "TIPO");
    BUK_FATTORIBOOK.InitSection(BUK_FATTORIBOOK_RPT_NEWREPORT, BUK_FATTORIBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FATTORIBOOK.SetSectionRendersInto(BUK_FATTORIBOOK_SEC_TITOLO, BUK_FATTORIBOOK_RPTBOX_TITOLO);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SEC_TITOLO, "9B919EF4-794E-47EE-ABB3-E8D0E708A00B");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SEC_TITOLO, "TITOLO");
    BUK_FATTORIBOOK.InitReportBox(BUK_FATTORIBOOK_SEC_TITOLO, BUK_FATTORIBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_RPTBOX_NEWBOX, "7A60F6E6-8C9D-4E2E-89E4-FFCEE3D154D9");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_FATTORIBOOK.InitBoxSpan(BUK_FATTORIBOOK_RPTBOX_NEWBOX, BUK_FATTORIBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Fattori", 1);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SPAN_VARIADIBILAN, "7B54CD43-F49E-4031-8097-7F55D0E4E4E7");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_FATTORIBOOK.InitSection(BUK_FATTORIBOOK_RPT_NEWREPORT, BUK_FATTORIBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FATTORIBOOK.SetSectionRendersInto(BUK_FATTORIBOOK_SEC_DETAIL, BUK_FATTORIBOOK_RPTBOX_PAGEBODY);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SEC_DETAIL, "76DCDB47-D442-4A7F-9352-1A5C62447B77");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SEC_DETAIL, "DETAIL");
    BUK_FATTORIBOOK.InitReportBox(BUK_FATTORIBOOK_SEC_DETAIL, BUK_FATTORIBOOK_RPTBOX_FATTORE, 0, 0, 1700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_RPTBOX_FATTORE, "5845ECD5-C907-4C11-817A-87B0BB324C11");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_RPTBOX_FATTORE, "FATTORE");
    BUK_FATTORIBOOK.InitBoxSpan(BUK_FATTORIBOOK_RPTBOX_FATTORE, BUK_FATTORIBOOK_SPAN_FACOFAOLFABO, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::FATTORE", 1);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SPAN_FACOFAOLFABO, "6BC5F79D-8772-423F-8B50-64D8F1515D24");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SPAN_FACOFAOLFABO, "FACOFAOLFABO");
    BUK_FATTORIBOOK.InitReportBox(BUK_FATTORIBOOK_SEC_DETAIL, BUK_FATTORIBOOK_RPTBOX_DESCRIZIONE, 2400, 0, 10700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_RPTBOX_DESCRIZIONE, "A2E8008F-BCA9-4098-B2E8-CDF6AC5EC4FC");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_FATTORIBOOK.InitBoxSpan(BUK_FATTORIBOOK_RPTBOX_DESCRIZIONE, BUK_FATTORIBOOK_SPAN_FADEFAOLFABO, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SPAN_FADEFAOLFABO, "42F257A3-9CFD-45EB-A32C-9E85AA3BEBB8");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SPAN_FADEFAOLFABO, "FADEFAOLFABO");
    BUK_FATTORIBOOK.InitReportBox(BUK_FATTORIBOOK_SEC_DETAIL, BUK_FATTORIBOOK_RPTBOX_TIPO, 13400, 0, 3300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_RPTBOX_TIPO, "845A6709-28C7-475B-BDF5-5D5CBA7B44A9");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_RPTBOX_TIPO, "TIPO");
    BUK_FATTORIBOOK.InitBoxSpan(BUK_FATTORIBOOK_RPTBOX_TIPO, BUK_FATTORIBOOK_SPAN_FATIFAOLFABO, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::TIPO", 1);
    BUK_FATTORIBOOK.SetSpanValueListItem(BUK_FATTORIBOOK_SPAN_FATIFAOLFABO, "Economico", "Type the value and explain what it means.", (new IDVariant("E")), null, "", -1);
    BUK_FATTORIBOOK.SetSpanValueListItem(BUK_FATTORIBOOK_SPAN_FATIFAOLFABO, "Patrimoniale Attivo", "Type the value and explain what it means.", (new IDVariant("A")), null, "", -1);
    BUK_FATTORIBOOK.SetSpanValueListItem(BUK_FATTORIBOOK_SPAN_FATIFAOLFABO, "Patrimoniale Passivo", "Type the value and explain what it means.", (new IDVariant("P")), null, "", -1);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SPAN_FATIFAOLFABO, "C40E74B0-D53D-4B26-9311-110720CDF706");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SPAN_FATIFAOLFABO, "FATIFAOLFABO");
    BUK_FATTORIBOOK.InitSection(BUK_FATTORIBOOK_RPT_NEWREPORT, BUK_FATTORIBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FATTORIBOOK.SetSectionRendersInto(BUK_FATTORIBOOK_SEC_REPORTFOOTER, BUK_FATTORIBOOK_RPTBOX_PAGEBODY);
    BUK_FATTORIBOOK.SetRTCGuid(BUK_FATTORIBOOK_SEC_REPORTFOOTER, "C50F5CF6-3757-4233-A182-96C9E0E9544F");
    BUK_FATTORIBOOK.SetObjCode(BUK_FATTORIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_FATTORIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_FATTORIBOOK_InitLinks()
  {
    BUK_FATTORIBOOK.SetBoxNextBox(BUK_FATTORIBOOK_RPTBOX_PAGEBODY, BUK_FATTORIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_FATTORI) PAN_FATTORI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_FATTORIBOOK) BUK_FATTORIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_FATTORIBOOK) BUK_FATTORIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_FATTORIBOOK) BUK_FATTORIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_FATTORIBOOK) BUK_FATTORIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_FATTORIBOOK) BUK_FATTORIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_FATTORIBOOK) BUK_FATTORIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_FATTORIBOOK) BUK_FATTORIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_FATTORIBOOK) BUK_FATTORIBOOK_OnPreview();
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
