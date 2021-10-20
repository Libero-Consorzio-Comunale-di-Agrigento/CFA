// **********************************************
// Ordinativi Da Ritenute
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiDaRitenute extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ORDINDARITEN_TIPORITENUTA = 0;
  private static int GRP_ORDINDARITEN_MANDATI = 1;
  private static int GRP_ORDINDARITEN_ORDINATIVO = 2;

  private static int PFL_ORDINDARITEN_ELABORA = 0;
  private static int PFL_ORDINDARITEN_NEWPANELLABE = 1;
  private static int PFL_ORDINDARITEN_TIPORITENUTA = 2;
  private static int PFL_ORDINDARITEN_DAL = 3;
  private static int PFL_ORDINDARITEN_AL = 4;
  private static int PFL_ORDINDARITEN_NEWPANELABE3 = 5;
  private static int PFL_ORDINDARITEN_DATA = 6;
  private static int PFL_ORDINDARITEN_CAUSALE = 7;
  private static int PFL_ORDINDARITEN_BOLLO = 8;
  private static int PFL_ORDINDARITEN_UFFICIO = 9;
  private static int PFL_ORDINDARITEN_EMAUVPMDSASC = 10;
  private static int PFL_ORDINDARITEN_UNORDIPERBEN = 11;
  private static int PFL_ORDINDARITEN_SPESE = 12;
  private static int PFL_ORDINDARITEN_COMMISSIONI = 13;
  private static int PFL_ORDINDARITEN_ALLEGATI = 14;
  private static int PFL_ORDINDARITEN_INFOTESORIER = 15;
  private static int PFL_ORDINDARITEN_NOTE2 = 16;
  private static int PFL_ORDINDARITEN_NOTE1 = 17;

  private static int PPQRY_ORDINDARITE2 = 0;

  private static int PPQRY_T58 = 1;
  private static int PPQRY_T60 = 2;
  private static int PPQRY_T53 = 3;
  private static int PPQRY_TIPISPESMINF = 4;


  IDPanel PAN_ORDINDARITEN;

  // Definition of Global Variables
  private IDVariant ASD = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_ORDINDARITE3(IMDB);
    //
    //
    Init_PQRY_ORDINDARITE2(IMDB);
    Init_PQRY_ORDINDARITE2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_ORDINDARITE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_ORDINDARITE3, 13);
    IMDB.set_TblCode(IMDBDef6.TBL_ORDINDARITE3, "TBL_ORDINDARITE3");
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_RNEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_RONAUNORPEBE, "RONAUNORPEBE");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_RONAUNORPEBE,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMESPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMECOMMI,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMEALLEG,5,250,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMTIPRIT, "ROWNAMTIPRIT");
    IMDB.SetFldParams(IMDBDef6.TBL_ORDINDARITE3,IMDBDef6.FLD_ORDINDARITE3_ROWNAMTIPRIT,1,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_ORDINDARITE3, 0);
  }

  private static void Init_PQRY_ORDINDARITE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDINDARITE2, 13);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDINDARITE2, "PQRY_ORDINDARITE2");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMTIPRIT, "ROWNAMTIPRIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMTIPRIT,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_RNEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_RONAUNORPEBE, "RONAUNORPEBE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_RONAUNORPEBE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMESPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMECOMMI,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEALLEG,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMINFTES,5,250,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ORDINDARITE2, 0);
  }

  private static void Init_PQRY_ORDINDARITE2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORDINDARITE2_RS, 13);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORDINDARITE2_RS, "PQRY_ORDINDARITE2_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMTIPRIT, "ROWNAMTIPRIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMTIPRIT,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_RNEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_RONAUNORPEBE, "RONAUNORPEBE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_RONAUNORPEBE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMESPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMECOMMI, "ROWNAMECOMMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMECOMMI,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEALLEG, "ROWNAMEALLEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEALLEG,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMINFTES, "ROWNAMINFTES");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORDINDARITE2_RS,IMDBDef15.PQSL_ORDINDARITE2_ROWNAMINFTES,5,250,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiDaRitenute(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiDaRitenute()
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
    FormIdx = MyGlb.FRM_ORDINDARITEN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "AF686C27-45CB-466D-95CA-AB1D15704A3A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 464;
    DesignHeight = 574;
    set_Caption(new IDVariant("Ordinativi Da Ritenute"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 464;
    Frames[1].Height = 548;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Ordinativi Da Ritenute";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 548;
    PAN_ORDINDARITEN = new IDPanel(w, this, 1, "PAN_ORDINDARITEN");
    Frames[1].Content = PAN_ORDINDARITEN;
    PAN_ORDINDARITEN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINDARITEN.VS = MainFrm.VisualStyleList;
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 464-MyGlb.PAN_OFFS_X, 548-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C102F946-BC4D-4448-ADA3-52EE0C9952CA");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1084, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINDARITEN.InitStatus = 2;
    PAN_ORDINDARITEN_Init();
    PAN_ORDINDARITEN_InitFields();
    PAN_ORDINDARITEN_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_ORDINDARITE3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ORDINDARITEN_ORDINDARITE2();
      }
      PAN_ORDINDARITEN.UpdatePanel(MainFrm);
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
    return (obj instanceof OrdinativiDaRitenute);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiDaRitenute.class.getName() : (Glb.ClassWithPackage(OrdinativiDaRitenute.class) ? OrdinativiDaRitenute.class.getName().substring(OrdinativiDaRitenute.class.getPackage().getName().length() + 1) : OrdinativiDaRitenute.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Note
  // **********************************************************************
  public int ApriNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note Body
      // Procedure Body
      // 
      ASD = (new IDVariant(0));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEALLEG, 0), (new IDVariant("Allegati")), (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaRitenute", "ApriNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Note 1
  // **********************************************************************
  public int ApriNote1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note 1 Body
      // Procedure Body
      // 
      ASD = (new IDVariant(1));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMINFTES, 0), (new IDVariant(PAN_ORDINDARITEN.Header(Glb.OBJ_FIELD,PFL_ORDINDARITEN_INFOTESORIER))), (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaRitenute", "ApriNote1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Abilitazioni
  // **********************************************************************
  public int ControlloAbilitazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_REGIONALE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_COMUNALE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Abilitazioni Body
      // Procedure Body
      // 
      PAN_ORDINDARITEN.ClearValueList(PFL_ORDINDARITEN_TIPORITENUTA);
      PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_TIPORITENUTA, (new IDVariant(1)), ((new IDVariant(1)).equals((new IDVariant(1)))? new IDVariant("Fiscale") : (new IDVariant(1)).equals((new IDVariant(0)))? new IDVariant("Previdenziale") : (new IDVariant(1)).equals((new IDVariant(2)))? new IDVariant("Addizionale Regionale") : (new IDVariant(1)).equals((new IDVariant(3)))? new IDVariant("Addizionale Comunale") : (new IDVariant(1)).equals((new IDVariant(4)))? new IDVariant("Inail") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_TIPORITENUTA, (new IDVariant(0)), ((new IDVariant(0)).equals((new IDVariant(1)))? new IDVariant("Fiscale") : (new IDVariant(0)).equals((new IDVariant(0)))? new IDVariant("Previdenziale") : (new IDVariant(0)).equals((new IDVariant(2)))? new IDVariant("Addizionale Regionale") : (new IDVariant(0)).equals((new IDVariant(3)))? new IDVariant("Addizionale Comunale") : (new IDVariant(0)).equals((new IDVariant(4)))? new IDVariant("Inail") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  T59 A ");
      SQL.append("where (A.TIPO = 'A') ");
      SQL.append("and   (NOT ((A.ANNO_ACC IS NULL))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_REGIONALE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  T59 A ");
      SQL.append("where (A.TIPO = 'C') ");
      SQL.append("and   (NOT ((A.ANNO_ACC IS NULL))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_COMUNALE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_REGIONALE.compareTo((new IDVariant(0)), true)>0)
      {
        PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_TIPORITENUTA, (new IDVariant(2)), ((new IDVariant(2)).equals((new IDVariant(1)))? new IDVariant("Fiscale") : (new IDVariant(2)).equals((new IDVariant(0)))? new IDVariant("Previdenziale") : (new IDVariant(2)).equals((new IDVariant(2)))? new IDVariant("Addizionale Regionale") : (new IDVariant(2)).equals((new IDVariant(3)))? new IDVariant("Addizionale Comunale") : (new IDVariant(2)).equals((new IDVariant(4)))? new IDVariant("Inail") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      if (v_COMUNALE.compareTo((new IDVariant(0)), true)>0)
      {
        PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_TIPORITENUTA, (new IDVariant(3)), ((new IDVariant(3)).equals((new IDVariant(1)))? new IDVariant("Fiscale") : (new IDVariant(3)).equals((new IDVariant(0)))? new IDVariant("Previdenziale") : (new IDVariant(3)).equals((new IDVariant(2)))? new IDVariant("Addizionale Regionale") : (new IDVariant(3)).equals((new IDVariant(3)))? new IDVariant("Addizionale Comunale") : (new IDVariant(3)).equals((new IDVariant(4)))? new IDVariant("Inail") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_TIPORITENUTA, (new IDVariant(4)), ((new IDVariant(4)).equals((new IDVariant(1)))? new IDVariant("Fiscale") : (new IDVariant(4)).equals((new IDVariant(0)))? new IDVariant("Previdenziale") : (new IDVariant(4)).equals((new IDVariant(2)))? new IDVariant("Addizionale Regionale") : (new IDVariant(4)).equals((new IDVariant(3)))? new IDVariant("Addizionale Comunale") : (new IDVariant(4)).equals((new IDVariant(4)))? new IDVariant("Inail") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaRitenute", "ControlloAbilitazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Licenza
  // **********************************************************************
  public int ControlloLicenza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Licenza Body
      // Procedure Body
      // 
      if ((new IDVariant(MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF"))))).equals((new IDVariant(-1)), true))
      {
        if (MainFrm.GESTIONSPESE.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_ORDINDARITEN.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIOCOMMIS.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_ORDINDARITEN.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIOALLEGA.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_ORDINDARITEN.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINDARITEN.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTINFOTESO.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_ORDINDARITEN.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINDARITEN.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_ORDINDARITEN.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDARITEN.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDARITEN.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDARITEN.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDARITEN.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINDARITEN.SetFlags (Glb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaRitenute", "ControlloLicenza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
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
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDATA, 0)) || IDL.Year(IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDATA, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Data Ordinativi non indicata o non appartenente all'esercizio del contesto", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEAL, 0)))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Intervallo dei mandati non indicati", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
        }
        else
        {
          if ((new IDVariant(ControllaRitenute())).equals((new IDVariant(-1)), true))
          {
            IDVariant v_SVARACC = new IDVariant(0,IDVariant.STRING);
            IDVariant v_NSTATOSIOPE = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_SSTATOSIOPE = new IDVariant(0,IDVariant.STRING);
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            IDVariant v_NORDDA = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_NORDA = new IDVariant(0,IDVariant.INTEGER);
            v_MESSAGGIO = IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<BR/>")));
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.ORDEMISSRITENUTE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDAL, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEAL, 0), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEDATA, 0)), ((IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMECAUSA, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMECAUSA, 0)), ((IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEBOLLO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEBOLLO, 0)), ((IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEUFFIC, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEUFFIC, 0)), IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_RNEAVPMDSASC, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_RONAUNORPEBE, 0), IMDB.Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMTIPRIT, 0), v_NORDDA, v_NORDA, v_SVARACC, IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMECOMMI, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMINFTES, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMESPESE, 0), IMDB.Value(IMDBDef15.PQRY_ORDINDARITE2, IMDBDef15.PQSL_ORDINDARITE2_ROWNAMEALLEG, 0), v_NSTATOSIOPE);
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            }
            else
            {
              if (v_NSTATOSIOPE.equals((new IDVariant(1)), true))
              {
                IDVariant v_STRCGE = new IDVariant(0,IDVariant.STRING);
                v_STRCGE = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Gestionale", IDVariant.STRING));
                IDVariant v_STRLIV5 = new IDVariant(0,IDVariant.STRING);
                v_STRLIV5 = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Livello 5"));
                if (MainFrm.SIOPEATTIARM.booleanValue())
                {
                  v_SSTATOSIOPE = new IDVariant(v_STRLIV5);
                }
                else
                {
                  v_SSTATOSIOPE = new IDVariant(v_STRCGE);
                }
              }
              else
              {
                v_SSTATOSIOPE = (new IDVariant(""));
              }
              if (v_SVARACC.compareTo((new IDVariant("")), true)!=0)
              {
                IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
                v_STR = (new IDVariant("Emesse Variazioni agli Accertamenti: ", IDVariant.STRING));
                IDVariant v_MID = new IDVariant(0,IDVariant.STRING);
                v_MID = IDL.SubStr(v_SVARACC, (new IDVariant(0)), (new IDVariant(2)));
                v_SVARACC = IDL.Add(v_STR, v_MID);
              }
              if (v_NORDDA.compareTo(v_NORDA, true)<=0)
              {
                IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
                v_STR = (new IDVariant("Emessi ordinativi da ", IDVariant.STRING));
                v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, v_STR), IDL.ToString(v_NORDDA)), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), IDL.ToString(v_NORDA)), (new IDVariant("<BR/>"))), v_SVARACC), (new IDVariant("<BR/>"))), v_SSTATOSIOPE);
              }
              else
              {
                IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
                v_STR = (new IDVariant("Non sono stati emessi Ordinativi", IDVariant.STRING));
                v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, v_STR), (new IDVariant("<BR/>")));
              }
              MainFrm.set_AlertMessage(v_MESSAGGIO); 
            }
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaRitenute", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlla Ritenute
  // **********************************************************************
  public boolean ControllaRitenute ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RETVALUE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controlla Ritenute Body
      // Procedure Body
      // 
      v_RETVALUE = (new IDVariant(-1));
      // 
      // FISCALE
      // 
      if (IMDB.Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMTIPRIT, 0).equals((new IDVariant(1)), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  T59 A ");
        SQL.append("where (A.ANNO_ACC < " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      // 
      // PREVIDENZIALE
      // 
      if (IMDB.Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMTIPRIT, 0).equals((new IDVariant(0)), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  T83 A ");
        SQL.append("where (A.ANNO_ACC < " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      // 
      // INAIL
      // 
      if (IMDB.Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMTIPRIT, 0).equals((new IDVariant(4)), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  T87 A ");
        SQL.append("where (A.ANNO_ACC < " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Esistono delle indicazioni di accertamento a residuo.", IDVariant.STRING));
        v_SMS = IDL.Add(IDL.Add(v_SMS, (new IDVariant("<BR/>"))), (new IDVariant("Continuare?")));
        if (!(MainFrm.MessageConfirm(v_SMS)))
        {
          v_RETVALUE = (new IDVariant(0));
          return v_RETVALUE.booleanValue();
        }
      }
      return v_RETVALUE.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaRitenute", "ControllaRitenute", _e);
      return false;
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
    IDVariant v_CODSPESEMINF = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      ControlloAbilitazioni();
      IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMTIPRIT, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEDATA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_RNEAVPMDSASC, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_RONAUNORPEBE, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMINFTES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEALLEG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMECAUSA, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEBOLLO, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEUFFIC, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as TIPSPEMINCOD ");
      SQL.append("from ");
      SQL.append("  TIPI_SPESA_MINF A ");
      SQL.append("where (A.DEFAULT_E = 'SI') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODSPESEMINF = QV.Get("TIPSPEMINCOD", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMESPESE, 0, new IDVariant(v_CODSPESEMINF));
      ControlloLicenza();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaRitenute", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.equals((new IDVariant(-1)), true))
      {
        if (ASD.equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEALLEG, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
        if (ASD.equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMINFTES, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaRitenute", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Da Ritenute
  // Primary record source for panel data
  // **********************************************************************
  private void ORDINDARITEN_ORDINDARITE2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_ORDINDARITE2_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_ORDINDARITE3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_ORDINDARITE3, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_ORDINDARITE2_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_ORDINDARITE2_RS, 0, IMDBDef6.TBL_ORDINDARITE3, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 0, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMTIPRIT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 1, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 2, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 3, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEDATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 4, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMECAUSA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 5, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEBOLLO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 6, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 7, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_RNEAVPMDSASC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 8, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_RONAUNORPEBE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 9, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMESPESE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 10, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMECOMMI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 11, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEALLEG, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ORDINDARITE2_RS, 12, 0, IMDBDef6.TBL_ORDINDARITE3, IMDBDef6.FLD_ORDINDARITE3_ROWNAMINFTES, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_ORDINDARITE3, 0);
      if (IMDB.Eof(IMDBDef6.TBL_ORDINDARITE3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_ORDINDARITE3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_ORDINDARITE2_RS, 0);
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
  private void PAN_ORDINDARITEN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINDARITEN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINDARITEN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINDARITEN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINDARITEN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ORDINDARITEN);
    // Stub
  }

  private void PAN_ORDINDARITEN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINDARITEN_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ORDINDARITEN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDARITEN_NOTE2)
    {
      this.IdxPanelActived = this.PAN_ORDINDARITEN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDARITEN_NOTE1)
    {
      this.IdxPanelActived = this.PAN_ORDINDARITEN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote1();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINDARITEN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINDARITEN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDINDARITEN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINDARITEN_Init()
  {

    PAN_ORDINDARITEN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINDARITEN.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_TIPORITENUTA, "163456DB-035C-4938-99CB-7F660DF98470");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_TIPORITENUTA, "Tipo Ritenuta");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_TIPORITENUTA, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_TIPORITENUTA, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_TIPORITENUTA, MyGlb.PANEL_LIST, 0, -9999, 84, 16, 0, 0);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_TIPORITENUTA, MyGlb.PANEL_FORM, 12, 7, 424, 121, 0, 0);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_TIPORITENUTA, 0, 76);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_TIPORITENUTA, 1, 13);
    PAN_ORDINDARITEN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_TIPORITENUTA, 0, 4);
    PAN_ORDINDARITEN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_TIPORITENUTA, 1, 4);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_TIPORITENUTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_MANDATI, "67DCCFD2-F42B-4817-9F23-19C27E9E2C7C");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_MANDATI, "Mandati");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_MANDATI, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_MANDATI, MyGlb.PANEL_LIST, 456, -9999, 208, 16, 0, 0);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_MANDATI, MyGlb.PANEL_FORM, 12, 135, 424, 49, 0, 0);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_MANDATI, 0, 46);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_MANDATI, 1, 13);
    PAN_ORDINDARITEN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_MANDATI, 0, 4);
    PAN_ORDINDARITEN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_MANDATI, 1, 4);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_ORDINATIVO, "4AC7FD26-E1AE-4D1D-BEEA-34BBFF4DABCA");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_ORDINATIVO, "Ordinativo");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_ORDINATIVO, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_ORDINATIVO, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_ORDINATIVO, MyGlb.PANEL_LIST, 664, -9999, 792, 16, 0, 0);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_ORDINATIVO, MyGlb.PANEL_FORM, 12, 191, 424, 293, 0, 0);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_ORDINATIVO, 0, 59);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_ORDINATIVO, 1, 13);
    PAN_ORDINDARITEN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_ORDINATIVO, 0, 4);
    PAN_ORDINDARITEN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_ORDINATIVO, 1, 4);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDINDARITEN_ORDINATIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDINDARITEN.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ELABORA, "6D3902A1-4FC6-4F9B-A4D3-C33463A6FB6A");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ELABORA, "Elabora");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ORDINDARITEN.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ELABORA, 0, "button1.gif", false);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELLABE, "1B540540-68AC-47DA-9302-ADC27AB8025B");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELLABE, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, "BD04499B-504E-4972-B523-41DE9A82FE47");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, "Tipo Ritenuta");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, "0EE67913-0D65-4968-AF66-61E2998DD5AA");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, "Dal");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, "85A1DDB7-4611-4603-90D4-F571B921DEAF");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, "Al");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELABE3, "7CF9B9E4-C841-4AD2-A9EA-DF17A1065318");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELABE3, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELABE3, MyGlb.VIS_SFONEBORDTRA);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELABE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, "C180ED2D-7006-4302-8B91-739856488F22");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, "Data");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, "34CDE39D-1D01-4708-A5E1-5867B747B103");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, "Causale");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, "9EBC3ADD-59C4-4C2F-9FA6-5FBCFAC49767");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, "Bollo");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, "42DCC6E5-E21E-4315-88CB-F55F64B8C62D");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, "Ufficio");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, "DF54333E-62AB-42B1-AD4D-05B78B10EF88");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, "Emissione Automatica Variazioni per mancata disponibilità su Accertamento (solo Competenza)");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, MyGlb.VIS_CHECKSTYLE);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, "7EB09514-FF35-4CAB-A604-436627234D69");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, "Un Ordinativo per Beneficiario");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, MyGlb.VIS_CHECKSTYLE);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, "3BA11986-E102-4E0B-B873-98E0A9D7C1C6");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, "Spese");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, "B0CD5773-ECDD-45EE-A877-3E55B0CF9499");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, "Commissioni");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, "E9495F4E-5D17-46ED-AF18-75CB51C61A91");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, "Allegati");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, "16D878B2-6899-479E-839F-D2E5FD65C859");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, "Info Tesoriere");
    PAN_ORDINDARITEN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, "A2E1FE56-B4C2-4068-8CF0-0BEF27970A85");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINDARITEN.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, 0, "testo1.gif", false);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINDARITEN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, "1F2ECC8C-11CE-4683-9F0D-AAE18F08A491");
    PAN_ORDINDARITEN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, "");
    PAN_ORDINDARITEN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ORDINDARITEN.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, 0, "testo1.gif", false);
    PAN_ORDINDARITEN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ORDINDARITEN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ELABORA, MyGlb.PANEL_LIST, 352, 424, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ELABORA, MyGlb.PANEL_FORM, 348, 504, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_ELABORA, -1, -1);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELLABE, MyGlb.PANEL_LIST, 196, 16, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELLABE, MyGlb.PANEL_FORM, 16, 112, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_NEWPANELLABE, -1, GRP_ORDINDARITEN_TIPORITENUTA);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, MyGlb.PANEL_LIST, 84);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, MyGlb.PANEL_LIST, "Tipo Ritenuta");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, MyGlb.PANEL_FORM, 104, 32, 328, 92, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, MyGlb.PANEL_FORM, 84);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, MyGlb.PANEL_FORM, 7);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_TIPORITENUTA, MyGlb.PANEL_FORM, "Tipo Ritenuta");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_TIPORITENUTA, -1, GRP_ORDINDARITEN_TIPORITENUTA);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_TIPORITENUTA, PPQRY_ORDINDARITE2, "A.ROWNAMTIPRIT", "ROWNAMTIPRIT", 1, 2, 0, -13997);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_TIPORITENUTA, (new IDVariant(1)), "Fiscale", "", "", -1);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_TIPORITENUTA, (new IDVariant(0)), "Previdenziale", "", "", -1);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_TIPORITENUTA, (new IDVariant(2)), "Addizionale Regionale", "", "", -1);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_TIPORITENUTA, (new IDVariant(3)), "Addizionale Comunale", "", "", -1);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_TIPORITENUTA, (new IDVariant(4)), "Inail", "", "", -1);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, MyGlb.PANEL_LIST, 456, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, MyGlb.PANEL_LIST, 24);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, MyGlb.PANEL_FORM, 16, 160, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, MyGlb.PANEL_FORM, 88);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_DAL, -1, GRP_ORDINDARITEN_MANDATI);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_DAL, PPQRY_ORDINDARITE2, "A.ROWNAMEDAL", "ROWNAMEDAL", 1, 5, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, MyGlb.PANEL_LIST, 560, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, MyGlb.PANEL_LIST, 20);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, MyGlb.PANEL_LIST, "Al");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, MyGlb.PANEL_FORM, 268, 160, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, MyGlb.PANEL_FORM, 20);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_AL, MyGlb.PANEL_FORM, "Al");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_AL, -1, GRP_ORDINDARITEN_MANDATI);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_AL, PPQRY_ORDINDARITE2, "A.ROWNAMEAL", "ROWNAMEAL", 1, 5, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELABE3, MyGlb.PANEL_LIST, 212, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELABE3, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELABE3, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELABE3, MyGlb.PANEL_FORM, 416, 164, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELABE3, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NEWPANELABE3, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_NEWPANELABE3, -1, GRP_ORDINDARITEN_MANDATI);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_NEWPANELABE3, -1, "", "NEWPANELABE3", 0, 0, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, MyGlb.PANEL_LIST, 664, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, MyGlb.PANEL_LIST, 32);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, MyGlb.PANEL_FORM, 68, 216, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, MyGlb.PANEL_FORM, 36);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_DATA, -1, GRP_ORDINDARITEN_ORDINATIVO);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_DATA, PPQRY_ORDINDARITE2, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 14, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, MyGlb.PANEL_LIST, 768, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, MyGlb.PANEL_FORM, 52, 240, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, MyGlb.PANEL_FORM, 52);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_CAUSALE, -1, GRP_ORDINDARITEN_ORDINATIVO);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_CAUSALE, PPQRY_ORDINDARITE2, "A.ROWNAMECAUSA", "ROWNAMECAUSA", 1, 4, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, MyGlb.PANEL_LIST, 808, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, MyGlb.PANEL_FORM, 68, 264, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, MyGlb.PANEL_FORM, 36);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_BOLLO, -1, GRP_ORDINDARITEN_ORDINATIVO);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_BOLLO, PPQRY_ORDINDARITE2, "A.ROWNAMEBOLLO", "ROWNAMEBOLLO", 1, 2, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, MyGlb.PANEL_LIST, 848, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, MyGlb.PANEL_FORM, 60, 288, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, MyGlb.PANEL_FORM, 44);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_UFFICIO, -1, GRP_ORDINDARITEN_ORDINATIVO);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_UFFICIO, PPQRY_ORDINDARITE2, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 2, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, MyGlb.PANEL_LIST, 888, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, MyGlb.PANEL_LIST, 452);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, MyGlb.PANEL_LIST, "E. A. V. p. m. d. s. A. s. C.");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, MyGlb.PANEL_FORM, 92, 320, 324, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, MyGlb.PANEL_FORM, 300);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, MyGlb.PANEL_FORM, 2);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_EMAUVPMDSASC, MyGlb.PANEL_FORM, "Emissione Automatica Variazioni per mancata disponibilità su Accertamento (solo Competenza)");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_EMAUVPMDSASC, -1, GRP_ORDINDARITEN_ORDINATIVO);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_EMAUVPMDSASC, PPQRY_ORDINDARITE2, "A.RNEAVPMDSASC", "RNEAVPMDSASC", 1, 1, 0, -13997);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_EMAUVPMDSASC, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_EMAUVPMDSASC, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, MyGlb.PANEL_LIST, 936, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, MyGlb.PANEL_LIST, 152);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, MyGlb.PANEL_LIST, "U. O. p. B.");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, MyGlb.PANEL_FORM, 216, 360, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, MyGlb.PANEL_FORM, 176);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_UNORDIPERBEN, MyGlb.PANEL_FORM, "Un Ordinativo per Beneficiario");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_UNORDIPERBEN, -1, GRP_ORDINDARITEN_ORDINATIVO);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_UNORDIPERBEN, PPQRY_ORDINDARITE2, "A.RONAUNORPEBE", "RONAUNORPEBE", 1, 2, 0, -13997);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_UNORDIPERBEN, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_UNORDIPERBEN, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, MyGlb.PANEL_LIST, 984, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, MyGlb.PANEL_FORM, 60, 388, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, MyGlb.PANEL_FORM, 44);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_SPESE, -1, GRP_ORDINDARITEN_ORDINATIVO);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_SPESE, PPQRY_ORDINDARITE2, "A.ROWNAMESPESE", "ROWNAMESPESE", 1, 1, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, MyGlb.PANEL_LIST, 1024, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, MyGlb.PANEL_LIST, 68);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, MyGlb.PANEL_LIST, "Commissioni");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, MyGlb.PANEL_FORM, 24, 412, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_COMMISSIONI, -1, GRP_ORDINDARITEN_ORDINATIVO);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_COMMISSIONI, PPQRY_ORDINDARITE2, "A.ROWNAMECOMMI", "ROWNAMECOMMI", 1, 1, 0, -13997);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_ORDINDARITEN.SetValueListItem(PFL_ORDINDARITEN_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, MyGlb.PANEL_LIST, 1128, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, MyGlb.PANEL_LIST, 44);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, MyGlb.PANEL_FORM, 52, 436, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, MyGlb.PANEL_FORM, 52);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_ALLEGATI, -1, GRP_ORDINDARITEN_ORDINATIVO);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_ALLEGATI, PPQRY_ORDINDARITE2, "A.ROWNAMEALLEG", "ROWNAMEALLEG", 5, 250, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, MyGlb.PANEL_LIST, 1336, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, MyGlb.PANEL_LIST, 76);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, MyGlb.PANEL_FORM, 16, 460, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_INFOTESORIER, -1, GRP_ORDINDARITEN_ORDINATIVO);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_INFOTESORIER, PPQRY_ORDINDARITE2, "A.ROWNAMINFTES", "ROWNAMINFTES", 5, 250, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, MyGlb.PANEL_LIST, 412, 408, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, MyGlb.PANEL_FORM, 416, 440, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE2, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_NOTE2, -1, GRP_ORDINDARITEN_ORDINATIVO);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_NOTE2, -1, "", "NOTE2", 0, 0, 0, -13997);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, MyGlb.PANEL_LIST, 420, 416, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDARITEN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, MyGlb.PANEL_FORM, 416, 464, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDARITEN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDARITEN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDARITEN_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDARITEN.SetFieldPage(PFL_ORDINDARITEN_NOTE1, -1, GRP_ORDINDARITEN_ORDINATIVO);
    PAN_ORDINDARITEN.SetFieldPanel(PFL_ORDINDARITEN_NOTE1, -1, "", "NOTE1", 0, 0, 0, -13997);
  }

  private void PAN_ORDINDARITEN_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINDARITEN.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMECAUSA~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMECAUSA~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_ORDINDARITEN.SetQuery(PPQRY_T58, 0, SQL, PFL_ORDINDARITEN_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ORDINDARITEN.SetQuery(PPQRY_T58, 1, SQL, PFL_ORDINDARITEN_CAUSALE, "");
    PAN_ORDINDARITEN.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEBOLLO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEBOLLO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_ORDINDARITEN.SetQuery(PPQRY_T60, 0, SQL, PFL_ORDINDARITEN_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ORDINDARITEN.SetQuery(PPQRY_T60, 1, SQL, PFL_ORDINDARITEN_BOLLO, "");
    PAN_ORDINDARITEN.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUFFIC~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_ORDINDARITEN.SetQuery(PPQRY_T53, 0, SQL, PFL_ORDINDARITEN_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ORDINDARITEN.SetQuery(PPQRY_T53, 1, SQL, PFL_ORDINDARITEN_UFFICIO, "");
    PAN_ORDINDARITEN.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~ROWNAMESPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINDARITEN.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_ORDINDARITEN_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ORDINDARITEN.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_ORDINDARITEN_SPESE, "");
    PAN_ORDINDARITEN.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINDARITEN.SetIMDB(IMDB, "PQRY_ORDINDARITE2", true);
    PAN_ORDINDARITEN.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ORDINDARITEN.SetQueryIMDB(PPQRY_ORDINDARITE2, IMDBDef15.PQRY_ORDINDARITE2_RS, IMDBDef6.TBL_ORDINDARITE3);
    JustLoaded = true;
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_TIPORITENUTA, IMDBDef6.FLD_ORDINDARITE3_ROWNAMTIPRIT);
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_DAL, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEDAL);
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_AL, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEAL);
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_DATA, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEDATA);
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_CAUSALE, IMDBDef6.FLD_ORDINDARITE3_ROWNAMECAUSA);
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_BOLLO, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEBOLLO);
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_UFFICIO, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEUFFIC);
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_EMAUVPMDSASC, IMDBDef6.FLD_ORDINDARITE3_RNEAVPMDSASC);
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_UNORDIPERBEN, IMDBDef6.FLD_ORDINDARITE3_RONAUNORPEBE);
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_SPESE, IMDBDef6.FLD_ORDINDARITE3_ROWNAMESPESE);
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_COMMISSIONI, IMDBDef6.FLD_ORDINDARITE3_ROWNAMECOMMI);
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_ALLEGATI, IMDBDef6.FLD_ORDINDARITE3_ROWNAMEALLEG);
    PAN_ORDINDARITEN.SetFieldPrimaryIndex(PFL_ORDINDARITEN_INFOTESORIER, IMDBDef6.FLD_ORDINDARITE3_ROWNAMINFTES);
    PAN_ORDINDARITEN.SetMasterTable(0, "ORDINDARITE3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDINDARITEN.Status() == 2)
    {
      int oldListQBE = PAN_ORDINDARITEN.iUseListQBE;
      PAN_ORDINDARITEN.iUseListQBE = 0;
      PAN_ORDINDARITEN.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINDARITEN.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINDARITEN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINDARITEN) PAN_ORDINDARITEN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINDARITEN) PAN_ORDINDARITEN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINDARITEN) PAN_ORDINDARITEN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINDARITEN) PAN_ORDINDARITEN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDINDARITEN) PAN_ORDINDARITEN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
