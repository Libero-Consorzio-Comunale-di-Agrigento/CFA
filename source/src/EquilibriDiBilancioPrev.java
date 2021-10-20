// **********************************************
// Equilibri Di Bilancio Prev
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EquilibriDiBilancioPrev extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_EQUILDIBILAN_IMPORTOAA = 0;
  private static int PFL_EQUILDIBILAN_ESERCIZIO = 1;
  private static int PFL_EQUILDIBILAN_IMPORTOAA1 = 2;
  private static int PFL_EQUILDIBILAN_IMPORTOAA2 = 3;
  private static int PFL_EQUILDIBILAN_IMPORTOBEST = 4;
  private static int PFL_EQUILDIBILAN_IMPORTOBEST1 = 5;
  private static int PFL_EQUILDIBILAN_IMPORTOBEST2 = 6;
  private static int PFL_EQUILDIBILAN_IMPORTOFEST = 7;
  private static int PFL_EQUILDIBILAN_IMPORTOFEST1 = 8;
  private static int PFL_EQUILDIBILAN_IMPORTOFEST2 = 9;
  private static int PFL_EQUILDIBILAN_FONDANTILIQ1 = 10;
  private static int PFL_EQUILDIBILAN_FONDANTILIQ2 = 11;
  private static int PFL_EQUILDIBILAN_FONDANTILIQ3 = 12;
  private static int PFL_EQUILDIBILAN_IMPORTOH = 13;
  private static int PFL_EQUILDIBILAN_IMPORTOH1 = 14;
  private static int PFL_EQUILDIBILAN_IMPORTOH2 = 15;
  private static int PFL_EQUILDIBILAN_IMPORTOHEST = 16;
  private static int PFL_EQUILDIBILAN_IMPORTOHEST1 = 17;
  private static int PFL_EQUILDIBILAN_IMPORTOHEST2 = 18;
  private static int PFL_EQUILDIBILAN_IMPORTOI = 19;
  private static int PFL_EQUILDIBILAN_IMPORTOI1 = 20;
  private static int PFL_EQUILDIBILAN_IMPORTOI2 = 21;
  private static int PFL_EQUILDIBILAN_IMPORTOIEST = 22;
  private static int PFL_EQUILDIBILAN_IMPORTOIEST1 = 23;
  private static int PFL_EQUILDIBILAN_IMPORTOIEST2 = 24;
  private static int PFL_EQUILDIBILAN_IMPORTOL = 25;
  private static int PFL_EQUILDIBILAN_IMPORTOL1 = 26;
  private static int PFL_EQUILDIBILAN_IMPORTOL2 = 27;
  private static int PFL_EQUILDIBILAN_IMPORTOM = 28;
  private static int PFL_EQUILDIBILAN_IMPORTOM1 = 29;
  private static int PFL_EQUILDIBILAN_IMPORTOM2 = 30;
  private static int PFL_EQUILDIBILAN_IMPORTOP = 31;
  private static int PFL_EQUILDIBILAN_IMPORTOP1 = 32;
  private static int PFL_EQUILDIBILAN_IMPORTOP2 = 33;
  private static int PFL_EQUILDIBILAN_RAFONANTLIQ1 = 34;
  private static int PFL_EQUILDIBILAN_ETICHEELABOR = 35;
  private static int PFL_EQUILDIBILAN_ETICHECOMPET = 36;
  private static int PFL_EQUILDIBILAN_ETICHECOMPE1 = 37;
  private static int PFL_EQUILDIBILAN_ETICHECOMPE2 = 38;
  private static int PFL_EQUILDIBILAN_RAFONANTLIQ2 = 39;
  private static int PFL_EQUILDIBILAN_RAFONANTLIQ3 = 40;

  private static int PPQRY_BILCONSEQUI2 = 0;


  IDPanel PAN_EQUILDIBILAN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI668(IMDB);
    //
    //
    Init_PQRY_BILCONSEQUI2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI668(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI668, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI668, "TBL_PARAMETRI668");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI668,IMDBDef3.FLD_PARAMETRI668_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI668,IMDBDef3.FLD_PARAMETRI668_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI668,IMDBDef3.FLD_PARAMETRI668_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI668,IMDBDef3.FLD_PARAMETRI668_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI668,IMDBDef3.FLD_PARAMETRI668_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI668,IMDBDef3.FLD_PARAMETRI668_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI668,IMDBDef3.FLD_PARAMETRI668_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI668,IMDBDef3.FLD_PARAMETRI668_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI668,IMDBDef3.FLD_PARAMETRI668_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI668,IMDBDef3.FLD_PARAMETRI668_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI668,IMDBDef3.FLD_PARAMETRI668_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI668,IMDBDef3.FLD_PARAMETRI668_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI668, 0);
  }

  private static void Init_PQRY_BILCONSEQUI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILCONSEQUI2, 37);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILCONSEQUI2, "PQRY_BILCONSEQUI2");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_AA, "IMPORTO_AA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_AA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_B_EST, "IMPORTO_B_EST");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_B_EST,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_F_EST, "IMPORTO_F_EST");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_F_EST,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H, "IMPORTO_H");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H_EST, "IMPORTO_H_EST");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H_EST,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I, "IMPORTO_I");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I_EST, "IMPORTO_I_EST");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I_EST,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_L, "IMPORTO_L");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_L,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_M, "IMPORTO_M");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_M,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_P, "IMPORTO_P");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_P,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_AA_1, "IMPORTO_AA_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_AA_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_AA_2, "IMPORTO_AA_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_AA_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_B_EST_1, "IMPORTO_B_EST_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_B_EST_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_B_EST_2, "IMPORTO_B_EST_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_B_EST_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_F_EST_1, "IMPORTO_F_EST_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_F_EST_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_F_EST_2, "IMPORTO_F_EST_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_F_EST_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H_1, "IMPORTO_H_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H_2, "IMPORTO_H_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H_EST_1, "IMPORTO_H_EST_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H_EST_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H_EST_2, "IMPORTO_H_EST_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H_EST_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I_1, "IMPORTO_I_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I_2, "IMPORTO_I_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I_EST_1, "IMPORTO_I_EST_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I_EST_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I_EST_2, "IMPORTO_I_EST_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I_EST_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_L_1, "IMPORTO_L_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_L_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_L_2, "IMPORTO_L_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_L_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_M_1, "IMPORTO_M_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_M_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_M_2, "IMPORTO_M_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_M_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_P_1, "IMPORTO_P_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_P_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_P_2, "IMPORTO_P_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_P_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_FONDO_ANTIC_LIQUIDITA_1, "FONDO_ANTIC_LIQUIDITA_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_FONDO_ANTIC_LIQUIDITA_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_FONDO_ANTIC_LIQUIDITA_2, "FONDO_ANTIC_LIQUIDITA_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_FONDO_ANTIC_LIQUIDITA_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_FONDO_ANTIC_LIQUIDITA_3, "FONDO_ANTIC_LIQUIDITA_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_FONDO_ANTIC_LIQUIDITA_3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_RA_FONDO_ANTIC_LIQUIDITA_1, "RA_FONDO_ANTIC_LIQUIDITA_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_RA_FONDO_ANTIC_LIQUIDITA_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_RA_FONDO_ANTIC_LIQUIDITA_2, "RA_FONDO_ANTIC_LIQUIDITA_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_RA_FONDO_ANTIC_LIQUIDITA_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_RA_FONDO_ANTIC_LIQUIDITA_3, "RA_FONDO_ANTIC_LIQUIDITA_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILCONSEQUI2,IMDBDef11.PQSL_BILCONSEQUI2_RA_FONDO_ANTIC_LIQUIDITA_3,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILCONSEQUI2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EquilibriDiBilancioPrev(MyWebEntryPoint w, IMDBObj imdb)
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
  public EquilibriDiBilancioPrev()
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
    FormIdx = MyGlb.FRM_EQUIDIBILPRE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E596323D-C14E-41A5-8248-B28F4E194317";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1068;
    DesignHeight = 526;
    set_Caption(new IDVariant("Equilibri di Bilancio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1068;
    Frames[1].Height = 500;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Equilibri di Bilancio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 500;
    PAN_EQUILDIBILAN = new IDPanel(w, this, 1, "PAN_EQUILDIBILAN");
    Frames[1].Content = PAN_EQUILDIBILAN;
    PAN_EQUILDIBILAN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_EQUILDIBILAN.VS = MainFrm.VisualStyleList;
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1068-MyGlb.PAN_OFFS_X, 500-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9E6A0C08-626F-4FD0-A6F8-333473E0B06C");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3284, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_EQUILDIBILAN.InitStatus = 2;
    PAN_EQUILDIBILAN_Init();
    PAN_EQUILDIBILAN_InitFields();
    PAN_EQUILDIBILAN_InitQueries();
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
      PAN_EQUILDIBILAN.UpdatePanel(MainFrm);
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
    return (obj instanceof EquilibriDiBilancioPrev);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EquilibriDiBilancioPrev.class.getName() : (Glb.ClassWithPackage(EquilibriDiBilancioPrev.class) ? EquilibriDiBilancioPrev.class.getName().substring(EquilibriDiBilancioPrev.class.getPackage().getName().length() + 1) : EquilibriDiBilancioPrev.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Equilibri Di Bilancio On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_EQUILDIBILAN_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Equilibri Di Bilancio On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILCONSEQUI2, IMDBDef11.PQSL_BILCONSEQUI2_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI2, IMDBDef11.PQSL_BILCONSEQUI2_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI2, IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_AA, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI2, IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_B_EST, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI2, IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_F_EST, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI2, IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI2, IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_H_EST, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI2, IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI2, IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_I_EST, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI2, IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_L, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILCONSEQUI2, IMDBDef11.PQSL_BILCONSEQUI2_IMPORTO_M, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriDiBilancioPrev", "EquilibriDiBilancioOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Equilibri Di Bilancio After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_EQUILDIBILAN_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Equilibri Di Bilancio After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_EQUILDIBILAN.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_EQUILDIBILAN.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriDiBilancioPrev", "EquilibriDiBilancioAfterFind", _e);
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
      if (new IDVariant(PAN_EQUILDIBILAN.Status()).equals((new IDVariant(3)), true))
      {
        PAN_EQUILDIBILAN.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_EQUILDIBILAN.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPEPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARANOTESTAM, 0), (new IDVariant()));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
        v_PAR1 = (new IDVariant("SESSIONE"));
        IDVariant v_PAR2 = new IDVariant(0,IDVariant.STRING);
        v_PAR2 = (new IDVariant("ESERCIZIO"));
        MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper(v_PAR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriDiBilancioPrev", "EtichettaElabora", _e);
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
      PAN_EQUILDIBILAN.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_EQUILDIBILAN.set_FieldText(PFL_EQUILDIBILAN_ETICHECOMPET, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_EQUILDIBILAN.set_FieldText(PFL_EQUILDIBILAN_ETICHECOMPE1, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_EQUILDIBILAN.set_FieldText(PFL_EQUILDIBILAN_ETICHECOMPE2, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriDiBilancioPrev", "Load", _e);
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
      if (new IDVariant(PAN_EQUILDIBILAN.Status()).equals((new IDVariant(3)), true))
      {
        PAN_EQUILDIBILAN.PanelCommand(Glb.PCM_CANCEL);
      }
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriDiBilancioPrev", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARANOMESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARSTANUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARANOTESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARAMIDSTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARANOMEFILE, 0, new IDVariant());
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
  private void PAN_EQUILDIBILAN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_EQUILDIBILAN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_EQUILDIBILAN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_EQUILDIBILAN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_EQUILDIBILAN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_EQUILDIBILAN);
    // Stub
  }

  private void PAN_EQUILDIBILAN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_EQUILDIBILAN_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_EQUILDIBILAN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_EQUILDIBILAN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_EQUILDIBILAN_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_EQUILDIBILAN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_EQUILDIBILAN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_EQUILDIBILAN_Init()
  {

    PAN_EQUILDIBILAN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_EQUILDIBILAN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_EQUILDIBILAN.SetSize(MyGlb.OBJ_FIELD, 41);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, "90C8C27F-1A1C-404F-ACF2-7EF9F418DAB0");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, "AA) Recupero disavanzo di amministrazione esercizio precedente");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, "1DEC4894-E108-4B40-B40A-9A8D3372C5DC");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, "ESERCIZIO");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, "427DF495-6A04-4B4A-8A08-9EC728E404AB");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, "IMPORTO AA 1");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, "B4053138-44D1-4CD2-B05B-858ADB659C56");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, "IMPORTO AA 2");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, "A1ED9558-6EC4-4EAA-94EA-3D99B5E5CDF7");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, "B) Entrate Titoli 1.00 - 2.00 - 3.00 - Estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, "B3A2052C-91D3-4AC0-BE0D-5E8DCCFAD0A6");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, "IMPORTO B EST 1");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, "77119F85-43BD-44FE-84D1-A2C84E3F8F37");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, "IMPORTO B EST 2");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, "77ECE5C1-2BDD-45D9-A806-AF2C39739AA7");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, "F) Spese Titolo 4 - Estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, "E6C50923-EC7A-4C4C-9B23-B3B05C8121DD");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, "IMPORTO F EST 1");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, "35C8D4B8-75E8-4BBF-8A7F-E5237550665A");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, "IMPORTO F EST 2");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, "9D8A5418-2A6D-4FAD-B05E-44F3A09C8657");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, "     di cui Fondo anticipazioni di liquidità ");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, "3A816338-2492-4862-8651-79D99B96E54F");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, "FONDO ANTIC LIQUIDITA 2");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, "7D5E5B28-40D4-4848-AEBE-616F1704253D");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, "FONDO ANTIC LIQUIDITA 3");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, "406069F0-57FA-42CB-9242-476DB687A520");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, "H) Utilizzo risultato di amministrazione presunto per spese correnti e per rimborso dei prestiti");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, "51CE9E0E-09DE-4CA0-8068-874DB4AB1A0C");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, "IMPORTO H 1");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, "732132EF-B784-4FB2-A498-F8D2E7226756");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, "IMPORTO H 2");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, "61ADA498-F407-4D5B-90E6-DD4DF30843ED");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, "     di cui estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, "D1ED779B-534C-46CC-9038-47B0B8CB7655");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, "IMPORTO H EST 1");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, "7A3BBE6E-97F9-4A60-8C91-CD6140E04163");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, "IMPORTO H EST 2");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, "71E7E829-C568-4C44-B67D-3CE57601A09F");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, "I) Entrate di parte capitale destinate a spese correnti in base a specifiche disposizioni di legge");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, "3F3CED19-1120-4AD7-B2CF-169503801E33");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, "IMPORTO I 1");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, "7849B081-6E20-418E-8A0A-BE8385A5CE3C");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, "IMPORTO I 2");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, "24DD83BC-88D5-4904-87DD-805A1AE27B3E");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, "     di cui estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, "E6737F60-C3B7-4238-820E-EEA6E4A47620");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, "IMPORTO I EST 1");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, "1A9E5DF6-922F-43D2-B067-2C4D871AAA0E");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, "IMPORTO I EST 2");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, "DAF7318C-0CC4-458C-B36C-6E9AC7D6E50A");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, "L) Entrate di parte corrente destinate a spese di investimento in base a specifiche disposizioni di legge");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, "54CB982F-8614-468D-9897-E7336E2596ED");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, "IMPORTO L 1");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, "68C68544-6C74-43D7-89F5-3F23F4AAD36F");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, "IMPORTO L 2");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, "A6B487F1-5BA0-47C6-9D31-7670C481E3DA");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, "M) Entrate da accensioni di prestiti destinate a estinzione anticipata dei prestiti");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, "BC11CFA3-9C65-4ECF-80A5-FB37D7321C3C");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, "IMPORTO M 1");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, "6A81C760-448E-43B6-9B10-6F03E2981225");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, "IMPORTO M 2");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, "14C08274-0305-4173-B6BC-9E8E1CCC2385");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, "P) Utilizzo avanzo di amministrazione per spese di investimento");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, "FC7C8B62-23EB-44B0-B581-8C63031E570D");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, "IMPORTO P 1");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, "97B01003-7533-4DDF-8643-43EE1EE61F65");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, "IMPORTO P 2");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, "54BAFECD-377D-49DF-9D9B-5C017AF51A5B");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, "di cui fondo anticipazione di liquidità da sottrarre al parametro (H) nella sezione Saldo corrente ai fini della copertura degli investimenti pluriennali");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, "BE62B516-7C55-49E4-BC59-77C579BFE67A");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, "Elabora");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_EQUILDIBILAN.SetImage(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, 0, "button1.gif", false);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, "A5CC0954-E014-40C9-ADF8-E1027668E856");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, "Competenza");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.VIS_VUOTOGRASSET);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE1, "FCBFFD6E-C485-4B06-9358-0E420B572462");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE1, "Competenza");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE1, MyGlb.VIS_VUOTOGRASSET);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE2, "1688A346-5138-4750-8EB7-5E43FD73A6DB");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE2, "Competenza");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE2, MyGlb.VIS_VUOTOGRASSET);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, "D4E1DF62-9DCD-493F-B479-78E3D5FB7575");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, "RA FONDO ANTIC LIQUIDITA 2");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, MyGlb.VIS_NORFIECF4IMP);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, "C0CF64C7-7E3F-494F-B748-AB7D0871BF73");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, "RA FONDO ANTIC LIQUIDITA 3");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, MyGlb.VIS_NORFIECF4IMP);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_EQUILDIBILAN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_LIST, 80);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_LIST, "A. R. d. d. a. e. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_FORM, 16, 40, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_FORM, "AA) Recupero disavanzo di amministrazione esercizio precedente");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOAA, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOAA, PPQRY_BILCONSEQUI2, "A.IMPORTO_AA", "IMPORTO_AA", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_FORM, 112);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_ESERCIZIO, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_ESERCIZIO, PPQRY_BILCONSEQUI2, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, MyGlb.PANEL_LIST, 92);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, MyGlb.PANEL_LIST, "IMPORTO AA 1");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, MyGlb.PANEL_FORM, 736, 40, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, MyGlb.PANEL_FORM, 92);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA1, MyGlb.PANEL_FORM, "IMPORTO AA 1");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOAA1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOAA1, PPQRY_BILCONSEQUI2, "A.IMPORTO_AA_1", "IMPORTO_AA_1", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, MyGlb.PANEL_LIST, 92);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, MyGlb.PANEL_LIST, "IMPORTO AA 2");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, MyGlb.PANEL_FORM, 868, 40, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, MyGlb.PANEL_FORM, 92);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA2, MyGlb.PANEL_FORM, "IMPORTO AA 2");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOAA2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOAA2, PPQRY_BILCONSEQUI2, "A.IMPORTO_AA_2", "IMPORTO_AA_2", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_LIST, 96);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_LIST, "B E. T. 1 0. 2 0. 3 0. E. a. d. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_FORM, 16, 76, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_FORM, "B) Entrate Titoli 1.00 - 2.00 - 3.00 - Estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOBEST, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOBEST, PPQRY_BILCONSEQUI2, "A.IMPORTO_B_EST", "IMPORTO_B_EST", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, MyGlb.PANEL_LIST, 104);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, MyGlb.PANEL_LIST, "IMPORTO B EST 1");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, MyGlb.PANEL_FORM, 736, 76, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, MyGlb.PANEL_FORM, 104);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST1, MyGlb.PANEL_FORM, "IMPORTO B EST 1");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOBEST1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOBEST1, PPQRY_BILCONSEQUI2, "A.IMPORTO_B_EST_1", "IMPORTO_B_EST_1", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, MyGlb.PANEL_LIST, 104);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, MyGlb.PANEL_LIST, "IMPORTO B EST 2");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, MyGlb.PANEL_FORM, 868, 76, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, MyGlb.PANEL_FORM, 104);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST2, MyGlb.PANEL_FORM, "IMPORTO B EST 2");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOBEST2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOBEST2, PPQRY_BILCONSEQUI2, "A.IMPORTO_B_EST_2", "IMPORTO_B_EST_2", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_LIST, 96);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_LIST, "F S. T. 4 E. a. d. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_FORM, 16, 112, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_FORM, "F) Spese Titolo 4 - Estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOFEST, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOFEST, PPQRY_BILCONSEQUI2, "A.IMPORTO_F_EST", "IMPORTO_F_EST", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, MyGlb.PANEL_LIST, 104);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, MyGlb.PANEL_LIST, "IMPORTO F EST 1");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, MyGlb.PANEL_FORM, 736, 112, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, MyGlb.PANEL_FORM, 104);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST1, MyGlb.PANEL_FORM, "IMPORTO F EST 1");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOFEST1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOFEST1, PPQRY_BILCONSEQUI2, "A.IMPORTO_F_EST_1", "IMPORTO_F_EST_1", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, MyGlb.PANEL_LIST, 104);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, MyGlb.PANEL_LIST, "IMPORTO F EST 2");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, MyGlb.PANEL_FORM, 868, 112, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, MyGlb.PANEL_FORM, 104);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST2, MyGlb.PANEL_FORM, "IMPORTO F EST 2");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOFEST2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOFEST2, PPQRY_BILCONSEQUI2, "A.IMPORTO_F_EST_2", "IMPORTO_F_EST_2", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, MyGlb.PANEL_LIST, 156);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, MyGlb.PANEL_LIST, "     di cui Fondo anticipazioni di liquidità ");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, MyGlb.PANEL_FORM, 16, 136, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ1, MyGlb.PANEL_FORM, "     di cui Fondo anticipazioni di liquidità ");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_FONDANTILIQ1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_FONDANTILIQ1, PPQRY_BILCONSEQUI2, "A.FONDO_ANTIC_LIQUIDITA_1", "FONDO_ANTIC_LIQUIDITA_1", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, MyGlb.PANEL_LIST, 156);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, MyGlb.PANEL_LIST, "FONDO ANTIC LIQUIDITA 2");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, MyGlb.PANEL_FORM, 736, 136, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, MyGlb.PANEL_FORM, 156);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ2, MyGlb.PANEL_FORM, "FONDO ANTIC LIQUIDITA 2");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_FONDANTILIQ2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_FONDANTILIQ2, PPQRY_BILCONSEQUI2, "A.FONDO_ANTIC_LIQUIDITA_2", "FONDO_ANTIC_LIQUIDITA_2", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, MyGlb.PANEL_LIST, 156);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, MyGlb.PANEL_LIST, "FONDO ANTIC LIQUIDITA 3");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, MyGlb.PANEL_FORM, 868, 136, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, MyGlb.PANEL_FORM, 156);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQ3, MyGlb.PANEL_FORM, "FONDO ANTIC LIQUIDITA 3");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_FONDANTILIQ3, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_FONDANTILIQ3, PPQRY_BILCONSEQUI2, "A.FONDO_ANTIC_LIQUIDITA_3", "FONDO_ANTIC_LIQUIDITA_3", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_LIST, 72);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_LIST, "H U. r. d. a. p. p. s. c. e p. r. d. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_FORM, 16, 176, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_FORM, "H) Utilizzo risultato di amministrazione presunto per spese correnti e per rimborso dei prestiti");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOH, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOH, PPQRY_BILCONSEQUI2, "A.IMPORTO_H", "IMPORTO_H", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, MyGlb.PANEL_LIST, 84);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, MyGlb.PANEL_LIST, "IMPORTO H 1");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, MyGlb.PANEL_FORM, 736, 176, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, MyGlb.PANEL_FORM, 84);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH1, MyGlb.PANEL_FORM, "IMPORTO H 1");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOH1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOH1, PPQRY_BILCONSEQUI2, "A.IMPORTO_H_1", "IMPORTO_H_1", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, MyGlb.PANEL_LIST, 84);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, MyGlb.PANEL_LIST, "IMPORTO H 2");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, MyGlb.PANEL_FORM, 868, 176, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, MyGlb.PANEL_FORM, 84);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH2, MyGlb.PANEL_FORM, "IMPORTO H 2");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOH2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOH2, PPQRY_BILCONSEQUI2, "A.IMPORTO_H_2", "IMPORTO_H_2", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_LIST, 96);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_LIST, "d. c. e. a. d. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_FORM, 16, 200, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_FORM, "     di cui estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOHEST, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOHEST, PPQRY_BILCONSEQUI2, "A.IMPORTO_H_EST", "IMPORTO_H_EST", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, MyGlb.PANEL_LIST, 108);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, MyGlb.PANEL_LIST, "IMPORTO H EST 1");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, MyGlb.PANEL_FORM, 736, 200, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, MyGlb.PANEL_FORM, 108);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST1, MyGlb.PANEL_FORM, "IMPORTO H EST 1");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOHEST1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOHEST1, PPQRY_BILCONSEQUI2, "A.IMPORTO_H_EST_1", "IMPORTO_H_EST_1", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, MyGlb.PANEL_LIST, 108);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, MyGlb.PANEL_LIST, "IMPORTO H EST 2");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, MyGlb.PANEL_FORM, 868, 200, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, MyGlb.PANEL_FORM, 108);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST2, MyGlb.PANEL_FORM, "IMPORTO H EST 2");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOHEST2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOHEST2, PPQRY_BILCONSEQUI2, "A.IMPORTO_H_EST_2", "IMPORTO_H_EST_2", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_LIST, 72);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_LIST, "I E. d. p. c. d. a s. c. i. b. a s. d. d. l.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_FORM, 16, 236, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_FORM, "I) Entrate di parte capitale destinate a spese correnti in base a specifiche disposizioni di legge");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOI, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOI, PPQRY_BILCONSEQUI2, "A.IMPORTO_I", "IMPORTO_I", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, MyGlb.PANEL_LIST, 80);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, MyGlb.PANEL_LIST, "IMPORTO I 1");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, MyGlb.PANEL_FORM, 736, 236, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, MyGlb.PANEL_FORM, 80);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI1, MyGlb.PANEL_FORM, "IMPORTO I 1");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOI1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOI1, PPQRY_BILCONSEQUI2, "A.IMPORTO_I_1", "IMPORTO_I_1", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, MyGlb.PANEL_LIST, 80);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, MyGlb.PANEL_LIST, "IMPORTO I 2");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, MyGlb.PANEL_FORM, 868, 236, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, MyGlb.PANEL_FORM, 80);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI2, MyGlb.PANEL_FORM, "IMPORTO I 2");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOI2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOI2, PPQRY_BILCONSEQUI2, "A.IMPORTO_I_2", "IMPORTO_I_2", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_LIST, 92);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_LIST, "d. c. e. a. d. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_FORM, 16, 260, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_FORM, "     di cui estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOIEST, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOIEST, PPQRY_BILCONSEQUI2, "A.IMPORTO_I_EST", "IMPORTO_I_EST", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, MyGlb.PANEL_LIST, 104);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, MyGlb.PANEL_LIST, "IMPORTO I EST 1");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, MyGlb.PANEL_FORM, 736, 260, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, MyGlb.PANEL_FORM, 104);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST1, MyGlb.PANEL_FORM, "IMPORTO I EST 1");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOIEST1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOIEST1, PPQRY_BILCONSEQUI2, "A.IMPORTO_I_EST_1", "IMPORTO_I_EST_1", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, MyGlb.PANEL_LIST, 104);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, MyGlb.PANEL_LIST, "IMPORTO I EST 2");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, MyGlb.PANEL_FORM, 868, 260, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, MyGlb.PANEL_FORM, 104);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST2, MyGlb.PANEL_FORM, "IMPORTO I EST 2");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOIEST2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOIEST2, PPQRY_BILCONSEQUI2, "A.IMPORTO_I_EST_2", "IMPORTO_I_EST_2", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_LIST, 72);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_LIST, "L E. d. p. c. d. a s. d. i. i. b. a s. d. d. l.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_FORM, 16, 296, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_FORM, "L) Entrate di parte corrente destinate a spese di investimento in base a specifiche disposizioni di legge");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOL, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOL, PPQRY_BILCONSEQUI2, "A.IMPORTO_L", "IMPORTO_L", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, MyGlb.PANEL_LIST, 80);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, MyGlb.PANEL_LIST, "IMPORTO L 1");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, MyGlb.PANEL_FORM, 736, 296, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, MyGlb.PANEL_FORM, 80);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL1, MyGlb.PANEL_FORM, "IMPORTO L 1");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOL1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOL1, PPQRY_BILCONSEQUI2, "A.IMPORTO_L_1", "IMPORTO_L_1", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, MyGlb.PANEL_LIST, 80);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, MyGlb.PANEL_LIST, "IMPORTO L 2");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, MyGlb.PANEL_FORM, 868, 296, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, MyGlb.PANEL_FORM, 80);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL2, MyGlb.PANEL_FORM, "IMPORTO L 2");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOL2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOL2, PPQRY_BILCONSEQUI2, "A.IMPORTO_L_2", "IMPORTO_L_2", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_LIST, 76);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_LIST, "M E. d. a. d. p. d. a e. a. d. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_FORM, 16, 332, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_FORM, "M) Entrate da accensioni di prestiti destinate a estinzione anticipata dei prestiti");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOM, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOM, PPQRY_BILCONSEQUI2, "A.IMPORTO_M", "IMPORTO_M", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, MyGlb.PANEL_LIST, 84);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, MyGlb.PANEL_LIST, "IMPORTO M 1");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, MyGlb.PANEL_FORM, 736, 332, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, MyGlb.PANEL_FORM, 84);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM1, MyGlb.PANEL_FORM, "IMPORTO M 1");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOM1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOM1, PPQRY_BILCONSEQUI2, "A.IMPORTO_M_1", "IMPORTO_M_1", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, MyGlb.PANEL_LIST, 84);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, MyGlb.PANEL_LIST, "IMPORTO M 2");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, MyGlb.PANEL_FORM, 868, 332, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, MyGlb.PANEL_FORM, 84);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM2, MyGlb.PANEL_FORM, "IMPORTO M 2");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOM2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOM2, PPQRY_BILCONSEQUI2, "A.IMPORTO_M_2", "IMPORTO_M_2", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_LIST, 72);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_LIST, "P U. a. d. am. p. s. d. in.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_FORM, 16, 364, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_FORM, "P) Utilizzo avanzo di amministrazione per spese di investimento");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOP, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOP, PPQRY_BILCONSEQUI2, "A.IMPORTO_P", "IMPORTO_P", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, MyGlb.PANEL_LIST, 84);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, MyGlb.PANEL_LIST, "IMPORTO P 1");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, MyGlb.PANEL_FORM, 736, 364, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, MyGlb.PANEL_FORM, 84);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP1, MyGlb.PANEL_FORM, "IMPORTO P 1");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOP1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOP1, PPQRY_BILCONSEQUI2, "A.IMPORTO_P_1", "IMPORTO_P_1", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, MyGlb.PANEL_LIST, 84);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, MyGlb.PANEL_LIST, "IMPORTO P 2");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, MyGlb.PANEL_FORM, 868, 364, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, MyGlb.PANEL_FORM, 84);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP2, MyGlb.PANEL_FORM, "IMPORTO P 2");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOP2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOP2, PPQRY_BILCONSEQUI2, "A.IMPORTO_P_2", "IMPORTO_P_2", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, MyGlb.PANEL_LIST, 176);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, MyGlb.PANEL_LIST, "d. c. f. ant. d. lq. d. st. a. pr. H n. sz. S. cr. a. f. d. cp. d. inv. plr.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, MyGlb.PANEL_FORM, 16, 400, 712, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, MyGlb.PANEL_FORM, 2);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ1, MyGlb.PANEL_FORM, "di cui fondo anticipazione di liquidità da sottrarre al parametro (H) nella sezione Saldo corrente ai fini della copertura degli investimenti pluriennali");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_RAFONANTLIQ1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_RAFONANTLIQ1, PPQRY_BILCONSEQUI2, "A.RA_FONDO_ANTIC_LIQUIDITA_1", "RA_FONDO_ANTIC_LIQUIDITA_1", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.PANEL_LIST, 632, 356, 96, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.PANEL_FORM, 912, 448, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_ETICHEELABOR, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.PANEL_LIST, 604, 12, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.PANEL_LIST, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.PANEL_FORM, 604, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.PANEL_FORM, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_ETICHECOMPET, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_ETICHECOMPET, -1, "", "ETICHECOMPET", 0, 0, 0, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE1, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE1, MyGlb.PANEL_LIST, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE1, MyGlb.PANEL_FORM, 736, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE1, MyGlb.PANEL_FORM, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_ETICHECOMPE1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_ETICHECOMPE1, -1, "", "ETICHECOMPE1", 0, 0, 0, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE2, MyGlb.PANEL_LIST, 620, 28, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE2, MyGlb.PANEL_LIST, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE2, MyGlb.PANEL_FORM, 868, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE2, MyGlb.PANEL_FORM, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPE2, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_ETICHECOMPE2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_ETICHECOMPE2, -1, "", "ETICHECOMPE2", 0, 0, 0, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, MyGlb.PANEL_LIST, 176);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, MyGlb.PANEL_LIST, "RA FONDO ANTIC LIQUIDITA 2");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, MyGlb.PANEL_FORM, 736, 400, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, MyGlb.PANEL_FORM, 176);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, MyGlb.PANEL_FORM, 2);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ2, MyGlb.PANEL_FORM, "RA FONDO ANTIC LIQUIDITA 2");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_RAFONANTLIQ2, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_RAFONANTLIQ2, PPQRY_BILCONSEQUI2, "A.RA_FONDO_ANTIC_LIQUIDITA_2", "RA_FONDO_ANTIC_LIQUIDITA_2", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, MyGlb.PANEL_LIST, 176);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, MyGlb.PANEL_LIST, "RA FONDO ANTIC LIQUIDITA 3");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, MyGlb.PANEL_FORM, 868, 400, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, MyGlb.PANEL_FORM, 176);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, MyGlb.PANEL_FORM, 2);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RAFONANTLIQ3, MyGlb.PANEL_FORM, "RA FONDO ANTIC LIQUIDITA 3");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_RAFONANTLIQ3, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_RAFONANTLIQ3, PPQRY_BILCONSEQUI2, "A.RA_FONDO_ANTIC_LIQUIDITA_3", "RA_FONDO_ANTIC_LIQUIDITA_3", 3, 14, 2, -13997);
  }

  private void PAN_EQUILDIBILAN_InitQueries()
  {
    StringBuffer SQL;

    PAN_EQUILDIBILAN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_EQUILDIBILAN.SetIMDB(IMDB, "PQRY_BILCONSEQUI2", true);
    PAN_EQUILDIBILAN.set_SetString(MyGlb.MASTER_ROWNAME, "BIL CONS EQUILIBRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.IMPORTO_AA as IMPORTO_AA, ");
    SQL.append("  A.IMPORTO_B_EST as IMPORTO_B_EST, ");
    SQL.append("  A.IMPORTO_F_EST as IMPORTO_F_EST, ");
    SQL.append("  A.IMPORTO_H as IMPORTO_H, ");
    SQL.append("  A.IMPORTO_H_EST as IMPORTO_H_EST, ");
    SQL.append("  A.IMPORTO_I as IMPORTO_I, ");
    SQL.append("  A.IMPORTO_I_EST as IMPORTO_I_EST, ");
    SQL.append("  A.IMPORTO_L as IMPORTO_L, ");
    SQL.append("  A.IMPORTO_M as IMPORTO_M, ");
    SQL.append("  A.IMPORTO_P as IMPORTO_P, ");
    SQL.append("  A.IMPORTO_AA_1 as IMPORTO_AA_1, ");
    SQL.append("  A.IMPORTO_AA_2 as IMPORTO_AA_2, ");
    SQL.append("  A.IMPORTO_B_EST_1 as IMPORTO_B_EST_1, ");
    SQL.append("  A.IMPORTO_B_EST_2 as IMPORTO_B_EST_2, ");
    SQL.append("  A.IMPORTO_F_EST_1 as IMPORTO_F_EST_1, ");
    SQL.append("  A.IMPORTO_F_EST_2 as IMPORTO_F_EST_2, ");
    SQL.append("  A.IMPORTO_H_1 as IMPORTO_H_1, ");
    SQL.append("  A.IMPORTO_H_2 as IMPORTO_H_2, ");
    SQL.append("  A.IMPORTO_H_EST_1 as IMPORTO_H_EST_1, ");
    SQL.append("  A.IMPORTO_H_EST_2 as IMPORTO_H_EST_2, ");
    SQL.append("  A.IMPORTO_I_1 as IMPORTO_I_1, ");
    SQL.append("  A.IMPORTO_I_2 as IMPORTO_I_2, ");
    SQL.append("  A.IMPORTO_I_EST_1 as IMPORTO_I_EST_1, ");
    SQL.append("  A.IMPORTO_I_EST_2 as IMPORTO_I_EST_2, ");
    SQL.append("  A.IMPORTO_L_1 as IMPORTO_L_1, ");
    SQL.append("  A.IMPORTO_L_2 as IMPORTO_L_2, ");
    SQL.append("  A.IMPORTO_M_1 as IMPORTO_M_1, ");
    SQL.append("  A.IMPORTO_M_2 as IMPORTO_M_2, ");
    SQL.append("  A.IMPORTO_P_1 as IMPORTO_P_1, ");
    SQL.append("  A.IMPORTO_P_2 as IMPORTO_P_2, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA_1 as FONDO_ANTIC_LIQUIDITA_1, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA_2 as FONDO_ANTIC_LIQUIDITA_2, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA_3 as FONDO_ANTIC_LIQUIDITA_3, ");
    SQL.append("  A.RA_FONDO_ANTIC_LIQUIDITA_1 as RA_FONDO_ANTIC_LIQUIDITA_1, ");
    SQL.append("  A.RA_FONDO_ANTIC_LIQUIDITA_2 as RA_FONDO_ANTIC_LIQUIDITA_2, ");
    SQL.append("  A.RA_FONDO_ANTIC_LIQUIDITA_3 as RA_FONDO_ANTIC_LIQUIDITA_3 ");
    PAN_EQUILDIBILAN.SetQuery(PPQRY_BILCONSEQUI2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_PREV_EQUILIBRI A ");
    PAN_EQUILDIBILAN.SetQuery(PPQRY_BILCONSEQUI2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_EQUILDIBILAN.SetQuery(PPQRY_BILCONSEQUI2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EQUILDIBILAN.SetQuery(PPQRY_BILCONSEQUI2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EQUILDIBILAN.SetQuery(PPQRY_BILCONSEQUI2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EQUILDIBILAN.SetQuery(PPQRY_BILCONSEQUI2, 5, SQL, -1, "");
    PAN_EQUILDIBILAN.SetQueryDB(PPQRY_BILCONSEQUI2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EQUILDIBILAN.SetMasterTable(0, "BIL_PREV_EQUILIBRI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_EQUILDIBILAN.Status() == 2)
    {
      int oldListQBE = PAN_EQUILDIBILAN.iUseListQBE;
      PAN_EQUILDIBILAN.iUseListQBE = 0;
      PAN_EQUILDIBILAN.PanelCommand(Glb.PCM_SEARCH);
      PAN_EQUILDIBILAN.PanelCommand(Glb.PCM_FIND);
      PAN_EQUILDIBILAN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_EQUILDIBILAN) PAN_EQUILDIBILAN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_EQUILDIBILAN) PAN_EQUILDIBILAN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_EQUILDIBILAN) PAN_EQUILDIBILAN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_EQUILDIBILAN) PAN_EQUILDIBILAN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_EQUILDIBILAN) PAN_EQUILDIBILAN_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_EQUILDIBILAN) PAN_EQUILDIBILAN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
