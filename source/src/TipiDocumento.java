// **********************************************
// Tipi Documento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiDocumento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPIDOCUMENT_DESCRIZIONE = 0;
  private static int PFL_TIPIDOCUMENT_CODICE = 1;
  private static int PFL_TIPIDOCUMENT_SOTTOPANNELL = 2;

  private static int PPQRY_T03 = 0;


  IDPanel PAN_TIPIDOCUMENT;
  private static int PFL_PARAM_MULTISERVIZI = 0;
  private static int PFL_PARAM_FSE = 1;

  private static int PPQRY_PARAM59 = 0;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM32(IMDB);
    //
    //
    Init_PQRY_T03(IMDB);
    Init_PQRY_PARAM59(IMDB);
    Init_PQRY_PARAM59_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM32(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM32, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM32, "TBL_PARAM32");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM32,IMDBDef2.FLD_PARAM32_ROWNAMEMULTI, "ROWNAMEMULTI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM32,IMDBDef2.FLD_PARAM32_ROWNAMEMULTI,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM32,IMDBDef2.FLD_PARAM32_ROWNAMEFSE, "ROWNAMEFSE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM32,IMDBDef2.FLD_PARAM32_ROWNAMEFSE,5,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM32, 0);
  }

  private static void Init_PQRY_T03(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_T03, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_T03, "PQRY_T03");
    IMDB.set_FldCode(IMDBDef10.PQRY_T03,IMDBDef10.PQSL_T03_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef10.PQRY_T03,IMDBDef10.PQSL_T03_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_T03,IMDBDef10.PQSL_T03_STORNO, "STORNO");
    IMDB.SetFldParams(IMDBDef10.PQRY_T03,IMDBDef10.PQSL_T03_STORNO,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_T03,IMDBDef10.PQSL_T03_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_T03,IMDBDef10.PQSL_T03_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_T03,IMDBDef10.PQSL_T03_ESCLUSIONE_ECF, "ESCLUSIONE_ECF");
    IMDB.SetFldParams(IMDBDef10.PQRY_T03,IMDBDef10.PQSL_T03_ESCLUSIONE_ECF,5,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_T03, 0);
  }

  private static void Init_PQRY_PARAM59(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM59, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM59, "PQRY_PARAM59");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM59,IMDBDef10.PQSL_PARAM59_ROWNAMEMULTI, "ROWNAMEMULTI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM59,IMDBDef10.PQSL_PARAM59_ROWNAMEMULTI,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM59,IMDBDef10.PQSL_PARAM59_ROWNAMEFSE, "ROWNAMEFSE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM59,IMDBDef10.PQSL_PARAM59_ROWNAMEFSE,5,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAM59, 0);
  }

  private static void Init_PQRY_PARAM59_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM59_RS, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM59_RS, "PQRY_PARAM59_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM59_RS,IMDBDef10.PQSL_PARAM59_ROWNAMEMULTI, "ROWNAMEMULTI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM59_RS,IMDBDef10.PQSL_PARAM59_ROWNAMEMULTI,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM59_RS,IMDBDef10.PQSL_PARAM59_ROWNAMEFSE, "ROWNAMEFSE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM59_RS,IMDBDef10.PQSL_PARAM59_ROWNAMEFSE,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiDocumento(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiDocumento()
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
    FormIdx = MyGlb.FRM_TIPIDOCUMENT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7A7AB8B1-D105-4581-80A2-E6EF0E99D4F8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 400;
    DesignHeight = 358;
    set_Caption(new IDVariant("Tipi Documento"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 400;
    Frames[1].Height = 332;
    Frames[1].Caption = "Tipi Documento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 332;
    PAN_TIPIDOCUMENT = new IDPanel(w, this, 1, "PAN_TIPIDOCUMENT");
    Frames[1].Content = PAN_TIPIDOCUMENT;
    PAN_TIPIDOCUMENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIDOCUMENT.VS = MainFrm.VisualStyleList;
    PAN_TIPIDOCUMENT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 400-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TIPIDOCUMENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CEB75C43-522B-4CD3-8326-EF7372CE77E9");
    PAN_TIPIDOCUMENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 224, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPIDOCUMENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIDOCUMENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIDOCUMENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIDOCUMENT.InitStatus = 2;
    PAN_TIPIDOCUMENT_Init();
    PAN_TIPIDOCUMENT_InitFields();
    PAN_TIPIDOCUMENT_InitQueries();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_TIPIDOCUMENT.SetSubFrame(PFL_TIPIDOCUMENT_SOTTOPANNELL,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "455BFCFA-69F0-418C-AC11-B0C41BD1B64E");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 40, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM32, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        TIPIDOCUMENT_PARAM59();
      }
      PAN_TIPIDOCUMENT.UpdatePanel(MainFrm);
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof TipiDocumento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiDocumento.class.getName() : (Glb.ClassWithPackage(TipiDocumento.class) ? TipiDocumento.class.getName().substring(TipiDocumento.class.getPackage().getName().length() + 1) : TipiDocumento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef10.PQRY_T03, IMDBDef10.PQSL_T03_CODICE, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef10.PQRY_T03, IMDBDef10.PQSL_T03_CODICE, 0).equals((new IDVariant(5)), true) || IMDB.Value(IMDBDef10.PQRY_T03, IMDBDef10.PQSL_T03_CODICE, 0).equals((new IDVariant(7)), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiDocumento", "ParamOnDynamicPropertiesEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAM32, IMDBDef2.FLD_PARAM32_ROWNAMEMULTI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM32, IMDBDef2.FLD_PARAM32_ROWNAMEFSE, 0, (new IDVariant()));
      if (IMDB.Value(IMDBDef7.TBL_PARAMETIRIDE, IMDBDef7.FLD_PARAMETIRIDE_DOCUMENIRIDE, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_FSE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_FSE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiDocumento", "LoadEvent", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_T03, IMDBDef10.PQSL_T03_CODICE, 0)) && Confirm.booleanValue())
      {
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiDocumento", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void TIPIDOCUMENT_PARAM59() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAM59_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM32, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM32, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAM59_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAM59_RS, 0, IMDBDef2.TBL_PARAM32, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM59_RS, 0, 0, IMDBDef2.TBL_PARAM32, IMDBDef2.FLD_PARAM32_ROWNAMEMULTI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM59_RS, 1, 0, IMDBDef2.TBL_PARAM32, IMDBDef2.FLD_PARAM32_ROWNAMEFSE, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM32, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM32, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM32, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAM59_RS, 0);
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
  private void PAN_TIPIDOCUMENT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TIPIDOCUMENT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPIDOCUMENT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIDOCUMENT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIDOCUMENT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_TIPIDOCUMENT);
    // Stub
  }

  private void PAN_TIPIDOCUMENT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPIDOCUMENT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIDOCUMENT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIDOCUMENT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPIDOCUMENT_Init()
  {

    PAN_TIPIDOCUMENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIDOCUMENT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPIDOCUMENT.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_TIPIDOCUMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, "00D4DD00-25BF-4451-97CF-2CA08C118DA8");
    PAN_TIPIDOCUMENT.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, " ");
    PAN_TIPIDOCUMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, "Descrizione");
    PAN_TIPIDOCUMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIDOCUMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_TIPIDOCUMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, "D05C8F1F-ECB9-4220-A7C9-0508E0E03731");
    PAN_TIPIDOCUMENT.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, "CODICE");
    PAN_TIPIDOCUMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, "");
    PAN_TIPIDOCUMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TIPIDOCUMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_TIPIDOCUMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_SOTTOPANNELL, "63EE2685-7171-445A-A71E-DB0A2AC8A2DB");
    PAN_TIPIDOCUMENT.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_SOTTOPANNELL, "");
    PAN_TIPIDOCUMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_SOTTOPANNELL, MyGlb.VIS_VUOTONORMALE);
    PAN_TIPIDOCUMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_SOTTOPANNELL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_TIPIDOCUMENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIDOCUMENT.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 224, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIDOCUMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_TIPIDOCUMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIDOCUMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, MyGlb.PANEL_LIST, " ");
    PAN_TIPIDOCUMENT.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 400, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIDOCUMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, MyGlb.PANEL_FORM, 104);
    PAN_TIPIDOCUMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIDOCUMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_DESCRIZIONE, MyGlb.PANEL_FORM, " ");
    PAN_TIPIDOCUMENT.SetFieldPage(PFL_TIPIDOCUMENT_DESCRIZIONE, -1, -1);
    PAN_TIPIDOCUMENT.SetFieldPanel(PFL_TIPIDOCUMENT_DESCRIZIONE, PPQRY_T03, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_TIPIDOCUMENT.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIDOCUMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_TIPIDOCUMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIDOCUMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_TIPIDOCUMENT.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, MyGlb.PANEL_FORM, 4, 76, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIDOCUMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_TIPIDOCUMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIDOCUMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_TIPIDOCUMENT.SetFieldPage(PFL_TIPIDOCUMENT_CODICE, -1, -1);
    PAN_TIPIDOCUMENT.SetFieldPanel(PFL_TIPIDOCUMENT_CODICE, PPQRY_T03, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_TIPIDOCUMENT.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_SOTTOPANNELL, MyGlb.PANEL_LIST, 236, 28, 120, 108, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIDOCUMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_SOTTOPANNELL, MyGlb.PANEL_LIST, 0);
    PAN_TIPIDOCUMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_SOTTOPANNELL, MyGlb.PANEL_LIST, 8);
    PAN_TIPIDOCUMENT.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_SOTTOPANNELL, MyGlb.PANEL_FORM, 240, 8, 172, 84, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIDOCUMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_SOTTOPANNELL, MyGlb.PANEL_FORM, 0);
    PAN_TIPIDOCUMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIDOCUMENT_SOTTOPANNELL, MyGlb.PANEL_FORM, 6);
    PAN_TIPIDOCUMENT.SetFieldPage(PFL_TIPIDOCUMENT_SOTTOPANNELL, -1, -1);
    PAN_TIPIDOCUMENT.SetFieldPanel(PFL_TIPIDOCUMENT_SOTTOPANNELL, -1, "", "SOTTOPANNELL", 0, 0, 0, -13997);
  }

  private void PAN_TIPIDOCUMENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIDOCUMENT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPIDOCUMENT.SetIMDB(IMDB, "PQRY_T03", true);
    PAN_TIPIDOCUMENT.set_SetString(MyGlb.MASTER_ROWNAME, "T03");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.STORNO as STORNO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ESCLUSIONE_ECF as ESCLUSIONE_ECF ");
    PAN_TIPIDOCUMENT.SetQuery(PPQRY_T03, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T03 A ");
    PAN_TIPIDOCUMENT.SetQuery(PPQRY_T03, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.STORNO = 0) ");
    SQL.append("and   ((A.CODICE = 1 OR A.CODICE = 2 OR A.CODICE = 5 OR A.CODICE = 7) AND (UPPER(~~TBL_DATISESSIONE.SESSIOMODULO~~) = UPPER('CFAOD')) OR (UPPER(~~TBL_DATISESSIONE.SESSIOMODULO~~) <> UPPER('CFAOD'))) ");
    PAN_TIPIDOCUMENT.SetQuery(PPQRY_T03, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIDOCUMENT.SetQuery(PPQRY_T03, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIDOCUMENT.SetQuery(PPQRY_T03, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPIDOCUMENT.SetQuery(PPQRY_T03, 5, SQL, -1, "");
    PAN_TIPIDOCUMENT.SetQueryDB(PPQRY_T03, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIDOCUMENT.SetMasterTable(0, "T03");
    PAN_TIPIDOCUMENT.AddToSortList(PFL_TIPIDOCUMENT_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIDOCUMENT.Status() == 2)
    {
      int oldListQBE = PAN_TIPIDOCUMENT.iUseListQBE;
      PAN_TIPIDOCUMENT.iUseListQBE = 0;
      PAN_TIPIDOCUMENT.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIDOCUMENT.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIDOCUMENT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, "8CBFAB86-77A2-4BFC-BB29-4C24F01E0687");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, "Multiservizi");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, "73F8EBED-69ED-4889-9568-5FB9A1A5CFC9");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, "FSE");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, "Fatture FSE");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, MyGlb.PANEL_LIST, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, MyGlb.PANEL_LIST, "Multiservizi");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, MyGlb.PANEL_FORM, 4, 4, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, MyGlb.PANEL_FORM, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_MULTISERVIZI, MyGlb.PANEL_FORM, "Multiservizi");
    PAN_PARAM.SetFieldPage(PFL_PARAM_MULTISERVIZI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_MULTISERVIZI, PPQRY_PARAM59, "A.ROWNAMEMULTI", "ROWNAMEMULTI", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_MULTISERVIZI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_MULTISERVIZI, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, MyGlb.PANEL_LIST, 28);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, MyGlb.PANEL_LIST, "FSE");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, MyGlb.PANEL_FORM, 44, 32, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, MyGlb.PANEL_FORM, 36);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FSE, MyGlb.PANEL_FORM, "FSE");
    PAN_PARAM.SetFieldPage(PFL_PARAM_FSE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_FSE, PPQRY_PARAM59, "A.ROWNAMEFSE", "ROWNAMEFSE", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_FSE, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_FSE, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM59", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM59, IMDBDef10.PQRY_PARAM59_RS, IMDBDef2.TBL_PARAM32);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_MULTISERVIZI, IMDBDef2.FLD_PARAM32_ROWNAMEMULTI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_FSE, IMDBDef2.FLD_PARAM32_ROWNAMEFSE);
    PAN_PARAM.SetMasterTable(0, "PARAM32");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPIDOCUMENT) PAN_TIPIDOCUMENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIDOCUMENT) PAN_TIPIDOCUMENT_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPIDOCUMENT) PAN_TIPIDOCUMENT_DynamicProperties();
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIDOCUMENT) PAN_TIPIDOCUMENT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPIDOCUMENT) PAN_TIPIDOCUMENT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
