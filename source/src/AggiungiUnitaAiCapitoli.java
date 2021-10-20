// **********************************************
// Aggiungi Unita Ai Capitoli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiungiUnitaAiCapitoli extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CAPITOSELEZI_CAPITOSELEZI = 0;

  private static int PPQRY_APPOGGIORET2 = 0;


  IDPanel PAN_CAPITOSELEZI;
  private static int PFL_SELEZIONAUO_PROGRUO = 0;

  private static int PPQRY_SO4ANAUNIOR4 = 0;

  private static int PPQRY_SO4ANAUNIORG = 1;


  IDPanel PAN_SELEZIONAUO;
  private static int PFL_CAPGIASAUOSE_NUOVAESPRESS = 0;

  private static int PPQRY_CAPITGIAASS1 = 0;


  IDPanel PAN_CAPGIASAUOSE;
  private static int PFL_OPZIONI_OK = 0;
  private static int PFL_OPZIONI_TIPOLOGIA = 1;
  private static int PFL_OPZIONI_ETICHSELEZLA = 2;
  private static int PFL_OPZIONI_ETISEEGIPRUN = 3;
  private static int PFL_OPZIONI_ANNULLA = 4;

  private static int PPQRY_DUAL15 = 0;


  IDPanel PAN_OPZIONI;

  // Definition of Global Variables
  private IDVariant UOSELEZIONAT = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRISC1(IMDB);
    Init_TBL_SCELTAUO1(IMDB);
    //
    //
    Init_PQRY_APPOGGIORET2(IMDB);
    Init_PQRY_APPOGGIORET2_RS(IMDB);
    Init_PQRY_SO4ANAUNIOR4(IMDB);
    Init_PQRY_SO4ANAUNIOR4_RS(IMDB);
    Init_PQRY_CAPITGIAASS1(IMDB);
    Init_PQRY_DUAL15(IMDB);
    Init_PQRY_DUAL15_RS(IMDB);
    Init_QRY_APPOGGIORET4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRISC1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRISC1, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRISC1, "TBL_PARAMETRISC1");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRISC1,IMDBDef3.FLD_PARAMETRISC1_NOMEOGGTIPUO, "NOMEOGGTIPUO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRISC1,IMDBDef3.FLD_PARAMETRISC1_NOMEOGGTIPUO,5,50,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRISC1, 0);
  }

  private static void Init_TBL_SCELTAUO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_SCELTAUO1, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_SCELTAUO1, "TBL_SCELTAUO1");
    IMDB.set_FldCode(IMDBDef3.TBL_SCELTAUO1,IMDBDef3.FLD_SCELTAUO1_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef3.TBL_SCELTAUO1,IMDBDef3.FLD_SCELTAUO1_NOMEOGGPROUO,1,8,0);
    IMDB.TblAddNew(IMDBDef3.TBL_SCELTAUO1, 0);
  }

  private static void Init_PQRY_APPOGGIORET2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_APPOGGIORET2, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_APPOGGIORET2, "PQRY_APPOGGIORET2");
    IMDB.set_FldCode(IMDBDef11.PQRY_APPOGGIORET2,IMDBDef11.PQSL_APPOGGIORET2_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_APPOGGIORET2,IMDBDef11.PQSL_APPOGGIORET2_NOMEOGGECAPI,5,163,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_APPOGGIORET2, 0);
  }

  private static void Init_PQRY_APPOGGIORET2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_APPOGGIORET2_RS, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_APPOGGIORET2_RS, "PQRY_APPOGGIORET2_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_APPOGGIORET2_RS,IMDBDef11.PQSL_APPOGGIORET2_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_APPOGGIORET2_RS,IMDBDef11.PQSL_APPOGGIORET2_NOMEOGGECAPI,5,163,0);
  }

  private static void Init_PQRY_SO4ANAUNIOR4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_SO4ANAUNIOR4, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_SO4ANAUNIOR4, "PQRY_SO4ANAUNIOR4");
    IMDB.set_FldCode(IMDBDef11.PQRY_SO4ANAUNIOR4,IMDBDef11.PQSL_SO4ANAUNIOR4_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_SO4ANAUNIOR4,IMDBDef11.PQSL_SO4ANAUNIOR4_NOMEOGGPROUO,1,8,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_SO4ANAUNIOR4, 0);
  }

  private static void Init_PQRY_SO4ANAUNIOR4_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_SO4ANAUNIOR4_RS, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_SO4ANAUNIOR4_RS, "PQRY_SO4ANAUNIOR4_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_SO4ANAUNIOR4_RS,IMDBDef11.PQSL_SO4ANAUNIOR4_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_SO4ANAUNIOR4_RS,IMDBDef11.PQSL_SO4ANAUNIOR4_NOMEOGGPROUO,1,8,0);
  }

  private static void Init_PQRY_CAPITGIAASS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_CAPITGIAASS1, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_CAPITGIAASS1, "PQRY_CAPITGIAASS1");
    IMDB.set_FldCode(IMDBDef11.PQRY_CAPITGIAASS1,IMDBDef11.PQSL_CAPITGIAASS1_NUOVAESPRESS, "NUOVAESPRESS");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAPITGIAASS1,IMDBDef11.PQSL_CAPITGIAASS1_NUOVAESPRESS,5,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_CAPITGIAASS1, 0);
  }

  private static void Init_PQRY_DUAL15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_DUAL15, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_DUAL15, "PQRY_DUAL15");
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL15,IMDBDef11.PQSL_DUAL15_NOMEOGGTIPUO, "NOMEOGGTIPUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL15,IMDBDef11.PQSL_DUAL15_NOMEOGGTIPUO,5,50,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_DUAL15, 0);
  }

  private static void Init_PQRY_DUAL15_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_DUAL15_RS, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_DUAL15_RS, "PQRY_DUAL15_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL15_RS,IMDBDef11.PQSL_DUAL15_NOMEOGGTIPUO, "NOMEOGGTIPUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL15_RS,IMDBDef11.PQSL_DUAL15_NOMEOGGTIPUO,5,50,0);
  }

  private static void Init_QRY_APPOGGIORET4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.QRY_APPOGGIORET4, 7);
    IMDB.set_TblCode(IMDBDef11.QRY_APPOGGIORET4, "QRY_APPOGGIORET4");
    IMDB.set_FldCode(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGTIPUO, "NOMEOGGTIPUO");
    IMDB.SetFldParams(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGTIPUO,5,50,0);
    IMDB.set_FldCode(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGPROUO,5,50,0);
    IMDB.set_FldCode(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGEARTI,5,50,0);
    IMDB.set_FldCode(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGECAPI,5,50,0);
    IMDB.set_FldCode(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGETTES,5,50,0);
    IMDB.set_FldCode(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGEESER,5,50,0);
    IMDB.set_FldCode(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGETABE, "NOMEOGGETABE");
    IMDB.SetFldParams(IMDBDef11.QRY_APPOGGIORET4,IMDBDef11.QSL_APPOGGIORET4_NOMEOGGETABE,5,50,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiungiUnitaAiCapitoli(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiungiUnitaAiCapitoli()
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
    FormIdx = MyGlb.FRM_AGGIUNIAICAP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D1A72A2D-0EC6-4221-8539-E6FDDC2FB2C4";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2203;
    DesignWidth = 640;
    DesignHeight = 666;
    set_Caption(new IDVariant("Aggiungi Unità Ai Capitoli"));
    //
    Frames = new AFrame[8];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 640;
    Frames[1].Height = 640;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.509375;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 640;
    Frames[2].Height = 326;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Capitoli Selezionati";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 326;
    PAN_CAPITOSELEZI = new IDPanel(w, this, 2, "PAN_CAPITOSELEZI");
    Frames[2].Content = PAN_CAPITOSELEZI;
    PAN_CAPITOSELEZI.ShowRowSelector = false;
    PAN_CAPITOSELEZI.ShowToolbar = false;
    PAN_CAPITOSELEZI.ShowStatusbar = false;
    PAN_CAPITOSELEZI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAPITOSELEZI.VS = MainFrm.VisualStyleList;
    PAN_CAPITOSELEZI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 640-MyGlb.PAN_OFFS_X, 326-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CAPITOSELEZI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8F2725EC-281B-496E-A04D-F4DE9BD2F7BC");
    PAN_CAPITOSELEZI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 16, 16, 560, 288, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAPITOSELEZI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAPITOSELEZI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 20);
    PAN_CAPITOSELEZI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAPITOSELEZI.InitStatus = 1;
    PAN_CAPITOSELEZI_Init();
    PAN_CAPITOSELEZI_InitFields();
    PAN_CAPITOSELEZI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 640;
    Frames[3].Height = 314;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.292994;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 640;
    Frames[4].Height = 92;
    Frames[4].FormFactor = 0.95;
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[4].ChildFrame1 = Frames[5];
    Frames[5].Width = 608;
    Frames[5].Height = 92;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Seleziona UO";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 92;
    PAN_SELEZIONAUO = new IDPanel(w, this, 5, "PAN_SELEZIONAUO");
    Frames[5].Content = PAN_SELEZIONAUO;
    PAN_SELEZIONAUO.ShowRowSelector = false;
    PAN_SELEZIONAUO.ShowToolbar = false;
    PAN_SELEZIONAUO.ShowStatusbar = false;
    PAN_SELEZIONAUO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SELEZIONAUO.VS = MainFrm.VisualStyleList;
    PAN_SELEZIONAUO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 608-MyGlb.PAN_OFFS_X, 92-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SELEZIONAUO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9A5F8DCE-4A58-4B4B-939B-11C659338BD3");
    PAN_SELEZIONAUO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 16, 24, 68, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SELEZIONAUO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SELEZIONAUO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SELEZIONAUO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SELEZIONAUO.InitStatus = 2;
    PAN_SELEZIONAUO_Init();
    PAN_SELEZIONAUO_InitFields();
    PAN_SELEZIONAUO_InitQueries();
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[4].ChildFrame2 = Frames[6];
    Frames[6].Width = 32;
    Frames[6].Height = 92;
    Frames[6].FrHidden = true;
    Frames[6].Caption = "Capitoli Gia associati a UO Selezionata";
    Frames[6].Parent = this;
    Frames[6].FixedHeight = 92;
    PAN_CAPGIASAUOSE = new IDPanel(w, this, 6, "PAN_CAPGIASAUOSE");
    Frames[6].Content = PAN_CAPGIASAUOSE;
    PAN_CAPGIASAUOSE.ShowToolbar = false;
    PAN_CAPGIASAUOSE.ShowStatusbar = false;
    PAN_CAPGIASAUOSE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAPGIASAUOSE.VS = MainFrm.VisualStyleList;
    PAN_CAPGIASAUOSE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 32-MyGlb.PAN_OFFS_X, 92-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CAPGIASAUOSE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "75661292-B011-4BC5-8903-93E896FDF92E");
    PAN_CAPGIASAUOSE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 64, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAPGIASAUOSE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAPGIASAUOSE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAPGIASAUOSE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAPGIASAUOSE.InitStatus = 2;
    PAN_CAPGIASAUOSE_Init();
    PAN_CAPGIASAUOSE_InitFields();
    PAN_CAPGIASAUOSE_InitQueries();
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[3].ChildFrame2 = Frames[7];
    Frames[7].Width = 640;
    Frames[7].Height = 222;
    Frames[7].FrHidden = true;
    Frames[7].Caption = "Opzioni";
    Frames[7].Parent = this;
    Frames[7].FixedHeight = 222;
    PAN_OPZIONI = new IDPanel(w, this, 7, "PAN_OPZIONI");
    Frames[7].Content = PAN_OPZIONI;
    PAN_OPZIONI.ShowRowSelector = false;
    PAN_OPZIONI.ShowToolbar = false;
    PAN_OPZIONI.ShowStatusbar = false;
    PAN_OPZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_OPZIONI.VS = MainFrm.VisualStyleList;
    PAN_OPZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 640-MyGlb.PAN_OFFS_X, 222-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_OPZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4A37B6DF-9564-4913-AC41-B2FD46C5F658");
    PAN_OPZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 260, 136, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_OPZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_OPZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_OPZIONI.InitStatus = 1;
    PAN_OPZIONI_Init();
    PAN_OPZIONI_InitFields();
    PAN_OPZIONI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_APPOGGIORETT, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGIUNIAICAP_APPOGGIORET2();
      }
      if (IMDB.TblModified(IMDBDef3.TBL_SCELTAUO1, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGIUNIAICAP_SO4ANAUNIOR4();
      }
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRISC1, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGIUNIAICAP_DUAL15();
      }
      PAN_CAPITOSELEZI.UpdatePanel(MainFrm);
      PAN_SELEZIONAUO.UpdatePanel(MainFrm);
      PAN_CAPGIASAUOSE.UpdatePanel(MainFrm);
      PAN_OPZIONI.UpdatePanel(MainFrm);
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
    return (obj instanceof AggiungiUnitaAiCapitoli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiungiUnitaAiCapitoli.class.getName() : (Glb.ClassWithPackage(AggiungiUnitaAiCapitoli.class) ? AggiungiUnitaAiCapitoli.class.getName().substring(AggiungiUnitaAiCapitoli.class.getPackage().getName().length() + 1) : AggiungiUnitaAiCapitoli.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      UOSELEZIONAT = (new IDVariant(0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiungiUnitaAiCapitoli", "Load", _e);
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
      UNLOAD_SCELTUODELET();
      UNLOAD_APPOGGDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiungiUnitaAiCapitoli", "Unload", _e);
    }
  }

  // **********************************************************************
  // Scelta UO: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_SCELTUODELET() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_SCELTAUO1, IMDBDef3.FLD_SCELTAUO1_NOMEOGGPROUO, 0, new IDVariant());
  }

  // **********************************************************************
  // Appoggiorettifica: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_APPOGGDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_APPOGGIORETT);
  }

  // **********************************************************************
  // Seleziona UO On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_SELEZIONAUO_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona UO On Change Row Body
      // Corpo Procedura
      // 
      UOSELEZIONAT = IMDB.Value(IMDBDef11.PQRY_SO4ANAUNIOR4, IMDBDef11.PQSL_SO4ANAUNIOR4_NOMEOGGPROUO, 0);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiungiUnitaAiCapitoli", "SelezionaUOOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // OK
  // **********************************************************************
  public int OK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // OK Body
      // Corpo Procedura
      // 
      OK_APPOGGIORET4();
      while (!IMDB.Eof(IMDBDef11.QRY_APPOGGIORET4, 0))
      {
        MainFrm.Cf4armDBObject.AGGIUNGIUO(IDL.ToInteger(IMDB.Value(IMDBDef11.QRY_APPOGGIORET4, IMDBDef11.QSL_APPOGGIORET4_NOMEOGGEESER, 0)), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef11.QRY_APPOGGIORET4, IMDBDef11.QSL_APPOGGIORET4_NOMEOGGETTES, 0), (new IDVariant()), IDL.ToFloat(IMDB.Value(IMDBDef11.QRY_APPOGGIORET4, IMDBDef11.QSL_APPOGGIORET4_NOMEOGGECAPI, 0)), IDL.ToFloat(IMDB.Value(IMDBDef11.QRY_APPOGGIORET4, IMDBDef11.QSL_APPOGGIORET4_NOMEOGGEARTI, 0)), IDL.ToFloat(UOSELEZIONAT), IMDB.Value(IMDBDef3.TBL_PARAMETRISC1, IMDBDef3.FLD_PARAMETRISC1_NOMEOGGTIPUO, 0));
        IMDB.TblMoveNext(IMDBDef11.QRY_APPOGGIORET4, 0);
      }
      // OK_APPOGGDELETE();
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_SEGNRETMASUO, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiungiUnitaAiCapitoli", "OK", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Appoggiorettifica
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void OK_APPOGGIORET4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.QRY_APPOGGIORET4);
    IMDB.TblMoveFirst(IMDBDef3.TBL_APPOGGIORETT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_APPOGGIORETT, 0))
    {
      IMDB.TblAddNew(IMDBDef11.QRY_APPOGGIORET4, 0);
      IMDB.TblLinkRow(IMDBDef11.QRY_APPOGGIORET4, 0, IMDBDef3.TBL_APPOGGIORETT, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_APPOGGIORET4, 0, 0, IMDBDef3.TBL_APPOGGIORETT, IMDBDef3.FLD_APPOGGIORETT_NOMEOGGTIPUO, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_APPOGGIORET4, 1, 0, IMDBDef3.TBL_APPOGGIORETT, IMDBDef3.FLD_APPOGGIORETT_NOMEOGGPROUO, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_APPOGGIORET4, 2, 0, IMDBDef3.TBL_APPOGGIORETT, IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEARTI, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_APPOGGIORET4, 3, 0, IMDBDef3.TBL_APPOGGIORETT, IMDBDef3.FLD_APPOGGIORETT_NOMEOGGECAPI, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_APPOGGIORET4, 4, 0, IMDBDef3.TBL_APPOGGIORETT, IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETTES, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_APPOGGIORET4, 5, 0, IMDBDef3.TBL_APPOGGIORETT, IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef11.QRY_APPOGGIORET4, 6, 0, IMDBDef3.TBL_APPOGGIORETT, IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETABE, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_APPOGGIORETT, 0);
      if (IMDB.Eof(IMDBDef3.TBL_APPOGGIORETT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_APPOGGIORETT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.QRY_APPOGGIORET4, 0);
  }

  // **********************************************************************
  // Appoggiorettifica: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void OK_APPOGGDELETE() throws SQLException
  {
  }

  // **********************************************************************
  // ANNULLA
  // **********************************************************************
  public int ANNULLA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // ANNULLA Body
      // Corpo Procedura
      // 
      ANNULLA_APPOGGDELETE();
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiungiUnitaAiCapitoli", "ANNULLA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Appoggiorettifica: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ANNULLA_APPOGGDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_APPOGGIORETT);
  }

  // **********************************************************************
  // Appoggiorettifica
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void AGGIUNIAICAP_APPOGGIORET2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_APPOGGIORET2_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_APPOGGIORETT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_APPOGGIORETT, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_APPOGGIORET2_RS, 0);
      IMDB.set_Value(IMDBDef11.PQRY_APPOGGIORET2_RS, 0, 0, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Capitolo ")), IMDB.Value(IMDBDef3.TBL_APPOGGIORETT, IMDBDef3.FLD_APPOGGIORETT_NOMEOGGECAPI, 0)), (new IDVariant("/"))), IMDB.Value(IMDBDef3.TBL_APPOGGIORETT, IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEARTI, 0)), (new IDVariant(" ("))), IMDB.Value(IMDBDef3.TBL_APPOGGIORETT, IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETTES, 0)), (new IDVariant(")"))));
      IMDB.TblMoveNext(IMDBDef3.TBL_APPOGGIORETT, 0);
      if (IMDB.Eof(IMDBDef3.TBL_APPOGGIORETT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_APPOGGIORETT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_APPOGGIORET2_RS, 0);
  }

  // **********************************************************************
  // SO4 ANA UNITA ORGANIZZATIVE
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void AGGIUNIAICAP_SO4ANAUNIOR4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_SO4ANAUNIOR4_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_SCELTAUO1, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_SCELTAUO1, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_SO4ANAUNIOR4_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_SO4ANAUNIOR4_RS, 0, IMDBDef3.TBL_SCELTAUO1, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_SO4ANAUNIOR4_RS, 0, 0, IMDBDef3.TBL_SCELTAUO1, IMDBDef3.FLD_SCELTAUO1_NOMEOGGPROUO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_SCELTAUO1, 0);
      if (IMDB.Eof(IMDBDef3.TBL_SCELTAUO1, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_SCELTAUO1, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_SO4ANAUNIOR4_RS, 0);
  }

  // **********************************************************************
  // DUAL
  // **********************************************************************
  private void AGGIUNIAICAP_DUAL15() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_DUAL15_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRISC1, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRISC1, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_DUAL15_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_DUAL15_RS, 0, IMDBDef3.TBL_PARAMETRISC1, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_DUAL15_RS, 0, 0, IMDBDef3.TBL_PARAMETRISC1, IMDBDef3.FLD_PARAMETRISC1_NOMEOGGTIPUO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRISC1, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRISC1, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRISC1, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_DUAL15_RS, 0);
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
  private void PAN_CAPITOSELEZI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CAPITOSELEZI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CAPITOSELEZI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CAPITOSELEZI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAPITOSELEZI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CAPITOSELEZI);
    // Stub
  }

  private void PAN_CAPITOSELEZI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CAPITOSELEZI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CAPITOSELEZI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAPITOSELEZI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SELEZIONAUO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SELEZIONAUO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SELEZIONAUO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SELEZIONAUO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SELEZIONAUO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SELEZIONAUO);
    // Stub
  }

  private void PAN_SELEZIONAUO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SELEZIONAUO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SELEZIONAUO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SELEZIONAUO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CAPGIASAUOSE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CAPGIASAUOSE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CAPGIASAUOSE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CAPGIASAUOSE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAPGIASAUOSE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CAPGIASAUOSE);
    // Stub
  }

  private void PAN_CAPGIASAUOSE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CAPGIASAUOSE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CAPGIASAUOSE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAPGIASAUOSE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_OPZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_OPZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_OPZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_OPZIONI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_OPZIONI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_OPZIONI);
    // Stub
  }

  private void PAN_OPZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_OPZIONI_OK)
    {
      this.IdxPanelActived = this.PAN_OPZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OK();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_OPZIONI_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_OPZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ANNULLA();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_OPZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_OPZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_OPZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CAPITOSELEZI_Init()
  {

    PAN_CAPITOSELEZI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAPITOSELEZI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAPITOSELEZI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_CAPITOSELEZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, "D9FE09DC-36E8-44E5-8EB9-179A19AFFDCB");
    PAN_CAPITOSELEZI.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, "Capitoli Selezionati");
    PAN_CAPITOSELEZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, "");
    PAN_CAPITOSELEZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, MyGlb.VIS_NORMFIELPADR);
    PAN_CAPITOSELEZI.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CAPITOSELEZI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAPITOSELEZI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, MyGlb.PANEL_LIST, 16, 40, 560, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAPITOSELEZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, MyGlb.PANEL_LIST, 64);
    PAN_CAPITOSELEZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, MyGlb.PANEL_LIST, 1);
    PAN_CAPITOSELEZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, MyGlb.PANEL_LIST, "Capitoli Selezionati");
    PAN_CAPITOSELEZI.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, MyGlb.PANEL_FORM, 4, 4, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITOSELEZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, MyGlb.PANEL_FORM, 64);
    PAN_CAPITOSELEZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, MyGlb.PANEL_FORM, 1);
    PAN_CAPITOSELEZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITOSELEZI_CAPITOSELEZI, MyGlb.PANEL_FORM, "Cap. Sel.");
    PAN_CAPITOSELEZI.SetFieldPage(PFL_CAPITOSELEZI_CAPITOSELEZI, -1, -1);
    PAN_CAPITOSELEZI.SetFieldUnbound(PFL_CAPITOSELEZI_CAPITOSELEZI, true);
    PAN_CAPITOSELEZI.SetFieldPanel(PFL_CAPITOSELEZI_CAPITOSELEZI, PPQRY_APPOGGIORET2, "", "NOMEOGGECAPI", 5, 163, 0, -13997);
  }

  private void PAN_CAPITOSELEZI_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAPITOSELEZI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CAPITOSELEZI.SetIMDB(IMDB, "PQRY_APPOGGIORET2", true);
    PAN_CAPITOSELEZI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_CAPITOSELEZI.SetQueryIMDB(PPQRY_APPOGGIORET2, IMDBDef11.PQRY_APPOGGIORET2_RS, IMDBDef3.TBL_APPOGGIORETT);
    JustLoaded = true;
    PAN_CAPITOSELEZI.SetMasterTable(0, "APPOGGIORETT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAPITOSELEZI.Status() == 2)
    {
      int oldListQBE = PAN_CAPITOSELEZI.iUseListQBE;
      PAN_CAPITOSELEZI.iUseListQBE = 0;
      PAN_CAPITOSELEZI.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAPITOSELEZI.PanelCommand(Glb.PCM_FIND);
      PAN_CAPITOSELEZI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SELEZIONAUO_Init()
  {

    PAN_SELEZIONAUO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SELEZIONAUO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SELEZIONAUO.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_SELEZIONAUO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, "F75A9BDB-725E-46E9-AE13-006579474F97");
    PAN_SELEZIONAUO.set_Header(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, "Nuova Unità Organizzativa");
    PAN_SELEZIONAUO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, "");
    PAN_SELEZIONAUO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, MyGlb.VIS_NORFIECFHELE);
    PAN_SELEZIONAUO.SetFlags(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SELEZIONAUO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SELEZIONAUO.SetRect(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, MyGlb.PANEL_LIST, 16, 60, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SELEZIONAUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, MyGlb.PANEL_LIST, 68);
    PAN_SELEZIONAUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_SELEZIONAUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, MyGlb.PANEL_LIST, "Nuov. Un. Organiz.");
    PAN_SELEZIONAUO.SetRect(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, MyGlb.PANEL_FORM, 16, 20, 560, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SELEZIONAUO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, MyGlb.PANEL_FORM, 20);
    PAN_SELEZIONAUO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_SELEZIONAUO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SELEZIONAUO_PROGRUO, MyGlb.PANEL_FORM, "Nuova Unità Organizzativa");
    PAN_SELEZIONAUO.SetFieldPage(PFL_SELEZIONAUO_PROGRUO, -1, -1);
    PAN_SELEZIONAUO.SetFieldPanel(PFL_SELEZIONAUO_PROGRUO, PPQRY_SO4ANAUNIOR4, "A.NOMEOGGPROUO", "NOMEOGGPROUO", 1, 8, 0, -13997);
  }

  private void PAN_SELEZIONAUO_InitQueries()
  {
    StringBuffer SQL;

    PAN_SELEZIONAUO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGPROUO~~) ");
    SQL.append("and   (" + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = A.OTTICA) ");
    SQL.append("and   (A.DAL <= TRUNC( SYSDATE ) AND NVL(A.AL, TRUNC( SYSDATE )) >= TRUNC( SYSDATE )) ");
    SQL.append("order by 2, 3, 4 ");
    PAN_SELEZIONAUO.SetQuery(PPQRY_SO4ANAUNIORG, 0, SQL, PFL_SELEZIONAUO_PROGRUO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (" + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = A.OTTICA) ");
    SQL.append("and   (A.DAL <= TRUNC( SYSDATE ) AND NVL(A.AL, TRUNC( SYSDATE )) >= TRUNC( SYSDATE )) ");
    SQL.append("order by 2, 3, 4 ");
    PAN_SELEZIONAUO.SetQuery(PPQRY_SO4ANAUNIORG, 1, SQL, PFL_SELEZIONAUO_PROGRUO, "");
    PAN_SELEZIONAUO.SetQueryDB(PPQRY_SO4ANAUNIORG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SELEZIONAUO.SetIMDB(IMDB, "PQRY_SO4ANAUNIOR4", true);
    PAN_SELEZIONAUO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_SELEZIONAUO.SetQueryIMDB(PPQRY_SO4ANAUNIOR4, IMDBDef11.PQRY_SO4ANAUNIOR4_RS, IMDBDef3.TBL_SCELTAUO1);
    JustLoaded = true;
    PAN_SELEZIONAUO.SetFieldPrimaryIndex(PFL_SELEZIONAUO_PROGRUO, IMDBDef3.FLD_SCELTAUO1_NOMEOGGPROUO);
    PAN_SELEZIONAUO.SetMasterTable(0, "SCELTAUO1");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SELEZIONAUO.Status() == 2)
    {
      int oldListQBE = PAN_SELEZIONAUO.iUseListQBE;
      PAN_SELEZIONAUO.iUseListQBE = 0;
      PAN_SELEZIONAUO.PanelCommand(Glb.PCM_SEARCH);
      PAN_SELEZIONAUO.PanelCommand(Glb.PCM_FIND);
      PAN_SELEZIONAUO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CAPGIASAUOSE_Init()
  {

    PAN_CAPGIASAUOSE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAPGIASAUOSE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAPGIASAUOSE.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_CAPGIASAUOSE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, "8AC3D515-B8AD-45AA-915A-DF36D7CEA102");
    PAN_CAPGIASAUOSE.set_Header(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, "Nuova Espressione");
    PAN_CAPGIASAUOSE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, "");
    PAN_CAPGIASAUOSE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, MyGlb.VIS_NORMFIELPADR);
    PAN_CAPGIASAUOSE.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CAPGIASAUOSE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAPGIASAUOSE.SetRect(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPGIASAUOSE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, MyGlb.PANEL_LIST, 116);
    PAN_CAPGIASAUOSE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, MyGlb.PANEL_LIST, 1);
    PAN_CAPGIASAUOSE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, MyGlb.PANEL_LIST, "Nuova Espressione");
    PAN_CAPGIASAUOSE.SetRect(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPGIASAUOSE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, MyGlb.PANEL_FORM, 116);
    PAN_CAPGIASAUOSE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, MyGlb.PANEL_FORM, 1);
    PAN_CAPGIASAUOSE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPGIASAUOSE_NUOVAESPRESS, MyGlb.PANEL_FORM, "Nuova Espressione");
    PAN_CAPGIASAUOSE.SetFieldPage(PFL_CAPGIASAUOSE_NUOVAESPRESS, -1, -1);
    PAN_CAPGIASAUOSE.SetFieldUnbound(PFL_CAPGIASAUOSE_NUOVAESPRESS, true);
    PAN_CAPGIASAUOSE.SetFieldPanel(PFL_CAPGIASAUOSE_NUOVAESPRESS, PPQRY_CAPITGIAASS1, "'1'", "NUOVAESPRESS", 5, 1, 0, -13997);
  }

  private void PAN_CAPGIASAUOSE_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAPGIASAUOSE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CAPGIASAUOSE.SetIMDB(IMDB, "PQRY_CAPITGIAASS1", true);
    PAN_CAPGIASAUOSE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  '1' as NUOVAESPRESS ");
    PAN_CAPGIASAUOSE.SetQuery(PPQRY_CAPITGIAASS1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_CAPGIASAUOSE.SetQuery(PPQRY_CAPITGIAASS1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPGIASAUOSE.SetQuery(PPQRY_CAPITGIAASS1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPGIASAUOSE.SetQuery(PPQRY_CAPITGIAASS1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPGIASAUOSE.SetQuery(PPQRY_CAPITGIAASS1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPGIASAUOSE.SetQuery(PPQRY_CAPITGIAASS1, 5, SQL, -1, "");
    PAN_CAPGIASAUOSE.SetQueryDB(PPQRY_CAPITGIAASS1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAPGIASAUOSE.SetMasterTable(0, "DUAL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAPGIASAUOSE.Status() == 2)
    {
      int oldListQBE = PAN_CAPGIASAUOSE.iUseListQBE;
      PAN_CAPGIASAUOSE.iUseListQBE = 0;
      PAN_CAPGIASAUOSE.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAPGIASAUOSE.PanelCommand(Glb.PCM_FIND);
      PAN_CAPGIASAUOSE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_OPZIONI_Init()
  {

    PAN_OPZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_OPZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_OPZIONI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_OPZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPZIONI_OK, "C7D86A27-F29C-4332-B229-7EE2CBBB0258");
    PAN_OPZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_OPZIONI_OK, "Ok");
    PAN_OPZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPZIONI_OK, MyGlb.VIS_STATICBUTTON);
    PAN_OPZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_OPZIONI_OK, 0, "button1.gif", false);
    PAN_OPZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_OPZIONI_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_OPZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, "C73A35D4-F37E-48CE-B330-9AD235ED0271");
    PAN_OPZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, "Tipologia");
    PAN_OPZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, "");
    PAN_OPZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, MyGlb.VIS_RADIOSTYLE);
    PAN_OPZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_OPZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETICHSELEZLA, "FC07464B-8222-4751-97E1-61D6470D175B");
    PAN_OPZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETICHSELEZLA, "Selezionare la tipologia per la nuova associazione");
    PAN_OPZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETICHSELEZLA, MyGlb.VIS_LABELFIELD);
    PAN_OPZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETICHSELEZLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_OPZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETISEEGIPRUN, "E05C21FC-E49D-4871-86F0-30E7B416ECCF");
    PAN_OPZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETISEEGIPRUN, "Se è già presente un'altra unità di utilizzo ne viene settata la scadenza a oggi");
    PAN_OPZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETISEEGIPRUN, MyGlb.VIS_LABELFIELD);
    PAN_OPZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETISEEGIPRUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_OPZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANNULLA, "E3353E74-7011-4D1F-A44D-8BD3374F1785");
    PAN_OPZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANNULLA, "Annulla");
    PAN_OPZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_OPZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANNULLA, 0, "button1.gif", false);
    PAN_OPZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_OPZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_OPZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_OPZIONI_OK, MyGlb.PANEL_LIST, 404, 128, 84, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPZIONI_OK, MyGlb.PANEL_LIST, 0);
    PAN_OPZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPZIONI_OK, MyGlb.PANEL_LIST, 2);
    PAN_OPZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_OPZIONI_OK, MyGlb.PANEL_FORM, 448, 124, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPZIONI_OK, MyGlb.PANEL_FORM, 0);
    PAN_OPZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPZIONI_OK, MyGlb.PANEL_FORM, 1);
    PAN_OPZIONI.SetFieldPage(PFL_OPZIONI_OK, -1, -1);
    PAN_OPZIONI.SetFieldPanel(PFL_OPZIONI_OK, -1, "", "OK", 0, 0, 0, -13869);
    PAN_OPZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, MyGlb.PANEL_LIST, 52);
    PAN_OPZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, MyGlb.PANEL_LIST, 1);
    PAN_OPZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, MyGlb.PANEL_LIST, "Tipologia");
    PAN_OPZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, MyGlb.PANEL_FORM, 44, 44, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, MyGlb.PANEL_FORM, 52);
    PAN_OPZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, MyGlb.PANEL_FORM, 1);
    PAN_OPZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPZIONI_TIPOLOGIA, MyGlb.PANEL_FORM, "Tipologia");
    PAN_OPZIONI.SetFieldPage(PFL_OPZIONI_TIPOLOGIA, -1, -1);
    PAN_OPZIONI.SetFieldPanel(PFL_OPZIONI_TIPOLOGIA, PPQRY_DUAL15, "A.NOMEOGGTIPUO", "NOMEOGGTIPUO", 5, 50, 0, -13997);
    PAN_OPZIONI.SetValueListItem(PFL_OPZIONI_TIPOLOGIA, (new IDVariant("G")), "Gestione", "Gestione", "", -1);
    PAN_OPZIONI.SetValueListItem(PFL_OPZIONI_TIPOLOGIA, (new IDVariant("U")), "Utilizzo", "Utilizzo", "", -1);
    PAN_OPZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETICHSELEZLA, MyGlb.PANEL_LIST, 48, 16, 536, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETICHSELEZLA, MyGlb.PANEL_LIST, 0);
    PAN_OPZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETICHSELEZLA, MyGlb.PANEL_LIST, 3);
    PAN_OPZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETICHSELEZLA, MyGlb.PANEL_FORM, 44, 16, 536, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETICHSELEZLA, MyGlb.PANEL_FORM, 0);
    PAN_OPZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETICHSELEZLA, MyGlb.PANEL_FORM, 1);
    PAN_OPZIONI.SetFieldPage(PFL_OPZIONI_ETICHSELEZLA, -1, -1);
    PAN_OPZIONI.SetFieldPanel(PFL_OPZIONI_ETICHSELEZLA, -1, "", "ETICHSELEZLA", 0, 0, 0, -13997);
    PAN_OPZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETISEEGIPRUN, MyGlb.PANEL_LIST, 36, 88, 512, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETISEEGIPRUN, MyGlb.PANEL_LIST, 0);
    PAN_OPZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETISEEGIPRUN, MyGlb.PANEL_LIST, 2);
    PAN_OPZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETISEEGIPRUN, MyGlb.PANEL_FORM, 44, 80, 512, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETISEEGIPRUN, MyGlb.PANEL_FORM, 0);
    PAN_OPZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPZIONI_ETISEEGIPRUN, MyGlb.PANEL_FORM, 2);
    PAN_OPZIONI.SetFieldPage(PFL_OPZIONI_ETISEEGIPRUN, -1, -1);
    PAN_OPZIONI.SetFieldPanel(PFL_OPZIONI_ETISEEGIPRUN, -1, "", "ETISEEGIPRUN", 0, 0, 0, -13997);
    PAN_OPZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANNULLA, MyGlb.PANEL_LIST, 412, 136, 84, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_OPZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANNULLA, MyGlb.PANEL_LIST, 2);
    PAN_OPZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANNULLA, MyGlb.PANEL_FORM, 532, 124, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_OPZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPZIONI_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_OPZIONI.SetFieldPage(PFL_OPZIONI_ANNULLA, -1, -1);
    PAN_OPZIONI.SetFieldPanel(PFL_OPZIONI_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13869);
  }

  private void PAN_OPZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_OPZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_OPZIONI.SetIMDB(IMDB, "PQRY_DUAL15", true);
    PAN_OPZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_OPZIONI.SetQueryIMDB(PPQRY_DUAL15, IMDBDef11.PQRY_DUAL15_RS, IMDBDef3.TBL_PARAMETRISC1);
    JustLoaded = true;
    PAN_OPZIONI.SetFieldPrimaryIndex(PFL_OPZIONI_TIPOLOGIA, IMDBDef3.FLD_PARAMETRISC1_NOMEOGGTIPUO);
    PAN_OPZIONI.SetMasterTable(0, "PARAMETRISC1");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_OPZIONI.Status() == 2)
    {
      int oldListQBE = PAN_OPZIONI.iUseListQBE;
      PAN_OPZIONI.iUseListQBE = 0;
      PAN_OPZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_OPZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_OPZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CAPITOSELEZI) PAN_CAPITOSELEZI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SELEZIONAUO) PAN_SELEZIONAUO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CAPGIASAUOSE) PAN_CAPGIASAUOSE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_OPZIONI) PAN_OPZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAPITOSELEZI) PAN_CAPITOSELEZI_ValidateRow(Cancel);
    if (SrcObj == PAN_SELEZIONAUO) PAN_SELEZIONAUO_ValidateRow(Cancel);
    if (SrcObj == PAN_CAPGIASAUOSE) PAN_CAPGIASAUOSE_ValidateRow(Cancel);
    if (SrcObj == PAN_OPZIONI) PAN_OPZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CAPITOSELEZI) PAN_CAPITOSELEZI_DynamicProperties();
    if (SrcObj == PAN_SELEZIONAUO) PAN_SELEZIONAUO_DynamicProperties();
    if (SrcObj == PAN_CAPGIASAUOSE) PAN_CAPGIASAUOSE_DynamicProperties();
    if (SrcObj == PAN_OPZIONI) PAN_OPZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAPITOSELEZI) PAN_CAPITOSELEZI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SELEZIONAUO) PAN_SELEZIONAUO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CAPGIASAUOSE) PAN_CAPGIASAUOSE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_OPZIONI) PAN_OPZIONI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SELEZIONAUO) PAN_SELEZIONAUO_OnChangeRow();
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
    if (SrcObj == PAN_CAPITOSELEZI) PAN_CAPITOSELEZI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SELEZIONAUO) PAN_SELEZIONAUO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CAPGIASAUOSE) PAN_CAPGIASAUOSE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_OPZIONI) PAN_OPZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
