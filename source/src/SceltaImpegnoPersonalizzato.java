// **********************************************
// Scelta Impegno Personalizzato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaImpegnoPersonalizzato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCELTAIMPEGN_ANNO = 0;
  private static int PFL_SCELTAIMPEGN_NUMERO = 1;
  private static int PFL_SCELTAIMPEGN_DESCRIZIONE = 2;
  private static int PFL_SCELTAIMPEGN_CAPITOLO = 3;
  private static int PFL_SCELTAIMPEGN_ART = 4;
  private static int PFL_SCELTAIMPEGN_UOUTILIZZO = 5;
  private static int PFL_SCELTAIMPEGN_NUOVAESPRESS = 6;

  private static int PPQRY_VISTAIMPUOU4 = 0;


  IDPanel PAN_SCELTAIMPEGN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI288(IMDB);
    //
    //
    Init_PQRY_VISTAIMPUOU4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI288(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI288, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI288, "TBL_PARAMETRI288");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI288,IMDBDef1.FLD_PARAMETRI288_ROWNAMPROUNI, "ROWNAMPROUNI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI288,IMDBDef1.FLD_PARAMETRI288_ROWNAMPROUNI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI288,IMDBDef1.FLD_PARAMETRI288_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI288,IMDBDef1.FLD_PARAMETRI288_ROWNAMEESERC,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI288, 0);
  }

  private static void Init_PQRY_VISTAIMPUOU4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_VISTAIMPUOU4, 7);
    IMDB.set_TblCode(IMDBDef7.PQRY_VISTAIMPUOU4, "PQRY_VISTAIMPUOU4");
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_VIIMUOUTUOUT, "VIIMUOUTUOUT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_VIIMUOUTUOUT,5,99,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_expr_raggr, "expr_raggr");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTAIMPUOU4,IMDBDef7.PQSL_VISTAIMPUOU4_expr_raggr,1,19,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_VISTAIMPUOU4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaImpegnoPersonalizzato(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaImpegnoPersonalizzato()
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
    FormIdx = MyGlb.FRM_SCELIMPEPERS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "260965B0-F29D-4088-8301-9F6441586E70";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 812;
    DesignHeight = 386;
    set_Caption(new IDVariant("Scelta Impegno Personalizzato"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 812;
    Frames[1].Height = 360;
    Frames[1].Caption = "Scelta Impegno";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_SCELTAIMPEGN = new IDPanel(w, this, 1, "PAN_SCELTAIMPEGN");
    Frames[1].Content = PAN_SCELTAIMPEGN;
    PAN_SCELTAIMPEGN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTAIMPEGN.VS = MainFrm.VisualStyleList;
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 812-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "178FB88C-D9C4-4E4A-9DB5-C0C94B2ED0BA");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 768, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTAIMPEGN.InitStatus = 1;
    PAN_SCELTAIMPEGN_Init();
    PAN_SCELTAIMPEGN_InitFields();
    PAN_SCELTAIMPEGN_InitQueries();
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
      PAN_SCELTAIMPEGN.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaImpegnoPersonalizzato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaImpegnoPersonalizzato.class.getName() : (Glb.ClassWithPackage(SceltaImpegnoPersonalizzato.class) ? SceltaImpegnoPersonalizzato.class.getName().substring(SceltaImpegnoPersonalizzato.class.getPackage().getName().length() + 1) : SceltaImpegnoPersonalizzato.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Impegno On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTAIMPEGN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTAIMPEGN);
      // 
      // Scelta Impegno On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SCELTAIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTAIMPEGN_UOUTILIZZO,(new IDVariant(PAN_SCELTAIMPEGN.FieldText(PFL_SCELTAIMPEGN_UOUTILIZZO))).stringValue()); 
      PAN_SCELTAIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTAIMPEGN_DESCRIZIONE,(new IDVariant(PAN_SCELTAIMPEGN.FieldText(PFL_SCELTAIMPEGN_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoPersonalizzato", "SceltaImpegnoOnDynamicPropertiesEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Scelta Impegno", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoPersonalizzato", "LoadEvent", _e);
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
      UNLOADEVENT_PARADELEROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoPersonalizzato", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI288, IMDBDef1.FLD_PARAMETRI288_ROWNAMPROUNI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI288, IMDBDef1.FLD_PARAMETRI288_ROWNAMEESERC, 0, new IDVariant());
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
  private void PAN_SCELTAIMPEGN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTAIMPEGN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTAIMPEGN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTAIMPEGN, Cancel);
    // Stub
  }

  private void PAN_SCELTAIMPEGN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTAIMPEGN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTAIMPEGN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTAIMPEGN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTAIMPEGN_Init()
  {

    PAN_SCELTAIMPEGN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTAIMPEGN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELTAIMPEGN.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, "18F4CFE0-2A74-4C7B-918E-C187EBAB54C7");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, "Anno");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, "492BFBA0-58C0-424F-88B6-38CD592600D6");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, "Numero");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, "39A88506-B30D-46EA-B577-CA27E5E7F611");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, "Descrizione");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, "2E9AF67A-ABC8-4013-8683-A93DD9A5961E");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, "Capitolo");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, "Capitolo");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, "D09ECAD7-4A1B-4682-B4E1-FC42B3BDB792");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, "Art.");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, "Articolo");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, "E4CBAD13-B99C-4668-AE99-954BD5652540");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, "U.O. Utilizzo");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, "E5D5E136-2669-43B8-91FF-E83195DC42E1");
    PAN_SCELTAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, "Nuova Espressione");
    PAN_SCELTAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, "");
    PAN_SCELTAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTAIMPEGN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_LIST, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_FORM, 4, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_FORM, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ANNO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ANNO, PPQRY_VISTAIMPUOU4, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_LIST, 40, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_LIST, 72);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_FORM, 4, 64, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_FORM, 72);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_NUMERO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_NUMERO, PPQRY_VISTAIMPUOU4, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 92, 36, 272, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 4, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_DESCRIZIONE, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_DESCRIZIONE, PPQRY_VISTAIMPUOU4, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 364, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 4, 112, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_CAPITOLO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_CAPITOLO, PPQRY_VISTAIMPUOU4, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_LIST, 456, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_LIST, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_LIST, "Art.");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_FORM, 4, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_FORM, 60);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_ART, MyGlb.PANEL_FORM, "Art.");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_ART, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_ART, PPQRY_VISTAIMPUOU4, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_LIST, 496, 36, 272, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_LIST, "U.O. Utilizzo");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_FORM, 4, 184, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_FORM, 2);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_UOUTILIZZO, MyGlb.PANEL_FORM, "U.O. Utilizzo");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_UOUTILIZZO, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldUnbound(PFL_SCELTAIMPEGN_UOUTILIZZO, true);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_UOUTILIZZO, PPQRY_VISTAIMPUOU4, "SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA_UT,TRUNC( SYSDATE ))", "VIIMUOUTUOUT", 5, 99, 0, -13997);
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, MyGlb.PANEL_LIST, 116);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, MyGlb.PANEL_LIST, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, MyGlb.PANEL_LIST, "Nuova Espressione");
    PAN_SCELTAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, MyGlb.PANEL_FORM, 4, 232, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, MyGlb.PANEL_FORM, 116);
    PAN_SCELTAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, MyGlb.PANEL_FORM, 1);
    PAN_SCELTAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTAIMPEGN_NUOVAESPRESS, MyGlb.PANEL_FORM, "Nuova Espressione");
    PAN_SCELTAIMPEGN.SetFieldPage(PFL_SCELTAIMPEGN_NUOVAESPRESS, -1, -1);
    PAN_SCELTAIMPEGN.SetFieldUnbound(PFL_SCELTAIMPEGN_NUOVAESPRESS, true);
    PAN_SCELTAIMPEGN.SetFieldPanel(PFL_SCELTAIMPEGN_NUOVAESPRESS, PPQRY_VISTAIMPUOU4, "MAX(A.ANNO_DEL)", "expr_raggr", 1, 19, 0, -13997);
  }

  private void PAN_SCELTAIMPEGN_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTAIMPEGN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELTAIMPEGN.SetIMDB(IMDB, "PQRY_VISTAIMPUOU4", true);
    PAN_SCELTAIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA IMP UO UT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA_UT,TRUNC( SYSDATE )) as VIIMUOUTUOUT, ");
    SQL.append("  MAX(A.ANNO_DEL) as expr_raggr ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_VISTAIMPUOU4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_IMP_UO_UT A ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_VISTAIMPUOU4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI288.ROWNAMEESERC~~) ");
    SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI288.ROWNAMPROUNI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    SQL.append("and   ((A.SCADENZA_UO IS NULL) OR A.SCADENZA_UO >= TRUNC( SYSDATE )) ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_VISTAIMPUOU4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP, ");
    SQL.append("  A.DESCRIZIONE, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA_UT,TRUNC( SYSDATE )) ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_VISTAIMPUOU4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_VISTAIMPUOU4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP ");
    PAN_SCELTAIMPEGN.SetQuery(PPQRY_VISTAIMPUOU4, 5, SQL, -1, "");
    PAN_SCELTAIMPEGN.SetQueryDB(PPQRY_VISTAIMPUOU4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTAIMPEGN.SetMasterTable(0, "VISTA_IMP_UO_UT");
    PAN_SCELTAIMPEGN.AddToSortList(PFL_SCELTAIMPEGN_ANNO, true);
    PAN_SCELTAIMPEGN.AddToSortList(PFL_SCELTAIMPEGN_NUMERO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTAIMPEGN.Status() == 2)
    {
      int oldListQBE = PAN_SCELTAIMPEGN.iUseListQBE;
      PAN_SCELTAIMPEGN.iUseListQBE = 0;
      PAN_SCELTAIMPEGN.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTAIMPEGN.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTAIMPEGN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTAIMPEGN) PAN_SCELTAIMPEGN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
