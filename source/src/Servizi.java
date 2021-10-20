// **********************************************
// Servizi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Servizi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SERVIZI_SERVIZIO = 0;
  private static int PFL_SERVIZI_FUNZIONE = 1;
  private static int PFL_SERVIZI_DESCRIZIONE = 2;

  private static int PPQRY_SERVIZI3 = 0;


  IDPanel PAN_SERVIZI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI455(IMDB);
    //
    //
    Init_PQRY_SERVIZI3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI455(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI455, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI455, "TBL_PARAMETRI455");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI455,IMDBDef1.FLD_PARAMETRI455_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI455,IMDBDef1.FLD_PARAMETRI455_ROWNAMEFUNZI,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI455, 0);
  }

  private static void Init_PQRY_SERVIZI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_SERVIZI3, 3);
    IMDB.set_TblCode(IMDBDef7.PQRY_SERVIZI3, "PQRY_SERVIZI3");
    IMDB.set_FldCode(IMDBDef7.PQRY_SERVIZI3,IMDBDef7.PQSL_SERVIZI3_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_SERVIZI3,IMDBDef7.PQSL_SERVIZI3_FUNZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SERVIZI3,IMDBDef7.PQSL_SERVIZI3_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef7.PQRY_SERVIZI3,IMDBDef7.PQSL_SERVIZI3_SERVIZIO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SERVIZI3,IMDBDef7.PQSL_SERVIZI3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_SERVIZI3,IMDBDef7.PQSL_SERVIZI3_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_SERVIZI3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Servizi(MyWebEntryPoint w, IMDBObj imdb)
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
  public Servizi()
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
    FormIdx = MyGlb.FRM_SERVIZI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F8AFA65D-AF67-4656-B033-0E0612BEFFEF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 596;
    DesignHeight = 390;
    set_Caption(new IDVariant("Servizi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 596;
    Frames[1].Height = 364;
    Frames[1].Caption = "Servizi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_SERVIZI = new IDPanel(w, this, 1, "PAN_SERVIZI");
    Frames[1].Content = PAN_SERVIZI;
    PAN_SERVIZI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SERVIZI.VS = MainFrm.VisualStyleList;
    PAN_SERVIZI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 596-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "47D9BFC2-521E-40B0-8E61-CFC6740B4D30");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 560, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SERVIZI.InitStatus = 2;
    PAN_SERVIZI_Init();
    PAN_SERVIZI_InitFields();
    PAN_SERVIZI_InitQueries();
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
      PAN_SERVIZI.UpdatePanel(MainFrm);
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
    return (obj instanceof Servizi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Servizi.class.getName() : (Glb.ClassWithPackage(Servizi.class) ? Servizi.class.getName().substring(Servizi.class.getPackage().getName().length() + 1) : Servizi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Servizi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SERVIZI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SERVIZI);
      // 
      // Servizi On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SERVIZI.set_ToolTip(Glb.OBJ_FIELD,PFL_SERVIZI_DESCRIZIONE,(new IDVariant(PAN_SERVIZI.FieldText(PFL_SERVIZI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Servizi", "ServiziOnDynamicPropertiesEvent", _e);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SERVIZI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SERVIZI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SERVIZI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SERVIZI, Cancel);
    // Stub
  }

  private void PAN_SERVIZI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SERVIZI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SERVIZI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SERVIZI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SERVIZI_Init()
  {

    PAN_SERVIZI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SERVIZI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SERVIZI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, "6AA20A79-523C-4FE7-B746-0B405D2D5CCD");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, "Servizio");
    PAN_SERVIZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, "D976E019-A83A-4007-A12E-95F48B9A2BAF");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, "Funzione");
    PAN_SERVIZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, "A12FEC9B-2B74-48BF-82E0-41D074F287B1");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, "Descrizione");
    PAN_SERVIZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_SERVIZI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_LIST, 56);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_LIST, "Servizio");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_FORM, 4, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_FORM, 88);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_FORM, "Servizio");
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_SERVIZIO, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_SERVIZIO, PPQRY_SERVIZI3, "A.SERVIZIO", "SERVIZIO", 1, 2, 0, -13997);
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_LIST, 72, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_LIST, 60);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_LIST, "Funzione");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_FORM, 88);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_FORM, "Funzione");
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_FUNZIONE, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_FUNZIONE, PPQRY_SERVIZI3, "A.FUNZIONE", "FUNZIONE", 1, 2, 0, -13997);
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_LIST, 144, 36, 416, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_DESCRIZIONE, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_DESCRIZIONE, PPQRY_SERVIZI3, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
  }

  private void PAN_SERVIZI_InitQueries()
  {
    StringBuffer SQL;

    PAN_SERVIZI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SERVIZI.SetIMDB(IMDB, "PQRY_SERVIZI3", true);
    PAN_SERVIZI.set_SetString(MyGlb.MASTER_ROWNAME, "SERVIZI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.SERVIZIO as SERVIZIO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_SERVIZI.SetQuery(PPQRY_SERVIZI3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  SERVIZI A ");
    PAN_SERVIZI.SetQuery(PPQRY_SERVIZI3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FUNZIONE = ~~TBL_PARAMETRI455.ROWNAMEFUNZI~~) ");
    PAN_SERVIZI.SetQuery(PPQRY_SERVIZI3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SERVIZI.SetQuery(PPQRY_SERVIZI3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SERVIZI.SetQuery(PPQRY_SERVIZI3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.SERVIZIO ");
    PAN_SERVIZI.SetQuery(PPQRY_SERVIZI3, 5, SQL, -1, "");
    PAN_SERVIZI.SetQueryDB(PPQRY_SERVIZI3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SERVIZI.SetMasterTable(0, "SERVIZI");
    PAN_SERVIZI.AddToSortList(PFL_SERVIZI_SERVIZIO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SERVIZI.Status() == 2)
    {
      int oldListQBE = PAN_SERVIZI.iUseListQBE;
      PAN_SERVIZI.iUseListQBE = 0;
      PAN_SERVIZI.PanelCommand(Glb.PCM_SEARCH);
      PAN_SERVIZI.PanelCommand(Glb.PCM_FIND);
      PAN_SERVIZI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SERVIZI) PAN_SERVIZI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SERVIZI) PAN_SERVIZI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SERVIZI) PAN_SERVIZI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SERVIZI) PAN_SERVIZI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SERVIZI) PAN_SERVIZI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
