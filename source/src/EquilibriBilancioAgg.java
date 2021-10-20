// **********************************************
// Equilibri Bilancio Agg
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EquilibriBilancioAgg extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_VARIAZIONI = 0;
  private static int GRP_PARAMETRI_PROVVEDIMENT = 1;

  private static int PFL_PARAMETRI_VARIAZIONI = 0;
  private static int PFL_PARAMETRI_NEWPANELABE5 = 1;
  private static int PFL_PARAMETRI_DATAELABORAZ = 2;
  private static int PFL_PARAMETRI_DELIBERA = 3;
  private static int PFL_PARAMETRI_NUMERODELIBE = 4;
  private static int PFL_PARAMETRI_ANNODELIBERA = 5;
  private static int PFL_PARAMETRI_PROPOSTA = 6;
  private static int PFL_PARAMETRI_NUMEROPROPOS = 7;
  private static int PFL_PARAMETRI_ANNOPROPOSTA = 8;
  private static int PFL_PARAMETRI_TRATTIDELIBE = 9;
  private static int PFL_PARAMETRI_BARRADELIBER = 10;
  private static int PFL_PARAMETRI_APRISCELDELI = 11;
  private static int PFL_PARAMETRI_APRIINFODELI = 12;
  private static int PFL_PARAMETRI_TRATTIPROPOS = 13;
  private static int PFL_PARAMETRI_BARRAPROPOST = 14;
  private static int PFL_PARAMETRI_APRISCELPROP = 15;
  private static int PFL_PARAMETRI_ETICHETTASF = 16;

  private static int PPQRY_PARAMETRI529 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_BILPREEQUVAR_ESERCIZIO = 0;
  private static int PFL_BILPREEQUVAR_ES = 1;
  private static int PFL_BILPREEQUVAR_ETICHETTAAA = 2;
  private static int PFL_BILPREEQUVAR_IMPORTOAA1 = 3;
  private static int PFL_BILPREEQUVAR_IMPORTOAA2 = 4;
  private static int PFL_BILPREEQUVAR_IMPORTOAA3 = 5;
  private static int PFL_BILPREEQUVAR_IMPORTOB1 = 6;
  private static int PFL_BILPREEQUVAR_IMPORTOB2 = 7;
  private static int PFL_BILPREEQUVAR_IMPORTOB3 = 8;
  private static int PFL_BILPREEQUVAR_IMPORTOF1 = 9;
  private static int PFL_BILPREEQUVAR_IMPORTOF2 = 10;
  private static int PFL_BILPREEQUVAR_IMPORTOF3 = 11;
  private static int PFL_BILPREEQUVAR_FONDANTILIQ1 = 12;
  private static int PFL_BILPREEQUVAR_FONDANTILIQ2 = 13;
  private static int PFL_BILPREEQUVAR_FONDANTILIQ3 = 14;
  private static int PFL_BILPREEQUVAR_IMPORTOG1 = 15;
  private static int PFL_BILPREEQUVAR_IMPORTOG2 = 16;
  private static int PFL_BILPREEQUVAR_IMPORTOG3 = 17;
  private static int PFL_BILPREEQUVAR_IMPORTOH1 = 18;
  private static int PFL_BILPREEQUVAR_IMPORTOH2 = 19;
  private static int PFL_BILPREEQUVAR_IMPORTOH3 = 20;
  private static int PFL_BILPREEQUVAR_IMPORTOI1 = 21;
  private static int PFL_BILPREEQUVAR_IMPORTOI2 = 22;
  private static int PFL_BILPREEQUVAR_IMPORTOI3 = 23;
  private static int PFL_BILPREEQUVAR_IMPORTOI21 = 24;
  private static int PFL_BILPREEQUVAR_IMPORTOI22 = 25;
  private static int PFL_BILPREEQUVAR_IMPORTOI23 = 26;
  private static int PFL_BILPREEQUVAR_IMPORTOL1 = 27;
  private static int PFL_BILPREEQUVAR_IMPORTOL2 = 28;
  private static int PFL_BILPREEQUVAR_IMPORTOL3 = 29;
  private static int PFL_BILPREEQUVAR_IMPORTOM1 = 30;
  private static int PFL_BILPREEQUVAR_IMPORTOM2 = 31;
  private static int PFL_BILPREEQUVAR_IMPORTOM3 = 32;
  private static int PFL_BILPREEQUVAR_IMPORTOP1 = 33;
  private static int PFL_BILPREEQUVAR_IMPORTOP2 = 34;
  private static int PFL_BILPREEQUVAR_IMPORTOP3 = 35;
  private static int PFL_BILPREEQUVAR_ETICHETTAB = 36;
  private static int PFL_BILPREEQUVAR_ETICHETTAF = 37;
  private static int PFL_BILPREEQUVAR_ETICHETTAH = 38;
  private static int PFL_BILPREEQUVAR_ETICHETTAI = 39;
  private static int PFL_BILPREEQUVAR_ETICHETTAI1 = 40;
  private static int PFL_BILPREEQUVAR_ETICHETTAL = 41;
  private static int PFL_BILPREEQUVAR_ETICHETTAM = 42;
  private static int PFL_BILPREEQUVAR_ELABORA = 43;
  private static int PFL_BILPREEQUVAR_ETICHETTAF1 = 44;
  private static int PFL_BILPREEQUVAR_ETICHETTAP = 45;
  private static int PFL_BILPREEQUVAR_ETICHECOMPET = 46;
  private static int PFL_BILPREEQUVAR_ETICHECOMPE1 = 47;
  private static int PFL_BILPREEQUVAR_ETICHECOMPE2 = 48;
  private static int PFL_BILPREEQUVAR_ETICHETTAF2 = 49;

  private static int PPQRY_BILPREEQUVAR = 0;


  IDPanel PAN_BILPREEQUVAR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI189(IMDB);
    //
    //
    Init_PQRY_PARAMETRI529(IMDB);
    Init_PQRY_PARAMETRI529_RS(IMDB);
    Init_PQRY_BILPREEQUVAR(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI189(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI189, 8);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI189, "TBL_PARAMETRI189");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI189,IMDBDef3.FLD_PARAMETRI189_ROWNAMDATELA,6,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI189, 0);
  }

  private static void Init_PQRY_PARAMETRI529(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI529, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI529, "PQRY_PARAMETRI529");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529,IMDBDef11.PQSL_PARAMETRI529_ROWNAMDATELA,6,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI529, 0);
  }

  private static void Init_PQRY_PARAMETRI529_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI529_RS, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI529_RS, "PQRY_PARAMETRI529_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI529_RS,IMDBDef11.PQSL_PARAMETRI529_ROWNAMDATELA,6,10,0);
  }

  private static void Init_PQRY_BILPREEQUVAR(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILPREEQUVAR, 35);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILPREEQUVAR, "PQRY_BILPREEQUVAR");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_AA1, "IMPORTO_AA1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_AA1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_AA2, "IMPORTO_AA2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_AA2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_AA3, "IMPORTO_AA3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_AA3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_B1, "IMPORTO_B1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_B1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_B2, "IMPORTO_B2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_B2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_B3, "IMPORTO_B3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_B3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_F1, "IMPORTO_F1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_F1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_F2, "IMPORTO_F2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_F2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_F3, "IMPORTO_F3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_F3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_H1, "IMPORTO_H1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_H1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_H2, "IMPORTO_H2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_H2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_H3, "IMPORTO_H3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_H3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_I1, "IMPORTO_I1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_I1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_I2, "IMPORTO_I2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_I2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_I3, "IMPORTO_I3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_I3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_I21, "IMPORTO_I21");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_I21,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_I22, "IMPORTO_I22");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_I22,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_I23, "IMPORTO_I23");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_I23,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_L1, "IMPORTO_L1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_L1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_L2, "IMPORTO_L2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_L2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_L3, "IMPORTO_L3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_L3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_M1, "IMPORTO_M1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_M2, "IMPORTO_M2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_M3, "IMPORTO_M3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_G1, "IMPORTO_G1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_G1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_G2, "IMPORTO_G2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_G2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_G3, "IMPORTO_G3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_G3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_P1, "IMPORTO_P1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_P1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_P2, "IMPORTO_P2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_P2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_P3, "IMPORTO_P3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_IMPORTO_P3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_FONDO_ANTIC_LIQUIDITA_1, "FONDO_ANTIC_LIQUIDITA_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_FONDO_ANTIC_LIQUIDITA_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_FONDO_ANTIC_LIQUIDITA_2, "FONDO_ANTIC_LIQUIDITA_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_FONDO_ANTIC_LIQUIDITA_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_FONDO_ANTIC_LIQUIDITA_3, "FONDO_ANTIC_LIQUIDITA_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREEQUVAR,IMDBDef11.PQSL_BILPREEQUVAR_FONDO_ANTIC_LIQUIDITA_3,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILPREEQUVAR, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EquilibriBilancioAgg(MyWebEntryPoint w, IMDBObj imdb)
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
  public EquilibriBilancioAgg()
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
    FormIdx = MyGlb.FRM_EQUILBILAAGG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "95D82CCB-0507-4A20-8743-D5764A0CE253";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1000;
    DesignHeight = 650;
    set_Caption(new IDVariant("Equilibri di Bilancio"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1000;
    Frames[1].Height = 624;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.25641;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1000;
    Frames[2].Height = 160;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 160;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1000-MyGlb.PAN_OFFS_X, 160-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "29288BBD-FAAA-414B-A428-7515D9DF518E");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 464, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    Frames[3].Width = 1000;
    Frames[3].Height = 464;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "BIL PREV EQUILIBRI VAR";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 464;
    PAN_BILPREEQUVAR = new IDPanel(w, this, 3, "PAN_BILPREEQUVAR");
    Frames[3].Content = PAN_BILPREEQUVAR;
    PAN_BILPREEQUVAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BILPREEQUVAR.VS = MainFrm.VisualStyleList;
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1000-MyGlb.PAN_OFFS_X, 464-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9EA69721-6905-43F9-ABB6-10CFA2B1DEB5");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1668, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BILPREEQUVAR.InitStatus = 2;
    PAN_BILPREEQUVAR_Init();
    PAN_BILPREEQUVAR_InitFields();
    PAN_BILPREEQUVAR_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI189, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EQUILBILAAGG_PARAMETRI529();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_BILPREEQUVAR.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRISCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRISCELPROP) {
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
    return (obj instanceof EquilibriBilancioAgg);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EquilibriBilancioAgg.class.getName() : (Glb.ClassWithPackage(EquilibriBilancioAgg.class) ? EquilibriBilancioAgg.class.getName().substring(EquilibriBilancioAgg.class.getPackage().getName().length() + 1) : EquilibriBilancioAgg.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Info Delibera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Delibera Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriBilancioAgg", "ApriInfoDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Delibera
  // **********************************************************************
  public int ApriDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriBilancioAgg", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Proposta
  // **********************************************************************
  public int ApriProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriBilancioAgg", "ApriProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_PROPDELVALOR = new IDVariant(0,IDVariant.INTEGER);
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMDATELA, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Data Elaborazione Obbligatoria"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, 0))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, 0))))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Delibera non presente", IDVariant.STRING));
          v_CONTATORE = (new IDVariant(0));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  DEL A ");
          SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.equals((new IDVariant(0)), true))
          {
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
          v_PROPDELVALOR = (new IDVariant(-1));
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Dati della Delibera incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      if ((!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMPRO, 0)) || !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNPRO, 0))))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNPRO, 0))))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Proposta inesistente", IDVariant.STRING));
          if (MainFrm.GESTIODELIBE.booleanValue())
          {
            v_CONTATORE = (new IDVariant(0));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  PROPOSTE A ");
            SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTATORE.equals((new IDVariant(0)), true))
            {
              MainFrm.set_AlertMessage(v_AVVISO); 
              return 0;
            }
          }
          v_PROPDELVALOR = (new IDVariant(-1));
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Dati della Proposta incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      // if (!(v_PROPDELVALOR.booleanValue()))
      // {
        // IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        // v_AVVISO = (new IDVariant("Provvedimento Obbligatorio"));
        // MainFrm.set_AlertMessage(v_AVVISO); 
        // return 0;
      // }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.WORKVAREQUILIBRI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMEVARIA, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMDATELA, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR2 = (new IDVariant("ESERCIZIO"));
      IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR1 = (new IDVariant("SESSIONE"));
      IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR9 = (new IDVariant("TIPO_VAR"));
      IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR3 = (new IDVariant("SEDE_DEL"));
      IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR4 = (new IDVariant("NUMERO_DEL"));
      IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR5 = (new IDVariant("ANNO_DEL"));
      IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR6 = (new IDVariant("UNITA_PROP"));
      IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR7 = (new IDVariant("NUMERO_PROP"));
      IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR8 = (new IDVariant("ANNO_PROP"));
      IDVariant v_NOMESTAMPEQB = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPEQB = (new IDVariant("Equilibri_Bilancio_Agg"));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(MainFrm.PROGRESESSIO));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMEVARIA, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMPRO, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNPRO, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef11.PQRY_PARAM153, IMDBDef11.PQSL_PARAM153_PARSTANUDIPA, 0));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPEQB, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriBilancioAgg", "Elabora", _e);
      return -1;
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(this.Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMEVARIA, 0, (new IDVariant("P")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMSEDDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMNUMDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMANNDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMUNIPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMDATELA, 0, IDL.Today());
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_BILPREEQUVAR.set_FieldText(PFL_BILPREEQUVAR_ETICHECOMPET, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_BILPREEQUVAR.set_FieldText(PFL_BILPREEQUVAR_ETICHECOMPE1, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILPREEQUVAR.set_FieldText(PFL_BILPREEQUVAR_ETICHECOMPE2, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriBilancioAgg", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriBilancioAgg", "EndModalEvent", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriBilancioAgg", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMDATELA, 0, new IDVariant());
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
      if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, 0))))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriBilancioAgg", "ParametriOnDynamicPropertiesEvent", _e);
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
      if (Column.equals((new IDVariant(PFL_PARAMETRI_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, 0)));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_DELIBERA)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMERODELIBE)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNODELIBERA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNPRO, 0, (new IDVariant()));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_PROPOSTA)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNOPROPOSTA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNPRO, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_VARIAZIONI)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMSEDDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI529, IMDBDef11.PQSL_PARAMETRI529_ROWNAMANNDEL, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriBilancioAgg", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // BIL PREV EQUILIBRI VAR On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_BILPREEQUVAR_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL PREV EQUILIBRI VAR On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILPREEQUVAR, IMDBDef11.PQSL_BILPREEQUVAR_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef11.PQRY_BILPREEQUVAR, IMDBDef11.PQSL_BILPREEQUVAR_E_S, 0, (new IDVariant("E")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriBilancioAgg", "BILPREVEQUILIBRIVAROnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void EQUILBILAAGG_PARAMETRI529() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETRI529_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI189, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI189, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI529_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETRI529_RS, 0, IMDBDef3.TBL_PARAMETRI189, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI529_RS, 0, 0, IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI529_RS, 1, 0, IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI529_RS, 2, 0, IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI529_RS, 3, 0, IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI529_RS, 4, 0, IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI529_RS, 5, 0, IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI529_RS, 6, 0, IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI529_RS, 7, 0, IMDBDef3.TBL_PARAMETRI189, IMDBDef3.FLD_PARAMETRI189_ROWNAMDATELA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI189, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI189, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI189, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETRI529_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_APRISCELDELI)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRIINFODELI)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRISCELPROP)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
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
  private void PAN_BILPREEQUVAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BILPREEQUVAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BILPREEQUVAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BILPREEQUVAR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BILPREEQUVAR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_BILPREEQUVAR);
    // Stub
  }

  private void PAN_BILPREEQUVAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_BILPREEQUVAR_ELABORA)
    {
      this.IdxPanelActived = this.PAN_BILPREEQUVAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_BILPREEQUVAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_BILPREEQUVAR_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_BILPREEQUVAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BILPREEQUVAR_IntValidateRow(Cancel);
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
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, "3DA486C5-170A-423F-A393-F571C07161B9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, "Variazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 264, -9999, 80, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 16, 19, 228, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 0, 55);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "6AE4CFD6-6414-487E-80B3-05059EAEF7F6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "Provvedimento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_LIST, 544, -9999, 272, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_FORM, 16, 75, 584, 61, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 87);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "12E85E0A-B3B7-497C-86A3-A6C3AB8E1AED");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "Variazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, "0882FD0E-212F-4CA7-9AED-207E5ACD32F5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "099829C2-8116-4DFE-AD9A-6B6CE01699F6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "B23BBE44-ED68-4955-AF66-B4D0795018CB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "69C18C00-FADA-4FC6-BE1C-DE8889881CE2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "Numero Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "5B95FDA3-07BC-44AF-988B-F7CEC07A1F04");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "Anno Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "CF922F56-FFEE-48BC-A9C8-310DD05FCE05");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "98A44BE0-9013-442E-A04B-CC85F78358AF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "Numero Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "AB745AE3-B59A-46B8-A287-9FA72F3BE1DF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "Anno Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, "56ECBBD8-019D-4DF6-A5D6-DE632B0694BF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, "A2BB76D9-2CDB-4899-BAB6-E7204BB33891");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, "ACDE2061-822D-43F6-8AC3-33E14D4C336C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, "31DDB2D8-6FDD-4D12-A83B-0FEEC68E13C3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, "6D5C41BB-95BD-4BFD-890B-334EDEB413B0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, "DB041990-A89A-4E4C-93DE-9E9F2680DA66");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, "117D55F3-2FFF-47F7-B15D-D9662BADFE81");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, "E59A2598-4345-458A-948E-0DD4D376B3D8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 52, 44, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARIAZIONI, -1, GRP_PARAMETRI_VARIAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARIAZIONI, PPQRY_PARAMETRI529, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.PANEL_LIST, 172, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.PANEL_FORM, 20, 48, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE5, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE5, -1, GRP_PARAMETRI_VARIAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE5, -1, "", "NEWPANELABE5", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 252, 44, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMETRI529, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 20, 112, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERA, PPQRY_PARAMETRI529, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, "N. Dl.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 140, 112, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODELIBE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODELIBE, PPQRY_PARAMETRI529, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 624, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, "A. Dl.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 200, 112, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODELIBERA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODELIBERA, PPQRY_PARAMETRI529, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 284, 112, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROPOSTA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROPOSTA, PPQRY_PARAMETRI529, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. Pr.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 480, 112, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROPOS, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROPOS, PPQRY_PARAMETRI529, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. Pr.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 540, 112, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROPOSTA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROPOSTA, PPQRY_PARAMETRI529, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_FORM, 120, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTIDELIBE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_LIST, 164, 272, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_FORM, 180, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRADELIBER, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_LIST, 508, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_FORM, 240, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRISCELDELI, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRISCELDELI, -1, "", "APRISCELDELI", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_LIST, 516, 264, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_FORM, 260, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRIINFODELI, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRIINFODELI, -1, "", "APRIINFODELI", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 180, 288, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 460, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTIPROPOS, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 520, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRAPROPOST, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_LIST, 500, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_FORM, 580, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRISCELPROP, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRISCELPROP, -1, "", "APRISCELPROP", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_LIST, 596, 220, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_FORM, 568, 100, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHETTASF, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI529", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI529, IMDBDef11.PQRY_PARAMETRI529_RS, IMDBDef3.TBL_PARAMETRI189);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_VARIAZIONI, IMDBDef3.FLD_PARAMETRI189_ROWNAMEVARIA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef3.FLD_PARAMETRI189_ROWNAMDATELA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DELIBERA, IMDBDef3.FLD_PARAMETRI189_ROWNAMSEDDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODELIBE, IMDBDef3.FLD_PARAMETRI189_ROWNAMNUMDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODELIBERA, IMDBDef3.FLD_PARAMETRI189_ROWNAMANNDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PROPOSTA, IMDBDef3.FLD_PARAMETRI189_ROWNAMUNIPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROPOS, IMDBDef3.FLD_PARAMETRI189_ROWNAMNUMPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROPOSTA, IMDBDef3.FLD_PARAMETRI189_ROWNAMANNPRO);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI189");
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

  private void PAN_BILPREEQUVAR_Init()
  {

    PAN_BILPREEQUVAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BILPREEQUVAR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BILPREEQUVAR.SetSize(MyGlb.OBJ_FIELD, 50);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, "63814E61-86EF-4667-80F0-B3C71EE39F70");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, "ESERCIZIO");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, 0, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, "DADD51DD-55F6-4972-92AD-A1879258D6B8");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, "E S");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, 0, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAAA, "1B4AB1C1-E683-40B5-A985-34698A0CA44C");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAAA, "AA) Recupero disavanzo di amministrazione esercizio precedente ");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAAA, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAAA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, "5FE6E527-5D5F-4103-B033-FC9B3BAF25A8");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, "IMPORTO AA1");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, "208F7632-0C3C-45E8-B6A3-06DBE4608089");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, "IMPORTO AA2");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, "C90DFF8D-40FC-4F0F-996C-52D8FE62A8CA");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, "IMPORTO AA3");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, "EF8B3080-4E6B-48B1-9D59-CA406724399B");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, "IMPORTO B1");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, "745DE6AE-DC78-485C-8ECC-F1D173272B9E");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, "IMPORTO B2");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, "F97458BB-6454-4B64-84DA-98BF572084D0");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, "IMPORTO B3");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, "1CF71872-46FD-4A2E-A667-7989E8E4BD4F");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, "IMPORTO F1");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, "516E261D-530C-4794-85B3-BF3213840620");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, "IMPORTO F2");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, "FC71ACC7-AD67-45BF-A95A-F60C6BCBD868");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, "IMPORTO F3");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, "068DD89C-EBD2-4C24-8358-A8A002361E5C");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, "FONDO ANTIC LIQUIDITA 1");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, "5E48AC93-5F67-4CE8-98B8-A16A5D6E8F78");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, "FONDO ANTIC LIQUIDITA 2");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, "704181FE-6A65-479A-A597-92F305EC143C");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, "FONDO ANTIC LIQUIDITA 3");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, "1F6D47B8-1382-41BC-B9A4-437415D796AB");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, "IMPORTO G1");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, "786881E6-B384-4FFE-AA62-F34DADD42A88");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, "IMPORTO G2");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, "4B37D7F9-96B1-478A-A033-09E7A30F4673");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, "IMPORTO G3");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, "B61BFE10-9FB3-4807-A33E-C04252A8D8B4");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, "IMPORTO H1");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, "A3B40675-2481-442D-84B3-B549CD32F421");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, "IMPORTO H2");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, "64B36FFD-64D8-48DC-8BD5-C415B1B92949");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, "IMPORTO H3");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, "02562CF5-BEF3-4C14-9B94-1C64BCED4E89");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, "IMPORTO I1");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, "8F71F446-434E-4551-A8E5-585976C0AF2D");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, "IMPORTO I2");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, "B9B8E5FF-D550-4AA4-A4C4-2E5CA297B333");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, "IMPORTO I3");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, "E68EB4AA-81C8-4FB0-B043-9BF430123AE6");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, "IMPORTO I21");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, "1BB7038F-8828-4201-BB1B-74A46D5D1513");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, "IMPORTO I22");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, "D599EE0D-7408-419C-AD8B-EF18BD1AEC16");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, "IMPORTO I23");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, "52C3BACF-CF17-4E04-B4E0-CF7D2A240F76");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, "IMPORTO L1");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, "D55B7E1B-3E1D-427F-907E-2DC548A1BA9C");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, "IMPORTO L2");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, "673E2A5A-72F3-4863-9107-2FC995A9CA53");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, "IMPORTO L3");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, "05ECB6C9-E2B3-4CF6-888C-5A6BDAC8FF85");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, "IMPORTO M1");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, "248D4B60-EACF-4E41-BDF3-485D513D805B");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, "IMPORTO M2");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, "A01D5DCF-07FB-4565-AFC3-026E09C18A69");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, "IMPORTO M3");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, "1A2F55FF-159B-4021-8D10-C1C028054A79");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, "IMPORTO P1");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, "7C81DE55-58C1-42E5-AB31-9400ACB3E7EA");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, "IMPORTO P2");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, "A5F40DBE-9BDD-4CDD-91C1-3818D76BE850");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, "IMPORTO P3");
    PAN_BILPREEQUVAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, "");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAB, "85F12B32-86B5-428E-B45D-DE98A257013A");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAB, "B) Entrate Titoli 1.00 - 2.00 - 3.00 - Estinzione anticipata di prestiti");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAB, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF, "2BEF3E11-B1F1-4EB2-BA4E-DA30D2D4D69F");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF, "F) Spese Titolo 4 - Estinzione anticipata di prestiti");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAH, "117F8C87-325B-46FD-BE2C-13D75EF8D5E4");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAH, "di cui per estinzione anticipata di prestiti");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAH, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI, "E377E0D8-7B9E-4E7B-8809-DA9088B1D8D8");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI, "I) Entrate di parte capitale destinate a spese correnti in base a specifiche disposizioni di legge");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI1, "342EA009-65C5-40EE-92E5-9FE04B6F6525");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI1, "di cui per estinzione anticipata di prestiti\n");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI1, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAL, "A04C711C-DAD5-4BD8-A4AB-43AFB84BB59D");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAL, "L) Entrate di parte corrente destinate a spese di investimento in base a specifiche disposizioni di legge\n");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAL, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAM, "910FD14D-20BF-4000-B82A-C20A537CE7CF");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAM, "M) Entrate da accensione di prestiti destinate a estinzione anticipata di prestiti\n\n");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAM, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ELABORA, "1A06A988-C8AB-479C-917F-7EE315B714AB");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ELABORA, "Elabora");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_BILPREEQUVAR.SetImage(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ELABORA, 0, "button1.gif", false);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF1, "79E24DD7-2E2F-4737-84D7-313FC50CE7DD");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF1, "H) Utilizzo avanzo di amministrazione per spese correnti");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF1, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAP, "C0128F58-4A1B-4BFE-8228-794AE4551AEF");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAP, "P) Utilizzo avanzo di amministrazione per spese di investimento");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAP, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPET, "6FF6928C-71F4-44A3-9F02-169BD66AD6AF");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPET, "Competenza");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPET, MyGlb.VIS_VUOTOGRASSET);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE1, "216839BA-E659-4E1D-A55B-F72540D0E681");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE1, "Competenza");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE1, MyGlb.VIS_VUOTOGRASSET);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE2, "03274E9D-12A8-4827-A1B2-9A35A54480DE");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE2, "Competenza");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE2, MyGlb.VIS_VUOTOGRASSET);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILPREEQUVAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF2, "B8F0CDEB-1350-4AC2-9234-7DBEF6C9A0D2");
    PAN_BILPREEQUVAR.set_Header(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF2, "di cui Fondo anticipazioni di liquidità (DL 35/2013 e successive modifiche e rifinanziamenti) ");
    PAN_BILPREEQUVAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF2, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILPREEQUVAR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_BILPREEQUVAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ESERCIZIO, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ESERCIZIO, PPQRY_BILPREEQUVAR, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, MyGlb.PANEL_LIST, 24);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, MyGlb.PANEL_LIST, "E S");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, MyGlb.PANEL_FORM, 164, 4, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, MyGlb.PANEL_FORM, 40);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ES, MyGlb.PANEL_FORM, "E S");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ES, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ES, PPQRY_BILPREEQUVAR, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAAA, MyGlb.PANEL_LIST, 12, 24, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAAA, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAAA, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAAA, MyGlb.PANEL_FORM, 16, 36, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAAA, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAAA, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHETTAAA, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHETTAAA, -1, "", "ETICHETTAAA", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, MyGlb.PANEL_LIST, 88);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, MyGlb.PANEL_LIST, "IMP. AA1");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, MyGlb.PANEL_FORM, 604, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA1, MyGlb.PANEL_FORM, "IMPORTO AA1");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOAA1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOAA1, PPQRY_BILPREEQUVAR, "A.IMPORTO_AA1", "IMPORTO_AA1", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, MyGlb.PANEL_LIST, 88);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, MyGlb.PANEL_LIST, "IMP. AA2");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, MyGlb.PANEL_FORM, 732, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA2, MyGlb.PANEL_FORM, "IMPORTO AA2");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOAA2, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOAA2, PPQRY_BILPREEQUVAR, "A.IMPORTO_AA2", "IMPORTO_AA2", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, MyGlb.PANEL_LIST, 160, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, MyGlb.PANEL_LIST, 88);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, MyGlb.PANEL_LIST, "IMP. AA3");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, MyGlb.PANEL_FORM, 860, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOAA3, MyGlb.PANEL_FORM, "IMPORTO AA3");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOAA3, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOAA3, PPQRY_BILPREEQUVAR, "A.IMPORTO_AA3", "IMPORTO_AA3", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, MyGlb.PANEL_LIST, 200, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, MyGlb.PANEL_LIST, "IMP. B1");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, MyGlb.PANEL_FORM, 604, 68, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, MyGlb.PANEL_FORM, 96);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB1, MyGlb.PANEL_FORM, "IMPORTO B1");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOB1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOB1, PPQRY_BILPREEQUVAR, "A.IMPORTO_B1", "IMPORTO_B1", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, MyGlb.PANEL_LIST, 240, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, MyGlb.PANEL_LIST, "IMP. B2");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, MyGlb.PANEL_FORM, 732, 68, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB2, MyGlb.PANEL_FORM, "IMPORTO B2");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOB2, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOB2, PPQRY_BILPREEQUVAR, "A.IMPORTO_B2", "IMPORTO_B2", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, MyGlb.PANEL_LIST, 280, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, MyGlb.PANEL_LIST, "IMP. B3");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, MyGlb.PANEL_FORM, 860, 68, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOB3, MyGlb.PANEL_FORM, "IMPORTO B3");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOB3, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOB3, PPQRY_BILPREEQUVAR, "A.IMPORTO_B3", "IMPORTO_B3", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, MyGlb.PANEL_LIST, 320, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, MyGlb.PANEL_LIST, "IMP. F1");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, MyGlb.PANEL_FORM, 604, 100, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, MyGlb.PANEL_FORM, 96);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF1, MyGlb.PANEL_FORM, "IMPORTO F1");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOF1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOF1, PPQRY_BILPREEQUVAR, "A.IMPORTO_F1", "IMPORTO_F1", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, MyGlb.PANEL_LIST, 360, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, MyGlb.PANEL_LIST, "IMP. F2");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, MyGlb.PANEL_FORM, 732, 100, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF2, MyGlb.PANEL_FORM, "IMPORTO F2");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOF2, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOF2, PPQRY_BILPREEQUVAR, "A.IMPORTO_F2", "IMPORTO_F2", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, MyGlb.PANEL_LIST, 400, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, MyGlb.PANEL_LIST, "IMP. F3");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, MyGlb.PANEL_FORM, 860, 100, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOF3, MyGlb.PANEL_FORM, "IMPORTO F3");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOF3, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOF3, PPQRY_BILPREEQUVAR, "A.IMPORTO_F3", "IMPORTO_F3", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, MyGlb.PANEL_LIST, 156);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, MyGlb.PANEL_LIST, "FONDO ANTIC LIQUIDITA 1");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, MyGlb.PANEL_FORM, 604, 124, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, MyGlb.PANEL_FORM, 380);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ1, MyGlb.PANEL_FORM, "FONDO ANTIC LIQUIDITA 1");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_FONDANTILIQ1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_FONDANTILIQ1, PPQRY_BILPREEQUVAR, "A.FONDO_ANTIC_LIQUIDITA_1", "FONDO_ANTIC_LIQUIDITA_1", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, MyGlb.PANEL_LIST, 156);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, MyGlb.PANEL_LIST, "FONDO ANTIC LIQUIDITA 2");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, MyGlb.PANEL_FORM, 732, 124, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, MyGlb.PANEL_FORM, 156);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ2, MyGlb.PANEL_FORM, "FONDO ANTIC LIQUIDITA 2");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_FONDANTILIQ2, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_FONDANTILIQ2, PPQRY_BILPREEQUVAR, "A.FONDO_ANTIC_LIQUIDITA_2", "FONDO_ANTIC_LIQUIDITA_2", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, MyGlb.PANEL_LIST, 156);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, MyGlb.PANEL_LIST, "FONDO ANTIC LIQUIDITA 3");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, MyGlb.PANEL_FORM, 860, 124, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, MyGlb.PANEL_FORM, 156);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_FONDANTILIQ3, MyGlb.PANEL_FORM, "FONDO ANTIC LIQUIDITA 3");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_FONDANTILIQ3, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_FONDANTILIQ3, PPQRY_BILPREEQUVAR, "A.FONDO_ANTIC_LIQUIDITA_3", "FONDO_ANTIC_LIQUIDITA_3", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, MyGlb.PANEL_LIST, "IMPORTO G1");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, MyGlb.PANEL_FORM, 604, 156, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, MyGlb.PANEL_FORM, 312);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG1, MyGlb.PANEL_FORM, "IMPORTO G1");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOG1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOG1, PPQRY_BILPREEQUVAR, "A.IMPORTO_G1", "IMPORTO_G1", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, MyGlb.PANEL_LIST, "IMPORTO G2");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, MyGlb.PANEL_FORM, 732, 156, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, MyGlb.PANEL_FORM, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG2, MyGlb.PANEL_FORM, "IMPORTO G2");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOG2, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOG2, PPQRY_BILPREEQUVAR, "A.IMPORTO_G2", "IMPORTO_G2", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, MyGlb.PANEL_LIST, "IMPORTO G3");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, MyGlb.PANEL_FORM, 860, 156, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, MyGlb.PANEL_FORM, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOG3, MyGlb.PANEL_FORM, "IMPORTO G3");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOG3, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOG3, PPQRY_BILPREEQUVAR, "A.IMPORTO_G3", "IMPORTO_G3", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, MyGlb.PANEL_LIST, 440, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, MyGlb.PANEL_LIST, "IMP. H1");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, MyGlb.PANEL_FORM, 604, 180, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, MyGlb.PANEL_FORM, 96);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH1, MyGlb.PANEL_FORM, "IMPORTO H1");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOH1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOH1, PPQRY_BILPREEQUVAR, "A.IMPORTO_H1", "IMPORTO_H1", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, MyGlb.PANEL_LIST, 480, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, MyGlb.PANEL_LIST, "IMP. H2");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, MyGlb.PANEL_FORM, 732, 180, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH2, MyGlb.PANEL_FORM, "IMPORTO H2");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOH2, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOH2, PPQRY_BILPREEQUVAR, "A.IMPORTO_H2", "IMPORTO_H2", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, MyGlb.PANEL_LIST, 520, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, MyGlb.PANEL_LIST, "IMP. H3");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, MyGlb.PANEL_FORM, 860, 180, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOH3, MyGlb.PANEL_FORM, "IMPORTO H3");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOH3, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOH3, PPQRY_BILPREEQUVAR, "A.IMPORTO_H3", "IMPORTO_H3", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, MyGlb.PANEL_LIST, 560, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, MyGlb.PANEL_LIST, 76);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, MyGlb.PANEL_LIST, "IMP. I1");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, MyGlb.PANEL_FORM, 604, 212, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, MyGlb.PANEL_FORM, 88);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI1, MyGlb.PANEL_FORM, "IMPORTO I1");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOI1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOI1, PPQRY_BILPREEQUVAR, "A.IMPORTO_I1", "IMPORTO_I1", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, MyGlb.PANEL_LIST, 600, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, MyGlb.PANEL_LIST, 76);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, MyGlb.PANEL_LIST, "IMP. I2");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, MyGlb.PANEL_FORM, 732, 212, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI2, MyGlb.PANEL_FORM, "IMPORTO I2");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOI2, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOI2, PPQRY_BILPREEQUVAR, "A.IMPORTO_I2", "IMPORTO_I2", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, MyGlb.PANEL_LIST, 640, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, MyGlb.PANEL_LIST, 76);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, MyGlb.PANEL_LIST, "IMP. I3");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, MyGlb.PANEL_FORM, 860, 212, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI3, MyGlb.PANEL_FORM, "IMPORTO I3");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOI3, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOI3, PPQRY_BILPREEQUVAR, "A.IMPORTO_I3", "IMPORTO_I3", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, MyGlb.PANEL_LIST, 680, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, MyGlb.PANEL_LIST, 84);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, MyGlb.PANEL_LIST, "IMP. I21");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, MyGlb.PANEL_FORM, 604, 236, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, MyGlb.PANEL_FORM, 96);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI21, MyGlb.PANEL_FORM, "IMPORTO I21");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOI21, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOI21, PPQRY_BILPREEQUVAR, "A.IMPORTO_I21", "IMPORTO_I21", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, MyGlb.PANEL_LIST, 720, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, MyGlb.PANEL_LIST, 84);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, MyGlb.PANEL_LIST, "IMP. I22");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, MyGlb.PANEL_FORM, 732, 236, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI22, MyGlb.PANEL_FORM, "IMPORTO I22");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOI22, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOI22, PPQRY_BILPREEQUVAR, "A.IMPORTO_I22", "IMPORTO_I22", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, MyGlb.PANEL_LIST, 760, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, MyGlb.PANEL_LIST, 84);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, MyGlb.PANEL_LIST, "IMP. I23");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, MyGlb.PANEL_FORM, 860, 236, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOI23, MyGlb.PANEL_FORM, "IMPORTO I23");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOI23, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOI23, PPQRY_BILPREEQUVAR, "A.IMPORTO_I23", "IMPORTO_I23", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, MyGlb.PANEL_LIST, 128, 164, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, MyGlb.PANEL_LIST, 120);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, MyGlb.PANEL_LIST, "IMPORTO L1");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, MyGlb.PANEL_FORM, 604, 268, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL1, MyGlb.PANEL_FORM, "IMPORTO L1");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOL1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOL1, PPQRY_BILPREEQUVAR, "A.IMPORTO_L1", "IMPORTO_L1", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, MyGlb.PANEL_LIST, 128, 188, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, MyGlb.PANEL_LIST, 120);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, MyGlb.PANEL_LIST, "IMPORTO L2");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, MyGlb.PANEL_FORM, 732, 268, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL2, MyGlb.PANEL_FORM, "IMPORTO L2");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOL2, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOL2, PPQRY_BILPREEQUVAR, "A.IMPORTO_L2", "IMPORTO_L2", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, MyGlb.PANEL_LIST, 128, 212, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, MyGlb.PANEL_LIST, 120);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, MyGlb.PANEL_LIST, "IMPORTO L3");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, MyGlb.PANEL_FORM, 860, 268, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOL3, MyGlb.PANEL_FORM, "IMPORTO L3");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOL3, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOL3, PPQRY_BILPREEQUVAR, "A.IMPORTO_L3", "IMPORTO_L3", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, MyGlb.PANEL_LIST, 128, 236, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, MyGlb.PANEL_LIST, 120);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, MyGlb.PANEL_LIST, "IMPORTO M1");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, MyGlb.PANEL_FORM, 604, 300, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM1, MyGlb.PANEL_FORM, "IMPORTO M1");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOM1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOM1, PPQRY_BILPREEQUVAR, "A.IMPORTO_M1", "IMPORTO_M1", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, MyGlb.PANEL_LIST, 128, 260, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, MyGlb.PANEL_LIST, 120);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, MyGlb.PANEL_LIST, "IMPORTO M2");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, MyGlb.PANEL_FORM, 732, 300, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, MyGlb.PANEL_FORM, 104);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM2, MyGlb.PANEL_FORM, "IMPORTO M2");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOM2, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOM2, PPQRY_BILPREEQUVAR, "A.IMPORTO_M2", "IMPORTO_M2", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, MyGlb.PANEL_LIST, 128, 284, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, MyGlb.PANEL_LIST, 120);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, MyGlb.PANEL_LIST, "IMPORTO M3");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, MyGlb.PANEL_FORM, 860, 300, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, MyGlb.PANEL_FORM, 96);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOM3, MyGlb.PANEL_FORM, "IMPORTO M3");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOM3, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOM3, PPQRY_BILPREEQUVAR, "A.IMPORTO_M3", "IMPORTO_M3", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, MyGlb.PANEL_LIST, "IMPORTO P1");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, MyGlb.PANEL_FORM, 604, 332, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, MyGlb.PANEL_FORM, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP1, MyGlb.PANEL_FORM, "IMPORTO P1");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOP1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOP1, PPQRY_BILPREEQUVAR, "A.IMPORTO_P1", "IMPORTO_P1", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, MyGlb.PANEL_LIST, "IMPORTO P2");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, MyGlb.PANEL_FORM, 732, 332, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, MyGlb.PANEL_FORM, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP2, MyGlb.PANEL_FORM, "IMPORTO P2");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOP2, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOP2, PPQRY_BILPREEQUVAR, "A.IMPORTO_P2", "IMPORTO_P2", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, MyGlb.PANEL_LIST, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, MyGlb.PANEL_LIST, "IMPORTO P3");
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, MyGlb.PANEL_FORM, 860, 332, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, MyGlb.PANEL_FORM, 80);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_IMPORTOP3, MyGlb.PANEL_FORM, "IMPORTO P3");
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_IMPORTOP3, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_IMPORTOP3, PPQRY_BILPREEQUVAR, "A.IMPORTO_P3", "IMPORTO_P3", 3, 14, 2, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAB, MyGlb.PANEL_LIST, 20, 32, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAB, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAB, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAB, MyGlb.PANEL_FORM, 16, 68, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAB, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAB, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHETTAB, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHETTAB, -1, "", "ETICHETTAB", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF, MyGlb.PANEL_LIST, 28, 40, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF, MyGlb.PANEL_FORM, 16, 100, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHETTAF, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHETTAF, -1, "", "ETICHETTAF", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAH, MyGlb.PANEL_LIST, 36, 48, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAH, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAH, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAH, MyGlb.PANEL_FORM, 32, 180, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAH, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAH, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHETTAH, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHETTAH, -1, "", "ETICHETTAH", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI, MyGlb.PANEL_LIST, 44, 56, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI, MyGlb.PANEL_FORM, 16, 212, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHETTAI, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHETTAI, -1, "", "ETICHETTAI", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI1, MyGlb.PANEL_LIST, 60, 72, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI1, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI1, MyGlb.PANEL_FORM, 32, 236, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI1, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAI1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHETTAI1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHETTAI1, -1, "", "ETICHETTAI1", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAL, MyGlb.PANEL_LIST, 52, 64, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAL, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAL, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAL, MyGlb.PANEL_FORM, 16, 268, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAL, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAL, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHETTAL, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHETTAL, -1, "", "ETICHETTAL", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAM, MyGlb.PANEL_LIST, 60, 72, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAM, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAM, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAM, MyGlb.PANEL_FORM, 16, 300, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAM, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAM, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHETTAM, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHETTAM, -1, "", "ETICHETTAM", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ELABORA, MyGlb.PANEL_LIST, 428, 292, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ELABORA, MyGlb.PANEL_FORM, 904, 368, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ELABORA, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF1, MyGlb.PANEL_LIST, 36, 48, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF1, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF1, MyGlb.PANEL_FORM, 16, 156, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF1, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHETTAF1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHETTAF1, -1, "", "ETICHETTAF1", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAP, MyGlb.PANEL_LIST, 44, 56, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAP, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAP, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAP, MyGlb.PANEL_FORM, 16, 332, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAP, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAP, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHETTAP, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHETTAP, -1, "", "ETICHETTAP", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPET, MyGlb.PANEL_LIST, 604, 12, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPET, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPET, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPET, MyGlb.PANEL_FORM, 604, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPET, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPET, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHECOMPET, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHECOMPET, -1, "", "ETICHECOMPET", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE1, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE1, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE1, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE1, MyGlb.PANEL_FORM, 732, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE1, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE1, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHECOMPE1, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHECOMPE1, -1, "", "ETICHECOMPE1", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE2, MyGlb.PANEL_LIST, 620, 28, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE2, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE2, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE2, MyGlb.PANEL_FORM, 860, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE2, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHECOMPE2, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHECOMPE2, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHECOMPE2, -1, "", "ETICHECOMPE2", 0, 0, 0, -13997);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF2, MyGlb.PANEL_LIST, 36, 48, 204, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF2, MyGlb.PANEL_LIST, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF2, MyGlb.PANEL_LIST, 1);
    PAN_BILPREEQUVAR.SetRect(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF2, MyGlb.PANEL_FORM, 32, 124, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILPREEQUVAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF2, MyGlb.PANEL_FORM, 0);
    PAN_BILPREEQUVAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILPREEQUVAR_ETICHETTAF2, MyGlb.PANEL_FORM, 1);
    PAN_BILPREEQUVAR.SetFieldPage(PFL_BILPREEQUVAR_ETICHETTAF2, -1, -1);
    PAN_BILPREEQUVAR.SetFieldPanel(PFL_BILPREEQUVAR_ETICHETTAF2, -1, "", "ETICHETTAF2", 0, 0, 0, -13997);
  }

  private void PAN_BILPREEQUVAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_BILPREEQUVAR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BILPREEQUVAR.SetIMDB(IMDB, "PQRY_BILPREEQUVAR", true);
    PAN_BILPREEQUVAR.set_SetString(MyGlb.MASTER_ROWNAME, "BIL PREV EQUILIBRI VAR");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.IMPORTO_AA1 as IMPORTO_AA1, ");
    SQL.append("  A.IMPORTO_AA2 as IMPORTO_AA2, ");
    SQL.append("  A.IMPORTO_AA3 as IMPORTO_AA3, ");
    SQL.append("  A.IMPORTO_B1 as IMPORTO_B1, ");
    SQL.append("  A.IMPORTO_B2 as IMPORTO_B2, ");
    SQL.append("  A.IMPORTO_B3 as IMPORTO_B3, ");
    SQL.append("  A.IMPORTO_F1 as IMPORTO_F1, ");
    SQL.append("  A.IMPORTO_F2 as IMPORTO_F2, ");
    SQL.append("  A.IMPORTO_F3 as IMPORTO_F3, ");
    SQL.append("  A.IMPORTO_H1 as IMPORTO_H1, ");
    SQL.append("  A.IMPORTO_H2 as IMPORTO_H2, ");
    SQL.append("  A.IMPORTO_H3 as IMPORTO_H3, ");
    SQL.append("  A.IMPORTO_I1 as IMPORTO_I1, ");
    SQL.append("  A.IMPORTO_I2 as IMPORTO_I2, ");
    SQL.append("  A.IMPORTO_I3 as IMPORTO_I3, ");
    SQL.append("  A.IMPORTO_I21 as IMPORTO_I21, ");
    SQL.append("  A.IMPORTO_I22 as IMPORTO_I22, ");
    SQL.append("  A.IMPORTO_I23 as IMPORTO_I23, ");
    SQL.append("  A.IMPORTO_L1 as IMPORTO_L1, ");
    SQL.append("  A.IMPORTO_L2 as IMPORTO_L2, ");
    SQL.append("  A.IMPORTO_L3 as IMPORTO_L3, ");
    SQL.append("  A.IMPORTO_M1 as IMPORTO_M1, ");
    SQL.append("  A.IMPORTO_M2 as IMPORTO_M2, ");
    SQL.append("  A.IMPORTO_M3 as IMPORTO_M3, ");
    SQL.append("  A.IMPORTO_G1 as IMPORTO_G1, ");
    SQL.append("  A.IMPORTO_G2 as IMPORTO_G2, ");
    SQL.append("  A.IMPORTO_G3 as IMPORTO_G3, ");
    SQL.append("  A.IMPORTO_P1 as IMPORTO_P1, ");
    SQL.append("  A.IMPORTO_P2 as IMPORTO_P2, ");
    SQL.append("  A.IMPORTO_P3 as IMPORTO_P3, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA_1 as FONDO_ANTIC_LIQUIDITA_1, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA_2 as FONDO_ANTIC_LIQUIDITA_2, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA_3 as FONDO_ANTIC_LIQUIDITA_3 ");
    PAN_BILPREEQUVAR.SetQuery(PPQRY_BILPREEQUVAR, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_PREV_EQUILIBRI_VAR A ");
    PAN_BILPREEQUVAR.SetQuery(PPQRY_BILPREEQUVAR, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    PAN_BILPREEQUVAR.SetQuery(PPQRY_BILPREEQUVAR, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILPREEQUVAR.SetQuery(PPQRY_BILPREEQUVAR, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILPREEQUVAR.SetQuery(PPQRY_BILPREEQUVAR, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILPREEQUVAR.SetQuery(PPQRY_BILPREEQUVAR, 5, SQL, -1, "");
    PAN_BILPREEQUVAR.SetQueryDB(PPQRY_BILPREEQUVAR, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BILPREEQUVAR.SetMasterTable(0, "BIL_PREV_EQUILIBRI_VAR");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BILPREEQUVAR.Status() == 2)
    {
      int oldListQBE = PAN_BILPREEQUVAR.iUseListQBE;
      PAN_BILPREEQUVAR.iUseListQBE = 0;
      PAN_BILPREEQUVAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_BILPREEQUVAR.PanelCommand(Glb.PCM_FIND);
      PAN_BILPREEQUVAR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_BILPREEQUVAR) PAN_BILPREEQUVAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_BILPREEQUVAR) PAN_BILPREEQUVAR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_BILPREEQUVAR) PAN_BILPREEQUVAR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_BILPREEQUVAR) PAN_BILPREEQUVAR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_BILPREEQUVAR) PAN_BILPREEQUVAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
