// **********************************************
// Liquidazione Distinta Cassa Economale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioneDistintaCassaEconomale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_DISTINTLABEL = 0;
  private static int PFL_PARAMETRI_NUMERODISTIN = 1;
  private static int PFL_PARAMETRI_ANNODISTINTA = 2;
  private static int PFL_PARAMETRI_PERIODODAL = 3;
  private static int PFL_PARAMETRI_AL = 4;
  private static int PFL_PARAMETRI_SOLOMOVDALIQ = 5;
  private static int PFL_PARAMETRI_BARRDISTLABE = 6;
  private static int PFL_PARAMETRI_SCELDISTLABE = 7;

  private static int PPQRY_PARAMETRI292 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_LIQDISCASECO_ECONOMO = 0;
  private static int PFL_LIQDISCASECO_NUMEROIMPEGN = 1;
  private static int PFL_LIQDISCASECO_ANNOIMPEGNO = 2;
  private static int PFL_LIQDISCASECO_INFOIMPEGNO = 3;
  private static int PFL_LIQDISCASECO_NUMEROSUBIMP = 4;
  private static int PFL_LIQDISCASECO_ANNOSUBIMPEG = 5;
  private static int PFL_LIQDISCASECO_INFOSUBIMPEG = 6;
  private static int PFL_LIQDISCASECO_IMPORTO = 7;
  private static int PFL_LIQDISCASECO_BENEFICIARIO = 8;
  private static int PFL_LIQDISCASECO_LIQNOMINATIV = 9;
  private static int PFL_LIQDISCASECO_NUMEROLIQ = 10;
  private static int PFL_LIQDISCASECO_ANNOLIQ = 11;
  private static int PFL_LIQDISCASECO_PROGRECONOMO = 12;
  private static int PFL_LIQDISCASECO_ANNODISTINRR = 13;
  private static int PFL_LIQDISCASECO_NUMERDISTIRR = 14;
  private static int PFL_LIQDISCASECO_PROGRSOGGETT = 15;
  private static int PFL_LIQDISCASECO_IMPEGNOLABEL = 16;
  private static int PFL_LIQDISCASECO_SUBIMPEGLABE = 17;
  private static int PFL_LIQDISCASECO_LIQUIDALABEL = 18;
  private static int PFL_LIQDISCASECO_ETICHETOTALE = 19;

  private static int PPQRY_MOVIMCASSGC4 = 0;


  IDPanel PAN_LIQDISCASECO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI295(IMDB);
    Init_TBL_PARAMETRIOL9(IMDB);
    //
    //
    Init_PQRY_PARAMETRI292(IMDB);
    Init_PQRY_PARAMETRI292_RS(IMDB);
    Init_PQRY_MOVIMCASSGC4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI295(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI295, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI295, "TBL_PARAMETRI295");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI295,IMDBDef5.FLD_PARAMETRI295_PARAANNODIST, "PARAANNODIST");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI295,IMDBDef5.FLD_PARAMETRI295_PARAANNODIST,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI295,IMDBDef5.FLD_PARAMETRI295_PARANUMEDIST, "PARANUMEDIST");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI295,IMDBDef5.FLD_PARAMETRI295_PARANUMEDIST,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI295,IMDBDef5.FLD_PARAMETRI295_PARSOLMODALI, "PARSOLMODALI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI295,IMDBDef5.FLD_PARAMETRI295_PARSOLMODALI,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI295,IMDBDef5.FLD_PARAMETRI295_PARAMPERIDAL, "PARAMPERIDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI295,IMDBDef5.FLD_PARAMETRI295_PARAMPERIDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI295,IMDBDef5.FLD_PARAMETRI295_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI295,IMDBDef5.FLD_PARAMETRI295_PARAMAL,6,19,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI295, 0);
  }

  private static void Init_TBL_PARAMETRIOL9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRIOL9, 2);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRIOL9, "TBL_PARAMETRIOL9");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIOL9,IMDBDef5.FLD_PARAMETRIOL9_ANNODISTIOLD, "ANNODISTIOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIOL9,IMDBDef5.FLD_PARAMETRIOL9_ANNODISTIOLD,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIOL9,IMDBDef5.FLD_PARAMETRIOL9_NUMERDISTOLD, "NUMERDISTOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIOL9,IMDBDef5.FLD_PARAMETRIOL9_NUMERDISTOLD,1,6,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRIOL9, 0);
  }

  private static void Init_PQRY_PARAMETRI292(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI292, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI292, "PQRY_PARAMETRI292");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI292,IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST, "PARAANNODIST");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI292,IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI292,IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST, "PARANUMEDIST");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI292,IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI292,IMDBDef14.PQSL_PARAMETRI292_PARSOLMODALI, "PARSOLMODALI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI292,IMDBDef14.PQSL_PARAMETRI292_PARSOLMODALI,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI292,IMDBDef14.PQSL_PARAMETRI292_PARAMPERIDAL, "PARAMPERIDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI292,IMDBDef14.PQSL_PARAMETRI292_PARAMPERIDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI292,IMDBDef14.PQSL_PARAMETRI292_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI292,IMDBDef14.PQSL_PARAMETRI292_PARAMAL,6,19,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI292, 0);
  }

  private static void Init_PQRY_PARAMETRI292_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI292_RS, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI292_RS, "PQRY_PARAMETRI292_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI292_RS,IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST, "PARAANNODIST");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI292_RS,IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI292_RS,IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST, "PARANUMEDIST");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI292_RS,IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI292_RS,IMDBDef14.PQSL_PARAMETRI292_PARSOLMODALI, "PARSOLMODALI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI292_RS,IMDBDef14.PQSL_PARAMETRI292_PARSOLMODALI,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI292_RS,IMDBDef14.PQSL_PARAMETRI292_PARAMPERIDAL, "PARAMPERIDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI292_RS,IMDBDef14.PQSL_PARAMETRI292_PARAMPERIDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI292_RS,IMDBDef14.PQSL_PARAMETRI292_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI292_RS,IMDBDef14.PQSL_PARAMETRI292_PARAMAL,6,19,0);
  }

  private static void Init_PQRY_MOVIMCASSGC4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_MOVIMCASSGC4, 16);
    IMDB.set_TblCode(IMDBDef14.PQRY_MOVIMCASSGC4, "PQRY_MOVIMCASSGC4");
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_ANNO_IMPEGNO, "ANNO_IMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_ANNO_IMPEGNO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_NUMERO_IMPEGNO, "NUMERO_IMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_NUMERO_IMPEGNO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_MOVCASGCINIM, "MOVCASGCINIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_MOVCASGCINIM,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_ANNO_SUBIMPEGNO, "ANNO_SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_ANNO_SUBIMPEGNO,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_NUMERO_SUBIMPEGNO, "NUMERO_SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_NUMERO_SUBIMPEGNO,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_MOCAGCINSUIM, "MOCAGCINSUIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_MOCAGCINSUIM,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_IMPORTO,3,15,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_PROGR_ECONOMO, "PROGR_ECONOMO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_PROGR_ECONOMO,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_ANNO_DISTINTA_RR, "ANNO_DISTINTA_RR");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_ANNO_DISTINTA_RR,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_NUMERO_DISTINTA_RR, "NUMERO_DISTINTA_RR");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_NUMERO_DISTINTA_RR,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_LIQ_NOMINATIVA, "LIQ_NOMINATIVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_LIQ_NOMINATIVA,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_PROGR_SOGGETTO, "PROGR_SOGGETTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_PROGR_SOGGETTO,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_MOCAGCBERSEE, "MOCAGCBERSEE");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_MOCAGCBERSEE,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_MOCAGCBERSES, "MOCAGCBERSES");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMCASSGC4,IMDBDef14.PQSL_MOVIMCASSGC4_MOCAGCBERSES,5,60,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_MOVIMCASSGC4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioneDistintaCassaEconomale(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioneDistintaCassaEconomale()
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
    FormIdx = MyGlb.FRM_LIQDISCASECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B084ADBF-14CA-4A38-904C-6632700B9CB7";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 816;
    DesignHeight = 486;
    set_Caption(new IDVariant("Liquidazione Distinta Cassa Economale"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 816;
    Frames[1].Height = 460;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.121739;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 816;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "51B1F1C8-6E10-4842-A89B-B4EBD4DEFC4D");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 352, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    Frames[3].Width = 816;
    Frames[3].Height = 404;
    Frames[3].Caption = "Liquidazione Distinta Cassa Economale";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 404;
    PAN_LIQDISCASECO = new IDPanel(w, this, 3, "PAN_LIQDISCASECO");
    Frames[3].Content = PAN_LIQDISCASECO;
    PAN_LIQDISCASECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQDISCASECO.VS = MainFrm.VisualStyleList;
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "10CDB3DB-B4A3-493F-83FB-7F1083A91F13");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 780, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQDISCASECO.InitStatus = 2;
    PAN_LIQDISCASECO_Init();
    PAN_LIQDISCASECO_InitFields();
    PAN_LIQDISCASECO_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI19+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI40+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI19+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMISSILIQUI3+BaseCmdLinIdx)
      {
        EmissioneLiquidazioniCassaEcon();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI295, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LIQDISCASECO_PARAMETRI292();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_LIQDISCASECO.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCDIDIRICAEC && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCELDISTLABE) {
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
    return (obj instanceof LiquidazioneDistintaCassaEconomale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioneDistintaCassaEconomale.class.getName() : (Glb.ClassWithPackage(LiquidazioneDistintaCassaEconomale.class) ? LiquidazioneDistintaCassaEconomale.class.getName().substring(LiquidazioneDistintaCassaEconomale.class.getPackage().getName().length() + 1) : LiquidazioneDistintaCassaEconomale.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Setta Old Param
  // **********************************************************************
  public int SettaOldParam ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Old Param Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL9, IMDBDef5.FLD_PARAMETRIOL9_ANNODISTIOLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL9, IMDBDef5.FLD_PARAMETRIOL9_NUMERDISTOLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "SettaOldParam", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Old Param
  // **********************************************************************
  public int AnnullaOldParam ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Old Param Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL9, IMDBDef5.FLD_PARAMETRIOL9_ANNODISTIOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL9, IMDBDef5.FLD_PARAMETRIOL9_NUMERDISTOLD, 0, (new IDVariant()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "AnnullaOldParam", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMCASSGC4, IMDBDef14.PQSL_MOVIMCASSGC4_ANNO_IMPEGNO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMCASSGC4, IMDBDef14.PQSL_MOVIMCASSGC4_NUMERO_IMPEGNO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("I")));
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Sub Impegno
  // **********************************************************************
  public int InfoSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Sub Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMCASSGC4, IMDBDef14.PQSL_MOVIMCASSGC4_ANNO_SUBIMPEGNO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMCASSGC4, IMDBDef14.PQSL_MOVIMCASSGC4_NUMERO_SUBIMPEGNO, 0));
      if (IMDB.Value(IMDBDef14.PQRY_MOVIMCASSGC4, IMDBDef14.PQSL_MOVIMCASSGC4_ANNO_SUBIMPEGNO, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      MainFrm.UnloadForm(MyGlb.FRM_INFORSUBIMPE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "InfoSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Emissione Liquidazioni Cassa Econ
  // **********************************************************************
  public int EmissioneLiquidazioniCassaEcon ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissione Liquidazioni Cassa Econ Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARANUMEDIST, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAANNODIST, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARADATALIQU, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMPERIDAL, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAMPERIDAL, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMAL, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAMAL, 0));
      MainFrm.Show(MyGlb.FRM_EMILIQCASECO, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "EmissioneLiquidazioniCassaEcon", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcola Somma
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CalcolaSomma ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcola Somma Body
      // Corpo Procedura
      // 
      PAN_LIQDISCASECO.set_FieldText(PFL_LIQDISCASECO_ETICHETOTALE, IDL.Format(IDL.NullValue(PAN_LIQDISCASECO.GetFieldSum(PFL_LIQDISCASECO_IMPORTO),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "CalcolaSomma", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Distinta Di Rimborso
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaDistintaDiRimborso ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Distinta Di Rimborso Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_SCDIDIRICAEC, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_SCDIDIRICAEC,(new IDVariant(0)).booleanValue()); 
      }
      MainFrm.Show(MyGlb.FRM_SCDIDIRICAEC, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "SceltaDistintaDiRimborso", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Liquidazione Distinta Cassa Economale On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQDISCASECO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQDISCASECO);
      // 
      // Liquidazione Distinta Cassa Economale On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_LIQDISCASECO.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQDISCASECO_ECONOMO,(new IDVariant(PAN_LIQDISCASECO.FieldText(PFL_LIQDISCASECO_ECONOMO))).stringValue()); 
      PAN_LIQDISCASECO.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQDISCASECO_BENEFICIARIO,(new IDVariant(PAN_LIQDISCASECO.FieldText(PFL_LIQDISCASECO_BENEFICIARIO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "LiquidazioneDistintaCassaEconomaleOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione Distinta Cassa Economale After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_LIQDISCASECO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazione Distinta Cassa Economale After Find Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMCASSGC4, IMDBDef14.PQSL_MOVIMCASSGC4_NUMERO_DISTINTA_RR, 0))))
      {
        MainFrm.CmdObj.set_CmdSetEnabled(MyGlb.CMDS_COMMANDSET9+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetEnabled(MyGlb.CMDS_COMMANDSET9+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      CalcolaSomma();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "LiquidazioneDistintaCassaEconomaleAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione Distinta Cassa Economale On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_LIQDISCASECO_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazione Distinta Cassa Economale On Change Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMCASSGC4, IMDBDef14.PQSL_MOVIMCASSGC4_NUMERO_DISTINTA_RR, 0))))
      {
        if (new IDVariant(PAN_LIQDISCASECO.Status()).compareTo((new IDVariant(2)), true)!=0)
        {
          MainFrm.CmdObj.set_CmdSetEnabled(MyGlb.CMDS_COMMANDSET9+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdSetEnabled(MyGlb.CMDS_COMMANDSET9+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        }
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetEnabled(MyGlb.CMDS_COMMANDSET9+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "LiquidazioneDistintaCassaEconomaleOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione Distinta Cassa Economale On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_LIQDISCASECO_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazione Distinta Cassa Economale On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_LIQDISCASECO.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET9+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_LIQDISCASECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQDISCASECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQDISCASECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_IMPEGNOLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_LIQDISCASECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_LIQDISCASECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_LIQDISCASECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_LIQUIDALABEL, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET9+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        PAN_LIQDISCASECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQDISCASECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQDISCASECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_IMPEGNOLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add((new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_LIQDISCASECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add((new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_LIQDISCASECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_LIQDISCASECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_LIQUIDALABEL, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQDISCASECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "LiquidazioneDistintaCassaEconomaleOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione Distinta Cassa Economale On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_LIQDISCASECO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazione Distinta Cassa Economale On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_LIQDISCASECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQDISCASECO_ETICHETOTALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_LIQDISCASECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQDISCASECO_ETICHETOTALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "LiquidazioneDistintaCassaEconomaleOnCommand", _e);
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
      if (Column.equals((new IDVariant(PFL_PARAMETRI_NUMERODISTIN)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNODISTINTA)), true))
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRIOL9, IMDBDef5.FLD_PARAMETRIOL9_NUMERDISTOLD, 0), true)!=0 || IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRIOL9, IMDBDef5.FLD_PARAMETRIOL9_ANNODISTIOLD, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST, 0))))
          {
            IDVariant v_DATADA = new IDVariant(0,IDVariant.DATETIME);
            IDVariant v_DATAA = new IDVariant(0,IDVariant.DATETIME);
            IDVariant v_CHECK = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.DATA_DA as DISRICRIDADA, ");
            SQL.append("  A.DATA_A as DISRICRIMDAA ");
            SQL.append("from ");
            SQL.append("  DISTINTE_RIC_RIMBORSO A ");
            SQL.append("where (A.ANNO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_DATADA = QV.Get("DISRICRIDADA", IDVariant.DATETIME) ;
              v_DATAA = QV.Get("DISRICRIMDAA", IDVariant.DATETIME) ;
            }
            QV.Close();
            if (v_DATADA.equals((new IDVariant()), true))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Distinta non presente!", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_AVVISO); 
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL9, IMDBDef5.FLD_PARAMETRIOL9_ANNODISTIOLD, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL9, IMDBDef5.FLD_PARAMETRIOL9_NUMERDISTOLD, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAMPERIDAL, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAMAL, 0, (new IDVariant()));
              return;
            }
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI295, IMDBDef5.FLD_PARAMETRI295_PARAMPERIDAL, 0, new IDVariant(v_DATADA));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI295, IMDBDef5.FLD_PARAMETRI295_PARAMAL, 0, new IDVariant(v_DATAA));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  CHECK_DISTINTA_LIQ(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as CDLPADLDCEPP ");
            SQL.append("from ");
            SQL.append("  DUAL A ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CHECK = QV.Get("CDLPADLDCEPP", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CHECK.equals((new IDVariant(0)), true))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Distinta completamente Liquidata!", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_AVVISO); 
            }
          }
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL9, IMDBDef5.FLD_PARAMETRIOL9_ANNODISTIOLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL9, IMDBDef5.FLD_PARAMETRIOL9_NUMERDISTOLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PARAMETRI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri After Find Event Body
      // Procedure Body
      // 
      SettaOldParam();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "ParametriAfterFindEvent", _e);
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
      AnnullaOldParam();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCDIDIRICAEC)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAANNODIST, 0, IMDB.Value(IMDBDef14.PQRY_DISTINTE1, IMDBDef14.PQSL_DISTINTE1_BEDIRIRIANDI, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARANUMEDIST, 0, IMDB.Value(IMDBDef14.PQRY_DISTINTE1, IMDBDef14.PQSL_DISTINTE1_BEDIRIRINUDI, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL9, IMDBDef5.FLD_PARAMETRIOL9_ANNODISTIOLD, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL9, IMDBDef5.FLD_PARAMETRIOL9_NUMERDISTOLD, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAMPERIDAL, 0, IMDB.Value(IMDBDef14.PQRY_DISTINTE1, IMDBDef14.PQSL_DISTINTE1_BEDIRIRIDADA, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI292, IMDBDef14.PQSL_PARAMETRI292_PARAMAL, 0, IMDB.Value(IMDBDef14.PQRY_DISTINTE1, IMDBDef14.PQSL_DISTINTE1_BENDIRIRIDAA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_EMILIQCASECO)), true))
      {
        PAN_LIQDISCASECO.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneDistintaCassaEconomale", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void LIQDISCASECO_PARAMETRI292() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI292_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI295, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI295, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI292_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI292_RS, 0, IMDBDef5.TBL_PARAMETRI295, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI292_RS, 0, 0, IMDBDef5.TBL_PARAMETRI295, IMDBDef5.FLD_PARAMETRI295_PARAANNODIST, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI292_RS, 1, 0, IMDBDef5.TBL_PARAMETRI295, IMDBDef5.FLD_PARAMETRI295_PARANUMEDIST, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI292_RS, 2, 0, IMDBDef5.TBL_PARAMETRI295, IMDBDef5.FLD_PARAMETRI295_PARSOLMODALI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI292_RS, 3, 0, IMDBDef5.TBL_PARAMETRI295, IMDBDef5.FLD_PARAMETRI295_PARAMPERIDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI292_RS, 4, 0, IMDBDef5.TBL_PARAMETRI295, IMDBDef5.FLD_PARAMETRI295_PARAMAL, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI295, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI295, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI295, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI292_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_SCELDISTLABE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaDistintaDiRimborso();
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
  private void PAN_LIQDISCASECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQDISCASECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQDISCASECO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQDISCASECO, Cancel);
    // Stub
  }

  private void PAN_LIQDISCASECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQDISCASECO_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_LIQDISCASECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQDISCASECO_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_LIQDISCASECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQDISCASECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_LIQDISCASECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQDISCASECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, "B81E398F-97D0-47D5-A5D4-25957A664954");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, "Distinta");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, "A658C5CE-AC61-43A6-B565-EFF68C097541");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, "Numero Distinta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, "700243ED-76F2-4B00-BBC0-D61363648BA3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, "Anno Distinta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, "36ADD820-78CB-496B-BBA2-361DCDF5132D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, "Periodo Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "1310B301-5D86-4E2D-873E-32FBA2A3D623");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, "260AB4DB-B248-4FD6-8C39-5818ADA8053F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, "Solo Movimenti Da Liquidare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, "0D279EB0-EC83-4D4D-BF3B-3EFCF5305980");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, "2679D3A2-9C65-4EF3-BE21-44880976A683");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_LIST, 24, 16, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_FORM, 24, 16, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DISTINTLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DISTINTLABEL, -1, "", "DISTINTLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, 40, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, "Numero Distinta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, 80, 16, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, "Num. Distinta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODISTIN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODISTIN, PPQRY_PARAMETRI292, "A.PARANUMEDIST", "PARANUMEDIST", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, "Ann. Dist.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, 148, 16, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, "Ann. Dist.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODISTINTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODISTINTA, PPQRY_PARAMETRI292, "A.PARAANNODIST", "PARAANNODIST", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, MyGlb.PANEL_LIST, "Periodo Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, MyGlb.PANEL_FORM, 216, 16, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODODAL, MyGlb.PANEL_FORM, "Periodo Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PERIODODAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PERIODODAL, PPQRY_PARAMETRI292, "A.PARAMPERIDAL", "PARAMPERIDAL", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 368, 16, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI292, "A.PARAMAL", "PARAMAL", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, MyGlb.PANEL_LIST, 96, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, MyGlb.PANEL_LIST, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, MyGlb.PANEL_LIST, "S. Mov. D. Liq.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, MyGlb.PANEL_FORM, 600, 16, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, MyGlb.PANEL_FORM, 168);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOMOVDALIQ, MyGlb.PANEL_FORM, "Solo Movimenti Da Liquidare");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOMOVDALIQ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOMOVDALIQ, PPQRY_PARAMETRI292, "A.PARSOLMODALI", "PARSOLMODALI", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOMOVDALIQ, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOMOVDALIQ, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.PANEL_LIST, 32, 24, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.PANEL_FORM, 132, 16, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRDISTLABE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRDISTLABE, -1, "", "BARRDISTLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.PANEL_LIST, 172, 16, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.PANEL_FORM, 192, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELDISTLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCELDISTLABE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCELDISTLABE, -1, "", "SCELDISTLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_SCELDISTLABE, 2);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI292", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI292, IMDBDef14.PQRY_PARAMETRI292_RS, IMDBDef5.TBL_PARAMETRI295);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODISTIN, IMDBDef5.FLD_PARAMETRI295_PARANUMEDIST);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODISTINTA, IMDBDef5.FLD_PARAMETRI295_PARAANNODIST);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PERIODODAL, IMDBDef5.FLD_PARAMETRI295_PARAMPERIDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI295_PARAMAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOMOVDALIQ, IMDBDef5.FLD_PARAMETRI295_PARSOLMODALI);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI295");
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

  private void PAN_LIQDISCASECO_Init()
  {

    PAN_LIQDISCASECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQDISCASECO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQDISCASECO.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, "F9C94AEC-9CD9-455C-B779-F4706A7A9DBF");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, "Economo");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, "127D6F7A-A6DE-4094-A87B-68C3509FAF8E");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, "NUMERO IMPEGNO");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, "356046FC-E8A8-4701-8880-4904EF3E422A");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, "ANNO IMPEGNO");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, "8D93BE21-4BD0-4E8E-B28B-814BD969362C");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, "Info Impegno");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, "75A4E7F5-02DC-46F5-95AD-E479D8F68A8D");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, "NUMERO SUBIMPEGNO");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, "541FAC8B-23BB-4845-B6C2-55C957C0089F");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, "ANNO SUBIMPEGNO");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, "F6109891-78E0-45B4-9617-ED6777E14FC2");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, "Info Sub Impegno");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, "599D4AF5-9B26-4502-B9AB-A6D45ABBDB7B");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, "Importo");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, "D8585896-C5F1-4EB0-9E70-B730A1869176");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, "Beneficiario");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, "A6ECF4D9-A516-45C4-917A-DD46FADB4F8A");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, "Liq. Nominativa");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, "38DD30EC-E5ED-4A8F-931C-DC904D947A32");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, "NUMERO LIQ");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, "36324EB0-4089-46F1-95A3-DD69ECECA408");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, "ANNO LIQ");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, "6D7E4BF0-A277-49E7-A994-AF6D32C8472F");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, "PROGR ECONOMO");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, "BB95C855-0A92-47B6-8F10-A43108C9B933");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, "ANNO DISTINTA RR");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, "93A3144D-12F7-497D-8240-81455427FE0A");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, "NUMERO DISTINTA RR");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, "F34DE71F-A3C5-41BB-B169-6DBE2C18BE00");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, "PROGR SOGGETTO");
    PAN_LIQDISCASECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, "");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPEGNOLABEL, "AAA91B0C-E12B-4AF2-8E2C-C9437737BFC9");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPEGNOLABEL, "Impegno");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPEGNOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPEGNOLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, "E87DBC4A-91F3-454C-BC52-7294B22478FA");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, "Sub-Impegno");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQUIDALABEL, "297AF811-3C6C-45A7-B62C-51D7B04F6CC4");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQUIDALABEL, "Liquidazione");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQUIDALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQUIDALABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQDISCASECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ETICHETOTALE, "6B2427DC-B853-43DC-9AD8-34C8AA5AB147");
    PAN_LIQDISCASECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ETICHETOTALE, "Totale");
    PAN_LIQDISCASECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ETICHETOTALE, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQDISCASECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ETICHETOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_LIQDISCASECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, MyGlb.PANEL_LIST, 100);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, MyGlb.PANEL_LIST, "Economo");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, MyGlb.PANEL_FORM, 4, 268, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, MyGlb.PANEL_FORM, 100);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ECONOMO, MyGlb.PANEL_FORM, "Economo");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_ECONOMO, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_ECONOMO, PPQRY_MOVIMCASSGC4, "B.RAGIONE_SOCIALE_ESTESA", "MOCAGCBERSEE", 5, 60, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, MyGlb.PANEL_LIST, 164, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, MyGlb.PANEL_LIST, 100);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, MyGlb.PANEL_LIST, "NUM. IMP.");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, MyGlb.PANEL_FORM, 372, 28, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, MyGlb.PANEL_FORM, 112);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROIMPEGN, MyGlb.PANEL_FORM, "NUMERO IMPEGNO");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_NUMEROIMPEGN, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_NUMEROIMPEGN, PPQRY_MOVIMCASSGC4, "A.NUMERO_IMPEGNO", "NUMERO_IMPEGNO", 1, 5, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, MyGlb.PANEL_LIST, 208, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, MyGlb.PANEL_LIST, 88);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, MyGlb.PANEL_LIST, "ANN. IMP.");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, MyGlb.PANEL_FORM, 212, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, MyGlb.PANEL_FORM, 104);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOIMPEGNO, MyGlb.PANEL_FORM, "ANNO IMPEGNO");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_ANNOIMPEGNO, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_ANNOIMPEGNO, PPQRY_MOVIMCASSGC4, "A.ANNO_IMPEGNO", "ANNO_IMPEGNO", 1, 4, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, MyGlb.PANEL_LIST, 244, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, MyGlb.PANEL_LIST, 76);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, MyGlb.PANEL_LIST, "I. I.");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, MyGlb.PANEL_FORM, 4, 316, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, MyGlb.PANEL_FORM, 76);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOIMPEGNO, MyGlb.PANEL_FORM, "Info Impegno");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_INFOIMPEGNO, -1, -1);
    PAN_LIQDISCASECO.SetFieldUnbound(PFL_LIQDISCASECO_INFOIMPEGNO, true);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_INFOIMPEGNO, PPQRY_MOVIMCASSGC4, "DECODE(A.NUMERO_IMPEGNO, to_number(NULL), NULL, 'I')", "MOVCASGCINIM", 5, 99, 0, -13997);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOIMPEGNO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, MyGlb.PANEL_LIST, 264, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, MyGlb.PANEL_LIST, 120);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, MyGlb.PANEL_FORM, 212, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, MyGlb.PANEL_FORM, 136);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUMERO SUBIMPEGNO");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_NUMEROSUBIMP, -1, -1);
    PAN_LIQDISCASECO.SetFieldUnbound(PFL_LIQDISCASECO_NUMEROSUBIMP, true);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_NUMEROSUBIMP, PPQRY_MOVIMCASSGC4, "DECODE(A.NUMERO_SUBIMPEGNO, 0, to_number(NULL), A.NUMERO_SUBIMPEGNO)", "NUMERO_SUBIMPEGNO", 1, 19, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 308, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 108);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 4, 52, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 152);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOSUBIMPEG, MyGlb.PANEL_FORM, "ANNO SUBIMPEGNO");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_ANNOSUBIMPEG, -1, -1);
    PAN_LIQDISCASECO.SetFieldUnbound(PFL_LIQDISCASECO_ANNOSUBIMPEG, true);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_ANNOSUBIMPEG, PPQRY_MOVIMCASSGC4, "DECODE(A.ANNO_SUBIMPEGNO, 0, to_number(NULL), A.ANNO_SUBIMPEGNO)", "ANNO_SUBIMPEGNO", 1, 19, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, MyGlb.PANEL_LIST, 344, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, MyGlb.PANEL_LIST, 96);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, MyGlb.PANEL_LIST, "I. S. I.");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, MyGlb.PANEL_FORM, 4, 364, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, MyGlb.PANEL_FORM, 96);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, MyGlb.PANEL_FORM, 2);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_INFOSUBIMPEG, MyGlb.PANEL_FORM, "Info Sub Impegno");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_INFOSUBIMPEG, -1, -1);
    PAN_LIQDISCASECO.SetFieldUnbound(PFL_LIQDISCASECO_INFOSUBIMPEG, true);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_INFOSUBIMPEG, PPQRY_MOVIMCASSGC4, "DECODE(NVL(A.NUMERO_SUBIMPEGNO, 0), 0, NULL, 'I')", "MOCAGCINSUIM", 5, 99, 0, -13997);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQDISCASECO.SetValueListItem(PFL_LIQDISCASECO_INFOSUBIMPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, MyGlb.PANEL_LIST, 364, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, MyGlb.PANEL_FORM, 404, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, MyGlb.PANEL_FORM, 72);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_IMPORTO, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_IMPORTO, PPQRY_MOVIMCASSGC4, "A.IMPORTO", "IMPORTO", 3, 15, 2, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, MyGlb.PANEL_LIST, 464, 36, 164, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, MyGlb.PANEL_LIST, 100);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 292, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_BENEFICIARIO, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_BENEFICIARIO, PPQRY_MOVIMCASSGC4, "C.RAGIONE_SOCIALE_ESTESA", "MOCAGCBERSES", 5, 60, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, MyGlb.PANEL_LIST, 628, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, MyGlb.PANEL_LIST, 92);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, MyGlb.PANEL_LIST, "Liq. Nominativa");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, MyGlb.PANEL_FORM, 260, 196, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, MyGlb.PANEL_FORM, 104);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQNOMINATIV, MyGlb.PANEL_FORM, "Liq. Nominativa");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_LIQNOMINATIV, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_LIQNOMINATIV, PPQRY_MOVIMCASSGC4, "A.LIQ_NOMINATIVA", "LIQ_NOMINATIVA", 5, 1, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, MyGlb.PANEL_LIST, 700, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, MyGlb.PANEL_LIST, "NUM. LIQ");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 244, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, MyGlb.PANEL_FORM, 152);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMEROLIQ, MyGlb.PANEL_FORM, "NUMERO LIQ");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_NUMEROLIQ, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_NUMEROLIQ, PPQRY_MOVIMCASSGC4, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, MyGlb.PANEL_LIST, 744, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, MyGlb.PANEL_FORM, 428, 220, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, MyGlb.PANEL_FORM, 72);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_ANNOLIQ, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_ANNOLIQ, PPQRY_MOVIMCASSGC4, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, MyGlb.PANEL_LIST, 744, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, MyGlb.PANEL_LIST, 100);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, MyGlb.PANEL_LIST, "PR. ECON.");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, MyGlb.PANEL_FORM, 252, 100, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, MyGlb.PANEL_FORM, 112);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRECONOMO, MyGlb.PANEL_FORM, "PROGR ECONOMO");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_PROGRECONOMO, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_PROGRECONOMO, PPQRY_MOVIMCASSGC4, "A.PROGR_ECONOMO", "PROGR_ECONOMO", 1, 8, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, MyGlb.PANEL_LIST, 784, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, MyGlb.PANEL_LIST, 104);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, MyGlb.PANEL_LIST, "A. DS. R.");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, MyGlb.PANEL_FORM, 396, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, MyGlb.PANEL_FORM, 120);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ANNODISTINRR, MyGlb.PANEL_FORM, "ANNO DISTINTA RR");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_ANNODISTINRR, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_ANNODISTINRR, PPQRY_MOVIMCASSGC4, "A.ANNO_DISTINTA_RR", "ANNO_DISTINTA_RR", 1, 4, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, MyGlb.PANEL_LIST, 744, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, MyGlb.PANEL_LIST, 120);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, MyGlb.PANEL_LIST, "NUM. DIST. RR");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, MyGlb.PANEL_FORM, 4, 148, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, MyGlb.PANEL_FORM, 152);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_NUMERDISTIRR, MyGlb.PANEL_FORM, "NUMERO DISTINTA RR");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_NUMERDISTIRR, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_NUMERDISTIRR, PPQRY_MOVIMCASSGC4, "A.NUMERO_DISTINTA_RR", "NUMERO_DISTINTA_RR", 1, 6, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, MyGlb.PANEL_LIST, 744, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, MyGlb.PANEL_LIST, 100);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, MyGlb.PANEL_LIST, "PR. SOGG.");
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, MyGlb.PANEL_FORM, 4, 220, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, MyGlb.PANEL_FORM, 152);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, MyGlb.PANEL_FORM, 1);
    PAN_LIQDISCASECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_PROGRSOGGETT, MyGlb.PANEL_FORM, "PROGR SOGGETTO");
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_PROGRSOGGETT, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_PROGRSOGGETT, PPQRY_MOVIMCASSGC4, "A.PROGR_SOGGETTO", "PROGR_SOGGETTO", 1, 8, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPEGNOLABEL, MyGlb.PANEL_LIST, 164, 0, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPEGNOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPEGNOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPEGNOLABEL, MyGlb.PANEL_FORM, 188, 0, 80, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPEGNOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_IMPEGNOLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_IMPEGNOLABEL, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_IMPEGNOLABEL, -1, "", "IMPEGNOLABEL", 0, 0, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, MyGlb.PANEL_LIST, 264, 0, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, MyGlb.PANEL_LIST, 2);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, MyGlb.PANEL_FORM, 196, 8, 80, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_SUBIMPEGLABE, MyGlb.PANEL_FORM, 2);
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_SUBIMPEGLABE, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_SUBIMPEGLABE, -1, "", "SUBIMPEGLABE", 0, 0, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQUIDALABEL, MyGlb.PANEL_LIST, 700, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQUIDALABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQUIDALABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQUIDALABEL, MyGlb.PANEL_FORM, 204, 16, 80, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQUIDALABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_LIQUIDALABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_LIQUIDALABEL, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_LIQUIDALABEL, -1, "", "LIQUIDALABEL", 0, 0, 0, -13997);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ETICHETOTALE, MyGlb.PANEL_LIST, 364, 244, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_LIQDISCASECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ETICHETOTALE, MyGlb.PANEL_FORM, 352, 252, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQDISCASECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_LIQDISCASECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQDISCASECO_ETICHETOTALE, MyGlb.PANEL_FORM, 2);
    PAN_LIQDISCASECO.SetFieldPage(PFL_LIQDISCASECO_ETICHETOTALE, -1, -1);
    PAN_LIQDISCASECO.SetFieldPanel(PFL_LIQDISCASECO_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
  }

  private void PAN_LIQDISCASECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQDISCASECO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQDISCASECO.SetIMDB(IMDB, "PQRY_MOVIMCASSGC4", true);
    PAN_LIQDISCASECO.set_SetString(MyGlb.MASTER_ROWNAME, "MOVIMENTI CASSE GC4");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_IMPEGNO as ANNO_IMPEGNO, ");
    SQL.append("  A.NUMERO_IMPEGNO as NUMERO_IMPEGNO, ");
    SQL.append("  DECODE(A.NUMERO_IMPEGNO, to_number(NULL), NULL, 'I') as MOVCASGCINIM, ");
    SQL.append("  DECODE(A.ANNO_SUBIMPEGNO, 0, to_number(NULL), A.ANNO_SUBIMPEGNO) as ANNO_SUBIMPEGNO, ");
    SQL.append("  DECODE(A.NUMERO_SUBIMPEGNO, 0, to_number(NULL), A.NUMERO_SUBIMPEGNO) as NUMERO_SUBIMPEGNO, ");
    SQL.append("  DECODE(NVL(A.NUMERO_SUBIMPEGNO, 0), 0, NULL, 'I') as MOCAGCINSUIM, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.PROGR_ECONOMO as PROGR_ECONOMO, ");
    SQL.append("  A.ANNO_DISTINTA_RR as ANNO_DISTINTA_RR, ");
    SQL.append("  A.NUMERO_DISTINTA_RR as NUMERO_DISTINTA_RR, ");
    SQL.append("  A.LIQ_NOMINATIVA as LIQ_NOMINATIVA, ");
    SQL.append("  A.PROGR_SOGGETTO as PROGR_SOGGETTO, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as MOCAGCBERSEE, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as MOCAGCBERSES ");
    PAN_LIQDISCASECO.SetQuery(PPQRY_MOVIMCASSGC4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MOVIMENTI_CASSE_GC4 A, ");
    SQL.append("  BEN B, ");
    SQL.append("  BEN C ");
    PAN_LIQDISCASECO.SetQuery(PPQRY_MOVIMCASSGC4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.CODICE(+) = A.PROGR_ECONOMO) ");
    SQL.append("and   (C.CODICE(+) = A.PROGR_SOGGETTO) ");
    SQL.append("and   (A.ANNO_DISTINTA_RR = ~~PQRY_PARAMETRI292.PARAANNODIST~~) ");
    SQL.append("and   (A.NUMERO_DISTINTA_RR = ~~PQRY_PARAMETRI292.PARANUMEDIST~~) ");
    SQL.append("and   (~~PQRY_PARAMETRI292.PARSOLMODALI~~ <> 'SI' OR (~~PQRY_PARAMETRI292.PARSOLMODALI~~ = 'SI' AND (A.ANNO_LIQ IS NULL))) ");
    PAN_LIQDISCASECO.SetQuery(PPQRY_MOVIMCASSGC4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQDISCASECO.SetQuery(PPQRY_MOVIMCASSGC4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQDISCASECO.SetQuery(PPQRY_MOVIMCASSGC4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQDISCASECO.SetQuery(PPQRY_MOVIMCASSGC4, 5, SQL, -1, "");
    PAN_LIQDISCASECO.SetQueryDB(PPQRY_MOVIMCASSGC4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQDISCASECO.SetMasterTable(0, "MOVIMENTI_CASSE_GC4");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQDISCASECO.Status() == 2)
    {
      int oldListQBE = PAN_LIQDISCASECO.iUseListQBE;
      PAN_LIQDISCASECO.iUseListQBE = 0;
      PAN_LIQDISCASECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQDISCASECO.PanelCommand(Glb.PCM_FIND);
      PAN_LIQDISCASECO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_LIQDISCASECO) PAN_LIQDISCASECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_LIQDISCASECO) PAN_LIQDISCASECO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_LIQDISCASECO) PAN_LIQDISCASECO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_LIQDISCASECO) PAN_LIQDISCASECO_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQDISCASECO) PAN_LIQDISCASECO_OnChangeRow();
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
    if (SrcObj == PAN_LIQDISCASECO) PAN_LIQDISCASECO_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_LIQDISCASECO) PAN_LIQDISCASECO_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_AfterFind(CmdFind);
    if (SrcObj == PAN_LIQDISCASECO) PAN_LIQDISCASECO_AfterFind(CmdFind);
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
    if (SrcObj == PAN_LIQDISCASECO) PAN_LIQDISCASECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
