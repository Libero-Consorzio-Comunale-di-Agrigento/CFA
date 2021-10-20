// **********************************************
// Scelta Da Vista Struttura Ricl
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaDaVistaStrutturaRicl extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPOCOD_TIPIRICLASSI = 0;

  private static int PPQRY_TIPOCOD2 = 0;

  private static int PPQRY_TIPIRICLASSI = 1;


  IDPanel PAN_TIPOCOD;
  private static int PFL_VISTSTRURICL_TIPORICLID1 = 0;
  private static int PFL_VISTSTRURICL_LIVELLO1 = 1;
  private static int PFL_VISTSTRURICL_LIVELLO2 = 2;
  private static int PFL_VISTSTRURICL_CODICE1 = 3;
  private static int PFL_VISTSTRURICL_DESCRIZIONE1 = 4;
  private static int PFL_VISTSTRURICL_STRUTTRICLI1 = 5;

  private static int PPQRY_VISTARICLAS1 = 0;


  IDPanel PAN_VISTSTRURICL;
  private static int PFL_VISSTRRICCOF_TIPORICLID = 0;
  private static int PFL_VISSTRRICCOF_ricliv = 1;
  private static int PFL_VISSTRRICCOF_LIVELLO = 2;
  private static int PFL_VISSTRRICCOF_CODICE = 3;
  private static int PFL_VISSTRRICCOF_DESCRIZIONE = 4;
  private static int PFL_VISSTRRICCOF_STRUTTRICLID = 5;

  private static int PPQRY_VISTARICLAS2 = 0;


  IDPanel PAN_VISSTRRICCOF;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS2(IMDB);
    Init_TBL_TIPOCOD3(IMDB);
    //
    //
    Init_PQRY_VISTARICLAS1(IMDB);
    Init_PQRY_TIPOCOD2(IMDB);
    Init_PQRY_TIPOCOD2_RS(IMDB);
    Init_PQRY_VISTARICLAS2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARS2, 8);
    IMDB.set_TblCode(IMDBDef1.TBL_PARS2, "TBL_PARS2");
    IMDB.set_FldCode(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMOGGCODIBI, "NOMOGGCODIBI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMOGGCODIBI,5,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMOGGPROTIP, "NOMOGGPROTIP");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMOGGPROTIP,1,9,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMOGGMISTIT, "NOMOGGMISTIT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOMOGGMISTIT,1,9,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOOGCOPAIVLI, "NOOGCOPAIVLI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS2,IMDBDef1.FLD_PARS2_NOOGCOPAIVLI,3,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARS2, 0);
  }

  private static void Init_TBL_TIPOCOD3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_TIPOCOD3, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_TIPOCOD3, "TBL_TIPOCOD3");
    IMDB.set_FldCode(IMDBDef1.TBL_TIPOCOD3,IMDBDef1.FLD_TIPOCOD3_NOMOGGTIPRIC, "NOMOGGTIPRIC");
    IMDB.SetFldParams(IMDBDef1.TBL_TIPOCOD3,IMDBDef1.FLD_TIPOCOD3_NOMOGGTIPRIC,1,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_TIPOCOD3, 0);
  }

  private static void Init_PQRY_VISTARICLAS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_VISTARICLAS1, 6);
    IMDB.set_TblCode(IMDBDef7.PQRY_VISTARICLAS1, "PQRY_VISTARICLAS1");
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTARICLAS1,IMDBDef7.PQSL_VISTARICLAS1_REVISTRITIRI, "REVISTRITIRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTARICLAS1,IMDBDef7.PQSL_VISTARICLAS1_REVISTRITIRI,1,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTARICLAS1,IMDBDef7.PQSL_VISTARICLAS1_RECVISSTRILI, "RECVISSTRILI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTARICLAS1,IMDBDef7.PQSL_VISTARICLAS1_RECVISSTRILI,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTARICLAS1,IMDBDef7.PQSL_VISTARICLAS1_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTARICLAS1,IMDBDef7.PQSL_VISTARICLAS1_RECORDCODICE,1,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTARICLAS1,IMDBDef7.PQSL_VISTARICLAS1_REVISTRISTRI, "REVISTRISTRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTARICLAS1,IMDBDef7.PQSL_VISTARICLAS1_REVISTRISTRI,1,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTARICLAS1,IMDBDef7.PQSL_VISTARICLAS1_RECORDLIVELL, "RECORDLIVELL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTARICLAS1,IMDBDef7.PQSL_VISTARICLAS1_RECORDLIVELL,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTARICLAS1,IMDBDef7.PQSL_VISTARICLAS1_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTARICLAS1,IMDBDef7.PQSL_VISTARICLAS1_RECORDDESCRI,5,300,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_VISTARICLAS1, 0);
  }

  private static void Init_PQRY_TIPOCOD2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_TIPOCOD2, 1);
    IMDB.set_TblCode(IMDBDef7.PQRY_TIPOCOD2, "PQRY_TIPOCOD2");
    IMDB.set_FldCode(IMDBDef7.PQRY_TIPOCOD2,IMDBDef7.PQSL_TIPOCOD2_NOMOGGTIPRIC, "NOMOGGTIPRIC");
    IMDB.SetFldParams(IMDBDef7.PQRY_TIPOCOD2,IMDBDef7.PQSL_TIPOCOD2_NOMOGGTIPRIC,1,10,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_TIPOCOD2, 0);
  }

  private static void Init_PQRY_TIPOCOD2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_TIPOCOD2_RS, 1);
    IMDB.set_TblCode(IMDBDef7.PQRY_TIPOCOD2_RS, "PQRY_TIPOCOD2_RS");
    IMDB.set_FldCode(IMDBDef7.PQRY_TIPOCOD2_RS,IMDBDef7.PQSL_TIPOCOD2_NOMOGGTIPRIC, "NOMOGGTIPRIC");
    IMDB.SetFldParams(IMDBDef7.PQRY_TIPOCOD2_RS,IMDBDef7.PQSL_TIPOCOD2_NOMOGGTIPRIC,1,10,0);
  }

  private static void Init_PQRY_VISTARICLAS2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_VISTARICLAS2, 6);
    IMDB.set_TblCode(IMDBDef7.PQRY_VISTARICLAS2, "PQRY_VISTARICLAS2");
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTARICLAS2,IMDBDef7.PQSL_VISTARICLAS2_REVISTRITIRI, "REVISTRITIRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTARICLAS2,IMDBDef7.PQSL_VISTARICLAS2_REVISTRITIRI,1,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTARICLAS2,IMDBDef7.PQSL_VISTARICLAS2_RECVISSTRILI, "RECVISSTRILI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTARICLAS2,IMDBDef7.PQSL_VISTARICLAS2_RECVISSTRILI,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTARICLAS2,IMDBDef7.PQSL_VISTARICLAS2_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTARICLAS2,IMDBDef7.PQSL_VISTARICLAS2_RECORDCODICE,1,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTARICLAS2,IMDBDef7.PQSL_VISTARICLAS2_REVISTRISTRI, "REVISTRISTRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTARICLAS2,IMDBDef7.PQSL_VISTARICLAS2_REVISTRISTRI,1,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTARICLAS2,IMDBDef7.PQSL_VISTARICLAS2_RECORDLIVELL, "RECORDLIVELL");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTARICLAS2,IMDBDef7.PQSL_VISTARICLAS2_RECORDLIVELL,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTARICLAS2,IMDBDef7.PQSL_VISTARICLAS2_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTARICLAS2,IMDBDef7.PQSL_VISTARICLAS2_RECORDDESCRI,5,300,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_VISTARICLAS2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaDaVistaStrutturaRicl(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaDaVistaStrutturaRicl()
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
    FormIdx = MyGlb.FRM_SCEDAVISSTRI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "ECA605E7-4D42-4CE9-99ED-3CD8D16709C7";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 672;
    DesignHeight = 678;
    set_Caption(new IDVariant("Scelta Da Vista Struttura Ricl"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 672;
    Frames[1].Height = 652;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0490798;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 672;
    Frames[2].Height = 32;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Tipo Cod";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 32;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_TIPOCOD = new IDPanel(w, this, 2, "PAN_TIPOCOD");
    Frames[2].Content = PAN_TIPOCOD;
    PAN_TIPOCOD.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPOCOD.VS = MainFrm.VisualStyleList;
    PAN_TIPOCOD.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 672-MyGlb.PAN_OFFS_X, 32-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TIPOCOD.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CC753253-8BD7-4090-B7BA-58F2EE3013EC");
    PAN_TIPOCOD.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 124, 61, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOCOD.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPOCOD.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPOCOD.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPOCOD.InitStatus = 2;
    PAN_TIPOCOD_Init();
    PAN_TIPOCOD_InitFields();
    PAN_TIPOCOD_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 672;
    Frames[3].Height = 620;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.490323;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 672;
    Frames[4].Height = 304;
    Frames[4].Caption = "Vista Struttura Ricl";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 304;
    PAN_VISTSTRURICL = new IDPanel(w, this, 4, "PAN_VISTSTRURICL");
    Frames[4].Content = PAN_VISTSTRURICL;
    PAN_VISTSTRURICL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VISTSTRURICL.VS = MainFrm.VisualStyleList;
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 672-MyGlb.PAN_OFFS_X, 304-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E258A0DC-3E9D-4E5E-8442-AD15F3FE6D4E");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 620, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VISTSTRURICL.InitStatus = 2;
    PAN_VISTSTRURICL_Init();
    PAN_VISTSTRURICL_InitFields();
    PAN_VISTSTRURICL_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 672;
    Frames[5].Height = 316;
    Frames[5].Caption = "Vista Struttura Ricl COFOG";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 316;
    PAN_VISSTRRICCOF = new IDPanel(w, this, 5, "PAN_VISSTRRICCOF");
    Frames[5].Content = PAN_VISSTRRICCOF;
    PAN_VISSTRRICCOF.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VISSTRRICCOF.VS = MainFrm.VisualStyleList;
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 672-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E6B75D3C-A622-446D-A474-4360E24F2CBA");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 620, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VISSTRRICCOF.InitStatus = 2;
    PAN_VISSTRRICCOF_Init();
    PAN_VISSTRRICCOF_InitFields();
    PAN_VISSTRRICCOF_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_TIPOCOD3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCEDAVISSTRI_TIPOCOD2();
      }
      PAN_VISTSTRURICL.UpdatePanel(MainFrm);
      PAN_TIPOCOD.UpdatePanel(MainFrm);
      PAN_VISSTRRICCOF.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaDaVistaStrutturaRicl);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaDaVistaStrutturaRicl.class.getName() : (Glb.ClassWithPackage(SceltaDaVistaStrutturaRicl.class) ? SceltaDaVistaStrutturaRicl.class.getName().substring(SceltaDaVistaStrutturaRicl.class.getPackage().getName().length() + 1) : SceltaDaVistaStrutturaRicl.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Vista Struttura Ricl On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VISTSTRURICL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VISTSTRURICL);
      // 
      // Vista Struttura Ricl On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VISTSTRURICL.set_ToolTip(Glb.OBJ_FIELD,PFL_VISTSTRURICL_LIVELLO2,(new IDVariant(PAN_VISTSTRURICL.FieldText(PFL_VISTSTRURICL_LIVELLO2))).stringValue()); 
      PAN_VISTSTRURICL.set_ToolTip(Glb.OBJ_FIELD,PFL_VISTSTRURICL_DESCRIZIONE1,(new IDVariant(PAN_VISTSTRURICL.FieldText(PFL_VISTSTRURICL_DESCRIZIONE1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDaVistaStrutturaRicl", "VistaStrutturaRiclOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Tipo Cod On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPOCOD_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPOCOD);
      // 
      // Tipo Cod On Dynamic Properties Body
      // Corpo Procedura
      // 
      IDVariant v_CODICE = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as TIPIRICLCODI ");
      SQL.append("from ");
      SQL.append("  TIPI_RICLASSIFICAZIONE A ");
      SQL.append("where (A.TIPO_RICL_ID = " + IDL.CSql(IMDB.Value(IMDBDef7.PQRY_TIPOCOD2, IMDBDef7.PQSL_TIPOCOD2_NOMOGGTIPRIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 2999) > " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODICE = QV.Get("TIPIRICLCODI", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_CODICE.equals((new IDVariant("COFOG")), true))
      {
        PAN_VISTSTRURICL.set_Visible((new IDVariant(0)).booleanValue());
        PAN_VISSTRRICCOF.set_Visible((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_VISTSTRURICL.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_VISSTRRICCOF.set_Visible((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDaVistaStrutturaRicl", "TipoCodOnDynamicProperties", _e);
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
      IDVariant v_CAPT = new IDVariant(0,IDVariant.STRING);
      v_CAPT = (new IDVariant("Scelta Riclassificazione"));
      set_Caption(new IDVariant(v_CAPT));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMOGGCODIBI, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMOGGPROTIP, 0, IDL.ToInteger(((IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))?IDL.SubStr(IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMOGGCODIBI, 0), (new IDVariant(3)), (new IDVariant(2))):IDL.SubStr(IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMOGGCODIBI, 0), (new IDVariant(2)), (new IDVariant(4))))));
        IMDB.set_Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMOGGMISTIT, 0, IDL.ToInteger(((IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))?IDL.Left(IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMOGGCODIBI, 0), (new IDVariant(2))):IDL.Left(IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMOGGCODIBI, 0), (new IDVariant(1))))));
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGECAPI, 0))))
      {
        IDVariant v_VVISRICCAPCO = null;
        v_VVISRICCAPCO = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CODICE as VISRICCAPCOD ");
        SQL.append("from ");
        SQL.append("  VISTA_RICLASSIFICAZIONI_CAP A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGECAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGEARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN NVL(A.ESERCIZIO_INIZIO, 0) AND NVL(A.ESERCIZIO_SCADENZA, 9999))) ");
        SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VVISRICCAPCO = QV.Get("VISRICCAPCOD", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOOGCOPAIVLI, 0, new IDVariant(new IDVariant(v_VVISRICCAPCO),IDVariant.DECIMAL));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDaVistaStrutturaRicl", "Load", _e);
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
      UNLOAD_PARSDELETE();
      UNLOAD_TIPOCODDELET();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDaVistaStrutturaRicl", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMOGGCODIBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMOGGPROTIP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOMOGGMISTIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARS2, IMDBDef1.FLD_PARS2_NOOGCOPAIVLI, 0, new IDVariant());
  }

  // **********************************************************************
  // Tipo Cod: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_TIPOCODDELET() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_TIPOCOD3, IMDBDef1.FLD_TIPOCOD3_NOMOGGTIPRIC, 0, new IDVariant());
  }

  // **********************************************************************
  // Vista Struttura Ricl COFOG On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VISSTRRICCOF_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VISSTRRICCOF);
      // 
      // Vista Struttura Ricl COFOG On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VISSTRRICCOF.set_ToolTip(Glb.OBJ_FIELD,PFL_VISSTRRICCOF_LIVELLO,(new IDVariant(PAN_VISSTRRICCOF.FieldText(PFL_VISSTRRICCOF_LIVELLO))).stringValue()); 
      PAN_VISSTRRICCOF.set_ToolTip(Glb.OBJ_FIELD,PFL_VISSTRRICCOF_DESCRIZIONE,(new IDVariant(PAN_VISSTRRICCOF.FieldText(PFL_VISSTRRICCOF_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDaVistaStrutturaRicl", "VistaStrutturaRiclCOFOGOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Tipo Cod
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCEDAVISSTRI_TIPOCOD2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef7.PQRY_TIPOCOD2_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_TIPOCOD3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_TIPOCOD3, 0))
    {
      IMDB.TblAddNew(IMDBDef7.PQRY_TIPOCOD2_RS, 0);
      IMDB.TblLinkRow(IMDBDef7.PQRY_TIPOCOD2_RS, 0, IMDBDef1.TBL_TIPOCOD3, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_TIPOCOD2_RS, 0, 0, IMDBDef1.TBL_TIPOCOD3, IMDBDef1.FLD_TIPOCOD3_NOMOGGTIPRIC, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_TIPOCOD3, 0);
      if (IMDB.Eof(IMDBDef1.TBL_TIPOCOD3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_TIPOCOD3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef7.PQRY_TIPOCOD2_RS, 0);
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
  private void PAN_TIPOCOD_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TIPOCOD, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPOCOD_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPOCOD, Cancel);
    // Stub
  }

  private void PAN_TIPOCOD_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPOCOD_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TIPOCOD_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPOCOD_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VISTSTRURICL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VISTSTRURICL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VISTSTRURICL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VISTSTRURICL, Cancel);
    // Stub
  }

  private void PAN_VISTSTRURICL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VISTSTRURICL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VISTSTRURICL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VISTSTRURICL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VISSTRRICCOF_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VISSTRRICCOF, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VISSTRRICCOF_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VISSTRRICCOF, Cancel);
    // Stub
  }

  private void PAN_VISSTRRICCOF_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VISSTRRICCOF_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VISSTRRICCOF_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VISSTRRICCOF_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VISTSTRURICL_Init()
  {

    PAN_VISTSTRURICL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VISTSTRURICL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VISTSTRURICL.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, "CB875A6F-6E65-476B-A74F-059EA0C3EE7A");
    PAN_VISTSTRURICL.set_Header(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, "TIPO RICL ID");
    PAN_VISTSTRURICL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, "");
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, 0, -1);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, "FB51A85D-B1F4-48BD-BC9B-64E6D377DB90");
    PAN_VISTSTRURICL.set_Header(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, "LIVELLO");
    PAN_VISTSTRURICL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, "");
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, 0, -1);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, "2131DF51-92B4-40C4-8116-0295765AA5C8");
    PAN_VISTSTRURICL.set_Header(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, "Livello");
    PAN_VISTSTRURICL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, "");
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.VIS_NORMALFIELDS);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, "CBD1D68B-D104-4BB1-8422-D4D24BC72BB4");
    PAN_VISTSTRURICL.set_Header(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, "Codice");
    PAN_VISTSTRURICL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, "");
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.VIS_NORMALFIELDS);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, "35C6C901-B290-4667-AFB0-E854CFC0DAFD");
    PAN_VISTSTRURICL.set_Header(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, "Descrizione");
    PAN_VISTSTRURICL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, "");
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISTSTRURICL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, "0CEE0BDB-38D5-4B56-8DEF-465323015FD1");
    PAN_VISTSTRURICL.set_Header(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, "STRUTTURA RICL ID");
    PAN_VISTSTRURICL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, "");
    PAN_VISTSTRURICL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTSTRURICL.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, 0, -1);
  }

  private void PAN_VISTSTRURICL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_LIST, 80);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_LIST, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_LIST, "TIPO RICL ID");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_FORM, 80);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_FORM, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_TIPORICLID1, MyGlb.PANEL_FORM, "TIPO RICL ID");
    PAN_VISTSTRURICL.SetFieldPage(PFL_VISTSTRURICL_TIPORICLID1, -1, -1);
    PAN_VISTSTRURICL.SetFieldPanel(PFL_VISTSTRURICL_TIPORICLID1, PPQRY_VISTARICLAS1, "A.TIPO_RICL_ID", "REVISTRITIRI", 1, 10, 0, -13997);
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_LIST, 52);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_LIST, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_LIST, "LIVELLO");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_FORM, 4, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_FORM, 52);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_FORM, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO1, MyGlb.PANEL_FORM, "LIVELLO");
    PAN_VISTSTRURICL.SetFieldPage(PFL_VISTSTRURICL_LIVELLO1, -1, -1);
    PAN_VISTSTRURICL.SetFieldPanel(PFL_VISTSTRURICL_LIVELLO1, PPQRY_VISTARICLAS1, "A.LIVELLO", "RECVISSTRILI", 1, 2, 0, -13997);
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_LIST, 76);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_LIST, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_LIST, "Livello");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_FORM, 4, 4, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_FORM, 76);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_FORM, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_LIVELLO2, MyGlb.PANEL_FORM, "Livello");
    PAN_VISTSTRURICL.SetFieldPage(PFL_VISTSTRURICL_LIVELLO2, -1, -1);
    PAN_VISTSTRURICL.SetFieldPanel(PFL_VISTSTRURICL_LIVELLO2, PPQRY_VISTARICLAS1, "A.DES_LIVELLO", "RECORDLIVELL", 5, 40, 0, -13997);
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_LIST, 208, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_LIST, 52);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_LIST, "Codice");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_FORM, 4, 76, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_FORM, 52);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_CODICE1, MyGlb.PANEL_FORM, "Codice");
    PAN_VISTSTRURICL.SetFieldPage(PFL_VISTSTRURICL_CODICE1, -1, -1);
    PAN_VISTSTRURICL.SetFieldPanel(PFL_VISTSTRURICL_CODICE1, PPQRY_VISTARICLAS1, "A.CODICE", "RECORDCODICE", 1, 10, 0, -13997);
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_LIST, 280, 36, 340, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_LIST, 84);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 4, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_FORM, 84);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VISTSTRURICL.SetFieldPage(PFL_VISTSTRURICL_DESCRIZIONE1, -1, -1);
    PAN_VISTSTRURICL.SetFieldPanel(PFL_VISTSTRURICL_DESCRIZIONE1, PPQRY_VISTARICLAS1, "A.DESCRIZIONE", "RECORDDESCRI", 5, 300, 0, -13997);
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_LIST, 124);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_LIST, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_LIST, "STRUTTURA RICL ID");
    PAN_VISTSTRURICL.SetRect(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_FORM, 4, 172, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTSTRURICL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_FORM, 124);
    PAN_VISTSTRURICL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_FORM, 1);
    PAN_VISTSTRURICL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTSTRURICL_STRUTTRICLI1, MyGlb.PANEL_FORM, "STRUTTURA RICL ID");
    PAN_VISTSTRURICL.SetFieldPage(PFL_VISTSTRURICL_STRUTTRICLI1, -1, -1);
    PAN_VISTSTRURICL.SetFieldPanel(PFL_VISTSTRURICL_STRUTTRICLI1, PPQRY_VISTARICLAS1, "A.STRUTTURA_RICL_ID", "REVISTRISTRI", 1, 10, 0, -13997);
  }

  private void PAN_VISTSTRURICL_InitQueries()
  {
    StringBuffer SQL;

    PAN_VISTSTRURICL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VISTSTRURICL.SetIMDB(IMDB, "PQRY_VISTARICLAS1", true);
    PAN_VISTSTRURICL.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_RICL_ID as REVISTRITIRI, ");
    SQL.append("  A.LIVELLO as RECVISSTRILI, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.STRUTTURA_RICL_ID as REVISTRISTRI, ");
    SQL.append("  A.DES_LIVELLO as RECORDLIVELL, ");
    SQL.append("  A.DESCRIZIONE as RECORDDESCRI ");
    PAN_VISTSTRURICL.SetQuery(PPQRY_VISTARICLAS1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    PAN_VISTSTRURICL.SetQuery(PPQRY_VISTARICLAS1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.E_S = ~~TBL_PARS2.NOMEOGGETTES~~) ");
    SQL.append("and   (A.LIVELLO = A.MAX_LIVELLO_RICL) ");
    SQL.append("and   (A.CODICE_TIPO_RICL <> 'COFOG') ");
    SQL.append("and   (((A.CODICE_TIPO_RICL = 'MACRO' AND CONTROLLA_COD_STRUTT_MACRO4(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARS2.NOMEOGGETTES~~,A.CODICE,~~TBL_PARS2.NOMOGGMISTIT~~,~~TBL_PARS2.NOMOGGPROTIP~~) = 'SI') OR (A.CODICE_TIPO_RICL <> 'MACRO' AND ((~~TBL_PARS2.NOOGCOPAIVLI~~ IS NULL) OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE B ");
    SQL.append("where (B.STRUTTURA_RICL_ID = A.STRUTTURA_RICL_ID) ");
    SQL.append("and   (B.CODICE_PADRE = ~~TBL_PARS2.NOOGCOPAIVLI~~) ");
    SQL.append(")))))) ");
    SQL.append("and   (A.TIPO_RICL_ID = ~~PQRY_TIPOCOD2.NOMOGGTIPRIC~~) ");
    PAN_VISTSTRURICL.SetQuery(PPQRY_VISTARICLAS1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISTSTRURICL.SetQuery(PPQRY_VISTARICLAS1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISTSTRURICL.SetQuery(PPQRY_VISTARICLAS1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VISTSTRURICL.SetQuery(PPQRY_VISTARICLAS1, 5, SQL, -1, "");
    PAN_VISTSTRURICL.SetQueryDB(PPQRY_VISTARICLAS1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISTSTRURICL.SetMasterTable(0, "VISTA_STRUTTURA_RICL");
    PAN_VISTSTRURICL.AddToSortList(PFL_VISTSTRURICL_CODICE1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VISTSTRURICL.Status() == 2)
    {
      int oldListQBE = PAN_VISTSTRURICL.iUseListQBE;
      PAN_VISTSTRURICL.iUseListQBE = 0;
      PAN_VISTSTRURICL.PanelCommand(Glb.PCM_SEARCH);
      PAN_VISTSTRURICL.PanelCommand(Glb.PCM_FIND);
      PAN_VISTSTRURICL.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_TIPOCOD_Init()
  {

    PAN_TIPOCOD.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPOCOD.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPOCOD.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_TIPOCOD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, "D03D73C7-7BD1-4462-86F1-F4C928AC0054");
    PAN_TIPOCOD.set_Header(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, "Tipi Riclassificazione");
    PAN_TIPOCOD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, "");
    PAN_TIPOCOD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPOCOD.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPOCOD_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPOCOD.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOCOD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_LIST, 124);
    PAN_TIPOCOD.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_LIST, 1);
    PAN_TIPOCOD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_LIST, "Tipi Riclassificazione");
    PAN_TIPOCOD.SetRect(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_FORM, 4, 4, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPOCOD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_FORM, 124);
    PAN_TIPOCOD.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_FORM, 1);
    PAN_TIPOCOD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPOCOD_TIPIRICLASSI, MyGlb.PANEL_FORM, "Tipi Riclassificazione");
    PAN_TIPOCOD.SetFieldPage(PFL_TIPOCOD_TIPIRICLASSI, -1, -1);
    PAN_TIPOCOD.SetFieldPanel(PFL_TIPOCOD_TIPIRICLASSI, PPQRY_TIPOCOD2, "A.NOMOGGTIPRIC", "NOMOGGTIPRIC", 1, 10, 0, -13997);
  }

  private void PAN_TIPOCOD_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPOCOD.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_RICL_ID as TIPRICTIRIID, ");
    SQL.append("  A.CODICE as TIPIRICLCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIRICLDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_RICLASSIFICAZIONE A ");
    SQL.append("where (A.TIPO_RICL_ID = ~~NOMOGGTIPRIC~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 2999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A_GET_ESERCIZIO_INI_RICL(A.CODICE,A.ESERCIZIO_SCADENZA), 1) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPOCOD.SetQuery(PPQRY_TIPIRICLASSI, 0, SQL, PFL_TIPOCOD_TIPIRICLASSI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_RICL_ID as TIPRICTIRIID, ");
    SQL.append("  A.CODICE as TIPIRICLCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIRICLDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_RICLASSIFICAZIONE A ");
    SQL.append("where (NVL(A.ESERCIZIO_SCADENZA, 2999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A_GET_ESERCIZIO_INI_RICL(A.CODICE,A.ESERCIZIO_SCADENZA), 1) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPOCOD.SetQuery(PPQRY_TIPIRICLASSI, 1, SQL, PFL_TIPOCOD_TIPIRICLASSI, "");
    PAN_TIPOCOD.SetQueryDB(PPQRY_TIPIRICLASSI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPOCOD.SetIMDB(IMDB, "PQRY_TIPOCOD2", true);
    PAN_TIPOCOD.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_TIPOCOD.SetQueryIMDB(PPQRY_TIPOCOD2, IMDBDef7.PQRY_TIPOCOD2_RS, IMDBDef1.TBL_TIPOCOD3);
    JustLoaded = true;
    PAN_TIPOCOD.SetFieldPrimaryIndex(PFL_TIPOCOD_TIPIRICLASSI, IMDBDef1.FLD_TIPOCOD3_NOMOGGTIPRIC);
    PAN_TIPOCOD.SetMasterTable(0, "TIPOCOD3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPOCOD.Status() == 2)
    {
      int oldListQBE = PAN_TIPOCOD.iUseListQBE;
      PAN_TIPOCOD.iUseListQBE = 0;
      PAN_TIPOCOD.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPOCOD.PanelCommand(Glb.PCM_FIND);
      PAN_TIPOCOD.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VISSTRRICCOF_Init()
  {

    PAN_VISSTRRICCOF.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VISSTRRICCOF.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VISSTRRICCOF.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, "03D40A12-0937-4B3D-A4AB-8FD0C1FF770D");
    PAN_VISSTRRICCOF.set_Header(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, "TIPO RICL ID");
    PAN_VISSTRRICCOF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, "");
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, 0, -1);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, "7F9F15D8-667E-4F39-AEA1-F67BEE2A0A28");
    PAN_VISSTRRICCOF.set_Header(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, "LIVELLO");
    PAN_VISSTRRICCOF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, "");
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, 0, -1);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, "836862C5-07ED-418F-88BD-CA4E2ABFA3C2");
    PAN_VISSTRRICCOF.set_Header(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, "Livello");
    PAN_VISSTRRICCOF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, "");
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, "F54E0F19-31B7-4904-8EC4-F82DF921E9A6");
    PAN_VISSTRRICCOF.set_Header(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, "Codice");
    PAN_VISSTRRICCOF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, "");
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, "767C39C2-925C-4948-A4E8-B095865B0C8A");
    PAN_VISSTRRICCOF.set_Header(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, "Descrizione");
    PAN_VISSTRRICCOF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, "");
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISSTRRICCOF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, "1462753B-BF6E-4E86-B43F-F206BB910534");
    PAN_VISSTRRICCOF.set_Header(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, "STRUTTURA RICL ID");
    PAN_VISSTRRICCOF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, "");
    PAN_VISSTRRICCOF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISSTRRICCOF.SetFlags(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, 0, -1);
  }

  private void PAN_VISSTRRICCOF_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_LIST, 80);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_LIST, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_LIST, "TIPO RICL ID");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_FORM, 80);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_FORM, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_TIPORICLID, MyGlb.PANEL_FORM, "TIPO RICL ID");
    PAN_VISSTRRICCOF.SetFieldPage(PFL_VISSTRRICCOF_TIPORICLID, -1, -1);
    PAN_VISSTRRICCOF.SetFieldPanel(PFL_VISSTRRICCOF_TIPORICLID, PPQRY_VISTARICLAS2, "A.TIPO_RICL_ID", "REVISTRITIRI", 1, 10, 0, -13997);
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_LIST, 52);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_LIST, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_LIST, "LIVELLO");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_FORM, 4, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_FORM, 52);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_FORM, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_ricliv, MyGlb.PANEL_FORM, "LIVELLO");
    PAN_VISSTRRICCOF.SetFieldPage(PFL_VISSTRRICCOF_ricliv, -1, -1);
    PAN_VISSTRRICCOF.SetFieldPanel(PFL_VISSTRRICCOF_ricliv, PPQRY_VISTARICLAS2, "A.LIVELLO", "RECVISSTRILI", 1, 2, 0, -13997);
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_LIST, 76);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_LIST, "Livello");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_FORM, 4, 4, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_FORM, 76);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_LIVELLO, MyGlb.PANEL_FORM, "Livello");
    PAN_VISSTRRICCOF.SetFieldPage(PFL_VISSTRRICCOF_LIVELLO, -1, -1);
    PAN_VISSTRRICCOF.SetFieldPanel(PFL_VISSTRRICCOF_LIVELLO, PPQRY_VISTARICLAS2, "A.DES_LIVELLO", "RECORDLIVELL", 5, 40, 0, -13997);
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_LIST, 208, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_FORM, 4, 76, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VISSTRRICCOF.SetFieldPage(PFL_VISSTRRICCOF_CODICE, -1, -1);
    PAN_VISSTRRICCOF.SetFieldPanel(PFL_VISSTRRICCOF_CODICE, PPQRY_VISTARICLAS2, "A.CODICE", "RECORDCODICE", 1, 10, 0, -13997);
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_LIST, 280, 36, 340, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 4, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VISSTRRICCOF.SetFieldPage(PFL_VISSTRRICCOF_DESCRIZIONE, -1, -1);
    PAN_VISSTRRICCOF.SetFieldPanel(PFL_VISSTRRICCOF_DESCRIZIONE, PPQRY_VISTARICLAS2, "A.DESCRIZIONE", "RECORDDESCRI", 5, 300, 0, -13997);
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_LIST, 124);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_LIST, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_LIST, "STRUTTURA RICL ID");
    PAN_VISSTRRICCOF.SetRect(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_FORM, 4, 172, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISSTRRICCOF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_FORM, 124);
    PAN_VISSTRRICCOF.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_FORM, 1);
    PAN_VISSTRRICCOF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISSTRRICCOF_STRUTTRICLID, MyGlb.PANEL_FORM, "STRUTTURA RICL ID");
    PAN_VISSTRRICCOF.SetFieldPage(PFL_VISSTRRICCOF_STRUTTRICLID, -1, -1);
    PAN_VISSTRRICCOF.SetFieldPanel(PFL_VISSTRRICCOF_STRUTTRICLID, PPQRY_VISTARICLAS2, "A.STRUTTURA_RICL_ID", "REVISTRISTRI", 1, 10, 0, -13997);
  }

  private void PAN_VISSTRRICCOF_InitQueries()
  {
    StringBuffer SQL;

    PAN_VISSTRRICCOF.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VISSTRRICCOF.SetIMDB(IMDB, "PQRY_VISTARICLAS2", true);
    PAN_VISSTRRICCOF.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_RICL_ID as REVISTRITIRI, ");
    SQL.append("  A.LIVELLO as RECVISSTRILI, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.STRUTTURA_RICL_ID as REVISTRISTRI, ");
    SQL.append("  A.DES_LIVELLO as RECORDLIVELL, ");
    SQL.append("  A.DESCRIZIONE as RECORDDESCRI ");
    PAN_VISSTRRICCOF.SetQuery(PPQRY_VISTARICLAS2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A, ");
    SQL.append("  PROGRAMMI_COFOG B, ");
    SQL.append("  CAP C ");
    PAN_VISSTRRICCOF.SetQuery(PPQRY_VISTARICLAS2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.ARTICOLO = ~~TBL_PARS2.NOMEOGGEARTI~~) ");
    SQL.append("and   (C.CAPITOLO = ~~TBL_PARS2.NOMEOGGECAPI~~) ");
    SQL.append("and   (C.E_S = ~~TBL_PARS2.NOMEOGGETTES~~) ");
    SQL.append("and   (C.ESERCIZIO = ~~TBL_PARS2.NOMEOGGEESER~~) ");
    SQL.append("and   (C.CODICE_STRUTTURA = B.PROGRAMMA) ");
    SQL.append("and   (B.COFOG = A.CODICE) ");
    SQL.append("and   (A.E_S = ~~TBL_PARS2.NOMEOGGETTES~~) ");
    SQL.append("and   (A.LIVELLO = A.MAX_LIVELLO_RICL) ");
    SQL.append("and   (A.TIPO_RICL_ID = ~~PQRY_TIPOCOD2.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'COFOG') ");
    PAN_VISSTRRICCOF.SetQuery(PPQRY_VISTARICLAS2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISSTRRICCOF.SetQuery(PPQRY_VISTARICLAS2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISSTRRICCOF.SetQuery(PPQRY_VISTARICLAS2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VISSTRRICCOF.SetQuery(PPQRY_VISTARICLAS2, 5, SQL, -1, "");
    PAN_VISSTRRICCOF.SetQueryDB(PPQRY_VISTARICLAS2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISSTRRICCOF.SetMasterTable(0, "VISTA_STRUTTURA_RICL");
    PAN_VISSTRRICCOF.AddToSortList(PFL_VISSTRRICCOF_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VISSTRRICCOF.Status() == 2)
    {
      int oldListQBE = PAN_VISSTRRICCOF.iUseListQBE;
      PAN_VISSTRRICCOF.iUseListQBE = 0;
      PAN_VISSTRRICCOF.PanelCommand(Glb.PCM_SEARCH);
      PAN_VISSTRRICCOF.PanelCommand(Glb.PCM_FIND);
      PAN_VISSTRRICCOF.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VISTSTRURICL) PAN_VISTSTRURICL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_TIPOCOD) PAN_TIPOCOD_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VISSTRRICCOF) PAN_VISSTRRICCOF_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VISTSTRURICL) PAN_VISTSTRURICL_ValidateRow(Cancel);
    if (SrcObj == PAN_TIPOCOD) PAN_TIPOCOD_ValidateRow(Cancel);
    if (SrcObj == PAN_VISSTRRICCOF) PAN_VISSTRRICCOF_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VISTSTRURICL) PAN_VISTSTRURICL_DynamicProperties();
    if (SrcObj == PAN_TIPOCOD) PAN_TIPOCOD_DynamicProperties();
    if (SrcObj == PAN_VISSTRRICCOF) PAN_VISSTRRICCOF_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VISTSTRURICL) PAN_VISTSTRURICL_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_TIPOCOD) PAN_TIPOCOD_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VISSTRRICCOF) PAN_VISSTRRICCOF_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VISTSTRURICL) PAN_VISTSTRURICL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_TIPOCOD) PAN_TIPOCOD_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VISSTRRICCOF) PAN_VISSTRRICCOF_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
