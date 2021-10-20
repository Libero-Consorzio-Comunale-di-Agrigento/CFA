// **********************************************
// Ritenute Previdenziali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RitenutePrevidenziali extends MyWebForm implements Serializable
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
  private static int PFL_PARAMETRI_CASSA = 7;
  private static int PFL_PARAMETRI_UFFICIO = 8;
  private static int PFL_PARAMETRI_TOTPERIMSUIM = 9;
  private static int PFL_PARAMETRI_DATAELABORAZ = 10;

  private static int PPQRY_PARAMETRI167 = 0;

  private static int PPQRY_T83 = 1;
  private static int PPQRY_T54 = 2;


  IDPanel PAN_PARAMETRI;
  CIDREObj BUK_RITEPREVLIBR;
  OBook BKW_RITEPREVLIBR;
  //
  // Template Pages constants
  private static int BUK_RITEPREVLIBR_MST_RITEPREVMAST = 1;
  private static int BUK_RITEPREVLIBR_RPTBOX_DATAELABORAZ = 2;
  private static int BUK_RITEPREVLIBR_SPAN_DATAELABORAZ = 3;
  private static int BUK_RITEPREVLIBR_RPTBOX_NUMEROPAGINA = 4;
  private static int BUK_RITEPREVLIBR_SPAN_CPTSRPLRPPND = 5;
  private static int BUK_RITEPREVLIBR_RPTBOX_TESTATPAGINA = 6;
  private static int BUK_RITEPREVLIBR_SPAN_UPTEPATOTICE = 7;
  private static int BUK_RITEPREVLIBR_RPTBOX_SOTTTESTPAGI = 8;
  private static int BUK_RITEPREVLIBR_SPAN_IEPDRPPPARPP = 9;
  private static int BUK_RITEPREVLIBR_RPTBOX_CORPOPAGINA = 10;

  //
  // Reports constants
  private static int BUK_RITEPREVLIBR_RPT_RITEPREVREPO = 11;
  private static int BUK_RITEPREVLIBR_SEC_INTESTREPORT = 12;
  private static int BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR = 13;
  private static int BUK_RITEPREVLIBR_RPTBOX_BRSEEEEEEEEE = 14;
  private static int BUK_RITEPREVLIBR_SPAN_C2 = 15;
  private static int BUK_RITEPREVLIBR_RPTBOX_BENCODFISHEA = 16;
  private static int BUK_RITEPREVLIBR_SPAN_CODICEFISCAL = 17;
  private static int BUK_RITEPREVLIBR_RPTBOX_MANDATHEADER = 18;
  private static int BUK_RITEPREVLIBR_SPAN_MANDATO = 19;
  private static int BUK_RITEPREVLIBR_RPTBOX_NUMEMANDHEAD = 20;
  private static int BUK_RITEPREVLIBR_SPAN_NRO = 21;
  private static int BUK_RITEPREVLIBR_RPTBOX_DDATAMANDHEA = 22;
  private static int BUK_RITEPREVLIBR_SPAN_DATA = 23;
  private static int BUK_RITEPREVLIBR_RPTBOX_IMPEGNHEADER = 24;
  private static int BUK_RITEPREVLIBR_SPAN_IMPEGNO1 = 25;
  private static int BUK_RITEPREVLIBR_RPTBOX_SUBIMPEGHEAD = 26;
  private static int BUK_RITEPREVLIBR_SPAN_SUBIMPEGNO1 = 27;
  private static int BUK_RITEPREVLIBR_RPTBOX_IMPORTHEADER = 28;
  private static int BUK_RITEPREVLIBR_SPAN_IMPORTO = 29;
  private static int BUK_RITEPREVLIBR_RPTBOX_LIQIMPINPHEA = 30;
  private static int BUK_RITEPREVLIBR_SPAN_IMPONIBILE = 31;
  private static int BUK_RITEPREVLIBR_RPTBOX_LIQALIINPHEA = 32;
  private static int BUK_RITEPREVLIBR_SPAN_ALIQ = 33;
  private static int BUK_RITEPREVLIBR_RPTBOX_LIQRITINPHEA = 34;
  private static int BUK_RITEPREVLIBR_SPAN_RITACARIPERC = 35;
  private static int BUK_RITEPREVLIBR_RPTBOX_RITEINPCEHEA = 36;
  private static int BUK_RITEPREVLIBR_SPAN_RITACARIENTE = 37;
  private static int BUK_RITEPREVLIBR_SEC_DETTAGLIO = 38;
  private static int BUK_RITEPREVLIBR_RPTBOX_BERASOESESEE = 39;
  private static int BUK_RITEPREVLIBR_SPAN_REBERSERPRPL = 40;
  private static int BUK_RITEPREVLIBR_RPTBOX_BENCODICFISC = 41;
  private static int BUK_RITEPREVLIBR_SPAN_REBECOFRPRPL = 42;
  private static int BUK_RITEPREVLIBR_RPTBOX_NUMEROMAND = 43;
  private static int BUK_RITEPREVLIBR_SPAN_REMANUMRPRPL = 44;
  private static int BUK_RITEPREVLIBR_RPTBOX_DDATAMAND = 45;
  private static int BUK_RITEPREVLIBR_SPAN_REMADDMRPRPL = 46;
  private static int BUK_RITEPREVLIBR_RPTBOX_IMPEGNO = 47;
  private static int BUK_RITEPREVLIBR_SPAN_REIMRIPRRIPL = 48;
  private static int BUK_RITEPREVLIBR_RPTBOX_SUBIMPEGNO = 49;
  private static int BUK_RITEPREVLIBR_SPAN_RESUIMRIPRPL = 50;
  private static int BUK_RITEPREVLIBR_RPTBOX_LIQIMPONINPS = 51;
  private static int BUK_RITEPREVLIBR_SPAN_RELIIMIRPRPL = 52;
  private static int BUK_RITEPREVLIBR_RPTBOX_LIQALIQUINPS = 53;
  private static int BUK_RITEPREVLIBR_SPAN_RELIALIRPRPL = 54;
  private static int BUK_RITEPREVLIBR_RPTBOX_LIQRITENINPS = 55;
  private static int BUK_RITEPREVLIBR_SPAN_RELIRIIRPRPL = 56;
  private static int BUK_RITEPREVLIBR_RPTBOX_IMPORTO = 57;
  private static int BUK_RITEPREVLIBR_SPAN_LIQIMPORTO = 58;
  private static int BUK_RITEPREVLIBR_RPTBOX_RITENUINPSCE = 59;
  private static int BUK_RITEPREVLIBR_SPAN_LIQRITEINPCE = 60;
  private static int BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR = 61;
  private static int BUK_RITEPREVLIBR_RPTBOX_LINEA1 = 62;
  private static int BUK_RITEPREVLIBR_RPTBOX_TOTALEIMPEGN = 63;
  private static int BUK_RITEPREVLIBR_SPAN_C1 = 64;
  private static int BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMS1 = 65;
  private static int BUK_RITEPREVLIBR_SPAN_RISPGSRLIIRP = 66;
  private static int BUK_RITEPREVLIBR_RPTBOX_SUOFLIRISSC1 = 67;
  private static int BUK_RITEPREVLIBR_SPAN_RISPGSRLRIRP = 68;
  private static int BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMP1 = 69;
  private static int BUK_RITEPREVLIBR_SPAN_RISPGSRLIRPR = 70;
  private static int BUK_RITEPREVLIBR_RPTBOX_SUOFLIRIINC1 = 71;
  private static int BUK_RITEPREVLIBR_SPAN_RISPGSRLRICR = 72;
  private static int BUK_RITEPREVLIBR_SEC_PIEDEREPORT = 73;
  private static int BUK_RITEPREVLIBR_RPTBOX_LINEA = 74;
  private static int BUK_RITEPREVLIBR_RPTBOX_TOTALEGENERA = 75;
  private static int BUK_RITEPREVLIBR_SPAN_C = 76;
  private static int BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMSS = 77;
  private static int BUK_RITEPREVLIBR_SPAN_PRSRLIIRPRPL = 78;
  private static int BUK_RITEPREVLIBR_RPTBOX_SUOFLIRISSCE = 79;
  private static int BUK_RITEPREVLIBR_SPAN_PRSRLRIRPRPL = 80;
  private static int BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMPO = 81;
  private static int BUK_RITEPREVLIBR_SPAN_PIRSRLIRPRPL = 82;
  private static int BUK_RITEPREVLIBR_RPTBOX_SUOFLIRIINCE = 83;
  private static int BUK_RITEPREVLIBR_SPAN_PRSRLRICRPRP = 84;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI172(IMDB);
    //
    //
    Init_PQRY_PARAMETRI167(IMDB);
    Init_PQRY_PARAMETRI167_RS(IMDB);
    Init_PQRY_LIQ29(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI172(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI172, 11);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI172, "TBL_PARAMETRI172");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMCASSA, "PARAMCASSA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMCASSA,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMESERCIZ,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARADATAELAB,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMDTARITE, "PARAMDTARITE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMDTARITE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMSUBIMPE, "PARAMSUBIMPE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMSUBIMPE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMTOTIMPS, "PARAMTOTIMPS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI172,IMDBDef5.FLD_PARAMETRI172_PARAMTOTIMPS,1,1,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI172, 0);
  }

  private static void Init_PQRY_PARAMETRI167(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI167, 8);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI167, "PQRY_PARAMETRI167");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARADATAELAB,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMTOTIMPS, "PARAMTOTIMPS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMTOTIMPS,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMCASSA, "PARAMCASSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167,IMDBDef15.PQSL_PARAMETRI167_PARAMCASSA,1,5,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI167, 0);
  }

  private static void Init_PQRY_PARAMETRI167_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI167_RS, 8);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI167_RS, "PQRY_PARAMETRI167_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARADATAELAB,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMTOTIMPS, "PARAMTOTIMPS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMTOTIMPS,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMCASSA, "PARAMCASSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI167_RS,IMDBDef15.PQSL_PARAMETRI167_PARAMCASSA,1,5,0);
  }

  private static void Init_PQRY_LIQ29(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_LIQ29, 18);
    IMDB.set_TblCode(IMDBDef15.PQRY_LIQ29, "PQRY_LIQ29");
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECRUGIMPSUB, "RECRUGIMPSUB");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECRUGIMPSUB,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECBENCODFIS, "RECBENCODFIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECBENCODFIS,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECMANNUMMAN, "RECMANNUMMAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECMANNUMMAN,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECMANDDATMA, "RECMANDDATMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECMANDDATMA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECORLIQIMPO, "RECORLIQIMPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECORLIQIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQIMPINP, "RECLIQIMPINP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQIMPINP,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQALIINP, "RECLIQALIINP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQALIINP,3,5,3);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQRITINP, "RECLIQRITINP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQRITINP,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQRIINCE, "RECLIQRIINCE");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQRIINCE,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_IMPEGNO, "IMPEGNO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_IMPEGNO,5,201,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_SUBIMPEGNO, "SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_SUBIMPEGNO,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQANNIMP, "RECLIQANNIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQNUMIMP, "RECLIQNUMIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQANNSUB, "RECLIQANNSUB");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQANNSUB,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQNUMSUB, "RECLIQNUMSUB");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECLIQNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECORLIQCASS, "RECORLIQCASS");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECORLIQCASS,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECORT83DESC, "RECORT83DESC");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ29,IMDBDef15.PQSL_LIQ29_RECORT83DESC,5,50,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_LIQ29, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RitenutePrevidenziali(MyWebEntryPoint w, IMDBObj imdb)
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
  public RitenutePrevidenziali()
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
    FormIdx = MyGlb.FRM_RITENUPREVID;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FEF359EF-D4F8-460D-9FC1-02D1F21A624E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 356;
    DesignHeight = 346;
    set_Caption(new IDVariant("Ritenute Previdenziali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 356;
    Frames[1].Height = 320;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 320;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 356-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3C3BA31A-C9C8-4162-A0E9-A15F304B8336");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1852, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    BKW_RITEPREVLIBR = new OBook(this);
    BUK_RITEPREVLIBR = new CIDREObj(BKW_RITEPREVLIBR);
    BKW_RITEPREVLIBR.iGuid = "F6885225-4D2E-4997-B2C0-B8493E9BBCF1";
    BKW_RITEPREVLIBR.Code = "BUK_RITEPREVLIBR";
    BKW_RITEPREVLIBR.BookObj = BUK_RITEPREVLIBR;
    BKW_RITEPREVLIBR.InitDefMasks();
    BUK_RITEPREVLIBR.InitBook(1, 1245441, "Ritenute Previdenziali Libro", IMDB, MainFrm.VisualStyleList);
    BUK_RITEPREVLIBR.InitHTML();
    BUK_RITEPREVLIBR.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_RITEPREVLIBR.Book.SetMainFrm(MainFrm);
    BUK_RITEPREVLIBR.SetRTCGuid(0, "F6885225-4D2E-4997-B2C0-B8493E9BBCF1");
    BUK_RITEPREVLIBR.SetObjCode(0, "RITEPREVLIBR");
    BUK_RITEPREVLIBR_MST_RITEPREVMAST_Init();
    BUK_RITEPREVLIBR_RPT_RITEPREVREPO_Init();
    BUK_RITEPREVLIBR_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI172, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RITENUPREVID_PARAMETRI167();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_RITEPREVLIBR.UpdateBook();
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
    if (Code.equals("BUK_RITEPREVLIBR")) return BUK_RITEPREVLIBR;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof RitenutePrevidenziali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RitenutePrevidenziali.class.getName() : (Glb.ClassWithPackage(RitenutePrevidenziali.class) ? RitenutePrevidenziali.class.getName().substring(RitenutePrevidenziali.class.getPackage().getName().length() + 1) : RitenutePrevidenziali.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      BUK_RITEPREVLIBR.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_RITEPREVLIBR.RefreshQuery();
      BUK_RITEPREVLIBR.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_RITEPREVLIBR.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenutePrevidenziali", "Elabora", _e);
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
      v_NOMECAPTION = (new IDVariant("Ritenute Previdenziali ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARADELEROWS();
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMINIZIO, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMFINE, 0, (new IDVariant(12)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARADATAELAB, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMUFFICIO, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMCASSA, 0, (new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenutePrevidenziali", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMCASSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMINIZIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMFINE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARADATAELAB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMDTARITE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMUFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMSUBIMPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMTOTIMPS, 0, new IDVariant());
  }

  // **********************************************************************
  // Intestazione Report Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_RITEPREVLIBR_SEC_INTESTREPORT_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Intestazione Report Before Formatting Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMTOTIMPS, 0).equals((new IDVariant(1)), true))
      {
        BUK_RITEPREVLIBR.set_SectionVisible(BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_RITEPREVLIBR.set_SectionVisible(BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenutePrevidenziali", "IntestazioneReportBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RITENUPREVID_PARAMETRI167() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI167_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI172, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI172, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI167_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI167_RS, 0, IMDBDef5.TBL_PARAMETRI172, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI167_RS, 0, 0, IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMINIZIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI167_RS, 1, 0, IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMFINE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI167_RS, 2, 0, IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI167_RS, 3, 0, IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI167_RS, 4, 0, IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMUFFICIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI167_RS, 5, 0, IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARADATAELAB, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI167_RS, 6, 0, IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMTOTIMPS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI167_RS, 7, 0, IMDBDef5.TBL_PARAMETRI172, IMDBDef5.FLD_PARAMETRI172_PARAMCASSA, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI172, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI172, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI172, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI167_RS, 0);
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

  private void BUK_RITEPREVLIBR_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_RITEPREVLIBR_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_RITEPREVLIBR_SEC_INTESTREPORT)
    {
      BUK_RITEPREVLIBR_SEC_INTESTREPORT_OnFormattingSection();
    }
    if (SectionID==BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR)
    {
    }
    if (SectionID==BUK_RITEPREVLIBR_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR)
    {
      BUK_RITEPREVLIBR.set_SpanValue(BUK_RITEPREVLIBR_SPAN_RISPGSRLIIRP, new IDVariant(BUK_RITEPREVLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR,"RECLIQIMPINP")));
      BUK_RITEPREVLIBR.set_SpanValue(BUK_RITEPREVLIBR_SPAN_RISPGSRLRIRP, new IDVariant(BUK_RITEPREVLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR,"RECLIQRITINP")));
      BUK_RITEPREVLIBR.set_SpanValue(BUK_RITEPREVLIBR_SPAN_RISPGSRLIRPR, new IDVariant(BUK_RITEPREVLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR,"RECORLIQIMPO")));
      BUK_RITEPREVLIBR.set_SpanValue(BUK_RITEPREVLIBR_SPAN_RISPGSRLRICR, new IDVariant(BUK_RITEPREVLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR,"RECLIQRIINCE")));
    }
    if (SectionID==BUK_RITEPREVLIBR_SEC_PIEDEREPORT)
    {
      BUK_RITEPREVLIBR.set_SpanValue(BUK_RITEPREVLIBR_SPAN_PRSRLIIRPRPL, new IDVariant(BUK_RITEPREVLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEPREVLIBR_SEC_PIEDEREPORT,"RECLIQIMPINP")));
      BUK_RITEPREVLIBR.set_SpanValue(BUK_RITEPREVLIBR_SPAN_PRSRLRIRPRPL, new IDVariant(BUK_RITEPREVLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEPREVLIBR_SEC_PIEDEREPORT,"RECLIQRITINP")));
      BUK_RITEPREVLIBR.set_SpanValue(BUK_RITEPREVLIBR_SPAN_PIRSRLIRPRPL, new IDVariant(BUK_RITEPREVLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEPREVLIBR_SEC_PIEDEREPORT,"RECORLIQIMPO")));
      BUK_RITEPREVLIBR.set_SpanValue(BUK_RITEPREVLIBR_SPAN_PRSRLRICRPRP, new IDVariant(BUK_RITEPREVLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEPREVLIBR_SEC_PIEDEREPORT,"RECLIQRIINCE")));
    }
  }

  private void BUK_RITEPREVLIBR_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_RITEPREVLIBR_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_RITEPREVLIBR_MST_RITEPREVMAST)
    {
      BUK_RITEPREVLIBR.set_SpanValue(BUK_RITEPREVLIBR_SPAN_DATAELABORAZ, new IDVariant(IDL.Add(IDL.Add((new IDVariant("del")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARADATAELAB, 0)))));
      BUK_RITEPREVLIBR.set_SpanValue(BUK_RITEPREVLIBR_SPAN_CPTSRPLRPPND, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_RITEPREVLIBR.GetPageNumber())))), (new IDVariant(" di "))), IDL.ToString((new IDVariant(BUK_RITEPREVLIBR.GetTotalPagesNumber()))))));
      BUK_RITEPREVLIBR.set_SpanValue(BUK_RITEPREVLIBR_SPAN_UPTEPATOTICE, new IDVariant(IDL.Upper(IDL.Add((new IDVariant(BUK_RITEPREVLIBR.BoxToolTip(BUK_RITEPREVLIBR_RPTBOX_TESTATPAGINA))), MainFrm.ESERCIZIO))));
      BUK_RITEPREVLIBR.set_SpanValue(BUK_RITEPREVLIBR_SPAN_IEPDRPPPARPP, new IDVariant(((IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals(IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0)))?IDL.Add(IDL.Add((new IDVariant("Mese di")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())):IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Da")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMINIZIO, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI167, IMDBDef15.PQSL_PARAMETRI167_PARAMFINE, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())))));
    }
  }

  private void BUK_RITEPREVLIBR_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_RITEPREVLIBR_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_RITEPREVLIBR_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_RITEPREVLIBR_OnPreview()
  {
    PreviewBook = BKW_RITEPREVLIBR;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "FC86C1BD-20F3-4120-9261-08C0598029A5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "Periodo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 16, 3, 300, 61, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 43);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "3C748576-49B6-49CA-8978-1C6B0C8ECDDC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "Mandati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 16, 67, 300, 61, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 46);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "65CE63B7-B461-47A4-B382-8754F0B67B76");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "A31D533D-F805-4336-B8E7-1EB2B654B363");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "Da");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "D4B2257F-5F0A-4CF2-892D-D5902AEB9F3F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "A");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "0A848481-7243-4528-9FE6-2D679CDE32EA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "FCC11555-171C-43DF-AF43-B913FF3028C0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "6FC1B265-0B6E-4067-91F7-D6D26D85ACBA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "C381A0F7-BB77-4E7E-A61D-4BA3F266CB29");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, "5FCB08DE-811A-4F3F-AA76-F6F4B3089953");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, "Cassa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "A8208879-0D7B-424F-A2A0-28AB7DCEC5F3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, "4322CC11-F375-4BFC-85E1-132073EDA1FF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, "Totale per Impegno/Sub-Impegno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "A4561294-9CA7-4C63-B446-A566D0B217E0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 188, 204, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 232, 264, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, "Da");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 20, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, "Da");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DA, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DA, PPQRY_PARAMETRI167, "A.PARAMINIZIO", "PARAMINIZIO", 1, 49, 0, -13997);
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
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 192, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, "A");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_A, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_A, PPQRY_PARAMETRI167, "A.PARAMFINE", "PARAMFINE", 1, 49, 0, -13997);
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
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 300, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE2, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 20, 92, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI167, "A.PARAMDAL", "PARAMDAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 192, 92, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI167, "A.PARAMAL", "PARAMAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 112, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 300, 112, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE1, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, MyGlb.PANEL_LIST, "Cassa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, MyGlb.PANEL_FORM, 28, 136, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CASSA, MyGlb.PANEL_FORM, "Cassa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CASSA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CASSA, PPQRY_PARAMETRI167, "A.PARAMCASSA", "PARAMCASSA", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 28, 164, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI167, "A.PARAMUFFICIO", "PARAMUFFICIO", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_LIST, "Tt. p. Im. S. Imp.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_FORM, 88, 192, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_FORM, 204);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_FORM, "Totale per Impegno/Sub-Impegno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOTPERIMSUIM, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOTPERIMSUIM, PPQRY_PARAMETRI167, "A.PARAMTOTIMPS", "PARAMTOTIMPS", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOTPERIMSUIM, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOTPERIMSUIM, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 112, 220, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMETRI167, "A.PARADATAELAB", "PARADATAELAB", 6, 49, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T83CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T83DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T83 A ");
    SQL.append("where (A.CODICE = ~~PARAMCASSA~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMCASSA~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T83, 0, SQL, PFL_PARAMETRI_CASSA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T83CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T83DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T83 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T83, 1, SQL, PFL_PARAMETRI_CASSA, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T83, MainFrm.Cf4armDBObject.DB, 4);
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
    PAN_PARAMETRI.SetQuery(PPQRY_T54, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
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
    PAN_PARAMETRI.SetQuery(PPQRY_T54, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI167", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI167, IMDBDef15.PQRY_PARAMETRI167_RS, IMDBDef5.TBL_PARAMETRI172);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DA, IMDBDef5.FLD_PARAMETRI172_PARAMINIZIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_A, IMDBDef5.FLD_PARAMETRI172_PARAMFINE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef5.FLD_PARAMETRI172_PARAMDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI172_PARAMAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CASSA, IMDBDef5.FLD_PARAMETRI172_PARAMCASSA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI172_PARAMUFFICIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TOTPERIMSUIM, IMDBDef5.FLD_PARAMETRI172_PARAMTOTIMPS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef5.FLD_PARAMETRI172_PARADATAELAB);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI172");
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

  private void BUK_RITEPREVLIBR_MST_RITEPREVMAST_Init()
  {
    BUK_RITEPREVLIBR.InitMastro(BUK_RITEPREVLIBR_MST_RITEPREVMAST, 3, 21000, 29700, 1, 2, 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_MST_RITEPREVMAST, "EED39CA2-10A1-4DDB-82D9-0330B0DA262B");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_MST_RITEPREVMAST, "RITEPREVMAST");
    BUK_RITEPREVLIBR.InitMastroBox(BUK_RITEPREVLIBR_MST_RITEPREVMAST, BUK_RITEPREVLIBR_RPTBOX_DATAELABORAZ, 22100, 200, 3800, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_DATAELABORAZ, "615CCC26-DDE2-4B07-A96B-A6FFE621C31B");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_DATAELABORAZ, "DATAELABORAZ");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_DATAELABORAZ, BUK_RITEPREVLIBR_SPAN_DATAELABORAZ, MyGlb.VIS_NORMAA8RIGHT, 5, 103, 0, 271319169, "", "", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_DATAELABORAZ, "65DEE859-9C12-47DC-A496-2CC491037221");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_DATAELABORAZ, "DATAELABORAZ");
    BUK_RITEPREVLIBR.InitMastroBox(BUK_RITEPREVLIBR_MST_RITEPREVMAST, BUK_RITEPREVLIBR_RPTBOX_NUMEROPAGINA, 26000, 200, 2700, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_NUMEROPAGINA, "0F831111-3E62-4187-BB62-AE3C90E878F1");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_NUMEROPAGINA, BUK_RITEPREVLIBR_SPAN_CPTSRPLRPPND, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271384705, "", "", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_CPTSRPLRPPND, "D2EE9AB4-090C-411B-B59A-A0F761E1AC56");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_CPTSRPLRPPND, "CPTSRPLRPPND");
    BUK_RITEPREVLIBR.InitMastroBox(BUK_RITEPREVLIBR_MST_RITEPREVMAST, BUK_RITEPREVLIBR_RPTBOX_TESTATPAGINA, 1000, 1200, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Elenco Ritenute Previdenziali", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_TESTATPAGINA, "E2E1FFF8-AEF7-4DE8-A3E2-96A9F81545BB");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_TESTATPAGINA, BUK_RITEPREVLIBR_SPAN_UPTEPATOTICE, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_UPTEPATOTICE, "EB8AB26B-C891-40BE-A9B4-82FC1BA05A0C");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_UPTEPATOTICE, "UPTEPATOTICE");
    BUK_RITEPREVLIBR.InitMastroBox(BUK_RITEPREVLIBR_MST_RITEPREVMAST, BUK_RITEPREVLIBR_RPTBOX_SOTTTESTPAGI, 1000, 2300, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_SOTTTESTPAGI, "56E9E4E7-4D66-4C95-8702-EF6062A2F340");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_SOTTTESTPAGI, "SOTTTESTPAGI");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_SOTTTESTPAGI, BUK_RITEPREVLIBR_SPAN_IEPDRPPPARPP, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_IEPDRPPPARPP, "643E2C32-415E-4F1F-976C-789743CC3190");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_IEPDRPPPARPP, "IEPDRPPPARPP");
    BUK_RITEPREVLIBR.InitMastroBox(BUK_RITEPREVLIBR_MST_RITEPREVMAST, BUK_RITEPREVLIBR_RPTBOX_CORPOPAGINA, 1000, 3500, 27700, 16600, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_CORPOPAGINA, "7C670AE1-0887-4D5D-8D97-404DD962001E");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
  }

  private void BUK_RITEPREVLIBR_RPT_RITEPREVREPO_InitQuery() { BUK_RITEPREVLIBR_RPT_RITEPREVREPO_InitQuery(true, true); }
  private void BUK_RITEPREVLIBR_RPT_RITEPREVREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI167.PARAMTOTIMPS~~, 1, TO_CHAR ( A.NUMERO_IMP ) || '/' || TO_CHAR ( A.ANNO_IMP ) || '-' || TO_CHAR ( A.NUMERO_SUBIMP ) || '/' || TO_CHAR ( A.ANNO_SUBIMP ), '1') as RECRUGIMPSUB, ");
      SQL.append("  C.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
      SQL.append("  C.CODICE_FISCALE as RECBENCODFIS, ");
      SQL.append("  B.NUMERO_MAND as RECMANNUMMAN, ");
      SQL.append("  B.D_DATA_MAND as RECMANDDATMA, ");
      SQL.append("  A.IMPORTO as RECORLIQIMPO, ");
      SQL.append("  A.IMPONIBILE_INPS as RECLIQIMPINP, ");
      SQL.append("  A.ALIQUOTA_INPS as RECLIQALIINP, ");
      SQL.append("  A.RITENUTE_INPS as RECLIQRITINP, ");
      SQL.append("  A.RITENUTE_INPS_CE as RECLIQRIINCE, ");
      SQL.append("  TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP ) as IMPEGNO, ");
      SQL.append("  DECODE(A.ANNO_SUBIMP, to_number(NULL), NULL, TO_CHAR ( A.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMP )) as SUBIMPEGNO, ");
      SQL.append("  A.ANNO_IMP as RECLIQANNIMP, ");
      SQL.append("  A.NUMERO_IMP as RECLIQNUMIMP, ");
      SQL.append("  A.ANNO_SUBIMP as RECLIQANNSUB, ");
      SQL.append("  A.NUMERO_SUBIMP as RECLIQNUMSUB, ");
      SQL.append("  A.CASSA as RECORLIQCASS, ");
      SQL.append("  K.DESCRIZIONE as RECORT83DESC ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  MAN B, ");
      SQL.append("  BEN C, ");
      SQL.append("  T83 K ");
      SQL.append("where (A.BENEFICIARIO = C.CODICE(+)) ");
      SQL.append("and   (A.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (A.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append("and   ((B.D_DATA_MAND BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI167.PARAMINIZIO~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI167.PARAMFINE~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   ((A.NUMERO_MAND BETWEEN NVL(~~PQRY_PARAMETRI167.PARAMDAL~~, 1) AND NVL(~~PQRY_PARAMETRI167.PARAMAL~~, 99999))) ");
      SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(~~PQRY_PARAMETRI167.PARAMUFFICIO~~, -1, NVL(A.UFFICIO, -1), ~~PQRY_PARAMETRI167.PARAMUFFICIO~~)) ");
      SQL.append("and   ((NVL(A.CASSA, -1) = DECODE(~~PQRY_PARAMETRI167.PARAMCASSA~~, -1, NVL(A.CASSA, -1), ~~PQRY_PARAMETRI167.PARAMCASSA~~)) AND NOT ((A.CASSA IS NULL))) ");
      SQL.append("and   (B.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'M') ");
      SQL.append("and   (B.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(D.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN D ");
      SQL.append("where (D.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (D.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("and   (K.CODICE(+) = A.CASSA) ");
      SQL.append("UNION ALL ");
      SQL.append("select distinct ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI167.PARAMTOTIMPS~~, 1, TO_CHAR ( E.NUMERO_IMP ) || '/' || TO_CHAR ( E.ANNO_IMP ) || '-' || TO_CHAR ( E.NUMERO_SUBIMP ) || '/' || TO_CHAR ( E.ANNO_SUBIMP ), '1'), ");
      SQL.append("  G.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  G.CODICE_FISCALE, ");
      SQL.append("  F.NUMERO_MAND, ");
      SQL.append("  F.D_DATA_MAND, ");
      SQL.append("  E.IMPORTO, ");
      SQL.append("  E.IMPONIBILE_INPS, ");
      SQL.append("  E.ALIQUOTA_INPS, ");
      SQL.append("  E.RITENUTE_INPS, ");
      SQL.append("  E.RITENUTE_INPS_CE, ");
      SQL.append("  TO_CHAR ( E.NUMERO_IMP ) || ' / ' || TO_CHAR ( E.ANNO_IMP ), ");
      SQL.append("  DECODE(E.ANNO_SUBIMP, to_number(NULL), NULL, TO_CHAR ( E.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( E.ANNO_SUBIMP )), ");
      SQL.append("  E.ANNO_IMP, ");
      SQL.append("  E.NUMERO_IMP, ");
      SQL.append("  E.ANNO_SUBIMP, ");
      SQL.append("  E.NUMERO_SUBIMP, ");
      SQL.append("  E.CASSA, ");
      SQL.append("  J.DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  LIQ E, ");
      SQL.append("  MAN F, ");
      SQL.append("  BEN G, ");
      SQL.append("  PAGAMENTI H, ");
      SQL.append("  T83 J ");
      SQL.append("where (E.BENEFICIARIO = G.CODICE(+)) ");
      SQL.append("and   (E.ANNO_LIQ = H.ANNO_LIQ) ");
      SQL.append("and   (E.NUMERO_LIQ = H.NUMERO_LIQ) ");
      SQL.append("and   (E.ANNO_MAND = H.ANNO_MAND) ");
      SQL.append("and   (E.NUMERO_MAND = H.NUMERO_MAND) ");
      SQL.append("and   (E.ANNO_MAND = F.ANNO_MAND) ");
      SQL.append("and   (E.NUMERO_MAND = F.NUMERO_MAND) ");
      SQL.append("and   (E.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((E.NUMERO_MAND BETWEEN NVL(~~PQRY_PARAMETRI167.PARAMDAL~~, 1) AND NVL(~~PQRY_PARAMETRI167.PARAMAL~~, 99999))) ");
      SQL.append("and   (NVL(E.UFFICIO, -1) = DECODE(~~PQRY_PARAMETRI167.PARAMUFFICIO~~, -1, NVL(E.UFFICIO, -1), ~~PQRY_PARAMETRI167.PARAMUFFICIO~~)) ");
      SQL.append("and   ((NVL(E.CASSA, -1) = DECODE(~~PQRY_PARAMETRI167.PARAMCASSA~~, -1, NVL(E.CASSA, -1), ~~PQRY_PARAMETRI167.PARAMCASSA~~)) AND NOT ((E.CASSA IS NULL))) ");
      SQL.append("and   ((H.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(H.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(H.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   ((H.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI167.PARAMINIZIO~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI167.PARAMFINE~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
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
      SQL.append("and   (J.CODICE(+) = E.CASSA) ");
      SQL.append("order by 1, 5, 4 ");
      BUK_RITEPREVLIBR.SetReportQuery(BUK_RITEPREVLIBR_RPT_RITEPREVREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "284CBD6C-4638-48B3-B55A-9FB8BD953DB7");
      if (BUK_RITEPREVLIBR.FindObjByID(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR) != null)
        BUK_RITEPREVLIBR.AddReportGroup(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, "RECRUGIMPSUB");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_RITEPREVLIBR_RPT_RITEPREVREPO_Init()
  {
    BUK_RITEPREVLIBR.InitReport(BUK_RITEPREVLIBR_RPT_RITEPREVREPO, 196865);
    BUK_RITEPREVLIBR_RPT_RITEPREVREPO_InitQuery(true, false);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPT_RITEPREVREPO, "9245A123-8967-4F7B-AD73-BD6EB2F6E079");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPT_RITEPREVREPO, "RITEPREVREPO");
    BUK_RITEPREVLIBR.InitSection(BUK_RITEPREVLIBR_RPT_RITEPREVREPO, BUK_RITEPREVLIBR_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RITEPREVLIBR.SetSectionRendersInto(BUK_RITEPREVLIBR_SEC_INTESTREPORT, BUK_RITEPREVLIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SEC_INTESTREPORT, "6E55FA4C-EE77-4494-A9BB-F6282B742088");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_RITEPREVLIBR.InitSection(BUK_RITEPREVLIBR_RPT_RITEPREVREPO, BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, 1500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECRUGIMPSUB");
    BUK_RITEPREVLIBR.SetSectionRendersInto(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, "32C04C6E-DBB9-4696-8DEC-43EF7CD028B0");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, "RUGIMPSUINGR");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_BRSEEEEEEEEE, 100, 100, 5000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_BRSEEEEEEEEE, "541E55CA-6C14-4A17-ACBF-DEFFE2CCB65B");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_BRSEEEEEEEEE, "BRSEEEEEEEEE");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_BRSEEEEEEEEE, BUK_RITEPREVLIBR_SPAN_C2, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Ragione Sociale", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_C2, "2B844A3A-69C0-4622-9393-AD6D40A5E368");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_C2, "C2");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_BENCODFISHEA, 5200, 100, 3500, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_BENCODFISHEA, "5CAD18CC-E4A8-4B5E-BD14-31EA75E28169");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_BENCODFISHEA, "BENCODFISHEA");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_BENCODFISHEA, BUK_RITEPREVLIBR_SPAN_CODICEFISCAL, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice Fiscale", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_CODICEFISCAL, "4046DE63-A1EE-414A-BE38-A3AEE722D98E");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_CODICEFISCAL, "CODICEFISCAL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_MANDATHEADER, 8800, 100, 2800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_MANDATHEADER, "A0BA16BB-8B17-4BAD-AD52-5735B81A717D");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_MANDATHEADER, "MANDATHEADER");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_MANDATHEADER, BUK_RITEPREVLIBR_SPAN_MANDATO, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Mandato", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_MANDATO, "6E0C4BFA-44E5-44C5-BBF4-70D435C7095F");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_MANDATO, "MANDATO");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_NUMEMANDHEAD, 8800, 700, 900, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_NUMEMANDHEAD, "18CDFCE7-26F4-472F-8D02-6123F12A561F");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_NUMEMANDHEAD, "NUMEMANDHEAD");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_NUMEMANDHEAD, BUK_RITEPREVLIBR_SPAN_NRO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "N.ro", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_NRO, "D9883AA4-10A7-40AD-9117-7F536CD95111");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_NRO, "NRO");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_DDATAMANDHEA, 9800, 700, 1800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_DDATAMANDHEA, "B45AEBC6-534D-46AB-BD96-C85BE721B866");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_DDATAMANDHEA, "DDATAMANDHEA");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_DDATAMANDHEA, BUK_RITEPREVLIBR_SPAN_DATA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_DATA, "5C915762-8E42-4525-B86B-88BF71612658");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_DATA, "DATA");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_IMPEGNHEADER, 11700, 100, 2200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_IMPEGNHEADER, "42C6FA5A-5DE1-4B69-893D-6D1BE3A5102F");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_IMPEGNHEADER, "IMPEGNHEADER");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_IMPEGNHEADER, BUK_RITEPREVLIBR_SPAN_IMPEGNO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Impegno", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_IMPEGNO1, "1E9D83C6-09E7-4EEC-ABE5-29330E6FA4C2");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_IMPEGNO1, "IMPEGNO1");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_SUBIMPEGHEAD, 14000, 100, 2100, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_SUBIMPEGHEAD, "84364BDC-913C-46C1-8AAD-6DCEF70ACAF1");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_SUBIMPEGHEAD, "SUBIMPEGHEAD");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_SUBIMPEGHEAD, BUK_RITEPREVLIBR_SPAN_SUBIMPEGNO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Sub-Impegno", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_SUBIMPEGNO1, "CE616ECC-C785-42E3-9992-E88483C1B641");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_SUBIMPEGNO1, "SUBIMPEGNO1");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_IMPORTHEADER, 16200, 100, 2500, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_IMPORTHEADER, "D220022A-DB36-4E2C-806E-6C14D20EEA82");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_IMPORTHEADER, BUK_RITEPREVLIBR_SPAN_IMPORTO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_IMPORTO, "78A9A64A-EF49-4D43-B5F7-D92051709AD7");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_IMPORTO, "IMPORTO");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_LIQIMPINPHEA, 18800, 100, 2500, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_LIQIMPINPHEA, "5747058A-0169-402D-AD50-BA5A8090EC74");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_LIQIMPINPHEA, "LIQIMPINPHEA");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_LIQIMPINPHEA, BUK_RITEPREVLIBR_SPAN_IMPONIBILE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Imponibile", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_IMPONIBILE, "9D853DAF-DACF-455E-B4C5-2B10A8715B01");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_IMPONIBILE, "IMPONIBILE");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_LIQALIINPHEA, 21600, 100, 900, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_LIQALIINPHEA, "AF25244F-63AF-47AB-946E-8A33FF8F5AD5");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_LIQALIINPHEA, "LIQALIINPHEA");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_LIQALIINPHEA, BUK_RITEPREVLIBR_SPAN_ALIQ, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Aliq.", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_ALIQ, "36879478-96A3-4866-97B9-002E6581ECAD");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_ALIQ, "ALIQ");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_LIQRITINPHEA, 22600, 100, 2500, 1300, 0, 1, 1, MyGlb.VIS_INTSENBORCEN, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_LIQRITINPHEA, "91679D68-47A3-4971-B1F8-1B652F126552");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_LIQRITINPHEA, "LIQRITINPHEA");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_LIQRITINPHEA, BUK_RITEPREVLIBR_SPAN_RITACARIPERC, MyGlb.VIS_INTSENBORCEN, 0, 0, 0, 271384961, "", "Rit. a Carico Percipiente", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_RITACARIPERC, "02E69DC3-58B6-4492-A882-862B60ACD6D7");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_RITACARIPERC, "RITACARIPERC");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, BUK_RITEPREVLIBR_RPTBOX_RITEINPCEHEA, 25300, 100, 2300, 1300, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_RITEINPCEHEA, "64150D88-BD57-46EF-8888-DAB812516560");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_RITEINPCEHEA, "RITEINPCEHEA");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_RITEINPCEHEA, BUK_RITEPREVLIBR_SPAN_RITACARIENTE, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Rit. a Carico Ente", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_RITACARIENTE, "AEDD28A1-A201-4344-8EF6-89432F7E0D77");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_RITACARIENTE, "RITACARIENTE");
    BUK_RITEPREVLIBR.InitSection(BUK_RITEPREVLIBR_RPT_RITEPREVREPO, BUK_RITEPREVLIBR_SEC_DETTAGLIO, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RITEPREVLIBR.SetSectionRendersInto(BUK_RITEPREVLIBR_SEC_DETTAGLIO, BUK_RITEPREVLIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SEC_DETTAGLIO, "FD16EAD2-FD46-4F46-9814-FEB86053D564");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_DETTAGLIO, BUK_RITEPREVLIBR_RPTBOX_BERASOESESEE, 100, 0, 5000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_BERASOESESEE, "0838C0E0-EE2C-4863-A400-A35CADBA68F9");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_BERASOESESEE, "BERASOESESEE");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_BERASOESESEE, BUK_RITEPREVLIBR_SPAN_REBERSERPRPL, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "Brief description of field content.", "::REBERASOESES", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_REBERSERPRPL, "3B7B8D81-8F0E-4839-8247-6A6788C38009");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_REBERSERPRPL, "REBERSERPRPL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_DETTAGLIO, BUK_RITEPREVLIBR_RPTBOX_BENCODICFISC, 5200, 0, 3500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_BENCODICFISC, "CD642705-8986-43CA-A36F-418398C0214F");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_BENCODICFISC, "BENCODICFISC");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_BENCODICFISC, BUK_RITEPREVLIBR_SPAN_REBECOFRPRPL, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::RECBENCODFIS", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_REBECOFRPRPL, "85E9CD78-8777-412B-8290-F81D74A95075");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_REBECOFRPRPL, "REBECOFRPRPL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_DETTAGLIO, BUK_RITEPREVLIBR_RPTBOX_NUMEROMAND, 8800, 0, 900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_NUMEROMAND, "AAF41A61-9D05-4893-9A19-8F2BA3F66112");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_NUMEROMAND, "NUMEROMAND");
    BUK_RITEPREVLIBR.set_BoxAlignment(BUK_RITEPREVLIBR_RPTBOX_NUMEROMAND, 3);
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_NUMEROMAND, BUK_RITEPREVLIBR_SPAN_REMANUMRPRPL, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::RECMANNUMMAN", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_REMANUMRPRPL, "0CC38B1E-B057-474D-BF63-9A5A1CC06B57");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_REMANUMRPRPL, "REMANUMRPRPL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_DETTAGLIO, BUK_RITEPREVLIBR_RPTBOX_DDATAMAND, 9800, 0, 1800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_DDATAMAND, "998CFC07-2A3A-47A0-B43C-C038CC31A71E");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_DDATAMAND, "DDATAMAND");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_DDATAMAND, BUK_RITEPREVLIBR_SPAN_REMADDMRPRPL, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::RECMANDDATMA", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_REMADDMRPRPL, "63F2C5BB-DDFE-47CC-A1BE-BC1D2D9DD1C1");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_REMADDMRPRPL, "REMADDMRPRPL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_DETTAGLIO, BUK_RITEPREVLIBR_RPTBOX_IMPEGNO, 11700, 0, 2200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_IMPEGNO, "254EA6B7-8177-449D-A8E3-3ACD4C26683C");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_IMPEGNO, "IMPEGNO");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_IMPEGNO, BUK_RITEPREVLIBR_SPAN_REIMRIPRRIPL, MyGlb.VIS_DEFAREPOSTYL, 5, 201, 0, 271384705, "To String (LIQ NUMERO IMP) +c barra con spazi +c To String (LIQ ANNO IMP)", "::IMPEGNO", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_REIMRIPRRIPL, "419A3121-BF6C-4E62-9E94-F9F09DC541ED");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_REIMRIPRRIPL, "REIMRIPRRIPL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_DETTAGLIO, BUK_RITEPREVLIBR_RPTBOX_SUBIMPEGNO, 14000, 0, 2100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_SUBIMPEGNO, "05335D9C-3CDC-4D98-AE46-68A226A5DDAF");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_SUBIMPEGNO, "SUBIMPEGNO");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_SUBIMPEGNO, BUK_RITEPREVLIBR_SPAN_RESUIMRIPRPL, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "If Equal (LIQ ANNO SUBIMP, Null Number, Null String, To String (LIQ NUMERO SUBIMP) +c barra con spazi +c To String (LIQ ANNO SUBIMP))", "::SUBIMPEGNO", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_RESUIMRIPRPL, "22AD8F5C-BA2D-4207-A8D3-C15BF290F791");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_RESUIMRIPRPL, "RESUIMRIPRPL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_DETTAGLIO, BUK_RITEPREVLIBR_RPTBOX_LIQIMPONINPS, 18800, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_LIQIMPONINPS, "D2B03AC1-A9B9-4840-9AEB-D239600C4EB6");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_LIQIMPONINPS, "LIQIMPONINPS");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_LIQIMPONINPS, BUK_RITEPREVLIBR_SPAN_RELIIMIRPRPL, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECLIQIMPINP", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_RELIIMIRPRPL, "4C233B2A-AC7C-4A30-9AF0-D84EDF9CDF6F");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_RELIIMIRPRPL, "RELIIMIRPRPL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_DETTAGLIO, BUK_RITEPREVLIBR_RPTBOX_LIQALIQUINPS, 21400, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_LIQALIQUINPS, "F9F8B72C-0758-46C5-A098-C9082482B53E");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_LIQALIQUINPS, "LIQALIQUINPS");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_LIQALIQUINPS, BUK_RITEPREVLIBR_SPAN_RELIALIRPRPL, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "Brief description of field content.", "::RECLIQALIINP", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_RELIALIRPRPL, "D068CB62-FB45-4E2D-98FE-2F9C3CA3F15B");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_RELIALIRPRPL, "RELIALIRPRPL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_DETTAGLIO, BUK_RITEPREVLIBR_RPTBOX_LIQRITENINPS, 22600, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_LIQRITENINPS, "7C709B50-CD5B-44B7-A8A7-0E100FE2810E");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_LIQRITENINPS, "LIQRITENINPS");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_LIQRITENINPS, BUK_RITEPREVLIBR_SPAN_RELIRIIRPRPL, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECLIQRITINP", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_RELIRIIRPRPL, "F6F33FB4-97DA-4B59-A01A-F9FF7C2F525D");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_RELIRIIRPRPL, "RELIRIIRPRPL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_DETTAGLIO, BUK_RITEPREVLIBR_RPTBOX_IMPORTO, 16200, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_IMPORTO, "1850F9F1-2A8A-44A4-BD0A-537600F10B63");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_IMPORTO, "IMPORTO");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_IMPORTO, BUK_RITEPREVLIBR_SPAN_LIQIMPORTO, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "Brief description of field content.", "::RECORLIQIMPO", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_LIQIMPORTO, "3765DAC8-7CAE-42BB-B3C4-BBB872BD0CC6");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_LIQIMPORTO, "LIQIMPORTO");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_DETTAGLIO, BUK_RITEPREVLIBR_RPTBOX_RITENUINPSCE, 25200, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_RITENUINPSCE, "342AD2A0-DCCD-4363-A0AE-0118ABC8605C");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_RITENUINPSCE, "RITENUINPSCE");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_RITENUINPSCE, BUK_RITEPREVLIBR_SPAN_LIQRITEINPCE, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECLIQRIINCE", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_LIQRITEINPCE, "093AA803-C0F8-4C15-A3E4-A42B6520A01A");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_LIQRITEINPCE, "LIQRITEINPCE");
    BUK_RITEPREVLIBR.InitSection(BUK_RITEPREVLIBR_RPT_RITEPREVREPO, BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR, 800, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECRUGIMPSUB");
    BUK_RITEPREVLIBR.SetSectionRendersInto(BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR, BUK_RITEPREVLIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR, "FD7F315F-D159-4DF6-92CC-F571840F959F");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR, "RUGIMPSUPIGR");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR, BUK_RITEPREVLIBR_RPTBOX_LINEA1, 16200, 0, 11500, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_LINEA1, "63A7C2D0-3494-45C2-BBBC-5ABD33E3C9FB");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_LINEA1, "LINEA1");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR, BUK_RITEPREVLIBR_RPTBOX_TOTALEIMPEGN, 5400, 200, 10700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_TOTALEIMPEGN, "6FD41386-389A-4E3C-804E-D2F69803F952");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_TOTALEIMPEGN, "TOTALEIMPEGN");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_TOTALEIMPEGN, BUK_RITEPREVLIBR_SPAN_C1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Impegno", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_C1, "D05FEFC8-F2F4-461C-A2AA-8B9F38341B99");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_C1, "C1");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR, BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMS1, 18800, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMS1, "B3C0FB05-9F58-4E3B-8423-F2ED7EBCFC62");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMS1, "SUMOFLIQIMS1");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMS1, BUK_RITEPREVLIBR_SPAN_RISPGSRLIIRP, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_RISPGSRLIIRP, "6DB50DDB-7BE0-41A7-8A17-870F18092812");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_RISPGSRLIIRP, "RISPGSRLIIRP");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR, BUK_RITEPREVLIBR_RPTBOX_SUOFLIRISSC1, 22600, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_SUOFLIRISSC1, "05AE0FD9-64B5-471B-8F5C-12D539EBA18A");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_SUOFLIRISSC1, "SUOFLIRISSC1");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_SUOFLIRISSC1, BUK_RITEPREVLIBR_SPAN_RISPGSRLRIRP, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_RISPGSRLRIRP, "0175AFE6-42A1-4BF0-8E22-2CFB2DCBAA81");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_RISPGSRLRIRP, "RISPGSRLRIRP");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR, BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMP1, 16200, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMP1, "4E34C39A-2804-4207-A477-888BE6311ECB");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMP1, "SUMOFLIQIMP1");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMP1, BUK_RITEPREVLIBR_SPAN_RISPGSRLIRPR, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_RISPGSRLIRPR, "90651710-13B0-46D0-A41A-6B874AF6150D");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_RISPGSRLIRPR, "RISPGSRLIRPR");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_RUGIMPSUPIGR, BUK_RITEPREVLIBR_RPTBOX_SUOFLIRIINC1, 25200, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_SUOFLIRIINC1, "303E6012-D0BD-489F-9FB1-AE70A6FDD0CC");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_SUOFLIRIINC1, "SUOFLIRIINC1");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_SUOFLIRIINC1, BUK_RITEPREVLIBR_SPAN_RISPGSRLRICR, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_RISPGSRLRICR, "6567A5AA-1A80-4CA5-B623-72A06E6FABB5");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_RISPGSRLRICR, "RISPGSRLRICR");
    BUK_RITEPREVLIBR.InitSection(BUK_RITEPREVLIBR_RPT_RITEPREVREPO, BUK_RITEPREVLIBR_SEC_PIEDEREPORT, 800, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RITEPREVLIBR.SetSectionRendersInto(BUK_RITEPREVLIBR_SEC_PIEDEREPORT, BUK_RITEPREVLIBR_RPTBOX_CORPOPAGINA);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SEC_PIEDEREPORT, "F4BAF15B-67DD-4A20-82E7-CF80D463495F");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_PIEDEREPORT, BUK_RITEPREVLIBR_RPTBOX_LINEA, 16200, 0, 11500, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_LINEA, "BB833D7F-B34F-46C9-AD71-75616CD3EBCB");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_LINEA, "LINEA");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_PIEDEREPORT, BUK_RITEPREVLIBR_RPTBOX_TOTALEGENERA, 13200, 200, 2900, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_TOTALEGENERA, "38FDB546-F479-4DCB-8AB3-3C21F7CD726A");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_TOTALEGENERA, "TOTALEGENERA");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_TOTALEGENERA, BUK_RITEPREVLIBR_SPAN_C, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_C, "D949DB6D-D4C8-4363-BE32-4DCFD4AF11D8");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_C, "C");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_PIEDEREPORT, BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMSS, 18800, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMSS, "35675F71-55B9-4E13-B0D0-16F4EC32B3EF");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMSS, "SUMOFLIQIMSS");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMSS, BUK_RITEPREVLIBR_SPAN_PRSRLIIRPRPL, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_PRSRLIIRPRPL, "109FDAFE-C1B4-4B14-B902-647AD37D3D18");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_PRSRLIIRPRPL, "PRSRLIIRPRPL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_PIEDEREPORT, BUK_RITEPREVLIBR_RPTBOX_SUOFLIRISSCE, 22600, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_SUOFLIRISSCE, "F9492B24-781F-4AF2-B8F7-AC3D99DD3216");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_SUOFLIRISSCE, "SUOFLIRISSCE");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_SUOFLIRISSCE, BUK_RITEPREVLIBR_SPAN_PRSRLRIRPRPL, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_PRSRLRIRPRPL, "161FB5E5-F101-4F9C-8020-4B64DCB19FBE");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_PRSRLRIRPRPL, "PRSRLRIRPRPL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_PIEDEREPORT, BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMPO, 16200, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMPO, "CA385707-E47B-4FAC-B494-74F20237309C");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMPO, "SUMOFLIQIMPO");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_SUMOFLIQIMPO, BUK_RITEPREVLIBR_SPAN_PIRSRLIRPRPL, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_PIRSRLIRPRPL, "3A2619A8-0B95-4F2D-BF35-B7A58F989B15");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_PIRSRLIRPRPL, "PIRSRLIRPRPL");
    BUK_RITEPREVLIBR.InitReportBox(BUK_RITEPREVLIBR_SEC_PIEDEREPORT, BUK_RITEPREVLIBR_RPTBOX_SUOFLIRIINCE, 25200, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_RPTBOX_SUOFLIRIINCE, "323E28DD-8235-42E8-82A3-5AC78574475F");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_RPTBOX_SUOFLIRIINCE, "SUOFLIRIINCE");
    BUK_RITEPREVLIBR.InitBoxSpan(BUK_RITEPREVLIBR_RPTBOX_SUOFLIRIINCE, BUK_RITEPREVLIBR_SPAN_PRSRLRICRPRP, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEPREVLIBR.SetRTCGuid(BUK_RITEPREVLIBR_SPAN_PRSRLRICRPRP, "8B8D3533-ECF6-47F9-A111-3040057810F8");
    BUK_RITEPREVLIBR.SetObjCode(BUK_RITEPREVLIBR_SPAN_PRSRLRICRPRP, "PRSRLRICRPRP");
    BUK_RITEPREVLIBR.AddReportGroup(BUK_RITEPREVLIBR_SEC_RUGIMPSUINGR, "RECRUGIMPSUB");
    BUK_RITEPREVLIBR_RPT_RITEPREVREPO_InitQuery(false, true);
  }

  private void BUK_RITEPREVLIBR_InitLinks()
  {
    BUK_RITEPREVLIBR.SetBoxNextBox(BUK_RITEPREVLIBR_RPTBOX_CORPOPAGINA, BUK_RITEPREVLIBR_RPTBOX_CORPOPAGINA);
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
    if (SrcObj == BKW_RITEPREVLIBR) BUK_RITEPREVLIBR_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_RITEPREVLIBR) BUK_RITEPREVLIBR_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_RITEPREVLIBR) BUK_RITEPREVLIBR_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_RITEPREVLIBR) BUK_RITEPREVLIBR_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_RITEPREVLIBR) BUK_RITEPREVLIBR_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_RITEPREVLIBR) BUK_RITEPREVLIBR_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_RITEPREVLIBR) BUK_RITEPREVLIBR_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_RITEPREVLIBR) BUK_RITEPREVLIBR_OnPreview();
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
