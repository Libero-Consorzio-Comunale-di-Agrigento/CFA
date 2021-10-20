// **********************************************
// Esploratore Per Delibera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EsploratorePerDelibera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PARAMESCHEDA = 0;
  private static int GRP_PARAMETRI_GRUPPOFILTRO = 1;

  private static int PFL_PARAMETRI_SCHEDAINFORM = 0;
  private static int PFL_PARAMETRI_ESERCIZIO = 1;
  private static int PFL_PARAMETRI_SEDEDEL = 2;
  private static int PFL_PARAMETRI_ETICHETRATTI = 3;
  private static int PFL_PARAMETRI_NUMERODEL = 4;
  private static int PFL_PARAMETRI_ETICHETBARRA = 5;
  private static int PFL_PARAMETRI_ANNODEL = 6;

  private static int PPQRY_PARAESPLVI28 = 0;

  private static int PPQRY_ESEFIN = 1;


  IDPanel PAN_PARAMETRI;
  ATree TRE_ESPLORATORE;

  // Definition of Global Variables
  private IDVariant PERSORD = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant PERSMAND = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant DISABILITORD = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant DISABILITMAN = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMEESPLO8(IMDB);
    Init_TBL_PARAMEPOSI11(IMDB);
    //
    //
    Init_PQRY_ORGDEL1(IMDB);
    Init_PQRY_DEL3(IMDB);
    Init_PQRY_LIVELLO9(IMDB);
    Init_PQRY_LIVELLO6(IMDB);
    Init_PQRY_PARAESPLVI28(IMDB);
    Init_PQRY_PARAESPLVI28_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMEESPLO8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMEESPLO8, 6);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMEESPLO8, "TBL_PARAMEESPLO8");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMEESPLO8,IMDBDef6.FLD_PARAMEESPLO8_PARASCHEINFO, "PARASCHEINFO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMEESPLO8,IMDBDef6.FLD_PARAMEESPLO8_PARASCHEINFO,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMEESPLO8,IMDBDef6.FLD_PARAMEESPLO8_PARAESERSCHE, "PARAESERSCHE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMEESPLO8,IMDBDef6.FLD_PARAMEESPLO8_PARAESERSCHE,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMEESPLO8,IMDBDef6.FLD_PARAMEESPLO8_PARAMSEDEDEL, "PARAMSEDEDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMEESPLO8,IMDBDef6.FLD_PARAMEESPLO8_PARAMSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMEESPLO8,IMDBDef6.FLD_PARAMEESPLO8_PARAMNUMEDEL, "PARAMNUMEDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMEESPLO8,IMDBDef6.FLD_PARAMEESPLO8_PARAMNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMEESPLO8,IMDBDef6.FLD_PARAMEESPLO8_PARAMANNODEL, "PARAMANNODEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMEESPLO8,IMDBDef6.FLD_PARAMEESPLO8_PARAMANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMEESPLO8,IMDBDef6.FLD_PARAMEESPLO8_PARAAGGDAFUO, "PARAAGGDAFUO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMEESPLO8,IMDBDef6.FLD_PARAMEESPLO8_PARAAGGDAFUO,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMEESPLO8, 0);
  }

  private static void Init_TBL_PARAMEPOSI11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMEPOSI11, 2);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMEPOSI11, "TBL_PARAMEPOSI11");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMEPOSI11,IMDBDef6.FLD_PARAMEPOSI11_POSTOP, "POSTOP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMEPOSI11,IMDBDef6.FLD_PARAMEPOSI11_POSTOP,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMEPOSI11,IMDBDef6.FLD_PARAMEPOSI11_POSLEFT, "POSLEFT");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMEPOSI11,IMDBDef6.FLD_PARAMEPOSI11_POSLEFT,1,5,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMEPOSI11, 0);
  }

  private static void Init_PQRY_ORGDEL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_ORGDEL1, 8);
    IMDB.set_TblCode(IMDBDef16.PQRY_ORGDEL1, "PQRY_ORGDEL1");
    IMDB.set_FldCode(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_DESCRIORGDEL, "DESCRIORGDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_DESCRIORGDEL,5,57,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_RECSEDDEORDE, "RECSEDDEORDE");
    IMDB.SetFldParams(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_RECSEDDEORDE,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_NUMDELORGDEL, "NUMDELORGDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_NUMDELORGDEL,1,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_ANNDELORGDEL, "ANNDELORGDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_ANNDELORGDEL,1,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_TIPRAMORGDEL, "TIPRAMORGDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_TIPRAMORGDEL,5,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_ICON,5,9,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_HASH,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_TOOLTIP, "TOOLTIP");
    IMDB.SetFldParams(IMDBDef16.PQRY_ORGDEL1,IMDBDef16.PQSL_ORGDEL1_TOOLTIP,5,57,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_ORGDEL1, 0);
  }

  private static void Init_PQRY_DEL3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_DEL3, 8);
    IMDB.set_TblCode(IMDBDef16.PQRY_DEL3, "PQRY_DEL3");
    IMDB.set_FldCode(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_RECORDESCDEL, "RECORDESCDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_RECORDESCDEL,5,497,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_RECORSEDEDEL, "RECORSEDEDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_RECORSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_RECORNUMEDEL, "RECORNUMEDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_RECORNUMEDEL,1,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_RECORANNODEL, "RECORANNODEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_RECORANNODEL,1,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_TIPORAMO, "TIPORAMO");
    IMDB.SetFldParams(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_TIPORAMO,5,3,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_ICON,5,12,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_HASH,5,202,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_TOOLTIP, "TOOLTIP");
    IMDB.SetFldParams(IMDBDef16.PQRY_DEL3,IMDBDef16.PQSL_DEL3_TOOLTIP,5,497,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_DEL3, 0);
  }

  private static void Init_PQRY_LIVELLO9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_LIVELLO9, 21);
    IMDB.set_TblCode(IMDBDef16.PQRY_LIVELLO9, "PQRY_LIVELLO9");
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECODESCLIV2, "RECODESCLIV2");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECODESCLIV2,5,238,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_TITOLO,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECTIPRAMLIV, "RECTIPRAMLIV");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECTIPRAMLIV,5,12,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECORDESLIVE, "RECORDESLIVE");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECORDESLIVE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECANNIMACLI, "RECANNIMACLI");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECANNIMACLI,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECNUMIMACLI, "RECNUMIMACLI");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECNUMIMACLI,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECANNSUIMLI, "RECANNSUIMLI");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECANNSUIMLI,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECNUMSUIMLI, "RECNUMSUIMLI");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECNUMSUIMLI,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECANNMAORLI, "RECANNMAORLI");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECANNMAORLI,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECNUMMAORLI, "RECNUMMAORLI");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECNUMMAORLI,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECOIMPOLIVE, "RECOIMPOLIVE");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECOIMPOLIVE,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECINCPAGLIV, "RECINCPAGLIV");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECINCPAGLIV,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECANNLIQLIV, "RECANNLIQLIV");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECANNLIQLIV,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECNUMLIQLIV, "RECNUMLIQLIV");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECNUMLIQLIV,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECOUOGELIVE, "RECOUOGELIVE");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECOUOGELIVE,1,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECOUOUTLIVE, "RECOUOUTLIVE");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECOUOUTLIVE,1,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECOORDILIVE, "RECOORDILIVE");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECOORDILIVE,5,45,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_ICON,5,17,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECPROVARLIV, "RECPROVARLIV");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_RECPROVARLIV,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_HASH,5,1529,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_TOOLTIP, "TOOLTIP");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO9,IMDBDef16.PQSL_LIVELLO9_TOOLTIP,5,336,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_LIVELLO9, 0);
  }

  private static void Init_PQRY_LIVELLO6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_LIVELLO6, 21);
    IMDB.set_TblCode(IMDBDef16.PQRY_LIVELLO6, "PQRY_LIVELLO6");
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECODESCLIV2, "RECODESCLIV2");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECODESCLIV2,5,238,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_TITOLO,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECTIPRAMLIV, "RECTIPRAMLIV");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECTIPRAMLIV,5,12,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECORDESLIVE, "RECORDESLIVE");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECORDESLIVE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECANNIMACLI, "RECANNIMACLI");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECANNIMACLI,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECNUMIMACLI, "RECNUMIMACLI");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECNUMIMACLI,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECANNSUIMLI, "RECANNSUIMLI");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECANNSUIMLI,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECNUMSUIMLI, "RECNUMSUIMLI");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECNUMSUIMLI,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECANNMAORLI, "RECANNMAORLI");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECANNMAORLI,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECNUMMAORLI, "RECNUMMAORLI");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECNUMMAORLI,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECOIMPOLIVE, "RECOIMPOLIVE");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECOIMPOLIVE,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECINCPAGLIV, "RECINCPAGLIV");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECINCPAGLIV,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECANNLIQLIV, "RECANNLIQLIV");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECANNLIQLIV,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECNUMLIQLIV, "RECNUMLIQLIV");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECNUMLIQLIV,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECOUOGELIVE, "RECOUOGELIVE");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECOUOGELIVE,1,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECOUOUTLIVE, "RECOUOUTLIVE");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECOUOUTLIVE,1,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECOORDILIVE, "RECOORDILIVE");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECOORDILIVE,5,45,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_ICON,5,17,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECPROVARLIV, "RECPROVARLIV");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_RECPROVARLIV,2,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_HASH,5,1529,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_TOOLTIP, "TOOLTIP");
    IMDB.SetFldParams(IMDBDef16.PQRY_LIVELLO6,IMDBDef16.PQSL_LIVELLO6_TOOLTIP,5,336,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_LIVELLO6, 0);
  }

  private static void Init_PQRY_PARAESPLVI28(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAESPLVI28, 5);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAESPLVI28, "PQRY_PARAESPLVI28");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAESPLVI28,IMDBDef16.PQSL_PARAESPLVI28_PARASCHEINFO, "PARASCHEINFO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAESPLVI28,IMDBDef16.PQSL_PARAESPLVI28_PARASCHEINFO,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAESPLVI28,IMDBDef16.PQSL_PARAESPLVI28_PARAESERSCHE, "PARAESERSCHE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAESPLVI28,IMDBDef16.PQSL_PARAESPLVI28_PARAESERSCHE,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAESPLVI28,IMDBDef16.PQSL_PARAESPLVI28_PARAMNUMEDEL, "PARAMNUMEDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAESPLVI28,IMDBDef16.PQSL_PARAESPLVI28_PARAMNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAESPLVI28,IMDBDef16.PQSL_PARAESPLVI28_PARAMSEDEDEL, "PARAMSEDEDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAESPLVI28,IMDBDef16.PQSL_PARAESPLVI28_PARAMSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAESPLVI28,IMDBDef16.PQSL_PARAESPLVI28_PARAMANNODEL, "PARAMANNODEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAESPLVI28,IMDBDef16.PQSL_PARAESPLVI28_PARAMANNODEL,1,4,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PARAESPLVI28, 0);
  }

  private static void Init_PQRY_PARAESPLVI28_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAESPLVI28_RS, 5);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAESPLVI28_RS, "PQRY_PARAESPLVI28_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAESPLVI28_RS,IMDBDef16.PQSL_PARAESPLVI28_PARASCHEINFO, "PARASCHEINFO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAESPLVI28_RS,IMDBDef16.PQSL_PARAESPLVI28_PARASCHEINFO,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAESPLVI28_RS,IMDBDef16.PQSL_PARAESPLVI28_PARAESERSCHE, "PARAESERSCHE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAESPLVI28_RS,IMDBDef16.PQSL_PARAESPLVI28_PARAESERSCHE,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAESPLVI28_RS,IMDBDef16.PQSL_PARAESPLVI28_PARAMNUMEDEL, "PARAMNUMEDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAESPLVI28_RS,IMDBDef16.PQSL_PARAESPLVI28_PARAMNUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAESPLVI28_RS,IMDBDef16.PQSL_PARAESPLVI28_PARAMSEDEDEL, "PARAMSEDEDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAESPLVI28_RS,IMDBDef16.PQSL_PARAESPLVI28_PARAMSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAESPLVI28_RS,IMDBDef16.PQSL_PARAESPLVI28_PARAMANNODEL, "PARAMANNODEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAESPLVI28_RS,IMDBDef16.PQSL_PARAESPLVI28_PARAMANNODEL,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EsploratorePerDelibera(MyWebEntryPoint w, IMDBObj imdb)
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
  public EsploratorePerDelibera()
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
    FormIdx = MyGlb.FRM_ESPLOPERDELI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A6CC3918-C71F-47A0-9E32-159D7CBF3100";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1036;
    DesignHeight = 530;
    set_Caption(new IDVariant("Esploratore per Delibera"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1036;
    Frames[1].Height = 504;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.111111;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1036;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 1036;
    Frames[2].FixedHeight = 56;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1036-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C8DBA038-7B46-48B1-AC43-FD0ABCAE3E49");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 16, 4, 1092, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1036;
    Frames[3].Height = 448;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Esploratore";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 448;
    TRE_ESPLORATORE = new ATree(this);
    Frames[3].Content = TRE_ESPLORATORE;
    TRE_ESPLORATORE.Width = 1036;
    TRE_ESPLORATORE.Height = 448;
    TRE_ESPLORATORE.FrIndex = 3;
    TRE_ESPLORATORE.Code = "TRE_ESPLORATORE";
    TRE_ESPLORATORE.set_IsActive(true);
    TRE_ESPLORATORE.CtxMenuIdx = BaseCmdSetIdx + MyGlb.CMDS_MENUCONTEST8;
    TRE_ESPLORATORE.iGuid = "3A877C08-E62C-41AB-B572-CD202D0B7785";
    TRE_ESPLORATORE.SetItemCount(4);
    Item = new ATreeItem();
    TRE_ESPLORATORE.SetItem(1,Item);
    Item.ItemIndex = "N00001";
    Item.Tooltip = "";
    Item.Name = "Org Del";
    Item.HasTooltip = true;
    Item.iGuid = "6F5564B0-CC2C-484B-B274-4BBA085471B3";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  'Organo Deliberativo ' || A.SEDE_DEL || ' : ' || B.DESCRIZIONE as DESCRIORGDEL, ");
    SQL.append("  A.SEDE_DEL as RECSEDDEORDE, ");
    SQL.append("  -1 as NUMDELORGDEL, ");
    SQL.append("  -1 as ANNDELORGDEL, ");
    SQL.append("  'ORGDEL' as TIPRAMORGDEL, ");
    SQL.append("  'table.ico' as ICON, ");
    SQL.append("  A.SEDE_DEL as HASH, ");
    SQL.append("  'Organo Deliberativo ' || A.SEDE_DEL || ' : ' || B.DESCRIZIONE as TOOLTIP ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_MOVIMENTI_DEL A, ");
    SQL.append("  T11 B ");
    SQL.append("where (B.CODICE(+) = A.SEDE_DEL) ");
    SQL.append("and   (UPPER(A.SEDE_DEL) LIKE NVL(UPPER(~~PQRY_PARAESPLVI28.PARAMSEDEDEL~~), UPPER(A.SEDE_DEL)) || '%') ");
    SQL.append("and   (A.NUMERO_DEL = NVL(~~PQRY_PARAESPLVI28.PARAMNUMEDEL~~, A.NUMERO_DEL)) ");
    SQL.append("and   (A.ANNO_DEL = NVL(~~PQRY_PARAESPLVI28.PARAMANNODEL~~, A.ANNO_DEL)) ");
    SQL.append("and   ((A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) OR (A.ESERCIZIO = 0 AND A.ANNO_LIQ <= ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    SQL.append("order by 2 ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef16.PQRY_ORGDEL1);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_ESPLORATORE.SetItem(2,Item);
    Item.ItemIndex = "N00002";
    Item.Tooltip = "";
    Item.Name = "Del";
    Item.HasTooltip = true;
    Item.iGuid = "E272AFFC-09A5-4DEC-ADE8-1D8008D767D0";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  'Delibera ' || A.SEDE_DEL || ' - ' || TO_CHAR ( A.NUMERO_DEL ) || ' / ' || TO_CHAR ( A.ANNO_DEL ) || ' : ' || 'del ' || TO_CHAR ( B.D_DATA_DEL ) || ' (' || C.DESCRIZIONE || ') ' || B.DESCRIZIONE as RECORDESCDEL, ");
    SQL.append("  A.SEDE_DEL as RECORSEDEDEL, ");
    SQL.append("  A.NUMERO_DEL as RECORNUMEDEL, ");
    SQL.append("  A.ANNO_DEL as RECORANNODEL, ");
    SQL.append("  'DEL' as TIPORAMO, ");
    SQL.append("  'delibere.bmp' as ICON, ");
    SQL.append("  A.SEDE_DEL || LPAD(TO_CHAR ( A.NUMERO_DEL ), 6, SUBSTR('0', 1, 1)) || TO_CHAR ( A.ANNO_DEL ) as HASH, ");
    SQL.append("  'Delibera ' || A.SEDE_DEL || ' - ' || TO_CHAR ( A.NUMERO_DEL ) || ' / ' || TO_CHAR ( A.ANNO_DEL ) || ' : ' || 'del ' || TO_CHAR ( B.D_DATA_DEL ) || ' (' || C.DESCRIZIONE || ') ' || B.DESCRIZIONE as TOOLTIP ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_MOVIMENTI_DEL A, ");
    SQL.append("  DEL B, ");
    SQL.append("  T10 C ");
    SQL.append("where (B.SEDE_DEL = A.SEDE_DEL) ");
    SQL.append("and   (B.NUMERO_DEL = A.NUMERO_DEL) ");
    SQL.append("and   (B.ANNO_DEL = A.ANNO_DEL) ");
    SQL.append("and   (C.CODICE(+) = B.TIPO_ESEC) ");
    SQL.append("and   (UPPER(A.SEDE_DEL) LIKE UPPER(~~PQRY_PARAESPLVI28.PARAMSEDEDEL~~) || '%') ");
    SQL.append("and   (A.NUMERO_DEL = NVL(~~PQRY_PARAESPLVI28.PARAMNUMEDEL~~, A.NUMERO_DEL)) ");
    SQL.append("and   (A.ANNO_DEL = NVL(~~PQRY_PARAESPLVI28.PARAMANNODEL~~, A.ANNO_DEL)) ");
    SQL.append("and   ((A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) OR (A.ESERCIZIO = 0 AND A.ANNO_LIQ <= ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    SQL.append("and   (A.SEDE_DEL = ~~PQRY_ORGDEL1.RECSEDDEORDE~~) ");
    SQL.append("order by 4 desc, 3 desc, 2 ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef16.PQRY_DEL3);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_ESPLORATORE.SetItem(3,Item);
    Item.ItemIndex = "N00003";
    Item.Tooltip = "";
    Item.Name = "Livello 1";
    Item.HasTooltip = true;
    Item.iGuid = "E3B42539-463C-4C56-B619-2BDED0CF6509";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO || '' as RECODESCLIV2, ");
    SQL.append("  A.LIVELLO + 0 as TITOLO, ");
    SQL.append("  A.TIPO_RAMO || '' as RECTIPRAMLIV, ");
    SQL.append("  A.E_S || '' as RECORDESLIVE, ");
    SQL.append("  A.ANNO_IMPACC + 0 as RECANNIMACLI, ");
    SQL.append("  A.NUMERO_IMPACC + 0 as RECNUMIMACLI, ");
    SQL.append("  A.ANNO_SUBIMP + 0 as RECANNSUIMLI, ");
    SQL.append("  A.NUMERO_SUBIMP + 0 as RECNUMSUIMLI, ");
    SQL.append("  A.ANNO_MANORD + 0 as RECANNMAORLI, ");
    SQL.append("  A.NUMERO_MANORD + 0 as RECNUMMAORLI, ");
    SQL.append("  A.IMPORTO + 0 as RECOIMPOLIVE, ");
    SQL.append("  A.INC_PAG + 0 as RECINCPAGLIV, ");
    SQL.append("  A.ANNO_LIQ + 0 as RECANNLIQLIV, ");
    SQL.append("  A.NUMERO_LIQ + 0 as RECNUMLIQLIV, ");
    SQL.append("  to_number(NULL) as RECOUOGELIVE, ");
    SQL.append("  to_number(NULL) as RECOUOUTLIVE, ");
    SQL.append("  A.ORDINE || '' as RECOORDILIVE, ");
    SQL.append("  A.IMMAGINE || '' as ICON, ");
    SQL.append("  A.PROGRESSIVO_VAR + 0 as RECPROVARLIV, ");
    SQL.append("  TO_CHAR ( A.ESERCIZIO ) || TO_CHAR ( A.E_S ) || A.SEDE_DEL || LPAD(TO_CHAR ( A.NUMERO_DEL ), 6, SUBSTR('0', 1, 1)) || TO_CHAR ( A.ANNO_DEL ) || TO_CHAR ( A.ANNO_IMPACC ) || TO_CHAR ( A.NUMERO_IMPACC ) || TO_CHAR ( A.ANNO_SUBIMP ) || TO_CHAR ( A.NUMERO_SUBIMP ) || TO_CHAR ( A.ANNO_MANORD ) || TO_CHAR ( A.NUMERO_MANORD ) || TO_CHAR ( A.ANNO_LIQ ) || TO_CHAR ( A.NUMERO_LIQ ) || TO_CHAR ( A.PROGRESSIVO_VAR ) || A.DESCR_RAMO as HASH, ");
    SQL.append("  A.TOOLTIP_RAMO || '' as TOOLTIP ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_MOVIMENTI_DEL A ");
    SQL.append("where (A.LIVELLO = 1) ");
    SQL.append("and   (A.ANNO_DEL = ~~PQRY_DEL3.RECORANNODEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~PQRY_DEL3.RECORNUMEDEL~~) ");
    SQL.append("and   (A.SEDE_DEL = ~~PQRY_DEL3.RECORSEDEDEL~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.DESCR_RAMO, ");
    SQL.append("  B.LIVELLO, ");
    SQL.append("  B.TIPO_RAMO, ");
    SQL.append("  B.E_S, ");
    SQL.append("  B.ANNO_IMPACC, ");
    SQL.append("  B.NUMERO_IMPACC, ");
    SQL.append("  B.ANNO_SUBIMP, ");
    SQL.append("  B.NUMERO_SUBIMP, ");
    SQL.append("  B.ANNO_MANORD, ");
    SQL.append("  B.NUMERO_MANORD, ");
    SQL.append("  B.IMPORTO, ");
    SQL.append("  B.INC_PAG, ");
    SQL.append("  B.ANNO_LIQ, ");
    SQL.append("  B.NUMERO_LIQ, ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  B.ORDINE, ");
    SQL.append("  B.IMMAGINE, ");
    SQL.append("  B.PROGRESSIVO_VAR, ");
    SQL.append("  TO_CHAR ( B.ESERCIZIO ) || TO_CHAR ( B.E_S ) || B.SEDE_DEL || LPAD(TO_CHAR ( B.NUMERO_DEL ), 6, SUBSTR('0', 1, 1)) || TO_CHAR ( B.ANNO_DEL ) || TO_CHAR ( B.ANNO_IMPACC ) || TO_CHAR ( B.NUMERO_IMPACC ) || TO_CHAR ( B.ANNO_SUBIMP ) || TO_CHAR ( B.NUMERO_SUBIMP ) || TO_CHAR ( B.ANNO_MANORD ) || TO_CHAR ( B.NUMERO_MANORD ) || TO_CHAR ( B.ANNO_LIQ ) || TO_CHAR ( B.NUMERO_LIQ ) || TO_CHAR ( B.PROGRESSIVO_VAR ) || B.DESCR_RAMO, ");
    SQL.append("  B.TOOLTIP_RAMO ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_MOVIMENTI_DEL B ");
    SQL.append("where (B.ANNO_DEL = ~~PQRY_DEL3.RECORANNODEL~~) ");
    SQL.append("and   (B.NUMERO_DEL = ~~PQRY_DEL3.RECORNUMEDEL~~) ");
    SQL.append("and   (B.SEDE_DEL = ~~PQRY_DEL3.RECORSEDEDEL~~) ");
    SQL.append("and   (B.LIVELLO = 1) ");
    SQL.append("and   (B.ANNO_LIQ <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.ESERCIZIO = 0) ");
    SQL.append("order by 17 ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef16.PQRY_LIVELLO9);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_ESPLORATORE.SetItem(4,Item);
    Item.ItemIndex = "N00004";
    Item.Tooltip = "";
    Item.Name = "Livello 2";
    Item.HasTooltip = true;
    Item.iGuid = "FAA3E84F-776B-411E-AE12-9BC9A8F5B6F2";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO || '' as RECODESCLIV2, ");
    SQL.append("  A.LIVELLO + 0 as TITOLO, ");
    SQL.append("  A.TIPO_RAMO || '' as RECTIPRAMLIV, ");
    SQL.append("  A.E_S || '' as RECORDESLIVE, ");
    SQL.append("  A.ANNO_IMPACC + 0 as RECANNIMACLI, ");
    SQL.append("  A.NUMERO_IMPACC + 0 as RECNUMIMACLI, ");
    SQL.append("  A.ANNO_SUBIMP + 0 as RECANNSUIMLI, ");
    SQL.append("  A.NUMERO_SUBIMP + 0 as RECNUMSUIMLI, ");
    SQL.append("  A.ANNO_MANORD + 0 as RECANNMAORLI, ");
    SQL.append("  A.NUMERO_MANORD + 0 as RECNUMMAORLI, ");
    SQL.append("  A.IMPORTO + 0 as RECOIMPOLIVE, ");
    SQL.append("  A.INC_PAG + 0 as RECINCPAGLIV, ");
    SQL.append("  A.ANNO_LIQ + 0 as RECANNLIQLIV, ");
    SQL.append("  A.NUMERO_LIQ + 0 as RECNUMLIQLIV, ");
    SQL.append("  to_number(NULL) as RECOUOGELIVE, ");
    SQL.append("  to_number(NULL) as RECOUOUTLIVE, ");
    SQL.append("  A.ORDINE || '' as RECOORDILIVE, ");
    SQL.append("  A.IMMAGINE || '' as ICON, ");
    SQL.append("  A.PROGRESSIVO_VAR + 0 as RECPROVARLIV, ");
    SQL.append("  TO_CHAR ( A.ESERCIZIO ) || TO_CHAR ( A.E_S ) || A.SEDE_DEL || LPAD(TO_CHAR ( A.NUMERO_DEL ), 6, SUBSTR('0', 1, 1)) || TO_CHAR ( A.ANNO_DEL ) || TO_CHAR ( A.ANNO_IMPACC ) || TO_CHAR ( A.NUMERO_IMPACC ) || TO_CHAR ( A.ANNO_SUBIMP ) || TO_CHAR ( A.NUMERO_SUBIMP ) || TO_CHAR ( A.ANNO_MANORD ) || TO_CHAR ( A.NUMERO_MANORD ) || TO_CHAR ( A.ANNO_LIQ ) || TO_CHAR ( A.NUMERO_LIQ ) || TO_CHAR ( A.PROGRESSIVO_VAR ) || A.DESCR_RAMO as HASH, ");
    SQL.append("  A.TOOLTIP_RAMO || '' as TOOLTIP ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_MOVIMENTI_DEL A ");
    SQL.append("where (A.NUMERO_MANORD = DECODE(~~PQRY_LIVELLO9.RECNUMMAORLI~~, -1, A.NUMERO_MANORD, ~~PQRY_LIVELLO9.RECNUMMAORLI~~)) ");
    SQL.append("and   (A.ANNO_MANORD = DECODE(~~PQRY_LIVELLO9.RECANNMAORLI~~, -1, A.ANNO_MANORD, ~~PQRY_LIVELLO9.RECANNMAORLI~~)) ");
    SQL.append("and   (A.NUMERO_SUBIMP = DECODE(~~PQRY_LIVELLO9.RECNUMSUIMLI~~, -1, A.NUMERO_SUBIMP, ~~PQRY_LIVELLO9.RECNUMSUIMLI~~)) ");
    SQL.append("and   (A.ANNO_SUBIMP = DECODE(~~PQRY_LIVELLO9.RECANNSUIMLI~~, -1, A.ANNO_SUBIMP, ~~PQRY_LIVELLO9.RECANNSUIMLI~~)) ");
    SQL.append("and   (A.NUMERO_IMPACC = DECODE(~~PQRY_LIVELLO9.RECNUMIMACLI~~, -1, A.NUMERO_IMPACC, ~~PQRY_LIVELLO9.RECNUMIMACLI~~)) ");
    SQL.append("and   (A.ANNO_IMPACC = DECODE(~~PQRY_LIVELLO9.RECANNIMACLI~~, -1, A.ANNO_IMPACC, ~~PQRY_LIVELLO9.RECANNIMACLI~~)) ");
    SQL.append("and   (A.PADRE = ~~PQRY_LIVELLO9.RECTIPRAMLIV~~) ");
    SQL.append("and   (A.LIVELLO = ~~PQRY_LIVELLO9.TITOLO~~ + 1) ");
    SQL.append("and   (A.ANNO_DEL = ~~PQRY_DEL3.RECORANNODEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~PQRY_DEL3.RECORNUMEDEL~~) ");
    SQL.append("and   (A.SEDE_DEL = ~~PQRY_DEL3.RECORSEDEDEL~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.DESCR_RAMO, ");
    SQL.append("  B.LIVELLO, ");
    SQL.append("  B.TIPO_RAMO, ");
    SQL.append("  B.E_S, ");
    SQL.append("  B.ANNO_IMPACC, ");
    SQL.append("  B.NUMERO_IMPACC, ");
    SQL.append("  B.ANNO_SUBIMP, ");
    SQL.append("  B.NUMERO_SUBIMP, ");
    SQL.append("  B.ANNO_MANORD, ");
    SQL.append("  B.NUMERO_MANORD, ");
    SQL.append("  B.IMPORTO, ");
    SQL.append("  B.INC_PAG, ");
    SQL.append("  B.ANNO_LIQ, ");
    SQL.append("  B.NUMERO_LIQ, ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  B.ORDINE, ");
    SQL.append("  B.IMMAGINE, ");
    SQL.append("  B.PROGRESSIVO_VAR, ");
    SQL.append("  TO_CHAR ( B.ESERCIZIO ) || TO_CHAR ( B.E_S ) || B.SEDE_DEL || LPAD(TO_CHAR ( B.NUMERO_DEL ), 6, SUBSTR('0', 1, 1)) || TO_CHAR ( B.ANNO_DEL ) || TO_CHAR ( B.ANNO_IMPACC ) || TO_CHAR ( B.NUMERO_IMPACC ) || TO_CHAR ( B.ANNO_SUBIMP ) || TO_CHAR ( B.NUMERO_SUBIMP ) || TO_CHAR ( B.ANNO_MANORD ) || TO_CHAR ( B.NUMERO_MANORD ) || TO_CHAR ( B.ANNO_LIQ ) || TO_CHAR ( B.NUMERO_LIQ ) || TO_CHAR ( B.PROGRESSIVO_VAR ) || B.DESCR_RAMO, ");
    SQL.append("  B.TOOLTIP_RAMO ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_MOVIMENTI_DEL B ");
    SQL.append("where (B.NUMERO_MANORD = DECODE(~~PQRY_LIVELLO9.RECNUMMAORLI~~, -1, B.NUMERO_MANORD, ~~PQRY_LIVELLO9.RECNUMMAORLI~~)) ");
    SQL.append("and   (B.ANNO_MANORD = DECODE(~~PQRY_LIVELLO9.RECANNMAORLI~~, -1, B.ANNO_MANORD, ~~PQRY_LIVELLO9.RECANNMAORLI~~)) ");
    SQL.append("and   (B.NUMERO_SUBIMP = DECODE(~~PQRY_LIVELLO9.RECNUMSUIMLI~~, -1, B.NUMERO_SUBIMP, ~~PQRY_LIVELLO9.RECNUMSUIMLI~~)) ");
    SQL.append("and   (B.ANNO_SUBIMP = DECODE(~~PQRY_LIVELLO9.RECANNSUIMLI~~, -1, B.ANNO_SUBIMP, ~~PQRY_LIVELLO9.RECANNSUIMLI~~)) ");
    SQL.append("and   (B.NUMERO_IMPACC = DECODE(~~PQRY_LIVELLO9.RECNUMIMACLI~~, -1, B.NUMERO_IMPACC, ~~PQRY_LIVELLO9.RECNUMIMACLI~~)) ");
    SQL.append("and   (B.ANNO_IMPACC = DECODE(~~PQRY_LIVELLO9.RECANNIMACLI~~, -1, B.ANNO_IMPACC, ~~PQRY_LIVELLO9.RECANNIMACLI~~)) ");
    SQL.append("and   (B.PADRE = ~~PQRY_LIVELLO9.RECTIPRAMLIV~~) ");
    SQL.append("and   (B.LIVELLO = ~~PQRY_LIVELLO9.TITOLO~~ + 1) ");
    SQL.append("and   (B.ANNO_DEL = ~~PQRY_DEL3.RECORANNODEL~~) ");
    SQL.append("and   (B.NUMERO_DEL = ~~PQRY_DEL3.RECORNUMEDEL~~) ");
    SQL.append("and   (B.SEDE_DEL = ~~PQRY_DEL3.RECORSEDEDEL~~) ");
    SQL.append("and   (B.ANNO_LIQ <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.ESERCIZIO = 0) ");
    SQL.append("order by 17 ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef16.PQRY_LIVELLO9);
    Item = TRE_ESPLORATORE.GetItem(1);
    Item.SetItem(1, TRE_ESPLORATORE.GetItem(2));
    Item = TRE_ESPLORATORE.GetItem(2);
    Item.Parent = TRE_ESPLORATORE.GetItem(1);
    Item.SetItem(1, TRE_ESPLORATORE.GetItem(3));
    Item = TRE_ESPLORATORE.GetItem(3);
    Item.Parent = TRE_ESPLORATORE.GetItem(2);
    Item.SetItem(1, TRE_ESPLORATORE.GetItem(4));
    Item = TRE_ESPLORATORE.GetItem(4);
    Item.Parent = TRE_ESPLORATORE.GetItem(3);
    Item.Derived = TRE_ESPLORATORE.GetItem(3);
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
      if (CmdIdx==MyGlb.CMD_INFORMDELIB1+BaseCmdLinIdx)
      {
        InformazioniDelibera();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INFOACCERTA8+BaseCmdLinIdx)
      {
        InfoAccertamento();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INFOORDINA13+BaseCmdLinIdx)
      {
        InfoOrdinativo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INFOIMPEGN13+BaseCmdLinIdx)
      {
        InfoImpegno();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INFOSUBIMP13+BaseCmdLinIdx)
      {
        InfoSubImpegno();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INFOLIQUIDA1+BaseCmdLinIdx)
      {
        ApriInfoLiquidazione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INFOMANDAT13+BaseCmdLinIdx)
      {
        InfoMandato();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INFOVARIIM13+BaseCmdLinIdx)
      {
        InfoVarimp();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INFOVARISU13+BaseCmdLinIdx)
      {
        InfoVarsub();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INFOVARIAC13+BaseCmdLinIdx)
      {
        InfoVaracc();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_APRI3+BaseCmdLinIdx)
      {
        ApriMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SIMULAZIONE2+BaseCmdLinIdx)
      {
        SimulazioneMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVOSUBIMP3+BaseCmdLinIdx)
      {
        NuovoSubImpegnoMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVORESIDU2+BaseCmdLinIdx)
      {
        NuovoResiduoMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx)
      {
        NuovoOrdinativoMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVALIQUID3+BaseCmdLinIdx)
      {
        NuovaLiquidazioneMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_LIQUIDMULTI3+BaseCmdLinIdx)
      {
        LiquidazioneMultiplaMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx)
      {
        IncassoCompletoMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx)
      {
        AnnullaIncassoMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx)
      {
        InEmissioneMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx)
      {
        AnnullaEmissioneMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx)
      {
        PagamentoCompletoMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx)
      {
        AnnullaPagamentoMenu();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPANDINOD20+BaseCmdLinIdx)
      {
        EspandiNodo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMPRIMINO20+BaseCmdLinIdx)
      {
        ComprimiNodo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPANDITUT22+BaseCmdLinIdx)
      {
        EspandiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMPRIMTUT22+BaseCmdLinIdx)
      {
        ComprimiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIORNANOD8+BaseCmdLinIdx)
      {
        AggiornaNodo();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMEESPLO8, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESPLOPERDELI_PARAESPLVI28();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      TRE_ESPLORATORE.UpdateTree(MainFrm);
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
    return (obj instanceof EsploratorePerDelibera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EsploratorePerDelibera.class.getName() : (Glb.ClassWithPackage(EsploratorePerDelibera.class) ? EsploratorePerDelibera.class.getName().substring(EsploratorePerDelibera.class.getPackage().getName().length() + 1) : EsploratorePerDelibera.class.getName()));
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
    IDVariant v_WINDOWORD = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WINDOORDPERS = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WINDOW = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WINDOWMAN = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WINDOMANPERS = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_WINDOWORD = (new IDVariant("ord_apri", IDVariant.STRING));
      v_WINDOORDPERS = (new IDVariant("ord_apri_pu", IDVariant.STRING));
      v_WINDOWMAN = (new IDVariant("man_apri", IDVariant.STRING));
      v_WINDOMANPERS = (new IDVariant("man_apri_pu", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAMSEDEDEL, 0, (new IDVariant()));
      if (MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_WINDOWORD).equals(v_WINDOORDPERS, true))
      {
        PERSORD = (new IDVariant(-1));
      }
      else
      {
        PERSORD = (new IDVariant(0));
      }
      if (MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_WINDOWMAN).equals(v_WINDOMANPERS, true))
      {
        PERSMAND = (new IDVariant(-1));
      }
      else
      {
        PERSMAND = (new IDVariant(0));
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.WINDOW as DISABIWINDOW ");
      SQL.append("from ");
      SQL.append("  AD4_DISABILITAZIONI A ");
      SQL.append("where (A.RUOLO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONRUOLO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.MODULO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_WINDOW = QV.Get("DISABIWINDOW", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_WINDOW.equals((new IDVariant("annulla_incasso")), true))
      {
        DISABILITORD = (new IDVariant(-1));
        DISABILITMAN = (new IDVariant(0));
      }
      else
      {
        if (v_WINDOW.equals((new IDVariant("annulla_pagam")), true))
        {
          DISABILITMAN = (new IDVariant(-1));
        }
        else
        {
          DISABILITMAN = (new IDVariant(0));
        }
        DISABILITORD = (new IDVariant(0));
      }
      set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.Add((new IDVariant("Esercizio")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))))))));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARASCHEINFO, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAESERSCHE, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      TRE_ESPLORATORE.ActivateOnExpand = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "LoadEvent", _e);
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
      UNLOADEVENT_VALNODCORDEL();
      // 
      // 
      // 
      // 
      UNLOADEVENT_PARAESPLDELE();
      if (IMDB.Value(IMDBDef16.PQRY_PARAESPLVI28, IMDBDef16.PQSL_PARAESPLVI28_PARASCHEINFO, 0).equals((new IDVariant("SI")), true))
      {
        if ((MainFrm.GetForm(MyGlb.FRM_SCHEDINFOMOV, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_SCHEDINFOMOV,(new IDVariant(0)).booleanValue()); 
        }
        if ((MainFrm.GetForm(MyGlb.FRM_SCHEDINFOLIQ, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_SCHEDINFOLIQ,(new IDVariant(0)).booleanValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Valori Nodo Corrente: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_VALNODCORDEL() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORTIPUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORDESRAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCOBEDE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRTITO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCATINT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODTER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORRISINT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRIMPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORINCPAG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOUTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODPR1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRORDI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORPROVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORMISTIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODSTR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI2, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI3, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI4, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCODLI5, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRRESP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORCEDICO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORPROSES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRFINA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORROPER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRESPL, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri Esploratore: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAESPLDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARASCHEINFO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAESERSCHE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAMSEDEDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAMNUMEDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAMANNODEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAAGGDAFUO, 0, new IDVariant());
  }

  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cioè quando viene portata in primo piano
  // **********************************************************************
  public void Form_Activate()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.Form_Activate(this);
      // 
      // Activate Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAAGGDAFUO, 0).equals((new IDVariant("SI")), true))
      {
        // 
        // chiudo la scheda per evitare errore grafico
        // 
        MainFrm.UnloadForm(MyGlb.FRM_SCHEDINFOBIL,(new IDVariant(0)).booleanValue()); 
        MainFrm.UnloadForm(MyGlb.FRM_SCHEDINFOMOV,(new IDVariant(0)).booleanValue()); 
        MainFrm.UnloadForm(MyGlb.FRM_SCHEDINFOLIQ,(new IDVariant(0)).booleanValue()); 
        IMDB.set_Value(IMDBDef16.PQRY_PARAESPLVI28, IMDBDef16.PQSL_PARAESPLVI28_PARASCHEINFO, 0, (new IDVariant("NO")));
        AggiornaEsploratore();
        IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAAGGDAFUO, 0, (new IDVariant()));
      }
      if ((MainFrm.GetForm(MyGlb.FRM_SCHEDINFOMOV, 0, false)!=null))
      {
        if ((new IDVariant(MainFrm.GetForm(MyGlb.FRM_SCHEDINFOMOV,0).WindowState())).equals((new IDVariant(2)), true))
        {
          MainFrm.GetForm(MyGlb.FRM_SCHEDINFOMOV,0).set_WindowState((new IDVariant(0)).intValue());
        }
      }
      if ((MainFrm.GetForm(MyGlb.FRM_SCHEDINFOLIQ, 0, false)!=null))
      {
        if ((new IDVariant(MainFrm.GetForm(MyGlb.FRM_SCHEDINFOLIQ,0).WindowState())).equals((new IDVariant(2)), true))
        {
          MainFrm.GetForm(MyGlb.FRM_SCHEDINFOLIQ,0).set_WindowState((new IDVariant(0)).intValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "Activate", _e);
    }
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
      if (IMDB.Value(IMDBDef16.PQRY_PARAESPLVI28, IMDBDef16.PQSL_PARAESPLVI28_PARASCHEINFO, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri After Find
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
      // Parametri After Find Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef16.PQRY_PARAESPLVI28, IMDBDef16.PQSL_PARAESPLVI28_PARASCHEINFO, 0).equals((new IDVariant("SI")), true))
      {
        GestioneSchedaInfo();
      }
      else
      {
        MainFrm.UnloadForm(MyGlb.FRM_SCHEDINFOBIL,(new IDVariant(0)).booleanValue()); 
        MainFrm.UnloadForm(MyGlb.FRM_SCHEDINFOMOV,(new IDVariant(0)).booleanValue()); 
        MainFrm.UnloadForm(MyGlb.FRM_SCHEDINFOLIQ,(new IDVariant(0)).booleanValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "ParametriAfterFind", _e);
    }
  }

  // **********************************************************************
  // Parametri Scheda Esercizio Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_ESERCIZIO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Scheda Esercizio Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef16.PQRY_PARAESPLVI28, IMDBDef16.PQSL_PARAESPLVI28_PARASCHEINFO, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI416, IMDBDef7.FLD_PARAMETRI416_PARAMESERCIZ, 0, IMDB.Value(IMDBDef16.PQRY_PARAESPLVI28, IMDBDef16.PQSL_PARAESPLVI28_PARAESERSCHE, 0));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI425, IMDBDef7.FLD_PARAMETRI425_PARAMESERCIZ, 0, IMDB.Value(IMDBDef16.PQRY_PARAESPLVI28, IMDBDef16.PQSL_PARAESPLVI28_PARAESERSCHE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "ParametriSchedaEsercizioValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Menu Contestuale On Open Popup Event
  // Direction: E' un parametro di output che può essere impostato ad uno dei valori della lista PopupDirections per scegliere la posizione del menu popup rispetto all'oggetto che lo ha attivato. - Input/Output
  // Cancel: Se impostato a True annulla la visualizzazione del popup. - Input/Output
  // **********************************************************************
  public void CMDS_MENUCONTEST8_OnOpenPopup(IDVariant Direction, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUOVOACC = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NUOVOACC = (new IDVariant("Nuovo Accertamento", IDVariant.STRING));
      // 
      // Menu Contestuale On Open Popup Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef16.PQRY_PARAESPLVI28, IMDBDef16.PQSL_PARAESPLVI28_PARASCHEINFO, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.BringToFront(FormIdx);
      }
      // 
      // 
      // 
      // 
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("DEL")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFORMDELIB1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOACCERTA8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOORDINA13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOIMPEGN13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOSUBIMP13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOLIQUIDA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOMANDAT13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIIM13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARISU13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIAC13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SIMULAZIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOSUBIMP3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVORESIDU2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVALIQUID3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDMULTI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("ACC")), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFORMDELIB1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOACCERTA8+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOORDINA13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOIMPEGN13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOSUBIMP13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOLIQUIDA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOMANDAT13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIIM13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARISU13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIAC13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SIMULAZIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOSUBIMP3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVORESIDU2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          if (IDL.NullValue(MainFrm.StanziamentoVocePeg(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0), IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0), ((IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0).equals((new IDVariant(-1))))?(new IDVariant(0)):IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0))),(new IDVariant(-1))).compareTo((new IDVariant(0)), true)>=0)
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          }
          else
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVALIQUID3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDMULTI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("ORD")), true))
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFORMDELIB1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOACCERTA8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOORDINA13+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOIMPEGN13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOSUBIMP13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOLIQUIDA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOMANDAT13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIIM13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARISU13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIAC13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            if (OrdinativoIncassato(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, 0), IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0)))
            {
              if (PERSORD.booleanValue())
              {
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              }
              else
              {
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
              }
              if (DISABILITORD.booleanValue())
              {
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              }
              else
              {
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
              }
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            }
            else
            {
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            }
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SIMULAZIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOSUBIMP3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVORESIDU2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVALIQUID3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDMULTI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
          else
          {
            if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("VARACC")), true))
            {
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFORMDELIB1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOACCERTA8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOORDINA13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOIMPEGN13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOSUBIMP13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOLIQUIDA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOMANDAT13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIIM13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARISU13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIAC13+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SIMULAZIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOSUBIMP3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVORESIDU2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVALIQUID3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDMULTI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            }
            else
            {
              SeSpesa();
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "MenuContestualeOnOpenPopupEvent", _e);
    }
  }

  // **********************************************************************
  // Conserva Valori Org Del
  // **********************************************************************
  public int ConservaValoriOrgDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conserva Valori Org Del Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0, IMDB.Value(IMDBDef16.PQRY_ORGDEL1, IMDBDef16.PQSL_ORGDEL1_TIPRAMORGDEL, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORDESRAM, 0, IMDB.Value(IMDBDef16.PQRY_ORGDEL1, IMDBDef16.PQSL_ORGDEL1_DESCRIORGDEL, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORSEDDEL, 0, IMDB.Value(IMDBDef16.PQRY_ORGDEL1, IMDBDef16.PQSL_ORGDEL1_RECSEDDEORDE, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMDEL, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNDEL, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRIMPO, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORINCPAG, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOUTI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRORDI, 0, IMDB.Value(IMDBDef16.PQRY_ORGDEL1, IMDBDef16.PQSL_ORGDEL1_RECSEDDEORDE, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORPROVAR, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH, 0, IMDB.Value(IMDBDef16.PQRY_ORGDEL1, IMDBDef16.PQSL_ORGDEL1_HASH, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "ConservaValoriOrgDel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Conserva Valori Del
  // **********************************************************************
  public int ConservaValoriDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conserva Valori Del Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0, IMDB.Value(IMDBDef16.PQRY_DEL3, IMDBDef16.PQSL_DEL3_TIPORAMO, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORDESRAM, 0, IMDB.Value(IMDBDef16.PQRY_DEL3, IMDBDef16.PQSL_DEL3_RECORDESCDEL, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORSEDDEL, 0, IMDB.Value(IMDBDef16.PQRY_DEL3, IMDBDef16.PQSL_DEL3_RECORSEDEDEL, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMDEL, 0, IMDB.Value(IMDBDef16.PQRY_DEL3, IMDBDef16.PQSL_DEL3_RECORNUMEDEL, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNDEL, 0, IMDB.Value(IMDBDef16.PQRY_DEL3, IMDBDef16.PQSL_DEL3_RECORANNODEL, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRIMPO, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORINCPAG, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOUTI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRORDI, 0, IMDB.Value(IMDBDef16.PQRY_DEL3, IMDBDef16.PQSL_DEL3_RECORDESCDEL, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORPROVAR, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH, 0, IMDB.Value(IMDBDef16.PQRY_DEL3, IMDBDef16.PQSL_DEL3_HASH, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "ConservaValoriDel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Conserva Valori Livello 1
  // **********************************************************************
  public int ConservaValoriLivello1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conserva Valori Livello 1 Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0, IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECTIPRAMLIV, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORDESRAM, 0, IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECODESCLIV2, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0, IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECORDESLIVE, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECANNIMACLI, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECNUMIMACLI, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECANNSUIMLI, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECNUMSUIMLI, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECANNMAORLI, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECNUMMAORLI, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRIMPO, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECOIMPOLIVE, 0),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORINCPAG, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECINCPAGLIV, 0),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECANNLIQLIV, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECNUMLIQLIV, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0, IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECOUOGELIVE, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOUTI, 0, IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECOUOUTLIVE, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRORDI, 0, IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECOORDILIVE, 0));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORPROVAR, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_RECPROVARLIV, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH, 0, IMDB.Value(IMDBDef16.PQRY_LIVELLO9, IMDBDef16.PQSL_LIVELLO9_HASH, 0));
      if (IMDB.Value(IMDBDef16.PQRY_PARAESPLVI28, IMDBDef16.PQSL_PARAESPLVI28_PARASCHEINFO, 0).equals((new IDVariant("SI")), true))
      {
        GestioneSchedaInfo();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "ConservaValoriLivello1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Gestione Scheda Info
  // **********************************************************************
  public int GestioneSchedaInfo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Gestione Scheda Info Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("ACC")), true) || IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("IMP")), true) || IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("SUBIMP")), true))
      {
        if ((MainFrm.GetForm(MyGlb.FRM_SCHEDINFOLIQ, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_SCHEDINFOLIQ,(new IDVariant(-1)).booleanValue()); 
        }
        if (!((MainFrm.GetForm(MyGlb.FRM_SCHEDINFOMOV, 0, false)!=null)))
        {
          IDVariant I = null;
          I = IDL.Find(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORDESRAM, 0), (new IDVariant(":")));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI425, IMDBDef7.FLD_PARAMETRI425_PARAMESERCIZ, 0, IMDB.Value(IMDBDef16.PQRY_PARAESPLVI28, IMDBDef16.PQSL_PARAESPLVI28_PARAESERSCHE, 0));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI425, IMDBDef7.FLD_PARAMETRI425_PARAMTITOLO, 0, IDL.SubStr(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORDESRAM, 0), (new IDVariant(1)), ((I.equals((new IDVariant(0))))?(new IDVariant(100)):I)));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI425, IMDBDef7.FLD_PARAMETRI425_PARAMPARTE, 0, ((IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("SUBIMP"))))?(new IDVariant("SS")):IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0)));
          IMDB.set_Value(IMDBDef7.TBL_PARAMEPOSIZ5, IMDBDef7.FLD_PARAMEPOSIZ5_POSTOP, 0, IMDB.Value(IMDBDef6.TBL_PARAMEPOSI11, IMDBDef6.FLD_PARAMEPOSI11_POSTOP, 0));
          IMDB.set_Value(IMDBDef7.TBL_PARAMEPOSIZ5, IMDBDef7.FLD_PARAMEPOSIZ5_POSLEFT, 0, IMDB.Value(IMDBDef6.TBL_PARAMEPOSI11, IMDBDef6.FLD_PARAMEPOSI11_POSLEFT, 0));
          MainFrm.Show(MyGlb.FRM_SCHEDINFOMOV, (new IDVariant(2)).intValue(), this); 
        }
        else if ((new IDVariant(MainFrm.GetForm(MyGlb.FRM_SCHEDINFOMOV,0).WindowState())).compareTo((new IDVariant(2)), true)!=0)
        {
          MainFrm.BringToFront(MyGlb.FRM_SCHEDINFOMOV);
        }
      }
      else if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("LIQ")), true))
      {
        if ((MainFrm.GetForm(MyGlb.FRM_SCHEDINFOMOV, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_SCHEDINFOMOV,(new IDVariant(-1)).booleanValue()); 
        }
        if (!((MainFrm.GetForm(MyGlb.FRM_SCHEDINFOLIQ, 0, false)!=null)))
        {
          IMDB.set_Value(IMDBDef7.TBL_PARAMEPOSIZ6, IMDBDef7.FLD_PARAMEPOSIZ6_POSTOP, 0, IMDB.Value(IMDBDef6.TBL_PARAMEPOSI11, IMDBDef6.FLD_PARAMEPOSI11_POSTOP, 0));
          IMDB.set_Value(IMDBDef7.TBL_PARAMEPOSIZ6, IMDBDef7.FLD_PARAMEPOSIZ6_POSLEFT, 0, IMDB.Value(IMDBDef6.TBL_PARAMEPOSI11, IMDBDef6.FLD_PARAMEPOSI11_POSLEFT, 0));
          MainFrm.Show(MyGlb.FRM_SCHEDINFOLIQ, (new IDVariant(2)).intValue(), this); 
        }
        else if ((new IDVariant(MainFrm.GetForm(MyGlb.FRM_SCHEDINFOLIQ,0).WindowState())).compareTo((new IDVariant(2)), true)!=0)
        {
          MainFrm.BringToFront(MyGlb.FRM_SCHEDINFOLIQ);
        }
      }
      else
      {
        if ((MainFrm.GetForm(MyGlb.FRM_SCHEDINFOMOV, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_SCHEDINFOMOV,(new IDVariant(-1)).booleanValue()); 
        }
        if ((MainFrm.GetForm(MyGlb.FRM_SCHEDINFOLIQ, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_SCHEDINFOLIQ,(new IDVariant(-1)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "GestioneSchedaInfo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ordinativo Incassato
  // Anno Ord:  - Input
  // Numero Ord:  - Input
  // **********************************************************************
  public boolean OrdinativoIncassato (IDVariant AnnoOrd, IDVariant NumeroOrd)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_INCASSI = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Ordinativo Incassato Body
      // Procedure Body
      // 
      v_INCASSI = (new IDVariant(0, IDVariant.DECIMAL));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.INCASSATO, 0) as NULVALORINZE ");
      SQL.append("from ");
      SQL.append("  ORD A ");
      SQL.append("where (A.ANNO_ORD = " + IDL.CSql(AnnoOrd, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ORD = " + IDL.CSql(NumeroOrd, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_INCASSI = QV.Get("NULVALORINZE", IDVariant.DECIMAL) ;
      }
      QV.Close();
      if (v_INCASSI.compareTo((new IDVariant(0)), true)>0)
      {
        return (new IDVariant(-1)).booleanValue();
      }
      else
      {
        return (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "OrdinativoIncassato", _e);
      return false;
    }
  }

  // **********************************************************************
  // Mandato Pagato
  // Anno Man:  - Input
  // Numero Man:  - Input
  // **********************************************************************
  public boolean MandatoPagato (IDVariant AnnoMan, IDVariant NumeroMan)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PAGATO = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Mandato Pagato Body
      // Procedure Body
      // 
      v_PAGATO = (new IDVariant(0, IDVariant.DECIMAL));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.PAGATO, 0) as NULVALMAPAZE ");
      SQL.append("from ");
      SQL.append("  MAN A ");
      SQL.append("where (A.ANNO_MAND = " + IDL.CSql(AnnoMan, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(NumeroMan, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PAGATO = QV.Get("NULVALMAPAZE", IDVariant.DECIMAL) ;
      }
      QV.Close();
      if (v_PAGATO.compareTo((new IDVariant(0)), true)>0)
      {
        return (new IDVariant(-1)).booleanValue();
      }
      else
      {
        return (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "MandatoPagato", _e);
      return false;
    }
  }

  // **********************************************************************
  // Se Spesa
  // **********************************************************************
  public int SeSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Se Spesa Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("IMP")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFORMDELIB1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOACCERTA8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOORDINA13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOIMPEGN13+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOSUBIMP13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOLIQUIDA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOMANDAT13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIIM13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARISU13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIAC13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SIMULAZIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVORESIDU2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOSUBIMP3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVALIQUID3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDMULTI3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("SUBIMP")), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFORMDELIB1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOACCERTA8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOORDINA13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOIMPEGN13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOSUBIMP13+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOLIQUIDA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOMANDAT13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIIM13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARISU13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SIMULAZIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIAC13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOSUBIMP3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVORESIDU2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVALIQUID3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDMULTI3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("LIQ")), true))
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFORMDELIB1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOACCERTA8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOORDINA13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOIMPEGN13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOSUBIMP13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOLIQUIDA1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOMANDAT13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIIM13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARISU13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIAC13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SIMULAZIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOSUBIMP3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVORESIDU2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVALIQUID3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDMULTI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            if (IDL.NullValue(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, 0),(new IDVariant(-1))).equals((new IDVariant(-1)), true) && IDL.NullValue(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0),(new IDVariant(-1))).equals((new IDVariant(-1)), true))
            {
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            }
            else
            {
              if (IDL.NullValue(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, 0),(new IDVariant(-1))).compareTo((new IDVariant(-1)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0),(new IDVariant(-1))).equals((new IDVariant(-1)), true))
              {
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
              }
              else
              {
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              }
            }
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
          else
          {
            if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("MAN")), true))
            {
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFORMDELIB1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOACCERTA8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOORDINA13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOIMPEGN13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOSUBIMP13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOLIQUIDA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOMANDAT13+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIIM13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARISU13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIAC13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOSUBIMP3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVORESIDU2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVALIQUID3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDMULTI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SIMULAZIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              if (MandatoPagato(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, 0), IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0)))
              {
                if (PERSMAND.booleanValue())
                {
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                }
                else
                {
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
                }
                if (DISABILITMAN.booleanValue())
                {
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                }
                else
                {
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
                }
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              }
              else
              {
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              }
            }
            else
            {
              if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("VARIMP")), true))
              {
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFORMDELIB1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOACCERTA8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOORDINA13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOIMPEGN13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOSUBIMP13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOLIQUIDA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOMANDAT13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIIM13+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARISU13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIAC13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SIMULAZIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOSUBIMP3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVORESIDU2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVALIQUID3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDMULTI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              }
              else
              {
                if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("VARSUB")), true))
                {
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFORMDELIB1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOACCERTA8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOORDINA13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOIMPEGN13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOSUBIMP13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOLIQUIDA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOMANDAT13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIIM13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARISU13+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIAC13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SIMULAZIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOSUBIMP3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVORESIDU2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVALIQUID3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDMULTI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                }
                else
                {
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFORMDELIB1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOACCERTA8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOORDINA13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOIMPEGN13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOSUBIMP13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOLIQUIDA1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOMANDAT13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIIM13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARISU13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INFOVARIAC13+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SIMULAZIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOSUBIMP3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVORESIDU2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVOORDINA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVALIQUID3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_LIQUIDMULTI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INCASSCOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLINCAS3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INEMISSIONE2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLEMISS2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMECOMPL3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                  MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLPAGAM3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                }
              }
            }
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "SeSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna Esploratore
  // **********************************************************************
  public int AggiornaEsploratore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Esploratore Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_ESPLOPERDELI, 0, false)!=null))
      {
        IDVariant v_PARENT = new IDVariant(0,IDVariant.STRING);
        v_PARENT = TRE_ESPLORATORE.GetParentNode(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH, 0));
        if (IDL.NullValue(v_PARENT,(new IDVariant(""))).equals((new IDVariant("")), true) || IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("CAP")), true) || IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("ART")), true))
        {
          TRE_ESPLORATORE.Refresh(MainFrm, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH, 0), (new IDVariant(0)).booleanValue()); 
        }
        else
        {
          TRE_ESPLORATORE.ActivateNode(MainFrm, v_PARENT, (new IDVariant(-1)).booleanValue(), (new IDVariant(-1)).booleanValue()); 
          TRE_ESPLORATORE.Refresh(MainFrm, v_PARENT, (new IDVariant(-1)).booleanValue()); 
          TRE_ESPLORATORE.ExpandNode(MainFrm, v_PARENT, (new IDVariant(-1)).booleanValue(), (new IDVariant(0)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "AggiornaEsploratore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Informazioni Delibera
  // **********************************************************************
  public int InformazioniDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Informazioni Delibera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORSEDDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMDEL, 0));
      MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "InformazioniDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertamento
  // **********************************************************************
  public int InfoAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0));
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARATIPOFORM, 0, (new IDVariant("INFO")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARATIPOFORM, 0, (new IDVariant("INFORES")));
      }
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "InfoAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Ordinativo
  // **********************************************************************
  public int InfoOrdinativo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Ordinativo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMANNOORD, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMNUMEORD, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
      MainFrm.Show(MyGlb.FRM_INFOORDINATI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "InfoOrdinativo", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0));
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFORES")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "InfoImpegno", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM, 0));
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "InfoSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Liquidazione
  // **********************************************************************
  public int ApriInfoLiquidazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Liquidazione Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ, 0));
      MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "ApriInfoLiquidazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Mandato
  // **********************************************************************
  public int InfoMandato ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Mandato Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMANNMAN, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMNUMMAN, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
      MainFrm.Show(MyGlb.FRM_INFORMMANDAT, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "InfoMandato", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Varimp
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoVarimp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Varimp Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(MyGlb.FRM_INFOVARIIMPE,(new IDVariant(-1)).booleanValue()); 
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI, IMDBDef4.FLD_VARIAZIONI_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI, IMDBDef4.FLD_VARIAZIONI_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI, IMDBDef4.FLD_VARIAZIONI_ROWNAMEPROGR, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORPROVAR, 0));
      MainFrm.Show(MyGlb.FRM_INFOVARIIMPE, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "InfoVarimp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Varsub
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoVarsub ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Varsub Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(MyGlb.FRM_FORMVARISUBI,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMINFUPD, 0, (new IDVariant("INFO")));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEIMPEG, 0, (new IDVariant("INFO")));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEPROGR, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORPROVAR, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMCONPRO, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_FORMVARISUBI, (new IDVariant(0)).intValue(), this); 
      ((FormVariazioniSubimp)MainFrm.GetForm(MyGlb.FRM_FORMVARISUBI,0)).PAN_VARIAZIONI.set_Layout((new IDVariant(1)).intValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "InfoVarsub", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Varacc
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoVaracc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Varacc Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(MyGlb.FRM_VARIAZIONACC,(new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMEPROGR, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORPROVAR, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMCONPRO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMINFUPD, 0, (new IDVariant("INFO")));
      MainFrm.Show(MyGlb.FRM_VARIAZIONACC, (new IDVariant(0)).intValue(), this); 
      ((VariazioniAcc)MainFrm.GetForm(MyGlb.FRM_VARIAZIONACC,0)).PAN_VARIAZIONI.set_Layout((new IDVariant(1)).intValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "InfoVaracc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Menu
  // **********************************************************************
  public int ApriMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Menu Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("DEL")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMESEDE, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORSEDDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMENUMER, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMEANNO, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMUPININ, 0, (new IDVariant("Upd")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMECLOSE, 0, (new IDVariant()));
        MainFrm.Show(MyGlb.FRM_DELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      else
      {
        if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Gestione Movimenti non ammessa per l'esercizio ", IDVariant.STRING));
          MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
          return 0;
        }
        else
        {
          if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("ACC")), true))
          {
            if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
            {
              IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Accertamento")));
            }
            else
            {
              IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Residuo")));
            }
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMANNOACC, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMNUMEACC, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0));
            MainFrm.Show(MyGlb.FRM_ACCERTAMENTI, (new IDVariant(0)).intValue(), this); 
          }
          else
          {
            if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("ORD")), true) || IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("PRE")), true))
            {
              MainFrm.UnloadForm(MyGlb.FRM_ORDINATIVO,(new IDVariant(0)).booleanValue()); 
              IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU1, IMDBDef5.FLD_PARAMETINPU1_PARAMANNOORD, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, 0));
              IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU1, IMDBDef5.FLD_PARAMETINPU1_PARAMNUMEORD, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
              MainFrm.Show(MyGlb.FRM_ORDINATIVO, (new IDVariant(0)).intValue(), this); 
            }
            else
            {
              if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("IMP")), true))
              {
                if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
                {
                  IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("I")));
                }
                else
                {
                  IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("R")));
                }
                IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0));
                IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0));
                MainFrm.Show(MyGlb.FRM_IMPEGNO, (new IDVariant(0)).intValue(), this); 
              }
              else
              {
                if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("SUBIMP")), true))
                {
                  if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
                  {
                    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("I")));
                  }
                  else
                  {
                    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("R")));
                  }
                  IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0));
                  IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM, 0));
                  MainFrm.Show(MyGlb.FRM_SUBIMPEGNO, (new IDVariant(0)).intValue(), this); 
                }
                else
                {
                  if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("LIQ")), true))
                  {
                    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ, 0));
                    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ, 0));
                    MainFrm.Show(MyGlb.FRM_LIQUIDAZIONE, (new IDVariant(0)).intValue(), this); 
                  }
                  else
                  {
                    if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("MAN")), true))
                    {
                      IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMNUMDAL, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
                      IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMENUMAL, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
                      IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANMAOR, 0));
                      IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMDATDAL, 0, (new IDVariant()));
                      IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMEDATAL, 0, (new IDVariant()));
                      IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMAPDAES, 0, (new IDVariant("SI")));
                      MainFrm.Show(MyGlb.FRM_MANDATI, (new IDVariant(0)).intValue(), this); 
                    }
                  }
                }
              }
            }
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "ApriMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Simulazione Menu
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SimulazioneMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Simulazione Menu Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI48, IMDBDef6.FLD_PARAMETRI48_PARAENTRSPES, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI48, IMDBDef6.FLD_PARAMETRI48_PARAMCAPITOL, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI48, IMDBDef6.FLD_PARAMETRI48_PARAMARTICOL, 0, ((IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0).equals((new IDVariant(-1))))?(new IDVariant(0)):IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0)));
      MainFrm.Show(MyGlb.FRM_STANBILASIMU, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "SimulazioneMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovo Sub Impegno Menu
  // **********************************************************************
  public int NuovoSubImpegnoMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Sub Impegno Menu Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non ammessa per l'esercizio ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("I")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANSUIM, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUSUIM, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_RONANUSUDAES, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMEARTIC, 0, ((IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0).equals((new IDVariant(-1))))?(new IDVariant(0)):IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0)));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0));
        MainFrm.Show(MyGlb.FRM_SUBIMPEGNO, (new IDVariant(0)).intValue(), this); 
        ((SubImpegno)MainFrm.GetForm(MyGlb.FRM_SUBIMPEGNO,0,true,this)).ProponiNuovaRigaSubimpegno();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "NuovoSubImpegnoMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovo Residuo Menu
  // **********************************************************************
  public int NuovoResiduoMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Residuo Menu Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non ammessa per l'esercizio ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
      }
      else
      {
        if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0).equals((new IDVariant("E")), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMCAPITOL, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMARTICOL, 0, ((IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0).equals((new IDVariant(-1))))?(new IDVariant(0)):IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0)));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Residuo")));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARANUODAESP, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAUNITORGA, 0, (new IDVariant()));
          MainFrm.Show(MyGlb.FRM_ACCERTAMENTI, (new IDVariant(0)).intValue(), this); 
          ((Accertamenti)MainFrm.GetForm(MyGlb.FRM_ACCERTAMENTI,0,true,this)).NUOVARIGA();
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("R")));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMANNIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMNUMIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_RONANUIMDAES, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMEARTIC, 0, ((IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0).equals((new IDVariant(-1))))?(new IDVariant(0)):IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0)));
          MainFrm.Show(MyGlb.FRM_IMPEGNO, (new IDVariant(0)).intValue(), this); 
          ((Impegno)MainFrm.GetForm(MyGlb.FRM_IMPEGNO,0)).PAN_IMPEGNO.PanelCommand(Glb.PCM_INSERT);
          ((Impegno)MainFrm.GetForm(MyGlb.FRM_IMPEGNO,0,true,this)).ProponiNuovaRigaImpegno();
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "NuovoResiduoMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovo Ordinativo Menu
  // **********************************************************************
  public int NuovoOrdinativoMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Ordinativo Menu Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non ammessa per l'esercizio ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
      }
      else
      {
        if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("PEG")), true) || IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("INT")), true) || IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("CAP")), true) || IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("ART")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU2, IMDBDef5.FLD_PARAMETINPU2_PARAMCAPITOL, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU2, IMDBDef5.FLD_PARAMETINPU2_PARAMARTICOL, 0, ((IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0).equals((new IDVariant(-1))))?(new IDVariant(0)):IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0)));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU2, IMDBDef5.FLD_PARAMETINPU2_PARAPRODAESP, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU2, IMDBDef5.FLD_PARAMETINPU2_PARPRONURIDE, 0, (new IDVariant("SI")));
          MainFrm.Show(MyGlb.FRM_NUOORDCOACAU, (new IDVariant(0)).intValue(), this); 
        }
        else
        {
          if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("ACC")), true))
          {
            IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU1, IMDBDef5.FLD_PARAMETINPU1_PARAMANNOACC, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU1, IMDBDef5.FLD_PARAMETINPU1_PARAMNUMEACC, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU1, IMDBDef5.FLD_PARAMETINPU1_PARAMCAPITOL, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU1, IMDBDef5.FLD_PARAMETINPU1_PARAMARTICOL, 0, ((IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0).equals((new IDVariant(-1))))?(new IDVariant(0)):IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0)));
            IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU1, IMDBDef5.FLD_PARAMETINPU1_PARAPRODAESP, 0, (new IDVariant("SI")));
            MainFrm.Show(MyGlb.FRM_ORDINATIVO, (new IDVariant(0)).intValue(), this); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "NuovoOrdinativoMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuova Liquidazione Menu
  // **********************************************************************
  public int NuovaLiquidazioneMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuova Liquidazione Menu Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non ammessa per l'esercizio ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
      }
      else
      {
        MainFrm.UnloadForm(MyGlb.FRM_LIQUIDAZIONE,(new IDVariant(0)).booleanValue()); 
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMANNOLIQ, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMNUMELIQ, 0, (new IDVariant()));
        if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("SUBIMP")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARANNSUBIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARNUMSUBIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMANNOIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMNUMEIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0));
        }
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMCAPITOL, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRCAPI, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMARTICOL, 0, ((IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0).equals((new IDVariant(-1))))?(new IDVariant(0)):IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRARTI, 0)));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAPRODAESP, 0, (new IDVariant("SI")));
        MainFrm.Show(MyGlb.FRM_LIQUIDAZIONE, (new IDVariant(0)).intValue(), this); 
        ((Liquidazione)MainFrm.GetForm(MyGlb.FRM_LIQUIDAZIONE,0,true,this)).PropostaSuNuovaRiga();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "NuovaLiquidazioneMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Liquidazione Multipla Menu
  // **********************************************************************
  public int LiquidazioneMultiplaMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_BOLLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_DESCRIZIONEP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DESCRIZIONEP = (new IDVariant("Saldo Fattura", IDVariant.STRING));
      // 
      // Liquidazione Multipla Menu Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.compareTo((new IDVariant(0)), true)>0 && MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)<=0)
      {
        LIQUMULTMENU_PARLIQMULDEL();
        LIQUMULTMENU_PARFAS2DELRO();
        LIQUMULTMENU_PARFAS1DELRO();
        LIQUMULTMENU_PAROLFA1DERO();
        IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_DESCRIZIONE, 0, new IDVariant(v_DESCRIZIONEP));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.CODICE) as MINT60CODICE ");
        SQL.append("from ");
        SQL.append("  T60 A ");
        SQL.append("where (A.TIPO = 'F') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_BOLLO = QV.Get("MINT60CODICE", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_BOLLO, 0, new IDVariant(v_BOLLO));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_ANNO_IMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_NUMERO_IMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0));
        if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("SUBIMP")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM, 0));
        }
        IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_PARAPRODAESP, 0, (new IDVariant("SI")));
        MainFrm.Show(MyGlb.FRM_FASE1ESTRLIQ, (new IDVariant(0)).intValue(), this); 
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non Ammessa per l'Esercizio ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "LiquidazioneMultiplaMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Liquidazione Multipla: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void LIQUMULTMENU_PARLIQMULDEL() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CAPITOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_ARTICOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMTITOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCATEGOR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCODINTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCODTERZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_ANNO_IMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_NUMERO_IMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_ANNO_SUBIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_NUMERO_SUBIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_SEDE_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_DESCRIZIONE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_BOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_ANNO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_UNITA_PROPONENTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_NUMERO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_VOCE_ECON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_D_DATA_REG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CODICE_GESTIONALE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMINEMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARATIPOVINC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMRILECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMFATTORE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCENTRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMFINANZI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_UFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CAUSALE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_DIVERSO_BEN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_NUM_QUIETANZA_DIV_BEN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_NUMERO_CONTABILE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_DATA_CONTABILE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_SPESE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_SCADENZA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_ALLEGATI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_COMMISSIONI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_INFO_TESORIERE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAPRODAESP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CIG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_MOTIVO_ESCLUSIONE_CIG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CODICE_COFOG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CODICE_EUROPEO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_COD_LIVELLO_5, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri Fase 2: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LIQUMULTMENU_PARFAS2DELRO() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE2, IMDBDef5.FLD_PARAMETFASE2_PARDATPRODAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE2, IMDBDef5.FLD_PARAMETFASE2_PARADATPROAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE2, IMDBDef5.FLD_PARAMETFASE2_PARAMSCADDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE2, IMDBDef5.FLD_PARAMETFASE2_PARAMSCADEAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE2, IMDBDef5.FLD_PARAMETFASE2_PARAMORDINAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE2, IMDBDef5.FLD_PARAMETFASE2_PARATOTAPARZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE2, IMDBDef5.FLD_PARAMETFASE2_PARACODIBENE, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri Fase 1: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LIQUMULTMENU_PARFAS1DELRO() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_ANNO_IMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_NUMERO_IMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_ANNO_SUBIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_NUMERO_SUBIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_DESCRIZIONE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_BOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_PARAPRODAESP, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri Old Fase 1: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LIQUMULTMENU_PAROLFA1DERO() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_IMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_IMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_SUBIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_SUBIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_VOCE_ECON, 0, new IDVariant());
  }

  // **********************************************************************
  // Incasso Completo Menu
  // **********************************************************************
  public int IncassoCompletoMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Incasso Completo Menu Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non ammessa per l'esercizio ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEDAL, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
        IMDB.set_Value(IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEAL, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
        MainFrm.Show(MyGlb.FRM_INCASSCOMPLE, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "IncassoCompletoMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Incasso Menu
  // **********************************************************************
  public int AnnullaIncassoMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Incasso Menu Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non ammessa per l'esercizio ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEDA, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
        IMDB.set_Value(IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEA, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
        MainFrm.Show(MyGlb.FRM_ANNULLINCASS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "AnnullaIncassoMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // In Emissione Menu
  // **********************************************************************
  public int InEmissioneMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // In Emissione Menu Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non ammessa per l'esercizio ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
      }
      else
      {
        IDVariant v_PARENT = new IDVariant(0,IDVariant.STRING);
        v_PARENT = TRE_ESPLORATORE.GetParentNode(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH, 0));
        // 
        // controlli cassa in emissione
        // 
        {
          IDVariant v_IMPORTOCASSA = null;
          v_IMPORTOCASSA = (new IDVariant());
          try
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  NVL(CONTROLLO_DISP_CASSA_VPRO_CAP(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",A.CAPITOLO,A.ARTICOLO,'EM'), 0) - A.IMPORTO as NVCDCVCSELCL ");
            SQL.append("from ");
            SQL.append("  LIQ A ");
            SQL.append("where (A.NUMERO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_IMPORTOCASSA = QV.Get("NVCDCVCSELCL", IDVariant.DECIMAL) ;
            }
            QV.Close();
          }
          catch (Exception e6)
          {
            MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
            return 0;
          }
          if (IDL.NullValue(v_IMPORTOCASSA,(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Disponibilità di cassa negativa."));
            if (MainFrm.CONCASLIQEMI.equals((new IDVariant(1)), true))
            {
              MainFrm.set_AlertMessage(v_AVVISO); 
              return 0;
            }
            else
            {
              IDVariant v_CONTINUARE = new IDVariant(0,IDVariant.STRING);
              v_CONTINUARE = (new IDVariant(" Continuare?"));
              if (!(MainFrm.MessageConfirm(IDL.Add(v_AVVISO, v_CONTINUARE))))
              {
                return 0;
              }
            }
          }
        }
        if (MainFrm.FINANZIAMENT.booleanValue())
        {
          IDVariant v_FINANZIAMENT = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);
          IDVariant v_RITORNO = new IDVariant(0,IDVariant.INTEGER);
          v_FINANZIAMENT = (new IDVariant());
          v_IMPORTO = (new IDVariant());
          v_RITORNO = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.FINANZIAMENTO as LIQFINANZIAM, ");
          SQL.append("  A.IMPORTO as LIQIMPORTO ");
          SQL.append("from ");
          SQL.append("  LIQ A ");
          SQL.append("where (A.ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_FINANZIAMENT = QV.Get("LIQFINANZIAM", IDVariant.INTEGER) ;
            v_IMPORTO = QV.Get("LIQIMPORTO", IDVariant.DECIMAL) ;
          }
          QV.Close();
          if (!(IDL.IsNull(v_FINANZIAMENT)))
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.CONTROLLODISPCASSAFIN(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_FINANZIAMENT, (new IDVariant()), v_IMPORTO, v_RITORNO);
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
              return 0;
            }
            if (v_RITORNO.equals((new IDVariant(1)), true))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Finanziamento in Anticipazione. Si vuole continuare?", IDVariant.STRING));
              if (!(MainFrm.MessageConfirm(v_AVVISO)))
              {
                return 0;
              }
            }
          }
        }
        try
        {
          SQL = new StringBuffer();
          SQL.append("update LIQ set ");
          SQL.append("  ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append("where (ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e22)
        {
          MainFrm.set_AlertMessage(new IDVariant(e22.getMessage())); 
        }
        TRE_ESPLORATORE.ActivateNode(MainFrm, v_PARENT, (new IDVariant(-1)).booleanValue(), (new IDVariant(0)).booleanValue()); 
        TRE_ESPLORATORE.Refresh(MainFrm, v_PARENT, (new IDVariant(-1)).booleanValue()); 
        TRE_ESPLORATORE.ExpandNode(MainFrm, v_PARENT, (new IDVariant(-1)).booleanValue(), (new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "InEmissioneMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Emissione Menu
  // **********************************************************************
  public int AnnullaEmissioneMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Emissione Menu Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non ammessa per l'esercizio ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
      }
      else
      {
        IDVariant v_PARENT = new IDVariant(0,IDVariant.STRING);
        v_PARENT = TRE_ESPLORATORE.GetParentNode(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH, 0));
        try
        {
          SQL = new StringBuffer();
          SQL.append("update LIQ set ");
          SQL.append("  ANNO_MAND = to_number(NULL) ");
          SQL.append("where (ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANNLIQ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMLIQ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e5)
        {
          MainFrm.set_AlertMessage(new IDVariant(e5.getMessage())); 
        }
        TRE_ESPLORATORE.ActivateNode(MainFrm, v_PARENT, (new IDVariant(-1)).booleanValue(), (new IDVariant(0)).booleanValue()); 
        TRE_ESPLORATORE.Refresh(MainFrm, v_PARENT, (new IDVariant(-1)).booleanValue()); 
        TRE_ESPLORATORE.ExpandNode(MainFrm, v_PARENT, (new IDVariant(-1)).booleanValue(), (new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "AnnullaEmissioneMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pagamento Completo Menu
  // **********************************************************************
  public int PagamentoCompletoMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pagamento Completo Menu Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Gestione Movimenti non ammessi", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI148, IMDBDef5.FLD_PARAMETRI148_PARNUMMANDAL, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI148, IMDBDef5.FLD_PARAMETRI148_PARANUMMANAL, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
        MainFrm.Show(MyGlb.FRM_PAGAMECOMPLE, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "PagamentoCompletoMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Pagamento Menu
  // **********************************************************************
  public int AnnullaPagamentoMenu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Pagamento Menu Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Gestione Movimenti non ammessa per l'esercizio ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI142, IMDBDef5.FLD_PARAMETRI142_PARANUMMANDA, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI142, IMDBDef5.FLD_PARAMETRI142_PARANUMEMANA, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUMAOR, 0));
        MainFrm.Show(MyGlb.FRM_ANNULLPAGAME, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "AnnullaPagamentoMenu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Espandi Tutto
  // **********************************************************************
  public int EspandiTutto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Espandi Tutto Body
      // Procedure Body
      // 
      TRE_ESPLORATORE.ExpandNodesLevel(MainFrm, (new IDVariant(2)).intValue(), (new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "EspandiTutto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Comprimi Tutto
  // **********************************************************************
  public int ComprimiTutto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Comprimi Tutto Body
      // Procedure Body
      // 
      TRE_ESPLORATORE.ExpandNodesLevel(MainFrm, (new IDVariant(0)).intValue(), (new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "ComprimiTutto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Espandi Nodo
  // **********************************************************************
  public int EspandiNodo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Espandi Nodo Body
      // Procedure Body
      // 
      EspandiRicorsivamente(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "EspandiNodo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Espandi Ricorsivamente
  // Nodo:  - Input
  // **********************************************************************
  public int EspandiRicorsivamente (IDVariant Nodo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMFIGLI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NODO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Espandi Ricorsivamente Body
      // Procedure Body
      // 
      TRE_ESPLORATORE.ExpandNode(MainFrm, Nodo, (new IDVariant(-1)).booleanValue(), (new IDVariant(0)).booleanValue()); 
      v_NUMFIGLI = IDL.Sub(TRE_ESPLORATORE.GetChildrenCount(Nodo), (new IDVariant(1)));
      while (v_NUMFIGLI.compareTo((new IDVariant(0)), true)>=0)
      {
        v_NODO = TRE_ESPLORATORE.GetChildrenNode(Nodo, v_NUMFIGLI);
        v_NUMFIGLI = IDL.Sub(v_NUMFIGLI, (new IDVariant(1)));
        EspandiRicorsivamente(v_NODO);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "EspandiRicorsivamente", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Comprimi Nodo
  // **********************************************************************
  public int ComprimiNodo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Comprimi Nodo Body
      // Procedure Body
      // 
      ComprimiRicorsivamente(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "ComprimiNodo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Comprimi Ricorsivamente
  // Nodo:  - Input
  // **********************************************************************
  public int ComprimiRicorsivamente (IDVariant Nodo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMFIGLI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NODO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Comprimi Ricorsivamente Body
      // Procedure Body
      // 
      v_NUMFIGLI = IDL.Sub(TRE_ESPLORATORE.GetChildrenCount(Nodo), (new IDVariant(1)));
      while (v_NUMFIGLI.compareTo((new IDVariant(0)), true)>=0)
      {
        v_NODO = TRE_ESPLORATORE.GetChildrenNode(Nodo, v_NUMFIGLI);
        v_NUMFIGLI = IDL.Sub(v_NUMFIGLI, (new IDVariant(1)));
        ComprimiRicorsivamente(v_NODO);
      }
      TRE_ESPLORATORE.ExpandNode(MainFrm, Nodo, (new IDVariant(0)).booleanValue(), (new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "ComprimiRicorsivamente", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna Nodo
  // **********************************************************************
  public int AggiornaNodo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Nodo Body
      // Corpo Procedura
      // 
      TRE_ESPLORATORE.Refresh(MainFrm, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRHASH, 0), (new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsploratorePerDelibera", "AggiornaNodo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Esploratore VIWEB
  // Primary record source for panel data
  // **********************************************************************
  private void ESPLOPERDELI_PARAESPLVI28() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PARAESPLVI28_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMEESPLO8, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMEESPLO8, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PARAESPLVI28_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PARAESPLVI28_RS, 0, IMDBDef6.TBL_PARAMEESPLO8, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAESPLVI28_RS, 0, 0, IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARASCHEINFO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAESPLVI28_RS, 1, 0, IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAESERSCHE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAESPLVI28_RS, 2, 0, IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAMNUMEDEL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAESPLVI28_RS, 3, 0, IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAMSEDEDEL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAESPLVI28_RS, 4, 0, IMDBDef6.TBL_PARAMEESPLO8, IMDBDef6.FLD_PARAMEESPLO8_PARAMANNODEL, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMEESPLO8, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMEESPLO8, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMEESPLO8, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PARAESPLVI28_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_ESERCIZIO)
      {
        PFL_PARAMETRI_ESERCIZIO_ValidateCell(Cancel);
      }
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

  private void TRE_ESPLORATORE_NodeClick(ATreeNode Node)
  {
    if (TRE_ESPLORATORE.NodeClick(MainFrm, Node))
    {
      if (Node.Key.substring(0,6).equals("N00001"))
      {
      ConservaValoriOrgDel();
      }
      if (Node.Key.substring(0,6).equals("N00002"))
      {
      ConservaValoriDel();
      }
      if (Node.Key.substring(0,6).equals("N00003"))
      {
      ConservaValoriLivello1();
      }
      if (Node.Key.substring(0,6).equals("N00004"))
      {
      ConservaValoriLivello1();
      }
    }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PARAMESCHEDA, "4C1FE3CA-8506-443B-AA58-7FE36BDB8275");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PARAMESCHEDA, "Parametri Scheda");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PARAMESCHEDA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PARAMESCHEDA, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PARAMESCHEDA, MyGlb.PANEL_LIST, 0, -9999, 256, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PARAMESCHEDA, MyGlb.PANEL_FORM, 4, 12, 268, 28, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PARAMESCHEDA, 0, 101);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PARAMESCHEDA, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PARAMESCHEDA, 0, 1);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PARAMESCHEDA, 1, 1);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PARAMESCHEDA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPOFILTRO, "5DC6843B-6833-4F4F-B510-64CA7E4B54F3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPOFILTRO, "Gruppo filtro");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPOFILTRO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPOFILTRO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPOFILTRO, MyGlb.PANEL_LIST, 0, -9999, 432, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPOFILTRO, MyGlb.PANEL_FORM, 292, 12, 256, 28, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPOFILTRO, 0, 71);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPOFILTRO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPOFILTRO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPOFILTRO, 1, 1);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPPOFILTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, "688F4AC3-C29E-4958-B8D9-17C81C379C45");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, "Scheda Informativa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, "Scheda Informativa");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "0C57D965-9EBD-4652-A3C0-4FD957DC7B22");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "Esercizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "53288F29-1250-4CFA-A76A-5A4E4CD5EACD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETRATTI, "C82E9876-5B7F-4CE6-AC7A-0BC5A934C2A3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETRATTI, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETRATTI, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETRATTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "B76CA138-985B-4509-A54B-538C228FA931");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "Numero Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETBARRA, "27CF96B9-AA1C-4D6F-8094-3C2237FEC291");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETBARRA, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETBARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETBARRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "777B4664-4BAD-4A7B-8CC5-EADB239088D5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "Anno Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, MyGlb.PANEL_LIST, "Scheda Informativa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, MyGlb.PANEL_FORM, 8, 16, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCHEDAINFORM, MyGlb.PANEL_FORM, "Scheda Informativa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCHEDAINFORM, -1, GRP_PARAMETRI_PARAMESCHEDA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCHEDAINFORM, PPQRY_PARAESPLVI28, "A.PARASCHEINFO", "PARASCHEINFO", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SCHEDAINFORM, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SCHEDAINFORM, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 156, 16, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIO, -1, GRP_PARAMETRI_PARAMESCHEDA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIO, PPQRY_PARAESPLVI28, "A.PARAESERSCHE", "PARAESERSCHE", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, "Delibera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 296, 16, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SEDEDEL, -1, GRP_PARAMETRI_GRUPPOFILTRO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SEDEDEL, PPQRY_PARAESPLVI28, "A.PARAMSEDEDEL", "PARAMSEDEDEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETRATTI, MyGlb.PANEL_LIST, 580, 24, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETRATTI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETRATTI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETRATTI, MyGlb.PANEL_FORM, 416, 16, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETRATTI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETRATTI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHETRATTI, -1, GRP_PARAMETRI_GRUPPOFILTRO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHETRATTI, -1, "", "ETICHETRATTI", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, "Numero Del");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 436, 16, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, "Numero Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODEL, -1, GRP_PARAMETRI_GRUPPOFILTRO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODEL, PPQRY_PARAESPLVI28, "A.PARAMNUMEDEL", "PARAMNUMEDEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETBARRA, MyGlb.PANEL_LIST, 588, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETBARRA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETBARRA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETBARRA, MyGlb.PANEL_FORM, 484, 16, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETBARRA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETBARRA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHETBARRA, -1, GRP_PARAMETRI_GRUPPOFILTRO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHETBARRA, -1, "", "ETICHETBARRA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, "Anno Del");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 504, 16, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, "Anno Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODEL, -1, GRP_PARAMETRI_GRUPPOFILTRO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODEL, PPQRY_PARAESPLVI28, "A.PARAMANNODEL", "PARAMANNODEL", 1, 4, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI, ");
    SQL.append("  A.ESERCIZIO as ESEFDESCESER ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.ESERCIZIO = ~~PARAESERSCHE~~) ");
    SQL.append("and   ((A.ESERCIZIO BETWEEN ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2)) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_PARAMETRI.SetQuery(PPQRY_ESEFIN, 0, SQL, PFL_PARAMETRI_ESERCIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI, ");
    SQL.append("  A.ESERCIZIO as ESEFDESCESER ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where ((A.ESERCIZIO BETWEEN ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2)) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_PARAMETRI.SetQuery(PPQRY_ESEFIN, 1, SQL, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_ESEFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAESPLVI28", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAESPLVI28, IMDBDef16.PQRY_PARAESPLVI28_RS, IMDBDef6.TBL_PARAMEESPLO8);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SCHEDAINFORM, IMDBDef6.FLD_PARAMEESPLO8_PARASCHEINFO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIO, IMDBDef6.FLD_PARAMEESPLO8_PARAESERSCHE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SEDEDEL, IMDBDef6.FLD_PARAMEESPLO8_PARAMSEDEDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODEL, IMDBDef6.FLD_PARAMEESPLO8_PARAMNUMEDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODEL, IMDBDef6.FLD_PARAMEESPLO8_PARAMANNODEL);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMEESPLO8");
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
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
    if (SrcObj == TRE_ESPLORATORE) TRE_ESPLORATORE_NodeClick(Node);
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
    if (SrcObj.Code.equals("MENUCONTEST8")) CMDS_MENUCONTEST8_OnOpenPopup(Direction, Cancel);
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
