// **********************************************
// Scelta Quietanze Del Soggetto
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaQuietanzeDelSoggetto extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_QUIETANZE_NUMERO = 0;
  private static int PFL_QUIETANZE_TIPOQUIETAN1 = 1;
  private static int PFL_QUIETANZE_CONTODEDICAT = 2;
  private static int PFL_QUIETANZE_PREVALENTE = 3;
  private static int PFL_QUIETANZE_CBPAESE = 4;
  private static int PFL_QUIETANZE_CINEU = 5;
  private static int PFL_QUIETANZE_CIN = 6;
  private static int PFL_QUIETANZE_ABI = 7;
  private static int PFL_QUIETANZE_CAB = 8;
  private static int PFL_QUIETANZE_CONTOCORRENT = 9;
  private static int PFL_QUIETANZE_BIC = 10;
  private static int PFL_QUIETANZE_BANCA = 11;
  private static int PFL_QUIETANZE_INTESTATARI1 = 12;
  private static int PFL_QUIETANZE_INTESTATARI2 = 13;
  private static int PFL_QUIETANZE_INTESTATARI3 = 14;
  private static int PFL_QUIETANZE_IBANIDNAZ = 15;
  private static int PFL_QUIETANZE_IBANCONTO = 16;
  private static int PFL_QUIETANZE_IBANEXTRACEE = 17;
  private static int PFL_QUIETANZE_SCADENZA = 18;
  private static int PFL_QUIETANZE_QUIETANZANT1 = 19;
  private static int PFL_QUIETANZE_SPESE = 20;
  private static int PFL_QUIETANZE_TIPOQUIETANZ = 21;
  private static int PFL_QUIETANZE_QUIETANZANTE = 22;

  private static int PPQRY_QTN4 = 0;

  private static int PPQRY_T02 = 1;
  private static int PPQRY_BEN = 2;

  private static int PPQRY_TIPISPESMINF = 3;


  IDPanel PAN_QUIETANZE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM27(IMDB);
    //
    //
    Init_PQRY_QTN4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM27(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM27, 6);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM27, "TBL_PARAM27");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM27,IMDBDef1.FLD_PARAM27_ROWNAMESOGGE, "ROWNAMESOGGE");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM27,IMDBDef1.FLD_PARAM27_ROWNAMESOGGE,1,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM27,IMDBDef1.FLD_PARAM27_ROWNAMESCADE, "ROWNAMESCADE");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM27,IMDBDef1.FLD_PARAM27_ROWNAMESCADE,6,19,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM27,IMDBDef1.FLD_PARAM27_MODALITA_PAGAMENTO, "MODALITA_PAGAMENTO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM27,IMDBDef1.FLD_PARAM27_MODALITA_PAGAMENTO,5,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM27,IMDBDef1.FLD_PARAM27_IBAN, "IBAN");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM27,IMDBDef1.FLD_PARAM27_IBAN,5,50,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM27,IMDBDef1.FLD_PARAM27_COD_BANCA, "COD_BANCA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM27,IMDBDef1.FLD_PARAM27_COD_BANCA,5,50,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM27,IMDBDef1.FLD_PARAM27_COD_SPORTELLO, "COD_SPORTELLO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM27,IMDBDef1.FLD_PARAM27_COD_SPORTELLO,5,50,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM27, 0);
  }

  private static void Init_PQRY_QTN4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_QTN4, 21);
    IMDB.set_TblCode(IMDBDef7.PQRY_QTN4, "PQRY_QTN4");
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_TIPO_QUIETANZA, "TIPO_QUIETANZA");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_TIPO_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_CONTO_CORRENTE, "CONTO_CORRENTE");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_CONTO_CORRENTE,5,12,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_DES_BANCA, "DES_BANCA");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_DES_BANCA,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_COD_BANCA, "COD_BANCA");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_COD_BANCA,5,99,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_COD_SPORTELLO, "COD_SPORTELLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_COD_SPORTELLO,5,99,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_INTESTATARIO_1, "INTESTATARIO_1");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_INTESTATARIO_1,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_INTESTATARIO_2, "INTESTATARIO_2");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_INTESTATARIO_2,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_INTESTATARIO_3, "INTESTATARIO_3");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_INTESTATARIO_3,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_SCADENZA,6,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_CIN_BANCARIO, "CIN_BANCARIO");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_CIN_BANCARIO,5,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_IBAN_PAESE, "IBAN_PAESE");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_IBAN_PAESE,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_IBAN_CIN_EUROPA, "IBAN_CIN_EUROPA");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_IBAN_CIN_EUROPA,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_QUIETANZANTE, "QUIETANZANTE");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_QUIETANZANTE,2,15,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_IBAN_ID_NAZIONALE, "IBAN_ID_NAZIONALE");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_IBAN_ID_NAZIONALE,5,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_IBAN_CONTO, "IBAN_CONTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_IBAN_CONTO,5,18,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_IBAN_EXTRA_UE, "IBAN_EXTRA_UE");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_IBAN_EXTRA_UE,5,34,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_BIC, "BIC");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_BIC,5,11,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_QTNCONTODEDI, "QTNCONTODEDI");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_QTNCONTODEDI,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_QTNPREVALENT, "QTNPREVALENT");
    IMDB.SetFldParams(IMDBDef7.PQRY_QTN4,IMDBDef7.PQSL_QTN4_QTNPREVALENT,5,2,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_QTN4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaQuietanzeDelSoggetto(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaQuietanzeDelSoggetto()
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
    FormIdx = MyGlb.FRM_SCEQUIDELSOG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1E252944-7EF1-4A1D-842D-D902F75CF5B7";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1096;
    DesignHeight = 430;
    set_Caption(new IDVariant("Scelta Quietanze Del Soggetto"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1096;
    Frames[1].Height = 404;
    Frames[1].Caption = "Quietanze";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 404;
    PAN_QUIETANZE = new IDPanel(w, this, 1, "PAN_QUIETANZE");
    Frames[1].Content = PAN_QUIETANZE;
    PAN_QUIETANZE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_QUIETANZE.VS = MainFrm.VisualStyleList;
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1096-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2B7555AC-B667-474E-AEF8-5CA433F7AD22");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2344, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_QUIETANZE.InitStatus = 2;
    PAN_QUIETANZE_Init();
    PAN_QUIETANZE_InitFields();
    PAN_QUIETANZE_InitQueries();
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
      PAN_QUIETANZE.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaQuietanzeDelSoggetto);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaQuietanzeDelSoggetto.class.getName() : (Glb.ClassWithPackage(SceltaQuietanzeDelSoggetto.class) ? SceltaQuietanzeDelSoggetto.class.getName().substring(SceltaQuietanzeDelSoggetto.class.getPackage().getName().length() + 1) : SceltaQuietanzeDelSoggetto.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Quietanze On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_QUIETANZE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_QUIETANZE);
      // 
      // Quietanze On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_QUIETANZE.set_ToolTip(Glb.OBJ_FIELD,PFL_QUIETANZE_BANCA,(new IDVariant(PAN_QUIETANZE.FieldText(PFL_QUIETANZE_BANCA))).stringValue()); 
      PAN_QUIETANZE.set_ToolTip(Glb.OBJ_FIELD,PFL_QUIETANZE_QUIETANZANT1,(new IDVariant(PAN_QUIETANZE.FieldText(PFL_QUIETANZE_QUIETANZANT1))).stringValue()); 
      PAN_QUIETANZE.set_ToolTip(Glb.OBJ_FIELD,PFL_QUIETANZE_SPESE,(new IDVariant(PAN_QUIETANZE.FieldText(PFL_QUIETANZE_SPESE))).stringValue()); 
      PAN_QUIETANZE.set_ToolTip(Glb.OBJ_FIELD,PFL_QUIETANZE_INTESTATARI1,(new IDVariant(PAN_QUIETANZE.FieldText(PFL_QUIETANZE_INTESTATARI1))).stringValue()); 
      PAN_QUIETANZE.set_ToolTip(Glb.OBJ_FIELD,PFL_QUIETANZE_INTESTATARI2,(new IDVariant(PAN_QUIETANZE.FieldText(PFL_QUIETANZE_INTESTATARI2))).stringValue()); 
      PAN_QUIETANZE.set_ToolTip(Glb.OBJ_FIELD,PFL_QUIETANZE_INTESTATARI3,(new IDVariant(PAN_QUIETANZE.FieldText(PFL_QUIETANZE_INTESTATARI3))).stringValue()); 
      PAN_QUIETANZE.set_ToolTip(Glb.OBJ_FIELD,PFL_QUIETANZE_TIPOQUIETAN1,(new IDVariant(PAN_QUIETANZE.FieldText(PFL_QUIETANZE_TIPOQUIETAN1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaQuietanzeDelSoggetto", "QuietanzeOnDynamicPropertiesEvent", _e);
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
      UNLOADEVENT_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaQuietanzeDelSoggetto", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESOGGE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESCADE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_MODALITA_PAGAMENTO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_IBAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_COD_BANCA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_COD_SPORTELLO, 0, new IDVariant());
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
      v_CAPTION = (new IDVariant("Quietanze del Soggetto", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      if (MainFrm.SPESE_DA_SOGGETTO.equals((new IDVariant("SI")), true))
      {
        PAN_QUIETANZE.SetFlags (Glb.OBJ_FIELD, PFL_QUIETANZE_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_QUIETANZE.SetFlags (Glb.OBJ_FIELD, PFL_QUIETANZE_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(MainFrm.Licenza((new IDVariant("MIF")))))
      {
        PAN_QUIETANZE.SetFlags (Glb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaQuietanzeDelSoggetto", "LoadEvent", _e);
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
  private void PAN_QUIETANZE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_QUIETANZE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_QUIETANZE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_QUIETANZE, Cancel);
    // Stub
  }

  private void PAN_QUIETANZE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_QUIETANZE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_QUIETANZE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_QUIETANZE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_QUIETANZE_Init()
  {

    PAN_QUIETANZE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_QUIETANZE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_QUIETANZE.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, "292C0D04-625D-4594-A7F9-C805BE84382A");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, "Numero");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, "7319297A-D97A-4E2E-BD6F-D0BDD0CE37F5");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, "Tipo Quietanza");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, MyGlb.VIS_VISULOOUPCF4);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, "BF48C682-D3B3-485C-9A98-7E38ACCD3E9D");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, "Conto Dedicato");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, MyGlb.VIS_CHECKSTYLE);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, "14E27BE8-74C7-4140-ACC1-157D236CE72B");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, "Prevalente");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, "Descrivi il contenuto del campo");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, MyGlb.VIS_CHECKSTYLE);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, "D24E6647-2BF1-4E4E-B01D-F54C9DEC522A");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, "C.B.Paese");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, "3A304494-3C03-484F-BA52-978F719A1A3B");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, "CIN EU");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, "E3A21EC9-AAF7-48C0-B722-54A254953380");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, "CIN");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, "A01A4AB1-90E3-4BCA-BFDF-8929DF56A765");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, "ABI");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, "76FC7C81-7505-4A3D-B254-88C80DBDB458");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, "CAB");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, "85569E90-766B-4124-9882-FA0ABA1F82BA");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, "Conto Corrente");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, "7DFE3E84-210A-4A9C-9FE9-FD763B61EB2D");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, "BIC");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, "4AB4A38B-1F60-4E2E-89B4-BFCF88C77059");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, "Banca");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, "C27815E6-798B-40A2-A77B-14D58FE3294F");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, "Intestatario 1");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, "F7C7088B-A0EB-4DB1-8C8C-D550728EE69B");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, "Intestatario 2");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, "9CB30280-070B-4321-A75C-06F7ABD8696A");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, "Intestatario 3");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, "A3D57006-40C9-4E4A-9CC1-D062EB4F94FD");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, "Iban Id.Naz.");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, "0EF32D0F-6C0D-4573-8DA8-A98F74108D61");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, "Iban Conto");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, "A19D4505-EE95-4040-86F4-ECDD48C60B36");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, "Iban Extra Cee");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, "62734D44-A69D-4F15-9777-CF75784905DA");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, "Scadenza");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, "A60A020F-7DC8-496F-9368-6F15DF4308C3");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, "Quietanzante");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, MyGlb.VIS_VISULOOUPCF4);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, "EAEE833F-DD12-4455-8B13-F8B16A5DB44C");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, "Spese");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, "71084330-590E-4E25-B2FF-EDB8835733E2");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, "TIPO QUIETANZA");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, MyGlb.VIS_NONNULLAFIEL);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, 0, -1);
    PAN_QUIETANZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, "64322672-B244-4971-A905-B625DE4882CD");
    PAN_QUIETANZE.set_Header(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, "QUIETANZANTE");
    PAN_QUIETANZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, "");
    PAN_QUIETANZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, MyGlb.VIS_NORMFIELPADR);
    PAN_QUIETANZE.SetFlags(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_QUIETANZE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, MyGlb.PANEL_LIST, 92);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, MyGlb.PANEL_FORM, 196, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, MyGlb.PANEL_FORM, 104);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_NUMERO, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_NUMERO, PPQRY_QTN4, "A.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, MyGlb.PANEL_LIST, 52, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, MyGlb.PANEL_LIST, 100);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, MyGlb.PANEL_LIST, "Tipo Quietanza");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, MyGlb.PANEL_FORM, 4, 292, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, MyGlb.PANEL_FORM, 100);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETAN1, MyGlb.PANEL_FORM, "Tipo Quietanza");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_TIPOQUIETAN1, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_TIPOQUIETAN1, PPQRY_T02, "A.DESCRIZIONE", "T02DESCRIZIO", 5, 40, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, MyGlb.PANEL_LIST, 260, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, MyGlb.PANEL_LIST, 108);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, MyGlb.PANEL_LIST, "Conto Dedicato");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, MyGlb.PANEL_FORM, 4, 364, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, MyGlb.PANEL_FORM, 108);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTODEDICAT, MyGlb.PANEL_FORM, "Conto Dedicato");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_CONTODEDICAT, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_CONTODEDICAT, PPQRY_QTN4, "A.CONTO_DEDICATO", "QTNCONTODEDI", 5, 2, 0, -13997);
    PAN_QUIETANZE.SetValueListItem(PFL_QUIETANZE_CONTODEDICAT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_QUIETANZE.SetValueListItem(PFL_QUIETANZE_CONTODEDICAT, (new IDVariant()), "Null", "", "", -1);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, MyGlb.PANEL_LIST, 320, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, MyGlb.PANEL_LIST, 76);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, MyGlb.PANEL_LIST, "Prevalente");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, MyGlb.PANEL_FORM, 4, 388, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, MyGlb.PANEL_FORM, 76);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_PREVALENTE, MyGlb.PANEL_FORM, "Prevalente");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_PREVALENTE, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_PREVALENTE, PPQRY_QTN4, "A.PREVALENTE", "QTNPREVALENT", 5, 2, 0, -13997);
    PAN_QUIETANZE.SetValueListItem(PFL_QUIETANZE_PREVALENTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_QUIETANZE.SetValueListItem(PFL_QUIETANZE_PREVALENTE, (new IDVariant()), "Null", "", "", -1);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, MyGlb.PANEL_LIST, 392, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, MyGlb.PANEL_LIST, 68);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, MyGlb.PANEL_LIST, "C.B.Paese");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, MyGlb.PANEL_FORM, 404, 172, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, MyGlb.PANEL_FORM, 80);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CBPAESE, MyGlb.PANEL_FORM, "C.B.Paese");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_CBPAESE, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_CBPAESE, PPQRY_QTN4, "A.IBAN_PAESE", "IBAN_PAESE", 5, 2, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, MyGlb.PANEL_LIST, 456, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, MyGlb.PANEL_LIST, 100);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, MyGlb.PANEL_LIST, "CIN EU");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, MyGlb.PANEL_FORM, 4, 196, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, MyGlb.PANEL_FORM, 120);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CINEU, MyGlb.PANEL_FORM, "CIN EU");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_CINEU, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_CINEU, PPQRY_QTN4, "A.IBAN_CIN_EUROPA", "IBAN_CIN_EUROPA", 5, 2, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, MyGlb.PANEL_LIST, 500, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, MyGlb.PANEL_LIST, 84);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, MyGlb.PANEL_LIST, "CIN");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, MyGlb.PANEL_FORM, 252, 172, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, MyGlb.PANEL_FORM, 96);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CIN, MyGlb.PANEL_FORM, "CIN");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_CIN, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_CIN, PPQRY_QTN4, "A.CIN_BANCARIO", "CIN_BANCARIO", 5, 1, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, MyGlb.PANEL_LIST, 528, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, MyGlb.PANEL_LIST, 68);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, MyGlb.PANEL_LIST, "ABI");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, MyGlb.PANEL_FORM, 120);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_ABI, MyGlb.PANEL_FORM, "ABI");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_ABI, -1, -1);
    PAN_QUIETANZE.SetFieldUnbound(PFL_QUIETANZE_ABI, true);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_ABI, PPQRY_QTN4, "LPAD(TO_CHAR ( A.COD_BANCA ), 5, SUBSTR('0', 1, 1))", "COD_BANCA", 5, 99, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, MyGlb.PANEL_LIST, 568, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, MyGlb.PANEL_LIST, 92);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, MyGlb.PANEL_LIST, "CAB");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, MyGlb.PANEL_FORM, 188, 76, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, MyGlb.PANEL_FORM, 104);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CAB, MyGlb.PANEL_FORM, "CAB");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_CAB, -1, -1);
    PAN_QUIETANZE.SetFieldUnbound(PFL_QUIETANZE_CAB, true);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_CAB, PPQRY_QTN4, "LPAD(TO_CHAR ( A.COD_SPORTELLO ), 5, SUBSTR('0', 1, 1))", "COD_SPORTELLO", 5, 99, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, MyGlb.PANEL_LIST, 608, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, MyGlb.PANEL_LIST, 104);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, MyGlb.PANEL_LIST, "Conto Corrente");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, MyGlb.PANEL_FORM, 4, 28, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, MyGlb.PANEL_FORM, 120);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_CONTOCORRENT, MyGlb.PANEL_FORM, "Conto Corrente");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_CONTOCORRENT, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_CONTOCORRENT, PPQRY_QTN4, "A.CONTO_CORRENTE", "CONTO_CORRENTE", 5, 12, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, MyGlb.PANEL_LIST, 692, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, MyGlb.PANEL_LIST, 28);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, MyGlb.PANEL_LIST, "BIC");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, MyGlb.PANEL_FORM, 244, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, MyGlb.PANEL_FORM, 40);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BIC, MyGlb.PANEL_FORM, "BIC");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_BIC, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_BIC, PPQRY_QTN4, "A.BIC", "BIC", 5, 11, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, MyGlb.PANEL_LIST, 776, 36, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, MyGlb.PANEL_LIST, 64);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, MyGlb.PANEL_LIST, "Banca");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, MyGlb.PANEL_FORM, 4, 52, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, MyGlb.PANEL_FORM, 120);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_BANCA, MyGlb.PANEL_FORM, "Banca");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_BANCA, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_BANCA, PPQRY_QTN4, "A.DES_BANCA", "DES_BANCA", 5, 40, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, MyGlb.PANEL_LIST, 964, 36, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, MyGlb.PANEL_LIST, 92);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, MyGlb.PANEL_LIST, "Intestatario 1");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, MyGlb.PANEL_FORM, 4, 100, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, MyGlb.PANEL_FORM, 120);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI1, MyGlb.PANEL_FORM, "Intestatario 1");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_INTESTATARI1, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_INTESTATARI1, PPQRY_QTN4, "A.INTESTATARIO_1", "INTESTATARIO_1", 5, 40, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, MyGlb.PANEL_LIST, 1152, 36, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, MyGlb.PANEL_LIST, 92);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, MyGlb.PANEL_LIST, "Intestatario 2");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, MyGlb.PANEL_FORM, 4, 124, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, MyGlb.PANEL_FORM, 120);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI2, MyGlb.PANEL_FORM, "Intestatario 2");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_INTESTATARI2, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_INTESTATARI2, PPQRY_QTN4, "A.INTESTATARIO_2", "INTESTATARIO_2", 5, 40, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, MyGlb.PANEL_LIST, 1340, 36, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, MyGlb.PANEL_LIST, 92);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, MyGlb.PANEL_LIST, "Intestatario 3");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, MyGlb.PANEL_FORM, 4, 148, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, MyGlb.PANEL_FORM, 120);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_INTESTATARI3, MyGlb.PANEL_FORM, "Intestatario 3");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_INTESTATARI3, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_INTESTATARI3, PPQRY_QTN4, "A.INTESTATARIO_3", "INTESTATARIO_3", 5, 40, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, MyGlb.PANEL_LIST, 1528, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, MyGlb.PANEL_LIST, 108);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, MyGlb.PANEL_LIST, "Iban Id.Naz.");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, MyGlb.PANEL_FORM, 120);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANIDNAZ, MyGlb.PANEL_FORM, "Iban Id.Naz.");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_IBANIDNAZ, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_IBANIDNAZ, PPQRY_QTN4, "A.IBAN_ID_NAZIONALE", "IBAN_ID_NAZIONALE", 5, 10, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, MyGlb.PANEL_LIST, 1604, 36, 132, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, MyGlb.PANEL_LIST, 72);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, MyGlb.PANEL_LIST, "Iban Conto");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, MyGlb.PANEL_FORM, 4, 244, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, MyGlb.PANEL_FORM, 120);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANCONTO, MyGlb.PANEL_FORM, "Iban Conto");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_IBANCONTO, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_IBANCONTO, PPQRY_QTN4, "A.IBAN_CONTO", "IBAN_CONTO", 5, 18, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, MyGlb.PANEL_LIST, 1736, 36, 156, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, MyGlb.PANEL_LIST, 84);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, MyGlb.PANEL_LIST, "Iban Extra Cee");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, MyGlb.PANEL_FORM, 4, 268, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, MyGlb.PANEL_FORM, 120);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_IBANEXTRACEE, MyGlb.PANEL_FORM, "Iban Extra Cee");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_IBANEXTRACEE, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_IBANEXTRACEE, PPQRY_QTN4, "A.IBAN_EXTRA_UE", "IBAN_EXTRA_UE", 5, 34, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, MyGlb.PANEL_LIST, 1892, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, MyGlb.PANEL_FORM, 4, 172, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, MyGlb.PANEL_FORM, 120);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_SCADENZA, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_SCADENZA, PPQRY_QTN4, "A.SCADENZA", "SCADENZA", 6, 10, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, MyGlb.PANEL_LIST, 1956, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, MyGlb.PANEL_LIST, 124);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, MyGlb.PANEL_LIST, "Quietanzante");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, MyGlb.PANEL_FORM, 4, 316, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, MyGlb.PANEL_FORM, 124);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANT1, MyGlb.PANEL_FORM, "Quietanzante");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_QUIETANZANT1, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_QUIETANZANT1, PPQRY_BEN, "A.RAGIONE_SOCIALE_ESTESA", "BENRAGSOESES", 5, 60, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, MyGlb.PANEL_LIST, 2164, 36, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, MyGlb.PANEL_FORM, 4, 340, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, MyGlb.PANEL_FORM, 40);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_SPESE, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_SPESE, PPQRY_QTN4, "A.SPESE", "SPESE", 1, 1, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, MyGlb.PANEL_LIST, 96);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, MyGlb.PANEL_LIST, "TIPO QUIETANZA");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, MyGlb.PANEL_FORM, 4, 340, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, MyGlb.PANEL_FORM, 96);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_TIPOQUIETANZ, MyGlb.PANEL_FORM, "TP. QUIETANZA");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_TIPOQUIETANZ, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_TIPOQUIETANZ, PPQRY_QTN4, "A.TIPO_QUIETANZA", "TIPO_QUIETANZA", 1, 2, 0, -13997);
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, MyGlb.PANEL_LIST, 88);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, MyGlb.PANEL_LIST, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, MyGlb.PANEL_LIST, "QUIETAN.");
    PAN_QUIETANZE.SetRect(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, MyGlb.PANEL_FORM, 4, 340, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUIETANZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, MyGlb.PANEL_FORM, 88);
    PAN_QUIETANZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, MyGlb.PANEL_FORM, 1);
    PAN_QUIETANZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUIETANZE_QUIETANZANTE, MyGlb.PANEL_FORM, "QUIETAN.");
    PAN_QUIETANZE.SetFieldPage(PFL_QUIETANZE_QUIETANZANTE, -1, -1);
    PAN_QUIETANZE.SetFieldPanel(PFL_QUIETANZE_QUIETANZANTE, PPQRY_QTN4, "A.QUIETANZANTE", "QUIETANZANTE", 2, 15, 0, -13997);
  }

  private void PAN_QUIETANZE_InitQueries()
  {
    StringBuffer SQL;

    PAN_QUIETANZE.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as T02DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    SQL.append("where (A.CODICE = ~~TIPO_QUIETANZA~~) ");
    PAN_QUIETANZE.SetQuery(PPQRY_T02, 0, SQL, -1, "");
    PAN_QUIETANZE.SetQueryDB(PPQRY_T02, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUIETANZE.SetMasterTable(PPQRY_T02, "T02");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~QUIETANZANTE~~) ");
    PAN_QUIETANZE.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_QUIETANZE.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUIETANZE.SetMasterTable(PPQRY_BEN, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~SPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_QUIETANZE.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_QUIETANZE_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_QUIETANZE.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_QUIETANZE_SPESE, "");
    PAN_QUIETANZE.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUIETANZE.SetIMDB(IMDB, "PQRY_QTN4", true);
    PAN_QUIETANZE.set_SetString(MyGlb.MASTER_ROWNAME, "QTN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUM_QUIETANZA as NUM_QUIETANZA, ");
    SQL.append("  A.TIPO_QUIETANZA as TIPO_QUIETANZA, ");
    SQL.append("  A.CONTO_CORRENTE as CONTO_CORRENTE, ");
    SQL.append("  A.DES_BANCA as DES_BANCA, ");
    SQL.append("  LPAD(TO_CHAR ( A.COD_BANCA ), 5, SUBSTR('0', 1, 1)) as COD_BANCA, ");
    SQL.append("  LPAD(TO_CHAR ( A.COD_SPORTELLO ), 5, SUBSTR('0', 1, 1)) as COD_SPORTELLO, ");
    SQL.append("  A.INTESTATARIO_1 as INTESTATARIO_1, ");
    SQL.append("  A.INTESTATARIO_2 as INTESTATARIO_2, ");
    SQL.append("  A.INTESTATARIO_3 as INTESTATARIO_3, ");
    SQL.append("  A.SCADENZA as SCADENZA, ");
    SQL.append("  A.CIN_BANCARIO as CIN_BANCARIO, ");
    SQL.append("  A.IBAN_PAESE as IBAN_PAESE, ");
    SQL.append("  A.IBAN_CIN_EUROPA as IBAN_CIN_EUROPA, ");
    SQL.append("  A.QUIETANZANTE as QUIETANZANTE, ");
    SQL.append("  A.IBAN_ID_NAZIONALE as IBAN_ID_NAZIONALE, ");
    SQL.append("  A.IBAN_CONTO as IBAN_CONTO, ");
    SQL.append("  A.IBAN_EXTRA_UE as IBAN_EXTRA_UE, ");
    SQL.append("  A.BIC as BIC, ");
    SQL.append("  A.SPESE as SPESE, ");
    SQL.append("  A.CONTO_DEDICATO as QTNCONTODEDI, ");
    SQL.append("  A.PREVALENTE as QTNPREVALENT ");
    PAN_QUIETANZE.SetQuery(PPQRY_QTN4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B ");
    PAN_QUIETANZE.SetQuery(PPQRY_QTN4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.CODICE = ~~TBL_PARAM27.ROWNAMESOGGE~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > NVL(~~TBL_PARAM27.ROWNAMESCADE~~, TO_DATE('1900-01-01','YYYY-MM-DD'))) ");
    SQL.append("and   (B.CODICE = A.TIPO_QUIETANZA) ");
    SQL.append("and   (NVL(B.CODICE_FE, 'X') = NVL(~~TBL_PARAM27.MODALITA_PAGAMENTO~~, NVL(B.CODICE_FE, 'X'))) ");
    SQL.append("and   ((~~TBL_PARAM27.MODALITA_PAGAMENTO~~ IS NULL) OR ((NOT ((~~TBL_PARAM27.IBAN~~ IS NULL)) AND ~~TBL_PARAM27.IBAN~~ = NVL(A.IBAN_PAESE, 'IT') || LPAD(NVL(A.IBAN_CIN_EUROPA, '0'), 2, SUBSTR('0', 1, 1)) || NVL(A.CIN_BANCARIO, '0') || LPAD(TO_CHAR ( A.COD_BANCA ), 5, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( A.COD_SPORTELLO ), 5, SUBSTR('0', 1, 1)) || LPAD(A.CONTO_CORRENTE, 12, SUBSTR('0', 1, 1)) OR ((~~TBL_PARAM27.IBAN~~ IS NULL) AND LPAD(TO_CHAR ( NVL(A.COD_BANCA, 0) ), 5, SUBSTR('0', 1, 1)) = NVL(~~TBL_PARAM27.COD_BANCA~~, '00000') AND LPAD(TO_CHAR ( NVL(A.COD_SPORTELLO, 0) ), 5, SUBSTR('0', 1, 1)) = NVL(~~TBL_PARAM27.COD_SPORTELLO~~, '00000'))))) ");
    PAN_QUIETANZE.SetQuery(PPQRY_QTN4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUIETANZE.SetQuery(PPQRY_QTN4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUIETANZE.SetQuery(PPQRY_QTN4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.NUM_QUIETANZA ");
    PAN_QUIETANZE.SetQuery(PPQRY_QTN4, 5, SQL, -1, "");
    PAN_QUIETANZE.SetQueryDB(PPQRY_QTN4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUIETANZE.SetMasterTable(0, "QTN");
    PAN_QUIETANZE.AddToSortList(PFL_QUIETANZE_NUMERO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_QUIETANZE.Status() == 2)
    {
      int oldListQBE = PAN_QUIETANZE.iUseListQBE;
      PAN_QUIETANZE.iUseListQBE = 0;
      PAN_QUIETANZE.PanelCommand(Glb.PCM_SEARCH);
      PAN_QUIETANZE.PanelCommand(Glb.PCM_FIND);
      PAN_QUIETANZE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_QUIETANZE) PAN_QUIETANZE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUIETANZE) PAN_QUIETANZE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_QUIETANZE) PAN_QUIETANZE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUIETANZE) PAN_QUIETANZE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_QUIETANZE) PAN_QUIETANZE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
