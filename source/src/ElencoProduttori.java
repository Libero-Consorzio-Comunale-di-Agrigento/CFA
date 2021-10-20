// **********************************************
// Elenco Produttori
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoProduttori extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PRODUTTORI_CODICE = 0;
  private static int PFL_PRODUTTORI_RAGIONSOCIAL = 1;
  private static int PFL_PRODUTTORI_RIFREGIONALE = 2;

  private static int PPQRY_PRODUTTORI = 0;


  IDPanel PAN_PRODUTTORI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_PRODUTTORI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_PRODUTTORI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PRODUTTORI, 3);
    IMDB.set_TblCode(IMDBDef7.PQRY_PRODUTTORI, "PQRY_PRODUTTORI");
    IMDB.set_FldCode(IMDBDef7.PQRY_PRODUTTORI,IMDBDef7.PQSL_PRODUTTORI_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef7.PQRY_PRODUTTORI,IMDBDef7.PQSL_PRODUTTORI_CODICE,1,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PRODUTTORI,IMDBDef7.PQSL_PRODUTTORI_RAGIONE_SOCIALE, "RAGIONE_SOCIALE");
    IMDB.SetFldParams(IMDBDef7.PQRY_PRODUTTORI,IMDBDef7.PQSL_PRODUTTORI_RAGIONE_SOCIALE,5,50,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_PRODUTTORI,IMDBDef7.PQSL_PRODUTTORI_RIF_REGIONALE, "RIF_REGIONALE");
    IMDB.SetFldParams(IMDBDef7.PQRY_PRODUTTORI,IMDBDef7.PQSL_PRODUTTORI_RIF_REGIONALE,5,10,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_PRODUTTORI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoProduttori(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoProduttori()
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
    FormIdx = MyGlb.FRM_ELENCOPRODUT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CA8C8A92-2A97-4753-B742-9B6864C27B78";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 560;
    DesignHeight = 362;
    set_Caption(new IDVariant("Elenco Produttori"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 560;
    Frames[1].Height = 336;
    Frames[1].Caption = "Produttori";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    PAN_PRODUTTORI = new IDPanel(w, this, 1, "PAN_PRODUTTORI");
    Frames[1].Content = PAN_PRODUTTORI;
    PAN_PRODUTTORI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PRODUTTORI.VS = MainFrm.VisualStyleList;
    PAN_PRODUTTORI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 560-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PRODUTTORI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EEDA75B2-77A3-42D9-9AF6-9A74F5C3BF11");
    PAN_PRODUTTORI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 520, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRODUTTORI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PRODUTTORI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PRODUTTORI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PRODUTTORI.InitStatus = 2;
    PAN_PRODUTTORI_Init();
    PAN_PRODUTTORI_InitFields();
    PAN_PRODUTTORI_InitQueries();
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
      PAN_PRODUTTORI.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoProduttori);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoProduttori.class.getName() : (Glb.ClassWithPackage(ElencoProduttori.class) ? ElencoProduttori.class.getName().substring(ElencoProduttori.class.getPackage().getName().length() + 1) : ElencoProduttori.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Produttori On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PRODUTTORI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PRODUTTORI);
      // 
      // Produttori On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PRODUTTORI.set_ToolTip(Glb.OBJ_FIELD,PFL_PRODUTTORI_RAGIONSOCIAL,(new IDVariant(PAN_PRODUTTORI.FieldText(PFL_PRODUTTORI_RAGIONSOCIAL))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoProduttori", "ProduttoriOnDynamicPropertiesEvent", _e);
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
  private void PAN_PRODUTTORI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PRODUTTORI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PRODUTTORI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PRODUTTORI, Cancel);
    // Stub
  }

  private void PAN_PRODUTTORI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PRODUTTORI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PRODUTTORI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PRODUTTORI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PRODUTTORI_Init()
  {

    PAN_PRODUTTORI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PRODUTTORI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PRODUTTORI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PRODUTTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, "46811A3B-F0E7-4BE4-A6B8-083FEE84FACC");
    PAN_PRODUTTORI.set_Header(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, "Codice");
    PAN_PRODUTTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, "");
    PAN_PRODUTTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_PRODUTTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PRODUTTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, "88404879-CD51-4BC6-9F61-97FC11ADAB39");
    PAN_PRODUTTORI.set_Header(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, "Ragione Sociale");
    PAN_PRODUTTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, "");
    PAN_PRODUTTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PRODUTTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_PRODUTTORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, "6CA2EAF8-AE30-4911-80E6-1436224E1BDD");
    PAN_PRODUTTORI.set_Header(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, "Rif. Regionale");
    PAN_PRODUTTORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, "");
    PAN_PRODUTTORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PRODUTTORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
  }

  private void PAN_PRODUTTORI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PRODUTTORI.SetRect(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRODUTTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_PRODUTTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_PRODUTTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_PRODUTTORI.SetRect(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, MyGlb.PANEL_FORM, 4, 28, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRODUTTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_PRODUTTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_PRODUTTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_PRODUTTORI.SetFieldPage(PFL_PRODUTTORI_CODICE, -1, -1);
    PAN_PRODUTTORI.SetFieldPanel(PFL_PRODUTTORI_CODICE, PPQRY_PRODUTTORI, "A.CODICE", "CODICE", 1, 8, 0, -13997);
    PAN_PRODUTTORI.SetRect(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 96, 36, 312, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PRODUTTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 100);
    PAN_PRODUTTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_PRODUTTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_PRODUTTORI.SetRect(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 52, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRODUTTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 100);
    PAN_PRODUTTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_PRODUTTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_PRODUTTORI.SetFieldPage(PFL_PRODUTTORI_RAGIONSOCIAL, -1, -1);
    PAN_PRODUTTORI.SetFieldPanel(PFL_PRODUTTORI_RAGIONSOCIAL, PPQRY_PRODUTTORI, "B.RAGIONE_SOCIALE", "RAGIONE_SOCIALE", 5, 50, 0, -13997);
    PAN_PRODUTTORI.SetRect(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, MyGlb.PANEL_LIST, 408, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRODUTTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, MyGlb.PANEL_LIST, 88);
    PAN_PRODUTTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, MyGlb.PANEL_LIST, 1);
    PAN_PRODUTTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, MyGlb.PANEL_LIST, "Rif. Regionale");
    PAN_PRODUTTORI.SetRect(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PRODUTTORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, MyGlb.PANEL_FORM, 104);
    PAN_PRODUTTORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, MyGlb.PANEL_FORM, 1);
    PAN_PRODUTTORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PRODUTTORI_RIFREGIONALE, MyGlb.PANEL_FORM, "Rif. Regionale");
    PAN_PRODUTTORI.SetFieldPage(PFL_PRODUTTORI_RIFREGIONALE, -1, -1);
    PAN_PRODUTTORI.SetFieldPanel(PFL_PRODUTTORI_RIFREGIONALE, PPQRY_PRODUTTORI, "A.RIF_REGIONALE", "RIF_REGIONALE", 5, 10, 0, -13997);
  }

  private void PAN_PRODUTTORI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PRODUTTORI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PRODUTTORI.SetIMDB(IMDB, "PQRY_PRODUTTORI", true);
    PAN_PRODUTTORI.set_SetString(MyGlb.MASTER_ROWNAME, "PRODUTTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  B.RAGIONE_SOCIALE as RAGIONE_SOCIALE, ");
    SQL.append("  A.RIF_REGIONALE as RIF_REGIONALE ");
    PAN_PRODUTTORI.SetQuery(PPQRY_PRODUTTORI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PRODUTTORI A, ");
    SQL.append("  SOGGETTI B ");
    PAN_PRODUTTORI.SetQuery(PPQRY_PRODUTTORI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SOGGETTO = B.SOGGETTO) ");
    PAN_PRODUTTORI.SetQuery(PPQRY_PRODUTTORI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PRODUTTORI.SetQuery(PPQRY_PRODUTTORI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PRODUTTORI.SetQuery(PPQRY_PRODUTTORI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PRODUTTORI.SetQuery(PPQRY_PRODUTTORI, 5, SQL, -1, "");
    PAN_PRODUTTORI.SetQueryDB(PPQRY_PRODUTTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PRODUTTORI.SetMasterTable(0, "PRODUTTORI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PRODUTTORI.Status() == 2)
    {
      int oldListQBE = PAN_PRODUTTORI.iUseListQBE;
      PAN_PRODUTTORI.iUseListQBE = 0;
      PAN_PRODUTTORI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PRODUTTORI.PanelCommand(Glb.PCM_FIND);
      PAN_PRODUTTORI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PRODUTTORI) PAN_PRODUTTORI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PRODUTTORI) PAN_PRODUTTORI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PRODUTTORI) PAN_PRODUTTORI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PRODUTTORI) PAN_PRODUTTORI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PRODUTTORI) PAN_PRODUTTORI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
