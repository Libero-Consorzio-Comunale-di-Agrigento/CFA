// **********************************************
// Ritenute Irap
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RitenuteIrap extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PERIODO = 0;
  private static int GRP_PARAMETRI_MANDATI = 1;

  private static int PFL_PARAMETRI_ELABORA = 0;
  private static int PFL_PARAMETRI_DA = 1;
  private static int PFL_PARAMETRI_A = 2;
  private static int PFL_PARAMETRI_NEWPANELLAB1 = 3;
  private static int PFL_PARAMETRI_NEWPANELABE2 = 4;
  private static int PFL_PARAMETRI_DAL = 5;
  private static int PFL_PARAMETRI_AL = 6;
  private static int PFL_PARAMETRI_NEWPANELLABE = 7;
  private static int PFL_PARAMETRI_NEWPANELABE1 = 8;
  private static int PFL_PARAMETRI_UFFICIO = 9;
  private static int PFL_PARAMETRI_TOTPERIMSUIM = 10;
  private static int PFL_PARAMETRI_SUDDIPERCODI = 11;
  private static int PFL_PARAMETRI_DATAELABORAZ = 12;

  private static int PPQRY_PARAMETRI228 = 0;

  private static int PPQRY_T53 = 1;


  IDPanel PAN_PARAMETRI;
  CIDREObj BUK_RITEIRAPLIBR;
  OBook BKW_RITEIRAPLIBR;
  //
  // Template Pages constants
  private static int BUK_RITEIRAPLIBR_MST_RITEIRAPMAST = 1;
  private static int BUK_RITEIRAPLIBR_RPTBOX_DATAELABORA1 = 2;
  private static int BUK_RITEIRAPLIBR_SPAN_DATAELABORA1 = 3;
  private static int BUK_RITEIRAPLIBR_RPTBOX_NUMEROPAGIN1 = 4;
  private static int BUK_RITEIRAPLIBR_SPAN_CPTSRILRIPND = 5;
  private static int BUK_RITEIRAPLIBR_RPTBOX_TESTATPAGIN1 = 6;
  private static int BUK_RITEIRAPLIBR_SPAN_UPTEPATOTIC1 = 7;
  private static int BUK_RITEIRAPLIBR_RPTBOX_SOTTTESTPAG1 = 8;
  private static int BUK_RITEIRAPLIBR_SPAN_IEPDRIPPARI1 = 9;
  private static int BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1 = 10;

  //
  // Reports constants
  private static int BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO = 11;
  private static int BUK_RITEIRAPLIBR_SEC_INTESTREPORT = 12;
  private static int BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU = 13;
  private static int BUK_RITEIRAPLIBR_RPTBOX_T82DESCRIZIO = 14;
  private static int BUK_RITEIRAPLIBR_SPAN_RET8DERIRIL1 = 15;
  private static int BUK_RITEIRAPLIBR_RPTBOX_BRSEEEEEEEEE = 16;
  private static int BUK_RITEIRAPLIBR_SPAN_C = 17;
  private static int BUK_RITEIRAPLIBR_RPTBOX_BENCODFISHEA = 18;
  private static int BUK_RITEIRAPLIBR_SPAN_CODICEFISCAL = 19;
  private static int BUK_RITEIRAPLIBR_RPTBOX_MANDATHEADER = 20;
  private static int BUK_RITEIRAPLIBR_SPAN_MANDATO = 21;
  private static int BUK_RITEIRAPLIBR_RPTBOX_NUMEMANDHEAD = 22;
  private static int BUK_RITEIRAPLIBR_SPAN_NRO = 23;
  private static int BUK_RITEIRAPLIBR_RPTBOX_DDATAMANDHEA = 24;
  private static int BUK_RITEIRAPLIBR_SPAN_DATA = 25;
  private static int BUK_RITEIRAPLIBR_RPTBOX_IMPEGNHEADER = 26;
  private static int BUK_RITEIRAPLIBR_SPAN_IMPEGNO1 = 27;
  private static int BUK_RITEIRAPLIBR_RPTBOX_SUBIMPEGHEAD = 28;
  private static int BUK_RITEIRAPLIBR_SPAN_SUBIMPEGNO1 = 29;
  private static int BUK_RITEIRAPLIBR_RPTBOX_LIQIMPSSNHEA = 30;
  private static int BUK_RITEIRAPLIBR_SPAN_IMPONIBILE = 31;
  private static int BUK_RITEIRAPLIBR_RPTBOX_LIQALISSCEHE = 32;
  private static int BUK_RITEIRAPLIBR_SPAN_ALIQ = 33;
  private static int BUK_RITEIRAPLIBR_RPTBOX_LIQRITSSCEHE = 34;
  private static int BUK_RITEIRAPLIBR_SPAN_RITENUTE = 35;
  private static int BUK_RITEIRAPLIBR_SEC_RAGIMPINTGRU = 36;
  private static int BUK_RITEIRAPLIBR_SEC_DETTAGLIO = 37;
  private static int BUK_RITEIRAPLIBR_RPTBOX_BERASOESESE1 = 38;
  private static int BUK_RITEIRAPLIBR_SPAN_RBRSEERIRIL1 = 39;
  private static int BUK_RITEIRAPLIBR_RPTBOX_BENCODICFIS1 = 40;
  private static int BUK_RITEIRAPLIBR_SPAN_REBECFRIRIL1 = 41;
  private static int BUK_RITEIRAPLIBR_RPTBOX_NUMEROMAND1 = 42;
  private static int BUK_RITEIRAPLIBR_SPAN_REMANMRIRIL1 = 43;
  private static int BUK_RITEIRAPLIBR_RPTBOX_DDATAMAND1 = 44;
  private static int BUK_RITEIRAPLIBR_SPAN_REMDDMRIRIL1 = 45;
  private static int BUK_RITEIRAPLIBR_RPTBOX_IMPEGNO1 = 46;
  private static int BUK_RITEIRAPLIBR_SPAN_REIMRIIRRIL1 = 47;
  private static int BUK_RITEIRAPLIBR_RPTBOX_SUBIMPEGNO1 = 48;
  private static int BUK_RITEIRAPLIBR_SPAN_RESUIMRIRIL1 = 49;
  private static int BUK_RITEIRAPLIBR_RPTBOX_COMPRES1 = 50;
  private static int BUK_RITEIRAPLIBR_SPAN_IERLAIRIRIL1 = 51;
  private static int BUK_RITEIRAPLIBR_RPTBOX_LIQIMPONISS1 = 52;
  private static int BUK_RITEIRAPLIBR_SPAN_RELIISRIRIL1 = 53;
  private static int BUK_RITEIRAPLIBR_RPTBOX_LIQALIQSSNC1 = 54;
  private static int BUK_RITEIRAPLIBR_SPAN_RELASCRIRIL1 = 55;
  private static int BUK_RITEIRAPLIBR_RPTBOX_LIQRITESSNC1 = 56;
  private static int BUK_RITEIRAPLIBR_SPAN_RELRSCRIRIL1 = 57;
  private static int BUK_RITEIRAPLIBR_SEC_RAGIMPPIEGRU = 58;
  private static int BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMS1 = 59;
  private static int BUK_RITEIRAPLIBR_SPAN_RIPGSRLISRIR = 60;
  private static int BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSC1 = 61;
  private static int BUK_RITEIRAPLIBR_SPAN_RIPGSRLRSCRI = 62;
  private static int BUK_RITEIRAPLIBR_RPTBOX_TOTALEIMPEGN = 63;
  private static int BUK_RITEIRAPLIBR_SPAN_TOTALEIMPEGN = 64;
  private static int BUK_RITEIRAPLIBR_SEC_RAGSUDPIEGRU = 65;
  private static int BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMSS = 66;
  private static int BUK_RITEIRAPLIBR_SPAN_RSPGSRLISRIR = 67;
  private static int BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSCE = 68;
  private static int BUK_RITEIRAPLIBR_SPAN_RSPGSRLRSCRI = 69;
  private static int BUK_RITEIRAPLIBR_RPTBOX_TOTALECODICE = 70;
  private static int BUK_RITEIRAPLIBR_SPAN_TOTALECODICE = 71;
  private static int BUK_RITEIRAPLIBR_SEC_PIEDEREPORT = 72;
  private static int BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMS3 = 73;
  private static int BUK_RITEIRAPLIBR_SPAN_PRSRLISRIRIL = 74;
  private static int BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSC3 = 75;
  private static int BUK_RITEIRAPLIBR_SPAN_PRSRLRSCRIRI = 76;
  private static int BUK_RITEIRAPLIBR_RPTBOX_TOTALEGENER1 = 77;
  private static int BUK_RITEIRAPLIBR_SPAN_TOTALEGENER1 = 78;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI235(IMDB);
    //
    //
    Init_PQRY_PARAMETRI228(IMDB);
    Init_PQRY_PARAMETRI228_RS(IMDB);
    Init_PQRY_MAN11(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI235(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI235, 12);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI235, "TBL_PARAMETRI235");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMCASSA, "PARAMCASSA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMCASSA,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMESERCIZ,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARADATAELAB,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMDTARITE, "PARAMDTARITE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMDTARITE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMSUBIMPE, "PARAMSUBIMPE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMSUBIMPE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMTOTIMPS, "PARAMTOTIMPS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMTOTIMPS,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMSUDDIVI, "PARAMSUDDIVI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI235,IMDBDef5.FLD_PARAMETRI235_PARAMSUDDIVI,1,1,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI235, 0);
  }

  private static void Init_PQRY_PARAMETRI228(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI228, 8);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI228, "PQRY_PARAMETRI228");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARADATAELAB,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMTOTIMPS, "PARAMTOTIMPS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMTOTIMPS,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMSUDDIVI, "PARAMSUDDIVI");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228,IMDBDef15.PQSL_PARAMETRI228_PARAMSUDDIVI,1,1,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI228, 0);
  }

  private static void Init_PQRY_PARAMETRI228_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI228_RS, 8);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI228_RS, "PQRY_PARAMETRI228_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARADATAELAB,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMTOTIMPS, "PARAMTOTIMPS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMTOTIMPS,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMSUDDIVI, "PARAMSUDDIVI");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI228_RS,IMDBDef15.PQSL_PARAMETRI228_PARAMSUDDIVI,1,1,0);
  }

  private static void Init_PQRY_MAN11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_MAN11, 17);
    IMDB.set_TblCode(IMDBDef15.PQRY_MAN11, "PQRY_MAN11");
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECBENCODFIS, "RECBENCODFIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECBENCODFIS,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECMANNUMMAN, "RECMANNUMMAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECMANNUMMAN,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECMANDDATMA, "RECMANDDATMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECMANDDATMA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQIMPSSN, "RECLIQIMPSSN");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQIMPSSN,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQALSSCE, "RECLIQALSSCE");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQALSSCE,3,5,3);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQRISSCE, "RECLIQRISSCE");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQRISSCE,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_IMPEGNO, "IMPEGNO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_IMPEGNO,5,201,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_SUBIMPEGNO, "SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_SUBIMPEGNO,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQANNIMP, "RECLIQANNIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQNUMIMP, "RECLIQNUMIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQANNSUB, "RECLIQANNSUB");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQANNSUB,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQNUMSUB, "RECLIQNUMSUB");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQCODSSN, "RECLIQCODSSN");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECLIQCODSSN,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECORT82DESC, "RECORT82DESC");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECORT82DESC,5,30,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RAGGRUSUDDIV, "RAGGRUSUDDIV");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RAGGRUSUDDIV,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECORAGGIMPE, "RECORAGGIMPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_MAN11,IMDBDef15.PQSL_MAN11_RECORAGGIMPE,5,99,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_MAN11, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RitenuteIrap(MyWebEntryPoint w, IMDBObj imdb)
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
  public RitenuteIrap()
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
    FormIdx = MyGlb.FRM_RITENUTEIRAP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0408E656-392A-4E6B-B44D-D2813737AB28";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 360;
    DesignHeight = 346;
    set_Caption(new IDVariant("Ritenute Irap"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 360;
    Frames[1].Height = 320;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 320;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 360-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3EF54BD6-1DE9-4A93-8892-0C527B13F678");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1536, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    BKW_RITEIRAPLIBR = new OBook(this);
    BUK_RITEIRAPLIBR = new CIDREObj(BKW_RITEIRAPLIBR);
    BKW_RITEIRAPLIBR.iGuid = "84AEBF0E-5814-4372-8B37-EAD8A1D88A8E";
    BKW_RITEIRAPLIBR.Code = "BUK_RITEIRAPLIBR";
    BKW_RITEIRAPLIBR.BookObj = BUK_RITEIRAPLIBR;
    BKW_RITEIRAPLIBR.InitDefMasks();
    BUK_RITEIRAPLIBR.InitBook(1, 1245441, "Ritenute Irap Libro", IMDB, MainFrm.VisualStyleList);
    BUK_RITEIRAPLIBR.InitHTML();
    BUK_RITEIRAPLIBR.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_RITEIRAPLIBR.Book.SetMainFrm(MainFrm);
    BUK_RITEIRAPLIBR.SetRTCGuid(0, "84AEBF0E-5814-4372-8B37-EAD8A1D88A8E");
    BUK_RITEIRAPLIBR.SetObjCode(0, "RITEIRAPLIBR");
    BUK_RITEIRAPLIBR_MST_RITEIRAPMAST_Init();
    BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO_Init();
    BUK_RITEIRAPLIBR_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI235, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RITENUTEIRAP_PARAMETRI228();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_RITEIRAPLIBR.UpdateBook();
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
    if (Code.equals("BUK_RITEIRAPLIBR")) return BUK_RITEIRAPLIBR;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof RitenuteIrap);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RitenuteIrap.class.getName() : (Glb.ClassWithPackage(RitenuteIrap.class) ? RitenuteIrap.class.getName().substring(RitenuteIrap.class.getPackage().getName().length() + 1) : RitenuteIrap.class.getName()));
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
      BUK_RITEIRAPLIBR.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_RITEIRAPLIBR.RefreshQuery();
      BUK_RITEIRAPLIBR.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_RITEIRAPLIBR.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenuteIrap", "Elabora", _e);
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
      v_NOMECAPTION = (new IDVariant("Ritenute I.R.A.P", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      LOADEVENT_PARADELEROWS();
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMINIZIO, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMFINE, 0, (new IDVariant(12)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARADATAELAB, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMUFFICIO, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenuteIrap", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMCASSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMINIZIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMFINE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARADATAELAB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMDTARITE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMUFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMSUBIMPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMTOTIMPS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMSUDDIVI, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RITENUTEIRAP_PARAMETRI228() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI228_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI235, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI235, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI228_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI228_RS, 0, IMDBDef5.TBL_PARAMETRI235, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI228_RS, 0, 0, IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMINIZIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI228_RS, 1, 0, IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMFINE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI228_RS, 2, 0, IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI228_RS, 3, 0, IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI228_RS, 4, 0, IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMUFFICIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI228_RS, 5, 0, IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARADATAELAB, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI228_RS, 6, 0, IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMTOTIMPS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI228_RS, 7, 0, IMDBDef5.TBL_PARAMETRI235, IMDBDef5.FLD_PARAMETRI235_PARAMSUDDIVI, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI235, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI235, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI235, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI228_RS, 0);
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

  private void BUK_RITEIRAPLIBR_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_RITEIRAPLIBR_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_RITEIRAPLIBR_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU)
    {
    }
    if (SectionID==BUK_RITEIRAPLIBR_SEC_RAGIMPINTGRU)
    {
    }
    if (SectionID==BUK_RITEIRAPLIBR_SEC_DETTAGLIO)
    {
      BUK_RITEIRAPLIBR.set_SpanValue(BUK_RITEIRAPLIBR_SPAN_IERLAIRIRIL1, new IDVariant(((BUK_RITEIRAPLIBR.GetReportColumn(BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO, "RECLIQANNIMP").equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))?(new IDVariant("Competenza")):(new IDVariant("Residui")))));
    }
    if (SectionID==BUK_RITEIRAPLIBR_SEC_RAGIMPPIEGRU)
    {
      BUK_RITEIRAPLIBR.set_SpanValue(BUK_RITEIRAPLIBR_SPAN_RIPGSRLISRIR, new IDVariant(BUK_RITEIRAPLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEIRAPLIBR_SEC_RAGIMPPIEGRU,"RECLIQIMPSSN")));
      BUK_RITEIRAPLIBR.set_SpanValue(BUK_RITEIRAPLIBR_SPAN_RIPGSRLRSCRI, new IDVariant(BUK_RITEIRAPLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEIRAPLIBR_SEC_RAGIMPPIEGRU,"RECLIQRISSCE")));
    }
    if (SectionID==BUK_RITEIRAPLIBR_SEC_RAGSUDPIEGRU)
    {
      BUK_RITEIRAPLIBR.set_SpanValue(BUK_RITEIRAPLIBR_SPAN_RSPGSRLISRIR, new IDVariant(BUK_RITEIRAPLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEIRAPLIBR_SEC_RAGSUDPIEGRU,"RECLIQIMPSSN")));
      BUK_RITEIRAPLIBR.set_SpanValue(BUK_RITEIRAPLIBR_SPAN_RSPGSRLRSCRI, new IDVariant(BUK_RITEIRAPLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEIRAPLIBR_SEC_RAGSUDPIEGRU,"RECLIQRISSCE")));
    }
    if (SectionID==BUK_RITEIRAPLIBR_SEC_PIEDEREPORT)
    {
      BUK_RITEIRAPLIBR.set_SpanValue(BUK_RITEIRAPLIBR_SPAN_PRSRLISRIRIL, new IDVariant(BUK_RITEIRAPLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEIRAPLIBR_SEC_PIEDEREPORT,"RECLIQIMPSSN")));
      BUK_RITEIRAPLIBR.set_SpanValue(BUK_RITEIRAPLIBR_SPAN_PRSRLRSCRIRI, new IDVariant(BUK_RITEIRAPLIBR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITEIRAPLIBR_SEC_PIEDEREPORT,"RECLIQRISSCE")));
    }
  }

  private void BUK_RITEIRAPLIBR_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_RITEIRAPLIBR_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_RITEIRAPLIBR_MST_RITEIRAPMAST)
    {
      BUK_RITEIRAPLIBR.set_SpanValue(BUK_RITEIRAPLIBR_SPAN_DATAELABORA1, new IDVariant(IDL.Add(IDL.Add((new IDVariant("del")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARADATAELAB, 0)))));
      BUK_RITEIRAPLIBR.set_SpanValue(BUK_RITEIRAPLIBR_SPAN_CPTSRILRIPND, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_RITEIRAPLIBR.GetPageNumber())))), (new IDVariant(" di "))), IDL.ToString((new IDVariant(BUK_RITEIRAPLIBR.GetTotalPagesNumber()))))));
      BUK_RITEIRAPLIBR.set_SpanValue(BUK_RITEIRAPLIBR_SPAN_UPTEPATOTIC1, new IDVariant(IDL.Upper(IDL.Add((new IDVariant(BUK_RITEIRAPLIBR.BoxToolTip(BUK_RITEIRAPLIBR_RPTBOX_TESTATPAGIN1))), MainFrm.ESERCIZIO))));
      BUK_RITEIRAPLIBR.set_SpanValue(BUK_RITEIRAPLIBR_SPAN_IEPDRIPPARI1, new IDVariant(((IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals(IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0)))?IDL.Add(IDL.Add((new IDVariant("Mese di")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())):IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Da")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMINIZIO, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI228, IMDBDef15.PQSL_PARAMETRI228_PARAMFINE, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())))));
    }
  }

  private void BUK_RITEIRAPLIBR_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_RITEIRAPLIBR_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_RITEIRAPLIBR_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_RITEIRAPLIBR_OnPreview()
  {
    PreviewBook = BKW_RITEIRAPLIBR;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "7B9103A8-2278-43A3-9C0B-A3775AED8EFA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "Periodo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 16, 3, 288, 61, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 43);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "DD38600A-9682-4BCD-917A-376025469FCF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "Mandati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 16, 67, 288, 61, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 46);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "7579FB34-D31E-460F-94FB-70E16621463A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "E8918737-5663-42BE-B98E-26920788B751");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "Da");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "E4AED068-EEDA-465C-B89E-631F08B226CA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "A");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, "64CA89DC-42F1-4DA8-8689-0453F69392AB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "8EB43755-9526-4C9E-B846-3C3A98063892");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "67040303-55D5-4678-AE9A-6FAF4B9C3C09");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "985B5970-A749-41D4-BA59-D3B849FF4401");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "F4C42102-B203-4063-8741-F93D83921B30");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "1630FFC3-6A9F-4862-992B-392C3C3C9262");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "C98272B8-E02A-4F3E-955E-1E059D8F8CB6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, "08A0FCCA-2E8B-477A-B49C-D8ACE1E9C4AB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, "Totale per Impegno/Sub-Impegno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, "ECFFDC62-215D-4981-948E-BCEA3478EFFE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, "Suddivisione per Codice");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "755C394B-B870-4B15-96F7-64CB4DD95163");
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
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 224, 256, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, "Da");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 20, 28, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, "Da");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DA, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DA, PPQRY_PARAMETRI228, "A.PARAMINIZIO", "PARAMINIZIO", 1, 49, 0, -13997);
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
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 160, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, "A");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_A, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_A, PPQRY_PARAMETRI228, "A.PARAMFINE", "PARAMFINE", 1, 49, 0, -13997);
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
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 144, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 20, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLAB1, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 188, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 288, 44, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE2, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 20, 92, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI228, "A.PARAMDAL", "PARAMDAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 160, 92, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI228, "A.PARAMAL", "PARAMAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 84, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 20, 112, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLABE, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 112, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 288, 100, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE1, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 48, 136, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI228, "A.PARAMUFFICIO", "PARAMUFFICIO", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_LIST, "Tt. p. Im. S. Imp.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_FORM, 40, 160, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_FORM, 200);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERIMSUIM, MyGlb.PANEL_FORM, "Totale per Impegno Sub Impegno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOTPERIMSUIM, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOTPERIMSUIM, PPQRY_PARAMETRI228, "A.PARAMTOTIMPS", "PARAMTOTIMPS", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOTPERIMSUIM, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOTPERIMSUIM, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, MyGlb.PANEL_LIST, "Suddiv. per Codice");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, MyGlb.PANEL_FORM, 72, 184, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, MyGlb.PANEL_FORM, 168);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERCODI, MyGlb.PANEL_FORM, "Suddivisione per Codice");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SUDDIPERCODI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SUDDIPERCODI, PPQRY_PARAMETRI228, "A.PARAMSUDDIVI", "PARAMSUDDIVI", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUDDIPERCODI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUDDIPERCODI, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 64, 212, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMETRI228, "A.PARADATAELAB", "PARADATAELAB", 6, 49, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
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
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI228", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI228, IMDBDef15.PQRY_PARAMETRI228_RS, IMDBDef5.TBL_PARAMETRI235);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DA, IMDBDef5.FLD_PARAMETRI235_PARAMINIZIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_A, IMDBDef5.FLD_PARAMETRI235_PARAMFINE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef5.FLD_PARAMETRI235_PARAMDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI235_PARAMAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI235_PARAMUFFICIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TOTPERIMSUIM, IMDBDef5.FLD_PARAMETRI235_PARAMTOTIMPS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SUDDIPERCODI, IMDBDef5.FLD_PARAMETRI235_PARAMSUDDIVI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef5.FLD_PARAMETRI235_PARADATAELAB);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI235");
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

  private void BUK_RITEIRAPLIBR_MST_RITEIRAPMAST_Init()
  {
    BUK_RITEIRAPLIBR.InitMastro(BUK_RITEIRAPLIBR_MST_RITEIRAPMAST, 3, 21000, 29700, 1, 2, 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_MST_RITEIRAPMAST, "D4EC9B04-1B63-498F-87FD-2866E0504377");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_MST_RITEIRAPMAST, "RITEIRAPMAST");
    BUK_RITEIRAPLIBR.InitMastroBox(BUK_RITEIRAPLIBR_MST_RITEIRAPMAST, BUK_RITEIRAPLIBR_RPTBOX_DATAELABORA1, 22100, 200, 3800, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_DATAELABORA1, "A9A743BF-7341-451C-BF13-5DE970FB5253");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_DATAELABORA1, "DATAELABORA1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_DATAELABORA1, BUK_RITEIRAPLIBR_SPAN_DATAELABORA1, MyGlb.VIS_NORMAA8RIGHT, 5, 103, 0, 271319169, "", "", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_DATAELABORA1, "9A65996E-C508-4BCF-BC3E-AC8BC6F7CD08");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_DATAELABORA1, "DATAELABORA1");
    BUK_RITEIRAPLIBR.InitMastroBox(BUK_RITEIRAPLIBR_MST_RITEIRAPMAST, BUK_RITEIRAPLIBR_RPTBOX_NUMEROPAGIN1, 26000, 200, 2700, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_NUMEROPAGIN1, "84025A12-8723-4525-8830-EF117476B933");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_NUMEROPAGIN1, BUK_RITEIRAPLIBR_SPAN_CPTSRILRIPND, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271384705, "", "", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_CPTSRILRIPND, "6D6A419E-C103-470D-BA56-3E55A44690C7");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_CPTSRILRIPND, "CPTSRILRIPND");
    BUK_RITEIRAPLIBR.InitMastroBox(BUK_RITEIRAPLIBR_MST_RITEIRAPMAST, BUK_RITEIRAPLIBR_RPTBOX_TESTATPAGIN1, 1000, 1000, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Elenco Ritenute I.R.A.P. ", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_TESTATPAGIN1, "02D450B7-3647-4E0E-9B84-29CEE2F6B841");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_TESTATPAGIN1, "TESTATPAGIN1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_TESTATPAGIN1, BUK_RITEIRAPLIBR_SPAN_UPTEPATOTIC1, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_UPTEPATOTIC1, "8259709F-3CB3-4BDA-807F-CE2BD4A9EA49");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_UPTEPATOTIC1, "UPTEPATOTIC1");
    BUK_RITEIRAPLIBR.InitMastroBox(BUK_RITEIRAPLIBR_MST_RITEIRAPMAST, BUK_RITEIRAPLIBR_RPTBOX_SOTTTESTPAG1, 1000, 2100, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_SOTTTESTPAG1, "D629F1ED-97B0-47F6-AF4A-063F4D623336");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_SOTTTESTPAG1, "SOTTTESTPAG1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_SOTTTESTPAG1, BUK_RITEIRAPLIBR_SPAN_IEPDRIPPARI1, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_IEPDRIPPARI1, "6289A123-79DA-4B6C-8353-48F92EA7D87C");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_IEPDRIPPARI1, "IEPDRIPPARI1");
    BUK_RITEIRAPLIBR.InitMastroBox(BUK_RITEIRAPLIBR_MST_RITEIRAPMAST, BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1, 1000, 3300, 27700, 16900, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1, "C82A8FE3-0EAF-4DE5-9946-4D7BDF7158DC");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1, "CORPOPAGINA1");
  }

  private void BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO_InitQuery() { BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO_InitQuery(true, true); }
  private void BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  C.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
      SQL.append("  C.CODICE_FISCALE as RECBENCODFIS, ");
      SQL.append("  B.NUMERO_MAND as RECMANNUMMAN, ");
      SQL.append("  B.D_DATA_MAND as RECMANDDATMA, ");
      SQL.append("  A.IMPONIBILE_SSN as RECLIQIMPSSN, ");
      SQL.append("  A.ALIQ_SSN_CE as RECLIQALSSCE, ");
      SQL.append("  A.RITENUTE_SSN_CE as RECLIQRISSCE, ");
      SQL.append("  TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP ) as IMPEGNO, ");
      SQL.append("  DECODE(A.ANNO_SUBIMP, to_number(NULL), NULL, TO_CHAR ( A.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMP )) as SUBIMPEGNO, ");
      SQL.append("  A.ANNO_IMP as RECLIQANNIMP, ");
      SQL.append("  A.NUMERO_IMP as RECLIQNUMIMP, ");
      SQL.append("  A.ANNO_SUBIMP as RECLIQANNSUB, ");
      SQL.append("  A.NUMERO_SUBIMP as RECLIQNUMSUB, ");
      SQL.append("  A.CODICE_SSN as RECLIQCODSSN, ");
      SQL.append("  D.DESCRIZIONE as RECORT82DESC, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI228.PARAMSUDDIVI~~, 1, A.CODICE_SSN, 1) as RAGGRUSUDDIV, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI228.PARAMTOTIMPS~~, 1, TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP ) || DECODE(A.ANNO_SUBIMP, to_number(NULL), NULL, ' - ' || TO_CHAR ( A.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMP )), NULL) as RECORAGGIMPE ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  MAN B, ");
      SQL.append("  BEN C, ");
      SQL.append("  T82 D ");
      SQL.append("where (A.BENEFICIARIO = C.CODICE(+)) ");
      SQL.append("and   (A.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (A.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append("and   ((B.D_DATA_MAND BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI228.PARAMINIZIO~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI228.PARAMFINE~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   ((A.NUMERO_MAND BETWEEN NVL(~~PQRY_PARAMETRI228.PARAMDAL~~, 1) AND NVL(~~PQRY_PARAMETRI228.PARAMAL~~, 99999))) ");
      SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(~~PQRY_PARAMETRI228.PARAMUFFICIO~~, -1, NVL(A.UFFICIO, -1), ~~PQRY_PARAMETRI228.PARAMUFFICIO~~)) ");
      SQL.append("and   (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (NOT ((A.IMPONIBILE_SSN IS NULL))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'M') ");
      SQL.append("and   (A.CODICE_SSN(+) = D.CODICE) ");
      SQL.append("and   (B.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(E.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN E ");
      SQL.append("where (E.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (E.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("UNION ALL ");
      SQL.append("select ");
      SQL.append("  H.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  H.CODICE_FISCALE, ");
      SQL.append("  G.NUMERO_MAND, ");
      SQL.append("  G.D_DATA_MAND, ");
      SQL.append("  F.IMPONIBILE_SSN, ");
      SQL.append("  F.ALIQ_SSN_CE, ");
      SQL.append("  F.RITENUTE_SSN_CE, ");
      SQL.append("  TO_CHAR ( F.NUMERO_IMP ) || ' / ' || TO_CHAR ( F.ANNO_IMP ), ");
      SQL.append("  DECODE(F.ANNO_SUBIMP, to_number(NULL), NULL, TO_CHAR ( F.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( F.ANNO_SUBIMP )), ");
      SQL.append("  F.ANNO_IMP, ");
      SQL.append("  F.NUMERO_IMP, ");
      SQL.append("  F.ANNO_SUBIMP, ");
      SQL.append("  F.NUMERO_SUBIMP, ");
      SQL.append("  F.CODICE_SSN, ");
      SQL.append("  J.DESCRIZIONE, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI228.PARAMSUDDIVI~~, 1, F.CODICE_SSN, 1), ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI228.PARAMTOTIMPS~~, 1, TO_CHAR ( F.NUMERO_IMP ) || ' / ' || TO_CHAR ( F.ANNO_IMP ) || DECODE(F.ANNO_SUBIMP, to_number(NULL), NULL, ' - ' || TO_CHAR ( F.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( F.ANNO_SUBIMP )), NULL) ");
      SQL.append("from ");
      SQL.append("  LIQ F, ");
      SQL.append("  MAN G, ");
      SQL.append("  BEN H, ");
      SQL.append("  PAGAMENTI I, ");
      SQL.append("  T82 J ");
      SQL.append("where (F.BENEFICIARIO = H.CODICE(+)) ");
      SQL.append("and   (F.ANNO_MAND = G.ANNO_MAND) ");
      SQL.append("and   (F.NUMERO_MAND = G.NUMERO_MAND) ");
      SQL.append("and   (F.ANNO_LIQ = I.ANNO_LIQ) ");
      SQL.append("and   (F.NUMERO_LIQ = I.NUMERO_LIQ) ");
      SQL.append("and   (F.ANNO_MAND = I.ANNO_MAND) ");
      SQL.append("and   (F.NUMERO_MAND = I.NUMERO_MAND) ");
      SQL.append("and   (F.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((F.NUMERO_MAND BETWEEN NVL(~~PQRY_PARAMETRI228.PARAMDAL~~, 1) AND NVL(~~PQRY_PARAMETRI228.PARAMAL~~, 99999))) ");
      SQL.append("and   (NVL(F.UFFICIO, -1) = DECODE(~~PQRY_PARAMETRI228.PARAMUFFICIO~~, -1, NVL(F.UFFICIO, -1), ~~PQRY_PARAMETRI228.PARAMUFFICIO~~)) ");
      SQL.append("and   (NOT ((F.IMPONIBILE_SSN IS NULL))) ");
      SQL.append("and   ((I.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(I.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(I.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   ((I.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI228.PARAMINIZIO~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI228.PARAMFINE~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'P') ");
      SQL.append("and   (F.CODICE_SSN = J.CODICE(+)) ");
      SQL.append("and   (I.D_DATA_PAGAM = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(K.D_DATA_PAGAM) ");
      SQL.append("from ");
      SQL.append("  PAGAMENTI K ");
      SQL.append("where ((K.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(I.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(I.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (K.ANNO_LIQ = I.ANNO_LIQ) ");
      SQL.append("and   (K.NUMERO_LIQ = I.NUMERO_LIQ) ");
      SQL.append("and   (K.ANNO_MAND = I.ANNO_MAND) ");
      SQL.append("and   (K.NUMERO_MAND = I.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("order by 16, 17, 4, 3 ");
      BUK_RITEIRAPLIBR.SetReportQuery(BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "D3510826-F39D-4BB9-B5A9-4C6B2DDFA396");
      if (BUK_RITEIRAPLIBR.FindObjByID(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU) != null)
        BUK_RITEIRAPLIBR.AddReportGroup(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, "RAGGRUSUDDIV");
      if (BUK_RITEIRAPLIBR.FindObjByID(BUK_RITEIRAPLIBR_SEC_RAGIMPINTGRU) != null)
        BUK_RITEIRAPLIBR.AddReportGroup(BUK_RITEIRAPLIBR_SEC_RAGIMPINTGRU, "RECORAGGIMPE");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO_Init()
  {
    BUK_RITEIRAPLIBR.InitReport(BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO, 196865);
    BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO_InitQuery(true, false);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO, "B1AA98B2-9ED7-4E75-B91A-76FFC91A0D63");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO, "RITEIRAPREPO");
    BUK_RITEIRAPLIBR.InitSection(BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO, BUK_RITEIRAPLIBR_SEC_INTESTREPORT, 1000, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_RITEIRAPLIBR.SetSectionRendersInto(BUK_RITEIRAPLIBR_SEC_INTESTREPORT, BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SEC_INTESTREPORT, "91708B05-4B02-4C6F-A333-A1884A3C3821");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_RITEIRAPLIBR.InitSection(BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO, BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, 2000, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 9240577, "RAGGRUSUDDIV");
    BUK_RITEIRAPLIBR.SetSectionRendersInto(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, "E35B60B2-9E6F-4449-890A-9C544A6A40B8");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, "RAGSUDINTGRU");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, BUK_RITEIRAPLIBR_RPTBOX_T82DESCRIZIO, 0, 0, 17500, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_T82DESCRIZIO, "26837462-4A5B-48A5-BBDF-9D380B53864D");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_T82DESCRIZIO, "T82DESCRIZIO");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_T82DESCRIZIO, BUK_RITEIRAPLIBR_SPAN_RET8DERIRIL1, MyGlb.VIS_INTSENZABORD, 5, 30, 0, 271384705, "Brief description of field content.", "::RECORT82DESC", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_RET8DERIRIL1, "076F9B73-EAA7-4220-B545-042D719ECE90");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_RET8DERIRIL1, "RET8DERIRIL1");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, BUK_RITEIRAPLIBR_RPTBOX_BRSEEEEEEEEE, 0, 900, 6400, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_BRSEEEEEEEEE, "F5753225-DB33-4DEC-8EF2-1733ED181822");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_BRSEEEEEEEEE, "BRSEEEEEEEEE");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_BRSEEEEEEEEE, BUK_RITEIRAPLIBR_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Ragione Sociale", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_C, "BCD4C072-8506-42EC-9D71-144F0CE5C42E");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_C, "C");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, BUK_RITEIRAPLIBR_RPTBOX_BENCODFISHEA, 6500, 900, 3600, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_BENCODFISHEA, "A117AFCD-E1BC-4390-8C9F-9C0F698EE9EA");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_BENCODFISHEA, "BENCODFISHEA");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_BENCODFISHEA, BUK_RITEIRAPLIBR_SPAN_CODICEFISCAL, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice Fiscale", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_CODICEFISCAL, "8B8DAD5E-02C8-41F4-9447-DA856BD21ED0");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_CODICEFISCAL, "CODICEFISCAL");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, BUK_RITEIRAPLIBR_RPTBOX_MANDATHEADER, 10200, 900, 2800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_MANDATHEADER, "87CED723-21C0-48E7-8FE8-8BDC78C13E84");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_MANDATHEADER, "MANDATHEADER");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_MANDATHEADER, BUK_RITEIRAPLIBR_SPAN_MANDATO, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Mandato", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_MANDATO, "3078C816-A0A1-48EF-82EE-962717189C3D");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_MANDATO, "MANDATO");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, BUK_RITEIRAPLIBR_RPTBOX_NUMEMANDHEAD, 10200, 1500, 900, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_NUMEMANDHEAD, "3613762D-BB1C-4C22-BA40-05459621D9CC");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_NUMEMANDHEAD, "NUMEMANDHEAD");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_NUMEMANDHEAD, BUK_RITEIRAPLIBR_SPAN_NRO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "N.ro", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_NRO, "B4F8B419-B9DB-43F6-B3C7-CDDC80F544BB");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_NRO, "NRO");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, BUK_RITEIRAPLIBR_RPTBOX_DDATAMANDHEA, 11200, 1500, 1800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_DDATAMANDHEA, "56FEA766-260F-4485-90E6-60C61F142211");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_DDATAMANDHEA, "DDATAMANDHEA");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_DDATAMANDHEA, BUK_RITEIRAPLIBR_SPAN_DATA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_DATA, "432ACB04-8BED-4A83-A215-BF1CAF5C2478");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_DATA, "DATA");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, BUK_RITEIRAPLIBR_RPTBOX_IMPEGNHEADER, 13100, 900, 2200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_IMPEGNHEADER, "BE2B7F21-0811-4492-AC34-D98CB456C838");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_IMPEGNHEADER, "IMPEGNHEADER");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_IMPEGNHEADER, BUK_RITEIRAPLIBR_SPAN_IMPEGNO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Impegno", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_IMPEGNO1, "A8B08895-1709-4F80-BA22-348DD9E8E6D8");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_IMPEGNO1, "IMPEGNO1");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, BUK_RITEIRAPLIBR_RPTBOX_SUBIMPEGHEAD, 15400, 900, 2100, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_SUBIMPEGHEAD, "723F4E44-0BBD-4B59-ACC1-20AA932FEE11");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_SUBIMPEGHEAD, "SUBIMPEGHEAD");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_SUBIMPEGHEAD, BUK_RITEIRAPLIBR_SPAN_SUBIMPEGNO1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Sub-Impegno", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_SUBIMPEGNO1, "5E6F88EC-97EF-4E86-9025-4496C5ABA5C1");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_SUBIMPEGNO1, "SUBIMPEGNO1");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, BUK_RITEIRAPLIBR_RPTBOX_LIQIMPSSNHEA, 19900, 900, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_LIQIMPSSNHEA, "CE89B61B-9620-4B98-91C4-869FCB934F7D");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_LIQIMPSSNHEA, "LIQIMPSSNHEA");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_LIQIMPSSNHEA, BUK_RITEIRAPLIBR_SPAN_IMPONIBILE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Imponibile", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_IMPONIBILE, "56DFFB8A-7D3E-4173-9CF6-E397A2759372");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_IMPONIBILE, "IMPONIBILE");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, BUK_RITEIRAPLIBR_RPTBOX_LIQALISSCEHE, 23300, 900, 900, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_LIQALISSCEHE, "DF7A3C97-9910-48C9-84DA-DB821E6610AD");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_LIQALISSCEHE, "LIQALISSCEHE");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_LIQALISSCEHE, BUK_RITEIRAPLIBR_SPAN_ALIQ, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Aliq.", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_ALIQ, "D4F0A043-F7FB-4A4B-94E2-03A60E640C31");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_ALIQ, "ALIQ");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, BUK_RITEIRAPLIBR_RPTBOX_LIQRITSSCEHE, 24300, 900, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_LIQRITSSCEHE, "6AE66916-8DB6-43B7-A5E8-61BD10DE3F08");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_LIQRITSSCEHE, "LIQRITSSCEHE");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_LIQRITSSCEHE, BUK_RITEIRAPLIBR_SPAN_RITENUTE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ritenute", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_RITENUTE, "85E10D3B-20CE-4425-B3FE-6E44A3F263E3");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_RITENUTE, "RITENUTE");
    BUK_RITEIRAPLIBR.InitSection(BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO, BUK_RITEIRAPLIBR_SEC_RAGIMPINTGRU, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORAGGIMPE");
    BUK_RITEIRAPLIBR.SetSectionRendersInto(BUK_RITEIRAPLIBR_SEC_RAGIMPINTGRU, BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SEC_RAGIMPINTGRU, "F01B1F65-ED45-4D85-BA02-582186C391A4");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SEC_RAGIMPINTGRU, "RAGIMPINTGRU");
    BUK_RITEIRAPLIBR.InitSection(BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO, BUK_RITEIRAPLIBR_SEC_DETTAGLIO, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RITEIRAPLIBR.SetSectionRendersInto(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, "58A7316F-C98E-447F-95D7-6E38319969D8");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, BUK_RITEIRAPLIBR_RPTBOX_BERASOESESE1, 0, 0, 6400, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_BERASOESESE1, "54C7B57B-2217-4A71-8A02-00215DBEA063");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_BERASOESESE1, "BERASOESESE1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_BERASOESESE1, BUK_RITEIRAPLIBR_SPAN_RBRSEERIRIL1, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "Brief description of field content.", "::REBERASOESES", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_RBRSEERIRIL1, "F8676C0A-7094-4C8F-8CFD-280C788C40A8");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_RBRSEERIRIL1, "RBRSEERIRIL1");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, BUK_RITEIRAPLIBR_RPTBOX_BENCODICFIS1, 6500, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_BENCODICFIS1, "BE2BAFB1-053E-47C6-B1C9-0E85F69F90AF");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_BENCODICFIS1, "BENCODICFIS1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_BENCODICFIS1, BUK_RITEIRAPLIBR_SPAN_REBECFRIRIL1, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::RECBENCODFIS", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_REBECFRIRIL1, "EB562128-CBC4-418E-B3B9-0E89B814BD03");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_REBECFRIRIL1, "REBECFRIRIL1");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, BUK_RITEIRAPLIBR_RPTBOX_NUMEROMAND1, 10200, 0, 900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_NUMEROMAND1, "6A804C6C-B9FE-4B50-9827-E0C659F4F3B4");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_NUMEROMAND1, "NUMEROMAND1");
    BUK_RITEIRAPLIBR.set_BoxAlignment(BUK_RITEIRAPLIBR_RPTBOX_NUMEROMAND1, 3);
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_NUMEROMAND1, BUK_RITEIRAPLIBR_SPAN_REMANMRIRIL1, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::RECMANNUMMAN", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_REMANMRIRIL1, "B7FB1261-3D68-4DC3-BCED-B448C8275E34");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_REMANMRIRIL1, "REMANMRIRIL1");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, BUK_RITEIRAPLIBR_RPTBOX_DDATAMAND1, 11200, 0, 1800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_DDATAMAND1, "2F8CC312-C3CD-4AF4-B8CB-DE605E492945");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_DDATAMAND1, "DDATAMAND1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_DDATAMAND1, BUK_RITEIRAPLIBR_SPAN_REMDDMRIRIL1, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::RECMANDDATMA", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_REMDDMRIRIL1, "8CD6A40D-44C3-4D79-9DBB-E019CB834493");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_REMDDMRIRIL1, "REMDDMRIRIL1");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, BUK_RITEIRAPLIBR_RPTBOX_IMPEGNO1, 13100, 0, 2200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_IMPEGNO1, "753F530E-7495-4556-90F9-0D7C4F3141F4");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_IMPEGNO1, "IMPEGNO1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_IMPEGNO1, BUK_RITEIRAPLIBR_SPAN_REIMRIIRRIL1, MyGlb.VIS_DEFAREPOSTYL, 5, 201, 0, 271384705, "To String (LIQ NUMERO IMP) +c barra con spazi +c To String (LIQ ANNO IMP)", "::IMPEGNO", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_REIMRIIRRIL1, "AB0DDADC-AD18-4AC0-9C88-BE6D124FC422");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_REIMRIIRRIL1, "REIMRIIRRIL1");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, BUK_RITEIRAPLIBR_RPTBOX_SUBIMPEGNO1, 15400, 0, 2100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_SUBIMPEGNO1, "246FEFE5-D9CF-4418-B881-758F393421FB");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_SUBIMPEGNO1, "SUBIMPEGNO1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_SUBIMPEGNO1, BUK_RITEIRAPLIBR_SPAN_RESUIMRIRIL1, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "If Equal (LIQ ANNO SUBIMP, Null Number, Null String, To String (LIQ NUMERO SUBIMP) +c barra con spazi +c To String (LIQ ANNO SUBIMP))", "::SUBIMPEGNO", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_RESUIMRIRIL1, "04485400-2567-404C-BCEB-D7A1A00C4E4F");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_RESUIMRIRIL1, "RESUIMRIRIL1");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, BUK_RITEIRAPLIBR_RPTBOX_COMPRES1, 17600, 0, 2200, 500, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_COMPRES1, "EFECC31A-4F79-4A90-8622-D84405E6DAF8");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_COMPRES1, "COMPRES1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_COMPRES1, BUK_RITEIRAPLIBR_SPAN_IERLAIRIRIL1, MyGlb.VIS_NORMAA8RIGHT, 5, 99, 0, 271384705, "", "", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_IERLAIRIRIL1, "9E9E2BF3-F28B-4393-A1FE-225B13558563");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_IERLAIRIRIL1, "IERLAIRIRIL1");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, BUK_RITEIRAPLIBR_RPTBOX_LIQIMPONISS1, 19900, 0, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_LIQIMPONISS1, "3CE6BF0D-D611-49A1-8857-61BA9BA48D9B");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_LIQIMPONISS1, "LIQIMPONISS1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_LIQIMPONISS1, BUK_RITEIRAPLIBR_SPAN_RELIISRIRIL1, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECLIQIMPSSN", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_RELIISRIRIL1, "D3E39AD2-CC24-4CEA-97A6-975455CBF087");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_RELIISRIRIL1, "RELIISRIRIL1");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, BUK_RITEIRAPLIBR_RPTBOX_LIQALIQSSNC1, 23100, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_LIQALIQSSNC1, "5CFB8954-0F84-4528-A66D-F9A278A20604");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_LIQALIQSSNC1, "LIQALIQSSNC1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_LIQALIQSSNC1, BUK_RITEIRAPLIBR_SPAN_RELASCRIRIL1, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "Brief description of field content.", "::RECLIQALSSCE", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_RELASCRIRIL1, "8199ED62-F511-4E5F-86C6-7CD1C53727FB");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_RELASCRIRIL1, "RELASCRIRIL1");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_DETTAGLIO, BUK_RITEIRAPLIBR_RPTBOX_LIQRITESSNC1, 24300, 0, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_LIQRITESSNC1, "BA358F39-6B2C-420C-A738-518ED759EC64");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_LIQRITESSNC1, "LIQRITESSNC1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_LIQRITESSNC1, BUK_RITEIRAPLIBR_SPAN_RELRSCRIRIL1, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECLIQRISSCE", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_RELRSCRIRIL1, "E1F68121-CAA7-40EB-96CE-7985F4E6E847");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_RELRSCRIRIL1, "RELRSCRIRIL1");
    BUK_RITEIRAPLIBR.InitSection(BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO, BUK_RITEIRAPLIBR_SEC_RAGIMPPIEGRU, 800, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORAGGIMPE");
    BUK_RITEIRAPLIBR.SetSectionRendersInto(BUK_RITEIRAPLIBR_SEC_RAGIMPPIEGRU, BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SEC_RAGIMPPIEGRU, "0BFA4F77-4562-4337-8D85-83AB381F1980");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SEC_RAGIMPPIEGRU, "RAGIMPPIEGRU");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGIMPPIEGRU, BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMS1, 19900, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMS1, "26E0CFAF-DBF0-49BC-BC5F-A23B9824328B");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMS1, "SUMOFLIQIMS1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMS1, BUK_RITEIRAPLIBR_SPAN_RIPGSRLISRIR, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_RIPGSRLISRIR, "FDBFF265-74E4-44D1-9A69-B69A009858E7");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_RIPGSRLISRIR, "RIPGSRLISRIR");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGIMPPIEGRU, BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSC1, 24300, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSC1, "8CD5CD23-D325-4A8E-AA79-3602A031CE7A");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSC1, "SUOFLIRISSC1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSC1, BUK_RITEIRAPLIBR_SPAN_RIPGSRLRSCRI, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_RIPGSRLRSCRI, "C2667BA2-1ACD-4ACA-BE18-82014ECD7BFB");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_RIPGSRLRSCRI, "RIPGSRLRSCRI");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGIMPPIEGRU, BUK_RITEIRAPLIBR_RPTBOX_TOTALEIMPEGN, 16500, 100, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_TOTALEIMPEGN, "E790A990-452E-485C-875D-6AE952F5416F");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_TOTALEIMPEGN, "TOTALEIMPEGN");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_TOTALEIMPEGN, BUK_RITEIRAPLIBR_SPAN_TOTALEIMPEGN, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Impegno", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_TOTALEIMPEGN, "9BF529CF-0459-48C6-949E-C89822E8F699");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_TOTALEIMPEGN, "TOTALEIMPEGN");
    BUK_RITEIRAPLIBR.InitSection(BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO, BUK_RITEIRAPLIBR_SEC_RAGSUDPIEGRU, 700, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RAGGRUSUDDIV");
    BUK_RITEIRAPLIBR.SetSectionRendersInto(BUK_RITEIRAPLIBR_SEC_RAGSUDPIEGRU, BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SEC_RAGSUDPIEGRU, "3888EFFC-233B-40C8-B142-69ACB61C95E4");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SEC_RAGSUDPIEGRU, "RAGSUDPIEGRU");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDPIEGRU, BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMSS, 19900, 0, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMSS, "0150D890-073E-4F92-9D0C-8C79B017228E");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMSS, "SUMOFLIQIMSS");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMSS, BUK_RITEIRAPLIBR_SPAN_RSPGSRLISRIR, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_RSPGSRLISRIR, "C604E067-AA22-458B-9A0F-5BD65F1BA419");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_RSPGSRLISRIR, "RSPGSRLISRIR");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDPIEGRU, BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSCE, 24300, 0, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSCE, "3D302ED6-75C5-4433-986C-C84F84ED0927");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSCE, "SUOFLIRISSCE");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSCE, BUK_RITEIRAPLIBR_SPAN_RSPGSRLRSCRI, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_RSPGSRLRSCRI, "E2FF305B-4A13-4F70-992A-112E297C7DB6");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_RSPGSRLRSCRI, "RSPGSRLRSCRI");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_RAGSUDPIEGRU, BUK_RITEIRAPLIBR_RPTBOX_TOTALECODICE, 16500, 100, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_TOTALECODICE, "58569207-F8D5-4360-A2CB-98207150A6F1");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_TOTALECODICE, "TOTALECODICE");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_TOTALECODICE, BUK_RITEIRAPLIBR_SPAN_TOTALECODICE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Codice", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_TOTALECODICE, "64B12DB0-E910-40C7-90BE-71D4A6304396");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_TOTALECODICE, "TOTALECODICE");
    BUK_RITEIRAPLIBR.InitSection(BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO, BUK_RITEIRAPLIBR_SEC_PIEDEREPORT, 800, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RITEIRAPLIBR.SetSectionRendersInto(BUK_RITEIRAPLIBR_SEC_PIEDEREPORT, BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SEC_PIEDEREPORT, "29DDF3C1-7E0E-45AE-93A0-C97B4C0E01DE");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_PIEDEREPORT, BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMS3, 19900, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMS3, "AA988048-C976-4D10-B2E0-7AB1B831B0BE");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMS3, "SUMOFLIQIMS3");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_SUMOFLIQIMS3, BUK_RITEIRAPLIBR_SPAN_PRSRLISRIRIL, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_PRSRLISRIRIL, "007B86F5-0F75-468C-9764-A6B1AD58944C");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_PRSRLISRIRIL, "PRSRLISRIRIL");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_PIEDEREPORT, BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSC3, 24300, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSC3, "29D33B33-DDF3-42AD-A1C9-6BC3E0904B46");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSC3, "SUOFLIRISSC3");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_SUOFLIRISSC3, BUK_RITEIRAPLIBR_SPAN_PRSRLRSCRIRI, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_PRSRLRSCRIRI, "100AD130-1E09-47BE-BFB4-95682F86C666");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_PRSRLRSCRIRI, "PRSRLRSCRIRI");
    BUK_RITEIRAPLIBR.InitReportBox(BUK_RITEIRAPLIBR_SEC_PIEDEREPORT, BUK_RITEIRAPLIBR_RPTBOX_TOTALEGENER1, 16500, 100, 3200, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_RPTBOX_TOTALEGENER1, "8BC8F730-B5BE-436D-9612-0C5221B69D70");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_RPTBOX_TOTALEGENER1, "TOTALEGENER1");
    BUK_RITEIRAPLIBR.InitBoxSpan(BUK_RITEIRAPLIBR_RPTBOX_TOTALEGENER1, BUK_RITEIRAPLIBR_SPAN_TOTALEGENER1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Generale", 1);
    BUK_RITEIRAPLIBR.SetRTCGuid(BUK_RITEIRAPLIBR_SPAN_TOTALEGENER1, "8BDAE596-C17A-4D52-985B-717076EFA1D5");
    BUK_RITEIRAPLIBR.SetObjCode(BUK_RITEIRAPLIBR_SPAN_TOTALEGENER1, "TOTALEGENER1");
    BUK_RITEIRAPLIBR.AddReportGroup(BUK_RITEIRAPLIBR_SEC_RAGSUDINTGRU, "RAGGRUSUDDIV");
    BUK_RITEIRAPLIBR.AddReportGroup(BUK_RITEIRAPLIBR_SEC_RAGIMPINTGRU, "RECORAGGIMPE");
    BUK_RITEIRAPLIBR_RPT_RITEIRAPREPO_InitQuery(false, true);
  }

  private void BUK_RITEIRAPLIBR_InitLinks()
  {
    BUK_RITEIRAPLIBR.SetBoxNextBox(BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1, BUK_RITEIRAPLIBR_RPTBOX_CORPOPAGINA1);
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
    if (SrcObj == BKW_RITEIRAPLIBR) BUK_RITEIRAPLIBR_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_RITEIRAPLIBR) BUK_RITEIRAPLIBR_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_RITEIRAPLIBR) BUK_RITEIRAPLIBR_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_RITEIRAPLIBR) BUK_RITEIRAPLIBR_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_RITEIRAPLIBR) BUK_RITEIRAPLIBR_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_RITEIRAPLIBR) BUK_RITEIRAPLIBR_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_RITEIRAPLIBR) BUK_RITEIRAPLIBR_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_RITEIRAPLIBR) BUK_RITEIRAPLIBR_OnPreview();
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
