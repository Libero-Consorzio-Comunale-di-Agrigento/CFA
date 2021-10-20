// **********************************************
// Calcoli Importi Bilancio Effettivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CalcoliImportiBilancioEffettivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_ESERCDACALCO = 0;
  private static int GRP_PARAMETRI_PLURIENNALE = 1;

  private static int PFL_PARAMETRI_ESERCDAGENER = 0;
  private static int PFL_PARAMETRI_ESERCIZIO = 1;
  private static int PFL_PARAMETRI_ESERCIRIFERI = 2;
  private static int PFL_PARAMETRI_STANZIAMPURO = 3;
  private static int PFL_PARAMETRI_ETICSTANPURO = 4;
  private static int PFL_PARAMETRI_PARTSTANPURO = 5;
  private static int PFL_PARAMETRI_CANCELVARIAZ = 6;
  private static int PFL_PARAMETRI_INSERIBILANC = 7;
  private static int PFL_PARAMETRI_RESIDUPRESUN = 8;
  private static int PFL_PARAMETRI_ETICRESIPRES = 9;
  private static int PFL_PARAMETRI_PARTRESIPRES = 10;
  private static int PFL_PARAMETRI_TIPORESIPRES = 11;
  private static int PFL_PARAMETRI_STANZIACASSA = 12;
  private static int PFL_PARAMETRI_ETICSTANCASS = 13;
  private static int PFL_PARAMETRI_PARTSTANCASS = 14;
  private static int PFL_PARAMETRI_OK = 15;
  private static int PFL_PARAMETRI_ANNULLA = 16;
  private static int PFL_PARAMETRI_GIAIMPEGNATO = 17;
  private static int PFL_PARAMETRI_ETICHGIAIMPE = 18;

  private static int PPQRY_OUT12 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_PARAMETRI;
  private static int PFL_NOTEFUNZIONA_MODULO = 0;
  private static int PFL_NOTEFUNZIONA_PAGINA = 1;
  private static int PFL_NOTEFUNZIONA_FUNZIONE = 2;
  private static int PFL_NOTEFUNZIONA_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZION7 = 0;


  IDPanel PAN_NOTEFUNZIONA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_OUT15(IMDB);
    //
    //
    Init_PQRY_OUT12(IMDB);
    Init_PQRY_OUT12_RS(IMDB);
    Init_PQRY_NOTEFUNZION7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_OUT15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_OUT15, 14);
    IMDB.set_TblCode(IMDBDef3.TBL_OUT15, "TBL_OUT15");
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ESE_DA_GEN, "ESE_DA_GEN");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ESE_DA_GEN,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ESE_RIF, "ESE_RIF");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ESE_RIF,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMSTAPUR, "ROWNAMSTAPUR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMSTAPUR,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMPASTPU, "ROWNAMPASTPU");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMPASTPU,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMCANVAR, "ROWNAMCANVAR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMCANVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMINSBIL, "ROWNAMINSBIL");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMINSBIL,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMRESPRE, "ROWNAMRESPRE");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMRESPRE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMPAREPR, "ROWNAMPAREPR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMPAREPR,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMTIREPR, "ROWNAMTIREPR");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMTIREPR,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMSTACAS, "ROWNAMSTACAS");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMSTACAS,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMPASTCA, "ROWNAMPASTCA");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMPASTCA,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMEFUNZI,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMGIAIMP, "ROWNAMGIAIMP");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT15,IMDBDef3.FLD_OUT15_ROWNAMGIAIMP,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_OUT15, 0);
  }

  private static void Init_PQRY_OUT12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT12, 13);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT12, "PQRY_OUT12");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ESE_DA_GEN, "ESE_DA_GEN");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ESE_DA_GEN,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ESE_RIF, "ESE_RIF");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ESE_RIF,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMSTAPUR, "ROWNAMSTAPUR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMSTAPUR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMPASTPU, "ROWNAMPASTPU");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMPASTPU,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMCANVAR, "ROWNAMCANVAR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMCANVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMINSBIL, "ROWNAMINSBIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMINSBIL,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMRESPRE, "ROWNAMRESPRE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMRESPRE,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMPAREPR, "ROWNAMPAREPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMPAREPR,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMTIREPR, "ROWNAMTIREPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMTIREPR,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMSTACAS, "ROWNAMSTACAS");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMSTACAS,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMPASTCA, "ROWNAMPASTCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMPASTCA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMGIAIMP, "ROWNAMGIAIMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12,IMDBDef11.PQSL_OUT12_ROWNAMGIAIMP,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_OUT12, 0);
  }

  private static void Init_PQRY_OUT12_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT12_RS, 13);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT12_RS, "PQRY_OUT12_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ESE_DA_GEN, "ESE_DA_GEN");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ESE_DA_GEN,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ESE_RIF, "ESE_RIF");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ESE_RIF,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMSTAPUR, "ROWNAMSTAPUR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMSTAPUR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMPASTPU, "ROWNAMPASTPU");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMPASTPU,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMCANVAR, "ROWNAMCANVAR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMCANVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMINSBIL, "ROWNAMINSBIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMINSBIL,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMRESPRE, "ROWNAMRESPRE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMRESPRE,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMPAREPR, "ROWNAMPAREPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMPAREPR,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMTIREPR, "ROWNAMTIREPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMTIREPR,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMSTACAS, "ROWNAMSTACAS");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMSTACAS,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMPASTCA, "ROWNAMPASTCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMPASTCA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMGIAIMP, "ROWNAMGIAIMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT12_RS,IMDBDef11.PQSL_OUT12_ROWNAMGIAIMP,5,2,0);
  }

  private static void Init_PQRY_NOTEFUNZION7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_NOTEFUNZION7, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_NOTEFUNZION7, "PQRY_NOTEFUNZION7");
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZION7,IMDBDef11.PQSL_NOTEFUNZION7_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZION7,IMDBDef11.PQSL_NOTEFUNZION7_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZION7,IMDBDef11.PQSL_NOTEFUNZION7_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZION7,IMDBDef11.PQSL_NOTEFUNZION7_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZION7,IMDBDef11.PQSL_NOTEFUNZION7_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZION7,IMDBDef11.PQSL_NOTEFUNZION7_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZION7,IMDBDef11.PQSL_NOTEFUNZION7_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZION7,IMDBDef11.PQSL_NOTEFUNZION7_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_NOTEFUNZION7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CalcoliImportiBilancioEffettivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public CalcoliImportiBilancioEffettivo()
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
    FormIdx = MyGlb.FRM_CALIMPBILEFF;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FBBBE88F-CA12-45DB-A6B5-208C9536116E";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 872;
    DesignHeight = 434;
    set_Caption(new IDVariant("Calcoli Importi Bilancio Effettivo"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 872;
    Frames[1].Height = 408;
    Frames[1].FormFactor = 0.46789;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 408;
    Frames[2].Height = 408;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 408;
    Frames[2].FixedHeight = 408;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 408-MyGlb.PAN_OFFS_X, 408-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0B4DB699-3182-48F0-B3F4-1F5947F96657");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 232, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 464;
    Frames[3].Height = 408;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "NOTE FUNZIONALITA";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 408;
    PAN_NOTEFUNZIONA = new IDPanel(w, this, 3, "PAN_NOTEFUNZIONA");
    Frames[3].Content = PAN_NOTEFUNZIONA;
    PAN_NOTEFUNZIONA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONA.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 464-MyGlb.PAN_OFFS_X, 408-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "08F1D09A-B53D-4757-979C-3D33E8789317");
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
      if (IMDB.TblModified(IMDBDef3.TBL_OUT15, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CALIMPBILEFF_OUT12();
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
    return (obj instanceof CalcoliImportiBilancioEffettivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CalcoliImportiBilancioEffettivo.class.getName() : (Glb.ClassWithPackage(CalcoliImportiBilancioEffettivo.class) ? CalcoliImportiBilancioEffettivo.class.getName().substring(CalcoliImportiBilancioEffettivo.class.getPackage().getName().length() + 1) : CalcoliImportiBilancioEffettivo.class.getName()));
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
      IDVariant v_STANZIAMPURO = new IDVariant(0,IDVariant.STRING);
      v_STANZIAMPURO = (new IDVariant("Stanziamento Puro"));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESE_DA_GEN, 0, (new IDVariant("PE")));
      IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTAPUR, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMPASTPU, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMPAREPR, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMTIREPR, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMPASTCA, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMEFUNZI, 0, new IDVariant(v_STANZIAMPURO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioEffettivo", "LoadEvent", _e);
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
      PAN_PARAMETRI.PanelCommand(Glb.PCM_CANCEL);
      UNLOADEVENT_OUTDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioEffettivo", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // OUT: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_OUTDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESE_DA_GEN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESERCIZIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESE_RIF, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTAPUR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMPASTPU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMCANVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMINSBIL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMRESPRE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMPAREPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMTIREPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTACAS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMPASTCA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMEFUNZI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMGIAIMP, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Parametri On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioEffettivo", "ParametriOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties
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
      // Parametri On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESE_DA_GEN, 0).equals((new IDVariant("PE")), true))
      {
        // PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        // 
        // Per i tipi di calcolo disponibili adesso possiamo scegliere
        // solo il primo esercizio
        // 
        // PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMSTAPUR, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMRESPRE, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMSTACAS, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMGIAIMP, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioEffettivo", "ParametriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
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
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ESERCIZIO)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESERCIZIO, 0, IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESERCIZIO, 0));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESERCIZIO, 0))))
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESE_RIF, 0, IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESERCIZIO, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ESERCIRIFERI)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESE_RIF, 0, IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESE_RIF, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ESERCDAGENER)), true) && FieldWasModified.booleanValue())
      {
        // 
        // Per i tipi di calcolo disponibili adesso possiamo scegliere
        // solo il primo esercizio
        // 
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESE_DA_GEN, 0, (new IDVariant("PE")));
        if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESE_DA_GEN, 0).equals((new IDVariant("PE")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESE_RIF, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESERCIZIO, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMRESPRE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTACAS, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESERCIZIO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESE_RIF, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_STANZIAMPURO)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_STANZIAMPURO = new IDVariant(0,IDVariant.STRING);
        v_STANZIAMPURO = (new IDVariant("Stanziamento Puro"));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTAPUR, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMRESPRE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTACAS, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMGIAIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMEFUNZI, 0, new IDVariant(v_STANZIAMPURO));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PARTSTANPURO)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMPASTPU, 0, IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMPASTPU, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_CANCELVARIAZ)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMCANVAR, 0, IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMCANVAR, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_INSERIBILANC)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMINSBIL, 0, IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMINSBIL, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_RESIDUPRESUN)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_RESIDUPRESUN = new IDVariant(0,IDVariant.STRING);
        v_RESIDUPRESUN = (new IDVariant("Residui Presunti"));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTAPUR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMRESPRE, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTACAS, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMGIAIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMEFUNZI, 0, new IDVariant(v_RESIDUPRESUN));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PARTRESIPRES)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMPAREPR, 0, IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMPAREPR, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_TIPORESIPRES)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMTIREPR, 0, IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMTIREPR, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_STANZIACASSA)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_STANZDICASSA = new IDVariant(0,IDVariant.STRING);
        v_STANZDICASSA = (new IDVariant("Stanziamento di Cassa"));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTAPUR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMRESPRE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTACAS, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMGIAIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMEFUNZI, 0, new IDVariant(v_STANZDICASSA));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PARTSTANCASS)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMPASTCA, 0, IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMPASTCA, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_GIAIMPEGNATO)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_GIAIMPEGNATO = null;
        v_GIAIMPEGNATO = (new IDVariant("Gia Impegnato"));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTAPUR, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMRESPRE, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTACAS, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMGIAIMP, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMEFUNZI, 0, new IDVariant(v_GIAIMPEGNATO));
      }
      PAN_PARAMETRI.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioEffettivo", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Ok Proc
  // **********************************************************************
  public int OkProc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_SMS = (new IDVariant("Elaborazione eseguita", IDVariant.STRING));
      // 
      // Ok Proc Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESE_DA_GEN, 0).equals((new IDVariant("EP")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESERCIZIO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESE_RIF, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Indicare l'esercizio pluriennale e l'esercizio di riferimento"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESERCIZIO, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<=0)
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("L'Esercizio di Pluriennale deve essere superiore all'Esercizio Corrente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          return 0;
        }
        if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESE_RIF, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESERCIZIO, 0), true)>0)
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("L'Esercizio di Riferimento non può essere superiore all'Esercizio Pluriennale", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          return 0;
        }
        IDVariant v_VESEFINTIPO = null;
        v_VESEFINTIPO = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.TIPO as ESEFINTIPO ");
        SQL.append("from ");
        SQL.append("  ESEFIN A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FASE_BILANCIO <= 7) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VESEFINTIPO = QV.Get("ESEFINTIPO", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.IsNull(v_VESEFINTIPO))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Esercizio Pluriennale non presente o non abilitato per la Generazione del Bilancio"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      else
      {
        if (MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).compareTo((new IDVariant(7)), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Generazione non ammessa nell'attuale fase di bilancio dell'esercizio "));
          MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
          return 0;
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMSTAPUR, 0).equals((new IDVariant("SI")), true) || IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMRESPRE, 0).equals((new IDVariant("SI")), true))
      {
        if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESE_DA_GEN, 0).equals((new IDVariant("PE")), true))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Attenzione. Lo stanziamento di cassa dovrà essere ricalcolato per l'esercizio "));
          IDVariant v_CONTINUARE = new IDVariant(0,IDVariant.STRING);
          v_CONTINUARE = (new IDVariant(". Si vuole continuare?"));
          if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(((IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESERCIZIO, 0)))), v_CONTINUARE))))
          {
            return 0;
          }
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMSTAPUR, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.Cf4armDBObject.BILCALCOLOSTNPUROARMEFF(((IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESERCIZIO, 0)), ((IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESE_DA_GEN, 0).equals((new IDVariant("PE"))))?IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))):IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ESE_RIF, 0)), IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMPASTPU, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMCANVAR, 0),(new IDVariant("NO"))), IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMINSBIL, 0),(new IDVariant("NO"))));
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMRESPRE, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILCALCOLORESPRESUNTIEFF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMPAREPR, 0), IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMTIREPR, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMSTACAS, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILCALCOLOSTNCASSAARMBIL(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMPASTCA, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      }
      else if (IMDB.Value(IMDBDef11.PQRY_OUT12, IMDBDef11.PQSL_OUT12_ROWNAMGIAIMP, 0).equals((new IDVariant("SI")), true))
      {
        if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add((new IDVariant("Si è scelto di Calcolare il Già Impegnato per l'Esercizio ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" sul Bilancio Effettivo.</br>Si vuole continuare?"))))))
        {
          return 0;
        }
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILCALCOLOGIAIMPEGNATOEFF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage(v_SMS); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioEffettivo", "OkProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Proc
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AnnullaProc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Proc Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoliImportiBilancioEffettivo", "AnnullaProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // OUT
  // Primary record source for panel data
  // **********************************************************************
  private void CALIMPBILEFF_OUT12() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_OUT12_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_OUT15, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_OUT15, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_OUT12_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_OUT12_RS, 0, IMDBDef3.TBL_OUT15, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 0, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESE_DA_GEN, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 1, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESE_RIF, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 2, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ESERCIZIO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 3, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTAPUR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 4, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMPASTPU, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 5, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMCANVAR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 6, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMINSBIL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 7, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMRESPRE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 8, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMPAREPR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 9, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMTIREPR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 10, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMSTACAS, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 11, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMPASTCA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT12_RS, 12, 0, IMDBDef3.TBL_OUT15, IMDBDef3.FLD_OUT15_ROWNAMGIAIMP, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_OUT15, 0);
      if (IMDB.Eof(IMDBDef3.TBL_OUT15, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_OUT15, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_OUT12_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_OK)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OkProc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      AnnullaProc();
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, "C5378678-E08C-4C46-8874-B29948A5BAC0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, "Esercizio da calcolare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, 0, 120);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ESERCDACALCO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, "85B85B7D-7BC8-4C2A-87A3-290FC8F24D57");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, "Pluriennale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, 0, 63);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PLURIENNALE, 0 | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, "7BB7FCCA-C930-4D00-8654-9D752BB76732");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, "Esercizio Da Generare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "346AAAEA-8AFE-4828-B82F-C3A5CC72FDF8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "Esercizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, "D72DAF29-FFA0-483C-BEE7-EEEE5B4E80D5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, "Esercizio Riferimento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, "776169A2-C22F-41CE-936D-610E47243940");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, "Stanziamento Puro");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, "4C701D23-F33F-4F69-B32B-38329639F5D9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, "Stanziamento Puro da Assestato Esercizio Precedente");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, "4C232F6A-E905-478A-8DEE-AB3599CE9481");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, "Parte Stanz Puro");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, "49E6DE4D-1B52-473B-9121-C07308C33F42");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, "Cancella Variazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, "911FD605-A32D-48F9-A4C3-374A3651D21D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, "Inserimento Bilancio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, "30FC0608-4232-4FC8-8A8B-BE72F53362B1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, "Residui Presunti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, "A2B57B28-3D10-4F93-8A75-0AC726751DD5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, "Residui Presunti");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, "88BA5AC7-0290-44F5-A3F6-A10873E93855");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, "Parte Residui Presunti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, "4941E561-78A6-43DC-A84F-C5B453C05922");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, "Tipo Residui Presunti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, "37665CB2-99B3-4042-BC4F-F3BD17D23A35");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, "Stanziamento Cassa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, "38A1ECFE-B183-45CC-94FA-DFB981281025");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, "Stanziamento Cassa");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, "641F8022-13C2-49CE-8BD4-1FEC6C679059");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, "Parte Stanz Cassa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, "41EACF70-E004-49E2-9192-F4D8DB1F8939");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, "OK");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, "7D52AAD8-656B-4F69-939B-8D58B7B35CC2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, "Annulla");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, "B47F467E-0341-4CCC-B540-71206015A727");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, "Gia Impegnato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, "3F9D318C-23BD-4ADC-928A-B90898CEE856");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, "Già Impegnato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, "Gia Impegnato");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.VIS_VUONORALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_LIST, "Esercizio Da Generare");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_FORM, 48, 40, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_FORM, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCDAGENER, MyGlb.PANEL_FORM, "Esercizio Da Generare");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCDAGENER, -1, GRP_PARAMETRI_ESERCDACALCO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCDAGENER, PPQRY_OUT12, "A.ESE_DA_GEN", "ESE_DA_GEN", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 48, 96, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIO, -1, GRP_PARAMETRI_PLURIENNALE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIO, PPQRY_OUT12, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_LIST, "Eserc. Rifer.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_FORM, 192, 96, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIRIFERI, MyGlb.PANEL_FORM, "Esercizio Riferimento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIRIFERI, -1, GRP_PARAMETRI_PLURIENNALE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIRIFERI, PPQRY_OUT12, "A.ESE_RIF", "ESE_RIF", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_LIST, "Stanziamento Puro");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_FORM, 44, 24, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIAMPURO, MyGlb.PANEL_FORM, "Stanziamento Puro");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STANZIAMPURO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STANZIAMPURO, PPQRY_OUT12, "A.ROWNAMSTAPUR", "ROWNAMSTAPUR", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZIAMPURO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZIAMPURO, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.PANEL_LIST, 80, 132, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.PANEL_FORM, 68, 24, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANPURO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICSTANPURO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICSTANPURO, -1, "", "ETICSTANPURO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_LIST, "Parte Stanz Puro");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_FORM, 68, 48, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANPURO, MyGlb.PANEL_FORM, "Parte Stanz Puro");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTSTANPURO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTSTANPURO, PPQRY_OUT12, "A.ROWNAMPASTPU", "ROWNAMPASTPU", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTSTANPURO, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTSTANPURO, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, MyGlb.PANEL_LIST, "Cancella Variazioni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, MyGlb.PANEL_FORM, 64, 72, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CANCELVARIAZ, MyGlb.PANEL_FORM, "Cancella Variazioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CANCELVARIAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CANCELVARIAZ, PPQRY_OUT12, "A.ROWNAMCANVAR", "ROWNAMCANVAR", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CANCELVARIAZ, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CANCELVARIAZ, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, MyGlb.PANEL_LIST, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, MyGlb.PANEL_LIST, "Inserimento Bilancio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, MyGlb.PANEL_FORM, 220, 72, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INSERIBILANC, MyGlb.PANEL_FORM, "Inserimento Bilancio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INSERIBILANC, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INSERIBILANC, PPQRY_OUT12, "A.ROWNAMINSBIL", "ROWNAMINSBIL", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INSERIBILANC, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INSERIBILANC, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, "Residui Presunti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, 44, 100, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, "Residui Presunti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_RESIDUPRESUN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_RESIDUPRESUN, PPQRY_OUT12, "A.ROWNAMRESPRE", "ROWNAMRESPRE", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUPRESUN, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUPRESUN, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_LIST, 88, 140, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_FORM, 68, 100, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICRESIPRES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICRESIPRES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICRESIPRES, -1, "", "ETICRESIPRES", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_LIST, 136);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_LIST, "Parte Residui Presunti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_FORM, 68, 124, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_FORM, 136);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTRESIPRES, MyGlb.PANEL_FORM, "Parte Residui Presunti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTRESIPRES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTRESIPRES, PPQRY_OUT12, "A.ROWNAMPAREPR", "ROWNAMPAREPR", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTRESIPRES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTRESIPRES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_LIST, "Tipo Residui Presunti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_FORM, 68, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPORESIPRES, MyGlb.PANEL_FORM, "Tipo Residui Presunti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPORESIPRES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPORESIPRES, PPQRY_OUT12, "A.ROWNAMTIREPR", "ROWNAMTIREPR", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPORESIPRES, (new IDVariant(1)), "Residui al 31/12", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPORESIPRES, (new IDVariant(2)), "Residui Attuali", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_LIST, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_LIST, "Stanziamento Cassa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_FORM, 44, 176, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STANZIACASSA, MyGlb.PANEL_FORM, "Stanziamento Cassa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STANZIACASSA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STANZIACASSA, PPQRY_OUT12, "A.ROWNAMSTACAS", "ROWNAMSTACAS", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZIACASSA, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STANZIACASSA, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_LIST, 96, 148, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_FORM, 68, 176, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSTANCASS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICSTANCASS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICSTANCASS, -1, "", "ETICSTANCASS", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_LIST, "Parte Stanz Cassa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_FORM, 68, 200, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTSTANCASS, MyGlb.PANEL_FORM, "Parte Stanz Cassa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTSTANCASS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTSTANCASS, PPQRY_OUT12, "A.ROWNAMPASTCA", "ROWNAMPASTCA", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTSTANCASS, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTSTANCASS, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_LIST, 184, 260, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_FORM, 204, 280, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_OK, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_LIST, 192, 268, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_FORM, 292, 280, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNULLA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_LIST, "Gia Impegnato");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_FORM, 44, 232, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GIAIMPEGNATO, MyGlb.PANEL_FORM, "Gia Impegnato");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_GIAIMPEGNATO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_GIAIMPEGNATO, PPQRY_OUT12, "A.ROWNAMGIAIMP", "ROWNAMGIAIMP", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_GIAIMPEGNATO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_GIAIMPEGNATO, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_LIST, 104, 156, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_FORM, 68, 232, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHGIAIMPE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHGIAIMPE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHGIAIMPE, -1, "", "ETICHGIAIMPE", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'PE' as NUOVAESPRESS, ");
    SQL.append("  1 as ORDINAMENTO, ");
    SQL.append("  DECODE('PE', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') || ' (' || TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) || ')' as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (~~ESE_DA_GEN~~ = 'PE') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'EP', ");
    SQL.append("  2, ");
    SQL.append("  DECODE('EP', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ESE_DA_GEN~~ = 'EP') ");
    SQL.append("order by 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_DUAL, 0, SQL, PFL_PARAMETRI_ESERCDAGENER, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'PE' as NUOVAESPRESS, ");
    SQL.append("  1 as ORDINAMENTO, ");
    SQL.append("  DECODE('PE', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') || ' (' || TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) || ')' as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  'EP', ");
    SQL.append("  2, ");
    SQL.append("  DECODE('EP', 'PE', 'Primo Esercizio', 'EP', 'Esercizio Pluriennale', 'TP', 'Tutti i Pluriennali') ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_DUAL, 1, SQL, PFL_PARAMETRI_ESERCDAGENER, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_OUT12", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_OUT12, IMDBDef11.PQRY_OUT12_RS, IMDBDef3.TBL_OUT15);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCDAGENER, IMDBDef3.FLD_OUT15_ESE_DA_GEN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIO, IMDBDef3.FLD_OUT15_ESERCIZIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIRIFERI, IMDBDef3.FLD_OUT15_ESE_RIF);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_STANZIAMPURO, IMDBDef3.FLD_OUT15_ROWNAMSTAPUR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARTSTANPURO, IMDBDef3.FLD_OUT15_ROWNAMPASTPU);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CANCELVARIAZ, IMDBDef3.FLD_OUT15_ROWNAMCANVAR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_INSERIBILANC, IMDBDef3.FLD_OUT15_ROWNAMINSBIL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_RESIDUPRESUN, IMDBDef3.FLD_OUT15_ROWNAMRESPRE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARTRESIPRES, IMDBDef3.FLD_OUT15_ROWNAMPAREPR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPORESIPRES, IMDBDef3.FLD_OUT15_ROWNAMTIREPR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_STANZIACASSA, IMDBDef3.FLD_OUT15_ROWNAMSTACAS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARTSTANCASS, IMDBDef3.FLD_OUT15_ROWNAMPASTCA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_GIAIMPEGNATO, IMDBDef3.FLD_OUT15_ROWNAMGIAIMP);
    PAN_PARAMETRI.SetMasterTable(0, "OUT15");
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
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "20C73A2E-801D-4D60-9AA1-9DD442B9E984");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "MODULO");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "76C52583-4227-4F66-A669-5B3E74BAEF3F");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "AA99E28E-6A84-4B3A-905F-758C0F616759");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "FUNZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "85CC7345-3024-4153-962B-C3C85FEA1438");
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
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_MODULO, PPQRY_NOTEFUNZION7, "A.MODULO", "MODULO", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_PAGINA, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_PAGINA, PPQRY_NOTEFUNZION7, "A.PAGINA", "PAGINA", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_FUNZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_FUNZIONE, PPQRY_NOTEFUNZION7, "A.FUNZIONE", "FUNZIONE", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 12, 16, 440, 384, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 29);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_DESCRIZIONE, PPQRY_NOTEFUNZION7, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -13997);
  }

  private void PAN_NOTEFUNZIONA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONA.SetIMDB(IMDB, "PQRY_NOTEFUNZION7", true);
    PAN_NOTEFUNZIONA.set_SetString(MyGlb.MASTER_ROWNAME, "NOTE FUNZIONALITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_CALIMPBILEFF,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = ~~TBL_OUT15.ROWNAMEFUNZI~~) ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION7, 5, SQL, -1, "");
    PAN_NOTEFUNZIONA.SetQueryDB(PPQRY_NOTEFUNZION7, MainFrm.Cf4armDBObject.DB, 4);
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
