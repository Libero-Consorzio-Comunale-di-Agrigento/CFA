// **********************************************
// Log Cancellazioni Unita Organizzative
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LogCancellazioniUnitaOrganizzative extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_LOGCANUNIORG_INSERIMENTO = 0;
  private static int GRP_LOGCANUNIORG_AGGIORNAMENT = 1;

  private static int PFL_LOGCANUNIORG_PROGRESSIVO = 0;
  private static int PFL_LOGCANUNIORG_ESERCIZIO = 1;
  private static int PFL_LOGCANUNIORG_ES = 2;
  private static int PFL_LOGCANUNIORG_CAPITOLO = 3;
  private static int PFL_LOGCANUNIORG_ARTICOLO = 4;
  private static int PFL_LOGCANUNIORG_PROGUNITORGA = 5;
  private static int PFL_LOGCANUNIORG_TIPOUNITORGA = 6;
  private static int PFL_LOGCANUNIORG_PREVALENTE = 7;
  private static int PFL_LOGCANUNIORG_SCADENZA = 8;
  private static int PFL_LOGCANUNIORG_UTENTECANCEL = 9;
  private static int PFL_LOGCANUNIORG_DATACANCELLA = 10;
  private static int PFL_LOGCANUNIORG_UTENTEINSERI = 11;
  private static int PFL_LOGCANUNIORG_DATAINSERIME = 12;
  private static int PFL_LOGCANUNIORG_UTENTULTIAGG = 13;
  private static int PFL_LOGCANUNIORG_DATAULTIMAGG = 14;

  private static int PPQRY_LOGCAPUODEL = 0;

  private static int PPQRY_DUAL1 = 1;
  private static int PPQRY_DUAL2 = 2;
  private static int PPQRY_DUAL3 = 3;
  private static int PPQRY_DUAL = 4;


  IDPanel PAN_LOGCANUNIORG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN18(IMDB);
    //
    //
    Init_PQRY_LOGCAPUODEL(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN18(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_IN18, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_IN18, "TBL_IN18");
    IMDB.set_FldCode(IMDBDef3.TBL_IN18,IMDBDef3.FLD_IN18_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef3.TBL_IN18,IMDBDef3.FLD_IN18_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IN18,IMDBDef3.FLD_IN18_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef3.TBL_IN18,IMDBDef3.FLD_IN18_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IN18,IMDBDef3.FLD_IN18_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_IN18,IMDBDef3.FLD_IN18_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IN18,IMDBDef3.FLD_IN18_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_IN18,IMDBDef3.FLD_IN18_NOMEOGGEARTI,1,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_IN18, 0);
  }

  private static void Init_PQRY_LOGCAPUODEL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_LOGCAPUODEL, 15);
    IMDB.set_TblCode(IMDBDef11.PQRY_LOGCAPUODEL, "PQRY_LOGCAPUODEL");
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODEP1, "LOGCAPUODEP1");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODEP1,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODEE1, "LOGCAPUODEE1");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODEE1,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODEES, "LOGCAPUODEES");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODEES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODECA, "LOGCAPUODECA");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODECA,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODEAR, "LOGCAPUODEAR");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODEAR,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEPRUO, "LOCAUODEPRUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEPRUO,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODETIUO, "LOCAUODETIUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODETIUO,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODEPR, "LOGCAPUODEPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODEPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODESC, "LOGCAPUODESC");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOGCAPUODESC,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEUTIN, "LOCAUODEUTIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEUTIN,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEDAIN, "LOCAUODEDAIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEDAIN,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEUTUA, "LOCAUODEUTUA");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEUTUA,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEDAUA, "LOCAUODEDAUA");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEDAUA,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEUTCA, "LOCAUODEUTCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEUTCA,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEDACA, "LOCAUODEDACA");
    IMDB.SetFldParams(IMDBDef11.PQRY_LOGCAPUODEL,IMDBDef11.PQSL_LOGCAPUODEL_LOCAUODEDACA,8,19,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_LOGCAPUODEL, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LogCancellazioniUnitaOrganizzative(MyWebEntryPoint w, IMDBObj imdb)
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
  public LogCancellazioniUnitaOrganizzative()
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
    FormIdx = MyGlb.FRM_LOGCANUNIORG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CA2895BC-6288-4DB2-B2F1-A3A311C694CC";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 832;
    DesignHeight = 434;
    set_Caption(new IDVariant("Log Cancellazioni Unita Organizzative"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 832;
    Frames[1].Height = 408;
    Frames[1].Caption = "Log Cancellazioni Unità Organizzative";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 408;
    PAN_LOGCANUNIORG = new IDPanel(w, this, 1, "PAN_LOGCANUNIORG");
    Frames[1].Content = PAN_LOGCANUNIORG;
    PAN_LOGCANUNIORG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LOGCANUNIORG.VS = MainFrm.VisualStyleList;
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 408-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8EAC1212-73A4-497F-9B4D-CC12192F8CB3");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 740, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LOGCANUNIORG.InitStatus = 2;
    PAN_LOGCANUNIORG_Init();
    PAN_LOGCANUNIORG_InitFields();
    PAN_LOGCANUNIORG_InitQueries();
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
      PAN_LOGCANUNIORG.UpdatePanel(MainFrm);
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
    return (obj instanceof LogCancellazioniUnitaOrganizzative);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LogCancellazioniUnitaOrganizzative.class.getName() : (Glb.ClassWithPackage(LogCancellazioniUnitaOrganizzative.class) ? LogCancellazioniUnitaOrganizzative.class.getName().substring(LogCancellazioniUnitaOrganizzative.class.getPackage().getName().length() + 1) : LogCancellazioniUnitaOrganizzative.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_INDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LogCancellazioniUnitaOrganizzative", "Unload", _e);
    }
  }

  // **********************************************************************
  // IN: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_INDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_IN18, IMDBDef3.FLD_IN18_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IN18, IMDBDef3.FLD_IN18_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IN18, IMDBDef3.FLD_IN18_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IN18, IMDBDef3.FLD_IN18_NOMEOGGEARTI, 0, new IDVariant());
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
  private void PAN_LOGCANUNIORG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LOGCANUNIORG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LOGCANUNIORG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LOGCANUNIORG, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LOGCANUNIORG_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_LOGCANUNIORG);
    // Stub
  }

  private void PAN_LOGCANUNIORG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_LOGCANUNIORG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_LOGCANUNIORG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LOGCANUNIORG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LOGCANUNIORG_Init()
  {

    PAN_LOGCANUNIORG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LOGCANUNIORG.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_INSERIMENTO, "855FE47C-A0E8-4E19-BCA7-88AF90DE2FE3");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_INSERIMENTO, "Inserimento");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_INSERIMENTO, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_INSERIMENTO, MyGlb.PANEL_LIST, 20, 267, 352, 49, 0, 0);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_INSERIMENTO, MyGlb.PANEL_FORM, 0, 147, 312, 73, 0, 0);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_INSERIMENTO, 0, 70);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_INSERIMENTO, 1, 13);
    PAN_LOGCANUNIORG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_INSERIMENTO, 0, 4);
    PAN_LOGCANUNIORG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_INSERIMENTO, 1, 4);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_AGGIORNAMENT, "129CA5E2-63E7-4F6D-9C07-4498684EBF1F");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_AGGIORNAMENT, "Aggiornamento");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_AGGIORNAMENT, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_AGGIORNAMENT, MyGlb.PANEL_LIST, 384, 267, 344, 49, 0, 0);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_AGGIORNAMENT, MyGlb.PANEL_FORM, 0, 195, 312, 73, 0, 0);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_AGGIORNAMENT, 0, 88);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_AGGIORNAMENT, 1, 13);
    PAN_LOGCANUNIORG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_AGGIORNAMENT, 0, 4);
    PAN_LOGCANUNIORG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_AGGIORNAMENT, 1, 4);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_GROUP, GRP_LOGCANUNIORG_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LOGCANUNIORG.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, "BBF54447-6FB9-493A-A282-D6B7C8DDA37F");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, "PROGRESSIVO");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, "B754B89B-70D0-4A19-A9DC-82ADCD9991DE");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, "ESERCIZIO");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, "A2DA547C-767C-472B-B9EB-0D5CB34E7A19");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, "E S");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, "CD8EB094-D743-4FA5-9FE2-B6DF13DD0660");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, "CAPITOLO");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, "F41297D7-3D9A-4D86-8718-8A176D33BCAA");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, "ARTICOLO");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, "9A0BBD16-61D8-4B63-BEBF-CD2E53977C5E");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, "Unità Organizzativa");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISKEY, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, "9FA31856-3399-4981-A7D5-B49F4C0C68B7");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, "Tipo U.O.");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, "EE58F156-6651-415E-926E-C1FE186B50C7");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, "Prevalente");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, MyGlb.VIS_CHECKSTYLE);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, "2A580039-667C-48DB-A285-1250A9F4D3FD");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, "Scadenza");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, "0148326A-9B80-47BC-8458-04B4CF978AB4");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, "Utente Cancellazione");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, "40327EC2-9B0D-4C38-A6A2-6E482A2E4521");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, "Data Cancellazione");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, "73C3E07F-8070-49CD-AB8A-4F85091A5E72");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, "Utente");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, "7EDC18F2-704D-4553-BB91-B2E0CAEE632D");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, "Data");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, "9AC78DBE-87CD-4E47-870B-96A28140FB8B");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, "Utente");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_LOGCANUNIORG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, "F6C36C72-1C0D-47A5-B82D-81324799101C");
    PAN_LOGCANUNIORG.set_Header(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, "Data");
    PAN_LOGCANUNIORG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, "");
    PAN_LOGCANUNIORG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_LOGCANUNIORG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_LOGCANUNIORG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, MyGlb.PANEL_FORM, 160);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_PROGRESSIVO, -1, -1);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_PROGRESSIVO, PPQRY_LOGCAPUODEL, "A.PROGRESSIVO", "LOGCAPUODEP1", 2, 15, 0, -13997);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, MyGlb.PANEL_FORM, 220, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_ESERCIZIO, -1, -1);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_ESERCIZIO, PPQRY_LOGCAPUODEL, "A.ESERCIZIO", "LOGCAPUODEE1", 1, 4, 0, -13997);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, MyGlb.PANEL_LIST, 24);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, MyGlb.PANEL_LIST, "E S");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, MyGlb.PANEL_FORM, 356, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, MyGlb.PANEL_FORM, 40);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ES, MyGlb.PANEL_FORM, "E S");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_ES, -1, -1);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_ES, PPQRY_LOGCAPUODEL, "A.E_S", "LOGCAPUODEES", 5, 1, 0, -13997);
    PAN_LOGCANUNIORG.SetValueListItem(PFL_LOGCANUNIORG_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_LOGCANUNIORG.SetValueListItem(PFL_LOGCANUNIORG_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, MyGlb.PANEL_LIST, "CAP.");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, MyGlb.PANEL_FORM, 160);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_CAPITOLO, -1, -1);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_CAPITOLO, PPQRY_LOGCAPUODEL, "A.CAPITOLO", "LOGCAPUODECA", 3, 16, 0, -13997);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, MyGlb.PANEL_FORM, 160);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_ARTICOLO, -1, -1);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_ARTICOLO, PPQRY_LOGCAPUODEL, "A.ARTICOLO", "LOGCAPUODEAR", 1, 2, 0, -13997);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, MyGlb.PANEL_LIST, 0, 36, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 76, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, MyGlb.PANEL_FORM, 160);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PROGUNITORGA, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_PROGUNITORGA, -1, -1);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_PROGUNITORGA, PPQRY_LOGCAPUODEL, "A.PROGR_UNITA_ORGANIZZATIVA", "LOCAUODEPRUO", 1, 8, 0, -13997);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, MyGlb.PANEL_LIST, 268, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, MyGlb.PANEL_LIST, 172);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, MyGlb.PANEL_LIST, "Tipo U.O.");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, MyGlb.PANEL_FORM, 4, 100, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, MyGlb.PANEL_FORM, 160);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_TIPOUNITORGA, MyGlb.PANEL_FORM, "Tipo U.O.");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_TIPOUNITORGA, -1, -1);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_TIPOUNITORGA, PPQRY_LOGCAPUODEL, "A.TIPO_UNITA_ORGANIZZATIVA", "LOCAUODETIUO", 5, 1, 0, -13997);
    PAN_LOGCANUNIORG.SetValueListItem(PFL_LOGCANUNIORG_TIPOUNITORGA, (new IDVariant("G")), "Gestione", "", "", -1);
    PAN_LOGCANUNIORG.SetValueListItem(PFL_LOGCANUNIORG_TIPOUNITORGA, (new IDVariant("U")), "Utilizzo", "", "", -1);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, MyGlb.PANEL_LIST, 332, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, MyGlb.PANEL_LIST, 76);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, MyGlb.PANEL_LIST, "Prevalente");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, MyGlb.PANEL_FORM, 4, 124, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, MyGlb.PANEL_FORM, 160);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_PREVALENTE, MyGlb.PANEL_FORM, "Prevalente");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_PREVALENTE, -1, -1);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_PREVALENTE, PPQRY_LOGCAPUODEL, "A.PREVALENTE", "LOGCAPUODEPR", 5, 2, 0, -13997);
    PAN_LOGCANUNIORG.SetValueListItem(PFL_LOGCANUNIORG_PREVALENTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_LOGCANUNIORG.SetValueListItem(PFL_LOGCANUNIORG_PREVALENTE, (new IDVariant()), "Null", "", "", -1);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, MyGlb.PANEL_LIST, 404, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, MyGlb.PANEL_LIST, 68);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, MyGlb.PANEL_FORM, 4, 148, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, MyGlb.PANEL_FORM, 160);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_SCADENZA, -1, -1);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_SCADENZA, PPQRY_LOGCAPUODEL, "A.SCADENZA", "LOGCAPUODESC", 6, 19, 0, -13997);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, MyGlb.PANEL_LIST, 472, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, MyGlb.PANEL_LIST, 140);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, MyGlb.PANEL_LIST, "Utente Cancellazione");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, MyGlb.PANEL_FORM, 4, 268, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, MyGlb.PANEL_FORM, 160);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTECANCEL, MyGlb.PANEL_FORM, "Utente Cancellazione");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_UTENTECANCEL, -1, -1);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_UTENTECANCEL, PPQRY_LOGCAPUODEL, "A.UTENTE_CANCELLAZIONE", "LOCAUODEUTCA", 5, 8, 0, -13997);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, MyGlb.PANEL_LIST, 620, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, MyGlb.PANEL_LIST, 132);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, MyGlb.PANEL_LIST, "Data Cancellazione");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, MyGlb.PANEL_FORM, 220, 28, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, MyGlb.PANEL_FORM, 144);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATACANCELLA, MyGlb.PANEL_FORM, "Data Cancellazione");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_DATACANCELLA, -1, -1);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_DATACANCELLA, PPQRY_LOGCAPUODEL, "A.DATA_CANCELLAZIONE", "LOCAUODEDACA", 8, 19, 0, -13997);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, MyGlb.PANEL_LIST, 24, 292, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, MyGlb.PANEL_LIST, 60);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, MyGlb.PANEL_LIST, "Utente");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 172, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, MyGlb.PANEL_FORM, 160);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTEINSERI, MyGlb.PANEL_FORM, "Utente");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_UTENTEINSERI, -1, GRP_LOGCANUNIORG_INSERIMENTO);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_UTENTEINSERI, PPQRY_LOGCAPUODEL, "A.UTENTE_INSERIMENTO", "LOCAUODEUTIN", 5, 8, 0, -13997);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, MyGlb.PANEL_LIST, 248, 292, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, MyGlb.PANEL_LIST, 36);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, MyGlb.PANEL_LIST, "Data");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, MyGlb.PANEL_FORM, 4, 196, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, MyGlb.PANEL_FORM, 160);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAINSERIME, MyGlb.PANEL_FORM, "Data");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_DATAINSERIME, -1, GRP_LOGCANUNIORG_INSERIMENTO);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_DATAINSERIME, PPQRY_LOGCAPUODEL, "A.DATA_INSERIMENTO", "LOCAUODEDAIN", 6, 19, 0, -13997);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, MyGlb.PANEL_LIST, 388, 292, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, MyGlb.PANEL_LIST, 48);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, MyGlb.PANEL_LIST, "Utente");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 220, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, MyGlb.PANEL_FORM, 160);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_UTENTULTIAGG, MyGlb.PANEL_FORM, "Utente");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_UTENTULTIAGG, -1, GRP_LOGCANUNIORG_AGGIORNAMENT);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_UTENTULTIAGG, PPQRY_LOGCAPUODEL, "A.UTENTE_ULTIMO_AGG", "LOCAUODEUTUA", 5, 8, 0, -13997);
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, MyGlb.PANEL_LIST, 604, 292, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, MyGlb.PANEL_LIST, 36);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, MyGlb.PANEL_LIST, "Data");
    PAN_LOGCANUNIORG.SetRect(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 244, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOGCANUNIORG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, MyGlb.PANEL_FORM, 160);
    PAN_LOGCANUNIORG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_LOGCANUNIORG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOGCANUNIORG_DATAULTIMAGG, MyGlb.PANEL_FORM, "Data");
    PAN_LOGCANUNIORG.SetFieldPage(PFL_LOGCANUNIORG_DATAULTIMAGG, -1, GRP_LOGCANUNIORG_AGGIORNAMENT);
    PAN_LOGCANUNIORG.SetFieldPanel(PFL_LOGCANUNIORG_DATAULTIMAGG, PPQRY_LOGCAPUODEL, "A.DATA_ULTIMO_AGG", "LOCAUODEDAUA", 6, 19, 0, -13997);
  }

  private void PAN_LOGCANUNIORG_InitQueries()
  {
    StringBuffer SQL;

    PAN_LOGCANUNIORG.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as DUSOANUNOPUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as DUALUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~LOCAUODEPRUO~~) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_LOGCANUNIORG.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_LOGCANUNIORG_PROGUNITORGA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as DUSOANUNOPUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as DUALUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_LOGCANUNIORG.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_LOGCANUNIORG_PROGUNITORGA, "");
    PAN_LOGCANUNIORG.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~LOCAUODEUTCA~~ as LCUDUCLCUOL1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~LOCAUODEUTCA~~) as LCUDUCLCUOLC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~LOCAUODEUTCA~~ IS NULL))) ");
    PAN_LOGCANUNIORG.SetQuery(PPQRY_DUAL2, 0, SQL, PFL_LOGCANUNIORG_UTENTECANCEL, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~LOCAUODEUTCA~~ as LCUDUCLCUOL1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~LOCAUODEUTCA~~) as LCUDUCLCUOLC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_LOGCANUNIORG.SetQuery(PPQRY_DUAL2, 1, SQL, PFL_LOGCANUNIORG_UTENTECANCEL, "");
    PAN_LOGCANUNIORG.SetQueryDB(PPQRY_DUAL2, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~LOCAUODEUTIN~~ as LCUDUILCUOL1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~LOCAUODEUTIN~~) as LCUDUILCUOLC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~LOCAUODEUTIN~~ IS NULL))) ");
    PAN_LOGCANUNIORG.SetQuery(PPQRY_DUAL3, 0, SQL, PFL_LOGCANUNIORG_UTENTEINSERI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~LOCAUODEUTIN~~ as LCUDUILCUOL1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~LOCAUODEUTIN~~) as LCUDUILCUOLC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_LOGCANUNIORG.SetQuery(PPQRY_DUAL3, 1, SQL, PFL_LOGCANUNIORG_UTENTEINSERI, "");
    PAN_LOGCANUNIORG.SetQueryDB(PPQRY_DUAL3, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~LOCAUODEUTUA~~ as LCUDUUALCUO1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~LOCAUODEUTUA~~) as LCUDUUALCUOL ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~LOCAUODEUTUA~~ IS NULL))) ");
    PAN_LOGCANUNIORG.SetQuery(PPQRY_DUAL, 0, SQL, PFL_LOGCANUNIORG_UTENTULTIAGG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~LOCAUODEUTUA~~ as LCUDUUALCUO1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~LOCAUODEUTUA~~) as LCUDUUALCUOL ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_LOGCANUNIORG.SetQuery(PPQRY_DUAL, 1, SQL, PFL_LOGCANUNIORG_UTENTULTIAGG, "");
    PAN_LOGCANUNIORG.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LOGCANUNIORG.SetIMDB(IMDB, "PQRY_LOGCAPUODEL", true);
    PAN_LOGCANUNIORG.set_SetString(MyGlb.MASTER_ROWNAME, "LOG CAP UO DEL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as LOGCAPUODEP1, ");
    SQL.append("  A.ESERCIZIO as LOGCAPUODEE1, ");
    SQL.append("  A.E_S as LOGCAPUODEES, ");
    SQL.append("  A.CAPITOLO as LOGCAPUODECA, ");
    SQL.append("  A.ARTICOLO as LOGCAPUODEAR, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as LOCAUODEPRUO, ");
    SQL.append("  A.TIPO_UNITA_ORGANIZZATIVA as LOCAUODETIUO, ");
    SQL.append("  A.PREVALENTE as LOGCAPUODEPR, ");
    SQL.append("  A.SCADENZA as LOGCAPUODESC, ");
    SQL.append("  A.UTENTE_INSERIMENTO as LOCAUODEUTIN, ");
    SQL.append("  A.DATA_INSERIMENTO as LOCAUODEDAIN, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as LOCAUODEUTUA, ");
    SQL.append("  A.DATA_ULTIMO_AGG as LOCAUODEDAUA, ");
    SQL.append("  A.UTENTE_CANCELLAZIONE as LOCAUODEUTCA, ");
    SQL.append("  A.DATA_CANCELLAZIONE as LOCAUODEDACA ");
    PAN_LOGCANUNIORG.SetQuery(PPQRY_LOGCAPUODEL, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LOG_CAP_UO_DEL A ");
    PAN_LOGCANUNIORG.SetQuery(PPQRY_LOGCAPUODEL, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_IN18.NOMEOGGEESER~~) ");
    SQL.append("and   (A.E_S = ~~TBL_IN18.NOMEOGGETTES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_IN18.NOMEOGGECAPI~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_IN18.NOMEOGGEARTI~~) ");
    PAN_LOGCANUNIORG.SetQuery(PPQRY_LOGCAPUODEL, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LOGCANUNIORG.SetQuery(PPQRY_LOGCAPUODEL, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LOGCANUNIORG.SetQuery(PPQRY_LOGCAPUODEL, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.DATA_CANCELLAZIONE ");
    PAN_LOGCANUNIORG.SetQuery(PPQRY_LOGCAPUODEL, 5, SQL, -1, "");
    PAN_LOGCANUNIORG.SetQueryDB(PPQRY_LOGCAPUODEL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LOGCANUNIORG.SetMasterTable(0, "LOG_CAP_UO_DEL");
    PAN_LOGCANUNIORG.AddToSortList(PFL_LOGCANUNIORG_DATACANCELLA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LOGCANUNIORG.Status() == 2)
    {
      int oldListQBE = PAN_LOGCANUNIORG.iUseListQBE;
      PAN_LOGCANUNIORG.iUseListQBE = 0;
      PAN_LOGCANUNIORG.PanelCommand(Glb.PCM_SEARCH);
      PAN_LOGCANUNIORG.PanelCommand(Glb.PCM_FIND);
      PAN_LOGCANUNIORG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_LOGCANUNIORG) PAN_LOGCANUNIORG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LOGCANUNIORG) PAN_LOGCANUNIORG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LOGCANUNIORG) PAN_LOGCANUNIORG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LOGCANUNIORG) PAN_LOGCANUNIORG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LOGCANUNIORG) PAN_LOGCANUNIORG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
