// **********************************************
// Documenti Per Imputazione Economica
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DocumentiPerImputazioneEconomica extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAIMPUECON_ESPOSIZIONE = 0;
  private static int GRP_PARAIMPUECON_DATADOCUMENT = 1;
  private static int GRP_PARAIMPUECON_DOCUMENTIDI = 2;
  private static int GRP_PARAIMPUECON_ORDINAMENPER = 3;
  private static int GRP_PARAIMPUECON_DATAPROTOCOL = 4;
  private static int GRP_PARAIMPUECON_DOCUMENTI = 5;

  private static int PFL_PARAIMPUECON_FATTOROCENTR = 0;
  private static int PFL_PARAIMPUECON_NEWPANELLAB1 = 1;
  private static int PFL_PARAIMPUECON_NEWPANELABE2 = 2;
  private static int PFL_PARAIMPUECON_DAL1 = 3;
  private static int PFL_PARAIMPUECON_AL1 = 4;
  private static int PFL_PARAIMPUECON_NEWPANELLAB2 = 5;
  private static int PFL_PARAIMPUECON_ENTRATOSPESA = 6;
  private static int PFL_PARAIMPUECON_NEWPANELLAB3 = 7;
  private static int PFL_PARAIMPUECON_NEWPANELABE3 = 8;
  private static int PFL_PARAIMPUECON_ORDINAMENPER = 9;
  private static int PFL_PARAIMPUECON_NEWPANELLAB4 = 10;
  private static int PFL_PARAIMPUECON_DETTAGLIQUID = 11;
  private static int PFL_PARAIMPUECON_DAL = 12;
  private static int PFL_PARAIMPUECON_AL = 13;
  private static int PFL_PARAIMPUECON_NEWPANELLAB5 = 14;
  private static int PFL_PARAIMPUECON_FATTORE = 15;
  private static int PFL_PARAIMPUECON_CENTRO = 16;
  private static int PFL_PARAIMPUECON_CENTRIDESCRI = 17;
  private static int PFL_PARAIMPUECON_FATTORDESCRI = 18;
  private static int PFL_PARAIMPUECON_DOCUMENSPESA = 19;
  private static int PFL_PARAIMPUECON_NEWPANELLABE = 20;
  private static int PFL_PARAIMPUECON_DOCUMEENTRAT = 21;
  private static int PFL_PARAIMPUECON_NEWPANELABE1 = 22;
  private static int PFL_PARAIMPUECON_ELABORBUTTON = 23;

  private static int PPQRY_PARAMESTAMP1 = 0;

  private static int PPQRY_CENDESLOOQUE = 1;
  private static int PPQRY_FATTLOOKQUER = 2;


  IDPanel PAN_PARAIMPUECON;

  // Definition of Global Variables
  private IDVariant GESTIOECONOM = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant GESTIRCENTRO = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAIMPUECON(IMDB);
    //
    //
    Init_PQRY_PARAMESTAMP1(IMDB);
    Init_PQRY_PARAMESTAMP1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAIMPUECON(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAIMPUECON, 13);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAIMPUECON, "TBL_PARAIMPUECON");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMFATOCE, "ROWNAMFATOCE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMFATOCE,12,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDADODA, "ROWNAMDADODA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDADODA,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDADOAL, "ROWNAMDADOAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDADOAL,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMENTOSP, "ROWNAMENTOSP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMENTOSP,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMORDPER, "ROWNAMORDPER");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMORDPER,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDETLIQ, "ROWNAMDETLIQ");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDETLIQ,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDAPRDA, "ROWNAMDAPRDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDAPRDA,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDAPRAL, "ROWNAMDAPRAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDAPRAL,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMFATCOD, "ROWNAMFATCOD");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMFATCOD,5,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMCENCOD, "ROWNAMCENCOD");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMCENCOD,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDOCSPE, "ROWNAMDOCSPE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDOCSPE,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDOCENT, "ROWNAMDOCENT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMDOCENT,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMGESECO, "ROWNAMGESECO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAIMPUECON,IMDBDef2.FLD_PARAIMPUECON_ROWNAMGESECO,5,49,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAIMPUECON, 0);
  }

  private static void Init_PQRY_PARAMESTAMP1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMESTAMP1, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMESTAMP1, "PQRY_PARAMESTAMP1");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMFATOCE, "ROWNAMFATOCE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMFATOCE,12,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADODA, "ROWNAMDADODA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADODA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADOAL, "ROWNAMDADOAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADOAL,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMENTOSP, "ROWNAMENTOSP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMENTOSP,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMORDPER, "ROWNAMORDPER");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMORDPER,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDETLIQ, "ROWNAMDETLIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDETLIQ,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRDA, "ROWNAMDAPRDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRDA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRAL, "ROWNAMDAPRAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRAL,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMFATCOD, "ROWNAMFATCOD");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMFATCOD,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMCENCOD, "ROWNAMCENCOD");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMCENCOD,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDOCSPE, "ROWNAMDOCSPE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDOCSPE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDOCENT, "ROWNAMDOCENT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDOCENT,5,49,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMESTAMP1, 0);
  }

  private static void Init_PQRY_PARAMESTAMP1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMESTAMP1_RS, "PQRY_PARAMESTAMP1_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMFATOCE, "ROWNAMFATOCE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMFATOCE,12,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADODA, "ROWNAMDADODA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADODA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADOAL, "ROWNAMDADOAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADOAL,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMENTOSP, "ROWNAMENTOSP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMENTOSP,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMORDPER, "ROWNAMORDPER");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMORDPER,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDETLIQ, "ROWNAMDETLIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDETLIQ,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRDA, "ROWNAMDAPRDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRDA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRAL, "ROWNAMDAPRAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRAL,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMFATCOD, "ROWNAMFATCOD");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMFATCOD,5,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMCENCOD, "ROWNAMCENCOD");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMCENCOD,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDOCSPE, "ROWNAMDOCSPE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDOCSPE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDOCENT, "ROWNAMDOCENT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP1_RS,IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDOCENT,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DocumentiPerImputazioneEconomica(MyWebEntryPoint w, IMDBObj imdb)
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
  public DocumentiPerImputazioneEconomica()
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
    FormIdx = MyGlb.FRM_DOCPERIMPECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "367F590B-5B7F-4698-A35E-0D6E1C40261F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 620;
    DesignHeight = 374;
    set_Caption(new IDVariant("Documenti Per Imputazione Economica"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 620;
    Frames[1].Height = 348;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Imputazione Economica";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_PARAIMPUECON = new IDPanel(w, this, 1, "PAN_PARAIMPUECON");
    Frames[1].Content = PAN_PARAIMPUECON;
    PAN_PARAIMPUECON.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAIMPUECON.VS = MainFrm.VisualStyleList;
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 620-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FFFE23AD-91B0-43E1-A3A1-27FD2EA3ECBA");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3472, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAIMPUECON.InitStatus = 1;
    PAN_PARAIMPUECON_Init();
    PAN_PARAIMPUECON_InitFields();
    PAN_PARAIMPUECON_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAIMPUECON, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DOCPERIMPECO_PARAMESTAMP1();
      }
      PAN_PARAIMPUECON.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_PARAIMPUECON.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAIMPUECON_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_PARAIMPUECON.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAIMPUECON_CENTRO) {
      }
    }
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
    return (obj instanceof DocumentiPerImputazioneEconomica);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DocumentiPerImputazioneEconomica.class.getName() : (Glb.ClassWithPackage(DocumentiPerImputazioneEconomica.class) ? DocumentiPerImputazioneEconomica.class.getName().substring(DocumentiPerImputazioneEconomica.class.getPackage().getName().length() + 1) : DocumentiPerImputazioneEconomica.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Imputazione Economica On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAIMPUECON_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DETTAGLIQUID = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DETTAGINCASS = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DETTAGLIQUID = (new IDVariant("Dettaglio Liquidazioni", IDVariant.STRING));
      v_DETTAGINCASS = (new IDVariant("Dettaglio Incassi", IDVariant.STRING));
      MainFrm.DynamicProperties(PAN_PARAIMPUECON);
      // 
      // Parametri Imputazione Economica On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMENTOSP, 0).equals((new IDVariant("E")), true))
      {
        PAN_PARAIMPUECON.SetFlags (Glb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAIMPUECON.SetFlags (Glb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAIMPUECON.set_Header(Glb.OBJ_FIELD,PFL_PARAIMPUECON_DETTAGLIQUID, new IDVariant(v_DETTAGINCASS).stringValue());
      }
      else
      {
        PAN_PARAIMPUECON.SetFlags (Glb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAIMPUECON.SetFlags (Glb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAIMPUECON.set_Header(Glb.OBJ_FIELD,PFL_PARAIMPUECON_DETTAGLIQUID, new IDVariant(v_DETTAGLIQUID).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneEconomica", "ParametriImputazioneEconomicaOnDynamicPropertiesEvent", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Documenti per Imputazione Economica ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      // 
      // setto valori di default
      // 
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDOCENT, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDOCSPE, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMFATOCE, 0, (new IDVariant("F")));
        IMDB.set_Value(IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDADOAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
        IMDB.set_Value(IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDADODA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
        IMDB.set_Value(IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDAPRAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
        IMDB.set_Value(IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDAPRDA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
        IMDB.set_Value(IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMENTOSP, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDETLIQ, 0, (new IDVariant("NO")));
        IMDB.set_Value(IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDETLIQ, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMORDPER, 0, (new IDVariant(1)));
      }
      // 
      // controllo se devo gestire il centro
      // 
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.GESTIONE_ECONOMICA as T99GESTIECON ");
        SQL.append("from ");
        SQL.append("  T99 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          GESTIOECONOM = QV.Get("T99GESTIECON", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (GESTIOECONOM.equals((new IDVariant(2)), true))
        {
          GESTIRCENTRO = new IDVariant(GESTIRCENTRO);
        }
        else
        {
          GESTIRCENTRO = (new IDVariant(0));
          PAN_PARAIMPUECON.SetFlags (Glb.OBJ_GROUP, GRP_PARAIMPUECON_ESPOSIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
          PAN_PARAIMPUECON.SetFlags (Glb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAIMPUECON.SetFlags (Glb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          IMDB.set_Value(IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMGESECO, 0, (new IDVariant("N")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneEconomica", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMCENCOD, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMFATCOD, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneEconomica", "EndModalEvent", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneEconomica", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Selezione Fattore
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IMDB.Value(IMDBDef13.PQRY_IMP5, IMDBDef13.PQSL_IMP5_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneEconomica", "SelezioneFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Centro
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IMDB.Value(IMDBDef13.PQRY_IMP5, IMDBDef13.PQSL_IMP5_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneEconomica", "SelezioneCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      // 
      // validazione dei campi
      // 
      {
        IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
        v_MSG1 = (new IDVariant("Invalidazione date di ricerca: possibile incoerenza nei dati di ricerca per data documento", IDVariant.STRING));
        if (IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADODA, 0).compareTo(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADOAL, 0), true)>0)
        {
          MainFrm.set_AlertMessage(v_MSG1); 
          return 0;
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADODA, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADOAL, 0)))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Invalidazione date di ricerca:  introdurre valori significativi per data documento", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
        if ((IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRDA, 0).compareTo(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRAL, 0), true)>0) || (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRDA, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRAL, 0)))))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Invalidazione date di ricerca:  possibile incoerenza nei dati di ricerca per data protocollo", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRDA, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRAL, 0)))
        {
        }
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Documenti_Imputazione_Economica"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_FATTORE")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMFATCOD, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_CENTRO")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMCENCOD, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_E_S")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMENTOSP, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DA_DATA_DOC")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADODA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_A_DATA_DOC")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDADOAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DA_DATA_PROT")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRDA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_A_DATA_PROT")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDAPRAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DA_DATA_PROT")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMFATOCE, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ORD")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMORDPER, 0)));
      // 
      // parametro se_liq
      // 
      {
        if (IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMENTOSP, 0).equals((new IDVariant("S")), true))
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("P_SE_LIQ")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDOCSPE, 0)));
        }
        else
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("P_SE_LIQ")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDOCENT, 0)));
        }
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DETT_LIQ")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMDETLIQ, 0)));
      // 
      // gestione economica 
      // 
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_GEST_ECONOM")), IDL.ToString(((GESTIOECONOM.equals((new IDVariant(2)), true))?(new IDVariant("S")):(new IDVariant("N")))));
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneEconomica", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Documenti di Entrata O Spesa Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAIMPUECON_ENTRATOSPESA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti di Entrata O Spesa Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP1, IMDBDef9.PQSL_PARAMESTAMP1_ROWNAMENTOSP, 0).equals((new IDVariant("E")), true))
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneEconomica", "DocumentidiEntrataOSpesaValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Primary record source for panel data
  // **********************************************************************
  private void DOCPERIMPECO_PARAMESTAMP1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMESTAMP1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAIMPUECON, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAIMPUECON, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMESTAMP1_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMESTAMP1_RS, 0, IMDBDef2.TBL_PARAIMPUECON, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 0, 0, IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMFATOCE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 1, 0, IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDADODA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 2, 0, IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDADOAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 3, 0, IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMENTOSP, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 4, 0, IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMORDPER, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 5, 0, IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDETLIQ, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 6, 0, IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDAPRDA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 7, 0, IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDAPRAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 8, 0, IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMFATCOD, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 9, 0, IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMCENCOD, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 10, 0, IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDOCSPE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP1_RS, 11, 0, IMDBDef2.TBL_PARAIMPUECON, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDOCENT, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAIMPUECON, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAIMPUECON, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAIMPUECON, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMESTAMP1_RS, 0);
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
  private void PAN_PARAIMPUECON_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAIMPUECON, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAIMPUECON_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAIMPUECON, Cancel);
    // Stub
  }

  private void PAN_PARAIMPUECON_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAIMPUECON_FATTORE)
    {
      this.IdxPanelActived = this.PAN_PARAIMPUECON.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAIMPUECON_CENTRO)
    {
      this.IdxPanelActived = this.PAN_PARAIMPUECON.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAIMPUECON_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAIMPUECON.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAIMPUECON_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAIMPUECON_ENTRATOSPESA)
      {
        PFL_PARAIMPUECON_ENTRATOSPESA_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PARAIMPUECON_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAIMPUECON_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAIMPUECON_Init()
  {

    PAN_PARAIMPUECON.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAIMPUECON.SetSize(MyGlb.OBJ_GROUP, 6);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ESPOSIZIONE, "F8F7A573-3915-4846-95EE-3D385D946337");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ESPOSIZIONE, "Esposizione");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ESPOSIZIONE, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ESPOSIZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ESPOSIZIONE, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ESPOSIZIONE, MyGlb.PANEL_FORM, 8, 7, 112, 73, 0, 0);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ESPOSIZIONE, 0, 65);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ESPOSIZIONE, 1, 13);
    PAN_PARAIMPUECON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ESPOSIZIONE, 0, 4);
    PAN_PARAIMPUECON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ESPOSIZIONE, 1, 4);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ESPOSIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATADOCUMENT, "E3834B1B-37F6-4A18-9D1F-02D173713656");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATADOCUMENT, "Data Documenti");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATADOCUMENT, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATADOCUMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATADOCUMENT, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATADOCUMENT, MyGlb.PANEL_FORM, 8, 87, 296, 57, 0, 0);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATADOCUMENT, 0, 91);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATADOCUMENT, 1, 13);
    PAN_PARAIMPUECON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATADOCUMENT, 0, 4);
    PAN_PARAIMPUECON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATADOCUMENT, 1, 4);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATADOCUMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTIDI, "6C4F90C3-CBF4-4ACA-BCE9-C087CDFB0E07");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTIDI, "Documenti di");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTIDI, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTIDI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTIDI, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTIDI, MyGlb.PANEL_FORM, 8, 151, 296, 49, 0, 0);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTIDI, 0, 74);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTIDI, 1, 13);
    PAN_PARAIMPUECON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTIDI, 0, 4);
    PAN_PARAIMPUECON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTIDI, 1, 4);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTIDI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ORDINAMENPER, "6D244C7F-227D-4503-A5FD-71DECE02A903");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ORDINAMENPER, "Ordinamento per");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ORDINAMENPER, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ORDINAMENPER, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ORDINAMENPER, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ORDINAMENPER, MyGlb.PANEL_FORM, 8, 211, 296, 57, 0, 0);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ORDINAMENPER, 0, 96);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ORDINAMENPER, 1, 13);
    PAN_PARAIMPUECON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ORDINAMENPER, 0, 4);
    PAN_PARAIMPUECON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ORDINAMENPER, 1, 4);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_ORDINAMENPER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATAPROTOCOL, "BAEE188C-302B-4150-979F-82122915AEAF");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATAPROTOCOL, "Data Protocollo");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATAPROTOCOL, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATAPROTOCOL, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATAPROTOCOL, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATAPROTOCOL, MyGlb.PANEL_FORM, 316, 87, 272, 57, 0, 0);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATAPROTOCOL, 0, 87);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATAPROTOCOL, 1, 13);
    PAN_PARAIMPUECON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATAPROTOCOL, 0, 4);
    PAN_PARAIMPUECON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATAPROTOCOL, 1, 4);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DATAPROTOCOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTI, "EC7C6D59-0545-4E2B-BF4A-BD97A22827B2");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTI, "Documenti");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTI, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTI, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTI, MyGlb.PANEL_FORM, 316, 151, 272, 49, 0, 0);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTI, 0, 61);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTI, 1, 13);
    PAN_PARAIMPUECON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTI, 0, 4);
    PAN_PARAIMPUECON.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTI, 1, 4);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAIMPUECON_DOCUMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAIMPUECON.SetSize(MyGlb.OBJ_FIELD, 24);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, "92C9A707-018D-47C1-BE5F-3DA928CD04AA");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, "Fattore O Centro");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB1, "9C7CE6B2-1848-41BC-B57E-9482C34852F0");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB1, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE2, "EA552355-30C1-4B4E-B383-F142E37960E0");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE2, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, "6F7DC224-3575-4E11-9330-96F8EE172A41");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, "Dal");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, "A25449DE-DB70-487D-8CCE-2B294BF3A857");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, "Al");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB2, "FE2EDB91-E4E3-437F-BC36-D65024CEC755");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB2, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB2, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB2, 0 | MyGlb.FLD_INFORM, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, "E842A8C4-031D-4FEC-AA2C-04670C05E332");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, "Entrata O Spesa");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB3, "C5DD79E0-F49E-4246-A82A-B6ACFC89E74D");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB3, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB3, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE3, "EF74B8AA-5593-4670-85D3-71304E4841EC");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE3, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE3, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, "FC3F64F1-632F-4BF3-94A2-FF5164DC7F8B");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, "Ordinamento Per");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB4, "220B356D-2470-4802-A6EB-8383208ECA3F");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB4, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB4, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, "433B061C-75BA-4AE9-843D-9EC045D265CE");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, "Dettaglio Liquidazioni");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, "6A1D51DA-34B9-467C-BC12-BE5F68A32740");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, "Dal");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, "48C77FF6-403A-46F8-8E89-C55C60D013EC");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, "Al");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB5, "51098A90-E51D-43BF-9ADB-5CF4C825C174");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB5, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB5, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, "ED721201-AFDD-405B-8198-87FB7BCDED5C");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, "Fattore ");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, "AC784069-A8DC-45CB-9EAB-D192C17F10D8");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, "Centro");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, "A6CCF332-866D-459B-A1A3-3253154D9625");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, "E0BD4941-6085-4DF7-AB36-19C6ED7969C2");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, "9543A63D-CD1B-4250-8BB2-BA71C1FAC24B");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, "Documenti Spesa");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, "tra liquidati e non liquidati e tutti");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLABE, "24832D23-8169-4E85-9D63-AE64351D60F4");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLABE, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, "8BA1BCCC-9AB5-42D9-A84D-EDFB4A522BA6");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, "Documenti Entrata");
    PAN_PARAIMPUECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE1, "FB3F5856-548C-4530-9A7F-4DF9FBE16CF4");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE1, "");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAIMPUECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ELABORBUTTON, "D29E3153-6C2E-4307-AE09-A46B3B7F6AF3");
    PAN_PARAIMPUECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ELABORBUTTON, "Elabora");
    PAN_PARAIMPUECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAIMPUECON.SetImage(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAIMPUECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAIMPUECON_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, MyGlb.PANEL_LIST, 92);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, MyGlb.PANEL_LIST, "F. O C.");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, MyGlb.PANEL_FORM, 28, 32, 60, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, MyGlb.PANEL_FORM, 104);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, MyGlb.PANEL_FORM, 2);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTOROCENTR, MyGlb.PANEL_FORM, "Fattore O Centro");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_FATTOROCENTR, -1, GRP_PARAIMPUECON_ESPOSIZIONE);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_FATTOROCENTR, PPQRY_PARAMESTAMP1, "A.ROWNAMFATOCE", "ROWNAMFATOCE", 12, 1, 0, -13997);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_FATTOROCENTR, (new IDVariant("F")), "Fattore", "", "", -1);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_FATTOROCENTR, (new IDVariant("C")), "Centro", "", "", -1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB1, MyGlb.PANEL_LIST, 212, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB1, MyGlb.PANEL_FORM, 104, 64, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_NEWPANELLAB1, -1, GRP_PARAIMPUECON_ESPOSIZIONE);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE2, MyGlb.PANEL_LIST, 24, 60, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE2, MyGlb.PANEL_FORM, 12, 64, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_NEWPANELABE2, -1, GRP_PARAIMPUECON_ESPOSIZIONE);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, MyGlb.PANEL_LIST, 24);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, MyGlb.PANEL_FORM, 12, 112, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, MyGlb.PANEL_FORM, 28);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL1, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_DAL1, -1, GRP_PARAIMPUECON_DATADOCUMENT);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_DAL1, PPQRY_PARAMESTAMP1, "A.ROWNAMDADODA", "ROWNAMDADODA", 6, 49, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, MyGlb.PANEL_LIST, 20);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, MyGlb.PANEL_FORM, 136, 112, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, MyGlb.PANEL_FORM, 20);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_AL1, -1, GRP_PARAIMPUECON_DATADOCUMENT);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_AL1, PPQRY_PARAMESTAMP1, "A.ROWNAMDADOAL", "ROWNAMDADOAL", 6, 49, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB2, MyGlb.PANEL_LIST, 116, 92, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB2, MyGlb.PANEL_LIST, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB2, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB2, MyGlb.PANEL_FORM, 288, 128, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB2, MyGlb.PANEL_FORM, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB2, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_NEWPANELLAB2, -1, GRP_PARAIMPUECON_DATADOCUMENT);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_NEWPANELLAB2, -1, "", "NEWPANELLAB2", 0, 0, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, MyGlb.PANEL_LIST, 88);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, MyGlb.PANEL_LIST, "Entrata O Spesa");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, MyGlb.PANEL_FORM, 52, 176, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, MyGlb.PANEL_FORM, 88);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ENTRATOSPESA, MyGlb.PANEL_FORM, "Entr. O Spesa");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_ENTRATOSPESA, -1, GRP_PARAIMPUECON_DOCUMENTIDI);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_ENTRATOSPESA, PPQRY_PARAMESTAMP1, "A.ROWNAMENTOSP", "ROWNAMENTOSP", 5, 49, 0, -13997);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_ENTRATOSPESA, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_ENTRATOSPESA, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB3, MyGlb.PANEL_LIST, 204, 168, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB3, MyGlb.PANEL_LIST, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB3, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB3, MyGlb.PANEL_FORM, 288, 176, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB3, MyGlb.PANEL_FORM, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB3, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_NEWPANELLAB3, -1, GRP_PARAIMPUECON_DOCUMENTIDI);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_NEWPANELLAB3, -1, "", "NEWPANELLAB3", 0, 0, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE3, MyGlb.PANEL_LIST, 152, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE3, MyGlb.PANEL_LIST, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE3, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE3, MyGlb.PANEL_FORM, 12, 184, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE3, MyGlb.PANEL_FORM, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE3, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_NEWPANELABE3, -1, GRP_PARAIMPUECON_DOCUMENTIDI);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_NEWPANELABE3, -1, "", "NEWPANELABE3", 0, 0, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, MyGlb.PANEL_LIST, 92);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, MyGlb.PANEL_LIST, "Ordinamento Per");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, MyGlb.PANEL_FORM, 112, 236, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, MyGlb.PANEL_FORM, 104);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ORDINAMENPER, MyGlb.PANEL_FORM, "Ordinamento Per");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_ORDINAMENPER, -1, GRP_PARAIMPUECON_ORDINAMENPER);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_ORDINAMENPER, PPQRY_PARAMESTAMP1, "A.ROWNAMORDPER", "ROWNAMORDPER", 1, 49, 0, -13997);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_ORDINAMENPER, (new IDVariant(1)), "Estremi documento", "", "", -1);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_ORDINAMENPER, (new IDVariant(2)), "Estremi protocollo", "", "", -1);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_ORDINAMENPER, (new IDVariant(3)), "Beneficiario/Debitore", "", "", -1);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_ORDINAMENPER, (new IDVariant(4)), "Centro/Fattore", "", "", -1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB4, MyGlb.PANEL_LIST, 224, 240, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB4, MyGlb.PANEL_LIST, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB4, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB4, MyGlb.PANEL_FORM, 12, 256, 288, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB4, MyGlb.PANEL_FORM, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB4, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_NEWPANELLAB4, -1, GRP_PARAIMPUECON_ORDINAMENPER);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_NEWPANELLAB4, -1, "", "NEWPANELLAB4", 0, 0, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, MyGlb.PANEL_LIST, 108);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, MyGlb.PANEL_LIST, "Dettaglio Liquidazioni");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, MyGlb.PANEL_FORM, 332, 220, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, MyGlb.PANEL_FORM, 132);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DETTAGLIQUID, MyGlb.PANEL_FORM, "Dettaglio Liquidazioni");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_DETTAGLIQUID, -1, -1);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_DETTAGLIQUID, PPQRY_PARAMESTAMP1, "A.ROWNAMDETLIQ", "ROWNAMDETLIQ", 5, 49, 0, -13997);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_DETTAGLIQUID, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_DETTAGLIQUID, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, MyGlb.PANEL_LIST, 100);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, MyGlb.PANEL_FORM, 320, 112, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_DAL, -1, GRP_PARAIMPUECON_DATAPROTOCOL);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_DAL, PPQRY_PARAMESTAMP1, "A.ROWNAMDAPRDA", "ROWNAMDAPRDA", 6, 49, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, MyGlb.PANEL_LIST, 96);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, MyGlb.PANEL_FORM, 460, 112, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_AL, -1, GRP_PARAIMPUECON_DATAPROTOCOL);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_AL, PPQRY_PARAMESTAMP1, "A.ROWNAMDAPRAL", "ROWNAMDAPRAL", 6, 49, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB5, MyGlb.PANEL_LIST, 176, 332, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB5, MyGlb.PANEL_LIST, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB5, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB5, MyGlb.PANEL_FORM, 572, 128, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB5, MyGlb.PANEL_FORM, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLAB5, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_NEWPANELLAB5, -1, GRP_PARAIMPUECON_DATAPROTOCOL);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_NEWPANELLAB5, -1, "", "NEWPANELLAB5", 0, 0, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, MyGlb.PANEL_LIST, 68);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, MyGlb.PANEL_LIST, "Fattore ");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, MyGlb.PANEL_FORM, 124, 32, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, MyGlb.PANEL_FORM, 52);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORE, MyGlb.PANEL_FORM, "Fattore ");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_FATTORE, -1, -1);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_FATTORE, PPQRY_PARAMESTAMP1, "A.ROWNAMFATCOD", "ROWNAMFATCOD", 5, 16, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, MyGlb.PANEL_LIST, 64);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, MyGlb.PANEL_FORM, 128, 56, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, MyGlb.PANEL_FORM, 48);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_CENTRO, -1, -1);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_CENTRO, PPQRY_PARAMESTAMP1, "A.ROWNAMCENCOD", "ROWNAMCENCOD", 5, 49, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, MyGlb.PANEL_FORM, 316, 56, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_CENTRIDESCRI, -1, -1);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_CENTRIDESCRI, PPQRY_CENDESLOOQUE, "A.DESCRIZIONE", "ROWNAMCENDES", 5, 200, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, MyGlb.PANEL_FORM, 316, 32, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_FATTORDESCRI, -1, -1);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_FATTORDESCRI, PPQRY_FATTLOOKQUER, "A.DESCRIZIONE", "ROWNAMFATDES", 5, 200, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, MyGlb.PANEL_LIST, 60);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, MyGlb.PANEL_LIST, "Documenti Spesa");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, MyGlb.PANEL_FORM, 348, 176, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, MyGlb.PANEL_FORM, 60);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMENSPESA, MyGlb.PANEL_FORM, "Doc. Sp.");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_DOCUMENSPESA, -1, GRP_PARAIMPUECON_DOCUMENTI);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_DOCUMENSPESA, PPQRY_PARAMESTAMP1, "A.ROWNAMDOCSPE", "ROWNAMDOCSPE", 5, 49, 0, -13997);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_DOCUMENSPESA, (new IDVariant("C")), "Liquidati", "", "", -1);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_DOCUMENSPESA, (new IDVariant("A")), "Non Liquidati", "", "", -1);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_DOCUMENSPESA, (new IDVariant("E")), "Tutti", "", "", -1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLABE, MyGlb.PANEL_LIST, 464, 168, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLABE, MyGlb.PANEL_FORM, 572, 184, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_NEWPANELLABE, -1, GRP_PARAIMPUECON_DOCUMENTI);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, MyGlb.PANEL_LIST, 100);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, MyGlb.PANEL_LIST, "Documenti Entrata");
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, MyGlb.PANEL_FORM, 348, 176, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, MyGlb.PANEL_FORM, 100);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_DOCUMEENTRAT, MyGlb.PANEL_FORM, "Docum. Entrata");
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_DOCUMEENTRAT, -1, GRP_PARAIMPUECON_DOCUMENTI);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_DOCUMEENTRAT, PPQRY_PARAMESTAMP1, "A.ROWNAMDOCENT", "ROWNAMDOCENT", 5, 49, 0, -13997);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_DOCUMEENTRAT, (new IDVariant("C")), "Incassati", "", "", -1);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_DOCUMEENTRAT, (new IDVariant("A")), "Non Incassati", "", "", -1);
    PAN_PARAIMPUECON.SetValueListItem(PFL_PARAIMPUECON_DOCUMEENTRAT, (new IDVariant("E")), "Tutti", "", "", -1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE1, MyGlb.PANEL_LIST, 436, 212, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE1, MyGlb.PANEL_FORM, 320, 184, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_NEWPANELABE1, -1, GRP_PARAIMPUECON_DOCUMENTI);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ELABORBUTTON, MyGlb.PANEL_LIST, 212, 328, 64, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAIMPUECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ELABORBUTTON, MyGlb.PANEL_FORM, 436, 288, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAIMPUECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAIMPUECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAIMPUECON_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAIMPUECON.SetFieldPage(PFL_PARAIMPUECON_ELABORBUTTON, -1, -1);
    PAN_PARAIMPUECON.SetFieldPanel(PFL_PARAIMPUECON_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
  }

  private void PAN_PARAIMPUECON_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAIMPUECON.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMCENDES ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (~~ROWNAMCENCOD~~ = A.CENTRO) ");
    PAN_PARAIMPUECON.SetQuery(PPQRY_CENDESLOOQUE, 0, SQL, -1, "");
    PAN_PARAIMPUECON.SetQueryDB(PPQRY_CENDESLOOQUE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAIMPUECON.SetMasterTable(PPQRY_CENDESLOOQUE, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMFATDES ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (~~TBL_PARAIMPUECON.ROWNAMFATCOD~~ = A.FATTORE) ");
    PAN_PARAIMPUECON.SetQuery(PPQRY_FATTLOOKQUER, 0, SQL, -1, "");
    PAN_PARAIMPUECON.SetQueryDB(PPQRY_FATTLOOKQUER, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAIMPUECON.SetMasterTable(PPQRY_FATTLOOKQUER, "FATTORI");
    PAN_PARAIMPUECON.SetIMDB(IMDB, "PQRY_PARAMESTAMP1", true);
    PAN_PARAIMPUECON.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAIMPUECON.SetQueryIMDB(PPQRY_PARAMESTAMP1, IMDBDef9.PQRY_PARAMESTAMP1_RS, IMDBDef2.TBL_PARAIMPUECON);
    JustLoaded = true;
    PAN_PARAIMPUECON.SetFieldPrimaryIndex(PFL_PARAIMPUECON_FATTOROCENTR, IMDBDef2.FLD_PARAIMPUECON_ROWNAMFATOCE);
    PAN_PARAIMPUECON.SetFieldPrimaryIndex(PFL_PARAIMPUECON_DAL1, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDADODA);
    PAN_PARAIMPUECON.SetFieldPrimaryIndex(PFL_PARAIMPUECON_AL1, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDADOAL);
    PAN_PARAIMPUECON.SetFieldPrimaryIndex(PFL_PARAIMPUECON_ENTRATOSPESA, IMDBDef2.FLD_PARAIMPUECON_ROWNAMENTOSP);
    PAN_PARAIMPUECON.SetFieldPrimaryIndex(PFL_PARAIMPUECON_ORDINAMENPER, IMDBDef2.FLD_PARAIMPUECON_ROWNAMORDPER);
    PAN_PARAIMPUECON.SetFieldPrimaryIndex(PFL_PARAIMPUECON_DETTAGLIQUID, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDETLIQ);
    PAN_PARAIMPUECON.SetFieldPrimaryIndex(PFL_PARAIMPUECON_DAL, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDAPRDA);
    PAN_PARAIMPUECON.SetFieldPrimaryIndex(PFL_PARAIMPUECON_AL, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDAPRAL);
    PAN_PARAIMPUECON.SetFieldPrimaryIndex(PFL_PARAIMPUECON_FATTORE, IMDBDef2.FLD_PARAIMPUECON_ROWNAMFATCOD);
    PAN_PARAIMPUECON.SetFieldPrimaryIndex(PFL_PARAIMPUECON_CENTRO, IMDBDef2.FLD_PARAIMPUECON_ROWNAMCENCOD);
    PAN_PARAIMPUECON.SetFieldPrimaryIndex(PFL_PARAIMPUECON_DOCUMENSPESA, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDOCSPE);
    PAN_PARAIMPUECON.SetFieldPrimaryIndex(PFL_PARAIMPUECON_DOCUMEENTRAT, IMDBDef2.FLD_PARAIMPUECON_ROWNAMDOCENT);
    PAN_PARAIMPUECON.SetMasterTable(0, "PARAIMPUECON");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAIMPUECON.Status() == 2)
    {
      int oldListQBE = PAN_PARAIMPUECON.iUseListQBE;
      PAN_PARAIMPUECON.iUseListQBE = 0;
      PAN_PARAIMPUECON.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAIMPUECON.PanelCommand(Glb.PCM_FIND);
      PAN_PARAIMPUECON.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAIMPUECON) PAN_PARAIMPUECON_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAIMPUECON) PAN_PARAIMPUECON_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAIMPUECON) PAN_PARAIMPUECON_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAIMPUECON) PAN_PARAIMPUECON_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAIMPUECON) PAN_PARAIMPUECON_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
