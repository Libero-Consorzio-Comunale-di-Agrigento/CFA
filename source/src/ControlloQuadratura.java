// **********************************************
// Controllo Quadratura
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloQuadratura extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PANNELLO_SOLOAPPROVAT = 0;
  private static int PFL_PANNELLO_TIPOVARIAZIO = 1;
  private static int PFL_PANNELLO_TIPOQUADRATU = 2;

  private static int PPQRY_PANNELLO2 = 0;

  private static int PPQRY_T54 = 1;


  IDPanel PAN_PANNELLO;
  private static int PFL_CONTROQUADRA_008 = 0;
  private static int PFL_CONTROQUADRA_009 = 1;
  private static int PFL_CONTROQUADRA_2010 = 2;
  private static int PFL_CONTROQUADRA_0081 = 3;
  private static int PFL_CONTROQUADRA_0091 = 4;
  private static int PFL_CONTROQUADRA_0101 = 5;
  private static int PFL_CONTROQUADRA_LABEL = 6;
  private static int PFL_CONTROQUADRA_ENTRATE = 7;
  private static int PFL_CONTROQUADRA_SPESE = 8;
  private static int PFL_CONTROQUADRA_VARENEGATIV2 = 9;
  private static int PFL_CONTROQUADRA_VAREPOSITIV2 = 10;
  private static int PFL_CONTROQUADRA_VARENEGATIV3 = 11;
  private static int PFL_CONTROQUADRA_VAREPOSITIV3 = 12;
  private static int PFL_CONTROQUADRA_POSITIVE = 13;
  private static int PFL_CONTROQUADRA_NEGATIVE = 14;
  private static int PFL_CONTROQUADRA_VARSPOSITIV2 = 15;
  private static int PFL_CONTROQUADRA_VARSNEGATIV2 = 16;
  private static int PFL_CONTROQUADRA_VARSPOSITIV3 = 17;
  private static int PFL_CONTROQUADRA_VARSNEGATIV3 = 18;
  private static int PFL_CONTROQUADRA_QUADRATLABEL = 19;
  private static int PFL_CONTROQUADRA_TOTALESCRIT1 = 20;
  private static int PFL_CONTROQUADRA_TOT1 = 21;
  private static int PFL_CONTROQUADRA_TOT2 = 22;
  private static int PFL_CONTROQUADRA_TOT3 = 23;
  private static int PFL_CONTROQUADRA_TOT4 = 24;
  private static int PFL_CONTROQUADRA_TOT5 = 25;
  private static int PFL_CONTROQUADRA_TOT6 = 26;

  private static int PPQRY_POLTOTPROPOS = 0;


  IDPanel PAN_CONTROQUADRA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR67(IMDB);
    Init_TBL_PANNELLO5(IMDB);
    //
    //
    Init_PQRY_POLTOTPROPOS(IMDB);
    Init_PQRY_PANNELLO2(IMDB);
    Init_PQRY_PANNELLO2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR67(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR67, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR67, "TBL_PAR67");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR67,IMDBDef3.FLD_PAR67_ROWNAMBOVAID, "ROWNAMBOVAID");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR67,IMDBDef3.FLD_PAR67_ROWNAMBOVAID,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR67,IMDBDef3.FLD_PAR67_ROWNAMEFIRST, "ROWNAMEFIRST");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR67,IMDBDef3.FLD_PAR67_ROWNAMEFIRST,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR67, 0);
  }

  private static void Init_TBL_PANNELLO5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PANNELLO5, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PANNELLO5, "TBL_PANNELLO5");
    IMDB.set_FldCode(IMDBDef3.TBL_PANNELLO5,IMDBDef3.FLD_PANNELLO5_ROWNAMSOLAPP, "ROWNAMSOLAPP");
    IMDB.SetFldParams(IMDBDef3.TBL_PANNELLO5,IMDBDef3.FLD_PANNELLO5_ROWNAMSOLAPP,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PANNELLO5,IMDBDef3.FLD_PANNELLO5_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef3.TBL_PANNELLO5,IMDBDef3.FLD_PANNELLO5_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PANNELLO5,IMDBDef3.FLD_PANNELLO5_ROWNAMTIPQUA, "ROWNAMTIPQUA");
    IMDB.SetFldParams(IMDBDef3.TBL_PANNELLO5,IMDBDef3.FLD_PANNELLO5_ROWNAMTIPQUA,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PANNELLO5, 0);
  }

  private static void Init_PQRY_POLTOTPROPOS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLTOTPROPOS, 18);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLTOTPROPOS, "PQRY_POLTOTPROPOS");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDSPESE1, "RECORDSPESE1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDSPESE1,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDENTRAT, "RECORDENTRAT");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDENTRAT,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDNEGATI, "RECORDNEGATI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDNEGATI,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDPOSITI, "RECORDPOSITI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDPOSITI,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVARENEG2, "RECOVARENEG2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVARENEG2,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVAREPOS2, "RECOVAREPOS2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVAREPOS2,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVARSNEG2, "RECOVARSNEG2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVARSNEG2,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVARSPOS2, "RECOVARSPOS2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVARSPOS2,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVARENEG3, "RECOVARENEG3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVARENEG3,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVAREPOS3, "RECOVAREPOS3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVAREPOS3,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVARSNEG3, "RECOVARSNEG3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVARSNEG3,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVARSPOS3, "RECOVARSPOS3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECOVARSPOS3,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDTOT1, "RECORDTOT1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDTOT1,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDTOT2, "RECORDTOT2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDTOT2,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDTOT3, "RECORDTOT3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDTOT3,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDTOT4, "RECORDTOT4");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDTOT4,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDTOT5, "RECORDTOT5");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDTOT5,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDTOT6, "RECORDTOT6");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPOS,IMDBDef12.PQSL_POLTOTPROPOS_RECORDTOT6,3,28,6);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLTOTPROPOS, 0);
  }

  private static void Init_PQRY_PANNELLO2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PANNELLO2, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PANNELLO2, "PQRY_PANNELLO2");
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLO2,IMDBDef12.PQSL_PANNELLO2_ROWNAMSOLAPP, "ROWNAMSOLAPP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLO2,IMDBDef12.PQSL_PANNELLO2_ROWNAMSOLAPP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLO2,IMDBDef12.PQSL_PANNELLO2_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLO2,IMDBDef12.PQSL_PANNELLO2_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLO2,IMDBDef12.PQSL_PANNELLO2_ROWNAMTIPQUA, "ROWNAMTIPQUA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLO2,IMDBDef12.PQSL_PANNELLO2_ROWNAMTIPQUA,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PANNELLO2, 0);
  }

  private static void Init_PQRY_PANNELLO2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PANNELLO2_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PANNELLO2_RS, "PQRY_PANNELLO2_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLO2_RS,IMDBDef12.PQSL_PANNELLO2_ROWNAMSOLAPP, "ROWNAMSOLAPP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLO2_RS,IMDBDef12.PQSL_PANNELLO2_ROWNAMSOLAPP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLO2_RS,IMDBDef12.PQSL_PANNELLO2_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLO2_RS,IMDBDef12.PQSL_PANNELLO2_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLO2_RS,IMDBDef12.PQSL_PANNELLO2_ROWNAMTIPQUA, "ROWNAMTIPQUA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLO2_RS,IMDBDef12.PQSL_PANNELLO2_ROWNAMTIPQUA,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloQuadratura(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloQuadratura()
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
    FormIdx = MyGlb.FRM_CONTROQUADRA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "28E4A131-9EA0-4F8C-990B-15BDD0E66DA9";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 512;
    DesignHeight = 302;
    set_Caption(new IDVariant("Controllo Quadratura"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 512;
    Frames[1].Height = 276;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.376812;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 512;
    Frames[2].Height = 104;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pannello";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 104;
    PAN_PANNELLO = new IDPanel(w, this, 2, "PAN_PANNELLO");
    Frames[2].Content = PAN_PANNELLO;
    PAN_PANNELLO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANNELLO.VS = MainFrm.VisualStyleList;
    PAN_PANNELLO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 512-MyGlb.PAN_OFFS_X, 104-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CFE29F46-AC72-450E-BB66-C346EBB71A20");
    PAN_PANNELLO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 208, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PANNELLO.InitStatus = 2;
    PAN_PANNELLO_Init();
    PAN_PANNELLO_InitFields();
    PAN_PANNELLO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 512;
    Frames[3].Height = 172;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Controllo Quadratura";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 172;
    PAN_CONTROQUADRA = new IDPanel(w, this, 3, "PAN_CONTROQUADRA");
    Frames[3].Content = PAN_CONTROQUADRA;
    PAN_CONTROQUADRA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTROQUADRA.VS = MainFrm.VisualStyleList;
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 512-MyGlb.PAN_OFFS_X, 172-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A929E288-9381-4517-8EC4-E9652D745CF3");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2664, 184, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTROQUADRA.InitStatus = 2;
    PAN_CONTROQUADRA_Init();
    PAN_CONTROQUADRA_InitFields();
    PAN_CONTROQUADRA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PANNELLO5, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTROQUADRA_PANNELLO2();
      }
      PAN_CONTROQUADRA.UpdatePanel(MainFrm);
      PAN_PANNELLO.UpdatePanel(MainFrm);
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
    return (obj instanceof ControlloQuadratura);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloQuadratura.class.getName() : (Glb.ClassWithPackage(ControlloQuadratura.class) ? ControlloQuadratura.class.getName().substring(ControlloQuadratura.class.getPackage().getName().length() + 1) : ControlloQuadratura.class.getName()));
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
    IDVariant v_DESC = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_CONTROQUADRA.set_FieldText(PFL_CONTROQUADRA_008, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).stringValue());
      PAN_CONTROQUADRA.set_FieldText(PFL_CONTROQUADRA_0081, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).stringValue());
      PAN_CONTROQUADRA.set_FieldText(PFL_CONTROQUADRA_009, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))).stringValue());
      PAN_CONTROQUADRA.set_FieldText(PFL_CONTROQUADRA_0091, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))).stringValue());
      PAN_CONTROQUADRA.set_FieldText(PFL_CONTROQUADRA_2010, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)))).stringValue());
      PAN_CONTROQUADRA.set_FieldText(PFL_CONTROQUADRA_0101, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)))).stringValue());
      PAN_CONTROQUADRA.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef3.TBL_PANNELLO5, IMDBDef3.FLD_PANNELLO5_ROWNAMSOLAPP, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PANNELLO5, IMDBDef3.FLD_PANNELLO5_ROWNAMTIPVAR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PANNELLO5, IMDBDef3.FLD_PANNELLO5_ROWNAMTIPQUA, 0, (new IDVariant("PN")));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as POLBOZVARDES ");
      SQL.append("from ");
      SQL.append("  POL_BOZZE_VARIAZIONE A ");
      SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PAR67, IMDBDef3.FLD_PAR67_ROWNAMBOVAID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESC = QV.Get("POLBOZVARDES", IDVariant.STRING) ;
      }
      QV.Close();
      PAN_CONTROQUADRA.set_FieldText(PFL_CONTROQUADRA_LABEL, new IDVariant(v_DESC).stringValue());
      // PAN_PANNELLO.SetFlags (Glb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadratura", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PAR67, IMDBDef3.FLD_PAR67_ROWNAMEFIRST, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadratura", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Pannello On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANNELLO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PANNELLO);
      // 
      // Pannello On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PANNELLO2, IMDBDef12.PQSL_PANNELLO2_ROWNAMTIPQUA, 0).equals((new IDVariant("ES")), true))
      {
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_0081, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_0091, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_0101, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOTALESCRIT1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_008, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_009, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_2010, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_QUADRATLABEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_0081, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_0091, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_0101, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOTALESCRIT1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_008, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_009, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_2010, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_QUADRATLABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_008, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_009, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROQUADRA.SetFlags (Glb.OBJ_FIELD, PFL_CONTROQUADRA_2010, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadratura", "PannelloOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Pannello On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PANNELLO_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PANNELLO, Cancel);
      // 
      // Pannello On Validate Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PANNELLO2, IMDBDef12.PQSL_PANNELLO2_ROWNAMTIPVAR, 0).equals((new IDVariant()), true))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("E' necessario inserire un valore", IDVariant.STRING));
        PAN_PANNELLO.SetFieldErrorText(PFL_PANNELLO_TIPOVARIAZIO, v_ERR.stringValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadratura", "PannelloOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Pannello
  // Primary record source for panel data
  // **********************************************************************
  private void CONTROQUADRA_PANNELLO2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PANNELLO2_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PANNELLO5, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PANNELLO5, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PANNELLO2_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PANNELLO2_RS, 0, IMDBDef3.TBL_PANNELLO5, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PANNELLO2_RS, 0, 0, IMDBDef3.TBL_PANNELLO5, IMDBDef3.FLD_PANNELLO5_ROWNAMSOLAPP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PANNELLO2_RS, 1, 0, IMDBDef3.TBL_PANNELLO5, IMDBDef3.FLD_PANNELLO5_ROWNAMTIPVAR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PANNELLO2_RS, 2, 0, IMDBDef3.TBL_PANNELLO5, IMDBDef3.FLD_PANNELLO5_ROWNAMTIPQUA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PANNELLO5, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PANNELLO5, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PANNELLO5, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PANNELLO2_RS, 0);
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
  private void PAN_PANNELLO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANNELLO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PANNELLO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PANNELLO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PANNELLO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANNELLO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CONTROQUADRA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTROQUADRA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTROQUADRA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTROQUADRA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTROQUADRA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CONTROQUADRA);
    // Stub
  }

  private void PAN_CONTROQUADRA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONTROQUADRA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTROQUADRA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTROQUADRA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONTROQUADRA_Init()
  {

    PAN_CONTROQUADRA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTROQUADRA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONTROQUADRA.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_008, "4B1829D8-455D-49B6-BF95-F2CED8AA57F4");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_008, "2008");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_008, MyGlb.VIS_VUOTOGRASSET);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_008, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_009, "EE0134D5-417A-4C20-94D2-A3410BBBCA51");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_009, "2009");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_009, MyGlb.VIS_VUOTOGRASSET);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_009, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_2010, "02BB87B1-AF32-4CFB-9F90-9FD4FE5C0330");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_2010, "2010");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_2010, MyGlb.VIS_VUOTOGRASSET);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_2010, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0081, "3D331A2E-9155-47AE-AB7A-FB4CB6E75ECF");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0081, "2008");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0081, MyGlb.VIS_VUOTOGRASSET);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0081, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0091, "30D6AF2A-D30B-4160-8BC4-8DC389F6270B");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0091, "2009");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0091, MyGlb.VIS_VUOTOGRASSET);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0091, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0101, "E4798C0D-AE26-4DF0-90C5-1E908723FBFB");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0101, "2010");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0101, MyGlb.VIS_VUOTOGRASSET);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0101, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_LABEL, "012F9C4F-A8DD-48A3-B1C4-8DE0F5802C3E");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_LABEL, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_LABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, "E8DB043A-6FEB-4E71-AAEB-2FFB1E8C79F8");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, "Entrate  ");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, "F0256D91-9341-462D-B0DF-F53B9B6756BE");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, "Spese  ");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, "DF2E9CC2-4ECB-4B55-8D57-44803EC636DE");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, "Var E Negative 2");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, "495692D4-7847-4FAE-B577-5D045A56606A");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, "Var E Positive 2");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, "E0F00905-C274-4412-8554-AEBFFB2DCD59");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, "Var E Negative 3");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, "5C63F18F-F5AE-49DC-9F1F-76585C0EBDCC");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, "Var E Positive 3");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, "E5FB86F7-1E01-4693-9EFE-822ECC7BA066");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, "Positive");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, "310663FB-0C27-46BC-AE10-A3FD848478BA");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, "Negative ");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, "49AD7573-4CC0-4D24-9AB5-844F5CE62144");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, "Var S Positive 2");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, "7D2FC1C0-0206-4F14-AF80-19AB3DCBF6C1");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, "Var S Negative 2");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, "160B1BC6-165D-4244-96C1-769E85322386");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, "Var S Positive 3");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, "A6043EEE-2AD4-4D71-B179-9738F33BF1AF");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, "Var S Negative 3");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, "");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_QUADRATLABEL, "C1732673-2AC0-4785-87B1-AFBB0A40F633");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_QUADRATLABEL, "Quadratura");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_QUADRATLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_QUADRATLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOTALESCRIT1, "0F61FDA2-9477-4887-8AF7-36D9483EED48");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOTALESCRIT1, "Quadratura");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOTALESCRIT1, MyGlb.VIS_VUOTONORMALE);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOTALESCRIT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, "64F1AF03-3087-477B-A50B-049EAD90A552");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, "Tot1");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, "Quadratura");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, "22F99A62-1D0E-4931-AE4C-F2C6108ED462");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, "Tot 2");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, "Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 2 * If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 2), ONE, ONE, ZERO)), ZERO) + Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 2 * If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 2), -1, ONE, ZERO)), ZERO)");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, "C17C8FFE-9E6F-4F49-915E-97530AC0D7B4");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, "Tot 3");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, "Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 3 * If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 3), ONE, ONE, ZERO)), ZERO) + Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 3 * If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 3), -1, ONE, ZERO)), ZERO)");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, "94F1B47B-28BE-4207-91FC-9C31D612F819");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, "Tot 4");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, "Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 1 * If Equal (POL PROPOSTE VAR DETT E S, S, ZERO, ONE)), ZERO) + Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 1 * If Equal (POL PROPOSTE VAR DETT E S, E, ZERO, ONE)), ZERO)");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, "A8FFF49D-880C-4708-84F9-1BFDEA5BA056");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, "Tot 5");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, "Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 2 * If Equal (POL PROPOSTE VAR DETT E S, S, ZERO, ONE)), ZERO) + Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 2 * If Equal (POL PROPOSTE VAR DETT E S, E, ZERO, ONE)), ZERO)");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROQUADRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, "945A91F9-1F6E-4E6F-87A7-8714D14A458F");
    PAN_CONTROQUADRA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, "Tot 6");
    PAN_CONTROQUADRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, "Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 3 * If Equal (POL PROPOSTE VAR DETT E S, S, ZERO, ONE)), ZERO) + Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 3 * If Equal (POL PROPOSTE VAR DETT E S, E, ZERO, ONE)), ZERO)");
    PAN_CONTROQUADRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, MyGlb.VIS_NORFIECF4IMP);
    PAN_CONTROQUADRA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CONTROQUADRA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_008, MyGlb.PANEL_LIST, 20, 20, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_008, MyGlb.PANEL_LIST, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_008, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_008, MyGlb.PANEL_FORM, 132, 52, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_008, MyGlb.PANEL_FORM, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_008, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_008, -1, -1);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_008, -1, "", "008", 0, 0, 0, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_009, MyGlb.PANEL_LIST, 28, 28, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_009, MyGlb.PANEL_LIST, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_009, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_009, MyGlb.PANEL_FORM, 248, 52, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_009, MyGlb.PANEL_FORM, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_009, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_009, -1, -1);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_009, -1, "", "009", 0, 0, 0, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_2010, MyGlb.PANEL_LIST, 36, 36, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_2010, MyGlb.PANEL_LIST, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_2010, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_2010, MyGlb.PANEL_FORM, 368, 52, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_2010, MyGlb.PANEL_FORM, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_2010, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_2010, -1, -1);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_2010, -1, "", "2010", 0, 0, 0, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0081, MyGlb.PANEL_LIST, 28, 28, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0081, MyGlb.PANEL_LIST, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0081, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0081, MyGlb.PANEL_FORM, 132, 52, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0081, MyGlb.PANEL_FORM, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0081, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_0081, -1, -1);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_0081, -1, "", "0081", 0, 0, 0, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0091, MyGlb.PANEL_LIST, 36, 36, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0091, MyGlb.PANEL_LIST, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0091, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0091, MyGlb.PANEL_FORM, 248, 52, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0091, MyGlb.PANEL_FORM, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0091, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_0091, -1, -1);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_0091, -1, "", "0091", 0, 0, 0, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0101, MyGlb.PANEL_LIST, 44, 44, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0101, MyGlb.PANEL_LIST, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0101, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0101, MyGlb.PANEL_FORM, 368, 52, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0101, MyGlb.PANEL_FORM, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_0101, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_0101, -1, -1);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_0101, -1, "", "0101", 0, 0, 0, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_LABEL, MyGlb.PANEL_LIST, 8, 8, 476, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_LABEL, MyGlb.PANEL_FORM, 8, 8, 476, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_LABEL, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_LABEL, -1, -1);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, MyGlb.PANEL_LIST, 84);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, MyGlb.PANEL_LIST, "Entrate  ");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, MyGlb.PANEL_FORM, 4, 72, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, MyGlb.PANEL_FORM, 96);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_ENTRATE, MyGlb.PANEL_FORM, "Entrate  ");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_ENTRATE, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_ENTRATE, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_ENTRATE, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'S', 0, 1)), 0)", "RECORDENTRAT", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, MyGlb.PANEL_LIST, 88);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, MyGlb.PANEL_LIST, "Spese  ");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, MyGlb.PANEL_FORM, -4, 96, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, MyGlb.PANEL_FORM, 104);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_SPESE, MyGlb.PANEL_FORM, "Spese  ");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_SPESE, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_SPESE, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_SPESE, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'E', 0, 1)), 0)", "RECORDSPESE1", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, MyGlb.PANEL_LIST, 88);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, MyGlb.PANEL_LIST, "Var E Negative 2");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, MyGlb.PANEL_FORM, 224, 96, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, MyGlb.PANEL_FORM, 88);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV2, MyGlb.PANEL_FORM, "Var E Negat. 2");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_VARENEGATIV2, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_VARENEGATIV2, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_VARENEGATIV2, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'E', 0, 1)), 0)", "RECOVARENEG2", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, MyGlb.PANEL_LIST, 84);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, MyGlb.PANEL_LIST, "Var E Positive 2");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, MyGlb.PANEL_FORM, 224, 72, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, MyGlb.PANEL_FORM, 84);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV2, MyGlb.PANEL_FORM, "Var E Posit. 2");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_VAREPOSITIV2, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_VAREPOSITIV2, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_VAREPOSITIV2, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'S', 0, 1)), 0)", "RECOVAREPOS2", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, MyGlb.PANEL_LIST, 88);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, MyGlb.PANEL_LIST, "Var E Negative 3");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, MyGlb.PANEL_FORM, 340, 96, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, MyGlb.PANEL_FORM, 88);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARENEGATIV3, MyGlb.PANEL_FORM, "Var E Negat. 3");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_VARENEGATIV3, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_VARENEGATIV3, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_VARENEGATIV3, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'E', 0, 1)), 0)", "RECOVARENEG3", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, MyGlb.PANEL_LIST, 84);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, MyGlb.PANEL_LIST, "Var E Positive 3");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, MyGlb.PANEL_FORM, 340, 72, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, MyGlb.PANEL_FORM, 84);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VAREPOSITIV3, MyGlb.PANEL_FORM, "Var E Posit. 3");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_VAREPOSITIV3, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_VAREPOSITIV3, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_VAREPOSITIV3, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'S', 0, 1)), 0)", "RECOVAREPOS3", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, MyGlb.PANEL_LIST, 84);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, MyGlb.PANEL_LIST, "Positive");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, MyGlb.PANEL_FORM, 0, 72, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, MyGlb.PANEL_FORM, 100);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_POSITIVE, MyGlb.PANEL_FORM, "Positive");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_POSITIVE, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_POSITIVE, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_POSITIVE, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_1 * DECODE(SIGN(A.IMPORTO_1), 1, 1, 0)), 0)", "RECORDPOSITI", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, MyGlb.PANEL_LIST, 88);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, MyGlb.PANEL_LIST, "Negative ");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, MyGlb.PANEL_FORM, -4, 96, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, MyGlb.PANEL_FORM, 104);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_NEGATIVE, MyGlb.PANEL_FORM, "Negative ");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_NEGATIVE, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_NEGATIVE, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_NEGATIVE, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_1 * DECODE(SIGN(A.IMPORTO_1), -1, 1, 0)), 0)", "RECORDNEGATI", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, MyGlb.PANEL_LIST, 84);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, MyGlb.PANEL_LIST, "Var S Positive 2");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, MyGlb.PANEL_FORM, 224, 72, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, MyGlb.PANEL_FORM, 84);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV2, MyGlb.PANEL_FORM, "Var S Posit. 2");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_VARSPOSITIV2, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_VARSPOSITIV2, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_VARSPOSITIV2, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_2 * DECODE(SIGN(A.IMPORTO_2), 1, 1, 0)), 0)", "RECOVARSPOS2", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, MyGlb.PANEL_LIST, 88);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, MyGlb.PANEL_LIST, "Var S Negative 2");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, MyGlb.PANEL_FORM, 224, 96, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, MyGlb.PANEL_FORM, 88);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV2, MyGlb.PANEL_FORM, "Var S Negat. 2");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_VARSNEGATIV2, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_VARSNEGATIV2, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_VARSNEGATIV2, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_2 * DECODE(SIGN(A.IMPORTO_2), -1, 1, 0)), 0)", "RECOVARSNEG2", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, MyGlb.PANEL_LIST, 84);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, MyGlb.PANEL_LIST, "Var S Positive 3");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, MyGlb.PANEL_FORM, 340, 72, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, MyGlb.PANEL_FORM, 84);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSPOSITIV3, MyGlb.PANEL_FORM, "Var S Posit. 3");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_VARSPOSITIV3, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_VARSPOSITIV3, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_VARSPOSITIV3, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_3 * DECODE(SIGN(A.IMPORTO_3), 1, 1, 0)), 0)", "RECOVARSPOS3", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, MyGlb.PANEL_LIST, 88);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, MyGlb.PANEL_LIST, "Var S Negative 3");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, MyGlb.PANEL_FORM, 340, 96, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, MyGlb.PANEL_FORM, 88);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_VARSNEGATIV3, MyGlb.PANEL_FORM, "Var S Negat. 3");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_VARSNEGATIV3, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_VARSNEGATIV3, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_VARSNEGATIV3, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_3 * DECODE(SIGN(A.IMPORTO_3), -1, 1, 0)), 0)", "RECOVARSNEG3", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_QUADRATLABEL, MyGlb.PANEL_LIST, 48, 152, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_QUADRATLABEL, MyGlb.PANEL_LIST, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_QUADRATLABEL, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_QUADRATLABEL, MyGlb.PANEL_FORM, 36, 120, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_QUADRATLABEL, MyGlb.PANEL_FORM, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_QUADRATLABEL, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_QUADRATLABEL, -1, -1);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_QUADRATLABEL, -1, "", "QUADRATLABEL", 0, 0, 0, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOTALESCRIT1, MyGlb.PANEL_LIST, 56, 160, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOTALESCRIT1, MyGlb.PANEL_LIST, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOTALESCRIT1, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOTALESCRIT1, MyGlb.PANEL_FORM, 32, 120, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOTALESCRIT1, MyGlb.PANEL_FORM, 0);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOTALESCRIT1, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_TOTALESCRIT1, -1, -1);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_TOTALESCRIT1, -1, "", "TOTALESCRIT1", 0, 0, 0, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, MyGlb.PANEL_LIST, 32);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, MyGlb.PANEL_LIST, "Tot1");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, MyGlb.PANEL_FORM, 104, 120, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, MyGlb.PANEL_FORM, 32);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT1, MyGlb.PANEL_FORM, "Tot1");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_TOT1, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_TOT1, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_TOT1, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_1 * DECODE(SIGN(A.IMPORTO_1), 1, 1, 0)), 0) + NVL(SUM(A.IMPORTO_1 * DECODE(SIGN(A.IMPORTO_1), -1, 1, 0)), 0)", "RECORDTOT1", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, MyGlb.PANEL_LIST, 36);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, MyGlb.PANEL_LIST, "Tot 2");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, MyGlb.PANEL_FORM, 224, 120, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, MyGlb.PANEL_FORM, 36);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT2, MyGlb.PANEL_FORM, "Tot 2");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_TOT2, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_TOT2, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_TOT2, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_2 * DECODE(SIGN(A.IMPORTO_2), 1, 1, 0)), 0) + NVL(SUM(A.IMPORTO_2 * DECODE(SIGN(A.IMPORTO_2), -1, 1, 0)), 0)", "RECORDTOT2", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, MyGlb.PANEL_LIST, 36);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, MyGlb.PANEL_LIST, "Tot 3");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, MyGlb.PANEL_FORM, 340, 120, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, MyGlb.PANEL_FORM, 36);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT3, MyGlb.PANEL_FORM, "Tot 3");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_TOT3, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_TOT3, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_TOT3, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_3 * DECODE(SIGN(A.IMPORTO_3), 1, 1, 0)), 0) + NVL(SUM(A.IMPORTO_3 * DECODE(SIGN(A.IMPORTO_3), -1, 1, 0)), 0)", "RECORDTOT3", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, MyGlb.PANEL_LIST, 36);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, MyGlb.PANEL_LIST, "Tot 4");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, MyGlb.PANEL_FORM, 104, 120, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, MyGlb.PANEL_FORM, 36);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT4, MyGlb.PANEL_FORM, "Tot 4");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_TOT4, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_TOT4, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_TOT4, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'S', 0, 1)), 0) + NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'E', 0, 1)), 0)", "RECORDTOT4", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, MyGlb.PANEL_LIST, 36);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, MyGlb.PANEL_LIST, "Tot 5");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, MyGlb.PANEL_FORM, 224, 120, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, MyGlb.PANEL_FORM, 36);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT5, MyGlb.PANEL_FORM, "Tot 5");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_TOT5, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_TOT5, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_TOT5, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'S', 0, 1)), 0) + NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'E', 0, 1)), 0)", "RECORDTOT5", 3, 28, 6, -13997);
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, MyGlb.PANEL_LIST, 36);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, MyGlb.PANEL_LIST, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, MyGlb.PANEL_LIST, "Tot 6");
    PAN_CONTROQUADRA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, MyGlb.PANEL_FORM, 340, 120, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROQUADRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, MyGlb.PANEL_FORM, 36);
    PAN_CONTROQUADRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, MyGlb.PANEL_FORM, 1);
    PAN_CONTROQUADRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROQUADRA_TOT6, MyGlb.PANEL_FORM, "Tot 6");
    PAN_CONTROQUADRA.SetFieldPage(PFL_CONTROQUADRA_TOT6, -1, -1);
    PAN_CONTROQUADRA.SetFieldUnbound(PFL_CONTROQUADRA_TOT6, true);
    PAN_CONTROQUADRA.SetFieldPanel(PFL_CONTROQUADRA_TOT6, PPQRY_POLTOTPROPOS, "NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'S', 0, 1)), 0) + NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'E', 0, 1)), 0)", "RECORDTOT6", 3, 28, 6, -13997);
  }

  private void PAN_CONTROQUADRA_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTROQUADRA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONTROQUADRA.SetIMDB(IMDB, "PQRY_POLTOTPROPOS", true);
    PAN_CONTROQUADRA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'E', 0, 1)), 0) as RECORDSPESE1, ");
    SQL.append("  NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'S', 0, 1)), 0) as RECORDENTRAT, ");
    SQL.append("  NVL(SUM(A.IMPORTO_1 * DECODE(SIGN(A.IMPORTO_1), -1, 1, 0)), 0) as RECORDNEGATI, ");
    SQL.append("  NVL(SUM(A.IMPORTO_1 * DECODE(SIGN(A.IMPORTO_1), 1, 1, 0)), 0) as RECORDPOSITI, ");
    SQL.append("  NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'E', 0, 1)), 0) as RECOVARENEG2, ");
    SQL.append("  NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'S', 0, 1)), 0) as RECOVAREPOS2, ");
    SQL.append("  NVL(SUM(A.IMPORTO_2 * DECODE(SIGN(A.IMPORTO_2), -1, 1, 0)), 0) as RECOVARSNEG2, ");
    SQL.append("  NVL(SUM(A.IMPORTO_2 * DECODE(SIGN(A.IMPORTO_2), 1, 1, 0)), 0) as RECOVARSPOS2, ");
    SQL.append("  NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'E', 0, 1)), 0) as RECOVARENEG3, ");
    SQL.append("  NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'S', 0, 1)), 0) as RECOVAREPOS3, ");
    SQL.append("  NVL(SUM(A.IMPORTO_3 * DECODE(SIGN(A.IMPORTO_3), -1, 1, 0)), 0) as RECOVARSNEG3, ");
    SQL.append("  NVL(SUM(A.IMPORTO_3 * DECODE(SIGN(A.IMPORTO_3), 1, 1, 0)), 0) as RECOVARSPOS3, ");
    SQL.append("  NVL(SUM(A.IMPORTO_1 * DECODE(SIGN(A.IMPORTO_1), 1, 1, 0)), 0) + NVL(SUM(A.IMPORTO_1 * DECODE(SIGN(A.IMPORTO_1), -1, 1, 0)), 0) as RECORDTOT1, ");
    SQL.append("  NVL(SUM(A.IMPORTO_2 * DECODE(SIGN(A.IMPORTO_2), 1, 1, 0)), 0) + NVL(SUM(A.IMPORTO_2 * DECODE(SIGN(A.IMPORTO_2), -1, 1, 0)), 0) as RECORDTOT2, ");
    SQL.append("  NVL(SUM(A.IMPORTO_3 * DECODE(SIGN(A.IMPORTO_3), 1, 1, 0)), 0) + NVL(SUM(A.IMPORTO_3 * DECODE(SIGN(A.IMPORTO_3), -1, 1, 0)), 0) as RECORDTOT3, ");
    SQL.append("  NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'S', 0, 1)), 0) + NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'E', 0, 1)), 0) as RECORDTOT4, ");
    SQL.append("  NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'S', 0, 1)), 0) + NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'E', 0, 1)), 0) as RECORDTOT5, ");
    SQL.append("  NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'S', 0, 1)), 0) + NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'E', 0, 1)), 0) as RECORDTOT6 ");
    PAN_CONTROQUADRA.SetQuery(PPQRY_POLTOTPROPOS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT A ");
    PAN_CONTROQUADRA.SetQuery(PPQRY_POLTOTPROPOS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.BOZZA_VARIAZIONE_ID = ~~TBL_PAR67.ROWNAMBOVAID~~) ");
    SQL.append("and   (A.COD_REC = 2) ");
    SQL.append("and   (NVL(A.STATO, 'B') <> 'N') ");
    SQL.append("and   (NVL(A.STATO, 'B') = DECODE(~~TBL_PANNELLO5.ROWNAMSOLAPP~~, 'SI', 'A', NVL(A.STATO, 'B'))) ");
    SQL.append("and   (A.TIPO_VAR = ~~PQRY_PANNELLO2.ROWNAMTIPVAR~~) ");
    PAN_CONTROQUADRA.SetQuery(PPQRY_POLTOTPROPOS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTROQUADRA.SetQuery(PPQRY_POLTOTPROPOS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTROQUADRA.SetQuery(PPQRY_POLTOTPROPOS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTROQUADRA.SetQuery(PPQRY_POLTOTPROPOS, 5, SQL, -1, "");
    PAN_CONTROQUADRA.SetQueryDB(PPQRY_POLTOTPROPOS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTROQUADRA.SetMasterTable(0, "POL_PROPOSTE_VAR_DETT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTROQUADRA.Status() == 2)
    {
      int oldListQBE = PAN_CONTROQUADRA.iUseListQBE;
      PAN_CONTROQUADRA.iUseListQBE = 0;
      PAN_CONTROQUADRA.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTROQUADRA.PanelCommand(Glb.PCM_FIND);
      PAN_CONTROQUADRA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PANNELLO_Init()
  {

    PAN_PANNELLO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANNELLO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANNELLO.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, "5203E7BC-286C-4D5E-804C-5DBB1BDBBF20");
    PAN_PANNELLO.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, "Solo Approvate");
    PAN_PANNELLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, "");
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.VIS_CHECKSTYLE);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, "144A09D5-A6D6-4989-BEEA-4B5D416B23A6");
    PAN_PANNELLO.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, "Tipo Variazione");
    PAN_PANNELLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, "");
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, "65AC4F1E-0B35-4D23-8130-8B4A1409DF2A");
    PAN_PANNELLO.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, "Tipo Quadratura");
    PAN_PANNELLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, "");
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, MyGlb.VIS_OPTIONBUTTON);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PANNELLO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_LIST, 84);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_LIST, "Sl. Appr.");
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_FORM, 12, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_FORM, 104);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_FORM, "Solo Approvate");
    PAN_PANNELLO.SetFieldPage(PFL_PANNELLO_SOLOAPPROVAT, -1, -1);
    PAN_PANNELLO.SetFieldPanel(PFL_PANNELLO_SOLOAPPROVAT, PPQRY_PANNELLO2, "A.ROWNAMSOLAPP", "ROWNAMSOLAPP", 5, 2, 0, -13997);
    PAN_PANNELLO.SetValueListItem(PFL_PANNELLO_SOLOAPPROVAT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PANNELLO.SetValueListItem(PFL_PANNELLO_SOLOAPPROVAT, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tp. Var.");
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, MyGlb.PANEL_FORM, 16, 28, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, MyGlb.PANEL_FORM, 100);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_PANNELLO.SetFieldPage(PFL_PANNELLO_TIPOVARIAZIO, -1, -1);
    PAN_PANNELLO.SetFieldPanel(PFL_PANNELLO_TIPOVARIAZIO, PPQRY_PANNELLO2, "A.ROWNAMTIPVAR", "ROWNAMTIPVAR", 1, 2, 0, -13997);
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, MyGlb.PANEL_LIST, 80, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, MyGlb.PANEL_LIST, 88);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, MyGlb.PANEL_LIST, "Tipo Quadratura");
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, MyGlb.PANEL_FORM, 8, 52, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, MyGlb.PANEL_FORM, 108);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLO_TIPOQUADRATU, MyGlb.PANEL_FORM, "Tipo Quadratura");
    PAN_PANNELLO.SetFieldPage(PFL_PANNELLO_TIPOQUADRATU, -1, -1);
    PAN_PANNELLO.SetFieldPanel(PFL_PANNELLO_TIPOQUADRATU, PPQRY_PANNELLO2, "A.ROWNAMTIPQUA", "ROWNAMTIPQUA", 5, 2, 0, -13997);
    PAN_PANNELLO.SetValueListItem(PFL_PANNELLO_TIPOQUADRATU, (new IDVariant("ES")), "Entrate/Spese", "", "", -1);
    PAN_PANNELLO.SetValueListItem(PFL_PANNELLO_TIPOQUADRATU, (new IDVariant("PN")), "Positive/Negative", "", "", -1);
  }

  private void PAN_PANNELLO_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANNELLO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPVAR~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PANNELLO.SetQuery(PPQRY_T54, 0, SQL, PFL_PANNELLO_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PANNELLO.SetQuery(PPQRY_T54, 1, SQL, PFL_PANNELLO_TIPOVARIAZIO, "");
    PAN_PANNELLO.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PANNELLO.SetIMDB(IMDB, "PQRY_PANNELLO2", true);
    PAN_PANNELLO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PANNELLO.SetQueryIMDB(PPQRY_PANNELLO2, IMDBDef12.PQRY_PANNELLO2_RS, IMDBDef3.TBL_PANNELLO5);
    JustLoaded = true;
    PAN_PANNELLO.SetFieldPrimaryIndex(PFL_PANNELLO_SOLOAPPROVAT, IMDBDef3.FLD_PANNELLO5_ROWNAMSOLAPP);
    PAN_PANNELLO.SetFieldPrimaryIndex(PFL_PANNELLO_TIPOVARIAZIO, IMDBDef3.FLD_PANNELLO5_ROWNAMTIPVAR);
    PAN_PANNELLO.SetFieldPrimaryIndex(PFL_PANNELLO_TIPOQUADRATU, IMDBDef3.FLD_PANNELLO5_ROWNAMTIPQUA);
    PAN_PANNELLO.SetMasterTable(0, "PANNELLO5");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANNELLO.Status() == 2)
    {
      int oldListQBE = PAN_PANNELLO.iUseListQBE;
      PAN_PANNELLO.iUseListQBE = 0;
      PAN_PANNELLO.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANNELLO.PanelCommand(Glb.PCM_FIND);
      PAN_PANNELLO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONTROQUADRA) PAN_CONTROQUADRA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTROQUADRA) PAN_CONTROQUADRA_ValidateRow(Cancel);
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTROQUADRA) PAN_CONTROQUADRA_DynamicProperties();
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTROQUADRA) PAN_CONTROQUADRA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONTROQUADRA) PAN_CONTROQUADRA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
