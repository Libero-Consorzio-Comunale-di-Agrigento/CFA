// **********************************************
// Dati Comunicazione Liq IVA
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DatiComunicazioneLiqIVA extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DATCOMLIQIVA_GRUPPO1 = 0;
  private static int GRP_DATCOMLIQIVA_GRUPPO2 = 1;
  private static int GRP_DATCOMLIQIVA_GRUPPO3 = 2;
  private static int GRP_DATCOMLIQIVA_ATTIVITRIMES = 3;
  private static int GRP_DATCOMLIQIVA_IMPALLPRETEL = 4;

  private static int PFL_DATCOMLIQIVA_ETICHEESERCI = 0;
  private static int PFL_DATCOMLIQIVA_ETICTRIMGENN = 1;
  private static int PFL_DATCOMLIQIVA_ETICIMPMASDA = 2;
  private static int PFL_DATCOMLIQIVA_ET2345781212 = 3;
  private static int PFL_DATCOMLIQIVA_ETICDEBIPREC = 4;
  private static int PFL_DATCOMLIQIVA_ETICCREDPREC = 5;
  private static int PFL_DATCOMLIQIVA_ETICIMPOVEND = 6;
  private static int PFL_DATCOMLIQIVA_ETICHIVAVEND = 7;
  private static int PFL_DATCOMLIQIVA_ETICIMPOACQU = 8;
  private static int PFL_DATCOMLIQIVA_ETICHIVAACQU = 9;
  private static int PFL_DATCOMLIQIVA_ETICHIVADOVU = 10;
  private static int PFL_DATCOMLIQIVA_ETICIMPDAVER = 11;
  private static int PFL_DATCOMLIQIVA_DEBITOPRECM1 = 12;
  private static int PFL_DATCOMLIQIVA_CREDITPRECM1 = 13;
  private static int PFL_DATCOMLIQIVA_IMPONIBVENM1 = 14;
  private static int PFL_DATCOMLIQIVA_DEBITI1 = 15;
  private static int PFL_DATCOMLIQIVA_IVAVENM1 = 16;
  private static int PFL_DATCOMLIQIVA_IMPONIBACQM1 = 17;
  private static int PFL_DATCOMLIQIVA_IVAACQM1 = 18;
  private static int PFL_DATCOMLIQIVA_IVADOVUTAM1 = 19;
  private static int PFL_DATCOMLIQIVA_IVACREDITOM1 = 20;
  private static int PFL_DATCOMLIQIVA_VERSAUTOUEM1 = 21;
  private static int PFL_DATCOMLIQIVA_CREDIIMPOSM1 = 22;
  private static int PFL_DATCOMLIQIVA_METODACCONM1 = 23;
  private static int PFL_DATCOMLIQIVA_ACCONDOVUTM1 = 24;
  private static int PFL_DATCOMLIQIVA_IMPODAVERSM1 = 25;
  private static int PFL_DATCOMLIQIVA_ETICIMPOACRE = 26;
  private static int PFL_DATCOMLIQIVA_IMPORACREDM1 = 27;
  private static int PFL_DATCOMLIQIVA_ETICIMPACRE1 = 28;
  private static int PFL_DATCOMLIQIVA_CREDITI = 29;
  private static int PFL_DATCOMLIQIVA_CREDANNPREM1 = 30;
  private static int PFL_DATCOMLIQIVA_ETICIMPACRE2 = 31;
  private static int PFL_DATCOMLIQIVA_DEBITOPRECM2 = 32;
  private static int PFL_DATCOMLIQIVA_CREDITPRECM2 = 33;
  private static int PFL_DATCOMLIQIVA_IMPONIBVENM2 = 34;
  private static int PFL_DATCOMLIQIVA_DEBITI2 = 35;
  private static int PFL_DATCOMLIQIVA_CREDITI1 = 36;
  private static int PFL_DATCOMLIQIVA_IVAVENM2 = 37;
  private static int PFL_DATCOMLIQIVA_IMPONIBACQM2 = 38;
  private static int PFL_DATCOMLIQIVA_IVAACQM2 = 39;
  private static int PFL_DATCOMLIQIVA_IVADOVUTAM2 = 40;
  private static int PFL_DATCOMLIQIVA_IVACREDITOM2 = 41;
  private static int PFL_DATCOMLIQIVA_CREDANNPREM2 = 42;
  private static int PFL_DATCOMLIQIVA_VERSAUTOUEM2 = 43;
  private static int PFL_DATCOMLIQIVA_CREDIIMPOSM2 = 44;
  private static int PFL_DATCOMLIQIVA_METODACCONM2 = 45;
  private static int PFL_DATCOMLIQIVA_ACCONDOVUTM2 = 46;
  private static int PFL_DATCOMLIQIVA_IMPODAVERSM2 = 47;
  private static int PFL_DATCOMLIQIVA_IMPORACREDM2 = 48;
  private static int PFL_DATCOMLIQIVA_ETICIMPACRE3 = 49;
  private static int PFL_DATCOMLIQIVA_DEBITOPRECM3 = 50;
  private static int PFL_DATCOMLIQIVA_CREDITPRECM3 = 51;
  private static int PFL_DATCOMLIQIVA_IMPONIBVENM3 = 52;
  private static int PFL_DATCOMLIQIVA_DEBITI3 = 53;
  private static int PFL_DATCOMLIQIVA_CREDITI2 = 54;
  private static int PFL_DATCOMLIQIVA_IVAVENM3 = 55;
  private static int PFL_DATCOMLIQIVA_IMPONIBACQM3 = 56;
  private static int PFL_DATCOMLIQIVA_IVAACQM3 = 57;
  private static int PFL_DATCOMLIQIVA_IVADOVUTAM3 = 58;
  private static int PFL_DATCOMLIQIVA_ETICIMPACRE4 = 59;
  private static int PFL_DATCOMLIQIVA_IVACREDITOM3 = 60;
  private static int PFL_DATCOMLIQIVA_CREDANNPREM3 = 61;
  private static int PFL_DATCOMLIQIVA_VERSAUTOUEM3 = 62;
  private static int PFL_DATCOMLIQIVA_CREDIIMPOSM3 = 63;
  private static int PFL_DATCOMLIQIVA_METODACCONM3 = 64;
  private static int PFL_DATCOMLIQIVA_ACCONDOVUTM3 = 65;
  private static int PFL_DATCOMLIQIVA_IMPODAVERSM3 = 66;
  private static int PFL_DATCOMLIQIVA_IMPORACREDM3 = 67;
  private static int PFL_DATCOMLIQIVA_ETICIMPACRE5 = 68;
  private static int PFL_DATCOMLIQIVA_DEBITOPRECT = 69;
  private static int PFL_DATCOMLIQIVA_CREDITOPRECT = 70;
  private static int PFL_DATCOMLIQIVA_IMPONIBIVENT = 71;
  private static int PFL_DATCOMLIQIVA_DEBITI4 = 72;
  private static int PFL_DATCOMLIQIVA_CREDITI3 = 73;
  private static int PFL_DATCOMLIQIVA_IVAVENT = 74;
  private static int PFL_DATCOMLIQIVA_IMPONIBIACQT = 75;
  private static int PFL_DATCOMLIQIVA_IVAACQT = 76;
  private static int PFL_DATCOMLIQIVA_IVADOVUTAT = 77;
  private static int PFL_DATCOMLIQIVA_ETICIMPACRE6 = 78;
  private static int PFL_DATCOMLIQIVA_IVACREDITOT = 79;
  private static int PFL_DATCOMLIQIVA_METODOACCONT = 80;
  private static int PFL_DATCOMLIQIVA_ACCONTDOVUTT = 81;
  private static int PFL_DATCOMLIQIVA_IMPORDAVERST = 82;
  private static int PFL_DATCOMLIQIVA_IMPORACREDIT = 83;
  private static int PFL_DATCOMLIQIVA_INTERESSPERC = 84;
  private static int PFL_DATCOMLIQIVA_CREDANNOPRET = 85;
  private static int PFL_DATCOMLIQIVA_VERSAAUTOUET = 86;
  private static int PFL_DATCOMLIQIVA_CREDITIMPOST = 87;
  private static int PFL_DATCOMLIQIVA_INTEREDOVUTI = 88;
  private static int PFL_DATCOMLIQIVA_ETICIMPACRE7 = 89;
  private static int PFL_DATCOMLIQIVA_ETICAGGICAMP = 90;
  private static int PFL_DATCOMLIQIVA_ETICHGENEXML = 91;
  private static int PFL_DATCOMLIQIVA_ESERCIZIO = 92;
  private static int PFL_DATCOMLIQIVA_TRIMESTRE = 93;
  private static int PFL_DATCOMLIQIVA_FILEXML = 94;
  private static int PFL_DATCOMLIQIVA_CODICEFISCAL = 95;
  private static int PFL_DATCOMLIQIVA_PARTITAIVA = 96;
  private static int PFL_DATCOMLIQIVA_CFDICHIARANT = 97;
  private static int PFL_DATCOMLIQIVA_CODICARIDICH = 98;
  private static int PFL_DATCOMLIQIVA_FIRMA = 99;
  private static int PFL_DATCOMLIQIVA_CODIFISCINTE = 100;
  private static int PFL_DATCOMLIQIVA_IMPEGNPRESEN = 101;
  private static int PFL_DATCOMLIQIVA_DATAIMPEGNO = 102;
  private static int PFL_DATCOMLIQIVA_FIRMAINTERME = 103;
  private static int PFL_DATCOMLIQIVA_VP2 = 104;
  private static int PFL_DATCOMLIQIVA_VP3 = 105;
  private static int PFL_DATCOMLIQIVA_VP14 = 106;
  private static int PFL_DATCOMLIQIVA_VP4 = 107;
  private static int PFL_DATCOMLIQIVA_VP5 = 108;
  private static int PFL_DATCOMLIQIVA_VP6 = 109;
  private static int PFL_DATCOMLIQIVA_VP7 = 110;
  private static int PFL_DATCOMLIQIVA_VP8 = 111;
  private static int PFL_DATCOMLIQIVA_VP9 = 112;
  private static int PFL_DATCOMLIQIVA_VP10 = 113;
  private static int PFL_DATCOMLIQIVA_VP11 = 114;
  private static int PFL_DATCOMLIQIVA_VP12 = 115;
  private static int PFL_DATCOMLIQIVA_VP13 = 116;
  private static int PFL_DATCOMLIQIVA_VP24 = 117;
  private static int PFL_DATCOMLIQIVA_VP25 = 118;
  private static int PFL_DATCOMLIQIVA_VP26 = 119;
  private static int PFL_DATCOMLIQIVA_VP27 = 120;
  private static int PFL_DATCOMLIQIVA_VP15 = 121;
  private static int PFL_DATCOMLIQIVA_VP16 = 122;
  private static int PFL_DATCOMLIQIVA_VP17 = 123;
  private static int PFL_DATCOMLIQIVA_VP18 = 124;
  private static int PFL_DATCOMLIQIVA_VP19 = 125;
  private static int PFL_DATCOMLIQIVA_VP20 = 126;
  private static int PFL_DATCOMLIQIVA_VP21 = 127;
  private static int PFL_DATCOMLIQIVA_VP22 = 128;
  private static int PFL_DATCOMLIQIVA_VP23 = 129;
  private static int PFL_DATCOMLIQIVA_ETICINTEDOVU = 130;
  private static int PFL_DATCOMLIQIVA_ETICREANNPRE = 131;
  private static int PFL_DATCOMLIQIVA_ETICVERAUTUE = 132;
  private static int PFL_DATCOMLIQIVA_ETICCREDIMPO = 133;
  private static int PFL_DATCOMLIQIVA_ETICACCODOVU = 134;

  private static int PPQRY_COMUNILIQIVA = 0;


  IDPanel PAN_DATCOMLIQIVA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI589(IMDB);
    //
    //
    Init_PQRY_COMUNILIQIVA(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI589(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI589, 3);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI589, "TBL_PARAMETRI589");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI589,IMDBDef2.FLD_PARAMETRI589_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI589,IMDBDef2.FLD_PARAMETRI589_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI589,IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, "NOMOGGPERTRI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI589,IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI589,IMDBDef2.FLD_PARAMETRI589_NOOGIMMADANV, "NOOGIMMADANV");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI589,IMDBDef2.FLD_PARAMETRI589_NOOGIMMADANV,3,16,2);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI589, 0);
  }

  private static void Init_PQRY_COMUNILIQIVA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_COMUNILIQIVA, 74);
    IMDB.set_TblCode(IMDBDef10.PQRY_COMUNILIQIVA, "PQRY_COMUNILIQIVA");
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M1, "DEBITO_PREC_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M1, "CREDITO_PREC_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_VEN_M1, "IMPONIBILE_VEN_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_VEN_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_VEN_M1, "IVA_VEN_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_VEN_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_ACQ_M1, "IMPONIBILE_ACQ_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_ACQ_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_ACQ_M1, "IVA_ACQ_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_ACQ_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_DOVUTA_M1, "IVA_DOVUTA_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_DOVUTA_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_CREDITO_M1, "IVA_CREDITO_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_CREDITO_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_DA_VERSARE_M1, "IMPORTO_DA_VERSARE_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_DA_VERSARE_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_A_CREDITO_M1, "IMPORTO_A_CREDITO_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_A_CREDITO_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M2, "DEBITO_PREC_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M2, "CREDITO_PREC_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_VEN_M2, "IMPONIBILE_VEN_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_VEN_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_VEN_M2, "IVA_VEN_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_VEN_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_ACQ_M2, "IMPONIBILE_ACQ_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_ACQ_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_ACQ_M2, "IVA_ACQ_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_ACQ_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_DOVUTA_M2, "IVA_DOVUTA_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_DOVUTA_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_CREDITO_M2, "IVA_CREDITO_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_CREDITO_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_DA_VERSARE_M2, "IMPORTO_DA_VERSARE_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_DA_VERSARE_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_A_CREDITO_M2, "IMPORTO_A_CREDITO_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_A_CREDITO_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M3, "DEBITO_PREC_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M3, "CREDITO_PREC_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_VEN_M3, "IMPONIBILE_VEN_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_VEN_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_VEN_M3, "IVA_VEN_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_VEN_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_ACQ_M3, "IMPONIBILE_ACQ_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_ACQ_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_ACQ_M3, "IVA_ACQ_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_ACQ_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_DOVUTA_M3, "IVA_DOVUTA_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_DOVUTA_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_CREDITO_M3, "IVA_CREDITO_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_CREDITO_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_DA_VERSARE_M3, "IMPORTO_DA_VERSARE_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_DA_VERSARE_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_A_CREDITO_M3, "IMPORTO_A_CREDITO_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_A_CREDITO_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_T, "DEBITO_PREC_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_T, "CREDITO_PREC_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_VEN_T, "IMPONIBILE_VEN_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_VEN_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_VEN_T, "IVA_VEN_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_VEN_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_ACQ_T, "IMPONIBILE_ACQ_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPONIBILE_ACQ_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_ACQ_T, "IVA_ACQ_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_ACQ_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_DOVUTA_T, "IVA_DOVUTA_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_DOVUTA_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_CREDITO_T, "IVA_CREDITO_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IVA_CREDITO_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_DA_VERSARE_T, "IMPORTO_DA_VERSARE_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_DA_VERSARE_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_A_CREDITO_T, "IMPORTO_A_CREDITO_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPORTO_A_CREDITO_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_INTERESSE_PERC, "INTERESSE_PERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_INTERESSE_PERC,3,5,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_INTERESSI_DOVUTI, "INTERESSI_DOVUTI");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_INTERESSI_DOVUTI,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_TRIMESTRE, "TRIMESTRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_TRIMESTRE,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_FILE_XML, "FILE_XML");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_FILE_XML,9,9999,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CODICE_FISCALE, "CODICE_FISCALE");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CODICE_FISCALE,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_PARTITA_IVA, "PARTITA_IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_PARTITA_IVA,5,11,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CF_DICHIARANTE, "CF_DICHIARANTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CF_DICHIARANTE,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CODICE_CARICA, "CODICE_CARICA");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CODICE_CARICA,1,3,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_FIRMA, "FIRMA");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_FIRMA,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CODICE_FISCALE_INTERMEDIARIO, "CODICE_FISCALE_INTERMEDIARIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CODICE_FISCALE_INTERMEDIARIO,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPEGNO_PRESENTAZIONE, "IMPEGNO_PRESENTAZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_IMPEGNO_PRESENTAZIONE,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_DATA_IMPEGNO, "DATA_IMPEGNO");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_DATA_IMPEGNO,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_FIRMA_INTERMEDIARIO, "FIRMA_INTERMEDIARIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_FIRMA_INTERMEDIARIO,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_ANNO_PREC_M1, "CREDITO_ANNO_PREC_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_ANNO_PREC_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_ANNO_PREC_M2, "CREDITO_ANNO_PREC_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_ANNO_PREC_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_ANNO_PREC_M3, "CREDITO_ANNO_PREC_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_ANNO_PREC_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_ANNO_PREC_T, "CREDITO_ANNO_PREC_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_ANNO_PREC_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M1, "VERSAMENTI_AUTO_UE_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M2, "VERSAMENTI_AUTO_UE_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M3, "VERSAMENTI_AUTO_UE_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_T, "VERSAMENTI_AUTO_UE_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M1, "CREDITI_IMPOSTA_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M2, "CREDITI_IMPOSTA_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M3, "CREDITI_IMPOSTA_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_T, "CREDITI_IMPOSTA_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M1, "ACCONTO_DOVUTO_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M2, "ACCONTO_DOVUTO_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M2,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M3, "ACCONTO_DOVUTO_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M3,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_T, "ACCONTO_DOVUTO_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_T,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_METODO_ACCONTO_M1, "METODO_ACCONTO_M1");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_METODO_ACCONTO_M1,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_METODO_ACCONTO_M2, "METODO_ACCONTO_M2");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_METODO_ACCONTO_M2,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_METODO_ACCONTO_M3, "METODO_ACCONTO_M3");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_METODO_ACCONTO_M3,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_METODO_ACCONTO_T, "METODO_ACCONTO_T");
    IMDB.SetFldParams(IMDBDef10.PQRY_COMUNILIQIVA,IMDBDef10.PQSL_COMUNILIQIVA_METODO_ACCONTO_T,1,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_COMUNILIQIVA, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DatiComunicazioneLiqIVA(MyWebEntryPoint w, IMDBObj imdb)
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
  public DatiComunicazioneLiqIVA()
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
    FormIdx = MyGlb.FRM_DATCOMLIQIVA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "053EE59D-4C0C-44E6-927D-6A2B0A6741A2";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1448;
    DesignHeight = 642;
    set_Caption(new IDVariant("Dati Comunicazione Liq IVA"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1448;
    Frames[1].Height = 616;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Dati Comunicazione Liq. IVA";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 616;
    PAN_DATCOMLIQIVA = new IDPanel(w, this, 1, "PAN_DATCOMLIQIVA");
    Frames[1].Content = PAN_DATCOMLIQIVA;
    PAN_DATCOMLIQIVA.ShowRowSelector = false;
    PAN_DATCOMLIQIVA.ShowToolbar = false;
    PAN_DATCOMLIQIVA.ShowStatusbar = false;
    PAN_DATCOMLIQIVA.VS = MainFrm.VisualStyleList;
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1448-MyGlb.PAN_OFFS_X, 616-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "74ACFFFA-ABE8-4349-B81F-CC8A15AC2AD1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 6484, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DATCOMLIQIVA.InitStatus = 2;
    PAN_DATCOMLIQIVA_Init();
    PAN_DATCOMLIQIVA_InitFields();
    PAN_DATCOMLIQIVA_InitQueries();
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
      PAN_DATCOMLIQIVA.UpdatePanel(MainFrm);
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
    return (obj instanceof DatiComunicazioneLiqIVA);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DatiComunicazioneLiqIVA.class.getName() : (Glb.ClassWithPackage(DatiComunicazioneLiqIVA.class) ? DatiComunicazioneLiqIVA.class.getName().substring(DatiComunicazioneLiqIVA.class.getPackage().getName().length() + 1) : DatiComunicazioneLiqIVA.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Dati Comunicazione Liq. IVA After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_DATCOMLIQIVA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Comunicazione Liq. IVA After Find Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_INTERESSE_PERC, 0),(new IDVariant(0))).equals((new IDVariant(0)), true))
      {
        IDVariant v_VT99INTERELT = new IDVariant(0,IDVariant.DECIMAL);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.INTERESSI_LT as T99INTERESLT ");
        SQL.append("from ");
        SQL.append("  T99 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VT99INTERELT = QV.Get("T99INTERESLT", IDVariant.DECIMAL) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_INTERESSE_PERC, 0, new IDVariant(v_VT99INTERELT));
        PAN_DATCOMLIQIVA.UpdatePanel(MainFrm);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiComunicazioneLiqIVA", "DatiComunicazioneLiq.IVAAfterFind", _e);
    }
  }

  // **********************************************************************
  // Dati Comunicazione Liq. IVA On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DATCOMLIQIVA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dati Comunicazione Liq. IVA On Updating Row Body
      // Corpo Procedura
      // 
      // 
      // ----------------------GRUPPO 1 -------------------
      // ---------------------------------
      // 
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_DEBITOPRECM1)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M1, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Il valore del campo Debito Prec. può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M1, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM1)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM1))),IDVariant.DECIMAL));
          return;
        }
        else
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M1, 0),(new IDVariant(0))).compareTo(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOOGIMMADANV, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Il valore del campo Debito Prec. non può superare l'importo massimo da NON versare"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M1, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM1)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM1))),IDVariant.DECIMAL));
            return;
          }
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M1, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M1, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Non è possibile valorizzare sia il Debito Prec. che il Credito Prec."));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M1, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM1)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM1))),IDVariant.DECIMAL));
          return;
        }
      }
      // 
      // --
      // 
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_CREDITPRECM1)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M1, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Il valore del campo Credito Prec. può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M1, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITPRECM1)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITPRECM1))),IDVariant.DECIMAL));
          return;
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M1, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M1, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Non è possibile valorizzare sia il Debito Prec. che il Credito Prec."));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M1, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITPRECM1)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITPRECM1))),IDVariant.DECIMAL));
          return;
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_VERSAUTOUEM1)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M1, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = null;
          S = (new IDVariant("Il valore del campo Versamenti Auto UE può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M1, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_VERSAUTOUEM1)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_VERSAUTOUEM1))),IDVariant.DECIMAL));
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_CREDIIMPOSM1)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M1, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = null;
          S = (new IDVariant("Il valore del campo Crediti d'Imposta può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M1, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDIIMPOSM1)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDIIMPOSM1))),IDVariant.DECIMAL));
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_ACCONDOVUTM1)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M1, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = null;
          S = (new IDVariant("Il valore del campo Acconto Dovuto può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M1, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_ACCONDOVUTM1)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_ACCONDOVUTM1))),IDVariant.DECIMAL));
        }
      }
      // 
      // --------------------------GRUPPO 2 ---------------
      // -----------------------------------
      // 
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_DEBITOPRECM2)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M2, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Il valore del campo Debito Prec. può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M2, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM2)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM2))),IDVariant.DECIMAL));
          return;
        }
        else
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M2, 0),(new IDVariant(0))).compareTo(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOOGIMMADANV, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Il valore del campo Debito Prec. non può superare l'importo massimo da NON versare"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M2, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM2)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM2))),IDVariant.DECIMAL));
            return;
          }
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M2, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M2, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Non è possibile valorizzare sia il Debito Prec. che il Credito Prec."));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M2, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM2)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM2))),IDVariant.DECIMAL));
          return;
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_CREDITPRECM2)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M2, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Il valore del campo Credito Prec. può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M2, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITPRECM2)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITPRECM2))),IDVariant.DECIMAL));
          return;
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M2, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M2, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Non è possibile valorizzare sia il Debito Prec. che il Credito Prec."));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M2, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITPRECM2)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITPRECM2))),IDVariant.DECIMAL));
          return;
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_VERSAUTOUEM2)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M2, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = null;
          S = (new IDVariant("Il valore del campo Versamenti Auto UE può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M2, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_VERSAUTOUEM2)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_VERSAUTOUEM2))),IDVariant.DECIMAL));
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_CREDIIMPOSM2)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M2, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = null;
          S = (new IDVariant("Il valore del campo Crediti d'Imposta può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M2, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDIIMPOSM2)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDIIMPOSM2))),IDVariant.DECIMAL));
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_ACCONDOVUTM2)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M2, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = null;
          S = (new IDVariant("Il valore del campo Acconto Dovuto può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M2, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_ACCONDOVUTM2)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_ACCONDOVUTM2))),IDVariant.DECIMAL));
        }
      }
      // 
      // ----------------------------------------- GRUPPO 3
      // --------------------------------------------
      // 
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_DEBITOPRECM3)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M3, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Il valore del campo Debito Prec. può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M3, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM3)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM3))),IDVariant.DECIMAL));
          return;
        }
        else
        {
          if (IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M3, 0).compareTo(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOOGIMMADANV, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Il valore del campo Debito Prec. non può superare l'importo massimo da NON versare"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M3, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM3)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM3))),IDVariant.DECIMAL));
          }
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M3, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M3, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Non è possibile valorizzare sia il Debito Prec. che il Credito Prec."));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M3, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM3)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECM3))),IDVariant.DECIMAL));
          return;
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_CREDITPRECM3)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M3, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Il valore del campo Credito Prec. può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M3, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITPRECM3)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITPRECM3))),IDVariant.DECIMAL));
          return;
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_M3, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M3, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Non è possibile valorizzare sia il Debito Prec. che il Credito Prec."));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_M3, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITPRECM3)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITPRECM3))),IDVariant.DECIMAL));
          return;
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_VERSAUTOUEM3)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M3, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = null;
          S = (new IDVariant("Il valore del campo Versamenti Auto UE può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_M3, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_VERSAUTOUEM3)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_VERSAUTOUEM3))),IDVariant.DECIMAL));
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_CREDIIMPOSM3)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M3, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = null;
          S = (new IDVariant("Il valore del campo Crediti d'Imposta può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_M3, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDIIMPOSM3)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDIIMPOSM3))),IDVariant.DECIMAL));
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_ACCONDOVUTM3)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M3, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = null;
          S = (new IDVariant("Il valore del campo Acconto Dovuto può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_M3, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_ACCONDOVUTM3)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_ACCONDOVUTM3))),IDVariant.DECIMAL));
        }
      }
      // 
      // --
      // ---------------------------------- TR ------------
      // -----
      // 
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_DEBITOPRECT)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_T, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Il valore del campo Debito Prec. può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_T, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECT)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECT))),IDVariant.DECIMAL));
          return;
        }
        else
        {
          if (IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_T, 0).compareTo(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOOGIMMADANV, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Il valore del campo Debito Prec. non può superare l'importo massimo da NON versare"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_T, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECT)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECT))),IDVariant.DECIMAL));
          }
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_T, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_T, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Non è possibile valorizzare sia il Debito Prec. che il Credito Prec."));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_T, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECT)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_DEBITOPRECT))),IDVariant.DECIMAL));
          return;
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_CREDITOPRECT)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_T, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Il valore del campo Credito Prec. può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_T, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITOPRECT)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITOPRECT))),IDVariant.DECIMAL));
          return;
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_DEBITO_PREC_T, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_T, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Non è possibile valorizzare sia il Debito Prec. che il Credito Prec."));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITO_PREC_T, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITOPRECT)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITOPRECT))),IDVariant.DECIMAL));
          return;
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_VERSAAUTOUET)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_T, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = null;
          S = (new IDVariant("Il valore del campo Versamenti Auto UE può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_VERSAMENTI_AUTO_UE_T, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_VERSAAUTOUET)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_VERSAAUTOUET))),IDVariant.DECIMAL));
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_CREDITIMPOST)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_T, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = null;
          S = (new IDVariant("Il valore del campo Crediti d'Imposta può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_CREDITI_IMPOSTA_T, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITIMPOST)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_CREDITIMPOST))),IDVariant.DECIMAL));
        }
      }
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_ACCONTDOVUTT)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_T, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = null;
          S = (new IDVariant("Il valore del campo Acconto Dovuto può solo essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_ACCONTO_DOVUTO_T, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_ACCONTDOVUTT)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_ACCONTDOVUTT))),IDVariant.DECIMAL));
        }
      }
      // 
      // ---------
      // 
      if (Column.equals((new IDVariant(PFL_DATCOMLIQIVA_INTERESSPERC)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_INTERESSE_PERC, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Il valore del campo Interesse deve essere maggiore o uguale a zero"));
          MainFrm.set_AlertMessage(S); 
          IMDB.set_Value(IMDBDef10.PQRY_COMUNILIQIVA, IMDBDef10.PQSL_COMUNILIQIVA_INTERESSE_PERC, 0, new IDVariant(((IDL.IsNull(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_INTERESSPERC)))?(new IDVariant(0)):IDL.ToFloat(PAN_DATCOMLIQIVA.GetOrgValue(PFL_DATCOMLIQIVA_INTERESSPERC))),IDVariant.DECIMAL));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiComunicazioneLiqIVA", "DatiComunicazioneLiq.IVAOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Dati Comunicazione Liq. IVA On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DATCOMLIQIVA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DATCOMLIQIVA);
      // 
      // Dati Comunicazione Liq. IVA On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DATCOMLIQIVA.set_ToolTip(Glb.OBJ_FIELD,PFL_DATCOMLIQIVA_CODICARIDICH,((new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(1)))? new IDVariant("1 - Rappresentante legale, negoziale o di fatto, socio amministratore") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(2)))? new IDVariant("2 - Rappresentante di minore, inabilitato o interdetto, ovvero curatore eredità giacente, amministratore dell'eredità") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(3)))? new IDVariant("3 - Curatore fallimentare") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(4)))? new IDVariant("4 - Commissario liquidatore") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(5)))? new IDVariant("5 - Commissario giudiziale") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(6)))? new IDVariant("6 - Rappresentante fiscale di soggetto non residente") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(7)))? new IDVariant("7 - Erede") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(8)))? new IDVariant("8 - Liquidatore - liquidazione volontaria") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(9)))? new IDVariant("9 - Soggetto tenuto a presentare dichiarazione in caso di operazioni straordinarie") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(11)))? new IDVariant("11 - Soggetto esercente l'attività tutoria del minore o interdetto in relazione alla funzione istituzionale rivestita") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(12)))? new IDVariant("12 - Liquidatore - liquidazione volontaria di ditta individuale periodo ante messa in liquidazione") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(13)))? new IDVariant("13 - Amministratore di condominio") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(14)))? new IDVariant("14 - Soggetto che sottoscrive la dichiarazione per conto di una pubblica amministrazione") : (new IDVariant(PAN_DATCOMLIQIVA.FieldText(PFL_DATCOMLIQIVA_CODICARIDICH))).equals((new IDVariant(15)))? new IDVariant("15 - Commissario liquidatore di una pubblica amministrazione") :  new IDVariant()).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiComunicazioneLiqIVA", "DatiComunicazioneLiq.IVAOnDynamicProperties", _e);
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
      MainFrm.CmdObj.set_SuppressMenu((new IDVariant(-1)).booleanValue());
      IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
      v_S1 = (new IDVariant("Esercizio |1"));
      PAN_DATCOMLIQIVA.set_FieldText(PFL_DATCOMLIQIVA_ETICHEESERCI, IDL.FormatMessage(v_S1, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMEOGGEESER, 0))).stringValue());
      IDVariant v_S2 = new IDVariant(0,IDVariant.STRING);
      v_S2 = (new IDVariant("Trimestre: |1"));
      PAN_DATCOMLIQIVA.set_FieldText(PFL_DATCOMLIQIVA_ETICTRIMGENN, IDL.FormatMessage(v_S2, (IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio - Marzo") : IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0).equals((new IDVariant(2)))? new IDVariant("Aprile - Giugno") : IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0).equals((new IDVariant(3)))? new IDVariant("Luglio - Settembre") : IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0).equals((new IDVariant(4)))? new IDVariant("Ottobre - Dicembre") :  new IDVariant())).stringValue());
      PAN_DATCOMLIQIVA.set_FieldText(PFL_DATCOMLIQIVA_ET2345781212, IDL.Format(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOOGIMMADANV, 0), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_DATCOMLIQIVA.set_Header(Glb.OBJ_GROUP,GRP_DATCOMLIQIVA_GRUPPO1,MainFrm.Mesedanumero(IDL.Add((new IDVariant(1)), (IDL.Mul((new IDVariant(3)), (IDL.Sub(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0), (new IDVariant(1)))))))).stringValue()); 
      PAN_DATCOMLIQIVA.set_Header(Glb.OBJ_GROUP,GRP_DATCOMLIQIVA_GRUPPO2,MainFrm.Mesedanumero(IDL.Add((new IDVariant(2)), (IDL.Mul((new IDVariant(3)), (IDL.Sub(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0), (new IDVariant(1)))))))).stringValue()); 
      PAN_DATCOMLIQIVA.set_Header(Glb.OBJ_GROUP,GRP_DATCOMLIQIVA_GRUPPO3,MainFrm.Mesedanumero(IDL.Add((new IDVariant(3)), (IDL.Mul((new IDVariant(3)), (IDL.Sub(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0), (new IDVariant(1)))))))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiComunicazioneLiqIVA", "Load", _e);
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
      MainFrm.CmdObj.set_SuppressMenu((new IDVariant(0)).booleanValue());
      UNLOAD_PARAMEDELETE();
      PAN_DATCOMLIQIVA.PanelCommand(Glb.PCM_CANCEL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiComunicazioneLiqIVA", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOOGIMMADANV, 0, new IDVariant());
  }

  // **********************************************************************
  // Aggiorna O Genera XML
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // Aggiornagenera A O G - Input
  // **********************************************************************
  public int AggiornaOGeneraXML (IDVariant AggiornageneraAOG)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna O Genera XML Body
      // Corpo Procedura
      // 
      if (PAN_DATCOMLIQIVA.IsPanelInError())
      {
        return 0;
      }
      if (new IDVariant(PAN_DATCOMLIQIVA.Status()).equals((new IDVariant(3)), true))
      {
        PAN_DATCOMLIQIVA.PanelCommand(Glb.PCM_UPDATE);
      }
      if (!(new IDVariant(PAN_DATCOMLIQIVA.Status()).equals((new IDVariant(2)), true)))
      {
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if (AggiornageneraAOG.equals((new IDVariant("G")), true))
      {
        MainFrm.Cf4armDBObject.COMUNICAZIONELIQIVAPKGGENERAZIONEXML(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMEOGGEESER, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      }
      else
      {
        MainFrm.Cf4armDBObject.COMUNICAZIONELIQIVAPKGAGGIORNACAMPI(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMEOGGEESER, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      }
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        PAN_DATCOMLIQIVA.PanelCommand(Glb.PCM_REQUERY);
        if (AggiornageneraAOG.equals((new IDVariant("G")), true))
        {
          // 
          // apro il file xml
          // 
          MainFrm.ApriFileXMLComunLiqIva(IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMEOGGEESER, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiComunicazioneLiqIVA", "AggiornaOGeneraXML", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Aggiorna ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Body
      // Corpo Procedura
      // 
      AggiornaOGeneraXML((new IDVariant("A")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiComunicazioneLiqIVA", "Aggiorna", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Genera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Genera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Genera Body
      // Corpo Procedura
      // 
      AggiornaOGeneraXML((new IDVariant("G")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiComunicazioneLiqIVA", "Genera", _e);
      return -1;
    }
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
  private void PAN_DATCOMLIQIVA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DATCOMLIQIVA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DATCOMLIQIVA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DATCOMLIQIVA, Cancel);
    // Stub
  }

  private void PAN_DATCOMLIQIVA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DATCOMLIQIVA_ETICAGGICAMP)
    {
      this.IdxPanelActived = this.PAN_DATCOMLIQIVA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Aggiorna();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DATCOMLIQIVA_ETICHGENEXML)
    {
      this.IdxPanelActived = this.PAN_DATCOMLIQIVA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Genera();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DATCOMLIQIVA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_DATCOMLIQIVA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_DATCOMLIQIVA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DATCOMLIQIVA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DATCOMLIQIVA_Init()
  {

    PAN_DATCOMLIQIVA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DATCOMLIQIVA.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO1, "95CB0EDD-EB9F-472F-9DC0-89DA04EADF61");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO1, "Gruppo 1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO1, MyGlb.VIS_GROUPSTYLE);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO1, MyGlb.PANEL_LIST, 0, -9999, 156, 10, 0, 0);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO1, MyGlb.PANEL_FORM, 212, 130, 284, 434, 0, 0);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO1, 0, 51);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO1, 1, 13);
    PAN_DATCOMLIQIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO1, 0, 2);
    PAN_DATCOMLIQIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO1, 1, 2);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO2, "BA428AF1-E868-4C99-A107-EB5A4A37140C");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO2, "Gruppo 2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO2, MyGlb.VIS_GROUPSTYLE);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO2, MyGlb.PANEL_LIST, 0, -9999, 156, 10, 0, 0);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO2, MyGlb.PANEL_FORM, 508, 130, 284, 434, 0, 0);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO2, 0, 51);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO2, 1, 13);
    PAN_DATCOMLIQIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO2, 0, 2);
    PAN_DATCOMLIQIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO2, 1, 2);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO3, "816E5553-22F0-45FC-8AF7-BA0953B304BE");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO3, "Gruppo 3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO3, MyGlb.VIS_GROUPSTYLE);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO3, MyGlb.PANEL_LIST, 0, -9999, 156, 10, 0, 0);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO3, MyGlb.PANEL_FORM, 804, 130, 284, 434, 0, 0);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO3, 0, 51);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO3, 1, 13);
    PAN_DATCOMLIQIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO3, 0, 2);
    PAN_DATCOMLIQIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO3, 1, 2);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_GRUPPO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_ATTIVITRIMES, "E1F5AC52-C994-4736-BC45-DA4E856F8B4F");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_ATTIVITRIMES, "Attività Trimestrali");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_ATTIVITRIMES, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_ATTIVITRIMES, MyGlb.VIS_GROUPSTYLE);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_ATTIVITRIMES, MyGlb.PANEL_LIST, 0, -9999, 140, 10, 0, 0);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_ATTIVITRIMES, MyGlb.PANEL_FORM, 1144, 74, 284, 490, 0, 0);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_ATTIVITRIMES, 0, 108);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_ATTIVITRIMES, 1, 13);
    PAN_DATCOMLIQIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_ATTIVITRIMES, 0, 2);
    PAN_DATCOMLIQIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_ATTIVITRIMES, 1, 2);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_ATTIVITRIMES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_IMPALLPRETEL, "DFA60517-3947-4A89-91C4-A59A62646536");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_IMPALLPRETEL, "Impegno alla Presentazione Telematica");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_IMPALLPRETEL, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_IMPALLPRETEL, MyGlb.VIS_GROUPSTYLE);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_IMPALLPRETEL, MyGlb.PANEL_LIST, 0, -9999, 192, 10, 0, 0);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_IMPALLPRETEL, MyGlb.PANEL_FORM, 556, 46, 532, 66, 0, 0);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_IMPALLPRETEL, 0, 224);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_IMPALLPRETEL, 1, 13);
    PAN_DATCOMLIQIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_IMPALLPRETEL, 0, 2);
    PAN_DATCOMLIQIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_IMPALLPRETEL, 1, 2);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_GROUP, GRP_DATCOMLIQIVA_IMPALLPRETEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DATCOMLIQIVA.SetSize(MyGlb.OBJ_FIELD, 135);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHEESERCI, "CA65AB7A-80F6-40B2-98B6-0D18CA3A77EB");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHEESERCI, "Esercizio 2017");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHEESERCI, MyGlb.VIS_ETICGRASCENT);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHEESERCI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICTRIMGENN, "8488BC71-855B-4246-B273-A25E98DBCE08");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICTRIMGENN, "Trimestre: Gennaio - Marzo");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICTRIMGENN, MyGlb.VIS_ETICGRASCENT);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICTRIMGENN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPMASDA, "CEA758DB-6534-4734-870C-CB6E88A04124");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPMASDA, "Importo massimo da NON versare");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPMASDA, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPMASDA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ET2345781212, "FFA0379B-2AD4-4D68-A310-090C3944AF72");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ET2345781212, "123.456.789.123,12");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ET2345781212, MyGlb.VIS_DISABIIMPORT);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ET2345781212, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICDEBIPREC, "9F5AAC35-30C2-4DF8-A3D7-C4D2ED822B8D");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICDEBIPREC, "Debito Periodo Prec.");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICDEBIPREC, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICDEBIPREC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDPREC, "BEF31B90-32E2-4A54-BA4F-F770B7497FBE");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDPREC, "Credito Periodo Prec.");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDPREC, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDPREC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOVEND, "5E500307-2DD0-4462-85D3-68F091B4BD35");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOVEND, "Totale Operazioni Attive");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOVEND, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOVEND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAVEND, "583EE8EF-582C-4BE5-94BF-966B307B935E");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAVEND, "IVA Esigibile");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAVEND, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAVEND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACQU, "1F184571-2DA9-4473-998C-3992C4158DEC");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACQU, "Totale Operazioni Passive");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACQU, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACQU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAACQU, "908F2221-1B93-4D6B-BE45-BE26F15B306B");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAACQU, "IVA Detratta");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAACQU, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAACQU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVADOVU, "2207C96E-1615-4CCB-85C6-CA8EFEDD8D89");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVADOVU, "IVA Dovuta");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVADOVU, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVADOVU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPDAVER, "BA8B917D-75E4-493D-8064-CD6536F75B58");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPDAVER, "Importo da Versare");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPDAVER, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPDAVER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, "E022FE67-43CC-47E5-8E91-73280D634195");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, "DEBITO PREC M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, "1CAF9585-577D-407C-9F68-0D55FA3AF8C1");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, "CREDITO PREC M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, "E19D2FAB-5A57-4C42-BF46-193663ECCA7A");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, "IMPONIBILE VEN M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI1, "3649663F-24BA-4136-AD81-3F76B6DB6768");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI1, "DEBITI");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI1, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, "EB7629B4-5C3F-4689-8FC3-68A5041C8E9B");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, "IVA VEN M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, "80415EBE-84AF-4729-B0D4-04BA004D647F");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, "IMPONIBILE ACQ M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, "6D0AD1E5-3A1A-477A-B74A-B316E9CFA1E3");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, "IVA ACQ M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, "09C91107-4FE1-4493-A19B-419A9C0E2C9C");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, "IVA DOVUTA M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, "F66C1309-F67A-44B2-A6E2-9CF1FC83370B");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, "IVA CREDITO M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, "4EDF9216-5390-454E-825B-49F5479D724E");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, "VERSAMENTI AUTO UE M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, "82FCEDB0-9151-4DA7-A78D-ACC3C32E9C8F");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, "CREDITI IMPOSTA M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, "00BB0F67-53A2-4E0A-B395-AC9097698FB0");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, "Metodo");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, MyGlb.VIS_NORMALFIELDS);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, "B3BD45DD-A7F8-4578-9B22-416C2E7D6A8A");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, "ACCONTO DOVUTO M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, "9C8D052E-E9EE-4C2C-A55B-37CA7016D21E");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, "IMPORTO DA VERSARE M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACRE, "59963BC6-7158-4491-B941-17F7B854E82A");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACRE, "a Credito");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACRE, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACRE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, "28112215-A010-4E03-81B9-E7CF4B072E7E");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, "IMPORTO A CREDITO M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE1, "46F9AFCB-2617-4F60-ACFE-439FF56B1C2B");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE1, "a Credito");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE1, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI, "B20C0E0B-B8CE-4A8A-9994-7BDD383A208B");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI, "CREDITI");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, "74EC2208-DD96-49F9-9441-32C52D31E5C6");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, "CREDITO ANNO PREC M1");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE2, "4310C95A-09A5-465E-A0F0-587C08988A9F");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE2, "a Credito");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE2, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, "EBC699CD-0D88-4D78-8825-DBAA459F10C9");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, "DEBITO PREC M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, "CA05020D-FEBF-4EBE-9022-BC91B23075E3");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, "CREDITO PREC M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, "3A2F2B66-3DB6-4F6E-B7FA-DC3C817B9E05");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, "IMPONIBILE VEN M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI2, "A0724574-7121-46EB-B813-61F5E86E3EC1");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI2, "DEBITI");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI2, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI1, "D1B4EE0B-346D-4790-A02E-EF331FA86C82");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI1, "CREDITI");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI1, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, "D71977BD-1C1B-4B0D-AE61-BCBCB2BF48E3");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, "IVA VEN M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, "A3EBDBFF-E79A-47A7-A41E-D2E67CA9527A");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, "IMPONIBILE ACQ M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, "BE133CAC-E202-49EF-A159-00F81B1B224D");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, "IVA ACQ M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, "D2A61A40-D085-44AF-8953-170425A220E3");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, "IVA DOVUTA M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, "B0524AD4-846E-4889-ADC5-64A79CF8FD46");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, "IVA CREDITO M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, "6A856D35-4554-4B57-B7C2-8FD5463F2601");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, "CREDITO ANNO PREC M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, "4ABF36E7-6A26-4BB8-BED9-4520C66A61BF");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, "VERSAMENTI AUTO UE M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, "B7750080-0000-4245-9FE5-C5483ECEC95C");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, "CREDITI IMPOSTA M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, "C1F7845B-4C8E-4C5D-AEE8-3EBEE42CC329");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, "Metodo");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, MyGlb.VIS_NORMFIELPADR);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, "30B2CD1B-DE55-4AE9-800C-E6EA1863BEDA");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, "ACCONTO DOVUTO M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, "55270FFB-6BCF-4A39-A91C-1E15B164BDFF");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, "IMPORTO DA VERSARE M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, "6AF4CF3D-F63E-4123-BC20-ABA53BE2C12F");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, "IMPORTO A CREDITO M2");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE3, "D35398FE-08D2-4052-A691-B7D49AFBB106");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE3, "a Credito");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE3, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, "22B59FE4-6FA6-43DA-9A83-F7D77B087983");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, "DEBITO PREC M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, "8CE27079-4BE6-4288-87FE-EF0920960501");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, "CREDITO PREC M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, "34C2F20C-A320-4BF3-90B4-0C29F3255A55");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, "IMPONIBILE VEN M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI3, "E8D85D0A-BF03-45C8-99AE-1EF70B06727D");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI3, "DEBITI");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI3, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI2, "D8BA3BA7-5D2F-4B5F-9C5D-8CD21991220C");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI2, "CREDITI");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI2, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, "E2FC5798-FA10-4ED2-9B9E-F4F465F0E21E");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, "IVA VEN M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, "17B58E48-D206-461C-B2CF-236BA1CE3A76");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, "IMPONIBILE ACQ M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, "0763E8C0-7B38-4D5E-B6DB-95FC5C6B2EF9");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, "IVA ACQ M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, "A6CEA925-AC08-48B2-8806-C75F2F83BC34");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, "IVA DOVUTA M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE4, "4A6A6C14-7122-4869-8601-E6840DA9A479");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE4, "a Credito");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE4, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, "DEC45FE5-187B-45F0-AB75-9458CE3F9391");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, "IVA CREDITO M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, "1034CA6B-C985-4A2B-9C16-35DC951543D9");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, "CREDITO ANNO PREC M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, "54876125-F89C-4EE8-9B7A-A78F0C7C1C13");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, "VERSAMENTI AUTO UE M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, "D1355AC2-143B-4B5B-B8E9-412204AC9FA1");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, "CREDITI IMPOSTA M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, "D582B42E-CBDB-4513-A400-D19EA4E819FA");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, "Metodo");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, MyGlb.VIS_NORMALFIELDS);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, "2DB9ED6D-1B88-4C62-B491-B6FD8741EF24");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, "ACCONTO DOVUTO M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, "84C3A3DE-44F2-4950-8035-FC2D2133B44D");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, "IMPORTO DA VERSARE M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, "CB1B8751-57E2-4935-A8B0-975EB3D059B2");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, "IMPORTO A CREDITO M3");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE5, "3073DB8C-C9EF-4E32-89A7-AF915EADB478");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE5, "a Credito");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE5, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, "30E31E7A-B844-42CD-BB68-FA8EB3C802DA");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, "DEBITO PREC T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, "A9ECEC09-B0CF-495D-9150-31B39739C5A9");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, "CREDITO PREC T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, "4139D3AD-B473-4461-88A4-9E2A77623F2B");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, "IMPONIBILE VEN T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI4, "611D0ACA-90A5-4325-A51D-17D2C57D98B6");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI4, "DEBITI");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI4, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI3, "6221AC78-0840-4901-9E8D-8EA09625193C");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI3, "CREDITI");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI3, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, "D948B668-1B54-47F1-B906-71440DB90E7E");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, "IVA VEN T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, "9C8C9BB7-A67C-46C7-9B49-2B5938864E37");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, "IMPONIBILE ACQ T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, "02EC2465-6762-48E0-8D2A-01F34B6AB02D");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, "IVA ACQ T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, "BB6C4CB7-0B13-4F9C-B639-5FE375AFB82A");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, "IVA DOVUTA T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE6, "F7AB6113-47AC-4631-8ECE-A90E6C6124E9");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE6, "a Credito");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE6, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, "B2A0D26C-99C9-43E0-86B4-3AFCD99A5879");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, "IVA CREDITO T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, "B8E179D6-B395-497D-A56B-08B6FD1E3A96");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, "Metodo");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, MyGlb.VIS_NORMALFIELDS);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, "643C34FF-7358-4466-A4DD-F274DBFB1570");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, "ACCONTO DOVUTO T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, "B6309D9E-A68C-488A-BCEE-F28DA2D55740");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, "IMPORTO DA VERSARE T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, "30A23517-954F-4270-A008-2BF99F4DA538");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, "IMPORTO A CREDITO T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, "DFFE2347-75E9-47EC-8713-6A176AF66564");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, "Interesse");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, "FF42A9ED-14B1-4BD3-A3AD-07B5F2A94EA3");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, "CREDITO ANNO PREC T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, "D81CA244-EC09-4591-8D3B-5B6A94E211E8");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, "VERSAMENTI AUTO UE T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, "5918B800-7E02-4EA7-86E2-C51B2C7BAE81");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, "CREDITI IMPOSTA T");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, "09DF7B16-D714-46E6-ADFE-0990162B7D5F");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, "Interessi Dovuti");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, MyGlb.VIS_NORFIECF4IMP);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE7, "B0EF975A-20D3-4C36-A70F-544E84C22317");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE7, "a Credito");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE7, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE7, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICAGGICAMP, "EF1D739A-D5E6-4A41-90E6-2C3DBFA7E867");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICAGGICAMP, "Aggiorna campi calcolati");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICAGGICAMP, MyGlb.VIS_STATICBUTTON);
    PAN_DATCOMLIQIVA.SetImage(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICAGGICAMP, 0, "button_very_large.GIF", false);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICAGGICAMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHGENEXML, "018B95A8-B386-40C1-8F5B-566F199E1A71");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHGENEXML, "Genera XML");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHGENEXML, MyGlb.VIS_STATICBUTTON);
    PAN_DATCOMLIQIVA.SetImage(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHGENEXML, 0, "button1.gif", false);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHGENEXML, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, "498ED1A3-C964-4343-ACD3-CECD292A6D0D");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, "ESERCIZIO");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, "7868E2E2-676F-4BCA-85DB-DCC1EC5DCBD3");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, "TRIMESTRE");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, "39C728BF-1938-4DE8-AFEB-53EE6AEB4AAA");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, "FILE XML");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, MyGlb.VIS_NORMFIELPADR);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, "33A74A09-5E56-456A-8C1A-5FAF386D11A5");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, "Codice Fiscale");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, "CODICE_FISCALE");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, MyGlb.VIS_NORMFIELMAIU);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, "F446A44A-84FE-4FF2-BC00-A3F8D67B5080");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, "Partita IVA");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, "PARTITA_IVA");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, MyGlb.VIS_NORMFIELPADR);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, "22451337-97A9-4A55-8806-D9DD139216F5");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, "Codice Fiscale Dichiarante");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, "Codice Fiscale Dichiarante");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, MyGlb.VIS_NORMFIELMAIU);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, "A5575BE3-667A-45B7-9E54-34A7F85B426F");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, "Codice Carica Dichiarante");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, "Codice Carica Dichiarante");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, MyGlb.VIS_NORMALFIELDS);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, "30CC4BE7-42F6-44D3-8D3A-55085B493897");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, "Firma");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, MyGlb.VIS_CHECKSTYLE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, "F292CE82-E54F-48DD-A04A-0D8EF2D8BDB4");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, "Codice Fiscale dell'incaricato");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, MyGlb.VIS_NORMFIELMAIU);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, "6BB6600C-2F78-4D7F-BA4C-40EF35FC3EF7");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, "Impegno alla presentazione");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, MyGlb.VIS_NORMALFIELDS);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, "71E5BC91-6707-490A-B742-A014FD2392BB");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, "Data dell'impegno");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, "244C0892-D19A-469A-9385-35795ACD79EE");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, "Firma dell'incaricato");
    PAN_DATCOMLIQIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, "");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, MyGlb.VIS_CHECKSTYLE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP2, "9BC65352-0541-4541-A5F7-913D88994CE8");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP2, "VP 2");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP2, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP3, "B2D0C036-F62C-4A7D-A764-53EB33B9B684");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP3, "VP 3");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP3, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP14, "E4BF9554-134F-431D-BBF0-D9817D6B3BA5");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP14, "VP 14");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP14, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP14, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP4, "FE466C1E-B4C2-4492-A171-4EA61702AD7D");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP4, "VP 4");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP4, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP5, "38734736-BB34-4D23-A693-7D370C3EC013");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP5, "VP 5");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP5, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP6, "98D9ED3F-9087-4197-890E-A8C0D6DAC540");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP6, "VP 6");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP6, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP7, "95565A4D-8BAF-491F-B652-45B595DB75A8");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP7, "VP 7");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP7, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP7, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP8, "45FC6EDA-42A4-49C5-ACA8-3C010A4BDEBB");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP8, "VP 8");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP8, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP8, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP9, "B4FE4DBB-3EAC-4BDB-B28F-AB43664269A4");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP9, "VP 9");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP9, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP9, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP10, "48B852FD-40C7-4632-BED0-0EDEEBAE639F");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP10, "VP 10");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP10, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP10, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP11, "8A62609E-8C5C-4E5F-8CAB-76117C5E8DCD");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP11, "VP 11");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP11, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP11, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP12, "BA32961D-D7F3-4294-9863-85260C8AA858");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP12, "VP 12");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP12, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP12, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP13, "1C78D53C-AB22-4E83-B55F-A0B0DDD038D4");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP13, "VP 13");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP13, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP13, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP24, "AB726B0D-A0E7-466C-8E55-208CBDA9B074");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP24, "VP 2");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP24, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP24, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP25, "07B7A317-9745-4128-BA87-DF6BD3876EB5");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP25, "VP 3");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP25, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP25, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP26, "EB26DC5C-587A-406E-8FFD-8FFE9170B318");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP26, "VP 14");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP26, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP26, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP27, "B5BF36F3-4196-4ABD-9E51-25D90A14C0BA");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP27, "VP 4");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP27, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP27, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP15, "A982B040-0AE3-408D-9E0E-C0440145A38E");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP15, "VP 5");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP15, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP15, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP16, "E609DE1D-8457-42EC-8BAE-4212AE518C96");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP16, "VP 6");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP16, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP16, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP17, "5B7614A6-5CC0-4A46-A344-46C5C6125487");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP17, "VP 7");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP17, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP17, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP18, "0EFB0B94-4A88-42F1-848B-DA2056015652");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP18, "VP 8");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP18, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP18, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP19, "5096DF64-39B8-444E-9AD7-378FDF139677");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP19, "VP 9");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP19, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP19, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP20, "B05C6D69-2424-47B8-B391-AFC248D16BDF");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP20, "VP 10");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP20, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP20, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP21, "5DFA6578-CA31-488B-B624-BA45BD2171DF");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP21, "VP 11");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP21, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP21, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP22, "E1BE741D-9E75-4882-9FDE-DF45F86B248B");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP22, "VP 12");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP22, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP22, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP23, "0E381CB8-B04C-41CE-8B03-17AE4B462CBE");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP23, "VP 13");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP23, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP23, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICINTEDOVU, "6DC3EB8A-4024-40BE-A12F-135834A1706F");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICINTEDOVU, "Interessi Dovuti (Trim.)");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICINTEDOVU, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICINTEDOVU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICREANNPRE, "5CECE019-EFA0-4151-BC30-BE719A7C5772");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICREANNPRE, "Credito Anno Prec.");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICREANNPRE, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICREANNPRE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICVERAUTUE, "B58F0FA9-2FF9-42EC-9C3B-BA510C675534");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICVERAUTUE, "Versamenti Auto UE");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICVERAUTUE, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICVERAUTUE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDIMPO, "902815ED-ED20-45FA-9D43-19067049A77F");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDIMPO, "Crediti d'Imposta");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDIMPO, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDIMPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DATCOMLIQIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICACCODOVU, "CDA52689-35EE-41AA-B5A7-FEE89B3DB796");
    PAN_DATCOMLIQIVA.set_Header(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICACCODOVU, "Acconto Dovuto");
    PAN_DATCOMLIQIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICACCODOVU, MyGlb.VIS_VUOTONORMALE);
    PAN_DATCOMLIQIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICACCODOVU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_DATCOMLIQIVA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHEESERCI, MyGlb.PANEL_LIST, 52, 16, 144, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHEESERCI, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHEESERCI, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHEESERCI, MyGlb.PANEL_FORM, 40, 8, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHEESERCI, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHEESERCI, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICHEESERCI, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICHEESERCI, -1, "", "ETICHEESERCI", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICHEESERCI, 3);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICTRIMGENN, MyGlb.PANEL_LIST, 180, 8, 436, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICTRIMGENN, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICTRIMGENN, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICTRIMGENN, MyGlb.PANEL_FORM, 180, 8, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICTRIMGENN, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICTRIMGENN, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICTRIMGENN, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICTRIMGENN, -1, "", "ETICTRIMGENN", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPMASDA, MyGlb.PANEL_LIST, 496, 8, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPMASDA, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPMASDA, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPMASDA, MyGlb.PANEL_FORM, 496, 8, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPMASDA, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPMASDA, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICIMPMASDA, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICIMPMASDA, -1, "", "ETICIMPMASDA", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ET2345781212, MyGlb.PANEL_LIST, 724, 8, 164, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ET2345781212, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ET2345781212, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ET2345781212, MyGlb.PANEL_FORM, 712, 8, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ET2345781212, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ET2345781212, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ET2345781212, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ET2345781212, -1, "", "ET2345781212", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ET2345781212, 4);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICDEBIPREC, MyGlb.PANEL_LIST, 24, 56, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICDEBIPREC, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICDEBIPREC, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICDEBIPREC, MyGlb.PANEL_FORM, 56, 316, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICDEBIPREC, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICDEBIPREC, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICDEBIPREC, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICDEBIPREC, -1, "", "ETICDEBIPREC", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICDEBIPREC, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDPREC, MyGlb.PANEL_LIST, 32, 64, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDPREC, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDPREC, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDPREC, MyGlb.PANEL_FORM, 56, 348, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDPREC, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDPREC, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICCREDPREC, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICCREDPREC, -1, "", "ETICCREDPREC", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICCREDPREC, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOVEND, MyGlb.PANEL_LIST, 40, 72, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOVEND, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOVEND, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOVEND, MyGlb.PANEL_FORM, 56, 144, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOVEND, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOVEND, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICIMPOVEND, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICIMPOVEND, -1, "", "ETICIMPOVEND", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICIMPOVEND, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAVEND, MyGlb.PANEL_LIST, 48, 80, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAVEND, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAVEND, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAVEND, MyGlb.PANEL_FORM, 56, 220, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAVEND, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAVEND, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICHIVAVEND, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICHIVAVEND, -1, "", "ETICHIVAVEND", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICHIVAVEND, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACQU, MyGlb.PANEL_LIST, 56, 88, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACQU, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACQU, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACQU, MyGlb.PANEL_FORM, 56, 176, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACQU, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACQU, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICIMPOACQU, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICIMPOACQU, -1, "", "ETICIMPOACQU", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICIMPOACQU, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAACQU, MyGlb.PANEL_LIST, 64, 96, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAACQU, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAACQU, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAACQU, MyGlb.PANEL_FORM, 56, 252, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAACQU, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVAACQU, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICHIVAACQU, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICHIVAACQU, -1, "", "ETICHIVAACQU", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICHIVAACQU, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVADOVU, MyGlb.PANEL_LIST, 72, 104, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVADOVU, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVADOVU, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVADOVU, MyGlb.PANEL_FORM, 56, 284, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVADOVU, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHIVADOVU, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICHIVADOVU, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICHIVADOVU, -1, "", "ETICHIVADOVU", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICHIVADOVU, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPDAVER, MyGlb.PANEL_LIST, 88, 120, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPDAVER, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPDAVER, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPDAVER, MyGlb.PANEL_FORM, 56, 540, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPDAVER, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPDAVER, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICIMPDAVER, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICIMPDAVER, -1, "", "ETICIMPDAVER", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICIMPDAVER, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, MyGlb.PANEL_LIST, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, MyGlb.PANEL_LIST, "DEBITO PREC M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, MyGlb.PANEL_FORM, 216, 316, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM1, MyGlb.PANEL_FORM, "D. P. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_DEBITOPRECM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_DEBITOPRECM1, PPQRY_COMUNILIQIVA, "A.DEBITO_PREC_M1", "DEBITO_PREC_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, MyGlb.PANEL_LIST, 108);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, MyGlb.PANEL_LIST, "CREDITO PREC M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, MyGlb.PANEL_FORM, 388, 348, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM1, MyGlb.PANEL_FORM, "C. P. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDITPRECM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDITPRECM1, PPQRY_COMUNILIQIVA, "A.CREDITO_PREC_M1", "CREDITO_PREC_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, MyGlb.PANEL_LIST, 120);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, MyGlb.PANEL_LIST, "IMPONIBILE VEN M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, MyGlb.PANEL_FORM, 216, 144, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM1, MyGlb.PANEL_FORM, "I. V. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPONIBVENM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPONIBVENM1, PPQRY_COMUNILIQIVA, "A.IMPONIBILE_VEN_M1", "IMPONIBILE_VEN_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI1, MyGlb.PANEL_LIST, 64, 96, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI1, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI1, MyGlb.PANEL_FORM, 216, 200, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI1, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_DEBITI1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_DEBITI1, -1, "", "DEBITI1", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_DEBITI1, 3);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, MyGlb.PANEL_LIST, 72);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, MyGlb.PANEL_LIST, "IVA VEN M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, MyGlb.PANEL_FORM, 216, 220, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM1, MyGlb.PANEL_FORM, "I. V. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVAVENM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVAVENM1, PPQRY_COMUNILIQIVA, "A.IVA_VEN_M1", "IVA_VEN_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, MyGlb.PANEL_LIST, 120);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, MyGlb.PANEL_LIST, "IMPONIBILE ACQ M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, MyGlb.PANEL_FORM, 388, 176, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM1, MyGlb.PANEL_FORM, "I. A. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPONIBACQM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPONIBACQM1, PPQRY_COMUNILIQIVA, "A.IMPONIBILE_ACQ_M1", "IMPONIBILE_ACQ_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, MyGlb.PANEL_LIST, 76);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, MyGlb.PANEL_LIST, "IVA ACQ M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, MyGlb.PANEL_FORM, 388, 252, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM1, MyGlb.PANEL_FORM, "I. A. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVAACQM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVAACQM1, PPQRY_COMUNILIQIVA, "A.IVA_ACQ_M1", "IVA_ACQ_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, MyGlb.PANEL_LIST, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, MyGlb.PANEL_LIST, "IVA DOVUTA M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, MyGlb.PANEL_FORM, 216, 284, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM1, MyGlb.PANEL_FORM, "I. D. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVADOVUTAM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVADOVUTAM1, PPQRY_COMUNILIQIVA, "A.IVA_DOVUTA_M1", "IVA_DOVUTA_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, MyGlb.PANEL_LIST, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, MyGlb.PANEL_LIST, "IVA CREDITO M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, MyGlb.PANEL_FORM, 388, 284, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM1, MyGlb.PANEL_FORM, "I. C. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVACREDITOM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVACREDITOM1, PPQRY_COMUNILIQIVA, "A.IVA_CREDITO_M1", "IVA_CREDITO_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, MyGlb.PANEL_LIST, 152);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, MyGlb.PANEL_LIST, "VERSAMENTI AUTO UE M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, MyGlb.PANEL_FORM, 388, 412, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, MyGlb.PANEL_FORM, 152);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM1, MyGlb.PANEL_FORM, "VERSAMENTI AUTO UE M1");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VERSAUTOUEM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VERSAUTOUEM1, PPQRY_COMUNILIQIVA, "A.VERSAMENTI_AUTO_UE_M1", "VERSAMENTI_AUTO_UE_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, MyGlb.PANEL_LIST, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, MyGlb.PANEL_LIST, "CREDITI IMPOSTA M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, MyGlb.PANEL_FORM, 388, 444, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, MyGlb.PANEL_FORM, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM1, MyGlb.PANEL_FORM, "CREDITI IMPOSTA M1");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDIIMPOSM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDIIMPOSM1, PPQRY_COMUNILIQIVA, "A.CREDITI_IMPOSTA_M1", "CREDITI_IMPOSTA_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, MyGlb.PANEL_LIST, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, MyGlb.PANEL_LIST, "Metodo");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, MyGlb.PANEL_FORM, 276, 508, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, MyGlb.PANEL_FORM, 52);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM1, MyGlb.PANEL_FORM, "Metodo");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_METODACCONM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_METODACCONM1, PPQRY_COMUNILIQIVA, "A.METODO_ACCONTO_M1", "METODO_ACCONTO_M1", 1, 2, 0, -13997);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODACCONM1, (new IDVariant(1)), "1 - Storico", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODACCONM1, (new IDVariant(2)), "2 - Previsionale", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODACCONM1, (new IDVariant(3)), "3 - Analitico - Effettivo", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODACCONM1, (new IDVariant(4)), "4 - Soggetti operanti nei settori delle telecomunicazioni, somministrazione di acqua, energia elettrica, raccolta e smaltimento", "", "", -1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, MyGlb.PANEL_LIST, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, MyGlb.PANEL_LIST, "ACCONTO DOVUTO M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, MyGlb.PANEL_FORM, 388, 508, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, MyGlb.PANEL_FORM, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM1, MyGlb.PANEL_FORM, "ACCONTO DOVUTO M1");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ACCONDOVUTM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ACCONDOVUTM1, PPQRY_COMUNILIQIVA, "A.ACCONTO_DOVUTO_M1", "ACCONTO_DOVUTO_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, MyGlb.PANEL_LIST, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, MyGlb.PANEL_LIST, "IMPORTO DA VERSARE M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, MyGlb.PANEL_FORM, 216, 540, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM1, MyGlb.PANEL_FORM, "I. D. V. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPODAVERSM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPODAVERSM1, PPQRY_COMUNILIQIVA, "A.IMPORTO_DA_VERSARE_M1", "IMPORTO_DA_VERSARE_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACRE, MyGlb.PANEL_LIST, 96, 128, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACRE, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACRE, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACRE, MyGlb.PANEL_FORM, 328, 540, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACRE, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPOACRE, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICIMPOACRE, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICIMPOACRE, -1, "", "ETICIMPOACRE", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICIMPOACRE, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, MyGlb.PANEL_LIST, 144);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, MyGlb.PANEL_LIST, "IMPORTO A CREDITO M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, MyGlb.PANEL_FORM, 388, 540, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM1, MyGlb.PANEL_FORM, "I. A C. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPORACREDM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPORACREDM1, PPQRY_COMUNILIQIVA, "A.IMPORTO_A_CREDITO_M1", "IMPORTO_A_CREDITO_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE1, MyGlb.PANEL_LIST, 104, 136, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE1, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE1, MyGlb.PANEL_FORM, 328, 284, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE1, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICIMPACRE1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICIMPACRE1, -1, "", "ETICIMPACRE1", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICIMPACRE1, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI, MyGlb.PANEL_LIST, 72, 104, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI, MyGlb.PANEL_FORM, 388, 200, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDITI, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDITI, -1, "", "CREDITI", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_CREDITI, 3);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, MyGlb.PANEL_LIST, 144);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, MyGlb.PANEL_LIST, "CREDITO ANNO PREC M1");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, MyGlb.PANEL_FORM, 388, 380, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, MyGlb.PANEL_FORM, 144);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM1, MyGlb.PANEL_FORM, "CREDITO ANNO PREC M1");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDANNPREM1, -1, GRP_DATCOMLIQIVA_GRUPPO1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDANNPREM1, PPQRY_COMUNILIQIVA, "A.CREDITO_ANNO_PREC_M1", "CREDITO_ANNO_PREC_M1", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE2, MyGlb.PANEL_LIST, 112, 144, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE2, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE2, MyGlb.PANEL_FORM, 624, 284, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE2, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICIMPACRE2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICIMPACRE2, -1, "", "ETICIMPACRE2", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICIMPACRE2, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, MyGlb.PANEL_LIST, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, MyGlb.PANEL_LIST, "DEBITO PREC M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, MyGlb.PANEL_FORM, 512, 316, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM2, MyGlb.PANEL_FORM, "D. P. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_DEBITOPRECM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_DEBITOPRECM2, PPQRY_COMUNILIQIVA, "A.DEBITO_PREC_M2", "DEBITO_PREC_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, MyGlb.PANEL_LIST, 108);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, MyGlb.PANEL_LIST, "CREDITO PREC M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, MyGlb.PANEL_FORM, 684, 348, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, MyGlb.PANEL_FORM, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM2, MyGlb.PANEL_FORM, "CREDITO PREC M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDITPRECM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDITPRECM2, PPQRY_COMUNILIQIVA, "A.CREDITO_PREC_M2", "CREDITO_PREC_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, MyGlb.PANEL_LIST, 120);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, MyGlb.PANEL_LIST, "IMPONIBILE VEN M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, MyGlb.PANEL_FORM, 512, 144, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, MyGlb.PANEL_FORM, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM2, MyGlb.PANEL_FORM, "IMPONIBILE VEN M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPONIBVENM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPONIBVENM2, PPQRY_COMUNILIQIVA, "A.IMPONIBILE_VEN_M2", "IMPONIBILE_VEN_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI2, MyGlb.PANEL_LIST, 72, 104, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI2, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI2, MyGlb.PANEL_FORM, 512, 200, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI2, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_DEBITI2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_DEBITI2, -1, "", "DEBITI2", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_DEBITI2, 3);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI1, MyGlb.PANEL_LIST, 80, 112, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI1, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI1, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI1, MyGlb.PANEL_FORM, 684, 200, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI1, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI1, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDITI1, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDITI1, -1, "", "CREDITI1", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_CREDITI1, 3);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, MyGlb.PANEL_LIST, 72);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, MyGlb.PANEL_LIST, "IVA VEN M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, MyGlb.PANEL_FORM, 512, 220, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, MyGlb.PANEL_FORM, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM2, MyGlb.PANEL_FORM, "IVA VEN M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVAVENM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVAVENM2, PPQRY_COMUNILIQIVA, "A.IVA_VEN_M2", "IVA_VEN_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, MyGlb.PANEL_LIST, 120);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, MyGlb.PANEL_LIST, "IMPONIBILE ACQ M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, MyGlb.PANEL_FORM, 684, 176, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, MyGlb.PANEL_FORM, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM2, MyGlb.PANEL_FORM, "IMPONIBILE ACQ M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPONIBACQM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPONIBACQM2, PPQRY_COMUNILIQIVA, "A.IMPONIBILE_ACQ_M2", "IMPONIBILE_ACQ_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, MyGlb.PANEL_LIST, 76);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, MyGlb.PANEL_LIST, "IVA ACQ M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, MyGlb.PANEL_FORM, 684, 252, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, MyGlb.PANEL_FORM, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM2, MyGlb.PANEL_FORM, "IVA ACQ M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVAACQM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVAACQM2, PPQRY_COMUNILIQIVA, "A.IVA_ACQ_M2", "IVA_ACQ_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, MyGlb.PANEL_LIST, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, MyGlb.PANEL_LIST, "IVA DOVUTA M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, MyGlb.PANEL_FORM, 512, 284, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, MyGlb.PANEL_FORM, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM2, MyGlb.PANEL_FORM, "IVA DOVUTA M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVADOVUTAM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVADOVUTAM2, PPQRY_COMUNILIQIVA, "A.IVA_DOVUTA_M2", "IVA_DOVUTA_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, MyGlb.PANEL_LIST, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, MyGlb.PANEL_LIST, "IVA CREDITO M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, MyGlb.PANEL_FORM, 684, 284, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, MyGlb.PANEL_FORM, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM2, MyGlb.PANEL_FORM, "IVA CREDITO M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVACREDITOM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVACREDITOM2, PPQRY_COMUNILIQIVA, "A.IVA_CREDITO_M2", "IVA_CREDITO_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, MyGlb.PANEL_LIST, 144);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, MyGlb.PANEL_LIST, "CREDITO ANNO PREC M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, MyGlb.PANEL_FORM, 684, 380, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, MyGlb.PANEL_FORM, 144);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM2, MyGlb.PANEL_FORM, "CREDITO ANNO PREC M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDANNPREM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDANNPREM2, PPQRY_COMUNILIQIVA, "A.CREDITO_ANNO_PREC_M2", "CREDITO_ANNO_PREC_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, MyGlb.PANEL_LIST, 152);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, MyGlb.PANEL_LIST, "VERSAMENTI AUTO UE M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, MyGlb.PANEL_FORM, 684, 412, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, MyGlb.PANEL_FORM, 152);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM2, MyGlb.PANEL_FORM, "VERSAMENTI AUTO UE M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VERSAUTOUEM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VERSAUTOUEM2, PPQRY_COMUNILIQIVA, "A.VERSAMENTI_AUTO_UE_M2", "VERSAMENTI_AUTO_UE_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, MyGlb.PANEL_LIST, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, MyGlb.PANEL_LIST, "CREDITI IMPOSTA M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, MyGlb.PANEL_FORM, 684, 444, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, MyGlb.PANEL_FORM, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM2, MyGlb.PANEL_FORM, "CREDITI IMPOSTA M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDIIMPOSM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDIIMPOSM2, PPQRY_COMUNILIQIVA, "A.CREDITI_IMPOSTA_M2", "CREDITI_IMPOSTA_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, MyGlb.PANEL_LIST, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, MyGlb.PANEL_LIST, "Metodo");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, MyGlb.PANEL_FORM, 572, 508, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, MyGlb.PANEL_FORM, 52);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM2, MyGlb.PANEL_FORM, "Metodo");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_METODACCONM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_METODACCONM2, PPQRY_COMUNILIQIVA, "A.METODO_ACCONTO_M2", "METODO_ACCONTO_M2", 1, 2, 0, -13997);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODACCONM2, (new IDVariant(1)), "1 - Storico", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODACCONM2, (new IDVariant(2)), "2 - Previsionale", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODACCONM2, (new IDVariant(3)), "3 - Analitico - Effettivo", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODACCONM2, (new IDVariant(4)), "4 - Soggetti operanti nei settori delle telecomunicazioni, somministrazione di acqua, energia elettrica, raccolta e smaltimento", "", "", -1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, MyGlb.PANEL_LIST, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, MyGlb.PANEL_LIST, "ACCONTO DOVUTO M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, MyGlb.PANEL_FORM, 684, 508, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, MyGlb.PANEL_FORM, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM2, MyGlb.PANEL_FORM, "ACCONTO DOVUTO M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ACCONDOVUTM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ACCONDOVUTM2, PPQRY_COMUNILIQIVA, "A.ACCONTO_DOVUTO_M2", "ACCONTO_DOVUTO_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, MyGlb.PANEL_LIST, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, MyGlb.PANEL_LIST, "IMPORTO DA VERSARE M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, MyGlb.PANEL_FORM, 512, 540, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, MyGlb.PANEL_FORM, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM2, MyGlb.PANEL_FORM, "IMPORTO DA VERSARE M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPODAVERSM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPODAVERSM2, PPQRY_COMUNILIQIVA, "A.IMPORTO_DA_VERSARE_M2", "IMPORTO_DA_VERSARE_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, MyGlb.PANEL_LIST, 144);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, MyGlb.PANEL_LIST, "IMPORTO A CREDITO M2");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, MyGlb.PANEL_FORM, 684, 540, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, MyGlb.PANEL_FORM, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM2, MyGlb.PANEL_FORM, "IMPORTO A CREDITO M2");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPORACREDM2, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPORACREDM2, PPQRY_COMUNILIQIVA, "A.IMPORTO_A_CREDITO_M2", "IMPORTO_A_CREDITO_M2", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE3, MyGlb.PANEL_LIST, 120, 152, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE3, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE3, MyGlb.PANEL_FORM, 624, 540, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE3, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICIMPACRE3, -1, GRP_DATCOMLIQIVA_GRUPPO2);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICIMPACRE3, -1, "", "ETICIMPACRE3", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICIMPACRE3, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, MyGlb.PANEL_LIST, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, MyGlb.PANEL_LIST, "DEBITO PREC M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, MyGlb.PANEL_FORM, 808, 316, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECM3, MyGlb.PANEL_FORM, "D. P. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_DEBITOPRECM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_DEBITOPRECM3, PPQRY_COMUNILIQIVA, "A.DEBITO_PREC_M3", "DEBITO_PREC_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, MyGlb.PANEL_LIST, 108);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, MyGlb.PANEL_LIST, "CREDITO PREC M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, MyGlb.PANEL_FORM, 980, 348, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITPRECM3, MyGlb.PANEL_FORM, "C. P. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDITPRECM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDITPRECM3, PPQRY_COMUNILIQIVA, "A.CREDITO_PREC_M3", "CREDITO_PREC_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, MyGlb.PANEL_LIST, 120);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, MyGlb.PANEL_LIST, "IMPONIBILE VEN M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, MyGlb.PANEL_FORM, 808, 144, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBVENM3, MyGlb.PANEL_FORM, "I. V. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPONIBVENM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPONIBVENM3, PPQRY_COMUNILIQIVA, "A.IMPONIBILE_VEN_M3", "IMPONIBILE_VEN_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI3, MyGlb.PANEL_LIST, 80, 112, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI3, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI3, MyGlb.PANEL_FORM, 808, 200, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI3, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_DEBITI3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_DEBITI3, -1, "", "DEBITI3", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_DEBITI3, 3);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI2, MyGlb.PANEL_LIST, 88, 120, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI2, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI2, MyGlb.PANEL_FORM, 980, 200, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI2, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDITI2, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDITI2, -1, "", "CREDITI2", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_CREDITI2, 3);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, MyGlb.PANEL_LIST, 72);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, MyGlb.PANEL_LIST, "IVA VEN M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, MyGlb.PANEL_FORM, 808, 220, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENM3, MyGlb.PANEL_FORM, "I. V. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVAVENM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVAVENM3, PPQRY_COMUNILIQIVA, "A.IVA_VEN_M3", "IVA_VEN_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, MyGlb.PANEL_LIST, 120);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, MyGlb.PANEL_LIST, "IMPONIBILE ACQ M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, MyGlb.PANEL_FORM, 980, 176, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBACQM3, MyGlb.PANEL_FORM, "I. A. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPONIBACQM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPONIBACQM3, PPQRY_COMUNILIQIVA, "A.IMPONIBILE_ACQ_M3", "IMPONIBILE_ACQ_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, MyGlb.PANEL_LIST, 76);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, MyGlb.PANEL_LIST, "IVA ACQ M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, MyGlb.PANEL_FORM, 980, 252, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQM3, MyGlb.PANEL_FORM, "I. A. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVAACQM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVAACQM3, PPQRY_COMUNILIQIVA, "A.IVA_ACQ_M3", "IVA_ACQ_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, MyGlb.PANEL_LIST, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, MyGlb.PANEL_LIST, "IVA DOVUTA M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, MyGlb.PANEL_FORM, 808, 284, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAM3, MyGlb.PANEL_FORM, "I. D. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVADOVUTAM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVADOVUTAM3, PPQRY_COMUNILIQIVA, "A.IVA_DOVUTA_M3", "IVA_DOVUTA_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE4, MyGlb.PANEL_LIST, 120, 152, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE4, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE4, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE4, MyGlb.PANEL_FORM, 920, 284, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE4, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE4, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICIMPACRE4, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICIMPACRE4, -1, "", "ETICIMPACRE4", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICIMPACRE4, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, MyGlb.PANEL_LIST, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, MyGlb.PANEL_LIST, "IVA CREDITO M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, MyGlb.PANEL_FORM, 980, 284, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOM3, MyGlb.PANEL_FORM, "I. C. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVACREDITOM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVACREDITOM3, PPQRY_COMUNILIQIVA, "A.IVA_CREDITO_M3", "IVA_CREDITO_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, MyGlb.PANEL_LIST, 144);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, MyGlb.PANEL_LIST, "CREDITO ANNO PREC M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, MyGlb.PANEL_FORM, 980, 380, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, MyGlb.PANEL_FORM, 144);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNPREM3, MyGlb.PANEL_FORM, "CREDITO ANNO PREC M3");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDANNPREM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDANNPREM3, PPQRY_COMUNILIQIVA, "A.CREDITO_ANNO_PREC_M3", "CREDITO_ANNO_PREC_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, MyGlb.PANEL_LIST, 152);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, MyGlb.PANEL_LIST, "VERSAMENTI AUTO UE M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, MyGlb.PANEL_FORM, 980, 412, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, MyGlb.PANEL_FORM, 152);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAUTOUEM3, MyGlb.PANEL_FORM, "VERSAMENTI AUTO UE M3");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VERSAUTOUEM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VERSAUTOUEM3, PPQRY_COMUNILIQIVA, "A.VERSAMENTI_AUTO_UE_M3", "VERSAMENTI_AUTO_UE_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, MyGlb.PANEL_LIST, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, MyGlb.PANEL_LIST, "CREDITI IMPOSTA M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, MyGlb.PANEL_FORM, 980, 444, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, MyGlb.PANEL_FORM, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDIIMPOSM3, MyGlb.PANEL_FORM, "CREDITI IMPOSTA M3");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDIIMPOSM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDIIMPOSM3, PPQRY_COMUNILIQIVA, "A.CREDITI_IMPOSTA_M3", "CREDITI_IMPOSTA_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, MyGlb.PANEL_LIST, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, MyGlb.PANEL_LIST, "Metodo");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, MyGlb.PANEL_FORM, 868, 508, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, MyGlb.PANEL_FORM, 52);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODACCONM3, MyGlb.PANEL_FORM, "Metodo");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_METODACCONM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_METODACCONM3, PPQRY_COMUNILIQIVA, "A.METODO_ACCONTO_M3", "METODO_ACCONTO_M3", 1, 2, 0, -13997);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODACCONM3, (new IDVariant(1)), "1 - Storico", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODACCONM3, (new IDVariant(2)), "2 - Previsionale", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODACCONM3, (new IDVariant(3)), "3 - Analitico - Effettivo", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODACCONM3, (new IDVariant(4)), "4 - Soggetti operanti nei settori delle telecomunicazioni, somministrazione di acqua, energia elettrica, raccolta e smaltimento", "", "", -1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, MyGlb.PANEL_LIST, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, MyGlb.PANEL_LIST, "ACCONTO DOVUTO M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, MyGlb.PANEL_FORM, 980, 508, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, MyGlb.PANEL_FORM, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONDOVUTM3, MyGlb.PANEL_FORM, "ACCONTO DOVUTO M3");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ACCONDOVUTM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ACCONDOVUTM3, PPQRY_COMUNILIQIVA, "A.ACCONTO_DOVUTO_M3", "ACCONTO_DOVUTO_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, MyGlb.PANEL_LIST, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, MyGlb.PANEL_LIST, "IMPORTO DA VERSARE M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, MyGlb.PANEL_FORM, 808, 540, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPODAVERSM3, MyGlb.PANEL_FORM, "I. D. V. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPODAVERSM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPODAVERSM3, PPQRY_COMUNILIQIVA, "A.IMPORTO_DA_VERSARE_M3", "IMPORTO_DA_VERSARE_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, MyGlb.PANEL_LIST, 144);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, MyGlb.PANEL_LIST, "IMPORTO A CREDITO M3");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, MyGlb.PANEL_FORM, 980, 540, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDM3, MyGlb.PANEL_FORM, "I. A C. M.");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPORACREDM3, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPORACREDM3, PPQRY_COMUNILIQIVA, "A.IMPORTO_A_CREDITO_M3", "IMPORTO_A_CREDITO_M3", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE5, MyGlb.PANEL_LIST, 128, 160, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE5, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE5, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE5, MyGlb.PANEL_FORM, 920, 540, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE5, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE5, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICIMPACRE5, -1, GRP_DATCOMLIQIVA_GRUPPO3);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICIMPACRE5, -1, "", "ETICIMPACRE5", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICIMPACRE5, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, MyGlb.PANEL_LIST, 92);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, MyGlb.PANEL_LIST, "DEBITO PREC T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, MyGlb.PANEL_FORM, 1148, 316, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITOPRECT, MyGlb.PANEL_FORM, "D. P. T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_DEBITOPRECT, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_DEBITOPRECT, PPQRY_COMUNILIQIVA, "A.DEBITO_PREC_T", "DEBITO_PREC_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, MyGlb.PANEL_LIST, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, MyGlb.PANEL_LIST, "CREDITO PREC T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, MyGlb.PANEL_FORM, 1320, 348, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITOPRECT, MyGlb.PANEL_FORM, "C. P. T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDITOPRECT, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDITOPRECT, PPQRY_COMUNILIQIVA, "A.CREDITO_PREC_T", "CREDITO_PREC_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, MyGlb.PANEL_LIST, 108);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, MyGlb.PANEL_LIST, "IMPONIBILE VEN T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, MyGlb.PANEL_FORM, 1148, 144, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIVENT, MyGlb.PANEL_FORM, "I. V. T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPONIBIVENT, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPONIBIVENT, PPQRY_COMUNILIQIVA, "A.IMPONIBILE_VEN_T", "IMPONIBILE_VEN_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI4, MyGlb.PANEL_LIST, 88, 120, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI4, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI4, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI4, MyGlb.PANEL_FORM, 1148, 200, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI4, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DEBITI4, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_DEBITI4, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_DEBITI4, -1, "", "DEBITI4", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_DEBITI4, 3);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI3, MyGlb.PANEL_LIST, 96, 128, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI3, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI3, MyGlb.PANEL_FORM, 1320, 200, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI3, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITI3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDITI3, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDITI3, -1, "", "CREDITI3", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_CREDITI3, 3);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, MyGlb.PANEL_LIST, 64);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, MyGlb.PANEL_LIST, "IVA VEN T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, MyGlb.PANEL_FORM, 1148, 220, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAVENT, MyGlb.PANEL_FORM, "I. V. T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVAVENT, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVAVENT, PPQRY_COMUNILIQIVA, "A.IVA_VEN_T", "IVA_VEN_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, MyGlb.PANEL_LIST, 112);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, MyGlb.PANEL_LIST, "IMPONIBILE ACQ T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, MyGlb.PANEL_FORM, 1320, 176, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPONIBIACQT, MyGlb.PANEL_FORM, "I. A. T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPONIBIACQT, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPONIBIACQT, PPQRY_COMUNILIQIVA, "A.IMPONIBILE_ACQ_T", "IMPONIBILE_ACQ_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, MyGlb.PANEL_LIST, 64);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, MyGlb.PANEL_LIST, "IVA ACQ T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, MyGlb.PANEL_FORM, 1320, 252, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVAACQT, MyGlb.PANEL_FORM, "I. A. T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVAACQT, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVAACQT, PPQRY_COMUNILIQIVA, "A.IVA_ACQ_T", "IVA_ACQ_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, MyGlb.PANEL_LIST, 88);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, MyGlb.PANEL_LIST, "IVA DOVUTA T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, MyGlb.PANEL_FORM, 1148, 284, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVADOVUTAT, MyGlb.PANEL_FORM, "I. D. T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVADOVUTAT, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVADOVUTAT, PPQRY_COMUNILIQIVA, "A.IVA_DOVUTA_T", "IVA_DOVUTA_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE6, MyGlb.PANEL_LIST, 128, 160, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE6, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE6, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE6, MyGlb.PANEL_FORM, 1260, 284, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE6, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE6, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICIMPACRE6, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICIMPACRE6, -1, "", "ETICIMPACRE6", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICIMPACRE6, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, MyGlb.PANEL_LIST, 92);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, MyGlb.PANEL_LIST, "IVA CREDITO T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, MyGlb.PANEL_FORM, 1320, 284, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IVACREDITOT, MyGlb.PANEL_FORM, "I. C. T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IVACREDITOT, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IVACREDITOT, PPQRY_COMUNILIQIVA, "A.IVA_CREDITO_T", "IVA_CREDITO_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, MyGlb.PANEL_LIST, 120);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, MyGlb.PANEL_LIST, "Metodo");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, MyGlb.PANEL_FORM, 1208, 508, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, MyGlb.PANEL_FORM, 52);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_METODOACCONT, MyGlb.PANEL_FORM, "Metodo");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_METODOACCONT, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_METODOACCONT, PPQRY_COMUNILIQIVA, "A.METODO_ACCONTO_T", "METODO_ACCONTO_T", 1, 2, 0, -13997);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODOACCONT, (new IDVariant(1)), "1 - Storico", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODOACCONT, (new IDVariant(2)), "2 - Previsionale", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODOACCONT, (new IDVariant(3)), "3 - Analitico - Effettivo", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_METODOACCONT, (new IDVariant(4)), "4 - Soggetti operanti nei settori delle telecomunicazioni, somministrazione di acqua, energia elettrica, raccolta e smaltimento", "", "", -1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, MyGlb.PANEL_LIST, 120);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, MyGlb.PANEL_LIST, "ACCONTO DOVUTO T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, MyGlb.PANEL_FORM, 1320, 508, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, MyGlb.PANEL_FORM, 120);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ACCONTDOVUTT, MyGlb.PANEL_FORM, "ACCONTO DOVUTO T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ACCONTDOVUTT, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ACCONTDOVUTT, PPQRY_COMUNILIQIVA, "A.ACCONTO_DOVUTO_T", "ACCONTO_DOVUTO_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, MyGlb.PANEL_LIST, 144);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, MyGlb.PANEL_LIST, "IMPORTO DA VERSARE T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, MyGlb.PANEL_FORM, 1148, 540, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORDAVERST, MyGlb.PANEL_FORM, "I. D. V. T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPORDAVERST, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPORDAVERST, PPQRY_COMUNILIQIVA, "A.IMPORTO_DA_VERSARE_T", "IMPORTO_DA_VERSARE_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, MyGlb.PANEL_LIST, 136);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, MyGlb.PANEL_LIST, "IMPORTO A CREDITO T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, MyGlb.PANEL_FORM, 1320, 540, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, MyGlb.PANEL_FORM, 8);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPORACREDIT, MyGlb.PANEL_FORM, "I. A C. T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPORACREDIT, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPORACREDIT, PPQRY_COMUNILIQIVA, "A.IMPORTO_A_CREDITO_T", "IMPORTO_A_CREDITO_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, MyGlb.PANEL_LIST, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, MyGlb.PANEL_LIST, "Interesse");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, MyGlb.PANEL_FORM, 1216, 88, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, MyGlb.PANEL_FORM, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTERESSPERC, MyGlb.PANEL_FORM, "Interesse");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_INTERESSPERC, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_INTERESSPERC, PPQRY_COMUNILIQIVA, "A.INTERESSE_PERC", "INTERESSE_PERC", 3, 5, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, MyGlb.PANEL_LIST, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, MyGlb.PANEL_LIST, "CREDITO ANNO PREC T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, MyGlb.PANEL_FORM, 1320, 380, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, MyGlb.PANEL_FORM, 132);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDANNOPRET, MyGlb.PANEL_FORM, "CREDITO ANNO PREC T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDANNOPRET, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDANNOPRET, PPQRY_COMUNILIQIVA, "A.CREDITO_ANNO_PREC_T", "CREDITO_ANNO_PREC_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, MyGlb.PANEL_LIST, 140);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, MyGlb.PANEL_LIST, "VERSAMENTI AUTO UE T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, MyGlb.PANEL_FORM, 1320, 412, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, MyGlb.PANEL_FORM, 140);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VERSAAUTOUET, MyGlb.PANEL_FORM, "VERSAMENTI AUTO UE T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VERSAAUTOUET, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VERSAAUTOUET, PPQRY_COMUNILIQIVA, "A.VERSAMENTI_AUTO_UE_T", "VERSAMENTI_AUTO_UE_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, MyGlb.PANEL_LIST, 120);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, MyGlb.PANEL_LIST, "CREDITI IMPOSTA T");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, MyGlb.PANEL_FORM, 1320, 444, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, MyGlb.PANEL_FORM, 120);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CREDITIMPOST, MyGlb.PANEL_FORM, "CREDITI IMPOSTA T");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CREDITIMPOST, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CREDITIMPOST, PPQRY_COMUNILIQIVA, "A.CREDITI_IMPOSTA_T", "CREDITI_IMPOSTA_T", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, MyGlb.PANEL_LIST, 112);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, MyGlb.PANEL_LIST, "Interessi Dovuti");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, MyGlb.PANEL_FORM, 1148, 476, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, MyGlb.PANEL_FORM, 112);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_INTEREDOVUTI, MyGlb.PANEL_FORM, "Interessi Dovuti");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_INTEREDOVUTI, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_INTEREDOVUTI, PPQRY_COMUNILIQIVA, "A.INTERESSI_DOVUTI", "INTERESSI_DOVUTI", 3, 14, 2, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE7, MyGlb.PANEL_LIST, 136, 168, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE7, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE7, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE7, MyGlb.PANEL_FORM, 1260, 540, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE7, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICIMPACRE7, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICIMPACRE7, -1, GRP_DATCOMLIQIVA_ATTIVITRIMES);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICIMPACRE7, -1, "", "ETICIMPACRE7", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICIMPACRE7, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICAGGICAMP, MyGlb.PANEL_LIST, 32, 440, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICAGGICAMP, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICAGGICAMP, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICAGGICAMP, MyGlb.PANEL_FORM, 260, 576, 168, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICAGGICAMP, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICAGGICAMP, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICAGGICAMP, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICAGGICAMP, -1, "", "ETICAGGICAMP", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHGENEXML, MyGlb.PANEL_LIST, 976, 432, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHGENEXML, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHGENEXML, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHGENEXML, MyGlb.PANEL_FORM, 1004, 576, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHGENEXML, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICHGENEXML, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICHGENEXML, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICHGENEXML, -1, "", "ETICHGENEXML", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 476, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ESERCIZIO, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ESERCIZIO, PPQRY_COMUNILIQIVA, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, MyGlb.PANEL_LIST, 72);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, MyGlb.PANEL_LIST, "TRIMESTRE");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, MyGlb.PANEL_FORM, 4, 476, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, MyGlb.PANEL_FORM, 72);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_TRIMESTRE, MyGlb.PANEL_FORM, "TRIMESTRE");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_TRIMESTRE, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_TRIMESTRE, PPQRY_COMUNILIQIVA, "A.TRIMESTRE", "TRIMESTRE", 1, 1, 0, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, MyGlb.PANEL_LIST, 68);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, MyGlb.PANEL_LIST, 2);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, MyGlb.PANEL_LIST, "FILE XML");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, MyGlb.PANEL_FORM, 4, 476, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, MyGlb.PANEL_FORM, 68);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, MyGlb.PANEL_FORM, 2);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FILEXML, MyGlb.PANEL_FORM, "FILE XML");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_FILEXML, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_FILEXML, PPQRY_COMUNILIQIVA, "A.FILE_XML", "FILE_XML", 9, 9999, 0, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, MyGlb.PANEL_LIST, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, MyGlb.PANEL_LIST, "Codice Fiscale");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, MyGlb.PANEL_FORM, 12, 40, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, MyGlb.PANEL_FORM, 100);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICEFISCAL, MyGlb.PANEL_FORM, "Codice Fiscale");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CODICEFISCAL, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CODICEFISCAL, PPQRY_COMUNILIQIVA, "A.CODICE_FISCALE", "CODICE_FISCALE", 5, 16, 0, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, MyGlb.PANEL_LIST, 84);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, MyGlb.PANEL_LIST, "Partita IVA");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, MyGlb.PANEL_FORM, 40, 68, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, MyGlb.PANEL_FORM, 72);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_PARTITAIVA, MyGlb.PANEL_FORM, "Partita IVA");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_PARTITAIVA, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_PARTITAIVA, PPQRY_COMUNILIQIVA, "A.PARTITA_IVA", "PARTITA_IVA", 5, 11, 0, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, MyGlb.PANEL_LIST, 104);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, MyGlb.PANEL_LIST, "Codice Fiscale Dichiarante");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, MyGlb.PANEL_FORM, 248, 40, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, MyGlb.PANEL_FORM, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CFDICHIARANT, MyGlb.PANEL_FORM, "Codice Fiscale Dichiarante");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CFDICHIARANT, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CFDICHIARANT, PPQRY_COMUNILIQIVA, "A.CF_DICHIARANTE", "CF_DICHIARANTE", 5, 16, 0, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, MyGlb.PANEL_LIST, 96);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, MyGlb.PANEL_LIST, "Codice Carica Dichiarante");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, MyGlb.PANEL_FORM, 248, 68, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, MyGlb.PANEL_FORM, 156);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODICARIDICH, MyGlb.PANEL_FORM, "Codice Carica Dichiarante");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CODICARIDICH, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CODICARIDICH, PPQRY_COMUNILIQIVA, "A.CODICE_CARICA", "CODICE_CARICA", 1, 3, 0, -13997);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(1)), "1 - Rappresentante legale, negoziale o di fatto, socio amministratore", "1 - Rappresentante legale, negoziale o di fatto, socio amministratore", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(2)), "2 - Rappresentante di minore, inabilitato o interdetto, ovvero curatore eredità giacente, amministratore dell'eredità", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(3)), "3 - Curatore fallimentare", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(4)), "4 - Commissario liquidatore", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(5)), "5 - Commissario giudiziale", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(6)), "6 - Rappresentante fiscale di soggetto non residente", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(7)), "7 - Erede", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(8)), "8 - Liquidatore - liquidazione volontaria", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(9)), "9 - Soggetto tenuto a presentare dichiarazione in caso di operazioni straordinarie", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(11)), "11 - Soggetto esercente l'attività tutoria del minore o interdetto in relazione alla funzione istituzionale rivestita", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(12)), "12 - Liquidatore - liquidazione volontaria di ditta individuale periodo ante messa in liquidazione", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(13)), "13 - Amministratore di condominio", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(14)), "14 - Soggetto che sottoscrive la dichiarazione per conto di una pubblica amministrazione", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_CODICARIDICH, (new IDVariant(15)), "15 - Commissario liquidatore di una pubblica amministrazione", "", "", -1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, MyGlb.PANEL_LIST, 48);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, MyGlb.PANEL_LIST, "Firma");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, MyGlb.PANEL_FORM, 64, 96, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, MyGlb.PANEL_FORM, 48);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMA, MyGlb.PANEL_FORM, "Firma");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_FIRMA, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_FIRMA, PPQRY_COMUNILIQIVA, "A.FIRMA", "FIRMA", 1, 1, 0, -13997);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_FIRMA, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_FIRMA, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, MyGlb.PANEL_LIST, 0, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, MyGlb.PANEL_LIST, 192);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, MyGlb.PANEL_LIST, "Codice Fiscale dell'incaricato");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, MyGlb.PANEL_FORM, 576, 60, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, MyGlb.PANEL_FORM, 168);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_CODIFISCINTE, MyGlb.PANEL_FORM, "Codice Fiscale dell'incaricato");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_CODIFISCINTE, -1, GRP_DATCOMLIQIVA_IMPALLPRETEL);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_CODIFISCINTE, PPQRY_COMUNILIQIVA, "A.CODICE_FISCALE_INTERMEDIARIO", "CODICE_FISCALE_INTERMEDIARIO", 5, 16, 0, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, MyGlb.PANEL_LIST, 152);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, MyGlb.PANEL_LIST, "Imp. alla presentazione");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, MyGlb.PANEL_FORM, 876, 60, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, MyGlb.PANEL_FORM, 168);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_IMPEGNPRESEN, MyGlb.PANEL_FORM, "Impegno alla presentazione");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_IMPEGNPRESEN, -1, GRP_DATCOMLIQIVA_IMPALLPRETEL);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_IMPEGNPRESEN, PPQRY_COMUNILIQIVA, "A.IMPEGNO_PRESENTAZIONE", "IMPEGNO_PRESENTAZIONE", 5, 1, 0, -13997);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_IMPEGNPRESEN, (new IDVariant("1")), "1 - Comuniocazione predisposta dall'Ente", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_IMPEGNPRESEN, (new IDVariant("2")), "2 - Comuniocazione predisposta dall'Incaricato", "", "", -1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, MyGlb.PANEL_LIST, 96);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, MyGlb.PANEL_LIST, "Dt. dll. impegno");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, MyGlb.PANEL_FORM, 560, 88, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, MyGlb.PANEL_FORM, 184);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_DATAIMPEGNO, MyGlb.PANEL_FORM, "Data dell'impegno");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_DATAIMPEGNO, -1, GRP_DATCOMLIQIVA_IMPALLPRETEL);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_DATAIMPEGNO, PPQRY_COMUNILIQIVA, "A.DATA_IMPEGNO", "DATA_IMPEGNO", 6, 10, 0, -13997);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, MyGlb.PANEL_LIST, 140);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, MyGlb.PANEL_LIST, "Firma dell'incaricato");
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, MyGlb.PANEL_FORM, 896, 88, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, MyGlb.PANEL_FORM, 144);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_FIRMAINTERME, MyGlb.PANEL_FORM, "Firma dell'incaricato");
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_FIRMAINTERME, -1, GRP_DATCOMLIQIVA_IMPALLPRETEL);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_FIRMAINTERME, PPQRY_COMUNILIQIVA, "A.FIRMA_INTERMEDIARIO", "FIRMA_INTERMEDIARIO", 1, 1, 0, -13997);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_FIRMAINTERME, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_DATCOMLIQIVA.SetValueListItem(PFL_DATCOMLIQIVA_FIRMAINTERME, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP2, MyGlb.PANEL_LIST, 32, 64, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP2, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP2, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP2, MyGlb.PANEL_FORM, 8, 144, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP2, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP2, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP2, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP2, -1, "", "VP2", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP2, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP3, MyGlb.PANEL_LIST, 40, 72, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP3, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP3, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP3, MyGlb.PANEL_FORM, 8, 176, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP3, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP3, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP3, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP3, -1, "", "VP3", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP3, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP14, MyGlb.PANEL_LIST, 40, 72, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP14, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP14, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP14, MyGlb.PANEL_FORM, 8, 540, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP14, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP14, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP14, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP14, -1, "", "VP14", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP14, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP4, MyGlb.PANEL_LIST, 40, 72, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP4, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP4, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP4, MyGlb.PANEL_FORM, 8, 220, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP4, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP4, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP4, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP4, -1, "", "VP4", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP4, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP5, MyGlb.PANEL_LIST, 48, 80, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP5, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP5, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP5, MyGlb.PANEL_FORM, 8, 252, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP5, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP5, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP5, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP5, -1, "", "VP5", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP5, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP6, MyGlb.PANEL_LIST, 56, 88, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP6, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP6, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP6, MyGlb.PANEL_FORM, 8, 284, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP6, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP6, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP6, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP6, -1, "", "VP6", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP6, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP7, MyGlb.PANEL_LIST, 64, 96, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP7, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP7, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP7, MyGlb.PANEL_FORM, 8, 316, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP7, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP7, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP7, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP7, -1, "", "VP7", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP7, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP8, MyGlb.PANEL_LIST, 72, 104, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP8, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP8, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP8, MyGlb.PANEL_FORM, 8, 348, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP8, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP8, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP8, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP8, -1, "", "VP8", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP8, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP9, MyGlb.PANEL_LIST, 80, 112, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP9, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP9, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP9, MyGlb.PANEL_FORM, 8, 380, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP9, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP9, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP9, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP9, -1, "", "VP9", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP9, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP10, MyGlb.PANEL_LIST, 88, 120, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP10, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP10, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP10, MyGlb.PANEL_FORM, 8, 412, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP10, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP10, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP10, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP10, -1, "", "VP10", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP10, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP11, MyGlb.PANEL_LIST, 96, 128, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP11, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP11, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP11, MyGlb.PANEL_FORM, 8, 444, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP11, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP11, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP11, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP11, -1, "", "VP11", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP11, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP12, MyGlb.PANEL_LIST, 104, 136, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP12, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP12, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP12, MyGlb.PANEL_FORM, 8, 476, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP12, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP12, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP12, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP12, -1, "", "VP12", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP12, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP13, MyGlb.PANEL_LIST, 112, 144, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP13, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP13, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP13, MyGlb.PANEL_FORM, 8, 508, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP13, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP13, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP13, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP13, -1, "", "VP13", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP13, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP24, MyGlb.PANEL_LIST, 40, 72, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP24, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP24, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP24, MyGlb.PANEL_FORM, 1096, 144, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP24, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP24, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP24, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP24, -1, "", "VP24", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP24, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP25, MyGlb.PANEL_LIST, 48, 80, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP25, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP25, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP25, MyGlb.PANEL_FORM, 1096, 176, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP25, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP25, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP25, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP25, -1, "", "VP25", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP25, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP26, MyGlb.PANEL_LIST, 48, 80, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP26, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP26, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP26, MyGlb.PANEL_FORM, 1096, 540, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP26, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP26, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP26, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP26, -1, "", "VP26", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP26, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP27, MyGlb.PANEL_LIST, 48, 80, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP27, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP27, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP27, MyGlb.PANEL_FORM, 1096, 220, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP27, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP27, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP27, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP27, -1, "", "VP27", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP27, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP15, MyGlb.PANEL_LIST, 56, 88, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP15, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP15, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP15, MyGlb.PANEL_FORM, 1096, 252, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP15, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP15, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP15, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP15, -1, "", "VP15", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP15, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP16, MyGlb.PANEL_LIST, 64, 96, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP16, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP16, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP16, MyGlb.PANEL_FORM, 1096, 284, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP16, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP16, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP16, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP16, -1, "", "VP16", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP16, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP17, MyGlb.PANEL_LIST, 72, 104, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP17, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP17, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP17, MyGlb.PANEL_FORM, 1096, 316, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP17, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP17, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP17, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP17, -1, "", "VP17", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP17, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP18, MyGlb.PANEL_LIST, 80, 112, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP18, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP18, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP18, MyGlb.PANEL_FORM, 1096, 348, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP18, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP18, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP18, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP18, -1, "", "VP18", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP18, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP19, MyGlb.PANEL_LIST, 88, 120, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP19, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP19, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP19, MyGlb.PANEL_FORM, 1096, 380, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP19, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP19, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP19, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP19, -1, "", "VP19", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP19, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP20, MyGlb.PANEL_LIST, 96, 128, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP20, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP20, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP20, MyGlb.PANEL_FORM, 1096, 412, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP20, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP20, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP20, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP20, -1, "", "VP20", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP20, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP21, MyGlb.PANEL_LIST, 104, 136, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP21, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP21, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP21, MyGlb.PANEL_FORM, 1096, 444, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP21, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP21, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP21, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP21, -1, "", "VP21", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP21, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP22, MyGlb.PANEL_LIST, 112, 144, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP22, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP22, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP22, MyGlb.PANEL_FORM, 1096, 476, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP22, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP22, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP22, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP22, -1, "", "VP22", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP22, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP23, MyGlb.PANEL_LIST, 120, 152, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP23, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP23, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP23, MyGlb.PANEL_FORM, 1096, 508, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP23, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_VP23, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_VP23, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_VP23, -1, "", "VP23", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_VP23, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICINTEDOVU, MyGlb.PANEL_LIST, 40, 72, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICINTEDOVU, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICINTEDOVU, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICINTEDOVU, MyGlb.PANEL_FORM, 56, 476, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICINTEDOVU, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICINTEDOVU, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICINTEDOVU, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICINTEDOVU, -1, "", "ETICINTEDOVU", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICINTEDOVU, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICREANNPRE, MyGlb.PANEL_LIST, 40, 72, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICREANNPRE, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICREANNPRE, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICREANNPRE, MyGlb.PANEL_FORM, 56, 380, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICREANNPRE, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICREANNPRE, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICREANNPRE, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICREANNPRE, -1, "", "ETICREANNPRE", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICREANNPRE, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICVERAUTUE, MyGlb.PANEL_LIST, 48, 80, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICVERAUTUE, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICVERAUTUE, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICVERAUTUE, MyGlb.PANEL_FORM, 56, 412, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICVERAUTUE, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICVERAUTUE, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICVERAUTUE, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICVERAUTUE, -1, "", "ETICVERAUTUE", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICVERAUTUE, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDIMPO, MyGlb.PANEL_LIST, 56, 88, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDIMPO, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDIMPO, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDIMPO, MyGlb.PANEL_FORM, 56, 444, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDIMPO, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICCREDIMPO, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICCREDIMPO, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICCREDIMPO, -1, "", "ETICCREDIMPO", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICCREDIMPO, 2);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICACCODOVU, MyGlb.PANEL_LIST, 64, 96, 108, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICACCODOVU, MyGlb.PANEL_LIST, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICACCODOVU, MyGlb.PANEL_LIST, 1);
    PAN_DATCOMLIQIVA.SetRect(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICACCODOVU, MyGlb.PANEL_FORM, 56, 508, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DATCOMLIQIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICACCODOVU, MyGlb.PANEL_FORM, 0);
    PAN_DATCOMLIQIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DATCOMLIQIVA_ETICACCODOVU, MyGlb.PANEL_FORM, 1);
    PAN_DATCOMLIQIVA.SetFieldPage(PFL_DATCOMLIQIVA_ETICACCODOVU, -1, -1);
    PAN_DATCOMLIQIVA.SetFieldPanel(PFL_DATCOMLIQIVA_ETICACCODOVU, -1, "", "ETICACCODOVU", 0, 0, 0, -13997);
    PAN_DATCOMLIQIVA.set_Alignment(PFL_DATCOMLIQIVA_ETICACCODOVU, 2);
  }

  private void PAN_DATCOMLIQIVA_InitQueries()
  {
    StringBuffer SQL;

    PAN_DATCOMLIQIVA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DATCOMLIQIVA.SetIMDB(IMDB, "PQRY_COMUNILIQIVA", true);
    PAN_DATCOMLIQIVA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DEBITO_PREC_M1 as DEBITO_PREC_M1, ");
    SQL.append("  A.CREDITO_PREC_M1 as CREDITO_PREC_M1, ");
    SQL.append("  A.IMPONIBILE_VEN_M1 as IMPONIBILE_VEN_M1, ");
    SQL.append("  A.IVA_VEN_M1 as IVA_VEN_M1, ");
    SQL.append("  A.IMPONIBILE_ACQ_M1 as IMPONIBILE_ACQ_M1, ");
    SQL.append("  A.IVA_ACQ_M1 as IVA_ACQ_M1, ");
    SQL.append("  A.IVA_DOVUTA_M1 as IVA_DOVUTA_M1, ");
    SQL.append("  A.IVA_CREDITO_M1 as IVA_CREDITO_M1, ");
    SQL.append("  A.IMPORTO_DA_VERSARE_M1 as IMPORTO_DA_VERSARE_M1, ");
    SQL.append("  A.IMPORTO_A_CREDITO_M1 as IMPORTO_A_CREDITO_M1, ");
    SQL.append("  A.DEBITO_PREC_M2 as DEBITO_PREC_M2, ");
    SQL.append("  A.CREDITO_PREC_M2 as CREDITO_PREC_M2, ");
    SQL.append("  A.IMPONIBILE_VEN_M2 as IMPONIBILE_VEN_M2, ");
    SQL.append("  A.IVA_VEN_M2 as IVA_VEN_M2, ");
    SQL.append("  A.IMPONIBILE_ACQ_M2 as IMPONIBILE_ACQ_M2, ");
    SQL.append("  A.IVA_ACQ_M2 as IVA_ACQ_M2, ");
    SQL.append("  A.IVA_DOVUTA_M2 as IVA_DOVUTA_M2, ");
    SQL.append("  A.IVA_CREDITO_M2 as IVA_CREDITO_M2, ");
    SQL.append("  A.IMPORTO_DA_VERSARE_M2 as IMPORTO_DA_VERSARE_M2, ");
    SQL.append("  A.IMPORTO_A_CREDITO_M2 as IMPORTO_A_CREDITO_M2, ");
    SQL.append("  A.DEBITO_PREC_M3 as DEBITO_PREC_M3, ");
    SQL.append("  A.CREDITO_PREC_M3 as CREDITO_PREC_M3, ");
    SQL.append("  A.IMPONIBILE_VEN_M3 as IMPONIBILE_VEN_M3, ");
    SQL.append("  A.IVA_VEN_M3 as IVA_VEN_M3, ");
    SQL.append("  A.IMPONIBILE_ACQ_M3 as IMPONIBILE_ACQ_M3, ");
    SQL.append("  A.IVA_ACQ_M3 as IVA_ACQ_M3, ");
    SQL.append("  A.IVA_DOVUTA_M3 as IVA_DOVUTA_M3, ");
    SQL.append("  A.IVA_CREDITO_M3 as IVA_CREDITO_M3, ");
    SQL.append("  A.IMPORTO_DA_VERSARE_M3 as IMPORTO_DA_VERSARE_M3, ");
    SQL.append("  A.IMPORTO_A_CREDITO_M3 as IMPORTO_A_CREDITO_M3, ");
    SQL.append("  A.DEBITO_PREC_T as DEBITO_PREC_T, ");
    SQL.append("  A.CREDITO_PREC_T as CREDITO_PREC_T, ");
    SQL.append("  A.IMPONIBILE_VEN_T as IMPONIBILE_VEN_T, ");
    SQL.append("  A.IVA_VEN_T as IVA_VEN_T, ");
    SQL.append("  A.IMPONIBILE_ACQ_T as IMPONIBILE_ACQ_T, ");
    SQL.append("  A.IVA_ACQ_T as IVA_ACQ_T, ");
    SQL.append("  A.IVA_DOVUTA_T as IVA_DOVUTA_T, ");
    SQL.append("  A.IVA_CREDITO_T as IVA_CREDITO_T, ");
    SQL.append("  A.IMPORTO_DA_VERSARE_T as IMPORTO_DA_VERSARE_T, ");
    SQL.append("  A.IMPORTO_A_CREDITO_T as IMPORTO_A_CREDITO_T, ");
    SQL.append("  A.INTERESSE_PERC as INTERESSE_PERC, ");
    SQL.append("  A.INTERESSI_DOVUTI as INTERESSI_DOVUTI, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.TRIMESTRE as TRIMESTRE, ");
    SQL.append("  A.FILE_XML as FILE_XML, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.CF_DICHIARANTE as CF_DICHIARANTE, ");
    SQL.append("  A.CODICE_CARICA as CODICE_CARICA, ");
    SQL.append("  A.FIRMA as FIRMA, ");
    SQL.append("  A.CODICE_FISCALE_INTERMEDIARIO as CODICE_FISCALE_INTERMEDIARIO, ");
    SQL.append("  A.IMPEGNO_PRESENTAZIONE as IMPEGNO_PRESENTAZIONE, ");
    SQL.append("  A.DATA_IMPEGNO as DATA_IMPEGNO, ");
    SQL.append("  A.FIRMA_INTERMEDIARIO as FIRMA_INTERMEDIARIO, ");
    SQL.append("  A.CREDITO_ANNO_PREC_M1 as CREDITO_ANNO_PREC_M1, ");
    SQL.append("  A.CREDITO_ANNO_PREC_M2 as CREDITO_ANNO_PREC_M2, ");
    SQL.append("  A.CREDITO_ANNO_PREC_M3 as CREDITO_ANNO_PREC_M3, ");
    SQL.append("  A.CREDITO_ANNO_PREC_T as CREDITO_ANNO_PREC_T, ");
    SQL.append("  A.VERSAMENTI_AUTO_UE_M1 as VERSAMENTI_AUTO_UE_M1, ");
    SQL.append("  A.VERSAMENTI_AUTO_UE_M2 as VERSAMENTI_AUTO_UE_M2, ");
    SQL.append("  A.VERSAMENTI_AUTO_UE_M3 as VERSAMENTI_AUTO_UE_M3, ");
    SQL.append("  A.VERSAMENTI_AUTO_UE_T as VERSAMENTI_AUTO_UE_T, ");
    SQL.append("  A.CREDITI_IMPOSTA_M1 as CREDITI_IMPOSTA_M1, ");
    SQL.append("  A.CREDITI_IMPOSTA_M2 as CREDITI_IMPOSTA_M2, ");
    SQL.append("  A.CREDITI_IMPOSTA_M3 as CREDITI_IMPOSTA_M3, ");
    SQL.append("  A.CREDITI_IMPOSTA_T as CREDITI_IMPOSTA_T, ");
    SQL.append("  A.ACCONTO_DOVUTO_M1 as ACCONTO_DOVUTO_M1, ");
    SQL.append("  A.ACCONTO_DOVUTO_M2 as ACCONTO_DOVUTO_M2, ");
    SQL.append("  A.ACCONTO_DOVUTO_M3 as ACCONTO_DOVUTO_M3, ");
    SQL.append("  A.ACCONTO_DOVUTO_T as ACCONTO_DOVUTO_T, ");
    SQL.append("  A.METODO_ACCONTO_M1 as METODO_ACCONTO_M1, ");
    SQL.append("  A.METODO_ACCONTO_M2 as METODO_ACCONTO_M2, ");
    SQL.append("  A.METODO_ACCONTO_M3 as METODO_ACCONTO_M3, ");
    SQL.append("  A.METODO_ACCONTO_T as METODO_ACCONTO_T ");
    PAN_DATCOMLIQIVA.SetQuery(PPQRY_COMUNILIQIVA, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  COMUNICAZIONE_LIQ_IVA A ");
    PAN_DATCOMLIQIVA.SetQuery(PPQRY_COMUNILIQIVA, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI589.NOMEOGGEESER~~) ");
    SQL.append("and   (A.TRIMESTRE = ~~TBL_PARAMETRI589.NOMOGGPERTRI~~) ");
    PAN_DATCOMLIQIVA.SetQuery(PPQRY_COMUNILIQIVA, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATCOMLIQIVA.SetQuery(PPQRY_COMUNILIQIVA, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATCOMLIQIVA.SetQuery(PPQRY_COMUNILIQIVA, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DATCOMLIQIVA.SetQuery(PPQRY_COMUNILIQIVA, 5, SQL, -1, "");
    PAN_DATCOMLIQIVA.SetQueryDB(PPQRY_COMUNILIQIVA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DATCOMLIQIVA.SetMasterTable(0, "COMUNICAZIONE_LIQ_IVA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DATCOMLIQIVA.Status() == 2)
    {
      int oldListQBE = PAN_DATCOMLIQIVA.iUseListQBE;
      PAN_DATCOMLIQIVA.iUseListQBE = 0;
      PAN_DATCOMLIQIVA.PanelCommand(Glb.PCM_SEARCH);
      PAN_DATCOMLIQIVA.PanelCommand(Glb.PCM_FIND);
      PAN_DATCOMLIQIVA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DATCOMLIQIVA) PAN_DATCOMLIQIVA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATCOMLIQIVA) PAN_DATCOMLIQIVA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DATCOMLIQIVA) PAN_DATCOMLIQIVA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DATCOMLIQIVA) PAN_DATCOMLIQIVA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DATCOMLIQIVA) PAN_DATCOMLIQIVA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DATCOMLIQIVA) PAN_DATCOMLIQIVA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
