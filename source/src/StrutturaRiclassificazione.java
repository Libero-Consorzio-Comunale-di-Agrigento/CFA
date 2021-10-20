// **********************************************
// Struttura Riclassificazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StrutturaRiclassificazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_TIPORICLASSI = 0;
  private static int PFL_PARS_CODICE = 1;

  private static int PPQRY_PARS20 = 0;

  private static int PPQRY_TIPIRICLASSI = 1;

  private static int PPQRY_TIPIRICLASS1 = 2;


  IDPanel PAN_PARS;
  ATree TRE_STRUTTRICLAS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS28(IMDB);
    //
    //
    Init_PQRY_PARS20(IMDB);
    Init_PQRY_PARS20_RS(IMDB);
    Init_PQRY_VISSTRRICAR1(IMDB);
    Init_PQRY_VISSTRRICAR2(IMDB);
    Init_PQRY_VISSTRRICAR3(IMDB);
    Init_PQRY_VISSTRRICAR4(IMDB);
    Init_PQRY_VISSTRRICAR5(IMDB);
    Init_PQRY_VISSTRRICAR6(IMDB);
    Init_PQRY_VISSTRRICAR7(IMDB);
    Init_PQRY_VISSTRRICAR8(IMDB);
    Init_PQRY_VISSTRRICAR9(IMDB);
    Init_PQRY_VISSTRRICA10(IMDB);
    Init_PQRY_VISSTRRICA11(IMDB);
    Init_PQRY_VISSTRRICA12(IMDB);
    Init_PQRY_VISSTRRICA13(IMDB);
    Init_PQRY_VISSTRRICA14(IMDB);
    Init_PQRY_VISSTRRICARM(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS28(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARS28, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARS28, "TBL_PARS28");
    IMDB.set_FldCode(IMDBDef1.TBL_PARS28,IMDBDef1.FLD_PARS28_NOMOGGTIPRIC, "NOMOGGTIPRIC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS28,IMDBDef1.FLD_PARS28_NOMOGGTIPRIC,1,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS28,IMDBDef1.FLD_PARS28_NOMOGGCONVIS, "NOMOGGCONVIS");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS28,IMDBDef1.FLD_PARS28_NOMOGGCONVIS,5,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARS28, 0);
  }

  private static void Init_PQRY_PARS20(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARS20, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARS20, "PQRY_PARS20");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARS20,IMDBDef8.PQSL_PARS20_NOMOGGTIPRIC, "NOMOGGTIPRIC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARS20,IMDBDef8.PQSL_PARS20_NOMOGGTIPRIC,1,10,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PARS20, 0);
  }

  private static void Init_PQRY_PARS20_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARS20_RS, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARS20_RS, "PQRY_PARS20_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARS20_RS,IMDBDef8.PQSL_PARS20_NOMOGGTIPRIC, "NOMOGGTIPRIC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARS20_RS,IMDBDef8.PQSL_PARS20_NOMOGGTIPRIC,1,10,0);
  }

  private static void Init_PQRY_VISSTRRICAR1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICAR1, 4);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICAR1, "PQRY_VISSTRRICAR1");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR1,IMDBDef8.PQSL_VISSTRRICAR1_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR1,IMDBDef8.PQSL_VISSTRRICAR1_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR1,IMDBDef8.PQSL_VISSTRRICAR1_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR1,IMDBDef8.PQSL_VISSTRRICAR1_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR1,IMDBDef8.PQSL_VISSTRRICAR1_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR1,IMDBDef8.PQSL_VISSTRRICAR1_HASH,5,298,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR1,IMDBDef8.PQSL_VISSTRRICAR1_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR1,IMDBDef8.PQSL_VISSTRRICAR1_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICAR1, 0);
  }

  private static void Init_PQRY_VISSTRRICAR2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICAR2, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICAR2, "PQRY_VISSTRRICAR2");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR2,IMDBDef8.PQSL_VISSTRRICAR2_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR2,IMDBDef8.PQSL_VISSTRRICAR2_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR2,IMDBDef8.PQSL_VISSTRRICAR2_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR2,IMDBDef8.PQSL_VISSTRRICAR2_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR2,IMDBDef8.PQSL_VISSTRRICAR2_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR2,IMDBDef8.PQSL_VISSTRRICAR2_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR2,IMDBDef8.PQSL_VISSTRRICAR2_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR2,IMDBDef8.PQSL_VISSTRRICAR2_HASH,5,298,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR2,IMDBDef8.PQSL_VISSTRRICAR2_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR2,IMDBDef8.PQSL_VISSTRRICAR2_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICAR2, 0);
  }

  private static void Init_PQRY_VISSTRRICAR3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICAR3, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICAR3, "PQRY_VISSTRRICAR3");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR3,IMDBDef8.PQSL_VISSTRRICAR3_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR3,IMDBDef8.PQSL_VISSTRRICAR3_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR3,IMDBDef8.PQSL_VISSTRRICAR3_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR3,IMDBDef8.PQSL_VISSTRRICAR3_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR3,IMDBDef8.PQSL_VISSTRRICAR3_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR3,IMDBDef8.PQSL_VISSTRRICAR3_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR3,IMDBDef8.PQSL_VISSTRRICAR3_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR3,IMDBDef8.PQSL_VISSTRRICAR3_HASH,5,397,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR3,IMDBDef8.PQSL_VISSTRRICAR3_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR3,IMDBDef8.PQSL_VISSTRRICAR3_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICAR3, 0);
  }

  private static void Init_PQRY_VISSTRRICAR4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICAR4, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICAR4, "PQRY_VISSTRRICAR4");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR4,IMDBDef8.PQSL_VISSTRRICAR4_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR4,IMDBDef8.PQSL_VISSTRRICAR4_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR4,IMDBDef8.PQSL_VISSTRRICAR4_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR4,IMDBDef8.PQSL_VISSTRRICAR4_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR4,IMDBDef8.PQSL_VISSTRRICAR4_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR4,IMDBDef8.PQSL_VISSTRRICAR4_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR4,IMDBDef8.PQSL_VISSTRRICAR4_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR4,IMDBDef8.PQSL_VISSTRRICAR4_HASH,5,596,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR4,IMDBDef8.PQSL_VISSTRRICAR4_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR4,IMDBDef8.PQSL_VISSTRRICAR4_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICAR4, 0);
  }

  private static void Init_PQRY_VISSTRRICAR5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICAR5, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICAR5, "PQRY_VISSTRRICAR5");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR5,IMDBDef8.PQSL_VISSTRRICAR5_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR5,IMDBDef8.PQSL_VISSTRRICAR5_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR5,IMDBDef8.PQSL_VISSTRRICAR5_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR5,IMDBDef8.PQSL_VISSTRRICAR5_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR5,IMDBDef8.PQSL_VISSTRRICAR5_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR5,IMDBDef8.PQSL_VISSTRRICAR5_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR5,IMDBDef8.PQSL_VISSTRRICAR5_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR5,IMDBDef8.PQSL_VISSTRRICAR5_HASH,5,496,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR5,IMDBDef8.PQSL_VISSTRRICAR5_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR5,IMDBDef8.PQSL_VISSTRRICAR5_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICAR5, 0);
  }

  private static void Init_PQRY_VISSTRRICAR6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICAR6, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICAR6, "PQRY_VISSTRRICAR6");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR6,IMDBDef8.PQSL_VISSTRRICAR6_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR6,IMDBDef8.PQSL_VISSTRRICAR6_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR6,IMDBDef8.PQSL_VISSTRRICAR6_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR6,IMDBDef8.PQSL_VISSTRRICAR6_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR6,IMDBDef8.PQSL_VISSTRRICAR6_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR6,IMDBDef8.PQSL_VISSTRRICAR6_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR6,IMDBDef8.PQSL_VISSTRRICAR6_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR6,IMDBDef8.PQSL_VISSTRRICAR6_HASH,5,794,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR6,IMDBDef8.PQSL_VISSTRRICAR6_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR6,IMDBDef8.PQSL_VISSTRRICAR6_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICAR6, 0);
  }

  private static void Init_PQRY_VISSTRRICAR7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICAR7, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICAR7, "PQRY_VISSTRRICAR7");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR7,IMDBDef8.PQSL_VISSTRRICAR7_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR7,IMDBDef8.PQSL_VISSTRRICAR7_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR7,IMDBDef8.PQSL_VISSTRRICAR7_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR7,IMDBDef8.PQSL_VISSTRRICAR7_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR7,IMDBDef8.PQSL_VISSTRRICAR7_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR7,IMDBDef8.PQSL_VISSTRRICAR7_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR7,IMDBDef8.PQSL_VISSTRRICAR7_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR7,IMDBDef8.PQSL_VISSTRRICAR7_HASH,5,496,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR7,IMDBDef8.PQSL_VISSTRRICAR7_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR7,IMDBDef8.PQSL_VISSTRRICAR7_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICAR7, 0);
  }

  private static void Init_PQRY_VISSTRRICAR8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICAR8, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICAR8, "PQRY_VISSTRRICAR8");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR8,IMDBDef8.PQSL_VISSTRRICAR8_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR8,IMDBDef8.PQSL_VISSTRRICAR8_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR8,IMDBDef8.PQSL_VISSTRRICAR8_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR8,IMDBDef8.PQSL_VISSTRRICAR8_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR8,IMDBDef8.PQSL_VISSTRRICAR8_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR8,IMDBDef8.PQSL_VISSTRRICAR8_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR8,IMDBDef8.PQSL_VISSTRRICAR8_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR8,IMDBDef8.PQSL_VISSTRRICAR8_HASH,5,794,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR8,IMDBDef8.PQSL_VISSTRRICAR8_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR8,IMDBDef8.PQSL_VISSTRRICAR8_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICAR8, 0);
  }

  private static void Init_PQRY_VISSTRRICAR9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICAR9, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICAR9, "PQRY_VISSTRRICAR9");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR9,IMDBDef8.PQSL_VISSTRRICAR9_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR9,IMDBDef8.PQSL_VISSTRRICAR9_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR9,IMDBDef8.PQSL_VISSTRRICAR9_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR9,IMDBDef8.PQSL_VISSTRRICAR9_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR9,IMDBDef8.PQSL_VISSTRRICAR9_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR9,IMDBDef8.PQSL_VISSTRRICAR9_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR9,IMDBDef8.PQSL_VISSTRRICAR9_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR9,IMDBDef8.PQSL_VISSTRRICAR9_HASH,5,496,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICAR9,IMDBDef8.PQSL_VISSTRRICAR9_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICAR9,IMDBDef8.PQSL_VISSTRRICAR9_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICAR9, 0);
  }

  private static void Init_PQRY_VISSTRRICA10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICA10, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICA10, "PQRY_VISSTRRICA10");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA10,IMDBDef8.PQSL_VISSTRRICA10_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA10,IMDBDef8.PQSL_VISSTRRICA10_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA10,IMDBDef8.PQSL_VISSTRRICA10_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA10,IMDBDef8.PQSL_VISSTRRICA10_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA10,IMDBDef8.PQSL_VISSTRRICA10_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA10,IMDBDef8.PQSL_VISSTRRICA10_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA10,IMDBDef8.PQSL_VISSTRRICA10_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA10,IMDBDef8.PQSL_VISSTRRICA10_HASH,5,794,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA10,IMDBDef8.PQSL_VISSTRRICA10_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA10,IMDBDef8.PQSL_VISSTRRICA10_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICA10, 0);
  }

  private static void Init_PQRY_VISSTRRICA11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICA11, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICA11, "PQRY_VISSTRRICA11");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA11,IMDBDef8.PQSL_VISSTRRICA11_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA11,IMDBDef8.PQSL_VISSTRRICA11_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA11,IMDBDef8.PQSL_VISSTRRICA11_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA11,IMDBDef8.PQSL_VISSTRRICA11_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA11,IMDBDef8.PQSL_VISSTRRICA11_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA11,IMDBDef8.PQSL_VISSTRRICA11_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA11,IMDBDef8.PQSL_VISSTRRICA11_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA11,IMDBDef8.PQSL_VISSTRRICA11_HASH,5,496,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA11,IMDBDef8.PQSL_VISSTRRICA11_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA11,IMDBDef8.PQSL_VISSTRRICA11_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICA11, 0);
  }

  private static void Init_PQRY_VISSTRRICA12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICA12, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICA12, "PQRY_VISSTRRICA12");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA12,IMDBDef8.PQSL_VISSTRRICA12_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA12,IMDBDef8.PQSL_VISSTRRICA12_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA12,IMDBDef8.PQSL_VISSTRRICA12_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA12,IMDBDef8.PQSL_VISSTRRICA12_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA12,IMDBDef8.PQSL_VISSTRRICA12_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA12,IMDBDef8.PQSL_VISSTRRICA12_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA12,IMDBDef8.PQSL_VISSTRRICA12_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA12,IMDBDef8.PQSL_VISSTRRICA12_HASH,5,794,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA12,IMDBDef8.PQSL_VISSTRRICA12_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA12,IMDBDef8.PQSL_VISSTRRICA12_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICA12, 0);
  }

  private static void Init_PQRY_VISSTRRICA13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICA13, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICA13, "PQRY_VISSTRRICA13");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA13,IMDBDef8.PQSL_VISSTRRICA13_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA13,IMDBDef8.PQSL_VISSTRRICA13_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA13,IMDBDef8.PQSL_VISSTRRICA13_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA13,IMDBDef8.PQSL_VISSTRRICA13_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA13,IMDBDef8.PQSL_VISSTRRICA13_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA13,IMDBDef8.PQSL_VISSTRRICA13_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA13,IMDBDef8.PQSL_VISSTRRICA13_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA13,IMDBDef8.PQSL_VISSTRRICA13_HASH,5,496,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA13,IMDBDef8.PQSL_VISSTRRICA13_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA13,IMDBDef8.PQSL_VISSTRRICA13_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICA13, 0);
  }

  private static void Init_PQRY_VISSTRRICA14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICA14, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICA14, "PQRY_VISSTRRICA14");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA14,IMDBDef8.PQSL_VISSTRRICA14_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA14,IMDBDef8.PQSL_VISSTRRICA14_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA14,IMDBDef8.PQSL_VISSTRRICA14_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA14,IMDBDef8.PQSL_VISSTRRICA14_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA14,IMDBDef8.PQSL_VISSTRRICA14_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA14,IMDBDef8.PQSL_VISSTRRICA14_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA14,IMDBDef8.PQSL_VISSTRRICA14_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA14,IMDBDef8.PQSL_VISSTRRICA14_HASH,5,794,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICA14,IMDBDef8.PQSL_VISSTRRICA14_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICA14,IMDBDef8.PQSL_VISSTRRICA14_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICA14, 0);
  }

  private static void Init_PQRY_VISSTRRICARM(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISSTRRICARM, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISSTRRICARM, "PQRY_VISSTRRICARM");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICARM,IMDBDef8.PQSL_VISSTRRICARM_RECODESCRAMO, "RECODESCRAMO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICARM,IMDBDef8.PQSL_VISSTRRICARM_RECODESCRAMO,5,343,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICARM,IMDBDef8.PQSL_VISSTRRICARM_RECORDES, "RECORDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICARM,IMDBDef8.PQSL_VISSTRRICARM_RECORDES,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICARM,IMDBDef8.PQSL_VISSTRRICARM_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICARM,IMDBDef8.PQSL_VISSTRRICARM_RECORDCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICARM,IMDBDef8.PQSL_VISSTRRICARM_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICARM,IMDBDef8.PQSL_VISSTRRICARM_HASH,5,496,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISSTRRICARM,IMDBDef8.PQSL_VISSTRRICARM_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISSTRRICARM,IMDBDef8.PQSL_VISSTRRICARM_ICON,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISSTRRICARM, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StrutturaRiclassificazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public StrutturaRiclassificazione()
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
    FormIdx = MyGlb.FRM_STRUTTRICLAS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BC9A52DE-DF5C-465E-A4BB-FAC9C2611364";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 776;
    DesignHeight = 498;
    set_Caption(new IDVariant("Struttura Riclassificazione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 776;
    Frames[1].Height = 472;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0847458;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 776;
    Frames[2].Height = 40;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 776;
    Frames[2].FixedHeight = 40;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARS = new IDPanel(w, this, 2, "PAN_PARS");
    Frames[2].Content = PAN_PARS;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 776-MyGlb.PAN_OFFS_X, 40-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E92B2529-4E97-46AF-8BF6-6A6298D8B749");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 48, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 2;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 776;
    Frames[3].Height = 432;
    Frames[3].Caption = "Struttura Riclassificazione";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 432;
    TRE_STRUTTRICLAS = new ATree(this);
    Frames[3].Content = TRE_STRUTTRICLAS;
    TRE_STRUTTRICLAS.Width = 776;
    TRE_STRUTTRICLAS.Height = 402;
    TRE_STRUTTRICLAS.FrIndex = 3;
    TRE_STRUTTRICLAS.Code = "TRE_STRUTTRICLAS";
    TRE_STRUTTRICLAS.set_IsActive(true);
    TRE_STRUTTRICLAS.CtxMenuIdx = BaseCmdSetIdx + MyGlb.CMDS_FUNZIOALBERO;
    TRE_STRUTTRICLAS.iGuid = "7A86A0B9-C61B-478F-92F4-88051256E46E";
    TRE_STRUTTRICLAS.SetItemCount(15);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(1,Item);
    Item.ItemIndex = "N00001";
    Item.Tooltip = "";
    Item.Name = "1 Livello";
    Item.iGuid = "C7F71007-9CD0-4FEF-AA05-F209B8227387";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || TO_CHAR ( A.CODICE ) as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'DirOpen.gif', 'DirClose.gif') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A ");
    SQL.append("where (A.LIVELLO = 0) ");
    SQL.append("and   (A.SOTTOLIVELLO = 0) ");
    SQL.append("and   (NOT ((~~PQRY_PARS20.NOMOGGTIPRIC~~ IS NULL))) ");
    SQL.append("order by ");
    SQL.append("  A.E_S ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICAR1);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(2,Item);
    Item.ItemIndex = "N00002";
    Item.Tooltip = "";
    Item.Name = "2 Livello";
    Item.iGuid = "2462E6A0-F447-4726-967C-822BB8A370FD";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || TO_CHAR ( A.CODICE ) as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'PiramideAzzurra.bmp', 'RettBlu.bmp') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 1) ");
    SQL.append("and   (A.SOTTOLIVELLO = 0) ");
    SQL.append("and   (A.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICAR2);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(3,Item);
    Item.ItemIndex = "N00003";
    Item.Tooltip = "";
    Item.Name = "3 Livello ";
    Item.iGuid = "4707AD47-B12B-416D-970C-2C71A7BC619F";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || LPAD(TO_CHAR ( A.CODICE ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( C.STRUTTURA_RICL_ID ), 10, SUBSTR('0', 1, 1)) as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'PiramideAzzurra.bmp', 'RettBlu.bmp') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 1) ");
    SQL.append("and   (A.SOTTOLIVELLO = 1) ");
    SQL.append("and   (C.CODICE = A.CODICE) ");
    SQL.append("and   (C.CODICE_PADRE = A.CODICE_PADRE) ");
    SQL.append("and   (A.CODICE_PADRE = ~~PQRY_VISSTRRICAR2.RECORDCODICE~~) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICAR3);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(4,Item);
    Item.ItemIndex = "N00004";
    Item.Tooltip = "";
    Item.Name = "4 Livello";
    Item.iGuid = "5CBECD36-E7FC-4B6C-AA88-67B413F2DB2E";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || ~~PQRY_VISSTRRICAR3.HASH~~ as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'PiramideRosa.bmp', 'RettRosa.bmp') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.SOTTOLIVELLO = 0) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICAR4);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(5,Item);
    Item.ItemIndex = "N00005";
    Item.Tooltip = "";
    Item.Name = "5 Livello";
    Item.iGuid = "B1781288-7062-4782-85AC-1E365B30D67D";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || LPAD(TO_CHAR ( A.CODICE ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( C.STRUTTURA_RICL_ID ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( C.CODICE_PADRE ), 10, SUBSTR('0', 1, 1)) as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'PiramideRosa.bmp', 'RettRosa.bmp') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.SOTTOLIVELLO = 1) ");
    SQL.append("and   (A.CODICE_PADRE = ~~PQRY_VISSTRRICAR3.RECORDCODICE~~) ");
    SQL.append("and   (C.CODICE = A.CODICE) ");
    SQL.append("and   (C.CODICE_PADRE = A.CODICE_PADRE) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICAR5);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(6,Item);
    Item.ItemIndex = "N00006";
    Item.Tooltip = "";
    Item.Name = "6 Livello";
    Item.iGuid = "D49F7293-D576-4D00-A606-6430666F7BDD";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || TO_CHAR ( A.CODICE ) || ~~PQRY_VISSTRRICAR5.HASH~~ as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'PiramideVerde.bmp', 'RettVerde.bmp') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 3) ");
    SQL.append("and   (A.SOTTOLIVELLO = 0) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICAR6);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(7,Item);
    Item.ItemIndex = "N00007";
    Item.Tooltip = "";
    Item.Name = "7 Livello";
    Item.iGuid = "7A6FDCDA-7AD2-48F0-8125-00635C1964DC";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || LPAD(TO_CHAR ( A.CODICE ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( C.STRUTTURA_RICL_ID ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( C.CODICE_PADRE ), 10, SUBSTR('0', 1, 1)) as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'PiramideVerde.bmp', 'RettVerde.bmp') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 3) ");
    SQL.append("and   (A.SOTTOLIVELLO = 1) ");
    SQL.append("and   (A.CODICE_PADRE = ~~PQRY_VISSTRRICAR5.RECORDCODICE~~) ");
    SQL.append("and   (C.CODICE = A.CODICE) ");
    SQL.append("and   (C.CODICE_PADRE = A.CODICE_PADRE) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICAR7);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(8,Item);
    Item.ItemIndex = "N00008";
    Item.Tooltip = "";
    Item.Name = "8 Livello ";
    Item.iGuid = "4A2A7E84-1A33-4DF7-812B-EBC6A7640000";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || TO_CHAR ( A.CODICE ) || ~~PQRY_VISSTRRICAR7.HASH~~ as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'CerchioRosso.bmp', 'RettRosso.bmp') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 4) ");
    SQL.append("and   (A.SOTTOLIVELLO = 0) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICAR8);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(9,Item);
    Item.ItemIndex = "N00009";
    Item.Tooltip = "";
    Item.Name = "9 Livello";
    Item.iGuid = "FBBF964E-C45D-4457-AADF-D5D923DE3B21";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || LPAD(TO_CHAR ( A.CODICE ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( C.STRUTTURA_RICL_ID ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( A.CODICE_PADRE ), 10, SUBSTR('0', 1, 1)) as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'CerchioRosso.bmp', 'RettRosso.bmp') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 4) ");
    SQL.append("and   (A.SOTTOLIVELLO = 1) ");
    SQL.append("and   (B.SCHEMA_RICL_ID = C.SCHEMA_RICL_ID) ");
    SQL.append("and   (A.CODICE_PADRE = ~~PQRY_VISSTRRICAR7.RECORDCODICE~~) ");
    SQL.append("and   (C.CODICE = A.CODICE) ");
    SQL.append("and   (C.CODICE_PADRE = A.CODICE_PADRE) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICAR9);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(10,Item);
    Item.ItemIndex = "N00010";
    Item.Tooltip = "";
    Item.Name = "10 Livello";
    Item.iGuid = "0A9D9257-456B-4B1B-8F2E-6F26B290DBCF";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || TO_CHAR ( A.CODICE ) || ~~PQRY_VISSTRRICAR9.HASH~~ as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'PiramideGrigia.bmp', 'CerchioArancio.bmp') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 5) ");
    SQL.append("and   (A.SOTTOLIVELLO = 0) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICA10);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(11,Item);
    Item.ItemIndex = "N00011";
    Item.Tooltip = "";
    Item.Name = "11 Livello";
    Item.iGuid = "4789C60B-06F0-4031-A14E-6BDE9E6CEF66";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || LPAD(TO_CHAR ( A.CODICE ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( C.STRUTTURA_RICL_ID ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( C.CODICE_PADRE ), 10, SUBSTR('0', 1, 1)) as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'PiramideGrigia.bmp', 'CerchioArancio.bmp') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 5) ");
    SQL.append("and   (A.SOTTOLIVELLO = 1) ");
    SQL.append("and   (A.CODICE_PADRE = ~~PQRY_VISSTRRICAR9.RECORDCODICE~~) ");
    SQL.append("and   (C.CODICE = A.CODICE) ");
    SQL.append("and   (C.CODICE_PADRE = A.CODICE_PADRE) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICA11);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(12,Item);
    Item.ItemIndex = "N00012";
    Item.Tooltip = "";
    Item.Name = "12 Livello";
    Item.iGuid = "EB24B39F-7504-49E6-B61B-1A56B799D138";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || TO_CHAR ( A.CODICE ) || ~~PQRY_VISSTRRICA11.HASH~~ as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'EllisseAzzurra.bmp', 'EllisseVerde.bmp') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 6) ");
    SQL.append("and   (A.SOTTOLIVELLO = 0) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICA12);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(13,Item);
    Item.ItemIndex = "N00013";
    Item.Tooltip = "";
    Item.Name = "13 Livello";
    Item.iGuid = "E4E7CFD3-F005-47F1-B744-3669EC5797F1";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || LPAD(TO_CHAR ( A.CODICE ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( C.STRUTTURA_RICL_ID ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( C.CODICE_PADRE ), 10, SUBSTR('0', 1, 1)) as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'EllisseAzzurra.bmp', 'EllisseVerde.bmp') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 6) ");
    SQL.append("and   (A.SOTTOLIVELLO = 1) ");
    SQL.append("and   (A.CODICE_PADRE = ~~PQRY_VISSTRRICA11.RECORDCODICE~~) ");
    SQL.append("and   (C.CODICE = A.CODICE) ");
    SQL.append("and   (C.CODICE_PADRE = A.CODICE_PADRE) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICA13);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(14,Item);
    Item.ItemIndex = "N00014";
    Item.Tooltip = "";
    Item.Name = "14 Livello";
    Item.iGuid = "FA2B0E58-368D-4993-9FBC-46AA3DBDC83E";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || TO_CHAR ( A.CODICE ) || ~~PQRY_VISSTRRICA13.HASH~~ as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'ledblack.gif', 'ledbrown.gif') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 7) ");
    SQL.append("and   (A.SOTTOLIVELLO = 0) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICA14);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_STRUTTRICLAS.SetItem(15,Item);
    Item.ItemIndex = "N00015";
    Item.Tooltip = "";
    Item.Name = "15 Livello";
    Item.iGuid = "F567372E-343A-451F-BECA-1C982CD4A3D8";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DESCR_RAMO as RECODESCRAMO, ");
    SQL.append("  A.E_S as RECORDES, ");
    SQL.append("  A.CODICE as RECORDCODICE, ");
    SQL.append("  A.E_S || TO_CHAR ( A.LIVELLO ) || TO_CHAR ( A.SOTTOLIVELLO ) || LPAD(TO_CHAR ( A.CODICE ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( C.STRUTTURA_RICL_ID ), 10, SUBSTR('0', 1, 1)) || LPAD(TO_CHAR ( C.CODICE_PADRE ), 10, SUBSTR('0', 1, 1)) as HASH, ");
    SQL.append("  DECODE(A.E_S, 'E', 'ledblack.gif', 'ledbrown.gif') as ICON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL_ARM A, ");
    SQL.append("  SCHEMA_RICLASSIFICAZIONE B, ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE C ");
    SQL.append("where (B.TIPO_RICL_ID = ~~PQRY_PARS20.NOMOGGTIPRIC~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_VISSTRRICAR1.RECORDES~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.TIPO_RICL_ID = B.TIPO_RICL_ID) ");
    SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (C.LIVELLO = A.LIVELLO) ");
    SQL.append("and   (A.LIVELLO = 7) ");
    SQL.append("and   (A.SOTTOLIVELLO = 1) ");
    SQL.append("and   (A.CODICE_PADRE = ~~PQRY_VISSTRRICA13.RECORDCODICE~~) ");
    SQL.append("and   (C.CODICE = A.CODICE) ");
    SQL.append("and   (C.CODICE_PADRE = A.CODICE_PADRE) ");
    SQL.append("and   (A.TIPO_RICL_ID = C.TIPO_RICL_ID) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef8.PQRY_VISSTRRICARM);
    Item = TRE_STRUTTRICLAS.GetItem(1);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(2));
    Item = TRE_STRUTTRICLAS.GetItem(2);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(1);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(3));
    Item = TRE_STRUTTRICLAS.GetItem(3);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(2);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(4));
    Item = TRE_STRUTTRICLAS.GetItem(4);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(3);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(5));
    Item = TRE_STRUTTRICLAS.GetItem(5);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(4);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(6));
    Item = TRE_STRUTTRICLAS.GetItem(6);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(5);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(7));
    Item = TRE_STRUTTRICLAS.GetItem(7);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(6);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(8));
    Item = TRE_STRUTTRICLAS.GetItem(8);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(7);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(9));
    Item = TRE_STRUTTRICLAS.GetItem(9);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(8);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(10));
    Item = TRE_STRUTTRICLAS.GetItem(10);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(9);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(11));
    Item = TRE_STRUTTRICLAS.GetItem(11);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(10);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(12));
    Item = TRE_STRUTTRICLAS.GetItem(12);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(11);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(13));
    Item = TRE_STRUTTRICLAS.GetItem(13);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(12);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(14));
    Item = TRE_STRUTTRICLAS.GetItem(14);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(13);
    Item.SetItem(1, TRE_STRUTTRICLAS.GetItem(15));
    Item = TRE_STRUTTRICLAS.GetItem(15);
    Item.Parent = TRE_STRUTTRICLAS.GetItem(14);
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
      if (CmdIdx==MyGlb.CMD_NUOVO17+BaseCmdLinIdx)
      {
        Nuovo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_APRI4+BaseCmdLinIdx)
      {
        Apri();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPANDITUT15+BaseCmdLinIdx)
      {
        EspandiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMPRIMTUT15+BaseCmdLinIdx)
      {
        ComprimiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPANDINODO3+BaseCmdLinIdx)
      {
        EspandiNodo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMPRIMINOD3+BaseCmdLinIdx)
      {
        ComprimiNodo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RICIDATDALDA+BaseCmdLinIdx)
      {
        Refresha();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARS28, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STRUTTRICLAS_PARS20();
      }
      PAN_PARS.UpdatePanel(MainFrm);
      TRE_STRUTTRICLAS.UpdateTree(MainFrm);
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
    return (obj instanceof StrutturaRiclassificazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StrutturaRiclassificazione.class.getName() : (Glb.ClassWithPackage(StrutturaRiclassificazione.class) ? StrutturaRiclassificazione.class.getName().substring(StrutturaRiclassificazione.class.getPackage().getName().length() + 1) : StrutturaRiclassificazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      // Corpo Procedura
      // 
      TRE_STRUTTRICLAS.ExpandNodesLevel(MainFrm, (new IDVariant(15)).intValue(), (new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "EspandiTutto", _e);
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
      // Corpo Procedura
      // 
      TRE_STRUTTRICLAS.ExpandNodesLevel(MainFrm, (new IDVariant(0)).intValue(), (new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "ComprimiTutto", _e);
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
      // Corpo Procedura
      // 
      ComprimiNodoRicorsivo(TRE_STRUTTRICLAS.GetActiveNode());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "ComprimiNodo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Comprimi Nodo Ricorsivo
  // Hashnodo:  - Input
  // **********************************************************************
  public int ComprimiNodoRicorsivo (IDVariant Hashnodo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Comprimi Nodo Ricorsivo Body
      // Corpo Procedura
      // 
      IDVariant v_NUMFIGLI = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NODO = new IDVariant(0,IDVariant.STRING);
      v_NUMFIGLI = IDL.Sub(TRE_STRUTTRICLAS.GetChildrenCount(Hashnodo), (new IDVariant(1)));
      while (v_NUMFIGLI.compareTo((new IDVariant(0)), true)>=0)
      {
        v_NODO = TRE_STRUTTRICLAS.GetChildrenNode(Hashnodo, v_NUMFIGLI);
        v_NUMFIGLI = IDL.Sub(v_NUMFIGLI, (new IDVariant(1)));
        ComprimiNodoRicorsivo(v_NODO);
      }
      TRE_STRUTTRICLAS.ExpandNode(MainFrm, Hashnodo, (new IDVariant(0)).booleanValue(), (new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "ComprimiNodoRicorsivo", _e);
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
      // Corpo Procedura
      // 
      EspandiNodoRicorsivo(TRE_STRUTTRICLAS.GetActiveNode());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "EspandiNodo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Espandi Nodo Ricorsivo
  // Hashnodo:  - Input
  // **********************************************************************
  public int EspandiNodoRicorsivo (IDVariant Hashnodo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Espandi Nodo Ricorsivo Body
      // Corpo Procedura
      // 
      IDVariant v_NUMFIGLI = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NODO = new IDVariant(0,IDVariant.STRING);
      TRE_STRUTTRICLAS.ExpandNode(MainFrm, Hashnodo, (new IDVariant(-1)).booleanValue(), (new IDVariant(0)).booleanValue()); 
      v_NUMFIGLI = IDL.Sub(TRE_STRUTTRICLAS.GetChildrenCount(Hashnodo), (new IDVariant(1)));
      while (v_NUMFIGLI.compareTo((new IDVariant(0)), true)>=0)
      {
        v_NODO = TRE_STRUTTRICLAS.GetChildrenNode(Hashnodo, v_NUMFIGLI);
        v_NUMFIGLI = IDL.Sub(v_NUMFIGLI, (new IDVariant(1)));
        EspandiNodoRicorsivo(v_NODO);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "EspandiNodoRicorsivo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovo
  // **********************************************************************
  public int Nuovo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Body
      // Corpo Procedura
      // 
      IDVariant v_HASH = new IDVariant(0,IDVariant.STRING);
      IDVariant v_DESC = new IDVariant(0,IDVariant.STRING);
      IDVariant v_DESCRCMD = new IDVariant(0,IDVariant.STRING);
      IDVariant v_SCHEMA = new IDVariant(0,IDVariant.INTEGER);
      v_HASH = TRE_STRUTTRICLAS.GetActiveNode();
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0, IDL.Left(v_HASH, (new IDVariant(1))));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0, IDL.ToInteger(IDL.SubStr(v_HASH, (new IDVariant(2)), (new IDVariant(1)))));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGCODPAD, 0, IDL.ToInteger(IDL.SubStr(v_HASH, (new IDVariant(4)), (new IDVariant(10)))));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as STRURICLDESC ");
      SQL.append("from ");
      SQL.append("  STRUTTURA_RICLASSIFICAZIONE A ");
      SQL.append("where (A.STRUTTURA_RICL_ID = TRUNC(TO_NUMBER(SUBSTR(" + IDL.CSql(v_HASH, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 14, 10)))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESC = QV.Get("STRURICLDESC", IDVariant.STRING) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE_LIVELLO as SCHRICDESLIV, ");
      SQL.append("  A.SCHEMA_RICL_ID as SCHRICSCRIID ");
      SQL.append("from ");
      SQL.append("  SCHEMA_RICLASSIFICAZIONE A ");
      SQL.append("where (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 1) ");
      SQL.append("and   (A.TIPO_RICL_ID = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_PARS20, IMDBDef8.PQSL_PARS20_NOMOGGTIPRIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESCRCMD = QV.Get("SCHRICDESLIV", IDVariant.STRING) ;
        v_SCHEMA = QV.Get("SCHRICSCRIID", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGTIRIID, 0, IMDB.Value(IMDBDef8.PQRY_PARS20, IMDBDef8.PQSL_PARS20_NOMOGGTIPRIC, 0));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSTRIID, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOOGDELIPELA, 0, new IDVariant(v_DESC));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGDESCAP, 0, new IDVariant(v_DESCRCMD));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSCRIID, 0, new IDVariant(v_SCHEMA));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0, IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0));
      MainFrm.Show(MyGlb.FRM_NUOVSUSTRRIC, (new IDVariant(-1)).intValue(), this); 
      ((NuovoSuStrutturaRiclassificazione)MainFrm.GetForm(MyGlb.FRM_NUOVSUSTRRIC,0)).PAN_STRUTTRICLAS.PanelCommand(Glb.PCM_INSERT);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "Nuovo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri
  // **********************************************************************
  public int Apri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Body
      // Corpo Procedura
      // 
      IDVariant v_HASH = new IDVariant(0,IDVariant.STRING);
      IDVariant v_DESCRCMD = new IDVariant(0,IDVariant.STRING);
      IDVariant v_DESCCORRENTE = new IDVariant(0,IDVariant.STRING);
      IDVariant v_SCHEMA = new IDVariant(0,IDVariant.INTEGER);
      v_HASH = TRE_STRUTTRICLAS.GetActiveNode();
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0, IDL.Left(v_HASH, (new IDVariant(1))));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0, IDL.ToInteger(IDL.SubStr(v_HASH, (new IDVariant(2)), (new IDVariant(1)))));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGCODPAD, 0, IDL.ToInteger(IDL.SubStr(v_HASH, (new IDVariant(4)), (new IDVariant(10)))));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSTRIID, 0, IDL.ToInteger(IDL.SubStr(v_HASH, (new IDVariant(14)), (new IDVariant(10)))));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.SCHEMA_RICL_ID as STRRICSCRIID ");
      SQL.append("from ");
      SQL.append("  STRUTTURA_RICLASSIFICAZIONE A ");
      SQL.append("where (A.STRUTTURA_RICL_ID = TRUNC(TO_NUMBER(SUBSTR(" + IDL.CSql(v_HASH, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 14, 10)))) ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SCHEMA = QV.Get("STRRICSCRIID", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as STRURICLDESC ");
      SQL.append("from ");
      SQL.append("  STRUTTURA_RICLASSIFICAZIONE A ");
      SQL.append("where (A.CODICE = TRUNC(TO_NUMBER(SUBSTR(" + IDL.CSql(v_HASH, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 24, 10)))) ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - 1) ");
      SQL.append("and   (A.TIPO_RICL_ID = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_PARS20, IMDBDef8.PQSL_PARS20_NOMOGGTIPRIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESCCORRENTE = QV.Get("STRURICLDESC", IDVariant.STRING) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE_LIVELLO as SCHRICDESLIV ");
      SQL.append("from ");
      SQL.append("  SCHEMA_RICLASSIFICAZIONE A ");
      SQL.append("where (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGELIVE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.SCHEMA_RICL_ID = " + IDL.CSql(v_SCHEMA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESCRCMD = QV.Get("SCHRICDESLIV", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGDESCAP, 0, new IDVariant(v_DESCRCMD));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOOGDELIPELA, 0, new IDVariant(v_DESCCORRENTE));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGSCRIID, 0, new IDVariant(v_SCHEMA));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0, IMDB.Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMEOGGETTES, 0));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGCONVIS, 0, IMDB.Value(IMDBDef1.TBL_PARS28, IMDBDef1.FLD_PARS28_NOMOGGCONVIS, 0));
      IMDB.set_Value(IMDBDef1.TBL_IN13, IMDBDef1.FLD_IN13_NOMOGGTIRIID, 0, IMDB.Value(IMDBDef8.PQRY_PARS20, IMDBDef8.PQSL_PARS20_NOMOGGTIPRIC, 0));
      MainFrm.Show(MyGlb.FRM_NUOVSUSTRRIC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "Apri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Refresha
  // **********************************************************************
  public int Refresha ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Refresha Body
      // Corpo Procedura
      // 
      TRE_STRUTTRICLAS.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "Refresha", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Livello V Macro
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SettaLivelloVMacro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Livello V Macro Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_PARS.FieldText(PFL_PARS_CODICE))).equals((new IDVariant("MACRO_5")), true) || (new IDVariant(PAN_PARS.FieldText(PFL_PARS_CODICE))).equals((new IDVariant("MACRO")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARS28, IMDBDef1.FLD_PARS28_NOMOGGCONVIS, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARS28, IMDBDef1.FLD_PARS28_NOMOGGCONVIS, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "SettaLivelloVMacro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Livello IV Macro
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SettaLivelloIVMacro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Livello IV Macro Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_PARS.FieldText(PFL_PARS_CODICE))).equals((new IDVariant("MACRO")), true) || (new IDVariant(PAN_PARS.FieldText(PFL_PARS_CODICE))).equals((new IDVariant("MACRO_5")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARS28, IMDBDef1.FLD_PARS28_NOMOGGCONVIS, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARS28, IMDBDef1.FLD_PARS28_NOMOGGCONVIS, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "SettaLivelloIVMacro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Svuota Contropartita
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SvuotaContropartita ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Svuota Contropartita Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARS28, IMDBDef1.FLD_PARS28_NOMOGGCONVIS, 0, (new IDVariant()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "SvuotaContropartita", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARS28, IMDBDef1.FLD_PARS28_NOMOGGTIPRIC, 0, (new IDVariant()));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "Load", _e);
    }
  }

  // **********************************************************************
  // Pars Tipo Riclassificazione Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARS_TIPORICLASSI_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pars Tipo Riclassificazione Validate Body
      // Corpo Procedura
      // 
      TRE_STRUTTRICLAS.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "ParsTipoRiclassificazioneValidate", _e);
    }
  }

  // **********************************************************************
  // Funzionalità Albero On Open Popup
  // Evento notificato dal CommandSet quando viene aperto
  // come popup.
  // Direction - Input/Output
  // Cancel - Input/Output
  // **********************************************************************
  public void CMDS_FUNZIOALBERO_OnOpenPopup(IDVariant Direction, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Funzionalità Albero On Open Popup Body
      // Corpo Procedura
      // 
      IDVariant v_HASH = new IDVariant(0,IDVariant.STRING);
      IDVariant v_LIVELLO = new IDVariant(0,IDVariant.FLOAT);
      IDVariant v_SOTTOLIVELLO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_ES = new IDVariant(0,IDVariant.STRING);
      v_HASH = TRE_STRUTTRICLAS.GetActiveNode();
      v_ES = IDL.Left(v_HASH, (new IDVariant(1)));
      v_LIVELLO = new IDVariant(IDL.ToInteger(IDL.SubStr(v_HASH, (new IDVariant(2)), (new IDVariant(1)))),IDVariant.FLOAT);
      v_SOTTOLIVELLO = IDL.ToInteger(IDL.SubStr(v_HASH, (new IDVariant(3)), (new IDVariant(1))));
      if (v_SOTTOLIVELLO.compareTo((new IDVariant(0)), true)!=0 || (v_LIVELLO.equals((new IDVariant(0)), true) && v_SOTTOLIVELLO.equals((new IDVariant(0)), true)))
      {
        IDVariant v_DESCRCMD = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE_LIVELLO as SCHRICDESLIV ");
        SQL.append("from ");
        SQL.append("  SCHEMA_RICLASSIFICAZIONE A ");
        SQL.append("where (A.E_S = " + IDL.CSql(v_ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.LIVELLO = " + IDL.CSql(v_LIVELLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 1) ");
        SQL.append("and   (A.TIPO_RICL_ID = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_PARS20, IMDBDef8.PQSL_PARS20_NOMOGGTIPRIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRCMD = QV.Get("SCHRICDESLIV", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.NullValue(v_DESCRCMD,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_NUOVO17+BaseCmdLinIdx, new IDVariant(v_DESCRCMD).stringValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO17+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO17+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        if (v_LIVELLO.compareTo((new IDVariant(0)), true)!=0)
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI4+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI4+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO17+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_APRI4+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StrutturaRiclassificazione", "FunzionalitàAlberoOnOpenPopup", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void STRUTTRICLAS_PARS20() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_PARS20_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARS28, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARS28, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_PARS20_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_PARS20_RS, 0, IMDBDef1.TBL_PARS28, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_PARS20_RS, 0, 0, IMDBDef1.TBL_PARS28, IMDBDef1.FLD_PARS28_NOMOGGTIPRIC, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARS28, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARS28, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARS28, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_PARS20_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARS_TIPORICLASSI)
      {
        PFL_PARS_TIPORICLASSI_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void TRE_STRUTTRICLAS_NodeClick(ATreeNode Node)
  {
    if (TRE_STRUTTRICLAS.NodeClick(MainFrm, Node))
    {
      if (Node.Key.substring(0,6).equals("N00001"))
      {
      SvuotaContropartita();
      }
      if (Node.Key.substring(0,6).equals("N00002"))
      {
      SvuotaContropartita();
      }
      if (Node.Key.substring(0,6).equals("N00003"))
      {
      SvuotaContropartita();
      }
      if (Node.Key.substring(0,6).equals("N00004"))
      {
      SettaLivelloIVMacro();
      }
      if (Node.Key.substring(0,6).equals("N00005"))
      {
      SettaLivelloVMacro();
      }
      if (Node.Key.substring(0,6).equals("N00006"))
      {
      SettaLivelloVMacro();
      }
      if (Node.Key.substring(0,6).equals("N00007"))
      {
      SettaLivelloIVMacro();
      }
      if (Node.Key.substring(0,6).equals("N00008"))
      {
      SettaLivelloIVMacro();
      }
      if (Node.Key.substring(0,6).equals("N00009"))
      {
      SettaLivelloIVMacro();
      }
      if (Node.Key.substring(0,6).equals("N00010"))
      {
      SvuotaContropartita();
      }
      if (Node.Key.substring(0,6).equals("N00011"))
      {
      SvuotaContropartita();
      }
      if (Node.Key.substring(0,6).equals("N00012"))
      {
      SvuotaContropartita();
      }
      if (Node.Key.substring(0,6).equals("N00013"))
      {
      SvuotaContropartita();
      }
      if (Node.Key.substring(0,6).equals("N00014"))
      {
      SvuotaContropartita();
      }
      if (Node.Key.substring(0,6).equals("N00015"))
      {
      SvuotaContropartita();
      }
    }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, "910CA11E-12CA-4C17-8FEC-033228942A0E");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, "Tipo Riclassificazione");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, "C3ED62E5-4CBF-466A-9A05-1C61654A1065");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, "Codice");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, 0, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_LIST, 128);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_LIST, "Tp. Riclass.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_FORM, 4, 4, 576, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_FORM, 144);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPORICLASSI, MyGlb.PANEL_FORM, "Tipo Riclassificazione");
    PAN_PARS.SetFieldPage(PFL_PARS_TIPORICLASSI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TIPORICLASSI, PPQRY_PARS20, "A.NOMOGGTIPRIC", "NOMOGGTIPRIC", 1, 10, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, MyGlb.PANEL_LIST, 0, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, MyGlb.PANEL_LIST, 192);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, MyGlb.PANEL_FORM, 584, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, MyGlb.PANEL_FORM, 72);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_PARS.SetFieldPage(PFL_PARS_CODICE, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_CODICE, PPQRY_TIPIRICLASSI, "A.CODICE", "TIPIRICLCODI", 5, 10, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIRICLCODI ");
    SQL.append("from ");
    SQL.append("  TIPI_RICLASSIFICAZIONE A ");
    SQL.append("where (A.TIPO_RICL_ID = ~~NOMOGGTIPRIC~~) ");
    SQL.append("and   ((A.ESERCIZIO_SCADENZA IS NULL) OR A.ESERCIZIO_SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARS.SetQuery(PPQRY_TIPIRICLASSI, 0, SQL, -1, "");
    PAN_PARS.SetQueryDB(PPQRY_TIPIRICLASSI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetMasterTable(PPQRY_TIPIRICLASSI, "TIPI_RICLASSIFICAZIONE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_RICL_ID as TIPRICTIRIID, ");
    SQL.append("  A.CODICE as TIPIRICLCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIRICLDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_RICLASSIFICAZIONE A ");
    SQL.append("where (A.TIPO_RICL_ID = ~~NOMOGGTIPRIC~~) ");
    SQL.append("and   ((A.ESERCIZIO_SCADENZA IS NULL) OR A.ESERCIZIO_SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_TIPIRICLASS1, 0, SQL, PFL_PARS_TIPORICLASSI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_RICL_ID as TIPRICTIRIID, ");
    SQL.append("  A.CODICE as TIPIRICLCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIRICLDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_RICLASSIFICAZIONE A ");
    SQL.append("where ((A.ESERCIZIO_SCADENZA IS NULL) OR A.ESERCIZIO_SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_TIPIRICLASS1, 1, SQL, PFL_PARS_TIPORICLASSI, "");
    PAN_PARS.SetQueryDB(PPQRY_TIPIRICLASS1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS20", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS20, IMDBDef8.PQRY_PARS20_RS, IMDBDef1.TBL_PARS28);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TIPORICLASSI, IMDBDef1.FLD_PARS28_NOMOGGTIPRIC);
    PAN_PARS.SetMasterTable(0, "PARS28");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == TRE_STRUTTRICLAS) TRE_STRUTTRICLAS_NodeClick(Node);
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
    if (SrcObj.Code.equals("FUNZIOALBERO")) CMDS_FUNZIOALBERO_OnOpenPopup(Direction, Cancel);
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
