// **********************************************
// Scelta UO Da CAP BIL UO
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaUODaCAPBILUO extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCELUNITORGA_PROGUNITORGA = 0;
  private static int PFL_SCELUNITORGA_CODIUNITORGA = 1;
  private static int PFL_SCELUNITORGA_DESCRIZIONE = 2;

  private static int PPQRY_CAPUO3 = 0;


  IDPanel PAN_SCELUNITORGA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN20(IMDB);
    //
    //
    Init_PQRY_CAPUO3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN20(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_IN20, 4);
    IMDB.set_TblCode(IMDBDef1.TBL_IN20, "TBL_IN20");
    IMDB.set_FldCode(IMDBDef1.TBL_IN20,IMDBDef1.FLD_IN20_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef1.TBL_IN20,IMDBDef1.FLD_IN20_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN20,IMDBDef1.FLD_IN20_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef1.TBL_IN20,IMDBDef1.FLD_IN20_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN20,IMDBDef1.FLD_IN20_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef1.TBL_IN20,IMDBDef1.FLD_IN20_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN20,IMDBDef1.FLD_IN20_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef1.TBL_IN20,IMDBDef1.FLD_IN20_NOMEOGGEARTI,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_IN20, 0);
  }

  private static void Init_PQRY_CAPUO3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_CAPUO3, 3);
    IMDB.set_TblCode(IMDBDef8.PQRY_CAPUO3, "PQRY_CAPUO3");
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPUO3,IMDBDef8.PQSL_CAPUO3_CACABIUOPRUO, "CACABIUOPRUO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPUO3,IMDBDef8.PQSL_CAPUO3_CACABIUOPRUO,1,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPUO3,IMDBDef8.PQSL_CAPUO3_CODIUNITORGA, "CODIUNITORGA");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPUO3,IMDBDef8.PQSL_CAPUO3_CODIUNITORGA,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAPUO3,IMDBDef8.PQSL_CAPUO3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAPUO3,IMDBDef8.PQSL_CAPUO3_DESCRIZIONE,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_CAPUO3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaUODaCAPBILUO(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaUODaCAPBILUO()
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
    FormIdx = MyGlb.FRM_SCUODACABIUO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8B7937F2-4B81-4A4F-BF58-25BB5D10A9E9";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 660;
    DesignHeight = 346;
    set_Caption(new IDVariant("Scelta Unità Organizzative"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 660;
    Frames[1].Height = 320;
    Frames[1].Caption = "Scelta Unità Organizzative";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 320;
    PAN_SCELUNITORGA = new IDPanel(w, this, 1, "PAN_SCELUNITORGA");
    Frames[1].Content = PAN_SCELUNITORGA;
    PAN_SCELUNITORGA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELUNITORGA.VS = MainFrm.VisualStyleList;
    PAN_SCELUNITORGA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 660-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELUNITORGA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B00D16D1-57B5-4DA0-89D4-2985A0B9C1EA");
    PAN_SCELUNITORGA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 612, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SCELUNITORGA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELUNITORGA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELUNITORGA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELUNITORGA.InitStatus = 2;
    PAN_SCELUNITORGA_Init();
    PAN_SCELUNITORGA_InitFields();
    PAN_SCELUNITORGA_InitQueries();
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
      PAN_SCELUNITORGA.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaUODaCAPBILUO);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaUODaCAPBILUO.class.getName() : (Glb.ClassWithPackage(SceltaUODaCAPBILUO.class) ? SceltaUODaCAPBILUO.class.getName().substring(SceltaUODaCAPBILUO.class.getPackage().getName().length() + 1) : SceltaUODaCAPBILUO.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Unità Organizzative On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELUNITORGA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELUNITORGA);
      // 
      // Scelta Unità Organizzative On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_SCELUNITORGA.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELUNITORGA_DESCRIZIONE,(new IDVariant(PAN_SCELUNITORGA.FieldText(PFL_SCELUNITORGA_DESCRIZIONE))).stringValue()); 
      PAN_SCELUNITORGA.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELUNITORGA_CODIUNITORGA,(new IDVariant(PAN_SCELUNITORGA.FieldText(PFL_SCELUNITORGA_CODIUNITORGA))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaUODaCAPBILUO", "SceltaUnitàOrganizzativeOnDynamicProperties", _e);
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
  private void PAN_SCELUNITORGA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELUNITORGA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELUNITORGA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELUNITORGA, Cancel);
    // Stub
  }

  private void PAN_SCELUNITORGA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELUNITORGA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELUNITORGA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELUNITORGA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELUNITORGA_Init()
  {

    PAN_SCELUNITORGA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELUNITORGA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELUNITORGA.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_SCELUNITORGA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, "A2B33AF8-AAD5-43A7-84F9-BF656150524E");
    PAN_SCELUNITORGA.set_Header(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_SCELUNITORGA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, "");
    PAN_SCELUNITORGA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELUNITORGA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SCELUNITORGA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, "CE63BDB2-58D0-4226-A2F3-458DCA8F418A");
    PAN_SCELUNITORGA.set_Header(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, "Codice");
    PAN_SCELUNITORGA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, "");
    PAN_SCELUNITORGA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELUNITORGA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELUNITORGA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, "9C932EBE-96E3-48E5-8261-28C2659C7D72");
    PAN_SCELUNITORGA.set_Header(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, "Descrizione");
    PAN_SCELUNITORGA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, "");
    PAN_SCELUNITORGA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELUNITORGA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELUNITORGA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELUNITORGA.SetRect(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELUNITORGA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_SCELUNITORGA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_SCELUNITORGA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_SCELUNITORGA.SetRect(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 4, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELUNITORGA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_SCELUNITORGA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_SCELUNITORGA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_PROGUNITORGA, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_SCELUNITORGA.SetFieldPage(PFL_SCELUNITORGA_PROGUNITORGA, -1, -1);
    PAN_SCELUNITORGA.SetFieldPanel(PFL_SCELUNITORGA_PROGUNITORGA, PPQRY_CAPUO3, "A.PROGR_UNITA_ORGANIZZATIVA", "CACABIUOPRUO", 1, 10, 0, -13997);
    PAN_SCELUNITORGA.SetRect(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELUNITORGA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, MyGlb.PANEL_LIST, 164);
    PAN_SCELUNITORGA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_SCELUNITORGA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, MyGlb.PANEL_LIST, "Codice");
    PAN_SCELUNITORGA.SetRect(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, MyGlb.PANEL_FORM, 4, 28, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELUNITORGA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, MyGlb.PANEL_FORM, 164);
    PAN_SCELUNITORGA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_SCELUNITORGA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_CODIUNITORGA, MyGlb.PANEL_FORM, "Codice");
    PAN_SCELUNITORGA.SetFieldPage(PFL_SCELUNITORGA_CODIUNITORGA, -1, -1);
    PAN_SCELUNITORGA.SetFieldUnbound(PFL_SCELUNITORGA_CODIUNITORGA, true);
    PAN_SCELUNITORGA.SetFieldPanel(PFL_SCELUNITORGA_CODIUNITORGA, PPQRY_CAPUO3, "SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))", "CODIUNITORGA", 5, 99, 0, -13997);
    PAN_SCELUNITORGA.SetRect(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, MyGlb.PANEL_LIST, 108, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELUNITORGA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, MyGlb.PANEL_LIST, 48);
    PAN_SCELUNITORGA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELUNITORGA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELUNITORGA.SetRect(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELUNITORGA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, MyGlb.PANEL_FORM, 48);
    PAN_SCELUNITORGA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_SCELUNITORGA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELUNITORGA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_SCELUNITORGA.SetFieldPage(PFL_SCELUNITORGA_DESCRIZIONE, -1, -1);
    PAN_SCELUNITORGA.SetFieldUnbound(PFL_SCELUNITORGA_DESCRIZIONE, true);
    PAN_SCELUNITORGA.SetFieldPanel(PFL_SCELUNITORGA_DESCRIZIONE, PPQRY_CAPUO3, "SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))", "DESCRIZIONE", 5, 99, 0, -13997);
  }

  private void PAN_SCELUNITORGA_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELUNITORGA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELUNITORGA.SetIMDB(IMDB, "PQRY_CAPUO3", true);
    PAN_SCELUNITORGA.set_SetString(MyGlb.MASTER_ROWNAME, "CAP UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CACABIUOPRUO, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CODIUNITORGA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCRIZIONE ");
    PAN_SCELUNITORGA.SetQuery(PPQRY_CAPUO3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP_BIL_UO A ");
    PAN_SCELUNITORGA.SetQuery(PPQRY_CAPUO3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_IN20.NOMEOGGEESER~~) ");
    SQL.append("and   (A.E_S = ~~TBL_IN20.NOMEOGGETTES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_IN20.NOMEOGGECAPI~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_IN20.NOMEOGGEARTI~~) ");
    SQL.append("and   (A.TIPO = 'O') ");
    SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
    PAN_SCELUNITORGA.SetQuery(PPQRY_CAPUO3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELUNITORGA.SetQuery(PPQRY_CAPUO3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELUNITORGA.SetQuery(PPQRY_CAPUO3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 2, 3 ");
    PAN_SCELUNITORGA.SetQuery(PPQRY_CAPUO3, 5, SQL, -1, "");
    PAN_SCELUNITORGA.SetQueryDB(PPQRY_CAPUO3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELUNITORGA.SetMasterTable(0, "CAP_BIL_UO");
    PAN_SCELUNITORGA.AddToSortList(PFL_SCELUNITORGA_CODIUNITORGA, true);
    PAN_SCELUNITORGA.AddToSortList(PFL_SCELUNITORGA_DESCRIZIONE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELUNITORGA.Status() == 2)
    {
      int oldListQBE = PAN_SCELUNITORGA.iUseListQBE;
      PAN_SCELUNITORGA.iUseListQBE = 0;
      PAN_SCELUNITORGA.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELUNITORGA.PanelCommand(Glb.PCM_FIND);
      PAN_SCELUNITORGA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELUNITORGA) PAN_SCELUNITORGA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELUNITORGA) PAN_SCELUNITORGA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELUNITORGA) PAN_SCELUNITORGA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELUNITORGA) PAN_SCELUNITORGA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELUNITORGA) PAN_SCELUNITORGA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
