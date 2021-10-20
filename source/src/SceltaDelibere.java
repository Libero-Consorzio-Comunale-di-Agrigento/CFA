// **********************************************
// Scelta Delibere
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaDelibere extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DELIBERE_PROVVEDIMENT = 0;

  private static int PFL_DELIBERE_SEDEDEL = 0;
  private static int PFL_DELIBERE_NUMERODEL = 1;
  private static int PFL_DELIBERE_ANNODEL = 2;
  private static int PFL_DELIBERE_DATA1 = 3;
  private static int PFL_DELIBERE_DESCRIZIONE1 = 4;
  private static int PFL_DELIBERE_ESECUTIVITA = 5;
  private static int PFL_DELIBERE_APPROVAZION1 = 6;

  private static int PPQRY_DEL1 = 0;


  IDPanel PAN_DELIBERE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI333(IMDB);
    //
    //
    Init_PQRY_DEL1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI333(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI333, 10);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI333, "TBL_PARAMETRI333");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_SEDEPARAM, "SEDEPARAM");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_SEDEPARAM,5,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_ANNOPARAM, "ANNOPARAM");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_ANNOPARAM,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_DESCRIZPARAM, "DESCRIZPARAM");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_DESCRIZPARAM,5,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_NUMERDALPARA, "NUMERDALPARA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_NUMERDALPARA,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_NUMERALPARAM, "NUMERALPARAM");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_NUMERALPARAM,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_DATADALPARAM, "DATADALPARAM");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_DATADALPARAM,6,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_DATAALPARAM, "DATAALPARAM");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_DATAALPARAM,6,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_PARAMFILTRO, "PARAMFILTRO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_PARAMFILTRO,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_PARAANNOESIG, "PARAANNOESIG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_PARAANNOESIG,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_PARPROUNIORG, "PARPROUNIORG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI333,IMDBDef1.FLD_PARAMETRI333_PARPROUNIORG,1,8,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI333, 0);
  }

  private static void Init_PQRY_DEL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_DEL1, 14);
    IMDB.set_TblCode(IMDBDef7.PQRY_DEL1, "PQRY_DEL1");
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_DELESECUTIVI, "DELESECUTIVI");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_DELESECUTIVI,5,30,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_APPROVAZIDEL, "APPROVAZIDEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_APPROVAZIDEL,5,99,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_TIPO_ESEC, "TIPO_ESEC");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_TIPO_ESEC,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_NUMERO_APP, "NUMERO_APP");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_NUMERO_APP,5,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_DATA_APP, "DATA_APP");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_DATA_APP,1,7,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_D_DATA_DEL, "D_DATA_DEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_D_DATA_DEL,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_D_DATA_APP, "D_DATA_APP");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_D_DATA_APP,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_ANNO_PRO, "ANNO_PRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_ANNO_PRO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_NUMERO_PRO, "NUMERO_PRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_NUMERO_PRO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_UNITA_PRO, "UNITA_PRO");
    IMDB.SetFldParams(IMDBDef7.PQRY_DEL1,IMDBDef7.PQSL_DEL1_UNITA_PRO,5,8,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_DEL1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaDelibere(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaDelibere()
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
    FormIdx = MyGlb.FRM_SCELTADELIBE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5631698C-7EC1-4C11-BCAA-2DE0FBF45197";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 816;
    DesignHeight = 370;
    set_Caption(new IDVariant("Scelta Delibere"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 816;
    Frames[1].Height = 344;
    Frames[1].Caption = "Delibere";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    PAN_DELIBERE = new IDPanel(w, this, 1, "PAN_DELIBERE");
    Frames[1].Content = PAN_DELIBERE;
    PAN_DELIBERE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DELIBERE.VS = MainFrm.VisualStyleList;
    PAN_DELIBERE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A1A22C94-B1ED-4598-B653-6B0203E7D97A");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 768, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DELIBERE.InitStatus = 1;
    PAN_DELIBERE_Init();
    PAN_DELIBERE_InitFields();
    PAN_DELIBERE_InitQueries();
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
      PAN_DELIBERE.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaDelibere);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaDelibere.class.getName() : (Glb.ClassWithPackage(SceltaDelibere.class) ? SceltaDelibere.class.getName().substring(SceltaDelibere.class.getPackage().getName().length() + 1) : SceltaDelibere.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDelibere", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Delibere On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DELIBERE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DELIBERE);
      // 
      // Delibere On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DELIBERE.set_ToolTip(Glb.OBJ_FIELD,PFL_DELIBERE_DESCRIZIONE1,(new IDVariant(PAN_DELIBERE.FieldText(PFL_DELIBERE_DESCRIZIONE1))).stringValue()); 
      PAN_DELIBERE.set_ToolTip(Glb.OBJ_FIELD,PFL_DELIBERE_ESECUTIVITA,(new IDVariant(PAN_DELIBERE.FieldText(PFL_DELIBERE_ESECUTIVITA))).stringValue()); 
      PAN_DELIBERE.set_ToolTip(Glb.OBJ_FIELD,PFL_DELIBERE_APPROVAZION1,(new IDVariant(PAN_DELIBERE.FieldText(PFL_DELIBERE_APPROVAZION1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDelibere", "DelibereOnDynamicPropertiesEvent", _e);
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
  private void PAN_DELIBERE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DELIBERE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DELIBERE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DELIBERE, Cancel);
    // Stub
  }

  private void PAN_DELIBERE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DELIBERE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DELIBERE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DELIBERE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DELIBERE_Init()
  {

    PAN_DELIBERE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DELIBERE.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DELIBERE_PROVVEDIMENT, "45225197-7D57-49D8-8FDB-4E3A9B88DBA6");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_GROUP, GRP_DELIBERE_PROVVEDIMENT, "Provvedimento");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DELIBERE_PROVVEDIMENT, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DELIBERE_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_GROUP, GRP_DELIBERE_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 152, 16, 0, 0);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_GROUP, GRP_DELIBERE_PROVVEDIMENT, MyGlb.PANEL_FORM, 0, 435, 124, 49, 0, 0);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DELIBERE_PROVVEDIMENT, 0, 87);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DELIBERE_PROVVEDIMENT, 1, 13);
    PAN_DELIBERE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DELIBERE_PROVVEDIMENT, 0, 4);
    PAN_DELIBERE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DELIBERE_PROVVEDIMENT, 1, 4);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_GROUP, GRP_DELIBERE_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DELIBERE.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, "6B2D7121-1BE4-42EF-95F0-CE3A268C995F");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, "Sede");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, "C4A9F9D8-19C9-404C-A01C-2706AD12F56A");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, "Numero");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, "77835D83-0E7E-4155-8968-924FC7943F03");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, "Anno");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, "58D2C979-6B7F-4E1A-9874-8EE80FAB7B18");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, "Data");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, "Data");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, "8CF76500-7C4C-4A16-99F6-55DEAFCF6C34");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, "Descrizione");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, "22BE311E-D091-445B-A341-D1495A8BEC9E");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, "Esecutivita");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, "Esecutivita");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, "0F22C586-F6E8-47BF-81E4-5990EAA95716");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, "Approvazione");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, "Approvazione");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DELIBERE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_LIST, "Sede");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_FORM, 4, 460, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_FORM, "Sede");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_SEDEDEL, -1, GRP_DELIBERE_PROVVEDIMENT);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_SEDEDEL, PPQRY_DEL1, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_LIST, 44, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_LIST, "Numero");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_FORM, 4, 460, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_FORM, "Numero");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_NUMERODEL, -1, GRP_DELIBERE_PROVVEDIMENT);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_NUMERODEL, PPQRY_DEL1, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_LIST, 108, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_LIST, "Anno");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_FORM, 4, 460, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_FORM, "Anno");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_ANNODEL, -1, GRP_DELIBERE_PROVVEDIMENT);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_ANNODEL, PPQRY_DEL1, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, MyGlb.PANEL_LIST, 152, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, MyGlb.PANEL_LIST, 64);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, MyGlb.PANEL_FORM, 4, 436, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, MyGlb.PANEL_FORM, 68);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_DATA1, -1, -1);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_DATA1, PPQRY_DEL1, "A.D_DATA_DEL", "D_DATA_DEL", 6, 19, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, MyGlb.PANEL_LIST, 228, 36, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, MyGlb.PANEL_LIST, 104);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 100, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, MyGlb.PANEL_FORM, 88);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_DESCRIZIONE1, -1, -1);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_DESCRIZIONE1, PPQRY_DEL1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_LIST, 424, 36, 172, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_LIST, 60);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_LIST, "Esecutivita");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_FORM, 4, 388, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_FORM, 60);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_FORM, 2);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_FORM, "Esecut.");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_ESECUTIVITA, -1, -1);
    PAN_DELIBERE.SetFieldUnbound(PFL_DELIBERE_ESECUTIVITA, true);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_ESECUTIVITA, PPQRY_DEL1, "B.DESCRIZIONE", "DELESECUTIVI", 5, 30, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, MyGlb.PANEL_LIST, 596, 36, 172, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, MyGlb.PANEL_LIST, 76);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, MyGlb.PANEL_LIST, "Approvazione");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, MyGlb.PANEL_FORM, 4, 340, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, MyGlb.PANEL_FORM, 76);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, MyGlb.PANEL_FORM, 2);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVAZION1, MyGlb.PANEL_FORM, "Approv.");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_APPROVAZION1, -1, -1);
    PAN_DELIBERE.SetFieldUnbound(PFL_DELIBERE_APPROVAZION1, true);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_APPROVAZION1, PPQRY_DEL1, "DECODE(A.NUMERO_APP, NULL, '', A.NUMERO_APP || ' - ' || TO_CHAR ( A.D_DATA_APP ))", "APPROVAZIDEL", 5, 99, 0, -13997);
  }

  private void PAN_DELIBERE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DELIBERE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DELIBERE.SetIMDB(IMDB, "PQRY_DEL1", true);
    PAN_DELIBERE.set_SetString(MyGlb.MASTER_ROWNAME, "DEL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  B.DESCRIZIONE as DELESECUTIVI, ");
    SQL.append("  DECODE(A.NUMERO_APP, NULL, '', A.NUMERO_APP || ' - ' || TO_CHAR ( A.D_DATA_APP )) as APPROVAZIDEL, ");
    SQL.append("  A.TIPO_ESEC as TIPO_ESEC, ");
    SQL.append("  A.NUMERO_APP as NUMERO_APP, ");
    SQL.append("  A.DATA_APP as DATA_APP, ");
    SQL.append("  A.D_DATA_DEL as D_DATA_DEL, ");
    SQL.append("  A.D_DATA_APP as D_DATA_APP, ");
    SQL.append("  A.ANNO_PRO as ANNO_PRO, ");
    SQL.append("  A.NUMERO_PRO as NUMERO_PRO, ");
    SQL.append("  A.UNITA_PRO as UNITA_PRO ");
    PAN_DELIBERE.SetQuery(PPQRY_DEL1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DEL A, ");
    SQL.append("  T10 B ");
    PAN_DELIBERE.SetQuery(PPQRY_DEL1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO_ESEC = B.CODICE) ");
    SQL.append("and   ((~~TBL_PARAMETRI333.PARAMFILTRO~~ IS NULL) OR ((~~TBL_PARAMETRI333.PARAMFILTRO~~ = 'SI') AND (");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  COUNT(*) ");
    SQL.append("from ");
    SQL.append("  VARCOM C ");
    SQL.append("where (C.ESERCIZIO = C.ANNO_ESIGIBILITA) ");
    SQL.append("and   (C.E_S = 'S') ");
    SQL.append("and   (C.SEDE_DEL = A.SEDE_DEL) ");
    SQL.append("and   (C.NUMERO_DEL = A.NUMERO_DEL) ");
    SQL.append("and   (C.ANNO_DEL = A.ANNO_DEL) ");
    SQL.append("and   (C.ANNO_ESIGIBILITA = NVL(~~TBL_PARAMETRI333.PARAANNOESIG~~, C.ANNO_ESIGIBILITA)) ");
    SQL.append("and   (NVL(C.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI333.PARPROUNIORG~~, NVL(C.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    SQL.append("and   (NOT ((C.ANNO_IMP IS NULL)) AND NOT ((C.NUMERO_IMP IS NULL))) ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  D.CODICE ");
    SQL.append("from ");
    SQL.append("  VISTA_RICLASSIFICAZIONI_CAP D ");
    SQL.append("where (D.E_S = C.E_S) ");
    SQL.append("and   (D.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (D.CAPITOLO = C.CAPITOLO) ");
    SQL.append("and   (D.ARTICOLO = C.ARTICOLO) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN D.ESERCIZIO_INIZIO AND D.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (D.CODICE = DECODE(D.TITOLO, 1, A_GET_COD_FPV_DA_TIPI_RICL(~~TBL_DATISESSIONE.SESSIOESERCI~~,'1'), DECODE(D.TITOLO, 2, A_GET_COD_FPV_DA_TIPI_RICL(~~TBL_DATISESSIONE.SESSIOESERCI~~,'2'), -1))) ");
    SQL.append("and   (D.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append(")))) ");
    SQL.append("and   (C.ANNO_IMP <> ~~TBL_DATISESSIONE.SESSIOESERCI~~ OR NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  VARIMP E ");
    SQL.append("where (E.PROGRESSIVO = C.PROGRESSIVO_VARIMP) ");
    SQL.append("and   (E.IMP_GENERATO = 'SI') ");
    SQL.append(")))) ");
    SQL.append(") > 0))) ");
    PAN_DELIBERE.SetQuery(PPQRY_DEL1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DELIBERE.SetQuery(PPQRY_DEL1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DELIBERE.SetQuery(PPQRY_DEL1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_DEL, ");
    SQL.append("  A.SEDE_DEL, ");
    SQL.append("  A.NUMERO_DEL, ");
    SQL.append("  A.D_DATA_DEL ");
    PAN_DELIBERE.SetQuery(PPQRY_DEL1, 5, SQL, -1, "");
    PAN_DELIBERE.SetQueryDB(PPQRY_DEL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DELIBERE.SetMasterTable(0, "DEL");
    PAN_DELIBERE.AddToSortList(PFL_DELIBERE_ANNODEL, true);
    PAN_DELIBERE.AddToSortList(PFL_DELIBERE_SEDEDEL, true);
    PAN_DELIBERE.AddToSortList(PFL_DELIBERE_NUMERODEL, true);
    PAN_DELIBERE.AddToSortList(PFL_DELIBERE_DATA1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DELIBERE.Status() == 2)
    {
      int oldListQBE = PAN_DELIBERE.iUseListQBE;
      PAN_DELIBERE.iUseListQBE = 0;
      PAN_DELIBERE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DELIBERE.PanelCommand(Glb.PCM_FIND);
      PAN_DELIBERE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DELIBERE) PAN_DELIBERE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DELIBERE) PAN_DELIBERE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DELIBERE) PAN_DELIBERE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DELIBERE) PAN_DELIBERE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DELIBERE) PAN_DELIBERE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
