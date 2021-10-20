// **********************************************
// Emissione Mandati Da Provvisori
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneMandatiDaProvvisori extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_LIQUIDAZIONI = 0;

  private static int PFL_PARAMETRI_DELDAIMPSUIM = 0;
  private static int PFL_PARAMETRI_DESDAIMPSUIM = 1;
  private static int PFL_PARAMETRI_DELIBERA = 2;
  private static int PFL_PARAMETRI_TRATTINLABEL = 3;
  private static int PFL_PARAMETRI_NUMERODEL = 4;
  private static int PFL_PARAMETRI_SLASHLABEL = 5;
  private static int PFL_PARAMETRI_ANNODEL = 6;
  private static int PFL_PARAMETRI_DESCRIIMPEGN = 7;
  private static int PFL_PARAMETRI_CAUSALE = 8;
  private static int PFL_PARAMETRI_BOLLO = 9;
  private static int PFL_PARAMETRI_DATAEMISSION = 10;
  private static int PFL_PARAMETRI_APRIDELIBUTT = 11;
  private static int PFL_PARAMETRI_NEWPANELLABE = 12;
  private static int PFL_PARAMETRI_UFFICIO = 13;
  private static int PFL_PARAMETRI_INFODELIBUTT = 14;
  private static int PFL_PARAMETRI_OKBUTTON = 15;

  private static int PPQRY_PARAMETRI183 = 0;

  private static int PPQRY_T58 = 1;
  private static int PPQRY_T60 = 2;
  private static int PPQRY_T53 = 3;


  IDPanel PAN_PARAMETRI;
  private static int PFL_NOTEFUNZIONA_MODULO = 0;
  private static int PFL_NOTEFUNZIONA_PAGINA = 1;
  private static int PFL_NOTEFUNZIONA_FUNZIONE = 2;
  private static int PFL_NOTEFUNZIONA_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZIO17 = 0;


  IDPanel PAN_NOTEFUNZIONA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI204(IMDB);
    //
    //
    Init_PQRY_PARAMETRI183(IMDB);
    Init_PQRY_PARAMETRI183_RS(IMDB);
    Init_PQRY_NOTEFUNZIO17(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI204(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI204, 11);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI204, "TBL_PARAMETRI204");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMDEDAI1, "ROWNAMDEDAI1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMDEDAI1,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMDEDAIM, "ROWNAMDEDAIM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMDEDAIM,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMDESIMP, "ROWNAMDESIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMDESIMP,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMEDELIB,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMECAUSA,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMEBOLLO,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMDATEMI, "ROWNAMDATEMI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMDATEMI,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ROWNAMEUFFIC,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI204,IMDBDef5.FLD_PARAMETRI204_ANNO_DEL,1,4,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI204, 0);
  }

  private static void Init_PQRY_PARAMETRI183(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI183, 11);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI183, "PQRY_PARAMETRI183");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDEDAI1, "ROWNAMDEDAI1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDEDAI1,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDEDAIM, "ROWNAMDEDAIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDEDAIM,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDESIMP, "ROWNAMDESIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDESIMP,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMEDELIB,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMECAUSA,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMEBOLLO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDATEMI, "ROWNAMDATEMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDATEMI,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ROWNAMEUFFIC,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183,IMDBDef15.PQSL_PARAMETRI183_ANNO_DEL,1,4,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI183, 0);
  }

  private static void Init_PQRY_PARAMETRI183_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI183_RS, 11);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI183_RS, "PQRY_PARAMETRI183_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDEDAI1, "ROWNAMDEDAI1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDEDAI1,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDEDAIM, "ROWNAMDEDAIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDEDAIM,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDESIMP, "ROWNAMDESIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDESIMP,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMEDELIB,5,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMECAUSA,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMEBOLLO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDATEMI, "ROWNAMDATEMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMDATEMI,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ROWNAMEUFFIC,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI183_RS,IMDBDef15.PQSL_PARAMETRI183_ANNO_DEL,1,4,0);
  }

  private static void Init_PQRY_NOTEFUNZIO17(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NOTEFUNZIO17, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_NOTEFUNZIO17, "PQRY_NOTEFUNZIO17");
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZIO17,IMDBDef15.PQSL_NOTEFUNZIO17_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZIO17,IMDBDef15.PQSL_NOTEFUNZIO17_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZIO17,IMDBDef15.PQSL_NOTEFUNZIO17_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZIO17,IMDBDef15.PQSL_NOTEFUNZIO17_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZIO17,IMDBDef15.PQSL_NOTEFUNZIO17_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZIO17,IMDBDef15.PQSL_NOTEFUNZIO17_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZIO17,IMDBDef15.PQSL_NOTEFUNZIO17_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZIO17,IMDBDef15.PQSL_NOTEFUNZIO17_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NOTEFUNZIO17, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneMandatiDaProvvisori(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneMandatiDaProvvisori()
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
    FormIdx = MyGlb.FRM_EMISMANDAPRO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "686ACC2B-322E-4146-AE59-C1A2E32CAFE1";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 908;
    DesignHeight = 414;
    set_Caption(new IDVariant("Emissione Mandati Da Provvisori"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 908;
    Frames[1].Height = 388;
    Frames[1].FormFactor = 0.643172;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 584;
    Frames[2].Height = 388;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 584;
    Frames[2].FixedHeight = 388;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 584-MyGlb.PAN_OFFS_X, 388-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C783ED84-6B35-4EAD-BC6C-91F73202F23F");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1644, 268, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    Frames[3].Width = 324;
    Frames[3].Height = 388;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "NOTE FUNZIONALITA";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 388;
    PAN_NOTEFUNZIONA = new IDPanel(w, this, 3, "PAN_NOTEFUNZIONA");
    Frames[3].Content = PAN_NOTEFUNZIONA;
    PAN_NOTEFUNZIONA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONA.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 324-MyGlb.PAN_OFFS_X, 388-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "69879A3D-C2FC-4BF3-9B3A-CD749B366ECE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTEFUNZIONA.InitStatus = 2;
    PAN_NOTEFUNZIONA_Init();
    PAN_NOTEFUNZIONA_InitFields();
    PAN_NOTEFUNZIONA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI204, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISMANDAPRO_PARAMETRI183();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_NOTEFUNZIONA.UpdatePanel(MainFrm);
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
      if (IdxFieldActived ==PFL_PARAMETRI_APRIDELIBUTT) {
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
    return (obj instanceof EmissioneMandatiDaProvvisori);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneMandatiDaProvvisori.class.getName() : (Glb.ClassWithPackage(EmissioneMandatiDaProvvisori.class) ? EmissioneMandatiDaProvvisori.class.getName().substring(EmissioneMandatiDaProvvisori.class.getPackage().getName().length() + 1) : EmissioneMandatiDaProvvisori.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMDEDAI1, 0).equals((new IDVariant("T")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ANNO_DEL, 0))))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneMandatiDaProvvisori", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
      // 
      // Parametri On Validate Row Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneMandatiDaProvvisori", "ParametriOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneMandatiDaProvvisori", "SelezioneDelibere", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Emissione Mandati", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      // 
      // questa form viene richiamata dall'apposita procedura Apri Emissione Mandati Provvisori
      // 
      {
      }
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARADELEROWS();
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMECAUSA, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMEBOLLO, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMEUFFIC, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMDATEMI, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMDEDAIM, 0, (new IDVariant("F")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMDEDAI1, 0, (new IDVariant("F")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneMandatiDaProvvisori", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMDEDAI1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMDEDAIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMDESIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMEDELIB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMECAUSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMEBOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMDATEMI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_SEDE_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ANNO_DEL, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneMandatiDaProvvisori", "EndModalEvent", _e);
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
    IDVariant v_NIMPDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NIMPA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NIMPLIQDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NIMPLIQA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NTOTMAN = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NMANDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NMANA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NANTICP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SSTATOSIOPE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NSTATOSIOPE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SIMP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SLIQ = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SMAN = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SMESSIMP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGIO1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAG2IMPEG = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAG3LIQUI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSA4MANDA1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGGIONON = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MESSAGIO1 = (new IDVariant("Procedura terminata", IDVariant.STRING));
      v_MESSAG2IMPEG = (new IDVariant("Impegni Emessi: ", IDVariant.STRING));
      v_MESSAG3LIQUI = (new IDVariant("Liquidazioni Emesse: ", IDVariant.STRING));
      v_MESSA4MANDA1 = (new IDVariant("Totale Mandati Emessi: ", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_NSUPDISPPURO = new IDVariant(0,IDVariant.INTEGER);
      // 
      // errori bloccanti
      // 
      {
        if (IDL.Year(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMDATEMI, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Anno e Data emissione non coincidono con l'esercizio del contesto", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
        if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMDESIMP, 0).equals((new IDVariant("")), true) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMDESIMP, 0)))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Specificare la descrizione Impegno", IDVariant.STRING));
          // 
          // controllo se ci sono righe di man prov dettagli senza imp
          // 
          {
            IDVariant v_NRIGHE = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  MAN_PROVVISORI A, ");
            SQL.append("  MAN_PROV_DETTAGLI B ");
            SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
            SQL.append("and   (B.PROGR_MAN_PROV = A.PROGRESSIVO) ");
            SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NOT ((B.CAPITOLO IS NULL))) ");
            SQL.append("and   ((B.NUMERO_IMP IS NULL)) ");
            SQL.append("and   ((B.ANNO_LIQ IS NULL)) ");
            SQL.append("and   (NVL(B.UFFICIO, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(B.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
            SQL.append("and   (NVL(A.EMISSIONE, 'NO') = DECODE(NVL(" + IDL.CSql(MainFrm.EMISPARZPROS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO'), 'SI', 'SI', NVL(A.EMISSIONE, 'NO'))) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_NRIGHE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_NRIGHE.compareTo((new IDVariant(0)), true)>0)
            {
              MainFrm.set_AlertMessage(v_MSG); 
              return 0;
            }
          }
        }
      }
      v_MESSAGGIONON = (new IDVariant());
      // 
      // errori non bloccanti
      // 
      {
        if (ProvvRisint(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMEUFFIC, 0),(new IDVariant(-1)))).compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Sono presenti Dettagli senza indicazione del Capitolo o del Beneficiario", IDVariant.STRING));
          v_MESSAGGIONON = IDL.Add(IDL.Add(v_MESSAGGIONON, v_MSG), (new IDVariant("<BR/>")));
        }
        // 
        // controllo cdc
        // 
        {
          IDVariant v_VCOUNT1 = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  MAN_PROVVISORI A, ");
          SQL.append("  MAN_PROV_DETTAGLI B, ");
          SQL.append("  FATTORI C ");
          SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
          SQL.append("and   (B.PROGR_MAN_PROV = A.PROGRESSIVO) ");
          SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NOT ((B.CAPITOLO IS NULL))) ");
          SQL.append("and   ((B.ANNO_LIQ IS NULL)) ");
          SQL.append("and   (NOT ((B.FATTORE IS NULL))) ");
          SQL.append("and   ((B.CENTRO IS NULL)) ");
          SQL.append("and   (C.FATTORE = B.FATTORE) ");
          SQL.append("and   (C.TIPO = 'E') ");
          SQL.append("and   (NVL(B.UFFICIO, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(B.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          SQL.append("and   (NVL(A.EMISSIONE, 'NO') = DECODE(NVL(" + IDL.CSql(MainFrm.EMISPARZPROS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO'), 'SI', 'SI', NVL(A.EMISSIONE, 'NO'))) ");
          SQL.append("and   (" + IDL.CSql(MainFrm.GESTIOECONOM, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 2) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT1.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
            v_S1 = (new IDVariant("Esistono record senza indicazione del centro e, per questi, verrà usato il CdC di default"));
            v_MESSAGGIONON = IDL.Add(IDL.Add(v_MESSAGGIONON, v_S1), (new IDVariant("<BR/>")));
          }
        }
        if (ProvvEserciziPrec(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_AVVISOESEPRE = new IDVariant(0,IDVariant.STRING);
          v_AVVISOESEPRE = (new IDVariant("Esistono Provvisori di esercizi precedenti non ancora regolarizzati", IDVariant.STRING));
          v_MESSAGGIONON = IDL.Add(IDL.Add(v_MESSAGGIONON, v_AVVISOESEPRE), (new IDVariant("<BR/>")));
        }
        if (!(IDL.IsNull(v_MESSAGGIONON)))
        {
          if (!(MainFrm.MessageConfirm(IDL.Add(v_MESSAGGIONON, (new IDVariant("Continuare?"))))))
          {
            return 0;
          }
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.BeginTrans();
      MainFrm.Cf4armDBObject.LIQUIDAPROVVISORI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMDATEMI, 0), ((IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMECAUSA, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMECAUSA, 0)), IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMEUFFIC, 0),(new IDVariant(-1))), ((IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMEBOLLO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMEBOLLO, 0)), IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMDESIMP, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_SEDE_DEL, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_NUMERO_DEL, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ANNO_DEL, 0), v_NIMPDA, v_NIMPA, v_NIMPLIQDA, v_NIMPLIQA, v_NTOTMAN, v_NMANDA, v_NMANA, IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMDEDAI1, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ROWNAMDEDAIM, 0), v_NANTICP, v_NSTATOSIOPE, v_NSUPDISPPURO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return 0;
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Sono presenti record con disponibilità di cassa negativa. Continuare?"));
      IDVariant v_MESSUPDISPUR = new IDVariant(0,IDVariant.STRING);
      v_MESSUPDISPUR = (new IDVariant("Sono stati emessi impegni che superano la disponibilità dello stanziamento puro"));
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_BLOCCNONBLOC = null;
      v_BLOCCNONBLOC = (new IDVariant());
      v_BLOCCNONBLOC = new IDVariant(MainFrm.CONCASLIQEMI);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  BIL B ");
      SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((A.NUMERO_MAND BETWEEN " + IDL.CSql(v_NIMPLIQDA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(v_NIMPLIQA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (B.ESERCIZIO = A.ANNO_LIQ) ");
      SQL.append("and   (B.E_S = 'S') ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(B.ESERCIZIO,B.CAPITOLO,B.ARTICOLO,'EM') < 0) ");
      SQL.append("and   (NOT ((A.ANNO_MAND IS NULL))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        if (v_BLOCCNONBLOC.equals((new IDVariant(1)), true))
        {
          IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
          v_S1 = (new IDVariant("Sono presenti record con disponibilità di cassa negativa."));
          MainFrm.Cf4armDBObject.RollbackTrans();
          MainFrm.set_AlertMessage(v_S1); 
          return 0;
        }
        else
        {
          IDVariant v_RISP = null;
          v_RISP = (new IDVariant(MainFrm.MessageConfirmEx(S)));
          if (IDL.IsNull(v_RISP))
          {
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          if (v_RISP.equals((new IDVariant(-1)), true))
          {
            MainFrm.Cf4armDBObject.CommitTrans();
          }
          else
          {
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          IMDB.set_Value(IMDBDef5.TBL_PARS48, IMDBDef5.FLD_PARS48_NOMEOGGETDAL, 0, new IDVariant(v_NIMPLIQDA));
          IMDB.set_Value(IMDBDef5.TBL_PARS48, IMDBDef5.FLD_PARS48_NOMEOGGETTAL, 0, new IDVariant(v_NIMPLIQA));
          IMDB.set_Value(IMDBDef5.TBL_PARS48, IMDBDef5.FLD_PARS48_NOMEOGGETTES, 0, (new IDVariant("S")));
          IMDB.set_Value(IMDBDef5.TBL_PARS48, IMDBDef5.FLD_PARS48_NOMEOGGSOLEM, 0, (new IDVariant("SI")));
          MainFrm.Show(MyGlb.FRM_CACODINEDAAL, (new IDVariant(-1)).intValue(), this); 
        }
      }
      else
      {
        MainFrm.Cf4armDBObject.CommitTrans();
      }
      // 
      // mostro messaggio che indica che la procedura è terminata
      // 
      {
        if (v_NSTATOSIOPE.equals((new IDVariant(1)), true))
        {
          IDVariant v_STATOSIOPCGU = new IDVariant(0,IDVariant.STRING);
          v_STATOSIOPCGU = (new IDVariant("Attenzione: sono stati emessi mandati privi del Codice Gestionale", IDVariant.STRING));
          IDVariant v_STATOSIOLIV5 = new IDVariant(0,IDVariant.STRING);
          v_STATOSIOLIV5 = (new IDVariant("Attenzione: sono stati emessi mandati privi del Codice Livello 5"));
          if (MainFrm.SIOPEATTIARM.booleanValue())
          {
            v_SSTATOSIOPE = new IDVariant(v_STATOSIOLIV5);
          }
          else
          {
            v_SSTATOSIOPE = new IDVariant(v_STATOSIOPCGU);
          }
        }
        if (v_NIMPDA.compareTo(v_NIMPA, true)>0)
        {
          IDVariant v_SIMPTMP1 = new IDVariant(0,IDVariant.STRING);
          v_SIMPTMP1 = (new IDVariant("nessuno", IDVariant.STRING));
          v_SIMP = new IDVariant(v_SIMPTMP1);
        }
        else
        {
          v_SIMP = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("dal")), (new IDVariant(" "))), IDL.ToString(v_NIMPDA)), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.ToString(v_NIMPA));
        }
        if (v_NIMPLIQDA.compareTo(v_NIMPLIQA, true)>0)
        {
          IDVariant v_SLIQTMP1 = new IDVariant(0,IDVariant.STRING);
          v_SLIQTMP1 = (new IDVariant("nessuno", IDVariant.STRING));
          v_SLIQ = new IDVariant(v_SLIQTMP1);
        }
        else
        {
          v_SLIQ = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("dal")), (new IDVariant(" "))), IDL.ToString(v_NIMPLIQDA)), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.ToString(v_NIMPLIQA));
        }
        if (v_NMANDA.compareTo(v_NMANA, true)>0)
        {
          IDVariant v_SMANTMP1 = new IDVariant(0,IDVariant.STRING);
          v_SMANTMP1 = (new IDVariant("nessuno", IDVariant.STRING));
          v_SMAN = new IDVariant(v_SMANTMP1);
        }
        else
        {
          v_SMAN = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(v_NTOTMAN), (new IDVariant(" "))), (new IDVariant("dal numero "))), IDL.ToString(v_NMANDA)), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.ToString(v_NMANA));
        }
        if (v_NANTICP.equals((new IDVariant(1)), true))
        {
          IDVariant v_SMESSIMPTMP1 = new IDVariant(0,IDVariant.STRING);
          v_SMESSIMPTMP1 = (new IDVariant("Sono presenti casi di anticipazione", IDVariant.STRING));
          v_SMESSIMP = new IDVariant(v_SMESSIMPTMP1);
        }
        v_MESSAGIO1 = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGIO1, (new IDVariant("<BR/>"))), v_MESSAG2IMPEG), v_SIMP), (new IDVariant("."))), (new IDVariant("<BR/>"))), v_MESSAG3LIQUI), v_SLIQ), (new IDVariant("."))), (new IDVariant("<BR/>"))), v_MESSA4MANDA1), v_SMAN), (new IDVariant("."))), (new IDVariant("<BR/>"))), v_SMESSIMP), v_SSTATOSIOPE), (new IDVariant("<BR/>")));
        if (v_NSUPDISPPURO.equals((new IDVariant(1)), true))
        {
          v_MESSAGIO1 = IDL.Add(IDL.Add(v_MESSAGIO1, v_MESSUPDISPUR), (new IDVariant("<BR/>")));
        }
        MainFrm.set_AlertMessage(v_MESSAGIO1); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneMandatiDaProvvisori", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Provv Risint
  // P Esercizio:  - Input
  // Pufficio:  - Input
  // **********************************************************************
  public IDVariant ProvvRisint (IDVariant PEsercizio, IDVariant Pufficio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Provv Risint Body
      // Procedure Body
      // 
      // 
      // controllo se ci sono righe di man_prov_dettagli da liquidare senza riferimento 
      // rispetto alla funzione originale non sono stati gestiti
      // gli ordinativi
      // 
      {
        IDVariant v_NRIGHE = new IDVariant(0,IDVariant.INTEGER);
        v_NRIGHE = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  MAN_PROVVISORI A, ");
        SQL.append("  MAN_PROV_DETTAGLI B ");
        SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
        SQL.append("and   (B.PROGR_MAN_PROV = A.PROGRESSIVO) ");
        SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(PEsercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((B.ANNO_LIQ IS NULL)) ");
        SQL.append("and   ((B.CAPITOLO IS NULL) OR (B.BENEFICIARIO IS NULL)) ");
        SQL.append("and   (NVL(B.UFFICIO, -1) = DECODE(" + IDL.CSql(Pufficio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, NVL(B.UFFICIO, -1), " + IDL.CSql(Pufficio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append("and   (NVL(A.EMISSIONE, 'NO') = DECODE(NVL(" + IDL.CSql(MainFrm.EMISPARZPROS, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'NO'), 'SI', 'SI', NVL(A.EMISSIONE, 'NO'))) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NRIGHE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        return v_NRIGHE;
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneMandatiDaProvvisori", "ProvvRisint", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Provv Esercizi Prec
  // P Esercizio:  - Input
  // **********************************************************************
  public IDVariant ProvvEserciziPrec (IDVariant PEsercizio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Provv Esercizi Prec Body
      // Procedure Body
      // 
      // 
      // controllo se ci sono righe di man_prov_dettagli di anni precedenti non ancora regolarizzati 
      // 
      {
        IDVariant v_NRIGHE = new IDVariant(0,IDVariant.INTEGER);
        v_NRIGHE = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  MAN_PROV_DETTAGLI A ");
        SQL.append("where (A.ESERCIZIO < " + IDL.CSql(PEsercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((A.ANNO_LIQ IS NULL)) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NRIGHE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        return v_NRIGHE;
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneMandatiDaProvvisori", "ProvvEserciziPrec", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP5, IMDBDef13.PQSL_IMP5_SEDE_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef15.PQRY_PARAMETRI183, IMDBDef15.PQSL_PARAMETRI183_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneMandatiDaProvvisori", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void EMISMANDAPRO_PARAMETRI183() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI183_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI204, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI204, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI183_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI183_RS, 0, IMDBDef5.TBL_PARAMETRI204, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI183_RS, 0, 0, IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMDEDAI1, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI183_RS, 1, 0, IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMDEDAIM, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI183_RS, 2, 0, IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMDESIMP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI183_RS, 3, 0, IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMEDELIB, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI183_RS, 4, 0, IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMECAUSA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI183_RS, 5, 0, IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMEBOLLO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI183_RS, 6, 0, IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMDATEMI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI183_RS, 7, 0, IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI183_RS, 8, 0, IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI183_RS, 9, 0, IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI183_RS, 10, 0, IMDBDef5.TBL_PARAMETRI204, IMDBDef5.FLD_PARAMETRI204_ANNO_DEL, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI204, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI204, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI204, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI183_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_APRIDELIBUTT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFODELIBUTT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_OKBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
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
  private void PAN_NOTEFUNZIONA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTEFUNZIONA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTEFUNZIONA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTEFUNZIONA);
    // Stub
  }

  private void PAN_NOTEFUNZIONA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTEFUNZIONA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTEFUNZIONA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTEFUNZIONA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONI, "AD94FE07-B154-4F5F-8EE7-9358E6E6678E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONI, "Liquidazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_LIST, 0, -9999, 2080, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_FORM, 12, 11, 544, 249, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONI, 0, 66);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_LIQUIDAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, "9293EDDB-B5FE-4AD5-8631-95ED489A32D9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, "Delibera Da Impegno/Sub-Impegno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, "8AA2F75D-6835-41E7-91EA-96D4F1D4C987");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, "Descrizione Da Impegno/Sub-Impegno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "14DA90C8-3545-476A-96B1-B297FFA2C691");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, "3DF1ABA0-C44E-412A-AF4D-8FC597FD61E2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "D1D6D040-F282-4487-B402-5F3708877A8E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "NUMERO DEL");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, "597C84A7-16C7-4C50-88A1-98C849DA0E9F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "0C5CF4BF-DB2E-4A9A-83DC-D38385709BFE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "ANNO DEL");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, "2396F959-C38A-4905-8650-036FCF637989");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, "Descrizione Impegno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "1C3BE748-DDB9-4603-9E92-AC7B53BA7357");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "Causale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "17915FDE-0093-44BA-8406-EAD7F04B3138");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "Bollo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, "CF2B0D64-F12C-4DFC-BEC2-270F5E903B75");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, "Data Emissione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, "635CF1B2-BCF8-43AD-AB53-69D04B7BAD0A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "809CB6BB-3AF2-4D72-BD47-5E192F4AAEDE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "177658D0-EF9D-414B-AF36-A8F2E61286D1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Solo Provvisori di Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, "5CC7BD5D-7D0A-4829-A966-CFE368B146B7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OKBUTTON, "F61B72D1-1107-4220-AB83-0BF41BB8A67E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OKBUTTON, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OKBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OKBUTTON, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OKBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, MyGlb.PANEL_LIST, "Delibera Da Impegno/Sub-Impegno");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, MyGlb.PANEL_FORM, 44, 36, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, MyGlb.PANEL_FORM, 264);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELDAIMPSUIM, MyGlb.PANEL_FORM, "Delibera Da Impegno/Sub-Impegno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELDAIMPSUIM, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELDAIMPSUIM, PPQRY_PARAMETRI183, "A.ROWNAMDEDAI1", "ROWNAMDEDAI1", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DELDAIMPSUIM, (new IDVariant("T")), "T", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DELDAIMPSUIM, (new IDVariant("F")), "F", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, MyGlb.PANEL_LIST, 208, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, MyGlb.PANEL_LIST, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, MyGlb.PANEL_LIST, "Descr. Da Impegno Sub Impegno");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, MyGlb.PANEL_FORM, 16, 64, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, MyGlb.PANEL_FORM, 292);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESDAIMPSUIM, MyGlb.PANEL_FORM, "Descrizione Da Impegno/Sub-Impegno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESDAIMPSUIM, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESDAIMPSUIM, PPQRY_PARAMETRI183, "A.ROWNAMDEDAIM", "ROWNAMDEDAIM", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DESDAIMPSUIM, (new IDVariant("T")), "T", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DESDAIMPSUIM, (new IDVariant("F")), "F", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 100, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERA, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERA, PPQRY_PARAMETRI183, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 236, 48, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 204, 100, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTINLABEL, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTINLABEL, -1, "", "TRATTINLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 224, 100, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODEL, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODEL, PPQRY_PARAMETRI183, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.PANEL_LIST, 244, 56, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.PANEL_FORM, 272, 100, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SLASHLABEL, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SLASHLABEL, -1, "", "SLASHLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 292, 100, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODEL, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODEL, PPQRY_PARAMETRI183, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, MyGlb.PANEL_LIST, 1040, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, MyGlb.PANEL_LIST, "Descrizione Impegno");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, MyGlb.PANEL_FORM, 44, 128, 508, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, MyGlb.PANEL_FORM, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIIMPEGN, MyGlb.PANEL_FORM, "Descrizione Impegno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRIIMPEGN, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRIIMPEGN, PPQRY_PARAMETRI183, "A.ROWNAMDESIMP", "ROWNAMDESIMP", 5, 140, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 1456, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, "Causale");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 80, 168, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAUSALE, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAUSALE, PPQRY_PARAMETRI183, "A.ROWNAMECAUSA", "ROWNAMECAUSA", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 1664, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 116, 192, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BOLLO, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BOLLO, PPQRY_PARAMETRI183, "A.ROWNAMEBOLLO", "ROWNAMEBOLLO", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_LIST, 1872, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_LIST, "Data Emissione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_FORM, 56, 216, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_FORM, "Data Emissione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAEMISSION, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAEMISSION, PPQRY_PARAMETRI183, "A.ROWNAMDATEMI", "ROWNAMDATEMI", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, MyGlb.PANEL_LIST, 240, 56, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, MyGlb.PANEL_FORM, 336, 104, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBUTT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRIDELIBUTT, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRIDELIBUTT, -1, "", "APRIDELIBUTT", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 20, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 304, 244, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLABE, -1, GRP_PARAMETRI_LIQUIDAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 2080, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Solo Provvisori di Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 12, 268, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Solo Provvisori di Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI183, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, MyGlb.PANEL_LIST, 232, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, MyGlb.PANEL_FORM, 352, 104, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBUTT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFODELIBUTT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFODELIBUTT, -1, "", "INFODELIBUTT", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OKBUTTON, MyGlb.PANEL_LIST, 232, 280, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OKBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OKBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OKBUTTON, MyGlb.PANEL_FORM, 452, 328, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OKBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OKBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_OKBUTTON, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_OKBUTTON, -1, "", "OKBUTTON", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCREXPR ");
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
    PAN_PARAMETRI.SetQuery(PPQRY_T58, 0, SQL, PFL_PARAMETRI_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T58, 1, SQL, PFL_PARAMETRI_CAUSALE, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCREXPR ");
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
    PAN_PARAMETRI.SetQuery(PPQRY_T60, 0, SQL, PFL_PARAMETRI_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T60, 1, SQL, PFL_PARAMETRI_BOLLO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
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
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUFFIC~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI183", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI183, IMDBDef15.PQRY_PARAMETRI183_RS, IMDBDef5.TBL_PARAMETRI204);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DELDAIMPSUIM, IMDBDef5.FLD_PARAMETRI204_ROWNAMDEDAI1);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DESDAIMPSUIM, IMDBDef5.FLD_PARAMETRI204_ROWNAMDEDAIM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DELIBERA, IMDBDef5.FLD_PARAMETRI204_SEDE_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODEL, IMDBDef5.FLD_PARAMETRI204_NUMERO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODEL, IMDBDef5.FLD_PARAMETRI204_ANNO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DESCRIIMPEGN, IMDBDef5.FLD_PARAMETRI204_ROWNAMDESIMP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAUSALE, IMDBDef5.FLD_PARAMETRI204_ROWNAMECAUSA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_BOLLO, IMDBDef5.FLD_PARAMETRI204_ROWNAMEBOLLO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAEMISSION, IMDBDef5.FLD_PARAMETRI204_ROWNAMDATEMI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI204_ROWNAMEUFFIC);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI204");
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

  private void PAN_NOTEFUNZIONA_Init()
  {

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "8F7C649E-78E2-4C21-A2DF-708E3EEA4862");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "MODULO");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "8C199FB3-738D-4405-9D8A-E48E198FEEA3");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "D0C73642-0E24-40F7-A12A-96633D2A08B3");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "FUNZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "C38773DD-25A7-43AC-85F2-D65572D6E559");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.VIS_HTMEDISTNOSF);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTEFUNZIONA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 56);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, "MODULO");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, "MODULO");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_MODULO, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_MODULO, PPQRY_NOTEFUNZIO17, "A.MODULO", "MODULO", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_PAGINA, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_PAGINA, PPQRY_NOTEFUNZIO17, "A.PAGINA", "PAGINA", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_FUNZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_FUNZIONE, PPQRY_NOTEFUNZIO17, "A.FUNZIONE", "FUNZIONE", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 12, 16, 304, 364, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 28);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_DESCRIZIONE, PPQRY_NOTEFUNZIO17, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -13997);
  }

  private void PAN_NOTEFUNZIONA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONA.SetIMDB(IMDB, "PQRY_NOTEFUNZIO17", true);
    PAN_NOTEFUNZIONA.set_SetString(MyGlb.MASTER_ROWNAME, "NOTE FUNZIONALITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO17, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO17, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_EMISMANDAPRO,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = 'Descrizione') ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO17, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO17, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO17, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO17, 5, SQL, -1, "");
    PAN_NOTEFUNZIONA.SetQueryDB(PPQRY_NOTEFUNZIO17, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NOTEFUNZIONA.SetMasterTable(0, "NOTE_FUNZIONALITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTEFUNZIONA.Status() == 2)
    {
      int oldListQBE = PAN_NOTEFUNZIONA.iUseListQBE;
      PAN_NOTEFUNZIONA.iUseListQBE = 0;
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_FIND);
      PAN_NOTEFUNZIONA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
