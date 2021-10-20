// **********************************************
// Dissociazione Bozza Da Variazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DissociazioneBozzaDaVariazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DISSBOZDAVAR_VARIAZIONEID = 0;
  private static int PFL_DISSBOZDAVAR_BILANCIOPEG = 1;
  private static int PFL_DISSBOZDAVAR_DESCRIZIONE = 2;
  private static int PFL_DISSBOZDAVAR_DISSOCBUTTON = 3;
  private static int PFL_DISSBOZDAVAR_NEWEXPRESSIO = 4;

  private static int PPQRY_POLPROVARD11 = 0;

  private static int PPQRY_POLVARBILPEG = 1;


  IDPanel PAN_DISSBOZDAVAR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS13(IMDB);
    //
    //
    Init_PQRY_POLPROVARD11(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS13, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS13, "TBL_PARS13");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS13,IMDBDef4.FLD_PARS13_ROWNAMBOVAID, "ROWNAMBOVAID");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS13,IMDBDef4.FLD_PARS13_ROWNAMBOVAID,1,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS13, 0);
  }

  private static void Init_PQRY_POLPROVARD11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLPROVARD11, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLPROVARD11, "PQRY_POLPROVARD11");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARD11,IMDBDef12.PQSL_POLPROVARD11_VARIAZIONE_ID, "VARIAZIONE_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARD11,IMDBDef12.PQSL_POLPROVARD11_VARIAZIONE_ID,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARD11,IMDBDef12.PQSL_POLPROVARD11_RECORNEWEXPR, "RECORNEWEXPR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARD11,IMDBDef12.PQSL_POLPROVARD11_RECORNEWEXPR,1,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLPROVARD11, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DissociazioneBozzaDaVariazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public DissociazioneBozzaDaVariazione()
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
    FormIdx = MyGlb.FRM_DISSBOZDAVAR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1E95953F-5B89-44E0-9599-9B46616A1156";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 532;
    DesignHeight = 198;
    set_Caption(new IDVariant("Dissociazione Bozza Da Variazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 532;
    Frames[1].Height = 172;
    Frames[1].Caption = "Dissociazione Bozza Da Variazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 172;
    PAN_DISSBOZDAVAR = new IDPanel(w, this, 1, "PAN_DISSBOZDAVAR");
    Frames[1].Content = PAN_DISSBOZDAVAR;
    PAN_DISSBOZDAVAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISSBOZDAVAR.VS = MainFrm.VisualStyleList;
    PAN_DISSBOZDAVAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 532-MyGlb.PAN_OFFS_X, 172-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISSBOZDAVAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1384202A-0C54-4B51-A661-62E94ECA9A19");
    PAN_DISSBOZDAVAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 480, 76, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DISSBOZDAVAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISSBOZDAVAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISSBOZDAVAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISSBOZDAVAR.InitStatus = 2;
    PAN_DISSBOZDAVAR_Init();
    PAN_DISSBOZDAVAR_InitFields();
    PAN_DISSBOZDAVAR_InitQueries();
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
      PAN_DISSBOZDAVAR.UpdatePanel(MainFrm);
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
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof DissociazioneBozzaDaVariazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DissociazioneBozzaDaVariazione.class.getName() : (Glb.ClassWithPackage(DissociazioneBozzaDaVariazione.class) ? DissociazioneBozzaDaVariazione.class.getName().substring(DissociazioneBozzaDaVariazione.class.getPackage().getName().length() + 1) : DissociazioneBozzaDaVariazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Dissocia
  // **********************************************************************
  public int Dissocia ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dissocia Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.POLDISSOCIABOZZAVAR(IMDB.Value(IMDBDef4.TBL_PARS13, IMDBDef4.FLD_PARS13_ROWNAMBOVAID, 0), IMDB.Value(IMDBDef12.PQRY_POLPROVARD11, IMDBDef12.PQSL_POLPROVARD11_VARIAZIONE_ID, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DissociazioneBozzaDaVariazione", "Dissocia", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Dissociazione Bozza Da Variazione On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISSBOZDAVAR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DISSBOZDAVAR);
      // 
      // Dissociazione Bozza Da Variazione On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DISSBOZDAVAR.set_ToolTip(Glb.OBJ_FIELD,PFL_DISSBOZDAVAR_DESCRIZIONE,(new IDVariant(PAN_DISSBOZDAVAR.FieldText(PFL_DISSBOZDAVAR_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DissociazioneBozzaDaVariazione", "DissociazioneBozzaDaVariazioneOnDynamicPropertiesEvent", _e);
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
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DissociazioneBozzaDaVariazione", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unload Event Body
      // Procedure Body
      // 
      ((BozzeVariazione)MainFrm.GetForm(MyGlb.FRM_BOZZEVARIAZI,0)).PAN_BOZZE.PanelCommand(Glb.PCM_REQUERY);
      ((BozzeVariazione)MainFrm.GetForm(MyGlb.FRM_BOZZEVARIAZI,0)).PAN_BOZZEVARIAZI.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DissociazioneBozzaDaVariazione", "UnloadEvent", _e);
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DISSBOZDAVAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISSBOZDAVAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISSBOZDAVAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISSBOZDAVAR, Cancel);
    // Stub
  }

  private void PAN_DISSBOZDAVAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DISSBOZDAVAR_DISSOCBUTTON)
    {
      this.IdxPanelActived = this.PAN_DISSBOZDAVAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Dissocia();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DISSBOZDAVAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISSBOZDAVAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISSBOZDAVAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DISSBOZDAVAR_Init()
  {

    PAN_DISSBOZDAVAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISSBOZDAVAR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DISSBOZDAVAR.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_DISSBOZDAVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, "1BD1C366-9D82-4D66-A89A-84D399250C26");
    PAN_DISSBOZDAVAR.set_Header(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, "VARIAZIONE ID");
    PAN_DISSBOZDAVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, "");
    PAN_DISSBOZDAVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, MyGlb.VIS_NORMFIELPADR);
    PAN_DISSBOZDAVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISSBOZDAVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, "BFCA69A4-BC3B-473C-AD8F-3FB96A68907E");
    PAN_DISSBOZDAVAR.set_Header(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, "Bilancio/P.e.g.");
    PAN_DISSBOZDAVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, "");
    PAN_DISSBOZDAVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, MyGlb.VIS_VISULOOUPCF4);
    PAN_DISSBOZDAVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISSBOZDAVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, "0BE1373F-51F5-4E37-8863-9C03CB8C641D");
    PAN_DISSBOZDAVAR.set_Header(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, "Descrizione");
    PAN_DISSBOZDAVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, "");
    PAN_DISSBOZDAVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, MyGlb.VIS_VISULOOUPCF4);
    PAN_DISSBOZDAVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISSBOZDAVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DISSOCBUTTON, "BCE2FF31-467E-4085-80C8-153B150D0169");
    PAN_DISSBOZDAVAR.set_Header(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DISSOCBUTTON, "Dissocia");
    PAN_DISSBOZDAVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DISSOCBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_DISSBOZDAVAR.SetImage(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DISSOCBUTTON, 0, "button1.gif", false);
    PAN_DISSBOZDAVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DISSOCBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DISSBOZDAVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, "89F2690C-FD67-4AD6-BEB3-BAF316DE25EA");
    PAN_DISSBOZDAVAR.set_Header(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, "New Expression");
    PAN_DISSBOZDAVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, "");
    PAN_DISSBOZDAVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, MyGlb.VIS_NORMFIELPADR);
    PAN_DISSBOZDAVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISSBOZDAVAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISSBOZDAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISSBOZDAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, MyGlb.PANEL_LIST, 84);
    PAN_DISSBOZDAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, MyGlb.PANEL_LIST, 1);
    PAN_DISSBOZDAVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, MyGlb.PANEL_LIST, "VARIAZIONE ID");
    PAN_DISSBOZDAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, MyGlb.PANEL_FORM, 4, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISSBOZDAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, MyGlb.PANEL_FORM, 84);
    PAN_DISSBOZDAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, MyGlb.PANEL_FORM, 1);
    PAN_DISSBOZDAVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_VARIAZIONEID, MyGlb.PANEL_FORM, "VARIAZ. ID");
    PAN_DISSBOZDAVAR.SetFieldPage(PFL_DISSBOZDAVAR_VARIAZIONEID, -1, -1);
    PAN_DISSBOZDAVAR.SetFieldPanel(PFL_DISSBOZDAVAR_VARIAZIONEID, PPQRY_POLPROVARD11, "A.VARIAZIONE_ID", "VARIAZIONE_ID", 1, 4, 0, -13997);
    PAN_DISSBOZDAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISSBOZDAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, MyGlb.PANEL_LIST, 132);
    PAN_DISSBOZDAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, MyGlb.PANEL_LIST, 1);
    PAN_DISSBOZDAVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, MyGlb.PANEL_LIST, "Bilancio P e g");
    PAN_DISSBOZDAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISSBOZDAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, MyGlb.PANEL_FORM, 132);
    PAN_DISSBOZDAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, MyGlb.PANEL_FORM, 1);
    PAN_DISSBOZDAVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_BILANCIOPEG, MyGlb.PANEL_FORM, "Bilancio/P.e.g.");
    PAN_DISSBOZDAVAR.SetFieldPage(PFL_DISSBOZDAVAR_BILANCIOPEG, -1, -1);
    PAN_DISSBOZDAVAR.SetFieldPanel(PFL_DISSBOZDAVAR_BILANCIOPEG, PPQRY_POLVARBILPEG, "A.BIL_PEG", "POLVARBILPEG", 5, 1, 0, -13997);
    PAN_DISSBOZDAVAR.SetValueListItem(PFL_DISSBOZDAVAR_BILANCIOPEG, (new IDVariant("B")), "di Bilancio", "", "", -1);
    PAN_DISSBOZDAVAR.SetValueListItem(PFL_DISSBOZDAVAR_BILANCIOPEG, (new IDVariant("P")), "di P.e.g.", "", "", -1);
    PAN_DISSBOZDAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, MyGlb.PANEL_LIST, 80, 36, 400, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISSBOZDAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, MyGlb.PANEL_LIST, 204);
    PAN_DISSBOZDAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DISSBOZDAVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DISSBOZDAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 712, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISSBOZDAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, MyGlb.PANEL_FORM, 204);
    PAN_DISSBOZDAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DISSBOZDAVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DISSBOZDAVAR.SetFieldPage(PFL_DISSBOZDAVAR_DESCRIZIONE, -1, -1);
    PAN_DISSBOZDAVAR.SetFieldPanel(PFL_DISSBOZDAVAR_DESCRIZIONE, PPQRY_POLVARBILPEG, "A.DESCRIZIONE", "POLVARBIPEDE", 5, 200, 0, -13997);
    PAN_DISSBOZDAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DISSOCBUTTON, MyGlb.PANEL_LIST, 400, 92, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISSBOZDAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DISSOCBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_DISSBOZDAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DISSOCBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_DISSBOZDAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DISSOCBUTTON, MyGlb.PANEL_FORM, 340, 88, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISSBOZDAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DISSOCBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_DISSBOZDAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_DISSOCBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_DISSBOZDAVAR.SetFieldPage(PFL_DISSBOZDAVAR_DISSOCBUTTON, -1, -1);
    PAN_DISSBOZDAVAR.SetFieldPanel(PFL_DISSBOZDAVAR_DISSOCBUTTON, -1, "", "DISSOCBUTTON", 0, 0, 0, -13997);
    PAN_DISSBOZDAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISSBOZDAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, MyGlb.PANEL_LIST, 84);
    PAN_DISSBOZDAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, MyGlb.PANEL_LIST, 1);
    PAN_DISSBOZDAVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, MyGlb.PANEL_LIST, "New Expression");
    PAN_DISSBOZDAVAR.SetRect(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, MyGlb.PANEL_FORM, 4, 64, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISSBOZDAVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, MyGlb.PANEL_FORM, 84);
    PAN_DISSBOZDAVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, MyGlb.PANEL_FORM, 1);
    PAN_DISSBOZDAVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISSBOZDAVAR_NEWEXPRESSIO, MyGlb.PANEL_FORM, "New Expres.");
    PAN_DISSBOZDAVAR.SetFieldPage(PFL_DISSBOZDAVAR_NEWEXPRESSIO, -1, -1);
    PAN_DISSBOZDAVAR.SetFieldUnbound(PFL_DISSBOZDAVAR_NEWEXPRESSIO, true);
    PAN_DISSBOZDAVAR.SetFieldPanel(PFL_DISSBOZDAVAR_NEWEXPRESSIO, PPQRY_POLPROVARD11, "SUM(1)", "RECORNEWEXPR", 1, 19, 0, -13997);
  }

  private void PAN_DISSBOZDAVAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISSBOZDAVAR.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.BIL_PEG as POLVARBILPEG, ");
    SQL.append("  A.DESCRIZIONE as POLVARBIPEDE ");
    SQL.append("from ");
    SQL.append("  POL_VARIAZIONI_BIL_PEG A ");
    SQL.append("where (A.VARIAZIONE_ID = ~~VARIAZIONE_ID~~) ");
    PAN_DISSBOZDAVAR.SetQuery(PPQRY_POLVARBILPEG, 0, SQL, -1, "");
    PAN_DISSBOZDAVAR.SetQueryDB(PPQRY_POLVARBILPEG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISSBOZDAVAR.SetMasterTable(PPQRY_POLVARBILPEG, "POL_VARIAZIONI_BIL_PEG");
    PAN_DISSBOZDAVAR.SetIMDB(IMDB, "PQRY_POLPROVARD11", true);
    PAN_DISSBOZDAVAR.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.VARIAZIONE_ID as VARIAZIONE_ID, ");
    SQL.append("  SUM(1) as RECORNEWEXPR ");
    PAN_DISSBOZDAVAR.SetQuery(PPQRY_POLPROVARD11, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT A, ");
    SQL.append("  POL_VARIAZIONI_BIL_PEG B ");
    PAN_DISSBOZDAVAR.SetQuery(PPQRY_POLPROVARD11, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.BOZZA_VARIAZIONE_ID = ~~TBL_PARS13.ROWNAMBOVAID~~) ");
    SQL.append("and   (A.COD_REC = 2) ");
    SQL.append("and   (NOT ((A.VARIAZIONE_ID IS NULL))) ");
    PAN_DISSBOZDAVAR.SetQuery(PPQRY_POLPROVARD11, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.VARIAZIONE_ID ");
    PAN_DISSBOZDAVAR.SetQuery(PPQRY_POLPROVARD11, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISSBOZDAVAR.SetQuery(PPQRY_POLPROVARD11, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.VARIAZIONE_ID ");
    PAN_DISSBOZDAVAR.SetQuery(PPQRY_POLPROVARD11, 5, SQL, -1, "");
    PAN_DISSBOZDAVAR.SetQueryDB(PPQRY_POLPROVARD11, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISSBOZDAVAR.SetMasterTable(0, "POL_PROPOSTE_VAR_DETT");
    PAN_DISSBOZDAVAR.AddToSortList(PFL_DISSBOZDAVAR_VARIAZIONEID, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISSBOZDAVAR.Status() == 2)
    {
      int oldListQBE = PAN_DISSBOZDAVAR.iUseListQBE;
      PAN_DISSBOZDAVAR.iUseListQBE = 0;
      PAN_DISSBOZDAVAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISSBOZDAVAR.PanelCommand(Glb.PCM_FIND);
      PAN_DISSBOZDAVAR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DISSBOZDAVAR) PAN_DISSBOZDAVAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISSBOZDAVAR) PAN_DISSBOZDAVAR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DISSBOZDAVAR) PAN_DISSBOZDAVAR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISSBOZDAVAR) PAN_DISSBOZDAVAR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DISSBOZDAVAR) PAN_DISSBOZDAVAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
  }

  public void OnPreview(OBook SrcObj)
  {
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
