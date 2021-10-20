// **********************************************
// Stampa Con Parametri
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StampaConParametri extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DATAFINETRIM_DATAFINETRIM = 0;
  private static int PFL_DATAFINETRIM_CODICESTAMP1 = 1;
  private static int PFL_DATAFINETRIM_ETISTARIA4LM = 2;

  private static int PPQRY_PARAMETRI574 = 0;


  IDPanel PAN_DATAFINETRIM;
  private static int GRP_PROVVEDIMENT_VARIAZIONI = 0;
  private static int GRP_PROVVEDIMENT_PROVVEDIMENT = 1;

  private static int PFL_PROVVEDIMENT_VARIAZIONI = 0;
  private static int PFL_PROVVEDIMENT_DELIBERA = 1;
  private static int PFL_PROVVEDIMENT_NUMERODELIBE = 2;
  private static int PFL_PROVVEDIMENT_ANNODELIBERA = 3;
  private static int PFL_PROVVEDIMENT_PROPOSTA = 4;
  private static int PFL_PROVVEDIMENT_NUMEROPROPOS = 5;
  private static int PFL_PROVVEDIMENT_ANNOPROPOSTA = 6;
  private static int PFL_PROVVEDIMENT_TRATTIDELIBE = 7;
  private static int PFL_PROVVEDIMENT_BARRADELIBER = 8;
  private static int PFL_PROVVEDIMENT_APRISCELDELI = 9;
  private static int PFL_PROVVEDIMENT_APRIINFODELI = 10;
  private static int PFL_PROVVEDIMENT_TRATTIPROPOS = 11;
  private static int PFL_PROVVEDIMENT_BARRAPROPOST = 12;
  private static int PFL_PROVVEDIMENT_APRISCELPROP = 13;

  private static int PPQRY_PARAMETRI578 = 0;


  IDPanel PAN_PROVVEDIMENT;
  private static int PFL_STAMPA_CODPARAM = 0;
  private static int PFL_STAMPA_LABELCOLIMP1 = 1;
  private static int PFL_STAMPA_IMPORTO1 = 2;
  private static int PFL_STAMPA_IMPORTO2 = 3;
  private static int PFL_STAMPA_IMPORTO3 = 4;
  private static int PFL_STAMPA_NUMMAXIMPORT = 5;
  private static int PFL_STAMPA_STRPARSTAORD = 6;

  private static int PPQRY_STRUPARASTAM = 0;


  IDPanel PAN_STAMPA;
  private static int PFL_DATAELABPAR_DATAELABORAZ = 0;
  private static int PFL_DATAELABPAR_ETICHEELABOR = 1;
  private static int PFL_DATAELABPAR_CODICESTAMPA = 2;

  private static int PPQRY_PARAMETRI577 = 0;


  IDPanel PAN_DATAELABPAR;

  // Definition of Global Variables
  private IDVariant SALVAFILE = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI689(IMDB);
    Init_TBL_PARAMETRI_STAMPE(IMDB);
    //
    //
    Init_QRY_PARAMESTAMPE(IMDB);
    Init_PQRY_PARAMETRI574(IMDB);
    Init_PQRY_PARAMETRI574_RS(IMDB);
    Init_PQRY_PARAMETRI578(IMDB);
    Init_PQRY_PARAMETRI578_RS(IMDB);
    Init_PQRY_STRUPARASTAM(IMDB);
    Init_PQRY_STRUPARASTAM_RS(IMDB);
    Init_PQRY_PARAMETRI577(IMDB);
    Init_PQRY_PARAMETRI577_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI689(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI689, 16);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI689, "TBL_PARAMETRI689");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGFORCAP, "NOMOGGFORCAP");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGFORCAP,5,64,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, "COD_STAMPA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_COD_STAMPA,5,50,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGDAFITR, "NOMOGGDAFITR");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGDAFITR,5,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMEOGGEVARI, "NOMEOGGEVARI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMEOGGEVARI,5,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGUNIPRO, "NOMOGGUNIPRO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGNUMPRO, "NOMOGGNUMPRO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMSTA, "NOMOGGNOMSTA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMSTA,5,100,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOOGSTNUDIPA, "NOOGSTNUDIPA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOOGSTNUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGNOTSTA, "NOMOGGNOTSTA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGNOTSTA,5,200,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMEOGGIDSTA, "NOMEOGGIDSTA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMEOGGIDSTA,3,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMFIL, "NOMOGGNOMFIL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI689,IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMFIL,9,500,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI689, 0);
  }

  private static void Init_TBL_PARAMETRI_STAMPE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI_STAMPE, 13);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI_STAMPE, "TBL_PARAMETRI_STAMPE");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_COD_STAMPA, "COD_STAMPA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_COD_STAMPA,5,50,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM, "COD_PARAM");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM,5,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_ORDINE, "ORDINE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_ORDINE,3,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_RIGA, "LABEL_RIGA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_RIGA,5,500,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_NUM_MAX_IMPORTI, "NUM_MAX_IMPORTI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_NUM_MAX_IMPORTI,1,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_COL_IMP1, "LABEL_COL_IMP1");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_COL_IMP1,5,100,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_COL_IMP2, "LABEL_COL_IMP2");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_COL_IMP2,5,100,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_COL_IMP3, "LABEL_COL_IMP3");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_COL_IMP3,5,100,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_PARASTAMSTAT, "PARASTAMSTAT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_PARASTAMSTAT,5,1,0);
  }

  private static void Init_QRY_PARAMESTAMPE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.QRY_PARAMESTAMPE, 5);
    IMDB.set_TblCode(IMDBDef17.QRY_PARAMESTAMPE, "QRY_PARAMESTAMPE");
    IMDB.set_FldCode(IMDBDef17.QRY_PARAMESTAMPE,IMDBDef17.QSL_PARAMESTAMPE_RECCODSTAMPA, "RECCODSTAMPA");
    IMDB.SetFldParams(IMDBDef17.QRY_PARAMESTAMPE,IMDBDef17.QSL_PARAMESTAMPE_RECCODSTAMPA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.QRY_PARAMESTAMPE,IMDBDef17.QSL_PARAMESTAMPE_RECCODPARAM, "RECCODPARAM");
    IMDB.SetFldParams(IMDBDef17.QRY_PARAMESTAMPE,IMDBDef17.QSL_PARAMESTAMPE_RECCODPARAM,5,10,0);
    IMDB.set_FldCode(IMDBDef17.QRY_PARAMESTAMPE,IMDBDef17.QSL_PARAMESTAMPE_RECIMPORTO1, "RECIMPORTO1");
    IMDB.SetFldParams(IMDBDef17.QRY_PARAMESTAMPE,IMDBDef17.QSL_PARAMESTAMPE_RECIMPORTO1,3,14,2);
    IMDB.set_FldCode(IMDBDef17.QRY_PARAMESTAMPE,IMDBDef17.QSL_PARAMESTAMPE_RECIMPORTO2, "RECIMPORTO2");
    IMDB.SetFldParams(IMDBDef17.QRY_PARAMESTAMPE,IMDBDef17.QSL_PARAMESTAMPE_RECIMPORTO2,3,14,2);
    IMDB.set_FldCode(IMDBDef17.QRY_PARAMESTAMPE,IMDBDef17.QSL_PARAMESTAMPE_RECIMPORTO3, "RECIMPORTO3");
    IMDB.SetFldParams(IMDBDef17.QRY_PARAMESTAMPE,IMDBDef17.QSL_PARAMESTAMPE_RECIMPORTO3,3,14,2);
  }

  private static void Init_PQRY_PARAMETRI574(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI574, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI574, "PQRY_PARAMETRI574");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI574,IMDBDef17.PQSL_PARAMETRI574_COD_STAMPA, "COD_STAMPA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI574,IMDBDef17.PQSL_PARAMETRI574_COD_STAMPA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI574,IMDBDef17.PQSL_PARAMETRI574_NOMOGGDAFITR, "NOMOGGDAFITR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI574,IMDBDef17.PQSL_PARAMETRI574_NOMOGGDAFITR,5,10,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI574, 0);
  }

  private static void Init_PQRY_PARAMETRI574_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI574_RS, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI574_RS, "PQRY_PARAMETRI574_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI574_RS,IMDBDef17.PQSL_PARAMETRI574_COD_STAMPA, "COD_STAMPA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI574_RS,IMDBDef17.PQSL_PARAMETRI574_COD_STAMPA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI574_RS,IMDBDef17.PQSL_PARAMETRI574_NOMOGGDAFITR, "NOMOGGDAFITR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI574_RS,IMDBDef17.PQSL_PARAMETRI574_NOMOGGDAFITR,5,10,0);
  }

  private static void Init_PQRY_PARAMETRI578(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI578, 7);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI578, "PQRY_PARAMETRI578");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMEOGGEVARI, "NOMEOGGEVARI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMEOGGEVARI,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO, "NOMOGGUNIPRO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMPRO, "NOMOGGNUMPRO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578,IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNPRO,1,4,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI578, 0);
  }

  private static void Init_PQRY_PARAMETRI578_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI578_RS, 7);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI578_RS, "PQRY_PARAMETRI578_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMEOGGEVARI, "NOMEOGGEVARI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMEOGGEVARI,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO, "NOMOGGUNIPRO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMPRO, "NOMOGGNUMPRO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI578_RS,IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNPRO,1,4,0);
  }

  private static void Init_PQRY_STRUPARASTAM(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_STRUPARASTAM, 7);
    IMDB.set_TblCode(IMDBDef17.PQRY_STRUPARASTAM, "PQRY_STRUPARASTAM");
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_LABEL_RIGA, "LABEL_RIGA");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_LABEL_RIGA,5,500,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_ORDINE, "ORDINE");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_ORDINE,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_NUM_MAX_IMPORTI, "NUM_MAX_IMPORTI");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_NUM_MAX_IMPORTI,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM, "COD_PARAM");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM,IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM,5,10,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_STRUPARASTAM, 0);
  }

  private static void Init_PQRY_STRUPARASTAM_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_STRUPARASTAM_RS, 7);
    IMDB.set_TblCode(IMDBDef17.PQRY_STRUPARASTAM_RS, "PQRY_STRUPARASTAM_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_LABEL_RIGA, "LABEL_RIGA");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_LABEL_RIGA,5,500,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_ORDINE, "ORDINE");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_ORDINE,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_NUM_MAX_IMPORTI, "NUM_MAX_IMPORTI");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_NUM_MAX_IMPORTI,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM, "COD_PARAM");
    IMDB.SetFldParams(IMDBDef17.PQRY_STRUPARASTAM_RS,IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM,5,10,0);
  }

  private static void Init_PQRY_PARAMETRI577(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI577, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI577, "PQRY_PARAMETRI577");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI577,IMDBDef17.PQSL_PARAMETRI577_COD_STAMPA, "COD_STAMPA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI577,IMDBDef17.PQSL_PARAMETRI577_COD_STAMPA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI577,IMDBDef17.PQSL_PARAMETRI577_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI577,IMDBDef17.PQSL_PARAMETRI577_NOMOGGDATELA,6,14,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI577, 0);
  }

  private static void Init_PQRY_PARAMETRI577_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI577_RS, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI577_RS, "PQRY_PARAMETRI577_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI577_RS,IMDBDef17.PQSL_PARAMETRI577_COD_STAMPA, "COD_STAMPA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI577_RS,IMDBDef17.PQSL_PARAMETRI577_COD_STAMPA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI577_RS,IMDBDef17.PQSL_PARAMETRI577_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI577_RS,IMDBDef17.PQSL_PARAMETRI577_NOMOGGDATELA,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StampaConParametri(MyWebEntryPoint w, IMDBObj imdb)
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
  public StampaConParametri()
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
    FormIdx = MyGlb.FRM_STAMPCONPARA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B458A7BD-98A6-47FE-AC64-7A8BFDAEB078";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1060;
    DesignHeight = 614;
    set_Caption(new IDVariant("Stampa Con Parametri"));
    //
    Frames = new AFrame[8];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1060;
    Frames[1].Height = 588;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0748299;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1060;
    Frames[2].Height = 44;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Data Fine Trimestre";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 1060;
    Frames[2].FixedHeight = 44;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_DATAFINETRIM = new IDPanel(w, this, 2, "PAN_DATAFINETRIM");
    Frames[2].Content = PAN_DATAFINETRIM;
    PAN_DATAFINETRIM.Lockable = false;
    PAN_DATAFINETRIM.iLocked = false;
    PAN_DATAFINETRIM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DATAFINETRIM.VS = MainFrm.VisualStyleList;
    PAN_DATAFINETRIM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1060-MyGlb.PAN_OFFS_X, 44-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DATAFINETRIM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B66DAC59-2FF4-42CF-B97C-59034DF483A6");
    PAN_DATAFINETRIM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 160, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATAFINETRIM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DATAFINETRIM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DATAFINETRIM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DATAFINETRIM.InitStatus = 1;
    PAN_DATAFINETRIM_Init();
    PAN_DATAFINETRIM_InitFields();
    PAN_DATAFINETRIM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1060;
    Frames[3].Height = 544;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.125;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 1060;
    Frames[4].Height = 68;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Provvedimento";
    Frames[4].Parent = this;
    Frames[4].FixedWidth = 1060;
    Frames[4].FixedHeight = 68;
    Frames[4].MinWidth = Frames[4].Width;
    Frames[4].MaxWidth = Frames[4].Width;
    Frames[4].MinHeight = Frames[4].Height;
    Frames[4].MaxHeight = Frames[4].Height;
    PAN_PROVVEDIMENT = new IDPanel(w, this, 4, "PAN_PROVVEDIMENT");
    Frames[4].Content = PAN_PROVVEDIMENT;
    PAN_PROVVEDIMENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROVVEDIMENT.VS = MainFrm.VisualStyleList;
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1060-MyGlb.PAN_OFFS_X, 68-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8B90DEFB-9907-4468-ACB7-89347A6207FB");
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 352, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROVVEDIMENT.InitStatus = 2;
    PAN_PROVVEDIMENT_Init();
    PAN_PROVVEDIMENT_InitFields();
    PAN_PROVVEDIMENT_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 1060;
    Frames[5].Height = 476;
    Frames[5].Vertical = true;
    Frames[5].FormFactor = 0.857143;
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[5].ChildFrame1 = Frames[6];
    Frames[6].Width = 1060;
    Frames[6].Height = 408;
    Frames[6].FrHidden = true;
    Frames[6].Caption = "Stampa";
    Frames[6].Parent = this;
    Frames[6].FixedHeight = 408;
    PAN_STAMPA = new IDPanel(w, this, 6, "PAN_STAMPA");
    Frames[6].Content = PAN_STAMPA;
    PAN_STAMPA.ShowRowSelector = false;
    PAN_STAMPA.ShowToolbar = false;
    PAN_STAMPA.ShowStatusbar = false;
    PAN_STAMPA.Lockable = false;
    PAN_STAMPA.iLocked = false;
    PAN_STAMPA.VS = MainFrm.VisualStyleList;
    PAN_STAMPA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1060-MyGlb.PAN_OFFS_X, 408-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STAMPA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "650F7692-28AB-4F42-8772-BE55B08AD5E3");
    PAN_STAMPA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1020, 392, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_STAMPA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_VUOTNORMCENT);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 8);
    PAN_STAMPA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STAMPA.InitStatus = 2;
    PAN_STAMPA_Init();
    PAN_STAMPA_InitFields();
    PAN_STAMPA_InitQueries();
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[5].ChildFrame2 = Frames[7];
    Frames[7].Width = 1060;
    Frames[7].Height = 68;
    Frames[7].FrHidden = true;
    Frames[7].Caption = "Data Elab par";
    Frames[7].Parent = this;
    Frames[7].FixedHeight = 68;
    PAN_DATAELABPAR = new IDPanel(w, this, 7, "PAN_DATAELABPAR");
    Frames[7].Content = PAN_DATAELABPAR;
    PAN_DATAELABPAR.Lockable = false;
    PAN_DATAELABPAR.iLocked = false;
    PAN_DATAELABPAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DATAELABPAR.VS = MainFrm.VisualStyleList;
    PAN_DATAELABPAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1060-MyGlb.PAN_OFFS_X, 68-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DATAELABPAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7B985E9B-F3E3-40FB-9BA0-A2B7A804530C");
    PAN_DATAELABPAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 144, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DATAELABPAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DATAELABPAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DATAELABPAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DATAELABPAR.InitStatus = 1;
    PAN_DATAELABPAR_Init();
    PAN_DATAELABPAR_InitFields();
    PAN_DATAELABPAR_InitQueries();
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRI689, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STAMPCONPARA_PARAMETRI574();
      }
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRI689, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STAMPCONPARA_PARAMETRI578();
      }
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRI_STAMPE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STAMPCONPARA_STRUPARASTAM();
      }
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRI689, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STAMPCONPARA_PARAMETRI577();
      }
      PAN_DATAFINETRIM.UpdatePanel(MainFrm);
      PAN_PROVVEDIMENT.UpdatePanel(MainFrm);
      PAN_STAMPA.UpdatePanel(MainFrm);
      PAN_DATAELABPAR.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PROVVEDIMENT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PROVVEDIMENT_APRISCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PROVVEDIMENT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PROVVEDIMENT_APRISCELPROP) {
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
    return (obj instanceof StampaConParametri);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StampaConParametri.class.getName() : (Glb.ClassWithPackage(StampaConParametri.class) ? StampaConParametri.class.getName().substring(StampaConParametri.class.getPackage().getName().length() + 1) : StampaConParametri.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Stampa On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STAMPA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STAMPA);
      // 
      // Stampa On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_NUM_MAX_IMPORTI, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)>0)
      {
        if (IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_NUM_MAX_IMPORTI, 0).equals((new IDVariant(1)), true))
        {
          PAN_STAMPA.SetFlags (Glb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STAMPA.SetFlags (Glb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STAMPA.SetFlags (Glb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else if (IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_NUM_MAX_IMPORTI, 0).equals((new IDVariant(2)), true))
        {
          PAN_STAMPA.SetFlags (Glb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STAMPA.SetFlags (Glb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STAMPA.SetFlags (Glb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_STAMPA.SetFlags (Glb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STAMPA.SetFlags (Glb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STAMPA.SetFlags (Glb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_STAMPA.SetFlags (Glb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STAMPA.SetFlags (Glb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STAMPA.SetFlags (Glb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM, 0)))
      {
        PAN_STAMPA.set_VisualStyle(Glb.OBJ_FIELD,PFL_STAMPA_IMPORTO1,new IDVariant(MyGlb.VIS_IMINPASTNOBO).intValue()); 
        PAN_STAMPA.set_VisualStyle(Glb.OBJ_FIELD,PFL_STAMPA_IMPORTO2,new IDVariant(MyGlb.VIS_IMINPASTNOBO).intValue()); 
        PAN_STAMPA.set_VisualStyle(Glb.OBJ_FIELD,PFL_STAMPA_IMPORTO3,new IDVariant(MyGlb.VIS_IMINPASTNOBO).intValue()); 
      }
      else
      {
        PAN_STAMPA.set_VisualStyle(Glb.OBJ_FIELD,PFL_STAMPA_IMPORTO1,new IDVariant(MyGlb.VIS_IMPOINPARSTA).intValue()); 
        PAN_STAMPA.set_VisualStyle(Glb.OBJ_FIELD,PFL_STAMPA_IMPORTO2,new IDVariant(MyGlb.VIS_IMPOINPARSTA).intValue()); 
        PAN_STAMPA.set_VisualStyle(Glb.OBJ_FIELD,PFL_STAMPA_IMPORTO3,new IDVariant(MyGlb.VIS_IMPOINPARSTA).intValue()); 
      }
      PAN_STAMPA.set_ToolTip(Glb.OBJ_FIELD,PFL_STAMPA_LABELCOLIMP1,IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_LABEL_RIGA, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "StampaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Stampa On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_STAMPA_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(64)), true))
      {
        if (UserOperation.booleanValue())
        {
          RiempiIMDB();
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "StampaOnCommand", _e);
    }
  }

  // **********************************************************************
  // Stampa On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_STAMPA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa On Updating Row Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("LMPC13")), true))
      {
        if (Column.equals((new IDVariant(PFL_STAMPA_IMPORTO1)), true) && FieldWasModified.booleanValue())
        {
          if (IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM, 0).equals((new IDVariant("PMPC_S1B")), true) || IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM, 0).equals((new IDVariant("PMPC_S23")), true))
          {
            STAMONUPDROW_PARASTAMUPD1();
          }
          if (IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM, 0).equals((new IDVariant("PMPC_S1L2")), true) || IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM, 0).equals((new IDVariant("PMPC_S26")), true))
          {
            STAMONUPDROW_PARASTAMUPD2();
          }
          if (IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM, 0).equals((new IDVariant("PMPC_S1I3")), true) || IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM, 0).equals((new IDVariant("PMPC_S28")), true))
          {
            STAMONUPDROW_PARASTAMUPD3();
          }
          if (IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM, 0).equals((new IDVariant("PMPC_S1L3")), true) || IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM, 0).equals((new IDVariant("PMPC_S211")), true))
          {
            STAMONUPDROW_PARASTAMUPDA();
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "StampaOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // PARAMETRI STAMPE: Update
  // Perchè stai aggiornando questi dati?
  // **********************************************************************
  private void STAMONUPDROW_PARASTAMUPD1() throws SQLException
  {
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
    while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI_STAMPE, 0))
    {
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_ESERCIZIO, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_STAMPA, 0).equals((new IDVariant("LMPC13")), true))
      {
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM, 0).equals((new IDVariant("PMPC_S1B")), true) || IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM, 0).equals((new IDVariant("PMPC_S23")), true))
      {
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_1, 0, IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_1, 0));
      }
      }
      }
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
    }
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
  }

  // **********************************************************************
  // PARAMETRI STAMPE: Update
  // Perchè stai aggiornando questi dati?
  // **********************************************************************
  private void STAMONUPDROW_PARASTAMUPD2() throws SQLException
  {
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
    while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI_STAMPE, 0))
    {
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_ESERCIZIO, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_STAMPA, 0).equals((new IDVariant("LMPC13")), true))
      {
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM, 0).equals((new IDVariant("PMPC_S1L2")), true) || IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM, 0).equals((new IDVariant("PMPC_S26")), true))
      {
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_1, 0, IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_1, 0));
      }
      }
      }
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
    }
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
  }

  // **********************************************************************
  // PARAMETRI STAMPE: Update
  // Perchè stai aggiornando questi dati?
  // **********************************************************************
  private void STAMONUPDROW_PARASTAMUPD3() throws SQLException
  {
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
    while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI_STAMPE, 0))
    {
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_ESERCIZIO, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_STAMPA, 0).equals((new IDVariant("LMPC13")), true))
      {
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM, 0).equals((new IDVariant("PMPC_S1I3")), true) || IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM, 0).equals((new IDVariant("PMPC_S28")), true))
      {
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_1, 0, IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_1, 0));
      }
      }
      }
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
    }
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
  }

  // **********************************************************************
  // PARAMETRI STAMPE: Update
  // Perchè stai aggiornando questi dati?
  // **********************************************************************
  private void STAMONUPDROW_PARASTAMUPDA() throws SQLException
  {
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
    while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI_STAMPE, 0))
    {
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_ESERCIZIO, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_STAMPA, 0).equals((new IDVariant("LMPC13")), true))
      {
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM, 0).equals((new IDVariant("PMPC_S1L3")), true) || IMDB.Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM, 0).equals((new IDVariant("PMPC_S211")), true))
      {
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_1, 0, IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM, IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_1, 0));
      }
      }
      }
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
    }
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
  }

  // **********************************************************************
  // Stampa After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_STAMPA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_STAMPA.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_STAMPA.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_STAMPA.set_Visible((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "StampaAfterFind", _e);
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
      IDVariant v_DETTAGLRIGOA = new IDVariant(0,IDVariant.STRING);
      v_DETTAGLRIGOA = (new IDVariant("Dettaglio Rigo A"));
      set_Caption(IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGFORCAP, 0));
      PAN_STAMPA.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      RiempiIMDB();
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("PRLIQ")), true))
      {
        IDVariant v_VTODAY = new IDVariant(0,IDVariant.DATETIME);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  TRUNC(LAST_DAY(SYSDATE)) as LASTDAY ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VTODAY = QV.Get("LASTDAY", IDVariant.DATETIME) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGDATELA, 0, new IDVariant(v_VTODAY));
      }
      else
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGDATELA, 0, IDL.Today());
      }
      PAN_DATAFINETRIM.SetFlags (Glb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("LMPC13")), true))
      {
        PAN_DATAFINETRIM.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_PROVVEDIMENT.set_Visible((new IDVariant(0)).booleanValue());
        PAN_DATAFINETRIM.SetFlags (Glb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo((new IDVariant(2018)), true)>=0)
        {
          PAN_DATAFINETRIM.set_Header(Glb.OBJ_FIELD,PFL_DATAFINETRIM_ETISTARIA4LM, IDL.Add(v_DETTAGLRIGOA, (new IDVariant("4"))).stringValue());
        }
        else
        {
          PAN_DATAFINETRIM.set_Header(Glb.OBJ_FIELD,PFL_DATAFINETRIM_ETISTARIA4LM, IDL.Add(v_DETTAGLRIGOA, (new IDVariant("3"))).stringValue());
        }
        PAN_DATAELABPAR.SetFlags (Glb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DATAFINETRIM.ClearValueList(PFL_DATAFINETRIM_DATAFINETRIM);
        PAN_DATAFINETRIM.SetValueListItem(PFL_DATAFINETRIM_DATAFINETRIM, IDL.Add((new IDVariant("31/03/")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), IDL.Add((new IDVariant("31/03/")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_DATAFINETRIM.SetValueListItem(PFL_DATAFINETRIM_DATAFINETRIM, IDL.Add((new IDVariant("30/06/")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), IDL.Add((new IDVariant("30/06/")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_DATAFINETRIM.SetValueListItem(PFL_DATAFINETRIM_DATAFINETRIM, IDL.Add((new IDVariant("30/09/")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), IDL.Add((new IDVariant("30/09/")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_DATAFINETRIM.SetValueListItem(PFL_DATAFINETRIM_DATAFINETRIM, IDL.Add((new IDVariant("31/12/")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), IDL.Add((new IDVariant("31/12/")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      else if (IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("LVV17")), true))
      {
        PAN_DATAFINETRIM.set_Visible((new IDVariant(0)).booleanValue());
        PAN_PROVVEDIMENT.set_Visible((new IDVariant(0)).booleanValue());
        PAN_DATAELABPAR.SetFlags (Glb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else if (IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("LVVA17")), true))
      {
        PAN_DATAFINETRIM.set_Visible((new IDVariant(0)).booleanValue());
        PAN_PROVVEDIMENT.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_DATAELABPAR.SetFlags (Glb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else if (IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("EBT14")), true) || IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("SBT14")), true))
      {
        PAN_DATAFINETRIM.set_Visible((new IDVariant(0)).booleanValue());
        PAN_PROVVEDIMENT.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_DATAELABPAR.SetFlags (Glb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DATAFINETRIM.set_Visible((new IDVariant(0)).booleanValue());
        PAN_PROVVEDIMENT.set_Visible((new IDVariant(0)).booleanValue());
        PAN_DATAELABPAR.SetFlags (Glb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "Load", _e);
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
      UNLOAD_PARASTAMDELE();
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "Unload", _e);
    }
  }

  // **********************************************************************
  // PARAMETRI STAMPE: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARASTAMDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef7.TBL_PARAMETRI_STAMPE);
  }

  // **********************************************************************
  // PARAMETRI: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGFORCAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGDATELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGDAFITR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMEOGGEVARI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOOGSTNUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOTSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMEOGGIDSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMFIL, 0, new IDVariant());
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
        IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "EndModal", _e);
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
    int CurPos=0;
    IDCachedRowSet C12;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      ETICHEELABOR_PARAMESTAMPE();
      while (!IMDB.Eof(IMDBDef17.QRY_PARAMESTAMPE, 0))
      {
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  PARAMETRI_STAMPE A ");
        SQL.append("where (A.COD_STAMPA = " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_PARAMESTAMPE, IMDBDef17.QSL_PARAMESTAMPE_RECCODSTAMPA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COD_PARAM = " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_PARAMESTAMPE, IMDBDef17.QSL_PARAMESTAMPE_RECCODPARAM, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.equals((new IDVariant(0)), true))
        {
          SQL = new StringBuffer();
          SQL.append("insert into PARAMETRI_STAMPE ");
          SQL.append("( ");
          SQL.append("  COD_STAMPA, ");
          SQL.append("  COD_PARAM, ");
          SQL.append("  ESERCIZIO, ");
          SQL.append("  IMPORTO_1, ");
          SQL.append("  IMPORTO_2, ");
          SQL.append("  IMPORTO_3 ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_PARAMESTAMPE, IMDBDef17.QSL_PARAMESTAMPE_RECCODSTAMPA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_PARAMESTAMPE, IMDBDef17.QSL_PARAMESTAMPE_RECCODPARAM, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_PARAMESTAMPE, IMDBDef17.QSL_PARAMESTAMPE_RECIMPORTO1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_PARAMESTAMPE, IMDBDef17.QSL_PARAMESTAMPE_RECIMPORTO2, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_PARAMESTAMPE, IMDBDef17.QSL_PARAMESTAMPE_RECIMPORTO3, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("update PARAMETRI_STAMPE set ");
          SQL.append("  IMPORTO_1 = " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_PARAMESTAMPE, IMDBDef17.QSL_PARAMESTAMPE_RECIMPORTO1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  IMPORTO_2 = " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_PARAMESTAMPE, IMDBDef17.QSL_PARAMESTAMPE_RECIMPORTO2, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  IMPORTO_3 = " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_PARAMESTAMPE, IMDBDef17.QSL_PARAMESTAMPE_RECIMPORTO3, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (COD_STAMPA = " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_PARAMESTAMPE, IMDBDef17.QSL_PARAMESTAMPE_RECCODSTAMPA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (COD_PARAM = " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_PARAMESTAMPE, IMDBDef17.QSL_PARAMESTAMPE_RECCODPARAM, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        IMDB.TblMoveNext(IMDBDef17.QRY_PARAMESTAMPE, 0);
      }
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("PRLIQ")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI577, IMDBDef17.PQSL_PARAMETRI577_NOMOGGDATELA, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Data di Elaborazione obbligatoria"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
        else
        {
          if (IDL.Year(IMDB.Value(IMDBDef17.PQRY_PARAMETRI577, IMDBDef17.PQSL_PARAMETRI577_NOMOGGDATELA, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("La data di Elaborazione non appartiene all'eserciz"));
            MainFrm.set_AlertMessage(S); 
            return 0;
          }
        }
      }
      // 
      // TO DO
      // 
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("PRLIQ")), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Prospetto_disponibilita_liquide"));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMSTA, 0, new IDVariant(S));
        // 
        // ------------------- lancio stampa jasper ---------
        // ------------
        // 
        IMDB.TblMoveFirst (IMDBDef17.PQRY_STRUPARASTAM_RS, 0);
        while (!IMDB.Eof(IMDBDef17.PQRY_STRUPARASTAM_RS, 0))
        {
          MainFrm.SetParametroStampaJasper(IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM_RS, IMDBDef17.PQSL_STRUPARASTAM_COD_PARAM, 0), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef17.PQRY_STRUPARASTAM_RS, IMDBDef17.PQSL_STRUPARASTAM_IMPORTO_1, 0),(new IDVariant(0)))));
          IMDB.TblMoveNext(IMDBDef17.PQRY_STRUPARASTAM_RS, 0);
        }
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_ELAB")), IDL.ToString(IMDB.Value(IMDBDef17.PQRY_PARAMETRI577, IMDBDef17.PQSL_PARAMETRI577_NOMOGGDATELA, 0)));
      }
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("LMPC13")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILCONSMONPARBIL(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IDL.ToDateTime(IMDB.Value(IMDBDef17.PQRY_PARAMETRI574, IMDBDef17.PQSL_PARAMETRI574_NOMOGGDAFITR, 0)), IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMEOGGIDSTA, 0), IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOTSTA, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_TRIMESTRE")), IDL.ToString(IMDB.Value(IMDBDef17.PQRY_PARAMETRI574, IMDBDef17.PQSL_PARAMETRI574_NOMOGGDAFITR, 0)));
      }
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("LVV17")), true) || IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("LVVA17")), true))
      {
        IDVariant v_STAMPA = new IDVariant(0,IDVariant.STRING);
        v_STAMPA = (new IDVariant("Verifica_Vincoli_FP_2017"));
        MainFrm.Cf4armDBObject.WORKBILPREVVERVINCFP2017(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMEOGGEVARI, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI577, IMDBDef17.PQSL_PARAMETRI577_NOMOGGDATELA, 0), IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMEOGGIDSTA, 0), IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOTSTA, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("TIPO_VAR")), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMEOGGEVARI, 0));
      }
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("EBT14")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILAGGE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMEOGGEVARI, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI577, IMDBDef17.PQSL_PARAMETRI577_NOMOGGDATELA, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_ELAB")), IDL.ToString(IMDB.Value(IMDBDef17.PQRY_PARAMETRI577, IMDBDef17.PQSL_PARAMETRI577_NOMOGGDATELA, 0)));
      }
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0).equals((new IDVariant("SBT14")), true))
      {
        MainFrm.Cf4armDBObject.WORKBILAGGS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMEOGGEVARI, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI577, IMDBDef17.PQSL_PARAMETRI577_NOMOGGDATELA, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_ELAB")), IDL.ToString(IMDB.Value(IMDBDef17.PQRY_PARAMETRI577, IMDBDef17.PQSL_PARAMETRI577_NOMOGGDATELA, 0)));
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
      MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOOGSTNUDIPA, 0));
      MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMEOGGIDSTA, 0), IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMSTA, 0), IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOTSTA, 0), IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMFIL, 0), (new IDVariant("pdf")));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // PARAMETRI STAMPE
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void ETICHEELABOR_PARAMESTAMPE() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.QRY_PARAMESTAMPE);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI_STAMPE, 0))
    {
      IMDB.TblAddNew(IMDBDef17.QRY_PARAMESTAMPE, 0);
      IMDB.TblLinkRow(IMDBDef17.QRY_PARAMESTAMPE, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
      IMDB.TblLinkField(IMDBDef17.QRY_PARAMESTAMPE, 0, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_STAMPA, 0);
      IMDB.TblLinkField(IMDBDef17.QRY_PARAMESTAMPE, 1, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM, 0);
      IMDB.TblLinkField(IMDBDef17.QRY_PARAMESTAMPE, 2, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_1, 0);
      IMDB.TblLinkField(IMDBDef17.QRY_PARAMESTAMPE, 3, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_2, 0);
      IMDB.TblLinkField(IMDBDef17.QRY_PARAMESTAMPE, 4, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_3, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI_STAMPE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.QRY_PARAMESTAMPE, 0);
  }

  // **********************************************************************
  // Riempi IMDB
  // **********************************************************************
  public int RiempiIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi IMDB Body
      // Corpo Procedura
      // 
      RIEMPIIMDB_PARASTAMDELE();
      RIEMPIIMDB_PARSTAININSE();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // PARAMETRI STAMPE: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_PARASTAMDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef7.TBL_PARAMETRI_STAMPE);
  }

  // **********************************************************************
  // PARAMETRI STAMPE: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_PARSTAININSE() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COD_STAMPA as STRPARSTCOST, ");
    SQL.append("  A.COD_PARAM as STRPARSTCOPA, ");
    SQL.append("  A.ORDINE as STRPARSTAORD, ");
    SQL.append("  B.ESERCIZIO as PARASTAMESER, ");
    SQL.append("  B.IMPORTO_1 as PARASTAMIMP1, ");
    SQL.append("  B.IMPORTO_2 as PARASTAMIMP2, ");
    SQL.append("  B.IMPORTO_3 as PARASTAMIMP3, ");
    SQL.append("  A.LABEL_RIGA as STRPARSTLARI, ");
    SQL.append("  A.NUM_MAX_IMPORTI as STPASTNUMAIM, ");
    SQL.append("  A.LABEL_COL_IMP1 as STPASTLACOI1, ");
    SQL.append("  A.LABEL_COL_IMP2 as STPASTLACOI2, ");
    SQL.append("  A.LABEL_COL_IMP3 as STPASTLACOIM ");
    SQL.append("from ");
    SQL.append("  STRUTTURA_PARAMETRI_STAMPE A, ");
    SQL.append("  PARAMETRI_STAMPE B ");
    SQL.append("where (A.COD_STAMPA = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN A.ESERCIZIO_INIZIO AND NVL(A.ESERCIZIO_FINE, 9999))) ");
    SQL.append("and   (B.COD_STAMPA(+) = A.COD_STAMPA) ");
    SQL.append("and   (B.COD_PARAM(+) = A.COD_PARAM) ");
    SQL.append("and   (B.ESERCIZIO(+) = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("order by ");
    SQL.append("  A.ORDINE ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_COD_STAMPA,0,RS.Get(1));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM,0,RS.Get(2));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_ORDINE,0,RS.Get(3));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_ESERCIZIO,0,RS.Get(4));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_1,0,RS.Get(5));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_2,0,RS.Get(6));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_3,0,RS.Get(7));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_RIGA,0,RS.Get(8));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_NUM_MAX_IMPORTI,0,RS.Get(9));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_COL_IMP1,0,RS.Get(10));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_COL_IMP2,0,RS.Get(11));
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI_STAMPE,IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_COL_IMP3,0,RS.Get(12));
      RS.MoveNext();
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "ApriInfoDelibera", _e);
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
      MainFrm.ErrObj.ProcError ("StampaConParametri", "ApriDelibera", _e);
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
      MainFrm.ErrObj.ProcError ("StampaConParametri", "ApriProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Dettaglio LMPC13
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaDettaglioLMPC13 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Dettaglio LMPC13 Body
      // Corpo Procedura
      // 
      IDVariant v_NOMESTAMPA = null;
      v_NOMESTAMPA = (new IDVariant("Monitoraggio_Bilancio_Dettaglio_A3"));
      // 
      // Lancio stampa dettaglio rigo A3 del monitoraggio bilancio
      // consuntivo
      // 
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_ELAB")), IDL.ToString(IMDB.Value(IMDBDef17.PQRY_PARAMETRI574, IMDBDef17.PQSL_PARAMETRI574_NOMOGGDAFITR, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ENTE")), IDL.NullValue(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DENOMINAZIONE, 0),(new IDVariant(""))));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "EtichettaDettaglioLMPC13", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Provvedimento On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PROVVEDIMENT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Provvedimento On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PROVVEDIMENT_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PROVVEDIMENT_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO, 0)));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PROVVEDIMENT_DELIBERA)), true) || Column.equals((new IDVariant(PFL_PROVVEDIMENT_NUMERODELIBE)), true) || Column.equals((new IDVariant(PFL_PROVVEDIMENT_ANNODELIBERA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL, 0))))
        {
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNPRO, 0, (new IDVariant()));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PROVVEDIMENT_PROPOSTA)), true) || Column.equals((new IDVariant(PFL_PROVVEDIMENT_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_PROVVEDIMENT_ANNOPROPOSTA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNPRO, 0))))
        {
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PROVVEDIMENT_VARIAZIONI)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMEOGGEVARI, 0).equals((new IDVariant("P")), true))
        {
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "ProvvedimentoOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Provvedimento On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROVVEDIMENT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PROVVEDIMENT);
      // 
      // Provvedimento On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMEOGGEVARI, 0).equals((new IDVariant("P")), true))
      {
        PAN_PROVVEDIMENT.SetFlags (Glb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROVVEDIMENT.SetFlags (Glb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROVVEDIMENT.SetFlags (Glb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROVVEDIMENT.SetFlags (Glb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PROVVEDIMENT.SetFlags (Glb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PROVVEDIMENT.SetFlags (Glb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROVVEDIMENT.SetFlags (Glb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROVVEDIMENT.SetFlags (Glb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PROVVEDIMENT.SetFlags (Glb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI578, IMDBDef17.PQSL_PARAMETRI578_NOMOGGANNDEL, 0))))
        {
          PAN_PROVVEDIMENT.SetFlags (Glb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PROVVEDIMENT.SetFlags (Glb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaConParametri", "ProvvedimentoOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // PARAMETRI
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void STAMPCONPARA_PARAMETRI574() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI574_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI689, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI689, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI574_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI574_RS, 0, IMDBDef7.TBL_PARAMETRI689, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI574_RS, 0, 0, IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI574_RS, 1, 0, IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGDAFITR, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI689, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI689, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI689, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI574_RS, 0);
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void STAMPCONPARA_PARAMETRI578() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI578_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI689, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI689, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI578_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI578_RS, 0, IMDBDef7.TBL_PARAMETRI689, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI578_RS, 0, 0, IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMEOGGEVARI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI578_RS, 1, 0, IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI578_RS, 2, 0, IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI578_RS, 3, 0, IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGANNDEL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI578_RS, 4, 0, IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI578_RS, 5, 0, IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI578_RS, 6, 0, IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGANNPRO, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI689, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI689, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI689, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI578_RS, 0);
  }

  // **********************************************************************
  // STRUTTURA PARAMETRI STAMPE
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void STAMPCONPARA_STRUPARASTAM() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_STRUPARASTAM_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI_STAMPE, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_STRUPARASTAM_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_STRUPARASTAM_RS, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_STRUPARASTAM_RS, 0, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_RIGA, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_STRUPARASTAM_RS, 1, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_ORDINE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_STRUPARASTAM_RS, 2, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_NUM_MAX_IMPORTI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_STRUPARASTAM_RS, 3, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_1, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_STRUPARASTAM_RS, 4, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_2, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_STRUPARASTAM_RS, 5, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_3, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_STRUPARASTAM_RS, 6, 0, IMDBDef7.TBL_PARAMETRI_STAMPE, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI_STAMPE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI_STAMPE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef17.PQRY_STRUPARASTAM_RS);
    IMDB.TblSortBy(IMDBDef17.PQRY_STRUPARASTAM_RS,1,true);
    IMDB.TblStartSort(IMDBDef17.PQRY_STRUPARASTAM_RS);
    IMDB.TblMoveFirst(IMDBDef17.PQRY_STRUPARASTAM_RS, 0);
  }

  // **********************************************************************
  // PARAMETRI
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void STAMPCONPARA_PARAMETRI577() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI577_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI689, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI689, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI577_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI577_RS, 0, IMDBDef7.TBL_PARAMETRI689, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI577_RS, 0, 0, IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI577_RS, 1, 0, IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGDATELA, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI689, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI689, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI689, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI577_RS, 0);
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
  private void PAN_DATAFINETRIM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DATAFINETRIM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DATAFINETRIM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DATAFINETRIM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DATAFINETRIM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DATAFINETRIM);
    // Stub
  }

  private void PAN_DATAFINETRIM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DATAFINETRIM_ETISTARIA4LM)
    {
      this.IdxPanelActived = this.PAN_DATAFINETRIM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaDettaglioLMPC13();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DATAFINETRIM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DATAFINETRIM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DATAFINETRIM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PROVVEDIMENT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PROVVEDIMENT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROVVEDIMENT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROVVEDIMENT, Cancel);
    // Stub
  }

  private void PAN_PROVVEDIMENT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PROVVEDIMENT_APRISCELDELI)
    {
      this.IdxPanelActived = this.PAN_PROVVEDIMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PROVVEDIMENT_APRIINFODELI)
    {
      this.IdxPanelActived = this.PAN_PROVVEDIMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PROVVEDIMENT_APRISCELPROP)
    {
      this.IdxPanelActived = this.PAN_PROVVEDIMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PROVVEDIMENT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PROVVEDIMENT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PROVVEDIMENT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROVVEDIMENT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_STAMPA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_STAMPA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_STAMPA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STAMPA, Cancel);
    // Stub
  }

  private void PAN_STAMPA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_STAMPA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_STAMPA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_STAMPA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_STAMPA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DATAELABPAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DATAELABPAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DATAELABPAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DATAELABPAR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DATAELABPAR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DATAELABPAR);
    // Stub
  }

  private void PAN_DATAELABPAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DATAELABPAR_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_DATAELABPAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DATAELABPAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DATAELABPAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DATAELABPAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DATAFINETRIM_Init()
  {

    PAN_DATAFINETRIM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DATAFINETRIM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DATAFINETRIM.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_DATAFINETRIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, "DA02FEE9-8103-4E45-A580-0A081223A1A4");
    PAN_DATAFINETRIM.set_Header(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, "Data Fine Trimestre");
    PAN_DATAFINETRIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, "");
    PAN_DATAFINETRIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, MyGlb.VIS_NORMFIELPADR);
    PAN_DATAFINETRIM.SetFlags(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATAFINETRIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, "8EA47877-60AF-4096-9058-B1BA30E086FF");
    PAN_DATAFINETRIM.set_Header(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, "Codice Stampa");
    PAN_DATAFINETRIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, "");
    PAN_DATAFINETRIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DATAFINETRIM.SetFlags(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DATAFINETRIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, "F3C490DB-4E1D-4857-B3D7-676E57CFE79F");
    PAN_DATAFINETRIM.set_Header(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, "Dettaglio Rigo A4");
    PAN_DATAFINETRIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, "Stampa dettaglio rigo A4 dellla stampa Monitoraggio del Pareggio di Bilancio");
    PAN_DATAFINETRIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, MyGlb.VIS_STATICBUTTON);
    PAN_DATAFINETRIM.SetImage(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, 0, "button1.gif", false);
    PAN_DATAFINETRIM.SetFlags(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_DATAFINETRIM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DATAFINETRIM.SetRect(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATAFINETRIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, MyGlb.PANEL_LIST, 124);
    PAN_DATAFINETRIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, MyGlb.PANEL_LIST, 1);
    PAN_DATAFINETRIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, MyGlb.PANEL_LIST, "Data Fine Trimestre");
    PAN_DATAFINETRIM.SetRect(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, MyGlb.PANEL_FORM, 20, 8, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATAFINETRIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, MyGlb.PANEL_FORM, 128);
    PAN_DATAFINETRIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, MyGlb.PANEL_FORM, 1);
    PAN_DATAFINETRIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_DATAFINETRIM, MyGlb.PANEL_FORM, "Data Fine Trimestre");
    PAN_DATAFINETRIM.SetFieldPage(PFL_DATAFINETRIM_DATAFINETRIM, -1, -1);
    PAN_DATAFINETRIM.SetFieldPanel(PFL_DATAFINETRIM_DATAFINETRIM, PPQRY_PARAMETRI574, "A.NOMOGGDAFITR", "NOMOGGDAFITR", 5, 10, 0, -13997);
    PAN_DATAFINETRIM.SetRect(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATAFINETRIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, MyGlb.PANEL_LIST, 92);
    PAN_DATAFINETRIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, MyGlb.PANEL_LIST, 1);
    PAN_DATAFINETRIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, MyGlb.PANEL_LIST, "Codice Stampa");
    PAN_DATAFINETRIM.SetRect(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, MyGlb.PANEL_FORM, 4, 100, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATAFINETRIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, MyGlb.PANEL_FORM, 92);
    PAN_DATAFINETRIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, MyGlb.PANEL_FORM, 1);
    PAN_DATAFINETRIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_CODICESTAMP1, MyGlb.PANEL_FORM, "Codice Stampa");
    PAN_DATAFINETRIM.SetFieldPage(PFL_DATAFINETRIM_CODICESTAMP1, -1, -1);
    PAN_DATAFINETRIM.SetFieldPanel(PFL_DATAFINETRIM_CODICESTAMP1, PPQRY_PARAMETRI574, "A.COD_STAMPA", "COD_STAMPA", 5, 50, 0, -13997);
    PAN_DATAFINETRIM.SetRect(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, MyGlb.PANEL_LIST, 784, 476, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATAFINETRIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, MyGlb.PANEL_LIST, 0);
    PAN_DATAFINETRIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, MyGlb.PANEL_LIST, 1);
    PAN_DATAFINETRIM.SetRect(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, MyGlb.PANEL_FORM, 304, 4, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATAFINETRIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, MyGlb.PANEL_FORM, 0);
    PAN_DATAFINETRIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATAFINETRIM_ETISTARIA4LM, MyGlb.PANEL_FORM, 1);
    PAN_DATAFINETRIM.SetFieldPage(PFL_DATAFINETRIM_ETISTARIA4LM, -1, -1);
    PAN_DATAFINETRIM.SetFieldPanel(PFL_DATAFINETRIM_ETISTARIA4LM, -1, "", "ETISTARIA4LM", 0, 0, 0, -13997);
    PAN_DATAFINETRIM.set_ImageResizeMode(PFL_DATAFINETRIM_ETISTARIA4LM, 3);
  }

  private void PAN_DATAFINETRIM_InitQueries()
  {
    StringBuffer SQL;

    PAN_DATAFINETRIM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DATAFINETRIM.SetIMDB(IMDB, "PQRY_PARAMETRI574", true);
    PAN_DATAFINETRIM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_DATAFINETRIM.SetQueryIMDB(PPQRY_PARAMETRI574, IMDBDef17.PQRY_PARAMETRI574_RS, IMDBDef7.TBL_PARAMETRI689);
    JustLoaded = true;
    PAN_DATAFINETRIM.SetFieldPrimaryIndex(PFL_DATAFINETRIM_DATAFINETRIM, IMDBDef7.FLD_PARAMETRI689_NOMOGGDAFITR);
    PAN_DATAFINETRIM.SetFieldPrimaryIndex(PFL_DATAFINETRIM_CODICESTAMP1, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA);
    PAN_DATAFINETRIM.SetMasterTable(0, "PARAMETRI689");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DATAFINETRIM.Status() == 2)
    {
      int oldListQBE = PAN_DATAFINETRIM.iUseListQBE;
      PAN_DATAFINETRIM.iUseListQBE = 0;
      PAN_DATAFINETRIM.PanelCommand(Glb.PCM_SEARCH);
      PAN_DATAFINETRIM.PanelCommand(Glb.PCM_FIND);
      PAN_DATAFINETRIM.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PROVVEDIMENT_Init()
  {

    PAN_PROVVEDIMENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROVVEDIMENT.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_VARIAZIONI, "C2089D03-5F32-422A-BFBB-D1EC72B73206");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_VARIAZIONI, "Variazioni");
    PAN_PROVVEDIMENT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_VARIAZIONI, "");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_VARIAZIONI, MyGlb.PANEL_LIST, 264, -9999, 80, 16, 0, 0);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_VARIAZIONI, MyGlb.PANEL_FORM, 16, 7, 156, 49, 0, 0);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_VARIAZIONI, 0, 55);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_VARIAZIONI, 1, 13);
    PAN_PROVVEDIMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_VARIAZIONI, 0, 4);
    PAN_PROVVEDIMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_VARIAZIONI, 1, 4);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_PROVVEDIMENT, "6BEBB362-CC0D-4FA9-B2B9-D3FBD76A06E0");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_PROVVEDIMENT, "Provvedimento");
    PAN_PROVVEDIMENT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_PROVVEDIMENT, "");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_PROVVEDIMENT, MyGlb.PANEL_LIST, 544, -9999, 272, 16, 0, 0);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_PROVVEDIMENT, MyGlb.PANEL_FORM, 180, 7, 584, 49, 0, 0);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_PROVVEDIMENT, 0, 87);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_PROVVEDIMENT, 1, 13);
    PAN_PROVVEDIMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_PROVVEDIMENT, 0, 4);
    PAN_PROVVEDIMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_PROVVEDIMENT, 1, 4);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_GROUP, GRP_PROVVEDIMENT_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PROVVEDIMENT.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, "18C21353-730F-4458-9D45-52EF1021EEC8");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, "Variazioni");
    PAN_PROVVEDIMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, "");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, "5A60FBCF-9857-4091-9469-9E108E71EC07");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, "Delibera");
    PAN_PROVVEDIMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, "");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, "096126F1-9FD6-494D-BD94-8FA6787D9E8C");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, "Numero Delibera");
    PAN_PROVVEDIMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, "");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, "30375768-EC0A-4C19-B9C8-4EF8FC4A19A9");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, "Anno Delibera");
    PAN_PROVVEDIMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, "");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, "46B05CE4-3078-4106-8AF4-513CF4909D23");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, "Proposta");
    PAN_PROVVEDIMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, "");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, "F1C494E6-BBBE-4CA8-B1E9-3B06BE5FF26D");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, "Numero Proposta");
    PAN_PROVVEDIMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, "");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, "10E845C8-658E-400B-93CC-3F370DFC3EC3");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, "Anno Proposta");
    PAN_PROVVEDIMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, "");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIDELIBE, "5F39F370-7617-42DE-BEF9-0F70A380D408");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIDELIBE, "-");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRADELIBER, "85AE9330-39AC-4EB6-B0A3-84D660304BE7");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRADELIBER, "/");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, "51DB3AFE-444C-4C45-A0D7-21310CD972C1");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, "");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_PROVVEDIMENT.SetImage(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, 0, "wsearch1.gif", false);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, "5EC772F2-41DA-4759-BD94-330C0845C15D");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, "");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, MyGlb.VIS_STATICBUTTON);
    PAN_PROVVEDIMENT.SetImage(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, 0, "info.gif", false);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIPROPOS, "6F70E954-E788-48C9-83FD-059EBDB72673");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIPROPOS, "-");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRAPROPOST, "9C22099E-280C-4C4A-BA9F-2B0F460EC9C9");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRAPROPOST, "/");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PROVVEDIMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELPROP, "D27131E4-45E2-4CF2-88E8-F019C92B7212");
    PAN_PROVVEDIMENT.set_Header(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELPROP, "");
    PAN_PROVVEDIMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PROVVEDIMENT.SetImage(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELPROP, 0, "wsearch1.gif", false);
    PAN_PROVVEDIMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PROVVEDIMENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, MyGlb.PANEL_FORM, 20, 32, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, MyGlb.PANEL_FORM, 128);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_VARIAZIONI, -1, GRP_PROVVEDIMENT_VARIAZIONI);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_VARIAZIONI, PPQRY_PARAMETRI578, "A.NOMEOGGEVARI", "NOMEOGGEVARI", 5, 1, 0, -13997);
    PAN_PROVVEDIMENT.SetValueListItem(PFL_PROVVEDIMENT_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_PROVVEDIMENT.SetValueListItem(PFL_PROVVEDIMENT_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, MyGlb.PANEL_FORM, 184, 32, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_DELIBERA, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_DELIBERA, PPQRY_PARAMETRI578, "A.NOMOGGSEDDEL", "NOMOGGSEDDEL", 5, 4, 0, -13997);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, MyGlb.PANEL_LIST, "N. Dl.");
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, MyGlb.PANEL_FORM, 304, 32, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, MyGlb.PANEL_FORM, 96);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_NUMERODELIBE, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_NUMERODELIBE, PPQRY_PARAMETRI578, "A.NOMOGGNUMDEL", "NOMOGGNUMDEL", 1, 5, 0, -13997);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, MyGlb.PANEL_LIST, 624, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, MyGlb.PANEL_LIST, "A. Dl.");
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, MyGlb.PANEL_FORM, 364, 32, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, MyGlb.PANEL_FORM, 128);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_ANNODELIBERA, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_ANNODELIBERA, PPQRY_PARAMETRI578, "A.NOMOGGANNDEL", "NOMOGGANNDEL", 1, 4, 0, -13997);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, MyGlb.PANEL_FORM, 448, 32, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_PROPOSTA, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_PROPOSTA, PPQRY_PARAMETRI578, "A.NOMOGGUNIPRO", "NOMOGGUNIPRO", 5, 8, 0, -13997);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. Pr.");
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, MyGlb.PANEL_FORM, 644, 32, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, MyGlb.PANEL_FORM, 128);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_NUMEROPROPOS, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_NUMEROPROPOS, PPQRY_PARAMETRI578, "A.NOMOGGNUMPRO", "NOMOGGNUMPRO", 1, 4, 0, -13997);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. Pr.");
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 704, 32, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_ANNOPROPOSTA, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_ANNOPROPOSTA, PPQRY_PARAMETRI578, "A.NOMOGGANNPRO", "NOMOGGANNPRO", 1, 4, 0, -13997);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIDELIBE, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIDELIBE, MyGlb.PANEL_FORM, 284, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_TRATTIDELIBE, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRADELIBER, MyGlb.PANEL_LIST, 164, 272, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRADELIBER, MyGlb.PANEL_FORM, 344, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_BARRADELIBER, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, MyGlb.PANEL_LIST, 508, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, MyGlb.PANEL_FORM, 404, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_APRISCELDELI, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_APRISCELDELI, -1, "", "APRISCELDELI", 0, 0, 0, -13997);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, MyGlb.PANEL_LIST, 516, 264, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, MyGlb.PANEL_LIST, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, MyGlb.PANEL_FORM, 424, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, MyGlb.PANEL_FORM, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRIINFODELI, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_APRIINFODELI, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_APRIINFODELI, -1, "", "APRIINFODELI", 0, 0, 0, -13997);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIPROPOS, MyGlb.PANEL_LIST, 180, 288, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIPROPOS, MyGlb.PANEL_FORM, 624, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_TRATTIPROPOS, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRAPROPOST, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRAPROPOST, MyGlb.PANEL_FORM, 684, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_BARRAPROPOST, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELPROP, MyGlb.PANEL_LIST, 500, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_PROVVEDIMENT.SetRect(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELPROP, MyGlb.PANEL_FORM, 744, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROVVEDIMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_PROVVEDIMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROVVEDIMENT_APRISCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_PROVVEDIMENT.SetFieldPage(PFL_PROVVEDIMENT_APRISCELPROP, -1, GRP_PROVVEDIMENT_PROVVEDIMENT);
    PAN_PROVVEDIMENT.SetFieldPanel(PFL_PROVVEDIMENT_APRISCELPROP, -1, "", "APRISCELPROP", 0, 0, 0, -13997);
  }

  private void PAN_PROVVEDIMENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROVVEDIMENT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PROVVEDIMENT.SetIMDB(IMDB, "PQRY_PARAMETRI578", true);
    PAN_PROVVEDIMENT.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PROVVEDIMENT.SetQueryIMDB(PPQRY_PARAMETRI578, IMDBDef17.PQRY_PARAMETRI578_RS, IMDBDef7.TBL_PARAMETRI689);
    JustLoaded = true;
    PAN_PROVVEDIMENT.SetFieldPrimaryIndex(PFL_PROVVEDIMENT_VARIAZIONI, IMDBDef7.FLD_PARAMETRI689_NOMEOGGEVARI);
    PAN_PROVVEDIMENT.SetFieldPrimaryIndex(PFL_PROVVEDIMENT_DELIBERA, IMDBDef7.FLD_PARAMETRI689_NOMOGGSEDDEL);
    PAN_PROVVEDIMENT.SetFieldPrimaryIndex(PFL_PROVVEDIMENT_NUMERODELIBE, IMDBDef7.FLD_PARAMETRI689_NOMOGGNUMDEL);
    PAN_PROVVEDIMENT.SetFieldPrimaryIndex(PFL_PROVVEDIMENT_ANNODELIBERA, IMDBDef7.FLD_PARAMETRI689_NOMOGGANNDEL);
    PAN_PROVVEDIMENT.SetFieldPrimaryIndex(PFL_PROVVEDIMENT_PROPOSTA, IMDBDef7.FLD_PARAMETRI689_NOMOGGUNIPRO);
    PAN_PROVVEDIMENT.SetFieldPrimaryIndex(PFL_PROVVEDIMENT_NUMEROPROPOS, IMDBDef7.FLD_PARAMETRI689_NOMOGGNUMPRO);
    PAN_PROVVEDIMENT.SetFieldPrimaryIndex(PFL_PROVVEDIMENT_ANNOPROPOSTA, IMDBDef7.FLD_PARAMETRI689_NOMOGGANNPRO);
    PAN_PROVVEDIMENT.SetMasterTable(0, "PARAMETRI689");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROVVEDIMENT.Status() == 2)
    {
      int oldListQBE = PAN_PROVVEDIMENT.iUseListQBE;
      PAN_PROVVEDIMENT.iUseListQBE = 0;
      PAN_PROVVEDIMENT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROVVEDIMENT.PanelCommand(Glb.PCM_FIND);
      PAN_PROVVEDIMENT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_STAMPA_Init()
  {

    PAN_STAMPA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STAMPA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_STAMPA.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_STAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, "711FC233-12EB-4C7E-809D-1D799F139D3C");
    PAN_STAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, "COD PARAM");
    PAN_STAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, "");
    PAN_STAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, "E4764AF5-5510-4DE2-BC9B-61FE696A5DF6");
    PAN_STAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, "Nome Parametro");
    PAN_STAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, "");
    PAN_STAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, MyGlb.VIS_VUOTOINLISTA);
    PAN_STAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, "3276BF87-FD95-4B43-A9E9-718AF010FA00");
    PAN_STAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, "Importo");
    PAN_STAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, "");
    PAN_STAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, MyGlb.VIS_IMPOINPARSTA);
    PAN_STAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, "93006199-91F7-4E98-A32E-54E07C9D76F3");
    PAN_STAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, "IMPORTO 2");
    PAN_STAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, "");
    PAN_STAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, MyGlb.VIS_IMPOINPARSTA);
    PAN_STAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, "8547D846-CEC5-498E-B87A-434480E8BF82");
    PAN_STAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, "IMPORTO 3");
    PAN_STAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, "");
    PAN_STAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, MyGlb.VIS_IMPOINPARSTA);
    PAN_STAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, "D660C13C-5778-4A51-BD75-9042C5CFE4BF");
    PAN_STAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, "NUM MAX IMPORTI");
    PAN_STAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, "");
    PAN_STAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, MyGlb.VIS_NORMFIELPADR);
    PAN_STAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, "2517E4BB-0E02-40F2-86EE-2BD3C6A00802");
    PAN_STAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, "STRUTTURA PARAMETRI STAMPE ORDINE");
    PAN_STAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, "");
    PAN_STAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, MyGlb.VIS_NORMFIELPADR);
    PAN_STAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_STAMPA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, MyGlb.PANEL_LIST, 720, 12, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, MyGlb.PANEL_LIST, 76);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, MyGlb.PANEL_LIST, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, MyGlb.PANEL_LIST, "COD PARAM");
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, MyGlb.PANEL_FORM, 4, 100, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, MyGlb.PANEL_FORM, 76);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, MyGlb.PANEL_FORM, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_CODPARAM, MyGlb.PANEL_FORM, "COD PARAM");
    PAN_STAMPA.SetFieldPage(PFL_STAMPA_CODPARAM, -1, -1);
    PAN_STAMPA.SetFieldPanel(PFL_STAMPA_CODPARAM, PPQRY_STRUPARASTAM, "A.COD_PARAM", "COD_PARAM", 5, 10, 0, -13997);
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, MyGlb.PANEL_LIST, 0, 12, 600, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, MyGlb.PANEL_LIST, 100);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, MyGlb.PANEL_LIST, 3);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, MyGlb.PANEL_LIST, "Nome Parametro");
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, MyGlb.PANEL_FORM, 4, 76, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, MyGlb.PANEL_FORM, 100);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, MyGlb.PANEL_FORM, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_LABELCOLIMP1, MyGlb.PANEL_FORM, "Nm. Parametro");
    PAN_STAMPA.SetFieldPage(PFL_STAMPA_LABELCOLIMP1, -1, -1);
    PAN_STAMPA.SetFieldPanel(PFL_STAMPA_LABELCOLIMP1, PPQRY_STRUPARASTAM, "A.LABEL_RIGA", "LABEL_RIGA", 5, 500, 0, -13997);
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, MyGlb.PANEL_LIST, 600, 12, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, MyGlb.PANEL_LIST, 72);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, MyGlb.PANEL_FORM, 4, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, MyGlb.PANEL_FORM, 72);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_STAMPA.SetFieldPage(PFL_STAMPA_IMPORTO1, -1, -1);
    PAN_STAMPA.SetFieldPanel(PFL_STAMPA_IMPORTO1, PPQRY_STRUPARASTAM, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, MyGlb.PANEL_LIST, 740, 12, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, MyGlb.PANEL_LIST, 72);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, MyGlb.PANEL_LIST, "IMPORTO 2");
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, MyGlb.PANEL_FORM, 4, 28, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, MyGlb.PANEL_FORM, 72);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO2, MyGlb.PANEL_FORM, "IMPORTO 2");
    PAN_STAMPA.SetFieldPage(PFL_STAMPA_IMPORTO2, -1, -1);
    PAN_STAMPA.SetFieldPanel(PFL_STAMPA_IMPORTO2, PPQRY_STRUPARASTAM, "A.IMPORTO_2", "IMPORTO_2", 3, 14, 2, -13997);
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, MyGlb.PANEL_LIST, 880, 12, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, MyGlb.PANEL_LIST, 72);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, MyGlb.PANEL_LIST, "IMPORTO 3");
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, MyGlb.PANEL_FORM, 72);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_IMPORTO3, MyGlb.PANEL_FORM, "IMPORTO 3");
    PAN_STAMPA.SetFieldPage(PFL_STAMPA_IMPORTO3, -1, -1);
    PAN_STAMPA.SetFieldPanel(PFL_STAMPA_IMPORTO3, PPQRY_STRUPARASTAM, "A.IMPORTO_3", "IMPORTO_3", 3, 14, 2, -13997);
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, MyGlb.PANEL_LIST, 496, 12, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, MyGlb.PANEL_LIST, 116);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, MyGlb.PANEL_LIST, "NUM MAX IMPORTI");
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, MyGlb.PANEL_FORM, 4, 100, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, MyGlb.PANEL_FORM, 116);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, MyGlb.PANEL_FORM, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_NUMMAXIMPORT, MyGlb.PANEL_FORM, "NUM MAX IMPORTI");
    PAN_STAMPA.SetFieldPage(PFL_STAMPA_NUMMAXIMPORT, -1, -1);
    PAN_STAMPA.SetFieldPanel(PFL_STAMPA_NUMMAXIMPORT, PPQRY_STRUPARASTAM, "A.NUM_MAX_IMPORTI", "NUM_MAX_IMPORTI", 1, 2, 0, -13997);
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, MyGlb.PANEL_LIST, 0, 12, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, MyGlb.PANEL_LIST, 240);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, MyGlb.PANEL_LIST, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, MyGlb.PANEL_LIST, "STRUTTURA PARAMETRI STAMPE ORDINE");
    PAN_STAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, MyGlb.PANEL_FORM, 4, 124, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, MyGlb.PANEL_FORM, 240);
    PAN_STAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, MyGlb.PANEL_FORM, 1);
    PAN_STAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STAMPA_STRPARSTAORD, MyGlb.PANEL_FORM, "STRUTTURA PARAMETRI STAMPE ORDINE");
    PAN_STAMPA.SetFieldPage(PFL_STAMPA_STRPARSTAORD, -1, -1);
    PAN_STAMPA.SetFieldPanel(PFL_STAMPA_STRPARSTAORD, PPQRY_STRUPARASTAM, "A.ORDINE", "ORDINE", 3, 10, 0, -13997);
  }

  private void PAN_STAMPA_InitQueries()
  {
    StringBuffer SQL;

    PAN_STAMPA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_STAMPA.SetIMDB(IMDB, "PQRY_STRUPARASTAM", true);
    PAN_STAMPA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_STAMPA.SetQueryIMDB(PPQRY_STRUPARASTAM, IMDBDef17.PQRY_STRUPARASTAM_RS, IMDBDef7.TBL_PARAMETRI_STAMPE);
    JustLoaded = true;
    PAN_STAMPA.SetFieldPrimaryIndex(PFL_STAMPA_CODPARAM, IMDBDef7.FLD_PARAMETRI_STAMPE_COD_PARAM);
    PAN_STAMPA.SetFieldPrimaryIndex(PFL_STAMPA_LABELCOLIMP1, IMDBDef7.FLD_PARAMETRI_STAMPE_LABEL_RIGA);
    PAN_STAMPA.SetFieldPrimaryIndex(PFL_STAMPA_IMPORTO1, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_1);
    PAN_STAMPA.SetFieldPrimaryIndex(PFL_STAMPA_IMPORTO2, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_2);
    PAN_STAMPA.SetFieldPrimaryIndex(PFL_STAMPA_IMPORTO3, IMDBDef7.FLD_PARAMETRI_STAMPE_IMPORTO_3);
    PAN_STAMPA.SetFieldPrimaryIndex(PFL_STAMPA_NUMMAXIMPORT, IMDBDef7.FLD_PARAMETRI_STAMPE_NUM_MAX_IMPORTI);
    PAN_STAMPA.SetFieldPrimaryIndex(PFL_STAMPA_STRPARSTAORD, IMDBDef7.FLD_PARAMETRI_STAMPE_ORDINE);
    PAN_STAMPA.SetMasterTable(0, "PARAMETRI_STAMPE");
    PAN_STAMPA.AddToSortList(PFL_STAMPA_STRPARSTAORD, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STAMPA.Status() == 2)
    {
      int oldListQBE = PAN_STAMPA.iUseListQBE;
      PAN_STAMPA.iUseListQBE = 0;
      PAN_STAMPA.PanelCommand(Glb.PCM_SEARCH);
      PAN_STAMPA.PanelCommand(Glb.PCM_FIND);
      PAN_STAMPA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DATAELABPAR_Init()
  {

    PAN_DATAELABPAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DATAELABPAR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DATAELABPAR.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_DATAELABPAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, "4A0BE6AC-8A63-4BDD-89B5-20BF0C970BE0");
    PAN_DATAELABPAR.set_Header(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, "Data Elaborazione");
    PAN_DATAELABPAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, "");
    PAN_DATAELABPAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_DATAELABPAR.SetFlags(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATAELABPAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_ETICHEELABOR, "0E1D4031-1105-4928-8BA8-80815E04BCD5");
    PAN_DATAELABPAR.set_Header(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_ETICHEELABOR, "Elabora");
    PAN_DATAELABPAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_DATAELABPAR.SetImage(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_ETICHEELABOR, 0, "button1.gif", false);
    PAN_DATAELABPAR.SetFlags(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DATAELABPAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, "FEC25D31-238B-49F8-9B50-43DE949AD8BC");
    PAN_DATAELABPAR.set_Header(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, "Codice Stampa");
    PAN_DATAELABPAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, "");
    PAN_DATAELABPAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DATAELABPAR.SetFlags(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_DATAELABPAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DATAELABPAR.SetRect(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATAELABPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, MyGlb.PANEL_LIST, 112);
    PAN_DATAELABPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_DATAELABPAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_DATAELABPAR.SetRect(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, MyGlb.PANEL_FORM, 476, 24, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATAELABPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, MyGlb.PANEL_FORM, 116);
    PAN_DATAELABPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_DATAELABPAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_DATAELABPAR.SetFieldPage(PFL_DATAELABPAR_DATAELABORAZ, -1, -1);
    PAN_DATAELABPAR.SetFieldPanel(PFL_DATAELABPAR_DATAELABORAZ, PPQRY_PARAMETRI577, "A.NOMOGGDATELA", "NOMOGGDATELA", 6, 14, 0, -13997);
    PAN_DATAELABPAR.SetRect(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_ETICHEELABOR, MyGlb.PANEL_LIST, 776, 468, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DATAELABPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_DATAELABPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_DATAELABPAR.SetRect(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_ETICHEELABOR, MyGlb.PANEL_FORM, 688, 16, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATAELABPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_DATAELABPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_DATAELABPAR.SetFieldPage(PFL_DATAELABPAR_ETICHEELABOR, -1, -1);
    PAN_DATAELABPAR.SetFieldPanel(PFL_DATAELABPAR_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_DATAELABPAR.SetRect(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATAELABPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, MyGlb.PANEL_LIST, 92);
    PAN_DATAELABPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_DATAELABPAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, MyGlb.PANEL_LIST, "Codice Stampa");
    PAN_DATAELABPAR.SetRect(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, MyGlb.PANEL_FORM, 4, 76, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATAELABPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, MyGlb.PANEL_FORM, 92);
    PAN_DATAELABPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_DATAELABPAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATAELABPAR_CODICESTAMPA, MyGlb.PANEL_FORM, "Codice Stampa");
    PAN_DATAELABPAR.SetFieldPage(PFL_DATAELABPAR_CODICESTAMPA, -1, -1);
    PAN_DATAELABPAR.SetFieldPanel(PFL_DATAELABPAR_CODICESTAMPA, PPQRY_PARAMETRI577, "A.COD_STAMPA", "COD_STAMPA", 5, 50, 0, -13997);
  }

  private void PAN_DATAELABPAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_DATAELABPAR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DATAELABPAR.SetIMDB(IMDB, "PQRY_PARAMETRI577", true);
    PAN_DATAELABPAR.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_DATAELABPAR.SetQueryIMDB(PPQRY_PARAMETRI577, IMDBDef17.PQRY_PARAMETRI577_RS, IMDBDef7.TBL_PARAMETRI689);
    JustLoaded = true;
    PAN_DATAELABPAR.SetFieldPrimaryIndex(PFL_DATAELABPAR_DATAELABORAZ, IMDBDef7.FLD_PARAMETRI689_NOMOGGDATELA);
    PAN_DATAELABPAR.SetFieldPrimaryIndex(PFL_DATAELABPAR_CODICESTAMPA, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA);
    PAN_DATAELABPAR.SetMasterTable(0, "PARAMETRI689");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DATAELABPAR.Status() == 2)
    {
      int oldListQBE = PAN_DATAELABPAR.iUseListQBE;
      PAN_DATAELABPAR.iUseListQBE = 0;
      PAN_DATAELABPAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_DATAELABPAR.PanelCommand(Glb.PCM_FIND);
      PAN_DATAELABPAR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DATAFINETRIM) PAN_DATAFINETRIM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PROVVEDIMENT) PAN_PROVVEDIMENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_STAMPA) PAN_STAMPA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DATAELABPAR) PAN_DATAELABPAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATAFINETRIM) PAN_DATAFINETRIM_ValidateRow(Cancel);
    if (SrcObj == PAN_PROVVEDIMENT) PAN_PROVVEDIMENT_ValidateRow(Cancel);
    if (SrcObj == PAN_STAMPA) PAN_STAMPA_ValidateRow(Cancel);
    if (SrcObj == PAN_DATAELABPAR) PAN_DATAELABPAR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DATAFINETRIM) PAN_DATAFINETRIM_DynamicProperties();
    if (SrcObj == PAN_PROVVEDIMENT) PAN_PROVVEDIMENT_DynamicProperties();
    if (SrcObj == PAN_STAMPA) PAN_STAMPA_DynamicProperties();
    if (SrcObj == PAN_DATAELABPAR) PAN_DATAELABPAR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATAFINETRIM) PAN_DATAFINETRIM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PROVVEDIMENT) PAN_PROVVEDIMENT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_STAMPA) PAN_STAMPA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DATAELABPAR) PAN_DATAELABPAR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STAMPA) PAN_STAMPA_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_STAMPA) PAN_STAMPA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DATAFINETRIM) PAN_DATAFINETRIM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PROVVEDIMENT) PAN_PROVVEDIMENT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_STAMPA) PAN_STAMPA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DATAELABPAR) PAN_DATAELABPAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
