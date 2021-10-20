// **********************************************
// Quadro Generale Riassuntivo Agg
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class QuadroGeneraleRiassuntivoAgg extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_VARIAZIONI = 0;
  private static int GRP_PARAMETRI_PROVVEDIMENT = 1;

  private static int PFL_PARAMETRI_VARIAZIONI = 0;
  private static int PFL_PARAMETRI_NEWPANELABE5 = 1;
  private static int PFL_PARAMETRI_DELIBERA = 2;
  private static int PFL_PARAMETRI_TRATTIDELIBE = 3;
  private static int PFL_PARAMETRI_NUMERODELIBE = 4;
  private static int PFL_PARAMETRI_BARRADELIBER = 5;
  private static int PFL_PARAMETRI_ANNODELIBERA = 6;
  private static int PFL_PARAMETRI_APRISCELDELI = 7;
  private static int PFL_PARAMETRI_APRIINFODELI = 8;
  private static int PFL_PARAMETRI_PROPOSTA = 9;
  private static int PFL_PARAMETRI_TRATTIPROPOS = 10;
  private static int PFL_PARAMETRI_NUMEROPROPOS = 11;
  private static int PFL_PARAMETRI_BARRAPROPOST = 12;
  private static int PFL_PARAMETRI_ANNOPROPOSTA = 13;
  private static int PFL_PARAMETRI_APRISCELPROP = 14;
  private static int PFL_PARAMETRI_ETICHETTASF = 15;
  private static int PFL_PARAMETRI_DATAELABORAZ = 16;

  private static int PPQRY_PARAMETRI657 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_QUAGENRIAAGG_ESERCIZIO = 0;
  private static int PFL_QUAGENRIAAGG_FPVTITOLO3 = 1;
  private static int PFL_QUAGENRIAAGG_FPVTITOLO31 = 2;
  private static int PFL_QUAGENRIAAGG_FPVTITOLO32 = 3;
  private static int PFL_QUAGENRIAAGG_FONDANTILIQ1 = 4;
  private static int PFL_QUAGENRIAAGG_FONDANTILIQ2 = 5;
  private static int PFL_QUAGENRIAAGG_FONDANTILIQ3 = 6;
  private static int PFL_QUAGENRIAAGG_ETICHEELABOR = 7;
  private static int PFL_QUAGENRIAAGG_ETICHECOMPET = 8;
  private static int PFL_QUAGENRIAAGG_ETICHECOMPE1 = 9;
  private static int PFL_QUAGENRIAAGG_ETICHECOMPE2 = 10;
  private static int PFL_QUAGENRIAAGG_ETICHETITOL3 = 11;
  private static int PFL_QUAGENRIAAGG_ETICHETITOL4 = 12;
  private static int PFL_QUAGENRIAAGG_ES = 13;

  private static int PPQRY_BILCONSEQUI3 = 0;


  IDPanel PAN_QUAGENRIAAGG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI139(IMDB);
    //
    //
    Init_PQRY_PARAMETRI657(IMDB);
    Init_PQRY_PARAMETRI657_RS(IMDB);
    Init_PQRY_BILCONSEQUI3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI139(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI139, 9);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI139, "TBL_PARAMETRI139");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMESTAMP,5,52,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI139,IMDBDef3.FLD_PARAMETRI139_ROWNAMDATELA,6,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI139, 0);
  }

  private static void Init_PQRY_PARAMETRI657(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI657, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI657, "PQRY_PARAMETRI657");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657,IMDBDef11.PQSL_PARAMETRI657_ROWNAMDATELA,6,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI657, 0);
  }

  private static void Init_PQRY_PARAMETRI657_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI657_RS, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI657_RS, "PQRY_PARAMETRI657_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI657_RS,IMDBDef11.PQSL_PARAMETRI657_ROWNAMDATELA,6,10,0);
  }

  private static void Init_PQRY_BILCONSEQUI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILCONSEQUI3, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILCONSEQUI3, "PQRY_BILCONSEQUI3");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_FPV_TITOLO3, "FPV_TITOLO3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_FPV_TITOLO3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_FPV_TITOLO3_1, "FPV_TITOLO3_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_FPV_TITOLO3_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_FPV_TITOLO3_2, "FPV_TITOLO3_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_FPV_TITOLO3_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_FONDO_ANTIC_LIQUIDITA_1, "FONDO_ANTIC_LIQUIDITA_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_FONDO_ANTIC_LIQUIDITA_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_FONDO_ANTIC_LIQUIDITA_2, "FONDO_ANTIC_LIQUIDITA_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_FONDO_ANTIC_LIQUIDITA_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_FONDO_ANTIC_LIQUIDITA_3, "FONDO_ANTIC_LIQUIDITA_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_FONDO_ANTIC_LIQUIDITA_3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI3,IMDBDef11.PQSL_BILCONSEQUI3_E_S,5,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILCONSEQUI3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public QuadroGeneraleRiassuntivoAgg(MyWebEntryPoint w, IMDBObj imdb)
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
  public QuadroGeneraleRiassuntivoAgg()
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
    FormIdx = MyGlb.FRM_QUAGENRIAAGG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2EB81E96-64EB-4572-A2F7-8F87E6498330";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 940;
    DesignHeight = 382;
    set_Caption(new IDVariant("Quadro Generale Riassuntivo"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 940;
    Frames[1].Height = 356;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.426966;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 940;
    Frames[2].Height = 152;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 152;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 940-MyGlb.PAN_OFFS_X, 152-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B1915E01-3F82-42A9-8803-8A5B82DCD155");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 464, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 940;
    Frames[3].Height = 204;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Quadro Generale Riassuntivo";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 204;
    PAN_QUAGENRIAAGG = new IDPanel(w, this, 3, "PAN_QUAGENRIAAGG");
    Frames[3].Content = PAN_QUAGENRIAAGG;
    PAN_QUAGENRIAAGG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_QUAGENRIAAGG.VS = MainFrm.VisualStyleList;
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 940-MyGlb.PAN_OFFS_X, 204-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "39EE16CD-77FA-4B97-BC4B-12F93A810E82");
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 472, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_QUAGENRIAAGG.InitStatus = 2;
    PAN_QUAGENRIAAGG_Init();
    PAN_QUAGENRIAAGG_InitFields();
    PAN_QUAGENRIAAGG_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI139, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        QUAGENRIAAGG_PARAMETRI657();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_QUAGENRIAAGG.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRISCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRISCELPROP) {
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
    return (obj instanceof QuadroGeneraleRiassuntivoAgg);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? QuadroGeneraleRiassuntivoAgg.class.getName() : (Glb.ClassWithPackage(QuadroGeneraleRiassuntivoAgg.class) ? QuadroGeneraleRiassuntivoAgg.class.getName().substring(QuadroGeneraleRiassuntivoAgg.class.getPackage().getName().length() + 1) : QuadroGeneraleRiassuntivoAgg.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Info Delibera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Delibera Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoAgg", "ApriInfoDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Delibera
  // **********************************************************************
  public int ApriDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoAgg", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Proposta
  // **********************************************************************
  public int ApriProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoAgg", "ApriProposta", _e);
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
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_PROPDELVALOR = new IDVariant(0,IDVariant.INTEGER);
      if (new IDVariant(PAN_QUAGENRIAAGG.Status()).equals((new IDVariant(3)), true))
      {
        PAN_QUAGENRIAAGG.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_QUAGENRIAAGG.Status()).equals((new IDVariant(2)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMDATELA, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Data Elaborazione Obbligatoria"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, 0))))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, 0))))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Delibera non presente", IDVariant.STRING));
            v_CONTATORE = (new IDVariant(0));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  DEL A ");
            SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTATORE.equals((new IDVariant(0)), true))
            {
              MainFrm.set_AlertMessage(v_AVVISO); 
              return 0;
            }
            v_PROPDELVALOR = (new IDVariant(-1));
          }
          else
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Dati della Delibera incompleti", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
        }
        if ((!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO, 0)) || !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO, 0))))))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO, 0))))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Proposta inesistente", IDVariant.STRING));
            if (MainFrm.GESTIODELIBE.booleanValue())
            {
              v_CONTATORE = (new IDVariant(0));
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  PROPOSTE A ");
              SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_CONTATORE.equals((new IDVariant(0)), true))
              {
                MainFrm.set_AlertMessage(v_AVVISO); 
                return 0;
              }
            }
            v_PROPDELVALOR = (new IDVariant(-1));
          }
          else
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Dati della Proposta incompleti", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
        }
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.WORKVARQGENRIASS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMEVARIA, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMDATELA, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR2 = (new IDVariant("ESERCIZIO"));
        IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR1 = (new IDVariant("SESSIONE"));
        IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR9 = (new IDVariant("TIPO_VAR"));
        IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR3 = (new IDVariant("SEDE_DEL"));
        IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR4 = (new IDVariant("NUMERO_DEL"));
        IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR5 = (new IDVariant("ANNO_DEL"));
        IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR6 = (new IDVariant("UNITA_PROP"));
        IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR7 = (new IDVariant("NUMERO_PROP"));
        IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR8 = (new IDVariant("ANNO_PROP"));
        IDVariant v_NOMESTAMPQGR = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPQGR = (new IDVariant("Quadro_Generale_Riassuntivo_Agg"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMEVARIA, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef11.PQRY_PARAM153, IMDBDef11.PQSL_PARAM153_PARSTANUDIPA, 0));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPQGR, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoAgg", "Elabora", _e);
      return -1;
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
      set_Caption(IDL.Add(this.Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMEVARIA, 0, (new IDVariant("P")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMSEDDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMNUMDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMANNDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMUNIPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMDATELA, 0, IDL.Today());
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_QUAGENRIAAGG.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_QUAGENRIAAGG.set_FieldText(PFL_QUAGENRIAAGG_ETICHECOMPET, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_QUAGENRIAAGG.set_FieldText(PFL_QUAGENRIAAGG_ETICHECOMPE1, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_QUAGENRIAAGG.set_FieldText(PFL_QUAGENRIAAGG_ETICHECOMPE2, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoAgg", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoAgg", "EndModalEvent", _e);
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
      if (new IDVariant(PAN_QUAGENRIAAGG.Status()).equals((new IDVariant(3)), true))
      {
        PAN_QUAGENRIAAGG.PanelCommand(Glb.PCM_CANCEL);
      }
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoAgg", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMESTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMDATELA, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, 0))))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoAgg", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, 0)));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_DELIBERA)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMERODELIBE)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNODELIBERA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO, 0, (new IDVariant()));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_PROPOSTA)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNOPROPOSTA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_VARIAZIONI)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMSEDDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNDEL, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMUNIPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMNUMPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI657, IMDBDef11.PQSL_PARAMETRI657_ROWNAMANNPRO, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoAgg", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Quadro Generale Riassuntivo Agg On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_QUAGENRIAAGG_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Quadro Generale Riassuntivo Agg On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILCONSEQUI3, IMDBDef11.PQSL_BILCONSEQUI3_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI3, IMDBDef11.PQSL_BILCONSEQUI3_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI3, IMDBDef11.PQSL_BILCONSEQUI3_E_S, 0, (new IDVariant("E")));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI3, IMDBDef11.PQSL_BILCONSEQUI3_FPV_TITOLO3, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI3, IMDBDef11.PQSL_BILCONSEQUI3_FPV_TITOLO3_1, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI3, IMDBDef11.PQSL_BILCONSEQUI3_FPV_TITOLO3_2, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI3, IMDBDef11.PQSL_BILCONSEQUI3_FONDO_ANTIC_LIQUIDITA_1, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI3, IMDBDef11.PQSL_BILCONSEQUI3_FONDO_ANTIC_LIQUIDITA_2, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI3, IMDBDef11.PQSL_BILCONSEQUI3_FONDO_ANTIC_LIQUIDITA_3, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoAgg", "QuadroGeneraleRiassuntivoAggOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Quadro Generale Riassuntivo Agg After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_QUAGENRIAAGG_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Quadro Generale Riassuntivo Agg After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_QUAGENRIAAGG.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_QUAGENRIAAGG.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoAgg", "QuadroGeneraleRiassuntivoAggAfterFind", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void QUAGENRIAAGG_PARAMETRI657() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETRI657_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI139, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI139, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI657_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETRI657_RS, 0, IMDBDef3.TBL_PARAMETRI139, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI657_RS, 0, 0, IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI657_RS, 1, 0, IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI657_RS, 2, 0, IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI657_RS, 3, 0, IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI657_RS, 4, 0, IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI657_RS, 5, 0, IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI657_RS, 6, 0, IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI657_RS, 7, 0, IMDBDef3.TBL_PARAMETRI139, IMDBDef3.FLD_PARAMETRI139_ROWNAMDATELA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI139, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI139, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI139, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETRI657_RS, 0);
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_APRISCELDELI)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRIINFODELI)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRISCELPROP)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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
  private void PAN_QUAGENRIAAGG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_QUAGENRIAAGG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_QUAGENRIAAGG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_QUAGENRIAAGG, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_QUAGENRIAAGG_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_QUAGENRIAAGG);
    // Stub
  }

  private void PAN_QUAGENRIAAGG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_QUAGENRIAAGG_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_QUAGENRIAAGG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_QUAGENRIAAGG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_QUAGENRIAAGG_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_QUAGENRIAAGG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_QUAGENRIAAGG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, "0D7C8956-6C5F-498A-9D08-B18A7CB92BD3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, "Variazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 264, -9999, 80, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 16, 19, 228, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 0, 55);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "58CEEA6C-F488-4780-99F2-4B3F5D9A29B1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "Provvedimento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_LIST, 544, -9999, 272, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_FORM, 16, 75, 584, 61, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 87);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "A8428175-123A-4E13-81AE-94BF771F200C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "Variazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, "9F056B11-623B-4686-83FC-49E831E2BE43");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "31BB932D-B2AF-44CF-AA09-464A8B8E75D9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, "57BC17D0-2EFF-4F24-9BBB-B7BA02CFCD38");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "D73F0648-A09D-4112-A830-63E857DB766A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "Numero Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, "6C2FDFF6-B3D1-4D4A-B772-68C5EF29C485");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "C3E93D78-5F32-4F06-B620-D5D3CA141D69");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "Anno Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, "70CAE1FF-57C9-49DD-B660-9ED72D9BFBBE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, "0ABCBC66-08E0-4895-AE7E-A2CBC24C069D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "A011BAC4-77DA-45CC-8878-BBA1F67D02B1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, "49CAA7B6-D371-48D3-B6AD-829AE5E73106");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "96A6D48B-5A6A-4519-AD16-F463975F8E57");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "Numero Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, "A152F471-3B82-4E61-8C1F-34AE8E9090F7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "4620B112-A69A-46B4-9F5D-F6145F0CA4FA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "Anno Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, "799AD045-7004-481C-83DF-872813386547");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, "D87D8B3B-3C74-47AA-95B5-5B3B8D526C06");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "89224CEF-B9FE-47EC-BEBF-890422CBE9C2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 52, 44, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARIAZIONI, -1, GRP_PARAMETRI_VARIAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARIAZIONI, PPQRY_PARAMETRI657, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.PANEL_LIST, 172, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.PANEL_FORM, 20, 48, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE5, -1, GRP_PARAMETRI_VARIAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE5, -1, "", "NEWPANELABE5", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 20, 112, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERA, PPQRY_PARAMETRI657, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_FORM, 120, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTIDELIBE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, "N. Dl.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 140, 112, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODELIBE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODELIBE, PPQRY_PARAMETRI657, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_LIST, 164, 272, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_FORM, 180, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRADELIBER, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 624, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, "A. Dl.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 200, 112, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODELIBERA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODELIBERA, PPQRY_PARAMETRI657, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_LIST, 508, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_FORM, 240, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRISCELDELI, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRISCELDELI, -1, "", "APRISCELDELI", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_LIST, 516, 264, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_FORM, 260, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRIINFODELI, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRIINFODELI, -1, "", "APRIINFODELI", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 284, 112, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROPOSTA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROPOSTA, PPQRY_PARAMETRI657, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 180, 288, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 460, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTIPROPOS, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. Pr.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 480, 112, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROPOS, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROPOS, PPQRY_PARAMETRI657, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 520, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRAPROPOST, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. Pr.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 540, 112, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROPOSTA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROPOSTA, PPQRY_PARAMETRI657, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_LIST, 500, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_FORM, 580, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRISCELPROP, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRISCELPROP, -1, "", "APRISCELPROP", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_LIST, 596, 220, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_FORM, 568, 100, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHETTASF, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 624, 116, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMETRI657, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 10, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI657", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI657, IMDBDef11.PQRY_PARAMETRI657_RS, IMDBDef3.TBL_PARAMETRI139);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_VARIAZIONI, IMDBDef3.FLD_PARAMETRI139_ROWNAMEVARIA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DELIBERA, IMDBDef3.FLD_PARAMETRI139_ROWNAMSEDDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODELIBE, IMDBDef3.FLD_PARAMETRI139_ROWNAMNUMDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODELIBERA, IMDBDef3.FLD_PARAMETRI139_ROWNAMANNDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PROPOSTA, IMDBDef3.FLD_PARAMETRI139_ROWNAMUNIPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROPOS, IMDBDef3.FLD_PARAMETRI139_ROWNAMNUMPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROPOSTA, IMDBDef3.FLD_PARAMETRI139_ROWNAMANNPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef3.FLD_PARAMETRI139_ROWNAMDATELA);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI139");
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

  private void PAN_QUAGENRIAAGG_Init()
  {

    PAN_QUAGENRIAAGG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_QUAGENRIAAGG.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_QUAGENRIAAGG.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, "6E5A48B5-48E4-410F-9646-487422E79D11");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, "ESERCIZIO");
    PAN_QUAGENRIAAGG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, "");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, 0, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, "BABEFCBF-7ECF-4A8F-B012-E38E0BD7E5AB");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, "- di cui fondo pluriennale vincolato");
    PAN_QUAGENRIAAGG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, "");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, "3C95D20A-50CC-4F90-978E-97F3C0607568");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, "FPV_TITOLO3_1");
    PAN_QUAGENRIAAGG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, "");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, "64637809-4CB7-425B-B76C-78D147D2A8BA");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, "FPV_TITOLO3_ 2");
    PAN_QUAGENRIAAGG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, "");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, "2C7F6A53-577D-4C79-8BC2-D6305A3AC67F");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, "di cui Fondo anticipazioni di liquidità (DL 35/2013 e succesive modifiche e rifinanziamenti) ");
    PAN_QUAGENRIAAGG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, "");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, "3B4C84CE-F95F-4569-9737-28162EB9FF29");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, "FONDO_ANTIC_LIQUIDITA_2");
    PAN_QUAGENRIAAGG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, "");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, "84EF646B-C796-45F6-BCCC-C6C38513E6BA");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, "FONDO_ANTIC_LIQUIDITA_3");
    PAN_QUAGENRIAAGG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, "");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHEELABOR, "F43EBA43-38E8-4366-819A-ECC6183222A6");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHEELABOR, "Elabora");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_QUAGENRIAAGG.SetImage(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHEELABOR, 0, "button1.gif", false);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPET, "66EF1CA4-2824-4F80-B617-C2CD024A359F");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPET, "Competenza");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPET, MyGlb.VIS_VUOTOGRASSET);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE1, "5AD7CE9F-ABE6-4628-A83B-84D50840DE65");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE1, "Competenza");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE1, MyGlb.VIS_VUOTOGRASSET);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE2, "4666B2AB-A9D1-4BBF-B383-DA843B95DA38");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE2, "Competenza");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE2, MyGlb.VIS_VUOTOGRASSET);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL3, "5E74FF6F-D627-4C07-825C-2400539D86B6");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL3, "Titolo 3 - Spese per incremento di attività finanziarie");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL3, MyGlb.VIS_VUOGRAALILEF);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL4, "5D4BE1DB-B0C7-4773-AF54-8791F7444711");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL4, "Titolo 4 - Rimborso di prestiti");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL4, MyGlb.VIS_VUOGRAALILEF);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUAGENRIAAGG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, "973BDE03-755E-45AC-87DA-B2B4CA8F4E56");
    PAN_QUAGENRIAAGG.set_Header(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, "E S");
    PAN_QUAGENRIAAGG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, "");
    PAN_QUAGENRIAAGG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_QUAGENRIAAGG.SetFlags(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, 0, -1);
  }

  private void PAN_QUAGENRIAAGG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, MyGlb.PANEL_FORM, 112);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_ESERCIZIO, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_ESERCIZIO, PPQRY_BILCONSEQUI3, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, MyGlb.PANEL_LIST, 80);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, MyGlb.PANEL_LIST, "d. c. f. pl. vn.");
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, MyGlb.PANEL_FORM, 16, 60, 640, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, MyGlb.PANEL_FORM, 512);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO3, MyGlb.PANEL_FORM, "- di cui fondo pluriennale vincolato");
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_FPVTITOLO3, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_FPVTITOLO3, PPQRY_BILCONSEQUI3, "A.FPV_TITOLO3", "FPV_TITOLO3", 3, 14, 2, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, MyGlb.PANEL_LIST, 92);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, MyGlb.PANEL_LIST, "FPV TITOLO3 1");
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, MyGlb.PANEL_FORM, 664, 60, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, MyGlb.PANEL_FORM, 92);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO31, MyGlb.PANEL_FORM, "FPV TITOLO3 1");
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_FPVTITOLO31, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_FPVTITOLO31, PPQRY_BILCONSEQUI3, "A.FPV_TITOLO3_1", "FPV_TITOLO3_1", 3, 14, 2, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, MyGlb.PANEL_LIST, 92);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, MyGlb.PANEL_LIST, "FPV_TITOLO3_ 2");
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, MyGlb.PANEL_FORM, 796, 60, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, MyGlb.PANEL_FORM, 92);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FPVTITOLO32, MyGlb.PANEL_FORM, "FPV TITOLO3 2");
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_FPVTITOLO32, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_FPVTITOLO32, PPQRY_BILCONSEQUI3, "A.FPV_TITOLO3_2", "FPV_TITOLO3_2", 3, 14, 2, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, MyGlb.PANEL_LIST, 96);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, MyGlb.PANEL_LIST, "d. c. F. a. d. l. D. 3. 2. e s. m. e r.");
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, MyGlb.PANEL_FORM, 16, 112, 640, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, MyGlb.PANEL_FORM, 512);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ1, MyGlb.PANEL_FORM, "di cui Fondo anticipazioni di liquidità (DL 35/2013 e succesive modifiche e rifinanziamenti) ");
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_FONDANTILIQ1, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_FONDANTILIQ1, PPQRY_BILCONSEQUI3, "A.FONDO_ANTIC_LIQUIDITA_1", "FONDO_ANTIC_LIQUIDITA_1", 3, 14, 2, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, MyGlb.PANEL_LIST, 104);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, MyGlb.PANEL_LIST, "FONDO ANTIC LIQUIDITA 2");
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, MyGlb.PANEL_FORM, 664, 112, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, MyGlb.PANEL_FORM, 104);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ2, MyGlb.PANEL_FORM, "FON. ANT. LIQ. 2");
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_FONDANTILIQ2, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_FONDANTILIQ2, PPQRY_BILCONSEQUI3, "A.FONDO_ANTIC_LIQUIDITA_2", "FONDO_ANTIC_LIQUIDITA_2", 3, 14, 2, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, MyGlb.PANEL_LIST, 104);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, MyGlb.PANEL_LIST, "FONDO ANTIC LIQUIDITA 3");
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, MyGlb.PANEL_FORM, 796, 112, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, MyGlb.PANEL_FORM, 104);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_FONDANTILIQ3, MyGlb.PANEL_FORM, "FON. ANT. LIQ. 3");
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_FONDANTILIQ3, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_FONDANTILIQ3, PPQRY_BILCONSEQUI3, "A.FONDO_ANTIC_LIQUIDITA_3", "FONDO_ANTIC_LIQUIDITA_3", 3, 14, 2, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHEELABOR, MyGlb.PANEL_LIST, 632, 356, 96, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHEELABOR, MyGlb.PANEL_FORM, 836, 148, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_ETICHEELABOR, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPET, MyGlb.PANEL_LIST, 604, 12, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPET, MyGlb.PANEL_LIST, 0);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPET, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPET, MyGlb.PANEL_FORM, 532, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPET, MyGlb.PANEL_FORM, 0);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPET, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_ETICHECOMPET, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_ETICHECOMPET, -1, "", "ETICHECOMPET", 0, 0, 0, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE1, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE1, MyGlb.PANEL_LIST, 0);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE1, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE1, MyGlb.PANEL_FORM, 664, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE1, MyGlb.PANEL_FORM, 0);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE1, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_ETICHECOMPE1, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_ETICHECOMPE1, -1, "", "ETICHECOMPE1", 0, 0, 0, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE2, MyGlb.PANEL_LIST, 620, 28, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE2, MyGlb.PANEL_LIST, 0);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE2, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE2, MyGlb.PANEL_FORM, 796, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE2, MyGlb.PANEL_FORM, 0);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHECOMPE2, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_ETICHECOMPE2, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_ETICHECOMPE2, -1, "", "ETICHECOMPE2", 0, 0, 0, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL3, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL3, MyGlb.PANEL_LIST, 0);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL3, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL3, MyGlb.PANEL_FORM, 16, 40, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL3, MyGlb.PANEL_FORM, 0);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL3, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_ETICHETITOL3, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_ETICHETITOL3, -1, "", "ETICHETITOL3", 0, 0, 0, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL4, MyGlb.PANEL_LIST, 620, 28, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL4, MyGlb.PANEL_LIST, 0);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL4, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL4, MyGlb.PANEL_FORM, 16, 92, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL4, MyGlb.PANEL_FORM, 0);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ETICHETITOL4, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_ETICHETITOL4, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_ETICHETITOL4, -1, "", "ETICHETITOL4", 0, 0, 0, -13997);
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, MyGlb.PANEL_LIST, 24);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, MyGlb.PANEL_LIST, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, MyGlb.PANEL_LIST, "E S");
    PAN_QUAGENRIAAGG.SetRect(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, MyGlb.PANEL_FORM, 4, 184, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUAGENRIAAGG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, MyGlb.PANEL_FORM, 24);
    PAN_QUAGENRIAAGG.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, MyGlb.PANEL_FORM, 1);
    PAN_QUAGENRIAAGG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUAGENRIAAGG_ES, MyGlb.PANEL_FORM, "E S");
    PAN_QUAGENRIAAGG.SetFieldPage(PFL_QUAGENRIAAGG_ES, -1, -1);
    PAN_QUAGENRIAAGG.SetFieldPanel(PFL_QUAGENRIAAGG_ES, PPQRY_BILCONSEQUI3, "A.E_S", "E_S", 5, 1, 0, -13997);
  }

  private void PAN_QUAGENRIAAGG_InitQueries()
  {
    StringBuffer SQL;

    PAN_QUAGENRIAAGG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_QUAGENRIAAGG.SetIMDB(IMDB, "PQRY_BILCONSEQUI3", true);
    PAN_QUAGENRIAAGG.set_SetString(MyGlb.MASTER_ROWNAME, "BIL CONS EQUILIBRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.FPV_TITOLO3 as FPV_TITOLO3, ");
    SQL.append("  A.FPV_TITOLO3_1 as FPV_TITOLO3_1, ");
    SQL.append("  A.FPV_TITOLO3_2 as FPV_TITOLO3_2, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA_1 as FONDO_ANTIC_LIQUIDITA_1, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA_2 as FONDO_ANTIC_LIQUIDITA_2, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA_3 as FONDO_ANTIC_LIQUIDITA_3, ");
    SQL.append("  A.E_S as E_S ");
    PAN_QUAGENRIAAGG.SetQuery(PPQRY_BILCONSEQUI3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_PREV_EQUILIBRI_VAR A ");
    PAN_QUAGENRIAAGG.SetQuery(PPQRY_BILCONSEQUI3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_QUAGENRIAAGG.SetQuery(PPQRY_BILCONSEQUI3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUAGENRIAAGG.SetQuery(PPQRY_BILCONSEQUI3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUAGENRIAAGG.SetQuery(PPQRY_BILCONSEQUI3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUAGENRIAAGG.SetQuery(PPQRY_BILCONSEQUI3, 5, SQL, -1, "");
    PAN_QUAGENRIAAGG.SetQueryDB(PPQRY_BILCONSEQUI3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUAGENRIAAGG.SetMasterTable(0, "BIL_PREV_EQUILIBRI_VAR");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_QUAGENRIAAGG.Status() == 2)
    {
      int oldListQBE = PAN_QUAGENRIAAGG.iUseListQBE;
      PAN_QUAGENRIAAGG.iUseListQBE = 0;
      PAN_QUAGENRIAAGG.PanelCommand(Glb.PCM_SEARCH);
      PAN_QUAGENRIAAGG.PanelCommand(Glb.PCM_FIND);
      PAN_QUAGENRIAAGG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_QUAGENRIAAGG) PAN_QUAGENRIAAGG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_QUAGENRIAAGG) PAN_QUAGENRIAAGG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_QUAGENRIAAGG) PAN_QUAGENRIAAGG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_QUAGENRIAAGG) PAN_QUAGENRIAAGG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_QUAGENRIAAGG) PAN_QUAGENRIAAGG_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_QUAGENRIAAGG) PAN_QUAGENRIAAGG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
