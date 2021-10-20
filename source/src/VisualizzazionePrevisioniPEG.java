// **********************************************
// Visualizzazione Previsioni P E G
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VisualizzazionePrevisioniPEG extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_PREVIPEGREPO;
  OBook BKW_PREVIPEGREPO;
  //
  // Template Pages constants
  private static int BUK_PREVIPEGREPO_MST_CFWRPRPEBOPA = 1;
  private static int BUK_PREVIPEGREPO_RPTBOX_NUMEROPAGIN1 = 2;
  private static int BUK_PREVIPEGREPO_SPAN_CPTSPPRVPPEG = 3;
  private static int BUK_PREVIPEGREPO_RPTBOX_PAGEHEADER1 = 4;
  private static int BUK_PREVIPEGREPO_SPAN_PREVISIONPE1 = 5;
  private static int BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1 = 6;
  private static int BUK_PREVIPEGREPO_RPTBOX_PAGEFOOTER1 = 7;

  //
  // Reports constants
  private static int BUK_PREVIPEGREPO_RPT_PREPEGPDFREP = 8;
  private static int BUK_PREVIPEGREPO_SEC_UNIORGGROHEA = 9;
  private static int BUK_PREVIPEGREPO_RPTBOX_PREANNINCOH1 = 10;
  private static int BUK_PREVIPEGREPO_SPAN_PREVANNINCO1 = 11;
  private static int BUK_PREVIPEGREPO_RPTBOX_STANINIZHEA1 = 12;
  private static int BUK_PREVIPEGREPO_SPAN_STANZIINIZI1 = 13;
  private static int BUK_PREVIPEGREPO_RPTBOX_VARIAZHEADE1 = 14;
  private static int BUK_PREVIPEGREPO_SPAN_VARIAZIONI2 = 15;
  private static int BUK_PREVIPEGREPO_RPTBOX_STADEFATTHE1 = 16;
  private static int BUK_PREVIPEGREPO_SPAN_STADEFATTHEA = 17;
  private static int BUK_PREVIPEGREPO_RPTBOX_DESCRIZIONU1 = 18;
  private static int BUK_PREVIPEGREPO_SPAN_DESCRIZIONU1 = 19;
  private static int BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA = 20;
  private static int BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO1 = 21;
  private static int BUK_PREVIPEGREPO_SPAN_TOTPREANNCO2 = 22;
  private static int BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI2 = 23;
  private static int BUK_PREVIPEGREPO_SPAN_TOTALSTNINI2 = 24;
  private static int BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA1 = 25;
  private static int BUK_PREVIPEGREPO_SPAN_TOTALEVARIA2 = 26;
  private static int BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEF1 = 27;
  private static int BUK_PREVIPEGREPO_SPAN_TOTALSTNDEF2 = 28;
  private static int BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPR1 = 29;
  private static int BUK_PREVIPEGREPO_SPAN_ESPANDCOMPR1 = 30;
  private static int BUK_PREVIPEGREPO_RPTBOX_DESCRIZIONE1 = 31;
  private static int BUK_PREVIPEGREPO_SPAN_DESCRIZIONE1 = 32;
  private static int BUK_PREVIPEGREPO_SEC_TITOGROUHEAD = 33;
  private static int BUK_PREVIPEGREPO_RPTBOX_DESCRITITOL1 = 34;
  private static int BUK_PREVIPEGREPO_SPAN_DESCRITITOL1 = 35;
  private static int BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO3 = 36;
  private static int BUK_PREVIPEGREPO_SPAN_TOTPREANNCO3 = 37;
  private static int BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI3 = 38;
  private static int BUK_PREVIPEGREPO_SPAN_TGHSCWPPSIVP = 39;
  private static int BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA2 = 40;
  private static int BUK_PREVIPEGREPO_SPAN_TOTALEVARIA3 = 41;
  private static int BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEFI = 42;
  private static int BUK_PREVIPEGREPO_SPAN_TOTALSTNDEF3 = 43;
  private static int BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPRI = 44;
  private static int BUK_PREVIPEGREPO_SPAN_ESPANDCOMPRI = 45;
  private static int BUK_PREVIPEGREPO_RPTBOX_CAPITARTHEA1 = 46;
  private static int BUK_PREVIPEGREPO_SPAN_C1 = 47;
  private static int BUK_PREVIPEGREPO_RPTBOX_CODICEHEADE1 = 48;
  private static int BUK_PREVIPEGREPO_SPAN_CODICE2 = 49;
  private static int BUK_PREVIPEGREPO_RPTBOX_DESCRIHEADE1 = 50;
  private static int BUK_PREVIPEGREPO_SPAN_CODICE3 = 51;
  private static int BUK_PREVIPEGREPO_RPTBOX_UOGESTIHEAD1 = 52;
  private static int BUK_PREVIPEGREPO_SPAN_UOGESTIONE1 = 53;
  private static int BUK_PREVIPEGREPO_RPTBOX_UOUTILIHEAD1 = 54;
  private static int BUK_PREVIPEGREPO_SPAN_DESCRIZIONE2 = 55;
  private static int BUK_PREVIPEGREPO_RPTBOX_BARRA1 = 56;
  private static int BUK_PREVIPEGREPO_SEC_DETAIL = 57;
  private static int BUK_PREVIPEGREPO_RPTBOX_VOCEPEG2 = 58;
  private static int BUK_PREVIPEGREPO_SPAN_VOCEPEG3 = 59;
  private static int BUK_PREVIPEGREPO_RPTBOX_CODICEBILANC = 60;
  private static int BUK_PREVIPEGREPO_SPAN_CODICEBILAN1 = 61;
  private static int BUK_PREVIPEGREPO_RPTBOX_DESCRVOCEPE1 = 62;
  private static int BUK_PREVIPEGREPO_SPAN_DESCRVOCEPE1 = 63;
  private static int BUK_PREVIPEGREPO_RPTBOX_DESCRUOGEST1 = 64;
  private static int BUK_PREVIPEGREPO_SPAN_DESCRUOGEST1 = 65;
  private static int BUK_PREVIPEGREPO_RPTBOX_DESCRUOUTIL1 = 66;
  private static int BUK_PREVIPEGREPO_SPAN_DESCRUOUTIL1 = 67;
  private static int BUK_PREVIPEGREPO_RPTBOX_PREVANNOCORS = 68;
  private static int BUK_PREVIPEGREPO_SPAN_PREVANNOCOR1 = 69;
  private static int BUK_PREVIPEGREPO_RPTBOX_STNINIZIALE2 = 70;
  private static int BUK_PREVIPEGREPO_SPAN_STNINIZIALE1 = 71;
  private static int BUK_PREVIPEGREPO_RPTBOX_VARIAZIONI2 = 72;
  private static int BUK_PREVIPEGREPO_SPAN_VARIAZIONI3 = 73;
  private static int BUK_PREVIPEGREPO_RPTBOX_STNDEFINITI2 = 74;
  private static int BUK_PREVIPEGREPO_SPAN_STNDEFINITI1 = 75;
  private static int BUK_PREVIPEGREPO_SEC_TITOGROUFOOT = 76;
  private static int BUK_PREVIPEGREPO_SEC_ENTSPEGROFOO = 77;
  private static int BUK_PREVIPEGREPO_SEC_UNIORGGROFOO = 78;

  CIDREObj BUK_PREVIPEGSTAM;
  OBook BKW_PREVIPEGSTAM;
  //
  // Template Pages constants
  private static int BUK_PREVIPEGSTAM_MST_CFWRPRPEBOPA = 1;
  private static int BUK_PREVIPEGSTAM_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_PREVIPEGSTAM_SPAN_CPTSPPSVPPEG = 3;
  private static int BUK_PREVIPEGSTAM_RPTBOX_PAGEHEADER = 4;
  private static int BUK_PREVIPEGSTAM_SPAN_PREVISIONPEG = 5;
  private static int BUK_PREVIPEGSTAM_RPTBOX_PAGEBODY = 6;
  private static int BUK_PREVIPEGSTAM_RPTBOX_PAGEFOOTER = 7;

  //
  // Reports constants
  private static int BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP = 8;
  private static int BUK_PREVIPEGSTAM_SEC_UNIORGGROHEA = 9;
  private static int BUK_PREVIPEGSTAM_SEC_ENTSPEGROHEA = 10;
  private static int BUK_PREVIPEGSTAM_RPTBOX_DESCRIZIONUO = 11;
  private static int BUK_PREVIPEGSTAM_SPAN_DESCRIZIONUO = 12;
  private static int BUK_PREVIPEGSTAM_RPTBOX_TRATTINO = 13;
  private static int BUK_PREVIPEGSTAM_SPAN_TRATTINO = 14;
  private static int BUK_PREVIPEGSTAM_RPTBOX_DESCRIZIONES = 15;
  private static int BUK_PREVIPEGSTAM_SPAN_DESCRIZIONES = 16;
  private static int BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD = 17;
  private static int BUK_PREVIPEGSTAM_RPTBOX_PREANNINCOHE = 18;
  private static int BUK_PREVIPEGSTAM_SPAN_PREVANNINCOR = 19;
  private static int BUK_PREVIPEGSTAM_RPTBOX_STANINIZHEAD = 20;
  private static int BUK_PREVIPEGSTAM_SPAN_STANZIINIZIA = 21;
  private static int BUK_PREVIPEGSTAM_RPTBOX_VARIAZHEADER = 22;
  private static int BUK_PREVIPEGSTAM_SPAN_VARIAZIONI1 = 23;
  private static int BUK_PREVIPEGSTAM_RPTBOX_STADEFATTHEA = 24;
  private static int BUK_PREVIPEGSTAM_SPAN_STANZIDEFINI = 25;
  private static int BUK_PREVIPEGSTAM_RPTBOX_CAPITARTHEAD = 26;
  private static int BUK_PREVIPEGSTAM_SPAN_C = 27;
  private static int BUK_PREVIPEGSTAM_RPTBOX_CODICEHEADER = 28;
  private static int BUK_PREVIPEGSTAM_SPAN_CODICE1 = 29;
  private static int BUK_PREVIPEGSTAM_RPTBOX_DESCRIHEADER = 30;
  private static int BUK_PREVIPEGSTAM_SPAN_CODICE = 31;
  private static int BUK_PREVIPEGSTAM_RPTBOX_UOGESTIHEADE = 32;
  private static int BUK_PREVIPEGSTAM_SPAN_UOGESTIONE = 33;
  private static int BUK_PREVIPEGSTAM_RPTBOX_UOUTILIHEADE = 34;
  private static int BUK_PREVIPEGSTAM_SPAN_DESCRIZIONE = 35;
  private static int BUK_PREVIPEGSTAM_RPTBOX_DESCRITITOLO = 36;
  private static int BUK_PREVIPEGSTAM_SPAN_DESCRITITOLO = 37;
  private static int BUK_PREVIPEGSTAM_RPTBOX_BARRA = 38;
  private static int BUK_PREVIPEGSTAM_SEC_DETAIL = 39;
  private static int BUK_PREVIPEGSTAM_RPTBOX_VOCEPEG1 = 40;
  private static int BUK_PREVIPEGSTAM_SPAN_VOCEPEG = 41;
  private static int BUK_PREVIPEGSTAM_RPTBOX_CODICEBILAN1 = 42;
  private static int BUK_PREVIPEGSTAM_SPAN_CODICEBILANC = 43;
  private static int BUK_PREVIPEGSTAM_RPTBOX_DESCRVOCEPEG = 44;
  private static int BUK_PREVIPEGSTAM_SPAN_DESCRVOCEPEG = 45;
  private static int BUK_PREVIPEGSTAM_RPTBOX_DESCRUOGESTI = 46;
  private static int BUK_PREVIPEGSTAM_SPAN_DESCRUOGESTI = 47;
  private static int BUK_PREVIPEGSTAM_RPTBOX_DESCRUOUTILI = 48;
  private static int BUK_PREVIPEGSTAM_SPAN_DESCRUOUTILI = 49;
  private static int BUK_PREVIPEGSTAM_RPTBOX_PREVANNOCOR1 = 50;
  private static int BUK_PREVIPEGSTAM_SPAN_PREVANNOCORS = 51;
  private static int BUK_PREVIPEGSTAM_RPTBOX_STNINIZIALE = 52;
  private static int BUK_PREVIPEGSTAM_SPAN_STNINIZIALE = 53;
  private static int BUK_PREVIPEGSTAM_RPTBOX_VARIAZIONI = 54;
  private static int BUK_PREVIPEGSTAM_SPAN_VARIAZIONI = 55;
  private static int BUK_PREVIPEGSTAM_RPTBOX_STNDEFINITI1 = 56;
  private static int BUK_PREVIPEGSTAM_SPAN_STNDEFINITIV = 57;
  private static int BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT = 58;
  private static int BUK_PREVIPEGSTAM_RPTBOX_TOTATITOLABE = 59;
  private static int BUK_PREVIPEGSTAM_SPAN_TOTALETITOLO = 60;
  private static int BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCO2 = 61;
  private static int BUK_PREVIPEGSTAM_SPAN_TOTPREANNCO1 = 62;
  private static int BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINI1 = 63;
  private static int BUK_PREVIPEGSTAM_SPAN_TOTALSTNINI1 = 64;
  private static int BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIAZ = 65;
  private static int BUK_PREVIPEGSTAM_SPAN_TOTALEVARIA1 = 66;
  private static int BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF2 = 67;
  private static int BUK_PREVIPEGSTAM_SPAN_TOTALSTNDEF1 = 68;
  private static int BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO = 69;
  private static int BUK_PREVIPEGSTAM_RPTBOX_TOTAPARTLABE = 70;
  private static int BUK_PREVIPEGSTAM_SPAN_TOTAPARTLABE = 71;
  private static int BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCOR = 72;
  private static int BUK_PREVIPEGSTAM_SPAN_TOTPREANNCOR = 73;
  private static int BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINIZ = 74;
  private static int BUK_PREVIPEGSTAM_SPAN_TOTALSTNINIZ = 75;
  private static int BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIA3 = 76;
  private static int BUK_PREVIPEGSTAM_SPAN_TOTALEVARIAZ = 77;
  private static int BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF3 = 78;
  private static int BUK_PREVIPEGSTAM_SPAN_TOTALSTNDEFI = 79;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI86(IMDB);
    //
    //
    Init_PQRY_CF4WRKPREPE3(IMDB);
    Init_PQRY_CF4WRKPREPE5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI86(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI86, 5);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI86, "TBL_PARAMETRI86");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI86,IMDBDef6.FLD_PARAMETRI86_PARATIPOSTRU, "PARATIPOSTRU");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI86,IMDBDef6.FLD_PARAMETRI86_PARATIPOSTRU,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI86,IMDBDef6.FLD_PARAMETRI86_PARAPROUOSTR, "PARAPROUOSTR");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI86,IMDBDef6.FLD_PARAMETRI86_PARAPROUOSTR,1,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI86,IMDBDef6.FLD_PARAMETRI86_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI86,IMDBDef6.FLD_PARAMETRI86_PARAMORDINAM,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI86,IMDBDef6.FLD_PARAMETRI86_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI86,IMDBDef6.FLD_PARAMETRI86_PARPREANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI86,IMDBDef6.FLD_PARAMETRI86_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI86,IMDBDef6.FLD_PARAMETRI86_PARAMVARIAZI,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI86, 0);
  }

  private static void Init_PQRY_CF4WRKPREPE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CF4WRKPREPE3, 17);
    IMDB.set_TblCode(IMDBDef17.PQRY_CF4WRKPREPE3, "PQRY_CF4WRKPREPE3");
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_CFWRPRPEPRUO, "CFWRPRPEPRUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_CFWRPRPEPRUO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_CFWRPRPEDEUO, "CFWRPRPEDEUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_CFWRPRPEDEUO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_CFWRPRPEDEES, "CFWRPRPEDEES");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_CFWRPRPEDEES,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_DESCR_TITOLO, "DESCR_TITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_DESCR_TITOLO,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_CODICE_BILANCIO, "CODICE_BILANCIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_CODICE_BILANCIO,5,7,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_DESCR_VOCE_PEG, "DESCR_VOCE_PEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_DESCR_VOCE_PEG,5,300,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_DESCR_UO_GESTIONE, "DESCR_UO_GESTIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_DESCR_UO_GESTIONE,5,120,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_DESCR_UO_UTILIZZO, "DESCR_UO_UTILIZZO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_DESCR_UO_UTILIZZO,5,120,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_PREV_ANNO_CORSO, "PREV_ANNO_CORSO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_PREV_ANNO_CORSO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_STN_INIZIALE, "STN_INIZIALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_STN_INIZIALE,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_VARIAZIONI,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_STN_DEFINITIVO, "STN_DEFINITIVO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE3,IMDBDef17.PQSL_CF4WRKPREPE3_STN_DEFINITIVO,3,14,2);
    IMDB.TblAddNew(IMDBDef17.PQRY_CF4WRKPREPE3, 0);
  }

  private static void Init_PQRY_CF4WRKPREPE5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CF4WRKPREPE5, 17);
    IMDB.set_TblCode(IMDBDef17.PQRY_CF4WRKPREPE5, "PQRY_CF4WRKPREPE5");
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_CFWRPRPEPRUO, "CFWRPRPEPRUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_CFWRPRPEPRUO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_CFWRPRPEDEUO, "CFWRPRPEDEUO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_CFWRPRPEDEUO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_CFWRPRPEDEES, "CFWRPRPEDEES");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_CFWRPRPEDEES,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_DESCR_TITOLO, "DESCR_TITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_DESCR_TITOLO,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_CODICE_BILANCIO, "CODICE_BILANCIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_CODICE_BILANCIO,5,7,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_DESCR_VOCE_PEG, "DESCR_VOCE_PEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_DESCR_VOCE_PEG,5,300,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_DESCR_UO_GESTIONE, "DESCR_UO_GESTIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_DESCR_UO_GESTIONE,5,120,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_DESCR_UO_UTILIZZO, "DESCR_UO_UTILIZZO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_DESCR_UO_UTILIZZO,5,120,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_PREV_ANNO_CORSO, "PREV_ANNO_CORSO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_PREV_ANNO_CORSO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_STN_INIZIALE, "STN_INIZIALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_STN_INIZIALE,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_VARIAZIONI,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_STN_DEFINITIVO, "STN_DEFINITIVO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CF4WRKPREPE5,IMDBDef17.PQSL_CF4WRKPREPE5_STN_DEFINITIVO,3,14,2);
    IMDB.TblAddNew(IMDBDef17.PQRY_CF4WRKPREPE5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VisualizzazionePrevisioniPEG(MyWebEntryPoint w, IMDBObj imdb)
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
  public VisualizzazionePrevisioniPEG()
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
    FormIdx = MyGlb.FRM_VISUAPREVPEG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "66568676-C11A-4004-A5A8-4F93CA2E28FC";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1188;
    DesignHeight = 890;
    set_Caption(new IDVariant("Visualizzazione Previsioni P E G"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1188;
    Frames[1].Height = 864;
    Frames[1].Caption = "Previsioni PEG Report";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 864;
    BKW_PREVIPEGREPO = new OBook(this);
    BUK_PREVIPEGREPO = new CIDREObj(BKW_PREVIPEGREPO);
    Frames[1].Content = BKW_PREVIPEGREPO;
    BKW_PREVIPEGREPO.Height = 834;
    BKW_PREVIPEGREPO.Width = 1188;
    BKW_PREVIPEGREPO.iGuid = "2A74B9D6-AA91-43CC-93B4-55A15CE62ED0";
    BKW_PREVIPEGREPO.Code = "BUK_PREVIPEGREPO";
    BKW_PREVIPEGREPO.BookObj = BUK_PREVIPEGREPO;
    BKW_PREVIPEGREPO.InitDefMasks();
    BUK_PREVIPEGREPO.set_FrIndex(1);
    BUK_PREVIPEGREPO.InitBook(1, 3342593, "Previsioni PEG Report", IMDB, MainFrm.VisualStyleList);
    BUK_PREVIPEGREPO.InitHTML();
    BUK_PREVIPEGREPO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_PREVIPEGREPO.SetSize(1188, 834);
    BUK_PREVIPEGREPO.Book.SetMainFrm(MainFrm);
    BUK_PREVIPEGREPO.SetRTCGuid(0, "2A74B9D6-AA91-43CC-93B4-55A15CE62ED0");
    BUK_PREVIPEGREPO.SetObjCode(0, "PREVIPEGREPO");
    BUK_PREVIPEGREPO_MST_CFWRPRPEBOPA_Init();
    BUK_PREVIPEGREPO_RPT_PREPEGPDFREP_Init();
    BUK_PREVIPEGREPO_InitLinks();
    BKW_PREVIPEGSTAM = new OBook(this);
    BUK_PREVIPEGSTAM = new CIDREObj(BKW_PREVIPEGSTAM);
    BKW_PREVIPEGSTAM.iGuid = "543A21DE-48CB-4308-8EEE-1853963F9C27";
    BKW_PREVIPEGSTAM.Code = "BUK_PREVIPEGSTAM";
    BKW_PREVIPEGSTAM.BookObj = BUK_PREVIPEGSTAM;
    BKW_PREVIPEGSTAM.InitDefMasks();
    BUK_PREVIPEGSTAM.InitBook(1, 3342593, "Previsioni PEG Stampa", IMDB, MainFrm.VisualStyleList);
    BUK_PREVIPEGSTAM.InitHTML();
    BUK_PREVIPEGSTAM.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_PREVIPEGSTAM.Book.SetMainFrm(MainFrm);
    BUK_PREVIPEGSTAM.SetRTCGuid(0, "543A21DE-48CB-4308-8EEE-1853963F9C27");
    BUK_PREVIPEGSTAM.SetObjCode(0, "PREVIPEGSTAM");
    BUK_PREVIPEGSTAM_MST_CFWRPRPEBOPA_Init();
    BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP_Init();
    BUK_PREVIPEGSTAM_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_STAMPACOMPL1+BaseCmdLinIdx)
      {
        ApriStampaCompleta();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPANDITUTT1+BaseCmdLinIdx)
      {
        EspandiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMPRIMTUTT1+BaseCmdLinIdx)
      {
        ComprimiTutto();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI32+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG147+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI32+BaseCmdLinIdx), FormIdx, 1);
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
      BUK_PREVIPEGREPO.UpdateBook();
      // BUK_PREVIPEGSTAM.UpdateBook();
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
    if (Code.equals("BUK_PREVIPEGREPO")) return BUK_PREVIPEGREPO;
    if (Code.equals("BUK_PREVIPEGSTAM")) return BUK_PREVIPEGSTAM;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof VisualizzazionePrevisioniPEG);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VisualizzazionePrevisioniPEG.class.getName() : (Glb.ClassWithPackage(VisualizzazionePrevisioniPEG.class) ? VisualizzazionePrevisioniPEG.class.getName().substring(VisualizzazionePrevisioniPEG.class.getPackage().getName().length() + 1) : VisualizzazionePrevisioniPEG.class.getName()));
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Previsioni P.e.g.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      // BUK_PREVIPEGSTAM.set_PrintDestination((new IDVariant(3)).intValue());
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARAMVARIAZI, 0).equals((new IDVariant("NO")), true) && IMDB.Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARPREANINCO, 0).equals((new IDVariant("SI")), true))
      {
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_BARRA1, IDREGlb.RECT_WIDTH, IDL.Sub((new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_VARIAZHEADE1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_CAPITARTHEA1, IDREGlb.RECT_LEFT)))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_BARRA, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_VARIAZHEADER, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_PAGEHEADER1, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_VARIAZHEADE1, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_PAGEHEADER, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_VARIAZHEADER, IDREGlb.RECT_LEFT))).dblValue());
      }
      else
      {
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARAMVARIAZI, 0).equals((new IDVariant("NO")), true) && IMDB.Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARPREANINCO, 0).equals((new IDVariant("NO")), true))
        {
          BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_BARRA1, IDREGlb.RECT_WIDTH, IDL.Sub((new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_STANINIZHEA1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_CAPITARTHEA1, IDREGlb.RECT_LEFT)))).dblValue());
          BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_BARRA, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_STANINIZHEAD, IDREGlb.RECT_LEFT))).dblValue());
          BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_PAGEHEADER1, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_STANINIZHEA1, IDREGlb.RECT_LEFT))).dblValue());
          BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_PAGEHEADER, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_STANINIZHEAD, IDREGlb.RECT_LEFT))).dblValue());
        }
        else
        {
          if (IMDB.Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARAMVARIAZI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARPREANINCO, 0).equals((new IDVariant("NO")), true))
          {
            BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_BARRA1, IDREGlb.RECT_WIDTH, IDL.Sub((new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_STADEFATTHE1, IDREGlb.RECT_LEFT))), (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_CAPITARTHEA1, IDREGlb.RECT_LEFT)))).dblValue());
            BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_BARRA, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_STADEFATTHEA, IDREGlb.RECT_LEFT))).dblValue());
            BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_PAGEHEADER1, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_STADEFATTHE1, IDREGlb.RECT_LEFT))).dblValue());
            BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_PAGEHEADER, IDREGlb.RECT_WIDTH, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_STADEFATTHEA, IDREGlb.RECT_LEFT))).dblValue());
          }
          else
          {
            BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_BARRA1, IDREGlb.RECT_WIDTH, (new IDVariant(260, IDVariant.FLOAT)).dblValue());
            BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_BARRA, IDREGlb.RECT_WIDTH, (new IDVariant(267, IDVariant.FLOAT)).dblValue());
            BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_PAGEHEADER1, IDREGlb.RECT_WIDTH, (new IDVariant(270, IDVariant.FLOAT)).dblValue());
            BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_PAGEHEADER, IDREGlb.RECT_WIDTH, (new IDVariant(270, IDVariant.FLOAT)).dblValue());
          }
        }
      }
      // BUK_PREVIPEGSTAM.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARPREANINCO, 0).equals((new IDVariant("NO")), true))
      {
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_STADEFATTHE1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_VARIAZHEADE1, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_VARIAZHEADE1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_STANINIZHEA1, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEF1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA1, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI2, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEFI, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA2, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI3, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_STNDEFINITI2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_VARIAZIONI2, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_VARIAZIONI2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_STNINIZIALE2, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_STADEFATTHEA, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_VARIAZHEADER, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_VARIAZHEADER, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_STANINIZHEAD, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIAZ, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIAZ, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINI1, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_STNDEFINITI1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_VARIAZIONI, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_VARIAZIONI, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_STNINIZIALE, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIA3, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIA3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINIZ, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_STANINIZHEA1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_PREANNINCOH1, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_STANINIZHEAD, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_PREANNINCOHE, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_STNINIZIALE2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_PREVANNOCORS, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_STNINIZIALE, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_PREVANNOCOR1, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI3, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO3, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINI1, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCOR, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI2, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGREPO.BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO1, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINIZ, IDREGlb.RECT_LEFT, (new IDVariant(BUK_PREVIPEGSTAM.BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCOR, IDREGlb.RECT_LEFT))).dblValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_PREVANNOCORS, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_PREVANNOCOR1, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_PREVANNOCORS, IDREGlb.RECT_WIDTH, (new IDVariant(0, IDVariant.FLOAT)).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_PREVANNOCOR1, IDREGlb.RECT_WIDTH, (new IDVariant(0, IDVariant.FLOAT)).dblValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_PREANNINCOH1, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_PREANNINCOHE, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_PREANNINCOH1, IDREGlb.RECT_WIDTH, (new IDVariant(0, IDVariant.FLOAT)).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_PREANNINCOHE, IDREGlb.RECT_WIDTH, (new IDVariant(0, IDVariant.FLOAT)).dblValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO3, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCO2, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO3, IDREGlb.RECT_WIDTH, (new IDVariant(0, IDVariant.FLOAT)).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCO2, IDREGlb.RECT_WIDTH, (new IDVariant(0, IDVariant.FLOAT)).dblValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO1, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCOR, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxRect(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO1, IDREGlb.RECT_WIDTH, (new IDVariant(0, IDVariant.FLOAT)).dblValue());
        BUK_PREVIPEGSTAM.set_BoxRect(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCOR, IDREGlb.RECT_WIDTH, (new IDVariant(0, IDVariant.FLOAT)).dblValue());
      }
      else
      {
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_PREVANNOCORS, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_PREVANNOCOR1, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_PREANNINCOH1, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_PREANNINCOHE, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO3, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCO2, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO1, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCOR, (new IDVariant(-1)).booleanValue());
      }
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARAMVARIAZI, 0).equals((new IDVariant("NO")), true))
      {
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_VARIAZIONI2, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_VARIAZIONI, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_STNDEFINITI2, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_STNDEFINITI1, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_VARIAZHEADE1, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_VARIAZHEADER, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_STADEFATTHE1, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_STADEFATTHEA, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA2, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIAZ, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEFI, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF2, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA1, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIA3, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEF1, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF3, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_VARIAZIONI2, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_VARIAZIONI, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_STNDEFINITI2, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_STNDEFINITI1, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_VARIAZHEADE1, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_VARIAZHEADER, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_STADEFATTHE1, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_STADEFATTHEA, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA2, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIAZ, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEFI, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF2, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA1, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIA3, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEF1, (new IDVariant(-1)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF3, (new IDVariant(-1)).booleanValue());
      }
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARAMORDINAM, 0).equals((new IDVariant("P")), true))
      {
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARATIPOSTRU, 0).equals((new IDVariant("G")), true))
        {
          BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_UOGESTIHEAD1, (new IDVariant(-1)).booleanValue());
          BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_UOGESTIHEADE, (new IDVariant(-1)).booleanValue());
          BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_DESCRUOGEST1, (new IDVariant(-1)).booleanValue());
          BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_DESCRUOGESTI, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_UOGESTIHEAD1, (new IDVariant(0)).booleanValue());
          BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_UOGESTIHEADE, (new IDVariant(0)).booleanValue());
          BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_DESCRUOGEST1, (new IDVariant(0)).booleanValue());
          BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_DESCRUOGESTI, (new IDVariant(0)).booleanValue());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARATIPOSTRU, 0).equals((new IDVariant("G")), true))
        {
          BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_UOUTILIHEAD1, (new IDVariant(-1)).booleanValue());
          BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_UOUTILIHEADE, (new IDVariant(-1)).booleanValue());
          BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_DESCRUOUTIL1, (new IDVariant(-1)).booleanValue());
          BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_DESCRUOUTILI, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_UOUTILIHEAD1, (new IDVariant(0)).booleanValue());
          BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_UOUTILIHEADE, (new IDVariant(0)).booleanValue());
          BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_DESCRUOUTILI, (new IDVariant(0)).booleanValue());
          BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_DESCRUOUTIL1, (new IDVariant(0)).booleanValue());
        }
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_UOGESTIHEAD1, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_UOGESTIHEADE, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_DESCRUOGEST1, (new IDVariant(0)).booleanValue());
        BUK_PREVIPEGSTAM.set_BoxVisible(BUK_PREVIPEGSTAM_RPTBOX_DESCRUOGESTI, (new IDVariant(0)).booleanValue());
      }
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      Frames[BUK_PREVIPEGREPO.Book.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazionePrevisioniPEG", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Entrata Spesa Group Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Entrata Spesa Group Header Before Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_PREVIPEGREPO.SectionShowChildren(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA))).equals((new IDVariant(0)), true))
      {
        BUK_PREVIPEGREPO.SetBoxImage(BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPR1, null, (new IDVariant("tp1.gif")).toString()); 
      }
      else
      {
        BUK_PREVIPEGREPO.SetBoxImage(BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPR1, null, (new IDVariant("tm1.gif")).toString()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazionePrevisioniPEG", "EntrataSpesaGroupHeaderBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Titolo Group Header Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_PREVIPEGREPO_SEC_TITOGROUHEAD_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Titolo Group Header Before Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_PREVIPEGREPO.SectionShowChildren(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD))).equals((new IDVariant(0)), true))
      {
        BUK_PREVIPEGREPO.SetBoxImage(BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPRI, null, (new IDVariant("tp1.gif")).toString()); 
        BUK_PREVIPEGREPO.set_SectionHeight(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, (new IDVariant(7, IDVariant.FLOAT)).dblValue());
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_BARRA1, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_PREVIPEGREPO.SetBoxImage(BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPRI, null, (new IDVariant("tm1.gif")).toString()); 
        BUK_PREVIPEGREPO.set_BoxVisible(BUK_PREVIPEGREPO_RPTBOX_BARRA1, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazionePrevisioniPEG", "TitoloGroupHeaderBeforeFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Detail Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_PREVIPEGREPO_SEC_DETAIL_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Before Formatting Event Body
      // Procedure Body
      // 
      BUK_PREVIPEGREPO.set_SpanToolTip(BUK_PREVIPEGREPO_SPAN_DESCRVOCEPE1, BUK_PREVIPEGREPO.SpanValue(BUK_PREVIPEGREPO_SPAN_DESCRVOCEPE1).stringValue());
      BUK_PREVIPEGREPO.set_SpanToolTip(BUK_PREVIPEGREPO_SPAN_DESCRUOGEST1, BUK_PREVIPEGREPO.SpanValue(BUK_PREVIPEGREPO_SPAN_DESCRUOGEST1).stringValue());
      BUK_PREVIPEGREPO.set_SpanToolTip(BUK_PREVIPEGREPO_SPAN_DESCRUOUTIL1, BUK_PREVIPEGREPO.SpanValue(BUK_PREVIPEGREPO_SPAN_DESCRUOUTIL1).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazionePrevisioniPEG", "DetailBeforeFormattingEvent", _e);
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
      BUK_PREVIPEGREPO.set_SectionShowChildren(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, (new IDVariant(0)).booleanValue());
      BUK_PREVIPEGREPO.set_SectionShowChildren(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, (new IDVariant(0)).booleanValue());
      BUK_PREVIPEGREPO.set_SectionShowChildren(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_PREVIPEGREPO.set_SectionShowChildren(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, (new IDVariant(-1)).booleanValue());
      BUK_PREVIPEGREPO.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazionePrevisioniPEG", "EspandiTutto", _e);
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
      BUK_PREVIPEGREPO.set_SectionShowChildren(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, (new IDVariant(-1)).booleanValue());
      BUK_PREVIPEGREPO.set_SectionShowChildren(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, (new IDVariant(-1)).booleanValue());
      BUK_PREVIPEGREPO.set_SectionShowChildren(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, (new IDVariant(0)).booleanValue());
      BUK_PREVIPEGREPO.set_SectionShowChildren(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, (new IDVariant(0)).booleanValue());
      BUK_PREVIPEGREPO.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazionePrevisioniPEG", "ComprimiTutto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Stampa Completa
  // **********************************************************************
  public int ApriStampaCompleta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Stampa Completa Body
      // Procedure Body
      // 
      BUK_PREVIPEGSTAM.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_PREVIPEGSTAM.ReportRefreshQuery(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP);
      BUK_PREVIPEGSTAM.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_PREVIPEGSTAM.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazionePrevisioniPEG", "ApriStampaCompleta", _e);
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
      if ((new IDVariant(BUK_PREVIPEGREPO.SectionShowChildren(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD))).equals((new IDVariant(0)), true))
      {
        BUK_PREVIPEGREPO.set_SectionShowChildren(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_PREVIPEGREPO.set_SectionShowChildren(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, (new IDVariant(0)).booleanValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzazionePrevisioniPEG", "EspandiNodo", _e);
      return -1;
    }
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
  private void BUK_PREVIPEGREPO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_PREVIPEGREPO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PREVIPEGREPO_SEC_UNIORGGROHEA)
    {
      BUK_PREVIPEGREPO.set_SpanValue(BUK_PREVIPEGREPO_SPAN_STADEFATTHEA, new IDVariant(IDL.Add(((BUK_PREVIPEGREPO.GetReportColumn(BUK_PREVIPEGREPO_RPT_PREPEGPDFREP, "E_S").equals((new IDVariant("Entrata"))))?(new IDVariant("Stanziamento Definitivo")):(new IDVariant("Stanziamento Attuale"))), (new IDVariant(" ")))));
    }
    if (SectionID==BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA)
    {
      BUK_PREVIPEGREPO.set_SpanValue(BUK_PREVIPEGREPO_SPAN_TOTPREANNCO2, new IDVariant(BUK_PREVIPEGREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA,"PREV_ANNO_CORSO")));
      BUK_PREVIPEGREPO.set_SpanValue(BUK_PREVIPEGREPO_SPAN_TOTALSTNINI2, new IDVariant(BUK_PREVIPEGREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA,"STN_INIZIALE")));
      BUK_PREVIPEGREPO.set_SpanValue(BUK_PREVIPEGREPO_SPAN_TOTALEVARIA2, new IDVariant(BUK_PREVIPEGREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA,"VARIAZIONI")));
      BUK_PREVIPEGREPO.set_SpanValue(BUK_PREVIPEGREPO_SPAN_TOTALSTNDEF2, new IDVariant(BUK_PREVIPEGREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA,"STN_DEFINITIVO")));
      BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA_OnFormattingSection();
    }
    if (SectionID==BUK_PREVIPEGREPO_SEC_TITOGROUHEAD)
    {
      BUK_PREVIPEGREPO.set_SpanValue(BUK_PREVIPEGREPO_SPAN_TOTPREANNCO3, new IDVariant(BUK_PREVIPEGREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGREPO_SEC_TITOGROUHEAD,"PREV_ANNO_CORSO")));
      BUK_PREVIPEGREPO.set_SpanValue(BUK_PREVIPEGREPO_SPAN_TGHSCWPPSIVP, new IDVariant(BUK_PREVIPEGREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGREPO_SEC_TITOGROUHEAD,"STN_INIZIALE")));
      BUK_PREVIPEGREPO.set_SpanValue(BUK_PREVIPEGREPO_SPAN_TOTALEVARIA3, new IDVariant(BUK_PREVIPEGREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGREPO_SEC_TITOGROUHEAD,"VARIAZIONI")));
      BUK_PREVIPEGREPO.set_SpanValue(BUK_PREVIPEGREPO_SPAN_TOTALSTNDEF3, new IDVariant(BUK_PREVIPEGREPO.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGREPO_SEC_TITOGROUHEAD,"STN_DEFINITIVO")));
      BUK_PREVIPEGREPO_SEC_TITOGROUHEAD_OnFormattingSection();
    }
    if (SectionID==BUK_PREVIPEGREPO_SEC_DETAIL)
    {
      BUK_PREVIPEGREPO_SEC_DETAIL_OnFormattingSection();
    }
    if (SectionID==BUK_PREVIPEGREPO_SEC_TITOGROUFOOT)
    {
    }
    if (SectionID==BUK_PREVIPEGREPO_SEC_ENTSPEGROFOO)
    {
    }
    if (SectionID==BUK_PREVIPEGREPO_SEC_UNIORGGROFOO)
    {
    }
  }

  private void BUK_PREVIPEGREPO_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_PREVIPEGREPO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_PREVIPEGREPO_MST_CFWRPRPEBOPA)
    {
      BUK_PREVIPEGREPO.set_SpanValue(BUK_PREVIPEGREPO_SPAN_CPTSPPRVPPEG, new IDVariant(IDL.Add((new IDVariant("Pag.")), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.ToString((new IDVariant(BUK_PREVIPEGREPO.GetPageNumber()))), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant("di")), IDL.Add((new IDVariant(" ")), IDL.ToString((new IDVariant(BUK_PREVIPEGREPO.GetTotalPagesNumber())))))))))));
    }
  }

  private void BUK_PREVIPEGREPO_Activated(int ObjID, String BoxName)
  {
    if (ObjID==BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPR1)
    {
      BUK_PREVIPEGREPO.set_SectionShowChildren(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, !BUK_PREVIPEGREPO.SectionShowChildren(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA));
    }
    if (ObjID==BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPRI)
    {
      BUK_PREVIPEGREPO.set_SectionShowChildren(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, !BUK_PREVIPEGREPO.SectionShowChildren(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD));
    }
  }

  private void BUK_PREVIPEGREPO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_PREVIPEGREPO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_PREVIPEGREPO_OnPreview()
  {
  }

  private void BUK_PREVIPEGSTAM_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_PREVIPEGSTAM_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PREVIPEGSTAM_SEC_UNIORGGROHEA)
    {
    }
    if (SectionID==BUK_PREVIPEGSTAM_SEC_ENTSPEGROHEA)
    {
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_TRATTINO, new IDVariant(((IMDB.Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARAMORDINAM, 0).equals((new IDVariant("U"))))?(new IDVariant("-")):(new IDVariant()))));
    }
    if (SectionID==BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD)
    {
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_STANZIDEFINI, new IDVariant(IDL.Add(((BUK_PREVIPEGSTAM.GetReportColumn(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, "E_S").equals((new IDVariant("Entrata"))))?(new IDVariant("Stanziamento Definitivo")):(new IDVariant("Stanziamento Attuale"))), (new IDVariant(" ")))));
    }
    if (SectionID==BUK_PREVIPEGSTAM_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT)
    {
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_TOTALETITOLO, new IDVariant(IDL.Add((new IDVariant("Totale Titolo")), IDL.Add((new IDVariant(" ")), IDL.ToString(BUK_PREVIPEGSTAM.GetReportColumn(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, "TITOLO"))))));
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_TOTPREANNCO1, new IDVariant(BUK_PREVIPEGSTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT,"PREV_ANNO_CORSO")));
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_TOTALSTNINI1, new IDVariant(BUK_PREVIPEGSTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT,"STN_INIZIALE")));
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_TOTALEVARIA1, new IDVariant(BUK_PREVIPEGSTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT,"VARIAZIONI")));
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_TOTALSTNDEF1, new IDVariant(BUK_PREVIPEGSTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT,"STN_DEFINITIVO")));
    }
    if (SectionID==BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO)
    {
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_TOTAPARTLABE, new IDVariant(IDL.Add((new IDVariant("Totale")), IDL.Add((new IDVariant(" ")), BUK_PREVIPEGSTAM.GetReportColumn(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, "CFWRPRPEDEES")))));
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_TOTPREANNCOR, new IDVariant(BUK_PREVIPEGSTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO,"PREV_ANNO_CORSO")));
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_TOTALSTNINIZ, new IDVariant(BUK_PREVIPEGSTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO,"STN_INIZIALE")));
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_TOTALEVARIAZ, new IDVariant(BUK_PREVIPEGSTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO,"VARIAZIONI")));
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_TOTALSTNDEFI, new IDVariant(BUK_PREVIPEGSTAM.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO,"STN_DEFINITIVO")));
    }
  }

  private void BUK_PREVIPEGSTAM_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_PREVIPEGSTAM_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_PREVIPEGSTAM_MST_CFWRPRPEBOPA)
    {
      BUK_PREVIPEGSTAM.set_SpanValue(BUK_PREVIPEGSTAM_SPAN_CPTSPPSVPPEG, new IDVariant(IDL.Add((new IDVariant("Pag.")), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.ToString((new IDVariant(BUK_PREVIPEGSTAM.GetPageNumber()))), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant("di")), IDL.Add((new IDVariant(" ")), IDL.ToString((new IDVariant(BUK_PREVIPEGSTAM.GetTotalPagesNumber())))))))))));
    }
  }

  private void BUK_PREVIPEGSTAM_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_PREVIPEGSTAM_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_PREVIPEGSTAM_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_PREVIPEGSTAM_OnPreview()
  {
    PreviewBook = BKW_PREVIPEGSTAM;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void BUK_PREVIPEGREPO_MST_CFWRPRPEBOPA_Init()
  {
    BUK_PREVIPEGREPO.InitMastro(BUK_PREVIPEGREPO_MST_CFWRPRPEBOPA, 3, 21000, 29700, 1, 2, 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_MST_CFWRPRPEBOPA, "93D44B47-9132-466C-9BD6-00CC81910F0E");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_MST_CFWRPRPEBOPA, "CFWRPRPEBOPA");
    BUK_PREVIPEGREPO.InitMastroBox(BUK_PREVIPEGREPO_MST_CFWRPRPEBOPA, BUK_PREVIPEGREPO_RPTBOX_NUMEROPAGIN1, 26700, 500, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_NUMEROPAGIN1, "8438C317-4A28-4BEA-A7C5-95382394DFC8");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_NUMEROPAGIN1, BUK_PREVIPEGREPO_SPAN_CPTSPPRVPPEG, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_CPTSPPRVPPEG, "7D0670CE-BEF8-4740-A457-C44A0B7AC79F");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_CPTSPPRVPPEG, "CPTSPPRVPPEG");
    BUK_PREVIPEGREPO.InitMastroBox(BUK_PREVIPEGREPO_MST_CFWRPRPEBOPA, BUK_PREVIPEGREPO_RPTBOX_PAGEHEADER1, 1000, 1000, 27700, 1000, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_PAGEHEADER1, "31E3DB58-735C-4314-80C5-59788CB88B6F");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_PAGEHEADER1, BUK_PREVIPEGREPO_SPAN_PREVISIONPE1, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Previsioni P.e.g.", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_PREVISIONPE1, "DF8F395C-C8C7-40A1-ADFD-F4E37534DCB7");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_PREVISIONPE1, "PREVISIONPE1");
    BUK_PREVIPEGREPO.InitMastroBox(BUK_PREVIPEGREPO_MST_CFWRPRPEBOPA, BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1, 1000, 2100, 27700, 15700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1, "0EE62CF1-5736-4AD0-B879-9CC530570EC7");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1, "PAGEBODY1");
    BUK_PREVIPEGREPO.InitMastroBox(BUK_PREVIPEGREPO_MST_CFWRPRPEBOPA, BUK_PREVIPEGREPO_RPTBOX_PAGEFOOTER1, 1000, 18100, 27700, 1800, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_PAGEFOOTER1, "3E5112C3-CCA1-4334-9B26-601EA964C4B5");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_PAGEFOOTER1, "PAGEFOOTER1");
  }

  private void BUK_PREVIPEGREPO_RPT_PREPEGPDFREP_InitQuery() { BUK_PREVIPEGREPO_RPT_PREPEGPDFREP_InitQuery(true, true); }
  private void BUK_PREVIPEGREPO_RPT_PREPEGPDFREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(~~TBL_PARAMETRI86.PARAMORDINAM~~, 'U', DECODE(~~TBL_PARAMETRI86.PARATIPOSTRU~~, 'G', A.PROGR_UO_GESTIONE, A.PROGR_UO_UTILIZZO), 0) as CFWRPRPEPRUO, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI86.PARAMORDINAM~~, 'U', DECODE(~~TBL_PARAMETRI86.PARATIPOSTRU~~, 'G', A.DESCR_UO_GESTIONE, A.DESCR_UO_UTILIZZO), NULL) as CFWRPRPEDEUO, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  DECODE(A.E_S, 'E', 'Entrata', DECODE(A.E_S, 'S', 'Spesa', NULL)) as CFWRPRPEDEES, ");
      SQL.append("  A.TITOLO as TITOLO, ");
      SQL.append("  A.DESCR_TITOLO as DESCR_TITOLO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  A.CODICE_BILANCIO as CODICE_BILANCIO, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.DESCR_VOCE_PEG as DESCR_VOCE_PEG, ");
      SQL.append("  A.DESCR_UO_GESTIONE as DESCR_UO_GESTIONE, ");
      SQL.append("  A.DESCR_UO_UTILIZZO as DESCR_UO_UTILIZZO, ");
      SQL.append("  A.PREV_ANNO_CORSO as PREV_ANNO_CORSO, ");
      SQL.append("  A.STN_INIZIALE as STN_INIZIALE, ");
      SQL.append("  A.VARIAZIONI as VARIAZIONI, ");
      SQL.append("  A.STN_DEFINITIVO as STN_DEFINITIVO ");
      SQL.append("from ");
      SQL.append("  CF4WEB_WRK_PREV_PEG A ");
      SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by 1, 3, 5, 9, 10 ");
      BUK_PREVIPEGREPO.SetReportQuery(BUK_PREVIPEGREPO_RPT_PREPEGPDFREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "19B1AB3F-F3BB-4941-BF32-24DF0056FCB3");
      if (BUK_PREVIPEGREPO.FindObjByID(BUK_PREVIPEGREPO_SEC_UNIORGGROHEA) != null)
        BUK_PREVIPEGREPO.AddReportGroup(BUK_PREVIPEGREPO_SEC_UNIORGGROHEA, "CFWRPRPEPRUO");
      if (BUK_PREVIPEGREPO.FindObjByID(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA) != null)
        BUK_PREVIPEGREPO.AddReportGroup(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, "E_S");
      if (BUK_PREVIPEGREPO.FindObjByID(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD) != null)
        BUK_PREVIPEGREPO.AddReportGroup(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, "TITOLO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_PREVIPEGREPO_RPT_PREPEGPDFREP_Init()
  {
    BUK_PREVIPEGREPO.InitReport(BUK_PREVIPEGREPO_RPT_PREPEGPDFREP, 196609);
    BUK_PREVIPEGREPO_RPT_PREPEGPDFREP_InitQuery(true, false);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPT_PREPEGPDFREP, "5FA5C5B7-F7C5-408E-A5FA-00AC94B63333");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPT_PREPEGPDFREP, "PREPEGPDFREP");
    BUK_PREVIPEGREPO.InitSection(BUK_PREVIPEGREPO_RPT_PREPEGPDFREP, BUK_PREVIPEGREPO_SEC_UNIORGGROHEA, 900, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 43581697, "CFWRPRPEPRUO");
    BUK_PREVIPEGREPO.SetSectionRendersInto(BUK_PREVIPEGREPO_SEC_UNIORGGROHEA, BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SEC_UNIORGGROHEA, "72D9BFC8-4C2B-4D70-B6D7-80E74CB19099");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SEC_UNIORGGROHEA, "UNIORGGROHEA");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_UNIORGGROHEA, BUK_PREVIPEGREPO_RPTBOX_PREANNINCOH1, 15500, 0, 2800, 900, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 4, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_PREANNINCOH1, "B90EC9FE-DB1B-4EA3-B7CE-8A2023BB6035");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_PREANNINCOH1, "PREANNINCOH1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_PREANNINCOH1, BUK_PREVIPEGREPO_SPAN_PREVANNINCO1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Previsioni Anno In Corso ", 4);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_PREVANNINCO1, "3CEB916C-4B25-4FF1-A7A5-16FCA19A4AE3");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_PREVANNINCO1, "PREVANNINCO1");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_UNIORGGROHEA, BUK_PREVIPEGREPO_RPTBOX_STANINIZHEA1, 18400, 0, 2800, 900, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_STANINIZHEA1, "B32ED5F1-67FE-4EA9-B6D8-C05E22D903E8");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_STANINIZHEA1, "STANINIZHEA1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_STANINIZHEA1, BUK_PREVIPEGREPO_SPAN_STANZIINIZI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento Iniziale ", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_STANZIINIZI1, "E612D3BA-A3EF-4909-83E5-C6233361B074");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_STANZIINIZI1, "STANZIINIZI1");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_UNIORGGROHEA, BUK_PREVIPEGREPO_RPTBOX_VARIAZHEADE1, 21300, 0, 2800, 900, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_VARIAZHEADE1, "107CBF7C-19BF-473E-BE30-D6B317B2E1EF");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_VARIAZHEADE1, "VARIAZHEADE1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_VARIAZHEADE1, BUK_PREVIPEGREPO_SPAN_VARIAZIONI2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Variazioni", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_VARIAZIONI2, "9214887A-C85D-428B-A20A-50D775A4158A");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_VARIAZIONI2, "VARIAZIONI2");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_UNIORGGROHEA, BUK_PREVIPEGREPO_RPTBOX_STADEFATTHE1, 24200, 0, 2800, 900, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_STADEFATTHE1, "9B19BBD3-3F41-46E3-BFFE-5DC2AF681237");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_STADEFATTHE1, "STADEFATTHE1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_STADEFATTHE1, BUK_PREVIPEGREPO_SPAN_STADEFATTHEA, MyGlb.VIS_INTSENBORRIG, 5, 100, 0, 271319425, "", "", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_STADEFATTHEA, "D3153C87-4295-48D2-9437-B0CB4DE6A475");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_STADEFATTHEA, "STADEFATTHEA");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_UNIORGGROHEA, BUK_PREVIPEGREPO_RPTBOX_DESCRIZIONU1, 100, 300, 15200, 400, 0, 1, 3, MyGlb.VIS_HEADSENZBORD, 983041, 411, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_DESCRIZIONU1, "FB33A2D3-ED6A-434C-80CA-5A39EDD4F647");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_DESCRIZIONU1, "DESCRIZIONU1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_DESCRIZIONU1, BUK_PREVIPEGREPO_SPAN_DESCRIZIONU1, MyGlb.VIS_HEADSENZBORD, 5, 99, 0, 271319169, "", "::CFWRPRPEDEUO", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_DESCRIZIONU1, "C5EC3C75-9DCB-4D17-9B87-2926D3E4023C");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_DESCRIZIONU1, "DESCRIZIONU1");
    BUK_PREVIPEGREPO.InitSection(BUK_PREVIPEGREPO_RPT_PREPEGPDFREP, BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, 600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 35193089, "E_S");
    BUK_PREVIPEGREPO.SetSectionRendersInto(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, "E392FE85-2C4F-4AF2-86A8-3A83E524B3BE");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, "ENTSPEGROHEA");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO1, 15500, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO1, "7830B5F9-C02C-4B55-B48B-A6BB219E3737");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO1, "TOTPREANNCO1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO1, BUK_PREVIPEGREPO_SPAN_TOTPREANNCO2, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_TOTPREANNCO2, "ABBC364C-49E5-4740-8EB0-121F389DD136");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_TOTPREANNCO2, "TOTPREANNCO2");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI2, 18400, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI2, "1501ACC6-8D7B-43ED-B37C-EBD9D042C5B1");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI2, "TOTALSTNINI2");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI2, BUK_PREVIPEGREPO_SPAN_TOTALSTNINI2, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_TOTALSTNINI2, "8E78D230-F19B-4694-B4D4-9AC57736D369");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_TOTALSTNINI2, "TOTALSTNINI2");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA1, 21300, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA1, "0298EC22-90E5-4B3F-92B1-4C86E7FF5332");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA1, "TOTALEVARIA1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA1, BUK_PREVIPEGREPO_SPAN_TOTALEVARIA2, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_TOTALEVARIA2, "3531D67E-9D12-421C-A6D5-6F464632DDA0");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_TOTALEVARIA2, "TOTALEVARIA2");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEF1, 24200, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEF1, "C475B2F5-EB5C-448D-A6DB-293090C451E5");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEF1, "TOTALSTNDEF1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEF1, BUK_PREVIPEGREPO_SPAN_TOTALSTNDEF2, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_TOTALSTNDEF2, "03CB0A88-3215-4963-A188-FDB9DBA3172C");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_TOTALSTNDEF2, "TOTALSTNDEF2");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPR1, 100, 100, 400, 400, 0, 1, 1, MyGlb.VIS_HYPERLINK2, 720897, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetBoxImage(BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPR1, null, "tp1.gif");
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPR1, "06E27A01-2138-454F-A633-88A708B5C187");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPR1, "ESPANDCOMPR1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPR1, BUK_PREVIPEGREPO_SPAN_ESPANDCOMPR1, MyGlb.VIS_HYPERLINK2, 0, 0, 0, 271319425, "", "", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_ESPANDCOMPR1, "BFFDEAA0-1A2A-4558-B806-F9670C9A5A97");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_ESPANDCOMPR1, "ESPANDCOMPR1");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, BUK_PREVIPEGREPO_RPTBOX_DESCRIZIONE1, 600, 100, 2700, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_DESCRIZIONE1, "CD2A1F58-FC8A-473A-8633-225C94AB1B07");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_DESCRIZIONE1, BUK_PREVIPEGREPO_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271319425, "", "::CFWRPRPEDEES", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_DESCRIZIONE1, "E291523C-9014-4FCE-A2AC-2F25757211F7");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_PREVIPEGREPO.InitSection(BUK_PREVIPEGREPO_RPT_PREPEGPDFREP, BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, 1200, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 35193089, "TITOLO");
    BUK_PREVIPEGREPO.SetSectionRendersInto(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, "D12A95F2-99D7-4190-B11A-CCB9D55477D1");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, "TITOGROUHEAD");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_DESCRITITOL1, 1100, 100, 14300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_DESCRITITOL1, "F8867F8C-BD47-43CA-BFF6-AC92631C7B88");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_DESCRITITOL1, "DESCRITITOL1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_DESCRITITOL1, BUK_PREVIPEGREPO_SPAN_DESCRITITOL1, MyGlb.VIS_INTSENZABORD, 5, 140, 0, 271319425, "", "::DESCR_TITOLO", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_DESCRITITOL1, "782512B2-0275-4BB7-840E-4E08229445C6");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_DESCRITITOL1, "DESCRITITOL1");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO3, 15500, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO3, "58351D05-1F29-437C-A077-1E9CEBFF40DB");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO3, "TOTPREANNCO3");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_TOTPREANNCO3, BUK_PREVIPEGREPO_SPAN_TOTPREANNCO3, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_TOTPREANNCO3, "7991057D-9E22-4365-B66E-40A4C43491AF");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_TOTPREANNCO3, "TOTPREANNCO3");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI3, 18400, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI3, "361B1804-36A8-4288-A1CA-2987613CE803");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI3, "TOTALSTNINI3");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNINI3, BUK_PREVIPEGREPO_SPAN_TGHSCWPPSIVP, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271384705, "", "", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_TGHSCWPPSIVP, "742084AE-D6E4-470C-BC4C-A18CC57B7487");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_TGHSCWPPSIVP, "TGHSCWPPSIVP");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA2, 21300, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA2, "1B26F61B-021E-430F-AED4-B95D6DBAACBC");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA2, "TOTALEVARIA2");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_TOTALEVARIA2, BUK_PREVIPEGREPO_SPAN_TOTALEVARIA3, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_TOTALEVARIA3, "D1F2E6FB-ABAA-45C7-819E-DE65B1605052");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_TOTALEVARIA3, "TOTALEVARIA3");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEFI, 24200, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEFI, "09700439-3B10-4B98-A36C-81C1C8CF5863");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEFI, "TOTALSTNDEFI");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_TOTALSTNDEFI, BUK_PREVIPEGREPO_SPAN_TOTALSTNDEF3, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_TOTALSTNDEF3, "57007179-B9EF-4C11-845C-02A2341B7FFC");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_TOTALSTNDEF3, "TOTALSTNDEF3");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPRI, 600, 100, 400, 400, 0, 1, 1, MyGlb.VIS_HYPERLINK2, 720897, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetBoxImage(BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPRI, null, "tp1.gif");
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPRI, "CEA4D5CD-26A2-4CBF-BA89-38A09E211F14");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPRI, "ESPANDCOMPRI");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_ESPANDCOMPRI, BUK_PREVIPEGREPO_SPAN_ESPANDCOMPRI, MyGlb.VIS_HYPERLINK2, 0, 0, 0, 271319425, "", "", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_ESPANDCOMPRI, "BD8C079A-D49C-4918-9648-50F56B07CFEC");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_ESPANDCOMPRI, "ESPANDCOMPRI");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_CAPITARTHEA1, 1100, 700, 2400, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_CAPITARTHEA1, "F71BB323-4513-4D74-A0B6-38A8AB1CA258");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_CAPITARTHEA1, "CAPITARTHEA1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_CAPITARTHEA1, BUK_PREVIPEGREPO_SPAN_C1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_C1, "3BB8001E-7E7C-4F1E-B344-0914118B0C02");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_C1, "C1");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_CODICEHEADE1, 3700, 700, 1300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_CODICEHEADE1, "B69A3EAA-8CD6-49B0-B70B-37A2577FE882");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_CODICEHEADE1, "CODICEHEADE1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_CODICEHEADE1, BUK_PREVIPEGREPO_SPAN_CODICE2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_CODICE2, "BE27AF8F-7695-4B26-BED7-48E2D37BE402");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_CODICE2, "CODICE2");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_DESCRIHEADE1, 5200, 700, 3100, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_DESCRIHEADE1, "3546B208-BCD8-4CFC-AE4F-64B8B523B9D8");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_DESCRIHEADE1, "DESCRIHEADE1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_DESCRIHEADE1, BUK_PREVIPEGREPO_SPAN_CODICE3, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_CODICE3, "353E75C3-03AA-42EC-8702-34C97FF0C234");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_CODICE3, "CODICE3");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_UOGESTIHEAD1, 8500, 700, 3300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_UOGESTIHEAD1, "08B314AC-5822-4D55-8CD3-53958F62B360");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_UOGESTIHEAD1, "UOGESTIHEAD1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_UOGESTIHEAD1, BUK_PREVIPEGREPO_SPAN_UOGESTIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Gestione", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_UOGESTIONE1, "346B5349-ACB7-47D8-9A1F-F151E5D1E1AA");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_UOGESTIONE1, "UOGESTIONE1");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_UOUTILIHEAD1, 12000, 700, 3300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_UOUTILIHEAD1, "B9C5E28D-CF9E-4F5E-8984-99DAA04F56E0");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_UOUTILIHEAD1, "UOUTILIHEAD1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_UOUTILIHEAD1, BUK_PREVIPEGREPO_SPAN_DESCRIZIONE2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Utilizzo", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_DESCRIZIONE2, "80DDDB26-ED49-4F3E-B096-1F1312A01C1C");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_DESCRIZIONE2, "DESCRIZIONE2");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, BUK_PREVIPEGREPO_RPTBOX_BARRA1, 1100, 1000, 25900, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_BARRA1, "100FA942-9D2F-4880-B00C-8745A263F8F1");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_BARRA1, "BARRA1");
    BUK_PREVIPEGREPO.InitSection(BUK_PREVIPEGREPO_RPT_PREPEGPDFREP, BUK_PREVIPEGREPO_SEC_DETAIL, 400, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PREVIPEGREPO.SetSectionRendersInto(BUK_PREVIPEGREPO_SEC_DETAIL, BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SEC_DETAIL, "776CA61D-B0C0-4844-BD41-90E9818B54C5");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SEC_DETAIL, "DETAIL");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_DETAIL, BUK_PREVIPEGREPO_RPTBOX_VOCEPEG2, 1100, 0, 2400, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_VOCEPEG2, "3572A298-1CCD-4645-8DDA-494721DC582B");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_VOCEPEG2, "VOCEPEG2");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_VOCEPEG2, BUK_PREVIPEGREPO_SPAN_VOCEPEG3, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271319425, "", "::VOCE_PEG", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_VOCEPEG3, "465AC217-E243-4678-AC48-5328C42FA6CA");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_VOCEPEG3, "VOCEPEG3");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_DETAIL, BUK_PREVIPEGREPO_RPTBOX_CODICEBILANC, 3700, 0, 1300, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_CODICEBILANC, "F7316AE7-D650-470B-B0FB-D62973065132");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_CODICEBILANC, "CODICEBILANC");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_CODICEBILANC, BUK_PREVIPEGREPO_SPAN_CODICEBILAN1, MyGlb.VIS_DEFAREPOSTYL, 5, 7, 0, 271319425, "", "::CODICE_BILANCIO", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_CODICEBILAN1, "C1627210-70BC-4897-973E-C528CDE5875B");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_CODICEBILAN1, "CODICEBILAN1");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_DETAIL, BUK_PREVIPEGREPO_RPTBOX_DESCRVOCEPE1, 5200, 0, 3100, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_DESCRVOCEPE1, "F07FFA8D-FEBF-4C65-B2A5-4FE0FB403E6B");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_DESCRVOCEPE1, "DESCRVOCEPE1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_DESCRVOCEPE1, BUK_PREVIPEGREPO_SPAN_DESCRVOCEPE1, MyGlb.VIS_DEFAREPOSTYL, 5, 300, 0, 271319425, "", "::DESCR_VOCE_PEG", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_DESCRVOCEPE1, "2484F41F-6E64-4495-940A-B6A73015A9BD");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_DESCRVOCEPE1, "DESCRVOCEPE1");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_DETAIL, BUK_PREVIPEGREPO_RPTBOX_DESCRUOGEST1, 8500, 0, 3300, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_DESCRUOGEST1, "03836703-C53C-4B89-B9A8-7B3F31BB8D2C");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_DESCRUOGEST1, "DESCRUOGEST1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_DESCRUOGEST1, BUK_PREVIPEGREPO_SPAN_DESCRUOGEST1, MyGlb.VIS_DEFAREPOSTYL, 5, 120, 0, 271319425, "", "::DESCR_UO_GESTIONE", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_DESCRUOGEST1, "B851FCB1-5953-40E4-9640-9734F95E5C11");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_DESCRUOGEST1, "DESCRUOGEST1");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_DETAIL, BUK_PREVIPEGREPO_RPTBOX_DESCRUOUTIL1, 12000, 0, 3300, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_DESCRUOUTIL1, "0D726EF0-95BE-4C9F-B0DC-D722AA69D0A4");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_DESCRUOUTIL1, "DESCRUOUTIL1");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_DESCRUOUTIL1, BUK_PREVIPEGREPO_SPAN_DESCRUOUTIL1, MyGlb.VIS_DEFAREPOSTYL, 5, 120, 0, 271319425, "", "::DESCR_UO_UTILIZZO", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_DESCRUOUTIL1, "E9A91B29-64D2-440D-8089-9B7277A196A4");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_DESCRUOUTIL1, "DESCRUOUTIL1");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_DETAIL, BUK_PREVIPEGREPO_RPTBOX_PREVANNOCORS, 15500, 0, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_PREVANNOCORS, "08E26570-5EF2-4683-A1F7-759D7D5650FC");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_PREVANNOCORS, "PREVANNOCORS");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_PREVANNOCORS, BUK_PREVIPEGREPO_SPAN_PREVANNOCOR1, MyGlb.VIS_IMPORTO, 3, 14, 6, 271319425, "", "::PREV_ANNO_CORSO", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_PREVANNOCOR1, "C8EDA9FB-D35A-41B9-AE68-167D375DFAF1");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_PREVANNOCOR1, "PREVANNOCOR1");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_DETAIL, BUK_PREVIPEGREPO_RPTBOX_STNINIZIALE2, 18400, 0, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_STNINIZIALE2, "787281DE-E1C1-4DA9-B8E0-CE25B63FB70E");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_STNINIZIALE2, "STNINIZIALE2");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_STNINIZIALE2, BUK_PREVIPEGREPO_SPAN_STNINIZIALE1, MyGlb.VIS_IMPORTO, 3, 14, 6, 271319425, "", "::STN_INIZIALE", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_STNINIZIALE1, "5393D5B2-3924-4BF1-A9ED-467840DC2144");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_STNINIZIALE1, "STNINIZIALE1");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_DETAIL, BUK_PREVIPEGREPO_RPTBOX_VARIAZIONI2, 21300, 0, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_VARIAZIONI2, "E8557084-1261-48EB-BF14-E071CA33BCBC");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_VARIAZIONI2, "VARIAZIONI2");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_VARIAZIONI2, BUK_PREVIPEGREPO_SPAN_VARIAZIONI3, MyGlb.VIS_IMPORTO, 3, 14, 6, 271319425, "", "::VARIAZIONI", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_VARIAZIONI3, "BB1C14D5-4418-450D-A1E6-21ED29F1E1D5");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_VARIAZIONI3, "VARIAZIONI3");
    BUK_PREVIPEGREPO.InitReportBox(BUK_PREVIPEGREPO_SEC_DETAIL, BUK_PREVIPEGREPO_RPTBOX_STNDEFINITI2, 24200, 0, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_RPTBOX_STNDEFINITI2, "BA88B9C6-D8C2-4D99-B8C3-2E817B8F1A76");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_RPTBOX_STNDEFINITI2, "STNDEFINITI2");
    BUK_PREVIPEGREPO.InitBoxSpan(BUK_PREVIPEGREPO_RPTBOX_STNDEFINITI2, BUK_PREVIPEGREPO_SPAN_STNDEFINITI1, MyGlb.VIS_IMPORTO, 3, 14, 6, 271319425, "", "::STN_DEFINITIVO", 1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SPAN_STNDEFINITI1, "27155417-345C-47AA-A611-17FC65D395EA");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SPAN_STNDEFINITI1, "STNDEFINITI1");
    BUK_PREVIPEGREPO.InitSection(BUK_PREVIPEGREPO_RPT_PREPEGPDFREP, BUK_PREVIPEGREPO_SEC_TITOGROUFOOT, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 590081, "TITOLO");
    BUK_PREVIPEGREPO.SetSectionRendersInto(BUK_PREVIPEGREPO_SEC_TITOGROUFOOT, BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SEC_TITOGROUFOOT, "791E4FEC-4732-4C32-B8A8-CE5EEAE019AA");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SEC_TITOGROUFOOT, "TITOGROUFOOT");
    BUK_PREVIPEGREPO.InitSection(BUK_PREVIPEGREPO_RPT_PREPEGPDFREP, BUK_PREVIPEGREPO_SEC_ENTSPEGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 590081, "E_S");
    BUK_PREVIPEGREPO.SetSectionRendersInto(BUK_PREVIPEGREPO_SEC_ENTSPEGROFOO, BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SEC_ENTSPEGROFOO, "826740DA-A59B-4334-8582-8E2D69BF694E");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SEC_ENTSPEGROFOO, "ENTSPEGROFOO");
    BUK_PREVIPEGREPO.InitSection(BUK_PREVIPEGREPO_RPT_PREPEGPDFREP, BUK_PREVIPEGREPO_SEC_UNIORGGROFOO, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "CFWRPRPEPRUO");
    BUK_PREVIPEGREPO.SetSectionRendersInto(BUK_PREVIPEGREPO_SEC_UNIORGGROFOO, BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1);
    BUK_PREVIPEGREPO.SetRTCGuid(BUK_PREVIPEGREPO_SEC_UNIORGGROFOO, "60B01F19-A818-4FAD-8DD2-E591F89B4FA7");
    BUK_PREVIPEGREPO.SetObjCode(BUK_PREVIPEGREPO_SEC_UNIORGGROFOO, "UNIORGGROFOO");
    BUK_PREVIPEGREPO.AddReportGroup(BUK_PREVIPEGREPO_SEC_UNIORGGROHEA, "CFWRPRPEPRUO");
    BUK_PREVIPEGREPO.AddReportGroup(BUK_PREVIPEGREPO_SEC_ENTSPEGROHEA, "E_S");
    BUK_PREVIPEGREPO.AddReportGroup(BUK_PREVIPEGREPO_SEC_TITOGROUHEAD, "TITOLO");
    BUK_PREVIPEGREPO_RPT_PREPEGPDFREP_InitQuery(false, true);
  }

  private void BUK_PREVIPEGREPO_InitLinks()
  {
    BUK_PREVIPEGREPO.SetBoxNextBox(BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1, BUK_PREVIPEGREPO_RPTBOX_PAGEBODY1);
  }

  private void BUK_PREVIPEGSTAM_MST_CFWRPRPEBOPA_Init()
  {
    BUK_PREVIPEGSTAM.InitMastro(BUK_PREVIPEGSTAM_MST_CFWRPRPEBOPA, 3, 21000, 29700, 1, 2, 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_MST_CFWRPRPEBOPA, "659EFF9B-F738-4100-A326-A0EF3F07AEFA");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_MST_CFWRPRPEBOPA, "CFWRPRPEBOPA");
    BUK_PREVIPEGSTAM.InitMastroBox(BUK_PREVIPEGSTAM_MST_CFWRPRPEBOPA, BUK_PREVIPEGSTAM_RPTBOX_NUMEROPAGINA, 26700, 500, 2000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_NUMEROPAGINA, "BBCBDABE-EEA3-425C-A40C-65F0F28F3237");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_NUMEROPAGINA, BUK_PREVIPEGSTAM_SPAN_CPTSPPSVPPEG, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_CPTSPPSVPPEG, "0967E562-AF72-4BCC-8D31-0C93D554FA48");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_CPTSPPSVPPEG, "CPTSPPSVPPEG");
    BUK_PREVIPEGSTAM.InitMastroBox(BUK_PREVIPEGSTAM_MST_CFWRPRPEBOPA, BUK_PREVIPEGSTAM_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 900, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_PAGEHEADER, "B3DAEABF-E103-4C5F-A1DD-3754D9303096");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_PAGEHEADER, BUK_PREVIPEGSTAM_SPAN_PREVISIONPEG, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Previsioni P.e.g.", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_PREVISIONPEG, "74506DC4-11C9-4DDE-997A-72AB46113D64");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_PREVISIONPEG, "PREVISIONPEG");
    BUK_PREVIPEGSTAM.InitMastroBox(BUK_PREVIPEGSTAM_MST_CFWRPRPEBOPA, BUK_PREVIPEGSTAM_RPTBOX_PAGEBODY, 1000, 2100, 27700, 15700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_PAGEBODY, "513839F7-79F9-472B-9E1D-DA526D6ABF60");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_PREVIPEGSTAM.InitMastroBox(BUK_PREVIPEGSTAM_MST_CFWRPRPEBOPA, BUK_PREVIPEGSTAM_RPTBOX_PAGEFOOTER, 1000, 18100, 27700, 1800, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_PAGEFOOTER, "3154B03A-5DCD-4CED-97DD-EA9ADC19C2CC");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP_InitQuery() { BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP_InitQuery(true, true); }
  private void BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(~~TBL_PARAMETRI86.PARAMORDINAM~~, 'U', DECODE(~~TBL_PARAMETRI86.PARATIPOSTRU~~, 'G', A.PROGR_UO_GESTIONE, A.PROGR_UO_UTILIZZO), 0) as CFWRPRPEPRUO, ");
      SQL.append("  DECODE(~~TBL_PARAMETRI86.PARAMORDINAM~~, 'U', DECODE(~~TBL_PARAMETRI86.PARATIPOSTRU~~, 'G', A.DESCR_UO_GESTIONE, A.DESCR_UO_UTILIZZO), NULL) as CFWRPRPEDEUO, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  DECODE(A.E_S, 'E', 'Entrata', DECODE(A.E_S, 'S', 'Spesa', NULL)) as CFWRPRPEDEES, ");
      SQL.append("  A.TITOLO as TITOLO, ");
      SQL.append("  A.DESCR_TITOLO as DESCR_TITOLO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  A.CODICE_BILANCIO as CODICE_BILANCIO, ");
      SQL.append("  A.CAPITOLO as CAPITOLO, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.DESCR_VOCE_PEG as DESCR_VOCE_PEG, ");
      SQL.append("  A.DESCR_UO_GESTIONE as DESCR_UO_GESTIONE, ");
      SQL.append("  A.DESCR_UO_UTILIZZO as DESCR_UO_UTILIZZO, ");
      SQL.append("  A.PREV_ANNO_CORSO as PREV_ANNO_CORSO, ");
      SQL.append("  A.STN_INIZIALE as STN_INIZIALE, ");
      SQL.append("  A.VARIAZIONI as VARIAZIONI, ");
      SQL.append("  A.STN_DEFINITIVO as STN_DEFINITIVO ");
      SQL.append("from ");
      SQL.append("  CF4WEB_WRK_PREV_PEG A ");
      SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by 1, 3, 5, 9, 10 ");
      BUK_PREVIPEGSTAM.SetReportQuery(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "40C8AAFE-ADEE-4434-9E75-3BAA73BA519B");
      if (BUK_PREVIPEGSTAM.FindObjByID(BUK_PREVIPEGSTAM_SEC_UNIORGGROHEA) != null)
        BUK_PREVIPEGSTAM.AddReportGroup(BUK_PREVIPEGSTAM_SEC_UNIORGGROHEA, "CFWRPRPEPRUO");
      if (BUK_PREVIPEGSTAM.FindObjByID(BUK_PREVIPEGSTAM_SEC_ENTSPEGROHEA) != null)
        BUK_PREVIPEGSTAM.AddReportGroup(BUK_PREVIPEGSTAM_SEC_ENTSPEGROHEA, "E_S");
      if (BUK_PREVIPEGSTAM.FindObjByID(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD) != null)
        BUK_PREVIPEGSTAM.AddReportGroup(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, "TITOLO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP_Init()
  {
    BUK_PREVIPEGSTAM.InitReport(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, 196609);
    BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP_InitQuery(true, false);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, "4097B0F8-2468-4278-920C-7EB988EAA81A");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, "PREPEGPDFREP");
    BUK_PREVIPEGSTAM.InitSection(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, BUK_PREVIPEGSTAM_SEC_UNIORGGROHEA, 300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 12124417, "CFWRPRPEPRUO");
    BUK_PREVIPEGSTAM.SetSectionRendersInto(BUK_PREVIPEGSTAM_SEC_UNIORGGROHEA, BUK_PREVIPEGSTAM_RPTBOX_PAGEBODY);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SEC_UNIORGGROHEA, "04BC2D2C-BEFA-42B4-9E59-A64506B88203");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SEC_UNIORGGROHEA, "UNIORGGROHEA");
    BUK_PREVIPEGSTAM.InitSection(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, BUK_PREVIPEGSTAM_SEC_ENTSPEGROHEA, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 43581697, "E_S");
    BUK_PREVIPEGSTAM.SetSectionRendersInto(BUK_PREVIPEGSTAM_SEC_ENTSPEGROHEA, BUK_PREVIPEGSTAM_RPTBOX_PAGEBODY);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SEC_ENTSPEGROHEA, "DD692F24-933B-4558-B56D-55458CD79410");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SEC_ENTSPEGROHEA, "ENTSPEGROHEA");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_ENTSPEGROHEA, BUK_PREVIPEGSTAM_RPTBOX_DESCRIZIONUO, 100, 0, 7000, 400, 0, 1, 3, MyGlb.VIS_HEADSENZBORD, 983041, 411, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_DESCRIZIONUO, "BA95EFA4-2755-46D9-933E-612A1BA92433");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_DESCRIZIONUO, "DESCRIZIONUO");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_DESCRIZIONUO, BUK_PREVIPEGSTAM_SPAN_DESCRIZIONUO, MyGlb.VIS_HEADSENZBORD, 5, 99, 0, 271319425, "", "::CFWRPRPEDEUO", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_DESCRIZIONUO, "D29F9AE4-7C3E-4A3A-98AE-229275EB4E5B");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_DESCRIZIONUO, "DESCRIZIONUO");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_ENTSPEGROHEA, BUK_PREVIPEGSTAM_RPTBOX_TRATTINO, 7300, 0, 700, 400, 0, 1, 1, MyGlb.VIS_HEASENBORCEN, 983041, 393, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_TRATTINO, "2D597D44-1A0A-409D-A13C-1E5880699571");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_TRATTINO, "TRATTINO");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_TRATTINO, BUK_PREVIPEGSTAM_SPAN_TRATTINO, MyGlb.VIS_HEASENBORCEN, 5, 99, 0, 271319425, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_TRATTINO, "2ACCD3C5-8322-492C-9E2B-CA3C57B9FE43");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_TRATTINO, "TRATTINO");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_ENTSPEGROHEA, BUK_PREVIPEGSTAM_RPTBOX_DESCRIZIONES, 8200, 0, 2000, 400, 0, 1, 1, MyGlb.VIS_HEADSENZBORD, 983041, 411, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_DESCRIZIONES, "1679B2C2-F701-4FE9-AD52-3891995B9A36");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_DESCRIZIONES, "DESCRIZIONES");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_DESCRIZIONES, BUK_PREVIPEGSTAM_SPAN_DESCRIZIONES, MyGlb.VIS_HEADSENZBORD, 5, 99, 0, 271319425, "", "::CFWRPRPEDEES", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_DESCRIZIONES, "C896B732-6A99-4A92-91EE-CAF2D55B8AF4");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_DESCRIZIONES, "DESCRIZIONES");
    BUK_PREVIPEGSTAM.InitSection(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, 1500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 43581697, "TITOLO");
    BUK_PREVIPEGSTAM.SetSectionRendersInto(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, BUK_PREVIPEGSTAM_RPTBOX_PAGEBODY);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, "E1205277-56AE-4AA8-B589-B230C4931DDD");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, "TITOGROUHEAD");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, BUK_PREVIPEGSTAM_RPTBOX_PREANNINCOHE, 15100, 600, 2900, 900, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 4, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_PREANNINCOHE, "BB24ED58-91A6-4E73-985A-78629EDDDDAB");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_PREANNINCOHE, "PREANNINCOHE");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_PREANNINCOHE, BUK_PREVIPEGSTAM_SPAN_PREVANNINCOR, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Previsioni Anno In Corso ", 4);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_PREVANNINCOR, "E8FED3CE-9333-4EFC-9813-8371B35BA6EB");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_PREVANNINCOR, "PREVANNINCOR");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, BUK_PREVIPEGSTAM_RPTBOX_STANINIZHEAD, 18000, 600, 2900, 900, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_STANINIZHEAD, "5F3DC886-CE88-430E-8497-856D637F20DE");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_STANINIZHEAD, "STANINIZHEAD");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_STANINIZHEAD, BUK_PREVIPEGSTAM_SPAN_STANZIINIZIA, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Stanziamento Iniziale ", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_STANZIINIZIA, "5698D35B-0D8F-450E-B1BE-33CBE1FE3519");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_STANZIINIZIA, "STANZIINIZIA");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, BUK_PREVIPEGSTAM_RPTBOX_VARIAZHEADER, 20900, 600, 2900, 900, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_VARIAZHEADER, "FB6F1096-47DF-4AE9-98DD-2862A8689282");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_VARIAZHEADER, "VARIAZHEADER");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_VARIAZHEADER, BUK_PREVIPEGSTAM_SPAN_VARIAZIONI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Variazioni", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_VARIAZIONI1, "3E9DEE60-BDB5-4E70-A5B6-1F09EC9B7C3F");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_VARIAZIONI1, "VARIAZIONI1");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, BUK_PREVIPEGSTAM_RPTBOX_STADEFATTHEA, 23800, 600, 2900, 900, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_STADEFATTHEA, "9D108117-DB23-41BA-98A5-59286FFB29C5");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_STADEFATTHEA, "STADEFATTHEA");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_STADEFATTHEA, BUK_PREVIPEGSTAM_SPAN_STANZIDEFINI, MyGlb.VIS_INTSENBORRIG, 5, 100, 0, 271319425, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_STANZIDEFINI, "9C29AA7A-6D86-4E73-862C-0D94EEEE1C67");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_STANZIDEFINI, "STANZIDEFINI");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, BUK_PREVIPEGSTAM_RPTBOX_CAPITARTHEAD, 100, 1000, 3000, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_CAPITARTHEAD, "8C050BBC-1DF0-49F7-996E-015210A4B6EA");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_CAPITARTHEAD, "CAPITARTHEAD");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_CAPITARTHEAD, BUK_PREVIPEGSTAM_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_C, "0A4B85A3-6658-4D7B-93C2-7FCED0B5D5E5");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_C, "C");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, BUK_PREVIPEGSTAM_RPTBOX_CODICEHEADER, 3200, 1000, 1300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_CODICEHEADER, "AF0627B9-7BDA-42FA-A32E-BE851D817457");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_CODICEHEADER, BUK_PREVIPEGSTAM_SPAN_CODICE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_CODICE1, "310EDDE2-78BF-4F7E-8851-582F56C069D7");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_CODICE1, "CODICE1");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, BUK_PREVIPEGSTAM_RPTBOX_DESCRIHEADER, 4600, 1000, 3400, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_DESCRIHEADER, "CA56776D-040E-451E-AB40-7CFCF98197D8");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_DESCRIHEADER, BUK_PREVIPEGSTAM_SPAN_CODICE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_CODICE, "A8C2F48C-E5C1-4CC6-B29F-970B9794C55D");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_CODICE, "CODICE");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, BUK_PREVIPEGSTAM_RPTBOX_UOGESTIHEADE, 8100, 1000, 3300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_UOGESTIHEADE, "03AA90FF-BD52-42BF-93D3-59DDF9E544A1");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_UOGESTIHEADE, "UOGESTIHEADE");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_UOGESTIHEADE, BUK_PREVIPEGSTAM_SPAN_UOGESTIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Gestione", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_UOGESTIONE, "2FF9E602-66DB-4B00-B06C-69044ABD5C3A");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_UOGESTIONE, "UOGESTIONE");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, BUK_PREVIPEGSTAM_RPTBOX_UOUTILIHEADE, 11500, 1000, 3300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_UOUTILIHEADE, "C6AFA13D-A42D-4961-B46C-E9EBEB59342E");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_UOUTILIHEADE, "UOUTILIHEADE");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_UOUTILIHEADE, BUK_PREVIPEGSTAM_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Utilizzo", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_DESCRIZIONE, "DC3F0F2A-9B33-48BD-ADB6-E2EB4C8B6516");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, BUK_PREVIPEGSTAM_RPTBOX_DESCRITITOLO, 0, 100, 14000, 800, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_DESCRITITOLO, "24F91397-CE7C-4699-8AC1-5E45EDE98992");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_DESCRITITOLO, "DESCRITITOLO");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_DESCRITITOLO, BUK_PREVIPEGSTAM_SPAN_DESCRITITOLO, MyGlb.VIS_INTSENZABORD, 5, 140, 0, 271319425, "", "::DESCR_TITOLO", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_DESCRITITOLO, "A8977E8C-BE52-48F6-890C-D072B87D676C");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_DESCRITITOLO, "DESCRITITOLO");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, BUK_PREVIPEGSTAM_RPTBOX_BARRA, 0, 1300, 26600, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_BARRA, "E09F7A91-4DB3-4F6C-AD55-8B4CAA84B0BB");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_BARRA, "BARRA");
    BUK_PREVIPEGSTAM.InitSection(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, BUK_PREVIPEGSTAM_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 10027009, "");
    BUK_PREVIPEGSTAM.SetSectionRendersInto(BUK_PREVIPEGSTAM_SEC_DETAIL, BUK_PREVIPEGSTAM_RPTBOX_PAGEBODY);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SEC_DETAIL, "618CE7F0-D2D3-4A1C-9879-65FF34752535");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SEC_DETAIL, "DETAIL");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_DETAIL, BUK_PREVIPEGSTAM_RPTBOX_VOCEPEG1, 100, 100, 3000, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_VOCEPEG1, "FCB30111-7A1E-4675-8A5F-86753F3D6A5F");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_VOCEPEG1, "VOCEPEG1");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_VOCEPEG1, BUK_PREVIPEGSTAM_SPAN_VOCEPEG, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271319425, "", "::VOCE_PEG", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_VOCEPEG, "70BF2231-7E01-45A2-864E-871145EC1382");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_VOCEPEG, "VOCEPEG");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_DETAIL, BUK_PREVIPEGSTAM_RPTBOX_CODICEBILAN1, 3200, 100, 1300, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_CODICEBILAN1, "81493B88-6BE7-42E2-B836-FA040F80020C");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_CODICEBILAN1, "CODICEBILAN1");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_CODICEBILAN1, BUK_PREVIPEGSTAM_SPAN_CODICEBILANC, MyGlb.VIS_DEFAREPOSTYL, 5, 7, 0, 271319425, "", "::CODICE_BILANCIO", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_CODICEBILANC, "63315322-F31A-49D1-9881-E94CEA057B2B");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_CODICEBILANC, "CODICEBILANC");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_DETAIL, BUK_PREVIPEGSTAM_RPTBOX_DESCRVOCEPEG, 4600, 100, 3400, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_DESCRVOCEPEG, "DF89B2D7-2F1A-4E84-A77D-F766414191A1");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_DESCRVOCEPEG, "DESCRVOCEPEG");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_DESCRVOCEPEG, BUK_PREVIPEGSTAM_SPAN_DESCRVOCEPEG, MyGlb.VIS_DEFAREPOSTYL, 5, 300, 0, 271319425, "", "::DESCR_VOCE_PEG", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_DESCRVOCEPEG, "1411B7A8-81D3-4639-B3EA-41BADF66EB76");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_DESCRVOCEPEG, "DESCRVOCEPEG");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_DETAIL, BUK_PREVIPEGSTAM_RPTBOX_DESCRUOGESTI, 8100, 100, 3300, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_DESCRUOGESTI, "9EB1C63C-DCBB-4DE2-B0D2-37CB97C33B59");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_DESCRUOGESTI, "DESCRUOGESTI");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_DESCRUOGESTI, BUK_PREVIPEGSTAM_SPAN_DESCRUOGESTI, MyGlb.VIS_DEFAREPOSTYL, 5, 120, 0, 271319425, "", "::DESCR_UO_GESTIONE", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_DESCRUOGESTI, "883F6F65-5B26-45B2-84A5-6ACE3F7574FA");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_DESCRUOGESTI, "DESCRUOGESTI");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_DETAIL, BUK_PREVIPEGSTAM_RPTBOX_DESCRUOUTILI, 11500, 100, 3300, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_DESCRUOUTILI, "B0BBFF75-F668-4827-AEDA-0CCA5EED599B");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_DESCRUOUTILI, "DESCRUOUTILI");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_DESCRUOUTILI, BUK_PREVIPEGSTAM_SPAN_DESCRUOUTILI, MyGlb.VIS_DEFAREPOSTYL, 5, 120, 0, 271319425, "", "::DESCR_UO_UTILIZZO", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_DESCRUOUTILI, "32F7927F-F359-4C0B-90CF-9296A46CB319");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_DESCRUOUTILI, "DESCRUOUTILI");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_DETAIL, BUK_PREVIPEGSTAM_RPTBOX_PREVANNOCOR1, 15100, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_PREVANNOCOR1, "5F196232-2C37-4A66-877F-D3879F384574");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_PREVANNOCOR1, "PREVANNOCOR1");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_PREVANNOCOR1, BUK_PREVIPEGSTAM_SPAN_PREVANNOCORS, MyGlb.VIS_IMPORTO, 3, 14, 6, 271319425, "", "::PREV_ANNO_CORSO", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_PREVANNOCORS, "A6B3E715-1AC0-4ED2-8ECA-B058B9A57A78");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_PREVANNOCORS, "PREVANNOCORS");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_DETAIL, BUK_PREVIPEGSTAM_RPTBOX_STNINIZIALE, 18000, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_STNINIZIALE, "03EF5E91-06E2-4E0D-8953-31B8F593FBF1");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_STNINIZIALE, "STNINIZIALE");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_STNINIZIALE, BUK_PREVIPEGSTAM_SPAN_STNINIZIALE, MyGlb.VIS_IMPORTO, 3, 14, 6, 271319425, "", "::STN_INIZIALE", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_STNINIZIALE, "C5CA4911-980F-43A8-955C-FB6D1047AAE6");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_STNINIZIALE, "STNINIZIALE");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_DETAIL, BUK_PREVIPEGSTAM_RPTBOX_VARIAZIONI, 20900, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_VARIAZIONI, "2FBFDD54-6074-4C8B-BE69-A539752E2B00");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_VARIAZIONI, "VARIAZIONI");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_VARIAZIONI, BUK_PREVIPEGSTAM_SPAN_VARIAZIONI, MyGlb.VIS_IMPORTO, 3, 14, 6, 271319425, "", "::VARIAZIONI", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_VARIAZIONI, "37EFCC9B-762C-4F95-B4C2-71598BE22882");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_VARIAZIONI, "VARIAZIONI");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_DETAIL, BUK_PREVIPEGSTAM_RPTBOX_STNDEFINITI1, 23800, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_STNDEFINITI1, "4A3F6591-C03D-44CE-BB3C-844000387D67");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_STNDEFINITI1, "STNDEFINITI1");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_STNDEFINITI1, BUK_PREVIPEGSTAM_SPAN_STNDEFINITIV, MyGlb.VIS_IMPORTO, 3, 14, 6, 271319425, "", "::STN_DEFINITIVO", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_STNDEFINITIV, "7D115C16-D61D-4AF7-A504-B5D17CE1828E");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_STNDEFINITIV, "STNDEFINITIV");
    BUK_PREVIPEGSTAM.InitSection(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 10027265, "TITOLO");
    BUK_PREVIPEGSTAM.SetSectionRendersInto(BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT, BUK_PREVIPEGSTAM_RPTBOX_PAGEBODY);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT, "2C470E1D-6D9F-4416-8DF3-5F44825D1211");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT, "TITOGROUFOOT");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT, BUK_PREVIPEGSTAM_RPTBOX_TOTATITOLABE, 11900, 100, 2900, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_TOTATITOLABE, "A29654E7-3F47-4D65-A5C1-DE693342DED5");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_TOTATITOLABE, "TOTATITOLABE");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_TOTATITOLABE, BUK_PREVIPEGSTAM_SPAN_TOTALETITOLO, MyGlb.VIS_INTSENBORRIG, 5, 113, 0, 271319169, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_TOTALETITOLO, "0FEB584D-A52A-4561-8D08-440445A263A7");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_TOTALETITOLO, "TOTALETITOLO");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT, BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCO2, 15100, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCO2, "3BEFB4F8-E4A4-422D-A3C3-003AF76330B8");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCO2, "TOTPREANNCO2");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCO2, BUK_PREVIPEGSTAM_SPAN_TOTPREANNCO1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_TOTPREANNCO1, "4A1E233D-0D83-4F7F-969A-7703B5FD22C0");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_TOTPREANNCO1, "TOTPREANNCO1");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT, BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINI1, 18000, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINI1, "5268E494-6E76-4C0C-85E5-01712AECE53F");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINI1, "TOTALSTNINI1");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINI1, BUK_PREVIPEGSTAM_SPAN_TOTALSTNINI1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_TOTALSTNINI1, "7679EB1A-AF84-4791-9B24-6B7BCD6B0113");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_TOTALSTNINI1, "TOTALSTNINI1");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT, BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIAZ, 20900, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIAZ, "E031DFB2-3C39-4BE0-A7B2-C1E4FFBAE535");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIAZ, "TOTALEVARIAZ");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIAZ, BUK_PREVIPEGSTAM_SPAN_TOTALEVARIA1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_TOTALEVARIA1, "2B24BF5D-ADA3-40F3-B03E-38BE750DA5FF");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_TOTALEVARIA1, "TOTALEVARIA1");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_TITOGROUFOOT, BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF2, 23800, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF2, "9E6D4808-BFD3-4F32-AE2C-3B9583A00906");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF2, "TOTALSTNDEF2");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF2, BUK_PREVIPEGSTAM_SPAN_TOTALSTNDEF1, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_TOTALSTNDEF1, "F057D232-2BE0-4A07-9E1A-582B09471E63");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_TOTALSTNDEF1, "TOTALSTNDEF1");
    BUK_PREVIPEGSTAM.InitSection(BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP, BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109761, "E_S");
    BUK_PREVIPEGSTAM.SetSectionRendersInto(BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO, BUK_PREVIPEGSTAM_RPTBOX_PAGEBODY);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO, "D48D38FB-1312-4F63-8848-9FE0278A70C9");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO, "ENTSPEGROFOO");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO, BUK_PREVIPEGSTAM_RPTBOX_TOTAPARTLABE, 11900, 100, 2900, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_TOTAPARTLABE, "753F8E1B-C935-43B6-9EBD-F32F107C9901");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_TOTAPARTLABE, "TOTAPARTLABE");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_TOTAPARTLABE, BUK_PREVIPEGSTAM_SPAN_TOTAPARTLABE, MyGlb.VIS_INTSENBORRIG, 5, 106, 0, 271319425, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_TOTAPARTLABE, "A3934AED-04FD-4CD6-AF2A-DD18C9605993");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_TOTAPARTLABE, "TOTAPARTLABE");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO, BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCOR, 15100, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCOR, "28216BE7-A478-44A2-9357-F1C8E44312B1");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCOR, "TOTPREANNCOR");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_TOTPREANNCOR, BUK_PREVIPEGSTAM_SPAN_TOTPREANNCOR, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_TOTPREANNCOR, "A67E42CD-A0BA-402D-A9BD-4C1A9001EFDA");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_TOTPREANNCOR, "TOTPREANNCOR");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO, BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINIZ, 18000, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINIZ, "FB37643A-065C-45DB-B451-BC1D5158624C");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINIZ, "TOTALSTNINIZ");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNINIZ, BUK_PREVIPEGSTAM_SPAN_TOTALSTNINIZ, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_TOTALSTNINIZ, "A70D7412-8AFA-4C03-9C3A-C50B0EBD272C");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_TOTALSTNINIZ, "TOTALSTNINIZ");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO, BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIA3, 20900, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIA3, "59FFFE83-9D9D-4E1A-81A6-15DD6A3CE9F0");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIA3, "TOTALEVARIA3");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_TOTALEVARIA3, BUK_PREVIPEGSTAM_SPAN_TOTALEVARIAZ, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_TOTALEVARIAZ, "BA7111BA-D4C7-4BAD-979E-10BE7F283896");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_TOTALEVARIAZ, "TOTALEVARIAZ");
    BUK_PREVIPEGSTAM.InitReportBox(BUK_PREVIPEGSTAM_SEC_ENTSPEGROFOO, BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF3, 23800, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF3, "7B5C8477-337E-4FE1-A408-8C26FFAF433D");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF3, "TOTALSTNDEF3");
    BUK_PREVIPEGSTAM.InitBoxSpan(BUK_PREVIPEGSTAM_RPTBOX_TOTALSTNDEF3, BUK_PREVIPEGSTAM_SPAN_TOTALSTNDEFI, MyGlb.VIS_INTSENBORRIG, 3, 28, 6, 271319169, "", "", 1);
    BUK_PREVIPEGSTAM.SetRTCGuid(BUK_PREVIPEGSTAM_SPAN_TOTALSTNDEFI, "39BD3EDF-2196-467E-95D3-9BB144D4399B");
    BUK_PREVIPEGSTAM.SetObjCode(BUK_PREVIPEGSTAM_SPAN_TOTALSTNDEFI, "TOTALSTNDEFI");
    BUK_PREVIPEGSTAM.AddReportGroup(BUK_PREVIPEGSTAM_SEC_UNIORGGROHEA, "CFWRPRPEPRUO");
    BUK_PREVIPEGSTAM.AddReportGroup(BUK_PREVIPEGSTAM_SEC_ENTSPEGROHEA, "E_S");
    BUK_PREVIPEGSTAM.AddReportGroup(BUK_PREVIPEGSTAM_SEC_TITOGROUHEAD, "TITOLO");
    BUK_PREVIPEGSTAM_RPT_PREPEGPDFREP_InitQuery(false, true);
  }

  private void BUK_PREVIPEGSTAM_InitLinks()
  {
    BUK_PREVIPEGSTAM.SetBoxNextBox(BUK_PREVIPEGSTAM_RPTBOX_PAGEBODY, BUK_PREVIPEGSTAM_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
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
    if (SrcObj == BKW_PREVIPEGREPO) BUK_PREVIPEGREPO_OnFormattingSection(SectionID);
    if (SrcObj == BKW_PREVIPEGSTAM) BUK_PREVIPEGSTAM_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_PREVIPEGREPO) BUK_PREVIPEGREPO_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_PREVIPEGSTAM) BUK_PREVIPEGSTAM_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_PREVIPEGREPO) BUK_PREVIPEGREPO_OnFormattingPage(PageID);
    if (SrcObj == BKW_PREVIPEGSTAM) BUK_PREVIPEGSTAM_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_PREVIPEGREPO) BUK_PREVIPEGREPO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_PREVIPEGSTAM) BUK_PREVIPEGSTAM_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_PREVIPEGREPO) BUK_PREVIPEGREPO_OnConnecting(DBConn);
    if (SrcObj == BKW_PREVIPEGSTAM) BUK_PREVIPEGSTAM_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_PREVIPEGREPO) BUK_PREVIPEGREPO_Activated(ObjID, BoxName);
    if (SrcObj == BKW_PREVIPEGSTAM) BUK_PREVIPEGSTAM_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_PREVIPEGREPO) BUK_PREVIPEGREPO_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_PREVIPEGSTAM) BUK_PREVIPEGSTAM_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_PREVIPEGREPO) BUK_PREVIPEGREPO_OnPreview();
    if (SrcObj == BKW_PREVIPEGSTAM) BUK_PREVIPEGSTAM_OnPreview();
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
