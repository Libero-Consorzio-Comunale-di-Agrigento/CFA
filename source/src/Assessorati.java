// **********************************************
// Assessorati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Assessorati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ASSESSORATI_CODICE = 0;
  private static int PFL_ASSESSORATI_ASSESSORATO = 1;
  private static int PFL_ASSESSORATI_ASSESSORE = 2;
  private static int PFL_ASSESSORATI_SEQ = 3;

  private static int PPQRY_ASSESSORATI = 0;


  IDPanel PAN_ASSESSORATI;
  CIDREObj BUK_ASSESSORBOOK;
  OBook BKW_ASSESSORBOOK;
  //
  // Template Pages constants
  private static int BUK_ASSESSORBOOK_MST_ASSEBOOKPAGE = 1;
  private static int BUK_ASSESSORBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_ASSESSORBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_ASSESSORBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_ASSESSORBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_ASSESSORBOOK_RPT_NEWREPORT = 6;
  private static int BUK_ASSESSORBOOK_SEC_TITOLO = 7;
  private static int BUK_ASSESSORBOOK_RPTBOX_NEWBOX1 = 8;
  private static int BUK_ASSESSORBOOK_SPAN_VARIADIBILAN = 9;
  private static int BUK_ASSESSORBOOK_SEC_PAGEHEADER = 10;
  private static int BUK_ASSESSORBOOK_RPTBOX_CODICEHEADE1 = 11;
  private static int BUK_ASSESSORBOOK_SPAN_CODICE1 = 12;
  private static int BUK_ASSESSORBOOK_RPTBOX_ASSESSHEADE1 = 13;
  private static int BUK_ASSESSORBOOK_SPAN_CODICE = 14;
  private static int BUK_ASSESSORBOOK_RPTBOX_ASSESSHEADER = 15;
  private static int BUK_ASSESSORBOOK_SPAN_ASSESSORE = 16;
  private static int BUK_ASSESSORBOOK_RPTBOX_SEQUENHEADER = 17;
  private static int BUK_ASSESSORBOOK_SPAN_SQ = 18;
  private static int BUK_ASSESSORBOOK_SEC_DETAIL = 19;
  private static int BUK_ASSESSORBOOK_RPTBOX_CODICE1 = 20;
  private static int BUK_ASSESSORBOOK_SPAN_T54CODASASBO = 21;
  private static int BUK_ASSESSORBOOK_RPTBOX_ASSESSORATO = 22;
  private static int BUK_ASSESSORBOOK_SPAN_T5ASASASASB1 = 23;
  private static int BUK_ASSESSORBOOK_RPTBOX_ASSESSORE = 24;
  private static int BUK_ASSESSORBOOK_SPAN_T5ASASASASBO = 25;
  private static int BUK_ASSESSORBOOK_RPTBOX_SEQUENZA = 26;
  private static int BUK_ASSESSORBOOK_SPAN_T5ASSEASASBO = 27;
  private static int BUK_ASSESSORBOOK_SEC_REPORTFOOTER = 28;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_ASSESSORATI(IMDB);
    Init_PQRY_T71(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_ASSESSORATI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_ASSESSORATI, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_ASSESSORATI, "PQRY_ASSESSORATI");
    IMDB.set_FldCode(IMDBDef9.PQRY_ASSESSORATI,IMDBDef9.PQSL_ASSESSORATI_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_ASSESSORATI,IMDBDef9.PQSL_ASSESSORATI_CODICE,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ASSESSORATI,IMDBDef9.PQSL_ASSESSORATI_ASSESSORATO, "ASSESSORATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ASSESSORATI,IMDBDef9.PQSL_ASSESSORATI_ASSESSORATO,5,80,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ASSESSORATI,IMDBDef9.PQSL_ASSESSORATI_ASSESSORE, "ASSESSORE");
    IMDB.SetFldParams(IMDBDef9.PQRY_ASSESSORATI,IMDBDef9.PQSL_ASSESSORATI_ASSESSORE,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ASSESSORATI,IMDBDef9.PQSL_ASSESSORATI_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_ASSESSORATI,IMDBDef9.PQSL_ASSESSORATI_SEQUENZA,1,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_ASSESSORATI, 0);
  }

  private static void Init_PQRY_T71(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T71, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_T71, "PQRY_T71");
    IMDB.set_FldCode(IMDBDef9.PQRY_T71,IMDBDef9.PQSL_T71_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T71,IMDBDef9.PQSL_T71_CODICE,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T71,IMDBDef9.PQSL_T71_ASSESSORATO, "ASSESSORATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T71,IMDBDef9.PQSL_T71_ASSESSORATO,5,80,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T71,IMDBDef9.PQSL_T71_ASSESSORE, "ASSESSORE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T71,IMDBDef9.PQSL_T71_ASSESSORE,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T71,IMDBDef9.PQSL_T71_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T71,IMDBDef9.PQSL_T71_SEQUENZA,1,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T71, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Assessorati(MyWebEntryPoint w, IMDBObj imdb)
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
  public Assessorati()
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
    FormIdx = MyGlb.FRM_ASSESSORATI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DDD01D05-E864-4F94-86CD-021D387D794B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 580;
    DesignHeight = 342;
    set_Caption(new IDVariant("Assessorati"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 580;
    Frames[1].Height = 316;
    Frames[1].Caption = "Assessorati";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 316;
    PAN_ASSESSORATI = new IDPanel(w, this, 1, "PAN_ASSESSORATI");
    Frames[1].Content = PAN_ASSESSORATI;
    PAN_ASSESSORATI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ASSESSORATI.VS = MainFrm.VisualStyleList;
    PAN_ASSESSORATI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 580-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_ASSESSORBOOK != null)
      PAN_ASSESSORATI.SetBook(BUK_ASSESSORBOOK);
    PAN_ASSESSORATI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "89ECF9B1-A2A8-4552-B113-CDB8A8528F3B");
    PAN_ASSESSORATI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 524, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESSORATI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ASSESSORATI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ASSESSORATI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ASSESSORATI.InitStatus = 2;
    PAN_ASSESSORATI_Init();
    PAN_ASSESSORATI_InitFields();
    PAN_ASSESSORATI_InitQueries();
    BKW_ASSESSORBOOK = new OBook(this);
    BUK_ASSESSORBOOK = new CIDREObj(BKW_ASSESSORBOOK);
    BKW_ASSESSORBOOK.iGuid = "D78F3CC6-66F6-4688-AADA-89EE5BF5C3D8";
    BKW_ASSESSORBOOK.Code = "BUK_ASSESSORBOOK";
    BKW_ASSESSORBOOK.BookObj = BUK_ASSESSORBOOK;
    BKW_ASSESSORBOOK.InitDefMasks();
    BUK_ASSESSORBOOK.InitBook(1, 1245185, "Assessorati Book", IMDB, MainFrm.VisualStyleList);
    BUK_ASSESSORBOOK.InitHTML();
    BUK_ASSESSORBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ASSESSORBOOK.Book.SetMainFrm(MainFrm);
    BUK_ASSESSORBOOK.SetRTCGuid(0, "D78F3CC6-66F6-4688-AADA-89EE5BF5C3D8");
    BUK_ASSESSORBOOK.SetObjCode(0, "ASSESSORBOOK");
    if (PAN_ASSESSORATI != null)
      PAN_ASSESSORATI.SetBook(BUK_ASSESSORBOOK);
    BUK_ASSESSORBOOK_MST_ASSEBOOKPAGE_Init();
    BUK_ASSESSORBOOK_RPT_NEWREPORT_Init();
    BUK_ASSESSORBOOK_InitLinks();
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
      PAN_ASSESSORATI.UpdatePanel(MainFrm);
      // BUK_ASSESSORBOOK.UpdateBook();
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
    if (Code.equals("BUK_ASSESSORBOOK")) return BUK_ASSESSORBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Assessorati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Assessorati.class.getName() : (Glb.ClassWithPackage(Assessorati.class) ? Assessorati.class.getName().substring(Assessorati.class.getPackage().getName().length() + 1) : Assessorati.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Assessorati On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ASSESSORATI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ASSESSORATI);
      // 
      // Assessorati On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_ASSESSORATI.IsNewRow()))
      {
        PAN_ASSESSORATI.SetFlags (Glb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ASSESSORATI.SetFlags (Glb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_ASSESSORATI.set_ToolTip(Glb.OBJ_FIELD,PFL_ASSESSORATI_ASSESSORATO,IMDB.Value(IMDBDef9.PQRY_ASSESSORATI, IMDBDef9.PQSL_ASSESSORATI_ASSESSORATO, 0).stringValue()); 
      PAN_ASSESSORATI.set_ToolTip(Glb.OBJ_FIELD,PFL_ASSESSORATI_ASSESSORE,IMDB.Value(IMDBDef9.PQRY_ASSESSORATI, IMDBDef9.PQSL_ASSESSORATI_ASSESSORE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Assessorati", "AssessoratiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Assessorati Before Delete Event
  // Evento notificato dal pannello prima di eseguire la
  // cancellazione di una riga del pannello.
  // Cancel: Se impostato a True non effettua la cancellazione della riga. - Input/Output
  // **********************************************************************
  private void PAN_ASSESSORATI_BeforeDelete(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Assessorati Before Delete Event Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.ASSESSORATIPD(IMDB.Value(IMDBDef9.PQRY_ASSESSORATI, IMDBDef9.PQSL_ASSESSORATI_CODICE, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Assessorati", "AssessoratiBeforeDeleteEvent", _e);
    }
  }

  // **********************************************************************
  // Assessorati On Database Error Event
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
  private void PAN_ASSESSORATI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ASSESSORATI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Assessorati On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Assessorati", "AssessoratiOnDatabaseErrorEvent", _e);
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
    // Stub
  }

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
  private void PAN_ASSESSORATI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ASSESSORATI, Cancel);
    // Stub
  }

  private void PAN_ASSESSORATI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ASSESSORATI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ASSESSORATI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ASSESSORATI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_ASSESSORBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ASSESSORBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ASSESSORBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_ASSESSORBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_ASSESSORBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_ASSESSORBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_ASSESSORBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ASSESSORBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ASSESSORBOOK_MST_ASSEBOOKPAGE)
    {
      BUK_ASSESSORBOOK.set_SpanValue(BUK_ASSESSORBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ASSESSORBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ASSESSORBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_ASSESSORBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ASSESSORBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ASSESSORBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ASSESSORBOOK_OnPreview()
  {
    PreviewBook = BKW_ASSESSORBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ASSESSORATI_Init()
  {

    PAN_ASSESSORATI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ASSESSORATI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ASSESSORATI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_ASSESSORATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, "3782C239-062D-4A6D-A71B-86BDFD3B251C");
    PAN_ASSESSORATI.set_Header(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, "Codice");
    PAN_ASSESSORATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, "Codice");
    PAN_ASSESSORATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSESSORATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_ASSESSORATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, "BB64A8CE-CFB0-49ED-9DAB-584D3B350100");
    PAN_ASSESSORATI.set_Header(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, "Assessorato");
    PAN_ASSESSORATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, "Descrizione assessorato");
    PAN_ASSESSORATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSESSORATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_ASSESSORATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, "9E89BB77-4D0D-4DA8-B565-8EB6D037613B");
    PAN_ASSESSORATI.set_Header(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, "Assessore");
    PAN_ASSESSORATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, "Assessore");
    PAN_ASSESSORATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSESSORATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ASSESSORATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, "874FC118-5693-4664-B7E3-7462D181FD28");
    PAN_ASSESSORATI.set_Header(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, "Seq.");
    PAN_ASSESSORATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, "Sequenza");
    PAN_ASSESSORATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSESSORATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ASSESSORATI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ASSESSORATI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESSORATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_ASSESSORATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ASSESSORATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ASSESSORATI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESSORATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, MyGlb.PANEL_FORM, 96);
    PAN_ASSESSORATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ASSESSORATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ASSESSORATI.SetFieldPage(PFL_ASSESSORATI_CODICE, -1, -1);
    PAN_ASSESSORATI.SetFieldPanel(PFL_ASSESSORATI_CODICE, PPQRY_ASSESSORATI, "A.CODICE", "CODICE", 5, 4, 0, -13997);
    PAN_ASSESSORATI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, MyGlb.PANEL_LIST, 48, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ASSESSORATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, MyGlb.PANEL_LIST, 84);
    PAN_ASSESSORATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, MyGlb.PANEL_LIST, 1);
    PAN_ASSESSORATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, MyGlb.PANEL_LIST, "Assessorato");
    PAN_ASSESSORATI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, MyGlb.PANEL_FORM, 4, 28, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESSORATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, MyGlb.PANEL_FORM, 96);
    PAN_ASSESSORATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, MyGlb.PANEL_FORM, 1);
    PAN_ASSESSORATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORATO, MyGlb.PANEL_FORM, "Assessorato");
    PAN_ASSESSORATI.SetFieldPage(PFL_ASSESSORATI_ASSESSORATO, -1, -1);
    PAN_ASSESSORATI.SetFieldPanel(PFL_ASSESSORATI_ASSESSORATO, PPQRY_ASSESSORATI, "A.ASSESSORATO", "ASSESSORATO", 5, 80, 0, -13997);
    PAN_ASSESSORATI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, MyGlb.PANEL_LIST, 280, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ASSESSORATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, MyGlb.PANEL_LIST, 68);
    PAN_ASSESSORATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, MyGlb.PANEL_LIST, 1);
    PAN_ASSESSORATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, MyGlb.PANEL_LIST, "Assessore");
    PAN_ASSESSORATI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, MyGlb.PANEL_FORM, 4, 52, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESSORATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, MyGlb.PANEL_FORM, 96);
    PAN_ASSESSORATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, MyGlb.PANEL_FORM, 1);
    PAN_ASSESSORATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_ASSESSORE, MyGlb.PANEL_FORM, "Assessore");
    PAN_ASSESSORATI.SetFieldPage(PFL_ASSESSORATI_ASSESSORE, -1, -1);
    PAN_ASSESSORATI.SetFieldPanel(PFL_ASSESSORATI_ASSESSORE, PPQRY_ASSESSORATI, "A.ASSESSORE", "ASSESSORE", 5, 50, 0, -13997);
    PAN_ASSESSORATI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, MyGlb.PANEL_LIST, 488, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESSORATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, MyGlb.PANEL_LIST, 68);
    PAN_ASSESSORATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, MyGlb.PANEL_LIST, 1);
    PAN_ASSESSORATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, MyGlb.PANEL_LIST, "Seq.");
    PAN_ASSESSORATI.SetRect(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSESSORATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, MyGlb.PANEL_FORM, 96);
    PAN_ASSESSORATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, MyGlb.PANEL_FORM, 1);
    PAN_ASSESSORATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSESSORATI_SEQ, MyGlb.PANEL_FORM, "Seq.");
    PAN_ASSESSORATI.SetFieldPage(PFL_ASSESSORATI_SEQ, -1, -1);
    PAN_ASSESSORATI.SetFieldPanel(PFL_ASSESSORATI_SEQ, PPQRY_ASSESSORATI, "A.SEQUENZA", "SEQUENZA", 1, 2, 0, -13997);
  }

  private void PAN_ASSESSORATI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ASSESSORATI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ASSESSORATI.SetIMDB(IMDB, "PQRY_ASSESSORATI", true);
    PAN_ASSESSORATI.set_SetString(MyGlb.MASTER_ROWNAME, "ASSESSORATI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.ASSESSORATO as ASSESSORATO, ");
    SQL.append("  A.ASSESSORE as ASSESSORE, ");
    SQL.append("  A.SEQUENZA as SEQUENZA ");
    PAN_ASSESSORATI.SetQuery(PPQRY_ASSESSORATI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ASSESSORATI A ");
    PAN_ASSESSORATI.SetQuery(PPQRY_ASSESSORATI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ASSESSORATI.SetQuery(PPQRY_ASSESSORATI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ASSESSORATI.SetQuery(PPQRY_ASSESSORATI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ASSESSORATI.SetQuery(PPQRY_ASSESSORATI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ASSESSORATI.SetQuery(PPQRY_ASSESSORATI, 5, SQL, -1, "");
    PAN_ASSESSORATI.SetQueryDB(PPQRY_ASSESSORATI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ASSESSORATI.SetMasterTable(0, "ASSESSORATI");
    PAN_ASSESSORATI.AddToSortList(PFL_ASSESSORATI_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ASSESSORATI.Status() == 2)
    {
      int oldListQBE = PAN_ASSESSORATI.iUseListQBE;
      PAN_ASSESSORATI.iUseListQBE = 0;
      PAN_ASSESSORATI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ASSESSORATI.PanelCommand(Glb.PCM_FIND);
      PAN_ASSESSORATI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_ASSESSORBOOK_MST_ASSEBOOKPAGE_Init()
  {
    BUK_ASSESSORBOOK.InitMastro(BUK_ASSESSORBOOK_MST_ASSEBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_MST_ASSEBOOKPAGE, "C8EB7DFB-840C-4CDE-92C6-6409129CE9CF");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_MST_ASSEBOOKPAGE, "ASSEBOOKPAGE");
    BUK_ASSESSORBOOK.InitMastroBox(BUK_ASSESSORBOOK_MST_ASSEBOOKPAGE, BUK_ASSESSORBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPTBOX_NUMEROPAGINA, "74CA241C-B043-4F34-AB82-50E5879EEA70");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ASSESSORBOOK.InitBoxSpan(BUK_ASSESSORBOOK_RPTBOX_NUMEROPAGINA, BUK_ASSESSORBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SPAN_NUMEROPAGINA, "FB05DAC6-705A-4E22-99CC-A8C2ADDF5239");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_ASSESSORBOOK.InitMastroBox(BUK_ASSESSORBOOK_MST_ASSEBOOKPAGE, BUK_ASSESSORBOOK_RPTBOX_PAGEBODY, 1000, 3000, 19000, 25200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPTBOX_PAGEBODY, "AC620233-C8EE-491D-8ADD-51C03C5F7774");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_ASSESSORBOOK.InitMastroBox(BUK_ASSESSORBOOK_MST_ASSEBOOKPAGE, BUK_ASSESSORBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPTBOX_TITOLO, "436C4F5D-B894-46BE-938E-B65F4F5D7DC2");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_ASSESSORBOOK_RPT_NEWREPORT_InitQuery() { BUK_ASSESSORBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_ASSESSORBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.ASSESSORATO as ASSESSORATO, ");
      SQL.append("  A.ASSESSORE as ASSESSORE, ");
      SQL.append("  A.SEQUENZA as SEQUENZA ");
      SQL.append("from ");
      SQL.append("  ASSESSORATI A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_ASSESSORBOOK.SetReportQuery(BUK_ASSESSORBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "0E285E4B-BF38-4894-A84A-4DBA48499E40");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ASSESSORBOOK_RPT_NEWREPORT_Init()
  {
    BUK_ASSESSORBOOK.InitReport(BUK_ASSESSORBOOK_RPT_NEWREPORT, 196609);
    BUK_ASSESSORBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPT_NEWREPORT, "33D71781-4BA5-404D-8BFB-2342F9B50BE1");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_ASSESSORBOOK.InitSection(BUK_ASSESSORBOOK_RPT_NEWREPORT, BUK_ASSESSORBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ASSESSORBOOK.SetSectionRendersInto(BUK_ASSESSORBOOK_SEC_TITOLO, BUK_ASSESSORBOOK_RPTBOX_TITOLO);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SEC_TITOLO, "E10331F4-FFFE-4BAB-B0DF-5CE7D6DDE162");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SEC_TITOLO, "TITOLO");
    BUK_ASSESSORBOOK.InitReportBox(BUK_ASSESSORBOOK_SEC_TITOLO, BUK_ASSESSORBOOK_RPTBOX_NEWBOX1, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPTBOX_NEWBOX1, "641089E8-B30A-4B61-B4D2-98F60A6DD4B2");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPTBOX_NEWBOX1, "NEWBOX1");
    BUK_ASSESSORBOOK.InitBoxSpan(BUK_ASSESSORBOOK_RPTBOX_NEWBOX1, BUK_ASSESSORBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Assessorati", 1);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SPAN_VARIADIBILAN, "A565E4AB-2939-44D7-A0E2-7A7F081B6E8F");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_ASSESSORBOOK.InitSection(BUK_ASSESSORBOOK_RPT_NEWREPORT, BUK_ASSESSORBOOK_SEC_PAGEHEADER, 700, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ASSESSORBOOK.SetSectionRendersInto(BUK_ASSESSORBOOK_SEC_PAGEHEADER, BUK_ASSESSORBOOK_RPTBOX_PAGEBODY);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SEC_PAGEHEADER, "109C5C3B-01F2-42C7-84B0-1748E2211543");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ASSESSORBOOK.InitReportBox(BUK_ASSESSORBOOK_SEC_PAGEHEADER, BUK_ASSESSORBOOK_RPTBOX_CODICEHEADE1, 300, 0, 1400, 700, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPTBOX_CODICEHEADE1, "36005685-40A3-4976-8E7D-BCB983D1B723");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPTBOX_CODICEHEADE1, "CODICEHEADE1");
    BUK_ASSESSORBOOK.InitBoxSpan(BUK_ASSESSORBOOK_RPTBOX_CODICEHEADE1, BUK_ASSESSORBOOK_SPAN_CODICE1, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SPAN_CODICE1, "B6E4AA75-6F61-4BF4-B738-B7ED806D6D1D");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SPAN_CODICE1, "CODICE1");
    BUK_ASSESSORBOOK.InitReportBox(BUK_ASSESSORBOOK_SEC_PAGEHEADER, BUK_ASSESSORBOOK_RPTBOX_ASSESSHEADE1, 2200, 0, 2400, 700, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPTBOX_ASSESSHEADE1, "97E0E23A-3105-46D4-BB50-90EB5921831D");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPTBOX_ASSESSHEADE1, "ASSESSHEADE1");
    BUK_ASSESSORBOOK.InitBoxSpan(BUK_ASSESSORBOOK_RPTBOX_ASSESSHEADE1, BUK_ASSESSORBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Assessorato", 1);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SPAN_CODICE, "EC993A3E-2F98-437B-B098-F1642C3FB8D8");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SPAN_CODICE, "CODICE");
    BUK_ASSESSORBOOK.InitReportBox(BUK_ASSESSORBOOK_SEC_PAGEHEADER, BUK_ASSESSORBOOK_RPTBOX_ASSESSHEADER, 10000, 0, 2400, 700, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPTBOX_ASSESSHEADER, "773114AC-1685-4AAD-8273-FAD4937F1DDE");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPTBOX_ASSESSHEADER, "ASSESSHEADER");
    BUK_ASSESSORBOOK.InitBoxSpan(BUK_ASSESSORBOOK_RPTBOX_ASSESSHEADER, BUK_ASSESSORBOOK_SPAN_ASSESSORE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Assessore", 1);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SPAN_ASSESSORE, "A8A47921-3A5B-44B8-BE07-C3EC084396F6");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SPAN_ASSESSORE, "ASSESSORE");
    BUK_ASSESSORBOOK.InitReportBox(BUK_ASSESSORBOOK_SEC_PAGEHEADER, BUK_ASSESSORBOOK_RPTBOX_SEQUENHEADER, 17900, 0, 700, 700, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPTBOX_SEQUENHEADER, "B52DAA36-DC4C-4BB8-AC53-8BC3F1690658");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPTBOX_SEQUENHEADER, "SEQUENHEADER");
    BUK_ASSESSORBOOK.InitBoxSpan(BUK_ASSESSORBOOK_RPTBOX_SEQUENHEADER, BUK_ASSESSORBOOK_SPAN_SQ, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Seq.", 1);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SPAN_SQ, "AC68334D-FE57-4FBA-BCCF-9C688FCFAD86");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SPAN_SQ, "SQ");
    BUK_ASSESSORBOOK.InitSection(BUK_ASSESSORBOOK_RPT_NEWREPORT, BUK_ASSESSORBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ASSESSORBOOK.SetSectionRendersInto(BUK_ASSESSORBOOK_SEC_DETAIL, BUK_ASSESSORBOOK_RPTBOX_PAGEBODY);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SEC_DETAIL, "EBF402FD-EA12-4665-B1E1-EFFF4B1DB3CD");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SEC_DETAIL, "DETAIL");
    BUK_ASSESSORBOOK.InitReportBox(BUK_ASSESSORBOOK_SEC_DETAIL, BUK_ASSESSORBOOK_RPTBOX_CODICE1, 300, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPTBOX_CODICE1, "E8BC8407-18AD-41A3-A46B-C96FE3C823DB");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPTBOX_CODICE1, "CODICE1");
    BUK_ASSESSORBOOK.InitBoxSpan(BUK_ASSESSORBOOK_RPTBOX_CODICE1, BUK_ASSESSORBOOK_SPAN_T54CODASASBO, MyGlb.VIS_DEFAREPOSTYL, 5, 4, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SPAN_T54CODASASBO, "9A06E074-26D1-4ECB-BFFD-11D4348992ED");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SPAN_T54CODASASBO, "T54CODASASBO");
    BUK_ASSESSORBOOK.InitReportBox(BUK_ASSESSORBOOK_SEC_DETAIL, BUK_ASSESSORBOOK_RPTBOX_ASSESSORATO, 2200, 0, 7400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPTBOX_ASSESSORATO, "2C353145-3542-4B92-9801-298841E851E4");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPTBOX_ASSESSORATO, "ASSESSORATO");
    BUK_ASSESSORBOOK.InitBoxSpan(BUK_ASSESSORBOOK_RPTBOX_ASSESSORATO, BUK_ASSESSORBOOK_SPAN_T5ASASASASB1, MyGlb.VIS_DEFAREPOSTYL, 5, 80, 0, 271384705, "Brief description of field content.", "::ASSESSORATO", 1);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SPAN_T5ASASASASB1, "B04D3031-0441-41BA-8261-64EA4C443239");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SPAN_T5ASASASASB1, "T5ASASASASB1");
    BUK_ASSESSORBOOK.InitReportBox(BUK_ASSESSORBOOK_SEC_DETAIL, BUK_ASSESSORBOOK_RPTBOX_ASSESSORE, 10000, 0, 7400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPTBOX_ASSESSORE, "94347424-DFA6-431E-BFBC-B513DE49408F");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPTBOX_ASSESSORE, "ASSESSORE");
    BUK_ASSESSORBOOK.InitBoxSpan(BUK_ASSESSORBOOK_RPTBOX_ASSESSORE, BUK_ASSESSORBOOK_SPAN_T5ASASASASBO, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "Brief description of field content.", "::ASSESSORE", 1);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SPAN_T5ASASASASBO, "B0E70055-A6BE-4E82-B1C6-D4F80FCA0FE9");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SPAN_T5ASASASASBO, "T5ASASASASBO");
    BUK_ASSESSORBOOK.InitReportBox(BUK_ASSESSORBOOK_SEC_DETAIL, BUK_ASSESSORBOOK_RPTBOX_SEQUENZA, 17900, 0, 700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_RPTBOX_SEQUENZA, "2319C6E6-1287-4879-9D16-1753881021C3");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_RPTBOX_SEQUENZA, "SEQUENZA");
    BUK_ASSESSORBOOK.InitBoxSpan(BUK_ASSESSORBOOK_RPTBOX_SEQUENZA, BUK_ASSESSORBOOK_SPAN_T5ASSEASASBO, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::SEQUENZA", 1);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SPAN_T5ASSEASASBO, "C27512D3-74FB-400D-9E92-2CDBB3261EAD");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SPAN_T5ASSEASASBO, "T5ASSEASASBO");
    BUK_ASSESSORBOOK.InitSection(BUK_ASSESSORBOOK_RPT_NEWREPORT, BUK_ASSESSORBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ASSESSORBOOK.SetSectionRendersInto(BUK_ASSESSORBOOK_SEC_REPORTFOOTER, BUK_ASSESSORBOOK_RPTBOX_PAGEBODY);
    BUK_ASSESSORBOOK.SetRTCGuid(BUK_ASSESSORBOOK_SEC_REPORTFOOTER, "F4543D89-267E-4491-BF3D-BB791074B631");
    BUK_ASSESSORBOOK.SetObjCode(BUK_ASSESSORBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ASSESSORBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_ASSESSORBOOK_InitLinks()
  {
    BUK_ASSESSORBOOK.SetBoxNextBox(BUK_ASSESSORBOOK_RPTBOX_PAGEBODY, BUK_ASSESSORBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ASSESSORATI) PAN_ASSESSORATI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ASSESSORATI) PAN_ASSESSORATI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ASSESSORATI) PAN_ASSESSORATI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ASSESSORATI) PAN_ASSESSORATI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ASSESSORATI) PAN_ASSESSORATI_BeforeDelete(Cancel);
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
    if (SrcObj == PAN_ASSESSORATI) PAN_ASSESSORATI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_ASSESSORBOOK) BUK_ASSESSORBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ASSESSORBOOK) BUK_ASSESSORBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ASSESSORBOOK) BUK_ASSESSORBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ASSESSORBOOK) BUK_ASSESSORBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ASSESSORBOOK) BUK_ASSESSORBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ASSESSORBOOK) BUK_ASSESSORBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ASSESSORBOOK) BUK_ASSESSORBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ASSESSORBOOK) BUK_ASSESSORBOOK_OnPreview();
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
