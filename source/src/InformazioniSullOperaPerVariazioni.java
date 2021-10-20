// **********************************************
// Informazioni Sull Opera Per Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioniSullOperaPerVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRO_ESERCIZIO = 0;

  private static int PPQRY_FILTRO32 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_FILTRO;
  private static int PFL_INFOSULLOPER_DESCRIZOPERA = 0;
  private static int PFL_INFOSULLOPER_PREVISINIZI1 = 1;
  private static int PFL_INFOSULLOPER_VARIAZIONI1 = 2;
  private static int PFL_INFOSULLOPER_PREVISATTUA1 = 3;
  private static int PFL_INFOSULLOPER_ACCERTCOMPET = 4;
  private static int PFL_INFOSULLOPER_DISPONIBILI1 = 5;
  private static int PFL_INFOSULLOPER_VARIAZPROVV1 = 6;
  private static int PFL_INFOSULLOPER_PREVISINIZIA = 7;
  private static int PFL_INFOSULLOPER_VARIAZIONI = 8;
  private static int PFL_INFOSULLOPER_PREVISATTUAL = 9;
  private static int PFL_INFOSULLOPER_IMPEGNCOMPET = 10;
  private static int PFL_INFOSULLOPER_DISPONIBILIT = 11;
  private static int PFL_INFOSULLOPER_VARIAZPROVVI = 12;
  private static int PFL_INFOSULLOPER_LABELENTRATA = 13;
  private static int PFL_INFOSULLOPER_LABELSPESA = 14;
  private static int PFL_INFOSULLOPER_APRPREINENOP = 15;
  private static int PFL_INFOSULLOPER_APRELEVAENOP = 16;
  private static int PFL_INFOSULLOPER_APRPREINSPOP = 17;
  private static int PFL_INFOSULLOPER_APRACCDICOOP = 18;
  private static int PFL_INFOSULLOPER_APRVARPRENOP = 19;
  private static int PFL_INFOSULLOPER_APRELEVASPOP = 20;
  private static int PFL_INFOSULLOPER_APRIMPDICOOP = 21;
  private static int PFL_INFOSULLOPER_APRVARPRSPOP = 22;
  private static int PFL_INFOSULLOPER_OPERA = 23;
  private static int PFL_INFOSULLOPER_VARIAZPROPO1 = 24;
  private static int PFL_INFOSULLOPER_VARIAZPROPO2 = 25;
  private static int PFL_INFOSULLOPER_VARIAZPROPO3 = 26;
  private static int PFL_INFOSULLOPER_DISPONPROVV1 = 27;
  private static int PFL_INFOSULLOPER_DISPONPROVVI = 28;
  private static int PFL_INFOSULLOPER_VARIAZPROPO4 = 29;
  private static int PFL_INFOSULLOPER_VARIAZPROPO5 = 30;
  private static int PFL_INFOSULLOPER_VARIAZPROPOS = 31;
  private static int PFL_INFOSULLOPER_DISPOCONPRO1 = 32;
  private static int PFL_INFOSULLOPER_DISPOCONPRO2 = 33;
  private static int PFL_INFOSULLOPER_DISPOCONPRO3 = 34;
  private static int PFL_INFOSULLOPER_DISPOCONPRO4 = 35;
  private static int PFL_INFOSULLOPER_DISPOCONPRO5 = 36;
  private static int PFL_INFOSULLOPER_DISPOCONPROP = 37;

  private static int PPQRY_VISTATOTOPE1 = 0;


  IDPanel PAN_INFOSULLOPER;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI126(IMDB);
    Init_TBL_FILTRO33(IMDB);
    //
    //
    Init_PQRY_VISTATOTOPE1(IMDB);
    Init_PQRY_FILTRO32(IMDB);
    Init_PQRY_FILTRO32_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI126(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI126, 2);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI126, "TBL_PARAMETRI126");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI126,IMDBDef4.FLD_PARAMETRI126_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI126,IMDBDef4.FLD_PARAMETRI126_PARAMOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI126,IMDBDef4.FLD_PARAMETRI126_PARADESCOPER, "PARADESCOPER");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI126,IMDBDef4.FLD_PARAMETRI126_PARADESCOPER,5,60,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI126, 0);
  }

  private static void Init_TBL_FILTRO33(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_FILTRO33, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_FILTRO33, "TBL_FILTRO33");
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRO33,IMDBDef4.FLD_FILTRO33_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRO33,IMDBDef4.FLD_FILTRO33_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_FILTRO33, 0);
  }

  private static void Init_PQRY_VISTATOTOPE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VISTATOTOPE1, 29);
    IMDB.set_TblCode(IMDBDef12.PQRY_VISTATOTOPE1, "PQRY_VISTATOTOPE1");
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PREVISIONE_INI_E, "PREVISIONE_INI_E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PREVISIONE_INI_E,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VARIAZIONI_E, "VARIAZIONI_E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VARIAZIONI_E,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PREVISIONE_ATT_E, "PREVISIONE_ATT_E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PREVISIONE_ATT_E,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_ACCERTATO_COMP, "ACCERTATO_COMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_ACCERTATO_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_DISPONIBILITA_E, "DISPONIBILITA_E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_DISPONIBILITA_E,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VARCOMPRO_E, "VARCOMPRO_E");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VARCOMPRO_E,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PREVISIONE_INI_S, "PREVISIONE_INI_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PREVISIONE_INI_S,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VARIAZIONI_S, "VARIAZIONI_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VARIAZIONI_S,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PREVISIONE_ATT_S, "PREVISIONE_ATT_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PREVISIONE_ATT_S,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_IMPEGNATO_COMP, "IMPEGNATO_COMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_IMPEGNATO_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_DISPONIBILITA_S, "DISPONIBILITA_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_DISPONIBILITA_S,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VARCOMPRO_S, "VARCOMPRO_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VARCOMPRO_S,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VISTOTOPDEOP, "VISTOTOPDEOP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VISTOTOPDEOP,5,302,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VISTOTOPDIPR, "VISTOTOPDIPR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VISTOTOPDIPR,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VISTOOPDIPR1, "VISTOOPDIPR1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VISTOOPDIPR1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PROPOSTE_E_1, "PROPOSTE_E_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PROPOSTE_E_1,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PROPOSTE_E_2, "PROPOSTE_E_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PROPOSTE_E_2,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PROPOSTE_E_3, "PROPOSTE_E_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PROPOSTE_E_3,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PROPOSTE_S_1, "PROPOSTE_S_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PROPOSTE_S_1,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PROPOSTE_S_2, "PROPOSTE_S_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PROPOSTE_S_2,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PROPOSTE_S_3, "PROPOSTE_S_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_PROPOSTE_S_3,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VITOOPDICOPR, "VITOOPDICOPR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VITOOPDICOPR,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VITOOPDICOP1, "VITOOPDICOP1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VITOOPDICOP1,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VITOOPDICOP2, "VITOOPDICOP2");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VITOOPDICOP2,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VITOOPDICOP3, "VITOOPDICOP3");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VITOOPDICOP3,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VITOOPDICOP4, "VITOOPDICOP4");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VITOOPDICOP4,2,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VITOOPDICOP5, "VITOOPDICOP5");
    IMDB.SetFldParams(IMDBDef12.PQRY_VISTATOTOPE1,IMDBDef12.PQSL_VISTATOTOPE1_VITOOPDICOP5,2,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VISTATOTOPE1, 0);
  }

  private static void Init_PQRY_FILTRO32(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_FILTRO32, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_FILTRO32, "PQRY_FILTRO32");
    IMDB.set_FldCode(IMDBDef12.PQRY_FILTRO32,IMDBDef12.PQSL_FILTRO32_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_FILTRO32,IMDBDef12.PQSL_FILTRO32_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_FILTRO32, 0);
  }

  private static void Init_PQRY_FILTRO32_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_FILTRO32_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_FILTRO32_RS, "PQRY_FILTRO32_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_FILTRO32_RS,IMDBDef12.PQSL_FILTRO32_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef12.PQRY_FILTRO32_RS,IMDBDef12.PQSL_FILTRO32_ROWNAMEESERC,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioniSullOperaPerVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioniSullOperaPerVariazioni()
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
    FormIdx = MyGlb.FRM_INFSULOPPEVA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EB8A2437-23C3-47F0-8882-FC03BC58B7F7";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 572;
    DesignHeight = 462;
    set_Caption(new IDVariant("Informazioni Sull Opera Per Variazioni"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 572;
    Frames[1].Height = 436;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.12844;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 572;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    PAN_FILTRO = new IDPanel(w, this, 2, "PAN_FILTRO");
    Frames[2].Content = PAN_FILTRO;
    PAN_FILTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRO.VS = MainFrm.VisualStyleList;
    PAN_FILTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 572-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D00A9549-A7EA-488B-BABC-EBF7857DE79D");
    PAN_FILTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRO.InitStatus = 2;
    PAN_FILTRO_Init();
    PAN_FILTRO_InitFields();
    PAN_FILTRO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 572;
    Frames[3].Height = 380;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Informazioni Sull Opera";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 380;
    PAN_INFOSULLOPER = new IDPanel(w, this, 3, "PAN_INFOSULLOPER");
    Frames[3].Content = PAN_INFOSULLOPER;
    PAN_INFOSULLOPER.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_INFOSULLOPER.VS = MainFrm.VisualStyleList;
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 572-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1E33905B-0D1C-43E3-924C-F85FAD4E70D6");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3008, 268, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_INFOSULLOPER.InitStatus = 1;
    PAN_INFOSULLOPER_Init();
    PAN_INFOSULLOPER_InitFields();
    PAN_INFOSULLOPER_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_FILTRO33, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFSULOPPEVA_FILTRO32();
      }
      PAN_INFOSULLOPER.UpdatePanel(MainFrm);
      PAN_FILTRO.UpdatePanel(MainFrm);
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
    return (obj instanceof InformazioniSullOperaPerVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioniSullOperaPerVariazioni.class.getName() : (Glb.ClassWithPackage(InformazioniSullOperaPerVariazioni.class) ? InformazioniSullOperaPerVariazioni.class.getName().substring(InformazioniSullOperaPerVariazioni.class.getPackage().getName().length() + 1) : InformazioniSullOperaPerVariazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Informazioni Sull Opera On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_INFOSULLOPER_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_INFOSULLOPER);
      // 
      // Informazioni Sull Opera On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_FILTRO32, IMDBDef12.PQSL_FILTRO32_ROWNAMEESERC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_FILTRO32, IMDBDef12.PQSL_FILTRO32_ROWNAMEESERC, 0).equals(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))), true))
      {
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_FILTRO32, IMDBDef12.PQSL_FILTRO32_ROWNAMEESERC, 0).equals(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))), true))
      {
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_INFOSULLOPER.SetFlags (Glb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "InformazioniSullOperaOnDynamicPropertiesEvent", _e);
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

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Informazioni sull'Opera", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef4.TBL_FILTRO33, IMDBDef4.FLD_FILTRO33_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Previsione Iniziale Entrata
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPrevisioneInizialeEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Previsione Iniziale Entrata Body
      // Procedure Body
      // 
      // IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMTIPO, 0, (new IDVariant("Entrata")));
      MainFrm.UnloadForm(MyGlb.FRM_PREVINIZOPER,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PREVINIZOPER, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriPrevisioneInizialeEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Previsione Iniziale Spesa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPrevisioneInizialeSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Previsione Iniziale Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMTIPO, 0, (new IDVariant("Spesa")));
      MainFrm.UnloadForm(MyGlb.FRM_PREVINIZOPER,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PREVINIZOPER, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriPrevisioneInizialeSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Variazioni Entrata
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriElencoVariazioniEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Variazioni Entrata Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMTIPO, 0, (new IDVariant("Entrata")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIAZIOPERA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIAZIOPERA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriElencoVariazioniEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Variazioni Spesa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriElencoVariazioniSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Variazioni Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMTIPO, 0, (new IDVariant("Spesa")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIAZIOPERA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIAZIOPERA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriElencoVariazioniSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Accertamenti Di Competenza
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriAccertamentiDiCompetenza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Accertamenti Di Competenza Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI24, IMDBDef1.FLD_PARAMETRI24_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ACCEDICOMOPE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ACCEDICOMOPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriAccertamentiDiCompetenza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Impegni Di Competenza Opera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriImpegniDiCompetenzaOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Impegni Di Competenza Opera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMFINANZI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMTIPO, 0, (new IDVariant("Opera")));
      MainFrm.UnloadForm(MyGlb.FRM_IMPEGDICOMPE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_IMPEGDICOMPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriImpegniDiCompetenzaOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazioni Provvisorie Entrata
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriVariazioniProvvisorieEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazioni Provvisorie Entrata Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMTIPO, 0, (new IDVariant("Entrata")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIPROVOPER,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIPROVOPER, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriVariazioniProvvisorieEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazione Provvisoria Spesa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriVariazioneProvvisoriaSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazione Provvisoria Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMTIPO, 0, (new IDVariant("Spesa")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIPROVOPER,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIPROVOPER, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriVariazioneProvvisoriaSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Accertamenti a Residuo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriAccertamentiaResiduo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Accertamenti a Residuo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI28, IMDBDef1.FLD_PARAMETRI28_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ACCEARESIOPE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ACCEARESIOPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriAccertamentiaResiduo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Impegni a Residuo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriImpegniaResiduo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Impegni a Residuo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMFINANZI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMTIPO, 0, (new IDVariant("Opera")));
      MainFrm.UnloadForm(MyGlb.FRM_IMPEGNARESID,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_IMPEGNARESID, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriImpegniaResiduo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Sub Impegni Opera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriSubImpegniOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Sub Impegni Opera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI30, IMDBDef1.FLD_PARAMETRI30_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_SUBIMPEGOPER, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriSubImpegniOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Liquidazioni Opera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriLiquidazioniOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Liquidazioni Opera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI31, IMDBDef1.FLD_PARAMETRI31_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_LIQUIDAOPERA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriLiquidazioniOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi di Competenza
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinatividiCompetenza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi di Competenza Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI32, IMDBDef1.FLD_PARAMETRI32_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_ORDIDICOMOPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriOrdinatividiCompetenza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi a Residuo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinativiaResiduo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi a Residuo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI34, IMDBDef1.FLD_PARAMETRI34_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_ORDIARESIOPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriOrdinativiaResiduo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati di Competenza
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatidiCompetenza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati di Competenza Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI36, IMDBDef1.FLD_PARAMETRI36_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_MANDDICOMOPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriMandatidiCompetenza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati a Residuo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatiaResiduo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati a Residuo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI37, IMDBDef1.FLD_PARAMETRI37_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_VISTATOTOPE1, IMDBDef12.PQSL_VISTATOTOPE1_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_MANDARESIOPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "ApriMandatiaResiduo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtro On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_FILTRO_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_FILTRO, Cancel);
      // 
      // Filtro On Validate Row Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_FILTRO32, IMDBDef12.PQSL_FILTRO32_ROWNAMEESERC, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_FILTRO32, IMDBDef12.PQSL_FILTRO32_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef4.TBL_FILTRO33, IMDBDef4.FLD_FILTRO33_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOperaPerVariazioni", "FiltroOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Filtro
  // Primary record source for panel data
  // **********************************************************************
  private void INFSULOPPEVA_FILTRO32() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_FILTRO32_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_FILTRO33, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_FILTRO33, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_FILTRO32_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_FILTRO32_RS, 0, IMDBDef4.TBL_FILTRO33, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_FILTRO32_RS, 0, 0, IMDBDef4.TBL_FILTRO33, IMDBDef4.FLD_FILTRO33_ROWNAMEESERC, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_FILTRO33, 0);
      if (IMDB.Eof(IMDBDef4.TBL_FILTRO33, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_FILTRO33, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_FILTRO32_RS, 0);
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
  private void PAN_FILTRO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FILTRO);
    // Stub
  }

  private void PAN_FILTRO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTRO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_INFOSULLOPER_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_INFOSULLOPER, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_INFOSULLOPER_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_INFOSULLOPER, Cancel);
    // Stub
  }

  private void PAN_INFOSULLOPER_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRPREINENOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPrevisioneInizialeEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRELEVAENOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriElencoVariazioniEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRPREINSPOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPrevisioneInizialeSpesa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRACCDICOOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriAccertamentiDiCompetenza();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRVARPRENOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioniProvvisorieEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRELEVASPOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriElencoVariazioniSpesa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRIMPDICOOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriImpegniDiCompetenzaOpera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRVARPRSPOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioneProvvisoriaSpesa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_INFOSULLOPER_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_INFOSULLOPER_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_INFOSULLOPER_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_INFOSULLOPER_Init()
  {

    PAN_INFOSULLOPER.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_INFOSULLOPER.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_INFOSULLOPER.SetSize(MyGlb.OBJ_FIELD, 38);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, "08D125AE-7379-4F0B-8726-4D43FEF38EFE");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, "Descrizione Opera ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.VIS_VUOTOGRASSET);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, "73CE92A4-0377-4F7B-B2EA-77D80DB6FC32");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, "Previsione Iniziale");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, "491219CC-9BAB-4F67-9251-DF85FA6C1D62");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, "Variazioni");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, "DE6281FF-FE0C-4FC8-B17B-4AAB62E22C8B");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, "Previsione Attuale");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, "131304FC-D7F9-4A1F-BB3F-F65BA78DA751");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, "Accertato Competenza");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, "17F0A608-4007-4DE9-9CA4-279DFEBCEEB4");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, "Disponibilità");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, "90A5FDC5-DF03-4402-B16C-EE96D42DD5FF");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, "Variazioni Provvisorie");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, "173559A8-0C8F-4CDE-8E99-C2C4C9A8DB9D");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, "Previsione Iniziale ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, "202AC322-CF3A-4422-A29F-866C59C536C7");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, "Variazioni ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, "01BE33DF-1DB7-4960-A43B-06754D8C0116");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, "Previsione Attuale ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, "EE435729-F6DA-49C2-8B43-3F387D49E046");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, "Impegnato Competenza");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, "1D0BF2D2-A256-4F7A-9028-A9EFABA3BCB8");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, "Disponibilità ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, "EB551A5C-2F11-447A-9C90-BE56D279D4A7");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, "Variazioni Provvisorie ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, "8CFA7456-9B5D-4D88-897E-24D1B0E39561");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, "Entrata");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.VIS_VUOTOGRASSET);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, "ED46A590-20E7-4ABF-B646-47E533DB879F");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, "Spesa");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.VIS_VUOTOGRASSET);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, "583F4631-03CA-417D-8BA2-FEFEE4692784");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, "7EB5930D-A49F-461C-AF07-3F74583FAE0C");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, "2B75728A-CBA4-40EF-BA62-3CE22C8EF128");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, "AF5EE882-D43D-40AC-9CC8-907074992D30");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, "8090E13F-1366-4109-8666-99FA8717BA58");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, "B63CFAE2-15A0-4E2F-A8D1-1AD869F4F380");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, "569477FF-918B-4043-B342-CCC03E61A3DC");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, "B60793D1-CE3E-40D5-9E95-686A5476505F");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, "42CA99E7-C4F9-4445-8796-96EF0FC42952");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, "OPERA");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.VIS_NONNULLAFIEL);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, 0, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, "FB18B4AF-731C-4F73-B492-53157CD9F9E4");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, "Variazioni Proposte");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, "73A4CB01-26DC-484A-B168-C04B6D8387DF");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, "Variazioni Proposte ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, "9105E50C-01FF-48B4-A40C-78075CDE521A");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, "Variazioni Proposte  ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, "80428849-FF33-45D2-AA91-3E545D98A4CC");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, "Disponibilità Provvisoria");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, "C6AC8A14-8332-47FD-905D-FEB1C06F393B");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, "Disponibilità Provvisoria ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, "C9863124-99BB-4E92-873A-C8785575288E");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, "Variazioni Proposte    ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, "CE7910E5-789F-4753-AED3-62DBBCCE975E");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, "Variazioni Proposte     ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, "D0A2AFC0-301A-484A-A379-DC53194D24C2");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, "Variazioni Proposte      ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, "C56352F9-4250-4E88-ADBF-4616D7C8764D");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, "Disponibilità Con Proposte");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, "AEBAF933-6CA6-44EE-8420-551D347043A6");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, "Disponibilità Con Proposte ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, "2800498F-A466-4B50-B099-C8B1DC3FBE76");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, "Disponibilità Con Proposte  ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, "BACF78B2-CC98-4569-99BC-E78B172DF9E7");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, "Disponibilità Con Proposte    ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, "9EDF04E0-B148-4239-9198-6EE33D088456");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, "Disponibilità Con Proposte     ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, "358C7A29-D264-4F24-B616-7F5E8F2044D6");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, "Disponibilità Con Proposte      ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_INFOSULLOPER_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_LIST, 96);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_LIST, 3);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_LIST, "Descrizione Opera ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_FORM, 20, 12, 532, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_FORM, 96);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_FORM, "Descr. Opera");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DESCRIZOPERA, -1, -1);
    PAN_INFOSULLOPER.SetFieldUnbound(PFL_INFOSULLOPER_DESCRIZOPERA, true);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DESCRIZOPERA, PPQRY_VISTATOTOPE1, "TO_CHAR ( A.OPERA ) || ' - ' || A.DES_OPERA", "VISTOTOPDEOP", 5, 302, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_LIST, 96);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_LIST, "Previsione Iniziale");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_FORM, 32, 72, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_FORM, 128);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_FORM, "Previsione Iniziale");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_PREVISINIZI1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_PREVISINIZI1, PPQRY_VISTATOTOPE1, "A.PREVISIONE_INI_E", "PREVISIONE_INI_E", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_LIST, 80);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_LIST, "Variazioni");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_FORM, 72, 96, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_FORM, 88);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_FORM, "Variazioni");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZIONI1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZIONI1, PPQRY_VISTATOTOPE1, "A.VARIAZIONI_E", "VARIAZIONI_E", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_LIST, 100);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_LIST, "Previsione Attuale");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_FORM, 32, 120, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_FORM, 128);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_FORM, "Previsione Attuale");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_PREVISATTUA1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_PREVISATTUA1, PPQRY_VISTATOTOPE1, "A.PREVISIONE_ATT_E", "PREVISIONE_ATT_E", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_LIST, 104);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_LIST, "Accer. Compet.");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_FORM, 8, 144, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_FORM, 152);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_FORM, "Accertato Competenza");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_ACCERTCOMPET, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_ACCERTCOMPET, PPQRY_VISTATOTOPE1, "A.ACCERTATO_COMP", "ACCERTATO_COMP", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_LIST, 92);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_FORM, 60, 168, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_FORM, 100);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DISPONIBILI1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DISPONIBILI1, PPQRY_VISTATOTOPE1, "A.DISPONIBILITA_E", "DISPONIBILITA_E", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_LIST, 84);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_LIST, "Variazioni Provvisorie");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_FORM, 16, 192, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_FORM, 144);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_FORM, "Variazioni Provvisorie");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZPROVV1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZPROVV1, PPQRY_VISTATOTOPE1, "A.VARCOMPRO_E", "VARCOMPRO_E", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_LIST, 96);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_LIST, "Previsione Iniziale ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_FORM, 300, 72, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_FORM, 128);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_FORM, "Previsione Iniziale ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_PREVISINIZIA, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_PREVISINIZIA, PPQRY_VISTATOTOPE1, "A.PREVISIONE_INI_S", "PREVISIONE_INI_S", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_LIST, 80);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_FORM, 348, 96, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_FORM, 80);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZIONI, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZIONI, PPQRY_VISTATOTOPE1, "A.VARIAZIONI_S", "VARIAZIONI_S", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_LIST, 100);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_LIST, "Previsione Attuale ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_FORM, 300, 120, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_FORM, 128);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_FORM, "Previsione Attuale ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_PREVISATTUAL, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_PREVISATTUAL, PPQRY_VISTATOTOPE1, "A.PREVISIONE_ATT_S", "PREVISIONE_ATT_S", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_LIST, 100);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_LIST, "Impeg. Compet.");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_FORM, 272, 144, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_FORM, 156);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_FORM, "Impegnato Competenza");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_IMPEGNCOMPET, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_IMPEGNCOMPET, PPQRY_VISTATOTOPE1, "A.IMPEGNATO_COMP", "IMPEGNATO_COMP", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_LIST, 92);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_FORM, 332, 168, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_FORM, 96);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DISPONIBILIT, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DISPONIBILIT, PPQRY_VISTATOTOPE1, "A.DISPONIBILITA_S", "DISPONIBILITA_S", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_LIST, 84);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_LIST, "Variaz. Provv.");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_FORM, 284, 192, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_FORM, 144);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_FORM, "Variazioni Provvisorie ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZPROVVI, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZPROVVI, PPQRY_VISTATOTOPE1, "A.VARCOMPRO_S", "VARCOMPRO_S", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.PANEL_LIST, 76, 12, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.PANEL_FORM, 164, 48, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_LABELENTRATA, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_LABELENTRATA, -1, "", "LABELENTRATA", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.PANEL_LIST, 84, 20, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.PANEL_FORM, 436, 48, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_LABELSPESA, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_LABELSPESA, -1, "", "LABELSPESA", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.PANEL_LIST, 228, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.PANEL_FORM, 260, 76, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRPREINENOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRPREINENOP, -1, "", "APRPREINENOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.PANEL_LIST, 236, 44, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.PANEL_FORM, 260, 100, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRELEVAENOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRELEVAENOP, -1, "", "APRELEVAENOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.PANEL_LIST, 244, 52, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.PANEL_FORM, 528, 76, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRPREINSPOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRPREINSPOP, -1, "", "APRPREINSPOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.PANEL_LIST, 252, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.PANEL_FORM, 260, 148, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRACCDICOOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRACCDICOOP, -1, "", "APRACCDICOOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.PANEL_LIST, 260, 68, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.PANEL_FORM, 260, 196, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRVARPRENOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRVARPRENOP, -1, "", "APRVARPRENOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.PANEL_LIST, 252, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.PANEL_FORM, 528, 100, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRELEVASPOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRELEVASPOP, -1, "", "APRELEVASPOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.PANEL_LIST, 260, 68, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.PANEL_FORM, 528, 148, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRIMPDICOOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRIMPDICOOP, -1, "", "APRIMPDICOOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.PANEL_LIST, 268, 76, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.PANEL_FORM, 528, 196, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRVARPRSPOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRVARPRSPOP, -1, "", "APRVARPRSPOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_LIST, "OPERA");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_FORM, 4, 324, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_FORM, 44);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_FORM, "OPERA");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_OPERA, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_OPERA, PPQRY_VISTATOTOPE1, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, MyGlb.PANEL_LIST, 80);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, MyGlb.PANEL_LIST, "Variazioni Proposte");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, MyGlb.PANEL_FORM, 28, 240, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, MyGlb.PANEL_FORM, 132);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO1, MyGlb.PANEL_FORM, "Variazioni Proposte");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZPROPO1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZPROPO1, PPQRY_VISTATOTOPE1, "A.PROPOSTE_E_1", "PROPOSTE_E_1", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, MyGlb.PANEL_LIST, 80);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, MyGlb.PANEL_LIST, "Variazioni Proposte ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, MyGlb.PANEL_FORM, 28, 240, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, MyGlb.PANEL_FORM, 132);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO2, MyGlb.PANEL_FORM, "Variazioni Proposte ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZPROPO2, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZPROPO2, PPQRY_VISTATOTOPE1, "A.PROPOSTE_E_2", "PROPOSTE_E_2", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, MyGlb.PANEL_LIST, 80);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, MyGlb.PANEL_LIST, "Variazioni Proposte  ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, MyGlb.PANEL_FORM, 28, 240, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, MyGlb.PANEL_FORM, 132);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO3, MyGlb.PANEL_FORM, "Variazioni Proposte  ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZPROPO3, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZPROPO3, PPQRY_VISTATOTOPE1, "A.PROPOSTE_E_3", "PROPOSTE_E_3", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, MyGlb.PANEL_LIST, 132);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, MyGlb.PANEL_LIST, "Disponibilità Provvisoria");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, MyGlb.PANEL_FORM, 8, 216, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, MyGlb.PANEL_FORM, 152);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVV1, MyGlb.PANEL_FORM, "Disponibilità Provvisoria");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DISPONPROVV1, -1, -1);
    PAN_INFOSULLOPER.SetFieldUnbound(PFL_INFOSULLOPER_DISPONPROVV1, true);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DISPONPROVV1, PPQRY_VISTATOTOPE1, "A.DISPONIBILITA_E + A.VARCOMPRO_E", "VISTOTOPDIPR", 2, 19, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, MyGlb.PANEL_LIST, 132);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, MyGlb.PANEL_LIST, "Disponibilità Provvisoria ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, MyGlb.PANEL_FORM, 276, 216, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, MyGlb.PANEL_FORM, 152);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONPROVVI, MyGlb.PANEL_FORM, "Disponibilità Provvisoria ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DISPONPROVVI, -1, -1);
    PAN_INFOSULLOPER.SetFieldUnbound(PFL_INFOSULLOPER_DISPONPROVVI, true);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DISPONPROVVI, PPQRY_VISTATOTOPE1, "A.DISPONIBILITA_S + A.VARCOMPRO_S", "VISTOOPDIPR1", 2, 19, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, MyGlb.PANEL_LIST, 80);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, MyGlb.PANEL_LIST, "Variazioni Proposte    ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, MyGlb.PANEL_FORM, 288, 240, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, MyGlb.PANEL_FORM, 140);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO4, MyGlb.PANEL_FORM, "Variazioni Proposte    ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZPROPO4, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZPROPO4, PPQRY_VISTATOTOPE1, "A.PROPOSTE_S_1", "PROPOSTE_S_1", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, MyGlb.PANEL_LIST, 80);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, MyGlb.PANEL_LIST, "Variazioni Proposte     ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, MyGlb.PANEL_FORM, 288, 240, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, MyGlb.PANEL_FORM, 140);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPO5, MyGlb.PANEL_FORM, "Variazioni Proposte     ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZPROPO5, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZPROPO5, PPQRY_VISTATOTOPE1, "A.PROPOSTE_S_2", "PROPOSTE_S_2", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, MyGlb.PANEL_LIST, 80);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, MyGlb.PANEL_LIST, "Variazioni Proposte      ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, MyGlb.PANEL_FORM, 288, 240, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, MyGlb.PANEL_FORM, 140);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROPOS, MyGlb.PANEL_FORM, "Variazioni Proposte      ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZPROPOS, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZPROPOS, PPQRY_VISTATOTOPE1, "A.PROPOSTE_S_3", "PROPOSTE_S_3", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, MyGlb.PANEL_LIST, 132);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, MyGlb.PANEL_LIST, "Disponibilità Con Proposte");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, MyGlb.PANEL_FORM, -4, 264, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, MyGlb.PANEL_FORM, 164);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO1, MyGlb.PANEL_FORM, "Disponibilità Con Proposte");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DISPOCONPRO1, -1, -1);
    PAN_INFOSULLOPER.SetFieldUnbound(PFL_INFOSULLOPER_DISPOCONPRO1, true);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DISPOCONPRO1, PPQRY_VISTATOTOPE1, "A.DISPONIBILITA_E + A.VARCOMPRO_E + A.PROPOSTE_E_1", "VITOOPDICOPR", 2, 19, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, MyGlb.PANEL_LIST, 144);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, MyGlb.PANEL_LIST, "Disponibilità Con Proposte ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, MyGlb.PANEL_FORM, -4, 264, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, MyGlb.PANEL_FORM, 164);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO2, MyGlb.PANEL_FORM, "Disponibilità Con Proposte ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DISPOCONPRO2, -1, -1);
    PAN_INFOSULLOPER.SetFieldUnbound(PFL_INFOSULLOPER_DISPOCONPRO2, true);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DISPOCONPRO2, PPQRY_VISTATOTOPE1, "A.DISPONIBILITA_E + A.VARCOMPRO_E + A.PROPOSTE_E_2", "VITOOPDICOP1", 2, 19, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, MyGlb.PANEL_LIST, 144);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, MyGlb.PANEL_LIST, "Disponibilità Con Proposte  ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, MyGlb.PANEL_FORM, -4, 264, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, MyGlb.PANEL_FORM, 164);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO3, MyGlb.PANEL_FORM, "Disponibilità Con Proposte  ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DISPOCONPRO3, -1, -1);
    PAN_INFOSULLOPER.SetFieldUnbound(PFL_INFOSULLOPER_DISPOCONPRO3, true);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DISPOCONPRO3, PPQRY_VISTATOTOPE1, "A.DISPONIBILITA_E + A.VARCOMPRO_E + A.PROPOSTE_E_3", "VITOOPDICOP2", 2, 19, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, MyGlb.PANEL_LIST, 144);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, MyGlb.PANEL_LIST, "Disponibilità Con Proposte    ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, MyGlb.PANEL_FORM, 264, 264, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, MyGlb.PANEL_FORM, 164);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO4, MyGlb.PANEL_FORM, "Disponibilità Con Proposte    ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DISPOCONPRO4, -1, -1);
    PAN_INFOSULLOPER.SetFieldUnbound(PFL_INFOSULLOPER_DISPOCONPRO4, true);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DISPOCONPRO4, PPQRY_VISTATOTOPE1, "A.DISPONIBILITA_S + A.VARCOMPRO_S + A.PROPOSTE_S_1", "VITOOPDICOP3", 2, 19, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, MyGlb.PANEL_LIST, 152);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, MyGlb.PANEL_LIST, "Disponibilità Con Proposte     ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, MyGlb.PANEL_FORM, 264, 264, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, MyGlb.PANEL_FORM, 164);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPRO5, MyGlb.PANEL_FORM, "Disponibilità Con Proposte");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DISPOCONPRO5, -1, -1);
    PAN_INFOSULLOPER.SetFieldUnbound(PFL_INFOSULLOPER_DISPOCONPRO5, true);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DISPOCONPRO5, PPQRY_VISTATOTOPE1, "A.DISPONIBILITA_S + A.VARCOMPRO_S + A.PROPOSTE_S_2", "VITOOPDICOP4", 2, 19, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, MyGlb.PANEL_LIST, 152);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, MyGlb.PANEL_LIST, "Disponibilità Con Proposte      ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, MyGlb.PANEL_FORM, 264, 264, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, MyGlb.PANEL_FORM, 164);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPOCONPROP, MyGlb.PANEL_FORM, "Disponibilità Con Proposte");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DISPOCONPROP, -1, -1);
    PAN_INFOSULLOPER.SetFieldUnbound(PFL_INFOSULLOPER_DISPOCONPROP, true);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DISPOCONPROP, PPQRY_VISTATOTOPE1, "A.DISPONIBILITA_S + A.VARCOMPRO_S + A.PROPOSTE_S_3", "VITOOPDICOP5", 2, 19, 0, -13997);
  }

  private void PAN_INFOSULLOPER_InitQueries()
  {
    StringBuffer SQL;

    PAN_INFOSULLOPER.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_INFOSULLOPER.SetIMDB(IMDB, "PQRY_VISTATOTOPE1", true);
    PAN_INFOSULLOPER.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA TOT OPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.PREVISIONE_INI_E as PREVISIONE_INI_E, ");
    SQL.append("  A.VARIAZIONI_E as VARIAZIONI_E, ");
    SQL.append("  A.PREVISIONE_ATT_E as PREVISIONE_ATT_E, ");
    SQL.append("  A.ACCERTATO_COMP as ACCERTATO_COMP, ");
    SQL.append("  A.DISPONIBILITA_E as DISPONIBILITA_E, ");
    SQL.append("  A.VARCOMPRO_E as VARCOMPRO_E, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.PREVISIONE_INI_S as PREVISIONE_INI_S, ");
    SQL.append("  A.VARIAZIONI_S as VARIAZIONI_S, ");
    SQL.append("  A.PREVISIONE_ATT_S as PREVISIONE_ATT_S, ");
    SQL.append("  A.IMPEGNATO_COMP as IMPEGNATO_COMP, ");
    SQL.append("  A.DISPONIBILITA_S as DISPONIBILITA_S, ");
    SQL.append("  A.VARCOMPRO_S as VARCOMPRO_S, ");
    SQL.append("  TO_CHAR ( A.OPERA ) || ' - ' || A.DES_OPERA as VISTOTOPDEOP, ");
    SQL.append("  A.DISPONIBILITA_E + A.VARCOMPRO_E as VISTOTOPDIPR, ");
    SQL.append("  A.DISPONIBILITA_S + A.VARCOMPRO_S as VISTOOPDIPR1, ");
    SQL.append("  A.PROPOSTE_E_1 as PROPOSTE_E_1, ");
    SQL.append("  A.PROPOSTE_E_2 as PROPOSTE_E_2, ");
    SQL.append("  A.PROPOSTE_E_3 as PROPOSTE_E_3, ");
    SQL.append("  A.PROPOSTE_S_1 as PROPOSTE_S_1, ");
    SQL.append("  A.PROPOSTE_S_2 as PROPOSTE_S_2, ");
    SQL.append("  A.PROPOSTE_S_3 as PROPOSTE_S_3, ");
    SQL.append("  A.DISPONIBILITA_E + A.VARCOMPRO_E + A.PROPOSTE_E_1 as VITOOPDICOPR, ");
    SQL.append("  A.DISPONIBILITA_E + A.VARCOMPRO_E + A.PROPOSTE_E_2 as VITOOPDICOP1, ");
    SQL.append("  A.DISPONIBILITA_E + A.VARCOMPRO_E + A.PROPOSTE_E_3 as VITOOPDICOP2, ");
    SQL.append("  A.DISPONIBILITA_S + A.VARCOMPRO_S + A.PROPOSTE_S_1 as VITOOPDICOP3, ");
    SQL.append("  A.DISPONIBILITA_S + A.VARCOMPRO_S + A.PROPOSTE_S_2 as VITOOPDICOP4, ");
    SQL.append("  A.DISPONIBILITA_S + A.VARCOMPRO_S + A.PROPOSTE_S_3 as VITOOPDICOP5 ");
    PAN_INFOSULLOPER.SetQuery(PPQRY_VISTATOTOPE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_VISTA_TOT_OPE A ");
    PAN_INFOSULLOPER.SetQuery(PPQRY_VISTATOTOPE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~PQRY_FILTRO32.ROWNAMEESERC~~) ");
    SQL.append("and   (A.OPERA = ~~TBL_PARAMETRI126.PARAMOPERA~~) ");
    PAN_INFOSULLOPER.SetQuery(PPQRY_VISTATOTOPE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOSULLOPER.SetQuery(PPQRY_VISTATOTOPE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOSULLOPER.SetQuery(PPQRY_VISTATOTOPE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOSULLOPER.SetQuery(PPQRY_VISTATOTOPE1, 5, SQL, -1, "");
    PAN_INFOSULLOPER.SetQueryDB(PPQRY_VISTATOTOPE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INFOSULLOPER.SetMasterTable(0, "POL_VISTA_TOT_OPE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_INFOSULLOPER.Status() == 2)
    {
      int oldListQBE = PAN_INFOSULLOPER.iUseListQBE;
      PAN_INFOSULLOPER.iUseListQBE = 0;
      PAN_INFOSULLOPER.PanelCommand(Glb.PCM_SEARCH);
      PAN_INFOSULLOPER.PanelCommand(Glb.PCM_FIND);
      PAN_INFOSULLOPER.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FILTRO_Init()
  {

    PAN_FILTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, "83814F79-5B70-49A1-8307-3C4EDDFAF2E8");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, "Esercizio");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 8, 12, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_ESERCIZIO, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_ESERCIZIO, PPQRY_FILTRO32, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
  }

  private void PAN_FILTRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALESERCIZI, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUALESERDESC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (A.DUMMY = TO_CHAR ( ~~ROWNAMEESERC~~ )) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1 ) ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_FILTRO.SetQuery(PPQRY_DUAL, 0, SQL, PFL_FILTRO_ESERCIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as DUALESERCIZI, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ ) as DUALESERDESC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1 ) ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2, ");
    SQL.append("  TO_CHAR ( ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ) ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_FILTRO.SetQuery(PPQRY_DUAL, 1, SQL, PFL_FILTRO_ESERCIZIO, "");
    PAN_FILTRO.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILTRO.SetIMDB(IMDB, "PQRY_FILTRO32", true);
    PAN_FILTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_FILTRO.SetQueryIMDB(PPQRY_FILTRO32, IMDBDef12.PQRY_FILTRO32_RS, IMDBDef4.TBL_FILTRO33);
    JustLoaded = true;
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_ESERCIZIO, IMDBDef4.FLD_FILTRO33_ROWNAMEESERC);
    PAN_FILTRO.SetMasterTable(0, "FILTRO33");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRO.Status() == 2)
    {
      int oldListQBE = PAN_FILTRO.iUseListQBE;
      PAN_FILTRO.iUseListQBE = 0;
      PAN_FILTRO.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRO.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_INFOSULLOPER) PAN_INFOSULLOPER_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_INFOSULLOPER) PAN_INFOSULLOPER_ValidateRow(Cancel);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_INFOSULLOPER) PAN_INFOSULLOPER_DynamicProperties();
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_INFOSULLOPER) PAN_INFOSULLOPER_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_INFOSULLOPER) PAN_INFOSULLOPER_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
