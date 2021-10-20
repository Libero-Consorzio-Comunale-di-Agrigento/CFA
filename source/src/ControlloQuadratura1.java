// **********************************************
// Controllo Quadratura 1
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloQuadratura1 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_SOLOPROPAPPR = 0;
  private static int PFL_PARAM_TIPOLOVARIAZ = 1;

  private static int PPQRY_PARAM110 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_PARAM;
  private static int PFL_QUADRATURA_STORNI1 = 0;
  private static int PFL_QUADRATURA_IMP2 = 1;
  private static int PFL_QUADRATURA_IMP3 = 2;
  private static int PFL_QUADRATURA_STORNI = 3;
  private static int PFL_QUADRATURA_IMP2N = 4;
  private static int PFL_QUADRATURA_IMP3N = 5;
  private static int PFL_QUADRATURA_QUADRATURA = 6;
  private static int PFL_QUADRATURA_Q2 = 7;
  private static int PFL_QUADRATURA_Q3 = 8;
  private static int PFL_QUADRATURA_ETICLABEESE1 = 9;
  private static int PFL_QUADRATURA_ETICLABEESE2 = 10;
  private static int PFL_QUADRATURA_ETICLABEESE3 = 11;

  private static int PPQRY_PROPOSTEVB = 0;


  IDPanel PAN_QUADRATURA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM114(IMDB);
    Init_TBL_QUADRATURA(IMDB);
    //
    //
    Init_PQRY_PARAM110(IMDB);
    Init_PQRY_PARAM110_RS(IMDB);
    Init_PQRY_PROPOSTEVB(IMDB);
    Init_PQRY_PROPOSTEVB_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM114(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAM114, 3);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAM114, "TBL_PARAM114");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM114,IMDBDef7.FLD_PARAM114_NOMOGGSOPRAP, "NOMOGGSOPRAP");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM114,IMDBDef7.FLD_PARAM114_NOMOGGSOPRAP,5,52,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM114,IMDBDef7.FLD_PARAM114_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM114,IMDBDef7.FLD_PARAM114_NOMOGGTIPVAR,5,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM114,IMDBDef7.FLD_PARAM114_NOMEOGGEASSE, "NOMEOGGEASSE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM114,IMDBDef7.FLD_PARAM114_NOMEOGGEASSE,1,2,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAM114, 0);
  }

  private static void Init_TBL_QUADRATURA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_QUADRATURA, 6);
    IMDB.set_TblCode(IMDBDef7.TBL_QUADRATURA, "TBL_QUADRATURA");
    IMDB.set_FldCode(IMDBDef7.TBL_QUADRATURA,IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP4, "NOMEOGGEIMP4");
    IMDB.SetFldParams(IMDBDef7.TBL_QUADRATURA,IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP4,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_QUADRATURA,IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP5, "NOMEOGGEIMP5");
    IMDB.SetFldParams(IMDBDef7.TBL_QUADRATURA,IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP5,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_QUADRATURA,IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP6, "NOMEOGGEIMP6");
    IMDB.SetFldParams(IMDBDef7.TBL_QUADRATURA,IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP6,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_QUADRATURA,IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP1, "NOMEOGGEIMP1");
    IMDB.SetFldParams(IMDBDef7.TBL_QUADRATURA,IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP1,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_QUADRATURA,IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP2, "NOMEOGGEIMP2");
    IMDB.SetFldParams(IMDBDef7.TBL_QUADRATURA,IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP2,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_QUADRATURA,IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP3, "NOMEOGGEIMP3");
    IMDB.SetFldParams(IMDBDef7.TBL_QUADRATURA,IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP3,3,14,2);
    IMDB.TblAddNew(IMDBDef7.TBL_QUADRATURA, 0);
  }

  private static void Init_PQRY_PARAM110(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAM110, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAM110, "PQRY_PARAM110");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM110,IMDBDef17.PQSL_PARAM110_NOMOGGSOPRAP, "NOMOGGSOPRAP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM110,IMDBDef17.PQSL_PARAM110_NOMOGGSOPRAP,5,52,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM110,IMDBDef17.PQSL_PARAM110_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM110,IMDBDef17.PQSL_PARAM110_NOMOGGTIPVAR,5,1,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAM110, 0);
  }

  private static void Init_PQRY_PARAM110_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAM110_RS, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAM110_RS, "PQRY_PARAM110_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM110_RS,IMDBDef17.PQSL_PARAM110_NOMOGGSOPRAP, "NOMOGGSOPRAP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM110_RS,IMDBDef17.PQSL_PARAM110_NOMOGGSOPRAP,5,52,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM110_RS,IMDBDef17.PQSL_PARAM110_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM110_RS,IMDBDef17.PQSL_PARAM110_NOMOGGTIPVAR,5,1,0);
  }

  private static void Init_PQRY_PROPOSTEVB(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PROPOSTEVB, 9);
    IMDB.set_TblCode(IMDBDef17.PQRY_PROPOSTEVB, "PQRY_PROPOSTEVB");
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP4, "NOMEOGGEIMP4");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP4,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP5, "NOMEOGGEIMP5");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP5,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP6, "NOMEOGGEIMP6");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP6,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP1, "NOMEOGGEIMP1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP1,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP2, "NOMEOGGEIMP2");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP2,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP3, "NOMEOGGEIMP3");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP3,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_QUADRATURA, "QUADRATURA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_QUADRATURA,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_Q2, "Q2");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_Q2,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_Q3, "Q3");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB,IMDBDef17.PQSL_PROPOSTEVB_Q3,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_PROPOSTEVB, 0);
  }

  private static void Init_PQRY_PROPOSTEVB_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PROPOSTEVB_RS, 9);
    IMDB.set_TblCode(IMDBDef17.PQRY_PROPOSTEVB_RS, "PQRY_PROPOSTEVB_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP4, "NOMEOGGEIMP4");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP4,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP5, "NOMEOGGEIMP5");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP5,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP6, "NOMEOGGEIMP6");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP6,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP1, "NOMEOGGEIMP1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP1,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP2, "NOMEOGGEIMP2");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP2,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP3, "NOMEOGGEIMP3");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_NOMEOGGEIMP3,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_QUADRATURA, "QUADRATURA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_QUADRATURA,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_Q2, "Q2");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_Q2,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_Q3, "Q3");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB_RS,IMDBDef17.PQSL_PROPOSTEVB_Q3,3,28,6);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloQuadratura1(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloQuadratura1()
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
    FormIdx = MyGlb.FRM_CONTROQUADR1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7D675100-A1F1-4238-A51E-C782FE230C09";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 492;
    DesignHeight = 206;
    set_Caption(new IDVariant("Controllo Quadratura 1"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 492;
    Frames[1].Height = 180;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.222222;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 492;
    Frames[2].Height = 40;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 40;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 492-MyGlb.PAN_OFFS_X, 40-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A95DBCF9-30F4-43AE-A061-DBF2F833768E");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 88, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 492;
    Frames[3].Height = 140;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Quadratura";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 140;
    PAN_QUADRATURA = new IDPanel(w, this, 3, "PAN_QUADRATURA");
    Frames[3].Content = PAN_QUADRATURA;
    PAN_QUADRATURA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_QUADRATURA.VS = MainFrm.VisualStyleList;
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 492-MyGlb.PAN_OFFS_X, 140-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C956E648-C4AC-4699-93D1-E05BE617B0D8");
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 924, 296, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_QUADRATURA.InitStatus = 2;
    PAN_QUADRATURA_Init();
    PAN_QUADRATURA_InitFields();
    PAN_QUADRATURA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAM114, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTROQUADR1_PARAM110();
      }
      if (IMDB.TblModified(IMDBDef7.TBL_QUADRATURA, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTROQUADR1_PROPOSTEVB();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_QUADRATURA.UpdatePanel(MainFrm);
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
    return (obj instanceof ControlloQuadratura1);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloQuadratura1.class.getName() : (Glb.ClassWithPackage(ControlloQuadratura1.class) ? ControlloQuadratura1.class.getName().substring(ControlloQuadratura1.class.getPackage().getName().length() + 1) : ControlloQuadratura1.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
      // 
      // Param On Validate Row Body
      // Corpo Procedura
      // 
      RiempiIMDB();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadratura1", "ParamOnValidateRow", _e);
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
      IMDB.set_Value(IMDBDef7.TBL_PARAM114, IMDBDef7.FLD_PARAM114_NOMOGGSOPRAP, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef7.TBL_PARAM114, IMDBDef7.FLD_PARAM114_NOMOGGTIPVAR, 0, (new IDVariant("E")));
      RiempiIMDB();
      PAN_QUADRATURA.set_Header(Glb.OBJ_FIELD,PFL_QUADRATURA_ETICLABEESE1, IDL.Add((new IDVariant("Esercizio ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_QUADRATURA.set_Header(Glb.OBJ_FIELD,PFL_QUADRATURA_ETICLABEESE2, IDL.Add((new IDVariant("Esercizio ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_QUADRATURA.set_Header(Glb.OBJ_FIELD,PFL_QUADRATURA_ETICLABEESE3, IDL.Add((new IDVariant("Esercizio ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
      set_Caption((new IDVariant("Controllo Quadratura")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadratura1", "Load", _e);
    }
  }

  // **********************************************************************
  // Param Solo Proposte Approvate Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAM_SOLOPROPAPPR_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Solo Proposte Approvate Validate Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  PROPOSTE_VB A, ");
      SQL.append("  T54 B ");
      SQL.append("where (B.CODICE = A.TIPO_VAR) ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ASSESTAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PARAM156, IMDBDef17.PQSL_PARAM156_NOMEOGGECODI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PARAM110, IMDBDef17.PQSL_PARAM110_NOMOGGSOPRAP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI' AND A.STATO = 'A') OR (" + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PARAM110, IMDBDef17.PQSL_PARAM110_NOMOGGSOPRAP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'NO' AND NVL(A.STATO, '-1') <> 'N')) ");
      SQL.append("and   ((B.TIPOLOGIA IS NULL)) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        MainFrm.set_AlertMessage((new IDVariant("Attenzione: sulle proposte sono presenti tipi variazione che non hanno l'indicazione del Tipo nel relativo dizionario"))); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadratura1", "ParamSoloProposteApprovateValidate", _e);
    }
  }

  // **********************************************************************
  // Quadratura On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_QUADRATURA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_QUADRATURA);
      // 
      // Quadratura On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_PARAM110, IMDBDef17.PQSL_PARAM110_NOMOGGTIPVAR, 0).equals((new IDVariant("V")), true))
      {
        PAN_QUADRATURA.set_Header(Glb.OBJ_FIELD,PFL_QUADRATURA_STORNI1, (new IDVariant("Entrata")).stringValue());
        PAN_QUADRATURA.set_Header(Glb.OBJ_FIELD,PFL_QUADRATURA_STORNI, (new IDVariant("Spesa")).stringValue());
      }
      else
      {
        PAN_QUADRATURA.set_Header(Glb.OBJ_FIELD,PFL_QUADRATURA_STORNI1, (new IDVariant("Storni +")).stringValue());
        PAN_QUADRATURA.set_Header(Glb.OBJ_FIELD,PFL_QUADRATURA_STORNI, (new IDVariant("Storni -")).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadratura1", "QuadraturaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RiempiIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi IMDB Body
      // Corpo Procedura
      // 
      RIEMPIIMDB_QUADRADELETE();
      if (IMDB.Value(IMDBDef17.PQRY_PARAM110, IMDBDef17.PQSL_PARAM110_NOMOGGTIPVAR, 0).compareTo((new IDVariant("V")), true)!=0)
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, 0, NVL(A.IMPORTO_1, 0))) as SIESNVPVI101, ");
        SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, 0, NVL(A.IMPORTO_2, 0))) as SIESNVPVI201, ");
        SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, 0, NVL(A.IMPORTO_3, 0))) as SIESNVPVI301, ");
        SQL.append("  ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, NVL(A.IMPORTO_1, 0), 0))) as ASIESNVPVI10, ");
        SQL.append("  ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, NVL(A.IMPORTO_2, 0), 0))) as ASIESNVPVI20, ");
        SQL.append("  ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, NVL(A.IMPORTO_3, 0), 0))) as ASIESNVPVI30 ");
        SQL.append("from ");
        SQL.append("  PROPOSTE_VB A, ");
        SQL.append("  T54 B ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ASSESTAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAM114, IMDBDef7.FLD_PARAM114_NOMEOGGEASSE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PARAM110, IMDBDef17.PQSL_PARAM110_NOMOGGTIPVAR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO = 2) ");
        SQL.append("and   (NVL(A.STATO, '-1') <> 'N') ");
        SQL.append("and   (NVL(A.STATO, '-1') = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PARAM110, IMDBDef17.PQSL_PARAM110_NOMOGGSOPRAP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'SI', 'A', NVL(A.STATO, '-1'))) ");
        SQL.append("and   (A.TIPO_VAR = B.CODICE(+)) ");
        SQL.append("and   (B.TIPOLOGIA = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PARAM110, IMDBDef17.PQSL_PARAM110_NOMOGGTIPVAR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'E', 'SE', 'SS')) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP4, 0, QV.Get("SIESNVPVI101", IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP5, 0, QV.Get("SIESNVPVI201", IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP6, 0, QV.Get("SIESNVPVI301", IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP1, 0, QV.Get("ASIESNVPVI10", IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP2, 0, QV.Get("ASIESNVPVI20", IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP3, 0, QV.Get("ASIESNVPVI30", IDVariant.DECIMAL));
        }
        QV.Close();
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAM110, IMDBDef17.PQSL_PARAM110_NOMOGGTIPVAR, 0).equals((new IDVariant("V")), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  SUM(NVL(A.IMPORTO_1, 0)) as SUNUVAPRVI10, ");
        SQL.append("  SUM(NVL(A.IMPORTO_2, 0)) as SUNUVAPRVI20, ");
        SQL.append("  SUM(NVL(A.IMPORTO_3, 0)) as SUNUVAPRVI30 ");
        SQL.append("from ");
        SQL.append("  PROPOSTE_VB A, ");
        SQL.append("  T54 B ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ASSESTAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAM114, IMDBDef7.FLD_PARAM114_NOMEOGGEASSE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = 'S') ");
        SQL.append("and   (A.TIPO = 2) ");
        SQL.append("and   (NVL(A.STATO, '-1') <> 'N') ");
        SQL.append("and   (NVL(A.STATO, '-1') = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PARAM110, IMDBDef17.PQSL_PARAM110_NOMOGGSOPRAP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'SI', 'A', NVL(A.STATO, '-1'))) ");
        SQL.append("and   (A.TIPO_VAR = B.CODICE(+)) ");
        SQL.append("and   (B.TIPOLOGIA = 'V') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP1, 0, QV.Get("SUNUVAPRVI10", IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP2, 0, QV.Get("SUNUVAPRVI20", IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP3, 0, QV.Get("SUNUVAPRVI30", IDVariant.DECIMAL));
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  SUM(NVL(A.IMPORTO_1, 0)) as SUNUVAPRVI10, ");
        SQL.append("  SUM(NVL(A.IMPORTO_2, 0)) as SUNUVAPRVI20, ");
        SQL.append("  SUM(NVL(A.IMPORTO_3, 0)) as SUNUVAPRVI30 ");
        SQL.append("from ");
        SQL.append("  PROPOSTE_VB A, ");
        SQL.append("  T54 B ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ASSESTAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAM114, IMDBDef7.FLD_PARAM114_NOMEOGGEASSE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = 'E') ");
        SQL.append("and   (A.TIPO = 2) ");
        SQL.append("and   (NVL(A.STATO, '-1') <> 'N') ");
        SQL.append("and   (NVL(A.STATO, '-1') = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PARAM110, IMDBDef17.PQSL_PARAM110_NOMOGGSOPRAP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'SI', 'A', NVL(A.STATO, '-1'))) ");
        SQL.append("and   (A.TIPO_VAR = B.CODICE(+)) ");
        SQL.append("and   (B.TIPOLOGIA = 'V') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP4, 0, QV.Get("SUNUVAPRVI10", IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP5, 0, QV.Get("SUNUVAPRVI20", IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP6, 0, QV.Get("SUNUVAPRVI30", IDVariant.DECIMAL));
        }
        QV.Close();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloQuadratura1", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Quadratura: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_QUADRADELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP4, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP5, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP6, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP2, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP3, 0, new IDVariant());
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CONTROQUADR1_PARAM110() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAM110_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAM114, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAM114, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAM110_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAM110_RS, 0, IMDBDef7.TBL_PARAM114, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM110_RS, 0, 0, IMDBDef7.TBL_PARAM114, IMDBDef7.FLD_PARAM114_NOMOGGSOPRAP, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM110_RS, 1, 0, IMDBDef7.TBL_PARAM114, IMDBDef7.FLD_PARAM114_NOMOGGTIPVAR, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAM114, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAM114, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAM114, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAM110_RS, 0);
  }

  // **********************************************************************
  // PROPOSTE VB
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CONTROQUADR1_PROPOSTEVB() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PROPOSTEVB_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_QUADRATURA, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_QUADRATURA, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PROPOSTEVB_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PROPOSTEVB_RS, 0, IMDBDef7.TBL_QUADRATURA, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PROPOSTEVB_RS, 0, 0, IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP4, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PROPOSTEVB_RS, 1, 0, IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP5, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PROPOSTEVB_RS, 2, 0, IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP6, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PROPOSTEVB_RS, 3, 0, IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP1, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PROPOSTEVB_RS, 4, 0, IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP2, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PROPOSTEVB_RS, 5, 0, IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP3, 0);
      IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB_RS, 6, 0, IDL.Abs(IDL.Sub(IMDB.Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP4, 0), IMDB.Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP1, 0))));
      IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB_RS, 7, 0, IDL.Abs(IDL.Sub(IMDB.Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP5, 0), IMDB.Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP2, 0))));
      IMDB.set_Value(IMDBDef17.PQRY_PROPOSTEVB_RS, 8, 0, IDL.Abs(IDL.Sub(IMDB.Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP6, 0), IMDB.Value(IMDBDef7.TBL_QUADRATURA, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP3, 0))));
      IMDB.TblMoveNext(IMDBDef7.TBL_QUADRATURA, 0);
      if (IMDB.Eof(IMDBDef7.TBL_QUADRATURA, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_QUADRATURA, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PROPOSTEVB_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
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
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_SOLOPROPAPPR)
      {
        PFL_PARAM_SOLOPROPAPPR_ValidateCell(Cancel);
      }
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_QUADRATURA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_QUADRATURA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_QUADRATURA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_QUADRATURA, Cancel);
    // Stub
  }

  private void PAN_QUADRATURA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_QUADRATURA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_QUADRATURA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_QUADRATURA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, "A2BE8F64-89DD-47C2-A0D2-8D28AFEC22AB");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, "Solo Proposte Approvate");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, "Descrivi il contenuto del campo");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, "3496C6E0-3F56-4606-8D17-1F8D82558E57");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, "Tipologia Variazione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, MyGlb.PANEL_LIST, 152);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, MyGlb.PANEL_LIST, "Sl. Prp. Appr.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, MyGlb.PANEL_FORM, 160);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOPROPAPPR, MyGlb.PANEL_FORM, "Solo Proposte Approvate");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SOLOPROPAPPR, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SOLOPROPAPPR, PPQRY_PARAM110, "A.NOMOGGSOPRAP", "NOMOGGSOPRAP", 5, 52, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SOLOPROPAPPR, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SOLOPROPAPPR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, MyGlb.PANEL_LIST, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, MyGlb.PANEL_LIST, "Tipol. Var.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, MyGlb.PANEL_FORM, 200, 4, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, MyGlb.PANEL_FORM, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOLOVARIAZ, MyGlb.PANEL_FORM, "Tipologia Variazione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOLOVARIAZ, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOLOVARIAZ, PPQRY_PARAM110, "A.NOMOGGTIPVAR", "NOMOGGTIPVAR", 5, 1, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'E' as CODICE, ");
    SQL.append("  'Storni di Entrata' as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (~~NOMOGGTIPVAR~~ = 'E') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'S', ");
    SQL.append("  'Storni di Spesa' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~NOMOGGTIPVAR~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'V', ");
    SQL.append("  'Variazioni' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where (~~NOMOGGTIPVAR~~ = 'V') ");
    PAN_PARAM.SetQuery(PPQRY_DUAL, 0, SQL, PFL_PARAM_TIPOLOVARIAZ, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'E' as CODICE, ");
    SQL.append("  'Storni di Entrata' as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'S', ");
    SQL.append("  'Storni di Spesa' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'V', ");
    SQL.append("  'Variazioni' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_PARAM.SetQuery(PPQRY_DUAL, 1, SQL, PFL_PARAM_TIPOLOVARIAZ, "");
    PAN_PARAM.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM110", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM110, IMDBDef17.PQRY_PARAM110_RS, IMDBDef7.TBL_PARAM114);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SOLOPROPAPPR, IMDBDef7.FLD_PARAM114_NOMOGGSOPRAP);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOLOVARIAZ, IMDBDef7.FLD_PARAM114_NOMOGGTIPVAR);
    PAN_PARAM.SetMasterTable(0, "PARAM114");
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

  private void PAN_QUADRATURA_Init()
  {

    PAN_QUADRATURA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_QUADRATURA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_QUADRATURA.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, "45F28966-92E5-4CA6-859B-5E63E746E62D");
    PAN_QUADRATURA.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, "Storni +");
    PAN_QUADRATURA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, "");
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, "3651D6F5-B590-4C01-BBFC-79C6524C2DE7");
    PAN_QUADRATURA.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, "Imp2");
    PAN_QUADRATURA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, "");
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, "0C85266E-E75F-4A90-BD6F-E17926490736");
    PAN_QUADRATURA.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, "Imp3");
    PAN_QUADRATURA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, "");
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, "427B7025-565A-497F-BD29-0B428218E5B9");
    PAN_QUADRATURA.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, "Storni -");
    PAN_QUADRATURA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, "");
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, "43E8CB19-4728-4D96-9469-A38404190805");
    PAN_QUADRATURA.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, "Imp2n");
    PAN_QUADRATURA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, "");
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, "F2F521B0-7D4D-46AB-9E10-6221D78737B1");
    PAN_QUADRATURA.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, "Imp3n");
    PAN_QUADRATURA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, "");
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, "B814AD6C-9BDB-4E00-93D7-77F8BB8BA899");
    PAN_QUADRATURA.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, "Quadratura");
    PAN_QUADRATURA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, "");
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, "911623E0-7421-477E-ACA8-3B6A8DEA3C08");
    PAN_QUADRATURA.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, "q2");
    PAN_QUADRATURA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, "");
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, "E345DEF2-7CCE-4329-9458-8CCBBDE371E6");
    PAN_QUADRATURA.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, "q3");
    PAN_QUADRATURA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, "");
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE1, "370EE40E-64C7-4BAF-B213-5F71E9994883");
    PAN_QUADRATURA.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE1, "Esercizio 2012");
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE1, MyGlb.VIS_VUOTOGRASSET);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE2, "A99AF7B8-5D70-4229-8E6F-23D07E7B1B06");
    PAN_QUADRATURA.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE2, "Esercizio 2012");
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE2, MyGlb.VIS_VUOTOGRASSET);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADRATURA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE3, "57764425-A93B-4C76-9185-9115FB87EDAB");
    PAN_QUADRATURA.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE3, "Esercizio 2012");
    PAN_QUADRATURA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE3, MyGlb.VIS_VUOTOGRASSET);
    PAN_QUADRATURA.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_QUADRATURA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, MyGlb.PANEL_LIST, 40);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, MyGlb.PANEL_LIST, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, MyGlb.PANEL_LIST, "Storni +");
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, MyGlb.PANEL_FORM, 76, 40, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, MyGlb.PANEL_FORM, 56);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, MyGlb.PANEL_FORM, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI1, MyGlb.PANEL_FORM, "Storni +");
    PAN_QUADRATURA.SetFieldPage(PFL_QUADRATURA_STORNI1, -1, -1);
    PAN_QUADRATURA.SetFieldPanel(PFL_QUADRATURA_STORNI1, PPQRY_PROPOSTEVB, "A.NOMEOGGEIMP4", "NOMEOGGEIMP4", 3, 14, 2, -13997);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, MyGlb.PANEL_LIST, 40);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, MyGlb.PANEL_LIST, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, MyGlb.PANEL_LIST, "Imp2");
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, MyGlb.PANEL_FORM, 228, 40, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, MyGlb.PANEL_FORM, 40);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, MyGlb.PANEL_FORM, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2, MyGlb.PANEL_FORM, "Imp2");
    PAN_QUADRATURA.SetFieldPage(PFL_QUADRATURA_IMP2, -1, -1);
    PAN_QUADRATURA.SetFieldPanel(PFL_QUADRATURA_IMP2, PPQRY_PROPOSTEVB, "A.NOMEOGGEIMP5", "NOMEOGGEIMP5", 3, 14, 2, -13997);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, MyGlb.PANEL_LIST, 40);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, MyGlb.PANEL_LIST, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, MyGlb.PANEL_LIST, "Imp3");
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, MyGlb.PANEL_FORM, 320, 40, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, MyGlb.PANEL_FORM, 40);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, MyGlb.PANEL_FORM, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3, MyGlb.PANEL_FORM, "Imp3");
    PAN_QUADRATURA.SetFieldPage(PFL_QUADRATURA_IMP3, -1, -1);
    PAN_QUADRATURA.SetFieldPanel(PFL_QUADRATURA_IMP3, PPQRY_PROPOSTEVB, "A.NOMEOGGEIMP6", "NOMEOGGEIMP6", 3, 14, 2, -13997);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, MyGlb.PANEL_LIST, 48);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, MyGlb.PANEL_LIST, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, MyGlb.PANEL_LIST, "Storni -");
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, MyGlb.PANEL_FORM, 80, 64, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, MyGlb.PANEL_FORM, 52);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, MyGlb.PANEL_FORM, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_STORNI, MyGlb.PANEL_FORM, "Storni -");
    PAN_QUADRATURA.SetFieldPage(PFL_QUADRATURA_STORNI, -1, -1);
    PAN_QUADRATURA.SetFieldPanel(PFL_QUADRATURA_STORNI, PPQRY_PROPOSTEVB, "A.NOMEOGGEIMP1", "NOMEOGGEIMP1", 3, 14, 2, -13997);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, MyGlb.PANEL_LIST, 48);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, MyGlb.PANEL_LIST, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, MyGlb.PANEL_LIST, "Imp2n");
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, MyGlb.PANEL_FORM, 228, 64, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, MyGlb.PANEL_FORM, 48);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, MyGlb.PANEL_FORM, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP2N, MyGlb.PANEL_FORM, "Imp2n");
    PAN_QUADRATURA.SetFieldPage(PFL_QUADRATURA_IMP2N, -1, -1);
    PAN_QUADRATURA.SetFieldPanel(PFL_QUADRATURA_IMP2N, PPQRY_PROPOSTEVB, "A.NOMEOGGEIMP2", "NOMEOGGEIMP2", 3, 14, 2, -13997);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, MyGlb.PANEL_LIST, 48);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, MyGlb.PANEL_LIST, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, MyGlb.PANEL_LIST, "Imp3n");
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, MyGlb.PANEL_FORM, 320, 64, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, MyGlb.PANEL_FORM, 48);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, MyGlb.PANEL_FORM, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_IMP3N, MyGlb.PANEL_FORM, "Imp3n");
    PAN_QUADRATURA.SetFieldPage(PFL_QUADRATURA_IMP3N, -1, -1);
    PAN_QUADRATURA.SetFieldPanel(PFL_QUADRATURA_IMP3N, PPQRY_PROPOSTEVB, "A.NOMEOGGEIMP3", "NOMEOGGEIMP3", 3, 14, 2, -13997);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, MyGlb.PANEL_LIST, 24);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, MyGlb.PANEL_LIST, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, MyGlb.PANEL_LIST, "Quadratura");
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, MyGlb.PANEL_FORM, 56, 88, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, MyGlb.PANEL_FORM, 76);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, MyGlb.PANEL_FORM, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_QUADRATURA, MyGlb.PANEL_FORM, "Quadratura");
    PAN_QUADRATURA.SetFieldPage(PFL_QUADRATURA_QUADRATURA, -1, -1);
    PAN_QUADRATURA.SetFieldUnbound(PFL_QUADRATURA_QUADRATURA, true);
    PAN_QUADRATURA.SetFieldPanel(PFL_QUADRATURA_QUADRATURA, PPQRY_PROPOSTEVB, "", "QUADRATURA", 3, 28, 6, -13997);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, MyGlb.PANEL_LIST, 24);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, MyGlb.PANEL_LIST, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, MyGlb.PANEL_LIST, "q2");
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, MyGlb.PANEL_FORM, 228, 88, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, MyGlb.PANEL_FORM, 24);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, MyGlb.PANEL_FORM, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q2, MyGlb.PANEL_FORM, "q2");
    PAN_QUADRATURA.SetFieldPage(PFL_QUADRATURA_Q2, -1, -1);
    PAN_QUADRATURA.SetFieldUnbound(PFL_QUADRATURA_Q2, true);
    PAN_QUADRATURA.SetFieldPanel(PFL_QUADRATURA_Q2, PPQRY_PROPOSTEVB, "", "Q2", 3, 28, 6, -13997);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, MyGlb.PANEL_LIST, 24);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, MyGlb.PANEL_LIST, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, MyGlb.PANEL_LIST, "q3");
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, MyGlb.PANEL_FORM, 320, 88, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, MyGlb.PANEL_FORM, 24);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, MyGlb.PANEL_FORM, 1);
    PAN_QUADRATURA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRATURA_Q3, MyGlb.PANEL_FORM, "q3");
    PAN_QUADRATURA.SetFieldPage(PFL_QUADRATURA_Q3, -1, -1);
    PAN_QUADRATURA.SetFieldUnbound(PFL_QUADRATURA_Q3, true);
    PAN_QUADRATURA.SetFieldPanel(PFL_QUADRATURA_Q3, PPQRY_PROPOSTEVB, "", "Q3", 3, 28, 6, -13997);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE1, MyGlb.PANEL_LIST, 108, 16, 92, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE1, MyGlb.PANEL_LIST, 0);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE1, MyGlb.PANEL_LIST, 2);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE1, MyGlb.PANEL_FORM, 136, 16, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE1, MyGlb.PANEL_FORM, 0);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE1, MyGlb.PANEL_FORM, 1);
    PAN_QUADRATURA.SetFieldPage(PFL_QUADRATURA_ETICLABEESE1, -1, -1);
    PAN_QUADRATURA.SetFieldPanel(PFL_QUADRATURA_ETICLABEESE1, -1, "", "ETICLABEESE1", 0, 0, 0, -13997);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE2, MyGlb.PANEL_LIST, 116, 24, 92, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE2, MyGlb.PANEL_LIST, 0);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE2, MyGlb.PANEL_LIST, 2);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE2, MyGlb.PANEL_FORM, 228, 16, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE2, MyGlb.PANEL_FORM, 0);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE2, MyGlb.PANEL_FORM, 1);
    PAN_QUADRATURA.SetFieldPage(PFL_QUADRATURA_ETICLABEESE2, -1, -1);
    PAN_QUADRATURA.SetFieldPanel(PFL_QUADRATURA_ETICLABEESE2, -1, "", "ETICLABEESE2", 0, 0, 0, -13997);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE3, MyGlb.PANEL_LIST, 124, 32, 92, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE3, MyGlb.PANEL_LIST, 0);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE3, MyGlb.PANEL_LIST, 2);
    PAN_QUADRATURA.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE3, MyGlb.PANEL_FORM, 320, 16, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRATURA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE3, MyGlb.PANEL_FORM, 0);
    PAN_QUADRATURA.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRATURA_ETICLABEESE3, MyGlb.PANEL_FORM, 1);
    PAN_QUADRATURA.SetFieldPage(PFL_QUADRATURA_ETICLABEESE3, -1, -1);
    PAN_QUADRATURA.SetFieldPanel(PFL_QUADRATURA_ETICLABEESE3, -1, "", "ETICLABEESE3", 0, 0, 0, -13997);
  }

  private void PAN_QUADRATURA_InitQueries()
  {
    StringBuffer SQL;

    PAN_QUADRATURA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_QUADRATURA.SetIMDB(IMDB, "PQRY_PROPOSTEVB", true);
    PAN_QUADRATURA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_QUADRATURA.SetQueryIMDB(PPQRY_PROPOSTEVB, IMDBDef17.PQRY_PROPOSTEVB_RS, IMDBDef7.TBL_QUADRATURA);
    JustLoaded = true;
    PAN_QUADRATURA.SetFieldPrimaryIndex(PFL_QUADRATURA_STORNI1, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP4);
    PAN_QUADRATURA.SetFieldPrimaryIndex(PFL_QUADRATURA_IMP2, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP5);
    PAN_QUADRATURA.SetFieldPrimaryIndex(PFL_QUADRATURA_IMP3, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP6);
    PAN_QUADRATURA.SetFieldPrimaryIndex(PFL_QUADRATURA_STORNI, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP1);
    PAN_QUADRATURA.SetFieldPrimaryIndex(PFL_QUADRATURA_IMP2N, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP2);
    PAN_QUADRATURA.SetFieldPrimaryIndex(PFL_QUADRATURA_IMP3N, IMDBDef7.FLD_QUADRATURA_NOMEOGGEIMP3);
    PAN_QUADRATURA.SetMasterTable(0, "QUADRATURA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_QUADRATURA.Status() == 2)
    {
      int oldListQBE = PAN_QUADRATURA.iUseListQBE;
      PAN_QUADRATURA.iUseListQBE = 0;
      PAN_QUADRATURA.PanelCommand(Glb.PCM_SEARCH);
      PAN_QUADRATURA.PanelCommand(Glb.PCM_FIND);
      PAN_QUADRATURA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_QUADRATURA) PAN_QUADRATURA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_QUADRATURA) PAN_QUADRATURA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_QUADRATURA) PAN_QUADRATURA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_QUADRATURA) PAN_QUADRATURA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_QUADRATURA) PAN_QUADRATURA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
