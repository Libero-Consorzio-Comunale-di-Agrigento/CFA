// **********************************************
// Liquidazioni Da Distinta Economato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioniDaDistintaEconomato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_NUMERODISTIN = 0;
  private static int PFL_PARAMETRI_ANNODISTINTA = 1;
  private static int PFL_PARAMETRI_SOLOIMPDALIQ = 2;
  private static int PFL_PARAMETRI_DISTINTLABEL = 3;
  private static int PFL_PARAMETRI_BARRDISTLABE = 4;

  private static int PPQRY_PARAMETRI289 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_LIQUDADISECO_IMPORTO = 0;
  private static int PFL_LIQUDADISECO_DALIQUIDARE = 1;
  private static int PFL_LIQUDADISECO_IMPORTOIVA = 2;
  private static int PFL_LIQUDADISECO_NUMEROIMPEGN = 3;
  private static int PFL_LIQUDADISECO_ANNOIMPEGNO = 4;
  private static int PFL_LIQUDADISECO_INFOIMPEGNO = 5;
  private static int PFL_LIQUDADISECO_NUMEROSUBIMP = 6;
  private static int PFL_LIQUDADISECO_ANNOSUBIMPEG = 7;
  private static int PFL_LIQUDADISECO_INFOSUBIMPEG = 8;
  private static int PFL_LIQUDADISECO_CAPITOLO = 9;
  private static int PFL_LIQUDADISECO_ARTICOLO = 10;
  private static int PFL_LIQUDADISECO_INFOVOCEPEG = 11;
  private static int PFL_LIQUDADISECO_RAGIONSOCIAL = 12;
  private static int PFL_LIQUDADISECO_FATNUMERODOC = 13;
  private static int PFL_LIQUDADISECO_FATANNODOC = 14;
  private static int PFL_LIQUDADISECO_LIQTO = 15;
  private static int PFL_LIQUDADISECO_TIPODOCUMENT = 16;
  private static int PFL_LIQUDADISECO_ANNODISTINT1 = 17;
  private static int PFL_LIQUDADISECO_NUMERODISTI1 = 18;
  private static int PFL_LIQUDADISECO_ANNOFATTURA = 19;
  private static int PFL_LIQUDADISECO_PROGRFATTURA = 20;
  private static int PFL_LIQUDADISECO_IMPEGNOLABEL = 21;
  private static int PFL_LIQUDADISECO_SUBIMPEGLABE = 22;
  private static int PFL_LIQUDADISECO_CAPITARTLABE = 23;
  private static int PFL_LIQUDADISECO_DOCUMENLABEL = 24;
  private static int PFL_LIQUDADISECO_PROGRDISTINT = 25;
  private static int PFL_LIQUDADISECO_TOTALEIMPORT = 26;
  private static int PFL_LIQUDADISECO_TOTAIMPDALIQ = 27;
  private static int PFL_LIQUDADISECO_TOTALIMPOIVA = 28;

  private static int PPQRY_IMPUTAZIONI1 = 0;

  private static int PPQRY_FAT = 1;


  IDPanel PAN_LIQUDADISECO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI299(IMDB);
    Init_TBL_PARAMETRIOL5(IMDB);
    //
    //
    Init_PQRY_IMPUTAZIONI1(IMDB);
    Init_PQRY_PARAMETRI289(IMDB);
    Init_PQRY_PARAMETRI289_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI299(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI299, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI299, "TBL_PARAMETRI299");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI299,IMDBDef5.FLD_PARAMETRI299_PARAANNODIST, "PARAANNODIST");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI299,IMDBDef5.FLD_PARAMETRI299_PARAANNODIST,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI299,IMDBDef5.FLD_PARAMETRI299_PARANUMEDIST, "PARANUMEDIST");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI299,IMDBDef5.FLD_PARAMETRI299_PARANUMEDIST,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI299,IMDBDef5.FLD_PARAMETRI299_PARSOLIMDALI, "PARSOLIMDALI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI299,IMDBDef5.FLD_PARAMETRI299_PARSOLIMDALI,5,1,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI299, 0);
  }

  private static void Init_TBL_PARAMETRIOL5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRIOL5, 2);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRIOL5, "TBL_PARAMETRIOL5");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIOL5,IMDBDef5.FLD_PARAMETRIOL5_ANNODISTIOLD, "ANNODISTIOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIOL5,IMDBDef5.FLD_PARAMETRIOL5_ANNODISTIOLD,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIOL5,IMDBDef5.FLD_PARAMETRIOL5_NUMERDISTOLD, "NUMERDISTOLD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIOL5,IMDBDef5.FLD_PARAMETRIOL5_NUMERDISTOLD,1,6,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRIOL5, 0);
  }

  private static void Init_PQRY_IMPUTAZIONI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_IMPUTAZIONI1, 19);
    IMDB.set_TblCode(IMDBDef14.PQRY_IMPUTAZIONI1, "PQRY_IMPUTAZIONI1");
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_IMPUTAIMPORT, "IMPUTAIMPORT");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_IMPUTAIMPORT,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_IMPUTDALIQUI, "IMPUTDALIQUI");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_IMPUTDALIQUI,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_FATTURA, "ANNO_FATTURA");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_FATTURA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_PROGR_FATTURA, "PROGR_FATTURA");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_PROGR_FATTURA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_IMPEGNO, "ANNO_IMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_IMPEGNO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_IMPEGNO, "NUMERO_IMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_IMPEGNO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_IMPUINFOIMPE, "IMPUINFOIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_IMPUINFOIMPE,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_SUBIMPEGNO, "ANNO_SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_SUBIMPEGNO,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_SUBIMPEGNO, "NUMERO_SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_SUBIMPEGNO,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_IMPINFSUBIMP, "IMPINFSUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_IMPINFSUBIMP,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_IMPINFVOCPEG, "IMPINFVOCPEG");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_IMPINFVOCPEG,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_TIPO_DOCUMENTO, "TIPO_DOCUMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_TIPO_DOCUMENTO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_DISTINTA,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_FLAG_LIQUIDATO, "FLAG_LIQUIDATO");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_FLAG_LIQUIDATO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_IMPORTO_IVA, "IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_PROGR_DISTINTA, "PROGR_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_IMPUTAZIONI1,IMDBDef14.PQSL_IMPUTAZIONI1_PROGR_DISTINTA,1,6,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_IMPUTAZIONI1, 0);
  }

  private static void Init_PQRY_PARAMETRI289(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI289, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI289, "PQRY_PARAMETRI289");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI289,IMDBDef14.PQSL_PARAMETRI289_PARAANNODIST, "PARAANNODIST");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI289,IMDBDef14.PQSL_PARAMETRI289_PARAANNODIST,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI289,IMDBDef14.PQSL_PARAMETRI289_PARANUMEDIST, "PARANUMEDIST");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI289,IMDBDef14.PQSL_PARAMETRI289_PARANUMEDIST,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI289,IMDBDef14.PQSL_PARAMETRI289_PARSOLIMDALI, "PARSOLIMDALI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI289,IMDBDef14.PQSL_PARAMETRI289_PARSOLIMDALI,5,1,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI289, 0);
  }

  private static void Init_PQRY_PARAMETRI289_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI289_RS, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI289_RS, "PQRY_PARAMETRI289_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI289_RS,IMDBDef14.PQSL_PARAMETRI289_PARAANNODIST, "PARAANNODIST");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI289_RS,IMDBDef14.PQSL_PARAMETRI289_PARAANNODIST,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI289_RS,IMDBDef14.PQSL_PARAMETRI289_PARANUMEDIST, "PARANUMEDIST");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI289_RS,IMDBDef14.PQSL_PARAMETRI289_PARANUMEDIST,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI289_RS,IMDBDef14.PQSL_PARAMETRI289_PARSOLIMDALI, "PARSOLIMDALI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI289_RS,IMDBDef14.PQSL_PARAMETRI289_PARSOLIMDALI,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioniDaDistintaEconomato(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioniDaDistintaEconomato()
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
    FormIdx = MyGlb.FRM_LIQUDADISECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "47380D07-4398-450A-9180-DAEB6F937603";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1040;
    DesignHeight = 426;
    set_Caption(new IDVariant("Liquidazioni Da Distinta Economato"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1040;
    Frames[1].Height = 400;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.13;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1040;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 52;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7A79BCC0-6EBE-4A15-AF4C-46DBA786584A");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 128, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1040;
    Frames[3].Height = 348;
    Frames[3].Caption = "Liquidazioni Da Distinta Economato";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 348;
    PAN_LIQUDADISECO = new IDPanel(w, this, 3, "PAN_LIQUDADISECO");
    Frames[3].Content = PAN_LIQUDADISECO;
    PAN_LIQUDADISECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUDADISECO.VS = MainFrm.VisualStyleList;
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9E6372E2-C579-4F7F-858D-8E0E139E1498");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 960, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUDADISECO.InitStatus = 2;
    PAN_LIQUDADISECO_Init();
    PAN_LIQUDADISECO_InitFields();
    PAN_LIQUDADISECO_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA28+BaseCmdLinIdx)
      {
        Salva();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI24+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG122+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI24+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTRODISPO5+BaseCmdLinIdx)
      {
        ControlloDisponibilita();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMISSILIQUI2+BaseCmdLinIdx)
      {
        EmissioneLiquidazioniDistEcon();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI299, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LIQUDADISECO_PARAMETRI289();
      }
      PAN_LIQUDADISECO.UpdatePanel(MainFrm);
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
    return (obj instanceof LiquidazioniDaDistintaEconomato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioniDaDistintaEconomato.class.getName() : (Glb.ClassWithPackage(LiquidazioniDaDistintaEconomato.class) ? LiquidazioniDaDistintaEconomato.class.getName().substring(LiquidazioniDaDistintaEconomato.class.getPackage().getName().length() + 1) : LiquidazioniDaDistintaEconomato.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_LIQUDADISECO.SetFieldValidation(PFL_LIQUDADISECO_DALIQUIDARE, (new IDVariant(-1)).booleanValue()); 
      PAN_LIQUDADISECO.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Da Distinta Economato On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUDADISECO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUDADISECO);
      // 
      // Liquidazioni Da Distinta Economato On Dynamic Properties Event Body
      // Procedure Body
      // 
      SettaTooltip();
      AbilitazioneDaLiquidare();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "LiquidazioniDaDistintaEconomatoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Da Distinta Economato On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_LIQUDADISECO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni Da Distinta Economato On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_LIQUDADISECO.PanelCommand(Glb.PCM_REQUERY);
        Cancel.set((new IDVariant(-1)));
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_LIQUDADISECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALEIMPORT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUDADISECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQUDADISECO_TOTAIMPDALIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_LIQUDADISECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALEIMPORT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUDADISECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQUDADISECO_TOTAIMPDALIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "LiquidazioniDaDistintaEconomatoOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Da Distinta Economato After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_LIQUDADISECO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni Da Distinta Economato After Find Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_DISTINTA, 0))))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI24+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI24+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "LiquidazioniDaDistintaEconomatoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Da Distinta Economato On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_LIQUDADISECO_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni Da Distinta Economato On Change Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_DISTINTA, 0))))
      {
        if (new IDVariant(PAN_LIQUDADISECO.Status()).equals((new IDVariant(1)), true))
        {
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET8+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          if (new IDVariant(PAN_LIQUDADISECO.Status()).equals((new IDVariant(3)), true))
          {
            MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET8+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA28+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI24+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
          else
          {
            MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET8+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA28+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
            MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_FUNZIOAGGI24+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          }
        }
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI24+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "LiquidazioniDaDistintaEconomatoOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Da Distinta Economato On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_LIQUDADISECO_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni Da Distinta Economato On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_LIQUDADISECO.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET8+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_LIQUDADISECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUDADISECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUDADISECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUDADISECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_IMPEGNOLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_LIQUDADISECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_LIQUDADISECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_LIQUDADISECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_LIQUDADISECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_LIQUDADISECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_DOCUMENLABEL, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
      else
      {
        PAN_LIQUDADISECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUDADISECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUDADISECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUDADISECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_IMPEGNOLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add((new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_LIQUDADISECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add((new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_LIQUDADISECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add((new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_LIQUDADISECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_LIQUDADISECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_LIQUDADISECO.set_ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_DOCUMENLABEL, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_LIQUDADISECO.ObjRect(Glb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        if (new IDVariant(PAN_LIQUDADISECO.Status()).equals((new IDVariant(3)), true))
        {
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET8+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA28+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI24+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET8+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA28+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_FUNZIOAGGI24+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "LiquidazioniDaDistintaEconomatoOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Da Distinta Economato On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_LIQUDADISECO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni Da Distinta Economato On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_LIQUDADISECO_DALIQUIDARE)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_IMPUTDALIQUI, 0))))
        {
          if (IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_IMPUTDALIQUI, 0).compareTo(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_IMPUTAIMPORT, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("L'importo da liquidare non può essere maggiore dell'importo dell'imputazione"));
            MainFrm.set_AlertMessage(S); 
            IDVariant T = null;
            T = ((IDL.NullValue(PAN_LIQUDADISECO.GetOrgValue(PFL_LIQUDADISECO_DALIQUIDARE),(new IDVariant(""))).equals((new IDVariant("")), true))?(new IDVariant()):IDL.ToCurrency(PAN_LIQUDADISECO.GetOrgValue(PFL_LIQUDADISECO_DALIQUIDARE)));
            IMDB.set_Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_IMPUTDALIQUI, 0, new IDVariant(T));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "LiquidazioniDaDistintaEconomatoOnUpdatingRow", _e);
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
        IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARANUMEDIST, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRIOL5, IMDBDef5.FLD_PARAMETRIOL5_NUMERDISTOLD, 0), true)!=0 || IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARAANNODIST, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAMETRIOL5, IMDBDef5.FLD_PARAMETRIOL5_ANNODISTIOLD, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARANUMEDIST, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARAANNODIST, 0))))
          {
            v_NUMREC = (new IDVariant(0));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  IMPUTAZIONI A ");
            SQL.append("where (A.ANNO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARAANNODIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARANUMEDIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_NUMREC.equals((new IDVariant(0)), true))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Distinta non presente!", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_AVVISO); 
              Cancel.set((new IDVariant(-1)));
            }
          }
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL5, IMDBDef5.FLD_PARAMETRIOL5_ANNODISTIOLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARAANNODIST, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL5, IMDBDef5.FLD_PARAMETRIOL5_NUMERDISTOLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARANUMEDIST, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "ParametriOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "ParametriAfterFindEvent", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_IMPEGNO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_IMPEGNO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("I")));
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "InfoImpegno", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_SUBIMPEGNO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_SUBIMPEGNO, 0));
      if (IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_SUBIMPEGNO, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
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
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "InfoSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voci Bilancio
  // **********************************************************************
  public int InfoVociBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voci Bilancio Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "InfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Tooltip
  // **********************************************************************
  public int SettaTooltip ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Tooltip Body
      // Procedure Body
      // 
      PAN_LIQUDADISECO.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUDADISECO_RAGIONSOCIAL,(new IDVariant(PAN_LIQUDADISECO.FieldText(PFL_LIQUDADISECO_RAGIONSOCIAL))).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "SettaTooltip", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilitazione Da Liquidare
  // **********************************************************************
  public int AbilitazioneDaLiquidare ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilitazione Da Liquidare Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_TIPO_DOCUMENTO, 0).equals((new IDVariant(2)), true) || IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_FLAG_LIQUIDATO, 0).equals((new IDVariant("SI")), true))
      {
        PAN_LIQUDADISECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_LIQUDADISECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "AbilitazioneDaLiquidare", _e);
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
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Salva Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_LIQUDADISECO.Status()).equals((new IDVariant(3)), true))
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        PAN_LIQUDADISECO.PanelCommand(Glb.PCM_UPDATE);
        C3 = PAN_LIQUDADISECO.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_LIQUDADISECO.GotoFirst();
        while (!PAN_LIQUDADISECO.RSEOF())
        {
          // 
          // 
          // 
          // 
          if (C3.Get("TIPO_DOCUMENTO").compareTo((new IDVariant(2)), true)!=0 && IDL.IsNull(C3.Get("FLAG_LIQUIDATO")))
          {
            try
            {
              SQL = new StringBuffer();
              SQL.append("update IMPUTAZIONI set ");
              SQL.append("  DA_LIQUIDARE = " + IDL.CSql(C3.Get("IMPUTDALIQUI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (ANNO_DISTINTA = " + IDL.CSql(C3.Get("ANNO_DISTINTA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NUMERO_DISTINTA = " + IDL.CSql(C3.Get("NUMERO_DISTINTA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (PROGR_DISTINTA = " + IDL.CSql(C3.Get("PROGR_DISTINTA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e6)
            {
              MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
          }
          PAN_LIQUDADISECO.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        MainFrm.Cf4armDBObject.CommitTrans();
        PAN_LIQUDADISECO.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Disponibilita
  // **********************************************************************
  public int ControlloDisponibilita ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Disponibilita Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_LIQUDADISECO.Status()).equals((new IDVariant(3)), true))
      {
        Salva();
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI291, IMDBDef5.FLD_PARAMETRI291_PARANUMEDIST, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARANUMEDIST, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI291, IMDBDef5.FLD_PARAMETRI291_PARAANNODIST, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARAANNODIST, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI291, IMDBDef5.FLD_PARAMETRI291_PARAENTRSPES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI291, IMDBDef5.FLD_PARAMETRI291_PARSOLIMDALI, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARSOLIMDALI, 0));
      MainFrm.Show(MyGlb.FRM_CONTDISPFULI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "ControlloDisponibilita", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Emissione Liquidazioni Dist Econ
  // **********************************************************************
  public int EmissioneLiquidazioniDistEcon ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Emissione Liquidazioni Dist Econ Body
      // Procedure Body
      // 
      C2 = PAN_LIQUDADISECO.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_LIQUDADISECO.GotoFirst();
      while (!PAN_LIQUDADISECO.RSEOF())
      {
        if (IDL.IsNull(C2.Get("FLAG_LIQUIDATO")))
        {
          IDVariant v_MSGIVA = new IDVariant(0,IDVariant.STRING);
          if (!(MainFrm.ControllaNORigheIvaFatturaSenzaRegistri(C2.Get("ANNO_FATTURA"), C2.Get("PROGR_FATTURA"), (new IDVariant("SI")), (new IDVariant("SI")), v_MSGIVA, (new IDVariant("")))))
          {
            if (MainFrm.CONREGLIQFAT.equals((new IDVariant("B")), true))
            {
              MainFrm.set_AlertMessage(v_MSGIVA); 
              return 0;
            }
            else
            {
              if (IDL.Length(v_MSGIVA).compareTo((new IDVariant(0)), true)>0)
              {
                if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(v_MSGIVA, (new IDVariant("<br/>"))), (new IDVariant("Continuare?"))))))
                {
                  return 0;
                }
              }
            }
          }
        }
        PAN_LIQUDADISECO.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      IDVariant v_VSEDEDEL = null;
      v_VSEDEDEL = (new IDVariant());
      IDVariant v_VANNODEL = null;
      v_VANNODEL = (new IDVariant());
      IDVariant v_VNUMERODEL = null;
      v_VNUMERODEL = (new IDVariant());
      if (MainFrm.PLUGINDISTEC.equals((new IDVariant("SI")), true))
      {
        IDVariant v_VCONTASUDATI = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1, ");
        SQL.append("  MAX(A.SEDE_DEL) as MADIEXDASEDE, ");
        SQL.append("  MAX(A.ANNO_DEL) as MADIEXDAANDE, ");
        SQL.append("  MAX(A.NUMERO_DEL) as MADIEXDANUDE ");
        SQL.append("from ");
        SQL.append("  DISTINTE_EXTRA_DATIAGG A ");
        SQL.append("where (A.NUMERO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCONTASUDATI = QV.Get("COUNT1", IDVariant.INTEGER) ;
          v_VSEDEDEL = QV.Get("MADIEXDASEDE", IDVariant.STRING) ;
          v_VANNODEL = QV.Get("MADIEXDAANDE", IDVariant.INTEGER) ;
          v_VNUMERODEL = QV.Get("MADIEXDANUDE", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCONTASUDATI.equals((new IDVariant(0)), true))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("La distinta |1/|2 non è stata collegata ad una proposta su Sfera. Non è possibile liquidare"));
          MainFrm.set_AlertMessage(IDL.FormatMessage(S, IDL.ToString(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_DISTINTA, 0)), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_DISTINTA, 0)))); 
          return 0;
        }
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  DISTINTE_EXTRA_DATIAGG A ");
        SQL.append("where (A.NUMERO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.STATO <> 27) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_VUNITA = new IDVariant(0,IDVariant.STRING);
          IDVariant v_VANNO = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_VNUMERO = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.UNITA_PROPONENTE as DISEXTDAUNPR, ");
          SQL.append("  A.ANNO_PROPOSTA as DISEXTDAANPR, ");
          SQL.append("  A.NUMERO_PROPOSTA as DISEXTDANUPR ");
          SQL.append("from ");
          SQL.append("  DISTINTE_EXTRA_DATIAGG A ");
          SQL.append("where (A.ANNO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (ROWNUM = 1) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VUNITA = QV.Get("DISEXTDAUNPR", IDVariant.STRING) ;
            v_VANNO = QV.Get("DISEXTDAANPR", IDVariant.INTEGER) ;
            v_VNUMERO = QV.Get("DISEXTDANUPR", IDVariant.INTEGER) ;
          }
          QV.Close();
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("La distinta non è in stato Liquidabile. Non è possibile liquidare"));
          IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
          v_S1 = (new IDVariant("Controllare la Proposta |1-|2/|3 su Sfera"));
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(S, (new IDVariant("<br/>"))), IDL.FormatMessage(v_S1, v_VUNITA, v_VNUMERO, v_VANNO))); 
          return 0;
        }
      }
      if (new IDVariant(PAN_LIQUDADISECO.Status()).equals((new IDVariant(3)), true))
      {
        Salva();
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI296, IMDBDef5.FLD_PARAMETRI296_PARANUMEDIST, 0, IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_NUMERO_DISTINTA, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI296, IMDBDef5.FLD_PARAMETRI296_PARAANNODIST, 0, IMDB.Value(IMDBDef14.PQRY_IMPUTAZIONI1, IMDBDef14.PQSL_IMPUTAZIONI1_ANNO_DISTINTA, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI296, IMDBDef5.FLD_PARAMETRI296_PARADATALIQU, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI296, IMDBDef5.FLD_PARAMETRI296_ANNO_DEL, 0, new IDVariant(v_VANNODEL));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI296, IMDBDef5.FLD_PARAMETRI296_SEDE_DEL, 0, new IDVariant(v_VSEDEDEL));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI296, IMDBDef5.FLD_PARAMETRI296_NUMERO_DEL, 0, new IDVariant(v_VNUMERODEL));
      MainFrm.Show(MyGlb.FRM_EMILIQDISECO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "EmissioneLiquidazioniDistEcon", _e);
      return -1;
    }
  }

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
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL5, IMDBDef5.FLD_PARAMETRIOL5_ANNODISTIOLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARAANNODIST, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL5, IMDBDef5.FLD_PARAMETRIOL5_NUMERDISTOLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI289, IMDBDef14.PQSL_PARAMETRI289_PARANUMEDIST, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "SettaOldParam", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL5, IMDBDef5.FLD_PARAMETRIOL5_ANNODISTIOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIOL5, IMDBDef5.FLD_PARAMETRIOL5_NUMERDISTOLD, 0, (new IDVariant()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "AnnullaOldParam", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Importo Fattura
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // anno Prog - Input
  // numero Prog - Input
  // **********************************************************************
  public IDVariant ImportoFattura (IDVariant annoProg, IDVariant numeroProg)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Importo Fattura Body
      // Corpo Procedura
      // 
      IDVariant v_RETVAL = null;
      v_RETVAL = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.IMPORTO + NVL(A.VARIAZIONI, 0) - NVL(A.IMPUTATO, 0) as FINVFVZNVFIZ ");
      SQL.append("from ");
      SQL.append("  FAT A ");
      SQL.append("where (A.ANNO_PROG = " + IDL.CSql(annoProg, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(numeroProg, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_RETVAL = QV.Get("FINVFVZNVFIZ", IDVariant.DECIMAL) ;
      }
      QV.Close();
      return v_RETVAL;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaDistintaEconomato", "ImportoFattura", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void LIQUDADISECO_PARAMETRI289() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI289_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI299, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI299, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI289_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI289_RS, 0, IMDBDef5.TBL_PARAMETRI299, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI289_RS, 0, 0, IMDBDef5.TBL_PARAMETRI299, IMDBDef5.FLD_PARAMETRI299_PARAANNODIST, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI289_RS, 1, 0, IMDBDef5.TBL_PARAMETRI299, IMDBDef5.FLD_PARAMETRI299_PARANUMEDIST, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI289_RS, 2, 0, IMDBDef5.TBL_PARAMETRI299, IMDBDef5.FLD_PARAMETRI299_PARSOLIMDALI, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI299, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI299, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI299, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI289_RS, 0);
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
  private void PAN_LIQUDADISECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUDADISECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUDADISECO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUDADISECO, Cancel);
    // Stub
  }

  private void PAN_LIQUDADISECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQUDADISECO_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_LIQUDADISECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUDADISECO_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_LIQUDADISECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUDADISECO_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_LIQUDADISECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQUDADISECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_LIQUDADISECO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUDADISECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUDADISECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LIQUDADISECO_Init()
  {

    PAN_LIQUDADISECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUDADISECO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUDADISECO.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, "ACF74767-E7C0-48D5-9CD2-22D90A64B7B7");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, "Importo");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, "CCE6E888-0D5D-4382-A658-6B08C5A41B3F");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, "Da Liquidare");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, "17B24381-E9EF-4C45-976C-64742CA042B0");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, "Importo Iva");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, "Brief description of field content.");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, "D8F379B6-6776-4033-A054-AC7F99AB60A5");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, "NUMERO IMPEGNO");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, "25938561-49FC-43F9-91CC-571453D3E8B4");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, "ANNO IMPEGNO");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, "24B354D3-9D83-4F71-87BA-F5813DECC18E");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, "Info Impegno");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, "6BE4E3D9-1E18-43AB-A3DB-3426CA35AE29");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, "NUMERO SUBIMPEGNO");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, "1B152906-5B53-4513-A0E3-E0A8D80DEC44");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, "ANNO SUBIMPEGNO");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, "DB0C33ED-7E70-4C0C-91D9-C5C7094E163B");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, "Info Sub Impegno");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, "E0FD3593-D5F5-4180-9497-11366E33C136");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, "CAPITOLO");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, "A3D4574F-A6DF-4E9A-A0CC-37051B5D35AF");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, "ARTICOLO");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, "2F608F26-4373-4383-8B25-EA57E8E73BD5");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, "Info Voce Peg");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, "41211504-EC7D-4CF2-8775-D053888FD012");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, "Ragione Sociale");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, MyGlb.VIS_VISULOOUPCF4);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, "2A09C007-1771-48A6-8C77-00F941D47935");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, "FAT NUMERO DOC");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, MyGlb.VIS_VISULOOUPCF4);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, "F03BA3DB-2AE6-45CB-A1A7-8BCC9B3D93EA");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, "FAT ANNO DOC");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, MyGlb.VIS_VISULOOUPCF4);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, "BF56754D-34F1-480E-BEF9-1B767B06B2A8");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, "Liq. to");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, "11C3B428-30A0-48CC-8F4E-C3FDD27C88FC");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, "TIPO DOCUMENTO");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, "81E35522-A33F-4B5C-973E-8401DFE630EE");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, "ANNO DISTINTA");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, "61BAB4D6-CF1F-4A90-8B84-FAAF15D7D15E");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, "NUMERO DISTINTA");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, "8353D8EC-5643-44FD-B2E0-446403B56D11");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, "ANNO FATTURA");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, MyGlb.VIS_NONNULLAFIEL);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, 0, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, "719A5682-9C9E-4C99-9F65-103759E7186A");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, "PROGR FATTURA");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, MyGlb.VIS_NONNULLAFIEL);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, 0, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPEGNOLABEL, "295FC729-7D52-4BEA-AE34-1C4253C0EF00");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPEGNOLABEL, "Impegno");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPEGNOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPEGNOLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, "0575F4A4-7A02-4191-8F00-FB4B583CD4A7");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, "Sub-Impegno");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, "AB7DAE2A-739F-4006-A733-E3060C020936");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, "Capitolo/Art.");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DOCUMENLABEL, "03E44C30-79C4-46BC-A4E6-95065ACDD51A");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DOCUMENLABEL, "Documento");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DOCUMENLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DOCUMENLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, "B6030C18-3EDE-4991-97FF-C9176FE747E1");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, "PROGR DISTINTA");
    PAN_LIQUDADISECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALEIMPORT, "EC7FB6D2-18FD-4343-9AA9-87A5877F2B55");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALEIMPORT, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALEIMPORT, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALEIMPORT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUDADISECO.SetSumField(PFL_LIQUDADISECO_TOTALEIMPORT, PFL_LIQUDADISECO_IMPORTO);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTAIMPDALIQ, "01B1C2B0-C9F3-4C7C-A568-B719130E5A8D");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTAIMPDALIQ, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTAIMPDALIQ, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTAIMPDALIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUDADISECO.SetSumField(PFL_LIQUDADISECO_TOTAIMPDALIQ, PFL_LIQUDADISECO_DALIQUIDARE);
    PAN_LIQUDADISECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALIMPOIVA, "4B10598F-7D0F-4BF4-B982-E98A931DDDF7");
    PAN_LIQUDADISECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALIMPOIVA, "");
    PAN_LIQUDADISECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALIMPOIVA, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUDADISECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALIMPOIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUDADISECO.SetSumField(PFL_LIQUDADISECO_TOTALIMPOIVA, PFL_LIQUDADISECO_IMPORTOIVA);
  }

  private void PAN_LIQUDADISECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, MyGlb.PANEL_LIST, 40);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, MyGlb.PANEL_FORM, 4, 220, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_IMPORTO, -1, -1);
    PAN_LIQUDADISECO.SetFieldUnbound(PFL_LIQUDADISECO_IMPORTO, true);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_IMPORTO, PPQRY_IMPUTAZIONI1, "DECODE(A.TIPO_DOCUMENTO, 2, A.IMPORTO * -1, A.IMPORTO)", "IMPUTAIMPORT", 3, 28, 6, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, MyGlb.PANEL_LIST, 104, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, MyGlb.PANEL_LIST, 52);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, MyGlb.PANEL_LIST, "Da Liquidare");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, MyGlb.PANEL_FORM, 4, 460, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, MyGlb.PANEL_FORM, 52);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DALIQUIDARE, MyGlb.PANEL_FORM, "Da Liq.");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_DALIQUIDARE, -1, -1);
    PAN_LIQUDADISECO.SetFieldUnbound(PFL_LIQUDADISECO_DALIQUIDARE, true);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_DALIQUIDARE, PPQRY_IMPUTAZIONI1, "DECODE(A.TIPO_DOCUMENTO, 2, 0, DECODE(SIGN(GET_IMPORTO_FAT(A.ANNO_FATTURA,A.PROGR_FATTURA) - NVL(A.DA_LIQUIDARE, NVL(A.IMPORTO, 0))), -1, GET_IMPORTO_FAT(A.ANNO_FATTURA,A.PROGR_FATTURA), A.DA_LIQUIDARE))", "IMPUTDALIQUI", 3, 28, 6, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, MyGlb.PANEL_LIST, 212, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo Iva");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 484, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, MyGlb.PANEL_FORM, 84);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPORTOIVA, MyGlb.PANEL_FORM, "Importo Iva");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_IMPORTOIVA, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_IMPORTOIVA, PPQRY_IMPUTAZIONI1, "A.IMPORTO_IVA", "IMPORTO_IVA", 3, 14, 2, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, MyGlb.PANEL_LIST, 320, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, MyGlb.PANEL_LIST, 100);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, MyGlb.PANEL_LIST, "NUM. IMP.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, MyGlb.PANEL_FORM, 348, 28, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, MyGlb.PANEL_FORM, 112);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROIMPEGN, MyGlb.PANEL_FORM, "NUMERO IMPEGNO");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_NUMEROIMPEGN, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_NUMEROIMPEGN, PPQRY_IMPUTAZIONI1, "A.NUMERO_IMPEGNO", "NUMERO_IMPEGNO", 1, 5, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, MyGlb.PANEL_LIST, 360, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, MyGlb.PANEL_LIST, 88);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, MyGlb.PANEL_LIST, "ANN. IMP.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, MyGlb.PANEL_FORM, 188, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, MyGlb.PANEL_FORM, 104);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOIMPEGNO, MyGlb.PANEL_FORM, "ANNO IMPEGNO");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_ANNOIMPEGNO, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_ANNOIMPEGNO, PPQRY_IMPUTAZIONI1, "A.ANNO_IMPEGNO", "ANNO_IMPEGNO", 1, 4, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, MyGlb.PANEL_LIST, 396, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, MyGlb.PANEL_LIST, 76);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, MyGlb.PANEL_LIST, "I. I.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, MyGlb.PANEL_FORM, 4, 316, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, MyGlb.PANEL_FORM, 76);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOIMPEGNO, MyGlb.PANEL_FORM, "Info Impegno");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_INFOIMPEGNO, -1, -1);
    PAN_LIQUDADISECO.SetFieldUnbound(PFL_LIQUDADISECO_INFOIMPEGNO, true);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_INFOIMPEGNO, PPQRY_IMPUTAZIONI1, "DECODE(A.NUMERO_IMPEGNO, to_number(NULL), NULL, 'I')", "IMPUINFOIMPE", 5, 99, 0, -13997);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOIMPEGNO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, MyGlb.PANEL_LIST, 416, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, MyGlb.PANEL_LIST, 120);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUM. SUB.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, MyGlb.PANEL_FORM, 188, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, MyGlb.PANEL_FORM, 136);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUMERO SUBIMPEGNO");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_NUMEROSUBIMP, -1, -1);
    PAN_LIQUDADISECO.SetFieldUnbound(PFL_LIQUDADISECO_NUMEROSUBIMP, true);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_NUMEROSUBIMP, PPQRY_IMPUTAZIONI1, "DECODE(A.NUMERO_SUBIMPEGNO, 0, to_number(NULL), A.NUMERO_SUBIMPEGNO)", "NUMERO_SUBIMPEGNO", 1, 19, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 456, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 108);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 128);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOSUBIMPEG, MyGlb.PANEL_FORM, "ANNO SUBIMPEGNO");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_ANNOSUBIMPEG, -1, -1);
    PAN_LIQUDADISECO.SetFieldUnbound(PFL_LIQUDADISECO_ANNOSUBIMPEG, true);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_ANNOSUBIMPEG, PPQRY_IMPUTAZIONI1, "DECODE(A.ANNO_SUBIMPEGNO, 0, to_number(NULL), A.ANNO_SUBIMPEGNO)", "ANNO_SUBIMPEGNO", 1, 19, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, MyGlb.PANEL_LIST, 492, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, MyGlb.PANEL_LIST, 96);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, MyGlb.PANEL_LIST, "I. S. I.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, MyGlb.PANEL_FORM, 4, 364, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, MyGlb.PANEL_FORM, 96);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, MyGlb.PANEL_FORM, 2);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOSUBIMPEG, MyGlb.PANEL_FORM, "Info Sub Impegno");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_INFOSUBIMPEG, -1, -1);
    PAN_LIQUDADISECO.SetFieldUnbound(PFL_LIQUDADISECO_INFOSUBIMPEG, true);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_INFOSUBIMPEG, PPQRY_IMPUTAZIONI1, "DECODE(NVL(A.NUMERO_SUBIMPEGNO, 0), 0, NULL, 'I')", "IMPINFSUBIMP", 5, 99, 0, -13997);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOSUBIMPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, MyGlb.PANEL_LIST, 512, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, MyGlb.PANEL_FORM, 372, 100, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_CAPITOLO, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_CAPITOLO, PPQRY_IMPUTAZIONI1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, MyGlb.PANEL_LIST, 612, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, MyGlb.PANEL_FORM, 128);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_ARTICOLO, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_ARTICOLO, PPQRY_IMPUTAZIONI1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, MyGlb.PANEL_LIST, 636, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, MyGlb.PANEL_LIST, 76);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, MyGlb.PANEL_LIST, "I. V. P.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, MyGlb.PANEL_FORM, 4, 412, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, MyGlb.PANEL_FORM, 76);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, MyGlb.PANEL_FORM, 2);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_INFOVOCEPEG, MyGlb.PANEL_FORM, "Info Voce Peg");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_INFOVOCEPEG, -1, -1);
    PAN_LIQUDADISECO.SetFieldUnbound(PFL_LIQUDADISECO_INFOVOCEPEG, true);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_INFOVOCEPEG, PPQRY_IMPUTAZIONI1, "DECODE(A.CAPITOLO, to_number(NULL), NULL, 'I')", "IMPINFVOCPEG", 5, 99, 0, -13997);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_INFOVOCEPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 656, 36, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 176);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 556, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 176);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_RAGIONSOCIAL, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_RAGIONSOCIAL, PPQRY_FAT, "B.RAGIONE_SOCIALE_ESTESA", "FATBENRASOES", 5, 60, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, MyGlb.PANEL_LIST, 792, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, MyGlb.PANEL_LIST, 108);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, MyGlb.PANEL_LIST, "FAT NUMERO DOC");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, MyGlb.PANEL_FORM, 4, 508, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, MyGlb.PANEL_FORM, 108);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATNUMERODOC, MyGlb.PANEL_FORM, "FAT NUMERO DOC");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_FATNUMERODOC, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_FATNUMERODOC, PPQRY_FAT, "A.NUMERO_DOC", "FATNUMERODOC", 5, 20, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, MyGlb.PANEL_LIST, 880, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, MyGlb.PANEL_LIST, 88);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, MyGlb.PANEL_LIST, "F. AN. DC.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, MyGlb.PANEL_FORM, 4, 532, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, MyGlb.PANEL_FORM, 88);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_FATANNODOC, MyGlb.PANEL_FORM, "FAT ANNO DOC");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_FATANNODOC, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_FATANNODOC, PPQRY_FAT, "A.ANNO_DOC", "FATANNODOC", 1, 4, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, MyGlb.PANEL_LIST, 916, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, MyGlb.PANEL_LIST, 92);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, MyGlb.PANEL_LIST, "Liq. to");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, MyGlb.PANEL_FORM, 4, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, MyGlb.PANEL_FORM, 128);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_LIQTO, MyGlb.PANEL_FORM, "Liq. to");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_LIQTO, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_LIQTO, PPQRY_IMPUTAZIONI1, "A.FLAG_LIQUIDATO", "FLAG_LIQUIDATO", 5, 2, 0, -13997);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_LIQTO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_LIQUDADISECO.SetValueListItem(PFL_LIQUDADISECO_LIQTO, (new IDVariant()), "Null", "", "", -1);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, MyGlb.PANEL_LIST, 916, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, MyGlb.PANEL_LIST, 100);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, MyGlb.PANEL_LIST, "TP. DOC.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, MyGlb.PANEL_FORM, 236, 76, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, MyGlb.PANEL_FORM, 112);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TIPODOCUMENT, MyGlb.PANEL_FORM, "TIPO DOCUMENTO");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_TIPODOCUMENT, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_TIPODOCUMENT, PPQRY_IMPUTAZIONI1, "A.TIPO_DOCUMENTO", "TIPO_DOCUMENTO", 1, 1, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, MyGlb.PANEL_LIST, 288, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, MyGlb.PANEL_LIST, 88);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, MyGlb.PANEL_LIST, "ANN. DIST.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, MyGlb.PANEL_FORM, 404, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, MyGlb.PANEL_FORM, 104);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNODISTINT1, MyGlb.PANEL_FORM, "ANNO DISTINTA");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_ANNODISTINT1, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_ANNODISTINT1, PPQRY_IMPUTAZIONI1, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, MyGlb.PANEL_LIST, 288, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, MyGlb.PANEL_LIST, 104);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, MyGlb.PANEL_LIST, "NUM. DIST.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, MyGlb.PANEL_FORM, 128);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_NUMERODISTI1, MyGlb.PANEL_FORM, "NUMERO DISTINTA");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_NUMERODISTI1, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_NUMERODISTI1, PPQRY_IMPUTAZIONI1, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 8, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, MyGlb.PANEL_LIST, 88);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, MyGlb.PANEL_LIST, "ANN. FATT.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, MyGlb.PANEL_FORM, 196, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, MyGlb.PANEL_FORM, 104);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_ANNOFATTURA, MyGlb.PANEL_FORM, "ANNO FATTURA");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_ANNOFATTURA, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_ANNOFATTURA, PPQRY_IMPUTAZIONI1, "A.ANNO_FATTURA", "ANNO_FATTURA", 1, 4, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, MyGlb.PANEL_LIST, 92);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, MyGlb.PANEL_LIST, "PR. FATT.");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, MyGlb.PANEL_FORM, 356, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, MyGlb.PANEL_FORM, 104);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRFATTURA, MyGlb.PANEL_FORM, "PROGR FATTURA");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_PROGRFATTURA, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_PROGRFATTURA, PPQRY_IMPUTAZIONI1, "A.PROGR_FATTURA", "PROGR_FATTURA", 1, 5, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPEGNOLABEL, MyGlb.PANEL_LIST, 320, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPEGNOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPEGNOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPEGNOLABEL, MyGlb.PANEL_FORM, 232, 0, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPEGNOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_IMPEGNOLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_IMPEGNOLABEL, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_IMPEGNOLABEL, -1, "", "IMPEGNOLABEL", 0, 0, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, MyGlb.PANEL_LIST, 416, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, MyGlb.PANEL_FORM, 240, 8, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_SUBIMPEGLABE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_SUBIMPEGLABE, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_SUBIMPEGLABE, -1, "", "SUBIMPEGLABE", 0, 0, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, MyGlb.PANEL_LIST, 512, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, MyGlb.PANEL_FORM, 248, 16, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_CAPITARTLABE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_CAPITARTLABE, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_CAPITARTLABE, -1, "", "CAPITARTLABE", 0, 0, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DOCUMENLABEL, MyGlb.PANEL_LIST, 792, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DOCUMENLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DOCUMENLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DOCUMENLABEL, MyGlb.PANEL_FORM, 256, 24, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DOCUMENLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_DOCUMENLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_DOCUMENLABEL, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_DOCUMENLABEL, -1, "", "DOCUMENLABEL", 0, 0, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, MyGlb.PANEL_LIST, 960, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, MyGlb.PANEL_LIST, 104);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, MyGlb.PANEL_LIST, "PROGR DISTINTA");
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, MyGlb.PANEL_FORM, 4, 580, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, MyGlb.PANEL_FORM, 104);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_PROGRDISTINT, MyGlb.PANEL_FORM, "PROGR DISTINTA");
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_PROGRDISTINT, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_PROGRDISTINT, PPQRY_IMPUTAZIONI1, "A.PROGR_DISTINTA", "PROGR_DISTINTA", 1, 6, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALEIMPORT, MyGlb.PANEL_LIST, 0, 240, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALEIMPORT, MyGlb.PANEL_LIST, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALEIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALEIMPORT, MyGlb.PANEL_FORM, 12, 252, 108, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALEIMPORT, MyGlb.PANEL_FORM, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALEIMPORT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_TOTALEIMPORT, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_TOTALEIMPORT, -1, "", "TOTALEIMPORT", 0, 0, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTAIMPDALIQ, MyGlb.PANEL_LIST, 104, 240, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTAIMPDALIQ, MyGlb.PANEL_LIST, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTAIMPDALIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTAIMPDALIQ, MyGlb.PANEL_FORM, 20, 260, 108, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTAIMPDALIQ, MyGlb.PANEL_FORM, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTAIMPDALIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_TOTAIMPDALIQ, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_TOTAIMPDALIQ, -1, "", "TOTAIMPDALIQ", 0, 0, 0, -13997);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALIMPOIVA, MyGlb.PANEL_LIST, 212, 240, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALIMPOIVA, MyGlb.PANEL_LIST, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALIMPOIVA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUDADISECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALIMPOIVA, MyGlb.PANEL_FORM, 28, 268, 108, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUDADISECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALIMPOIVA, MyGlb.PANEL_FORM, 0);
    PAN_LIQUDADISECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUDADISECO_TOTALIMPOIVA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUDADISECO.SetFieldPage(PFL_LIQUDADISECO_TOTALIMPOIVA, -1, -1);
    PAN_LIQUDADISECO.SetFieldPanel(PFL_LIQUDADISECO_TOTALIMPOIVA, -1, "", "TOTALIMPOIVA", 0, 0, 0, -13997);
  }

  private void PAN_LIQUDADISECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUDADISECO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_DOC as FATNUMERODOC, ");
    SQL.append("  A.ANNO_DOC as FATANNODOC, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as FATBENRASOES ");
    SQL.append("from ");
    SQL.append("  FAT A, ");
    SQL.append("  BEN B ");
    SQL.append("where (A.ANNO_PROG = ~~ANNO_FATTURA~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~PROGR_FATTURA~~) ");
    SQL.append("and   (B.CODICE = A.CODICE) ");
    PAN_LIQUDADISECO.SetQuery(PPQRY_FAT, 0, SQL, -1, "");
    PAN_LIQUDADISECO.SetQueryDB(PPQRY_FAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUDADISECO.SetMasterTable(PPQRY_FAT, "FAT");
    PAN_LIQUDADISECO.SetIMDB(IMDB, "PQRY_IMPUTAZIONI1", true);
    PAN_LIQUDADISECO.set_SetString(MyGlb.MASTER_ROWNAME, "IMPUTAZIONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(A.TIPO_DOCUMENTO, 2, A.IMPORTO * -1, A.IMPORTO) as IMPUTAIMPORT, ");
    SQL.append("  DECODE(A.TIPO_DOCUMENTO, 2, 0, DECODE(SIGN(GET_IMPORTO_FAT(A.ANNO_FATTURA,A.PROGR_FATTURA) - NVL(A.DA_LIQUIDARE, NVL(A.IMPORTO, 0))), -1, GET_IMPORTO_FAT(A.ANNO_FATTURA,A.PROGR_FATTURA), A.DA_LIQUIDARE)) as IMPUTDALIQUI, ");
    SQL.append("  A.ANNO_FATTURA as ANNO_FATTURA, ");
    SQL.append("  A.PROGR_FATTURA as PROGR_FATTURA, ");
    SQL.append("  A.ANNO_IMPEGNO as ANNO_IMPEGNO, ");
    SQL.append("  A.NUMERO_IMPEGNO as NUMERO_IMPEGNO, ");
    SQL.append("  DECODE(A.NUMERO_IMPEGNO, to_number(NULL), NULL, 'I') as IMPUINFOIMPE, ");
    SQL.append("  DECODE(A.ANNO_SUBIMPEGNO, 0, to_number(NULL), A.ANNO_SUBIMPEGNO) as ANNO_SUBIMPEGNO, ");
    SQL.append("  DECODE(A.NUMERO_SUBIMPEGNO, 0, to_number(NULL), A.NUMERO_SUBIMPEGNO) as NUMERO_SUBIMPEGNO, ");
    SQL.append("  DECODE(NVL(A.NUMERO_SUBIMPEGNO, 0), 0, NULL, 'I') as IMPINFSUBIMP, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  DECODE(A.CAPITOLO, to_number(NULL), NULL, 'I') as IMPINFVOCPEG, ");
    SQL.append("  A.TIPO_DOCUMENTO as TIPO_DOCUMENTO, ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  A.FLAG_LIQUIDATO as FLAG_LIQUIDATO, ");
    SQL.append("  A.IMPORTO_IVA as IMPORTO_IVA, ");
    SQL.append("  A.PROGR_DISTINTA as PROGR_DISTINTA ");
    PAN_LIQUDADISECO.SetQuery(PPQRY_IMPUTAZIONI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IMPUTAZIONI A ");
    PAN_LIQUDADISECO.SetQuery(PPQRY_IMPUTAZIONI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_DISTINTA = ~~PQRY_PARAMETRI289.PARAANNODIST~~) ");
    SQL.append("and   (A.NUMERO_DISTINTA = ~~PQRY_PARAMETRI289.PARANUMEDIST~~) ");
    SQL.append("and   ((~~PQRY_PARAMETRI289.PARSOLIMDALI~~ = 'SI' AND (A.FLAG_LIQUIDATO IS NULL)) OR (~~PQRY_PARAMETRI289.PARSOLIMDALI~~ IS NULL)) ");
    PAN_LIQUDADISECO.SetQuery(PPQRY_IMPUTAZIONI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUDADISECO.SetQuery(PPQRY_IMPUTAZIONI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUDADISECO.SetQuery(PPQRY_IMPUTAZIONI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 5, 6, 8, 9 ");
    PAN_LIQUDADISECO.SetQuery(PPQRY_IMPUTAZIONI1, 5, SQL, -1, "");
    PAN_LIQUDADISECO.SetQueryDB(PPQRY_IMPUTAZIONI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUDADISECO.SetMasterTable(0, "IMPUTAZIONI");
    PAN_LIQUDADISECO.AddToSortList(PFL_LIQUDADISECO_ANNOIMPEGNO, true);
    PAN_LIQUDADISECO.AddToSortList(PFL_LIQUDADISECO_NUMEROIMPEGN, true);
    PAN_LIQUDADISECO.AddToSortList(PFL_LIQUDADISECO_ANNOSUBIMPEG, true);
    PAN_LIQUDADISECO.AddToSortList(PFL_LIQUDADISECO_NUMEROSUBIMP, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUDADISECO.Status() == 2)
    {
      int oldListQBE = PAN_LIQUDADISECO.iUseListQBE;
      PAN_LIQUDADISECO.iUseListQBE = 0;
      PAN_LIQUDADISECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUDADISECO.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUDADISECO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, "77884606-63D1-4859-9383-6D44EC0F4694");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, "Numero Distinta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, "2CFC393A-DCD2-4286-95C0-20E068E470B8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, "Anno Distinta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, "C1211DB2-6C32-4E73-8AE1-A95F2A359F43");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, "Solo Imputazioni Da Liquidare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, "7A0BA150-EE8C-44BC-876E-DCCEE914142E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, "Distinta");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, "3E6E5836-96B4-4068-89B9-9E4DA4792C1F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, "Num. Dist.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, 80, 4, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, "Num. Distinta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODISTIN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODISTIN, PPQRY_PARAMETRI289, "A.PARANUMEDIST", "PARANUMEDIST", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, "Ann. Dist.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, 152, 4, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, "Ann. Dist.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODISTINTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODISTINTA, PPQRY_PARAMETRI289, "A.PARAANNODIST", "PARAANNODIST", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, MyGlb.PANEL_LIST, 80, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, MyGlb.PANEL_LIST, 148);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, MyGlb.PANEL_LIST, "Sl. Imp. Da Liq.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, MyGlb.PANEL_FORM, 236, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, MyGlb.PANEL_FORM, 184);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOIMPDALIQ, MyGlb.PANEL_FORM, "Solo Imputazioni Da Liquidare");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOIMPDALIQ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOIMPDALIQ, PPQRY_PARAMETRI289, "A.PARSOLIMDALI", "PARSOLIMDALI", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOIMPDALIQ, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOIMPDALIQ, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_LIST, 8, 4, 56, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_FORM, 20, 4, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DISTINTLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DISTINTLABEL, -1, "", "DISTINTLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.PANEL_LIST, 16, 12, 56, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.PANEL_FORM, 132, 4, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDISTLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRDISTLABE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRDISTLABE, -1, "", "BARRDISTLABE", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI289", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI289, IMDBDef14.PQRY_PARAMETRI289_RS, IMDBDef5.TBL_PARAMETRI299);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODISTIN, IMDBDef5.FLD_PARAMETRI299_PARANUMEDIST);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODISTINTA, IMDBDef5.FLD_PARAMETRI299_PARAANNODIST);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOIMPDALIQ, IMDBDef5.FLD_PARAMETRI299_PARSOLIMDALI);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI299");
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
    if (SrcObj == PAN_LIQUDADISECO) PAN_LIQUDADISECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUDADISECO) PAN_LIQUDADISECO_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUDADISECO) PAN_LIQUDADISECO_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUDADISECO) PAN_LIQUDADISECO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LIQUDADISECO) PAN_LIQUDADISECO_OnChangeRow();
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
    if (SrcObj == PAN_LIQUDADISECO) PAN_LIQUDADISECO_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_LIQUDADISECO) PAN_LIQUDADISECO_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_LIQUDADISECO) PAN_LIQUDADISECO_AfterFind(CmdFind);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_LIQUDADISECO) PAN_LIQUDADISECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
