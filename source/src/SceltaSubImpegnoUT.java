// **********************************************
// Scelta Sub Impegno UT
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaSubImpegnoUT extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCELTSUBIMPE_NUMERO = 0;
  private static int PFL_SCELTSUBIMPE_ANNO = 1;
  private static int PFL_SCELTSUBIMPE_DESCRIZIONE = 2;
  private static int PFL_SCELTSUBIMPE_CAPITOLO = 3;
  private static int PFL_SCELTSUBIMPE_ART = 4;
  private static int PFL_SCELTSUBIMPE_NUMEROIMP = 5;
  private static int PFL_SCELTSUBIMPE_ANNOIMP = 6;
  private static int PFL_SCELTSUBIMPE_DISPEFFETTIV = 7;
  private static int PFL_SCELTSUBIMPE_CIG = 8;
  private static int PFL_SCELTSUBIMPE_CUP = 9;

  private static int PPQRY_VISTSUBIUOUT = 0;


  IDPanel PAN_SCELTSUBIMPE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI124(IMDB);
    //
    //
    Init_PQRY_VISTSUBIUOUT(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI124(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI124, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI124, "TBL_PARAMETRI124");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI124,IMDBDef1.FLD_PARAMETRI124_ROWNAMPROUNI, "ROWNAMPROUNI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI124,IMDBDef1.FLD_PARAMETRI124_ROWNAMPROUNI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI124,IMDBDef1.FLD_PARAMETRI124_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI124,IMDBDef1.FLD_PARAMETRI124_ROWNAMEESERC,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI124, 0);
  }

  private static void Init_PQRY_VISTSUBIUOUT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_VISTSUBIUOUT, 10);
    IMDB.set_TblCode(IMDBDef7.PQRY_VISTSUBIUOUT, "PQRY_VISTSUBIUOUT");
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_VISUUOUTDIEF, "VISUUOUTDIEF");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_VISUUOUTDIEF,3,28,6);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_VISSUBUOUTCI, "VISSUBUOUTCI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_VISSUBUOUTCI,5,15,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_VISSUBUOUTCU, "VISSUBUOUTCU");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTSUBIUOUT,IMDBDef7.PQSL_VISTSUBIUOUT_VISSUBUOUTCU,5,15,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_VISTSUBIUOUT, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaSubImpegnoUT(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaSubImpegnoUT()
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
    FormIdx = MyGlb.FRM_SCELSUBIMPUT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7648BE08-A6CC-4763-9E18-93F701BA2253";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1000;
    DesignHeight = 378;
    set_Caption(new IDVariant("Scelta Sub Impegno UT"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1000;
    Frames[1].Height = 352;
    Frames[1].Caption = "Scelta Sub Impegno";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 352;
    PAN_SCELTSUBIMPE = new IDPanel(w, this, 1, "PAN_SCELTSUBIMPE");
    Frames[1].Content = PAN_SCELTSUBIMPE;
    PAN_SCELTSUBIMPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTSUBIMPE.VS = MainFrm.VisualStyleList;
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1000-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7CB7F414-029C-4E7F-8DF7-82E63157511C");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 968, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTSUBIMPE.InitStatus = 2;
    PAN_SCELTSUBIMPE_Init();
    PAN_SCELTSUBIMPE_InitFields();
    PAN_SCELTSUBIMPE_InitQueries();
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
      PAN_SCELTSUBIMPE.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaSubImpegnoUT);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaSubImpegnoUT.class.getName() : (Glb.ClassWithPackage(SceltaSubImpegnoUT.class) ? SceltaSubImpegnoUT.class.getName().substring(SceltaSubImpegnoUT.class.getPackage().getName().length() + 1) : SceltaSubImpegnoUT.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      v_CAPTION = (new IDVariant("Scelta Sub-Impegno", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaSubImpegnoUT", "LoadEvent", _e);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SCELTSUBIMPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTSUBIMPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTSUBIMPE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTSUBIMPE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTSUBIMPE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SCELTSUBIMPE);
    // Stub
  }

  private void PAN_SCELTSUBIMPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCELTSUBIMPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTSUBIMPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTSUBIMPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTSUBIMPE_Init()
  {

    PAN_SCELTSUBIMPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTSUBIMPE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELTSUBIMPE.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, "8EF7AE9C-BF69-4DDA-8D5C-CB524DF7962C");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, "Numero");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, "Numero Sub Impegno");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, "3A94A9EB-1BB2-4062-A56D-6C284F6D7073");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, "Anno");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, "Anno Sub Impegno");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, "134395CE-8ECB-449A-B9BF-23A076180648");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, "Descrizione");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, "EA1EC2CF-A039-49F5-97D2-C0BC23379CBC");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, "Capitolo");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, "CB4CCC45-F452-44AF-BEBA-FBB2A9116425");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, "Art.");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, "Articolo");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, "89973A16-993E-4505-920E-08DD0341B396");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, "Numero Imp.");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, "6452763A-EF84-4995-A3BF-A8346B18401A");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, "Anno Imp.");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, "D16FEAA1-CE64-4D1C-9582-A64BD0D9C5EB");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, "Disp. Effettiva");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, "FC63F58E-6CA7-4CFB-A4E2-A6699ED59DE8");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, "Cig");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTSUBIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, "8F059A94-3AFF-4218-A4C0-1DCE00FCAC1E");
    PAN_SCELTSUBIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, "Cup");
    PAN_SCELTSUBIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, "");
    PAN_SCELTSUBIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTSUBIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTSUBIMPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_LIST, 92);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_FORM, 4, 64, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_FORM, 92);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_NUMERO, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_NUMERO, PPQRY_VISTSUBIUOUT, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_LIST, 56, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_LIST, 80);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_FORM, 4, 40, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_FORM, 80);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_ANNO, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_ANNO, PPQRY_VISTSUBIUOUT, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_LIST, 96, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 4, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_DESCRIZIONE, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_DESCRIZIONE, PPQRY_VISTSUBIUOUT, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_LIST, 352, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_FORM, 4, 112, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_CAPITOLO, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_CAPITOLO, PPQRY_VISTSUBIUOUT, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_LIST, 484, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_LIST, 60);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_LIST, "Art.");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_FORM, 4, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_FORM, 60);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ART, MyGlb.PANEL_FORM, "Art.");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_ART, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_ART, PPQRY_VISTSUBIUOUT, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_LIST, 516, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_LIST, "Numero Imp.");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_FORM, 4, 160, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_NUMEROIMP, MyGlb.PANEL_FORM, "Num. Imp");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_NUMEROIMP, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_NUMEROIMP, PPQRY_VISTSUBIUOUT, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_LIST, 568, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_LIST, "Anno Imp.");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_FORM, 4, 160, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_ANNOIMP, MyGlb.PANEL_FORM, "Ann. Imp");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_ANNOIMP, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_ANNOIMP, PPQRY_VISTSUBIUOUT, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_LIST, 608, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_LIST, 128);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_LIST, "Disp. Effettiva");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_FORM, 4, 184, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_FORM, 128);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_DISPEFFETTIV, MyGlb.PANEL_FORM, "Disp. Effettiva");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_DISPEFFETTIV, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldUnbound(PFL_SCELTSUBIMPE_DISPEFFETTIV, true);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_DISPEFFETTIV, PPQRY_VISTSUBIUOUT, "CF4WEB_GET_IMPORTI_SCHEDA_INFO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'SS',to_number(NULL),to_number(NULL),to_number(NULL),A.CAPITOLO,A.ARTICOLO,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,NULL,NULL,NULL,to_number(NULL),'DISP_EFF')", "VISUUOUTDIEF", 3, 28, 6, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_LIST, 736, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_LIST, 28);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_LIST, "Cig");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_FORM, 4, 208, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_FORM, 28);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CIG, MyGlb.PANEL_FORM, "Cig");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_CIG, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_CIG, PPQRY_VISTSUBIUOUT, "A.CIG", "VISSUBUOUTCI", 5, 15, 0, -13997);
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_LIST, 852, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_LIST, 32);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_LIST, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_LIST, "Cup");
    PAN_SCELTSUBIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_FORM, 4, 232, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTSUBIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_FORM, 32);
    PAN_SCELTSUBIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_FORM, 1);
    PAN_SCELTSUBIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTSUBIMPE_CUP, MyGlb.PANEL_FORM, "Cup");
    PAN_SCELTSUBIMPE.SetFieldPage(PFL_SCELTSUBIMPE_CUP, -1, -1);
    PAN_SCELTSUBIMPE.SetFieldPanel(PFL_SCELTSUBIMPE_CUP, PPQRY_VISTSUBIUOUT, "A.CUP", "VISSUBUOUTCU", 5, 15, 0, -13997);
  }

  private void PAN_SCELTSUBIMPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTSUBIMPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELTSUBIMPE.SetIMDB(IMDB, "PQRY_VISTSUBIUOUT", true);
    PAN_SCELTSUBIMPE.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA SUBIMP UO UT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  CF4WEB_GET_IMPORTI_SCHEDA_INFO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'SS',to_number(NULL),to_number(NULL),to_number(NULL),A.CAPITOLO,A.ARTICOLO,A.ANNO_SUBIMP,A.NUMERO_SUBIMP,NULL,NULL,NULL,to_number(NULL),'DISP_EFF') as VISUUOUTDIEF, ");
    SQL.append("  A.CIG as VISSUBUOUTCI, ");
    SQL.append("  A.CUP as VISSUBUOUTCU ");
    PAN_SCELTSUBIMPE.SetQuery(PPQRY_VISTSUBIUOUT, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_SUBIMP_UO_UT A ");
    PAN_SCELTSUBIMPE.SetQuery(PPQRY_VISTSUBIUOUT, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI124.ROWNAMEESERC~~) ");
    SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI124.ROWNAMPROUNI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    SQL.append("and   (NVL(A.SCADENZA_UO, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
    SQL.append("and   (NVL(A.SCADENZA_UT, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
    PAN_SCELTSUBIMPE.SetQuery(PPQRY_VISTSUBIUOUT, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTSUBIMPE.SetQuery(PPQRY_VISTSUBIUOUT, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTSUBIMPE.SetQuery(PPQRY_VISTSUBIUOUT, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTSUBIMPE.SetQuery(PPQRY_VISTSUBIUOUT, 5, SQL, -1, "");
    PAN_SCELTSUBIMPE.SetQueryDB(PPQRY_VISTSUBIUOUT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTSUBIMPE.SetMasterTable(0, "VISTA_SUBIMP_UO_UT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTSUBIMPE.Status() == 2)
    {
      int oldListQBE = PAN_SCELTSUBIMPE.iUseListQBE;
      PAN_SCELTSUBIMPE.iUseListQBE = 0;
      PAN_SCELTSUBIMPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTSUBIMPE.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTSUBIMPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTSUBIMPE) PAN_SCELTSUBIMPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTSUBIMPE) PAN_SCELTSUBIMPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTSUBIMPE) PAN_SCELTSUBIMPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTSUBIMPE) PAN_SCELTSUBIMPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTSUBIMPE) PAN_SCELTSUBIMPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
