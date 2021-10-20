// **********************************************
// Ritenute Fiscali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RitenuteFiscali extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PERIODO = 0;
  private static int GRP_PARAMETRI_MANDATI = 1;

  private static int PFL_PARAMETRI_ELABORA = 0;
  private static int PFL_PARAMETRI_DA = 1;
  private static int PFL_PARAMETRI_A = 2;
  private static int PFL_PARAMETRI_NEWPANELABE2 = 3;
  private static int PFL_PARAMETRI_DAL = 4;
  private static int PFL_PARAMETRI_AL = 5;
  private static int PFL_PARAMETRI_NEWPANELABE1 = 6;
  private static int PFL_PARAMETRI_BENEFICIARIO = 7;
  private static int PFL_PARAMETRI_CODICEBENEFI = 8;
  private static int PFL_PARAMETRI_UFFICIO = 9;
  private static int PFL_PARAMETRI_DATAELABORAZ = 10;
  private static int PFL_PARAMETRI_SELERICEBUTT = 11;

  private static int PPQRY_PARAMETRI175 = 0;

  private static int PPQRY_BEN = 1;

  private static int PPQRY_T53 = 2;


  IDPanel PAN_PARAMETRI;
  CIDREObj BUK_RITEFISCLIBR;
  OBook BKW_RITEFISCLIBR;
  //
  // Template Pages constants
  private static int BUK_RITEFISCLIBR_MST_RITEFISCMAST = 1;
  private static int BUK_RITEFISCLIBR_RPTBOX_DATAELABORAZ = 2;
  private static int BUK_RITEFISCLIBR_SPAN_DATAELABORAZ = 3;
  private static int BUK_RITEFISCLIBR_RPTBOX_NUMEROPAGINA = 4;
  private static int BUK_RITEFISCLIBR_SPAN_CPTSRFLRFPND = 5;
  private static int BUK_RITEFISCLIBR_RPTBOX_TESTATPAGINA = 6;
  private static int BUK_RITEFISCLIBR_SPAN_UPTEPATOTICE = 7;
  private static int BUK_RITEFISCLIBR_RPTBOX_SOTTTESTPAGI = 8;
  private static int BUK_RITEFISCLIBR_SPAN_IEPDRFPPARFP = 9;
  private static int BUK_RITEFISCLIBR_RPTBOX_CORPOPAGINA = 10;

  //
  // Reports constants
  private static int BUK_RITEFISCLIBR_RPT_RITEFISCREPO = 11;
  private static int BUK_RITEFISCLIBR_SEC_INTESTREPORT = 12;
  private static int BUK_RITEFISCLIBR_SEC_LIQCODINTGRU = 13;
  private static int BUK_RITEFISCLIBR_RPTBOX_CODICEHEADER = 14;
  private static int BUK_RITEFISCLIBR_SPAN_CODICE1 = 15;
  private static int BUK_RITEFISCLIBR_RPTBOX_CODICE = 16;
  private static int BUK_RITEFISCLIBR_SPAN_LIQCODICE = 17;
  private static int BUK_RITEFISCLIBR_RPTBOX_BRSEEEEEEEEE = 18;
  private static int BUK_RITEFISCLIBR_SPAN_C3 = 19;
  private static int BUK_RITEFISCLIBR_RPTBOX_BENCODFISHEA = 20;
  private static int BUK_RITEFISCLIBR_SPAN_CODICEFISCAL = 21;
  private static int BUK_RITEFISCLIBR_RPTBOX_LIQUIDHEADER = 22;
  private static int BUK_RITEFISCLIBR_SPAN_C1 = 23;
  private static int BUK_RITEFISCLIBR_RPTBOX_MANDATHEADER = 24;
  private static int BUK_RITEFISCLIBR_SPAN_MANDATO = 25;
  private static int BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEAD = 26;
  private static int BUK_RITEFISCLIBR_SPAN_NRO = 27;
  private static int BUK_RITEFISCLIBR_RPTBOX_DDATAMANDHEA = 28;
  private static int BUK_RITEFISCLIBR_SPAN_DATA = 29;
  private static int BUK_RITEFISCLIBR_RPTBOX_LIQIMPONHEAD = 30;
  private static int BUK_RITEFISCLIBR_SPAN_IMPONIBILE = 31;
  private static int BUK_RITEFISCLIBR_RPTBOX_LIQALIQUHEAD = 32;
  private static int BUK_RITEFISCLIBR_SPAN_ALIQ = 33;
  private static int BUK_RITEFISCLIBR_RPTBOX_LIQRITIRPHEA = 34;
  private static int BUK_RITEFISCLIBR_SPAN_RITENUTE = 35;
  private static int BUK_RITEFISCLIBR_RPTBOX_IMPNONSOGHEA = 36;
  private static int BUK_RITEFISCLIBR_SPAN_IMPNONSOGG = 37;
  private static int BUK_RITEFISCLIBR_RPTBOX_IMPORTHEADER = 38;
  private static int BUK_RITEFISCLIBR_SPAN_IMPORTO = 39;
  private static int BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEA1 = 40;
  private static int BUK_RITEFISCLIBR_SPAN_C2 = 41;
  private static int BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEA2 = 42;
  private static int BUK_RITEFISCLIBR_SPAN_C = 43;
  private static int BUK_RITEFISCLIBR_SEC_DETTAGLIO = 44;
  private static int BUK_RITEFISCLIBR_RPTBOX_BERASOESESEE = 45;
  private static int BUK_RITEFISCLIBR_SPAN_REBERSERFRFL = 46;
  private static int BUK_RITEFISCLIBR_RPTBOX_BENCODICFISC = 47;
  private static int BUK_RITEFISCLIBR_SPAN_REBECOFRFRFL = 48;
  private static int BUK_RITEFISCLIBR_RPTBOX_NUMEROMAND = 49;
  private static int BUK_RITEFISCLIBR_SPAN_REMANUMRFRFL = 50;
  private static int BUK_RITEFISCLIBR_RPTBOX_DDATAMAND = 51;
  private static int BUK_RITEFISCLIBR_SPAN_REMADDMRFRFL = 52;
  private static int BUK_RITEFISCLIBR_RPTBOX_LIQIMPONIBIL = 53;
  private static int BUK_RITEFISCLIBR_SPAN_RELIIMRIFRFL = 54;
  private static int BUK_RITEFISCLIBR_RPTBOX_LIQALIQUOTA = 55;
  private static int BUK_RITEFISCLIBR_SPAN_RELIALRIFRFL = 56;
  private static int BUK_RITEFISCLIBR_RPTBOX_LIQRITENIRPE = 57;
  private static int BUK_RITEFISCLIBR_SPAN_RELIRIIRFRFL = 58;
  private static int BUK_RITEFISCLIBR_RPTBOX_IMPORTNONSOG = 59;
  private static int BUK_RITEFISCLIBR_SPAN_LIQIMPNONSOG = 60;
  private static int BUK_RITEFISCLIBR_RPTBOX_IMPORTO = 61;
  private static int BUK_RITEFISCLIBR_SPAN_LIQIMPORTO = 62;
  private static int BUK_RITEFISCLIBR_RPTBOX_NUMEROLIQ = 63;
  private static int BUK_RITEFISCLIBR_SPAN_NUMEROLIQ = 64;
  private static int BUK_RITEFISCLIBR_RPTBOX_ANNOLIQ = 65;
  private static int BUK_RITEFISCLIBR_SPAN_ANNOLIQ = 66;
  private static int BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU = 67;
  private static int BUK_RITEFISCLIBR_RPTBOX_SUMOFLIQIMSS = 68;
  private static int BUK_RITEFISCLIBR_SPAN_LCPGSRLIRFR1 = 69;
  private static int BUK_RITEFISCLIBR_RPTBOX_SUOFLIRISSCE = 70;
  private static int BUK_RITEFISCLIBR_SPAN_LCPGSRLRIRFR = 71;
  private static int BUK_RITEFISCLIBR_RPTBOX_TOTALE = 72;
  private static int BUK_RITEFISCLIBR_SPAN_TOTALE = 73;
  private static int BUK_RITEFISCLIBR_SPAN_CODICE = 74;
  private static int BUK_RITEFISCLIBR_SPAN_RELICORIFRFL = 75;
  private static int BUK_RITEFISCLIBR_RPTBOX_SUOFLIIMNOSO = 76;
  private static int BUK_RITEFISCLIBR_SPAN_LCPGSRLINSRF = 77;
  private static int BUK_RITEFISCLIBR_RPTBOX_SUMOFLIQIMPO = 78;
  private static int BUK_RITEFISCLIBR_SPAN_LCPGSRLIRFRF = 79;
  private static int BUK_RITEFISCLIBR_RPTBOX_LINEA = 80;
  private static int BUK_RITEFISCLIBR_SEC_PIEDEREPORT = 81;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI168(IMDB);
    //
    //
    Init_PQRY_PARAMETRI175(IMDB);
    Init_PQRY_PARAMETRI175_RS(IMDB);
    Init_PQRY_LIQ27(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI168(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI168, 11);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI168, "TBL_PARAMETRI168");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMCASSA, "PARAMCASSA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMCASSA,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMESERCIZ,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMDTARITE, "PARAMDTARITE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMDTARITE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARACODIBENE, "PARACODIBENE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARACODIBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARADATAELAB,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMSUBIMPE, "PARAMSUBIMPE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI168,IMDBDef5.FLD_PARAMETRI168_PARAMSUBIMPE,5,49,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI168, 0);
  }

  private static void Init_PQRY_PARAMETRI175(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI175, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI175, "PQRY_PARAMETRI175");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARACODIBENE, "PARACODIBENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARACODIBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175,IMDBDef15.PQSL_PARAMETRI175_PARADATAELAB,6,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI175, 0);
  }

  private static void Init_PQRY_PARAMETRI175_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI175_RS, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI175_RS, "PQRY_PARAMETRI175_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARACODIBENE, "PARACODIBENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARACODIBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI175_RS,IMDBDef15.PQSL_PARAMETRI175_PARADATAELAB,6,49,0);
  }

  private static void Init_PQRY_LIQ27(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_LIQ27, 18);
    IMDB.set_TblCode(IMDBDef15.PQRY_LIQ27, "PQRY_LIQ27");
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECBENCODFIS, "RECBENCODFIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECBENCODFIS,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORANNOLIQ, "RECORANNOLIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORNUMELIQ, "RECORNUMELIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORNUMELIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECMANNUMMAN, "RECMANNUMMAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECMANNUMMAN,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECMANDDATMA, "RECMANDDATMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECMANDDATMA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORLIQIMP1, "RECORLIQIMP1");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORLIQIMP1,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORLIQALIQ, "RECORLIQALIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORLIQALIQ,3,4,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQRITIRP, "RECLIQRITIRP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQRITIRP,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQANNIMP, "RECLIQANNIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQNUMIMP, "RECLIQNUMIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORLIQCODI, "RECORLIQCODI");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORLIQCODI,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQIMNOSO, "RECLIQIMNOSO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQIMNOSO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORLIQIMPO, "RECORLIQIMPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORLIQIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQSEDDEL, "RECLIQSEDDEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQNUMDEL, "RECLIQNUMDEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQANNDEL, "RECLIQANNDEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECLIQANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORMANUFFI, "RECORMANUFFI");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ27,IMDBDef15.PQSL_LIQ27_RECORMANUFFI,1,5,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_LIQ27, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RitenuteFiscali(MyWebEntryPoint w, IMDBObj imdb)
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
  public RitenuteFiscali()
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
    FormIdx = MyGlb.FRM_RITENUFISCAL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6AC32DD5-CE3D-40DE-BB6C-373E9EAE47E0";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 392;
    DesignHeight = 326;
    set_Caption(new IDVariant("Ritenute Fiscali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 392;
    Frames[1].Height = 300;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 300;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 392-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "571BADD1-BF9A-418D-B45E-3D57B5412CCB");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1940, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    BKW_RITEFISCLIBR = new OBook(this);
    BUK_RITEFISCLIBR = new CIDREObj(BKW_RITEFISCLIBR);
    BKW_RITEFISCLIBR.iGuid = "E6FC61B8-2A8C-448D-A3D3-7C5959F88D49";
    BKW_RITEFISCLIBR.Code = "BUK_RITEFISCLIBR";
    BKW_RITEFISCLIBR.BookObj = BUK_RITEFISCLIBR;
    BKW_RITEFISCLIBR.InitDefMasks();
    BUK_RITEFISCLIBR.InitBook(1, 1245441, "Ritenute Fiscali Libro", IMDB, MainFrm.VisualStyleList);
    BUK_RITEFISCLIBR.InitHTML();
    BUK_RITEFISCLIBR.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_RITEFISCLIBR.Book.SetMainFrm(MainFrm);
    BUK_RITEFISCLIBR.SetRTCGuid(0, "E6FC61B8-2A8C-448D-A3D3-7C5959F88D49");
    BUK_RITEFISCLIBR.SetObjCode(0, "RITEFISCLIBR");
    BUK_RITEFISCLIBR_MST_RITEFISCMAST_Init();
    BUK_RITEFISCLIBR_RPT_RITEFISCREPO_Init();
    BUK_RITEFISCLIBR_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI168, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RITENUFISCAL_PARAMETRI175();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_RITEFISCLIBR.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SELERICEBUTT) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_RITEFISCLIBR")) return BUK_RITEFISCLIBR;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof RitenuteFiscali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RitenuteFiscali.class.getName() : (Glb.ClassWithPackage(RitenuteFiscali.class) ? RitenuteFiscali.class.getName().substring(RitenuteFiscali.class.getPackage().getName().length() + 1) : RitenuteFiscali.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_PARAMETRI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_PARAMETRI_BENEFICIARIO)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_BENEFICIARIO))), IDL.Today(), (new IDVariant("FM")), (new IDVariant(0)), (new IDVariant("SI")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenuteFiscali", "ParametriOnGetSmartLookup", _e);
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
    IDVariant v_PDATA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      v_PDATA = (new IDVariant());
      BUK_RITEFISCLIBR.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_RITEFISCLIBR.RefreshQuery();
      BUK_RITEFISCLIBR.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_RITEFISCLIBR.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenuteFiscali", "Elabora", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Ritenute Fiscali", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARADELEROWS();
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMINIZIO, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMFINE, 0, (new IDVariant(12)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARADATAELAB, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMUFFICIO, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenuteFiscali", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMCASSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMINIZIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMFINE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMDTARITE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARACODIBENE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARADATAELAB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMUFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMSUBIMPE, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARACODIBENE, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARACODIBENE, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenuteFiscali", "EndModalEvent", _e);
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
      UNLOADEVENT_PARADELEROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenuteFiscali", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMCASSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMINIZIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMFINE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMDTARITE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARACODIBENE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARADATAELAB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMUFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMSUBIMPE, 0, new IDVariant());
  }

  // **********************************************************************
  // Apri Scegli Soggetto
  // **********************************************************************
  public int ApriScegliSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scegli Soggetto Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenuteFiscali", "ApriScegliSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RITENUFISCAL_PARAMETRI175() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI175_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI168, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI168, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI175_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI175_RS, 0, IMDBDef5.TBL_PARAMETRI168, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI175_RS, 0, 0, IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMINIZIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI175_RS, 1, 0, IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMFINE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI175_RS, 2, 0, IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI175_RS, 3, 0, IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI175_RS, 4, 0, IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARACODIBENE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI175_RS, 5, 0, IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARAMUFFICIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI175_RS, 6, 0, IMDBDef5.TBL_PARAMETRI168, IMDBDef5.FLD_PARAMETRI168_PARADATAELAB, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI168, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI168, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI168, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI175_RS, 0);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_SELERICEBUTT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriScegliSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
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

  private void BUK_RITEFISCLIBR_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_RITEFISCLIBR_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_RITEFISCLIBR_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_RITEFISCLIBR_SEC_LIQCODINTGRU)
    {
    }
    if (SectionID==BUK_RITEFISCLIBR_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU)
    {
      BUK_RITEFISCLIBR.set_SpanValue(BUK_RITEFISCLIBR_SPAN_LCPGSRLIRFR1, new IDVariant(BUK_RITEFISCLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU,"RECORLIQIMP1")));
      BUK_RITEFISCLIBR.set_SpanValue(BUK_RITEFISCLIBR_SPAN_LCPGSRLRIRFR, new IDVariant(BUK_RITEFISCLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU,"RECLIQRITIRP")));
      BUK_RITEFISCLIBR.set_SpanValue(BUK_RITEFISCLIBR_SPAN_LCPGSRLINSRF, new IDVariant(BUK_RITEFISCLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU,"RECLIQIMNOSO")));
      BUK_RITEFISCLIBR.set_SpanValue(BUK_RITEFISCLIBR_SPAN_LCPGSRLIRFRF, new IDVariant(BUK_RITEFISCLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU,"RECORLIQIMPO")));
    }
    if (SectionID==BUK_RITEFISCLIBR_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_RITEFISCLIBR_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_RITEFISCLIBR_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_RITEFISCLIBR_MST_RITEFISCMAST)
    {
      BUK_RITEFISCLIBR.set_SpanValue(BUK_RITEFISCLIBR_SPAN_DATAELABORAZ, new IDVariant(IDL.Add(IDL.Add((new IDVariant("del")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARADATAELAB, 0)))));
      BUK_RITEFISCLIBR.set_SpanValue(BUK_RITEFISCLIBR_SPAN_CPTSRFLRFPND, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_RITEFISCLIBR.GetPageNumber())))), (new IDVariant(" di "))), IDL.ToString((new IDVariant(BUK_RITEFISCLIBR.GetTotalPagesNumber()))))));
      BUK_RITEFISCLIBR.set_SpanValue(BUK_RITEFISCLIBR_SPAN_UPTEPATOTICE, new IDVariant(IDL.Upper(IDL.Add((new IDVariant(BUK_RITEFISCLIBR.BoxToolTip(BUK_RITEFISCLIBR_RPTBOX_TESTATPAGINA))), MainFrm.ESERCIZIO))));
      BUK_RITEFISCLIBR.set_SpanValue(BUK_RITEFISCLIBR_SPAN_IEPDRFPPARFP, new IDVariant(((IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals(IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0)))?IDL.Add(IDL.Add((new IDVariant("Mese di")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())):IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Da")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMINIZIO, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI175, IMDBDef15.PQSL_PARAMETRI175_PARAMFINE, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())))));
    }
  }

  private void BUK_RITEFISCLIBR_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_RITEFISCLIBR_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_RITEFISCLIBR_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_RITEFISCLIBR_OnPreview()
  {
    PreviewBook = BKW_RITEFISCLIBR;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "16B04769-9A5C-41AD-A427-AE7F119674B4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "Periodo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 8, 3, 340, 61, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 43);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "5621C0F2-F2CD-4602-8A45-8FE06D283BDA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "Mandati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 8, 67, 340, 57, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 46);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "A6193A56-A2B1-4247-ABCA-935FA7EE0F56");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "1FF1F61D-2EE6-4C60-B1E5-1CF59B0A30E4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "Da");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "FBCFBCDF-AA64-4AF8-A531-6FCC095A14B1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "A");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "64407905-A6CF-482E-AC4A-35868E2EA86B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "71D49FA6-6165-4114-B88B-2B818640546C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "11CBA66F-7343-4396-8C4B-4CC09F8E256D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "446C8E2F-D655-4AB9-9662-EE9B6FCCCE6A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, "783A9EFD-F976-4B5A-9712-7EDA51EA6C95");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, "Beneficiario");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, "FE7C8FE1-E996-4D36-8395-DDDC1024F327");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, "Codice Beneficiario");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "F0DB6306-5B36-4EC7-976E-610C98C183D0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "CD6C8151-83FA-4780-9758-8DC7F0C09C42");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELERICEBUTT, "BE53320E-1238-4EEE-86F4-9C5316A8ADED");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELERICEBUTT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELERICEBUTT, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELERICEBUTT, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELERICEBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 188, 204, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 268, 228, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, "Da");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 12, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, "Da");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DA, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DA, PPQRY_PARAMETRI175, "A.PARAMINIZIO", "PARAMINIZIO", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, "A");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 212, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, "A");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_A, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_A, PPQRY_PARAMETRI175, "A.PARAMFINE", "PARAMFINE", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 188, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 336, 48, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE2, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 12, 92, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI175, "A.PARAMDAL", "PARAMDAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 212, 92, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI175, "A.PARAMAL", "PARAMAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 112, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 336, 108, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE1, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 136, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BENEFICIARIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BENEFICIARIO, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, "Cod. Benef.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, 248, 140, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, "C. Bn.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICEBENEFI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICEBENEFI, PPQRY_PARAMETRI175, "A.PARACODIBENE", "PARACODIBENE", 2, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 32, 164, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI175, "A.PARAMUFFICIO", "PARAMUFFICIO", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 148, 192, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMETRI175, "A.PARADATAELAB", "PARADATAELAB", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELERICEBUTT, MyGlb.PANEL_LIST, 308, 0, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELERICEBUTT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELERICEBUTT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELERICEBUTT, MyGlb.PANEL_FORM, 352, 140, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELERICEBUTT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SELERICEBUTT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SELERICEBUTT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SELERICEBUTT, -1, "", "SELERICEBUTT", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~PARACODIBENE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_PARAMETRI.SetQueryLKE(PPQRY_BEN, PFL_PARAMETRI_CODICEBENEFI, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "DEBITORE", "Debitore");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "D_SCADENZA", "Scadenza");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "D_SCADENZA");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "DAL", "Dal");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "DAL");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "AL", "Al");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "AL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~PARAMUFFICIO~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMUFFICIO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI175", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI175, IMDBDef15.PQRY_PARAMETRI175_RS, IMDBDef5.TBL_PARAMETRI168);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DA, IMDBDef5.FLD_PARAMETRI168_PARAMINIZIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_A, IMDBDef5.FLD_PARAMETRI168_PARAMFINE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef5.FLD_PARAMETRI168_PARAMDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI168_PARAMAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CODICEBENEFI, IMDBDef5.FLD_PARAMETRI168_PARACODIBENE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI168_PARAMUFFICIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef5.FLD_PARAMETRI168_PARADATAELAB);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI168");
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

  private void BUK_RITEFISCLIBR_MST_RITEFISCMAST_Init()
  {
    BUK_RITEFISCLIBR.InitMastro(BUK_RITEFISCLIBR_MST_RITEFISCMAST, 3, 21000, 29700, 1, 2, 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_MST_RITEFISCMAST, "05B77035-1CB2-42D6-92A2-A3EBB149A203");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_MST_RITEFISCMAST, "RITEFISCMAST");
    BUK_RITEFISCLIBR.InitMastroBox(BUK_RITEFISCLIBR_MST_RITEFISCMAST, BUK_RITEFISCLIBR_RPTBOX_DATAELABORAZ, 22100, 200, 3800, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_DATAELABORAZ, "0DA5AE2E-1702-4A29-9A5D-C0C1970991F6");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_DATAELABORAZ, "DATAELABORAZ");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_DATAELABORAZ, BUK_RITEFISCLIBR_SPAN_DATAELABORAZ, MyGlb.VIS_NORMAA8RIGHT, 5, 103, 0, 271319169, "", "", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_DATAELABORAZ, "17B07857-A39D-4608-B08C-364279920562");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_DATAELABORAZ, "DATAELABORAZ");
    BUK_RITEFISCLIBR.InitMastroBox(BUK_RITEFISCLIBR_MST_RITEFISCMAST, BUK_RITEFISCLIBR_RPTBOX_NUMEROPAGINA, 26000, 200, 2700, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_NUMEROPAGINA, "2AAA619C-3C94-4D20-B245-EAFF0C14C45F");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_NUMEROPAGINA, BUK_RITEFISCLIBR_SPAN_CPTSRFLRFPND, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271384705, "", "", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_CPTSRFLRFPND, "436E142B-E79D-4260-BF49-6E053C932DB1");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_CPTSRFLRFPND, "CPTSRFLRFPND");
    BUK_RITEFISCLIBR.InitMastroBox(BUK_RITEFISCLIBR_MST_RITEFISCMAST, BUK_RITEFISCLIBR_RPTBOX_TESTATPAGINA, 1000, 1400, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Elenco Ritenute Fiscali ", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_TESTATPAGINA, "5989ACA4-73C2-4D81-B686-6F611D812AA4");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_TESTATPAGINA, BUK_RITEFISCLIBR_SPAN_UPTEPATOTICE, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_UPTEPATOTICE, "6CC2C00D-E88D-4E58-8BB4-551A1FAD437C");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_UPTEPATOTICE, "UPTEPATOTICE");
    BUK_RITEFISCLIBR.InitMastroBox(BUK_RITEFISCLIBR_MST_RITEFISCMAST, BUK_RITEFISCLIBR_RPTBOX_SOTTTESTPAGI, 1000, 2500, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_SOTTTESTPAGI, "FF8B5CD7-E60C-4B0E-B029-21E63456515C");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_SOTTTESTPAGI, "SOTTTESTPAGI");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_SOTTTESTPAGI, BUK_RITEFISCLIBR_SPAN_IEPDRFPPARFP, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_IEPDRFPPARFP, "ABE78BB1-0D47-4830-971D-3F72A922DC7A");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_IEPDRFPPARFP, "IEPDRFPPARFP");
    BUK_RITEFISCLIBR.InitMastroBox(BUK_RITEFISCLIBR_MST_RITEFISCMAST, BUK_RITEFISCLIBR_RPTBOX_CORPOPAGINA, 1000, 3700, 27700, 16400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_CORPOPAGINA, "207C755A-DD99-48FC-9ADE-405C5D4D5640");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
  }

  private void BUK_RITEFISCLIBR_RPT_RITEFISCREPO_InitQuery() { BUK_RITEFISCLIBR_RPT_RITEFISCREPO_InitQuery(true, true); }
  private void BUK_RITEFISCLIBR_RPT_RITEFISCREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
      SQL.append("  A.CODICE_FISCALE as RECBENCODFIS, ");
      SQL.append("  B.ANNO_LIQ as RECORANNOLIQ, ");
      SQL.append("  B.NUMERO_LIQ as RECORNUMELIQ, ");
      SQL.append("  C.NUMERO_MAND as RECMANNUMMAN, ");
      SQL.append("  C.D_DATA_MAND as RECMANDDATMA, ");
      SQL.append("  B.IMPONIBILE as RECORLIQIMP1, ");
      SQL.append("  B.ALIQUOTA as RECORLIQALIQ, ");
      SQL.append("  B.RITENUTE_IRPEF as RECLIQRITIRP, ");
      SQL.append("  B.ANNO_IMP as RECLIQANNIMP, ");
      SQL.append("  B.NUMERO_IMP as RECLIQNUMIMP, ");
      SQL.append("  B.CODICE as RECORLIQCODI, ");
      SQL.append("  B.IMPORTO_NON_SOG as RECLIQIMNOSO, ");
      SQL.append("  B.IMPORTO as RECORLIQIMPO, ");
      SQL.append("  B.SEDE_DEL as RECLIQSEDDEL, ");
      SQL.append("  B.NUMERO_DEL as RECLIQNUMDEL, ");
      SQL.append("  B.ANNO_DEL as RECLIQANNDEL, ");
      SQL.append("  C.UFFICIO as RECORMANUFFI ");
      SQL.append("from ");
      SQL.append("  BEN A, ");
      SQL.append("  LIQ B, ");
      SQL.append("  MAN C ");
      SQL.append("where (B.BENEFICIARIO = A.CODICE(+)) ");
      SQL.append("and   (B.ANNO_MAND = C.ANNO_MAND) ");
      SQL.append("and   (B.NUMERO_MAND = C.NUMERO_MAND) ");
      SQL.append("and   (NOT ((B.CODICE IS NULL))) ");
      SQL.append("and   ((B.NUMERO_MAND BETWEEN NVL(~~PQRY_PARAMETRI175.PARAMDAL~~, 1) AND NVL(~~PQRY_PARAMETRI175.PARAMAL~~, 99999))) ");
      SQL.append("and   (NVL(B.UFFICIO, -1) = DECODE(~~PQRY_PARAMETRI175.PARAMUFFICIO~~, -1, NVL(B.UFFICIO, -1), ~~PQRY_PARAMETRI175.PARAMUFFICIO~~)) ");
      SQL.append("and   ((C.D_DATA_MAND BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI175.PARAMINIZIO~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI175.PARAMFINE~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   (B.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'M') ");
      SQL.append("and   (C.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(D.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN D ");
      SQL.append("where (D.ANNO_MAND = C.ANNO_MAND) ");
      SQL.append("and   (D.NUMERO_MAND = C.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("and   (NVL(B.BENEFICIARIO, -1) = NVL(~~PQRY_PARAMETRI175.PARACODIBENE~~, NVL(B.BENEFICIARIO, -1))) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  G.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  G.CODICE_FISCALE, ");
      SQL.append("  E.ANNO_LIQ, ");
      SQL.append("  E.NUMERO_LIQ, ");
      SQL.append("  F.NUMERO_MAND, ");
      SQL.append("  F.D_DATA_MAND, ");
      SQL.append("  E.IMPONIBILE, ");
      SQL.append("  E.ALIQUOTA, ");
      SQL.append("  E.RITENUTE_IRPEF, ");
      SQL.append("  E.ANNO_IMP, ");
      SQL.append("  E.NUMERO_IMP, ");
      SQL.append("  E.CODICE, ");
      SQL.append("  E.IMPORTO_NON_SOG, ");
      SQL.append("  E.IMPORTO, ");
      SQL.append("  E.SEDE_DEL, ");
      SQL.append("  E.NUMERO_DEL, ");
      SQL.append("  E.ANNO_DEL, ");
      SQL.append("  F.UFFICIO ");
      SQL.append("from ");
      SQL.append("  LIQ E, ");
      SQL.append("  MAN F, ");
      SQL.append("  BEN G, ");
      SQL.append("  PAGAMENTI H ");
      SQL.append("where (E.BENEFICIARIO = G.CODICE(+)) ");
      SQL.append("and   (E.ANNO_LIQ = H.ANNO_LIQ) ");
      SQL.append("and   (E.NUMERO_LIQ = H.NUMERO_LIQ) ");
      SQL.append("and   (E.ANNO_MAND = H.ANNO_MAND) ");
      SQL.append("and   (E.NUMERO_MAND = H.NUMERO_MAND) ");
      SQL.append("and   (E.ANNO_MAND = F.ANNO_MAND) ");
      SQL.append("and   (E.NUMERO_MAND = F.NUMERO_MAND) ");
      SQL.append("and   (E.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((E.CODICE IS NULL))) ");
      SQL.append("and   ((E.NUMERO_MAND BETWEEN NVL(~~PQRY_PARAMETRI175.PARAMDAL~~, 1) AND NVL(~~PQRY_PARAMETRI175.PARAMAL~~, 99999))) ");
      SQL.append("and   (NVL(E.UFFICIO, -1) = DECODE(~~PQRY_PARAMETRI175.PARAMUFFICIO~~, -1, NVL(E.UFFICIO, -1), ~~PQRY_PARAMETRI175.PARAMUFFICIO~~)) ");
      SQL.append("and   ((H.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(H.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(H.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   ((H.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI175.PARAMINIZIO~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI175.PARAMFINE~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'P') ");
      SQL.append("and   (H.D_DATA_PAGAM = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(I.D_DATA_PAGAM) ");
      SQL.append("from ");
      SQL.append("  PAGAMENTI I ");
      SQL.append("where ((I.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(H.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(H.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (I.ANNO_LIQ = H.ANNO_LIQ) ");
      SQL.append("and   (I.NUMERO_LIQ = H.NUMERO_LIQ) ");
      SQL.append("and   (I.ANNO_MAND = H.ANNO_MAND) ");
      SQL.append("and   (I.NUMERO_MAND = H.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("and   (NVL(E.BENEFICIARIO, -1) = NVL(~~PQRY_PARAMETRI175.PARACODIBENE~~, NVL(E.BENEFICIARIO, -1))) ");
      SQL.append("order by 12, 6, 5 ");
      BUK_RITEFISCLIBR.SetReportQuery(BUK_RITEFISCLIBR_RPT_RITEFISCREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "3AA0A97F-55FA-4486-BCC7-7912F6623303");
      if (BUK_RITEFISCLIBR.FindObjByID(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU) != null)
        BUK_RITEFISCLIBR.AddReportGroup(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, "RECORLIQCODI");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_RITEFISCLIBR_RPT_RITEFISCREPO_Init()
  {
    BUK_RITEFISCLIBR.InitReport(BUK_RITEFISCLIBR_RPT_RITEFISCREPO, 196865);
    BUK_RITEFISCLIBR_RPT_RITEFISCREPO_InitQuery(true, false);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPT_RITEFISCREPO, "8108C05E-6F31-4924-B3A5-3E086C53AF22");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPT_RITEFISCREPO, "RITEFISCREPO");
    BUK_RITEFISCLIBR.InitSection(BUK_RITEFISCLIBR_RPT_RITEFISCREPO, BUK_RITEFISCLIBR_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_RITEFISCLIBR.SetSectionRendersInto(BUK_RITEFISCLIBR_SEC_INTESTREPORT, BUK_RITEFISCLIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SEC_INTESTREPORT, "23A12741-39B9-4E0B-B923-20663451B200");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_RITEFISCLIBR.InitSection(BUK_RITEFISCLIBR_RPT_RITEFISCREPO, BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, 2700, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 9240833, "RECORLIQCODI");
    BUK_RITEFISCLIBR.SetSectionRendersInto(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, "5775226D-F018-4BFD-A910-086C6C98B57A");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, "LIQCODINTGRU");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_CODICEHEADER, 0, 300, 1500, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_CODICEHEADER, "743A103D-407D-472A-AEC1-DA4276FB66A6");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_CODICEHEADER, BUK_RITEFISCLIBR_SPAN_CODICE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_CODICE1, "FF8B3887-66A1-46E7-879D-65BD56FEB25C");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_CODICE1, "CODICE1");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_CODICE, 1600, 300, 1500, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_CODICE, "CB16DB5A-AF50-47FC-ACB3-056A608D5E1C");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_CODICE, "CODICE");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_CODICE, BUK_RITEFISCLIBR_SPAN_LIQCODICE, MyGlb.VIS_INTSENBORRIG, 1, 4, 0, 271384705, "Brief description of field content.", "::RECORLIQCODI", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_LIQCODICE, "3FCE1DC4-B3D2-4ADF-B7E6-55E57FC2D150");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_LIQCODICE, "LIQCODICE");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_BRSEEEEEEEEE, 0, 1300, 8000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_BRSEEEEEEEEE, "95D35538-DD99-404D-9DA5-95068FAFDAE0");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_BRSEEEEEEEEE, "BRSEEEEEEEEE");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_BRSEEEEEEEEE, BUK_RITEFISCLIBR_SPAN_C3, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Ragione Sociale", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_C3, "166832CB-C64C-434B-A6AB-429D28E065F6");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_C3, "C3");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_BENCODFISHEA, 8100, 1300, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_BENCODFISHEA, "FF290F99-2FE1-4F43-8B93-493D80B64BD1");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_BENCODFISHEA, "BENCODFISHEA");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_BENCODFISHEA, BUK_RITEFISCLIBR_SPAN_CODICEFISCAL, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice Fiscale", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_CODICEFISCAL, "0D320130-6C82-4953-BCB8-BFE2A38BA4CC");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_CODICEFISCAL, "CODICEFISCAL");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_LIQUIDHEADER, 11400, 1300, 2600, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_LIQUIDHEADER, "525C17D1-C21D-4C1F-8609-0E2B4362D260");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_LIQUIDHEADER, "LIQUIDHEADER");
    BUK_RITEFISCLIBR.set_BoxAlignment(BUK_RITEFISCLIBR_RPTBOX_LIQUIDHEADER, 2);
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_LIQUIDHEADER, BUK_RITEFISCLIBR_SPAN_C1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Liquidazione", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_C1, "F800D449-2895-4732-A370-D8A5D9CAE45F");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_C1, "C1");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_MANDATHEADER, 14100, 1300, 2800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_MANDATHEADER, "2EA6330F-2302-40A5-96F9-6E5B78D0D56F");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_MANDATHEADER, "MANDATHEADER");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_MANDATHEADER, BUK_RITEFISCLIBR_SPAN_MANDATO, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Mandato", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_MANDATO, "4A3A3DCF-885B-46D4-84CD-5886FD4C1320");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_MANDATO, "MANDATO");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEAD, 14100, 1900, 900, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEAD, "232B5EC7-5E35-409A-A5B2-7F87F72AB9CB");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEAD, "NUMEMANDHEAD");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEAD, BUK_RITEFISCLIBR_SPAN_NRO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "N.ro", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_NRO, "562862EA-1A5D-4CD5-A31A-D39BAF4F6100");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_NRO, "NRO");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_DDATAMANDHEA, 15100, 1900, 1800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_DDATAMANDHEA, "2E8A0548-C380-4978-B7CC-679F0F4D8244");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_DDATAMANDHEA, "DDATAMANDHEA");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_DDATAMANDHEA, BUK_RITEFISCLIBR_SPAN_DATA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_DATA, "92AFF4C9-EDA0-4F96-A953-6692DB1F1197");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_DATA, "DATA");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_LIQIMPONHEAD, 17000, 1300, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_LIQIMPONHEAD, "F1CF5DF8-07C4-401B-B636-C362079A4158");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_LIQIMPONHEAD, "LIQIMPONHEAD");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_LIQIMPONHEAD, BUK_RITEFISCLIBR_SPAN_IMPONIBILE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Imponibile", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_IMPONIBILE, "B618BF97-EB2E-4F6F-8589-A6317E19E978");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_IMPONIBILE, "IMPONIBILE");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_LIQALIQUHEAD, 20200, 1300, 1100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_LIQALIQUHEAD, "14DE0DCE-7F1A-40A3-A3DC-68AEF11AF429");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_LIQALIQUHEAD, "LIQALIQUHEAD");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_LIQALIQUHEAD, BUK_RITEFISCLIBR_SPAN_ALIQ, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Aliq.", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_ALIQ, "93588674-3582-4E36-86AC-1BACC79C3F4A");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_ALIQ, "ALIQ");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_LIQRITIRPHEA, 21400, 1300, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_LIQRITIRPHEA, "8EAAFD9F-5AFF-4FD5-A600-60F6070B630B");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_LIQRITIRPHEA, "LIQRITIRPHEA");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_LIQRITIRPHEA, BUK_RITEFISCLIBR_SPAN_RITENUTE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ritenute", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_RITENUTE, "D884BE2D-4C28-4054-9304-02E513085C0F");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_RITENUTE, "RITENUTE");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_IMPNONSOGHEA, 21400, 1900, 3100, 800, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_IMPNONSOGHEA, "762162A3-A6B8-47E1-A382-ED604C51820D");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_IMPNONSOGHEA, "IMPNONSOGHEA");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_IMPNONSOGHEA, BUK_RITEFISCLIBR_SPAN_IMPNONSOGG, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Imp. non Sogg.", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_IMPNONSOGG, "F9FDE613-FBC7-4E7E-A42E-CE7B46D1F415");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_IMPNONSOGG, "IMPNONSOGG");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_IMPORTHEADER, 24600, 1300, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_IMPORTHEADER, "DE56A1BE-2CC3-4202-97CD-4C100253D845");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_IMPORTHEADER, BUK_RITEFISCLIBR_SPAN_IMPORTO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_IMPORTO, "6AAB4E84-9F16-4995-B07F-2930372FF30A");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_IMPORTO, "IMPORTO");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEA1, 11400, 2000, 900, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEA1, "D92C7DA5-97F3-469F-B20B-63FA10C3B46E");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEA1, "NUMEMANDHEA1");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEA1, BUK_RITEFISCLIBR_SPAN_C2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "N.ro", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_C2, "3D79665A-B6D2-4353-9399-91B3F2376BEE");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_C2, "C2");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEA2, 12400, 2000, 1000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEA2, "A12DD016-7020-433D-9894-BF635FCF3956");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEA2, "NUMEMANDHEA2");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_NUMEMANDHEA2, BUK_RITEFISCLIBR_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Anno", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_C, "74C5258C-71D4-452B-A57E-6EF7E975954D");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_C, "C");
    BUK_RITEFISCLIBR.InitSection(BUK_RITEFISCLIBR_RPT_RITEFISCREPO, BUK_RITEFISCLIBR_SEC_DETTAGLIO, 1300, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RITEFISCLIBR.SetSectionRendersInto(BUK_RITEFISCLIBR_SEC_DETTAGLIO, BUK_RITEFISCLIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SEC_DETTAGLIO, "959DE42C-5612-4BAC-820D-411E3C10D5E8");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_DETTAGLIO, BUK_RITEFISCLIBR_RPTBOX_BERASOESESEE, 100, 0, 7900, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_BERASOESESEE, "9A4C4143-D046-4F21-9B62-B842E420FCEA");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_BERASOESESEE, "BERASOESESEE");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_BERASOESESEE, BUK_RITEFISCLIBR_SPAN_REBERSERFRFL, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "Brief description of field content.", "::REBERASOESES", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_REBERSERFRFL, "81AF4F0E-42D6-44BB-BE11-07972FE46496");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_REBERSERFRFL, "REBERSERFRFL");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_DETTAGLIO, BUK_RITEFISCLIBR_RPTBOX_BENCODICFISC, 8100, 0, 3200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_BENCODICFISC, "9FFBA529-865B-44EB-9CE7-B47AFCE17166");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_BENCODICFISC, "BENCODICFISC");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_BENCODICFISC, BUK_RITEFISCLIBR_SPAN_REBECOFRFRFL, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::RECBENCODFIS", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_REBECOFRFRFL, "5DF544DD-0DED-486A-9CDB-41A8565A3A07");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_REBECOFRFRFL, "REBECOFRFRFL");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_DETTAGLIO, BUK_RITEFISCLIBR_RPTBOX_NUMEROMAND, 14100, 0, 900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_NUMEROMAND, "A8AD860A-5C49-4FAB-8EF8-FC87935A0AA2");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_NUMEROMAND, "NUMEROMAND");
    BUK_RITEFISCLIBR.set_BoxAlignment(BUK_RITEFISCLIBR_RPTBOX_NUMEROMAND, 3);
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_NUMEROMAND, BUK_RITEFISCLIBR_SPAN_REMANUMRFRFL, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::RECMANNUMMAN", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_REMANUMRFRFL, "FDD33FE3-C6BB-4EBB-8845-A416C1F13FA7");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_REMANUMRFRFL, "REMANUMRFRFL");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_DETTAGLIO, BUK_RITEFISCLIBR_RPTBOX_DDATAMAND, 15100, 0, 1800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_DDATAMAND, "A88D2823-DA90-4F79-9EDC-226C53CB0ED2");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_DDATAMAND, "DDATAMAND");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_DDATAMAND, BUK_RITEFISCLIBR_SPAN_REMADDMRFRFL, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::RECMANDDATMA", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_REMADDMRFRFL, "623475EE-6C9E-452D-B1F0-273D208FA1D3");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_REMADDMRFRFL, "REMADDMRFRFL");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_DETTAGLIO, BUK_RITEFISCLIBR_RPTBOX_LIQIMPONIBIL, 17000, 0, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_LIQIMPONIBIL, "901E9EDD-82CB-486E-8B29-CB0D081DBE50");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_LIQIMPONIBIL, "LIQIMPONIBIL");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_LIQIMPONIBIL, BUK_RITEFISCLIBR_SPAN_RELIIMRIFRFL, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECORLIQIMP1", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_RELIIMRIFRFL, "453B0E5E-EF24-4F07-9E57-63B67192B791");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_RELIIMRIFRFL, "RELIIMRIFRFL");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_DETTAGLIO, BUK_RITEFISCLIBR_RPTBOX_LIQALIQUOTA, 20200, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_LIQALIQUOTA, "019EC999-69C7-455D-AFAC-86D69678DE83");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_LIQALIQUOTA, "LIQALIQUOTA");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_LIQALIQUOTA, BUK_RITEFISCLIBR_SPAN_RELIALRIFRFL, MyGlb.VIS_DEFAREPOSTYL, 3, 4, 6, 271384705, "Brief description of field content.", "::RECORLIQALIQ", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_RELIALRIFRFL, "54CB62E4-859C-4911-8052-3731C58815C0");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_RELIALRIFRFL, "RELIALRIFRFL");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_DETTAGLIO, BUK_RITEFISCLIBR_RPTBOX_LIQRITENIRPE, 21400, 0, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_LIQRITENIRPE, "C2D7C20C-C5C4-4E52-BC69-603CFC89A24A");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_LIQRITENIRPE, "LIQRITENIRPE");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_LIQRITENIRPE, BUK_RITEFISCLIBR_SPAN_RELIRIIRFRFL, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECLIQRITIRP", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_RELIRIIRFRFL, "C08FEF06-B293-4C37-B1B1-31B92C47059C");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_RELIRIIRFRFL, "RELIRIIRFRFL");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_DETTAGLIO, BUK_RITEFISCLIBR_RPTBOX_IMPORTNONSOG, 21400, 700, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_IMPORTNONSOG, "F1AC9702-AC2C-4299-9A14-E40BCEA4BDFC");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_IMPORTNONSOG, "IMPORTNONSOG");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_IMPORTNONSOG, BUK_RITEFISCLIBR_SPAN_LIQIMPNONSOG, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECLIQIMNOSO", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_LIQIMPNONSOG, "080C5DD8-60FA-41A8-8D6D-D47FBD8AEC89");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_LIQIMPNONSOG, "LIQIMPNONSOG");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_DETTAGLIO, BUK_RITEFISCLIBR_RPTBOX_IMPORTO, 24600, 0, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_IMPORTO, "256071AD-75E2-43FC-A1A2-1D1EDEA029BF");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_IMPORTO, "IMPORTO");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_IMPORTO, BUK_RITEFISCLIBR_SPAN_LIQIMPORTO, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECORLIQIMPO", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_LIQIMPORTO, "C123D191-6CE4-4D3A-B040-C6670063C16E");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_LIQIMPORTO, "LIQIMPORTO");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_DETTAGLIO, BUK_RITEFISCLIBR_RPTBOX_NUMEROLIQ, 11400, 0, 900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_NUMEROLIQ, "EA544605-23D8-49E1-93FD-E75E6D249EE6");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_NUMEROLIQ, "NUMEROLIQ");
    BUK_RITEFISCLIBR.set_BoxAlignment(BUK_RITEFISCLIBR_RPTBOX_NUMEROLIQ, 2);
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_NUMEROLIQ, BUK_RITEFISCLIBR_SPAN_NUMEROLIQ, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::RECORNUMELIQ", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_NUMEROLIQ, "34D35AB4-5AD6-4320-B074-1F649B27741A");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_NUMEROLIQ, "NUMEROLIQ");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_DETTAGLIO, BUK_RITEFISCLIBR_RPTBOX_ANNOLIQ, 12400, 0, 1000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_ANNOLIQ, "1A458543-ECE4-4876-B505-78AADC9E096D");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_ANNOLIQ, "ANNOLIQ");
    BUK_RITEFISCLIBR.set_BoxAlignment(BUK_RITEFISCLIBR_RPTBOX_ANNOLIQ, 2);
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_ANNOLIQ, BUK_RITEFISCLIBR_SPAN_ANNOLIQ, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "Brief description of field content.", "::RECORANNOLIQ", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_ANNOLIQ, "169D3996-6600-463E-8989-9F66001E605F");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_ANNOLIQ, "ANNOLIQ");
    BUK_RITEFISCLIBR.InitSection(BUK_RITEFISCLIBR_RPT_RITEFISCREPO, BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU, 1500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORLIQCODI");
    BUK_RITEFISCLIBR.SetSectionRendersInto(BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU, BUK_RITEFISCLIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU, "02BB1D17-B2EC-4B36-89AE-60633BBF4946");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU, "LIQCODPIEGRU");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU, BUK_RITEFISCLIBR_RPTBOX_SUMOFLIQIMSS, 17000, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_SUMOFLIQIMSS, "B43EF515-4175-4320-A2F8-51CBD4925A11");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_SUMOFLIQIMSS, "SUMOFLIQIMSS");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_SUMOFLIQIMSS, BUK_RITEFISCLIBR_SPAN_LCPGSRLIRFR1, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_LCPGSRLIRFR1, "9FBCCEB9-4C56-4949-8ADD-31F9E5EDC934");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_LCPGSRLIRFR1, "LCPGSRLIRFR1");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU, BUK_RITEFISCLIBR_RPTBOX_SUOFLIRISSCE, 21400, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_SUOFLIRISSCE, "B0940604-9A5E-44E4-92C4-9AAC0A7D78DB");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_SUOFLIRISSCE, "SUOFLIRISSCE");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_SUOFLIRISSCE, BUK_RITEFISCLIBR_SPAN_LCPGSRLRIRFR, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_LCPGSRLRIRFR, "C672345B-8A81-41D1-943E-53260861C9A1");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_LCPGSRLRIRFR, "LCPGSRLRIRFR");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU, BUK_RITEFISCLIBR_RPTBOX_TOTALE, 10800, 200, 6100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_TOTALE, "CC40DE53-BCA3-4273-9091-D416EACB937C");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_TOTALE, "TOTALE");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_TOTALE, BUK_RITEFISCLIBR_SPAN_TOTALE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_TOTALE, "95E73B63-B115-4EBD-B05D-A5ABEC569C91");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_TOTALE, "TOTALE");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_TOTALE, BUK_RITEFISCLIBR_SPAN_CODICE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", " codice ", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_CODICE, "79545B6C-8231-4F7A-BA16-D74010A40724");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_CODICE, "CODICE");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_TOTALE, BUK_RITEFISCLIBR_SPAN_RELICORIFRFL, MyGlb.VIS_INTSENBORRIG, 1, 4, 0, 271384705, "", "::RECORLIQCODI", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_RELICORIFRFL, "37422BF9-4445-4560-B83F-5BBA471E3E98");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_RELICORIFRFL, "RELICORIFRFL");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU, BUK_RITEFISCLIBR_RPTBOX_SUOFLIIMNOSO, 21400, 800, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_SUOFLIIMNOSO, "07DDC661-89B0-40EC-B416-E2C5B512BA51");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_SUOFLIIMNOSO, "SUOFLIIMNOSO");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_SUOFLIIMNOSO, BUK_RITEFISCLIBR_SPAN_LCPGSRLINSRF, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_LCPGSRLINSRF, "0FC1AE29-368A-4BDF-804B-98C1335DF809");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_LCPGSRLINSRF, "LCPGSRLINSRF");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU, BUK_RITEFISCLIBR_RPTBOX_SUMOFLIQIMPO, 24600, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_SUMOFLIQIMPO, "BF44BB71-79DF-44C2-9D74-9BB259E34CF2");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_SUMOFLIQIMPO, "SUMOFLIQIMPO");
    BUK_RITEFISCLIBR.InitBoxSpan(BUK_RITEFISCLIBR_RPTBOX_SUMOFLIQIMPO, BUK_RITEFISCLIBR_SPAN_LCPGSRLIRFRF, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SPAN_LCPGSRLIRFRF, "A525100D-8B29-4238-9FFA-EFEC1F6034EB");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SPAN_LCPGSRLIRFRF, "LCPGSRLIRFRF");
    BUK_RITEFISCLIBR.InitReportBox(BUK_RITEFISCLIBR_SEC_LIQCODPIEGRU, BUK_RITEFISCLIBR_RPTBOX_LINEA, 17000, 0, 10700, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_RPTBOX_LINEA, "95774611-8034-41CC-B91B-710DAD2D6025");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_RPTBOX_LINEA, "LINEA");
    BUK_RITEFISCLIBR.InitSection(BUK_RITEFISCLIBR_RPT_RITEFISCREPO, BUK_RITEFISCLIBR_SEC_PIEDEREPORT, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_RITEFISCLIBR.SetSectionRendersInto(BUK_RITEFISCLIBR_SEC_PIEDEREPORT, BUK_RITEFISCLIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEFISCLIBR.SetRTCGuid(BUK_RITEFISCLIBR_SEC_PIEDEREPORT, "164C4845-F766-4A2D-B7D8-E17207D3EDF9");
    BUK_RITEFISCLIBR.SetObjCode(BUK_RITEFISCLIBR_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_RITEFISCLIBR.AddReportGroup(BUK_RITEFISCLIBR_SEC_LIQCODINTGRU, "RECORLIQCODI");
    BUK_RITEFISCLIBR_RPT_RITEFISCREPO_InitQuery(false, true);
  }

  private void BUK_RITEFISCLIBR_InitLinks()
  {
    BUK_RITEFISCLIBR.SetBoxNextBox(BUK_RITEFISCLIBR_RPTBOX_CORPOPAGINA, BUK_RITEFISCLIBR_RPTBOX_CORPOPAGINA);
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
    if (SrcObj == BKW_RITEFISCLIBR) BUK_RITEFISCLIBR_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_RITEFISCLIBR) BUK_RITEFISCLIBR_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_RITEFISCLIBR) BUK_RITEFISCLIBR_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_RITEFISCLIBR) BUK_RITEFISCLIBR_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_RITEFISCLIBR) BUK_RITEFISCLIBR_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_RITEFISCLIBR) BUK_RITEFISCLIBR_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_RITEFISCLIBR) BUK_RITEFISCLIBR_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_RITEFISCLIBR) BUK_RITEFISCLIBR_OnPreview();
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
