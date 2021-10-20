// **********************************************
// Emissione Manuale Distinta
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneManualeDistinta extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_DATAMANDATO = 0;
  private static int GRP_PARAMETRI_NUMEROMANDAT = 1;

  private static int PFL_PARAMETRI_DAL1 = 0;
  private static int PFL_PARAMETRI_AL1 = 1;
  private static int PFL_PARAMETRI_DAL = 2;
  private static int PFL_PARAMETRI_AL = 3;
  private static int PFL_PARAMETRI_NUMERO = 4;
  private static int PFL_PARAMETRI_DATA2 = 5;
  private static int PFL_PARAMETRI_TOTALINEMISS = 6;
  private static int PFL_PARAMETRI_ELENCOMANDAT = 7;

  private static int PPQRY_PARAMETRI293 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_EMISMANUDIST_NUMEROMAND = 0;
  private static int PFL_EMISMANUDIST_DDATAMAND = 1;
  private static int PFL_EMISMANUDIST_INFOMANDATO1 = 2;
  private static int PFL_EMISMANUDIST_IMPORTO = 3;
  private static int PFL_EMISMANUDIST_UFFICIO1 = 4;
  private static int PFL_EMISMANUDIST_BOLLO1 = 5;
  private static int PFL_EMISMANUDIST_VOCEEC = 6;
  private static int PFL_EMISMANUDIST_TIPOVINCOLO1 = 7;
  private static int PFL_EMISMANUDIST_CAPITOLO = 8;
  private static int PFL_EMISMANUDIST_ARTICOLO = 9;
  private static int PFL_EMISMANUDIST_INFOVOCEPEG1 = 10;
  private static int PFL_EMISMANUDIST_NUMEROIMP = 11;
  private static int PFL_EMISMANUDIST_ANNOIMP = 12;
  private static int PFL_EMISMANUDIST_INFOIMPEGNO1 = 13;
  private static int PFL_EMISMANUDIST_MANDATOLABEL = 14;
  private static int PFL_EMISMANUDIST_CAPITARTLABE = 15;
  private static int PFL_EMISMANUDIST_IMPEGNOLABEL = 16;
  private static int PFL_EMISMANUDIST_UFFICIO = 17;
  private static int PFL_EMISMANUDIST_BOLLO = 18;
  private static int PFL_EMISMANUDIST_TIPOVINCOLO = 19;
  private static int PFL_EMISMANUDIST_ANNOMAND = 20;

  private static int PPQRY_MAN6 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_EMISMANUDIST;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI342(IMDB);
    //
    //
    Init_PQRY_MAN6(IMDB);
    Init_PQRY_PARAMETRI293(IMDB);
    Init_PQRY_PARAMETRI293_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI342(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI342, 6);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI342, "TBL_PARAMETRI342");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI342,IMDBDef5.FLD_PARAMETRI342_ROWNAMDAMADA, "ROWNAMDAMADA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI342,IMDBDef5.FLD_PARAMETRI342_ROWNAMDAMADA,6,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI342,IMDBDef5.FLD_PARAMETRI342_ROWNAMDAMAAL, "ROWNAMDAMAAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI342,IMDBDef5.FLD_PARAMETRI342_ROWNAMDAMAAL,6,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI342,IMDBDef5.FLD_PARAMETRI342_ROWNAMNUMADA, "ROWNAMNUMADA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI342,IMDBDef5.FLD_PARAMETRI342_ROWNAMNUMADA,1,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI342,IMDBDef5.FLD_PARAMETRI342_ROWNAMNUMAAL, "ROWNAMNUMAAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI342,IMDBDef5.FLD_PARAMETRI342_ROWNAMNUMAAL,1,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI342,IMDBDef5.FLD_PARAMETRI342_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI342,IMDBDef5.FLD_PARAMETRI342_ROWNAMENUMER,1,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI342,IMDBDef5.FLD_PARAMETRI342_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI342,IMDBDef5.FLD_PARAMETRI342_ROWNAMEDATA,6,15,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI342, 0);
  }

  private static void Init_PQRY_MAN6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_MAN6, 15);
    IMDB.set_TblCode(IMDBDef14.PQRY_MAN6, "PQRY_MAN6");
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_MANBOLLO, "MANBOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_MANBOLLO,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_MANTIPOVINCO, "MANTIPOVINCO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_MANTIPOVINCO,5,50,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_MANUFFICIO, "MANUFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_MANUFFICIO,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN6,IMDBDef14.PQSL_MAN6_D_DATA_MAND,6,19,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_MAN6, 0);
  }

  private static void Init_PQRY_PARAMETRI293(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI293, 6);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI293, "PQRY_PARAMETRI293");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI293,IMDBDef14.PQSL_PARAMETRI293_ROWNAMDAMADA, "ROWNAMDAMADA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI293,IMDBDef14.PQSL_PARAMETRI293_ROWNAMDAMADA,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI293,IMDBDef14.PQSL_PARAMETRI293_ROWNAMDAMAAL, "ROWNAMDAMAAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI293,IMDBDef14.PQSL_PARAMETRI293_ROWNAMDAMAAL,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI293,IMDBDef14.PQSL_PARAMETRI293_ROWNAMNUMADA, "ROWNAMNUMADA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI293,IMDBDef14.PQSL_PARAMETRI293_ROWNAMNUMADA,1,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI293,IMDBDef14.PQSL_PARAMETRI293_ROWNAMNUMAAL, "ROWNAMNUMAAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI293,IMDBDef14.PQSL_PARAMETRI293_ROWNAMNUMAAL,1,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI293,IMDBDef14.PQSL_PARAMETRI293_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI293,IMDBDef14.PQSL_PARAMETRI293_ROWNAMENUMER,1,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI293,IMDBDef14.PQSL_PARAMETRI293_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI293,IMDBDef14.PQSL_PARAMETRI293_ROWNAMEDATA,6,15,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI293, 0);
  }

  private static void Init_PQRY_PARAMETRI293_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI293_RS, 6);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI293_RS, "PQRY_PARAMETRI293_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI293_RS,IMDBDef14.PQSL_PARAMETRI293_ROWNAMDAMADA, "ROWNAMDAMADA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI293_RS,IMDBDef14.PQSL_PARAMETRI293_ROWNAMDAMADA,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI293_RS,IMDBDef14.PQSL_PARAMETRI293_ROWNAMDAMAAL, "ROWNAMDAMAAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI293_RS,IMDBDef14.PQSL_PARAMETRI293_ROWNAMDAMAAL,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI293_RS,IMDBDef14.PQSL_PARAMETRI293_ROWNAMNUMADA, "ROWNAMNUMADA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI293_RS,IMDBDef14.PQSL_PARAMETRI293_ROWNAMNUMADA,1,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI293_RS,IMDBDef14.PQSL_PARAMETRI293_ROWNAMNUMAAL, "ROWNAMNUMAAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI293_RS,IMDBDef14.PQSL_PARAMETRI293_ROWNAMNUMAAL,1,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI293_RS,IMDBDef14.PQSL_PARAMETRI293_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI293_RS,IMDBDef14.PQSL_PARAMETRI293_ROWNAMENUMER,1,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI293_RS,IMDBDef14.PQSL_PARAMETRI293_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI293_RS,IMDBDef14.PQSL_PARAMETRI293_ROWNAMEDATA,6,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneManualeDistinta(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneManualeDistinta()
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
    FormIdx = MyGlb.FRM_EMISMANUDIST;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "686B7AFA-B3A1-41D3-8BC3-BC3C9F633C88";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 764;
    DesignHeight = 526;
    set_Caption(new IDVariant("Emissione Manuale Distinta"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 764;
    Frames[1].Height = 500;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.264;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 764;
    Frames[2].Height = 132;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 764;
    Frames[2].FixedHeight = 132;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 764-MyGlb.PAN_OFFS_X, 132-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3EF6C056-124F-450A-B392-87140631EB38");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 456, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 764;
    Frames[3].Height = 368;
    Frames[3].Caption = "Emissione Manuale Distinta";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 368;
    PAN_EMISMANUDIST = new IDPanel(w, this, 3, "PAN_EMISMANUDIST");
    Frames[3].Content = PAN_EMISMANUDIST;
    PAN_EMISMANUDIST.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_EMISMANUDIST.VS = MainFrm.VisualStyleList;
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 764-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AE875E40-F5C9-4185-A844-CDDB868DAAF2");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1020, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_EMISMANUDIST.InitStatus = 1;
    PAN_EMISMANUDIST_Init();
    PAN_EMISMANUDIST_InitFields();
    PAN_EMISMANUDIST_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA9+BaseCmdLinIdx)
      {
        Salva();
        break fine;
      }
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI342, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISMANUDIST_PARAMETRI293();
      }
      PAN_EMISMANUDIST.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof EmissioneManualeDistinta);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneManualeDistinta.class.getName() : (Glb.ClassWithPackage(EmissioneManualeDistinta.class) ? EmissioneManualeDistinta.class.getName().substring(EmissioneManualeDistinta.class.getPackage().getName().length() + 1) : EmissioneManualeDistinta.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Info Man
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoMan ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Man Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMANNMAN, 0, IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_ANNO_MAND, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMNUMMAN, 0, IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_NUMERO_MAND, 0));
      MainFrm.Show(MyGlb.FRM_INFORMMANDAT, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "InfoMan", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce Peg
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Peg Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "InfoVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_NUMERO_IMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Importo Totale
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaImportoTotale ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TOTALEIMPORT = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_TOT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NUMERORIGA = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      v_TOT = (new IDVariant("Totale: ", IDVariant.STRING));
      v_NUMERORIGA = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Setta Importo Totale Body
      // Procedure Body
      // 
      C2 = PAN_EMISMANUDIST.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_EMISMANUDIST.GotoFirst();
      while (!PAN_EMISMANUDIST.RSEOF())
      {
        if (PAN_EMISMANUDIST.IsRowSelected(v_NUMERORIGA.intValue()))
        {
          v_TOTALEIMPORT = IDL.Add(v_TOTALEIMPORT, IDL.NullValue(C2.Get("IMPORTO"),(new IDVariant(0))));
        }
        v_NUMERORIGA = IDL.Add(v_NUMERORIGA, (new IDVariant(1)));
        PAN_EMISMANUDIST.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_TOTALINEMISS, IDL.Add(v_TOT, IDL.Format(IDL.NullValue(v_TOTALEIMPORT,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "SettaImportoTotale", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Conferma Salvataggio
  // Explain which processing is carried out by this procedure
  // Messaggio:  - Input
  // **********************************************************************
  public boolean ConfermaSalvataggio (IDVariant Messaggio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SALVATO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Conferma Salvataggio Body
      // Procedure Body
      // 
      if (!(MainFrm.MessageConfirm(Messaggio)))
      {
        v_SALVATO = (new IDVariant(0));
        return v_SALVATO.booleanValue();
      }
      v_SALVATO = (new IDVariant(-1));
      return v_SALVATO.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "ConfermaSalvataggio", _e);
      return false;
    }
  }

  // **********************************************************************
  // Elenco Mandati
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ElencoMandati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Mandati Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_ELENMANINDIS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "ElencoMandati", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Salva
  // **********************************************************************
  public int Salva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C7;

    try
    {
      TransCount = 0;
      // 
      // Salva Body
      // Procedure Body
      // 
      if (ControlloRecordSelezionati())
      {
        if (ControlliBloccanti())
        {
          IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NUMERODISTIN = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_SELEZIONE = new IDVariant(0,IDVariant.INTEGER);
          v_SELEZIONE = (new IDVariant(1, IDVariant.INTEGER));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  MAN A ");
          SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMENUMER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.D_DATA_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMEDATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTA.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Sulla distinta sono già presenti mandati. Si conferma l'elaborazione?", IDVariant.STRING));
            if (!(ConfermaSalvataggio(v_SMS)))
            {
              return 0;
            }
          }
          MainFrm.Cf4armDBObject.BeginTrans();
          C7 = PAN_EMISMANUDIST.MasterRS();
          if (C7.size()>0) CurPos = C7.getRow(); else CurPos = 0;
          if (!C7.Bof()) PAN_EMISMANUDIST.GotoFirst();
          while (!PAN_EMISMANUDIST.RSEOF())
          {
            if (PAN_EMISMANUDIST.IsRowSelected(v_SELEZIONE.intValue()))
            {
              if (C7.Get("D_DATA_MAND").compareTo(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMEDATA, 0), true)>0)
              {
                MainFrm.set_AlertMessage(IDL.Add(IDL.Add((new IDVariant("Data Mandato ")), IDL.ToString(C7.Get("NUMERO_MAND"))), (new IDVariant(" superiore alla data della distinta")))); 
                MainFrm.Cf4armDBObject.RollbackTrans();
                return 0;
              }
              try
              {
                SQL = new StringBuffer();
                SQL.append("update MAN set ");
                SQL.append("  ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  NUMERO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMENUMER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  D_DATA_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMEDATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
                SQL.append("where (ANNO_MAND = " + IDL.CSql(C7.Get("ANNO_MAND"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NUMERO_MAND = " + IDL.CSql(C7.Get("NUMERO_MAND"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              catch (Exception e12)
              {
                MainFrm.set_AlertMessage(new IDVariant(e12.getMessage())); 
                MainFrm.Cf4armDBObject.RollbackTrans();
                return 0;
              }
            }
            v_SELEZIONE = IDL.Add(v_SELEZIONE, (new IDVariant(1)));
            PAN_EMISMANUDIST.GotoNext();
          }
          if (CurPos>0) C7.absolute(CurPos);
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          v_NUMERODISTIN = IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMENUMER, 0);
          MainFrm.Cf4armDBObject.N04NUMERAZIONEMANUALE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_NUMERODISTIN);
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          MainFrm.Cf4armDBObject.CommitTrans();
          PAN_EMISMANUDIST.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli Bloccanti
  // **********************************************************************
  public boolean ControlliBloccanti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SALVARE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controlli Bloccanti Body
      // Procedure Body
      // 
      v_SALVARE = (new IDVariant(0));
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMENUMER, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMEDATA, 0)))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Dati distinta incompleti", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        v_SALVARE = (new IDVariant(0));
        return v_SALVARE.booleanValue();
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  MAN A ");
      SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ELENCO > " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMENUMER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.D_DATA_ELENCO < " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMEDATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTA.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Data distinta superiore alla data di una distinta successiva", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        v_SALVARE = (new IDVariant(0));
        return v_SALVARE.booleanValue();
      }
      v_CONTA = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  MAN A ");
      SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ELENCO < " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMENUMER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.D_DATA_ELENCO > " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMEDATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTA.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Data distinta inferiore alla data di una distinta precedente", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        v_SALVARE = (new IDVariant(0));
        return v_SALVARE.booleanValue();
      }
      v_CONTA = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  MAN A ");
      SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMENUMER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.D_DATA_ELENCO <> " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI293, IMDBDef14.PQSL_PARAMETRI293_ROWNAMEDATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTA.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Distinta già emessa con data diversa", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        v_SALVARE = (new IDVariant(0));
        return v_SALVARE.booleanValue();
      }
      v_SALVARE = (new IDVariant(-1));
      return v_SALVARE.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "ControlliBloccanti", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controllo Record Selezionati
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public boolean ControlloRecordSelezionati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ESISTENZA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RIGASELEZION = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      v_RIGASELEZION = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Controllo Record Selezionati Body
      // Procedure Body
      // 
      C2 = PAN_EMISMANUDIST.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_EMISMANUDIST.GotoFirst();
      while (!PAN_EMISMANUDIST.RSEOF())
      {
        if (PAN_EMISMANUDIST.IsRowSelected(v_RIGASELEZION.intValue()))
        {
          v_ESISTENZA = (new IDVariant(-1));
          break;
        }
        v_RIGASELEZION = IDL.Add(v_RIGASELEZION, (new IDVariant(1)));
        PAN_EMISMANUDIST.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      return v_ESISTENZA.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "ControlloRecordSelezionati", _e);
      return false;
    }
  }

  // **********************************************************************
  // Emissione Manuale Distinta On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_EMISMANUDIST_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissione Manuale Distinta On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_EMISMANUDIST.Freezed = (new IDVariant(-1)).booleanValue();
      }
      else
      {
        PAN_EMISMANUDIST.Freezed = (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "EmissioneManualeDistintaOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Manuale Distinta After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_EMISMANUDIST_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissione Manuale Distinta After Find Event Body
      // Procedure Body
      // 
      SettaImportoTotale();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "EmissioneManualeDistintaAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Manuale Distinta On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_EMISMANUDIST_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_EMISMANUDIST);
      // 
      // Emissione Manuale Distinta On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_EMISMANUDIST.set_ToolTip(Glb.OBJ_FIELD,PFL_EMISMANUDIST_BOLLO1,IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_MANBOLLO, 0).stringValue()); 
      PAN_EMISMANUDIST.set_ToolTip(Glb.OBJ_FIELD,PFL_EMISMANUDIST_UFFICIO1,IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_MANUFFICIO, 0).stringValue()); 
      PAN_EMISMANUDIST.set_ToolTip(Glb.OBJ_FIELD,PFL_EMISMANUDIST_TIPOVINCOLO1,IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_MANTIPOVINCO, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "EmissioneManualeDistintaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Manuale Distinta On Change Selection Event
  // Evento notificato dal pannello quando in un pannello
  // con multi-selezione le righe selezionate cambiano.
  // Selected: E' un valore booleano che vale True se la riga per cui viene chiamato l'evento è stata selezionata. I dati della riga per cui viene chiamato l'evento sono disponibili, come al solito, nella tabella IMDB sottesa al pannello. - Input
  // Final: Questo evento viene chiamato per ogni riga per cui cambia lo stato di selezionato, più una volta al termine dell'operazione. Durante quest'ultima chiamata il parametro Final vale True. - Input
  // Cancel: Può essere impostato a True per evitare il cambio di selezione (vale solo se Final = false). - Input/Output
  // **********************************************************************
  private void PAN_EMISMANUDIST_OnChangeSelection(IDVariant Selected, IDVariant Final, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissione Manuale Distinta On Change Selection Event Body
      // Procedure Body
      // 
      SettaImportoTotale();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "EmissioneManualeDistintaOnChangeSelectionEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NUMEROMANDAT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TOT = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Emissione Manuale Distinta", IDVariant.STRING));
      v_TOT = (new IDVariant("Totale: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_TOTALINEMISS, IDL.Add(v_TOT, IDL.Format((new IDVariant(0)), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      // 
      // etichette superflue
      // 
      {
      }
      PAN_EMISMANUDIST.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI342, IMDBDef5.FLD_PARAMETRI342_ROWNAMEDATA, 0, IDL.Today());
      PAN_EMISMANUDIST.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_EMISMANUDIST.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_EMISMANUDIST.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.ELENCO_MANDATI) as MAXN04ELEMAN ");
      SQL.append("from ");
      SQL.append("  N04 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMEROMANDAT = QV.Get("MAXN04ELEMAN", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI342, IMDBDef5.FLD_PARAMETRI342_ROWNAMENUMER, 0, IDL.Add(v_NUMEROMANDAT, (new IDVariant(1))));
      PAN_EMISMANUDIST.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeDistinta", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void EMISMANUDIST_PARAMETRI293() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI293_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI342, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI342, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI293_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI293_RS, 0, IMDBDef5.TBL_PARAMETRI342, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI293_RS, 0, 0, IMDBDef5.TBL_PARAMETRI342, IMDBDef5.FLD_PARAMETRI342_ROWNAMDAMADA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI293_RS, 1, 0, IMDBDef5.TBL_PARAMETRI342, IMDBDef5.FLD_PARAMETRI342_ROWNAMDAMAAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI293_RS, 2, 0, IMDBDef5.TBL_PARAMETRI342, IMDBDef5.FLD_PARAMETRI342_ROWNAMNUMADA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI293_RS, 3, 0, IMDBDef5.TBL_PARAMETRI342, IMDBDef5.FLD_PARAMETRI342_ROWNAMNUMAAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI293_RS, 4, 0, IMDBDef5.TBL_PARAMETRI342, IMDBDef5.FLD_PARAMETRI342_ROWNAMENUMER, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI293_RS, 5, 0, IMDBDef5.TBL_PARAMETRI342, IMDBDef5.FLD_PARAMETRI342_ROWNAMEDATA, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI342, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI342, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI342, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI293_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_ELENCOMANDAT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ElencoMandati();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_EMISMANUDIST_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_EMISMANUDIST, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_EMISMANUDIST_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_EMISMANUDIST, Cancel);
    // Stub
  }

  private void PAN_EMISMANUDIST_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_EMISMANUDIST_INFOMANDATO1)
    {
      this.IdxPanelActived = this.PAN_EMISMANUDIST.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoMan();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISMANUDIST_INFOVOCEPEG1)
    {
      this.IdxPanelActived = this.PAN_EMISMANUDIST.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISMANUDIST_INFOIMPEGNO1)
    {
      this.IdxPanelActived = this.PAN_EMISMANUDIST.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_EMISMANUDIST_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_EMISMANUDIST_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_D_DATA_MAND, 0)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_MAN6, IMDBDef14.PQSL_MAN6_D_DATA_MAND, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_EMISMANUDIST_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_EMISMANUDIST_Init()
  {

    PAN_EMISMANUDIST.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_EMISMANUDIST.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_EMISMANUDIST.SetSize(MyGlb.OBJ_FIELD, 21);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, "85DFB2C6-67A6-49AD-B5A3-4A122AE76638");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, "NUMERO MAND");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, "CA35ADF0-C9D2-4D3B-AE85-94300C8045E1");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, "D DATA MAND");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, "F5B03A7C-DC70-42E4-9913-9BAAA371D8BB");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, "Info Mandato 1");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, MyGlb.VIS_HYPLINIMLOU1);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, "36558EAA-6F3C-4156-BB9F-095DDC245FDB");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, "Importo");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, "Importo");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, "F01B99F8-5426-4FF8-B905-0982B35737C2");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, "Ufficio");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, "Ufficio");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, "A246E8D2-5478-41BB-8818-D6FD306C6EE8");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, "Bollo");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, "Bollo");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, "0EAA0F46-CEED-4BEE-8BAC-E0C72432441D");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, "Voce Ec.");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, "E96AF217-BB54-4C1A-9DAD-20135989C424");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, "Tipo Vincolo");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, "Tipo Vincolo");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, "67DDD434-A2C2-4578-9F50-6CD8CE0E30AE");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, "CAPITOLO");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, "47BAC505-F28D-480C-A92F-9FAF0B8B75E8");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, "ARTICOLO");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, "A734130A-25D0-40CE-AA47-A877E6A88B3F");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, "Info Voce Peg 1");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, MyGlb.VIS_HYPLINIMLOU1);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, "55456A58-463F-469C-9D38-CAF4EA3EF8E4");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, "NUMERO IMP");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, "C052AD59-23E8-491A-AEE9-5F3CA68CB034");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, "ANNO IMP");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, "5303E4E4-81E6-4626-928F-8214CB8F8229");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, "Info Impegno 1");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, MyGlb.VIS_HYPLINIMLOU1);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_MANDATOLABEL, "4AF9824F-193E-4BE9-B911-C6BB71104B1A");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_MANDATOLABEL, "Mandato");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_MANDATOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_MANDATOLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITARTLABE, "17D95D98-1D5C-479C-8099-5B37C415C2B7");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITARTLABE, "Capitolo/Art.");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITARTLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITARTLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPEGNOLABEL, "6529D7FD-A92D-4A71-AA8A-8B6B4F748B4D");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPEGNOLABEL, "Impegno");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPEGNOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPEGNOLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, "07D2C692-3B55-42E7-AE11-3890B764ED12");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, "UFFICIO");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, "0A60C8ED-FAB6-445E-A342-24097B3D3C60");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, "BOLLO");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, "72BE3763-17CC-4ED7-8FF2-C84019B27BCD");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, "TIPO VINCOLO");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUDIST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, "D2B1E3F4-1EF0-4F44-A186-F971423CA4A4");
    PAN_EMISMANUDIST.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, "ANNO MAND");
    PAN_EMISMANUDIST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, "");
    PAN_EMISMANUDIST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_EMISMANUDIST.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_EMISMANUDIST_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, MyGlb.PANEL_LIST, "NUM. MAND");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, MyGlb.PANEL_FORM, 4, 1396, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, MyGlb.PANEL_FORM, 84);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROMAND, MyGlb.PANEL_FORM, "NUM. MAND");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_NUMEROMAND, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_NUMEROMAND, PPQRY_MAN6, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, MyGlb.PANEL_LIST, 52, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, MyGlb.PANEL_LIST, 80);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, MyGlb.PANEL_LIST, "D DATA MAND");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, MyGlb.PANEL_FORM, 4, 1444, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, MyGlb.PANEL_FORM, 80);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_DDATAMAND, MyGlb.PANEL_FORM, "D DT. MAND");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_DDATAMAND, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_DDATAMAND, PPQRY_MAN6, "A.D_DATA_MAND", "D_DATA_MAND", 6, 19, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, MyGlb.PANEL_LIST, 120, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, MyGlb.PANEL_LIST, 120);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, MyGlb.PANEL_LIST, "I. M. 1");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, MyGlb.PANEL_FORM, 4, 1468, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, MyGlb.PANEL_FORM, 120);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, MyGlb.PANEL_FORM, 2);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOMANDATO1, MyGlb.PANEL_FORM, "Info Mandato 1");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_INFOMANDATO1, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_INFOMANDATO1, PPQRY_DUAL, "DECODE(~~NUMERO_MAND~~, to_number(NULL), NULL, 'I')", "INFOMANDATO", 5, 99, 0, -13997);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOMANDATO1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, MyGlb.PANEL_LIST, 144, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, MyGlb.PANEL_FORM, 4, 196, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_IMPORTO, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_IMPORTO, PPQRY_MAN6, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, MyGlb.PANEL_LIST, 224, 36, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, MyGlb.PANEL_LIST, 76);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, MyGlb.PANEL_LIST, "Ufficio");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, MyGlb.PANEL_FORM, 4, 1108, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, MyGlb.PANEL_FORM, 76);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO1, MyGlb.PANEL_FORM, "Ufficio");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_UFFICIO1, -1, -1);
    PAN_EMISMANUDIST.SetFieldUnbound(PFL_EMISMANUDIST_UFFICIO1, true);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_UFFICIO1, PPQRY_MAN6, "D.DESCRIZIONE", "MANUFFICIO", 5, 60, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, MyGlb.PANEL_LIST, 396, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, MyGlb.PANEL_LIST, 76);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, MyGlb.PANEL_LIST, "Bollo");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, MyGlb.PANEL_FORM, 4, 556, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, MyGlb.PANEL_FORM, 76);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO1, MyGlb.PANEL_FORM, "Bollo");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_BOLLO1, -1, -1);
    PAN_EMISMANUDIST.SetFieldUnbound(PFL_EMISMANUDIST_BOLLO1, true);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_BOLLO1, PPQRY_MAN6, "B.DESCRIZIONE", "MANBOLLO", 5, 40, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, MyGlb.PANEL_LIST, 556, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, MyGlb.PANEL_LIST, 68);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, MyGlb.PANEL_LIST, "Voce Ec.");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, MyGlb.PANEL_FORM, 4, 580, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, MyGlb.PANEL_FORM, 68);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_VOCEEC, MyGlb.PANEL_FORM, "Voce Ec.");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_VOCEEC, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_VOCEEC, PPQRY_MAN6, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, MyGlb.PANEL_LIST, 612, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, MyGlb.PANEL_LIST, 76);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, MyGlb.PANEL_FORM, 4, 628, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, MyGlb.PANEL_FORM, 76);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO1, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_TIPOVINCOLO1, -1, -1);
    PAN_EMISMANUDIST.SetFieldUnbound(PFL_EMISMANUDIST_TIPOVINCOLO1, true);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_TIPOVINCOLO1, PPQRY_MAN6, "C.DESCRIZIONE", "MANTIPOVINCO", 5, 50, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, MyGlb.PANEL_LIST, 752, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, MyGlb.PANEL_FORM, 4, 268, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_CAPITOLO, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_CAPITOLO, PPQRY_MAN6, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, MyGlb.PANEL_LIST, 856, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, MyGlb.PANEL_FORM, 4, 292, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_ARTICOLO, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_ARTICOLO, PPQRY_MAN6, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, MyGlb.PANEL_LIST, 876, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, MyGlb.PANEL_LIST, 120);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, MyGlb.PANEL_LIST, "I. V. P. 1");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, MyGlb.PANEL_FORM, 4, 1516, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, MyGlb.PANEL_FORM, 120);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, MyGlb.PANEL_FORM, 2);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOVOCEPEG1, MyGlb.PANEL_FORM, "Info Voce Peg 1");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_INFOVOCEPEG1, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_INFOVOCEPEG1, PPQRY_DUAL, "DECODE(~~CAPITOLO~~, to_number(NULL), NULL, 'I')", "INFOCAPITOLO", 5, 99, 0, -13997);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOVOCEPEG1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, MyGlb.PANEL_LIST, 900, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, MyGlb.PANEL_FORM, 4, 316, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_NUMEROIMP, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_NUMEROIMP, PPQRY_MAN6, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, MyGlb.PANEL_LIST, 956, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, MyGlb.PANEL_FORM, 4, 340, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_ANNOIMP, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_ANNOIMP, PPQRY_MAN6, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, MyGlb.PANEL_LIST, 996, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, MyGlb.PANEL_LIST, 120);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, MyGlb.PANEL_LIST, "I. I. 1");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, MyGlb.PANEL_FORM, 4, 1564, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, MyGlb.PANEL_FORM, 120);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, MyGlb.PANEL_FORM, 2);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_INFOIMPEGNO1, MyGlb.PANEL_FORM, "Info Impegno 1");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_INFOIMPEGNO1, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_INFOIMPEGNO1, PPQRY_DUAL, "DECODE(~~NUMERO_IMP~~, to_number(NULL), NULL, 'I')", "INFOIMPEGNO", 5, 99, 0, -13997);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_EMISMANUDIST.SetValueListItem(PFL_EMISMANUDIST_INFOIMPEGNO1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_MANDATOLABEL, MyGlb.PANEL_LIST, 0, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_MANDATOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_MANDATOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_MANDATOLABEL, MyGlb.PANEL_FORM, 40, 0, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_MANDATOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_MANDATOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_MANDATOLABEL, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_MANDATOLABEL, -1, "", "MANDATOLABEL", 0, 0, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITARTLABE, MyGlb.PANEL_LIST, 752, 0, 152, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITARTLABE, MyGlb.PANEL_LIST, 0);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITARTLABE, MyGlb.PANEL_LIST, 2);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITARTLABE, MyGlb.PANEL_FORM, 64, 24, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITARTLABE, MyGlb.PANEL_FORM, 0);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_CAPITARTLABE, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_CAPITARTLABE, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_CAPITARTLABE, -1, "", "CAPITARTLABE", 0, 0, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPEGNOLABEL, MyGlb.PANEL_LIST, 904, 0, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPEGNOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPEGNOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPEGNOLABEL, MyGlb.PANEL_FORM, 72, 32, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPEGNOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_IMPEGNOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_IMPEGNOLABEL, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_IMPEGNOLABEL, -1, "", "IMPEGNOLABEL", 0, 0, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, MyGlb.PANEL_LIST, 2960, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, MyGlb.PANEL_LIST, 52);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, MyGlb.PANEL_LIST, "UFFICIO");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, MyGlb.PANEL_FORM, 4, 1324, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_UFFICIO, MyGlb.PANEL_FORM, "UFFICIO");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_UFFICIO, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_UFFICIO, PPQRY_MAN6, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, MyGlb.PANEL_LIST, 3012, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, MyGlb.PANEL_LIST, 40);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, MyGlb.PANEL_LIST, "BOL.");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, MyGlb.PANEL_FORM, 4, 1348, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, MyGlb.PANEL_FORM, 40);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_BOLLO, MyGlb.PANEL_FORM, "BOL.");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_BOLLO, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_BOLLO, PPQRY_MAN6, "A.BOLLO", "BOLLO", 1, 2, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, MyGlb.PANEL_LIST, 3052, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, MyGlb.PANEL_LIST, "TIPO VINCOLO");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 1372, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, MyGlb.PANEL_FORM, 80);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_TIPOVINCOLO, MyGlb.PANEL_FORM, "TP. VINCOLO");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_TIPOVINCOLO, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_TIPOVINCOLO, PPQRY_MAN6, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_EMISMANUDIST.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, MyGlb.PANEL_FORM, 4, 1468, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUDIST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_EMISMANUDIST.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUDIST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUDIST_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_EMISMANUDIST.SetFieldPage(PFL_EMISMANUDIST_ANNOMAND, -1, -1);
    PAN_EMISMANUDIST.SetFieldPanel(PFL_EMISMANUDIST_ANNOMAND, PPQRY_MAN6, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
  }

  private void PAN_EMISMANUDIST_InitQueries()
  {
    StringBuffer SQL;

    PAN_EMISMANUDIST.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~NUMERO_MAND~~, to_number(NULL), NULL, 'I') as INFOMANDATO, ");
    SQL.append("  DECODE(~~CAPITOLO~~, to_number(NULL), NULL, 'I') as INFOCAPITOLO, ");
    SQL.append("  DECODE(~~NUMERO_IMP~~, to_number(NULL), NULL, 'I') as INFOIMPEGNO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_EMISMANUDIST.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_EMISMANUDIST.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISMANUDIST.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_EMISMANUDIST.SetIMDB(IMDB, "PQRY_MAN6", true);
    PAN_EMISMANUDIST.set_SetString(MyGlb.MASTER_ROWNAME, "MAN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  B.DESCRIZIONE as MANBOLLO, ");
    SQL.append("  A.VOCE_ECON as VOCE_ECON, ");
    SQL.append("  C.DESCRIZIONE as MANTIPOVINCO, ");
    SQL.append("  D.DESCRIZIONE as MANUFFICIO, ");
    SQL.append("  A.UFFICIO as UFFICIO, ");
    SQL.append("  A.BOLLO as BOLLO, ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  A.D_DATA_MAND as D_DATA_MAND ");
    PAN_EMISMANUDIST.SetQuery(PPQRY_MAN6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MAN A, ");
    SQL.append("  T60 B, ");
    SQL.append("  VINCOLI C, ");
    SQL.append("  T53 D ");
    PAN_EMISMANUDIST.SetQuery(PPQRY_MAN6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((~~PQRY_PARAMETRI293.ROWNAMDAMADA~~ IS NULL) OR A.D_DATA_MAND >= ~~PQRY_PARAMETRI293.ROWNAMDAMADA~~) ");
    SQL.append("and   ((~~PQRY_PARAMETRI293.ROWNAMDAMAAL~~ IS NULL) OR A.D_DATA_MAND <= ~~PQRY_PARAMETRI293.ROWNAMDAMAAL~~) ");
    SQL.append("and   (A.NUMERO_MAND >= NVL(~~PQRY_PARAMETRI293.ROWNAMNUMADA~~, 1)) ");
    SQL.append("and   (A.NUMERO_MAND <= NVL(~~PQRY_PARAMETRI293.ROWNAMNUMAAL~~, 99999)) ");
    SQL.append("and   ((A.ANNO_ELENCO IS NULL)) ");
    SQL.append("and   (B.CODICE(+) = A.BOLLO) ");
    SQL.append("and   (C.CODICE(+) = A.TIPO_VINCOLO) ");
    SQL.append("and   (D.CODICE(+) = A.UFFICIO) ");
    PAN_EMISMANUDIST.SetQuery(PPQRY_MAN6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EMISMANUDIST.SetQuery(PPQRY_MAN6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EMISMANUDIST.SetQuery(PPQRY_MAN6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_MAND, ");
    SQL.append("  A.NUMERO_MAND ");
    PAN_EMISMANUDIST.SetQuery(PPQRY_MAN6, 5, SQL, -1, "");
    PAN_EMISMANUDIST.SetQueryDB(PPQRY_MAN6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISMANUDIST.SetMasterTable(0, "MAN");
    PAN_EMISMANUDIST.AddToSortList(PFL_EMISMANUDIST_ANNOMAND, true);
    PAN_EMISMANUDIST.AddToSortList(PFL_EMISMANUDIST_NUMEROMAND, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_EMISMANUDIST.Status() == 2)
    {
      int oldListQBE = PAN_EMISMANUDIST.iUseListQBE;
      PAN_EMISMANUDIST.iUseListQBE = 0;
      PAN_EMISMANUDIST.PanelCommand(Glb.PCM_SEARCH);
      PAN_EMISMANUDIST.PanelCommand(Glb.PCM_FIND);
      PAN_EMISMANUDIST.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, "90D604DE-3EA0-40BB-B0D8-18ED108B5C55");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, "Data Mandato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, MyGlb.PANEL_LIST, 0, -9999, 84, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, MyGlb.PANEL_FORM, 264, 3, 248, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 0, 80);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, "E362B3FA-2374-413D-A655-CB65A6F4D542");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, "Numero Mandato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, MyGlb.PANEL_LIST, 208, -9999, 144, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, MyGlb.PANEL_FORM, 32, 3, 196, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, 0, 97);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "1C5C428D-7323-4F92-85E3-BE70AA9EC75E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "9E7F7EE9-6479-4A84-B281-9E01C436E098");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "24FDA505-72C6-4AD8-8379-E55E7ECC452A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "F27DB017-B458-4D33-B925-8EBE5D91358A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, "C446CF87-D6B5-4636-A955-E8DB61F8BCB2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, "Numero");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, "031EC1C4-874E-44BD-A22B-A0BFE6A2CFC2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, "Data");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, "6CE9EA86-1FFE-4859-969F-21CD84E16EDB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, "Totale");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.VIS_ETICGRASRIGH);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELENCOMANDAT, "A4C17E8F-D439-46E5-A422-6E629C12BAF3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELENCOMANDAT, "Mandati in Distinta");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELENCOMANDAT, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELENCOMANDAT, 0, "button_large.GIF", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELENCOMANDAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 268, 28, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL1, -1, GRP_PARAMETRI_DATAMANDATO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL1, PPQRY_PARAMETRI293, "A.ROWNAMDAMADA", "ROWNAMDAMADA", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 400, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL1, -1, GRP_PARAMETRI_DATAMANDATO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL1, PPQRY_PARAMETRI293, "A.ROWNAMDAMAAL", "ROWNAMDAMAAL", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 208, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 36, 28, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_NUMEROMANDAT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI293, "A.ROWNAMNUMADA", "ROWNAMNUMADA", 1, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 280, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 140, 28, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_NUMEROMANDAT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI293, "A.ROWNAMNUMAAL", "ROWNAMNUMAAL", 1, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_FORM, 12, 80, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERO, PPQRY_PARAMETRI293, "A.ROWNAMENUMER", "ROWNAMENUMER", 1, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_LIST, "Data");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_FORM, 144, 80, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_FORM, "Data");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATA2, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATA2, PPQRY_PARAMETRI293, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.PANEL_LIST, 532, 132, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.PANEL_FORM, 592, 80, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOTALINEMISS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOTALINEMISS, -1, "", "TOTALINEMISS", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELENCOMANDAT, MyGlb.PANEL_LIST, 264, 80, 108, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELENCOMANDAT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELENCOMANDAT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELENCOMANDAT, MyGlb.PANEL_FORM, 288, 80, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELENCOMANDAT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELENCOMANDAT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELENCOMANDAT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELENCOMANDAT, -1, "", "ELENCOMANDAT", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI293", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI293, IMDBDef14.PQRY_PARAMETRI293_RS, IMDBDef5.TBL_PARAMETRI342);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL1, IMDBDef5.FLD_PARAMETRI342_ROWNAMDAMADA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL1, IMDBDef5.FLD_PARAMETRI342_ROWNAMDAMAAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef5.FLD_PARAMETRI342_ROWNAMNUMADA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI342_ROWNAMNUMAAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERO, IMDBDef5.FLD_PARAMETRI342_ROWNAMENUMER);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATA2, IMDBDef5.FLD_PARAMETRI342_ROWNAMEDATA);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI342");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_EMISMANUDIST) PAN_EMISMANUDIST_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISMANUDIST) PAN_EMISMANUDIST_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_EMISMANUDIST) PAN_EMISMANUDIST_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISMANUDIST) PAN_EMISMANUDIST_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_EMISMANUDIST) PAN_EMISMANUDIST_OnChangeSelection(NewVal, Final, Cancel);
  }
  
  public void OnChangeLocking(IDPanel SrcObj, IDVariant NewLocking, IDVariant Cancel)
  {
  }
  
  public void OnChangeStatus(IDPanel SrcObj, IDVariant OldStatus)
  {
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_EMISMANUDIST) PAN_EMISMANUDIST_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_EMISMANUDIST) PAN_EMISMANUDIST_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_EMISMANUDIST) PAN_EMISMANUDIST_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
