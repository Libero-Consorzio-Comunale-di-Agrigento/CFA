// **********************************************
// FCDDE Prev
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FCDDEPrev extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_FCDDE_DCAPCSBDPC37 = 0;
  private static int GRP_FCDDE_TRACORDAUNEU = 1;
  private static int GRP_FCDDE_TRCODAREDEMO = 2;
  private static int GRP_FCDDE_COAGINDAAMPU = 3;
  private static int GRP_FCDDE_CONAGLINDAUE = 4;
  private static int GRP_FCDDE_ALTRINCOCDAP = 5;
  private static int GRP_FCDDE_ALTRINCOCADU = 6;

  private static int PFL_FCDDE_ESERCIZIO = 0;
  private static int PFL_FCDDE_ESERCIZIPLUR = 1;
  private static int PFL_FCDDE_ETICTIPO1010 = 2;
  private static int PFL_FCDDE_STN10101 = 3;
  private static int PFL_FCDDE_ETICHETTA1 = 4;
  private static int PFL_FCDDE_ETICTIPO2010 = 5;
  private static int PFL_FCDDE_STNUE20105 = 6;
  private static int PFL_FCDDE_ACCAOBBUE201 = 7;
  private static int PFL_FCDDE_ACCAEFFUE201 = 8;
  private static int PFL_FCDDE_ACCAPERUE201 = 9;
  private static int PFL_FCDDE_STNMONDO2010 = 10;
  private static int PFL_FCDDE_ETICHEFINTA2 = 11;
  private static int PFL_FCDDE_ETICTIPO4020 = 12;
  private static int PFL_FCDDE_STNCONTPA402 = 13;
  private static int PFL_FCDDE_ETICHEFINTA3 = 14;
  private static int PFL_FCDDE_STNCONTUE402 = 15;
  private static int PFL_FCDDE_ETICHEFINTA4 = 16;
  private static int PFL_FCDDE_ETICTIPO4030 = 17;
  private static int PFL_FCDDE_STNTRASPA403 = 18;
  private static int PFL_FCDDE_ETICHEFINTA5 = 19;
  private static int PFL_FCDDE_STNTRASUE403 = 20;
  private static int PFL_FCDDE_ETICHETTA = 21;
  private static int PFL_FCDDE_ETICHEELABOR = 22;
  private static int PFL_FCDDE_ACCANOBB1010 = 23;
  private static int PFL_FCDDE_ACCANEFF1010 = 24;
  private static int PFL_FCDDE_ACCAPERC1010 = 25;
  private static int PFL_FCDDE_ACCOBBMON201 = 26;
  private static int PFL_FCDDE_ACCEFFMON201 = 27;
  private static int PFL_FCDDE_ACCPERMON201 = 28;
  private static int PFL_FCDDE_ACCOBBCOPA40 = 29;
  private static int PFL_FCDDE_ACCEFFCOPA40 = 30;
  private static int PFL_FCDDE_ACCPERCOPA40 = 31;
  private static int PFL_FCDDE_ACCOBBCOUE40 = 32;
  private static int PFL_FCDDE_ACCEFFCOUE40 = 33;
  private static int PFL_FCDDE_ACCPERCOUE40 = 34;
  private static int PFL_FCDDE_ACCOBBTRPA40 = 35;
  private static int PFL_FCDDE_ACCEFFTRPA40 = 36;
  private static int PFL_FCDDE_ACCPERTRPA40 = 37;
  private static int PFL_FCDDE_ACCOBBTRUE40 = 38;
  private static int PFL_FCDDE_ACCEFFTRUE40 = 39;
  private static int PFL_FCDDE_ACCPERTRUE40 = 40;

  private static int PPQRY_BILACCFCDDE1 = 0;


  IDPanel PAN_FCDDE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARASTAMFCD1(IMDB);
    //
    //
    Init_PQRY_BILACCFCDDE1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARASTAMFCD1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARASTAMFCD1, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_PARASTAMFCD1, "TBL_PARASTAMFCD1");
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARAESERPLUR, "PARAESERPLUR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARAESERPLUR,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARASTAMFCD1,IMDBDef3.FLD_PARASTAMFCD1_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARASTAMFCD1, 0);
  }

  private static void Init_PQRY_BILACCFCDDE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILACCFCDDE1, 30);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILACCFCDDE1, "PQRY_BILACCFCDDE1");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ESERCIZIO_PLUR, "ESERCIZIO_PLUR");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ESERCIZIO_PLUR,1,9,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_10101, "STN_10101");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_10101,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_10101, "ACCANT_OBB_10101");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_10101,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_10101, "ACCANT_EFF_10101");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_10101,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_10101, "ACCANT_PERC_10101");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_10101,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_UE_20105, "STN_UE_20105");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_UE_20105,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_UE_20105, "ACCANT_OBB_UE_20105");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_UE_20105,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_UE_20105, "ACCANT_EFF_UE_20105");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_UE_20105,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_UE_20105, "ACCANT_PERC_UE_20105");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_UE_20105,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_MONDO_20105, "STN_MONDO_20105");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_MONDO_20105,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_MONDO_20105, "ACCANT_OBB_MONDO_20105");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_MONDO_20105,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_MONDO_20105, "ACCANT_EFF_MONDO_20105");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_MONDO_20105,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_MONDO_20105, "ACCANT_PERC_MONDO_20105");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_MONDO_20105,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_CONTRIB_PA_40200, "STN_CONTRIB_PA_40200");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_CONTRIB_PA_40200,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_CONTRIB_PA_40200, "ACCANT_OBB_CONTRIB_PA_40200");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_CONTRIB_PA_40200,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_CONTRIB_PA_40200, "ACCANT_EFF_CONTRIB_PA_40200");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_CONTRIB_PA_40200,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_CONTRIB_PA_40200, "ACCANT_PERC_CONTRIB_PA_40200");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_CONTRIB_PA_40200,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_CONTRIB_UE_40200, "STN_CONTRIB_UE_40200");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_CONTRIB_UE_40200,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_CONTRIB_UE_40200, "ACCANT_OBB_CONTRIB_UE_40200");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_CONTRIB_UE_40200,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_CONTRIB_UE_40200, "ACCANT_EFF_CONTRIB_UE_40200");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_CONTRIB_UE_40200,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_CONTRIB_UE_40200, "ACCANT_PERC_CONTRIB_UE_40200");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_CONTRIB_UE_40200,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_TRASF_PA_40300, "STN_TRASF_PA_40300");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_TRASF_PA_40300,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_TRASF_PA_40300, "ACCANT_OBB_TRASF_PA_40300");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_TRASF_PA_40300,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_TRASF_PA_40300, "ACCANT_EFF_TRASF_PA_40300");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_TRASF_PA_40300,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_TRASF_PA_40300, "ACCANT_PERC_TRASF_PA_40300");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_TRASF_PA_40300,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_TRASF_UE_40300, "STN_TRASF_UE_40300");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_STN_TRASF_UE_40300,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_TRASF_UE_40300, "ACCANT_OBB_TRASF_UE_40300");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_TRASF_UE_40300,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_TRASF_UE_40300, "ACCANT_EFF_TRASF_UE_40300");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_TRASF_UE_40300,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_TRASF_UE_40300, "ACCANT_PERC_TRASF_UE_40300");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILACCFCDDE1,IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_TRASF_UE_40300,3,5,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILACCFCDDE1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FCDDEPrev(MyWebEntryPoint w, IMDBObj imdb)
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
  public FCDDEPrev()
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
    FormIdx = MyGlb.FRM_FCDDEPREV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D319ABFA-5ED6-483C-B22E-08A58217CE0F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 440;
    DesignHeight = 730;
    set_Caption(new IDVariant("Fondo Crediti di Dubbia Esigibilità"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 440;
    Frames[1].Height = 704;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "FCDDE";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 704;
    PAN_FCDDE = new IDPanel(w, this, 1, "PAN_FCDDE");
    Frames[1].Content = PAN_FCDDE;
    PAN_FCDDE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FCDDE.VS = MainFrm.VisualStyleList;
    PAN_FCDDE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 440-MyGlb.PAN_OFFS_X, 704-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3FBF427B-AC36-4A0C-AE6A-99E912EAD69B");
    PAN_FCDDE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 160, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FCDDE.InitStatus = 2;
    PAN_FCDDE_Init();
    PAN_FCDDE_InitFields();
    PAN_FCDDE_InitQueries();
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
      PAN_FCDDE.UpdatePanel(MainFrm);
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
    return (obj instanceof FCDDEPrev);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FCDDEPrev.class.getName() : (Glb.ClassWithPackage(FCDDEPrev.class) ? FCDDEPrev.class.getName().substring(FCDDEPrev.class.getPackage().getName().length() + 1) : FCDDEPrev.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // FCDDE After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_FCDDE_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // FCDDE After Find Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEPrev", "FCDDEAfterFind", _e);
    }
  }

  // **********************************************************************
  // FCDDE On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FCDDE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // FCDDE On Updating Row Body
      // Corpo Procedura
      // 
      // if (Inserting.booleanValue())
      // {
        // if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ESERCIZIO, 0)))
        // {
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ESERCIZIO_PLUR, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_10101, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_10101, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_10101, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_10101, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_UE_20105, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_UE_20105, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_UE_20105, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_UE_20105, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_MONDO_20105, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_MONDO_20105, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_MONDO_20105, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_MONDO_20105, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_CONTRIB_PA_40200, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_CONTRIB_PA_40200, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_CONTRIB_PA_40200, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_CONTRIB_PA_40200, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_CONTRIB_UE_40200, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_CONTRIB_UE_40200, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_CONTRIB_UE_40200, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_CONTRIB_UE_40200, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_TRASF_PA_40300, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_TRASF_PA_40300, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_TRASF_PA_40300, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_TRASF_PA_40300, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_TRASF_UE_40300, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_OBB_TRASF_UE_40300, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_TRASF_UE_40300, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_TRASF_UE_40300, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        // }
      // }
      // if ((Column.equals((new IDVariant(PFL_FCDDE_STN10101)), true) || Column.equals( true)) && FieldWasModified.booleanValue())
      // {
        // if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_10101, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_10101, 0))))
        // {
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_10101, 0, IDL.Round(IDL.Div((IDL.Mul(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_10101, 0),(new IDVariant(0))), (new IDVariant(100)))), IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_10101, 0)), (new IDVariant(2))));
        // }
      // }
      // if ((Column.equals((new IDVariant(PFL_FCDDE_STNUE20105)), true) || Column.equals((new IDVariant(PFL_FCDDE_ACCAEFFUE201)), true)) && FieldWasModified.booleanValue())
      // {
        // if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_UE_20105, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_UE_20105, 0))))
        // {
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_UE_20105, 0, IDL.Round(IDL.Div((IDL.Mul(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_UE_20105, 0),(new IDVariant(0))), (new IDVariant(100)))), IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_UE_20105, 0)), (new IDVariant(2))));
        // }
      // }
      // if ((Column.equals((new IDVariant(PFL_FCDDE_STNMONDO2010)), true) || Column.equals( true)) && FieldWasModified.booleanValue())
      // {
        // if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_MONDO_20105, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_MONDO_20105, 0))))
        // {
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_MONDO_20105, 0, IDL.Round(IDL.Div((IDL.Mul(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_MONDO_20105, 0),(new IDVariant(0))), (new IDVariant(100)))), IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_MONDO_20105, 0)), (new IDVariant(2))));
        // }
      // }
      // if ((Column.equals((new IDVariant(PFL_FCDDE_STNCONTPA402)), true) || Column.equals( true)) && FieldWasModified.booleanValue())
      // {
        // if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_CONTRIB_PA_40200, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_CONTRIB_PA_40200, 0))))
        // {
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_CONTRIB_PA_40200, 0, IDL.Round(IDL.Div((IDL.Mul(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_CONTRIB_PA_40200, 0),(new IDVariant(0))), (new IDVariant(100)))), IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_CONTRIB_PA_40200, 0)), (new IDVariant(2))));
        // }
      // }
      // if ((Column.equals((new IDVariant(PFL_FCDDE_STNCONTUE402)), true) || Column.equals( true)) && FieldWasModified.booleanValue())
      // {
        // if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_CONTRIB_UE_40200, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_CONTRIB_UE_40200, 0))))
        // {
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_CONTRIB_UE_40200, 0, IDL.Round(IDL.Div((IDL.Mul(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_CONTRIB_UE_40200, 0),(new IDVariant(0))), (new IDVariant(100)))), IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_CONTRIB_UE_40200, 0)), (new IDVariant(2))));
        // }
      // }
      // if ((Column.equals((new IDVariant(PFL_FCDDE_STNTRASPA403)), true) || Column.equals( true)) && FieldWasModified.booleanValue())
      // {
        // if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_TRASF_PA_40300, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_TRASF_PA_40300, 0))))
        // {
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_TRASF_PA_40300, 0, IDL.Round(IDL.Div((IDL.Mul(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_TRASF_PA_40300, 0),(new IDVariant(0))), (new IDVariant(100)))), IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_TRASF_PA_40300, 0)), (new IDVariant(2))));
        // }
      // }
      // if ((Column.equals((new IDVariant(PFL_FCDDE_STNTRASUE403)), true) || Column.equals( true)) && FieldWasModified.booleanValue())
      // {
        // if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_TRASF_UE_40300, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_TRASF_UE_40300, 0))))
        // {
          // IMDB.set_Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_PERC_TRASF_UE_40300, 0, IDL.Round(IDL.Div((IDL.Mul(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_ACCANT_EFF_TRASF_UE_40300, 0),(new IDVariant(0))), (new IDVariant(100)))), IMDB.Value(IMDBDef11.PQRY_BILACCFCDDE1, IMDBDef11.PQSL_BILACCFCDDE1_STN_TRASF_UE_40300, 0)), (new IDVariant(2))));
        // }
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEPrev", "FCDDEOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPEPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARAESERPLUR, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARAESERPLUR, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
      MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARSTANUDIPA, 0));
      MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARANOMEFILE, 0), (new IDVariant("pdf")));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEPrev", "EtichettaElabora", _e);
      return -1;
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
      // 
      // Inserimento su BIL_ACC_FCDDE
      // 
      SQL = new StringBuffer();
      SQL.append("insert into BIL_ACC_FCDDE ");
      SQL.append("( ");
      SQL.append("  ESERCIZIO, ");
      SQL.append("  ESERCIZIO_PLUR, ");
      SQL.append("  STN_10101, ");
      SQL.append("  ACCANT_EFF_10101, ");
      SQL.append("  ACCANT_OBB_10101, ");
      SQL.append("  ACCANT_PERC_10101, ");
      SQL.append("  STN_UE_20105, ");
      SQL.append("  ACCANT_EFF_UE_20105, ");
      SQL.append("  ACCANT_OBB_UE_20105, ");
      SQL.append("  ACCANT_PERC_UE_20105, ");
      SQL.append("  STN_MONDO_20105, ");
      SQL.append("  ACCANT_EFF_MONDO_20105, ");
      SQL.append("  ACCANT_OBB_MONDO_20105, ");
      SQL.append("  ACCANT_PERC_MONDO_20105, ");
      SQL.append("  STN_CONTRIB_PA_40200, ");
      SQL.append("  ACCANT_EFF_CONTRIB_PA_40200, ");
      SQL.append("  ACCANT_OBB_CONTRIB_PA_40200, ");
      SQL.append("  ACCANT_PERC_CONTRIB_PA_40200, ");
      SQL.append("  STN_CONTRIB_UE_40200, ");
      SQL.append("  ACCANT_EFF_CONTRIB_UE_40200, ");
      SQL.append("  ACCANT_OBB_CONTRIB_UE_40200, ");
      SQL.append("  ACCANT_PERC_CONTRIB_UE_40200, ");
      SQL.append("  STN_TRASF_PA_40300, ");
      SQL.append("  ACCANT_EFF_TRASF_PA_40300, ");
      SQL.append("  ACCANT_OBB_TRASF_PA_40300, ");
      SQL.append("  ACCANT_PERC_TRASF_PA_40300, ");
      SQL.append("  STN_TRASF_UE_40300, ");
      SQL.append("  ACCANT_EFF_TRASF_UE_40300, ");
      SQL.append("  ACCANT_OBB_TRASF_UE_40300, ");
      SQL.append("  ACCANT_PERC_TRASF_UE_40300 ");
      SQL.append(") ");
      SQL.append("select ");
      SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  A.ESERCIZIO, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0, ");
      SQL.append("  0 ");
      SQL.append("from ");
      SQL.append("  ESEFIN A ");
      SQL.append("where ((A.ESERCIZIO BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 2)) ");
      SQL.append("and   (NOT (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  BIL_ACC_FCDDE B ");
      SQL.append("where (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.ESERCIZIO_PLUR = A.ESERCIZIO) ");
      SQL.append(")))) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEPrev", "Load", _e);
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
      UNLOAD_PARSTAFCDDEL();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FCDDEPrev", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa FCDDE: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSTAFCDDEL() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARAESERPLUR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARANOMESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARSTANUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARANOTESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARAMIDSTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARANOMEFILE, 0, new IDVariant());
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
  private void PAN_FCDDE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FCDDE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FCDDE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FCDDE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FCDDE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FCDDE);
    // Stub
  }

  private void PAN_FCDDE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FCDDE_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_FCDDE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FCDDE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FCDDE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FCDDE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FCDDE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FCDDE_Init()
  {

    PAN_FCDDE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FCDDE.SetSize(MyGlb.OBJ_GROUP, 7);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, "5EA585C6-8F85-4D04-BF40-6EABB4D5B335");
    PAN_FCDDE.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, "di cui accertati per cassa sulla base del principio contabile 3.7");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, MyGlb.VIS_GROUSTYNOBOR);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, MyGlb.PANEL_FORM, 24, 63, 392, 73, 0, 0);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, 0, 345);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, 1, 13);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, 0, 4);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, 1, 4);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDE_DCAPCSBDPC37, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDE_TRACORDAUNEU, "1E1AF49C-7796-444B-8A2B-115A4D7FEF6E");
    PAN_FCDDE.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDE_TRACORDAUNEU, "Trasferimenti correnti dalla Unione Europea");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDE_TRACORDAUNEU, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDE_TRACORDAUNEU, MyGlb.VIS_GROUSTYNOBOR);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_TRACORDAUNEU, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_TRACORDAUNEU, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_TRACORDAUNEU, 0, 246);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_TRACORDAUNEU, 1, 13);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_TRACORDAUNEU, 0, 4);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_TRACORDAUNEU, 1, 4);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDE_TRACORDAUNEU, 0 | MyGlb.OBJ_ENABLED, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDE_TRCODAREDEMO, "C3B7723A-F34A-4111-BEBF-849915201788");
    PAN_FCDDE.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDE_TRCODAREDEMO, "Trasferimenti correnti dal Resto del Mondo");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDE_TRCODAREDEMO, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDE_TRCODAREDEMO, MyGlb.VIS_GROUSTYNOBOR);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_TRCODAREDEMO, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_TRCODAREDEMO, MyGlb.PANEL_FORM, 24, 175, 392, 73, 0, 0);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_TRCODAREDEMO, 0, 242);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_TRCODAREDEMO, 1, 13);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_TRCODAREDEMO, 0, 4);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_TRCODAREDEMO, 1, 4);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDE_TRCODAREDEMO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDE_COAGINDAAMPU, "68914A22-60E7-4733-B462-FE029B8DCE4F");
    PAN_FCDDE.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDE_COAGINDAAMPU, "Contributi agli investimenti da amministrazioni pubbliche");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDE_COAGINDAAMPU, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDE_COAGINDAAMPU, MyGlb.VIS_GROUSTYNOBOR);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_COAGINDAAMPU, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_COAGINDAAMPU, MyGlb.PANEL_FORM, 24, 287, 392, 73, 0, 0);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_COAGINDAAMPU, 0, 321);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_COAGINDAAMPU, 1, 13);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_COAGINDAAMPU, 0, 4);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_COAGINDAAMPU, 1, 4);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDE_COAGINDAAMPU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDE_CONAGLINDAUE, "82166EF5-B9AE-4617-A1C9-508A8B3627A0");
    PAN_FCDDE.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDE_CONAGLINDAUE, "Contributi agli investimenti da UE");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDE_CONAGLINDAUE, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDE_CONAGLINDAUE, MyGlb.VIS_GROUSTYNOBOR);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_CONAGLINDAUE, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_CONAGLINDAUE, MyGlb.PANEL_FORM, 24, 371, 392, 73, 0, 0);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_CONAGLINDAUE, 0, 187);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_CONAGLINDAUE, 1, 13);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_CONAGLINDAUE, 0, 4);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_CONAGLINDAUE, 1, 4);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDE_CONAGLINDAUE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCDAP, "FDB7A321-C285-4182-A840-A0E0CC60654A");
    PAN_FCDDE.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCDAP, "Altri trasferimenti in conto capitale da amministrazioni pubbliche");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCDAP, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCDAP, MyGlb.VIS_GROUSTYNOBOR);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCDAP, MyGlb.PANEL_LIST, 216, 247, 208, 49, 0, 0);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCDAP, MyGlb.PANEL_FORM, 24, 483, 392, 73, 0, 0);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCDAP, 0, 366);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCDAP, 1, 13);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCDAP, 0, 4);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCDAP, 1, 4);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCDAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCADU, "36B5F26E-2BB0-43AB-9C98-B59BCBCF7F33");
    PAN_FCDDE.set_Header(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCADU, "Altri trasferimenti in conto capitale da UE");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCADU, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCADU, MyGlb.VIS_GROUSTYNOBOR);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCADU, MyGlb.PANEL_LIST, 216, 295, 208, 49, 0, 0);
    PAN_FCDDE.SetRect(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCADU, MyGlb.PANEL_FORM, 24, 567, 392, 73, 0, 0);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCADU, 0, 232);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCADU, 1, 13);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCADU, 0, 4);
    PAN_FCDDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCADU, 1, 4);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_GROUP, GRP_FCDDE_ALTRINCOCADU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FCDDE.SetSize(MyGlb.OBJ_FIELD, 41);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, "74AF18E9-E54D-4036-A71F-9282506E5E87");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, "ESERCIZIO");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, "894A072B-B044-41FF-95EA-1CFE7DBD961E");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, "Esercizio di Stampa");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, "352CFC13-923A-4943-A42B-C1E20EB38701");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, "Tipologia 10101");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.VIS_VUONORALILEF);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, "6B6E1D59-11A8-47F7-A281-CF217CF58B28");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, "Stanziamento");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, "19434087-DD9E-464B-89BB-0DB48B4AD435");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, " ");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, "Finta 1");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.VIS_LABELFIELD);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO2010, "574FC7F1-099E-4E63-A317-011CBAFBA202");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO2010, "Tipologia 20105");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO2010, MyGlb.VIS_VUONORALILEF);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO2010, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, "302EDF18-CBFC-4B9C-B2B3-A9E65DF95B05");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, "Stanziamento");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, 0 | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, "5FF86811-7228-45D9-8184-0BFBB2295933");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, "Accantonamento obbligatorio");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, 0 | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, "37CF649C-4728-45CF-9AC0-8E6959DB56B6");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, "Accantonamento effettivo");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, 0 | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, "E04BC8ED-9162-4E43-8D51-01DE95907E54");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, "% Stanziamento accantonato");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, 0 | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, "FDC3389D-8A39-4715-9337-318ECE5BD2E4");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, "Stanziamento");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA2, "6F7F000D-EA1F-4C5C-B42F-974ADC5C9193");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA2, " ");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA2, "Finta 2");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA2, MyGlb.VIS_LABELFIELD);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4020, "C2DD0015-1561-4524-92D5-9B3EAD3B838F");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4020, "Tipologia 4020000");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4020, MyGlb.VIS_VUONORALILEF);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4020, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, "6E68DA1F-9230-465D-A6C7-5C3BB6024565");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, "Stanziamento");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA3, "BCBC5F72-193B-483F-87DA-DD50FCD8EF94");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA3, " ");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA3, "Finta 3");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA3, MyGlb.VIS_LABELFIELD);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, "3DDC4E7B-C842-41CA-B8EF-F681E0859E7F");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, "Stanziamento");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA4, "93D0E9E1-0D13-4516-AEFB-05E1FCF6C1F5");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA4, " ");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA4, "Finta 4");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA4, MyGlb.VIS_LABELFIELD);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4030, "A49E8A39-E66A-4BA7-9D5B-CE8A269FEF14");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4030, "Tipologia 4030000");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4030, MyGlb.VIS_VUONORALILEF);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4030, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, "65FEE7F1-A589-42B8-B14F-9A8CEAA03317");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, "Stanziamento");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA5, "78B4BD9F-D0D5-4052-81B7-68FF612F126F");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA5, " ");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA5, "Finta 5");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA5, MyGlb.VIS_LABELFIELD);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, "16A7D68A-69A4-4776-A8CB-1648BA812C95");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, "Stanziamento");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, MyGlb.VIS_NORMALFIELDS);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA, "3E2981D6-6C88-42AC-A5AD-1FAA4045DDF7");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA, " ");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA, "Finta 6");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA, MyGlb.VIS_LABELFIELD);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, "B7F6BE67-B89C-4F0D-A31F-9A775435CFFD");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, "Elabora");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_FCDDE.SetImage(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, 0, "button1.gif", false);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, "54CBADD4-E844-4342-8D3C-681628380D78");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, "ACCANT OBB 10101");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, "BE2BE18F-224B-4A77-9892-D09225CA66AE");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, "ACCANT EFF 10101");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, "5763A153-76B3-4E53-9161-F94D59592611");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, "ACCANT PERC 10101");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, "EA95C6D4-FBFD-4440-9366-4B534E3F228D");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, "ACCANT OBB MONDO 20105");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, "05F40703-953C-4ACC-93DB-0EF529215549");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, "ACCANT EFF MONDO 20105");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, "1B399968-69F9-4653-99E9-212809C63C09");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, "ACCANT PERC MONDO 20105");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, "2E4597CB-B87D-4A74-86D0-3ED5C12F6C22");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, "ACCANT OBB CONTRIB PA 40200");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, "B8076391-EB1D-4CB5-A0D9-CAE73C30512A");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, "ACCANT EFF CONTRIB PA 40200");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, "DAC0BA63-F341-4CFC-9488-58EA6B85E6FA");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, "ACCANT PERC CONTRIB PA 40200");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, "8697505E-E1A8-43B5-B2EE-69A032D49409");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, "ACCANT OBB CONTRIB UE 40200");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, "163BE5EF-5005-4573-BE8E-AD1CA48B68D4");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, "ACCANT EFF CONTRIB UE 40200");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, "1CA5D8AE-27AF-4FB7-BF70-F81F4BDE1A7A");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, "ACCANT PERC CONTRIB UE 40200");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, "6F7D2D5A-C325-4C2F-8814-B1135DAAA8E9");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, "ACCANT OBB TRASF PA 40300");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, "2376E42E-9F47-4BD7-8E1E-1F62716DE7BA");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, "ACCANT EFF TRASF PA 40300");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, "C2F6331D-79BE-411D-8CE5-A5BF94656694");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, "ACCANT PERC TRASF PA 40300");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, "994F7B82-1B37-46BC-8ABB-D8D1753DAB84");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, "ACCANT OBB TRASF UE 40300");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, "1E70BF2D-6C3F-40FA-AFD9-991D169AF219");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, "ACCANT EFF TRASF UE 40300");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FCDDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, "11E576A2-700C-4F5D-AAA4-AFDFF82A2033");
    PAN_FCDDE.set_Header(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, "ACCANT PERC TRASF UE 40300");
    PAN_FCDDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, "");
    PAN_FCDDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, MyGlb.VIS_NORMFIELPADR);
    PAN_FCDDE.SetFlags(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FCDDE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_FORM, 160);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ESERCIZIO, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ESERCIZIO, PPQRY_BILACCFCDDE1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, MyGlb.PANEL_LIST, 100);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, MyGlb.PANEL_LIST, "Esercizio di Stampa");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, MyGlb.PANEL_FORM, 24, 12, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, MyGlb.PANEL_FORM, 120);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ESERCIZIPLUR, MyGlb.PANEL_FORM, "Esercizio di Stampa");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ESERCIZIPLUR, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ESERCIZIPLUR, PPQRY_BILACCFCDDE1, "A.ESERCIZIO_PLUR", "ESERCIZIO_PLUR", 1, 9, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.PANEL_LIST, 20, 16, 152, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.PANEL_FORM, 28, 44, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO1010, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICTIPO1010, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICTIPO1010, -1, "", "ETICTIPO1010", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, MyGlb.PANEL_LIST, 68);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, MyGlb.PANEL_LIST, "Stan.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, MyGlb.PANEL_FORM, 28, 88, 114, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, MyGlb.PANEL_FORM, 20);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STN10101, MyGlb.PANEL_FORM, "Stanziamento");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_STN10101, -1, GRP_FCDDE_DCAPCSBDPC37);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_STN10101, PPQRY_BILACCFCDDE1, "A.STN_10101", "STN_10101", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.PANEL_LIST, 312, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.PANEL_FORM, 348, 116, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA1, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICHETTA1, -1, GRP_FCDDE_DCAPCSBDPC37);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICHETTA1, -1, "", "ETICHETTA1", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO2010, MyGlb.PANEL_LIST, 28, 24, 152, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO2010, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO2010, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO2010, MyGlb.PANEL_FORM, 28, 156, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO2010, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO2010, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICTIPO2010, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICTIPO2010, -1, "", "ETICTIPO2010", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, MyGlb.PANEL_LIST, 84);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, MyGlb.PANEL_LIST, "Stan.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, MyGlb.PANEL_FORM, 28, 180, 114, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, MyGlb.PANEL_FORM, 36);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STNUE20105, MyGlb.PANEL_FORM, "Stanziamento");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_STNUE20105, -1, GRP_FCDDE_TRACORDAUNEU);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_STNUE20105, PPQRY_BILACCFCDDE1, "A.STN_UE_20105", "STN_UE_20105", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, MyGlb.PANEL_LIST, 132);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, MyGlb.PANEL_LIST, "Acc. obbl.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, MyGlb.PANEL_FORM, 148, 180, 114, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, MyGlb.PANEL_FORM, 36);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAOBBUE201, MyGlb.PANEL_FORM, "Accantonamento obbligatorio");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCAOBBUE201, -1, GRP_FCDDE_TRACORDAUNEU);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCAOBBUE201, PPQRY_BILACCFCDDE1, "A.ACCANT_OBB_UE_20105", "ACCANT_OBB_UE_20105", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, MyGlb.PANEL_LIST, 128);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, MyGlb.PANEL_LIST, "Acc. eff.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, MyGlb.PANEL_FORM, 268, 180, 114, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, MyGlb.PANEL_FORM, 36);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAEFFUE201, MyGlb.PANEL_FORM, "Accantonamento effettivo");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCAEFFUE201, -1, GRP_FCDDE_TRACORDAUNEU);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCAEFFUE201, PPQRY_BILACCFCDDE1, "A.ACCANT_EFF_UE_20105", "ACCANT_EFF_UE_20105", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, MyGlb.PANEL_LIST, 140);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, MyGlb.PANEL_LIST, "Stan. acc.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, MyGlb.PANEL_FORM, 388, 180, 114, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, MyGlb.PANEL_FORM, 36);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERUE201, MyGlb.PANEL_FORM, "% Stanziamento accantonato");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCAPERUE201, -1, GRP_FCDDE_TRACORDAUNEU);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCAPERUE201, PPQRY_BILACCFCDDE1, "A.ACCANT_PERC_UE_20105", "ACCANT_PERC_UE_20105", 3, 5, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, MyGlb.PANEL_LIST, 112);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, MyGlb.PANEL_LIST, "Stan.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, MyGlb.PANEL_FORM, 28, 200, 114, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, MyGlb.PANEL_FORM, 20);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STNMONDO2010, MyGlb.PANEL_FORM, "Stanziamento");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_STNMONDO2010, -1, GRP_FCDDE_TRCODAREDEMO);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_STNMONDO2010, PPQRY_BILACCFCDDE1, "A.STN_MONDO_20105", "STN_MONDO_20105", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA2, MyGlb.PANEL_LIST, 320, 76, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA2, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA2, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA2, MyGlb.PANEL_FORM, 348, 228, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA2, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA2, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICHEFINTA2, -1, GRP_FCDDE_TRCODAREDEMO);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICHEFINTA2, -1, "", "ETICHEFINTA2", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4020, MyGlb.PANEL_LIST, 36, 32, 152, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4020, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4020, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4020, MyGlb.PANEL_FORM, 28, 268, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4020, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4020, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICTIPO4020, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICTIPO4020, -1, "", "ETICTIPO4020", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, MyGlb.PANEL_LIST, 140);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, MyGlb.PANEL_LIST, "Stan.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, MyGlb.PANEL_FORM, 28, 312, 114, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, MyGlb.PANEL_FORM, 20);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTPA402, MyGlb.PANEL_FORM, "Stanziamento");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_STNCONTPA402, -1, GRP_FCDDE_COAGINDAAMPU);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_STNCONTPA402, PPQRY_BILACCFCDDE1, "A.STN_CONTRIB_PA_40200", "STN_CONTRIB_PA_40200", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA3, MyGlb.PANEL_LIST, 328, 84, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA3, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA3, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA3, MyGlb.PANEL_FORM, 348, 340, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA3, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA3, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICHEFINTA3, -1, GRP_FCDDE_COAGINDAAMPU);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICHEFINTA3, -1, "", "ETICHEFINTA3", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, MyGlb.PANEL_LIST, 136);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, MyGlb.PANEL_LIST, "Stan.");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, MyGlb.PANEL_FORM, 28, 396, 114, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, MyGlb.PANEL_FORM, 20);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STNCONTUE402, MyGlb.PANEL_FORM, "Stanziamento");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_STNCONTUE402, -1, GRP_FCDDE_CONAGLINDAUE);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_STNCONTUE402, PPQRY_BILACCFCDDE1, "A.STN_CONTRIB_UE_40200", "STN_CONTRIB_UE_40200", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA4, MyGlb.PANEL_LIST, 336, 92, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA4, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA4, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA4, MyGlb.PANEL_FORM, 348, 424, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA4, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA4, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICHEFINTA4, -1, GRP_FCDDE_CONAGLINDAUE);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICHEFINTA4, -1, "", "ETICHEFINTA4", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4030, MyGlb.PANEL_LIST, 44, 40, 152, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4030, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4030, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4030, MyGlb.PANEL_FORM, 32, 464, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4030, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICTIPO4030, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICTIPO4030, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICTIPO4030, -1, "", "ETICTIPO4030", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, MyGlb.PANEL_LIST, 220, 272, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, MyGlb.PANEL_LIST, 152);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, MyGlb.PANEL_LIST, "Stanziamento");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, MyGlb.PANEL_FORM, 28, 508, 114, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, MyGlb.PANEL_FORM, 20);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASPA403, MyGlb.PANEL_FORM, "Stanziamento");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_STNTRASPA403, -1, GRP_FCDDE_ALTRINCOCDAP);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_STNTRASPA403, PPQRY_BILACCFCDDE1, "A.STN_TRASF_PA_40300", "STN_TRASF_PA_40300", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA5, MyGlb.PANEL_LIST, 344, 100, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA5, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA5, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA5, MyGlb.PANEL_FORM, 348, 536, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA5, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEFINTA5, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICHEFINTA5, -1, GRP_FCDDE_ALTRINCOCDAP);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICHEFINTA5, -1, "", "ETICHEFINTA5", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, MyGlb.PANEL_LIST, 220, 320, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, MyGlb.PANEL_LIST, 152);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, MyGlb.PANEL_LIST, "Stanziamento");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, MyGlb.PANEL_FORM, 28, 592, 114, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, MyGlb.PANEL_FORM, 20);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_STNTRASUE403, MyGlb.PANEL_FORM, "Stanziamento");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_STNTRASUE403, -1, GRP_FCDDE_ALTRINCOCADU);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_STNTRASUE403, PPQRY_BILACCFCDDE1, "A.STN_TRASF_UE_40300", "STN_TRASF_UE_40300", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA, MyGlb.PANEL_LIST, 352, 108, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA, MyGlb.PANEL_FORM, 348, 620, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHETTA, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICHETTA, -1, GRP_FCDDE_ALTRINCOCADU);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICHETTA, -1, "", "ETICHETTA", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.PANEL_LIST, 428, 1000, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.PANEL_FORM, 336, 660, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ETICHEELABOR, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, MyGlb.PANEL_LIST, 116);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, MyGlb.PANEL_LIST, "ACCANT OBB 10101");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, MyGlb.PANEL_FORM, 4, 772, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, MyGlb.PANEL_FORM, 116);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANOBB1010, MyGlb.PANEL_FORM, "ACCANT OBB 10101");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCANOBB1010, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCANOBB1010, PPQRY_BILACCFCDDE1, "A.ACCANT_OBB_10101", "ACCANT_OBB_10101", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_LIST, 112);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_LIST, "ACCANT EFF 10101");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_FORM, 4, 772, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_FORM, 112);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCANEFF1010, MyGlb.PANEL_FORM, "ACCANT EFF 10101");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCANEFF1010, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCANEFF1010, PPQRY_BILACCFCDDE1, "A.ACCANT_EFF_10101", "ACCANT_EFF_10101", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_LIST, 124);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_LIST, "ACCANT PERC 10101");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_FORM, 4, 772, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_FORM, 124);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCAPERC1010, MyGlb.PANEL_FORM, "ACCANT PERC 10101");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCAPERC1010, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCAPERC1010, PPQRY_BILACCFCDDE1, "A.ACCANT_PERC_10101", "ACCANT_PERC_10101", 3, 5, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, MyGlb.PANEL_LIST, 160);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, MyGlb.PANEL_LIST, "ACCANT OBB MONDO 20105");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, MyGlb.PANEL_FORM, 4, 772, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, MyGlb.PANEL_FORM, 160);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBMON201, MyGlb.PANEL_FORM, "ACCANT OBB MONDO 20105");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCOBBMON201, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCOBBMON201, PPQRY_BILACCFCDDE1, "A.ACCANT_OBB_MONDO_20105", "ACCANT_OBB_MONDO_20105", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, MyGlb.PANEL_LIST, 156);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, MyGlb.PANEL_LIST, "ACCANT EFF MONDO 20105");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, MyGlb.PANEL_FORM, 4, 772, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, MyGlb.PANEL_FORM, 156);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFMON201, MyGlb.PANEL_FORM, "ACCANT EFF MONDO 20105");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCEFFMON201, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCEFFMON201, PPQRY_BILACCFCDDE1, "A.ACCANT_EFF_MONDO_20105", "ACCANT_EFF_MONDO_20105", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, MyGlb.PANEL_LIST, 168);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, MyGlb.PANEL_LIST, "ACCANT PERC MONDO 20105");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, MyGlb.PANEL_FORM, 4, 772, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, MyGlb.PANEL_FORM, 168);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERMON201, MyGlb.PANEL_FORM, "ACCANT PERC MONDO 20105");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCPERMON201, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCPERMON201, PPQRY_BILACCFCDDE1, "A.ACCANT_PERC_MONDO_20105", "ACCANT_PERC_MONDO_20105", 3, 5, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, MyGlb.PANEL_LIST, 0, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, MyGlb.PANEL_LIST, 188);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, MyGlb.PANEL_LIST, "ACCANT OBB CONTRIB PA 40200");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, MyGlb.PANEL_FORM, 4, 772, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, MyGlb.PANEL_FORM, 188);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOPA40, MyGlb.PANEL_FORM, "ACCANT OBB CONTRIB PA 40200");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCOBBCOPA40, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCOBBCOPA40, PPQRY_BILACCFCDDE1, "A.ACCANT_OBB_CONTRIB_PA_40200", "ACCANT_OBB_CONTRIB_PA_40200", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, MyGlb.PANEL_LIST, 184);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, MyGlb.PANEL_LIST, "ACCANT EFF CONTRIB PA 40200");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, MyGlb.PANEL_FORM, 4, 772, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, MyGlb.PANEL_FORM, 184);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOPA40, MyGlb.PANEL_FORM, "ACCANT EFF CONTRIB PA 40200");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCEFFCOPA40, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCEFFCOPA40, PPQRY_BILACCFCDDE1, "A.ACCANT_EFF_CONTRIB_PA_40200", "ACCANT_EFF_CONTRIB_PA_40200", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, MyGlb.PANEL_LIST, 0, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, MyGlb.PANEL_LIST, 192);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, MyGlb.PANEL_LIST, "ACCANT PERC CONTRIB PA 40200");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, MyGlb.PANEL_FORM, 4, 772, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, MyGlb.PANEL_FORM, 192);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOPA40, MyGlb.PANEL_FORM, "ACCANT PERC CONTRIB PA 40200");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCPERCOPA40, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCPERCOPA40, PPQRY_BILACCFCDDE1, "A.ACCANT_PERC_CONTRIB_PA_40200", "ACCANT_PERC_CONTRIB_PA_40200", 3, 5, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, MyGlb.PANEL_LIST, 8, 44, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, MyGlb.PANEL_LIST, 184);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, MyGlb.PANEL_LIST, "ACCANT OBB CONTRIB UE 40200");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, MyGlb.PANEL_FORM, 12, 780, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, MyGlb.PANEL_FORM, 184);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBCOUE40, MyGlb.PANEL_FORM, "ACCANT OBB CONTRIB UE 40200");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCOBBCOUE40, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCOBBCOUE40, PPQRY_BILACCFCDDE1, "A.ACCANT_OBB_CONTRIB_UE_40200", "ACCANT_OBB_CONTRIB_UE_40200", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, MyGlb.PANEL_LIST, 0, 36, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, MyGlb.PANEL_LIST, 180);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, MyGlb.PANEL_LIST, "ACCANT EFF CONTRIB UE 40200");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, MyGlb.PANEL_FORM, 4, 772, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, MyGlb.PANEL_FORM, 180);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFCOUE40, MyGlb.PANEL_FORM, "ACCANT EFF CONTRIB UE 40200");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCEFFCOUE40, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCEFFCOUE40, PPQRY_BILACCFCDDE1, "A.ACCANT_EFF_CONTRIB_UE_40200", "ACCANT_EFF_CONTRIB_UE_40200", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, MyGlb.PANEL_LIST, 8, 44, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, MyGlb.PANEL_LIST, 192);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, MyGlb.PANEL_LIST, "ACCANT PERC CONTRIB UE 40200");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, MyGlb.PANEL_FORM, 12, 780, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, MyGlb.PANEL_FORM, 192);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERCOUE40, MyGlb.PANEL_FORM, "ACCANT PERC CONTRIB UE 40200");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCPERCOUE40, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCPERCOUE40, PPQRY_BILACCFCDDE1, "A.ACCANT_PERC_CONTRIB_UE_40200", "ACCANT_PERC_CONTRIB_UE_40200", 3, 5, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, MyGlb.PANEL_LIST, 0, 36, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, MyGlb.PANEL_LIST, 172);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, MyGlb.PANEL_LIST, "ACCANT OBB TRASF PA 40300");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, MyGlb.PANEL_FORM, 4, 772, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, MyGlb.PANEL_FORM, 172);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRPA40, MyGlb.PANEL_FORM, "ACCANT OBB TRASF PA 40300");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCOBBTRPA40, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCOBBTRPA40, PPQRY_BILACCFCDDE1, "A.ACCANT_OBB_TRASF_PA_40300", "ACCANT_OBB_TRASF_PA_40300", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, MyGlb.PANEL_LIST, 168);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, MyGlb.PANEL_LIST, "ACCANT EFF TRASF PA 40300");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, MyGlb.PANEL_FORM, 4, 772, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, MyGlb.PANEL_FORM, 168);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRPA40, MyGlb.PANEL_FORM, "ACCANT EFF TRASF PA 40300");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCEFFTRPA40, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCEFFTRPA40, PPQRY_BILACCFCDDE1, "A.ACCANT_EFF_TRASF_PA_40300", "ACCANT_EFF_TRASF_PA_40300", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, MyGlb.PANEL_LIST, 0, 36, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, MyGlb.PANEL_LIST, 180);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, MyGlb.PANEL_LIST, "ACCANT PERC TRASF PA 40300");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, MyGlb.PANEL_FORM, 4, 772, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, MyGlb.PANEL_FORM, 180);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRPA40, MyGlb.PANEL_FORM, "ACCANT PERC TRASF PA 40300");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCPERTRPA40, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCPERTRPA40, PPQRY_BILACCFCDDE1, "A.ACCANT_PERC_TRASF_PA_40300", "ACCANT_PERC_TRASF_PA_40300", 3, 5, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, MyGlb.PANEL_LIST, 8, 44, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, MyGlb.PANEL_LIST, 172);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, MyGlb.PANEL_LIST, "ACCANT OBB TRASF UE 40300");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, MyGlb.PANEL_FORM, 12, 780, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, MyGlb.PANEL_FORM, 172);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCOBBTRUE40, MyGlb.PANEL_FORM, "ACCANT OBB TRASF UE 40300");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCOBBTRUE40, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCOBBTRUE40, PPQRY_BILACCFCDDE1, "A.ACCANT_OBB_TRASF_UE_40300", "ACCANT_OBB_TRASF_UE_40300", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, MyGlb.PANEL_LIST, 8, 44, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, MyGlb.PANEL_LIST, 168);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, MyGlb.PANEL_LIST, "ACCANT EFF TRASF UE 40300");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, MyGlb.PANEL_FORM, 12, 780, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, MyGlb.PANEL_FORM, 168);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCEFFTRUE40, MyGlb.PANEL_FORM, "ACCANT EFF TRASF UE 40300");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCEFFTRUE40, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCEFFTRUE40, PPQRY_BILACCFCDDE1, "A.ACCANT_EFF_TRASF_UE_40300", "ACCANT_EFF_TRASF_UE_40300", 3, 14, 2, -13997);
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, MyGlb.PANEL_LIST, 8, 44, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, MyGlb.PANEL_LIST, 180);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, MyGlb.PANEL_LIST, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, MyGlb.PANEL_LIST, "ACCANT PERC TRASF UE 40300");
    PAN_FCDDE.SetRect(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, MyGlb.PANEL_FORM, 12, 780, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FCDDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, MyGlb.PANEL_FORM, 180);
    PAN_FCDDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, MyGlb.PANEL_FORM, 1);
    PAN_FCDDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FCDDE_ACCPERTRUE40, MyGlb.PANEL_FORM, "ACCANT PERC TRASF UE 40300");
    PAN_FCDDE.SetFieldPage(PFL_FCDDE_ACCPERTRUE40, -1, -1);
    PAN_FCDDE.SetFieldPanel(PFL_FCDDE_ACCPERTRUE40, PPQRY_BILACCFCDDE1, "A.ACCANT_PERC_TRASF_UE_40300", "ACCANT_PERC_TRASF_UE_40300", 3, 5, 2, -13997);
  }

  private void PAN_FCDDE_InitQueries()
  {
    StringBuffer SQL;

    PAN_FCDDE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FCDDE.SetIMDB(IMDB, "PQRY_BILACCFCDDE1", true);
    PAN_FCDDE.set_SetString(MyGlb.MASTER_ROWNAME, "BIL ACC FCDDE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.ESERCIZIO_PLUR as ESERCIZIO_PLUR, ");
    SQL.append("  A.STN_10101 as STN_10101, ");
    SQL.append("  A.ACCANT_OBB_10101 as ACCANT_OBB_10101, ");
    SQL.append("  A.ACCANT_EFF_10101 as ACCANT_EFF_10101, ");
    SQL.append("  A.ACCANT_PERC_10101 as ACCANT_PERC_10101, ");
    SQL.append("  A.STN_UE_20105 as STN_UE_20105, ");
    SQL.append("  A.ACCANT_OBB_UE_20105 as ACCANT_OBB_UE_20105, ");
    SQL.append("  A.ACCANT_EFF_UE_20105 as ACCANT_EFF_UE_20105, ");
    SQL.append("  A.ACCANT_PERC_UE_20105 as ACCANT_PERC_UE_20105, ");
    SQL.append("  A.STN_MONDO_20105 as STN_MONDO_20105, ");
    SQL.append("  A.ACCANT_OBB_MONDO_20105 as ACCANT_OBB_MONDO_20105, ");
    SQL.append("  A.ACCANT_EFF_MONDO_20105 as ACCANT_EFF_MONDO_20105, ");
    SQL.append("  A.ACCANT_PERC_MONDO_20105 as ACCANT_PERC_MONDO_20105, ");
    SQL.append("  A.STN_CONTRIB_PA_40200 as STN_CONTRIB_PA_40200, ");
    SQL.append("  A.ACCANT_OBB_CONTRIB_PA_40200 as ACCANT_OBB_CONTRIB_PA_40200, ");
    SQL.append("  A.ACCANT_EFF_CONTRIB_PA_40200 as ACCANT_EFF_CONTRIB_PA_40200, ");
    SQL.append("  A.ACCANT_PERC_CONTRIB_PA_40200 as ACCANT_PERC_CONTRIB_PA_40200, ");
    SQL.append("  A.STN_CONTRIB_UE_40200 as STN_CONTRIB_UE_40200, ");
    SQL.append("  A.ACCANT_OBB_CONTRIB_UE_40200 as ACCANT_OBB_CONTRIB_UE_40200, ");
    SQL.append("  A.ACCANT_EFF_CONTRIB_UE_40200 as ACCANT_EFF_CONTRIB_UE_40200, ");
    SQL.append("  A.ACCANT_PERC_CONTRIB_UE_40200 as ACCANT_PERC_CONTRIB_UE_40200, ");
    SQL.append("  A.STN_TRASF_PA_40300 as STN_TRASF_PA_40300, ");
    SQL.append("  A.ACCANT_OBB_TRASF_PA_40300 as ACCANT_OBB_TRASF_PA_40300, ");
    SQL.append("  A.ACCANT_EFF_TRASF_PA_40300 as ACCANT_EFF_TRASF_PA_40300, ");
    SQL.append("  A.ACCANT_PERC_TRASF_PA_40300 as ACCANT_PERC_TRASF_PA_40300, ");
    SQL.append("  A.STN_TRASF_UE_40300 as STN_TRASF_UE_40300, ");
    SQL.append("  A.ACCANT_OBB_TRASF_UE_40300 as ACCANT_OBB_TRASF_UE_40300, ");
    SQL.append("  A.ACCANT_EFF_TRASF_UE_40300 as ACCANT_EFF_TRASF_UE_40300, ");
    SQL.append("  A.ACCANT_PERC_TRASF_UE_40300 as ACCANT_PERC_TRASF_UE_40300 ");
    PAN_FCDDE.SetQuery(PPQRY_BILACCFCDDE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_ACC_FCDDE A ");
    PAN_FCDDE.SetQuery(PPQRY_BILACCFCDDE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ESERCIZIO_PLUR = ~~TBL_PARASTAMFCD1.PARAESERPLUR~~) ");
    PAN_FCDDE.SetQuery(PPQRY_BILACCFCDDE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FCDDE.SetQuery(PPQRY_BILACCFCDDE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FCDDE.SetQuery(PPQRY_BILACCFCDDE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FCDDE.SetQuery(PPQRY_BILACCFCDDE1, 5, SQL, -1, "");
    PAN_FCDDE.SetQueryDB(PPQRY_BILACCFCDDE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FCDDE.SetMasterTable(0, "BIL_ACC_FCDDE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FCDDE.Status() == 2)
    {
      int oldListQBE = PAN_FCDDE.iUseListQBE;
      PAN_FCDDE.iUseListQBE = 0;
      PAN_FCDDE.PanelCommand(Glb.PCM_SEARCH);
      PAN_FCDDE.PanelCommand(Glb.PCM_FIND);
      PAN_FCDDE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FCDDE) PAN_FCDDE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FCDDE) PAN_FCDDE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FCDDE) PAN_FCDDE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FCDDE) PAN_FCDDE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FCDDE) PAN_FCDDE_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_FCDDE) PAN_FCDDE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
