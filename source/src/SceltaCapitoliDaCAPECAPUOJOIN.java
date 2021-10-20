// **********************************************
// Scelta Capitoli Da CAP E CAP UO JOIN
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaCapitoliDaCAPECAPUOJOIN extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCELTACAPITO_CAPITOLO = 0;
  private static int PFL_SCELTACAPITO_ARTICOLO = 1;
  private static int PFL_SCELTACAPITO_CODICE = 2;
  private static int PFL_SCELTACAPITO_INFO = 3;
  private static int PFL_SCELTACAPITO_DESCRIZIONE = 4;

  private static int PPQRY_CAP29 = 0;


  IDPanel PAN_SCELTACAPITO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN15(IMDB);
    //
    //
    Init_PQRY_CAP29(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_IN15, 4);
    IMDB.set_TblCode(IMDBDef1.TBL_IN15, "TBL_IN15");
    IMDB.set_FldCode(IMDBDef1.TBL_IN15,IMDBDef1.FLD_IN15_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef1.TBL_IN15,IMDBDef1.FLD_IN15_NOMEOGGPROUO,1,8,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN15,IMDBDef1.FLD_IN15_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef1.TBL_IN15,IMDBDef1.FLD_IN15_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN15,IMDBDef1.FLD_IN15_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef1.TBL_IN15,IMDBDef1.FLD_IN15_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN15,IMDBDef1.FLD_IN15_NOMOGGCODSTR, "NOMOGGCODSTR");
    IMDB.SetFldParams(IMDBDef1.TBL_IN15,IMDBDef1.FLD_IN15_NOMOGGCODSTR,5,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_IN15, 0);
  }

  private static void Init_PQRY_CAP29(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_CAP29, 5);
    IMDB.set_TblCode(IMDBDef7.PQRY_CAP29, "PQRY_CAP29");
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP29,IMDBDef7.PQSL_CAP29_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP29,IMDBDef7.PQSL_CAP29_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP29,IMDBDef7.PQSL_CAP29_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP29,IMDBDef7.PQSL_CAP29_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP29,IMDBDef7.PQSL_CAP29_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP29,IMDBDef7.PQSL_CAP29_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP29,IMDBDef7.PQSL_CAP29_RECORDINFO, "RECORDINFO");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP29,IMDBDef7.PQSL_CAP29_RECORDINFO,5,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_CAP29,IMDBDef7.PQSL_CAP29_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef7.PQRY_CAP29,IMDBDef7.PQSL_CAP29_RECORDCODICE,5,10,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_CAP29, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaCapitoliDaCAPECAPUOJOIN(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaCapitoliDaCAPECAPUOJOIN()
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
    FormIdx = MyGlb.FRM_SCCADACAECUJ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "98B716C0-05C8-431C-9698-97697EC5FFC6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 620;
    DesignHeight = 394;
    set_Caption(new IDVariant("Scelta Capitoli Da CAP E CAP UO JOIN"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 620;
    Frames[1].Height = 368;
    Frames[1].Caption = "Scelta Capitoli";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 368;
    PAN_SCELTACAPITO = new IDPanel(w, this, 1, "PAN_SCELTACAPITO");
    Frames[1].Content = PAN_SCELTACAPITO;
    PAN_SCELTACAPITO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTACAPITO.VS = MainFrm.VisualStyleList;
    PAN_SCELTACAPITO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 620-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTACAPITO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "311D0907-0308-48B6-A340-B90731E449F9");
    PAN_SCELTACAPITO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 568, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SCELTACAPITO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTACAPITO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTACAPITO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTACAPITO.InitStatus = 2;
    PAN_SCELTACAPITO_Init();
    PAN_SCELTACAPITO_InitFields();
    PAN_SCELTACAPITO_InitQueries();
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
      PAN_SCELTACAPITO.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaCapitoliDaCAPECAPUOJOIN);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaCapitoliDaCAPECAPUOJOIN.class.getName() : (Glb.ClassWithPackage(SceltaCapitoliDaCAPECAPUOJOIN.class) ? SceltaCapitoliDaCAPECAPUOJOIN.class.getName().substring(SceltaCapitoliDaCAPECAPUOJOIN.class.getPackage().getName().length() + 1) : SceltaCapitoliDaCAPECAPUOJOIN.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Capitoli On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTACAPITO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTACAPITO);
      // 
      // Scelta Capitoli On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_SCELTACAPITO.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTACAPITO_DESCRIZIONE,(new IDVariant(PAN_SCELTACAPITO.FieldText(PFL_SCELTACAPITO_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaCapitoliDaCAPECAPUOJOIN", "SceltaCapitoliOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Load
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
      // Load Body
      // Corpo Procedura
      // 
      IDVariant v_CAPT = null;
      v_CAPT = (new IDVariant("Scelta Capitoli"));
      set_Caption(new IDVariant(v_CAPT));
      PAN_SCELTACAPITO.set_Header(Glb.OBJ_FIELD,PFL_SCELTACAPITO_INFO, (new IDVariant("")).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaCapitoliDaCAPECAPUOJOIN", "Load", _e);
    }
  }

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
      MainFrm.ErrObj.ProcError ("SceltaCapitoliDaCAPECAPUOJOIN", "Unload", _e);
    }
  }

  // **********************************************************************
  // IN: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_INDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGPROUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMOGGCODSTR, 0, new IDVariant());
  }

  // **********************************************************************
  // INFO DA FARE
  // **********************************************************************
  public int INFODAFARE ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // INFO DA FARE Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef7.PQRY_CAP29, IMDBDef7.PQSL_CAP29_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef7.PQRY_CAP29, IMDBDef7.PQSL_CAP29_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGETTES, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef7.PQRY_CAP29, IMDBDef7.PQSL_CAP29_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef7.PQRY_CAP29, IMDBDef7.PQSL_CAP29_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaCapitoliDaCAPECAPUOJOIN", "INFODAFARE", _e);
      return -1;
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
  private void PAN_SCELTACAPITO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTACAPITO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTACAPITO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTACAPITO, Cancel);
    // Stub
  }

  private void PAN_SCELTACAPITO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SCELTACAPITO_INFO)
    {
      this.IdxPanelActived = this.PAN_SCELTACAPITO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      INFODAFARE();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SCELTACAPITO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTACAPITO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTACAPITO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTACAPITO_Init()
  {

    PAN_SCELTACAPITO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTACAPITO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELTACAPITO.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_SCELTACAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, "AE87A35C-9ACD-4F06-93AD-A3E3E2CBDD9E");
    PAN_SCELTACAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, "Capitolo");
    PAN_SCELTACAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, "");
    PAN_SCELTACAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTACAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTACAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, "45CF1FF2-9CA5-4406-8525-A989E92D3453");
    PAN_SCELTACAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, "Articolo");
    PAN_SCELTACAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, "");
    PAN_SCELTACAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTACAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTACAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, "1823FA07-122B-4A4D-A7DE-E07063A81415");
    PAN_SCELTACAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, "Codice");
    PAN_SCELTACAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, "");
    PAN_SCELTACAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTACAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTACAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, "B80EC305-47C5-4448-BFF7-02EE51174B26");
    PAN_SCELTACAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, "Info");
    PAN_SCELTACAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, "Info");
    PAN_SCELTACAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_SCELTACAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTACAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, "810713DE-0D44-4687-9F69-39805EA2D47D");
    PAN_SCELTACAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, "Descrizione");
    PAN_SCELTACAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, "");
    PAN_SCELTACAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTACAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTACAPITO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTACAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTACAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SCELTACAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTACAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTACAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SCELTACAPITO.SetFieldPage(PFL_SCELTACAPITO_CAPITOLO, -1, -1);
    PAN_SCELTACAPITO.SetFieldPanel(PFL_SCELTACAPITO_CAPITOLO, PPQRY_CAP29, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_SCELTACAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, MyGlb.PANEL_LIST, 104, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_SCELTACAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_SCELTACAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_SCELTACAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTACAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_SCELTACAPITO.SetFieldPage(PFL_SCELTACAPITO_ARTICOLO, -1, -1);
    PAN_SCELTACAPITO.SetFieldPanel(PFL_SCELTACAPITO_ARTICOLO, PPQRY_CAP29, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_SCELTACAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, MyGlb.PANEL_LIST, 164, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, MyGlb.PANEL_LIST, 120);
    PAN_SCELTACAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_SCELTACAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, MyGlb.PANEL_FORM, 4, 160, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, MyGlb.PANEL_FORM, 120);
    PAN_SCELTACAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_SCELTACAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_SCELTACAPITO.SetFieldPage(PFL_SCELTACAPITO_CODICE, -1, -1);
    PAN_SCELTACAPITO.SetFieldPanel(PFL_SCELTACAPITO_CODICE, PPQRY_CAP29, "A.CODICE_STRUTTURA", "RECORDCODICE", 5, 10, 0, -13997);
    PAN_SCELTACAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, MyGlb.PANEL_LIST, 212, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTACAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, MyGlb.PANEL_LIST, 32);
    PAN_SCELTACAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, MyGlb.PANEL_LIST, "In.");
    PAN_SCELTACAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, MyGlb.PANEL_FORM, 4, 112, 464, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, MyGlb.PANEL_FORM, 32);
    PAN_SCELTACAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, MyGlb.PANEL_FORM, 2);
    PAN_SCELTACAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_INFO, MyGlb.PANEL_FORM, "Info");
    PAN_SCELTACAPITO.SetFieldPage(PFL_SCELTACAPITO_INFO, -1, -1);
    PAN_SCELTACAPITO.SetFieldUnbound(PFL_SCELTACAPITO_INFO, true);
    PAN_SCELTACAPITO.SetFieldPanel(PFL_SCELTACAPITO_INFO, PPQRY_CAP29, "'I'", "RECORDINFO", 5, 1, 0, -13997);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_SCELTACAPITO.SetValueListItem(PFL_SCELTACAPITO_INFO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_SCELTACAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, MyGlb.PANEL_LIST, 236, 36, 332, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTACAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_SCELTACAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTACAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTACAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTACAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_SCELTACAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTACAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTACAPITO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTACAPITO.SetFieldPage(PFL_SCELTACAPITO_DESCRIZIONE, -1, -1);
    PAN_SCELTACAPITO.SetFieldPanel(PFL_SCELTACAPITO_DESCRIZIONE, PPQRY_CAP29, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
  }

  private void PAN_SCELTACAPITO_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTACAPITO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELTACAPITO.SetIMDB(IMDB, "PQRY_CAP29", true);
    PAN_SCELTACAPITO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  'I' as RECORDINFO, ");
    SQL.append("  A.CODICE_STRUTTURA as RECORDCODICE ");
    PAN_SCELTACAPITO.SetQuery(PPQRY_CAP29, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  CAP_UO B ");
    PAN_SCELTACAPITO.SetQuery(PPQRY_CAP29, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_IN15.NOMEOGGEESER~~) ");
    SQL.append("and   (A.E_S = ~~TBL_IN15.NOMEOGGETTES~~) ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (B.PROGR_UNITA_ORGANIZZATIVA = ~~TBL_IN15.NOMEOGGPROUO~~) ");
    SQL.append("and   (B.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
    SQL.append("and   (NVL(A.CODICE_STRUTTURA, '-1') = NVL(~~TBL_IN15.NOMOGGCODSTR~~, NVL(A.CODICE_STRUTTURA, '-1'))) ");
    PAN_SCELTACAPITO.SetQuery(PPQRY_CAP29, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTACAPITO.SetQuery(PPQRY_CAP29, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTACAPITO.SetQuery(PPQRY_CAP29, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_SCELTACAPITO.SetQuery(PPQRY_CAP29, 5, SQL, -1, "");
    PAN_SCELTACAPITO.SetQueryDB(PPQRY_CAP29, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTACAPITO.SetMasterTable(0, "CAP");
    PAN_SCELTACAPITO.AddToSortList(PFL_SCELTACAPITO_CAPITOLO, true);
    PAN_SCELTACAPITO.AddToSortList(PFL_SCELTACAPITO_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTACAPITO.Status() == 2)
    {
      int oldListQBE = PAN_SCELTACAPITO.iUseListQBE;
      PAN_SCELTACAPITO.iUseListQBE = 0;
      PAN_SCELTACAPITO.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTACAPITO.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTACAPITO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTACAPITO) PAN_SCELTACAPITO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTACAPITO) PAN_SCELTACAPITO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTACAPITO) PAN_SCELTACAPITO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTACAPITO) PAN_SCELTACAPITO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTACAPITO) PAN_SCELTACAPITO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
