// **********************************************
// Mutui
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Mutui extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_MUTUI_ISTITUTO1 = 0;
  private static int PFL_MUTUI_NUMERO = 1;
  private static int PFL_MUTUI_ANNO = 2;
  private static int PFL_MUTUI_CAUSALE = 3;
  private static int PFL_MUTUI_ISTITUTO = 4;
  private static int PFL_MUTUI_IMPORTO = 5;

  private static int PPQRY_TESTATEMUT12 = 0;

  private static int PPQRY_BEN = 1;


  IDPanel PAN_MUTUI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI478(IMDB);
    //
    //
    Init_PQRY_TESTATEMUT12(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI478(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI478, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI478, "TBL_PARAMETRI478");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI478,IMDBDef1.FLD_PARAMETRI478_PARAMISTITUT, "PARAMISTITUT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI478,IMDBDef1.FLD_PARAMETRI478_PARAMISTITUT,1,8,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI478, 0);
  }

  private static void Init_PQRY_TESTATEMUT12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_TESTATEMUT12, 5);
    IMDB.set_TblCode(IMDBDef7.PQRY_TESTATEMUT12, "PQRY_TESTATEMUT12");
    IMDB.set_FldCode(IMDBDef7.PQRY_TESTATEMUT12,IMDBDef7.PQSL_TESTATEMUT12_ANNO_MUTUO, "ANNO_MUTUO");
    IMDB.SetFldParams(IMDBDef7.PQRY_TESTATEMUT12,IMDBDef7.PQSL_TESTATEMUT12_ANNO_MUTUO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_TESTATEMUT12,IMDBDef7.PQSL_TESTATEMUT12_NUMERO_MUTUO, "NUMERO_MUTUO");
    IMDB.SetFldParams(IMDBDef7.PQRY_TESTATEMUT12,IMDBDef7.PQSL_TESTATEMUT12_NUMERO_MUTUO,5,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_TESTATEMUT12,IMDBDef7.PQSL_TESTATEMUT12_ISTITUTO, "ISTITUTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_TESTATEMUT12,IMDBDef7.PQSL_TESTATEMUT12_ISTITUTO,1,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_TESTATEMUT12,IMDBDef7.PQSL_TESTATEMUT12_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef7.PQRY_TESTATEMUT12,IMDBDef7.PQSL_TESTATEMUT12_CAUSALE,5,100,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_TESTATEMUT12,IMDBDef7.PQSL_TESTATEMUT12_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_TESTATEMUT12,IMDBDef7.PQSL_TESTATEMUT12_IMPORTO,3,14,2);
    IMDB.TblAddNew(IMDBDef7.PQRY_TESTATEMUT12, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Mutui(MyWebEntryPoint w, IMDBObj imdb)
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
  public Mutui()
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
    FormIdx = MyGlb.FRM_MUTUI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6BE3FBFF-1FE4-478C-8102-FA0F3C6482DB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 616;
    DesignHeight = 358;
    set_Caption(new IDVariant("Mutui"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 616;
    Frames[1].Height = 332;
    Frames[1].Caption = "Mutui";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 332;
    PAN_MUTUI = new IDPanel(w, this, 1, "PAN_MUTUI");
    Frames[1].Content = PAN_MUTUI;
    PAN_MUTUI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MUTUI.VS = MainFrm.VisualStyleList;
    PAN_MUTUI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 616-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MUTUI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "35FDDB81-2D9F-48CF-95E2-B929550D14E3");
    PAN_MUTUI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 552, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_MUTUI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MUTUI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MUTUI.InitStatus = 1;
    PAN_MUTUI_Init();
    PAN_MUTUI_InitFields();
    PAN_MUTUI_InitQueries();
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
      PAN_MUTUI.UpdatePanel(MainFrm);
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
    return (obj instanceof Mutui);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Mutui.class.getName() : (Glb.ClassWithPackage(Mutui.class) ? Mutui.class.getName().substring(Mutui.class.getPackage().getName().length() + 1) : Mutui.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Mutui On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MUTUI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_MUTUI);
      // 
      // Mutui On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_MUTUI.set_ToolTip(Glb.OBJ_FIELD,PFL_MUTUI_ISTITUTO1,(new IDVariant(PAN_MUTUI.FieldText(PFL_MUTUI_ISTITUTO1))).stringValue()); 
      PAN_MUTUI.set_ToolTip(Glb.OBJ_FIELD,PFL_MUTUI_CAUSALE,IMDB.Value(IMDBDef7.PQRY_TESTATEMUT12, IMDBDef7.PQSL_TESTATEMUT12_CAUSALE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mutui", "MutuiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Mutui On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_MUTUI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mutui On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_MUTUI.Freezed = (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mutui", "MutuiOnCommand", _e);
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
      PAN_MUTUI.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mutui", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
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
      // Unload Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI478, IMDBDef1.FLD_PARAMETRI478_PARAMISTITUT, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mutui", "UnloadEvent", _e);
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
  private void PAN_MUTUI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MUTUI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MUTUI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MUTUI, Cancel);
    // Stub
  }

  private void PAN_MUTUI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_MUTUI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MUTUI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MUTUI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_MUTUI_Init()
  {

    PAN_MUTUI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MUTUI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MUTUI.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_MUTUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, "26765F37-1D9F-4759-88E3-70EB47E49843");
    PAN_MUTUI.set_Header(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, "Istituto");
    PAN_MUTUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, "");
    PAN_MUTUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_MUTUI.SetFlags(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_MUTUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, "126F3F6B-FB6A-4AE2-BCBF-E5816E584FF4");
    PAN_MUTUI.set_Header(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, "Numero");
    PAN_MUTUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, "");
    PAN_MUTUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_MUTUI.SetFlags(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MUTUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, "74207FB2-CB3B-4D4C-84B1-6C7DE83B66DC");
    PAN_MUTUI.set_Header(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, "Anno");
    PAN_MUTUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, "");
    PAN_MUTUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_MUTUI.SetFlags(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MUTUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, "91448766-E51E-484B-8DB8-C917F8BF783D");
    PAN_MUTUI.set_Header(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, "Causale");
    PAN_MUTUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, "");
    PAN_MUTUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_MUTUI.SetFlags(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MUTUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, "F4FB9BB4-B230-4BF7-8B5D-F289EAA7C3E8");
    PAN_MUTUI.set_Header(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, "ISTITUTO");
    PAN_MUTUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, "");
    PAN_MUTUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_MUTUI.SetFlags(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_MUTUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, "3D985B06-7282-48B6-8C72-2A5A3116101E");
    PAN_MUTUI.set_Header(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, "Importo");
    PAN_MUTUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, "");
    PAN_MUTUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_MUTUI.SetFlags(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_MUTUI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MUTUI.SetRect(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, MyGlb.PANEL_LIST, 0, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, MyGlb.PANEL_LIST, 124);
    PAN_MUTUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, MyGlb.PANEL_LIST, 1);
    PAN_MUTUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, MyGlb.PANEL_LIST, "Istituto");
    PAN_MUTUI.SetRect(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, MyGlb.PANEL_FORM, 4, 100, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, MyGlb.PANEL_FORM, 124);
    PAN_MUTUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, MyGlb.PANEL_FORM, 1);
    PAN_MUTUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO1, MyGlb.PANEL_FORM, "Istituto");
    PAN_MUTUI.SetFieldPage(PFL_MUTUI_ISTITUTO1, -1, -1);
    PAN_MUTUI.SetFieldPanel(PFL_MUTUI_ISTITUTO1, PPQRY_BEN, "A.RAGIONE_SOCIALE", "BENRAGIOSOCI", 5, 40, 0, -13997);
    PAN_MUTUI.SetRect(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, MyGlb.PANEL_LIST, 180, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, MyGlb.PANEL_LIST, 92);
    PAN_MUTUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_MUTUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_MUTUI.SetRect(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, MyGlb.PANEL_FORM, 104);
    PAN_MUTUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_MUTUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MUTUI_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_MUTUI.SetFieldPage(PFL_MUTUI_NUMERO, -1, -1);
    PAN_MUTUI.SetFieldPanel(PFL_MUTUI_NUMERO, PPQRY_TESTATEMUT12, "A.NUMERO_MUTUO", "NUMERO_MUTUO", 5, 10, 0, -13997);
    PAN_MUTUI.SetRect(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, MyGlb.PANEL_LIST, 260, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, MyGlb.PANEL_LIST, 76);
    PAN_MUTUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_MUTUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_MUTUI.SetRect(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, MyGlb.PANEL_FORM, 104);
    PAN_MUTUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_MUTUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MUTUI_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_MUTUI.SetFieldPage(PFL_MUTUI_ANNO, -1, -1);
    PAN_MUTUI.SetFieldPanel(PFL_MUTUI_ANNO, PPQRY_TESTATEMUT12, "A.ANNO_MUTUO", "ANNO_MUTUO", 1, 4, 0, -13997);
    PAN_MUTUI.SetRect(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, MyGlb.PANEL_LIST, 296, 36, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, MyGlb.PANEL_LIST, 56);
    PAN_MUTUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_MUTUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, MyGlb.PANEL_LIST, "Causale");
    PAN_MUTUI.SetRect(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, MyGlb.PANEL_FORM, 4, 76, 504, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, MyGlb.PANEL_FORM, 104);
    PAN_MUTUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_MUTUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MUTUI_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_MUTUI.SetFieldPage(PFL_MUTUI_CAUSALE, -1, -1);
    PAN_MUTUI.SetFieldPanel(PFL_MUTUI_CAUSALE, PPQRY_TESTATEMUT12, "A.CAUSALE", "CAUSALE", 5, 100, 0, -13997);
    PAN_MUTUI.SetRect(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, MyGlb.PANEL_LIST, 56);
    PAN_MUTUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, MyGlb.PANEL_LIST, 1);
    PAN_MUTUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, MyGlb.PANEL_LIST, "ISTIT.");
    PAN_MUTUI.SetRect(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, MyGlb.PANEL_FORM, 4, 220, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, MyGlb.PANEL_FORM, 56);
    PAN_MUTUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, MyGlb.PANEL_FORM, 1);
    PAN_MUTUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MUTUI_ISTITUTO, MyGlb.PANEL_FORM, "ISTIT.");
    PAN_MUTUI.SetFieldPage(PFL_MUTUI_ISTITUTO, -1, -1);
    PAN_MUTUI.SetFieldPanel(PFL_MUTUI_ISTITUTO, PPQRY_TESTATEMUT12, "A.ISTITUTO", "ISTITUTO", 1, 6, 0, -13997);
    PAN_MUTUI.SetRect(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, MyGlb.PANEL_LIST, 464, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_MUTUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_MUTUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_MUTUI.SetRect(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, MyGlb.PANEL_FORM, 4, 220, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MUTUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_MUTUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_MUTUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MUTUI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_MUTUI.SetFieldPage(PFL_MUTUI_IMPORTO, -1, -1);
    PAN_MUTUI.SetFieldPanel(PFL_MUTUI_IMPORTO, PPQRY_TESTATEMUT12, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
  }

  private void PAN_MUTUI_InitQueries()
  {
    StringBuffer SQL;

    PAN_MUTUI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE as BENRAGIOSOCI ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ISTITUTO~~) ");
    PAN_MUTUI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_MUTUI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MUTUI.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_MUTUI.SetIMDB(IMDB, "PQRY_TESTATEMUT12", true);
    PAN_MUTUI.set_SetString(MyGlb.MASTER_ROWNAME, "TESTATE MUTUI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_MUTUO as ANNO_MUTUO, ");
    SQL.append("  A.NUMERO_MUTUO as NUMERO_MUTUO, ");
    SQL.append("  A.ISTITUTO as ISTITUTO, ");
    SQL.append("  A.CAUSALE as CAUSALE, ");
    SQL.append("  A.IMPORTO as IMPORTO ");
    PAN_MUTUI.SetQuery(PPQRY_TESTATEMUT12, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TESTATE_MUTUI A ");
    PAN_MUTUI.SetQuery(PPQRY_TESTATEMUT12, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.ISTITUTO = ~~TBL_PARAMETRI478.PARAMISTITUT~~ AND NOT ((~~TBL_PARAMETRI478.PARAMISTITUT~~ IS NULL))) OR (~~TBL_PARAMETRI478.PARAMISTITUT~~ IS NULL)) ");
    PAN_MUTUI.SetQuery(PPQRY_TESTATEMUT12, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MUTUI.SetQuery(PPQRY_TESTATEMUT12, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MUTUI.SetQuery(PPQRY_TESTATEMUT12, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_MUTUO, ");
    SQL.append("  A.NUMERO_MUTUO, ");
    SQL.append("  A.ISTITUTO ");
    PAN_MUTUI.SetQuery(PPQRY_TESTATEMUT12, 5, SQL, -1, "");
    PAN_MUTUI.SetQueryDB(PPQRY_TESTATEMUT12, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MUTUI.SetMasterTable(0, "TESTATE_MUTUI");
    PAN_MUTUI.AddToSortList(PFL_MUTUI_ANNO, true);
    PAN_MUTUI.AddToSortList(PFL_MUTUI_NUMERO, true);
    PAN_MUTUI.AddToSortList(PFL_MUTUI_ISTITUTO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MUTUI.Status() == 2)
    {
      int oldListQBE = PAN_MUTUI.iUseListQBE;
      PAN_MUTUI.iUseListQBE = 0;
      PAN_MUTUI.PanelCommand(Glb.PCM_SEARCH);
      PAN_MUTUI.PanelCommand(Glb.PCM_FIND);
      PAN_MUTUI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_MUTUI) PAN_MUTUI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MUTUI) PAN_MUTUI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MUTUI) PAN_MUTUI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MUTUI) PAN_MUTUI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MUTUI) PAN_MUTUI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_MUTUI) PAN_MUTUI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
