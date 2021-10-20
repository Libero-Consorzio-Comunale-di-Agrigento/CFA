// **********************************************
// Rettifica Massiva UO
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RettificaMassivaUO extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_NUOVOPANNELL_ETICHECAPITO = 0;
  private static int PFL_NUOVOPANNELL_FATTURE = 1;
  private static int PFL_NUOVOPANNELL_ETICPERRETTO = 2;
  private static int PFL_NUOVOPANNELL_ETICPERRETO1 = 3;

  private static int PPQRY_3 = 0;


  IDPanel PAN_NUOVOPANNELL;
  ATree TRE_RETTIFMASSIV;
  private static int PFL_PANNELCOMAND_AGGIUNGUNITA = 0;
  private static int PFL_PANNELCOMAND_RETTIFIUNITA = 1;

  private static int PPQRY_MASTERQUERY4 = 0;


  IDPanel PAN_PANNELCOMAND;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_APPOGGIORETT(IMDB);
    //
    //
    Init_PQRY_DUAL20(IMDB);
    Init_PQRY_SO4ANAUNIOR5(IMDB);
    Init_PQRY_DUAL12(IMDB);
    Init_PQRY_CAPUO1(IMDB);
    Init_PQRY_DUAL21(IMDB);
    Init_PQRY_SO4ANAUNIOR3(IMDB);
    Init_PQRY_DUAL13(IMDB);
    Init_PQRY_CAPUO(IMDB);
    Init_PQRY_DUAL24(IMDB);
    Init_PQRY_DUAL27(IMDB);
    Init_PQRY_CAP28(IMDB);
    Init_PQRY_MASTERQUERY4(IMDB);
    Init_PQRY_3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_APPOGGIORETT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_APPOGGIORETT, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_APPOGGIORETT, "TBL_APPOGGIORETT");
    IMDB.set_FldCode(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETABE, "NOMEOGGETABE");
    IMDB.SetFldParams(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETABE,5,50,0);
    IMDB.set_FldCode(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEESER,5,50,0);
    IMDB.set_FldCode(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETTES,5,50,0);
    IMDB.set_FldCode(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGECAPI,5,50,0);
    IMDB.set_FldCode(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEARTI,5,50,0);
    IMDB.set_FldCode(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGPROUO,5,50,0);
    IMDB.set_FldCode(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGTIPUO, "NOMEOGGTIPUO");
    IMDB.SetFldParams(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGTIPUO,5,50,0);
  }

  private static void Init_PQRY_DUAL20(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_DUAL20, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_DUAL20, "PQRY_DUAL20");
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL20,IMDBDef11.PQSL_DUAL20_PADRE, "PADRE");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL20,IMDBDef11.PQSL_DUAL20_PADRE,5,13,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL20,IMDBDef11.PQSL_DUAL20_TOOLTIP, "TOOLTIP");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL20,IMDBDef11.PQSL_DUAL20_TOOLTIP,5,43,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_DUAL20, 0);
  }

  private static void Init_PQRY_SO4ANAUNIOR5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_SO4ANAUNIOR5, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_SO4ANAUNIOR5, "PQRY_SO4ANAUNIOR5");
    IMDB.set_FldCode(IMDBDef11.PQRY_SO4ANAUNIOR5,IMDBDef11.PQSL_SO4ANAUNIOR5_RECONOMENODO, "RECONOMENODO");
    IMDB.SetFldParams(IMDBDef11.PQRY_SO4ANAUNIOR5,IMDBDef11.PQSL_SO4ANAUNIOR5_RECONOMENODO,5,397,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_SO4ANAUNIOR5,IMDBDef11.PQSL_SO4ANAUNIOR5_RESOANUNOPUO, "RESOANUNOPUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_SO4ANAUNIOR5,IMDBDef11.PQSL_SO4ANAUNIOR5_RESOANUNOPUO,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_SO4ANAUNIOR5,IMDBDef11.PQSL_SO4ANAUNIOR5_TOOLTIP, "TOOLTIP");
    IMDB.SetFldParams(IMDBDef11.PQRY_SO4ANAUNIOR5,IMDBDef11.PQSL_SO4ANAUNIOR5_TOOLTIP,5,43,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_SO4ANAUNIOR5, 0);
  }

  private static void Init_PQRY_DUAL12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_DUAL12, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_DUAL12, "PQRY_DUAL12");
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL12,IMDBDef11.PQSL_DUAL12_ES, "ES");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL12,IMDBDef11.PQSL_DUAL12_ES,5,7,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL12,IMDBDef11.PQSL_DUAL12_ESLETTERA, "ESLETTERA");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL12,IMDBDef11.PQSL_DUAL12_ESLETTERA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL12,IMDBDef11.PQSL_DUAL12_TOOLTIP, "TOOLTIP");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL12,IMDBDef11.PQSL_DUAL12_TOOLTIP,5,43,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_DUAL12, 0);
  }

  private static void Init_PQRY_CAPUO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_CAPUO1, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_CAPUO1, "PQRY_CAPUO1");
    IMDB.set_FldCode(IMDBDef11.PQRY_CAPUO1,IMDBDef11.PQSL_CAPUO1_NUOVAESPRESS, "NUOVAESPRESS");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAPUO1,IMDBDef11.PQSL_CAPUO1_NUOVAESPRESS,5,453,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAPUO1,IMDBDef11.PQSL_CAPUO1_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAPUO1,IMDBDef11.PQSL_CAPUO1_HASH,5,408,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAPUO1,IMDBDef11.PQSL_CAPUO1_RECOCAPUOSCA, "RECOCAPUOSCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAPUO1,IMDBDef11.PQSL_CAPUO1_RECOCAPUOSCA,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAPUO1,IMDBDef11.PQSL_CAPUO1_RECOCAPUOCAP, "RECOCAPUOCAP");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAPUO1,IMDBDef11.PQSL_CAPUO1_RECOCAPUOCAP,1,6,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAPUO1,IMDBDef11.PQSL_CAPUO1_RECOCAPUOART, "RECOCAPUOART");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAPUO1,IMDBDef11.PQSL_CAPUO1_RECOCAPUOART,1,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_CAPUO1, 0);
  }

  private static void Init_PQRY_DUAL21(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_DUAL21, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_DUAL21, "PQRY_DUAL21");
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL21,IMDBDef11.PQSL_DUAL21_ATTIVE, "ATTIVE");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL21,IMDBDef11.PQSL_DUAL21_ATTIVE,5,12,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_DUAL21, 0);
  }

  private static void Init_PQRY_SO4ANAUNIOR3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_SO4ANAUNIOR3, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_SO4ANAUNIOR3, "PQRY_SO4ANAUNIOR3");
    IMDB.set_FldCode(IMDBDef11.PQRY_SO4ANAUNIOR3,IMDBDef11.PQSL_SO4ANAUNIOR3_RECONOMENODO, "RECONOMENODO");
    IMDB.SetFldParams(IMDBDef11.PQRY_SO4ANAUNIOR3,IMDBDef11.PQSL_SO4ANAUNIOR3_RECONOMENODO,5,400,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_SO4ANAUNIOR3,IMDBDef11.PQSL_SO4ANAUNIOR3_RESOANUNOPUO, "RESOANUNOPUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_SO4ANAUNIOR3,IMDBDef11.PQSL_SO4ANAUNIOR3_RESOANUNOPUO,1,8,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_SO4ANAUNIOR3, 0);
  }

  private static void Init_PQRY_DUAL13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_DUAL13, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_DUAL13, "PQRY_DUAL13");
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL13,IMDBDef11.PQSL_DUAL13_ES, "ES");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL13,IMDBDef11.PQSL_DUAL13_ES,5,7,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL13,IMDBDef11.PQSL_DUAL13_ESLETTERA, "ESLETTERA");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL13,IMDBDef11.PQSL_DUAL13_ESLETTERA,5,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_DUAL13, 0);
  }

  private static void Init_PQRY_CAPUO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_CAPUO, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_CAPUO, "PQRY_CAPUO");
    IMDB.set_FldCode(IMDBDef11.PQRY_CAPUO,IMDBDef11.PQSL_CAPUO_NUOVAESPRESS, "NUOVAESPRESS");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAPUO,IMDBDef11.PQSL_CAPUO_NUOVAESPRESS,5,453,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAPUO,IMDBDef11.PQSL_CAPUO_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAPUO,IMDBDef11.PQSL_CAPUO_HASH,5,408,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAPUO,IMDBDef11.PQSL_CAPUO_RECOCAPUOSCA, "RECOCAPUOSCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAPUO,IMDBDef11.PQSL_CAPUO_RECOCAPUOSCA,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAPUO,IMDBDef11.PQSL_CAPUO_RECOCAPUOCAP, "RECOCAPUOCAP");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAPUO,IMDBDef11.PQSL_CAPUO_RECOCAPUOCAP,1,6,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAPUO,IMDBDef11.PQSL_CAPUO_RECOCAPUOART, "RECOCAPUOART");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAPUO,IMDBDef11.PQSL_CAPUO_RECOCAPUOART,1,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_CAPUO, 0);
  }

  private static void Init_PQRY_DUAL24(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_DUAL24, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_DUAL24, "PQRY_DUAL24");
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL24,IMDBDef11.PQSL_DUAL24_NUOVAESPRESS, "NUOVAESPRESS");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL24,IMDBDef11.PQSL_DUAL24_NUOVAESPRESS,5,20,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_DUAL24, 0);
  }

  private static void Init_PQRY_DUAL27(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_DUAL27, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_DUAL27, "PQRY_DUAL27");
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL27,IMDBDef11.PQSL_DUAL27_ES, "ES");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL27,IMDBDef11.PQSL_DUAL27_ES,5,7,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL27,IMDBDef11.PQSL_DUAL27_ESLETTERA, "ESLETTERA");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL27,IMDBDef11.PQSL_DUAL27_ESLETTERA,5,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_DUAL27, 0);
  }

  private static void Init_PQRY_CAP28(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_CAP28, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_CAP28, "PQRY_CAP28");
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP28,IMDBDef11.PQSL_CAP28_RECORCAPDESC, "RECORCAPDESC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP28,IMDBDef11.PQSL_CAP28_RECORCAPDESC,5,352,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP28,IMDBDef11.PQSL_CAP28_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP28,IMDBDef11.PQSL_CAP28_HASH,5,303,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP28,IMDBDef11.PQSL_CAP28_RECORCAPCAPI, "RECORCAPCAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP28,IMDBDef11.PQSL_CAP28_RECORCAPCAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP28,IMDBDef11.PQSL_CAP28_RECORCAPARTI, "RECORCAPARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP28,IMDBDef11.PQSL_CAP28_RECORCAPARTI,1,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_CAP28, 0);
  }

  private static void Init_PQRY_MASTERQUERY4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_MASTERQUERY4, 0);
    IMDB.set_TblCode(IMDBDef11.PQRY_MASTERQUERY4, "PQRY_MASTERQUERY4");
    IMDB.TblAddNew(IMDBDef11.PQRY_MASTERQUERY4, 0);
  }

  private static void Init_PQRY_3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_3, 0);
    IMDB.set_TblCode(IMDBDef11.PQRY_3, "PQRY_3");
    IMDB.TblAddNew(IMDBDef11.PQRY_3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RettificaMassivaUO(MyWebEntryPoint w, IMDBObj imdb)
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
  public RettificaMassivaUO()
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
    FormIdx = MyGlb.FRM_RETTIMASSIUO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "36250FF3-981C-48D7-A29A-832DCE0B713E";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 800;
    DesignHeight = 630;
    set_Caption(new IDVariant("Rettifica Massiva UO"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 800;
    Frames[1].Height = 604;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.900662;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 800;
    Frames[2].Height = 544;
    Frames[2].Vertical = true;
    Frames[2].FormFactor = 0.235294;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[2].ChildFrame1 = Frames[3];
    Frames[3].Width = 800;
    Frames[3].Height = 128;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Nuovo Pannello";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 128;
    PAN_NUOVOPANNELL = new IDPanel(w, this, 3, "PAN_NUOVOPANNELL");
    Frames[3].Content = PAN_NUOVOPANNELL;
    PAN_NUOVOPANNELL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NUOVOPANNELL.VS = MainFrm.VisualStyleList;
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 800-MyGlb.PAN_OFFS_X, 128-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NUOVOPANNELL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A94EE982-03C8-46AF-845F-0DA9FBF9EB8C");
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 36, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NUOVOPANNELL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NUOVOPANNELL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NUOVOPANNELL.InitStatus = 1;
    PAN_NUOVOPANNELL_Init();
    PAN_NUOVOPANNELL_InitFields();
    PAN_NUOVOPANNELL_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[2].ChildFrame2 = Frames[4];
    Frames[4].Width = 800;
    Frames[4].Height = 416;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Rettifica Massiva";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 416;
    TRE_RETTIFMASSIV = new ATree(this);
    Frames[4].Content = TRE_RETTIFMASSIV;
    TRE_RETTIFMASSIV.Width = 800;
    TRE_RETTIFMASSIV.Height = 416;
    TRE_RETTIFMASSIV.FrIndex = 4;
    TRE_RETTIFMASSIV.Code = "TRE_RETTIFMASSIV";
    TRE_RETTIFMASSIV.set_IsActive(true);
    TRE_RETTIFMASSIV.CtxMenuIdx = BaseCmdSetIdx + MyGlb.CMDS_POPURETTMASS;
    TRE_RETTIFMASSIV.iGuid = "C7BF424F-59B0-4C6A-954D-387120E33D67";
    TRE_RETTIFMASSIV.SetItemCount(11);
    Item = new ATreeItem();
    TRE_RETTIFMASSIV.SetItem(1,Item);
    Item.ItemIndex = "N00001";
    Item.Tooltip = "";
    Item.Name = "Unità Cessate";
    Item.HasTooltip = true;
    Item.iGuid = "FD0792FC-B6A8-474F-8791-20FD7C0D53FA";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Unità Cessate' as PADRE, ");
    SQL.append("  'Espandere l''albero e selezionare i capitoli' as TOOLTIP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef11.PQRY_DUAL20);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_RETTIFMASSIV.SetItem(2,Item);
    Item.ItemIndex = "N00002";
    Item.Tooltip = "";
    Item.Name = "Elenco unità Cessate";
    Item.HasTooltip = true;
    Item.iGuid = "BE7A2277-4E6C-427E-BB11-3B02F64AF8C2";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA || '(' || TO_CHAR ( A.PROGR_UNITA_ORGANIZZATIVA ) || ') Cessata il: ' || TO_CHAR ( A.AL ) as RECONOMENODO, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as RESOANUNOPUO, ");
    SQL.append("  'Espandere l''albero e selezionare i capitoli' as TOOLTIP ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.DAL <= TRUNC( SYSDATE )) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (NOT ((A.AL IS NULL))) ");
    SQL.append("and   (NVL(A.AL, TRUNC( SYSDATE )) < TRUNC( SYSDATE )) ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE B ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = B.PROGR_UNITA_ORGANIZZATIVA) ");
    SQL.append("and   (B.DAL <= TRUNC( SYSDATE )) ");
    SQL.append("and   ((B.AL IS NULL)) ");
    SQL.append("and   (B.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append(")))) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  CAP_UO C ");
    SQL.append("where (C.PROGR_UNITA_ORGANIZZATIVA = A.PROGR_UNITA_ORGANIZZATIVA) ");
    SQL.append("and   (C.ESERCIZIO = TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy'))) ");
    SQL.append("))) ");
    SQL.append("order by 1 ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef11.PQRY_SO4ANAUNIOR5);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_RETTIFMASSIV.SetItem(3,Item);
    Item.ItemIndex = "N00003";
    Item.Tooltip = "";
    Item.Name = "ES";
    Item.HasTooltip = true;
    Item.iGuid = "AC6C7369-9B59-4DCE-B2F8-8B5D8997228B";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Entrata' as ES, ");
    SQL.append("  'E' as ESLETTERA, ");
    SQL.append("  'Espandere l''albero e selezionare i capitoli' as TOOLTIP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  'Spesa', ");
    SQL.append("  'S', ");
    SQL.append("  'Espandere l''albero e selezionare i capitoli' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef11.PQRY_DUAL12);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_RETTIFMASSIV.SetItem(4,Item);
    Item.ItemIndex = "N00004";
    Item.Tooltip = "";
    Item.Name = "Capitoli Collegati al'unita";
    Item.iGuid = "0AF3EFEB-35BA-4AE2-8085-48AA30E0CD5A";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Voce P.e.g. ' || TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) || ' ' || ( ");
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CAP B ");
    SQL.append("where (A.CAPITOLO = B.CAPITOLO) ");
    SQL.append("and   (A.ARTICOLO = B.ARTICOLO) ");
    SQL.append("and   (A.E_S = B.E_S) ");
    SQL.append("and   (A.ESERCIZIO = B.ESERCIZIO) ");
    SQL.append(") || ' ' || A.TIPO_UNITA_ORGANIZZATIVA || CASE WHEN NOT ((A.SCADENZA IS NULL)) THEN ' (Scadenza il : ' || TO_CHAR ( A.SCADENZA ) || ' )' ELSE ' ' END as NUOVAESPRESS, ");
    SQL.append("  'CAPUO' || TO_CHAR ( A.ESERCIZIO ) || '#' || A.E_S || '#' || TO_CHAR ( A.CAPITOLO ) || '#' || TO_CHAR ( A.ARTICOLO ) || '#' || TO_CHAR ( A.PROGR_UNITA_ORGANIZZATIVA ) || '#' || A.TIPO_UNITA_ORGANIZZATIVA as HASH, ");
    SQL.append("  A.SCADENZA as RECOCAPUOSCA, ");
    SQL.append("  A.CAPITOLO as RECOCAPUOCAP, ");
    SQL.append("  A.ARTICOLO as RECOCAPUOART ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PQRY_SO4ANAUNIOR5.RESOANUNOPUO~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_DUAL12.ESLETTERA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL)) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'x' ");
    SQL.append("from ");
    SQL.append("  BIL C ");
    SQL.append("where (C.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (C.E_S = ~~PQRY_DUAL12.ESLETTERA~~) ");
    SQL.append("))) ");
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef11.PQRY_CAPUO1);
    Item.AddPK("RECOCAPUOCAP");
    Item.AddPK("RECOCAPUOART");
    Item = new ATreeItem();
    TRE_RETTIFMASSIV.SetItem(5,Item);
    Item.ItemIndex = "N00005";
    Item.Tooltip = "";
    Item.Name = "Unità Attive";
    Item.iGuid = "B48BCC52-C9D3-4053-BE1F-F2BDFE8FBC8F";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Unità Attive' as ATTIVE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef11.PQRY_DUAL21);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_RETTIFMASSIV.SetItem(6,Item);
    Item.ItemIndex = "N00006";
    Item.Tooltip = "";
    Item.Name = "Elenco unità Attive";
    Item.iGuid = "7EB3DA58-5F0C-44E0-ABB9-BD8C09B27D06";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA || ' (' || TO_CHAR ( A.PROGR_UNITA_ORGANIZZATIVA ) || ') Attivata dal: ' || TO_CHAR ( A.DAL ) as RECONOMENODO, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as RESOANUNOPUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.DAL <= TRUNC( SYSDATE )) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (NVL(A.AL, TRUNC( SYSDATE )) >= TRUNC( SYSDATE )) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  CAP_UO B ");
    SQL.append("where (B.ESERCIZIO = TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy'))) ");
    SQL.append("and   (B.PROGR_UNITA_ORGANIZZATIVA = A.PROGR_UNITA_ORGANIZZATIVA) ");
    SQL.append("))) ");
    SQL.append("order by 1 ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef11.PQRY_SO4ANAUNIOR3);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_RETTIFMASSIV.SetItem(7,Item);
    Item.ItemIndex = "N00007";
    Item.Tooltip = "";
    Item.Name = "ES";
    Item.iGuid = "7730191D-6316-4086-9277-384D147373B4";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Entrata' as ES, ");
    SQL.append("  'E' as ESLETTERA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  'Spesa', ");
    SQL.append("  'S' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef11.PQRY_DUAL13);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_RETTIFMASSIV.SetItem(8,Item);
    Item.ItemIndex = "N00008";
    Item.Tooltip = "";
    Item.Name = "Capitoli collegati all'unita";
    Item.iGuid = "76CA9DE6-46EC-49E2-9B12-474DD9063E45";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Voce P.e.g. ' || TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) || ' ' || ( ");
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CAP B ");
    SQL.append("where (A.CAPITOLO = B.CAPITOLO) ");
    SQL.append("and   (A.ARTICOLO = B.ARTICOLO) ");
    SQL.append("and   (A.E_S = B.E_S) ");
    SQL.append("and   (A.ESERCIZIO = B.ESERCIZIO) ");
    SQL.append(") || ' ' || A.TIPO_UNITA_ORGANIZZATIVA || CASE WHEN NOT ((A.SCADENZA IS NULL)) THEN ' (Scadenza il : ' || TO_CHAR ( A.SCADENZA ) || ' )' ELSE ' ' END as NUOVAESPRESS, ");
    SQL.append("  'CAPUO' || TO_CHAR ( A.ESERCIZIO ) || '#' || A.E_S || '#' || TO_CHAR ( A.CAPITOLO ) || '#' || TO_CHAR ( A.ARTICOLO ) || '#' || TO_CHAR ( A.PROGR_UNITA_ORGANIZZATIVA ) || '#' || A.TIPO_UNITA_ORGANIZZATIVA as HASH, ");
    SQL.append("  A.SCADENZA as RECOCAPUOSCA, ");
    SQL.append("  A.CAPITOLO as RECOCAPUOCAP, ");
    SQL.append("  A.ARTICOLO as RECOCAPUOART ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PQRY_SO4ANAUNIOR3.RESOANUNOPUO~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_DUAL13.ESLETTERA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL)) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'x' ");
    SQL.append("from ");
    SQL.append("  BIL C ");
    SQL.append("where (C.E_S = ~~PQRY_DUAL13.ESLETTERA~~) ");
    SQL.append("and   (C.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (A.ARTICOLO = C.ARTICOLO) ");
    SQL.append("and   (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("))) ");
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef11.PQRY_CAPUO);
    Item.AddPK("RECOCAPUOCAP");
    Item.AddPK("RECOCAPUOART");
    Item = new ATreeItem();
    TRE_RETTIFMASSIV.SetItem(9,Item);
    Item.ItemIndex = "N00009";
    Item.Tooltip = "";
    Item.Name = "Capitoli Senza Unità";
    Item.iGuid = "626F53CB-2A6F-4442-A2F6-6EE742CF483D";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Capitoli senza Unità' as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef11.PQRY_DUAL24);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_RETTIFMASSIV.SetItem(10,Item);
    Item.ItemIndex = "N00010";
    Item.Tooltip = "";
    Item.Name = "ES";
    Item.iGuid = "3A2FA10C-B39D-4EA9-8ED0-FFF4238BCE17";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Entrata' as ES, ");
    SQL.append("  'E' as ESLETTERA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  'Spesa', ");
    SQL.append("  'S' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef11.PQRY_DUAL27);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_RETTIFMASSIV.SetItem(11,Item);
    Item.ItemIndex = "N00011";
    Item.Tooltip = "";
    Item.Name = "Lista Capitoli";
    Item.iGuid = "65748063-90FF-479E-A54F-AE9047CC5C1C";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Voce P.e.g. ' || TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) || ' ' || A.DESCRIZIONE as RECORCAPDESC, ");
    SQL.append("  'CP' || TO_CHAR ( A.ESERCIZIO ) || '#' || A.E_S || '#' || TO_CHAR ( A.CAPITOLO ) || '#' || TO_CHAR ( A.ARTICOLO ) as HASH, ");
    SQL.append("  A.CAPITOLO as RECORCAPCAPI, ");
    SQL.append("  A.ARTICOLO as RECORCAPARTI ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.E_S = ~~PQRY_DUAL27.ESLETTERA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ARTICOLO <> 0 OR (A.ARTICOLO = 0 AND NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'x' ");
    SQL.append("from ");
    SQL.append("  BIL B ");
    SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO <> 0) ");
    SQL.append("and   (B.E_S = ~~PQRY_DUAL27.ESLETTERA~~) ");
    SQL.append("))))) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'x' ");
    SQL.append("from ");
    SQL.append("  BIL C ");
    SQL.append("where (C.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (A.ARTICOLO = C.ARTICOLO) ");
    SQL.append("and   (~~PQRY_DUAL27.ESLETTERA~~ = C.E_S) ");
    SQL.append("and   (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("))) ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'x' ");
    SQL.append("from ");
    SQL.append("  CAP_UO D ");
    SQL.append("where (A.ESERCIZIO = D.ESERCIZIO) ");
    SQL.append("and   (A.E_S = D.E_S) ");
    SQL.append("and   (A.CAPITOLO = D.CAPITOLO) ");
    SQL.append("and   (A.ARTICOLO = D.ARTICOLO) ");
    SQL.append("and   (((D.SCADENZA IS NULL) OR D.SCADENZA >= TRUNC( SYSDATE ))) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'x' ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE E ");
    SQL.append("where (D.PROGR_UNITA_ORGANIZZATIVA = E.PROGR_UNITA_ORGANIZZATIVA) ");
    SQL.append("and   (E.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (((E.AL IS NULL) OR E.AL >= TRUNC( SYSDATE ))) ");
    SQL.append("))) ");
    SQL.append(")))) ");
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef11.PQRY_CAP28);
    Item.AddPK("RECORCAPCAPI");
    Item.AddPK("RECORCAPARTI");
    Item = TRE_RETTIFMASSIV.GetItem(1);
    Item.SetItem(1, TRE_RETTIFMASSIV.GetItem(2));
    Item = TRE_RETTIFMASSIV.GetItem(2);
    Item.Parent = TRE_RETTIFMASSIV.GetItem(1);
    Item.SetItem(1, TRE_RETTIFMASSIV.GetItem(3));
    Item = TRE_RETTIFMASSIV.GetItem(3);
    Item.Parent = TRE_RETTIFMASSIV.GetItem(2);
    Item.SetItem(1, TRE_RETTIFMASSIV.GetItem(4));
    Item = TRE_RETTIFMASSIV.GetItem(4);
    Item.Parent = TRE_RETTIFMASSIV.GetItem(3);
    Item = TRE_RETTIFMASSIV.GetItem(5);
    Item.SetItem(1, TRE_RETTIFMASSIV.GetItem(6));
    Item = TRE_RETTIFMASSIV.GetItem(6);
    Item.Parent = TRE_RETTIFMASSIV.GetItem(5);
    Item.SetItem(1, TRE_RETTIFMASSIV.GetItem(7));
    Item = TRE_RETTIFMASSIV.GetItem(7);
    Item.Parent = TRE_RETTIFMASSIV.GetItem(6);
    Item.SetItem(1, TRE_RETTIFMASSIV.GetItem(8));
    Item = TRE_RETTIFMASSIV.GetItem(8);
    Item.Parent = TRE_RETTIFMASSIV.GetItem(7);
    Item = TRE_RETTIFMASSIV.GetItem(9);
    Item.SetItem(1, TRE_RETTIFMASSIV.GetItem(10));
    Item = TRE_RETTIFMASSIV.GetItem(10);
    Item.Parent = TRE_RETTIFMASSIV.GetItem(9);
    Item.SetItem(1, TRE_RETTIFMASSIV.GetItem(11));
    Item = TRE_RETTIFMASSIV.GetItem(11);
    Item.Parent = TRE_RETTIFMASSIV.GetItem(10);
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[1].ChildFrame2 = Frames[5];
    Frames[5].Width = 800;
    Frames[5].Height = 60;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Pannello Comandi ";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 60;
    PAN_PANNELCOMAND = new IDPanel(w, this, 5, "PAN_PANNELCOMAND");
    Frames[5].Content = PAN_PANNELCOMAND;
    PAN_PANNELCOMAND.ShowRowSelector = false;
    PAN_PANNELCOMAND.ShowToolbar = false;
    PAN_PANNELCOMAND.ShowStatusbar = false;
    PAN_PANNELCOMAND.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANNELCOMAND.VS = MainFrm.VisualStyleList;
    PAN_PANNELCOMAND.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 800-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PANNELCOMAND.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4787DCFF-35DD-4EF6-86EE-57ADDEC4F4AA");
    PAN_PANNELCOMAND.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 36, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PANNELCOMAND.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PANNELCOMAND.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANNELCOMAND.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PANNELCOMAND.InitStatus = 1;
    PAN_PANNELCOMAND_Init();
    PAN_PANNELCOMAND_InitFields();
    PAN_PANNELCOMAND_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_AGGIUNIAICAP+BaseCmdLinIdx)
      {
        AggiungiUO();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SOSTUNIAICAP+BaseCmdLinIdx)
      {
        RettificaUO();
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
      PAN_PANNELCOMAND.UpdatePanel(MainFrm);
      PAN_NUOVOPANNELL.UpdatePanel(MainFrm);
      TRE_RETTIFMASSIV.UpdateTree(MainFrm);
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
    return (obj instanceof RettificaMassivaUO);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RettificaMassivaUO.class.getName() : (Glb.ClassWithPackage(RettificaMassivaUO.class) ? RettificaMassivaUO.class.getName().substring(RettificaMassivaUO.class.getPackage().getName().length() + 1) : RettificaMassivaUO.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Rettifica Massiva On Change Selection
  // Evento notificato dall'albero quando cambia lo stato
  // di selezione di un nodo
  // HashKey - Input
  // Selezionato - Input
  // Cancel - Input/Output
  // Final - Input
  // **********************************************************************
  private void TRE_RETTIFMASSIV_OnChangeSelNode(IDVariant HashKey, IDVariant Selezionato, IDVariant Cancel, IDVariant Final)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rettifica Massiva On Change Selection Body
      // Corpo Procedura
      // 
      TRE_RETTIFMASSIV.ActivateNode(MainFrm, HashKey, (new IDVariant(0)).booleanValue(), (new IDVariant(-1)).booleanValue()); 
      // if (TRE_RETTIFMASSIV.GetChildrenCount(HashKey).compareTo((new IDVariant(0)), true)>0)
      // {
        // if (Selezionato.equals((new IDVariant(-1)), true))
        // {
          // Cancel.set((new IDVariant(-1)));
        // }
      // }
      if (IDL.Left(HashKey, (new IDVariant(2))).compareTo((new IDVariant("CP")), true)!=0 && IDL.Left(HashKey, (new IDVariant(2))).compareTo((new IDVariant("CA")), true)!=0)
      {
        if (Selezionato.equals((new IDVariant(-1)), true))
        {
          Cancel.set((new IDVariant(-1)));
        }
      }
      if (IDL.Left(HashKey, (new IDVariant(2))).equals((new IDVariant("CA")), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_CAPUO1, IMDBDef11.PQSL_CAPUO1_RECOCAPUOSCA, 0),IDL.ToDate((new IDVariant(3000)), (new IDVariant(12)), (new IDVariant(31)))).compareTo(IDL.Today(), true)<=0)
        {
          MainFrm.set_AlertMessage((new IDVariant("L'associazione dell'unità al capitolo è scaduta, per cui il capitolo non è selezionabile\""))); 
          if (Selezionato.equals((new IDVariant(-1)), true))
          {
            Cancel.set((new IDVariant(-1)));
          }
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_CAPUO, IMDBDef11.PQSL_CAPUO_RECOCAPUOSCA, 0),IDL.ToDate((new IDVariant(3000)), (new IDVariant(12)), (new IDVariant(31)))).compareTo(IDL.Today(), true)<=0)
        {
          MainFrm.set_AlertMessage((new IDVariant("Capitolo con unità scaduta, non è selezionabile!"))); 
          if (Selezionato.equals((new IDVariant(-1)), true))
          {
            Cancel.set((new IDVariant(-1)));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaMassivaUO", "RettificaMassivaOnChangeSelection", _e);
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
      TRE_RETTIFMASSIV.set_SelectMulti((new IDVariant(-1)).booleanValue());
      LOAD_APPOGGDELETE();
      PAN_PANNELCOMAND.set_Visible((new IDVariant(0)).booleanValue());
      TRE_RETTIFMASSIV.set_Visible((new IDVariant(0)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaMassivaUO", "Load", _e);
    }
  }

  // **********************************************************************
  // Appoggiorettifica: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_APPOGGDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_APPOGGIORETT);
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
      if (Result.booleanValue())
      {
        TRE_RETTIFMASSIV.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(0)).booleanValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaMassivaUO", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Aggiungi UO
  // **********************************************************************
  public int AggiungiUO ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiungi UO Body
      // Corpo Procedura
      // 
      AGGIUNGIUO_APPOGGDELETE();
      IDVariant I = new IDVariant(0,IDVariant.INTEGER);
      // 
      //  
      // 
      if (TRE_RETTIFMASSIV.GetSelectedCount().compareTo((new IDVariant(1)), true)<0)
      {
        MainFrm.set_AlertMessage((new IDVariant("Selezionare almeno un elemento prima di procedere con l'operazione"))); 
        return 0;
      }
      // 
      // Scrivi un commento per questo ciclo o premi backspace
      // per eliminare questo commento
      // 
      while (I.compareTo(TRE_RETTIFMASSIV.GetSelectedCount(), true)<0)
      {
        IDVariant v_IDENTIFITREE = null;
        v_IDENTIFITREE = TRE_RETTIFMASSIV.GetSelectedNode(I);
        if (IDL.Like(TRE_RETTIFMASSIV.GetSelectedNode(I), (new IDVariant("CP%"))))
        {
          AGGIUNGIUO_APPINSINTSE2(v_IDENTIFITREE);
        }
        if (IDL.Like(TRE_RETTIFMASSIV.GetSelectedNode(I), (new IDVariant("CAPUO%"))))
        {
          AGGIUNGIUO_APPINSINTSE3(v_IDENTIFITREE);
        }
        I = IDL.Add(I, (new IDVariant(1)));
      }
      MainFrm.Show(MyGlb.FRM_AGGIUNIAICAP, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaMassivaUO", "AggiungiUO", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Appoggiorettifica: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void AGGIUNGIUO_APPOGGDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_APPOGGIORETT);
  }

  // **********************************************************************
  // Appoggiorettifica: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void AGGIUNGIUO_APPINSINTSE2(IDVariant v_IDENTIFITREE) throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'CP' as CCP, ");
    SQL.append("  A.ESERCIZIO as CAPESERCIZIO, ");
    SQL.append("  A.E_S as CAPES, ");
    SQL.append("  A.CAPITOLO as CAPCAPITOLO, ");
    SQL.append("  A.ARTICOLO as CAPARTICOLO, ");
    SQL.append("  ' ' as C1, ");
    SQL.append("  ' ' as C ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where ('CP' || TO_CHAR ( A.ESERCIZIO ) || '#' || A.E_S || '#' || TO_CHAR ( A.CAPITOLO ) || '#' || TO_CHAR ( A.ARTICOLO ) = " + IDL.CSql(v_IDENTIFITREE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef3.TBL_APPOGGIORETT, 0);
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETABE,0,RS.Get(1));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEESER,0,new IDVariant(RS.Get(2),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETTES,0,RS.Get(3));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGECAPI,0,new IDVariant(RS.Get(4),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEARTI,0,new IDVariant(RS.Get(5),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGPROUO,0,RS.Get(6));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGTIPUO,0,RS.Get(7));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Appoggiorettifica: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void AGGIUNGIUO_APPINSINTSE3(IDVariant v_IDENTIFITREE) throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'CAPUO' as CCAPUO, ");
    SQL.append("  A.ESERCIZIO as CAPUOESERCIZ, ");
    SQL.append("  A.E_S as CAPUOES, ");
    SQL.append("  A.CAPITOLO as CAPUOCAPUOIT, ");
    SQL.append("  A.ARTICOLO as CAPUOARTICOL, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAUOPRUNORUO, ");
    SQL.append("  A.TIPO_UNITA_ORGANIZZATIVA as CAUOTIUNORUO ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where ('CAPUO' || TO_CHAR ( A.ESERCIZIO ) || '#' || A.E_S || '#' || TO_CHAR ( A.CAPITOLO ) || '#' || TO_CHAR ( A.ARTICOLO ) || '#' || TO_CHAR ( A.PROGR_UNITA_ORGANIZZATIVA ) || '#' || TO_CHAR ( A.TIPO_UNITA_ORGANIZZATIVA ) = " + IDL.CSql(v_IDENTIFITREE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef3.TBL_APPOGGIORETT, 0);
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETABE,0,RS.Get(1));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEESER,0,new IDVariant(RS.Get(2),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETTES,0,RS.Get(3));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGECAPI,0,new IDVariant(RS.Get(4),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEARTI,0,new IDVariant(RS.Get(5),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGPROUO,0,new IDVariant(RS.Get(6),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGTIPUO,0,RS.Get(7));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Rettifica UO
  // **********************************************************************
  public int RettificaUO ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rettifica UO Body
      // Corpo Procedura
      // 
      RETTIFICAUO_APPOGGDELETE();
      IDVariant I = new IDVariant(0,IDVariant.INTEGER);
      // 
      //  
      // 
      if (TRE_RETTIFMASSIV.GetSelectedCount().compareTo((new IDVariant(1)), true)<0)
      {
        MainFrm.set_AlertMessage((new IDVariant("Selezionare almeno un elemento prima di procedere con l'operazione"))); 
        return 0;
      }
      // 
      // Scrivi un commento per questo ciclo o premi backspace
      // per eliminare questo commento
      // 
      while (I.compareTo(TRE_RETTIFMASSIV.GetSelectedCount(), true)<0)
      {
        IDVariant v_IDENTIFITREE = null;
        v_IDENTIFITREE = TRE_RETTIFMASSIV.GetSelectedNode(I);
        if (IDL.Like(TRE_RETTIFMASSIV.GetSelectedNode(I), (new IDVariant("CP%"))))
        {
          RETTIFICAUO_APPINSINTSE1(v_IDENTIFITREE);
        }
        if (IDL.Like(TRE_RETTIFMASSIV.GetSelectedNode(I), (new IDVariant("CAPUO%"))))
        {
          RETTIFICAUO_APPINSINTSEL(v_IDENTIFITREE);
        }
        I = IDL.Add(I, (new IDVariant(1)));
      }
      MainFrm.Show(MyGlb.FRM_RETTIFIUNITA, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaMassivaUO", "RettificaUO", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Appoggiorettifica: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RETTIFICAUO_APPOGGDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_APPOGGIORETT);
  }

  // **********************************************************************
  // Appoggiorettifica: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RETTIFICAUO_APPINSINTSE1(IDVariant v_IDENTIFITREE) throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'CP' as CCP, ");
    SQL.append("  A.ESERCIZIO as CAPESERCIZIO, ");
    SQL.append("  A.E_S as CAPES, ");
    SQL.append("  A.CAPITOLO as CAPCAPITOLO, ");
    SQL.append("  A.ARTICOLO as CAPARTICOLO, ");
    SQL.append("  ' ' as C1, ");
    SQL.append("  ' ' as C ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where ('CP' || TO_CHAR ( A.ESERCIZIO ) || '#' || A.E_S || '#' || TO_CHAR ( A.CAPITOLO ) || '#' || TO_CHAR ( A.ARTICOLO ) = " + IDL.CSql(v_IDENTIFITREE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef3.TBL_APPOGGIORETT, 0);
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETABE,0,RS.Get(1));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEESER,0,new IDVariant(RS.Get(2),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETTES,0,RS.Get(3));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGECAPI,0,new IDVariant(RS.Get(4),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEARTI,0,new IDVariant(RS.Get(5),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGPROUO,0,RS.Get(6));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGTIPUO,0,RS.Get(7));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Appoggiorettifica: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RETTIFICAUO_APPINSINTSEL(IDVariant v_IDENTIFITREE) throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'CAPUO' as CCAPUO, ");
    SQL.append("  A.ESERCIZIO as CAPUOESERCIZ, ");
    SQL.append("  A.E_S as CAPUOES, ");
    SQL.append("  A.CAPITOLO as CAPUOCAPUOIT, ");
    SQL.append("  A.ARTICOLO as CAPUOARTICOL, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAUOPRUNORUO, ");
    SQL.append("  A.TIPO_UNITA_ORGANIZZATIVA as CAUOTIUNORUO ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where ('CAPUO' || TO_CHAR ( A.ESERCIZIO ) || '#' || A.E_S || '#' || TO_CHAR ( A.CAPITOLO ) || '#' || TO_CHAR ( A.ARTICOLO ) || '#' || TO_CHAR ( A.PROGR_UNITA_ORGANIZZATIVA ) || '#' || TO_CHAR ( A.TIPO_UNITA_ORGANIZZATIVA ) = " + IDL.CSql(v_IDENTIFITREE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef3.TBL_APPOGGIORETT, 0);
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETABE,0,RS.Get(1));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEESER,0,new IDVariant(RS.Get(2),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGETTES,0,RS.Get(3));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGECAPI,0,new IDVariant(RS.Get(4),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGEARTI,0,new IDVariant(RS.Get(5),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGPROUO,0,new IDVariant(RS.Get(6),IDVariant.STRING));
      IMDB.set_Value(IMDBDef3.TBL_APPOGGIORETT,IMDBDef3.FLD_APPOGGIORETT_NOMEOGGTIPUO,0,RS.Get(7));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Nuovo Pannello After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_NUOVOPANNELL_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Pannello After Find Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaMassivaUO", "NuovoPannelloAfterFind", _e);
    }
  }

  // **********************************************************************
  // Cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Cap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cap Body
      // Corpo Procedura
      // 
      TRE_RETTIFMASSIV.set_Visible((new IDVariant(-1)).booleanValue());
      PAN_PANNELCOMAND.set_Visible((new IDVariant(-1)).booleanValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaMassivaUO", "Cap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Doc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Doc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Doc Body
      // Corpo Procedura
      // 
      PAN_PANNELCOMAND.set_Visible((new IDVariant(0)).booleanValue());
      TRE_RETTIFMASSIV.set_Visible((new IDVariant(0)).booleanValue());
      if (!((MainFrm.GetForm(MyGlb.FRM_FATTURE, 0, false)!=null)))
      {
        MainFrm.Show(MyGlb.FRM_FATTURE, (new IDVariant(0)).intValue(), this); 
      }
      else
      {
        MainFrm.BringToFront(MyGlb.FRM_FATTURE);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaMassivaUO", "Doc", _e);
      return -1;
    }
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
  private void PAN_NUOVOPANNELL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NUOVOPANNELL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NUOVOPANNELL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NUOVOPANNELL, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NUOVOPANNELL_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NUOVOPANNELL);
    // Stub
  }

  private void PAN_NUOVOPANNELL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_NUOVOPANNELL_ETICHECAPITO)
    {
      this.IdxPanelActived = this.PAN_NUOVOPANNELL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Cap();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_NUOVOPANNELL_FATTURE)
    {
      this.IdxPanelActived = this.PAN_NUOVOPANNELL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Doc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_NUOVOPANNELL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NUOVOPANNELL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NUOVOPANNELL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void TRE_RETTIFMASSIV_NodeClick(ATreeNode Node)
  {
    if (TRE_RETTIFMASSIV.NodeClick(MainFrm, Node))
    {
    }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PANNELCOMAND_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANNELCOMAND, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PANNELCOMAND_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PANNELCOMAND, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANNELCOMAND_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PANNELCOMAND);
    // Stub
  }

  private void PAN_PANNELCOMAND_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PANNELCOMAND_AGGIUNGUNITA)
    {
      this.IdxPanelActived = this.PAN_PANNELCOMAND.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      AggiungiUO();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PANNELCOMAND_RETTIFIUNITA)
    {
      this.IdxPanelActived = this.PAN_PANNELCOMAND.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      RettificaUO();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PANNELCOMAND_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PANNELCOMAND_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANNELCOMAND_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PANNELCOMAND_Init()
  {

    PAN_PANNELCOMAND.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANNELCOMAND.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANNELCOMAND.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PANNELCOMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_AGGIUNGUNITA, "D40DFD80-A88B-4945-829F-8B26031BCC09");
    PAN_PANNELCOMAND.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_AGGIUNGUNITA, "Aggiungi Unità");
    PAN_PANNELCOMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_AGGIUNGUNITA, MyGlb.VIS_STATICBUTTON);
    PAN_PANNELCOMAND.SetImage(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_AGGIUNGUNITA, 0, "button_large.GIF", false);
    PAN_PANNELCOMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_AGGIUNGUNITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PANNELCOMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_RETTIFIUNITA, "B4CD9628-4407-45E0-A6CD-48147A412F3D");
    PAN_PANNELCOMAND.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_RETTIFIUNITA, "Rettifica Unità");
    PAN_PANNELCOMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_RETTIFIUNITA, MyGlb.VIS_STATICBUTTON);
    PAN_PANNELCOMAND.SetImage(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_RETTIFIUNITA, 0, "button_large.GIF", false);
    PAN_PANNELCOMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_RETTIFIUNITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PANNELCOMAND_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANNELCOMAND.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_AGGIUNGUNITA, MyGlb.PANEL_LIST, 24, 8, 92, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELCOMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_AGGIUNGUNITA, MyGlb.PANEL_LIST, 0);
    PAN_PANNELCOMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_AGGIUNGUNITA, MyGlb.PANEL_LIST, 1);
    PAN_PANNELCOMAND.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_AGGIUNGUNITA, MyGlb.PANEL_FORM, 480, 12, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELCOMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_AGGIUNGUNITA, MyGlb.PANEL_FORM, 0);
    PAN_PANNELCOMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_AGGIUNGUNITA, MyGlb.PANEL_FORM, 1);
    PAN_PANNELCOMAND.SetFieldPage(PFL_PANNELCOMAND_AGGIUNGUNITA, -1, -1);
    PAN_PANNELCOMAND.SetFieldPanel(PFL_PANNELCOMAND_AGGIUNGUNITA, -1, "", "AGGIUNGUNITA", 0, 0, 0, -13869);
    PAN_PANNELCOMAND.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_RETTIFIUNITA, MyGlb.PANEL_LIST, 32, 16, 92, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELCOMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_RETTIFIUNITA, MyGlb.PANEL_LIST, 0);
    PAN_PANNELCOMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_RETTIFIUNITA, MyGlb.PANEL_LIST, 1);
    PAN_PANNELCOMAND.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_RETTIFIUNITA, MyGlb.PANEL_FORM, 644, 12, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELCOMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_RETTIFIUNITA, MyGlb.PANEL_FORM, 0);
    PAN_PANNELCOMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELCOMAND_RETTIFIUNITA, MyGlb.PANEL_FORM, 1);
    PAN_PANNELCOMAND.SetFieldPage(PFL_PANNELCOMAND_RETTIFIUNITA, -1, -1);
    PAN_PANNELCOMAND.SetFieldPanel(PFL_PANNELCOMAND_RETTIFIUNITA, -1, "", "RETTIFIUNITA", 0, 0, 0, -13869);
  }

  private void PAN_PANNELCOMAND_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANNELCOMAND.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PANNELCOMAND.set_ShowInfoMessages(false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANNELCOMAND.Status() == 2)
    {
      int oldListQBE = PAN_PANNELCOMAND.iUseListQBE;
      PAN_PANNELCOMAND.iUseListQBE = 0;
      PAN_PANNELCOMAND.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANNELCOMAND.PanelCommand(Glb.PCM_FIND);
      PAN_PANNELCOMAND.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NUOVOPANNELL_Init()
  {

    PAN_NUOVOPANNELL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NUOVOPANNELL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NUOVOPANNELL.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NUOVOPANNELL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHECAPITO, "25B14535-E25B-40FC-ACEB-785E52F471A5");
    PAN_NUOVOPANNELL.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHECAPITO, "Capitoli");
    PAN_NUOVOPANNELL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHECAPITO, MyGlb.VIS_STATICBUTTON);
    PAN_NUOVOPANNELL.SetImage(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHECAPITO, 0, "button1.gif", false);
    PAN_NUOVOPANNELL.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHECAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_NUOVOPANNELL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_FATTURE, "ED065861-A3E0-4341-B0B3-4EC551F437C1");
    PAN_NUOVOPANNELL.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_FATTURE, "Fatture");
    PAN_NUOVOPANNELL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_FATTURE, MyGlb.VIS_STATICBUTTON);
    PAN_NUOVOPANNELL.SetImage(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_FATTURE, 0, "button1.gif", false);
    PAN_NUOVOPANNELL.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_FATTURE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_NUOVOPANNELL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETTO, "515883C6-666F-450C-BC9E-5B5E953CEFF4");
    PAN_NUOVOPANNELL.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETTO, "Per rettificare o aggiungere una unità ad uno o più capitoli, agli impegni collegati e ai movimenti relativi");
    PAN_NUOVOPANNELL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETTO, MyGlb.VIS_VUOGRAALILEF);
    PAN_NUOVOPANNELL.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_NUOVOPANNELL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETO1, "FA238908-F113-44A2-A3FF-27F61468910A");
    PAN_NUOVOPANNELL.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETO1, "Per rettificare o aggiungere una unità alle fatture non collegate ad impegno.\nIl pulsante apre la videata Documenti dalla quale si può eseguire la modifica");
    PAN_NUOVOPANNELL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETO1, MyGlb.VIS_VUOGRAALILEF);
    PAN_NUOVOPANNELL.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_NUOVOPANNELL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHECAPITO, MyGlb.PANEL_LIST, 36, 12, 144, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHECAPITO, MyGlb.PANEL_LIST, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHECAPITO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHECAPITO, MyGlb.PANEL_FORM, 36, 12, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHECAPITO, MyGlb.PANEL_FORM, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHECAPITO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVOPANNELL.SetFieldPage(PFL_NUOVOPANNELL_ETICHECAPITO, -1, -1);
    PAN_NUOVOPANNELL.SetFieldPanel(PFL_NUOVOPANNELL_ETICHECAPITO, -1, "", "ETICHECAPITO", 0, 0, 0, -13997);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_FATTURE, MyGlb.PANEL_LIST, 44, 20, 144, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_FATTURE, MyGlb.PANEL_LIST, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_FATTURE, MyGlb.PANEL_LIST, 1);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_FATTURE, MyGlb.PANEL_FORM, 36, 52, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_FATTURE, MyGlb.PANEL_FORM, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_FATTURE, MyGlb.PANEL_FORM, 1);
    PAN_NUOVOPANNELL.SetFieldPage(PFL_NUOVOPANNELL_FATTURE, -1, -1);
    PAN_NUOVOPANNELL.SetFieldPanel(PFL_NUOVOPANNELL_FATTURE, -1, "", "FATTURE", 0, 0, 0, -13997);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETTO, MyGlb.PANEL_LIST, 128, 16, 520, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETTO, MyGlb.PANEL_LIST, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETTO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETTO, MyGlb.PANEL_FORM, 128, 16, 664, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETTO, MyGlb.PANEL_FORM, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETTO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVOPANNELL.SetFieldPage(PFL_NUOVOPANNELL_ETICPERRETTO, -1, -1);
    PAN_NUOVOPANNELL.SetFieldPanel(PFL_NUOVOPANNELL_ETICPERRETTO, -1, "", "ETICPERRETTO", 0, 0, 0, -13997);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETO1, MyGlb.PANEL_LIST, 136, 24, 520, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETO1, MyGlb.PANEL_LIST, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETO1, MyGlb.PANEL_LIST, 1);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETO1, MyGlb.PANEL_FORM, 128, 52, 664, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETO1, MyGlb.PANEL_FORM, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICPERRETO1, MyGlb.PANEL_FORM, 2);
    PAN_NUOVOPANNELL.SetFieldPage(PFL_NUOVOPANNELL_ETICPERRETO1, -1, -1);
    PAN_NUOVOPANNELL.SetFieldPanel(PFL_NUOVOPANNELL_ETICPERRETO1, -1, "", "ETICPERRETO1", 0, 0, 0, -13997);
  }

  private void PAN_NUOVOPANNELL_InitQueries()
  {
    StringBuffer SQL;

    PAN_NUOVOPANNELL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NUOVOPANNELL.set_ShowInfoMessages(false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NUOVOPANNELL.Status() == 2)
    {
      int oldListQBE = PAN_NUOVOPANNELL.iUseListQBE;
      PAN_NUOVOPANNELL.iUseListQBE = 0;
      PAN_NUOVOPANNELL.PanelCommand(Glb.PCM_SEARCH);
      PAN_NUOVOPANNELL.PanelCommand(Glb.PCM_FIND);
      PAN_NUOVOPANNELL.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PANNELCOMAND) PAN_PANNELCOMAND_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NUOVOPANNELL) PAN_NUOVOPANNELL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PANNELCOMAND) PAN_PANNELCOMAND_ValidateRow(Cancel);
    if (SrcObj == PAN_NUOVOPANNELL) PAN_NUOVOPANNELL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PANNELCOMAND) PAN_PANNELCOMAND_DynamicProperties();
    if (SrcObj == PAN_NUOVOPANNELL) PAN_NUOVOPANNELL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PANNELCOMAND) PAN_PANNELCOMAND_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NUOVOPANNELL) PAN_NUOVOPANNELL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_NUOVOPANNELL) PAN_NUOVOPANNELL_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PANNELCOMAND) PAN_PANNELCOMAND_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NUOVOPANNELL) PAN_NUOVOPANNELL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == TRE_RETTIFMASSIV) TRE_RETTIFMASSIV_NodeClick(Node);
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
    if (SrcObj == TRE_RETTIFMASSIV) TRE_RETTIFMASSIV_OnChangeSelNode(HashKey, Selected, Cancel, Final);
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
