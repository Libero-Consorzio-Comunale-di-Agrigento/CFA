// **********************************************
// Conferma Avvisi Di Pagamento Ancona
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ConfermaAvvisiDiPagamentoAncona extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMESTAMPA_ETICHETINVIA = 0;
  private static int PFL_PARAMESTAMPA_ETICVERRINVI = 1;

  private static int PPQRY_PARAMESTAM22 = 0;


  IDPanel PAN_PARAMESTAMPA;
  CIDREObj BUK_AVVDIPAGBOAN;
  OBook BKW_AVVDIPAGBOAN;
  //
  // Template Pages constants
  private static int BUK_AVVDIPAGBOAN_MST_AVVIDIPAGPAG = 1;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_NUMEROPAGIN1 = 2;
  private static int BUK_AVVDIPAGBOAN_SPAN_NUMEROPAGIN1 = 3;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_PAGEHEADER1 = 4;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1 = 5;

  //
  // Reports constants
  private static int BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP = 6;
  private static int BUK_AVVDIPAGBOAN_SEC_REPORTHEADER = 7;
  private static int BUK_AVVDIPAGBOAN_SEC_PAGEHEADER = 8;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_LOGO = 9;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_INDIRIZZO = 10;
  private static int BUK_AVVDIPAGBOAN_SPAN_DATIENTEINDI = 11;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_COMUNE = 12;
  private static int BUK_AVVDIPAGBOAN_SPAN_COMUNE = 13;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_OGGETTO = 14;
  private static int BUK_AVVDIPAGBOAN_SPAN_OGAVDIPAVOCO = 15;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_DATA = 16;
  private static int BUK_AVVDIPAGBOAN_SPAN_DECTSPDAADPP = 17;
  private static int BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA = 18;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_SPETTABILE = 19;
  private static int BUK_AVVDIPAGBOAN_SPAN_SPETTLE = 20;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BERASOESESE1 = 21;
  private static int BUK_AVVDIPAGBOAN_SPAN_RBRSEECADPAA = 22;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BENINDIRIZZO = 23;
  private static int BUK_AVVDIPAGBOAN_SPAN_RBICADPAADPB = 24;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_CITTABENEFIC = 25;
  private static int BUK_AVVDIPAGBOAN_SPAN_RCBCADPAADPB = 26;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO1 = 27;
  private static int BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO1 = 28;
  private static int BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE1 = 29;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO2 = 30;
  private static int BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO2 = 31;
  private static int BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE2 = 32;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO3 = 33;
  private static int BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO3 = 34;
  private static int BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE3 = 35;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_MANDATHEADER = 36;
  private static int BUK_AVVDIPAGBOAN_SPAN_MANDATO = 37;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_MODADIPAGHEA = 38;
  private static int BUK_AVVDIPAGBOAN_SPAN_MODALDIPAGAM = 39;
  private static int BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE4 = 40;
  private static int BUK_AVVDIPAGBOAN_SEC_DETAIL = 41;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_MANDATO = 42;
  private static int BUK_AVVDIPAGBOAN_SPAN_REMCADPAADPB = 43;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDOMANDATO = 44;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_QUIETANZA = 45;
  private static int BUK_AVVDIPAGBOAN_SPAN_REQCADPAADPB = 46;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDOQUIETAN = 47;
  private static int BUK_AVVDIPAGBOAN_SEC_DETAILBANCA = 48;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_QTNDESBANCA = 49;
  private static int BUK_AVVDIPAGBOAN_SPAN_RQDBCADPAADP = 50;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDBANC = 51;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEBANC = 52;
  private static int BUK_AVVDIPAGBOAN_SEC_DETAILINTEST = 53;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_INTESTATARIO = 54;
  private static int BUK_AVVDIPAGBOAN_SPAN_REICADPAADPB = 55;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDINTE = 56;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEINTE = 57;
  private static int BUK_AVVDIPAGBOAN_SEC_DETAILQUIETA = 58;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_QUIETANZANTE = 59;
  private static int BUK_AVVDIPAGBOAN_SPAN_CQRBRSEQCADP = 60;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDQUIE = 61;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEQUIE = 62;
  private static int BUK_AVVDIPAGBOAN_SEC_GRUBENGROFOO = 63;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDOINFERI1 = 64;
  private static int BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO1 = 65;
  private static int BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO2 = 66;
  private static int BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO3 = 67;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_ELENCOLIQUID = 68;
  private static int BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO4 = 69;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_FIRMABITMAP = 70;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_STAMPAFIRMA1 = 71;
  private static int BUK_AVVDIPAGBOAN_SPAN_STAMPAFIRMA1 = 72;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_STAMPAFIRMA2 = 73;
  private static int BUK_AVVDIPAGBOAN_SPAN_STAMPAFIRMA2 = 74;
  private static int BUK_AVVDIPAGBOAN_SEC_PAGEFOOTER = 75;
  private static int BUK_AVVDIPAGBOAN_SEC_REPORTFOOTER = 76;
  private static int BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO = 77;
  private static int BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU = 78;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_CAUSALHEADER = 79;
  private static int BUK_AVVDIPAGBOAN_SPAN_CAUSALE = 80;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_IMPORTHEADER = 81;
  private static int BUK_AVVDIPAGBOAN_SPAN_FATIMPORTO = 82;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_SALDOHEADER = 83;
  private static int BUK_AVVDIPAGBOAN_SPAN_C1 = 84;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_RITENUHEADER = 85;
  private static int BUK_AVVDIPAGBOAN_SPAN_RITENUTE = 86;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_NETTOHEADER = 87;
  private static int BUK_AVVDIPAGBOAN_SPAN_NETTO = 88;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_IMPOIVA1HEA1 = 89;
  private static int BUK_AVVDIPAGBOAN_SPAN_C = 90;
  private static int BUK_AVVDIPAGBOAN_SEC_DETAILLIQ = 91;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_CAUSALE = 92;
  private static int BUK_AVVDIPAGBOAN_SPAN_IEPPFRCFCADP = 93;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDOCAUSLIQ = 94;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_IMPORTO1 = 95;
  private static int BUK_AVVDIPAGBOAN_SPAN_RFICADPAADPB = 96;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_SALDO = 97;
  private static int BUK_AVVDIPAGBOAN_SPAN_RLICADPAADPB = 98;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDOSALDLIQ = 99;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_RITENUTE = 100;
  private static int BUK_AVVDIPAGBOAN_SPAN_RLRCADPAADPB = 101;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDORITELIQ = 102;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_NETTO = 103;
  private static int BUK_AVVDIPAGBOAN_SPAN_RENCADPAADPB = 104;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDONETTLIQ = 105;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_IMPORTOIVA = 106;
  private static int BUK_AVVDIPAGBOAN_SPAN_RLIICADPAADP = 107;
  private static int BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ = 108;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_ELENCORETTIF = 109;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDOCAUSRET = 110;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDOIMPORET = 111;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDOSALDRET = 112;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDORITERET = 113;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDONETTRET = 114;
  private static int BUK_AVVDIPAGBOAN_SEC_NUOESPPIEGRU = 115;
  private static int BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ = 116;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDOSUPERIO = 117;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_DOPPBORDSUPE = 118;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFCAU = 119;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_TOTALELABEL = 120;
  private static int BUK_AVVDIPAGBOAN_SPAN_TOTALE = 121;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFIMP = 122;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQIMPO = 123;
  private static int BUK_AVVDIPAGBOAN_SPAN_PFLSRLICADPA = 124;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFRIT = 125;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQRITE = 126;
  private static int BUK_AVVDIPAGBOAN_SPAN_PFLSRLRCADPA = 127;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFNET = 128;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_SUMOFNETTO = 129;
  private static int BUK_AVVDIPAGBOAN_SPAN_PFLSRNCADPAA = 130;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORDOINFERIO = 131;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQIMIV = 132;
  private static int BUK_AVVDIPAGBOAN_SPAN_PFLSRLIICADP = 133;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_BORSUMOFIMIV = 134;
  private static int BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO = 135;
  private static int BUK_AVVDIPAGBOAN_SEC_DETAILRETTIF = 136;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_RETTIFICA = 137;
  private static int BUK_AVVDIPAGBOAN_SPAN_RERCADPAADPB = 138;
  private static int BUK_AVVDIPAGBOAN_RPTBOX_IMPORTO = 139;
  private static int BUK_AVVDIPAGBOAN_SPAN_RETFATIMPORT = 140;


  // Definition of Global Variables
  private IDVariant IMMAGINE = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMESTAMPA(IMDB);
    //
    //
    Init_PQRY_MAN9(IMDB);
    Init_PQRY_LIQ54(IMDB);
    Init_PQRY_RETFAT5(IMDB);
    Init_PQRY_PARAMESTAM22(IMDB);
    Init_PQRY_PARAMESTAM22_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMESTAMPA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMESTAMPA, 17);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMESTAMPA, "TBL_PARAMESTAMPA");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPATESTO1, "STAMPATESTO1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPATESTO1,9,2000,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMGRASTES1, "STAMGRASTES1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMGRASTES1,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMCORSTES1, "STAMCORSTES1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMCORSTES1,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMSOTTTES1, "STAMSOTTTES1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMSOTTTES1,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPAFONT1, "STAMPAFONT1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPAFONT1,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPATESTO2, "STAMPATESTO2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPATESTO2,9,2000,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMGRASTES2, "STAMGRASTES2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMGRASTES2,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMCORSTES2, "STAMCORSTES2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMCORSTES2,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMSOTTTES2, "STAMSOTTTES2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMSOTTTES2,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPAFONT2, "STAMPAFONT2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPAFONT2,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPATESTO3, "STAMPATESTO3");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPATESTO3,9,2000,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMGRASTES3, "STAMGRASTES3");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMGRASTES3,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMCORSTES3, "STAMCORSTES3");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMCORSTES3,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMSOTTTES3, "STAMSOTTTES3");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMSOTTTES3,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPAFIRMA1, "STAMPAFIRMA1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPAFIRMA1,5,200,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPAFIRMA2, "STAMPAFIRMA2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPAFIRMA2,5,200,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPAFONT3, "STAMPAFONT3");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAMPA,IMDBDef5.FLD_PARAMESTAMPA_STAMPAFONT3,1,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMESTAMPA, 0);
  }

  private static void Init_PQRY_MAN9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_MAN9, 22);
    IMDB.set_TblCode(IMDBDef14.PQRY_MAN9, "PQRY_MAN9");
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_GRUPPOBENEFI, "GRUPPOBENEFI");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_GRUPPOBENEFI,5,159,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECMANANNMAN, "RECMANANNMAN");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECMANANNMAN,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECMANNUMMAN, "RECMANNUMMAN");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECMANNUMMAN,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_D_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECORBENCODI, "RECORBENCODI");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECORBENCODI,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_INDIRIZZO, "INDIRIZZO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_INDIRIZZO,5,35,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECOCITTBENE, "RECOCITTBENE");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECOCITTBENE,5,143,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECORDMANDAT, "RECORDMANDAT");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECORDMANDAT,5,203,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECORDQUIETA, "RECORDQUIETA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECORDQUIETA,5,53,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_DES_BANCA, "DES_BANCA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_DES_BANCA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECORDINTEST, "RECORDINTEST");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECORDINTEST,5,124,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_INTESTATARIO_1, "INTESTATARIO_1");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_INTESTATARIO_1,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_INTESTATARIO_2, "INTESTATARIO_2");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_INTESTATARIO_2,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_INTESTATARIO_3, "INTESTATARIO_3");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_INTESTATARIO_3,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECORQTNQUIE, "RECORQTNQUIE");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECORQTNQUIE,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_REBERASOESQU, "REBERASOESQU");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_REBERASOESQU,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECBENCOFIQU, "RECBENCOFIQU");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECBENCOFIQU,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECBEDDANAQU, "RECBEDDANAQU");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECBEDDANAQU,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECCOMDENQUI, "RECCOMDENQUI");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECCOMDENQUI,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECPROSIGQUI, "RECPROSIGQUI");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN9,IMDBDef14.PQSL_MAN9_RECPROSIGQUI,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_MAN9, 0);
  }

  private static void Init_PQRY_LIQ54(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ54, 20);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ54, "PQRY_LIQ54");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECORFATIMPO, "RECORFATIMPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECORFATIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RITENUTE, "RITENUTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RITENUTE,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECLIQIMPIVA, "RECLIQIMPIVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECLIQIMPIVA,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_CODICE_DOC, "CODICE_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_CODICE_DOC,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECORDCAUSAL, "RECORDCAUSAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECORDCAUSAL,5,201,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECOCAUSBELL, "RECOCAUSBELL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECOCAUSBELL,5,316,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECOCAUSFIRE, "RECOCAUSFIRE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECOCAUSFIRE,5,341,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECOCAUSPESA, "RECOCAUSPESA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECOCAUSPESA,5,201,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECORDNETTO, "RECORDNETTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECORDNETTO,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_FAT_ANNO_PROG, "FAT_ANNO_PROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_FAT_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_FAT_NUMERO_PROG, "FAT_NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_FAT_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECONUOVESPR, "RECONUOVESPR");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ54,IMDBDef14.PQSL_LIQ54_RECONUOVESPR,1,19,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ54, 0);
  }

  private static void Init_PQRY_RETFAT5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_RETFAT5, 2);
    IMDB.set_TblCode(IMDBDef14.PQRY_RETFAT5, "PQRY_RETFAT5");
    IMDB.set_FldCode(IMDBDef14.PQRY_RETFAT5,IMDBDef14.PQSL_RETFAT5_RECORDRETTIF, "RECORDRETTIF");
    IMDB.SetFldParams(IMDBDef14.PQRY_RETFAT5,IMDBDef14.PQSL_RETFAT5_RECORDRETTIF,5,224,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_RETFAT5,IMDBDef14.PQSL_RETFAT5_RECORETFIMPO, "RECORETFIMPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_RETFAT5,IMDBDef14.PQSL_RETFAT5_RECORETFIMPO,3,14,2);
    IMDB.TblAddNew(IMDBDef14.PQRY_RETFAT5, 0);
  }

  private static void Init_PQRY_PARAMESTAM22(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMESTAM22, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMESTAM22, "PQRY_PARAMESTAM22");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM22,IMDBDef14.PQSL_PARAMESTAM22_STAMPAFIRMA2, "STAMPAFIRMA2");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM22,IMDBDef14.PQSL_PARAMESTAM22_STAMPAFIRMA2,5,200,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMESTAM22, 0);
  }

  private static void Init_PQRY_PARAMESTAM22_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMESTAM22_RS, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMESTAM22_RS, "PQRY_PARAMESTAM22_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM22_RS,IMDBDef14.PQSL_PARAMESTAM22_STAMPAFIRMA2, "STAMPAFIRMA2");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM22_RS,IMDBDef14.PQSL_PARAMESTAM22_STAMPAFIRMA2,5,200,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ConfermaAvvisiDiPagamentoAncona(MyWebEntryPoint w, IMDBObj imdb)
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
  public ConfermaAvvisiDiPagamentoAncona()
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
    FormIdx = MyGlb.FRM_CONAVVDIPAAN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7B329837-0D42-4414-B674-3762B2510330";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 852;
    DesignHeight = 526;
    set_Caption(new IDVariant("Conferma Avvisi Di Pagamento Ancona"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 852;
    Frames[1].Height = 500;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.144;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 852;
    Frames[2].Height = 72;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Stampa";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 72;
    PAN_PARAMESTAMPA = new IDPanel(w, this, 2, "PAN_PARAMESTAMPA");
    Frames[2].Content = PAN_PARAMESTAMPA;
    PAN_PARAMESTAMPA.Lockable = false;
    PAN_PARAMESTAMPA.iLocked = false;
    PAN_PARAMESTAMPA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMESTAMPA.VS = MainFrm.VisualStyleList;
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 852-MyGlb.PAN_OFFS_X, 72-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E13D20D7-AAB3-48BE-9AC3-E96709A69C5A");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 584, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMESTAMPA.InitStatus = 1;
    PAN_PARAMESTAMPA_Init();
    PAN_PARAMESTAMPA_InitFields();
    PAN_PARAMESTAMPA_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 852;
    Frames[3].Height = 428;
    Frames[3].Caption = "Avvisi Di Pagamento Book Ancona";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 428;
    BKW_AVVDIPAGBOAN = new OBook(this);
    BUK_AVVDIPAGBOAN = new CIDREObj(BKW_AVVDIPAGBOAN);
    Frames[3].Content = BKW_AVVDIPAGBOAN;
    BKW_AVVDIPAGBOAN.Height = 398;
    BKW_AVVDIPAGBOAN.Width = 852;
    BKW_AVVDIPAGBOAN.iGuid = "6ADFCEB0-A6E6-4A1B-8DB9-C21BCB0AF33B";
    BKW_AVVDIPAGBOAN.Code = "BUK_AVVDIPAGBOAN";
    BKW_AVVDIPAGBOAN.BookObj = BUK_AVVDIPAGBOAN;
    BKW_AVVDIPAGBOAN.InitDefMasks();
    BUK_AVVDIPAGBOAN.set_FrIndex(3);
    BUK_AVVDIPAGBOAN.InitBook(1, 3342593, "Avvisi Di Pagamento Book Ancona", IMDB, MainFrm.VisualStyleList);
    BUK_AVVDIPAGBOAN.InitHTML();
    BUK_AVVDIPAGBOAN.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_AVVDIPAGBOAN.SetSize(852, 398);
    BUK_AVVDIPAGBOAN.Book.SetMainFrm(MainFrm);
    BUK_AVVDIPAGBOAN.SetRTCGuid(0, "6ADFCEB0-A6E6-4A1B-8DB9-C21BCB0AF33B");
    BUK_AVVDIPAGBOAN.SetObjCode(0, "AVVDIPAGBOAN");
    BUK_AVVDIPAGBOAN_MST_AVVIDIPAGPAG_Init();
    BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP_Init();
    BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO_Init();
    BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO_Init();
    BUK_AVVDIPAGBOAN_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMESTAMPA, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONAVVDIPAAN_PARAMESTAM22();
      }
      PAN_PARAMESTAMPA.UpdatePanel(MainFrm);
      BUK_AVVDIPAGBOAN.UpdateBook();
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
    if (Code.equals("BUK_AVVDIPAGBOAN")) return BUK_AVVDIPAGBOAN;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ConfermaAvvisiDiPagamentoAncona);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ConfermaAvvisiDiPagamentoAncona.class.getName() : (Glb.ClassWithPackage(ConfermaAvvisiDiPagamentoAncona.class) ? ConfermaAvvisiDiPagamentoAncona.class.getName().substring(ConfermaAvvisiDiPagamentoAncona.class.getPackage().getName().length() + 1) : ConfermaAvvisiDiPagamentoAncona.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Avvisi Di Pagamento Page On Formatting
  // Evento notificato da una pagina quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_AVVDIPAGBOAN_MST_AVVIDIPAGPAG_OnFormattingPage()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Avvisi Di Pagamento Page On Formatting Body
      // Corpo Procedura
      // 
      IDVariant v_FONTNAME = new IDVariant(0,IDVariant.STRING);
      v_FONTNAME = (new IDVariant("Arial"));
      com.progamma.is.VisAttrObj v_VISUSTYLTES1 = null;
      v_VISUSTYLTES1 = MainFrm.VisualStyleList.VisualAttribute(new IDVariant(MyGlb.VIS_STIVISTESST1).intValue());
      com.progamma.is.VisAttrObj v_VISUSTYLTES2 = null;
      v_VISUSTYLTES2 = MainFrm.VisualStyleList.VisualAttribute(new IDVariant(MyGlb.VIS_STIVISTESST2).intValue());
      com.progamma.is.VisAttrObj v_VISUSTYLTES3 = null;
      v_VISUSTYLTES3 = MainFrm.VisualStyleList.VisualAttribute(new IDVariant(MyGlb.VIS_STIVISTESST3).intValue());
      v_VISUSTYLTES1.set_Font(1, new IDVariant(v_FONTNAME.stringValue() + "," + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMGRASTES1, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "B" : "") + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMCORSTES1, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "I" : "") + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMSOTTTES1, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "U" : "") + ((new IDVariant(0)).isTrue() ? "S" : "") + "," + IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPAFONT1, 0).dblValue()).stringValue());
      v_VISUSTYLTES2.set_Font(1, new IDVariant(v_FONTNAME.stringValue() + "," + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMGRASTES2, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "B" : "") + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMCORSTES2, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "I" : "") + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMSOTTTES2, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "U" : "") + ((new IDVariant(0)).isTrue() ? "S" : "") + "," + IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPAFONT2, 0).dblValue()).stringValue());
      v_VISUSTYLTES3.set_Font(1, new IDVariant(v_FONTNAME.stringValue() + "," + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMGRASTES3, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "B" : "") + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMCORSTES3, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "I" : "") + (((IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMSOTTTES3, 0).equals((new IDVariant("SI"))))?(new IDVariant(-1)):(new IDVariant(0))).isTrue() ? "U" : "") + ((new IDVariant(0)).isTrue() ? "S" : "") + "," + IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPAFONT3, 0).dblValue()).stringValue());
      BUK_AVVDIPAGBOAN.set_SpanVisualStyle(BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO1, new IDVariant(new IDVariant(MyGlb.VIS_STIVISTESST1),IDVariant.INTEGER).intValue());
      BUK_AVVDIPAGBOAN.set_SpanVisualStyle(BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO2, new IDVariant(new IDVariant(MyGlb.VIS_STIVISTESST2),IDVariant.INTEGER).intValue());
      BUK_AVVDIPAGBOAN.set_SpanVisualStyle(BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO3, new IDVariant(new IDVariant(MyGlb.VIS_STIVISTESST3),IDVariant.INTEGER).intValue());
      BUK_AVVDIPAGBOAN.SetBoxImage(BUK_AVVDIPAGBOAN_RPTBOX_LOGO, null, (new IDVariant("logo.bmp")).toString()); 
      BUK_AVVDIPAGBOAN.SetBoxImage(BUK_AVVDIPAGBOAN_RPTBOX_FIRMABITMAP, null, IMMAGINE.toString()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "AvvisiDiPagamentoPageOnFormatting", _e);
    }
  }

  // **********************************************************************
  // Gruppo Beneficiario Group Header 2 Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE2_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Gruppo Beneficiario Group Header 2 Before Formatting Body
      // Corpo Procedura
      // 
      BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_MANDATHEADER, (new IDVariant(-1)).booleanValue());
      BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_MODADIPAGHEA, (new IDVariant(-1)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "GruppoBeneficiarioGroupHeader2BeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Gruppo Beneficiario Group Header 4 Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE4_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Gruppo Beneficiario Group Header 4 Before Formatting Body
      // Corpo Procedura
      // 
      BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_MANDATHEADER, (new IDVariant(0)).booleanValue());
      BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_MODADIPAGHEA, (new IDVariant(0)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "GruppoBeneficiarioGroupHeader4BeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Detail After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_AVVDIPAGBOAN_SEC_DETAIL_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail After Formatting Event Body
      // Procedure Body
      // 
      BUK_AVVDIPAGBOAN.set_BoxRect(BUK_AVVDIPAGBOAN_RPTBOX_BORDOMANDATO, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVDIPAGBOAN.SectionHeight(BUK_AVVDIPAGBOAN_SEC_DETAIL))).dblValue());
      BUK_AVVDIPAGBOAN.set_BoxRect(BUK_AVVDIPAGBOAN_RPTBOX_BORDOQUIETAN, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVDIPAGBOAN.SectionHeight(BUK_AVVDIPAGBOAN_SEC_DETAIL))).dblValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "DetailAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Detail Banca Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_AVVDIPAGBOAN_SEC_DETAILBANCA_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Banca Before Formatting Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(BUK_AVVDIPAGBOAN.GetReportColumn(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, "DES_BANCA")))
      {
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_QTNDESBANCA, (new IDVariant(0)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDBANC, (new IDVariant(0)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEBANC, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_QTNDESBANCA, (new IDVariant(-1)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDBANC, (new IDVariant(-1)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEBANC, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "DetailBancaBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Detail Intestatario Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_AVVDIPAGBOAN_SEC_DETAILINTEST_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Intestatario Before Formatting Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(BUK_AVVDIPAGBOAN.GetReportColumn(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, "INTESTATARIO_1")) && IDL.IsNull(BUK_AVVDIPAGBOAN.GetReportColumn(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, "INTESTATARIO_2")) && IDL.IsNull(BUK_AVVDIPAGBOAN.GetReportColumn(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, "INTESTATARIO_3")))
      {
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_INTESTATARIO, (new IDVariant(0)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDINTE, (new IDVariant(0)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEINTE, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_INTESTATARIO, (new IDVariant(-1)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDINTE, (new IDVariant(-1)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEINTE, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "DetailIntestatarioBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Detail Quietanzante Before Formatting
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_AVVDIPAGBOAN_SEC_DETAILQUIETA_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Quietanzante Before Formatting Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(BUK_AVVDIPAGBOAN.GetReportColumn(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, "RECORQTNQUIE")))
      {
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDQUIE, (new IDVariant(0)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEQUIE, (new IDVariant(0)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_QUIETANZANTE, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDQUIE, (new IDVariant(-1)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEQUIE, (new IDVariant(-1)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_QUIETANZANTE, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "DetailQuietanzanteBeforeFormatting", _e);
    }
  }

  // **********************************************************************
  // Detail Rettifiche Liq After Formatting
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Rettifiche Liq After Formatting Body
      // Corpo Procedura
      // 
      BUK_AVVDIPAGBOAN.set_BoxRect(BUK_AVVDIPAGBOAN_RPTBOX_BORDOCAUSRET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVDIPAGBOAN.SectionHeight(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ))).dblValue());
      BUK_AVVDIPAGBOAN.set_BoxRect(BUK_AVVDIPAGBOAN_RPTBOX_BORDOIMPORET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVDIPAGBOAN.SectionHeight(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ))).dblValue());
      BUK_AVVDIPAGBOAN.set_BoxRect(BUK_AVVDIPAGBOAN_RPTBOX_BORDOSALDRET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVDIPAGBOAN.SectionHeight(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ))).dblValue());
      BUK_AVVDIPAGBOAN.set_BoxRect(BUK_AVVDIPAGBOAN_RPTBOX_BORDORITERET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVDIPAGBOAN.SectionHeight(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ))).dblValue());
      BUK_AVVDIPAGBOAN.set_BoxRect(BUK_AVVDIPAGBOAN_RPTBOX_BORDONETTRET, IDREGlb.RECT_HEIGHT, (new IDVariant(BUK_AVVDIPAGBOAN.SectionHeight(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ))).dblValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "DetailRettificheLiqAfterFormatting", _e);
    }
  }

  // **********************************************************************
  // Gruppo Beneficiario Group Footer 3 After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO3_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Gruppo Beneficiario Group Footer 3 After Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_AVVDIPAGBOAN.GetReportTotalRecords(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO))).equals((new IDVariant(0)), true))
      {
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDOINFERI1, (new IDVariant(0)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_ELENCOLIQUID, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_BORDOINFERI1, (new IDVariant(-1)).booleanValue());
        BUK_AVVDIPAGBOAN.set_BoxVisible(BUK_AVVDIPAGBOAN_RPTBOX_ELENCOLIQUID, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "GruppoBeneficiarioGroupFooter3AfterFormattingEvent", _e);
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
      SettaParametriStampa();
      BUK_AVVDIPAGBOAN.SetBoxImage(BUK_AVVDIPAGBOAN_RPTBOX_LOGO, null, (new IDVariant("logo.bmp")).toString()); 
      BUK_AVVDIPAGBOAN.SetBoxImage(BUK_AVVDIPAGBOAN_RPTBOX_FIRMABITMAP, null, IMMAGINE.toString()); 
      BUK_AVVDIPAGBOAN.RefreshQuery();
      ((AvvisiDiPagamento)MainFrm.GetForm(MyGlb.FRM_AVVISDIPAGAM,0)).BUK_AVVIDIPAGBOO.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      BUK_AVVDIPAGBOAN.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "Load", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_PARAMESTAMPA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Stampa After Find Body
      // Corpo Procedura
      // 
      // BUK_AVVDIPAGBOAN.set_PrintDestination((new IDVariant(3)).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "ParametriStampaAfterFind", _e);
    }
  }

  // **********************************************************************
  // Invia
  // **********************************************************************
  public int Invia ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CHIAVE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STRINOMEMITT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STRIINDIMITT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STRIOGGEMAIL = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STRITESTMAIL = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STRINOMEALLE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_OGGETTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TESTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMEMITTENTE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_EMAILMITTENT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMEALLEGATO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FASE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CODBEN = new IDVariant(0,IDVariant.INTEGER);
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      v_CHIAVE = (new IDVariant("PRODUCTS/MAIL/AVVISI DI PAGAMENTO", IDVariant.STRING));
      v_STRINOMEMITT = (new IDVariant("Nome Mittente", IDVariant.STRING));
      v_STRIINDIMITT = (new IDVariant("Indirizzo Mittente", IDVariant.STRING));
      v_STRIOGGEMAIL = (new IDVariant("Oggetto Mail", IDVariant.STRING));
      v_STRITESTMAIL = (new IDVariant("Testo Mail", IDVariant.STRING));
      v_STRINOMEALLE = (new IDVariant("Nome Allegato", IDVariant.STRING));
      v_FASE = (new IDVariant("Avvisi di Pagamento", IDVariant.STRING));
      // 
      // Invia Body
      // Procedure Body
      // 
      IDVariant v_INVIATO = new IDVariant(0,IDVariant.STRING);
      SettaParametriStampa();
      // 
      // setta parametri registro
      // 
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.STRINGA = " + IDL.CSql(v_STRINOMEMITT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NOMEMITTENTE = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.STRINGA = " + IDL.CSql(v_STRIINDIMITT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_EMAILMITTENT = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.STRINGA = " + IDL.CSql(v_STRIOGGEMAIL, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_OGGETTO = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.STRINGA = " + IDL.CSql(v_STRITESTMAIL, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_TESTO = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.STRINGA = " + IDL.CSql(v_STRINOMEALLE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NOMEALLEGATO = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
      }
      v_CODBEN = new IDVariant(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARACODIBENE, 0),IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select distinct ");
      SQL.append("  NVL(A.DIVERSO_BEN, A.BENEFICIARIO) as LIQBENEFICIA, ");
      SQL.append("  D.E_MAIL as BENEMAIL, ");
      SQL.append("  D.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES, ");
      SQL.append("  D.INVIO_STAMPE as BENINVIOSTAM, ");
      SQL.append("  D.TELEX as BENTELEX ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  QTN B, ");
      SQL.append("  T02 C, ");
      SQL.append("  BEN D, ");
      SQL.append("  MAN E ");
      SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (((" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARANUMEDIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL) AND (A.NUMERO_MAND BETWEEN NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARAMMANDDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 1) AND NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARAMMANDAAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 99999))) OR (NOT ((" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARANUMEDIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) AND E.ANNO_ELENCO = TO_NUMBER(TO_CHAR(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARADATADIST, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", 'yyyy')) AND E.NUMERO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARANUMEDIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, NVL(A.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (NVL(A.DIVERSO_BEN, A.BENEFICIARIO) = NVL(" + IDL.CSql(v_CODBEN, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.DIVERSO_BEN, A.BENEFICIARIO))) ");
      SQL.append("and   (B.NUM_QUIETANZA = DECODE(A.DIVERSO_BEN, to_number(NULL), A.NUM_QUIETANZA, A.NUM_QUIETANZA_DIV_BEN)) ");
      SQL.append("and   (B.CODICE = NVL(A.DIVERSO_BEN, A.BENEFICIARIO)) ");
      SQL.append("and   (B.TIPO_QUIETANZA = C.CODICE) ");
      SQL.append("and   (C.STAMPA_AVVISO = 'SI') ");
      SQL.append("and   (D.CODICE = NVL(A.DIVERSO_BEN, A.BENEFICIARIO)) ");
      SQL.append("and   (((D.INVIO_STAMPE IS NULL) AND " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARATIPOELAB, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 2) OR (NOT ((D.INVIO_STAMPE IS NULL)) AND " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARATIPOELAB, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 3) OR (" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARATIPOELAB, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 1)) ");
      SQL.append("and   (E.ANNO_MAND = A.ANNO_MAND) ");
      SQL.append("and   (E.NUMERO_MAND = A.NUMERO_MAND) ");
      C3 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      C3.setColUnbound(1,true);
      if (!C3.EOF()) C3.MoveNext();
      while (!C3.EOF())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARACODIBENE, 0, new IDVariant(C3.Get("LIQBENEFICIA")));
        if (!(IDL.IsNull(C3.Get("BENINVIOSTAM"))))
        {
          BUK_AVVDIPAGBOAN.set_PrintDestination((new IDVariant(3)).intValue());
          BUK_AVVDIPAGBOAN.SetBoxImage(BUK_AVVDIPAGBOAN_RPTBOX_LOGO, null, (new IDVariant("logo.bmp")).toString()); 
          BUK_AVVDIPAGBOAN.SetBoxImage(BUK_AVVDIPAGBOAN_RPTBOX_FIRMABITMAP, null, IMMAGINE.toString()); 
          BUK_AVVDIPAGBOAN.RefreshQuery();
          ((AvvisiDiPagamento)MainFrm.GetForm(MyGlb.FRM_AVVISDIPAGAM,0)).BUK_AVVIDIPAGBOO.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
          BUK_AVVDIPAGBOAN.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
          v_INVIATO = MainFrm.InvioMail(((C3.Get("BENINVIOSTAM").equals((new IDVariant("M"))))?(new IDVariant("MAIL")):(new IDVariant("FAX"))), C3.Get("BENRAGSOESES"), ((C3.Get("BENINVIOSTAM").equals((new IDVariant("M"))))?C3.Get("BENEMAIL"):(new IDVariant())), (new IDVariant()), (new IDVariant()), ((C3.Get("BENINVIOSTAM").equals((new IDVariant("F"))))?C3.Get("BENTELEX"):(new IDVariant())), v_OGGETTO, v_TESTO, v_NOMEMITTENTE, v_EMAILMITTENT, v_NOMEALLEGATO, (new IDVariant(BUK_AVVDIPAGBOAN.GetWebFileName())), v_FASE);
          // MainFrm.InvioMail(, C3.Get("BENRAGSOESES"), ((C3.Get("BENINVIOSTAM").equals((new IDVariant("M"))))?C3.Get("BENEMAIL"):(new IDVariant())), (new IDVariant()), (new IDVariant()), ((C3.Get("BENINVIOSTAM").equals((new IDVariant("F"))))?C3.Get("BENTELEX"):(new IDVariant())), v_OGGETTO, v_TESTO, v_NOMEMITTENTE, v_EMAILMITTENT, v_NOMEALLEGATO, (new IDVariant(BUK_AVVDIPAGBOAN.GetWebFileName())), v_FASE);
        }
        C3.MoveNext();
      }
      C3.Close();
      if (v_INVIATO.equals((new IDVariant("SI")), true))
      {
        MainFrm.set_AlertMessage((new IDVariant("Avviso di Pagamento inviato"))); 
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARACODIBENE, 0, new IDVariant(new IDVariant(v_CODBEN),IDVariant.FLOAT));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "Invia", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Parametri Stampa
  // **********************************************************************
  public int SettaParametriStampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TESTO1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_GRASSETTO1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CORSIVO1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SOTTOLINEAT1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TESTO2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_GRASSETTO2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CORSIVO2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SOTTOLINEAT2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TESTO3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_GRASSETTO3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CORSIVO3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SOTTOLINEAT3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FIRMA2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PATH = new IDVariant(0,IDVariant.STRING);
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Setta Parametri Stampa Body
      // Procedure Body
      // 
      IDVariant v_FONT1 = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_FONT2 = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_FONT3 = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TESTO as TESTSTAMTEST, ");
      SQL.append("  A.GRASSETTO as TESTSTAMGRAS, ");
      SQL.append("  A.CORSIVO as TESTSTAMCORS, ");
      SQL.append("  A.SOTTOLINEATO as TESTSTAMSOTT, ");
      SQL.append("  A.DIMENSIONE_FONT as TESSTADIMFON ");
      SQL.append("from ");
      SQL.append("  TESTI_STAMPE A ");
      SQL.append("where (A.TIPO_STAMPA = 'AVP') ");
      SQL.append("and   (A.PROGRESSIVO = 1) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TESTO1 = QV.Get("TESTSTAMTEST", IDVariant.STRING) ;
        v_GRASSETTO1 = QV.Get("TESTSTAMGRAS", IDVariant.STRING) ;
        v_CORSIVO1 = QV.Get("TESTSTAMCORS", IDVariant.STRING) ;
        v_SOTTOLINEAT1 = QV.Get("TESTSTAMSOTT", IDVariant.STRING) ;
        v_FONT1 = QV.Get("TESSTADIMFON", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TESTO as TESTSTAMTES2, ");
      SQL.append("  A.GRASSETTO as TESTSTAMGRA2, ");
      SQL.append("  A.CORSIVO as TESTSTAMCOR2, ");
      SQL.append("  A.DIMENSIONE_FONT as TESSTADIFO22, ");
      SQL.append("  A.SOTTOLINEATO as TESTSTAMSOT2 ");
      SQL.append("from ");
      SQL.append("  TESTI_STAMPE A ");
      SQL.append("where (A.TIPO_STAMPA = 'AVP') ");
      SQL.append("and   (A.PROGRESSIVO = 2) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TESTO2 = QV.Get("TESTSTAMTES2", IDVariant.STRING) ;
        v_GRASSETTO2 = QV.Get("TESTSTAMGRA2", IDVariant.STRING) ;
        v_CORSIVO2 = QV.Get("TESTSTAMCOR2", IDVariant.STRING) ;
        v_FONT2 = QV.Get("TESSTADIFO22", IDVariant.INTEGER) ;
        v_SOTTOLINEAT2 = QV.Get("TESTSTAMSOT2", IDVariant.STRING) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TESTO as TESTSTAMTES3, ");
      SQL.append("  A.GRASSETTO as TESTSTAMGRA3, ");
      SQL.append("  A.CORSIVO as TESTSTAMCOR3, ");
      SQL.append("  A.SOTTOLINEATO as TESTSTAMSOT3, ");
      SQL.append("  A.DIMENSIONE_FONT as TESSTADIFO33 ");
      SQL.append("from ");
      SQL.append("  TESTI_STAMPE A ");
      SQL.append("where (A.TIPO_STAMPA = 'AVP') ");
      SQL.append("and   (A.PROGRESSIVO = 3) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TESTO3 = QV.Get("TESTSTAMTES3", IDVariant.STRING) ;
        v_GRASSETTO3 = QV.Get("TESTSTAMGRA3", IDVariant.STRING) ;
        v_CORSIVO3 = QV.Get("TESTSTAMCOR3", IDVariant.STRING) ;
        v_SOTTOLINEAT3 = QV.Get("TESTSTAMSOT3", IDVariant.STRING) ;
        v_FONT3 = QV.Get("TESSTADIFO33", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPATESTO1, 0, new IDVariant(v_TESTO1));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMGRASTES1, 0, new IDVariant(v_GRASSETTO1));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMCORSTES1, 0, new IDVariant(v_CORSIVO1));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMSOTTTES1, 0, new IDVariant(v_SOTTOLINEAT1));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPAFONT1, 0, new IDVariant(v_FONT1));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPATESTO2, 0, new IDVariant(v_TESTO2));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMGRASTES2, 0, new IDVariant(v_GRASSETTO2));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMCORSTES2, 0, new IDVariant(v_CORSIVO2));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMSOTTTES2, 0, new IDVariant(v_SOTTOLINEAT2));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPAFONT2, 0, new IDVariant(v_FONT2));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPATESTO3, 0, new IDVariant(v_TESTO3));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMGRASTES3, 0, new IDVariant(v_GRASSETTO3));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMCORSTES3, 0, new IDVariant(v_CORSIVO3));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMSOTTTES3, 0, new IDVariant(v_SOTTOLINEAT3));
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPAFONT3, 0, new IDVariant(v_FONT3));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as T67DESCRIZIO, ");
      SQL.append("  A.IMMAGINE as T67IMMAGINE, ");
      SQL.append("  A.BITMAP as T67BITMAP, ");
      SQL.append("  A.ESTENSIONE_FILE as T67ESTENFILE ");
      SQL.append("from ");
      SQL.append("  T67 A ");
      SQL.append("where (A.CODICE = 'AVV') ");
      SQL.append("and   (A.PROGRESSIVO = 1) ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPAFIRMA1, 0, new IDVariant(C2.Get("T67DESCRIZIO")));
        if (VBFiles.FileLen(C2.Get("T67BITMAP")).compareTo((new IDVariant(0)), true)>0)
        {
          Glb.CopyFile(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("\\"))), (new IDVariant("images"))), (new IDVariant("\\"))), (new IDVariant("firma"))), (new IDVariant("AVV"))), (new IDVariant("."))), VBFiles.FileExt(C2.Get("T67BITMAP"))).stringValue(), C2.Get("T67BITMAP").stringValue()); 
          IMMAGINE = IDL.Add(IDL.Add(IDL.Add((new IDVariant("firma")), (new IDVariant("AVV"))), (new IDVariant("."))), VBFiles.FileExt(C2.Get("T67BITMAP")));
        }
        else
        {
          v_PATH = Glb.SaveBlob(MainFrm,C2.Get("T67IMMAGINE"),IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("\\"))), (new IDVariant("images"))),IDL.Add(IDL.Add(IDL.Add((new IDVariant("firma")), (new IDVariant("AVV"))), (new IDVariant("."))), C2.Get("T67ESTENFILE")));
          IMMAGINE = IDL.Add(IDL.Add(IDL.Add((new IDVariant("firma")), (new IDVariant("AVV"))), (new IDVariant("."))), C2.Get("T67ESTENFILE"));
        }
        C2.MoveNext();
      }
      C2.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as T67DESCRIZIO ");
      SQL.append("from ");
      SQL.append("  T67 A ");
      SQL.append("where (A.CODICE = 'AVV') ");
      SQL.append("and   (A.PROGRESSIVO = 2) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_FIRMA2 = QV.Get("T67DESCRIZIO", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPAFIRMA2, 0, new IDVariant(v_FIRMA2));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaAvvisiDiPagamentoAncona", "SettaParametriStampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CONAVVDIPAAN_PARAMESTAM22() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMESTAM22_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMESTAMPA, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMESTAMPA, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMESTAM22_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMESTAM22_RS, 0, IMDBDef5.TBL_PARAMESTAMPA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM22_RS, 0, 0, IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPAFIRMA2, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMESTAMPA, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMESTAMPA, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMESTAMPA, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMESTAM22_RS, 0);
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
  private void PAN_PARAMESTAMPA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMESTAMPA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMESTAMPA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMESTAMPA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMESTAMPA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMESTAMPA);
    // Stub
  }

  private void PAN_PARAMESTAMPA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_ETICHETINVIA)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Invia();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMESTAMPA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMESTAMPA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMESTAMPA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_AVVDIPAGBOAN_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_AVVDIPAGBOAN_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_PAGEHEADER)
    {
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_DATIENTEINDI, new IDVariant(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_INDIRIZZO, 0)));
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_COMUNE, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_CAP, 0)), (new IDVariant(5)), (new IDVariant("0")), true), (new IDVariant(" "))), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COMUNE, 0)), (new IDVariant(" "))), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PROVINCIA, 0)), (new IDVariant(" "))), (new IDVariant(" C.F. "))), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COD_FISCALE, 0))));
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_OGAVDIPAVOCO, new IDVariant((new IDVariant("Oggetto: Avviso di Pagamento Vostre Competenze"))));
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_DECTSPDAADPP, new IDVariant(IDL.Add(IDL.Add(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COMUNE, 0), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMETRI272, IMDBDef14.PQSL_PARAMETRI272_PARADATAAVVI, 0)))));
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA)
    {
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO1, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPATESTO1, 0)));
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE1)
    {
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO2, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPATESTO2, 0)));
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE2)
    {
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO3, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPATESTO3, 0)));
      BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE2_OnFormattingSection();
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE3)
    {
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE4)
    {
      BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE4_OnFormattingSection();
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_DETAILBANCA)
    {
      BUK_AVVDIPAGBOAN_SEC_DETAILBANCA_OnFormattingSection();
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_DETAILINTEST)
    {
      BUK_AVVDIPAGBOAN_SEC_DETAILINTEST_OnFormattingSection();
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_DETAILQUIETA)
    {
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_CQRBRSEQCADP, new IDVariant(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Quietanzante ")), BUK_AVVDIPAGBOAN.GetReportColumn(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, "REBERASOESQU")), BUK_AVVDIPAGBOAN.GetReportColumn(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, "RECBENCOFIQU")), BUK_AVVDIPAGBOAN.GetReportColumn(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, "RECBEDDANAQU"))));
      BUK_AVVDIPAGBOAN_SEC_DETAILQUIETA_OnFormattingSection();
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_GRUBENGROFOO)
    {
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO1)
    {
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO2)
    {
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO3)
    {
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU)
    {
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_DETAILLIQ)
    {
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_IEPPFRCFCADP, new IDVariant(((IMDB.Value(IMDBDef5.TBL_PARAMETRI263, IMDBDef5.FLD_PARAMETRI263_PARAMPERSONA, 0).equals((new IDVariant("FI"))))?BUK_AVVDIPAGBOAN.GetReportColumn(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, "RECOCAUSFIRE"):((IMDB.Value(IMDBDef5.TBL_PARAMETRI263, IMDBDef5.FLD_PARAMETRI263_PARAMPERSONA, 0).equals((new IDVariant("BL"))))?BUK_AVVDIPAGBOAN.GetReportColumn(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, "RECOCAUSBELL"):((IMDB.Value(IMDBDef5.TBL_PARAMETRI263, IMDBDef5.FLD_PARAMETRI263_PARAMPERSONA, 0).equals((new IDVariant("PU"))))?BUK_AVVDIPAGBOAN.GetReportColumn(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, "RECOCAUSPESA"):BUK_AVVDIPAGBOAN.GetReportColumn(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, "RECORDCAUSAL"))))));
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ)
    {
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_DETAILRETTIF)
    {
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_NUOESPPIEGRU)
    {
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ)
    {
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_PFLSRLICADPA, new IDVariant(BUK_AVVDIPAGBOAN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ,"IMPORTO")));
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_PFLSRLRCADPA, new IDVariant(BUK_AVVDIPAGBOAN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ,"RITENUTE")));
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_PFLSRNCADPAA, new IDVariant(BUK_AVVDIPAGBOAN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ,"RECORDNETTO")));
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_PFLSRLIICADP, new IDVariant(BUK_AVVDIPAGBOAN.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ,"RECLIQIMPIVA")));
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO4)
    {
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_STAMPAFIRMA1, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPAFIRMA1, 0)));
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_STAMPAFIRMA2, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMESTAMPA, IMDBDef5.FLD_PARAMESTAMPA_STAMPAFIRMA2, 0)));
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_AVVDIPAGBOAN_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_DETAIL)
    {
      BUK_AVVDIPAGBOAN_SEC_DETAIL_OnAfterFormattingSection();
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO3)
    {
      BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO3_OnAfterFormattingSection();
    }
    if (SectionID==BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ)
    {
      BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ_OnAfterFormattingSection();
    }
  }

  private void BUK_AVVDIPAGBOAN_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_AVVDIPAGBOAN_MST_AVVIDIPAGPAG)
    {
      BUK_AVVDIPAGBOAN.set_SpanValue(BUK_AVVDIPAGBOAN_SPAN_NUMEROPAGIN1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_AVVDIPAGBOAN.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_AVVDIPAGBOAN.GetTotalPagesNumber()))))));
      BUK_AVVDIPAGBOAN_MST_AVVIDIPAGPAG_OnFormattingPage();
    }
  }

  private void BUK_AVVDIPAGBOAN_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_AVVDIPAGBOAN_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_AVVDIPAGBOAN_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_AVVDIPAGBOAN_OnPreview()
  {
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMESTAMPA_Init()
  {

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, "D23B823B-7A40-4779-B9AE-46B6910D868C");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, "Invia");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, 0, "button1.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, "F078EEC7-1645-4869-B020-6BE1426BD746");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, "Verranno inviati i seguenti avvisi di pagamento");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMESTAMPA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.PANEL_LIST, 676, 20, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.PANEL_FORM, 332, 12, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ETICHETINVIA, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ETICHETINVIA, -1, "", "ETICHETINVIA", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.PANEL_LIST, 16, 12, 540, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.PANEL_LIST, 3);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.PANEL_FORM, 16, 16, 308, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ETICVERRINVI, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ETICVERRINVI, -1, "", "ETICVERRINVI", 0, 0, 0, -13997);
  }

  private void PAN_PARAMESTAMPA_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMESTAMPA.SetIMDB(IMDB, "PQRY_PARAMESTAM22", true);
    PAN_PARAMESTAMPA.set_SetString(MyGlb.MASTER_ROWNAME, "Stampa");
    PAN_PARAMESTAMPA.SetQueryIMDB(PPQRY_PARAMESTAM22, IMDBDef14.PQRY_PARAMESTAM22_RS, IMDBDef5.TBL_PARAMESTAMPA);
    JustLoaded = true;
    PAN_PARAMESTAMPA.SetMasterTable(0, "PARAMESTAMPA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMESTAMPA.Status() == 2)
    {
      int oldListQBE = PAN_PARAMESTAMPA.iUseListQBE;
      PAN_PARAMESTAMPA.iUseListQBE = 0;
      PAN_PARAMESTAMPA.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMESTAMPA.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMESTAMPA.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_AVVDIPAGBOAN_MST_AVVIDIPAGPAG_Init()
  {
    BUK_AVVDIPAGBOAN.InitMastro(BUK_AVVDIPAGBOAN_MST_AVVIDIPAGPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_MST_AVVIDIPAGPAG, "9FF32E4F-652D-4746-98C4-4A22EA87F47C");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_MST_AVVIDIPAGPAG, "AVVIDIPAGPAG");
    BUK_AVVDIPAGBOAN.InitMastroBox(BUK_AVVDIPAGBOAN_MST_AVVIDIPAGPAG, BUK_AVVDIPAGBOAN_RPTBOX_NUMEROPAGIN1, 18400, 500, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 786433, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_NUMEROPAGIN1, "0D39C0E1-E49B-48A6-826B-1C0B808DDFC1");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_NUMEROPAGIN1, BUK_AVVDIPAGBOAN_SPAN_NUMEROPAGIN1, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_NUMEROPAGIN1, "0A3E8C56-C046-49E3-9113-3E4B7A146E70");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_AVVDIPAGBOAN.InitMastroBox(BUK_AVVDIPAGBOAN_MST_AVVIDIPAGPAG, BUK_AVVDIPAGBOAN_RPTBOX_PAGEHEADER1, 1000, 1000, 19000, 5100, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_PAGEHEADER1, "1CA49D06-4817-4DD5-A216-22D940D29FB0");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_AVVDIPAGBOAN.InitMastroBox(BUK_AVVDIPAGBOAN_MST_AVVIDIPAGPAG, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1, 1000, 6200, 19000, 22200, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1, "E8E43FE7-823D-478A-8E01-CC22C71CA2EC");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1, "PAGEBODY1");
  }

  private void BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP_InitQuery() { BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP_InitQuery(true, true); }
  private void BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select distinct ");
      SQL.append("  D.RAGIONE_SOCIALE_ESTESA || TO_CHAR ( D.CODICE ) as GRUPPOBENEFI, ");
      SQL.append("  G.ANNO_MAND as RECMANANNMAN, ");
      SQL.append("  G.NUMERO_MAND as RECMANNUMMAN, ");
      SQL.append("  G.D_DATA_MAND as D_DATA_MAND, ");
      SQL.append("  D.CODICE as RECORBENCODI, ");
      SQL.append("  D.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
      SQL.append("  D.INDIRIZZO as INDIRIZZO, ");
      SQL.append("  LPAD(TO_CHAR ( D.CAP ), 5, SUBSTR('0', 1, 1)) || ' ' || E.DENOMINAZIONE || ' ' || F.SIGLA as RECOCITTBENE, ");
      SQL.append("  TO_CHAR ( A.NUMERO_MAND ) || ' ' || 'del ' || TO_CHAR ( G.D_DATA_MAND,'dd/mm/yyyy') as RECORDMANDAT, ");
      SQL.append("  C.DESCRIZIONE || ' ' || B.CONTO_CORRENTE as RECORDQUIETA, ");
      SQL.append("  C.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  B.DES_BANCA as DES_BANCA, ");
      SQL.append("  B.INTESTATARIO_1 || '\n' || B.INTESTATARIO_2 || '\n' || B.INTESTATARIO_3 as RECORDINTEST, ");
      SQL.append("  B.INTESTATARIO_1 as INTESTATARIO_1, ");
      SQL.append("  B.INTESTATARIO_2 as INTESTATARIO_2, ");
      SQL.append("  B.INTESTATARIO_3 as INTESTATARIO_3, ");
      SQL.append("  B.QUIETANZANTE as RECORQTNQUIE, ");
      SQL.append("  H.RAGIONE_SOCIALE_ESTESA as REBERASOESQU, ");
      SQL.append("  DECODE(H.CODICE_FISCALE, NULL, NULL, ' C.F. ' || H.CODICE_FISCALE) as RECBENCOFIQU, ");
      SQL.append("  DECODE(H.D_DATA_NASCITA, to_date(NULL), NULL, ' nato il ' || TO_CHAR ( H.D_DATA_NASCITA ) || ' ' || 'a' || ' ' || I.DENOMINAZIONE || ' ' || J.SIGLA) as RECBEDDANAQU, ");
      SQL.append("  I.DENOMINAZIONE as RECCOMDENQUI, ");
      SQL.append("  J.SIGLA as RECPROSIGQUI ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  QTN B, ");
      SQL.append("  T02 C, ");
      SQL.append("  BEN D, ");
      SQL.append("  AD4_COMUNI E, ");
      SQL.append("  AD4_PROVINCIE F, ");
      SQL.append("  MAN G, ");
      SQL.append("  BEN H, ");
      SQL.append("  AD4_COMUNI I, ");
      SQL.append("  AD4_PROVINCIE J ");
      SQL.append("where (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (((~~PQRY_PARAMETRI272.PARANUMEDIST~~ IS NULL) AND (A.NUMERO_MAND BETWEEN NVL(~~PQRY_PARAMETRI272.PARAMMANDDAL~~, 1) AND NVL(~~PQRY_PARAMETRI272.PARAMMANDAAL~~, 99999))) OR (NOT ((~~PQRY_PARAMETRI272.PARANUMEDIST~~ IS NULL)) AND G.ANNO_ELENCO = TO_NUMBER(TO_CHAR(~~PQRY_PARAMETRI272.PARADATADIST~~, 'yyyy')) AND G.NUMERO_ELENCO = ~~PQRY_PARAMETRI272.PARANUMEDIST~~)) ");
      SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(~~PQRY_PARAMETRI272.PARAMUFFICIO~~, -1, NVL(A.UFFICIO, -1), ~~PQRY_PARAMETRI272.PARAMUFFICIO~~)) ");
      SQL.append("and   (NVL(A.DIVERSO_BEN, A.BENEFICIARIO) = NVL(~~PQRY_PARAMETRI272.PARACODIBENE~~, NVL(A.DIVERSO_BEN, A.BENEFICIARIO))) ");
      SQL.append("and   (B.NUM_QUIETANZA = DECODE(A.DIVERSO_BEN, to_number(NULL), A.NUM_QUIETANZA, A.NUM_QUIETANZA_DIV_BEN)) ");
      SQL.append("and   (B.CODICE = NVL(A.DIVERSO_BEN, A.BENEFICIARIO)) ");
      SQL.append("and   (B.TIPO_QUIETANZA = C.CODICE) ");
      SQL.append("and   (C.STAMPA_AVVISO = 'SI') ");
      SQL.append("and   (D.CODICE = NVL(A.DIVERSO_BEN, A.BENEFICIARIO)) ");
      SQL.append("and   (((D.INVIO_STAMPE IS NULL) AND ~~PQRY_PARAMETRI272.PARATIPOELAB~~ = 2) OR (NOT ((D.INVIO_STAMPE IS NULL)) AND ~~PQRY_PARAMETRI272.PARATIPOELAB~~ = 3) OR (~~PQRY_PARAMETRI272.PARATIPOELAB~~ = 1)) ");
      SQL.append("and   (E.PROVINCIA_STATO(+) = D.PROVINCIA) ");
      SQL.append("and   (E.COMUNE(+) = D.COMUNE) ");
      SQL.append("and   (F.PROVINCIA(+) = D.PROVINCIA) ");
      SQL.append("and   (G.ANNO_MAND = A.ANNO_MAND) ");
      SQL.append("and   (G.NUMERO_MAND = A.NUMERO_MAND) ");
      SQL.append("and   (B.QUIETANZANTE = H.CODICE(+)) ");
      SQL.append("and   (H.PROVINCIA_NASCITA = I.PROVINCIA_STATO(+)) ");
      SQL.append("and   (H.COMUNE_NASCITA = I.COMUNE(+)) ");
      SQL.append("and   (H.PROVINCIA_NASCITA = J.PROVINCIA(+)) ");
      SQL.append("order by 1, 2, 3 ");
      BUK_AVVDIPAGBOAN.SetReportQuery(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "3A43EA63-C3F9-4195-85D1-5BDC6A10B9C4");
      if (BUK_AVVDIPAGBOAN.FindObjByID(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA) != null)
        BUK_AVVDIPAGBOAN.AddReportGroup(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA, "GRUPPOBENEFI");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP_Init()
  {
    BUK_AVVDIPAGBOAN.InitReport(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, 196865);
    BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP_InitQuery(true, false);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, "8B6F5562-D5B8-4C06-9883-E36CB3AC84EE");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, "AVVIDIPAGREP");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_REPORTHEADER, 300, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_REPORTHEADER, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_REPORTHEADER, "F9B7D580-2E0E-4FBC-8131-96E1D5C96E87");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_PAGEHEADER, 5000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_PAGEHEADER, BUK_AVVDIPAGBOAN_RPTBOX_PAGEHEADER1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_PAGEHEADER, "24662B0F-3E42-4E55-B3BF-3821B9EE0D30");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEHEADER, BUK_AVVDIPAGBOAN_RPTBOX_LOGO, 100, 100, 7500, 1900, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_LOGO, "69722C0B-A3D2-40FD-970F-0A26A60445E9");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_LOGO, "LOGO");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEHEADER, BUK_AVVDIPAGBOAN_RPTBOX_INDIRIZZO, 100, 2400, 12100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_INDIRIZZO, "337AD6C6-4F52-454B-BFB7-EC12926D70BB");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_INDIRIZZO, "INDIRIZZO");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_INDIRIZZO, BUK_AVVDIPAGBOAN_SPAN_DATIENTEINDI, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_DATIENTEINDI, "13A9536B-0AC1-49ED-B0AA-C249DCE72D7E");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_DATIENTEINDI, "DATIENTEINDI");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEHEADER, BUK_AVVDIPAGBOAN_RPTBOX_COMUNE, 100, 3000, 8600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_COMUNE, "A6EECEF7-9739-44D4-BA3F-60EA89951A13");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_COMUNE, "COMUNE");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_COMUNE, BUK_AVVDIPAGBOAN_SPAN_COMUNE, MyGlb.VIS_DEFAREPOSTYL, 5, 156, 0, 271319169, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_COMUNE, "C2D242D3-254B-4344-B7F5-412A7542B975");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_COMUNE, "COMUNE");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEHEADER, BUK_AVVDIPAGBOAN_RPTBOX_OGGETTO, 100, 4100, 12100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_OGGETTO, "A44F6128-540E-41E1-965C-DF877A3AC4A5");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_OGGETTO, "OGGETTO");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_OGGETTO, BUK_AVVDIPAGBOAN_SPAN_OGAVDIPAVOCO, MyGlb.VIS_DEFAREPOSTYL, 5, 46, 0, 271384705, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_OGAVDIPAVOCO, "097FAE91-6E1B-42DC-97A3-2A21CCBC879E");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_OGAVDIPAVOCO, "OGAVDIPAVOCO");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEHEADER, BUK_AVVDIPAGBOAN_RPTBOX_DATA, 12200, 1500, 6400, 500, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_DATA, "CA9DB569-EE15-483B-AB18-C27D13C16E9F");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_DATA, "DATA");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_DATA, BUK_AVVDIPAGBOAN_SPAN_DECTSPDAADPP, MyGlb.VIS_NORMAA8RIGHT, 5, 130, 0, 271384705, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_DECTSPDAADPP, "B4DC6165-0D29-414C-AF29-E56AF68FD2D5");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_DECTSPDAADPP, "DECTSPDAADPP");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA, 3700, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "GRUPPOBENEFI");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA, "40B6D6A7-9B20-4CC3-91DA-CA9AA06F5224");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA, "GRUBENGROHEA");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA, BUK_AVVDIPAGBOAN_RPTBOX_SPETTABILE, 9800, 200, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_SPETTABILE, "166AEC90-7E54-4B8D-8350-24A9C7CE436E");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_SPETTABILE, "SPETTABILE");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_SPETTABILE, BUK_AVVDIPAGBOAN_SPAN_SPETTLE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Spett.le", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_SPETTLE, "0544D68E-503C-4640-AD9B-602C7A0DBE35");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_SPETTLE, "SPETTLE");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA, BUK_AVVDIPAGBOAN_RPTBOX_BERASOESESE1, 9800, 800, 9200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BERASOESESE1, "889D9E97-4491-4937-A1E4-373696A6CEA1");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BERASOESESE1, "BERASOESESE1");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_BERASOESESE1, BUK_AVVDIPAGBOAN_SPAN_RBRSEECADPAA, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384961, "", "::REBERASOESES", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_RBRSEECADPAA, "55C45AC1-FA61-46B2-9892-35E18D2B024E");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_RBRSEECADPAA, "RBRSEECADPAA");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA, BUK_AVVDIPAGBOAN_RPTBOX_BENINDIRIZZO, 9800, 1400, 9200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BENINDIRIZZO, "79B56C45-D81E-4184-9B99-D8EE74C2B586");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BENINDIRIZZO, "BENINDIRIZZO");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_BENINDIRIZZO, BUK_AVVDIPAGBOAN_SPAN_RBICADPAADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 35, 0, 271384705, "", "::INDIRIZZO", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_RBICADPAADPB, "99CF3838-A6F9-4336-82D4-FC1E5C99DE87");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_RBICADPAADPB, "RBICADPAADPB");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA, BUK_AVVDIPAGBOAN_RPTBOX_CITTABENEFIC, 9800, 2000, 9200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_CITTABENEFIC, "4F5B36F6-64A3-41D7-B81E-7C954DB1A657");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_CITTABENEFIC, "CITTABENEFIC");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_CITTABENEFIC, BUK_AVVDIPAGBOAN_SPAN_RCBCADPAADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 143, 0, 271384961, "Fill Left (To String (BEN CAP), Cinque, zero stringa) +c Space +c COMUNI DENOMINAZIONE +c Space +c PROVINCIA SIGLA", "::RECOCITTBENE", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_RCBCADPAADPB, "81CFBC2A-6A5B-494A-B0C3-565B7BA39CB5");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_RCBCADPAADPB, "RCBCADPAADPB");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA, BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO1, 100, 3200, 18800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO1, "86EE0F9D-CC06-4768-BBC1-03B856057A9F");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO1, "STAMPATESTO1");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO1, BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO1, MyGlb.VIS_DEFAREPOSTYL, 9, 2000, 0, 271384961, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO1, "12435755-C1D8-4BC1-B77B-949812F76D10");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO1, "STAMPATESTO1");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE1, 700, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "GRUPPOBENEFI");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE1, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE1, "28DD92B3-3EFD-4037-B261-994BC6D937D8");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE1, "GRUBENGROHE1");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE1, BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO2, 100, 200, 18800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO2, "EECF6C4B-9D12-4103-9B68-6559833CBD3A");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO2, "STAMPATESTO2");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO2, BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO2, MyGlb.VIS_DEFAREPOSTYL, 9, 2000, 0, 271384961, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO2, "9E991F5F-01FF-4432-A83B-1D222EB31B4B");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO2, "STAMPATESTO2");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE2, 800, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "GRUPPOBENEFI");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE2, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE2, "5B72826F-D0C1-4114-B0AE-C1E4DE0DB321");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE2, "GRUBENGROHE2");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE2, BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO3, 100, 200, 18800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO3, "0FA74C4D-64C9-4A4D-A7EE-7EE169E5A89A");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO3, "STAMPATESTO3");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_STAMPATESTO3, BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO3, MyGlb.VIS_DEFAREPOSTYL, 9, 2000, 0, 271384961, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO3, "314BF101-FEED-4135-BF43-296C877215A3");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_STAMPATESTO3, "STAMPATESTO3");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE3, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "GRUPPOBENEFI");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE3, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE3, "563D8991-B185-4AF4-885E-37B8CCF3C9D8");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE3, "GRUBENGROHE3");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE3, BUK_AVVDIPAGBOAN_RPTBOX_MANDATHEADER, 100, 0, 5400, 500, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_MANDATHEADER, "C90890A0-F5FD-4DB9-85CC-94E7862FFAD1");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_MANDATHEADER, "MANDATHEADER");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_MANDATHEADER, BUK_AVVDIPAGBOAN_SPAN_MANDATO, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384961, "", "Mandato", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_MANDATO, "5AF1B58B-6294-4DC6-BE62-4BAA79BAFE8A");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_MANDATO, "MANDATO");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE3, BUK_AVVDIPAGBOAN_RPTBOX_MODADIPAGHEA, 5500, 0, 13300, 500, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_MODADIPAGHEA, "7A2B8E0F-29C9-4396-94CE-2A7D55A811D5");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_MODADIPAGHEA, "MODADIPAGHEA");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_MODADIPAGHEA, BUK_AVVDIPAGBOAN_SPAN_MODALDIPAGAM, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271384961, "", "Modalità di pagamento", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_MODALDIPAGAM, "D9A6EC57-AFD8-46F8-8E31-E6BCC81D1375");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_MODALDIPAGAM, "MODALDIPAGAM");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE4, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "GRUPPOBENEFI");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE4, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE4, "537578BF-4FAB-4F23-A5D7-3CEFB1273518");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHE4, "GRUBENGROHE4");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_DETAIL, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_DETAIL, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_DETAIL, "A1185400-5EAA-4F69-9531-1AA0F347052F");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_DETAIL, "DETAIL");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAIL, BUK_AVVDIPAGBOAN_RPTBOX_MANDATO, 200, 100, 5200, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_MANDATO, "8BB42A8C-7D2D-42EC-B4B5-B30D4EC42B58");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_MANDATO, "MANDATO");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_MANDATO, BUK_AVVDIPAGBOAN_SPAN_REMCADPAADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 203, 0, 271384705, "", "::RECORDMANDAT", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_REMCADPAADPB, "40FF4113-F4D0-4AC8-9F13-B8680F1D783A");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_REMCADPAADPB, "REMCADPAADPB");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAIL, BUK_AVVDIPAGBOAN_RPTBOX_BORDOMANDATO, 100, 0, 5400, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDOMANDATO, "99C4F60D-83F3-4039-B798-25C946ED7CA8");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDOMANDATO, "BORDOMANDATO");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAIL, BUK_AVVDIPAGBOAN_RPTBOX_QUIETANZA, 5600, 100, 13100, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_QUIETANZA, "144F6A47-E17F-4D13-850C-F5EBE8B40FE6");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_QUIETANZA, "QUIETANZA");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_QUIETANZA, BUK_AVVDIPAGBOAN_SPAN_REQCADPAADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 53, 0, 271384705, "", "::RECORDQUIETA", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_REQCADPAADPB, "59A952C0-2A98-466C-9595-4E0842D1EA92");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_REQCADPAADPB, "REQCADPAADPB");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAIL, BUK_AVVDIPAGBOAN_RPTBOX_BORDOQUIETAN, 5500, 0, 13300, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDOQUIETAN, "F9DB28AC-87F8-4898-9BD8-36C25DD43DFA");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDOQUIETAN, "BORDOQUIETAN");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_DETAILBANCA, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_DETAILBANCA, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_DETAILBANCA, "31483E3C-3C1E-4B29-8F75-9032552E728D");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_DETAILBANCA, "DETAILBANCA");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILBANCA, BUK_AVVDIPAGBOAN_RPTBOX_QTNDESBANCA, 5600, 100, 13100, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_QTNDESBANCA, "99A909FC-DF07-48AE-AECB-20E0BD37B872");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_QTNDESBANCA, "QTNDESBANCA");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_QTNDESBANCA, BUK_AVVDIPAGBOAN_SPAN_RQDBCADPAADP, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "", "::DES_BANCA", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_RQDBCADPAADP, "C3FE7009-EC0B-4964-A362-4591E4C68219");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_RQDBCADPAADP, "RQDBCADPAADP");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILBANCA, BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDBANC, 100, 0, 5400, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDBANC, "CE718B14-1B01-415B-85C0-7C754ABEB777");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDBANC, "BORDMANDBANC");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILBANCA, BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEBANC, 5500, 0, 13300, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEBANC, "218DAC3A-5348-4563-87C1-6641FF70D4CC");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEBANC, "BORDQUIEBANC");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_DETAILINTEST, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_DETAILINTEST, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_DETAILINTEST, "F6720BE0-4BFB-4B7D-A488-3A9CD1C6329F");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_DETAILINTEST, "DETAILINTEST");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILINTEST, BUK_AVVDIPAGBOAN_RPTBOX_INTESTATARIO, 5600, 100, 13100, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_INTESTATARIO, "A0C8D81F-8BB4-4869-8116-F9BC20E703D5");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_INTESTATARIO, "INTESTATARIO");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_INTESTATARIO, BUK_AVVDIPAGBOAN_SPAN_REICADPAADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 124, 0, 271384705, "", "::RECORDINTEST", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_REICADPAADPB, "136CA2F3-853B-49F2-ADA5-5DEBBDE820CE");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_REICADPAADPB, "REICADPAADPB");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILINTEST, BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDINTE, 100, 0, 5400, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDINTE, "828BF633-8E96-4990-AE35-7414EEB0ECA7");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDINTE, "BORDMANDINTE");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILINTEST, BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEINTE, 5500, 0, 13300, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEINTE, "86A4EAE7-B0A4-44BC-8BFA-D4928EA289AA");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEINTE, "BORDQUIEINTE");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_DETAILQUIETA, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075841, "");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_DETAILQUIETA, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_DETAILQUIETA, "D44D0263-2E27-4D44-8274-1C49D0A4653A");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_DETAILQUIETA, "DETAILQUIETA");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILQUIETA, BUK_AVVDIPAGBOAN_RPTBOX_QUIETANZANTE, 5600, 100, 13100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_QUIETANZANTE, "B5CDFC84-2EB4-41CD-B212-B1C49C455BDE");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_QUIETANZANTE, "QUIETANZANTE");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_QUIETANZANTE, BUK_AVVDIPAGBOAN_SPAN_CQRBRSEQCADP, MyGlb.VIS_DEFAREPOSTYL, 5, 271, 0, 271384705, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_CQRBRSEQCADP, "42E6F5E7-598E-4098-85C6-41397483CCEA");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_CQRBRSEQCADP, "CQRBRSEQCADP");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILQUIETA, BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDQUIE, 100, 0, 5400, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDQUIE, "D33365C4-5ABD-4C41-B312-CC89D34DB403");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDMANDQUIE, "BORDMANDQUIE");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILQUIETA, BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEQUIE, 5500, 0, 13300, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEQUIE, "245B6392-6A91-465D-93C3-F75362DDAC53");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDQUIEQUIE, "BORDQUIEQUIE");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_GRUBENGROFOO, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "GRUPPOBENEFI");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFOO, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFOO, "6438C75D-6887-4AE7-B388-E36EBBFA1B0E");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFOO, "GRUBENGROFOO");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFOO, BUK_AVVDIPAGBOAN_RPTBOX_BORDOINFERI1, 100, 0, 18700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDOINFERI1, "E8A3C37B-8CB8-4CA4-9859-EF3AB4F3F142");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDOINFERI1, "BORDOINFERI1");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO1, 200, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "GRUPPOBENEFI");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO1, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO1, "4AD2C9B7-5DFD-4DE0-A549-45539E1E53A8");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO1, "GRUBENGROFO1");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO2, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "GRUPPOBENEFI");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO2, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO2, "365BFF7C-77D4-4CBC-9A72-27098600A7DE");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO2, "GRUBENGROFO2");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO3, 2600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8454401, "GRUPPOBENEFI");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO3, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO3, "5366094A-1DF8-4FB7-BC4D-D5BDFB422A36");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO3, "GRUBENGROFO3");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO3, BUK_AVVDIPAGBOAN_RPTBOX_ELENCOLIQUID, 0, 0, 18800, 2500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 458753, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_ELENCOLIQUID, "34EE28BB-9464-4F74-B7AC-4C6BFCCA4E06");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_ELENCOLIQUID, "ELENCOLIQUID");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO4, 3000, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 76218625, "GRUPPOBENEFI");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO4, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO4, "BEF6859A-682D-4264-A458-599D1FCB75BA");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO4, "GRUBENGROFO4");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO4, BUK_AVVDIPAGBOAN_RPTBOX_FIRMABITMAP, 1800, 600, 8300, 2400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_FIRMABITMAP, "F91B26B6-6666-4D55-B3C6-C77C128D4BF5");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_FIRMABITMAP, "FIRMABITMAP");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO4, BUK_AVVDIPAGBOAN_RPTBOX_STAMPAFIRMA1, 100, 0, 18800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_STAMPAFIRMA1, "08230AB9-C086-4FC3-971D-48FD07777BD7");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_STAMPAFIRMA1, "STAMPAFIRMA1");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_STAMPAFIRMA1, BUK_AVVDIPAGBOAN_SPAN_STAMPAFIRMA1, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384961, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_STAMPAFIRMA1, "48851A3E-E1C9-4F92-8E74-C0FD88E41C88");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_STAMPAFIRMA1, "STAMPAFIRMA1");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_GRUBENGROFO4, BUK_AVVDIPAGBOAN_RPTBOX_STAMPAFIRMA2, 100, 600, 18800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_STAMPAFIRMA2, "442F7707-AF25-4F83-9F5D-7CAB0ADDBD89");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_STAMPAFIRMA2, "STAMPAFIRMA2");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_STAMPAFIRMA2, BUK_AVVDIPAGBOAN_SPAN_STAMPAFIRMA2, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384961, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_STAMPAFIRMA2, "CCEFFA1E-7764-44CC-8214-ACF834C43013");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_STAMPAFIRMA2, "STAMPAFIRMA2");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_PAGEFOOTER, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTER, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTER, "3ECD5621-BA99-411A-B0FE-319004FC4303");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP, BUK_AVVDIPAGBOAN_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_REPORTFOOTER, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_REPORTFOOTER, "B7B6C190-5AAF-4B9E-8516-553ABB8BFA8B");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_AVVDIPAGBOAN.AddReportGroup(BUK_AVVDIPAGBOAN_SEC_GRUBENGROHEA, "GRUPPOBENEFI");
    BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP_InitQuery(false, true);
  }

  private void BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO_InitQuery() { BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO_InitQuery(true, true); }
  private void BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  B.ANNO_MAND as ANNO_MAND, ");
      SQL.append("  B.NUMERO_MAND as NUMERO_MAND, ");
      SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
      SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
      SQL.append("  A.IMPORTO as IMPORTO, ");
      SQL.append("  E.IMPORTO as RECORFATIMPO, ");
      SQL.append("  A.RITENUTE as RITENUTE, ");
      SQL.append("  DECODE(E.TRATTAMENTO_IVA, 'SP', NVL(A.IMPORTO_IVA, 0), to_number(NULL)) as RECLIQIMPIVA, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  E.NUMERO_DOC as NUMERO_DOC, ");
      SQL.append("  E.CODICE_DOC as CODICE_DOC, ");
      SQL.append("  E.D_DATA_DOC as D_DATA_DOC, ");
      SQL.append("  TO_CHAR ( A.NUMERO_MAND ) || ' - ' || DECODE(A.FAT_ANNO_PROG, to_number(NULL), A.DESCRIZIONE, DECODE(E.CODICE_DOC, 1, 'Fattura', DECODE(E.CODICE_DOC, 7, 'Nota Add.', NULL)) || ' ' || TO_CHAR ( E.NUMERO_DOC ) || ' ' || 'del ' || TO_CHAR ( E.D_DATA_DOC,'dd/mm/yyyy')) as RECORDCAUSAL, ");
      SQL.append("  TO_CHAR ( A.NUMERO_MAND ) || ' - ' || ' Sub ' || DECODE(A.PROGRESSIVO_TESO, to_number(NULL), NULL, TO_CHAR ( A.PROGRESSIVO_TESO )) || ' - ' || 'Conto 1 ' || DECODE(A.FAT_ANNO_PROG, to_number(NULL), A.DESCRIZIONE, DECODE(E.CODICE_DOC, 1, 'Fattura', DECODE(E.CODICE_DOC, 7, 'Nota Add.', NULL)) || ' ' || TO_CHAR ( E.NUMERO_DOC ) || ' ' || 'del ' || TO_CHAR ( E.D_DATA_DOC,'dd/mm/yyyy')) as RECOCAUSBELL, ");
      SQL.append("  TO_CHAR ( A.NUMERO_MAND ) || ' - ' || A.DESCRIZIONE || DECODE(A.FAT_ANNO_PROG, to_number(NULL), NULL, DECODE(E.CODICE_DOC, 1, 'Fattura', DECODE(E.CODICE_DOC, 7, 'Nota Add.', NULL)) || ' ' || TO_CHAR ( E.NUMERO_DOC ) || ' ' || 'del ' || TO_CHAR ( E.D_DATA_DOC,'dd/mm/yyyy')) as RECOCAUSFIRE, ");
      SQL.append("  TO_CHAR ( A.NUMERO_MAND ) || ' - ' || DECODE(A.FAT_ANNO_PROG, to_number(NULL), A.DESCRIZIONE, DECODE(E.CODICE_DOC, 5, A.DESCRIZIONE, DECODE(E.CODICE_DOC, 1, 'Fattura', DECODE(E.CODICE_DOC, 7, 'Nota Add.', NULL) || ' ' || TO_CHAR ( E.NUMERO_DOC ) || ' ' || 'del ' || TO_CHAR ( E.D_DATA_DOC,'dd/mm/yyyy'))) || ' ' || TO_CHAR ( E.NUMERO_DOC )) as RECOCAUSPESA, ");
      SQL.append("  A.IMPORTO - NVL(A.RITENUTE, 0) - DECODE(E.TRATTAMENTO_IVA, 'SP', NVL(A.IMPORTO_IVA, 0), 0) as RECORDNETTO, ");
      SQL.append("  A.FAT_ANNO_PROG as FAT_ANNO_PROG, ");
      SQL.append("  A.FAT_NUMERO_PROG as FAT_NUMERO_PROG, ");
      SQL.append("  1 as RECONUOVESPR ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  MAN B, ");
      SQL.append("  QTN C, ");
      SQL.append("  T02 D, ");
      SQL.append("  FAT E ");
      SQL.append("where (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((~~PQRY_PARAMETRI272.PARANUMEDIST~~ IS NULL) AND (A.NUMERO_MAND BETWEEN NVL(~~PQRY_PARAMETRI272.PARAMMANDDAL~~, 1) AND NVL(~~PQRY_PARAMETRI272.PARAMMANDAAL~~, 99999)) OR (NOT ((~~PQRY_PARAMETRI272.PARANUMEDIST~~ IS NULL)) AND B.ANNO_ELENCO = TO_NUMBER(TO_CHAR(~~PQRY_PARAMETRI272.PARADATADIST~~, 'yyyy')) AND B.NUMERO_ELENCO = ~~PQRY_PARAMETRI272.PARANUMEDIST~~)) ");
      SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(~~PQRY_PARAMETRI272.PARAMUFFICIO~~, -1, NVL(A.UFFICIO, -1), ~~PQRY_PARAMETRI272.PARAMUFFICIO~~)) ");
      SQL.append("and   (NVL(A.DIVERSO_BEN, A.BENEFICIARIO) = NVL(~~" + BUK_AVVDIPAGBOAN_RPT_AVVIDIPAGREP + ".RECORBENCODI~~, NVL(A.DIVERSO_BEN, A.BENEFICIARIO))) ");
      SQL.append("and   (C.NUM_QUIETANZA = DECODE(A.DIVERSO_BEN, to_number(NULL), A.NUM_QUIETANZA, A.NUM_QUIETANZA_DIV_BEN)) ");
      SQL.append("and   (C.CODICE = NVL(A.DIVERSO_BEN, A.BENEFICIARIO)) ");
      SQL.append("and   (C.TIPO_QUIETANZA = D.CODICE(+)) ");
      SQL.append("and   (D.STAMPA_AVVISO = 'SI') ");
      SQL.append("and   (E.ANNO_PROG(+) = A.FAT_ANNO_PROG) ");
      SQL.append("and   (E.NUMERO_PROG(+) = A.FAT_NUMERO_PROG) ");
      SQL.append("and   (B.ANNO_MAND = A.ANNO_MAND) ");
      SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND) ");
      SQL.append("order by 20, 1, 2, 3, 4 ");
      BUK_AVVDIPAGBOAN.SetReportQuery(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "548E2D62-6AB8-43E8-BAB9-65E7FD260F16");
      if (BUK_AVVDIPAGBOAN.FindObjByID(BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU) != null)
        BUK_AVVDIPAGBOAN.AddReportGroup(BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU, "RECONUOVESPR");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO_Init()
  {
    BUK_AVVDIPAGBOAN.InitReport(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, 196865);
    BUK_AVVDIPAGBOAN.SetSubReportBox(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, BUK_AVVDIPAGBOAN_RPTBOX_ELENCOLIQUID);
    BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO_InitQuery(true, false);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, "4AC0EF88-DDEB-491C-95C3-DD8A7825AF2D");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, "ELENLIQUREPO");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECONUOVESPR");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU, BUK_AVVDIPAGBOAN_RPTBOX_ELENCOLIQUID);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU, "89A9F710-3F58-4A8D-A70C-A804A0B71005");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU, "NUOESPINTGRU");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU, BUK_AVVDIPAGBOAN_RPTBOX_CAUSALHEADER, 100, 0, 6900, 500, 0, 1, 1, MyGlb.VIS_INTCONBORCEN, 983041, 340, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_CAUSALHEADER, "29A5A5CB-03ED-4C86-8438-E3933016FF39");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_CAUSALHEADER, "CAUSALHEADER");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_CAUSALHEADER, BUK_AVVDIPAGBOAN_SPAN_CAUSALE, MyGlb.VIS_INTCONBORCEN, 0, 0, 0, 271384961, "", "Causale", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_CAUSALE, "3A695D63-B90F-4CBE-B298-DEAE789F4789");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_CAUSALE, "CAUSALE");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU, BUK_AVVDIPAGBOAN_RPTBOX_IMPORTHEADER, 7000, 0, 2000, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_IMPORTHEADER, "B7996991-21C7-4261-AFBA-0D06F25FAF88");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_IMPORTHEADER, BUK_AVVDIPAGBOAN_SPAN_FATIMPORTO, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_FATIMPORTO, "F4841A15-22EF-4525-A3B1-82160E8D8682");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_FATIMPORTO, "FATIMPORTO");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU, BUK_AVVDIPAGBOAN_RPTBOX_SALDOHEADER, 9000, 0, 2000, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_SALDOHEADER, "F3924C2E-F858-4C51-ADEF-C13ECA90BE9B");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_SALDOHEADER, "SALDOHEADER");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_SALDOHEADER, BUK_AVVDIPAGBOAN_SPAN_C1, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271384961, "", "Saldo", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_C1, "19F7E6F4-4DAF-4F09-B3D6-8515F043B315");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_C1, "C1");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU, BUK_AVVDIPAGBOAN_RPTBOX_RITENUHEADER, 11000, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_RITENUHEADER, "63995CD9-2F61-4082-BDC7-387157715D65");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_RITENUHEADER, "RITENUHEADER");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_RITENUHEADER, BUK_AVVDIPAGBOAN_SPAN_RITENUTE, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271384961, "", "Ritenute", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_RITENUTE, "E1D10D1F-9E41-45FB-AFDB-5560AC494BD3");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_RITENUTE, "RITENUTE");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU, BUK_AVVDIPAGBOAN_RPTBOX_NETTOHEADER, 16200, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_NETTOHEADER, "ED9E1FAF-EFA1-4047-B715-AD07589CBFC0");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_NETTOHEADER, "NETTOHEADER");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_NETTOHEADER, BUK_AVVDIPAGBOAN_SPAN_NETTO, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271384961, "", "Netto", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_NETTO, "C451A89A-93AC-4B67-80EF-9474453D65B6");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_NETTO, "NETTO");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU, BUK_AVVDIPAGBOAN_RPTBOX_IMPOIVA1HEA1, 13600, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_INTCONBORRIG, 983041, 340, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_IMPOIVA1HEA1, "3CA93E04-391F-4155-A558-73D389A7689E");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_IMPOIVA1HEA1, "IMPOIVA1HEA1");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_IMPOIVA1HEA1, BUK_AVVDIPAGBOAN_SPAN_C, MyGlb.VIS_INTCONBORRIG, 0, 0, 0, 271384961, "", "Iva SP/RC", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_C, "4AAEC46B-80DD-4829-BEB1-C6A9F4558501");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_C, "C");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 10027009, "");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, BUK_AVVDIPAGBOAN_RPTBOX_ELENCOLIQUID);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, "BC97E45D-68D1-436A-B911-082449C01831");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, "DETAILLIQ");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, BUK_AVVDIPAGBOAN_RPTBOX_CAUSALE, 200, 100, 6500, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_CAUSALE, "0AE71758-BBA0-498F-9E45-CACF3E298E8F");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_CAUSALE, "CAUSALE");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_CAUSALE, BUK_AVVDIPAGBOAN_SPAN_IEPPFRCFCADP, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384961, "To String (LIQ NUMERO MAND) +c Space +c If Equal (LIQ FAT ANNO PROG, Null Number, LIQ DESCRIZIONE, If Equal (FAT CODICE DOC, Uno, Fattura, If Equal (FAT CODICE DOC, Sette, Nota Add., Null String))) +c Space +c To String (FAT NUMERO DOC) +c Space +c del  +c To String (FAT D DATA DOC)", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_IEPPFRCFCADP, "F1E373B9-8DA3-451E-AE00-A55A115DA1F8");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_IEPPFRCFCADP, "IEPPFRCFCADP");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDOCAUSLIQ, 100, 0, 6900, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDOCAUSLIQ, "C0C7CF4C-C924-4F1C-BAC5-910F340B6D58");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDOCAUSLIQ, "BORDOCAUSLIQ");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, BUK_AVVDIPAGBOAN_RPTBOX_IMPORTO1, 7000, 100, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_IMPORTO1, "481C9A36-2C73-4DB3-8530-0B1E37FECEC3");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_IMPORTO1, "IMPORTO1");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_IMPORTO1, BUK_AVVDIPAGBOAN_SPAN_RFICADPAADPB, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::RECORFATIMPO", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_RFICADPAADPB, "700BE284-F326-4C13-952F-6FF9BA3D0C98");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_RFICADPAADPB, "RFICADPAADPB");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, BUK_AVVDIPAGBOAN_RPTBOX_SALDO, 8900, 100, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_SALDO, "654C9608-88F5-4AAA-ADDC-DBA522506F9E");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_SALDO, "SALDO");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_SALDO, BUK_AVVDIPAGBOAN_SPAN_RLICADPAADPB, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::IMPORTO", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_RLICADPAADPB, "E7ED51EB-26DC-4E56-8539-211F10747E07");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_RLICADPAADPB, "RLICADPAADPB");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDOSALDLIQ, 9000, 0, 2000, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDOSALDLIQ, "A9402ABA-A246-48F9-AFEE-8BB2F084E0A7");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDOSALDLIQ, "BORDOSALDLIQ");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, BUK_AVVDIPAGBOAN_RPTBOX_RITENUTE, 11000, 100, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_RITENUTE, "BFD87E3D-4683-4B72-A44F-0E482792A1EA");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_RITENUTE, "RITENUTE");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_RITENUTE, BUK_AVVDIPAGBOAN_SPAN_RLRCADPAADPB, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::RITENUTE", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_RLRCADPAADPB, "0596429F-0F21-4505-AA14-E6D57649C8B4");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_RLRCADPAADPB, "RLRCADPAADPB");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDORITELIQ, 11000, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDORITELIQ, "C86A0EAC-3BF3-44DE-B561-537C0731940E");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDORITELIQ, "BORDORITELIQ");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, BUK_AVVDIPAGBOAN_RPTBOX_NETTO, 16200, 100, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_NETTO, "AA744B17-CB6B-4B31-8986-D7D8AC9140E6");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_NETTO, "NETTO");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_NETTO, BUK_AVVDIPAGBOAN_SPAN_RENCADPAADPB, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::RECORDNETTO", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_RENCADPAADPB, "ABB55718-232E-4BE0-9079-B500C8C7C9C3");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_RENCADPAADPB, "RENCADPAADPB");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDONETTLIQ, 16200, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDONETTLIQ, "58C87610-56DB-46E4-B650-96E3669190D2");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDONETTLIQ, "BORDONETTLIQ");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILLIQ, BUK_AVVDIPAGBOAN_RPTBOX_IMPORTOIVA, 13600, 100, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_IMPORTOIVA, "207DCDBD-6F4F-401B-A4CA-E20CAC8E0B38");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_IMPORTOIVA, "IMPORTOIVA");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_IMPORTOIVA, BUK_AVVDIPAGBOAN_SPAN_RLIICADPAADP, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::RECLIQIMPIVA", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_RLIICADPAADP, "1E9AD6A5-7C19-449E-AB32-98D1A523F963");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_RLIICADPAADP, "RLIICADPAADP");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11599873, "");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ, BUK_AVVDIPAGBOAN_RPTBOX_ELENCOLIQUID);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ, "5BD91460-A304-40E4-A2E1-4CCE9A130CA3");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ, "DETAIRETTLIQ");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ, BUK_AVVDIPAGBOAN_RPTBOX_ELENCORETTIF, 100, 100, 9000, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 458753, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_ELENCORETTIF, "5CADF5A6-8E45-4D83-A040-CD0F9030C3AD");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_ELENCORETTIF, "ELENCORETTIF");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDOCAUSRET, 100, 0, 8900, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDOCAUSRET, "8EF6FBAC-AFA7-4DB8-8CA1-ED20D32B7660");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDOCAUSRET, "BORDOCAUSRET");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDOIMPORET, 7000, 0, 2000, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDOIMPORET, "A6C34BC3-9177-4812-96BB-58CD196D4E83");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDOIMPORET, "BORDOIMPORET");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDOSALDRET, 9000, 0, 2000, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDOSALDRET, "A73FE6E7-96E1-4E45-B5F3-0E7CF2A0DF19");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDOSALDRET, "BORDOSALDRET");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDORITERET, 11000, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDORITERET, "350D0775-3373-43C7-B2AC-6A99FE3475D4");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDORITERET, "BORDORITERET");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAIRETTLIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDONETTRET, 16200, 0, 2600, 600, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDONETTRET, "FD2918DF-7CC1-466B-BA6A-4E99367DC2E9");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDONETTRET, "BORDONETTRET");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, BUK_AVVDIPAGBOAN_SEC_NUOESPPIEGRU, 0, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECONUOVESPR");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_NUOESPPIEGRU, BUK_AVVDIPAGBOAN_RPTBOX_ELENCOLIQUID);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_NUOESPPIEGRU, "E9FAB7B1-0A71-498A-B47B-52100CD85BF3");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_NUOESPPIEGRU, "NUOESPPIEGRU");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO, BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, 800, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_ELENCOLIQUID);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, "C8E94478-C4E0-424B-A52C-95D8E706DA06");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, "PAGEFOOTELIQ");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDOSUPERIO, 100, 0, 18700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDOSUPERIO, "5950772A-5D72-40D3-82A4-2DABE86CD1AB");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDOSUPERIO, "BORDOSUPERIO");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_DOPPBORDSUPE, 9000, 100, 9800, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_DOPPBORDSUPE, "16DFAE25-73AE-4FBA-8DE6-5AEEAF47C151");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_DOPPBORDSUPE, "DOPPBORDSUPE");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFCAU, 100, 0, 8900, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFCAU, "698E9A83-472C-4392-B1FC-DEAAEF5A49F0");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFCAU, "BORDSUMOFCAU");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_TOTALELABEL, 7200, 200, 1700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_TOTALELABEL, "FC2DC566-B83D-47BB-8D36-92ACB2B99D43");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_TOTALELABEL, "TOTALELABEL");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_TOTALELABEL, BUK_AVVDIPAGBOAN_SPAN_TOTALE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_TOTALE, "EE2BF047-FCAA-47DD-99B2-A5D790BFD88D");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_TOTALE, "TOTALE");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFIMP, 9000, 0, 2000, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFIMP, "F62B2B54-BEB2-4987-BA41-5761005980B7");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFIMP, "BORDSUMOFIMP");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQIMPO, 9000, 200, 1900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQIMPO, "8B62C513-5197-480B-8653-3F5B212D455C");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQIMPO, "SUMOFLIQIMPO");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQIMPO, BUK_AVVDIPAGBOAN_SPAN_PFLSRLICADPA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_PFLSRLICADPA, "B5C62FDF-5E83-4690-B198-5296B6506190");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_PFLSRLICADPA, "PFLSRLICADPA");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFRIT, 11000, 0, 2600, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFRIT, "09BC720F-4CFD-4FAF-BDA4-CDAED7B67615");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFRIT, "BORDSUMOFRIT");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQRITE, 11000, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQRITE, "C77CA03A-5537-42FD-A553-783B936ED5D5");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQRITE, "SUMOFLIQRITE");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQRITE, BUK_AVVDIPAGBOAN_SPAN_PFLSRLRCADPA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_PFLSRLRCADPA, "70391BE9-0317-4674-A976-63551B6D3B2B");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_PFLSRLRCADPA, "PFLSRLRCADPA");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFNET, 16200, 0, 2600, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFNET, "B567AAD3-7E44-4354-8FFD-BD7EDAF02C30");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDSUMOFNET, "BORDSUMOFNET");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_SUMOFNETTO, 16200, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_SUMOFNETTO, "BAF26746-6BFB-4CA9-8F94-7B225EADAE3A");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_SUMOFNETTO, "SUMOFNETTO");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_SUMOFNETTO, BUK_AVVDIPAGBOAN_SPAN_PFLSRNCADPAA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_PFLSRNCADPAA, "30BE4787-BA02-4F02-BAB6-27A4E267F6C7");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_PFLSRNCADPAA, "PFLSRNCADPAA");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORDOINFERIO, 100, 700, 18700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORDOINFERIO, "3505249B-ADBB-49BC-BF5F-DB2375CF4241");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORDOINFERIO, "BORDOINFERIO");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQIMIV, 13600, 200, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQIMIV, "7B055144-BBDF-4DC9-AA37-E9F15FF7ACF4");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQIMIV, "SUMOFLIQIMIV");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_SUMOFLIQIMIV, BUK_AVVDIPAGBOAN_SPAN_PFLSRLIICADP, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_PFLSRLIICADP, "41503D92-A32F-4025-95BF-419EDD2EE4C7");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_PFLSRLIICADP, "PFLSRLIICADP");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_PAGEFOOTELIQ, BUK_AVVDIPAGBOAN_RPTBOX_BORSUMOFIMIV, 13600, 0, 2600, 700, 0, 1, 1, MyGlb.VIS_BORDILATERAL, 983041, 0, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_BORSUMOFIMIV, "5E79F4D1-2AFF-4267-A946-43600CCF72CF");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_BORSUMOFIMIV, "BORSUMOFIMIV");
    BUK_AVVDIPAGBOAN.AddReportGroup(BUK_AVVDIPAGBOAN_SEC_NUOESPINTGRU, "RECONUOVESPR");
    BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO_InitQuery(false, true);
  }

  private void BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO_InitQuery() { BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO_InitQuery(true, true); }
  private void BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(B.CODICE_DOC, 2, 'Nota Acc.', DECODE(B.CODICE_DOC, 7, 'Nota Add.', NULL)) || ' ' || B.NUMERO_DOC || ' ' || 'del ' || TO_CHAR ( B.D_DATA_DOC,'dd/mm/yyyy') as RECORDRETTIF, ");
      SQL.append("  A.IMPORTO as RECORETFIMPO ");
      SQL.append("from ");
      SQL.append("  RETFAT A, ");
      SQL.append("  FAT B ");
      SQL.append("where (A.FAT_ANNO_PROG_FAT = ~~" + BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO + ".FAT_ANNO_PROG~~) ");
      SQL.append("and   (A.FAT_NUMERO_PROG_FAT = ~~" + BUK_AVVDIPAGBOAN_RPT_ELENLIQUREPO + ".FAT_NUMERO_PROG~~) ");
      SQL.append("and   ((A.COD_REC IS NULL) AND NOT ((A.FAT_ANNO_PROG_NAC IS NULL))) ");
      SQL.append("and   (B.ANNO_PROG = A.FAT_ANNO_PROG_NAC) ");
      SQL.append("and   (B.NUMERO_PROG = A.FAT_NUMERO_PROG_NAC) ");
      BUK_AVVDIPAGBOAN.SetReportQuery(BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "00280F8D-E166-48C6-8D92-40AA46D24B86");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO_Init()
  {
    BUK_AVVDIPAGBOAN.InitReport(BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO, 196865);
    BUK_AVVDIPAGBOAN.SetSubReportBox(BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO, BUK_AVVDIPAGBOAN_RPTBOX_ELENCORETTIF);
    BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO_InitQuery(true, false);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO, "73AF37D3-F796-4C6E-B8E2-79CD52040D45");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO, "ELENRETTREPO");
    BUK_AVVDIPAGBOAN.InitSection(BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO, BUK_AVVDIPAGBOAN_SEC_DETAILRETTIF, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8454145, "");
    BUK_AVVDIPAGBOAN.SetSectionRendersInto(BUK_AVVDIPAGBOAN_SEC_DETAILRETTIF, BUK_AVVDIPAGBOAN_RPTBOX_ELENCORETTIF);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SEC_DETAILRETTIF, "E13586F5-C5E2-477B-BFC4-5210465E7E8B");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SEC_DETAILRETTIF, "DETAILRETTIF");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILRETTIF, BUK_AVVDIPAGBOAN_RPTBOX_RETTIFICA, 500, 0, 6100, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_RETTIFICA, "749614D4-CF4C-4170-9F53-FF1402D51008");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_RETTIFICA, "RETTIFICA");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_RETTIFICA, BUK_AVVDIPAGBOAN_SPAN_RERCADPAADPB, MyGlb.VIS_DEFAREPOSTYL, 5, 224, 0, 271384705, "", "::RECORDRETTIF", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_RERCADPAADPB, "079C7CAD-C55A-424F-B101-D7B5C1D9054D");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_RERCADPAADPB, "RERCADPAADPB");
    BUK_AVVDIPAGBOAN.InitReportBox(BUK_AVVDIPAGBOAN_SEC_DETAILRETTIF, BUK_AVVDIPAGBOAN_RPTBOX_IMPORTO, 6900, 0, 1900, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_RPTBOX_IMPORTO, "A035A00C-D571-4CF6-B7B4-4C92EA500420");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_RPTBOX_IMPORTO, "IMPORTO");
    BUK_AVVDIPAGBOAN.InitBoxSpan(BUK_AVVDIPAGBOAN_RPTBOX_IMPORTO, BUK_AVVDIPAGBOAN_SPAN_RETFATIMPORT, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::RECORETFIMPO", 1);
    BUK_AVVDIPAGBOAN.SetRTCGuid(BUK_AVVDIPAGBOAN_SPAN_RETFATIMPORT, "D0A565CC-C5B3-4D5D-8492-F9BA34644218");
    BUK_AVVDIPAGBOAN.SetObjCode(BUK_AVVDIPAGBOAN_SPAN_RETFATIMPORT, "RETFATIMPORT");
    BUK_AVVDIPAGBOAN_RPT_ELENRETTREPO_InitQuery(false, true);
  }

  private void BUK_AVVDIPAGBOAN_InitLinks()
  {
    BUK_AVVDIPAGBOAN.SetBoxNextBox(BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1, BUK_AVVDIPAGBOAN_RPTBOX_PAGEBODY1);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_AVVDIPAGBOAN) BUK_AVVDIPAGBOAN_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_AVVDIPAGBOAN) BUK_AVVDIPAGBOAN_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_AVVDIPAGBOAN) BUK_AVVDIPAGBOAN_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_AVVDIPAGBOAN) BUK_AVVDIPAGBOAN_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_AVVDIPAGBOAN) BUK_AVVDIPAGBOAN_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_AVVDIPAGBOAN) BUK_AVVDIPAGBOAN_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_AVVDIPAGBOAN) BUK_AVVDIPAGBOAN_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_AVVDIPAGBOAN) BUK_AVVDIPAGBOAN_OnPreview();
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
