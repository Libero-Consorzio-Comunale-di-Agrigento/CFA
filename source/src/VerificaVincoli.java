// **********************************************
// Verifica Vincoli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VerificaVincoli extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_VARIAZIONI = 0;
  private static int GRP_PARAMETRI_PROVVEDIMENT = 1;

  private static int PFL_PARAMETRI_VARIAZIONI = 0;
  private static int PFL_PARAMETRI_DATAELABORAZ = 1;
  private static int PFL_PARAMETRI_DELIBERA = 2;
  private static int PFL_PARAMETRI_NUMERODELIBE = 3;
  private static int PFL_PARAMETRI_ANNODELIBERA = 4;
  private static int PFL_PARAMETRI_PROPOSTA = 5;
  private static int PFL_PARAMETRI_NUMEROPROPOS = 6;
  private static int PFL_PARAMETRI_ANNOPROPOSTA = 7;
  private static int PFL_PARAMETRI_TRATTIDELIBE = 8;
  private static int PFL_PARAMETRI_BARRADELIBER = 9;
  private static int PFL_PARAMETRI_APRISCELDELI = 10;
  private static int PFL_PARAMETRI_APRIINFODELI = 11;
  private static int PFL_PARAMETRI_TRATTIPROPOS = 12;
  private static int PFL_PARAMETRI_BARRAPROPOST = 13;
  private static int PFL_PARAMETRI_APRISCELPROP = 14;

  private static int PPQRY_PARAMETRI567 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_VERIFIVINCOL_ESERCIZIO = 0;
  private static int PFL_VERIFIVINCOL_ETICHECOMPET = 1;
  private static int PFL_VERIFIVINCOL_ETICHECOMPE1 = 2;
  private static int PFL_VERIFIVINCOL_ETICHECOMPE2 = 3;
  private static int PFL_VERIFIVINCOL_ETICHEIMPORB = 4;
  private static int PFL_VERIFIVINCOL_IMPORTOB = 5;
  private static int PFL_VERIFIVINCOL_ETICHIMPORD2 = 6;
  private static int PFL_VERIFIVINCOL_IMPORTOD2 = 7;
  private static int PFL_VERIFIVINCOL_ETICHIMPORI3 = 8;
  private static int PFL_VERIFIVINCOL_IMPORTOI3 = 9;
  private static int PFL_VERIFIVINCOL_IMPORTOI31 = 10;
  private static int PFL_VERIFIVINCOL_IMPORTOI32 = 11;
  private static int PFL_VERIFIVINCOL_ETICHIMPORI4 = 12;
  private static int PFL_VERIFIVINCOL_IMPORTOI4 = 13;
  private static int PFL_VERIFIVINCOL_IMPORTOI41 = 14;
  private static int PFL_VERIFIVINCOL_IMPORTOI42 = 15;
  private static int PFL_VERIFIVINCOL_ETICHIMPORI5 = 16;
  private static int PFL_VERIFIVINCOL_IMPORTOI5 = 17;
  private static int PFL_VERIFIVINCOL_IMPORTOI51 = 18;
  private static int PFL_VERIFIVINCOL_IMPORTOI52 = 19;
  private static int PFL_VERIFIVINCOL_ETICHIMPORI6 = 20;
  private static int PFL_VERIFIVINCOL_IMPORTOI6 = 21;
  private static int PFL_VERIFIVINCOL_ETICHIMPORI7 = 22;
  private static int PFL_VERIFIVINCOL_IMPORTOI7 = 23;
  private static int PFL_VERIFIVINCOL_ETICHIMPORL2 = 24;
  private static int PFL_VERIFIVINCOL_IMPORTOL2 = 25;
  private static int PFL_VERIFIVINCOL_ETICHIMPORL3 = 26;
  private static int PFL_VERIFIVINCOL_IMPORTOL3 = 27;
  private static int PFL_VERIFIVINCOL_IMPORTOL31 = 28;
  private static int PFL_VERIFIVINCOL_IMPORTOL32 = 29;
  private static int PFL_VERIFIVINCOL_ETICHIMPORL4 = 30;
  private static int PFL_VERIFIVINCOL_IMPORTOL4 = 31;
  private static int PFL_VERIFIVINCOL_IMPORTOL41 = 32;
  private static int PFL_VERIFIVINCOL_IMPORTOL42 = 33;
  private static int PFL_VERIFIVINCOL_ETICHIMPORL5 = 34;
  private static int PFL_VERIFIVINCOL_IMPORTOL5 = 35;
  private static int PFL_VERIFIVINCOL_ETICHIMPORL6 = 36;
  private static int PFL_VERIFIVINCOL_IMPORTOL6 = 37;
  private static int PFL_VERIFIVINCOL_ETICHIMPORL7 = 38;
  private static int PFL_VERIFIVINCOL_IMPORTOL7 = 39;
  private static int PFL_VERIFIVINCOL_ETICHIMPOSF1 = 40;
  private static int PFL_VERIFIVINCOL_IMPORSFRIGA3 = 41;
  private static int PFL_VERIFIVINCOL_IMPORSFRIGA4 = 42;
  private static int PFL_VERIFIVINCOL_IMPORSFRIGA5 = 43;
  private static int PFL_VERIFIVINCOL_ETICHIMPOSF2 = 44;
  private static int PFL_VERIFIVINCOL_IMPORSFRIGA6 = 45;
  private static int PFL_VERIFIVINCOL_IMPORSFRIGA1 = 46;
  private static int PFL_VERIFIVINCOL_IMPORSFRIGA2 = 47;
  private static int PFL_VERIFIVINCOL_ETICHIMPOPR1 = 48;
  private static int PFL_VERIFIVINCOL_IMPOPREGRIG2 = 49;
  private static int PFL_VERIFIVINCOL_ETICHIMPOPR2 = 50;
  private static int PFL_VERIFIVINCOL_IMPOPREGRIGA = 51;
  private static int PFL_VERIFIVINCOL_IMPOPREGRIG1 = 52;
  private static int PFL_VERIFIVINCOL_ETICHIMPOPN1 = 53;
  private static int PFL_VERIFIVINCOL_IMPOPNAZRIG2 = 54;
  private static int PFL_VERIFIVINCOL_ETICHIMPOPN2 = 55;
  private static int PFL_VERIFIVINCOL_IMPOPNAZRIGA = 56;
  private static int PFL_VERIFIVINCOL_IMPOPNAZRIG1 = 57;
  private static int PFL_VERIFIVINCOL_ETICHEELABOR = 58;
  private static int PFL_VERIFIVINCOL_TIPOSTAMPA = 59;

  private static int PPQRY_BILPREVERVIN = 0;


  IDPanel PAN_VERIFIVINCOL;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI568(IMDB);
    //
    //
    Init_PQRY_PARAMETRI567(IMDB);
    Init_PQRY_PARAMETRI567_RS(IMDB);
    Init_PQRY_BILPREVERVIN(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI568(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI568, 10);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI568, "TBL_PARAMETRI568");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMTIPSTA,5,50,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_ROWNAMDATELA,6,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_RONASTNUDIPA, "RONASTNUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI568,IMDBDef3.FLD_PARAMETRI568_RONASTNUDIPA,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI568, 0);
  }

  private static void Init_PQRY_PARAMETRI567(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI567, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI567, "PQRY_PARAMETRI567");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567,IMDBDef11.PQSL_PARAMETRI567_ROWNAMDATELA,6,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI567, 0);
  }

  private static void Init_PQRY_PARAMETRI567_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI567_RS, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI567_RS, "PQRY_PARAMETRI567_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI567_RS,IMDBDef11.PQSL_PARAMETRI567_ROWNAMDATELA,6,10,0);
  }

  private static void Init_PQRY_BILPREVERVIN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILPREVERVIN, 37);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILPREVERVIN, "PQRY_BILPREVERVIN");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_TIPO_STAMPA,5,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_B, "IMPORTO_B");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_B,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_D2, "IMPORTO_D2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_D2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I3, "IMPORTO_I3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I3_1, "IMPORTO_I3_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I3_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I3_2, "IMPORTO_I3_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I3_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I4, "IMPORTO_I4");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I4,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I4_1, "IMPORTO_I4_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I4_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I4_2, "IMPORTO_I4_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I4_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I5, "IMPORTO_I5");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I5,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I5_1, "IMPORTO_I5_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I5_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I5_2, "IMPORTO_I5_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I5_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I6, "IMPORTO_I6");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I6,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I7, "IMPORTO_I7");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_I7,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L2, "IMPORTO_L2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L3, "IMPORTO_L3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L3_1, "IMPORTO_L3_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L3_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L3_2, "IMPORTO_L3_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L3_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L4, "IMPORTO_L4");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L4,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L4_1, "IMPORTO_L4_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L4_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L4_2, "IMPORTO_L4_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L4_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L5, "IMPORTO_L5");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L5,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L6, "IMPORTO_L6");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L6,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L7, "IMPORTO_L7");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_L7,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_SF_RIGA1, "IMPORTO_SF_RIGA1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_SF_RIGA1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_SF_RIGA1_1, "IMPORTO_SF_RIGA1_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_SF_RIGA1_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_SF_RIGA1_2, "IMPORTO_SF_RIGA1_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_SF_RIGA1_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_SF_RIGA2, "IMPORTO_SF_RIGA2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_SF_RIGA2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_SF_RIGA2_1, "IMPORTO_SF_RIGA2_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_SF_RIGA2_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_SF_RIGA2_2, "IMPORTO_SF_RIGA2_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_SF_RIGA2_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_PREG_RIGA1, "IMPORTO_PREG_RIGA1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_PREG_RIGA1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_PREG_RIGA2, "IMPORTO_PREG_RIGA2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_PREG_RIGA2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_PREG_RIGA2_1, "IMPORTO_PREG_RIGA2_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_PREG_RIGA2_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_PNAZ_RIGA1, "IMPORTO_PNAZ_RIGA1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_PNAZ_RIGA1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_PNAZ_RIGA2, "IMPORTO_PNAZ_RIGA2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_PNAZ_RIGA2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_PNAZ_RIGA2_1, "IMPORTO_PNAZ_RIGA2_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVERVIN,IMDBDef11.PQSL_BILPREVERVIN_IMPORTO_PNAZ_RIGA2_1,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILPREVERVIN, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VerificaVincoli(MyWebEntryPoint w, IMDBObj imdb)
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
  public VerificaVincoli()
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
    FormIdx = MyGlb.FRM_VERIFIVINCOL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0D61B016-8925-4CBD-8148-FB8DCDEB313F";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1008;
    DesignHeight = 826;
    set_Caption(new IDVariant("Verifica Vincoli"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1008;
    Frames[1].Height = 800;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.085;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1008;
    Frames[2].Height = 68;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 1008;
    Frames[2].FixedHeight = 68;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1008-MyGlb.PAN_OFFS_X, 68-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3808ED8A-58DC-48D2-9C14-A1DFE23CA0A4");
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
    Frames[3].Width = 1008;
    Frames[3].Height = 732;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Verifica Vincoli";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 732;
    PAN_VERIFIVINCOL = new IDPanel(w, this, 3, "PAN_VERIFIVINCOL");
    Frames[3].Content = PAN_VERIFIVINCOL;
    PAN_VERIFIVINCOL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VERIFIVINCOL.VS = MainFrm.VisualStyleList;
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1008-MyGlb.PAN_OFFS_X, 732-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1DA9D33F-AEDD-4F11-8695-9C132335469C");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3344, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VERIFIVINCOL.InitStatus = 2;
    PAN_VERIFIVINCOL_Init();
    PAN_VERIFIVINCOL_InitFields();
    PAN_VERIFIVINCOL_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI568, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VERIFIVINCOL_PARAMETRI567();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_VERIFIVINCOL.UpdatePanel(MainFrm);
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
    return (obj instanceof VerificaVincoli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VerificaVincoli.class.getName() : (Glb.ClassWithPackage(VerificaVincoli.class) ? VerificaVincoli.class.getName().substring(VerificaVincoli.class.getPackage().getName().length() + 1) : VerificaVincoli.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
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
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNDEL, 0))))
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
      MainFrm.ErrObj.ProcError ("VerificaVincoli", "ParametriOnDynamicProperties", _e);
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
      if (Column.equals((new IDVariant(PFL_PARAMETRI_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMUNIPRO, 0)));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_DELIBERA)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMERODELIBE)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNODELIBERA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNDEL, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMUNIPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNPRO, 0, (new IDVariant()));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_PROPOSTA)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNOPROPOSTA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNPRO, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNDEL, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_VARIAZIONI)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNDEL, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaVincoli", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Verifica Vincoli On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_VERIFIVINCOL_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Verifica Vincoli On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILPREVERVIN, IMDBDef11.PQSL_BILPREVERVIN_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVERVIN, IMDBDef11.PQSL_BILPREVERVIN_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVERVIN, IMDBDef11.PQSL_BILPREVERVIN_TIPO_STAMPA, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMTIPSTA, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaVincoli", "VerificaVincoliOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Verifica Vincoli After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_VERIFIVINCOL_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Verifica Vincoli After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_VERIFIVINCOL.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_VERIFIVINCOL.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaVincoli", "VerificaVincoliAfterFind", _e);
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
      if (new IDVariant(PAN_VERIFIVINCOL.Status()).equals((new IDVariant(3)), true))
      {
        PAN_VERIFIVINCOL.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_VERIFIVINCOL.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.WORKBILPREVVERVINCFP(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNDEL, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMUNIPRO, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMEVARIA, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMDATELA, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
          v_PAR1 = (new IDVariant("SESSIONE"));
          IDVariant v_PAR2 = new IDVariant(0,IDVariant.STRING);
          v_PAR2 = (new IDVariant("ESERCIZIO"));
          IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
          v_NOMESTAMPA = (new IDVariant("Verifica_Vincoli_FP"));
          MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(MainFrm.PROGRESESSIO));
          MainFrm.SetParametroStampaJasper(v_PAR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_RONASTNUDIPA, 0));
          MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaVincoli", "EtichettaElabora", _e);
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
      set_Caption(IDL.Add(this.Caption(), MainFrm.ESERCIZIO));
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_VERIFIVINCOL.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_VERIFIVINCOL.set_FieldText(PFL_VERIFIVINCOL_ETICHECOMPET, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_VERIFIVINCOL.set_FieldText(PFL_VERIFIVINCOL_ETICHECOMPE1, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_VERIFIVINCOL.set_FieldText(PFL_VERIFIVINCOL_ETICHECOMPE2, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
      if (!(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMEVARIA, 0))))
      {
        PAN_PARAMETRI.set_Visible((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_PARAMETRI.set_Visible((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaVincoli", "Load", _e);
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
      if (new IDVariant(PAN_VERIFIVINCOL.Status()).equals((new IDVariant(3)), true))
      {
        PAN_VERIFIVINCOL.PanelCommand(Glb.PCM_CANCEL);
      }
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaVincoli", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMTIPSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMDATELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_RONASTNUDIPA, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaVincoli", "EndModal", _e);
    }
  }

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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMSEDDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef11.PQRY_PARAMETRI567, IMDBDef11.PQSL_PARAMETRI567_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaVincoli", "ApriInfoDelibera", _e);
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
      MainFrm.ErrObj.ProcError ("VerificaVincoli", "ApriDelibera", _e);
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
      MainFrm.ErrObj.ProcError ("VerificaVincoli", "ApriProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void VERIFIVINCOL_PARAMETRI567() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETRI567_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI568, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI568, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI567_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETRI567_RS, 0, IMDBDef3.TBL_PARAMETRI568, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI567_RS, 0, 0, IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI567_RS, 1, 0, IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI567_RS, 2, 0, IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI567_RS, 3, 0, IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI567_RS, 4, 0, IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI567_RS, 5, 0, IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI567_RS, 6, 0, IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI567_RS, 7, 0, IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMDATELA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI568, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI568, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI568, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETRI567_RS, 0);
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
  private void PAN_VERIFIVINCOL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VERIFIVINCOL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VERIFIVINCOL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VERIFIVINCOL, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VERIFIVINCOL_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VERIFIVINCOL);
    // Stub
  }

  private void PAN_VERIFIVINCOL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VERIFIVINCOL_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_VERIFIVINCOL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VERIFIVINCOL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VERIFIVINCOL_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VERIFIVINCOL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VERIFIVINCOL_IntValidateRow(Cancel);
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
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, "F227E771-E54B-465C-A22C-0E628D6D3AEE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, "Variazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 264, -9999, 80, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 16, 7, 156, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 0, 55);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "6879C232-8AD6-4C91-959A-9FCF04D42CFE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "Provvedimento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_LIST, 544, -9999, 272, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_FORM, 392, 7, 584, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 87);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "A3F34B68-7003-4CF9-843F-1E441ACB6A5D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "Variazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "711B7D2D-9422-41F6-82AE-387E5263D361");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "8A0C8EB5-B7DD-4A9C-9F80-8978890029E0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "68ED913B-555A-4732-8D19-904D678DAADB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "Numero Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "EFFFFD29-33DE-4C47-94FF-F1367A299686");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "Anno Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "63A8D042-0A5C-44D4-9EAF-A7715D952E6C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "524D5394-D7E3-4DA0-8DB0-6D232F4F42AA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "Numero Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "FDE03A09-59FE-43C1-A09C-D8E5023BEEC8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "Anno Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, "96B80634-2AE8-43D9-A732-6D9D2DD45B59");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, "1206237F-739E-446E-9676-40A72165A6B0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, "CFB7DFA2-617A-46E4-AEB1-9017CEB85C02");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, "D7A24FF3-C218-4560-9258-D090AC613F3F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, "8F709690-47D5-4DEE-AF62-E1F25B4BC053");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, "CBBDBA3E-956E-46D2-9C3A-4BF9AEDF10D2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, "A4077D28-8F7D-40F4-8F9A-45F03B8C34FC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 20, 32, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARIAZIONI, -1, GRP_PARAMETRI_VARIAZIONI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARIAZIONI, PPQRY_PARAMETRI567, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 180, 32, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMETRI567, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 396, 32, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERA, PPQRY_PARAMETRI567, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, "N. Dl.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 516, 32, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODELIBE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODELIBE, PPQRY_PARAMETRI567, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 624, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, "A. Dl.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 576, 32, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODELIBERA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODELIBERA, PPQRY_PARAMETRI567, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 660, 32, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROPOSTA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROPOSTA, PPQRY_PARAMETRI567, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. Pr.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 856, 32, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROPOS, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROPOS, PPQRY_PARAMETRI567, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. Pr.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 916, 32, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROPOSTA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROPOSTA, PPQRY_PARAMETRI567, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_FORM, 496, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTIDELIBE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_LIST, 164, 272, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_FORM, 556, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRADELIBER, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_LIST, 508, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_FORM, 616, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRISCELDELI, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRISCELDELI, -1, "", "APRISCELDELI", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_LIST, 516, 264, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_FORM, 636, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRIINFODELI, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRIINFODELI, -1, "", "APRIINFODELI", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 180, 288, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 836, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTIPROPOS, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 896, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRAPROPOST, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_LIST, 500, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_FORM, 956, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRISCELPROP, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRISCELPROP, -1, "", "APRISCELPROP", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI567", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI567, IMDBDef11.PQRY_PARAMETRI567_RS, IMDBDef3.TBL_PARAMETRI568);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_VARIAZIONI, IMDBDef3.FLD_PARAMETRI568_ROWNAMEVARIA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef3.FLD_PARAMETRI568_ROWNAMDATELA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DELIBERA, IMDBDef3.FLD_PARAMETRI568_ROWNAMSEDDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODELIBE, IMDBDef3.FLD_PARAMETRI568_ROWNAMNUMDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODELIBERA, IMDBDef3.FLD_PARAMETRI568_ROWNAMANNDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PROPOSTA, IMDBDef3.FLD_PARAMETRI568_ROWNAMUNIPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROPOS, IMDBDef3.FLD_PARAMETRI568_ROWNAMNUMPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROPOSTA, IMDBDef3.FLD_PARAMETRI568_ROWNAMANNPRO);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI568");
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

  private void PAN_VERIFIVINCOL_Init()
  {

    PAN_VERIFIVINCOL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VERIFIVINCOL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VERIFIVINCOL.SetSize(MyGlb.OBJ_FIELD, 60);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, "03D340B1-D66E-4A53-A465-DB2081E869EB");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, "ESERCIZIO");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPET, "2021083B-8A26-4FF1-9D7E-A64943B1E758");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPET, "Competenza Anno di Riferimento del Bilancio ");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPET, MyGlb.VIS_VUOTOGRASSET);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE1, "64281B1B-6ACD-49FE-897C-C0234A211501");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE1, "Competenza");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE1, MyGlb.VIS_VUOTOGRASSET);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE2, "B78E6504-CFCC-4E13-B525-A82CA135CD1C");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE2, "Competenza");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE2, MyGlb.VIS_VUOTOGRASSET);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEIMPORB, "9DEC24B1-F0E9-4952-B9B7-C32947DFF18A");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEIMPORB, "B) Quota del FPV entrata in conto capitale finanziata da debito");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEIMPORB, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEIMPORB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, "26C6129A-D78F-4816-ACFE-004D5BF8F9E7");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, "IMPORTO B");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, MyGlb.VIS_NOFICFIMHELE);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORD2, "6A6B0E95-05C9-41B9-8EE2-CE2A1D59F883");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORD2, "D2) Contributo di cui all'art. 1, comma 20, legge di stabilità 2016 (solo per i comuni)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORD2, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORD2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, "49BF5E67-4B96-400D-BBB3-D808CB76AB8F");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, "IMPORTO D2");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, MyGlb.VIS_NOFICFIMHELE);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI3, "57415E15-16E8-4A5E-A7E5-B7796903DC3A");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI3, "I3) Quota di FCDDE corrente finanziata dall'avanzo (iscritto in variazione a seguito dell'approvazione del rendiconto) da sottrarre al Fondo Crediti di dubbia esigibilità di parte corrente");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI3, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, "69A39700-F217-4713-9BEA-AF8233F8943C");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, "IMPORTO I3");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, MyGlb.VIS_NOFICFIMHELE);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, "40A84F7E-ABA9-4903-A175-57735BC54C51");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, "IMPORTO I3 1");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, MyGlb.VIS_NOFICFIMHELE);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, "81548EFA-DF29-46CD-9770-39E72C9BA74D");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, "IMPORTO I3 2");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, MyGlb.VIS_NOFICFIMHELE);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI4, "B710320F-A106-44DD-8788-BB84AD82C55F");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI4, "I4) Fondo contenzioso (destinato a confluire nel risultato di amministrazione)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI4, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, "7802DA22-27C3-47A6-9646-1707DB38C052");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, "IMPORTO I4");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, MyGlb.VIS_NOFICFIMHELE);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, "14899646-93AD-42F4-BB60-9529C4B41B4B");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, "IMPORTO I4 1");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, MyGlb.VIS_NOFICFIMHELE);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, "4AFA7DC4-69EF-45CB-BB76-691C367F6DC3");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, "IMPORTO I4 2");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, MyGlb.VIS_NOFICFIMHELE);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI5, "03CD1B7F-224B-47D9-A04D-0657F9F5B691");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI5, "I5) Altri accantonamenti (destinati a confluire nel risultato di amministrazione)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI5, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, "E4D67898-9F79-497D-AE26-A5C79E1B5E00");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, "IMPORTO I5");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, "036EB42C-F41E-4138-9869-105C58DB8B35");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, "IMPORTO I5 1");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, "E3B7B46B-5C9B-449A-955B-6964FADDD6FD");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, "IMPORTO I5 2");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI6, "1FB721F4-BC98-4A10-B9F6-5A5ECB650F1A");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI6, "I6) Spese correnti per interventi di bonifica ambientale  di cui all'art. 1, comma 716, Legge di stabilità 2016 (solo per gli enti locali)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI6, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI6, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, "9CAC1518-2F46-4DB1-8392-72D2CDF334AB");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, "IMPORTO I6");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI7, "AE73D7BA-0BFF-44D9-9EE7-9503787B407C");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI7, "I7) Spese correnti per sisma maggio 2012,  finanziate secondo le modalità  di cui all'art. 1, comma 441, Legge di stabilità 2016 (solo per gli enti locali dell'Emilia Romagna, Lombardia e Veneto)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI7, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI7, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, "ECC9F0C9-DDAB-49FD-820D-FE1CDB26BC67");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, "IMPORTO I7");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL2, "D540B214-823D-4D1B-BC31-60D9D06EF8B7");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL2, "L2) Quote del FPV capitale finanziate da debito ");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL2, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, "28EEEA4C-32E9-460F-B1F3-81A6F5734601");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, "IMPORTO L2");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL3, "AD7211DD-C17F-4775-A6D9-483DCC833C37");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL3, "L3) Quota di FCDDE capitale finanziata dall'avanzo (iscritto in variazione a seguito dell'approvazione del rendiconto) da sottrarre al Fondo Crediti di dubbia esigibilità in c/capitale");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL3, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, "0666B572-CCF8-4EE3-BF7F-3A26B43777FD");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, "IMPORTO L3");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, "AD947585-8B2C-47D2-8CAA-C3513953B553");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, "IMPORTO L3 1");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, "80659540-E8DF-4C7A-8185-4A2B4057B7B1");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, "IMPORTO L3 2");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL4, "513295CF-5F2D-45AE-A497-034982A645DF");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL4, "L4) Altri accantonamenti (destinati a confluire nel risultato di amministrazione)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL4, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, "B80AB6E8-52F3-4E69-BE8A-74183949D7CD");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, "IMPORTO L4");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, "F637EE50-FB48-4513-B8A4-4CA225479322");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, "IMPORTO L4 1");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, "D507E16A-4111-450A-8DFA-33D6D2C7BA82");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, "IMPORTO L4 2");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL5, "EEE6FEEF-A8BF-493B-9BCA-253A7219411A");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL5, "L5) Spese per edilizia scolastica di cui all'art. 1, comma 713, Legge di stabilità 2016 (solo per gli enti locali)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL5, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, "F6732F5E-FD78-40A8-B617-0DF9E7DCFE9B");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, "IMPORTO L5");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL6, "DA059983-E78D-43EA-A0CE-779E13860F80");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL6, "L6) Spese in c/capitale per interventi di bonifica ambientale  di cui all'art. 1, comma 716, Legge di stabilità 2016 (solo per gli enti locali)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL6, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL6, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, "86A05DC1-7703-44DF-A5B7-88B75DE958A0");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, "IMPORTO L6");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL7, "8EBFB4FA-0177-4820-BB27-1E08864CED86");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL7, "L7) Spese in c/capitale per sisma maggio 2012,  finanziate secondo le modalità  di cui all'art. 1, comma 441, Legge di stabilità 2016 (solo per gli enti locali dell'Emilia Romagna, Lombardia e Veneto)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL7, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL7, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, "89DD736A-A6D3-4D67-8B8B-D7408771FE3E");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, "IMPORTO L7");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF1, "1F4356DC-7E7F-4E68-B302-337453168CFB");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF1, "Spazi finanziari ceduti o acquisiti  ex art. 1, comma 728, Legge di stabilità 2016  (patto regionale)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF1, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, "C840EDA1-C6C6-4800-9F9E-A234A64AED06");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, "IMPORTO SF RIGA1");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, "2868E64D-6506-4E4D-8235-ED5FBF3B8E5F");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, "IMPORTO SF RIGA1 1");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, "E42C6435-1A77-4575-8799-4DDBD67D50DE");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, "IMPORTO SF RIGA1 2");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF2, "0B28CC84-41F9-4C78-9554-EE1DEF3EFCB3");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF2, "Spazi finanziari ceduti o acquisiti ex art. 1, comma 732, Legge di stabilità 2016 (patto nazionale orizzontale)(solo per gli enti locali)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF2, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, "5F439ED3-E32D-4B59-9C3E-F31B0F1E9505");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, "IMPORTO SF RIGA2");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, "B6A98CD7-D36E-4FE4-A00A-B1519FE48295");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, "IMPORTO SF RIGA2 1");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, "9C2D9EC0-485F-4577-A9C4-DBCDCE979CA7");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, "IMPORTO SF RIGA2 2");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR1, "1028E176-492A-403F-9F76-41EF4D8BBEBB");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR1, "Patto regionale orizzontale ai sensi del comma 141 dell'articolo 1 della legge n. 220/2010 anno 2014 (solo per gli enti locali)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR1, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, "ABA5F4E3-05C2-4A19-9458-1EADB3E12DE3");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, "IMPORTO PREG RIGA1");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR2, "FC344FEB-B97F-4F47-A966-80B62FAB0742");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR2, "Patto regionale orizzontale ai sensi del comma 480 e segg. dell'articolo 1 della legge n. 190/2014  anno 2015 (solo per gli enti locali)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR2, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, "88002698-8086-4DDE-BDD9-C9A5E200B17C");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, "IMPORTO PREG RIGA2");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, "8E7A68DB-2D9D-4447-867D-486F0E26F9F9");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, "IMPORTO PREG RIGA2 1");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN1, "ACA65C25-1416-423E-939D-7A1D73115AD6");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN1, "Patto nazionale orizzontale ai sensi dei commi 1-7 dell'art. 4-ter del decreto legge n. 16/2012 anno 2014 (solo per gli enti locali)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN1, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, "04991796-3516-47B6-8D08-5EBF99238CD5");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, "IMPORTO PNAZ RIGA1");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN2, "4FC9BB3C-D409-4331-AC21-7F61C2EA31CD");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN2, "Patto nazionale orizzontale ai sensi dei commi 1-7 dell'art. 4-ter del decreto legge n. 16/2012 anno 2015 (solo per gli enti locali)");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN2, MyGlb.VIS_VUOGRAALILEF);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, "261AFA79-ACBF-471B-B6D7-DFF1385A75DA");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, "IMPORTO PNAZ RIGA2");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, "2D4ED90A-FE61-4E4A-84A3-86B9168E2DB0");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, "IMPORTO PNAZ RIGA2 1");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, MyGlb.VIS_NORFIECF4IMP);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEELABOR, "05CE257D-0F37-4F86-9BCA-EEFD5C4B2427");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEELABOR, "Elabora");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_VERIFIVINCOL.SetImage(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEELABOR, 0, "button1.gif", false);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VERIFIVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, "4BB19362-C7CC-4B73-B325-163DBFAB1409");
    PAN_VERIFIVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, "TIPO STAMPA");
    PAN_VERIFIVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, "");
    PAN_VERIFIVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VERIFIVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_VERIFIVINCOL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, MyGlb.PANEL_FORM, 112);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ESERCIZIO, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ESERCIZIO, PPQRY_BILPREVERVIN, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPET, MyGlb.PANEL_LIST, 604, 12, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPET, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPET, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPET, MyGlb.PANEL_FORM, 608, 12, 124, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPET, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPET, MyGlb.PANEL_FORM, 3);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHECOMPET, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHECOMPET, -1, "", "ETICHECOMPET", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE1, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE1, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE1, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE1, MyGlb.PANEL_FORM, 740, 12, 124, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE1, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE1, MyGlb.PANEL_FORM, 3);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHECOMPE1, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHECOMPE1, -1, "", "ETICHECOMPE1", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE2, MyGlb.PANEL_LIST, 620, 28, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE2, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE2, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE2, MyGlb.PANEL_FORM, 872, 12, 124, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE2, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHECOMPE2, MyGlb.PANEL_FORM, 3);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHECOMPE2, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHECOMPE2, -1, "", "ETICHECOMPE2", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEIMPORB, MyGlb.PANEL_LIST, 620, 28, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEIMPORB, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEIMPORB, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEIMPORB, MyGlb.PANEL_FORM, 16, 60, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEIMPORB, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEIMPORB, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHEIMPORB, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHEIMPORB, -1, "", "ETICHEIMPORB", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, MyGlb.PANEL_LIST, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, MyGlb.PANEL_LIST, "IMP. B");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, MyGlb.PANEL_FORM, 608, 60, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, MyGlb.PANEL_FORM, 584);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOB, MyGlb.PANEL_FORM, "IMPORTO B");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOB, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOB, PPQRY_BILPREVERVIN, "A.IMPORTO_B", "IMPORTO_B", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORD2, MyGlb.PANEL_LIST, 628, 36, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORD2, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORD2, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORD2, MyGlb.PANEL_FORM, 16, 84, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORD2, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORD2, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPORD2, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPORD2, -1, "", "ETICHIMPORD2", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, MyGlb.PANEL_LIST, 96);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, MyGlb.PANEL_LIST, "IMP. D2");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, MyGlb.PANEL_FORM, 608, 84, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, MyGlb.PANEL_FORM, 584);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOD2, MyGlb.PANEL_FORM, "IMPORTO D2");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOD2, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOD2, PPQRY_BILPREVERVIN, "A.IMPORTO_D2", "IMPORTO_D2", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI3, MyGlb.PANEL_LIST, 636, 44, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI3, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI3, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI3, MyGlb.PANEL_FORM, 16, 108, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI3, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI3, MyGlb.PANEL_FORM, 2);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPORI3, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPORI3, -1, "", "ETICHIMPORI3", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, MyGlb.PANEL_LIST, 96);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, MyGlb.PANEL_LIST, "IMP. I3");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, MyGlb.PANEL_FORM, 608, 108, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, MyGlb.PANEL_FORM, 584);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI3, MyGlb.PANEL_FORM, "IMPORTO I3");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOI3, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOI3, PPQRY_BILPREVERVIN, "A.IMPORTO_I3", "IMPORTO_I3", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, MyGlb.PANEL_LIST, 104);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, MyGlb.PANEL_LIST, "IMPORTO I3 1");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, MyGlb.PANEL_FORM, 740, 108, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, MyGlb.PANEL_FORM, 104);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI31, MyGlb.PANEL_FORM, "IMPORTO I3 1");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOI31, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOI31, PPQRY_BILPREVERVIN, "A.IMPORTO_I3_1", "IMPORTO_I3_1", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, MyGlb.PANEL_LIST, 104);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, MyGlb.PANEL_LIST, "IMPORTO I3 2");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, MyGlb.PANEL_FORM, 872, 108, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, MyGlb.PANEL_FORM, 104);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI32, MyGlb.PANEL_FORM, "IMPORTO I3 2");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOI32, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOI32, PPQRY_BILPREVERVIN, "A.IMPORTO_I3_2", "IMPORTO_I3_2", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI4, MyGlb.PANEL_LIST, 636, 44, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI4, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI4, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI4, MyGlb.PANEL_FORM, 16, 144, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI4, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI4, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPORI4, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPORI4, -1, "", "ETICHIMPORI4", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, MyGlb.PANEL_LIST, 72);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, MyGlb.PANEL_LIST, "IMP. I4");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, MyGlb.PANEL_FORM, 608, 144, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, MyGlb.PANEL_FORM, 584);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI4, MyGlb.PANEL_FORM, "IMPORTO I4");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOI4, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOI4, PPQRY_BILPREVERVIN, "A.IMPORTO_I4", "IMPORTO_I4", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, MyGlb.PANEL_LIST, 84);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, MyGlb.PANEL_LIST, "IMPORTO I4 1");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, MyGlb.PANEL_FORM, 740, 144, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, MyGlb.PANEL_FORM, 84);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI41, MyGlb.PANEL_FORM, "IMPORTO I4 1");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOI41, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOI41, PPQRY_BILPREVERVIN, "A.IMPORTO_I4_1", "IMPORTO_I4_1", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, MyGlb.PANEL_LIST, 84);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, MyGlb.PANEL_LIST, "IMPORTO I4 2");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, MyGlb.PANEL_FORM, 872, 144, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, MyGlb.PANEL_FORM, 84);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI42, MyGlb.PANEL_FORM, "IMPORTO I4 2");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOI42, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOI42, PPQRY_BILPREVERVIN, "A.IMPORTO_I4_2", "IMPORTO_I4_2", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI5, MyGlb.PANEL_LIST, 644, 52, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI5, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI5, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI5, MyGlb.PANEL_FORM, 16, 168, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI5, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI5, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPORI5, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPORI5, -1, "", "ETICHIMPORI5", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, MyGlb.PANEL_LIST, 76);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, MyGlb.PANEL_LIST, "IMPORTO I5");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, MyGlb.PANEL_FORM, 608, 168, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, MyGlb.PANEL_FORM, 76);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI5, MyGlb.PANEL_FORM, "IMPORTO I5");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOI5, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOI5, PPQRY_BILPREVERVIN, "A.IMPORTO_I5", "IMPORTO_I5", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, MyGlb.PANEL_LIST, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, MyGlb.PANEL_LIST, "IMPORTO I5 1");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, MyGlb.PANEL_FORM, 740, 168, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, MyGlb.PANEL_FORM, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI51, MyGlb.PANEL_FORM, "IMPORTO I5 1");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOI51, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOI51, PPQRY_BILPREVERVIN, "A.IMPORTO_I5_1", "IMPORTO_I5_1", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, MyGlb.PANEL_LIST, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, MyGlb.PANEL_LIST, "IMPORTO I5 2");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, MyGlb.PANEL_FORM, 872, 168, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, MyGlb.PANEL_FORM, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI52, MyGlb.PANEL_FORM, "IMPORTO I5 2");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOI52, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOI52, PPQRY_BILPREVERVIN, "A.IMPORTO_I5_2", "IMPORTO_I5_2", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI6, MyGlb.PANEL_LIST, 652, 60, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI6, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI6, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI6, MyGlb.PANEL_FORM, 16, 192, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI6, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI6, MyGlb.PANEL_FORM, 2);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPORI6, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPORI6, -1, "", "ETICHIMPORI6", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, MyGlb.PANEL_LIST, 76);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, MyGlb.PANEL_LIST, "IMPORTO I6");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, MyGlb.PANEL_FORM, 608, 192, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, MyGlb.PANEL_FORM, 76);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI6, MyGlb.PANEL_FORM, "IMPORTO I6");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOI6, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOI6, PPQRY_BILPREVERVIN, "A.IMPORTO_I6", "IMPORTO_I6", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI7, MyGlb.PANEL_LIST, 660, 68, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI7, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI7, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI7, MyGlb.PANEL_FORM, 16, 228, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI7, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORI7, MyGlb.PANEL_FORM, 2);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPORI7, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPORI7, -1, "", "ETICHIMPORI7", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, MyGlb.PANEL_LIST, 76);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, MyGlb.PANEL_LIST, "IMPORTO I7");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, MyGlb.PANEL_FORM, 608, 228, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, MyGlb.PANEL_FORM, 76);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOI7, MyGlb.PANEL_FORM, "IMPORTO I7");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOI7, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOI7, PPQRY_BILPREVERVIN, "A.IMPORTO_I7", "IMPORTO_I7", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL2, MyGlb.PANEL_LIST, 652, 60, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL2, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL2, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL2, MyGlb.PANEL_FORM, 16, 264, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL2, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL2, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPORL2, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPORL2, -1, "", "ETICHIMPORL2", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, MyGlb.PANEL_LIST, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, MyGlb.PANEL_LIST, "IMPORTO L2");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, MyGlb.PANEL_FORM, 608, 260, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, MyGlb.PANEL_FORM, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL2, MyGlb.PANEL_FORM, "IMPORTO L2");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOL2, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOL2, PPQRY_BILPREVERVIN, "A.IMPORTO_L2", "IMPORTO_L2", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL3, MyGlb.PANEL_LIST, 660, 68, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL3, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL3, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL3, MyGlb.PANEL_FORM, 16, 288, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL3, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL3, MyGlb.PANEL_FORM, 2);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPORL3, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPORL3, -1, "", "ETICHIMPORL3", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, MyGlb.PANEL_LIST, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, MyGlb.PANEL_LIST, "IMPORTO L3");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, MyGlb.PANEL_FORM, 608, 288, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, MyGlb.PANEL_FORM, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL3, MyGlb.PANEL_FORM, "IMPORTO L3");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOL3, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOL3, PPQRY_BILPREVERVIN, "A.IMPORTO_L3", "IMPORTO_L3", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, MyGlb.PANEL_LIST, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, MyGlb.PANEL_LIST, "IMPORTO L3 1");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, MyGlb.PANEL_FORM, 740, 288, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, MyGlb.PANEL_FORM, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL31, MyGlb.PANEL_FORM, "IMPORTO L3 1");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOL31, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOL31, PPQRY_BILPREVERVIN, "A.IMPORTO_L3_1", "IMPORTO_L3_1", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, MyGlb.PANEL_LIST, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, MyGlb.PANEL_LIST, "IMPORTO L3 2");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, MyGlb.PANEL_FORM, 872, 288, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, MyGlb.PANEL_FORM, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL32, MyGlb.PANEL_FORM, "IMPORTO L3 2");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOL32, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOL32, PPQRY_BILPREVERVIN, "A.IMPORTO_L3_2", "IMPORTO_L3_2", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL4, MyGlb.PANEL_LIST, 660, 68, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL4, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL4, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL4, MyGlb.PANEL_FORM, 16, 324, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL4, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL4, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPORL4, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPORL4, -1, "", "ETICHIMPORL4", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, MyGlb.PANEL_LIST, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, MyGlb.PANEL_LIST, "IMPORTO L4");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, MyGlb.PANEL_FORM, 608, 324, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, MyGlb.PANEL_FORM, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL4, MyGlb.PANEL_FORM, "IMPORTO L4");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOL4, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOL4, PPQRY_BILPREVERVIN, "A.IMPORTO_L4", "IMPORTO_L4", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, MyGlb.PANEL_LIST, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, MyGlb.PANEL_LIST, "IMPORTO L4 1");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, MyGlb.PANEL_FORM, 740, 324, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, MyGlb.PANEL_FORM, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL41, MyGlb.PANEL_FORM, "IMPORTO L4 1");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOL41, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOL41, PPQRY_BILPREVERVIN, "A.IMPORTO_L4_1", "IMPORTO_L4_1", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, MyGlb.PANEL_LIST, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, MyGlb.PANEL_LIST, "IMPORTO L4 2");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, MyGlb.PANEL_FORM, 872, 324, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, MyGlb.PANEL_FORM, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL42, MyGlb.PANEL_FORM, "IMPORTO L4 2");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOL42, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOL42, PPQRY_BILPREVERVIN, "A.IMPORTO_L4_2", "IMPORTO_L4_2", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL5, MyGlb.PANEL_LIST, 668, 76, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL5, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL5, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL5, MyGlb.PANEL_FORM, 16, 348, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL5, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL5, MyGlb.PANEL_FORM, 2);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPORL5, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPORL5, -1, "", "ETICHIMPORL5", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, MyGlb.PANEL_LIST, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, MyGlb.PANEL_LIST, "IMPORTO L5");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, MyGlb.PANEL_FORM, 608, 348, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, MyGlb.PANEL_FORM, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL5, MyGlb.PANEL_FORM, "IMPORTO L5");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOL5, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOL5, PPQRY_BILPREVERVIN, "A.IMPORTO_L5", "IMPORTO_L5", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL6, MyGlb.PANEL_LIST, 676, 84, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL6, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL6, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL6, MyGlb.PANEL_FORM, 16, 384, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL6, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL6, MyGlb.PANEL_FORM, 2);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPORL6, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPORL6, -1, "", "ETICHIMPORL6", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, MyGlb.PANEL_LIST, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, MyGlb.PANEL_LIST, "IMPORTO L6");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, MyGlb.PANEL_FORM, 608, 384, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, MyGlb.PANEL_FORM, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL6, MyGlb.PANEL_FORM, "IMPORTO L6");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOL6, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOL6, PPQRY_BILPREVERVIN, "A.IMPORTO_L6", "IMPORTO_L6", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL7, MyGlb.PANEL_LIST, 684, 92, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL7, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL7, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL7, MyGlb.PANEL_FORM, 16, 420, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL7, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPORL7, MyGlb.PANEL_FORM, 2);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPORL7, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPORL7, -1, "", "ETICHIMPORL7", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, MyGlb.PANEL_LIST, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, MyGlb.PANEL_LIST, "IMPORTO L7");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, MyGlb.PANEL_FORM, 608, 420, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, MyGlb.PANEL_FORM, 80);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORTOL7, MyGlb.PANEL_FORM, "IMPORTO L7");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORTOL7, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORTOL7, PPQRY_BILPREVERVIN, "A.IMPORTO_L7", "IMPORTO_L7", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF1, MyGlb.PANEL_LIST, 692, 100, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF1, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF1, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF1, MyGlb.PANEL_FORM, 16, 456, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF1, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF1, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPOSF1, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPOSF1, -1, "", "ETICHIMPOSF1", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, MyGlb.PANEL_LIST, 116);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, MyGlb.PANEL_LIST, "IMPORTO SF RIGA1");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, MyGlb.PANEL_FORM, 608, 456, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, MyGlb.PANEL_FORM, 116);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA3, MyGlb.PANEL_FORM, "IMPORTO SF RIGA1");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORSFRIGA3, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORSFRIGA3, PPQRY_BILPREVERVIN, "A.IMPORTO_SF_RIGA1", "IMPORTO_SF_RIGA1", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, MyGlb.PANEL_LIST, 128);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, MyGlb.PANEL_LIST, "IMPORTO SF RIGA1 1");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, MyGlb.PANEL_FORM, 740, 456, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, MyGlb.PANEL_FORM, 128);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA4, MyGlb.PANEL_FORM, "IMPORTO SF RIGA1 1");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORSFRIGA4, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORSFRIGA4, PPQRY_BILPREVERVIN, "A.IMPORTO_SF_RIGA1_1", "IMPORTO_SF_RIGA1_1", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, MyGlb.PANEL_LIST, 128);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, MyGlb.PANEL_LIST, "IMPORTO SF RIGA1 2");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, MyGlb.PANEL_FORM, 872, 456, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, MyGlb.PANEL_FORM, 128);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA5, MyGlb.PANEL_FORM, "IMPORTO SF RIGA1 2");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORSFRIGA5, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORSFRIGA5, PPQRY_BILPREVERVIN, "A.IMPORTO_SF_RIGA1_2", "IMPORTO_SF_RIGA1_2", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF2, MyGlb.PANEL_LIST, 692, 100, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF2, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF2, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF2, MyGlb.PANEL_FORM, 16, 480, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF2, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOSF2, MyGlb.PANEL_FORM, 2);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPOSF2, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPOSF2, -1, "", "ETICHIMPOSF2", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, MyGlb.PANEL_LIST, 116);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, MyGlb.PANEL_LIST, "IMPORTO SF RIGA2");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, MyGlb.PANEL_FORM, 608, 480, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, MyGlb.PANEL_FORM, 116);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA6, MyGlb.PANEL_FORM, "IMPORTO SF RIGA2");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORSFRIGA6, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORSFRIGA6, PPQRY_BILPREVERVIN, "A.IMPORTO_SF_RIGA2", "IMPORTO_SF_RIGA2", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, MyGlb.PANEL_LIST, 128);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, MyGlb.PANEL_LIST, "IMPORTO SF RIGA2 1");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, MyGlb.PANEL_FORM, 740, 480, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, MyGlb.PANEL_FORM, 128);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA1, MyGlb.PANEL_FORM, "IMPORTO SF RIGA2 1");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORSFRIGA1, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORSFRIGA1, PPQRY_BILPREVERVIN, "A.IMPORTO_SF_RIGA2_1", "IMPORTO_SF_RIGA2_1", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, MyGlb.PANEL_LIST, 128);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, MyGlb.PANEL_LIST, "IMPORTO SF RIGA2 2");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, MyGlb.PANEL_FORM, 872, 480, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, MyGlb.PANEL_FORM, 128);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPORSFRIGA2, MyGlb.PANEL_FORM, "IMPORTO SF RIGA2 2");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPORSFRIGA2, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPORSFRIGA2, PPQRY_BILPREVERVIN, "A.IMPORTO_SF_RIGA2_2", "IMPORTO_SF_RIGA2_2", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR1, MyGlb.PANEL_LIST, 700, 108, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR1, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR1, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR1, MyGlb.PANEL_FORM, 16, 516, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR1, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR1, MyGlb.PANEL_FORM, 2);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPOPR1, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPOPR1, -1, "", "ETICHIMPOPR1", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, MyGlb.PANEL_LIST, 132);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, MyGlb.PANEL_LIST, "IMPORTO PREG RIGA1");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, MyGlb.PANEL_FORM, 608, 516, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, MyGlb.PANEL_FORM, 132);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG2, MyGlb.PANEL_FORM, "IMPORTO PREG RIGA1");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPOPREGRIG2, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPOPREGRIG2, PPQRY_BILPREVERVIN, "A.IMPORTO_PREG_RIGA1", "IMPORTO_PREG_RIGA1", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR2, MyGlb.PANEL_LIST, 708, 116, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR2, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR2, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR2, MyGlb.PANEL_FORM, 16, 552, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR2, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPR2, MyGlb.PANEL_FORM, 2);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPOPR2, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPOPR2, -1, "", "ETICHIMPOPR2", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, MyGlb.PANEL_LIST, 132);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, MyGlb.PANEL_LIST, "IMPORTO PREG RIGA2");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, MyGlb.PANEL_FORM, 608, 552, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, MyGlb.PANEL_FORM, 132);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIGA, MyGlb.PANEL_FORM, "IMPORTO PREG RIGA2");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPOPREGRIGA, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPOPREGRIGA, PPQRY_BILPREVERVIN, "A.IMPORTO_PREG_RIGA2", "IMPORTO_PREG_RIGA2", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, MyGlb.PANEL_LIST, 144);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, MyGlb.PANEL_LIST, "IMPORTO PREG RIGA2 1");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, MyGlb.PANEL_FORM, 740, 552, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, MyGlb.PANEL_FORM, 144);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPREGRIG1, MyGlb.PANEL_FORM, "IMPORTO PREG RIGA2 1");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPOPREGRIG1, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPOPREGRIG1, PPQRY_BILPREVERVIN, "A.IMPORTO_PREG_RIGA2_1", "IMPORTO_PREG_RIGA2_1", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN1, MyGlb.PANEL_LIST, 716, 124, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN1, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN1, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN1, MyGlb.PANEL_FORM, 16, 588, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN1, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN1, MyGlb.PANEL_FORM, 2);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPOPN1, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPOPN1, -1, "", "ETICHIMPOPN1", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, MyGlb.PANEL_LIST, 132);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, MyGlb.PANEL_LIST, "IMPORTO PNAZ RIGA1");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, MyGlb.PANEL_FORM, 608, 588, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, MyGlb.PANEL_FORM, 132);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG2, MyGlb.PANEL_FORM, "IMPORTO PNAZ RIGA1");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPOPNAZRIG2, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPOPNAZRIG2, PPQRY_BILPREVERVIN, "A.IMPORTO_PNAZ_RIGA1", "IMPORTO_PNAZ_RIGA1", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN2, MyGlb.PANEL_LIST, 724, 132, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN2, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN2, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN2, MyGlb.PANEL_FORM, 16, 624, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN2, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHIMPOPN2, MyGlb.PANEL_FORM, 2);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHIMPOPN2, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHIMPOPN2, -1, "", "ETICHIMPOPN2", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, MyGlb.PANEL_LIST, 132);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, MyGlb.PANEL_LIST, "IMPORTO PNAZ RIGA2");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, MyGlb.PANEL_FORM, 608, 624, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, MyGlb.PANEL_FORM, 132);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIGA, MyGlb.PANEL_FORM, "IMPORTO PNAZ RIGA2");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPOPNAZRIGA, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPOPNAZRIGA, PPQRY_BILPREVERVIN, "A.IMPORTO_PNAZ_RIGA2", "IMPORTO_PNAZ_RIGA2", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, MyGlb.PANEL_LIST, 144);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, MyGlb.PANEL_LIST, "IMPORTO PNAZ RIGA2 1");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, MyGlb.PANEL_FORM, 740, 624, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, MyGlb.PANEL_FORM, 144);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_IMPOPNAZRIG1, MyGlb.PANEL_FORM, "IMPORTO PNAZ RIGA2 1");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_IMPOPNAZRIG1, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_IMPOPNAZRIG1, PPQRY_BILPREVERVIN, "A.IMPORTO_PNAZ_RIGA2_1", "IMPORTO_PNAZ_RIGA2_1", 3, 14, 2, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEELABOR, MyGlb.PANEL_LIST, 632, 356, 96, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEELABOR, MyGlb.PANEL_FORM, 916, 680, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_ETICHEELABOR, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, MyGlb.PANEL_LIST, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, MyGlb.PANEL_LIST, "TIPO STAMPA");
    PAN_VERIFIVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, MyGlb.PANEL_FORM, 4, 716, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFIVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, MyGlb.PANEL_FORM, 88);
    PAN_VERIFIVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_VERIFIVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFIVINCOL_TIPOSTAMPA, MyGlb.PANEL_FORM, "TIPO STAMPA");
    PAN_VERIFIVINCOL.SetFieldPage(PFL_VERIFIVINCOL_TIPOSTAMPA, -1, -1);
    PAN_VERIFIVINCOL.SetFieldPanel(PFL_VERIFIVINCOL_TIPOSTAMPA, PPQRY_BILPREVERVIN, "A.TIPO_STAMPA", "TIPO_STAMPA", 5, 10, 0, -13997);
  }

  private void PAN_VERIFIVINCOL_InitQueries()
  {
    StringBuffer SQL;

    PAN_VERIFIVINCOL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VERIFIVINCOL.SetIMDB(IMDB, "PQRY_BILPREVERVIN", true);
    PAN_VERIFIVINCOL.set_SetString(MyGlb.MASTER_ROWNAME, "BIL CONS EQUILIBRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA, ");
    SQL.append("  A.IMPORTO_B as IMPORTO_B, ");
    SQL.append("  A.IMPORTO_D2 as IMPORTO_D2, ");
    SQL.append("  A.IMPORTO_I3 as IMPORTO_I3, ");
    SQL.append("  A.IMPORTO_I3_1 as IMPORTO_I3_1, ");
    SQL.append("  A.IMPORTO_I3_2 as IMPORTO_I3_2, ");
    SQL.append("  A.IMPORTO_I4 as IMPORTO_I4, ");
    SQL.append("  A.IMPORTO_I4_1 as IMPORTO_I4_1, ");
    SQL.append("  A.IMPORTO_I4_2 as IMPORTO_I4_2, ");
    SQL.append("  A.IMPORTO_I5 as IMPORTO_I5, ");
    SQL.append("  A.IMPORTO_I5_1 as IMPORTO_I5_1, ");
    SQL.append("  A.IMPORTO_I5_2 as IMPORTO_I5_2, ");
    SQL.append("  A.IMPORTO_I6 as IMPORTO_I6, ");
    SQL.append("  A.IMPORTO_I7 as IMPORTO_I7, ");
    SQL.append("  A.IMPORTO_L2 as IMPORTO_L2, ");
    SQL.append("  A.IMPORTO_L3 as IMPORTO_L3, ");
    SQL.append("  A.IMPORTO_L3_1 as IMPORTO_L3_1, ");
    SQL.append("  A.IMPORTO_L3_2 as IMPORTO_L3_2, ");
    SQL.append("  A.IMPORTO_L4 as IMPORTO_L4, ");
    SQL.append("  A.IMPORTO_L4_1 as IMPORTO_L4_1, ");
    SQL.append("  A.IMPORTO_L4_2 as IMPORTO_L4_2, ");
    SQL.append("  A.IMPORTO_L5 as IMPORTO_L5, ");
    SQL.append("  A.IMPORTO_L6 as IMPORTO_L6, ");
    SQL.append("  A.IMPORTO_L7 as IMPORTO_L7, ");
    SQL.append("  A.IMPORTO_SF_RIGA1 as IMPORTO_SF_RIGA1, ");
    SQL.append("  A.IMPORTO_SF_RIGA1_1 as IMPORTO_SF_RIGA1_1, ");
    SQL.append("  A.IMPORTO_SF_RIGA1_2 as IMPORTO_SF_RIGA1_2, ");
    SQL.append("  A.IMPORTO_SF_RIGA2 as IMPORTO_SF_RIGA2, ");
    SQL.append("  A.IMPORTO_SF_RIGA2_1 as IMPORTO_SF_RIGA2_1, ");
    SQL.append("  A.IMPORTO_SF_RIGA2_2 as IMPORTO_SF_RIGA2_2, ");
    SQL.append("  A.IMPORTO_PREG_RIGA1 as IMPORTO_PREG_RIGA1, ");
    SQL.append("  A.IMPORTO_PREG_RIGA2 as IMPORTO_PREG_RIGA2, ");
    SQL.append("  A.IMPORTO_PREG_RIGA2_1 as IMPORTO_PREG_RIGA2_1, ");
    SQL.append("  A.IMPORTO_PNAZ_RIGA1 as IMPORTO_PNAZ_RIGA1, ");
    SQL.append("  A.IMPORTO_PNAZ_RIGA2 as IMPORTO_PNAZ_RIGA2, ");
    SQL.append("  A.IMPORTO_PNAZ_RIGA2_1 as IMPORTO_PNAZ_RIGA2_1 ");
    PAN_VERIFIVINCOL.SetQuery(PPQRY_BILPREVERVIN, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_PREV_VERIFICA_VINCOLI A ");
    PAN_VERIFIVINCOL.SetQuery(PPQRY_BILPREVERVIN, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = ~~TBL_PARAMETRI568.ROWNAMTIPSTA~~) ");
    PAN_VERIFIVINCOL.SetQuery(PPQRY_BILPREVERVIN, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VERIFIVINCOL.SetQuery(PPQRY_BILPREVERVIN, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VERIFIVINCOL.SetQuery(PPQRY_BILPREVERVIN, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VERIFIVINCOL.SetQuery(PPQRY_BILPREVERVIN, 5, SQL, -1, "");
    PAN_VERIFIVINCOL.SetQueryDB(PPQRY_BILPREVERVIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VERIFIVINCOL.SetMasterTable(0, "BIL_PREV_VERIFICA_VINCOLI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VERIFIVINCOL.Status() == 2)
    {
      int oldListQBE = PAN_VERIFIVINCOL.iUseListQBE;
      PAN_VERIFIVINCOL.iUseListQBE = 0;
      PAN_VERIFIVINCOL.PanelCommand(Glb.PCM_SEARCH);
      PAN_VERIFIVINCOL.PanelCommand(Glb.PCM_FIND);
      PAN_VERIFIVINCOL.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VERIFIVINCOL) PAN_VERIFIVINCOL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_VERIFIVINCOL) PAN_VERIFIVINCOL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_VERIFIVINCOL) PAN_VERIFIVINCOL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VERIFIVINCOL) PAN_VERIFIVINCOL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VERIFIVINCOL) PAN_VERIFIVINCOL_AfterFind(CmdFind);
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
    if (SrcObj == PAN_VERIFIVINCOL) PAN_VERIFIVINCOL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
